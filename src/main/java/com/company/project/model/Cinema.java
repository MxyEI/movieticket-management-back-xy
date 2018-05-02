package com.company.project.model;

import javax.persistence.*;

public class Cinema {
    @Id
    @Column(name = "cinema_id")
    private Integer cinemaId;

    /**
     * 影院名
     */
    @Column(name = "cinema_name")
    private String cinemaName;

    /**
     * 影院地址
     */
    @Column(name = "cinema_addr")
    private String cinemaAddr;

    /**
     * @return cinema_id
     */
    public Integer getCinemaId() {
        return cinemaId;
    }

    /**
     * @param cinemaId
     */
    public void setCinemaId(Integer cinemaId) {
        this.cinemaId = cinemaId;
    }

    /**
     * 获取影院名
     *
     * @return cinema_name - 影院名
     */
    public String getCinemaName() {
        return cinemaName;
    }

    /**
     * 设置影院名
     *
     * @param cinemaName 影院名
     */
    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    /**
     * 获取影院地址
     *
     * @return cinema_addr - 影院地址
     */
    public String getCinemaAddr() {
        return cinemaAddr;
    }

    /**
     * 设置影院地址
     *
     * @param cinemaAddr 影院地址
     */
    public void setCinemaAddr(String cinemaAddr) {
        this.cinemaAddr = cinemaAddr;
    }
}