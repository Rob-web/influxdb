package com.luo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.luo.entity.RealData;
import com.luo.service.RealDataService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootInfluxdbApplicationTests {

    @Autowired
    RealDataService realDataService;

    @Test
    void contextLoads() {

//        //根据pageNo和pageSize建立一个列表list
//        IPage<RealData> list=realDataService.page(new Page<>(1,1000),null);
//        //将对应的信息放入这个list中
//        List<RealData> listRecords=list.getRecords();
//
//        System.out.println(listRecords.get(0).getDataId());


        List<RealData> list1=realDataService.list();
        for (int i = 0; i <100 ; i++) {
            System.out.println(list1.get(i));
        }


    }

}
