package org.spring.springboot.domain;

import org.elasticsearch.common.inject.name.Named;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import javax.persistence.Column;
import java.io.Serializable;

/**
 * 城市实体类
 * <p>
 * Created by bysocket on 03/05/2017.
 */
@Document(indexName = "province", type = "city")
public class City implements Serializable {

    private static final long serialVersionUID = -1L;


    /**
     * 城市编号
     */
    private Long id;

    /**
     * 城市名称
     */
    @Field(type = FieldType.String)
    @Column(name = "name")
    private String Name;

    /**
     * 描述
     */
    private String description;

    /**
     * 城市评分
     */
    private Integer score;

    @Field(type = FieldType.String)
    @Column(name = "city_area")
    @Named("city_area")
    private String cityArea;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

//    public String getCityArea() {
//        return cityArea;
//    }
//
//    public void setCityArea(String cityArea) {
//        this.cityArea = cityArea;
//    }

    public String getcity_area() {
        return cityArea;
    }

    public void setcity_area(String city_area) {
        this.cityArea = city_area;
    }
}
