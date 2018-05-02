package com.company.project.model;

import javax.persistence.*;

public class User {
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 手机号
     */
    @Column(name = "phone_num")
    private String phoneNum;

    /**
     * 密码（哈希值）
     */
    private String password;

    /**
     * 剩余购票次数
     */
    @Column(name = "remain_purchase")
    private Integer remainPurchase;

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
     * 获取手机号
     *
     * @return phone_num - 手机号
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * 设置手机号
     *
     * @param phoneNum 手机号
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * 获取密码（哈希值）
     *
     * @return password - 密码（哈希值）
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码（哈希值）
     *
     * @param password 密码（哈希值）
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取剩余购票次数
     *
     * @return remain_purchase - 剩余购票次数
     */
    public Integer getRemainPurchase() {
        return remainPurchase;
    }

    /**
     * 设置剩余购票次数
     *
     * @param remainPurchase 剩余购票次数
     */
    public void setRemainPurchase(Integer remainPurchase) {
        this.remainPurchase = remainPurchase;
    }
}