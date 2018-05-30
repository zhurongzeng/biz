package com.niu.biz.po;

import lombok.NonNull;

import javax.persistence.Column;

/**
 * 用户资讯权限表Model对象
 *
 * @author xiaohean
 * @date 2018-05-10
 */
public class AuthorizeInfo {
	/**
	 * 权限序号
	 */
	@NonNull
	@Column(nullable = false, length = 30)
	private String authId;

	/**
	 * 权限类型
	 */
	@NonNull
	@Column
	private String authType;

	/**
	 * 用户名
	 */
	@NonNull
	@Column(nullable = false, length = 30)
	private String userName;

	/**
	 * 讲师用户号
	 */
	@NonNull
	@Column(nullable = false, length = 30)
	private String tchUserName;

	/**
	 * 资讯序号
	 */
	@NonNull
	@Column(nullable = false, length = 30)
	private String dataId;

	/**
	 * 授权时间
	 */
	@NonNull
	@Column(nullable = false, length = 20)
	private String authTime;

	/**
	 * 权限是否可用
	 */
	@NonNull
	@Column(nullable = false, length = 3)
	private String authFlag;

	/**
	 * 生效时间
	 */
	@NonNull
	@Column
	private String dataEnd;

	/**
	 * 结束时间
	 */
	@NonNull
	@Column
	private String dataBegin;

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
	 * 权限序号
	 */
	public void setAuthId(String authId) {
		this.authId = authId;
	}

	public String getAuthId() {
		return this.authId;
	}

	/**
	 * 权限类型
	 */
	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public String getAuthType() {
		return this.authType;
	}

	/**
	 * 用户名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return this.userName;
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
	 * 资讯序号
	 */
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getDataId() {
		return this.dataId;
	}

	/**
	 * 授权时间
	 */
	public void setAuthTime(String authTime) {
		this.authTime = authTime;
	}

	public String getAuthTime() {
		return this.authTime;
	}

	/**
	 * 权限是否可用
	 */
	public void setAuthFlag(String authFlag) {
		this.authFlag = authFlag;
	}

	public String getAuthFlag() {
		return this.authFlag;
	}

	/**
	 * 生效时间
	 */
	public void setDataEnd(String dataEnd) {
		this.dataEnd = dataEnd;
	}

	public String getDataEnd() {
		return this.dataEnd;
	}

	/**
	 * 结束时间
	 */
	public void setDataBegin(String dataBegin) {
		this.dataBegin = dataBegin;
	}

	public String getDataBegin() {
		return this.dataBegin;
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