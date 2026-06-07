---
title: "按钮组 Toolbar"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/02-toolbar"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 按钮组 Toolbar

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/02-toolbar | 所属：移动组件

# [](#按钮组-toolbar)按钮组 Toolbar

## [](#1-功能说明)1. 功能说明

按钮组容器

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Toolbaranniuzu_image1.4d5250f2.png)

**超过3个按钮，超出按钮在...区域显示**

## [](#3-标准属性)3. 标准属性

||名称||含义||说明|
||名称||含义||说明|
||cAlign||工具栏的对齐方式||['left','right'],默认值为right|

## [](#4-扩展属性-cstyle)4. 扩展属性 cStyle

卡片区在cStyle中配置属性，过滤区在extendField中配置属性

例：{"sort":
"desc"}或"asc","升序和降序显示"，如果升序，iorder最大则显示在最右侧，如果是降序，iorder最小则显示在最右侧。

||名称||含义||说明||默认值||位置|
||名称||含义||说明||默认值||位置|
||sort||按钮项显示排序||{"sort": "desc"}||无||仅适配了footer下的toolbar|
||showNum||显示按钮个数，超出放置在...区域||{"showNum": "2"}||3||仅适配了footer下的toolbar|
||length||显示按钮个数，超出放置在...区域||{"length": 2}||3||限于列表行和单据子表行按钮|
||buttonSort||按钮显示顺序, iorder最小则显示在最右侧||{"buttonSort": true}||false||适配于所有toolbar|
||buttonDivide||底部按钮平分||{"buttonDivide": true}||false||仅适配了footer下的toolbar|

## [](#5-领域级特性开关)5. 领域级特性开关

buttonSort
如果开启，则领域的列表行，单据行和底部按钮区按钮顺序都为iorder最小则显示在最右侧。

buttonDivide 如果开启，领域的所有单据，底部按钮都平分占满。

## [](#6-动态控制显示隐藏)6. 动态控制显示隐藏

viewmodel.execute('updateViewMeta', {

 code: 'cGroupCode',

 visible: false

 });