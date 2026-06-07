---
title: "可编辑列表页面配置"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/06-kebianjiliebiaoyemianpeizhi"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 可编辑列表页面配置

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/06-kebianjiliebiaoyemianpeizhi | 所属：Web组件

# [](#可编辑列表页面配置)可编辑列表页面配置

## [](#1-excel文档)1. Excel文档

## [](#2-标准列表效果图)2. 标准列表效果图

## [](#3-容器)3. 容器

||容器类型（cControlType）||容器作用||描述|
||ListHeader||表格头部展示区||通常用来包裹查询容器、工具栏|
||Toolbar||工具栏容器||通常用来包裹按钮、高级查询页签|
||ConvenientQuery||查询容器||用来包裹查询条件的容器|
||table||表格||可以包裹表格列、工具栏|

## [](#4-操作控制)4. 操作控制

#### [](#411-常用事件)4.1.1. 常用事件

// 监听元数据加载完成事件

viewmodel.on('afterLoadMeta', function(data){

 const { vm, view } = data;

})

// 监听业务数据加载完成事件

viewmodel.on('afterLoadData', function(data){})

#### [](#412-操作toolbar)4.1.2. 操作Toolbar

// 隐藏工具栏 -- cGroupCode: billtplgroup_base表中toolbar的cGroupCode

viewmodel.execute('updateViewMeta', { code: cGroupCode, visible: false})

// 隐藏工具栏中的按钮 -- cItemName: billitem_base表中按钮的cItemName

viewmodel.get(cItemName).setVisible(false)

#### [](#413-操作页面按钮)4.1.3. 操作页面按钮

// 获取按钮对应的模型 -- btnName: bill_toolbaritem表中按钮的name

const btn = viewmodel.get(btnName);

// 按钮对应动作的前置/后置事件 -- command: bill_command表中的action

// 以edit为例 -- 事件名为小驼峰结构

viewmodel.on('beforeEdit', function(params){

})

viewmodel.on('afterEdit', function(data){

})

#### [](#414-操作查询区convenientquery)4.1.4. 操作查询区ConvenientQuery

更多查询区API参考文档《[ConvenientQuery查询区](#/components-web/05-convenientquery)》

- 隐藏查询方案列表 -- billtplgroup_base表中ConvenientQuery对应容器的cStyle字段添加属性"bHideFilterScheme": true
- 隐藏查询方案搜索按钮 -- billtplgroup_base表中ConvenientQuery对应容器的cStyle字段添加属性"bHideSearchStr": true

const filterViewModel = viewmodel.getCache('FilterViewModel')

// 隐藏整个查询区

filterViewModel.setState('bHideFilterScheme', true)

// 隐藏查询区特定查询条件 -- itemName: pb_filter_solution_common表中的itemName

filterViewModel.execute('updateViewMeta', { code: itemName, visible: false })

#### [](#415-操作表格)4.1.5. 操作表格

更多表格API参考文档《[Table表格](#/components-web/04-table)、[GridModel表格模型](#/api/02-grid-model)》

const gridModle = viewmodel.getGridModel()

// 隐藏表格

gridModel.setVisible(true) // 表格的隐藏 -- true为隐藏， false为显示

// 设置只读

gridModel.setReadOnly(true)