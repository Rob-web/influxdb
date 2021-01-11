package com.luo.mapper;

import com.luo.entity.RealData;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author luo
 * @since 2020-12-30
 */
public interface RealDataMapper extends BaseMapper<RealData> {

    //具体的select语句在对应的mapper.xml文件中
    List<RealData> list();
}
