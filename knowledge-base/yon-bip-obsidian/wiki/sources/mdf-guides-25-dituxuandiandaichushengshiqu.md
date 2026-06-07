---
title: "地图选点带出省市区字段"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/25-dituxuandiandaichushengshiqu"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 地图选点带出省市区字段

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/25-dituxuandiandaichushengshiqu | 所属：指南

# [](#地图选点带出省市区字段)地图选点带出省市区字段

### [](#1-场景描述)1. 场景描述

在地图上选择地址时，希望把所选位置的省市区的信息，带入到省市区字段上展示。

### [](#2-配置说明)2. 配置说明

在地图组件（cControlType为Amap）的cStyle中，配置{"target":"xxx"}。

其中xxx是需要带入的省市区的字段。