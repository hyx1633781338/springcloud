package com.zking.eurekaprovider.mapper;


import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

public class BaseMode implements Serializable {


    @JsonIgnore
    private Integer pageNum;
    @JsonIgnore
    private Integer pageSize;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    public BaseMode(Integer pageNum, Integer pageSize) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

    public BaseMode() {
    }
}
