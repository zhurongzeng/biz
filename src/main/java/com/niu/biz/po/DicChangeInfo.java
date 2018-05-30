package com.niu.biz.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * 大数与合作方字典编码对照表
 *
 * @author zhurongzeng
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "t_dic_change")
public class DicChangeInfo {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * 序号
     */
    @Id
    @Column(unique = true, nullable = false, length = 20)
    private String serialNo;

    /**
     * 系统编码
     */
    @NonNull
    @Column(nullable = false, length = 7)
    private String systemCode;

    /**
     * 合作机构编码
     */
    @NonNull
    @Column(nullable = false, length = 30)
    private String bankCode;

    /**
     * 字典编码
     */
    @NonNull
    @Column(nullable = false, length = 30)
    private String dicFieldName;

    /**
     * 字典汉字名
     */
    @NonNull
    @Column(nullable = false, length = 60)
    private String dicFieldDesc;

    /**
     * 大数码值
     */
    @NonNull
    @Column(nullable = false, length = 20)
    private String innerDicCode;

    /**
     * 大数码值描述
     */
    @NonNull
    @Column(nullable = false, length = 30)
    private String innerDicDesc;

    /**
     * 对方码值
     */
    @NonNull
    @Column(nullable = false, length = 20)
    private String outterDicCode;

    /**
     * 对方码值描述
     */
    @NonNull
    @Column(nullable = false, length = 30)
    private String outterDicDesc;

    /**
     * 是否需转换
     */
    @NonNull
    @Column(nullable = false, length = 1)
    private String changeFlag;

    /**
     * 可用状态
     */
    @NonNull
    @Column(nullable = false, length = 1)
    private String usedStatus;

    /**
     * 修改用户
     */
    @NonNull
    @Column(nullable = false, length = 20)
    private String updateUserId;

    /**
     * 修改机构
     */
    @NonNull
    @Column(nullable = false, length = 30)
    private String updateOrg;

    /**
     * 记录版本号
     */
    @Column(nullable = false, length = 2)
    private int version;

    /**
     * 备注说明
     */
    @NonNull
    @Column(nullable = false, length = 30)
    private String desc;

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getDicFieldName() {
        return dicFieldName;
    }

    public void setDicFieldName(String dicFieldName) {
        this.dicFieldName = dicFieldName;
    }

    public String getDicFieldDesc() {
        return dicFieldDesc;
    }

    public void setDicFieldDesc(String dicFieldDesc) {
        this.dicFieldDesc = dicFieldDesc;
    }

    public String getInnerDicCode() {
        return innerDicCode;
    }

    public void setInnerDicCode(String innerDicCode) {
        this.innerDicCode = innerDicCode;
    }

    public String getInnerDicDesc() {
        return innerDicDesc;
    }

    public void setInnerDicDesc(String innerDicDesc) {
        this.innerDicDesc = innerDicDesc;
    }

    public String getOutterDicCode() {
        return outterDicCode;
    }

    public void setOutterDicCode(String outterDicCode) {
        this.outterDicCode = outterDicCode;
    }

    public String getOutterDicDesc() {
        return outterDicDesc;
    }

    public void setOutterDicDesc(String outterDicDesc) {
        this.outterDicDesc = outterDicDesc;
    }

    public String getChangeFlag() {
        return changeFlag;
    }

    public void setChangeFlag(String changeFlag) {
        this.changeFlag = changeFlag;
    }

    public String getUsedStatus() {
        return usedStatus;
    }

    public void setUsedStatus(String usedStatus) {
        this.usedStatus = usedStatus;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String getUpdateOrg() {
        return updateOrg;
    }

    public void setUpdateOrg(String updateOrg) {
        this.updateOrg = updateOrg;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}
