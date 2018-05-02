package com.company.project.model;

import javax.persistence.*;

public class Moviestyle {
    @Id
    @Column(name = "movie_style_id")
    private Integer movieStyleId;

    /**
     * 电影风格名（”科幻“、”恐怖“等）
     */
    @Column(name = "style_name")
    private String styleName;

    /**
     * @return movie_style_id
     */
    public Integer getMovieStyleId() {
        return movieStyleId;
    }

    /**
     * @param movieStyleId
     */
    public void setMovieStyleId(Integer movieStyleId) {
        this.movieStyleId = movieStyleId;
    }

    /**
     * 获取电影风格名（”科幻“、”恐怖“等）
     *
     * @return style_name - 电影风格名（”科幻“、”恐怖“等）
     */
    public String getStyleName() {
        return styleName;
    }

    /**
     * 设置电影风格名（”科幻“、”恐怖“等）
     *
     * @param styleName 电影风格名（”科幻“、”恐怖“等）
     */
    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }
}