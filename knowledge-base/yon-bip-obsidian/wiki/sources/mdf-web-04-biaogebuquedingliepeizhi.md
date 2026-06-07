---
title: "--表格不确定列配置"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-biaogebuquedingliepeizhi"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# --表格不确定列配置

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-biaogebuquedingliepeizhi | 所属：Web组件

# [](#表格不确定列配置)表格不确定列配置

### [](#1-场景描述)1. 场景描述

表格中，存在一些不确定的列，有可能会根据其他字段的变化而改变组件的类型。如满足某种情况下，某个单元格要改变为input类型。框架提供了一种uncertain的组件类型，用于支持此场景。

### [](#2-配置说明)2. 配置说明

billitem_base表中，配置对应的字段的cControlType为uncertain。

### [](#3-代码实现)3. 代码实现

cellConfig = { cControlType: 'Select' };

cellConfig.cEnumString = JSON.stringify(optionsString);

cellConfig.enumArray = JSON.stringify(optionsArray);

gridModel.setCellValue(rowIndex, 'cellConfig', cellConfig);

// 如果有多个不确定列，传递数组对象，每个对象需要有个属性cItemName：

cellConfig = { cItemName: XXX, cControlType: 'Select' };

cellConfig.cEnumString = JSON.stringify(optionsString);

cellConfig.enumArray = JSON.stringify(optionsArray);

arr = [cellConfig];

gridModel.setCellValue(rowIndex, 'cellConfig', arr);

### [](#4-模型监听)4. 模型监听

// controlModel为gridModel.getEditRowModel().get('columnName')

this.props.controlModel.on('afterMount',function(model){

 // model即为当前不确定列的控件模型，如果是参照就是referModel,如果是input就是simpleModel

 const curModel = model;

})

gridmodel.getEditRowModel().get(cItemName).getCache('uncertain') //不确定列模型，点击不确定单元格会更新，只能取正在编辑的不确定列的单元格模型

笔记：
如果由其他节点跳转至含有不确定列的节点，且该不确定列变为参照，点击打开参照时，可能出现“参照弹框在原页签中弹出”的问题。解决方法如下：
cellConfig.diworkCode = veiwmodel.getDiworkCode();