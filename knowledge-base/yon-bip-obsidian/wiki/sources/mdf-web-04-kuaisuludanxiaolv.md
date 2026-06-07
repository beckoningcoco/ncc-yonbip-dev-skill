---
title: "--快速录单效率"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-kuaisuludanxiaolv"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# --快速录单效率

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-kuaisuludanxiaolv | 所属：Web组件

# [](#快速录单效率)快速录单效率

## [](#1-出现背景)1. 出现背景

表体字段配置check，又配置相关公式，每次录完一个数据，会调用一个check接口，然后又会调用n个公式接口。录完一条数据，摁下键，继续录入，录的很快时，check和公式接口会很多，接口回来后表格又会进行渲染，此时录数据会明显卡顿。

## [](#2-解决方案)2. 解决方案

单元格录入数据时，单位时间内进行节流控制，两次录入间隔时间少于n秒，不管录入多少条数据，只在最后一次批量触发check和批量触发公式。这样表格只会渲染一次，从而提升录入性能。

## [](#3-需要配置)3. 需要配置

该特性默认不开启，mdf框架进行统一配置，如果需要配置找框架开启：

{

 globalVars: {

 __MDF_FEATURE_CONFIG__：{

 checkMergeBatchCheck: { // 租户-单据

 "yiwrl4mu": ["voucher_order"],

 },

 checkMergeBatchCheckInterval: 2000 // 2s时间内进行节流

 }

 }

}