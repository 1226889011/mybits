package com.mybatis.demo.model;

import javax.persistence.*;

@Table(name = "`t_user`")
public class TUser {
    @Id
    @Column(name = "`user_id`")
    private Integer userId;

    @Column(name = "`user_name`")
    private String userName;

    @Column(name = "`user_password`")
    private String userPassword;

    @Column(name = "`phone`")
    private String phone;

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
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return user_password
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * @param userPassword
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}