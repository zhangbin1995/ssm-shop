package com.herobin.shop.entity;

import lombok.Data;

import java.util.Date;
@Data
public class LocalAuth {
	private Long localAuthId;
	// 用户名
	private String userName;
	// 密码
	private String password;
	private Long userId;
	private Date createTime;
	private Date lastEditTime;
	// 对应的用户
	private PersonInfo personInfo;
}
