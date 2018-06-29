package com.niu.biz.controller;

import com.niu.biz.dto.DataGrid;
import com.niu.biz.po.InformationInfo;
import com.niu.biz.service.IInformationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RequestMapping(value = "/information")
public class InformationController {
    @Autowired
    private IInformationService informationService;

    @GetMapping(value = "/view/{id}")
    public String list(@PathVariable("id") String id, String dataId, Model model) {
        if ("edit".equals(id)) {
            InformationInfo informationInfo = informationService.getInformation(dataId);
            model.addAttribute("informationInfo", informationInfo);
        }
        return "information/" + id;
    }

    /**
     * 查询列表
     *
     * @param page
     * @param limit
     * @return
     */
    @GetMapping("/service/list")
    @ResponseBody
    public DataGrid list(int page, int limit) {
        log.info("==> 开始查询第{}页文章列表，每页{}条......", page, limit);
        List<InformationInfo> list = null;
        long count = 0;
        try {
            list = informationService.pageList(page - 1, limit, new InformationInfo());
            count = informationService.count(new InformationInfo());
        } catch (Exception e) {
            log.error("==> 文章列表查询失败！\n", e);
        }
        log.info("==> 文章列表查询完成!");
        return new DataGrid(0, "", count, list);
    }

    /**
     * 保存
     *
     * @param information
     * @return
     */
    @PostMapping("/service/save")
    @ResponseBody
    public InformationInfo save(InformationInfo information) {
        log.info("==> 开始保存文章信息：{}", information);
        return informationService.save(information);
    }

    /**
     * 删除
     *
     * @param dataIds
     */
    @GetMapping("/service/delete")
    @ResponseBody
    public void delete(String dataIds) {
        log.info("==> 开始删除{}文章信息......", dataIds);
        for (String dataId : dataIds.split(",")) {
            try {
                informationService.delete(dataId);
                log.info("==> {}文章信息删除成功！", dataId);
            } catch (Exception e) {
                log.info("==> {}文章信息删除失败！\n", dataId, e);
            }
        }
    }
}
