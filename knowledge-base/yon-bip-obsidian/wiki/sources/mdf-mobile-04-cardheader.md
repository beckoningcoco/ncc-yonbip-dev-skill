---
title: "卡片头部区 CardHeader"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/04-cardheader"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 卡片头部区 CardHeader

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/04-cardheader | 所属：移动组件

# [](#卡片头部区-cardheader)卡片头部区 CardHeader

## [](#1-功能说明)1. 功能说明

用于配置卡片-表单项

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/CardHeaderbiaodanxiang_image1.f8a6331d.png) 
                 
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/CardHeaderbiaodanxiang_image2.9887bb02.png)

## [](#3-扩展属性-cstyle)3. 扩展属性 cStyle

||名称||含义||说明||默认值|
||名称||含义||说明||默认值|
||showTitle||为展示标题项||为true时，展示标题项，即为cName属性展示||false|
||showNum||收起时展开的个数||配置收起时展开的个数||4|
||showbIsNull||收起是效果||为true时，收起时展示所有的必填项||false|
||showAll||全展开||为true时为全展开，无展开收起效果,||false|
||more||控制容器组件展开收起的参数||为true是收起，为false是展开||卡片浏览态-默认展开，卡片编辑态，默认收起|
||bEmptyHide||无值隐藏||字段值为空，则隐藏该字段||cExtProps中配置|

## [](#4-控制示例)4. 控制示例

#### [](#411-如何显示隐藏容器)4.1.1. 如何显示隐藏容器

// 显示 code的值为meta元数据中返回的cGroupCode的值

viewmodel.execute('updateViewMeta', {code: 'pu_sendorderscanlist', visible: true});

 

// 隐藏

viewmodel.execute('updateViewMeta', {code: 'pu_sendorderscanlist', visible: false})

## [](#5-领域级特性开关)5. 领域级特性开关

showbIsNull 如果开启，则领域单据收起时都展示所有必填项。