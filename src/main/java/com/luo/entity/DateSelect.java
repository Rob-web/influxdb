package com.luo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author luo
 * @since 2021-01-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_date_select")
public class DateSelect implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增ID
     */
    private Long id;

    private Long ei;

    /**
     * 日期
     */
    private String day;

    /**
     * 开盘价
     */
    @TableField("openPrice")
    private BigDecimal openPrice;

    /**
     * 收盘价
     */
    @TableField("closePrice")
    private BigDecimal closePrice;

    /**
     * 最低价
     */
    @TableField("lowPrice")
    private BigDecimal lowPrice;

    /**
     * 最高价
     */
    @TableField("higPrice")
    private BigDecimal higPrice;


}
