package com.niu.biz.service.impl;

import com.niu.biz.dao.IInformationDAO;
import com.niu.biz.po.InformationInfo;
import com.niu.biz.service.IInformationService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Service
public class InformationServiceImpl implements IInformationService {
    @Autowired
    private IInformationDAO informationDAO;

    @Override
    public List<InformationInfo> pageList(int page, int limit, InformationInfo info) {
        PageRequest pageRequest = new PageRequest(page, limit, Sort.Direction.DESC, "createDatetime");
        return informationDAO.findAll((root, query, cb) -> getPredicate(root, cb, info), pageRequest).getContent();
    }

    @Override
    public long count(InformationInfo info) {
        return informationDAO.count((root, query, cb) -> getPredicate(root, cb, info));
    }

    @Override
    public InformationInfo save(InformationInfo informationInfo) {
        return informationDAO.save(informationInfo);
    }

    @Override
    public void delete(String dataId) throws Exception {
        informationDAO.deleteById(dataId);
    }

    @Override
    public InformationInfo getInformation(String dataId) {
        return (InformationInfo)informationDAO.findById(dataId);
    }

    /**
     * 生成查询条件
     *
     * @param root
     * @param cb
     * @param informationInfo
     * @return
     */
    private Predicate getPredicate(Root<InformationInfo> root, CriteriaBuilder cb, InformationInfo informationInfo) {
        List<Predicate> list = new ArrayList<>();

        if (StringUtils.isNotBlank(informationInfo.getTchUserName())) {
            list.add(cb.equal(root.get("tchUserName").as(String.class), informationInfo.getTchUserName()));
        }

        Predicate[] p = new Predicate[list.size()];
        return cb.and(list.toArray(p));
    }
}
