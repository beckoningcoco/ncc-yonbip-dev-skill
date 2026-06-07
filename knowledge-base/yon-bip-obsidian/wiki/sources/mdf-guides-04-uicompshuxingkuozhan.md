---
title: "UI组件属性扩展"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/04-uicompshuxingkuozhan"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# UI组件属性扩展

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/04-uicompshuxingkuozhan | 所属：指南

# [](#ui组件属性扩展)UI组件属性扩展

## [](#1-ui组件属性扩展)1. UI组件属性扩展

可以通过在cStyle属性增加新的属性来实现UI组件属性级扩展。框架自身的组件也可以扩展属性，此种扩展有一定限制，扩展的前提是基础组件支持此属性。

### [](#11-1-ui元数据配置)1.1. 1 UI元数据配置

以InputNumber为例

方法一：在设计器的属性栏配置样式及扩展属性的值为{"placeholder":"采购单位换算率"}，如下：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/UIzujianshuxingkuozhan_image1.31e5d6a5.png)

方法二：在excel中配置billitem_base的cStyle属性为{"placeholder":"采购单位换算率"}

### [](#12-2-组件处理逻辑)1.2. 2 组件处理逻辑

组件从cStyle中获取placeholder的配置更新到state上。

// inputnumber.jsx代码片段

constructor(props) {

 ......

 if (cStyle) {try {config = JSON.parse(cStyle); } catch (e) {} }

 this.state = Object.assign({

 ......

 placeholder:props.placeholder,

 ......

 }, config);

}