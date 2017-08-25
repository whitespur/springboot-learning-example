package org.spring.springboot.domain;

import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Created by jinglong on 2017/8/25.
 */
@Document(indexName = SeekShopCityHangzhou.INDEX,type= SeekShopCityHangzhou.TYPE)
public class SeekShopCityHangzhou extends SeekShopCity {
    public static final String INDEX = "ptest_seek0_shop_hangzhou";
    public static final String TYPE = "ptest_seek0_shop_hangzhou";
}
