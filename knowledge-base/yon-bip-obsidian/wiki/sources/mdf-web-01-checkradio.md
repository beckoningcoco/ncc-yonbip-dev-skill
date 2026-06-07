---
title: "单选框 CheckRadio"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-checkradio"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 单选框 CheckRadio

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-checkradio | 所属：Web组件

# [](#单选框-checkradio)单选框 CheckRadio

## [](#1-功能说明)1. 功能说明

通过鼠标选择内容，是最基础的表单域组件

## [](#2-效果展示)2. 效果展示

![](data:image/png;base64,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)

## [](#3-基本属性)3. 基本属性

### [](#31-在单据中)3.1. 在单据中

||属性名称||属性含义||值类型||属性说明|
||bHidden||是否隐藏||boolean||true-隐藏 false -显示|
||bIsNull||是否必输||boolean||true-非必输 false -必输|

## [](#4-扩展属性-cstyle)4. 扩展属性 cStyle

单据在cStyle中、查询区在extendField中配置属性，如：{"autoSize":
true}

||属性名称||属性含义||值类型||属性说明|
||readOnly||只读||boolean||true-只读 ，false - 非只读|
||disabled||禁用（置灰）||boolean||true-置灰 ，false - 正常|
||focus||获取焦点||boolean||true-聚焦 ，false - 失去焦点|
||className||扩展class类名||string||用来处理扩展样式|

## [](#5-控制示例)5. 控制示例

### [](#51-在卡片中)5.1. 在卡片中

想要控制组件的状态，需要先拿到组件的模型，在MDF框架中，每个组件都会绑定一个模型，我们可以在扩展脚本中通过**viewmodel.get(cItemName)的方式获取到想要操作组件的模型，利用模型的API进行组件的控制，其中cItemName为该组件对应**billitem_base表中的cItemName

**示例：**

// 设置条件隐藏

viewmodel.get(cItemName).setVisible(false)

// 设置条件只读

viewmodel.get(cItemName).setReadOnly(true)

// 设置值

viewmodel.get(cItemName).setValue(true)

// 设置获取焦点

viewmodel.get(cItemName).setState('focus',false)

在表格中
表格中获取组件的情况分两种，一种是浏览态，一种是编辑态
浏览态
在浏览态的表格中，可以通过更新组件所在的单元格模型的方式来更新组件的的状态或内容
对于API使用不了解的可以参考详细使用文档 --
[Table表格](#/components-web/04-table)、[GridModel表格模型](#/api/02-grid-model)

示例：

// 获取表格模型

const gridModle = viewmodel.getGridModel()

// 修改单元格内容

gridModle.setCellValue(0, cellName, '我是一个全新的value', false, true)

// 修改单元格状态

gridModle.setCellState(0, cellName, 'disabled', true)

#### [](#511-编辑态)5.1.1. 编辑态

在编辑态的表格中，可以通过操作表格行模型中对应列模型的方式更新组件状态或内容

对于API使用不了解的可以参考详细使用文档 --
[Table表格](#/components-web/04-table)、[GridModel表格模型](#/api/02-grid-model)

**示例：**

// 获取表格模型

const gridModle = viewmodel.getGridModel()

// 获取编辑态行模型

const editRwoModel = gridModle.getEditRowModel()

// 获取组件所在的列模型

const cItemName = editRwoModel.get(cItemName)

// 操作组件模型更新value

cItemName.setValue('我是一个全新的value')

## [](#6-faq)6. FAQ

**常见问题1 ?**

解答内容...

**常见问题2 ?**

解答内容...