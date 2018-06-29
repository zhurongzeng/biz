package com.niu.biz.service;

import com.niu.biz.po.InformationInfo;

import java.util.List;

public interface IInformationService {
    List<InformationInfo> pageList(int page, int limit, InformationInfo info);
    long count(InformationInfo info);
    InformationInfo save(InformationInfo informationInfo);
    void delete(String dataId) throws Exception;
    InformationInfo getInformation(String dataId);
}
