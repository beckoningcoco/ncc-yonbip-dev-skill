---
title: "时间轴 Timeline"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-timeline"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 时间轴 Timeline

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-timeline | 所属：Web组件

# [](#时间轴-timeline)时间轴 Timeline

## [](#1-功能说明)1. 功能说明

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/TimeLineshijianzhou_image1.1a017d24.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/TimeLineshijianzhou_image2.54d70778.png)

## [](#3-基本属性)3. 基本属性

### [](#31-excel配置)3.1. excel配置

bill_itembase表

||属性名称||属性含义||值类型||属性说明|
||属性名称||属性含义||值类型||属性说明|
||cControlType||组件类型||string||timeline|

## [](#4-扩展属性-cstyle)4. 扩展属性 cStyle

||属性名称||属性含义||值类型||属性说明|
||Group||钉耙Timeline.group配置额外属性||object||比如{size: large}|
||Item||钉耙Timeline.item配置额外属性||object||比如{color: "#ff0000"}|
||classname||配置class||string||样式|

## [](#5-赋值)5. 赋值

[{ // Timeline.Group

 childList: [{ // Timeline.Item

 time: '04:00 - 06:00', // 时间（可无）

 color: 'success', //颜色 

 text: '早班', // 文本

 }]

}]

**赋值示例，扩展脚本执行下面，即可看到时间轴**

const morningList = [

 {

 time: '04:00 - 06:00',

 color: 'success',

 text: '早班'

 },

 {

 time: '06:00 - 08:00',

 color: '#F0F0F0',

 text: '巡检路线：重型机械设备巡检'

 },

 {

 time: '08:00 - 10:00',

 color: '#F0F0F0',

 text: '巡检路线：轻型机械设备巡检'

 },

 {

 time: '10:00 - 12:00',

 color: '#F0F0F0',

 text: '巡检路线：燃油机械设备巡检'

 }

];

const noonList = [

 {

 time: '12:00 - 18:00',

 color: 'warning',

 text: '中班'

 },

 {

 time: '12:00 - 14:00',

 color: '#F0F0F0',

 text: '巡检路线：重型机械设备巡检'

 },

 {

 time: '14:00 - 16:00',

 color: '#F0F0F0',

 text: '巡检路线：轻型机械设备巡检'

 },

 {

 time: '16:00 - 18:00',

 color: '#F0F0F0',

 text: '巡检路线：燃油机械设备巡检'

 }

];

const evenList = [

 {

 time: '18:00 - 24:00',

 color: 'info',

 text: '晚班'

 },

 {

 time: '18:00 - 20:00',

 color: '#F0F0F0',

 text: '巡检路线：重型机械设备巡检'

 },

 {

 time: '20:00 - 22:00',

 color: '#F0F0F0',

 text: '巡检路线：轻型机械设备巡检'

 },

 {

 time: '22:00 - 24:00',

 color: '#F0F0F0',

 text: '巡检路线：燃油机械设备巡检'

 }

];

const demoData = [

 {

 childList: morningList

 },

 {

 childList: noonList

 },

 {

 childList: evenList

 }

];

// 赋值

viewModel.get('item122yc').setValue(demoData)