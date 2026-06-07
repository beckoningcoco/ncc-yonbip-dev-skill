---
title: "--表格自定义列扩展"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-biaogezidingyiliekuozhan"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# --表格自定义列扩展

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-biaogezidingyiliekuozhan | 所属：Web组件

# [](#表格自定义列扩展)表格自定义列扩展

### [](#1-场景描述)1. 场景描述

使用场景中，表格的具体列，可能要经过复杂的处理来控制展示形态或者要自定义展示方式。为此框架预留了扩展的入口，领域可以通过扩展formatter来实现。

### [](#2-代码实现)2. 代码实现

具体单据的扩展脚本中代码如下

viewmodel.getGridModel().setColumnState('xxx', 'formatter', (rowInfo, rowData) => {// xxx是具体的列的cName

 return {

 formatterKey: 'abc', // abc是自定义的组件的组件名

 props: {

 rowInfo,

 rowData

 }

 }

})

其中xxx是具体的column的列的cName，abc是扩展的自定义组件的组件名。

rowInfo是列表行相关的元数据属性，rowData是行的业务数据。

自定义组件需要写在对应扩展的formatter目录下

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/biaogezidingyiliekuozhanimg1.8ed9a2c3.png)

formatter中的index.jsx中需要将组件export出来。

具体的组件写法此处不做详细描述，均是react的标准写法。

更多文档：《[格式化表格列
formatter](#/guides/04-geshihuabiaogelieformatter)》