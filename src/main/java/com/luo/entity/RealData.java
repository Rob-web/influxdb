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
 * @since 2020-12-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_real_data")
public class RealData implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "DATA_ID", type = IdType.AUTO)
    private String dataId;

    @TableField("TARGET_CODE")
    private String targetCode;

    @TableField("COLLECT_VALUE")
    private BigDecimal collectValue;

    @TableField("COLLECT_TIME")
    private String collectTime;


}
