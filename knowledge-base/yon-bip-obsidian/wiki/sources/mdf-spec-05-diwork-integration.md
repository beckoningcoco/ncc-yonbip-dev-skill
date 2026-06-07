---
title: "与工作台集成"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/05-diwork-integration"
section: "协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 协议]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 与工作台集成

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/05-diwork-integration | 所属：协议

# [](#与工作台集成)与工作台集成

## [](#1-磁贴列表组件)1. 磁贴列表组件

工作台磁贴嵌入MDF列表单据

### [](#11-效果)1.1. 效果

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yugongzuotaijichengimage1.a492d247.png)

### [](#12-方法)1.2. 方法

#### [](#121-cbcngridrender)1.2.1. [cb.cn](http://cb.cn).grid.render

函数：

**函数名**

cb.cn.grid.render(params,dom)

参数：

**params: Object**

同原有的cb.render的参数类似，接收类型为对象

||参数||类型||备注||说明|
||billtype||String||必传||单据类型|
||billno||String||必传||单据号|
||domainKey||String||必传||领域domainKey|
||serviceCode||String||必传||容器隔离Code|
||diworkCode||String||必传||容器隔离Code|
||isWidget||Boolean||必传true||磁贴来源组件|
||params||Object||可选||参数原有cb.render里的|
||widgetCondition||Object||可选||默认渲染列表组件查询条件，详见下方|
||widgetCheckFields||Array||可选||渲染表格显示的字段，详见下方|
||widgetTitle||Object||可选||磁贴标题，支持文本和多语对象，显示当前语种|
||widgetButtons||Array||可选||磁贴右上角操作按钮，切换、添加、更多|

widgetCondition

- 列表默认查询条件

widgetCheckFields

- 列表默认显示字段

该值为下方的[cb.cn](http://cb.cn).grid.getColumnSetting对应，返回值与当前字段值对应关系

**dom: DOMElement**

渲染的HTMLElement，指document.getElement()

### [](#13-示例代码)1.3. 示例代码

**渲染磁贴MDF列表**

cb.cn.grid.render({

 "billtype": "voucherlist",

 "billno": "st_purchaseorderlist",

 "domainKey": "upu",

 "serviceCode": "st_purchaseorderlist",

 "diworkCode": "st_purchaseorderlist",

 "isWidget": true,

 "widgetCondition": [],

 "params": {

 "query": {

 "locale": "zh_CN",

 "serviceCode": "st_purchaseorderlist",

 "refimestamp": "1649763765664"

 }

 }

}, document.getElementById('st_purchaseorderlist'));

## [](#2-列选择组件)2. 列选择组件

该组件用于设计器在设计磁贴表格组件的字段选择

### [](#21-效果)2.1. 效果

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yugongzuotaijichengimage2.e0f76d0f.png)

### [](#22-方法)2.2. 方法

[cb.cn](http://cb.cn).grid.getColumnSetting

cb.cn.grid.getColumnSetting(params,dom)

参数：

**params**

以下参数是请求表格字段数据必备参数缺一不可

||参数||类型||备注||说明|
||billNo||String||必传||单据号|
||tplid||Number||可选，默认0||模板ID|
||groupCode||String||必传||表格cGroupCode，调用cb.cn.grid.getGridGroupCode获取|
||isSum||Boolean||可选，默认true||表头、表头明细|
||domainKey||String||必传||领域domainKey|
||style||Object||可选||HTML样式|
||servceCode||String||可选||用来查找DOM容器获得宽高|
||callback||function||可选||选择字段回调数组，详见下方|
||checkFields||Array||可选||设置表格字段已选，callback回调与checkFields一致|

callback

- 选择字段后的回调函数，返回值是数组对象，里面包含字段的所有信息
- 字段内bShowIt表示true已选 或 false未选

**回调数据**

[{

 "cShowCaption": "单据日期",

 "bShowIt": true,

 "cItemName": "vouchdate"

}]

**dom**

渲染的HTMLElement，指document.getElement()

### [](#23-示例代码)2.3. 示例代码

**渲染磁铁字段选择组件**

cb.cn.grid.getColumnSetting({

 billNo: "st_purchaseorderlist",

 groupCode: "st_purchaseorderlist_grid",

 isSum: true,

 domainKey: "upu",

 callback: function(checkFields) {

 console.log("checkFields", checkFields);

 },

 checkFields: [{

 "bShowIt": true,

 "cShowCaption": "单据日期",

 "cItemName": "vouchdate"

 }, {

 "bShowIt": true,

 "cShowCaption": "订单编号",

 "cItemName": "code"

 }]

}, document.getElementById('dom'))

## [](#3-获取groupcode)3. 获取GroupCode

渲染字段选择组件前，需要获得groupCode，需要先调用本函数

### [](#31-方法)3.1. 方法

cb.cn.grid.getGridGroupCode

cb.cn.grid.getGridGroupCode(params)

参数

||参数||类型||说明|
||domainKey||String||必传domainKey|
||billNo||String||必传billNo|
||metaType||String||元数据类型，默认：voucherlist|

### [](#32-示例代码)3.2. 示例代码

**调用方式**

const groupCodeInfo = await cb.cn.grid.getGridGroupCode({

 domainKey:'upu',

 billNo: 'st_purchaseorderlist'

});

console.log(groupCodeInfo);

**返回值**

[{

 groupCode: "st_purchaseorderlist_grid",

 groupName: "采购订单列表区域"

}]

## [](#4-磁贴支持全字段搜索)4. 磁贴支持全字段搜索

开启前端特性开关： enableWidgetCondition

这个开关开启后，会将这个单据的查询区也配置到磁贴里，进行字段搜索（ * 磁贴和单据使用一套查询区配置）

 界面如图：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yugongzuotaijichengimage3.010cfb0e.png)