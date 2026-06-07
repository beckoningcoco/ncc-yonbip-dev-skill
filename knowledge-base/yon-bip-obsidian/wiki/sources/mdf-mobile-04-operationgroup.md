---
title: "分组容器 OperationGroup"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/04-operationgroup"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 分组容器 OperationGroup

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/04-operationgroup | 所属：移动组件

# [](#分组容器-operationgroup)分组容器 OperationGroup

## [](#1-功能说明)1. 功能说明

用于分组-支持横向或者纵向分组

## [](#2-展示效果)2. 展示效果

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/OperationGroupfengzurongqi_image1.5b27f7b9.png)

                                                                       
                               **  横向分组**

**纵向分组                ----------→                     **
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/OperationGroupfengzurongqi_image2.c35c5ffb.png)

## [](#3-配置说明)3. 配置说明

meta元数据同voucherdetail下的meta，相当于用OperationGroup
替换voucherdetail

## [](#4-扩展属性-cstyle)4. 扩展属性 cStyle

||名称||含义||说明||默认值|
||keyField||分组字段||用于表格分组的字段||"_id"|
||direction||分组方向||('row'||'column') 横向和纵向|
||showTitle||是否显示标题||||false|
||total||副标题-数据合计||{ title: '****', keyField: '*** }{ title--显示文本,默认为合计 keyField---需要合计字段值}||无|
||subField||副标题||用于显示副标题的字段||无|
||instantEdit||原地编辑||分组组件是否可以原地编辑||false|
||当direction 为row时，需要处理一些参数|||||||
||buttonPosition||新增按钮显示位置||默认显示在外面，inset在弹窗里面||无|
||showRowToolbar||是否显示子表工具栏,只对direction 为row时起作用。||showRowToolbar 为true时，弹窗中的按钮则不显示||false|
||edit||进去modal页面是编辑状态||为true进入弹窗为编辑状态||false|

## [](#5-控制示例)5. 控制示例

控制分组数据的展开收起

// childrenField 是获取表格模型的，是个参数

const childrenField = '';

const girdmodel = viewmodel.get(childrenField);

girdmodel.setRowStates(

 [

 {rowIndex: 0, propertyName: 'collapse', value: true },

 {rowIndex: 1, propertyName: 'collapse', value: false }

 ]

)