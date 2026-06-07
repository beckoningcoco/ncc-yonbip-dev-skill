---
title: "锚点交互配置"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/06-maodianjiaohupeizhi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 锚点交互配置

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/06-maodianjiaohupeizhi | 所属：指南

# [](#锚点交互配置)锚点交互配置

## [](#1-挤占)1. 挤占

（默认交互）

**注意：进入页面由于布局动态改动，所以会有抖动，如果不需要抖动可以添加配置**

**bill_base表cExtProps配置{className: 'container-anchor'};**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/maodianjiaohupeizhi_image1.e85419cc.png)

## [](#2-悬浮)2. 悬浮

配置
项目级开关 流水线配置 anchorFixedOpen=false

单据级开关 锚点容器cStyle配置 anchorFixedOpen=false

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/maodianjiaohupeizhi_image2.b0ed6a7f.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/maodianjiaohupeizhi_image3.fb9920f1.png)