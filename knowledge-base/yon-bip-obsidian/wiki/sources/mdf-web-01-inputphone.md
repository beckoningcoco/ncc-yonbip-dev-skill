---
title: "电话输入框 InputPhone"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-inputphone"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 电话输入框 InputPhone

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-inputphone | 所属：Web组件

# [](#电话输入框-inputphone)电话输入框 InputPhone

## [](#1-功能说明)1. 功能说明

通过鼠标或键盘输入内容，是基础的表单域组件。

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/InputPhonedianhuashurukuang-image1.c35237e8.png)

## [](#3-基本属性)3. 基本属性

### [](#31-在单据中)3.1. 在单据中

||属性名称||属性含义||值类型||属性说明|
||phoneType||显示类型||string||请看下方类型描述|
||countryCodeMap||国家代号||object||默认值-{ 86: { '+86':'中国' } }|
||cityCodeList||城市代号||array||默认值-[ '010' ]|
||fristLength||短电话是电话 长度||number||默认值-8|
||lastLength||分机号长度||number||默认值-4|
||cStyle||扩展属性||string||所有的扩展属性都配在这个属性中|

### [](#32-类型描述)3.2. 类型描述

phoneType：总共有五种类型

 

switch(phoneType){

 case 'splitSimplePhone': {

 //带国家代表的手机号

 // ui 效果：[中国↓][+86 1367666767]

 }

 case 'simpleTel': {

 //带分机号的手机号

 // ui 效果：[38383883][111]

 }

 case 'splitSimpleTel': {

 //国家、城市、电话

 // ui 效果：[+86↓][+010↓][18181877]

 }

 case 'splitComplexTel': {

 //长电话

 // ui 效果：[+86↓][+010↓][38383883][111]

 }

 case 'simplePhone':

 default: {

 //一般简单效果

 // ui 效果：[135151515]

 }

}

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

## [](#5-控制示例)5. 控制示例

[SimpleModel 简单模型](#/api/02-simple-model)

### [](#51-在卡片中)5.1. 在卡片中

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