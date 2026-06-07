---
title: "参照配置字段二合一"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/05-canzhaopeizhiziduanerheyi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 参照配置字段二合一

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/05-canzhaopeizhiziduanerheyi | 所属：指南

# [](#参照配置字段二合一)参照配置字段二合一

## [](#1-使用说明)1. 使用说明

### [](#11-原参照设计)1.1. 原参照设计

由于参照的特殊性，之前的参照在单据上都是以两个或者更多的字段来承载（参照id,参照显示名称）。

以物料参照为例，一般UI模板上有两个字段：

id字段的cFieldName为product，cControlType为Input，默认隐藏；

name字段的cFieldName为product.name，cControlType为Refer，默认显示，此时通过配置cRefRetId参照携带{"product":"id"}，来实现选完参照后，id字段同步赋值的逻辑

### [](#12-新参照设计)1.2. 新参照设计

为了减少UI模板配置的复杂度，现推出一种新的参照配置方案，UI模板上仅需预置一个参照字段即可。还以物料参照为例，配置项如下。

||cName||cFieldName||cControlType||cControlType|
||product||product||Refer||{"isNewRefer":true,"displayname":"name"}|

仅需要配置一个Refer类型的字段即可，需要在cExtProps中配置isNewRefer属性为true。

页面上的显示字段是通过displayname字段配置的属性来显示的。此时显示的数据为参照数据中的name字段作为参照框内的显示值。

数据保存时，会将product,product_name传到后端，product_name是由cName + "_" + displayname来生成的。