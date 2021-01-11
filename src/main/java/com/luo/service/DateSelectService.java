package com.luo.service;

import com.luo.entity.DateSelect;
import com.baomidou.mybatisplus.extension.service.IService;
import com.luo.entity.RealData;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author luo
 * @since 2021-01-03
 */
public interface DateSelectService extends IService<DateSelect> {
    List<DateSelect> getlist();

}
