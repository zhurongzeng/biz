package com.niu.biz.dao;

import com.niu.biz.po.CustomerInfo;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICustomerDAO extends PagingAndSortingRepository<CustomerInfo, String>, JpaSpecificationExecutor<CustomerInfo> {
    CustomerInfo findByUserName(String userName);
}