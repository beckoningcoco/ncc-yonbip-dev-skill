---
title: "评分 Rate"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-rate"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 评分 Rate

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-rate | 所属：Web组件

# [](#评分-rate)评分 Rate

## [](#1-功能说明)1. 功能说明

评分组件

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Ratepingfen-image1.a9f3c82d.png)

## [](#3-基本属性)3. 基本属性

### [](#31-在单据中)3.1. 在单据中

||属性名称||属性含义||值类型||属性说明|
||value||当前数||number||当前数|
||disabled||可否点击||boolean||true-不可点击 false可点击|
||count||总数||number||上限值|
||allowHalf||是否允许半选||boolean||true-可以 false不可以|
||cStyle||扩展属性||string||所有的扩展属性都配在这个属性中|
||onChange||选择时的回调||function||参数为当前数|
||onHoverChange||鼠标经过时的回调||function||参数为当前数|

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