---
title: "日期范围 PredicatedatePicker"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/01-predicatedatepicker"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 日期范围 PredicatedatePicker

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/01-predicatedatepicker | 所属：移动组件

# [](#日期范围-predicatedatepicker)日期范围 PredicatedatePicker

## [](#1-功能说明)1. 功能说明

此组件用来控制日期范围。

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Predicatedatepickerriqifanwei-yidongduan-image1.5d7f4a9b.jpeg)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Predicatedatepickerriqifanwei-yidongduan-image2.cb87f9dd.png)

## [](#3-实现方式)3. 实现方式

### [](#31-完善字段协议字段协议-标准协议如下)3.1. 完善字段协议字段协议 标准协议如下

{

 "filtersId": 143567161,

 "allowUpdateCompare": 0,

 "itemTitle": "单据日期",

 "precision": 0,

 "refType": 0,

 "cRefId": 0,

 "ctrlType": "predicatedatepicker",

 "multSelect": 0,

 "isMasterOrg": false,

 "itemName": "vouchdate",

 "isCommon": 0,

 "rangeInput": 1,

 "id": 126455705,

 "enumArray": "[\n {\n \"nameType\": \"text\",\n \"icon\": null,\n \"cDataRule\": null,\n \"value\": \"今天\",\n \"resid\": \"UID:P_SCM-SCMSA-UI_17E9879005403737\",\n \"key\": \"0\"\n },\n {\n \"nameType\": \"text\",\n \"icon\": null,\n \"cDataRule\": null,\n \"value\": \"昨天\",\n \"resid\": \"UID:P_SCM-SCMSA-UI_17E987900540372E\",\n \"key\": \"-1\"\n },\n {\n \"nameType\": \"text\",\n \"icon\": null,\n \"cDataRule\": null,\n \"value\": \"近7天\",\n \"resid\": \"UID:P_SCM-SCMSA-UI_17E9879005403734\",\n \"key\": \"-7\"\n },\n {\n \"nameType\": \"text\",\n \"icon\": null,\n \"cDataRule\": null,\n \"value\": \"近30天\",\n \"resid\": \"UID:P_SCM-SCMSA-UI_17E9879005403731\",\n \"key\": \"-30\"\n },\n {\n \"nameType\": \"text\",\n \"icon\": null,\n \"cDataRule\": null,\n \"value\": \"近3月\",\n \"resid\": \"UID:P_FW_174E6C8C0528034F\",\n \"key\": \"-90\"\n },\n {\n \"nameType\": \"text\",\n \"icon\": null,\n \"cDataRule\": null,\n \"value\": \"本周\",\n \"resid\": \"UID:P_FW_174E6C8C05280A49\",\n \"key\": \"thisWeek\"\n },\n {\n \"nameType\": \"text\",\n \"icon\": null,\n \"cDataRule\": null,\n \"value\": \"本月\",\n \"resid\": \"UID:P_FW_174E6C8C05280A4C\",\n \"key\": \"thisMonth\"\n },\n {\n \"nameType\": \"text\",\n \"icon\": null,\n \"cDataRule\": null,\n \"value\": \"本季\",\n \"resid\": \"UID:P_FW_1760C1AE04400090\",\n \"key\": \"thisSeason\"\n },\n {\n \"nameType\": \"text\",\n \"icon\": null,\n \"cDataRule\": null,\n \"value\": \"本年\",\n \"resid\": \"UID:P_FW_174E6C8C05280A43\",\n \"key\": \"thisYear\"\n }\n]",

 "compareLogic": "between",

 "extendField": "{\n \"groupSelect\": false,\n \"subuitype\": \"flat\",\n \"topShow\": true,\n \"allowClear\": false\n}",

 "mustInput": 1,

 "defaultVal1": "-30", // 默认值

 "cShowCaption": "单据日期",

 "bSelfDefine": false,

 "descValue": 0,

 "dataSource": "vouchdate",

 "isSys": 1,

 "enumString": "{\n \"0\": \"今天\",\n \"-1\": \"昨天\",\n \"-7\": \"近7天\",\n \"-30\": \"近30天\",\n \"-90\": \"近3月\",\n \"thisWeek\": \"本周\",\n \"thisMonth\": \"本月\",\n \"thisSeason\": \"本季\",\n \"thisYear\": \"本年\"\n}"

}

### [](#32-扩展方式实现一般用在设计器单据种)3.2. 扩展方式实现（一般用在设计器单据种）

- 查询区对应字段设置默认值默认子defaultVal1  例如"defaultVal1":
"-30", 默认值为近30天

- 

写扩展代码 设置datasource

const dataSource = [

 {

 "value": "0",

 "text": "今天",

 "nameType": "text"

 },

 {

 "value": "-1",

 "text": "昨天",

 "nameType": "text"

 },

 {

 "value": "-7",

 "text": "近7天",

 "nameType": "text"

 },

 {

 "value": "-30",

 "text": "近30天",

 "nameType": "text"

 },

 {

 "value": "-90",

 "text": "近3月",

 "nameType": "text"

 },

 {

 "value": "thisWeek",

 "text": "本周",

 "nameType": "text"

 },

 {

 "value": "thisMonth",

 "text": "本月",

 "nameType": "text"

 },

 {

 "value": "thisSeason",

 "text": "本季",

 "nameType": "text"

 },

 {

 "value": "thisYear",

 "text": "本年",

 "nameType": "text"

 }

]

