package com.luo.controller;

import com.luo.constants.CodeEnum;
import com.luo.constants.PageResult;
import com.luo.constants.Result;

import java.util.List;

public abstract class BaseController<T> {

    public Result buildResult(List<T> listRecords, Integer pageNo, Integer pageSize, Integer total){
        PageResult pageResult=new PageResult();
        pageResult.setResult(listRecords);
        pageResult.setCurrentPage(pageNo);
        pageResult.setPageSize(pageSize);
        pageResult.setTotal(total);
        pageResult.setPageCount((total+pageSize-1)/pageSize);
        pageResult.setHasMore(true);
        Result result= new Result(CodeEnum.OK.getCode(),"success",pageResult);
        return result;
    }

}
