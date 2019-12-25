package com.zking.eurekaprovider.service;

import com.zking.eurekaprovider.model.Hyx;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IHyxService {
    int deleteByPrimaryKey(Integer id);

    int insert(Hyx record);

    int insertSelective(Hyx record);

    @Transactional(readOnly = true)
    Hyx selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hyx record);

    int updateByPrimaryKey(Hyx record);
}
