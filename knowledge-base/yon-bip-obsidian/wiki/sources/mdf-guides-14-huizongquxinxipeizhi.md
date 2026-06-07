---
title: "汇总区信息配置"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/14-huizongquxinxipeizhi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 汇总区信息配置

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/14-huizongquxinxipeizhi | 所属：指南

# [](#汇总区信息配置)汇总区信息配置

目前树形表暂不支持此功能

## [](#1-卡片页)1. 卡片页

### [](#11-功能说明)1.1. 功能说明

- 目前在一个单据中只支持配置展示一个子表或表格的汇总区信息

在卡片页页 支持展示 表格合计列的数据 （最多三项） 在列表页
支持展示表格小计列的数据（最多三项） 支持选中实时计算

### [](#12-配置方法)1.2. 配置方法

**方案一：通过模板配置**

- 

 在表格组件的cExtProps中配置bshowAggregatesInfo **= true
开启后默认选择 第一个表格的 前三个 合计或小计数据**

- 

在表格组件的cExtProps中配置showAggregatesInfoItems =
[**cItemName1,cItemName2,cItemName3**] 支持自定义选择要展示的列
并且必须指定 要展示的表格的标识 showAggregatesInfoTable =
[表格的meta.**cCode**]

// 示例配置

cExtProps: {"bshowAggregatesInfo": true, "showAggregatesInfoItems":

["cItemName1","cItemName2","cItemName3"]}

**方案二：通过扩展脚本设置**

// 示例代码

viewmodel.getParams().bshowAggregatesInfo = true; // 写到init中即可

viewmodel.getParams().showAggregatesInfoItems =

["cItemName1","cItemName2","cItemName3"];

### [](#13-展示效果)1.3. 展示效果

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/huizongquxinxipeizhi_image1.dca2fbfb.png)

## [](#2-列表页)2. 列表页

### [](#21-功能说明)2.1. 功能说明

列表页目前支持配置 某个指定的表格或者多个表格

### [](#22-配置方法)2.2. 配置方法

**方案一：通过模板配置**

- 

在 **单据** 的 viewmodel.getParams() 中 设置 showBillAggregates **=
true 开启后默认选择 所有有小计的当前单据的表格的前三列**

- 

在 单据 的 viewmodel.getParams() 中 设置 showBillAggregatesInfo 数组=[{tableNames:'st_purchaseorderlist',showItems:['amountPayable']}]
支持自定义选择要展示的列放在 showItems 数组中 并且必须指定
要展示的表格的标识 tableNames = [表格的meta.cCode]

// 示例配置

cExtProps: {"showBillAggregates": true, "showBillAggregatesInfo":

[{"tableNames":"st_purchaseorderlist","showItems":["amountPayable"]}]}

**方案二：通过扩展脚本设置**

// 示例代码

viewmodel.getParams().showBillAggregates = true; // 写到init中即可

viewmodel.getParams().showBillAggregatesInfo =

[{tableNames:'st_purchaseorderlist',showItems:['amountPayable']}];

### [](#23-展示效果)2.3. 展示效果

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/huizongquxinxipeizhi_image2.cdd347d8.png)