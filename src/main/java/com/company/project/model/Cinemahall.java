package com.company.project.model;

import javax.persistence.*;

public class Cinemahall {
    @Id
    @Column(name = "cinema_hall_id")
    private Integer cinemaHallId;

    @Column(name = "cinema_id")
    private Integer cinemaId;

    /**
     * 影厅名
     */
    @Column(name = "hall_name")
    private String hallName;

    /**
     * 表示座位分布的01串
     */
    @Column(name = "seat_layout")
    private String seatLayout;

    /**
     * @return cinema_hall_id
     */
    public Integer getCinemaHallId() {
        return cinemaHallId;
    }

    /**
     * @param cinemaHallId
     */
    public void setCinemaHallId(Integer cinemaHallId) {
        this.cinemaHallId = cinemaHallId;
    }

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
     * 获取影厅名
     *
     * @return hall_name - 影厅名
     */
    public String getHallName() {
        return hallName;
    }

    /**
     * 设置影厅名
     *
     * @param hallName 影厅名
     */
    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    /**
     * 获取表示座位分布的01串
     *
     * @return seat_layout - 表示座位分布的01串
     */
    public String getSeatLayout() {
        return seatLayout;
    }

    /**
     * 设置表示座位分布的01串
     *
     * @param seatLayout 表示座位分布的01串
     */
    public void setSeatLayout(String seatLayout) {
        this.seatLayout = seatLayout;
    }
}