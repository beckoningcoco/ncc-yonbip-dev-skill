---
title: "--表格侧滑编辑"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-biaogecehuabianji"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# --表格侧滑编辑

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-biaogecehuabianji | 所属：Web组件

# [](#表格侧滑编辑)表格侧滑编辑

MDF框架表格内编辑默认不支持侧滑打开，需要通过扩展脚本，打开特性开关或对模板进行配置方式支持。

## [](#1-效果展示)1. 效果展示

默认自带标题，放大，删除，确定，取消按钮。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/biaogecehuabianjiimg1.dbba9f47.png)

## [](#2-列表页打开侧滑)2. 列表页打开侧滑

首先得配置一个卡片页，在原有列表进卡片基础上配置一个新交互。弹窗内基本操作和卡片一样。直接以侧滑形态打开单据。

1、自定义按钮直接打开侧滑，需要写如下扩展脚本，可以打开卡片或列表类型单据

viewmodel.get('btn01').on('click', function(){

 cb.loader.runCommandLine('bill', {

 billtype: 'voucher', // billType

 params: {

 id: '2214931147379968', // 数据id

 mode: 'edit',

 readOnly: true,

 templateType: 'modal',

 domainKey: ''

 },

 billno: 'bankdot', // billNO

 extraConfig: {

 _innerType: 'fadeRightToLeft'

 }

 }, viewModel);

})

2、双击列表数据打开侧滑，添加如下脚本

// 列表进行详情需要加

viewModel.getGridModel().on('beforeDblClick', function(args){

 // 必须配置

 args.templateType = 'modal';

 if (!args.extraConfig) args.extraConfig = {};

 args.extraConfig._innerType = 'fadeRightToLeft';

 

 // 其他配置

 args.extraConfig.title = '自定义标题';

 // 其他所有Modal组件 支持的配置都可以扩展

 args.extraConfig = {...}

})

3、列表点编辑打开侧滑，需要加如下代码，更多相关代码参考

// 列表编辑需要加

viewModel.on('beforeEdit', function(args){

 // 必须配置

 args.carry.templateType = 'modal';

 if (!args.carry.extraConfig) args.carry.extraConfig = {};

 args.carry.extraConfig._innerType = 'fadeRightToLeft';

})

### [](#21-个性化配置)2.1. 个性化配置

动态修改extraConfig的配置，即可实现个性化配置，例如基于上面扩展脚本修改侧滑宽度，添加代码
args.extraConfig.width = '300px'。extraConfig支持配置如下：

||属性||例子||备注|
||width||300px/90%||侧滑宽度|
||height||500px||侧滑高度|
||title||标题||标题|
||footer||null/dom||底部按钮，默认有保存和取消|
||className||class1||样式名|
||onOk||function||保存事件回调|
||maskClosable||true||点击空白是否关闭|
||onCancel||function||取消事件回调|
||onMaskClick||function||点击空白区域回调|

## [](#3-卡片页打开侧滑)3. 卡片页打开侧滑

两种完全不同的配置模式，开启方式也不一样

1、自定义侧滑，可对字段进行分组，**模板需要单独配置容器**

2、默认侧滑，平铺表格列到侧滑卡片上，**模板无需单独配置容器**

### [](#31-开启配置)3.1. 开启配置

1、自定义侧滑

需要配置tableeditrowmodal容器，父容器为当前表格。还有更多细节配置见[TableEditRowModal 侧滑容器](#/components-web/04-tableeditrowmodal)

2、默认侧滑

开启feature特性开关 supportTableEditRowDrawer，禁用单独表格配置cStyle {disableTableEditRowDrawer: true}

### [](#32-添加事件)3.2. 添加事件

1、自定义侧滑

新增 action 为 addtablerow， 编辑 action 为 edittablerow

2、默认侧滑

开启后表格上默认会有一个侧滑按钮图标，不用单独添加事件。默认把表格上的浮动按钮同步到侧滑区域。按钮也可以通过配置进行隐藏。