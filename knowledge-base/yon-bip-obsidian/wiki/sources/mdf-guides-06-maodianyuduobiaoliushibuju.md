---
title: "锚点与多表流式布局配置"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/06-maodianyuduobiaoliushibuju"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 锚点与多表流式布局配置

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/06-maodianyuduobiaoliushibuju | 所属：指南

# [](#锚点与多表流式布局配置)锚点与多表流式布局配置

## [](#1-实现效果)1. 实现效果

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/maodianyuduobiaoliushibuju_image1.5de516f4.jpeg)

## [](#2-配置说明)2. 配置说明

在对应单据的excel中的billtplgroup_base表中增加以下配置：

- 外层容器添加cStyle配置为{"classname":"masonryLayout"}
- 若干个LineTabs，其parent配置为CollapseContainer对应的容器，cStyle配置为{"anchorCollapse":true,"tabsVisible":false}

可参考：
工单管理  资产卡片