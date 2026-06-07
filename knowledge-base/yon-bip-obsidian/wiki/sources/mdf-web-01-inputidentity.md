---
title: "身份证输入框 InputIdentity"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-inputidentity"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 身份证输入框 InputIdentity

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-inputidentity | 所属：Web组件

# [](#身份证输入框-inputidentity)身份证输入框 InputIdentity

## [](#1-功能说明)1. 功能说明

通过鼠标或键盘输入内容，是基础的表单域组件。

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/InputIdentityshenfenzhengshurukuang-image1.031a4b5f.png)

## [](#3-基本属性)3. 基本属性

### [](#31-在单据中)3.1. 在单据中

||属性名称||属性含义||值类型||属性说明|
||formatText||格式化||string||请查看以下说明1|
||bIsNull||是否必输||boolean||true-非必输 false -必输|
||idTypes||下拉类型枚举||object||请查看以下说明2|
||iMaxLength||最大长度||number||可输入最大的字符长度|
||cStyle||扩展属性||string||所有的扩展属性都配在这个属性中|

**说明：**

1、通过 formatText 控制，例如：

### [](#---格式内容为-622-260-0216-7654)### #### #### 格式内容为 622 260 0216 7654

触过 # 字符，所有内容均会被已掩码形式输入。如：

####* ## 格式内容为 222***333

2、idTypes 控制下拉选项，现在没有对接业务暂时每开放这个参数，现在的值是

{

 "1": { name: '身份证', formatter: '### ### #### #### ####' },

 "2": { name: '军官证', formatter: '### ### #### #### ####' },

 "3": { name: '护照', formatter: '#### ####' },

 "4": { name: '银行卡', formatter: '#### #### #### ####' }

}

## [](#4-扩展属性-cstyle)4. 扩展属性 cStyle

单据在cStyle中、查询区在extendField中配置属性，如：{"autoSize":true}

||属性名称||属性含义||值类型||属性说明|
||readOnly||只读||boolean||true-只读 ，false - 非只读|
||disabled||禁用（置灰）||boolean||true-置灰 ，false - 正常|
||fontColor||字体颜色||string|||
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