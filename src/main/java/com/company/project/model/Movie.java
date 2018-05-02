package com.company.project.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Movie {
    @Id
    @Column(name = "movie_id")
    private Integer movieId;

    @Column(name = "movie_type_id")
    private Integer movieTypeId;

    @Column(name = "country_id")
    private Integer countryId;

    @Column(name = "movie_status_id")
    private Integer movieStatusId;

    /**
     * 首映日期
     */
    @Column(name = "pub_date")
    @JSONField(format="yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date pubDate;

    /**
     * 电影标题
     */
    private String title;

    /**
     * 电影评分
     */
    private BigDecimal rating;

    /**
     * 电影时长（分钟）
     */
    private Integer length;

    /**
     * 电影海报图片（小尺寸）URL
     */
    @Column(name = "poster_small")
    private String posterSmall;

    /**
     * 电影海报图片（大尺寸）URL
     */
    @Column(name = "poster_large")
    private String posterLarge;

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
     * @return movie_type_id
     */
    public Integer getMovieTypeId() {
        return movieTypeId;
    }

    /**
     * @param movieTypeId
     */
    public void setMovieTypeId(Integer movieTypeId) {
        this.movieTypeId = movieTypeId;
    }

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
     * @return movie_status_id
     */
    public Integer getMovieStatusId() {
        return movieStatusId;
    }

    /**
     * @param movieStatusId
     */
    public void setMovieStatusId(Integer movieStatusId) {
        this.movieStatusId = movieStatusId;
    }

    /**
     * 获取首映日期
     *
     * @return pub_date - 首映日期
     */
    public Date getPubDate() {
        return pubDate;
    }

    /**
     * 设置首映日期
     *
     * @param pubDate 首映日期
     */
    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    /**
     * 获取电影标题
     *
     * @return title - 电影标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置电影标题
     *
     * @param title 电影标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取电影评分
     *
     * @return rating - 电影评分
     */
    public BigDecimal getRating() {
        return rating;
    }

    /**
     * 设置电影评分
     *
     * @param rating 电影评分
     */
    public void setRating(BigDecimal rating) {
        this.rating = rating;
    }

    /**
     * 获取电影时长（分钟）
     *
     * @return length - 电影时长（分钟）
     */
    public Integer getLength() {
        return length;
    }

    /**
     * 设置电影时长（分钟）
     *
     * @param length 电影时长（分钟）
     */
    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * 获取电影海报图片（小尺寸）URL
     *
     * @return poster_small - 电影海报图片（小尺寸）URL
     */
    public String getPosterSmall() {
        return posterSmall;
    }

    /**
     * 设置电影海报图片（小尺寸）URL
     *
     * @param posterSmall 电影海报图片（小尺寸）URL
     */
    public void setPosterSmall(String posterSmall) {
        this.posterSmall = posterSmall;
    }

    /**
     * 获取电影海报图片（大尺寸）URL
     *
     * @return poster_large - 电影海报图片（大尺寸）URL
     */
    public String getPosterLarge() {
        return posterLarge;
    }

    /**
     * 设置电影海报图片（大尺寸）URL
     *
     * @param posterLarge 电影海报图片（大尺寸）URL
     */
    public void setPosterLarge(String posterLarge) {
        this.posterLarge = posterLarge;
    }
}