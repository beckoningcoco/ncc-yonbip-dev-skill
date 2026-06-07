---
title: "参照组件“新增”按钮配置文档"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/05-canzhaoshejishuoming"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 参照组件“新增”按钮配置文档

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/05-canzhaoshejishuoming | 所属：指南

# [](#帮助中心功能介绍)帮助中心功能介绍

## [](#1-设计原理)1. 设计原理

meta字段中的cControlType属性为‘refer’会自动解析成参照输入框组件。以下是具体的实现原理
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/canzhaoshejishuomingimage1.8eef85cd.png)

参照字段说明：

||字段||默认值||元数据字段|
||保存值valueField||'id'||refReturn|
||显示值textField||name||displayname|
||显示值直接的分割符号separator||,||JSON.parse(data.cStyle).separator|

## [](#2-参照类型)2. 参照类型

- refer：

table
- tree
- treetable

- combobox：

ListRefer
- TreeRefer

## [](#3-外部获取model方式)3. 外部获取model方式

- 先获取页面输入框code值中对应的referModel
- 获取模态框的对应的referViewModel
- 获取模态框中的组件model

// 输入框对应的参照referModel

let referModel = viewmodel.get('name');//name为当前组件的code值

let referViewModel = referModel.getCache('vm');

//获取模态框中的tree组件

let treeModel = referViewModel.get('tree');

//获取模态框中的table组件

let tableModel = referViewModel.get('table');

//获取模态框中的搜索框组件

let searchBox = referViewModel.get('searchBox');

## [](#4-请求metadata信息)4. 请求meta、data信息

请求的meta、data信息的地址都是固定的。

meta地址：'/uniform/pub/ref/getRefMeta'

data地址：'/uniform/bill/ref/getRefData'

## [](#5-参照的事件)5. 参照的事件

- afterBrowse： 点击参照框请求数据后的回调

eg，获取ReferViewMode，并进行一些事件处理

// 输入框对应的参照referModel

let nameRef = viewmodel.get('name');//name为当前字段

nameRef.on('afterBrowse',(params)=>{

 // 弹出参照对应的referViewModel

 const refViewModel = nameRef.getCache('vm'); 

 // 获取模态框中的参照

 const treeTableRef = refViewModel.get('tree');

 // 调用treeModel的方法

 treeTableRef.on('beforeSetDataSource',function(data=[]){

 console.log('**beforeSetDataSource****',data);

 

 })

})

注 ：获取模态框里面的组件参照步骤：

- 

获取输入框对应的referModel ；

- 

获取模态框对应的参照referViewModel，referModel.getCache('vm');

- 

获取模态框里面的组件参照，referViewModel.get('具体参照名称');获取树参照，名称就是tree,表格名称就是table

- beforeBrowse：点击参照框在请求数据之前的回调。可以在这个方法中设置获取参照数据的查询参数
eg:下面是省市直接的参照联动场景

// 在城市参照弹出之前，获取省参照的value，通过setFilter将value存放到过滤条件中（在城市参照获取城市列表时，会通过getFilter()获取value，作为过滤参数传到服务端）

 viewmodel.get("bankcity").on('beforeBrowse', function (data) {

 var provinceValue;

 if(!viewmodel.get("bankprovince").getValue()){

 cb.utils.alert("请选择开户省");

 return false;

 }else{

 provinceValue = viewmodel.get("bankprovince").getValue();

 }

 var condition = {

 "isRefreshData": true,

 "parentId":provinceValue,

 "province":provinceValue

 };

 this.setFilter(condition);

 });

- setValue: 设置参照选中的内容即某条数据，类型Object。
- setFilter 设置过滤项内容。这个内容会在请求具体数据中使用
- beforeValueChange 点击确认按钮选中参照前回调函数
- afterValueChange 点击确认按钮选中参照后回调函数