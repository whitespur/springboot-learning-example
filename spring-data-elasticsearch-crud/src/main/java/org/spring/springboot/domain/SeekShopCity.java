package org.spring.springboot.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.*;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jinglong on 2017/8/24.
 */
@Document(indexName = SeekShopCity.INDEX,type= SeekShopCity.TYPE)
public class SeekShopCity implements Serializable {
    public static final String INDEX = "ptest_seek0_shop_hangzhou";
    public static final String TYPE = "ptest_seek0_shop_hangzhou";

    public SeekShopCity() {
    }

    @Id
    private String shopId;
    private String shopName;
    @Field(type = FieldType.String,index= FieldIndex.not_analyzed)
    private String shopNameN;
    private String shopUrl;
    private String shopImgUrl;
    private String shopBusinessCenter;
    private String shopAddress;
    private String shopPhone;
    @Field(type = FieldType.String)
    private String shopOpenHours;
    @GeoPointField
    private String shopPosition;
//    private String shopDistance;
    private String shopPowerCount;
    private String shopReviewCount;
    private String shopAvgPrice;
    private String shopCouponCount;
    private String shopSource;
    private Integer level1Code;
    @Field(type = FieldType.String,index= FieldIndex.not_analyzed)
    private String createTimeStr;
    @Field(type = FieldType.String,index= FieldIndex.not_analyzed)
    private String modifyTimeStr;
    private Integer status;

    @Field(type = FieldType.Nested)
    private List<CouponSummary> couponList;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopNameN() {
        return shopNameN;
    }

    public void setShopNameN(String shopNameN) {
        this.shopNameN = shopNameN;
    }

    public String getShopUrl() {
        return shopUrl;
    }

    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl;
    }

    public String getShopImgUrl() {
        return shopImgUrl;
    }

    public void setShopImgUrl(String shopImgUrl) {
        this.shopImgUrl = shopImgUrl;
    }

    public String getShopBusinessCenter() {
        return shopBusinessCenter;
    }

    public void setShopBusinessCenter(String shopBusinessCenter) {
        this.shopBusinessCenter = shopBusinessCenter;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getShopPhone() {
        return shopPhone;
    }

    public void setShopPhone(String shopPhone) {
        this.shopPhone = shopPhone;
    }

    public String getShopOpenHours() {
        return shopOpenHours;
    }

    public void setShopOpenHours(String shopOpenHours) {
        this.shopOpenHours = shopOpenHours;
    }

//    public String getShopDistance() {
//        return shopDistance;
//    }
//
//    public void setShopDistance(String shopDistance) {
//        this.shopDistance = shopDistance;
//    }


    public String getShopPosition() {
        return shopPosition;
    }

    public void setShopPosition(String shopPosition) {
        this.shopPosition = shopPosition;
    }

    public String getShopPowerCount() {
        return shopPowerCount;
    }

    public void setShopPowerCount(String shopPowerCount) {
        this.shopPowerCount = shopPowerCount;
    }

    public String getShopReviewCount() {
        return shopReviewCount;
    }

    public void setShopReviewCount(String shopReviewCount) {
        this.shopReviewCount = shopReviewCount;
    }

    public String getShopAvgPrice() {
        return shopAvgPrice;
    }

    public void setShopAvgPrice(String shopAvgPrice) {
        this.shopAvgPrice = shopAvgPrice;
    }

    public String getShopCouponCount() {
        return shopCouponCount;
    }

    public void setShopCouponCount(String shopCouponCount) {
        this.shopCouponCount = shopCouponCount;
    }

    public String getShopSource() {
        return shopSource;
    }

    public void setShopSource(String shopSource) {
        this.shopSource = shopSource;
    }

    public Integer getLevel1Code() {
        return level1Code;
    }

    public void setLevel1Code(Integer level1Code) {
        this.level1Code = level1Code;
    }

    public String getCreateTimeStr() {
        return createTimeStr;
    }

    public void setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
    }

    public String getModifyTimeStr() {
        return modifyTimeStr;
    }

    public void setModifyTimeStr(String modifyTimeStr) {
        this.modifyTimeStr = modifyTimeStr;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<CouponSummary> getCouponList() {
        return couponList;
    }

    public void setCouponList(List<CouponSummary> couponList) {
        this.couponList = couponList;
    }

    public static class CouponSummary implements Serializable{
        private String uniqueCouponId;
        private String couponName;
        private String couponNameN;
        private Integer couponSource;
        private Integer status;

        public CouponSummary() {
        }

        public CouponSummary(String uniqueCouponId, String couponName, String couponNameN, Integer couponSource, Integer status) {
            this.uniqueCouponId = uniqueCouponId;
            this.couponName = couponName;
            this.couponNameN = couponNameN;
            this.couponSource = couponSource;
            this.status = status;
        }

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


}
