---
title: "--表格高度自适应"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-biaogegaoduzishiying"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# --表格高度自适应

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-biaogegaoduzishiying | 所属：Web组件

# [](#表格高度自适应)表格高度自适应

## [](#1-表格)1. 表格

- 列表页cStyle中属性fullHeight
- yya.getParams().disableFullHeight = true; // 禁用表格全屏
- 卡片页子表高度默认吸底显示

## [](#2-如何关闭卡片页子表高度吸底显示)2. 如何关闭卡片页子表高度吸底显示

// 配置单据级特性：disableSubTableFullHeight

例：{ disableSubTableFullHeight: { whitelist: ['st_purchaseorder'] } }

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/biaogegaoduzishiyingimg1.d1326bd5.png)

## [](#3-表格配置cstyle)3. 表格配置cStyle

// 表格的cStyle可以配置开启子表吸底，优先级比特性高

cStyle: {subTableFullHeight: true}

## [](#4-问题排查)4. 问题排查

### [](#41-查看是否配置了关闭子表吸底的特性)4.1. 查看是否配置了关闭子表吸底的特性

- 获取domainkey：yya.getDomainKey()

- 

获取billNo：yya.getParams().billNo

- 

判断是否开启了特性：cb.extend.features[yya.getDomainKey()].disableSubTableFullHeight.whitelist

### [](#42-查看是否配置了cstyle)4.2. 查看是否配置了cStyle

- 

yya.get('viewmeta')，可以查看当前页面的meta，查看表格的cStyle是否配了subTableFullHeight属性

- 

卡片页表格是否配在了groupcontainer容器里边，这种场景暂时是不兼容的。

- 

表格不要配在group容器里，可以配置div容器里