package com.luo.constants;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PageResult<T> implements Serializable {

    private Integer total; //总记录数
    private Integer pageCount; //页数
    private Integer currentPage; //当前页
    private Integer pageSize; //每页记录数
    private List<T> result; //列表数据
    private Boolean hasMore; //是否还有更多


}