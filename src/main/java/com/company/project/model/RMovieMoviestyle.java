package com.company.project.model;

import javax.persistence.*;

@Table(name = "R_Movie_MovieStyle")
public class RMovieMoviestyle {
    @Id
    @Column(name = "movie_id")
    private Integer movieId;

    @Column(name = "movie_style_id")
    private Integer movieStyleId;

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
}