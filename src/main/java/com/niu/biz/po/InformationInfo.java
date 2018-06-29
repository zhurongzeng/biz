package com.niu.biz.po;

import com.niu.biz.annotation.GeneratedUID;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 资讯消息表Model对象
 *
 * @author xiaohean
 * @date 2018-05-10
 */
@Data
@Entity
@Table(name = "t_information_info")
public class InformationInfo extends BasePO {
    /**
     * 资讯序号
     */
    @Id
    @GeneratedUID
    private String dataId;

    /**
     * 标题
     */
    @Column
    private String title;

    /**
     * 内容
     */
    @Column
    private String content;

    /**
     * 内容VIP收费
     */
    @Column(name = "contentVip")
    private String contentVip;

    /**
     * 讲师用户号
     */
    @Column
    private String tchUserName;

    /**
     * 是否发布
     */
    @Column
    private String sendFlag;

    /**
     * 发布时间
     */
    @Column
    private String sendDatetime;

    /**
     * 资讯单价
     */
    @Column
    private Integer price;

    /**
     * 资讯类别
     */
    @Column
    private String feeType;

    /**
     * 评论人A用户号
     */
    @Column(name = "comment_User_A")
    private String commentUserA;

    /**
     * 评论A内容
     */
    @Column(name = "comment_A")
    private String commentA;

    /**
     * 评论A时间
     */
    @Column(name = "comment_Time_A")
    private String commentTimeA;

    /**
     * 评论人B用户号
     */
    @Column(name = "comment_User_B")
    private String commentUserB;

    /**
     * 评论B内容
     */
    @Column(name = "comment_B")
    private String commentB;

    /**
     * 评论B时间
     */
    @Column(name = "comment_Time_B")
    private String commentTimeB;

    /**
     * 备用字段1
     */
    @Column
    private String bizStr1;

    /**
     * 备用字段2
     */
    @Column
    private String bizStr2;

    /**
     * 备用字段3
     */
    @Column
    private String bizText;

    /**
     * 业务编号1
     */
    @Column
    private String bizNo1;

    /**
     * 业务编号2
     */
    @Column
    private String bizNo2;

    /**
     * 业务编号3
     */
    @Column
    private String bizNo3;

    /**
     * 备注
     */
    @Column
    private String remark;

    /**
     * 描述
     */
    @Column
    private String description;
}