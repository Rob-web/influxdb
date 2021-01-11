package com.luo.service.impl;

import com.luo.entity.RealData;
import com.luo.mapper.RealDataMapper;
import com.luo.service.RealDataService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author luo
 * @since 2020-12-30
 */
@Service
public class RealDataServiceImpl extends ServiceImpl<RealDataMapper, RealData> implements RealDataService {

    @Autowired
    RealDataMapper realDataMapper;

    public List<RealData> getlist(){
        return realDataMapper.list();
    }

}
