package com.niu.biz.po;

import lombok.NonNull;

import javax.persistence.Column;

/**
 * 交易记录表Model对象
 *
 * @author xiaohean
 * @date 2018-05-10
 */
public class TransInfo {
	/**
	 * 交易序号
	 */
	@NonNull
	@Column(nullable = false, length = 30)
	private String transId;

	/**
	 * 账户号
	 */
	@NonNull
	@Column(nullable = false, length = 30)
	private String actNo;

	/**
	 * 交易类型
	 */
	@NonNull
	@Column(nullable = false, length = 9)
	private String bizType;

	/**
	 * 付款银行卡号
	 */
	@NonNull
	@Column(nullable = false, length = 30)
	private String payBankAccount;

	/**
	 * 付款卡银行号
	 */
	@NonNull
	@Column(nullable = false, length = 30)
	private String payBankCode;

	/**
	 * 付款卡银行名称
	 */
	@NonNull
	@Column
	private String payBankName;

	/**
	 * 收款银行卡号
	 */
	@NonNull
	@Column
	private String rcvBankAccount;

	/**
	 * 收款卡银行号
	 */
	@NonNull
	@Column
	private String rcvBankCode;

	/**
	 * 收款卡银行名称
	 */
	@NonNull
	@Column
	private String rcvBankName;

	/**
	 * 业务原金额
	 */
	@NonNull
	@Column
	private Integer bizAmount;

	/**
	 * 业务折扣率
	 */
	@NonNull
	@Column
	private Double bizRate;

	/**
	 * 实际交易金额
	 */
	@NonNull
	@Column
	private Integer dealAmount;

	/**
	 * 交易状态
	 */
	@NonNull
	@Column
	private String dealStatus;

	/**
	 * 交易日期
	 */
	@NonNull
	@Column
	private String dealDate;

	/**
	 * 交易时间
	 */
	@NonNull
	@Column
	private String dealDatetime;

	/**
	 * 交易前余额
	 */
	@NonNull
	@Column
	private Integer amountOld;

	/**
	 * 交易后余额
	 */
	@NonNull
	@Column
	private Integer amountNew;

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
	private String desc;

	/**
	 * 交易序号
	 */
	public void setTransId(String transId) {
		this.transId = transId;
	}

	public String getTransId() {
		return this.transId;
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
	 * 交易类型
	 */
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBizType() {
		return this.bizType;
	}

	/**
	 * 付款银行卡号
	 */
	public void setPayBankAccount(String payBankAccount) {
		this.payBankAccount = payBankAccount;
	}

	public String getPayBankAccount() {
		return this.payBankAccount;
	}

	/**
	 * 付款卡银行号
	 */
	public void setPayBankCode(String payBankCode) {
		this.payBankCode = payBankCode;
	}

	public String getPayBankCode() {
		return this.payBankCode;
	}

	/**
	 * 付款卡银行名称
	 */
	public void setPayBankName(String payBankName) {
		this.payBankName = payBankName;
	}

	public String getPayBankName() {
		return this.payBankName;
	}

	/**
	 * 收款银行卡号
	 */
	public void setRcvBankAccount(String rcvBankAccount) {
		this.rcvBankAccount = rcvBankAccount;
	}

	public String getRcvBankAccount() {
		return this.rcvBankAccount;
	}

	/**
	 * 收款卡银行号
	 */
	public void setRcvBankCode(String rcvBankCode) {
		this.rcvBankCode = rcvBankCode;
	}

	public String getRcvBankCode() {
		return this.rcvBankCode;
	}

	/**
	 * 收款卡银行名称
	 */
	public void setRcvBankName(String rcvBankName) {
		this.rcvBankName = rcvBankName;
	}

	public String getRcvBankName() {
		return this.rcvBankName;
	}

	/**
	 * 业务原金额
	 */
	public void setBizAmount(Integer bizAmount) {
		this.bizAmount = bizAmount;
	}

	public Integer getBizAmount() {
		return this.bizAmount;
	}

	/**
	 * 业务折扣率
	 */
	public void setBizRate(Double bizRate) {
		this.bizRate = bizRate;
	}

	public Double getBizRate() {
		return this.bizRate;
	}

	/**
	 * 实际交易金额
	 */
	public void setDealAmount(Integer dealAmount) {
		this.dealAmount = dealAmount;
	}

	public Integer getDealAmount() {
		return this.dealAmount;
	}

	/**
	 * 交易状态
	 */
	public void setDealStatus(String dealStatus) {
		this.dealStatus = dealStatus;
	}

	public String getDealStatus() {
		return this.dealStatus;
	}

	/**
	 * 交易日期
	 */
	public void setDealDate(String dealDate) {
		this.dealDate = dealDate;
	}

	public String getDealDate() {
		return this.dealDate;
	}

	/**
	 * 交易时间
	 */
	public void setDealDatetime(String dealDatetime) {
		this.dealDatetime = dealDatetime;
	}

	public String getDealDatetime() {
		return this.dealDatetime;
	}

	/**
	 * 交易前余额
	 */
	public void setAmountOld(Integer amountOld) {
		this.amountOld = amountOld;
	}

	public Integer getAmountOld() {
		return this.amountOld;
	}

	/**
	 * 交易后余额
	 */
	public void setAmountNew(Integer amountNew) {
		this.amountNew = amountNew;
	}

	public Integer getAmountNew() {
		return this.amountNew;
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
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return this.desc;
	}

}