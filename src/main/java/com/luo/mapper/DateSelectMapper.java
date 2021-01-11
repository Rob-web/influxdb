package com.luo.mapper;

import com.luo.entity.DateSelect;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.luo.entity.RealData;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author luo
 * @since 2021-01-03
 */
public interface DateSelectMapper extends BaseMapper<DateSelect> {
    //具体的select语句在对应的mapper.xml文件中
    List<DateSelect> list();

}
