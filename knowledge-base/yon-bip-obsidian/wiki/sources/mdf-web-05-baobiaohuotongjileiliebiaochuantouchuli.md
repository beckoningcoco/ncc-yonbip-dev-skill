---
title: "--报表或统计类列表穿透处理"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-baobiaohuotongjileiliebiaochuantouchuli"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# --报表或统计类列表穿透处理

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-baobiaohuotongjileiliebiaochuantouchuli | 所属：Web组件

# [](#报表或统计类列表穿透处理)报表或统计类列表穿透处理

## [](#1-场景描述)1. 场景描述

1.从报表页面点击某字段值，需要跳转到对应的列表页面，并携带相关的查询方案及查询条件。

2.从某个统计类列表中点击某字段值，需要跳转到对应的列表页面，并携带相关的查询方案及查询条件。

## [](#2-代码实现)2. 代码实现

点击具体字段值时，通过打开新页签的方式打开对应的列表页面

if (window.jDiwork) {

 let dt = {

 billtype: "voucherlist",

 billno: "xxx_xxxxxlist",//需要打开的列表的billno

 };

 window.jDiwork.openService("xxx", dt, {//xxx是约定的字段，需要唯一识别，可以用billno

 data: { carryParams: { param1: value1, param2: value2} },//param1、param2等可以以对象的形式传参

 });

} else {

 console.log("不支持打开新页签");

}

处理对应列表的查询方案、查询参数默认值等。
在对应的列表的查询方案的扩展的xxx_filterVM.Extend.js中，做如下处理：

// 在对应的afterInit方法中，做参数相关解析

viewmodel.on("afterInit", function(data) {

 if (window.jDiwork) {

 window.jDiwork.getData({

 serviceCode: "xxx", // 对应打开该列表时，约定好的唯一标识

 },

 (args) => {

 let schemeList = viewmodel.getCache("schemeList");// 获取查询方案列表

 if (args.carryParams) {

 // 如果需要修改默认的查询方案名称，则需要做如下处理。

 // 如跳转时，需要将查询方案默认改成全部，需要在对应的查询方案表pb_filter_solution中的cExtProps配置为all，然后在下面的代码中做对应

 let allSoulution = schemeList.find((element) => (element.cExtProps && JSON.parse(element.cExtProps).all));// 找到对应的solution

 if (allSoulution && allSoulution.id !== viewmodel.getCache("schemeId")) {

 viewmodel.setCache("schemeId", allSoulution.id);// 修改前端cache中的方案id

 viewmodel.get("schemeName").setValue(allSoulution.solutionName);// 修改前端显示的方案名称

 }

 viewmodel.get("reset").execute("click", { disabledSearch: true });// 重置所有的查询条件的初始值，但不执行搜索

 const param1 = args.carryParams.param1;// 获取传过来的条件参数

 if (param1) {

 viewmodel.get("xxx").getFromModel().setValue(param1.xxx);// 对默认的查询条件进行赋值

 }

 }

 // 执行搜索

 const schemeId = viewmodel.getCache("schemeId");

 viewmodel.get("search").fireEvent("click", { solutionid: schemeId });

 }

 );

 }

}