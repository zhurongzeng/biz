package com.niu.biz.po;

import lombok.NonNull;

import javax.persistence.Column;

/**
 * 日志数据收集表Model对象
 *
 * @author xiaohean
 * @date 2018-05-10
 */
public class CollectData {
	/**
	 * 日志序号
	 */
	@NonNull
	@Column(nullable = false, length = 30)
	private String dataId;

	/**
	 * 账户号
	 */
	@NonNull
	@Column(nullable = false, length = 30)
	private String userName;

	/**
	 * 操作类别
	 */
	@NonNull
	@Column(nullable = false, length = 8)
	private String dealType;

	/**
	 * 操作类别2
	 */
	@NonNull
	@Column(nullable = false, length = 8)
	private String dealType2;

	/**
	 * 操作时间
	 */
	@NonNull
	@Column(nullable = false, length = 20)
	private String dealTime;

	/**
	 * 操作ip
	 */
	@NonNull
	@Column(nullable = false, length = 30)
	private String fromIP;

	/**
	 * 关键字
	 */
	@NonNull
	@Column(nullable = false, length = 30)
	private String keyName;

	/**
	 * 关键字2
	 */
	@NonNull
	@Column(nullable = false, length = 30)
	private String keyName2;

	/**
	 * 操作数据
	 */
	@NonNull
	@Column
	private String dealDataStr;

	/**
	 * 操作前数据
	 */
	@NonNull
	@Column
	private String dealDataStrOld;

	/**
	 * 创建时间
	 */
	@NonNull
	@Column(nullable = false, length = 20)
	private String createDatetime;

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
	 * 日志序号
	 */
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getDataId() {
		return this.dataId;
	}

	/**
	 * 账户号
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return this.userName;
	}

	/**
	 * 操作类别
	 */
	public void setDealType(String dealType) {
		this.dealType = dealType;
	}

	public String getDealType() {
		return this.dealType;
	}

	/**
	 * 操作类别2
	 */
	public void setDealType2(String dealType2) {
		this.dealType2 = dealType2;
	}

	public String getDealType2() {
		return this.dealType2;
	}

	/**
	 * 操作时间
	 */
	public void setDealTime(String dealTime) {
		this.dealTime = dealTime;
	}

	public String getDealTime() {
		return this.dealTime;
	}

	/**
	 * 操作ip
	 */
	public void setFromIP(String fromIP) {
		this.fromIP = fromIP;
	}

	public String getFromIP() {
		return this.fromIP;
	}

	/**
	 * 关键字
	 */
	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public String getKeyName() {
		return this.keyName;
	}

	/**
	 * 关键字2
	 */
	public void setKeyName2(String keyName2) {
		this.keyName2 = keyName2;
	}

	public String getKeyName2() {
		return this.keyName2;
	}

	/**
	 * 操作数据
	 */
	public void setDealDataStr(String dealDataStr) {
		this.dealDataStr = dealDataStr;
	}

	public String getDealDataStr() {
		return this.dealDataStr;
	}

	/**
	 * 操作前数据
	 */
	public void setDealDataStrOld(String dealDataStrOld) {
		this.dealDataStrOld = dealDataStrOld;
	}

	public String getDealDataStrOld() {
		return this.dealDataStrOld;
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

}