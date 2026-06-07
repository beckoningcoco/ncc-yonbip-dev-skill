---
title: "多语输入框 InputMultiLang"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-inputmultilang"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 多语输入框 InputMultiLang

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-inputmultilang | 所属：Web组件

# [](#多语输入框-inputmultilang)多语输入框 InputMultiLang

## [](#1-功能说明)1. 功能说明

通过鼠标或键盘输入内容，是基础的表单域组件。

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/InputMultiLangduoyushurukuang-image1.41a41f12.png)

## [](#3-基本属性)3. 基本属性

### [](#31-在单据中)3.1. 在单据中

||属性名称||属性含义||值类型||属性说明|
||cDefaultValue||默认值||string|||
||currentLanguage||当前语言||string||默认-zh_CN|
||addonBefore||前缀||string|||
||addonAfter||后缀||string|||
||size||组件大小||string||默认-default|
||iMaxLength||最大长度||number||可输入最大的字符长度|
||cFormatData||格式化||string||可以配置format格式化，包括前缀prefix、后缀suffix|
||bIsNull||是否必输||boolean||true-非必输 false -必输|
||icon||图标||string|||

**说明：**

- InputMultiLang
组件兼容了Input组件多数属性，其他属性可参考[Input组件](#/components-web/01-input)

## [](#4-扩展属性-cstyle)4. 扩展属性 cStyle

单据在cStyle中、查询区在extendField中配置属性，如：{"autoSize":
true}

||属性名称||属性含义||值类型||属性说明|
||autoSize||自动撑高||boolean||true-自动撑高，false-不自动撑高|
||icon||图标后缀||string|||
||readOnly||只读||boolean||true-只读 ，false - 非只读|
||disabled||禁用（置灰）||boolean||true-置灰 ，false - 正常|
||placeholder||提示信息||string|||
||className||扩展class类名||string||用来处理扩展样式|
||textarea||多语多行展示||boolean||默认是false，配置成true才是多行展示|

## [](#5-控制示例)5. 控制示例

[SimpleModel 简单模型](#/api/02-simple-model)

### [](#51-在卡片中)5.1. 在卡片中

想要控制组件的状态，需要先拿到组件的模型，在MDF框架中，每个组件都会绑定一个模型，我们可以在扩展脚本中通过**viewmodel.get(cItemName)的方式获取到想要操作组件的模型，利用模型的API进行组件的控制，其中cItemName为该组件对应**billitem_base表中的cItemName

#### [](#511-支持多行文本)5.1.1. 支持多行文本

配置规则：

textarea：true

type：textarea

多行文本按UE要求按照内容自动撑起，允许拖拽。

**示例：**

// 设置条件隐藏

viewmodel.get(cItemName).setVisible(false)

 

// 设置条件只读

viewmodel.get(cItemName).setReadOnly(true)

 

// 设置条件禁用

viewmodel.get(cItemName).setDisabled(true)

 

// 设置提示信息

viewmodel.get(cItemName).setState('placeholder', '提示信息')

### [](#52-在表格中)5.2. 在表格中

表格中获取组件的情况分两种，一种是浏览态，一种是编辑态

#### [](#521-浏览态)5.2.1. 浏览态

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

#### [](#522-编辑态)5.2.2. 编辑态

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

## [](#6-faq)6. FAQ

**常见问题1 ?**

解答内容...

**常见问题2 ?**

解答内容...