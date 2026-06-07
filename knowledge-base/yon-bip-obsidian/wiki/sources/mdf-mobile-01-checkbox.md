---
title: "复选框 Checkbox"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/01-checkbox"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 复选框 Checkbox

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/01-checkbox | 所属：移动组件

# [](#复选框-checkbox)复选框 Checkbox

## [](#1-效果展示)1. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Checkboxfuxuankuang-yidongduan-image1.8a3ec880.png)

## [](#2-标准属性)2. 标准属性

||名称||含义||说明|
||名称||含义||说明|
||bCanModify||是否可编辑|||
||readOnly||只读||true-非必输 false -必输|
||disabled||禁用|||
||bIsNull||是否必填|||
||cStyle||扩展属性|||

## [](#3-扩展属性-cextprops)3. 扩展属性-cExtProps

可通过在cExtProps中配置bListEdit=true控制字段是否在列表上编辑，目前仅支持Stepper和Checkbox

||名称||含义||说明|
||名称||含义||说明|
||bListEdit||是否在列表上编辑||cExtProps: {"bListEdit": true}|
||singleLine||标题和内容是否单行显示||cExtProps: {"singleLine": true}|
|||||||