---
title: "地址输入框 InputAddress"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-inputaddress"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 地址输入框 InputAddress

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-inputaddress | 所属：Web组件

# [](#地址输入框-inputaddress)地址输入框 InputAddress

## [](#1-功能说明)1. 功能说明

通过鼠标或键盘输入内容，是基础的表单域组件。

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/InputAddressdizhishurukuang-image1.3c7d8b49.png)

## [](#3-基本属性)3. 基本属性

### [](#31-在单据中)3.1. 在单据中

||属性名称||属性含义||值类型||属性说明|
||disabled||禁用（置灰）||boolean||true-置灰 ，false - 正常|
||bIsNull||是否必输||boolean||true-非必输 false -必输|
||hideTitle||隐藏标题||boolean||true-隐藏 false-不隐藏|
||cShowCaption||标题||string|||
||cStyle||扩展属性||string||所有的扩展属性都配在这个属性中|

**说明：**

- InputAddress组件兼容了Input组件多数属性，其他属性可参考[Input组件](#/components-web/01-input)

## [](#4-控制示例)4. 控制示例

[SimpleModel 简单模型](#/api/02-simple-model)

### [](#41-在卡片中)4.1. 在卡片中

想要控制组件的状态，需要先拿到组件的模型，在MDF框架中，每个组件都会绑定一个模型，我们可以在扩展脚本中通过**viewmodel.get(cItemName)的方式获取到想要操作组件的模型，利用模型的API进行组件的控制，其中cItemName为该组件对应**billitem_base表中的cItemName

**示例：**

// 设置条件隐藏

viewmodel.get(cItemName).setVisible(false)

// 设置条件只读

viewmodel.get(cItemName).setReadOnly(true)

// 设置条件禁用

viewmodel.get(cItemName).setDisabled(true)

// 设置提示信息

viewmodel.get(cItemName).setState('placeholder', '提示信息')

### [](#42-在表格中)4.2. 在表格中

表格中获取组件的情况分两种，一种是浏览态，一种是编辑态

#### [](#421-浏览态)4.2.1. 浏览态

在浏览态的表格中，可以通过更新组件所在的单元格模型的方式来更新组件的的状态或内容

对于API使用不了解的可以参考详细使用文档 --
[Table表格](#/components-web/04-table)、[GridModel表格模型](#/components-web/04-table)

**示例：**

// 获取表格模型

const gridModle = viewmodel.getGridModel()

// 修改单元格内容

gridModle.setCellValue(0, cellName, '我是一个全新的value', false, true)

// 修改单元格状态

gridModle.setCellState(0, cellName, 'disabled', true)

#### [](#422-编辑态)4.2.2. 编辑态

在编辑态的表格中，可以通过操作表格行模型中对应列模型的方式更新组件状态或内容

对于API使用不了解的可以参考详细使用文档 --
[Table表格](#/components-web/04-table)、[GridModel表格模型](#/components-web/04-table)

**示例：**

// 获取表格模型

const gridModle = viewmodel.getGridModel()

// 获取编辑态行模型

const editRwoModel = gridModle.getEditRowModel()

// 获取组件所在的列模型

const cItemName = editRwoModel.get(cItemName)

// 操作组件模型更新value

cItemName.setValue('我是一个全新的value')

## [](#5-faq)5. FAQ

**常见问题1 ?**

解答内容...

**常见问题2 ?**

解答内容...