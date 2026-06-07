---
title: "单据模型 ViewModel"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/03-view-model"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 单据模型 ViewModel

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/03-view-model | 所属：API

# [](#单据模型-viewmodel)单据模型 ViewModel

## [](#1-生命周期事件)1. 生命周期事件

执行顺序从前到后，其它顺序规则，如扩展脚本加载顺序、模板加载顺序、交互规则公式执行的顺序等查看《[框架能力相关规则](#/introduce/02-mdf-framework-rule)》

### [](#11-afterinit)1.1. afterInit

说明：页面初始化完成事件

viewModel.on('afterInit', function(data){

})

### [](#12-afterloadmeta)1.2. afterLoadMeta

说明：单据的UI元数据已经返回
afterLoadMeta事件为异步事件，可返回一个promise

viewModel.on('afterLoadMeta', function(data){

 // 隐藏一个主表字段

 this.get(propertyName).setVisible(false)

})

返回promise示例：

viewmodel.on("afterLoadMeta", function (data) {

 const promise = new cb.promise();

 // 根据请求返回数据处理某些字段显示隐藏

 const proxy = viewmodel.setProxy({

 ensure: {

 url: '/intrade/getStoreId',

 method: 'POST'

 }

 });

 const params = {}

 proxy.ensure(params, function (err, result) {

 if (err) {

 cb.utils.alert(err.message, 'error');

 return;

 }

 if (result) {

 isStore = true;

 storeId = result;

 changeStoreStatus(); // 设置某些字段显示隐藏

 }

 promise.resolve()

 

 })

 return promise;

})

### [](#13-aftermount)1.3. afterMount

说明：页面容器渲染完成，在afterLoadMeta之前调用

viewmodel.on('afterMount', function(){

// 页面mount完成，无形参，可直接操作模型

})

### [](#14-beforesetstate)1.4. beforeSetState

viewModel.on('beforeSetState', function(states){

})

### [](#15-aftersetstate)1.5. afterSetState

viewModel.on('afterSetState', function(states){

})

### [](#16-afterloaddata)1.6. afterLoadData

说明：单据的业务数据已经返回且已经渲染到页面上，afterLoadData为同步事件

viewModel.on('afterLoadData', function(){

 // 给单据主表的字段赋值

 viewModel.get(propertyname).setValue(111)

})

### [](#17-afterrule)1.7. afterRule

说明：动作规则执行完事件

viewmodel.on('afterRule', function(){

})

## [](#2-其它过程事件)2. 其它过程事件

### [](#21-beforesetmode)2.1. beforeSetMode

说明：页面状态改变前事件

viewmodel.on('beforeSetMode', function(args){

 args.oldValue // 原状态

 args.newValue // 新状态

})

### [](#22-modechange)2.2. modeChange

说明：页面状态改变事件（仅卡片页，列表页面无状态），mode=edit
编辑态，mode=browser 浏览态，mode=add 新增态

viewmodel.on('modeChange', function(){

})

### [](#23-beforechangemasterorg)2.3. beforeChangeMasterOrg

说明：主组织切换前的生命周期

viewmodel.on('beforeChangeMasterOrg', function(){

})

### [](#24-aftermasterorgchange)2.4. afterMasterOrgChange

说明：主组织切换后的生命周期

viewmodel.on('afterMasterOrgChange', function(){

})

### [](#25-beforevalidate)2.5. beforeValidate

说明：页面校验方法调用后，开始校验前的生命周期

viewmodel.on('beforeValidate', function(){

 return false;// 阻止后续校验动作

})

### [](#26-beforetreeselect)2.6. beforeTreeSelect

说明：树节点选择前置事件

viewmodel.on('beforeTreeSelect', function(args){

 console.log(args)

})

### [](#27-return)2.7. return

说明：页面变更事件

viewmodel.on('return',function(data){

 console.log('return', data.data.action === 'isCloseAction');

})

**data.data.action值说明：**

||data.data.action值||说明|
||activeTab||激活页签|
||isRefresh||刷新页签|
||isCloseAction||关闭页签|
||isReOpen||重新打开页签|

## [](#3-按钮前后置事件)3. 按钮前后置事件

所有按钮如果配置了动作action，都可以添加前后置事件（另：所有带动作action的按钮都会记录操作日志）

**规则：**action前加 before 或 atfer，action首字母改成大写

**示例：**新增 add，事件为 beforeAdd  afterAdd

## [](#4-流程服务事件)4. 流程服务事件

《[审批流事件全部](#/guides/17-shenpiliushijianquanbu)》

## [](#5-api方法)5. API方法

### [](#51-getdomainkey)5.1. getDomainKey

说明：获取domainKey，继承自BaseModel，所有Model都可以使用此方法

const domainKey = viewmodel.getDomainKey()

### [](#52-getrealservicecode)5.2. getRealServiceCode

说明：获取真实的serviceCode

const serviceCode = viewmodel.getRealServiceCode()

### [](#53-getviewmeta)5.3. getViewMeta

说明：获取当前单据模板

const viewmeta = viewmodel.getViewMeta()

### [](#54-getsubpageviewmodels)5.4. getSubPageViewModels

说明：获取所有子单据模型，继承自ContannerModel

const subModels = viewmodel.getSubPageViewModels()

### [](#55-getsubpageviewmodel)5.5. getSubPageViewModel

说明：获取指定billno的单据模型，继承自ContannerModel

const subModel = viewmodel.getSubPageViewModel(billno)