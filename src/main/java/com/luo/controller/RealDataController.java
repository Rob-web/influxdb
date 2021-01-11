package com.luo.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.luo.constants.PageResult;
import com.luo.constants.Result;
import com.luo.entity.RealData;
import com.luo.mapper.RealDataMapper;
import com.luo.service.RealDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author luo
 * @since 2020-12-30
 */
@RestController
@RequestMapping("/realdata")
public class RealDataController  extends BaseController{

    @Autowired
    RealDataService realDataService;

    @GetMapping("list")
    @ResponseBody
    public List<RealData> getrealdatalist(){
        return realDataService.getlist();
    }





}

