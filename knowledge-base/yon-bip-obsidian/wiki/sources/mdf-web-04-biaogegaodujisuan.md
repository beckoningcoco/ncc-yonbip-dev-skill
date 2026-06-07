---
title: "--表格高度计算"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-biaogegaodujisuan"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# --表格高度计算

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-biaogegaodujisuan | 所属：Web组件

# [](#表格高度计算)表格高度计算

## [](#1-列表页表格高度)1. 列表页表格高度

列表页表格默认全屏(吸底)显示，可通过属性disableFullHeight禁用表格全屏属性；

### [](#11-表格高度通用逻辑)1.1. 表格高度通用逻辑

页面高度 - footer组件的高度 - card组件的高度 -
groupContainer组件的高度 - listHeader组件的高度

listHeader、groupContainer等组件会广播通知tableContainer组件计算高度。

## [](#2-卡片页表格高度)2. 卡片页表格高度

### [](#21-卡片页表格吸底显示)2.1. 卡片页表格吸底显示

//
卡片页表格横向滚动条吸底显示，孙表不支持；表格最少显示3行内容，如果小于这个高度值，则吸底属性失效

在table容器的cStyle中配置属性：

{subTableFullHeight: true}

### [](#22-编辑态表格高度)2.2. 编辑态表格高度

表格最小高度是3行数据的高度，当数据超过15行数据时，表格出现高度滚动条。

### [](#23-浏览态表格高度)2.3. 浏览态表格高度

表格高度以实际数据为准，当数据超过15行数据时，表格出现高度滚动条。

## [](#3-空表高度)3. 空表高度

自定义空表高度/表格提示内容，自定义空表高度需要禁用表格全屏(吸底)属性。

||||height||说明||类型|
||默认值||105||空白区域高度值|||
||应用级配置defineStyle||emptyTableHeight||空白区域高度值||number|
||表格cStyle配置||tableNoDataHeight||空白区域高度值||number|
||表格cStyle配置||tableNoDataRowCount||空白区域显示n行||number|
||表格cStyle配置||noDataText||空表提示内容||string|
||表格cStyle配置||noSearchDataText||搜索无内容提示||string|

空格高度值 = height + headerHeight (＋ 合计行高 + 滚动条高度)。

## [](#4-表格支持换行显示)4. 表格支持换行显示

// 将列的cControlType改成'textarea';

gridmodel.setState('openContentHeight', true);

## [](#5-其他属性)5. 其他属性

||cStyle可配置属性||说明||类型|
||maxRowCount||表格显示的最大行数，用于表格高度计算||number|
||diffWidth||减去宽度差值，数字，辅助计算表格高度||number|
||fixedHeight||设置表格固定高度。数字，设置后不支持表格自适应高度||number|
||rowheight||自定义行高||number|

## [](#6-常见问题)6. 常见问题

1、页面出现双滚动条

一般是在表格的cStyle属性中，添加属性diffHieght:
数值，给一个合适的差值，将页面的滚动条去掉