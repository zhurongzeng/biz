package com.niu.biz.dao;

import com.niu.biz.po.InformationInfo;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IInformationDAO extends JpaSpecificationExecutor<InformationInfo>, PagingAndSortingRepository<InformationInfo, String> {

}
