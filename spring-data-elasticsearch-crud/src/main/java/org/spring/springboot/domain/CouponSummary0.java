package org.spring.springboot.domain;

import java.io.Serializable;

/**
 * Created by jinglong on 2017/8/24.
 */
public class CouponSummary0 implements Serializable{
    private String uniqueCouponId;
    private String couponName;
    private String couponNameN;
    private Integer couponSource;
    private Integer status;

    public String getUniqueCouponId() {
        return uniqueCouponId;
    }

    public void setUniqueCouponId(String uniqueCouponId) {
        this.uniqueCouponId = uniqueCouponId;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public String getCouponNameN() {
        return couponNameN;
    }

    public void setCouponNameN(String couponNameN) {
        this.couponNameN = couponNameN;
    }

    public Integer getCouponSource() {
        return couponSource;
    }

    public void setCouponSource(Integer couponSource) {
        this.couponSource = couponSource;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
