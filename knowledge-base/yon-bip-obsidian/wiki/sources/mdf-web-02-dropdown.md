---
title: "下拉菜单 Dropdown"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/02-dropdown"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 下拉菜单 Dropdown

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/02-dropdown | 所属：Web组件

# [](#下拉菜单-dropdown)下拉菜单 Dropdown

## [](#1-功能说明)1. 功能说明

通过鼠标点击或键盘输入内容，是最基础的表单域组件。

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Dropdownxialacaidan_image1.209a8de1.png)

## [](#3-基本属性)3. 基本属性

**在单据中**

||属性名称||属性含义||值类型||属性说明|
||bHidden||是否隐藏||boolean||true-隐藏 false -显示|
||dataSource||下拉数据源||object||下拉选项数据的属性与文本|
||valueField||下拉选项key值||||下拉选项中的属性|
||textField||下拉选项文本||string||显示在下拉选项中的文本|
||iStyle||是否显示icon或者value||number||0-全部 1-value 2-icon|
||className||扩展class类名||string||用来处理扩展样式|
||disabled||禁用（置灰）||boolean||true-置灰 ，false - 正常|

**注意：**

1、此处的属性对应billitem_base表中的字段，值类型为前端类型，可能与数据库中不匹配，如：前端的bIsNull是true/false，在数据库中是0/1
控制示例参考【SimpleModel 简单模型】