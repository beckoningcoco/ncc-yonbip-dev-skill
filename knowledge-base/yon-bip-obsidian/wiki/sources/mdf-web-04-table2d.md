---
title: "二维表 Table2D"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-table2d"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 二维表 Table2D

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-table2d | 所属：Web组件

# [](#二维表-table2d)二维表 Table2D

## [](#1-功能说明)1. 功能说明

普通表格展现可以称为一维表，二维表是表格的另外一种展现形式。作用是方便用户录入关键数据，看下面效果图可以知道二维表的数据格式。MDF框架通过简单配置即可从一维表变成二维表。

## [](#2-效果展示)2. 效果展示

一维表
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Table2Derweibiaoimage1.5f2c5000.png)
切换成二维表
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Table2Derweibiaoimage2.bfd1405b.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Table2Derweibiaoimage3.4e77ef4d.png)

## [](#3-配置ui)3. 配置UI

首先配置出一个一维表格，参考 [Table
表格](file:////pages/viewpage.action%3fpageId=22513430)

||属性名称||值类型||值||属性说明|
||cControlType||string||table||组件类型|

**cStyle配置**

||属性名称||值类型||值||属性说明|
||support2D||boolean||true||表格是否支持2D(二维表模式下默认收集全量数据，可以设置collectDirty:true，则是收集脏数据)|
||collectDirty||boolean||true||二维表模式下，收集脏数据时收集脏数据(二维表默认收集全量数据)|
||show2D||boolean||true||是否展现二维表，不配展示一维表|
||support2DConfig||object||{ colFieldCondition: [{}], items: [{}] // 行标题 列标题 交叉点 }||不配的话会调用/report/getTotalSetting，配置结构为： colFieldCondition：为列标题渲染动态列，必须是参照。参照返回的数据结构为{recordList:[]}，不支持直接返回数组。items：[{fieldname: 'xxx', groupType: '0'}]   放所有字段，包括行标题 列标题 交叉点。groupType=0 行标题 groupType=1 列标题 groupType=2 交叉点showOnHeader交叉点里字段是否显示在表格列中默认不显示|
||hide2DSubRowSum||boolean||false||隐藏行小计|
||hide2DSum||boolean||false||是否隐藏汇总信息（列合计，行小计，行合计）|
||showT2DColumnSetting||boolean||||是否开启二维表排序（默认false不开启）|
||refresTable2DSpeed||boolean||fasle||性能优化开关 渲染性能  推荐开|
||useSort||boolean||false||复合列与动态列是否开启排序，与showT2DColumnSetting一起使用|

### [](#31-设计器配置)3.1. 设计器配置

在设计器中选择二维表，属性栏配置配置交叉点

### [](#32-扩展脚本配置)3.2. 扩展脚本配置

扩展脚本配置 **分组项，行标题，列标题，交叉点，指标项**

默认的config配置

{

 rowItemData: { // 行标题

 fieldNames: ['a1','a2'] // 二维表会根据这几个字段值排列组合,生成二维数据 

 fileValues: [[1,2],[22,33]] // 组合数据 长度为二维表数据长度

 },

 colItemData: { // 列标题

 fieldNames: [], // fieldNames: ["project_name", "requirementDate"], //币种编码 单据日期

 fieldValues: [], // fieldValues: [["CNY", "2019-08-23"], ["CNY", "2019-09-09"], ["用", "2019-08-16"], ["用", "2019-08-22"], ["用", "2019-08-28"], ["用", "2019-09-09"]]

 fieldMultiCol: [],// 多层栏目显示字段 多级表头

 fieldObjs: {}

 },

 crossItemData: { //交叉点

 fieldNames: [] // 数量 ["qty","price"]

 },

 measureItemData: ['a11','a22'] // 指标项，单纯将一维表的列显示到二维表上 如果不传默认将所有其他一维字段显示到二维表上。位置只能位于动态列后面。匹配到多行时取第一行数据，如果配置cSumType=(max,min,avg,count,sum)可以进行聚合。

}

**扩展修改（）**

例如：

// 如果support2DConfig配置全，Table2DEvent_SetConfig

gridModel.on('Table2DEvent_SetConfig', function (args) {

 args.config.rowItemData.fieldNames = ['free4'];

 args.config.measureItemData = ['free4111111'];

 args.config.colItemData = {

 fieldNames: ['free5'],

 fieldValues: [['x','xxl','xxxl','l']],

 fieldMultiCol: ['free5']

 };

 args.config.crossItemData = {

 fieldNames: ['qty']

 }

})

 

// 分组项（可不配，不配就不展示分组项）

gridModel.on('Table2DEvent_SetGroupFields', function (args) {

 // 三个都得配 且不能一样

 args.groupFields.nameField = 'productName';

 args.groupFields.codeField = 'realProductCode';

 args.groupFields.idField = 'productId';

})

## [](#4-参考案例)4. 参考案例

销售订单详情页

## [](#5-扩展api)5. 扩展API

### [](#51-table2dbtnclick)5.1. table2DBtnClick

**action配table2DBtnClick**，可以来回切换二维表和一维表

### [](#52-table2devent_beforedelgroup)5.2. Table2DEvent_beforeDelGroup

分组项删除前置事件

//阻止删除

gridModel.on('Table2DEvent_beforeDelGroup', function(){

 return false;

})

### [](#53-table2devent_beforedelrow)5.3. Table2DEvent_beforeDelRow

二维表删除前置事件

//阻止删除

gridModel.on('Table2DEvent_beforeDelGroup', function(){

 return false;

})