---
title: "查询模型 FilterViewModel"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/03-filter-view-model"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 查询模型 FilterViewModel

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/03-filter-view-model | 所属：API

# [](#查询模型-filterviewmodel)查询模型 FilterViewModel

## [](#1-事件)1. 事件

### [](#11-beforeinit)1.1. beforeInit

### [](#12-说明查询区字段模型初始化之前的生命周期函数)1.2. 说明：查询区字段模型初始化之前的生命周期函数

filterViewModel.on('beforeInit', function(data){ //此处没有模型，但是可以修改data中的元数据，变更初始化查询模型的状态 

})

### [](#13-afterinit)1.3. afterInit

说明：查询区字段模型初始化完成之后的生命周期函数

filterViewModel.on('afterInit', function(){

 const itemModel = this.get(itemName).getFromModel() //获取查询区字段的模型

})

### [](#14-beforefiltertreeupdate)1.4. beforeFilterTreeUpdate

说明：查询区导航树渲染之前的生命周期函数

filterViewModel.on('beforeFilterTreeUpdate', function(filterTreeFields){

 console.log(filterTreeFields)

})

### [](#15-afterreportinit)1.5. afterReportInit

说明：智能分析报表专用的生命周期函数，同afterInit

filterViewModel.on('afterReportInit', function(){

// 智能分析报表中没有afterInit 使用本生命周期代替

})

### [](#16-beforesearch)1.6. beforeSearch

说明：查询区搜索前置生命周期函数

filterViewModel.on('beforeSearch', function(params){

// 可在此函数中修改传递到后端的参数

})

### [](#17-afterresetclick)1.7. afterResetClick

说明：重置按钮点击后的生命周期函数

filterViewModel.on('afterResetClick', function(params){

// 可在此函数中修改传递到后端的参数

})

## [](#2-扩展能力)2. 扩展能力

### [](#21-搜索)2.1. 搜索

const schemeId = viewModel.getCache('schemeId');

 viewModel.get('search').fireEvent('click', { solutionid: schemeId

});

### [](#22-重置)2.2. 重置

viewModel.get('reset').execute('click');

### [](#23-查询条件在扩展脚本中拼接or)2.3. 查询条件在扩展脚本中拼接or

const condition = {isExtend: true, simpleVOs: []}

const simpleConditions = [];

simpleConditions.push({

 field: 'xxx',

 op: 'eq',

 value1: 'xxx'

})

simpleConditions.push({

 field: 'xxx',

 op: 'gt',

 value1: 'xxx'

})

condition.simpleVOs.push({

 logicOp: 'or',

 conditions: simpleConditions

})

### [](#24-查询区的隐藏)2.4. 查询区的隐藏

// 隐藏整个查询区

viewmodel.setState('bHideFilterScheme', true);

### [](#25-添加一个查询脚本)2.5. 添加一个查询脚本

查询区常用的几张表分别为**pb_meta_filters、pb_meta_filter_item、pb_filter_solution、pb_filter_solution_common**

在**pb_meta_filters**中**behaviorObject**字段配置一个文件路径，默认查询模板参考如下代码：

cb.define(['common/common_VM.Extend.js'], function (common) {

 var xxx_Extend = {

 doAction: function (name, viewmodel) {

 if (this[name])

 this[name](viewmodel);

 },

 init: function (viewmodel) {

 }

 }

 try {

 module.exports = xxx_Extend;

 } catch (error) {

 }

 return xxx_Extend

});