package com.niu.biz.service.impl;

import com.niu.biz.dao.ICustomerDAO;
import com.niu.biz.po.CustomerInfo;
import com.niu.biz.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * 客户信息业务处理类
 *
 * @author
 * @create 2018-05-28 17:50
 **/

@Service("customerService")
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private ICustomerDAO customerDAO;

    @Override
    public CustomerInfo getByUserName(String userName) {
        return customerDAO.findByUserName(userName);
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        CustomerInfo customer = customerDAO.findByUserName(userName);
        if (customer == null) {
            throw new UsernameNotFoundException("用户名不存在！");
        }
        return customer;
    }

    @Override
    public CustomerInfo save(CustomerInfo customerInfo) {
        return customerDAO.save(customerInfo);
    }
}
