package org.spring.springboot.controller;

import org.spring.springboot.domain.City;
import org.spring.springboot.domain.SeekShopCity;
import org.spring.springboot.service.CityService;
import org.spring.springboot.service.SeekShopCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jinglong on 2017/8/25.
 */
@RestController
public class SeekShopCityController {
    @Autowired
    private SeekShopCityService cityService;

    @RequestMapping(value = "/api/shop", method = RequestMethod.POST)
    public String createShop(@RequestBody SeekShopCity city) {
        return cityService.saveSeekShopCity(city);
    }

    @RequestMapping(value = "/api/shop/and/findByShopName", method = RequestMethod.GET)
    public List<SeekShopCity> findByShopName(@RequestParam(value = "shopName") String shopName) {
        return cityService.findByShopName(shopName);
    }

//    @RequestMapping(value = "/api/shop/and/findByCouponName", method = RequestMethod.GET)
//    public List<SeekShopCity> findByCouponName(@RequestParam(value = "couponName") String couponName) {
//        return cityService.findByCouponName(couponName);
//    }
}
