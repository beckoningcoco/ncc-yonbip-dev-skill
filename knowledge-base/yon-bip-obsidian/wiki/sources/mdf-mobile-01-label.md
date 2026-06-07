---
title: "标签 Label"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/01-label"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 标签 Label

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/01-label | 所属：移动组件

# [](#标签-label)标签 Label

## [](#1-效果展示)1. 效果展示

实现思想：通过配置 扩展元素的样式实现不同的字体颜色或者label样式

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Labelbiaoqian-image1.9304d6dd.jpeg)

## [](#2-配置说明)2. 配置说明

### [](#21-状态类)2.1. 状态类

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Labelbiaoqian-image2.25bdd6bb.jpeg)

### [](#22-配置字体颜色)2.2. 配置字体颜色

cControlType为已上四类的与状态相关
可以在enumArray和cStyle里中增加相关配置

首先要nameType: text icon: 字体颜色

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Labelbiaoqian-image3.2e546318.jpeg)

### [](#23-配置更加丰富的label样式效果)2.3. 配置更加丰富的label(样式)效果

cStyle: { useLabel: true } 

enumArray 中 icon配置成样式对象 例如:

icon: {

 border: '1px solid blue',

 background: 'grey',

 fontSize: '14px' ,

 ...

 LabelMargin: '5px 10px' // 与margin写法相同 配置标签的上下左右间距

}

## [](#3-其他类配置说明)3. 其他类配置说明

useLabel设置true props中配置css样式

cStyle: {

useLabel: true,

 props: {

 border: '1px solid blue',

 background: 'grey',

 fontSize: '14px' ,

 ...

 LabelMargin: '5px 10px' // 与margin写法相同 配置标签的上下左右间距

 }

}

## [](#4-自定义组件实现标签表格上字段可用)4. 自定义组件实现标签（表格上字段可用）

// cellName 字段名 formatterKey 扩展组件名称 在前端脚手架fomatter下注册扩展组件 自定义实现标签样式

 gridModel.setColumnStates([{

 cellName: 'billstatus',

 name: 'formatter',

 value: function (rowInfo, rowData) {

 return {

 formatterKey: 'billstatus',

 props: {

 rowData

 }

 }

 }

 }])