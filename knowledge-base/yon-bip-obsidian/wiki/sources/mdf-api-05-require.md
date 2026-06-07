---
title: "模块化 Require"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-require"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 模块化 Require

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-require | 所属：API

# [](#模块化-require)模块化 Require

## [](#1-加载文件)1. 加载文件

`cb.requireInner` 或 `cb.require`

// 加载并运行文件

cb.requireInner('', function(){

 

})

**说明：**

- `cb.requireInner`同时支持js和css
- 内部做了缓存计算，已加载的文件不会再加载

## [](#2-定义模块)2. 定义模块

`cb.defineInner` 或 `cb.define`

// 定义模块

cb.defineInner('', [], function(){

 

})