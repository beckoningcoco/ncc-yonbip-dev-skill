---
title: "流程预测"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/17-liuchengyuce"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 流程预测

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/17-liuchengyuce | 所属：指南

# [](#流程预测)流程预测

## [](#怎么配置)怎么配置

配置action: "futureworkflow"

## [](#设计器中配置)设计器中配置

1、首先构造action

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liuchengyuce_image1.eaf285d7.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liuchengyuce_image2.a61cc6b8.png)

找到actions这一项，给数组中添加一项

{

 "DESCRIPTION": "审批预测",

 "YTENANT_ID": "0000LC5NLRD4GPBAR40000",

 "authid": "ceshi001cmdWorkflow",

 "cAction": "futureworkflow",

 "cCommand": "cmdFutureWorkflow",

 "cDesignProps": {},

 "cHttpMethod": "POST",

 "id": "1985728290696462340",

 "pubts": 1715566164834,

 "subid": "AT1B7E86A40AA80004",

 "system": 1,

 "title": "审批预测"

},

2、给按钮绑定action

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liuchengyuce_image3.c4ddde2b.png)