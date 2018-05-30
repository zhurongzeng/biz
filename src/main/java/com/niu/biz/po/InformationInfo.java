package com.niu.biz.po;

import lombok.NonNull;

import javax.persistence.Column;

/**
 * 资讯消息表Model对象
 *
 * @author xiaohean
 * @date 2018-05-10
 */
public class InformationInfo {
    /**
     * 资讯序号
     */
    @NonNull
    @Column(nullable = false, length = 30)
    private String dataId;

    /**
     * 标题
     */
    @NonNull
    @Column
    private String tittle;

    /**
     * 内容
     */
    @NonNull
    @Column
    private String content;

    /**
     * 内容VIP收费
     */
    @NonNull
    @Column
    private String contentVip;

    /**
     * 讲师用户号
     */
    @NonNull
    @Column
    private String tchUserName;

    /**
     * 创建时间
     */
    @NonNull
    @Column
    private String createDatetime;

    /**
     * 是否发布
     */
    @NonNull
    @Column
    private String sendFlag;

    /**
     * 发布时间
     */
    @NonNull
    @Column
    private String sendDatetime;

    /**
     * 资讯单价
     */
    @NonNull
    @Column
    private Integer price;

    /**
     * 资讯类别
     */
    @NonNull
    @Column
    private String feeType;

    /**
     * 评论人A用户号
     */
    @NonNull
    @Column
    private String commentUserA;

    /**
     * 评论A内容
     */
    @NonNull
    @Column
    private String commentA;

    /**
     * 评论A时间
     */
    @NonNull
    @Column
    private String commentTimeA;

    /**
     * 评论人B用户号
     */
    @NonNull
    @Column
    private String commentUserB;

    /**
     * 评论B内容
     */
    @NonNull
    @Column
    private String commentB;

    /**
     * 评论B时间
     */
    @NonNull
    @Column
    private String commentTimeB;

    /**
     * 修改时间
     */
    @NonNull
    @Column
    private String updateDatetime;

    /**
     * 备用字段1
     */
    @NonNull
    @Column
    private String bizStr1;

    /**
     * 备用字段2
     */
    @NonNull
    @Column
    private String bizStr2;

    /**
     * 备用字段3
     */
    @NonNull
    @Column
    private String bizText;

    /**
     * 业务编号1
     */
    @NonNull
    @Column
    private String bizNo1;

    /**
     * 业务编号2
     */
    @NonNull
    @Column
    private String bizNo2;

    /**
     * 业务编号3
     */
    @NonNull
    @Column
    private String bizNo3;

    /**
     * 备注
     */
    @NonNull
    @Column
    private String remark;

    /**
     * 描述
     */
    @NonNull
    @Column
    private String desc;

    /**
     * 资讯序号
     */
    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getDataId() {
        return this.dataId;
    }

    /**
     * 标题
     */
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getTittle() {
        return this.tittle;
    }

    /**
     * 内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    /**
     * 内容VIP收费
     */
    public void setContentVip(String contentVip) {
        this.contentVip = contentVip;
    }

    public String getContentVip() {
        return this.contentVip;
    }

    /**
     * 讲师用户号
     */
    public void setTchUserName(String tchUserName) {
        this.tchUserName = tchUserName;
    }

    public String getTchUserName() {
        return this.tchUserName;
    }

    /**
     * 创建时间
     */
    public void setCreateDatetime(String createDatetime) {
        this.createDatetime = createDatetime;
    }

    public String getCreateDatetime() {
        return this.createDatetime;
    }

    /**
     * 是否发布
     */
    public void setSendFlag(String sendFlag) {
        this.sendFlag = sendFlag;
    }

    public String getSendFlag() {
        return this.sendFlag;
    }

    /**
     * 发布时间
     */
    public void setSendDatetime(String sendDatetime) {
        this.sendDatetime = sendDatetime;
    }

    public String getSendDatetime() {
        return this.sendDatetime;
    }

    /**
     * 资讯单价
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return this.price;
    }

    /**
     * 资讯类别
     */
    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getFeeType() {
        return this.feeType;
    }

    /**
     * 评论人A用户号
     */
    public void setCommentUserA(String commentUserA) {
        this.commentUserA = commentUserA;
    }

    public String getCommentUserA() {
        return this.commentUserA;
    }

    /**
     * 评论A内容
     */
    public void setCommentA(String commentA) {
        this.commentA = commentA;
    }

    public String getCommentA() {
        return this.commentA;
    }

    /**
     * 评论A时间
     */
    public void setCommentTimeA(String commentTimeA) {
        this.commentTimeA = commentTimeA;
    }

    public String getCommentTimeA() {
        return this.commentTimeA;
    }

    /**
     * 评论人B用户号
     */
    public void setCommentUserB(String commentUserB) {
        this.commentUserB = commentUserB;
    }

    public String getCommentUserB() {
        return this.commentUserB;
    }

    /**
     * 评论B内容
     */
    public void setCommentB(String commentB) {
        this.commentB = commentB;
    }

    public String getCommentB() {
        return this.commentB;
    }

    /**
     * 评论B时间
     */
    public void setCommentTimeB(String commentTimeB) {
        this.commentTimeB = commentTimeB;
    }

    public String getCommentTimeB() {
        return this.commentTimeB;
    }

    /**
     * 修改时间
     */
    public void setUpdateDatetime(String updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    public String getUpdateDatetime() {
        return this.updateDatetime;
    }

    /**
     * 备用字段1
     */
    public void setBizStr1(String bizStr1) {
        this.bizStr1 = bizStr1;
    }

    public String getBizStr1() {
        return this.bizStr1;
    }

    /**
     * 备用字段2
     */
    public void setBizStr2(String bizStr2) {
        this.bizStr2 = bizStr2;
    }

    public String getBizStr2() {
        return this.bizStr2;
    }

    /**
     * 备用字段3
     */
    public void setBizText(String bizText) {
        this.bizText = bizText;
    }

    public String getBizText() {
        return this.bizText;
    }

    /**
     * 业务编号1
     */
    public void setBizNo1(String bizNo1) {
        this.bizNo1 = bizNo1;
    }

    public String getBizNo1() {
        return this.bizNo1;
    }

    /**
     * 业务编号2
     */
    public void setBizNo2(String bizNo2) {
        this.bizNo2 = bizNo2;
    }

    public String getBizNo2() {
        return this.bizNo2;
    }

    /**
     * 业务编号3
     */
    public void setBizNo3(String bizNo3) {
        this.bizNo3 = bizNo3;
    }

    public String getBizNo3() {
        return this.bizNo3;
    }

    /**
     * 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return this.remark;
    }

    /**
     * 描述
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }

}