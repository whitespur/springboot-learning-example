package org.spring.springboot.service;

import org.spring.springboot.domain.City;
import org.spring.springboot.domain.SeekShopCity;

import java.util.List;

/**
 * Created by jinglong on 2017/8/25.
 */
public interface SeekShopCityService {
    /**
     * @param city
     * @return
     */
    String saveSeekShopCity(SeekShopCity city);

    /**
     * @param shopName
     * @return
     */
    List<SeekShopCity> findByShopName(String shopName);
    /**
     * @param shopName
     * @return
     */
//    List<SeekShopCity> findByCouponName(String shopName);
}
