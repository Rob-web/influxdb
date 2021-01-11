package com.luo.controller;


import com.luo.entity.DateSelect;
import com.luo.entity.RealData;
import com.luo.service.DateSelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author luo
 * @since 2021-01-03
 */
@RestController
@EnableScheduling
@RequestMapping("/dateselect")
public class DateSelectController {
    @Autowired
    DateSelectService dateSelectService;

    @Scheduled(cron = "*/10  * * * * ?")
    public void scheduler(){
        List<DateSelect> list= dateSelectService.getlist();
        System.out.println(list);
    }

    @GetMapping("list")
    @ResponseBody
    public List<DateSelect> getrealdatalist(){
        return dateSelectService.getlist();
    }


}

