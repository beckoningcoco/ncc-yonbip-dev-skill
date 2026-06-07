---
title: "手机号码 Mobile"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-mobile"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 手机号码 Mobile

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-mobile | 所属：Web组件

# [](#手机号码-mobile)手机号码 Mobile

## [](#1-功能说明)1. 功能说明

手机号，支持选择国外 支持国外手机号校验

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Mobileshoujihaoma-image1.c5da6ca1.png)

## [](#3-基本属性)3. 基本属性

### [](#31-在单据中)3.1. 在单据中

||属性名称||属性含义||值类型||属性说明|
||countryList||国家数据||array|||
||placeholder||提示语||string|||
||onBlur||失去焦点方法||function|||
||onChange||值改变的方法||function|||
||disabled||禁用（置灰）||boolean||true-置灰 ，false - 正常|

## [](#4-控制示例)4. 控制示例

### [](#41-在卡片中)4.1. 在卡片中

想要控制组件的状态，需要先拿到组件的模型，在MDF框架中，每个组件都会绑定一个模型，我们可以在扩展脚本中通过**viewmodel.get(cItemName)的方式获取到想要操作组件的模型，利用模型的API进行组件的控制，其中cItemName为该组件对应**billitem_base表中的cItemName

**示例：**

// 设置条件隐藏

viewmodel.get(cItemName).setVisible(false)

 

// 设置条件禁用

viewmodel.get(cItemName).setDisabled(true)

### [](#42-faq)4.2. FAQ

**常见问题1 ?**

解答内容...

**常见问题2 ?**

解答内容...