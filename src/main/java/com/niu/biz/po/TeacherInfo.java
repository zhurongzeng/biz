package com.niu.biz.po;

import lombok.NonNull;

import javax.persistence.Column;

/**
 * 讲师团队信息表Model对象
 *
 * @author xiaohean
 * @date 2018-05-10
 */
public class TeacherInfo {
	/**
	 * 讲师用户号
	 */
	@NonNull
	@Column(nullable = false, length = 30)
	private String tchUserName;

	/**
	 * 讲师别名
	 */
	@NonNull
	@Column(nullable = false, length = 20)
	private String tchName;

	/**
	 * 讲师说明
	 */
	@NonNull
	@Column(nullable = false, length = 80)
	private String tchDesc;

	/**
	 * 讲师头像序号
	 */
	@NonNull
	@Column(nullable = false, length = 30)
	private String tchPictureNo;

	/**
	 * 讲师头像图片
	 */
	@NonNull
	@Column(nullable = false, length = 80)
	private String tchPicture;

	/**
	 * 团队代码
	 */
	@NonNull
	@Column(nullable = false, length = 20)
	private String teamCode;

	/**
	 * 团队名称
	 */
	@NonNull
	@Column(nullable = false, length = 30)
	private String teamName;

	/**
	 * 团队描述
	 */
	@NonNull
	@Column
	private String teamDesc;

	/**
	 * 月价格D
	 */
	@NonNull
	@Column
	private Integer priceDmoth;

	/**
	 * 月价格L
	 */
	@NonNull
	@Column
	private Integer priceLmoth;

	/**
	 * 打折后乘数M
	 */
	@NonNull
	@Column
	private Double rateMoth;

	/**
	 * 半年价格D
	 */
	@NonNull
	@Column
	private Integer priceDhafy;

	/**
	 * 半年价格L
	 */
	@NonNull
	@Column
	private Integer priceLhafy;

	/**
	 * 打折后乘数M
	 */
	@NonNull
	@Column
	private Double rateHafy;

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
	@Column(nullable = false, length = 20)
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
	 * 讲师用户号
	 */
	public void setTchUserName(String tchUserName) {
		this.tchUserName = tchUserName;
	}

	public String getTchUserName() {
		return this.tchUserName;
	}

	/**
	 * 讲师别名
	 */
	public void setTchName(String tchName) {
		this.tchName = tchName;
	}

	public String getTchName() {
		return this.tchName;
	}

	/**
	 * 讲师说明
	 */
	public void setTchDesc(String tchDesc) {
		this.tchDesc = tchDesc;
	}

	public String getTchDesc() {
		return this.tchDesc;
	}

	/**
	 * 讲师头像序号
	 */
	public void setTchPictureNo(String tchPictureNo) {
		this.tchPictureNo = tchPictureNo;
	}

	public String getTchPictureNo() {
		return this.tchPictureNo;
	}

	/**
	 * 讲师头像图片
	 */
	public void setTchPicture(String tchPicture) {
		this.tchPicture = tchPicture;
	}

	public String getTchPicture() {
		return this.tchPicture;
	}

	/**
	 * 团队代码
	 */
	public void setTeamCode(String teamCode) {
		this.teamCode = teamCode;
	}

	public String getTeamCode() {
		return this.teamCode;
	}

	/**
	 * 团队名称
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamName() {
		return this.teamName;
	}

	/**
	 * 团队描述
	 */
	public void setTeamDesc(String teamDesc) {
		this.teamDesc = teamDesc;
	}

	public String getTeamDesc() {
		return this.teamDesc;
	}

	/**
	 * 月价格D
	 */
	public void setPriceDmoth(Integer priceDmoth) {
		this.priceDmoth = priceDmoth;
	}

	public Integer getPriceDmoth() {
		return this.priceDmoth;
	}

	/**
	 * 月价格L
	 */
	public void setPriceLmoth(Integer priceLmoth) {
		this.priceLmoth = priceLmoth;
	}

	public Integer getPriceLmoth() {
		return this.priceLmoth;
	}

	/**
	 * 打折后乘数M
	 */
	public void setRateMoth(Double rateMoth) {
		this.rateMoth = rateMoth;
	}

	public Double getRateMoth() {
		return this.rateMoth;
	}

	/**
	 * 半年价格D
	 */
	public void setPriceDhafy(Integer priceDhafy) {
		this.priceDhafy = priceDhafy;
	}

	public Integer getPriceDhafy() {
		return this.priceDhafy;
	}

	/**
	 * 半年价格L
	 */
	public void setPriceLhafy(Integer priceLhafy) {
		this.priceLhafy = priceLhafy;
	}

	public Integer getPriceLhafy() {
		return this.priceLhafy;
	}

	/**
	 * 打折后乘数M
	 */
	public void setRateHafy(Double rateHafy) {
		this.rateHafy = rateHafy;
	}

	public Double getRateHafy() {
		return this.rateHafy;
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