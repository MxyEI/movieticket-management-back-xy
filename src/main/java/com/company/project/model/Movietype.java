package com.company.project.model;

import javax.persistence.*;

public class Movietype {
    @Id
    @Column(name = "movie_type_id")
    private Integer movieTypeId;

    /**
     * 电影类型名（”2D“、”3D“等）
     */
    @Column(name = "type_name")
    private String typeName;

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
     * 获取电影类型名（”2D“、”3D“等）
     *
     * @return type_name - 电影类型名（”2D“、”3D“等）
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 设置电影类型名（”2D“、”3D“等）
     *
     * @param typeName 电影类型名（”2D“、”3D“等）
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}