---
title: "数字输入框 InputNumber"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-inputnumber"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 数字输入框 InputNumber

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-inputnumber | 所属：Web组件

# [](#数字输入框-inputnumber)数字输入框 InputNumber

## [](#1-功能说明)1. 功能说明

通过鼠标或键盘输入内容，是基础的表单域组件。

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/InputNumbershuzushurukuang-image1.1729481e.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/InputNumbershuzushurukuang-image2.59c2d4dd.png)

## [](#3-基本属性)3. 基本属性

### [](#31-在单据中)3.1. 在单据中

||属性名称||属性含义||值类型||属性说明|
||subuitype||类型||string||int-整数 money-金额 percent-百分比cExtProps中配置|
||addonBefore||前缀||string||cExtProps中配置|
||addonAfter||后缀||string||cExtProps中配置|
||iAlign||文字对齐方向||number||1-左对齐(默认) 2-剧中 3-右对齐|
||max||最大值||number||cExtProps中配置|
||min||最小值||number||cExtProps中配置|
||step||每次改变步数||number/string||cExtProps中配置|
||showCalc||是否显示计算器||boolean||cExtProps中配置|
||iNumPoint||小数位数精度||number||控制小数点后位数|
||bUINumPoint||组件浏览态取模板精度||boolean||默认false值为true，按照模板精度显示|
||decimalFormat||不显示小数点末位0||boolean||cExtProps中配置|
||bEnableFormat||是否开启自定义格式||boolean||值为false，按照平台公共的数值格式化显示值为true，按照领域传给平台的值显示|
||cFormatData||依赖精度/舍入规则||object||主表字段依赖主表字段精度：{related: '[fieldName]'}子表依赖子表{related: '[fieldName]'}子表依赖主表/孙表依赖主表{related: 'parentdata.[fieldName]'}孙表依赖子表{related: 'parenttable.[fieldName]'}币种舍入规则，默认全部舍位主表字段依赖主表字段规则{relatedRound: '[fieldName]'}子表依赖子表{relatedRound: '[fieldName]'}子表依赖主表{relatedRound: 'parentdata.[fieldName]'}|

**说明：**

- InputNumber组件兼容了Input组件多数属性，其他属性可参考[Input组件](#/components-web/01-input)

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

 

// 修改后置内容与前置内容

viewmodel.get(cItemName).setState('addAfter', '后置内容')

viewmodel.get(cItemName).setState('addBefore', '前置内容')

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

## [](#5-常见问题)5. 常见问题

### [](#51-如何关闭千分位格式显示)5.1 如何关闭千分位格式显示

- 全局级控制：在`我的首选`页面配置
- 字段级控制：在`字段的cExtProps中配置{"thousands": false}`