---
title: "Check机制"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/12-checkfeature"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# Check机制

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/12-checkfeature | 所属：指南

## [](#check机制)Check机制

开关：checkMask   销售没配   库存采购开启的  立即转圈（）
1、单行一个一个录入   目前都是并行
2、横向批量粘贴   目前都是并行
3、一次批改两个列  串行的  cb.extend.features.udinghuo.batchCheckSupport
= true  目前是没问题
4、键盘快速录入多列   switchCellAwait=true   验证一下