package com.example.springboot2mybatis.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ethan
 * @since 2019-09-22
 */
@Data
@ToString
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_stockinfo")
public class Stockinfo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    //@TableField( value = "stock_code"),属性与数据库字段的映射，注意驼峰命名规则
    private String stockCode;

    private String stockName;

    private String stockDate;

    private String qpPrice;

    private String openPrice;

    private String topPrice;

    private String lowPrice;

    private String receivePrice;

    private String dealCount;

    private String dealPrice;

    private String upDownPrice;

    private String upDownRate;

    private String averagePrice;

    private String handRate;

    private String aStockPrice;

    private String bStockPrice;

    private String totalPrice;

    private String aStockCount;

    private String bStockCount;

    private String totalStockCount;

    private String syRate;

    private String sjRate;

    private String sxRate;

    private String sxlRate;

    //排除该属性与表字段的映射,transient
    //private transient String remark;

    //排除该数据与表字段的映射，static
    //private static String remark;

    //排除该数据与表字段的映射,TableField
    @TableField(exist = false)
    private String remark;
}
