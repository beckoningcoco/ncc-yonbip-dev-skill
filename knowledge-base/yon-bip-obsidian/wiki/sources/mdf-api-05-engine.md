---
title: "引擎 Engine"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-engine"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 引擎 Engine

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-engine | 所属：API

# [](#引擎-engine)引擎 Engine

框架对外挂载引擎对象，可直接使用去渲染页面。

使用方式：

**全局挂载**

- 

cb.components.engine.parseContainer

- 

cb.components.engine.parseControl

- 

cb.components.engine.parseControls

**parseContainer**

- cb.components.engine.parseContainer = (container, viewModel, width, height, index, hasTree, handleClick, parents, extraProps = {}) => {}

渲染引擎使用parseContainer即可