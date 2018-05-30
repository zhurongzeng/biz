package com.niu.biz.po;

import lombok.NonNull;

import javax.persistence.Column;

/**
 * 账户信息表Model对象
 *
 * @author xiaohean
 * @date 2018-05-10
 */
public class AccountInfo {
    /**
     * 用户号
     */
    @NonNull
    @Column(nullable = false, length = 30)
    private String userName;

    /**
     * 账户号
     */
    @NonNull
    @Column(nullable = false, length = 30)
    private String actNo;

    /**
     * 金币余额
     */
    @NonNull
    @Column
    private Integer jAmount;

    /**
     * 牛豆余额
     */
    @NonNull
    @Column
    private Integer ndAmount;

    /**
     * 牛券总积分
     */
    @NonNull
    @Column
    private Integer nqTotal;

    /**
     * 本周积分
     */
    @NonNull
    @Column
    private Integer nqWeek;

    /**
     * 本月积分
     */
    @NonNull
    @Column
    private Integer nqMonth;

    /**
     * 是否VIP
     */
    @NonNull
    @Column
    private String vipFlag;

    /**
     * 曾经VIP
     */
    @NonNull
    @Column
    private String vipOldFlag;

    /**
     * 账户状态
     */
    @NonNull
    @Column
    private String actFlag;

    /**
     * 发展人A1用户号
     */
    @NonNull
    @Column
    private String belongUserName1;

    /**
     * 发展人B2用户号
     */
    @NonNull
    @Column
    private String belongUserName2;

    /**
     * 发展人C3用户号
     */
    @NonNull
    @Column
    private String belongUserName3;

    /**
     * Y1人数
     */
    @NonNull
    @Column
    private Integer accountY1;

    /**
     * Y2人数
     */
    @NonNull
    @Column
    private Integer accountY2;

    /**
     * Y3人数
     */
    @NonNull
    @Column
    private Integer accountY3;

    /**
     * Y1奖励
     */
    @NonNull
    @Column
    private Integer nqY1;

    /**
     * Y2奖励
     */
    @NonNull
    @Column
    private Integer nqY2;

    /**
     * Y3奖励
     */
    @NonNull
    @Column
    private Integer nqY3;

    /**
     * 绑定银行卡号
     */
    @NonNull
    @Column
    private String fixBankAccount;

    /**
     * 绑定卡银行号
     */
    @NonNull
    @Column
    private String fixBankCode;

    /**
     * 绑定卡银行名称
     */
    @NonNull
    @Column
    private String fixBankName;

    /**
     * 创建时间
     */
    @NonNull
    @Column
    private String createDatetime;

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
    private String bizStr3;

    /**
     * 备用字段4
     */
    @NonNull
    @Column
    private String bizStr4;

    /**
     * 备用字段5
     */
    @NonNull
    @Column
    private String bizStr5;

    /**
     * 备用字段6
     */
    @NonNull
    @Column
    private String bizStr6;

    /**
     * 备用字段7
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
    private String desc8;

    /**
     * 用户号
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }

    /**
     * 账户号
     */
    public void setActNo(String actNo) {
        this.actNo = actNo;
    }

    public String getActNo() {
        return this.actNo;
    }

    /**
     * 金币余额
     */
    public void setJAmount(Integer jAmount) {
        this.jAmount = jAmount;
    }

    public Integer getJAmount() {
        return this.jAmount;
    }

    /**
     * 牛豆余额
     */
    public void setNdAmount(Integer ndAmount) {
        this.ndAmount = ndAmount;
    }

    public Integer getNdAmount() {
        return this.ndAmount;
    }

    /**
     * 牛券总积分
     */
    public void setNqTotal(Integer nqTotal) {
        this.nqTotal = nqTotal;
    }

    public Integer getNqTotal() {
        return this.nqTotal;
    }

    /**
     * 本周积分
     */
    public void setNqWeek(Integer nqWeek) {
        this.nqWeek = nqWeek;
    }

    public Integer getNqWeek() {
        return this.nqWeek;
    }

    /**
     * 本月积分
     */
    public void setNqMonth(Integer nqMonth) {
        this.nqMonth = nqMonth;
    }

