package com.company.project.model;

import javax.persistence.*;

public class Ticket {
    @Id
    @Column(name = "ticket_id")
    private Integer ticketId;

    @Column(name = "user_id")
    private Integer userId;

    /**
     * 电影票是否被取出(1代表未取出)
     */
    private Boolean valid;

    /**
     * 取票码
     */
    private String code;

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
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取电影票是否被取出(1代表未取出)
     *
     * @return valid - 电影票是否被取出(1代表未取出)
     */
    public Boolean getValid() {
        return valid;
    }

    /**
     * 设置电影票是否被取出(1代表未取出)
     *
     * @param valid 电影票是否被取出(1代表未取出)
     */
    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    /**
     * 获取取票码
     *
     * @return code - 取票码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置取票码
     *
     * @param code 取票码
     */
    public void setCode(String code) {
        this.code = code;
    }
}