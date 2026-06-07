---
title: "父子页面间通讯"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/01-page-connect"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 父子页面间通讯

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/01-page-connect | 所属：API

# [](#父子页面间通讯)父子页面间通讯

## [](#1-机制说明)1. 机制说明

### [](#11-获取父页面模型)1.1. 获取父页面模型

1、单据模板的 ViewModel 在初始化后将上一级模板的
ViewModel 设置到缓存字段 parentViewModel 中：

bill[data.billtype.toLowerCase()].init(data.billno, data.params, function (vm, viewmeta, title) {

 if (viewmodel) {

 vm.setCache('parentViewModel', viewmodel);

 vm.execute('afterInit');

 }

 .....

});

2、这样可以当前单据模板的扩展脚本中都可以通过以下方式拿到缓存数据：

const parentViewModel = vm.getCache('parentViewModel');

### [](#12-获取子页面模型)1.2. 获取子页面模型

在父页面中可以通过getSubPageViewModels获取所有嵌入的子页面模型，如：

const subViewModels = viewmodel.getSubPageViewModels()

## [](#2-开发指导)2. 开发指导

### [](#21-关于-parentviewmodel)2.1. 关于 parentViewModel

获取到的 parentViewModel 是个普通的 vm
对象，可以像操作其他vm一样去使用，如获取数据、绑定事件、执行操作等。

parentViewModel.get(config.key).getValue();

### [](#22-刷新)2.2. 刷新

const parentViewModel = vm.getCache('parentViewModel');

 

if (parentViewModel)

 parentViewModel.execute('refresh');

});

### [](#23-回退)2.3. 回退

const parentViewModel = viewModel.getCache('parentViewModel');

 

if (parentViewModel)

 parentViewModel.execute('back');

### [](#24-逐级获取)2.4. 逐级获取

let parentViewModel = viewModel.getCache('parentViewModel');

if (viewModel.getParams().domain === false) {

 while (parentViewModel.getCache('parentViewModel'))

 parentViewModel = parentViewModel.getCache('parentViewModel');

}