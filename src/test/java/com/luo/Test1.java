package com.luo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.luo.cofig.InfluxDbConnection;
import com.luo.entity.RealData;
import com.luo.service.RealDataService;
import org.influxdb.dto.QueryResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test1 {
    //需要使用的地方直接注入
    @Autowired
    InfluxDbConnection influxDBConnection;

    @Autowired
    RealDataService realDataService;

    @Test
    public void contextLoads() {

        System.out.println("Test Start");
    }


    @Test
    public void testInsert() {

        List<RealData> listRecords = realDataService.getlist();

        //准备好放入influxdb中的tag和field
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();

        influxDBConnection.enableBatch();
        for (int i = 0; i <listRecords.size() ; i++) {
            Map<String, String> tagsMap = new HashMap<>();
            Map<String, Object> fieldsMap = new HashMap<>();
            tagsMap.put("data_id", listRecords.get(i).getDataId());
            tagsMap.put("target_code", listRecords.get(i).getTargetCode());
            tagsMap.put("collect_time", listRecords.get(i).getCollectTime());
            fieldsMap.put("collect_value",listRecords.get(i).getCollectValue());

            influxDBConnection.insert(listRecords.get(i).getTargetCode(), tagsMap, fieldsMap);

        influxDBConnection.disableBatch();
        System.out.println("cost:" + (end - start));
        }



    }
}
