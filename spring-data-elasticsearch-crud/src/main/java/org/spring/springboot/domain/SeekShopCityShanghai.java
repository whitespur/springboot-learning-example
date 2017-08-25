package org.spring.springboot.domain;

import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Created by jinglong on 2017/8/25.
 */
@Document(indexName = SeekShopCityShanghai.INDEX,type= SeekShopCityShanghai.TYPE)
public class SeekShopCityShanghai extends SeekShopCity {
    public static final String INDEX = "ptest_seek0_shop_shanghai";
    public static final String TYPE = "ptest_seek0_shop_shanghai";
}
