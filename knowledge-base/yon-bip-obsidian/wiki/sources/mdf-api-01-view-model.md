---
title: "编程模型整体设计"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/01-view-model"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 编程模型整体设计

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/01-view-model | 所属：API

# [](#编程模型整体设计)编程模型整体设计

## [](#1-概念和定义)1. 概念和定义

视图业务模型我们称之为ViewModel，它是对Model数据模型的组合和组装，实现对数据的联动和修改，视图业务模型分为两类：

- 一类是区块级视图业务模型
- 一类是页面级视图业务模型，处理通用CRUD业务逻辑。这里还可以分为框架默认提供和Node层自动生成的两种。

## [](#2-基类-basemodel)2. 基类 BaseModel

基础的属性和方法

## [](#3-模块级-viewmodel)3. 模块级 ViewModel

### [](#31-如何使用)3.1. 如何使用

// ViewModel 实例化

var tagReferModel = new cb.models.ReferModel({

 cRefType: 'aa_tagref',

 multiple: 'true'

});

 

// 调用 API

tagReferModel.setVisible(false)

 

// 绑定事件监听：加入商品标签的批量操作

viewmodel.on('addtag', function(args) {

 tagReferModel.setCache('args', args);

 tagReferModel.browse(true);

});

### [](#32-原理说明)3.2. 原理说明

以下为 ViewModel 的注册源码：

cb.models = {};

cb.models.register = function (modelType, func) {

 cb.models[modelType] = func(modelType);

};

MDF提供了全局的模块级 ViewModel 注册方式，具体 API 信息如下：

||name||type||描述|
||modelType||string||自定义的模块类型，如 "ReferModel"|
||func||function|||

### [](#33-如何扩展注册viewmodel)3.3. 如何扩展（注册ViewModel）

// myViewModel.js

cb.models.register('MyHelloWorld', function(modelType){

 var model = function(data){

 this._data = data;

 }

 model.prototype.modelType = modelType;

 model.prototype.say = function(){

 console.log('Say Hello World to '+ + this._data + '!');

 };

 return model;

})

使用自定义的 ViewModel 

var helloWorld = new cb.models['MyHelloWorld']('zhangsan');

hellWorld.say();// Say Hello World to zhangsan!

### [](#34-特别说明viewmodel-保留字)3.4. 特别说明：ViewModel 保留字

BaseModel、SimpleModel、ListModel、ReferModel、TagModel、ReportModel、FilterModel、TreeModel、GridModel、ContainerModel

以上关键字作为MDF的保留实现 ViewModel，MDF提供了上述 ViewModel 的实现，请开发这避免使用这些关键字。

## [](#4-容器级-viewmodel)4. 容器级 ViewModel

### [](#41-如何使用)4.1. 如何使用

var vm = new cb.viewmodels.ReferViewModel({

 params: {

 refCode: refCode,

 multiple: multiple,

 where: where

 }

});

### [](#42-原理说明)4.2. 原理说明

cb.viewmodels = {};

cb.viewmodels.register = function (modelType, func) {

 cb.viewmodels[modelType] = func(modelType);

};

MDF提供了全局的模板级ViewModel注册方式，具体 API 信息如下：

||name||type||描述|
||modelType||string||自定义的模块类型，如 "ReferModel"|
||func||function|||

### [](#43-如何扩展注册-viewmodel)4.3. 如何扩展（注册 ViewModel）

cb.viewmodels.register('MyCustomViewModel', function (modelType) {

 var model = function (data) {

 cb.models.ContainerModel.call(this, data);

 this.init();

 };

 // FilterViewModel

 model.prototype = cb.utils.getPrototype(cb.models.ContainerModel.prototype);

 model.prototype.modelType = modelType;

 

 model.prototype.init = function () {

 // todo something

 };

 

 model.prototype.initData = function () {

 if (typeof FilterViewModel_Extend == 'object') {

 FilterViewModel_Extend.doAction("init_Extend", this);

 }

 };

 

 return model;

});

### [](#44-特别说明viewmodel-保留字)4.4. 特别说明：ViewModel 保留字

FilterViewModel 、PlatformManagementVIewModel、ReferViewModel、RoleViewModel

以上关键字作为MDF的保留实现ViewModel，MDF提供了上述viewModel的实现，请开发这避免使用这些关键字。

## [](#5-模板级-viewmodel)5. 模板级 ViewModel

此外，各领域实现的UI模板MDF都会为其生成一个UI模板级ViewModel，通过cb.viewmodels.register('xxxxxx',
function(){...})

例如：店存入库列表模板代码自动生成代码如下：

(function anonymous() {

 // voucherlist 

 console.info('%c ST_st_storeinlist_VM js init', 'color:green');

 cb.viewmodels.register('ST_st_storeinlist_VM', function (modelType) {

 

 var model = function (data) {

 cb.models.ContainerModel.call(this, data);

 this.init();

 };

 model.prototype = cb.utils.getPrototype(cb.models.ContainerModel.prototype);

 model.prototype.modelType = modelType;

 

 //此处省略若干行代码......

 

 return model;

 });

})