---
title: "选择框 Select"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-select"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 7
---

# 选择框 Select

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-select | 所属：Web组件

# [](#选择框-select)选择框 Select

## [](#1-功能说明)1. 功能说明

选择组件，支持下拉选择和平铺选择，支持单选和多选

## [](#2-效果展示)2. 效果展示

通过鼠标或键盘输入内容，是最基础的表单域组件，建议使用OptionWidget

![](data:image/png;base64,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)

## [](#3-弹出层挂载位置)3. 弹出层挂载位置

在页面滚动的过程中，如果出现下拉与组件本身分离的现象，需要在cStyle中配置containerClassName来控制挂载位置
，这样就可以解决下拉框与组件分离的问题。

比如：{containerClassName：'页面中dom的className'}

## [](#4-基本属性)4. 基本属性

### [](#41-在单据中)4.1. 在单据中

||属性名称||属性含义||值类型||属性说明|
||allowClear||支持清除||boolean||默认true，单选模式有效|
||bHidden||是否显示||boolean||true-隐藏，false-显示|
||bIsNull||是否必输||boolean||true-非必输 false -必输|
||cDefaultValue||默认值||string|||
||combobox||输入框自动提示||boolean||默认false|
||multiple||是否多选||boolean||默认false，多选为true|
||cStyle||扩展属性||string||所有的扩展属性都配在这个属性中|

注意：
●此处的属性对应billitem_base表中的字段，值类型为前端类型，可能与数据库中不匹配，如：前端的bIsNull是true/false，在数据库中是0/1

### [](#42-在查询区中)4.2. 在查询区中

||属性名称||属性含义||值类型||属性说明|
||multSelect||是否必输||boolean||true-必输 false -非必输|
||value1||默认值||string||pb_filter_solution_common表中的默认值,只对当前方案生效|
||defaultVal1||默认值||string||pb_meta_filter_item表中的默认值，对当前单据中所有方案均生效（common表没有设置默认值的情况下），新增方案时可携带到新方案中|
||extendField||扩展属性||string||所有的扩展属性都配在这个属性中|

注意：
●此处的属性对应pb_meta_filter_item表或pb_filter_solution_common表中的字段，值类型为前端类型，可能与数据库中不匹配，如：前端的bIsNull是true/false，在数据库中是0/1
●优先使用pb_filter_solution_common表中的值

## [](#5-扩展属性-cstyle)5. 扩展属性 cStyle

单据在cStyle中、查询区在extendField中配置属性，如：{"autoSize": true}

||属性名称||属性含义||值类型||属性说明|
||readOnly||只读||boolean||true-只读 ，false - 非只读|
||disabled||禁用（置灰）||boolean||true-置灰 ，false - 正常|
||placeholder||提示信息||string|||
||className||扩展class类名||string||用来处理扩展样式|
||exProps||扩展属性||||showSearch显示搜索|
||focus||是否获得焦点||boolean||true-获得焦点 false -失去焦点|
||size||输入框大小||string||默认default，可选 small、large|
||groupSelect||支持select分组||boolean||true 参考下面常见问题1|
||after||组件右侧内容||||位于组件的后置内容|
||before||组件左侧内容||||位于组件的前置内容|
||bottom||组件下方内容||||位于组件下方的内容|

## [](#6-控制示例)6. 控制示例

[ListModel 枚举模型](#/api/02-list-model)

### [](#61-在卡片中)6.1. 在卡片中

想要控制组件的状态，需要先拿到组件的模型，在MDF框架中，每个组件都会绑定一个模型，我们可以在扩展脚本中通过viewmodel.get(cItemName)的方式获取到想要操作组件的模型，利用模型的API进行组件的控制，其中cItemName为该组件对应billitem_base表中的cItemName

示例：

// 设置条件隐

viewmodel.get(cItemName).setVisible(false)

// 设置条件只读

viewmodel.get(cItemName).setReadOnly(true)

// 设置条件禁用

viewmodel.get(cItemName).setDisabled(true)

// 设置值

viewmodel.get(cItemName).setValue('我是数组或值')

// 设置提示信息

viewmodel.get(cItemName).setState('placeholder', '提示信息')

### [](#62-在表格中)6.2. 在表格中

表格中获取组件的情况分两种，一种是浏览态，一种是编辑态

#### [](#621-浏览态)6.2.1. 浏览态

在浏览态的表格中，可以通过更新组件所在的单元格模型的方式来更新组件的的状态或内容
对于API使用不了解的可以参考详细使用文档 --
Table表格、GridModel表格模型
示例：

// 设置条件隐藏

viewmodel.get(cItemName).setVisible(false)

// 设置条件只读

viewmodel.get(cItemName).setReadOnly(true)

// 设置条件禁用

viewmodel.get(cItemName).setDisabled(true)

// 设置值

viewmodel.get(cItemName).setValue('我是数组或值')

// 设置提示信息

viewmodel.get(cItemName).setState('placeholder', '提示信息')

#### [](#622-编辑态)6.2.2. 编辑态

在编辑态的表格中，可以通过操作表格行模型中对应列模型的方式更新组件状态或内容
对于API使用不了解的可以参考详细使用文档 --
Table表格、GridModel表格模型
示例：

// 获取表格模型

const gridModle = viewmodel.getGridModel()

// 获取编辑态行模型

const editRwoModel = gridModle.getEditRowModel()

// 获取组件所在的列模型

const cItemName = editRwoModel.get(cItemName)

// 操作组件模型更新value

cItemName.setValue('我是一个全新的value')

### [](#63-在查询区中)6.3. 在查询区中

在查询区中，我们可以通过间接的方式获取到组件模型，然后对其进行页面操作，查询区模型获取方式参考文档ConvenientQuery查询区，获取到查询区模型之后，可以通过查询区模型获取到下面挂载的子模型。
示例：

const itemModel = filterViewModel.get(itemName).getFromModel()

// 设置查询条件禁用

itemModel.setDisabled(true)

// 设置查询条件只读

itemModel.setReadOnly(true)

// 改变值

itemModel.setValue('新的value')

// 设置查询区条件隐藏，此处比较特殊，查询区设置隐藏的方式是通过查询模型filterViewmodel进行控制

filterViewModel.execute('updateViewMeta', {code: itemName, visible: false})

## [](#7-枚举字段标签标记形式展现)7. 枚举字段标签、标记形式展现

### [](#71-颜色规范)7.1. 颜色规范

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/meijuziduanbiaoqianbiaojixingshizhanxian_image1.405b5792.png)

