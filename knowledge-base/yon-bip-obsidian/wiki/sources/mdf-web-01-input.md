---
title: "输入框 Input"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-input"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 输入框 Input

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-input | 所属：Web组件

# [](#输入框-input)输入框 Input

## [](#1-功能说明)1. 功能说明

通过鼠标或键盘输入内容，是最基础的表单域组件。

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Inputshurukuang-image1.4f49a52b.jpeg)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Inputshurukuang-image2.4566cf5d.png)

## [](#3-基本属性)3. 基本属性

### [](#31-在单据中)3.1. 在单据中

||属性名称||属性含义||值类型||属性说明|
||cFormatData||格式化||string||可以配置format格式化，包括前缀prefix、后缀suffix|
||bIsNull||是否必输||boolean||true-非必输 false -必输|
||cDefaultValue||默认值||string|||
||iMaxLength||最大长度||number||可输入最大的字符长度|
||cStyle||扩展属性||string||所有的扩展属性都配在这个属性中|
||cExtProps||附加属性||string||附加属性配在这个属性中|

**注意：**

- 此处的属性对应**billitem_base**表中的字段，值类型为前端类型，可能与数据库中不匹配，如：前端的bIsNull是true/false，在数据库中是0/1

### [](#32-在查询区中)3.2. 在查询区中

||属性名称||属性含义||值类型||属性说明|
||cFormatData||格式化||string||可以配置format格式化，包括前缀prefix、后缀suffix|
||multSelect||是否必输||boolean||true-必输 false -非必输|
||value1||默认值||string||pb_filter_solution_common表中的默认值,只对当前方案生效|
||defaultVal1||默认值||string||pb_meta_filter_item表中的默认值，对当前单据中所有方案均生效（common表没有设置默认值的情况下），新增方案时可携带到新方案中|
||extendField||扩展属性||string||所有的扩展属性都配在这个属性中|
||fontStyle||字体属性||object||fontSize、color等属性设置|

**注意：**

- 

此处的属性对应**pb_meta_filter_item**表或**pb_filter_solution_common**表中的字段，值类型为前端类型，可能与数据库中不匹配，如：前端的bIsNull是true/false，在数据库中是0/1

- 

优先使用**pb_filter_solution_common**表中的值

## [](#4-扩展属性-cstyle)4. 扩展属性 cStyle

单据在cStyle中、查询区在extendField中配置属性，如：{"autoSize":
true}

||属性名称||属性含义||值类型||属性说明|
||autoSize||自动撑高||boolean||true-自动撑高，false-不自动撑高|
||icon||图标后缀||string|||
||readOnly||只读||boolean||true-只读 ，false - 非只读|
||disabled||禁用（置灰）||boolean||true-置灰 ，false - 正常|
||placeholder||提示信息||string|||
||autoComplete||是否记录历史||boolean||true-记录历史，默认不记录|
||className||扩展class类名||string||用来处理扩展样式|
||bottom||底部内容||||输入框底部内容|
||before||前边内容||||输入框前边内容|
||after||后边内容||||输入框后边内容|

## [](#5-附加属性-cextprops)5. 附加属性 cExtProps

||属性名称||属性含义||值类型||属性说明|
||encrypt||开启加密||boolean||true-开启，false-不开启，默认false|
||encryptStart||加密起始位||number||从第几位开始加密，大于0会按照字符串从前到后顺序找到起始位，小于0则从后向前|
||encryptCount||加密位数||number||加密位数|
||encryptMark||加密符号||string||*%_#等|
||showEncrypt||开启显示隐藏||boolean|||

## [](#6-控制示例)6. 控制示例

[SimpleModel 简单模型](#/api/02-simple-model)

### [](#61-在卡片中)6.1. 在卡片中

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

### [](#62-在表格中)6.2. 在表格中

表格中获取组件的情况分两种，一种是浏览态，一种是编辑态

#### [](#621-浏览态)6.2.1. 浏览态

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

#### [](#622-编辑态)6.2.2. 编辑态

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

### [](#63-在查询区中)6.3. 在查询区中

在查询区中，我们可以通过间接的方式获取到组件模型，然后对其进行页面操作，查询区模型获取方式参考文档[ConvenientQuery查询区](#/components-web/05-convenientquery)，获取到查询区模型之后，可以通过查询区模型获取到下面挂载的子模型。

**示例：**

const itemModel = filterViewModel.get(itemName).getFromModel()

 

// 设置查询条件禁用

itemModel.setDisabled(true)

 

// 设置查询条件只读

itemModel.setReadOnly(true)

 

// 改变值

itemModel.setValue('新的value')

 

// 设置查询区条件隐藏，此处比较特殊，查询区设置隐藏的方式是通过查询模型filterViewmodel进行控制

filterViewModel.execute('updateViewMeta', {code: itemName, visible: false})

## [](#7-faq)7. FAQ

**常见问题1 ?**

解答内容...

**常见问题2 ?**

解答内容...