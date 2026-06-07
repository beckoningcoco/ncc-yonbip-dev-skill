---
title: "参照组件“新增”按钮配置文档"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/05-canzhaozujianxinzenganniupeizhiwendang"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 5
---

# 参照组件“新增”按钮配置文档

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/05-canzhaozujianxinzenganniupeizhiwendang | 所属：指南

# [](#参照组件新增按钮配置文档)参照组件“新增”按钮配置文档

参照按钮规范:

“新增”按钮统一在底部显示，其余按钮显示在数据行上。没有按照下面说明进行配置的导致按钮位置显示有问题需要领域自己处理。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/canzhaozujianxinzenganniupeizhiwendangimage1.07691d95.png)

## [](#refer)Refer

弹窗树参照：弹窗树参照新增按钮规范显示在顶部，如下图：
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/canzhaozujianxinzenganniupeizhiwendangimage2.e04a28cb.png)
新增按钮配置在SearchTree的子集里，如下代码：

{

 "cTemplateTitle": "",

 "containers": [

 {

 "cDataSourceName": "pma.allocplan.Allocplan",

 "cControlType": "SearchTree",

 "containers": [

 {

 "cDataSourceName": "Toolbar",

 "cControlType": "Toolbar",

 "controls": [

 {

 "cItemName": "btnAdd",

 "cCaption": "新增",

 "cCaptionResid": "P_YS_FED_IMP-DFM-FE_0000020875",

 "cShowCaption": "新增",

 "cControlType": "button",

 }

 ]

 }

 ],

 "controls": [

 {

 .......

 }

 ],

 }， 

 ]

 }

表参照和树表参照

表参照和树表参照实质上就是内嵌的单据，按照单据的配置方式即可，参考下面的meta数据：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/canzhaozujianxinzenganniupeizhiwendangimage3.60189ee5.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/canzhaozujianxinzenganniupeizhiwendangimage4.8a50b4e6.png)

{

 "containers": [

 {

 "groupId": "1601282624095518724",

 "cCode": "pc_managementclassref",

 "cControlType": "ListHeader",

 "containers": [

 {,

 "iOrder": 0,

 "cDataSourceName": "Toolbar",

 "cControlType": "Toolbar",

 "controls": [

 {

 "icon": "plus-copy",

 "cItemName": "btnAdd",

 "cCaption": "新增",

 "cCaptionResid": "P_YS_FED_FW_0000021020",

 "cShowCaption": "新增",

 }

 ],

 }

 ],

 }, 

 {

 "cDataSourceName": "pma.allocplan.Allocplan",

 "cControlType": "table",

 "containers": [

 {

 "cDataSourceName": "Toolbar",

 "cControlType": "Toolbar",

 "controls": [

 {

 "icon": "",

 "cItemName": "btnEdit",

 "cCaption": "编辑",

 "cCaptionResid": "P_YS_FED_IMP-DFM-FE_0000020875",

 "cShowCaption": "编辑",

 "cControlType": "button",

 }

 ]

 }

 ],

 "controls": [

 {

 .......

 }

 ],

 } 

}

## [](#treerefer)TreeRefer

新增按钮配置：新增按钮配置在和searchtree元素的同级：

{

 "containers": [

 {

 "groupId": "1601282624095518724",

 "cCode": "pc_managementclassref",

 "cControlType": "ListHeader",

 "containers": [

 {,

 "iOrder": 0,

 "cDataSourceName": "Toolbar",

 "cControlType": "Toolbar",

 "controls": [

 {

 "icon": "plus-copy",

 "cItemName": "btnAdd",

 "cCaption": "新增",

 "cCaptionResid": "P_YS_FED_FW_0000021020",

 "cShowCaption": "新增",

 }

 ],

 }

 ],

 },

 {

 "groupId": 3810249,

 "cControlType": "searchtree",

 "controls": [

 .......

 ],

 }

 ]

}

编辑按钮配置：编辑按钮需要配置在树节点后面显示，只需要把编辑按钮作为子元素配置在tree里边即可：

{

 "cTemplateName": "分摊方案参照",

 "cTemplateTitle": "分摊方案",

 "containers": [

 {

 "cDataSourceName": "pma.allocplan.Allocplan",

 "cControlType": "tree",

 "containers": [

 {

 "cDataSourceName": "Toolbar",

 "cControlType": "Toolbar",

 "controls": [

 {

 "icon": "",

 "cItemName": "btnEdit",

 "cCaption": "编辑",

 "cCaptionResid": "P_YS_FED_IMP-DFM-FE_0000020875",

 "cShowCaption": "编辑",

 "cControlType": "button",

 }

 ]

 }

 ],

 "controls": [

 {

 .......

 }

 ],

 }

 ]

}

## [](#listrefer)ListRefer

![](data:image/png;base64,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)

新增按钮需要配置在底部显示，有两种配置方法：
第一种：配置"cControlType"="Toolbar"，并且需要配置在和table的同级，如下代码块1

第一种：配置"cControlType"="ListHeader"，并且需要配置在和table的同级，如下代码块2

编辑按钮需要配置在树节点后面显示，只需要把编辑按钮作为子元素配置在table里边即可。
代码块1：按钮配置meta数据结构:

{

 "cTemplateName": "分摊方案参照",

 "cTemplateTitle": "分摊方案",

 "containers": [

 {

 "cCode": "toolbar3ue",

 "cDataSourceName": "Toolbar",

 "cControlType": "Toolbar",

 "controls": [

 {

 "icon": "",

 "cItemName": "button2xc",

 "cCaption": "新增",

 "cShowCaption": "新增",

 "cControlType": "primarybutton",

 }

 ],

 },

 {

 "cDataSourceName": "pma.allocplan.Allocplan",

 "cControlType": "table",

 "containers": [

 {

 "cDataSourceName": "Toolbar",

 "cControlType": "Toolbar",

 "controls": [

 {

 "icon": "",

 "cItemName": "btnEdit",

 "cCaption": "编辑",

 "cCaptionResid": "P_YS_FED_IMP-DFM-FE_0000020875",

 "cShowCaption": "编辑",

 "cControlType": "button",

 }

 ]

 }

 ],

 "controls": [

 {

 .......

 }

 ],

 }

 ]

}

代码块2：底部新增按钮也可以按照下面的Meta数据配置

{

 "containers": [

 {

 "groupId": "1601282624095518724",

 "cCode": "pc_managementclassref",

 "cControlType": "ListHeader",

 "containers": [

 {,

 "iOrder": 0,

 "cDataSourceName": "Toolbar",

 "cControlType": "Toolbar",

 "controls": [

 {

 "icon": "plus-copy",

 "cItemName": "btnAdd",

 "cCaption": "新增",

 "cCaptionResid": "P_YS_FED_FW_0000021020",

 "cShowCaption": "新增",

 }

 ],

 }

 ],

 },

 {

 "groupId": 3810249,

 "cControlType": "table",

 "controls": [

 .......

 ],

 }

 ]

}