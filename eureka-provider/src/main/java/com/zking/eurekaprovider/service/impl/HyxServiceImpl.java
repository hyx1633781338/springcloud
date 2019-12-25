package com.zking.eurekaprovider.service.impl;

import com.zking.eurekaprovider.mapper.HyxMapper;
import com.zking.eurekaprovider.model.Hyx;
import com.zking.eurekaprovider.service.IHyxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HyxServiceImpl implements IHyxService {
    @Autowired
    private HyxMapper hyxMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Hyx record) {
        return 0;
    }

    @Override
    public int insertSelective(Hyx record) {
        return 0;
    }

    @Override
    public Hyx selectByPrimaryKey(Integer id) {
        return hyxMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Hyx record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Hyx record) {
        return 0;
    }
}
