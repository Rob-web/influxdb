package com.luo.service.impl;

import com.luo.entity.DateSelect;
import com.luo.entity.RealData;
import com.luo.mapper.DateSelectMapper;
import com.luo.mapper.RealDataMapper;
import com.luo.service.DateSelectService;
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
 * @since 2021-01-03
 */
@Service
public class DateSelectServiceImpl extends ServiceImpl<DateSelectMapper, DateSelect> implements DateSelectService {
    @Autowired
    DateSelectMapper dateSelectMapper;

    public List<DateSelect> getlist(){
        return dateSelectMapper.list();
    }

}
