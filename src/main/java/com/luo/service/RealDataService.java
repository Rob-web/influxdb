package com.luo.service;

import com.luo.entity.RealData;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author luo
 * @since 2020-12-30
 */
public interface RealDataService extends IService<RealData> {

    List<RealData> getlist();
}
