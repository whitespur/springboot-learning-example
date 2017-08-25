package org.spring.springboot.repository;

import org.spring.springboot.domain.City;
import org.spring.springboot.domain.SeekShopCity;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * Created by jinglong on 2017/8/25.
 */
public interface SeekShopCityRepository extends ElasticsearchRepository<SeekShopCity, String> {
    /**
     * @param shopName
     * @return
     */
    List<SeekShopCity> findByShopName(String shopName);

    /**
     * @param shopName
     * @return
     */
//    @Query({
//            "query": {
//            "bool": {
//            "must": [
//            {
//                    "nested": {
//            "path": "couponList",
//            "query": {
//            "bool": {
//            "must": [
//            {
//                    "match": {
//            "couponList.couponName": "牛肉"
//            }
//            }
//            ]
//            }
//            }
//            }
//            }
//            ]
//            }
//            }
//            })
//    List<SeekShopCity> findByCouponName(String shopName);


}
