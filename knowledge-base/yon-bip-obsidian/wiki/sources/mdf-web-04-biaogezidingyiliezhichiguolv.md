---
title: "--表格行数据支持过滤"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-biaogezidingyiliezhichiguolv"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# --表格行数据支持过滤

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-biaogezidingyiliezhichiguolv | 所属：Web组件

# [](#表格行数据支持过滤)表格行数据支持过滤

表格组件中只显示部分数据。

## [](#1-配置)1. 配置

cStyle中配置

filterNames: '{"filterNames":[{"cItemName":"xxx","value":"xxx"},{"cItemName":"xxx","value":"xxx"}]}'

// 数据格式为：

{

 'filterNames': [

 { 

 cItemName: 'code',

 value: '001' 或 ['001', '002'] 或 参数对象

 }

 {

 cItemName: 'xxx',

 value: 'xxx'

 }

 ]

}

## [](#2-api调用)2. API调用

gridmodel.setFilterName(cItemName, value); // 单个字段过滤

gridmodel.setFilterNames(values); // 多个字段过滤，values参数格式：[{cItemName: 'xxx', value: 'xxx'},{cItemName:'xxx', value:xxx}]

gridmodel.setFilterNames(null); // 清空过滤条件

gridmodel.deleteFilterName(cItemName); // 清除某个过滤条件

注意：cItemName一定得是当前表格中的字段，并且后端返回的数据有此列