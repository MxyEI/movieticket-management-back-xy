package com.company.project.model;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Movieonshow {
    @Id
    @Column(name = "movie_on_show_id")
    private Integer movieOnShowId;

    @Column(name = "cinema_hall_id")
    private Integer cinemaHallId;

    @Column(name = "movie_id")
    private Integer movieId;

    /**
     * 放映日期
     */
    @Column(name = "show_date")
    @JSONField(format="yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date showDate;

    /**
     * 放映时间
     */
    @Column(name = "show_time")
    @JSONField(format="hh:mm")
    @DateTimeFormat(pattern = "hh:mm")
    private Date showTime;

    /**
     * 影片语言
     */
    private String lang;

    /**
     * 电影票单价
     */
    private BigDecimal price;

    /**
     * @return movie_on_show_id
     */
    public Integer getMovieOnShowId() {
        return movieOnShowId;
    }

    /**
     * @param movieOnShowId
     */
    public void setMovieOnShowId(Integer movieOnShowId) {
        this.movieOnShowId = movieOnShowId;
    }

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
     * @return movie_id
     */
    public Integer getMovieId() {
        return movieId;
    }

    /**
     * @param movieId
     */
    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    /**
     * 获取放映日期
     *
     * @return show_date - 放映日期
     */
    public Date getShowDate() {
        return showDate;
    }

    /**
     * 设置放映日期
     *
     * @param showDate 放映日期
     */
    public void setShowDate(Date showDate) {
        this.showDate = showDate;
    }

    /**
     * 获取放映时间
     *
     * @return show_time - 放映时间
     */
    public Date getShowTime() {
        return showTime;
    }

    /**
     * 设置放映时间
     *
     * @param showTime 放映时间
     */
    public void setShowTime(Date showTime) {
        this.showTime = showTime;
    }

    /**
     * 获取影片语言
     *
     * @return lang - 影片语言
     */
    public String getLang() {
        return lang;
    }

    /**
     * 设置影片语言
     *
     * @param lang 影片语言
     */
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * 获取电影票单价
     *
     * @return price - 电影票单价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置电影票单价
     *
     * @param price 电影票单价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}