viewModel.on('afterInitCommonViewModel', () => {

 const filterViewModel = viewModel.getCache('FilterViewModel');

 filterViewModel.on('afterInit', () => {

 const dateModel = filterViewModel.get('C_vouchdate').getFromModel();

 dateModel.setDataSource(dataSource)

 })

})

## [](#4-基本属性)4. 基本属性

||属性名称||属性含义||值类型||属性说明|
||属性名称||属性含义||值类型||属性说明|
||subuitype||显示类型||string||''(默认按效果图1显示)'flat' // 平铺显示(效果图2)|
||cStyle||扩展属性||string||所有的扩展属性都配在这个属性中|
||defaultValue1||默认值||string||pb_meta_filter_item表中的默认值，对当前单据中所有方案均生效（common表没有设置默认值的情况下），新增方案时可携带到新方案中|

**注意：**

- 此处的属性对应**billitem_base**表中的字段，值类型为前端类型，可能与数据库中不匹配，如：前端的bIsNull是true/false，在数据库中是0/1

### [](#41-在查询区中)4.1. 在查询区中

||属性名称||属性含义||值类型||属性说明|
||属性名称||属性含义||值类型||属性说明|
||extendField||扩展属性||string||所有的扩展属性都配在这个属性中|

## [](#5-扩展属性-cstyle)5. 扩展属性 cStyle

单据在cStyle中、查询区在extendField中配置属性

||属性名称||属性含义||值类型||属性说明|
||属性名称||属性含义||值类型||属性说明|
||groupSelect||按时间维度分组展示(对应问题2中的效果图)||boolean||false 参考下面常见问题1|

**注意：**

- 

此处的属性对应**pb_meta_filter_item**表或**pb_filter_solution_common**表中的字段，值类型为前端类型，可能与数据库中不匹配，如：前端的bIsNull是true/false，在数据库中是0/1

- 

优先使用**pb_filter_solution_common**表中的值

### [](#51-faq)5.1. FAQ

- [pb_meta_filter_item]表的itemType配置为predicatedatepicker
，页面报错，查询区出不来？

检查下枚举cEnumType是否配置，并且是否配置正确。

- 如何支持按时间维度分组展示？

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Predicatedatepickerriqifanwei-yidongduan-image3.539a0b4d.jpeg)

- 

cStyle配置groupSelect为true，并且subuitype为flat

- 

枚举数据结构为

[

 {

 value: "0",

 text: "今天",

 nameType: "text",

 groupLabel: "日",

 groupValue: "group1"

 },

 {

 value: "-1",

 text: "昨天",

 nameType: "text",

 groupLabel: "日",

 groupValue: "group1"

 },

 {

 value: "-7",

 text: "近7天",

 nameType: "text",

 groupLabel: "日",

 groupValue: "group1"

 },

 {

 value: "thisWeek",

 text: "本周",

 nameType: "text",

 groupLabel: "周",

 groupValue: "group2"

 },

 {

 value: "lastWeek",

 text: "上周",

 nameType: "text",

 groupLabel: "周",

 groupValue: "group2"

 },

 {

 value: "thisSeason",

 text: "本季",

 nameType: "text",

 groupLabel: "季",

 groupValue: "group3"

 },

 {

 value: "lastSeason",

 text: "上季度",

 nameType: "text",

 groupLabel: "季",

 groupValue: "group3"

 },

]

### [](#52-扩展实现上述效果)5.2. 扩展实现上述效果

const dataSource = [

 {

 value: "0",

 text: "今天",

 nameType: "text",

 groupLabel: "日",

 groupValue: "group1"

 },

 {

 value: "-1",

 text: "昨天",

 nameType: "text",

 groupLabel: "日",

 groupValue: "group1"

 },

 {

 value: "-7",

 text: "近7天",

 nameType: "text",

 groupLabel: "日",

 groupValue: "group1"

 },

 {

 value: "thisWeek",

 text: "本周",

 nameType: "text",

 groupLabel: "周",

 groupValue: "group2"

 },

 {

 value: "lastWeek",

 text: "上周",

 nameType: "text",

 groupLabel: "周",

 groupValue: "group2"

 },

 {

 value: "thisSeason",

 text: "本季",

 nameType: "text",

 groupLabel: "季",

 groupValue: "group3"

 },

 {

 value: "lastSeason",

 text: "上季度",

 nameType: "text",

 groupLabel: "季",

 groupValue: "group3"

 },

]

const dateModel = viewModel.getCache('FilterViewModel').get('date').getFromModel()

dateModel.setDataSource(dataSource) // 设置枚举

dateModel.setValue({value1: '2024-04-01 00:00:00', value2: '2024-06-30 23:59:59', predicateValue: 'thisSeason'}) // 设置默认值 已本季为例

其中groupLabel、groupValue 是必须的