package com.company.project.model;

import javax.persistence.*;

public class Moviestatus {
    @Id
    @Column(name = "movie_status_id")
    private Integer movieStatusId;

    /**
     * 电影状态名（“正在上映”、”即将上映“等）
     */
    @Column(name = "status_name")
    private String statusName;

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
     * 获取电影状态名（“正在上映”、”即将上映“等）
     *
     * @return status_name - 电影状态名（“正在上映”、”即将上映“等）
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * 设置电影状态名（“正在上映”、”即将上映“等）
     *
     * @param statusName 电影状态名（“正在上映”、”即将上映“等）
     */
    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}