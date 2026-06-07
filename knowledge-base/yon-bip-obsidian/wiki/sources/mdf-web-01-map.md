---
title: "地图组件 Map"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-map"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 地图组件 Map

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-map | 所属：Web组件

# [](#地图组件-map)地图组件 Map

## [](#1-功能说明)1. 功能说明

通过此按按钮，可以实现对地图上位置的选择

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Mapdituzujian-image1.ccd8deac.jpeg)

## [](#3-基本属性)3. 基本属性

### [](#31-在单据中)3.1. 在单据中

||属性名称||属性含义||值类型||属性说明|
||属性名称||属性含义||值类型||属性说明|
||value||当前地址框的值||string|||

## [](#4-扩展属性-cstyle)4. 扩展属性 cStyle

单据在cStyle中

||属性名称||属性含义||值类型||属性说明|
||属性名称||属性含义||值类型||属性说明|
||disabled||禁用（置灰）||boolean||true-置灰 ，false - 正常|
||className||扩展class类名||string||用来处理扩展样式|
||bLikeQuery||搜索提示||boolean||开启地图搜索提示 true-开启|
||deliveryMethod||地图围栏类型||'polygon'：多边形, 'circle': 圆形||地图围栏类型默认 空|
||circleRadius||圆形半径||number||deliveryMethod='circle' 时 范围半径|
||bubble||deliveryMethod='circle' 时 范围内是否支持点击||boolean||选中circle中是否可以点击 默认false|
||isContainModal||地图类型||boolean||true- 打开地图 是个弹窗false-地图在当前页面中|

## [](#5-事件api)5. 事件API

### [](#51-控制示例)5.1.  控制示例

想要控制组件的状态，需要先拿到组件的模型，在MDF框架中，每个组件都会绑定一个模型，我们可以在扩展脚本中通过**viewmodel.get(cItemName)的方式获取到想要操作组件的模型，利用模型的API进行组件的控制，其中cItemName为该组件对应**billitem_base表中的cItemName

// 设置条件隐藏

viewmodel.get(cItemName).setVisible(false)

 

// 设置条件禁用

viewmodel.get(cItemName).setDisabled(true)

### [](#52-事件钩子)5.2.  事件钩子

// polygonPath -- 围栏

viewmodel.get(cItemName).on('polygonPath', function (data) {

 // data 围栏坐标

})

 

// circleRadius-- 圆形围栏

viewmodel.get(cItemName).on('circleRadius', function (data) {

 // data 圆形围栏半径

})

 

// onAmapHandleClick-- 点击地图时的回调

viewmodel.get(cItemName).on('onAmapHandleClick', function (data) {

 // data 当前地图坐标的信息

})

### [](#53-faq)5.3. FAQ

**常见问题1 ?**

解答内容...

**常见问题2 ?**

解答内容...