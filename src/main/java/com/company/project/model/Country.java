package com.company.project.model;

import javax.persistence.*;

public class Country {
    @Id
    @Column(name = "country_id")
    private Integer countryId;

    /**
     * 国家名
     */
    @Column(name = "country_name")
    private String countryName;

    /**
     * @return country_id
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * @param countryId
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     * 获取国家名
     *
     * @return country_name - 国家名
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * 设置国家名
     *
     * @param countryName 国家名
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}