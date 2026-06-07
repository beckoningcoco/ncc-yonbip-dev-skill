---
title: "搜索框 SearchBox"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/01-searchbox"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 搜索框 SearchBox

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/01-searchbox | 所属：移动组件

# [](#搜索框-searchbox)搜索框 SearchBox

## [](#1-效果展示)1. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/SearchBoxsousuokuang-image1.8447cf67.png)

## [](#2-标准属性)2. 标准属性

||名称||含义||说明|
||名称||含义||说明|
||supportMtlScan||支持扫一扫功能||默认不支持|
||placeholder||占位符|||

## [](#3-扩展属性)3. 扩展属性

卡片区在cStyle中配置属性，过滤区在extendField中配置属性，例：{"show":
true}

## [](#4-控制示例)4. 控制示例

扩展js控制 获取组件模型 操作其属性

查询区示例：

**扫码框显示隐藏**

// supportMtlScan true 显示 false 隐藏

const FilterViewModel = viewmodel.getCache('FilterViewModel');

const scanModel = FilterViewModel.get('searchbox').getFromModel();

scanModel.setState('supportMtlScan', true);

## [](#5-搜索事件)5. 搜索事件

配合查询区使用时 有默认事件 走框架默认search

单独使用时 监听 searchBoxSubmit

model.on('searchBoxSubmit', ({ vaue }) => {

 // 自定义逻辑

})