    public Integer getNqMonth() {
        return this.nqMonth;
    }

    /**
     * 是否VIP
     */
    public void setVipFlag(String vipFlag) {
        this.vipFlag = vipFlag;
    }

    public String getVipFlag() {
        return this.vipFlag;
    }

    /**
     * 曾经VIP
     */
    public void setVipOldFlag(String vipOldFlag) {
        this.vipOldFlag = vipOldFlag;
    }

    public String getVipOldFlag() {
        return this.vipOldFlag;
    }

    /**
     * 账户状态
     */
    public void setActFlag(String actFlag) {
        this.actFlag = actFlag;
    }

    public String getActFlag() {
        return this.actFlag;
    }

    /**
     * 发展人A1用户号
     */
    public void setBelongUserName1(String belongUserName1) {
        this.belongUserName1 = belongUserName1;
    }

    public String getBelongUserName1() {
        return this.belongUserName1;
    }

    /**
     * 发展人B2用户号
     */
    public void setBelongUserName2(String belongUserName2) {
        this.belongUserName2 = belongUserName2;
    }

    public String getBelongUserName2() {
        return this.belongUserName2;
    }

    /**
     * 发展人C3用户号
     */
    public void setBelongUserName3(String belongUserName3) {
        this.belongUserName3 = belongUserName3;
    }

    public String getBelongUserName3() {
        return this.belongUserName3;
    }

    /**
     * Y1人数
     */
    public void setAccountY1(Integer accountY1) {
        this.accountY1 = accountY1;
    }

    public Integer getAccountY1() {
        return this.accountY1;
    }

    /**
     * Y2人数
     */
    public void setAccountY2(Integer accountY2) {
        this.accountY2 = accountY2;
    }

    public Integer getAccountY2() {
        return this.accountY2;
    }

    /**
     * Y3人数
     */
    public void setAccountY3(Integer accountY3) {
        this.accountY3 = accountY3;
    }

    public Integer getAccountY3() {
        return this.accountY3;
    }

    /**
     * Y1奖励
     */
    public void setNqY1(Integer nqY1) {
        this.nqY1 = nqY1;
    }

    public Integer getNqY1() {
        return this.nqY1;
    }

    /**
     * Y2奖励
     */
    public void setNqY2(Integer nqY2) {
        this.nqY2 = nqY2;
    }

    public Integer getNqY2() {
        return this.nqY2;
    }

    /**
     * Y3奖励
     */
    public void setNqY3(Integer nqY3) {
        this.nqY3 = nqY3;
    }

    public Integer getNqY3() {
        return this.nqY3;
    }

    /**
     * 绑定银行卡号
     */
    public void setFixBankAccount(String fixBankAccount) {
        this.fixBankAccount = fixBankAccount;
    }

    public String getFixBankAccount() {
        return this.fixBankAccount;
    }

    /**
     * 绑定卡银行号
     */
    public void setFixBankCode(String fixBankCode) {
        this.fixBankCode = fixBankCode;
    }

    public String getFixBankCode() {
        return this.fixBankCode;
    }

    /**
     * 绑定卡银行名称
     */
    public void setFixBankName(String fixBankName) {
        this.fixBankName = fixBankName;
    }

    public String getFixBankName() {
        return this.fixBankName;
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
    public void setBizStr3(String bizStr3) {
        this.bizStr3 = bizStr3;
    }

    public String getBizStr3() {
        return this.bizStr3;
    }

    /**
     * 备用字段4
     */
    public void setBizStr4(String bizStr4) {
        this.bizStr4 = bizStr4;
    }

    public String getBizStr4() {
        return this.bizStr4;
    }

    /**
     * 备用字段5
     */
    public void setBizStr5(String bizStr5) {
        this.bizStr5 = bizStr5;
    }

    public String getBizStr5() {
        return this.bizStr5;
    }

    /**
     * 备用字段6
     */
    public void setBizStr6(String bizStr6) {
        this.bizStr6 = bizStr6;
    }

    public String getBizStr6() {
        return this.bizStr6;
    }

    /**
     * 备用字段7
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
    public void setDesc8(String desc8) {
        this.desc8 = desc8;
    }

    public String getDesc8() {
        return this.desc8;
    }

}