### [](#72-代码设置--配置相应的icon标签status标记)7.2. 代码设置- 配置相应的icon(标签)/status(标记)

aa_enum表中，找到对应的enumtype，找到icon这一列，列内容配置为对应的色值，支持的色值见下表：

{

 "enumArray": [

 {

 "nameType": "text",

 "icon": "cyanstate", // 标签(优先级比标记高)

 "cDataRule": null,

 "value": "开立",

 "resid": "P_YS_SCM_PU_0000028170",

 "key": "0"

 },

 {

 "nameType": "text",

 "icon": "bluestate",

 "cDataRule": null,

 "value": "审核中",

 "resid": "P_YS_SCM_PU_0000028406",

 "key": "3"

 },

 {

 "nameType": "text",

 "icon": "orangestate",

 "cDataRule": null,

 "value": "付款待确认",

 "resid": "P_YS_SCM_PU_0000028400",

 "key": "2"

 },

 {

 "nameType": "text",

 "icon": "greenstate",

 "cDataRule": null,

 "value": "付款成功",

 "resid": "P_YS_SCM_PU_0000028093",

 "key": "1"

 },

 {

 "nameType": "text",

 "icon": "redstate",

 "cDataRule": null,

 "value": "未付款",

 "resid": "P_YS_SCM_PU_0000028400",

 "key": "2"

 },

 {

 "nameType": "text",

 "icon": "graystate",

 "cDataRule": null,

 "value": "取消",

 "resid": "P_YS_SCM_PU_0000028400",

 "key": "2"

 }

 ],

}

// 标记使用status字段，status字段配在枚举表的扩展字段cExtProps里，格式是json字符串格式

{"status":"error"}

**注意：配置完成后需要清redis缓存。**

标签效果：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/meijuziduanbiaoqianbiaojixingshizhanxian_image2.0674d320.png)

||icon||说明（对应效果图颜色）|
||cyanstate||流程起始、开立、生成|
||bluestate||部分发货、待收货、待发货、进行中、查验中、报销中、审核中|
||orangestate||部分付款、付款待确认、警示、提醒、驳回到制单|
||greenstate||付款成功、完成、已报销、已审核|
||redstate||未付款、失败、禁止、错误、超期、查验失败、票据异常、查验存疑|
||graystate||取消、失效、终止态|

标记：支持传递关键字error、success、dark、warning，或者直接传递颜色red、#ff00ff。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/meijuziduanbiaoqianbiaojixingshizhanxian_image3.b1fe8651.png)

效果

![](data:image/png;base64,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)

||status||说明|
||error||已停用|
||success||已启用|
||dark||未发布|
||warning||警示|

## [](#8-faq)8. FAQ

### [](#81-如何支持select分组)8.1. 如何支持select分组？

![](data:image/jpeg;base64,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)

- 

cStyle配置groupSelect为true

- 

通过listModel.setDataSource给枚举重新设值

- 

枚举数据结构为（其中groupLabel、groupValue 是必须的）

[{

 value: "0",

 text: "开立",

 nameType: "text",

 groupLabel: "分组1",

 groupValue: "group1"

}, {

 value: "3",

 text: "审核中",

 nameType: "text",

 groupLabel: "分组2",

 groupValue: "group2"

}, {

 value: "4",

 text: "完成",

 nameType: "text",

 groupLabel: "分组2",

 groupValue: "group2"

}, {

 value: "1",

 text: "已审核",

 nameType: "text",

 groupLabel: "分组3",

 groupValue: "group3"

}]

### [](#82-如何配置枚举项帮助提示)8.2. 如何配置枚举项帮助提示？

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Selectxuanzekuang_image3.4b9eab23.png)

在领域aa_enum枚举项表中的cExtProps字段中配置如下字段可实现上面两种模式:

- describe存在：如图一
- showIcon为true并且describe存在：如图二
- showIcon为true并且describe、icon存在：如图二（可自定义帮助提示图标）

### [](#83-如何动态控制枚举项的显示隐藏)8.3. 如何动态控制枚举项的显示隐藏

listModel.setRowStates({"0": {visible:false}, "1": {visible:true}, "2": {visible:true}}); // "0" "1"指的是枚举的value值