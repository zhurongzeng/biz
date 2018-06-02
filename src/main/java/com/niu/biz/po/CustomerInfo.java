package com.niu.biz.po;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Collection;

/**
 * 客户用户信息表Model对象
 *
 * @author xiaohean
 * @date 2018-05-10
 */
@Data
@Entity
@Table(name = "t_customer_info")
public class CustomerInfo implements UserDetails {
    /**
     * 账户序号
     */
    @Id
    @Column
    private String userId;

    /**
     * 登陆用户名
     */
    @Column
    private String userName;

    /**
     * 用户网名
     */
    @Column
    private String eName;

    /**
     * 真实姓名
     */
    @Column
    private String customerName;

    /**
     * 证件类型
     */
    @Column
    private String customerCertType;

    /**
     * 证件号码
     */
    @Column
    private String customerCertId;

    /**
     * 手机号加密串
     */
    @Column
    private String phoneSecret;

    /**
     * 手机号7位串
     */
    @Column
    private String phoneStr7;

    /**
     * 登陆密码
     */
    @Column
    private String password;

    /**
     * 客户类型
     */
    @Column
    private String customerType;

    /**
     * 客户类型2
     */
    @Column
    private String customerType2;

    /**
     * 客户类型3
     */
    @Column
    private String customerType3;

    /**
     * 客户等级
     */
    @Column
    private String customerLevel;

    /**
     * 客户等级2
     */
    @Column
    private String customerLevel2;

    /**
     * 是否seller
     */
    @Column
    private String selFlag;

    /**
     * QQ号码
     */
    @Column
    private String qqStr;

    /**
     * 微信号码
     */
    @Column
    private String wxStr;

    /**
     * 微信名称
     */
    @Column
    private String wxName;

    /**
     * 邮箱地址
     */
    @Column
    private String mailAddress;

    /**
     * 籍贯地市
     */
    @Column
    private String jgCity;

    /**
     * 所在城市
     */
    @Column
    private String belongCity;

    /**
     * 居住地址
     */
    @Column
    private String liveAddress;

    /**
     * 学历
     */
    @Column
    private String eduLevel;

    /**
     * 职业
     */
    @Column
    private String workDesc;

    /**
     * 创建时间
     */
    @Column
    private String createDatetime;

    /**
     * 修改时间
     */
    @Column
    private String updateDatetime;

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
    private String bizStr3;

    /**
     * 备用字段4
     */
    @Column
    private String bizStr4;

    /**
     * 备用字段5
     */
    @Column
    private String bizStr5;

    /**
     * 备用字段6
     */
    @Column
    private String bizStr6;

    /**
     * 备用字段7
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

    public String getUserName() {
        return this.userName;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getUsername() {
        return this.userName;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}