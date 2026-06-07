---
title: "级联选择 Cascader"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-cascader"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 级联选择 Cascader

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-cascader | 所属：Web组件

# [](#级联选择-cascader)级联选择 Cascader

## [](#1-功能说明)1. 功能说明

此组件用来控制日期范围。

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Cascaderjilianxuanze_image1.94426389.png)

## [](#3-基本属性)3. 基本属性

### [](#31-在单据中)3.1. 在单据中

||属性名称||属性含义||值类型||属性说明|
||allowClear||支持清除||boolean||默认true，单选模式有效|
||bIsNull||是否必输||boolean||true-非必输，false-必输|
||bCanModify||是否可改||boolean||true-可改，false-不可改|
||defaultValue||默认值||string|||
||cStyle||扩展属性||string||所有的扩展属性都配在这个属性中|

**注意：**

- 此处的属性对应**billitem_base**表中的字段，值类型为前端类型，可能与数据库中不匹配，如：前端的bIsNull是true/false，在数据库中是0/1

## [](#4-扩展属性-cstyle)4. 扩展属性 cStyle

单据在cStyle中、查询区在extendField中配置属性，如：{"autoSize":true}

||属性名称||属性含义||值类型||属性说明|
||readOnly||只读||boolean||true-只读，false-非只读|
||disabled||禁用（置灰）||boolean||true-置灰，false-正常|
||className||扩展class类名||string||用来处理扩展样式|
||popupClassName||自定义浮层类名||string|||
||popupPlacement||浮层预设位置||string||默认bottomLeft，可选bottomRight、topLeft、topRight|
||expandTrigger||菜单展开方式||string||默认hover|
||showSearch||是否显示搜索框||boolean||默认false，true-显示|
||size||输入框大小||string||默认default，可选small、large|

## [](#5-使用说明)5. 使用说明

以省市区级联参照为例，页面billitem_base中配置字段的cControlType为cascader,如cName为region

viewmodel.on('afterInit', function(args) {

 viewmodel.removeProperty('region');

 var regionModel = new cb.models.TreeModel({

 keyField: 'id',

 titleField: 'name',

 dataSourceMode: 'remote', // remote为请求数据源，local为本地数据源

 needCollect: false, // 是否需要收集

 bIsNull: true, // 是否可空

 changeOnSelect: true, // true为逐级选择，不传或者false为仅选末级

 bVmExclude: 1,

 });

 viewmodel.addProperty('region', regionModel);

 regionModel.setDataSource({

 url: "/region/getAllregion",

 method: "POST",

 });

})

## [](#6-控制示例)6. 控制示例

[SimpleModel简单模型](#/api/02-simple-model)

## [](#7-在卡片中)7. 在卡片中

想要控制组件的状态，需要先拿到组件的模型，在MDF框架中，每个组件都会绑定一个模型，我们可以在扩展脚本中通过**viewmodel.get(cItemName) 的方式获取到想要操作组件的模型，利用模型的API进行组件的控制，其中cItemName为该组件对应**billitem_base表中的cItemName

**示例：**

// 设置条件隐藏

viewmodel.get(cItemName).setVisible(false)

// 设置条件只读

viewmodel.get(cItemName).setReadOnly(true)

// 设置条件禁用

viewmodel.get(cItemName).setDisabled(true)

## [](#8-级联组件支持逐级选择)8. 级联组件支持逐级选择

### [](#1-场景描述)1. 场景描述

选择省市区时，想要只选择到省级别或者市级别。

### [](#2-代码实现)2. 代码实现

const model = viewModel.get('xxx');// xxx是省市区组件对应的code

model.setState({changeOnSelect: true});