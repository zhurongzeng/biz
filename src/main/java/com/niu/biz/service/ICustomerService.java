package com.niu.biz.service;

import com.niu.biz.po.CustomerInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface ICustomerService extends UserDetailsService{
    CustomerInfo getByUserName(String userName);

    CustomerInfo save(CustomerInfo customerInfo);
}
