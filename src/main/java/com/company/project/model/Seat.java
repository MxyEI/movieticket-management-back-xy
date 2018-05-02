package com.company.project.model;

import javax.persistence.*;

public class Seat {
    @Id
    @Column(name = "seat_id")
    private Integer seatId;

    @Column(name = "ticket_id")
    private Integer ticketId;

    @Column(name = "movie_on_show_id")
    private Integer movieOnShowId;

    /**
     * 座位行号
     */
    private Integer row;

    /**
     * 座位列号
     */
    private Integer col;

    /**
     * 座位是否可用（1代表未售出）
     */
    private Boolean available;

    /**
     * @return seat_id
     */
    public Integer getSeatId() {
        return seatId;
    }

    /**
     * @param seatId
     */
    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    /**
     * @return ticket_id
     */
    public Integer getTicketId() {
        return ticketId;
    }

    /**
     * @param ticketId
     */
    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

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
     * 获取座位行号
     *
     * @return row - 座位行号
     */
    public Integer getRow() {
        return row;
    }

    /**
     * 设置座位行号
     *
     * @param row 座位行号
     */
    public void setRow(Integer row) {
        this.row = row;
    }

    /**
     * 获取座位列号
     *
     * @return col - 座位列号
     */
    public Integer getCol() {
        return col;
    }

    /**
     * 设置座位列号
     *
     * @param col 座位列号
     */
    public void setCol(Integer col) {
        this.col = col;
    }

    /**
     * 获取座位是否可用（1代表未售出）
     *
     * @return available - 座位是否可用（1代表未售出）
     */
    public Boolean getAvailable() {
        return available;
    }

    /**
     * 设置座位是否可用（1代表未售出）
     *
     * @param available 座位是否可用（1代表未售出）
     */
    public void setAvailable(Boolean available) {
        this.available = available;
    }
}