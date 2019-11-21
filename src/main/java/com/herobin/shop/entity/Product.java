package com.herobin.shop.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
@Data
public class Product implements Serializable{

	private Long productId;
	private String productName;
	private String productDesc;
	private String imgAddr;// 简略图
	private String normalPrice; // 原价
	private String promotionPrice;// 折扣价
	private Integer priority;// 权重
	private Date createTime;
	private Date lastEditTime;
	// -1.不可用 0.下架 1.上架
	private Integer enableStatus;

	private List<ProductImg> productImgList;
	private ProductCategory productCategory;
	private Shop shop;
}
