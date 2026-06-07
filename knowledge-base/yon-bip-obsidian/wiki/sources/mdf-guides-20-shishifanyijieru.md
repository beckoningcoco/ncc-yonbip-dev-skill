---
title: "实时翻译接入"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/20-shishifanyijieru"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 实时翻译接入

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/20-shishifanyijieru | 所属：指南

# [](#实时翻译接入)实时翻译接入

## [](#1-mdf项目)1. MDF项目

## [](#11-如何出现多语设置)1.1. 如何出现多语设置?

### [](#111-对于框架内的组件)1.1.1. 对于框架内的组件

现已基本完备，大部分使用了cShowCaptionResid字段。 后端配置mdd可联系杨希成，ypd可联系延鑫。对多语服务存疑可联系肖小勇、赵东升排查

### [](#112-对于扩展组件)1.1.2. 对于扩展组件

调整dom结构，对于能接入属性的标签添加属性 langid={'UID:x_xxx_xxx_xxxxxxxxxx'}  此处填写的uuid需与展示的文本做绑定

例：

<div langid={xxxxxxxx}>是</div>

部分调用API产生的dom，如Modal中的footer，使用 cb.lang.templateByUuid('UID:x_xxx_xxx_xxxxxxxxxx', 'value', undefined, {returnDom: true}) 产生文本传入参数

## [](#2-ynf项目)2. YNF项目

### [](#21-如何出现多语设置)2.1. 如何出现多语设置?

#### [](#211-对于框架内的组件)2.1.1. 对于框架内的组件

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shishifanyijieru_image.dbe21ed8.png)

将与需要展示的字段和其uuid做绑定，此处可以是前端多语可以是后端在协议后返回的resid

#### [](#212-对于扩展组件)2.1.2. 对于扩展组件

调整dom结构，对于能接入属性的标签添加属性 langid={'UID:x_xxx_xxx_xxxxxxxxxx'}  此处填写的uuid需与展示的文本做绑定

例：

<div langid={xxxxxxxx} placement='top'>是</div>

部分调用API产生的dom，如Modal中的footer，使用 lang.templateByUuid('UID:x_xxx_xxx_xxxxxxxxxx', 'value', undefined, {placement: 'top'}) 产生文本传入参数

## [](#3-为什么我修改词条内容后页面没有反应)3. 为什么我修改词条内容后页面没有反应？

确保刷新浏览器（非页签刷新）后，因为模板未更新而未生效。 请联系肖小勇、赵东升咨询