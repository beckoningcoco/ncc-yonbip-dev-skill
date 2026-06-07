---
title: "通过按钮弹出参照"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/02-tongguoanniutanchucanzhao"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 通过按钮弹出参照

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/02-tongguoanniutanchucanzhao | 所属：指南

# [](#通过按钮弹出参照)通过按钮弹出参照

本例是通过按钮弹出参照，理论上任何可以监听事件的操作都可以完成本例逻辑

## [](#1-弹出页面已有的参照)1. 弹出页面已有的参照

**适用范围：**适用于卡片页主表的参照字段

### [](#11-扩展逻辑)1.1. 扩展逻辑

// 获取参照实例

const referModel = viewModel.get("参照CItemName")

referModel.setVisible(false);

 

// 按钮事件中弹出参照

viewmodel.get('按钮').on('click', function(data){

 referModel.browse(true); // 参照弹出

})

 

// 参照值改变后事件

referModel.on('afterValueChange',function(data){

 console.log(data.value); // 参照选择后的值

})

## [](#2-弹出页面不存在的参照)2. 弹出页面不存在的参照

**适用范围：**适用于列表页、子表参照字段和页面上没有的参照

### [](#21-模板配置)2.1. 模板配置

**1、 Excel方式：**

在excel中新增一个div容器，容器内配置一个你需要弹出的参照，billItem_base表的bVmExclude配置为1

**2、YonBuillder设计器方式：**

在设计器里拖一个空容器，容器拖一个你需要弹出的参照，参照的bVmExclude属性设置为1

### [](#22-扩展逻辑)2.2. 扩展逻辑

在扩展脚本中监听你配置按钮的click方法，然后调参照的弹出方法即可，代码如下：

// 以下代码需要在扩展脚本中实现

// 实例化参照模型

var transferReferModel = new cb.models.ReferModel({

 cRefType: 'ucfbasedoc.bd_bankcard', // 弹出参照的refCode

 multiple: 'true', // 是否多选

 domainKey: process.env.__DOMAINKEY__

});

// TransferTable就是你单据上配置的那个参照的cItemName

viewmodel.addProperty('TransferTable', transferReferModel); // 将这个参照添加到单据的viewmodel中

transferReferModel.setVisible(false); // 将页面配置的参照隐藏

 

// 按钮事件中弹出参照

viewmodel.get('btnAllocateUser').on('click', function (data) {

 // ...

 // 如果参照需要回显，这里还需要获取参照已选值，执行参照的setValue方法给参照赋值，比如: transferReferModel.setValue([{id:**,name:**}])

 transferReferModel.browse(true);// 参照弹出

})

 

// 参照值改变后事件

transferReferModel.on('afterValueChange', function (data) {

 console.log(data.value); // 参照选择后的值

})

## [](#3-常见问题)3. 常见问题

### [](#31-只调用了getrefmeta没有调用getrefdata)3.1. 只调用了getRefMeta没有调用getRefData

   
1、检查下getRefMeta接口是否报错，如果有报错再检查下domainKey及refCode及serviceCode是有有误

   
2、检查控制台js是否有报错，如果有报错，检查下getRefMeta返回的参照模板数据是否正常

### [](#32-弹出参照无数据)3.2. 弹出参照无数据

  1、一般需要找参照提供方处理

### [](#33-子表参照字段不支持通过按钮弹出)3.3. 子表参照字段不支持通过按钮弹出

子表参照字段没法通过按钮弹出，因为子表参照字段默认是浏览态，只有点击时，才是编辑态，无法通过按钮弹出