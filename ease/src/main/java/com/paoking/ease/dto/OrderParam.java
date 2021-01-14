package com.paoking.ease.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * 生成订单时传入的参数
 * Created by zq.
 */
public class OrderParam {
    //收货地址id
    @ApiModelProperty(value = "收获地址Id")
    private Long memberReceiveAddressId;
    //优惠券id
    @ApiModelProperty(value = "优惠券id")
    private Long couponId;
    //使用的积分数
    @ApiModelProperty(value = "使用的积分数")
    private Integer useIntegration;
    //支付方式
    @ApiModelProperty(value = "支付方式")
    private Integer payType;

    public Long getMemberReceiveAddressId() {
        return memberReceiveAddressId;
    }

    public void setMemberReceiveAddressId(Long memberReceiveAddressId) {
        this.memberReceiveAddressId = memberReceiveAddressId;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getUseIntegration() {
        return useIntegration;
    }

    public void setUseIntegration(Integer useIntegration) {
        this.useIntegration = useIntegration;
    }
}
