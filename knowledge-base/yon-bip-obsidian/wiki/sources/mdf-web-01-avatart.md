---
title: "图片组件 Avatar"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-avatart"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 图片组件 Avatar

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-avatart | 所属：Web组件

# [](#图片组件-avatar)图片组件 Avatar

## [](#1-功能说明)1. 功能说明

主子表中单张图片上传组件

## [](#2-效果展示)2. 效果展示

### [](#21-主表中展示)2.1. 主表中展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Avatartupianzujian_image1.754ede6c.jpeg)

### [](#22-子表中展示)2.2. 子表中展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Avatartupianzujian_image2.af6c6042.jpeg) →点击即可预览
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Avatartupianzujian_image3.d230548f.jpeg)

## [](#3-基本属性)3. 基本属性

### [](#31-在单据中)3.1. 在单据中

||属性名称||属性含义||值类型||默认值||属性说明|
||cStyle||扩展属性||string||无||所有的扩展属性都配在这个属性中|
||disabled||禁用（置灰）||string||false||是否可用删除、上传|
||readOnly||是否只读||boolean||false||是否可用删除、上传|
||className||容器元素的className||string||无|||
||bHidden||是否显示||boolean||false|||
||cShowCaption||label说明文字||string||无|||
||bIsNull||是否允许为空||boolean||true|||

## [](#4-扩展属性-cstyle)4. 扩展属性 cStyle

||属性名称||属性含义||值类型||默认值||属性说明|
||uploadtext||图片上传控件提示文字||string||'上传图片'|||
||imgSize||单个文件最大上传size||number||2048||单位kb|
||accept||上传类型||string||'jpg,png'|||
||style||图片样式style||object||无||内联样式|
||tooltip||上传icon提示说明||string||无|||
||after||上传icon提示说明||string||'仅支持XXX格式'||比tooltip优先级高|
||defaultUrl||默认图片url||string||无||默认图片url|
||displaymode||图片形状||string||default||默认圆形；default-圆形；logo-方形圆角4px；其它值为方形无圆角|

## [](#5-扩展事件)5. 扩展事件

只限于子表点击预览事件

||事件名称||事件说明||传递参数||参数说明|
||beforeOpenImage||子表预览图片时触发事件||info||src: 图片预览地址；index: 子表行号；rowData: 子表当前行数据|

## [](#6-faq)6. FAQ

### [](#61-avatar组件切协同文件服务)6.1. Avatar组件切协同文件服务？

《[关于Avatar组件的3种模式](#/guides/19--avatardengzujian-ap-igengxin)》