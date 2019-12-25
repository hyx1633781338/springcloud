package com.zking.eurekaprovider.mapper;

import com.zking.eurekaprovider.model.Hyx;

public interface HyxMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hyx record);

    int insertSelective(Hyx record);

    Hyx selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hyx record);

    int updateByPrimaryKey(Hyx record);
}