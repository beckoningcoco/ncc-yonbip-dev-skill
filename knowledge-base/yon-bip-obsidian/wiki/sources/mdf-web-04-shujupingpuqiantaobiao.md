---
title: "--数据平铺嵌套表"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-shujupingpuqiantaobiao"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# --数据平铺嵌套表

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-shujupingpuqiantaobiao | 所属：Web组件

# [](#数据平铺嵌套表)数据平铺嵌套表

## [](#1-嵌套表数据平铺模式只有一个表格模型展现形式类似树表)1. 嵌套表数据平铺模式，只有一个表格模型，展现形式类似树表

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shujupingpuqiantaobiaoimg1.0e70d6b3.png)

## [](#2-实现方式)2. 实现方式

表格cExtProps里配置suiteflattable:''
指明分组字段，分组字段值相同的行数据认为是一组数据，要求同一组数据相邻，并且同一组中的第一行数据是父，父包含同一组的其他数据，这种情况下不支持表格排序功能

## [](#3-配置suiteflattableparent属性)3. 配置suiteflattableparent属性

suiteflattableparent：指明字段和值，用于区分同一组数据哪一行数据是父，配置了suiteflattableparent属性表格支持排序功能

suiteflattableparent:[

 * {

 * cItemName: 'code',

 * value: '001' 或 ['001', '002'] 或 参数对象

 * },

 * {

 * cItemName: 'code1',

 * value: '001' 或 ['001', '002'] 或 参数对象

 * }

 * ]

## [](#4-扩展代码实现)4. 扩展代码实现

// 在init里：

gridModel.setState('suiteflattable', 'xxx');

gridModel.setState('suiteflattableparent', [{"cItemName":"xxx","value":null}]);