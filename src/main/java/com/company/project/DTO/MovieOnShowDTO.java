package com.company.project.DTO;

import com.company.project.model.Cinema;
import com.company.project.model.Cinemahall;
import com.company.project.model.Movie;
import com.company.project.model.Movieonshow;

import java.io.Serializable;

public class MovieOnShowDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    public Movieonshow getMovieonshow() {
        return movieonshow;
    }

    public void setMovieonshow(Movieonshow movieonshow) {
        this.movieonshow = movieonshow;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public Cinemahall getCinemahall() {
        return cinemahall;
    }

    public void setCinemahall(Cinemahall cinemahall) {
        this.cinemahall = cinemahall;
    }

    private Movieonshow movieonshow;
    private Movie movie;
    private Cinema cinema;
    private Cinemahall cinemahall;
}
