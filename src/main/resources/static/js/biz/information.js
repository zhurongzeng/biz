layui.use(['form', 'layer', 'table', 'laytpl'], function () {
    var form = layui.form,
        layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery,
        laytpl = layui.laytpl,
        table = layui.table;

    //用户列表
    var tableIns = table.render({
        elem: '#informationList',
        url: '/information/service/list',
        cellMinWidth: 95,
        page: true,
        height: "full-125",
        limits: [10, 15, 20, 25],
        limit: 10,
        id: "informationListTable",
        cols: [[
            {type: "checkbox", fixed: "left", width: 50},
            {field: 'title', title: '标题', align: "center", width: 250},
            {field: 'feeType', title: '资讯类别', align: 'center', width: 100},
            {field: 'price', title: '资讯单价', align: 'center', width: 100},
            {field: 'sendFlag', title: '是否发布', templet:'#sendFlagBar', align: 'center', width: 120},
            {field: 'sendDatetime', title: '发布时间', align: 'center', width: 160},
            {
                field: 'createDatetime', title: '创建时间', align: 'center', width: 160, templet: function (data) {
                    if (data.createDatetime != null) {
                        return moment(data.createDatetime).format("YYYY-MM-DD HH:mm:ss");
                    } else {
                        return '';
                    }
                }
            },
            {
                field: 'updateDatetime', title: '修改时间', align: 'center', width: 160, templet: function (data) {
                    if (data.updateDatetime != null) {
                        return moment(data.updateDatetime).format("YYYY-MM-DD HH:mm:ss");
                    } else {
                        return '';
                    }
                }
            },
            {title: '操作', templet: '#operationBar', fixed:"right", align: "center", minWidth: 150}
        ]]
    });

    form.on('switch(sendFlag)', function(data){
        var tipText = '确定取消发布该文章？';
        if(data.elem.checked){
            tipText = '确定发布该文章？'
        }
        layer.confirm(tipText,{
            icon: 3,
            title:'系统提示',
            cancel : function(index){
                data.elem.checked = !data.elem.checked;
                form.render();
                layer.close(index);
            }
        },function(index){
            layer.close(index);
        },function(index){
            data.elem.checked = !data.elem.checked;
            form.render();
            layer.close(index);
        });
    });

    //搜索【此功能需要后台配合，所以暂时没有动态效果演示】
    $(".search_btn").on("click", function () {
        if ($(".searchVal").val() != '') {
            table.reload("newsListTable", {
                page: {
                    curr: 1 //重新从第 1 页开始
                },
                where: {
                    key: $(".searchVal").val()  //搜索的关键字
                }
            })
        } else {
            layer.msg("请输入搜索的内容");
        }
    });

    // 新增
    $(".addNews_btn").click(function () {
        var index = layui.layer.open({
            title: "新增文章",
            type: 2,
            content: "/information/view/add",
            success: function (layero, index) {
                var body = layui.layer.getChildFrame('body', index);
                if (edit) {
                    body.find(".userName").val(edit.userName);  //登录名
                    body.find(".userEmail").val(edit.userEmail);  //邮箱
                    body.find(".userSex input[value=" + edit.userSex + "]").prop("checked", "checked");  //性别
                    body.find(".userGrade").val(edit.userGrade);  //会员等级
                    body.find(".userStatus").val(edit.userStatus);    //用户状态
                    body.find(".userDesc").text(edit.userDesc);    //用户简介
                    form.render();
                }
                setTimeout(function () {
                    layui.layer.tips('点击此处返回用户列表', '.layui-layer-setwin .layui-layer-close', {
                        tips: 3
                    });
                }, 500);
            }
        });
        layui.layer.full(index);
        window.sessionStorage.setItem("index", index);
        //改变窗口大小时，重置弹窗的宽高，防止超出可视区域（如F12调出debug的操作）
        $(window).on("resize", function () {
            layui.layer.full(window.sessionStorage.getItem("index"));
        });
    });

    // 批量删除
    $(".delAll_btn").click(function () {
        var checkStatus = table.checkStatus('informationListTable'),
            data = checkStatus.data,
            dataId = [];
        if (data.length > 0) {
            for (var i in data) {
                dataId.push(data[i].dataId);
            }
            layer.confirm('确定删除选中的记录？', {icon: 3, title: '提示信息'}, function (index) {
                $.get("/information/service/delete", {
                    dataId: dataId.toString()
                }, function (data) {
                    top.layer.msg("操作成功！");
                    tableIns.reload();
                    layer.close(index);
                });
            })
        } else {
            layer.msg("请至少选择一条记录！");
        }
    });

    // 列表操作
    table.on('tool(informationList)', function (obj) {
        var layEvent = obj.event,
            data = obj.data;

        if (layEvent === 'edit') { //编辑
            var index = layui.layer.open({
                title: "编辑文章",
                type: 2,
                content: "/information/view/edit?dataId=" + data.dataId,
            });
            layui.layer.full(index);
            window.sessionStorage.setItem("index", index);
            //改变窗口大小时，重置弹窗的宽高，防止超出可视区域（如F12调出debug的操作）
            $(window).on("resize", function () {
                layui.layer.full(window.sessionStorage.getItem("index"));
            });
        } else if (layEvent === 'usable') { //启用禁用
            var _this = $(this),
                usableText = "是否确定禁用此用户？",
                btnText = "已禁用";
            if (_this.text() == "已禁用") {
                usableText = "是否确定启用此用户？",
                    btnText = "已启用";
            }
            layer.confirm(usableText, {
                icon: 3,
                title: '系统提示',
                cancel: function (index) {
                    layer.close(index);
                }
            }, function (index) {
                _this.text(btnText);
                layer.close(index);
            }, function (index) {
                layer.close(index);
            });
        } else if (layEvent === 'remove') { //删除
            layer.confirm('确定删除该记录？', {icon: 3, title: '提示信息'}, function (index) {
                $.get("/information/service/delete", {
                    dataId: data.dataId
                }, function (data) {
                    top.layer.msg("操作成功！");
                    tableIns.reload();
                    layer.close(index);
                });
            });
        }
    });

    // 保存
    form.on("submit(save)", function (data) {
        //弹出loading
        var index = top.layer.msg('数据提交中，请稍候', {icon: 16, time: false, shade: 0.8});
        // 表单提交
        $(data.form).ajaxSubmit({
            type: "post",
            url: "/information/service/save",
            success: function (data) {
                top.layer.close(index);
                if (data != null) {
                    top.layer.msg("操作成功！");
                    layer.closeAll("iframe");
                    // 刷新父页面
                    parent.location.reload();
                } else {
                    top.layer.msg("操作失败！");
                }
            }
        });
        return false;
    });

    // 取消
    $("#cancel").click(function () {
        // 刷新父页面
        parent.location.reload();
    });
});
