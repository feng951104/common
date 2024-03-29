package com.merchant.data.order;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * Description:
 *
 * @author wangyf
 * @date 2019/5/24
 */
@Data
@ToString
public class BaseOrder implements Serializable {

    private static final long serialVersionUID = -2052748313122998476L;

    /**
     * 订单号
     */
    private String orderUniqueId;
    /**
     * 订单流水号
     */
    private String orderNumber;

    /**
     * 创建时间
     */
    private Date createOrderTime;

    /**
     * 修改订单时间
     */
    private Date updateOrderTime;

    /**
     * 订单状态
     * {@link com.merchant.order.constant.order}
     */
    private String orderStatus;

    /**
     * 订单来源类型   mmal 商城
     * {@link com.merchant.order.constant.order}
     */
    private String platform;

    /**
     * 收获地址
     */
    private String rewardAddress;

    /**
     * 收货人姓名
     */
    private String rewardName;

    /**
     * 收货人电话
     */
    private String rewardPhone;

    /**
     * 原总价
     */
    private Double originalTotalPrice;

    /**
     * 实付总价
     */
    private Double currentTotalPrice;
}
