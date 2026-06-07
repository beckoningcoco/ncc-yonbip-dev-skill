---
title: "按钮 Button"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/02-button"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 按钮 Button

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/02-button | 所属：Web组件

# [](#按钮-button)按钮 Button

## [](#1-功能说明)1. 功能说明

标记了一个操作命令，通过点击按钮，响应点击行为，触发相应的业务逻辑。

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ButtonWeb_image1.8cb71bb4.png)

## [](#3-基本属性)3. 基本属性

||属性名称||属性含义||值类型||属性说明|
||属性名称||属性含义||值类型||属性说明|
||type||按钮类型||string||PrimaryButton 主按钮 红色Button 标准按钮，风格在parameter中配置(primary/ghost/dashed/link/text/default)|
||icon||按钮的图标类型||string||图标的标签|
||shape||按钮形状||string||可选值circle circle-outline，或者不设|
||disabeld||是否禁用||boolean||true-禁用 false -非禁用|
||style||按钮显示方式||number||0图标加文字，1纯文字，2纯图标|
||parameter||扩展属性||string||所有的扩展属性都配在这个属性中|

**parameter中可配置：**

||属性名称||属性含义||值类型||属性说明|
||属性名称||属性含义||值类型||属性说明|
||type||按钮风格||string||dark-深灰色；secondary-浅灰色|
||tips||帮助提示信息||string||提示信息文字|
||residentButton||不随分辨率收到更多按钮里||boolean||按单个按钮组件配置；也可以按服务配置特性开关disabledButtonMore: true|
||示例：parameter: "{"type": "dark"}"|||||||

### [](#31-在卡片中)3.1. 在卡片中

想要控制组件的状态，需要先拿到组件的模型，在MDF框架中，每个组件都会绑定一个模型，我们可以在扩展脚本中通过**viewmodel.get(cItemName)的方式获取到想要操作组件的模型，利用模型的API进行组件的控制，其中cItemName为该组件对应**billitem_base表中的cItemName

**示例：**

// 设置条件隐藏

viewmodel.get(cItemName).setVisible(true)

// 设置条件禁用

viewmodel.get(cItemName).setDisabled(true)

### [](#32-在表格中)3.2. 在表格中

可设置行按钮的显示及隐藏

**示例：**

gridModel.on('afterSetDataSource', () => {

 const rows = gridModel.getRows(false)

 const actions = gridModel.getCache('actions')

 const actionsStates = []

 rows.forEach((data,index) => {

 const actionState = {}

 actions.forEach(action => {

 if (action.cItemName == 'btnUse' || action.cItemName == 'btnDelete') {

 actionState[action.cItemName] = { visible: !getEnable(data.isEnabled) }

 } else if (action.cItemName == 'btnRefresh') {

 actionState[action.cItemName] = { visible: !getEnable(data.isEnabled) }

 } else {

 actionState[action.cItemName] = { visible: true }

 }

 })

 actionsStates.push(actionState)

 })

 gridModel.setActionsState(actionsStates)

})

### [](#33-支持鼠标悬停后出现文字提示)3.3. 支持鼠标悬停后出现文字提示

在cStyle或cParameter中配置tips属性，cStyle优先级比cParameter优先级高，

如果同时配置了从Style和cParameter，cParameter中的属性都不生效

### [](#34-按钮配置为常驻按钮不收到更多按钮里)3.4. 按钮配置为常驻按钮，不收到更多按钮里

**方法如下：**

- 

单个按钮配置常驻方法 ：按钮的cParameter中配置residentButton: true

- 

整个服务的所有单据不启用更多按钮：feature里配置特性开关disabledButtonMore:
true

**永不收起的按钮：**

- 

列表页：新增、提交、审核、弃审、下推、打印模版/打印、刷新永远不收；配了卡表切换，卡表切换永远不收

- 

详情页：新增、提交、审核、弃审、下推、打印模版/打印、翻页、分享、刷新、上张、下张永远不收

### [](#35-支持鼠标悬停后出现文字提示)3.5. 支持鼠标悬停后出现文字提示