package com.herobin.shop.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author binzhang
 * @date 2019-11-21
 */
@Data
public class PersonInfo {
    private Long userId;
    private String name;
    private String profileImg;
    private String email;
    private String gender;
    // 0.禁止使用 1.允许使用
    private Integer enableStatus;
    // 1.顾客 2.店家 3.超级管理员
    private Integer userType;
    private Date createTime;
    private Date lastEditTime;
}
