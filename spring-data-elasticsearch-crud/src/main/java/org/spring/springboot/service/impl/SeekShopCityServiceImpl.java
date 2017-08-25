package org.spring.springboot.service.impl;

import org.spring.springboot.domain.SeekShopCity;
import org.spring.springboot.repository.SeekShopCityRepository;
import org.spring.springboot.service.SeekShopCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jinglong on 2017/8/25.
 */
@Service
public class SeekShopCityServiceImpl implements SeekShopCityService {
    private static final Integer pageNumber = 0;
    private static final Integer pageSize = 10;
    Pageable pageable = new PageRequest(pageNumber, pageSize);
    @Autowired
    SeekShopCityRepository seekShopCityRepository;

    @Autowired
    ElasticsearchTemplate elasticsearchTemplate;

    @Override
    public String saveSeekShopCity(SeekShopCity city) {
        SeekShopCity seekShopCity = seekShopCityRepository.save(city);
        if(seekShopCity != null){
            return seekShopCity.getShopId();
        }else{
            return null;
        }
    }

    @Override
    public List<SeekShopCity> findByShopName(String shopName) {
        return seekShopCityRepository.findByShopName(shopName);
    }

//    @Override
//    public List<SeekShopCity> findByCouponName(String couponName) {
////        elasticsearchTemplate.
//        return seekShopCityRepository.findByCouponName(couponName);
//    }
}
