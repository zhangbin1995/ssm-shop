package com.herobin.shop.entity;

import lombok.Data;

import java.util.Date;

@Data
public class WechatAuth {
	private Long wechatAuthId;
	private Long userId;
	private String openId;
	private Date createTime;
	private PersonInfo personInfo;
}
