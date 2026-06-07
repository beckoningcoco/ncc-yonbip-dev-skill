---
title: "日期区间选择 DateRangePicker"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/01-daterangepicker"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 日期区间选择 DateRangePicker

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/01-daterangepicker | 所属：移动组件

# [](#日期区间选择-daterangepicker)日期区间选择 DateRangePicker

## [](#1-效果展示)1. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/DateRangePickerririqujianxuanze-image1.5d89795b.jpeg)

## [](#2-标准属性)2. 标准属性

||名称||含义||说明|
||名称||含义||说明|
||disabled||禁用|||
||cFormatData||format格式化||如：yyyy-MM-dd|

## [](#3-扩展属性cextprops)3. 扩展属性cExtProps

||名称||含义||说明|
||名称||含义||说明|
||bListEdit||是否在概要区编辑||配置为true，可编辑|
||relatedItem||关联字段||关联字段的cName，如A后面显示B，此处配置B的cName|

## [](#4-配置方式)4. 配置方式

如存在字段A，字段B，要在A字段后面显示B字段。

此时需要配置A字段的cExtProps为{"bListEdit":true,
"relatedItem":"B"}

配置B字段bShowIt为false