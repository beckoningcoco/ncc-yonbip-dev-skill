---
title: "进度条 ProgressBar"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-progressbar"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 进度条 ProgressBar

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-progressbar | 所属：Web组件

# [](#进度条-progressbar)进度条 ProgressBar

## [](#1-功能说明)1. 功能说明

展示操作的当前进度

## [](#2-效果展示)2. 效果展示

## [](#3-基本属性)3. 基本属性

### [](#31-在单据中)3.1. 在单据中

||属性名称||属性含义||值类型||属性说明|
||属性名称||属性含义||值类型||属性说明|
||cDefaultValue||默认值||string||进度条值|
||bHidden||是否隐藏||boolean||true-隐藏 false -显示|
||err||错误信息||string||错误信息|
||msg||提示信息||string||提示信息|
||cStyle||扩展属性||string||所有的扩展属性都配在这个属性中|

### [](#32-在卡片中)3.2. 在卡片中

想要控制组件的状态，需要先拿到组件的模型，在MDF框架中，每个组件都会绑定一个模型，我们可以在扩展脚本中通过**viewmodel.get(cItemName)的方式获取到想要操作组件的模型，利用模型的API进行组件的控制，其中cItemName为该组件对应**billitem_base表中的cItemName

**示例：**

// 设置条件隐藏

viewmodel.get(cItemName).setVisible(true)

// 设置条件禁用

viewmodel.get(cItemName).setDisabled(true)

## [](#4-faq)4. FAQ

**常见问题1 ?**

解答内容...

**常见问题2 ?**

解答内容...