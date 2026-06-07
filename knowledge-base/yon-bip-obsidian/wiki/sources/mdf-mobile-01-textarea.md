---
title: "文本域 TextArea"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/01-textarea"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 7
---

# 文本域 TextArea

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/01-textarea | 所属：移动组件

# [](#文本域-textarea)文本域 TextArea

## [](#1-效果展示)1. 效果展示

### [](#11-编辑态)1.1. 编辑态

#### [](#111-上下布局-singleline)1.1.1. 上下布局-singleLine

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/TextAreawenbenyu-image1.0be8cd86.jpeg)

1.高度默认展示3行，最大高度展示6行，超出则滑动浏览；

2.支持右下角限制字数（可配置-iMaxLength），默认隐藏；

3.支持右侧配置编辑长内容（可配置-hasLongText），默认隐藏；

4.placeholder暗提示文本内容（可配置-placeholder）,默认值是：'请输入'；

#### [](#112-左右布局)1.1.2. 左右布局

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/TextAreawenbenyu-image2.5d8d6932.jpeg)

1.高度默认展示1行，最大高度限制6行，超出则滚动浏览；

2.label（标题示意）顶对齐；

3.左右布局不支持右下角限制字数；

4.placeholder暗提示文本内容（可配置-placeholder）,默认值是：'请输入'；

### [](#12-浏览态超出默认折叠)1.2. 浏览态（超出默认折叠）

#### [](#121-上下布局-singleline)1.2.1. 上下布局-singleLine：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/TextAreawenbenyu-image3.fbfd3ca6.jpeg)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/TextAreawenbenyu-image4.c4f0afa2.jpeg)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/TextAreawenbenyu-image5.8c9f7dec.jpeg)

#### [](#122-左右布局)1.2.2. 左右布局

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/TextAreawenbenyu-image6.1550ce9b.jpeg)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/TextAreawenbenyu-image7.d851e298.jpeg)

## [](#2-功能介绍)2. 功能介绍

新增：

支持自适应高度；

超出限制高度显示折叠；

可编辑长文本；

## [](#3-标准属性)3. 标准属性

||名称||含义||说明|
||名称||含义||说明|
||bCanModify||是否可编辑|||
||readOnly||只读||true-非必输 false -必输|
||disabled||禁用|||
||bIsNull||是否必填|||
||iMaxLength||最大长度||可输入的最大长度|

## [](#4-扩展属性-cstyle)4. 扩展属性 cStyle

在cStyle中配置属性，例：{"bShowVoice": true}

||名称||含义||说明|
||名称||含义||说明|
||bShowVoice||支持语音录入|||
||placeholder||提示文本|||
||className||扩展样式|||
||singleLine||标题和内容是否单行显示||flase-上下显示；true-单选显示|
||hasLongText||label右侧的长文本编辑||true-显示; false（默认）-隐藏|

## [](#5-扩展属性-cextprops)5. 扩展属性 cExtProps

可通过在cExtProps中配置

||名称||含义||说明|
||名称||含义||说明|
||singleLine||标题和内容是否单行显示||cExtProps: {"singleLine": true}|

## [](#6-控制示例)6. 控制示例

[SimpleModel简单模型](#/api/02-simple-model)
想要控制组件的状态，需要先拿到组件的模型，在MDF框架中，每个组件都会绑定一个模型，我们可以在扩展脚本中通过**viewmodel.get(cItemName)的方式获取到想要操作组件的模型，利用模型的API进行组件的控制，其中cItemName为该组件对应**billitem_base表中的cItemName

示例：

// 设置条件隐藏

viewmodel.get(cItemName).setVisible(false)

 

// 设置条件只读

viewmodel.get(cItemName).setReadOnly(true)

 

// 设置条件禁用

viewmodel.get(cItemName).setDisabled(true)

 

// 设置提示信息

viewmodel.get(cItemName).setState('placeholder', '提示信息')