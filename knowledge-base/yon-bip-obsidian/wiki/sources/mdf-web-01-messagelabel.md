---
title: "提示标签 MessageLabel"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-messagelabel"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 提示标签 MessageLabel

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-messagelabel | 所属：Web组件

# [](#提示标签-messagelabel)提示标签 MessageLabel

## [](#1-功能说明)1. 功能说明

提示组件

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MessageLabeltishibiaoqian-image1.59a37265.jpeg)

## [](#3-基本属性)3. 基本属性

### [](#31-在单据中)3.1. 在单据中

||属性名称||属性含义||值类型||属性说明|
||属性名称||属性含义||值类型||属性说明|
||themeType||提示框主题类型||string||主题类型|
||labelMessage||提示信息||array||提示信息内容|
||labelTitle||提示标题||string||标题内容|
||row||行数||number||行数|
||lineHeight||行高||number||行高|
||bHidden||是否隐藏||boolean||true-隐藏 false -显示|
||cStyle||扩展属性||string||所有的扩展属性都配在这个属性中|

### [](#32-在卡片中)3.2. 在卡片中

想要控制组件的状态，需要先拿到组件的模型，在MDF框架中，每个组件都会绑定一个模型，我们可以在扩展脚本中通过**viewmodel.get(cItemName)的方式获取到想要操作组件的模型，利用模型的API进行组件的控制，其中cItemName为该组件对应**billitem_base表中的cItemName

**示例：**

// 设置条件隐藏

viewmodel.get(cItemName).setVisible(true)

 

// 设置条件禁用

viewmodel.get(cItemName).setDisabled(true)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MessageLabeltishibiaoqian-image2.f84777b0.jpeg)

## [](#4-faq)4. FAQ

**常见问题1 ?**

解答内容...

**常见问题2 ?**

解答内容...