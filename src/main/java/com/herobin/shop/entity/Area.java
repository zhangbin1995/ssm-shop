package com.herobin.shop.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author binzhang
 * @date 2019-11-21
 */
@Data
public class Area {
    // ID
    private Integer areaId;
    // 名称
    private String areaName;
    // 权重
    private Integer priority;
    // 创建时间
    private Date createTime;
    // 修改时间
    private Date lastEditTime;
}
