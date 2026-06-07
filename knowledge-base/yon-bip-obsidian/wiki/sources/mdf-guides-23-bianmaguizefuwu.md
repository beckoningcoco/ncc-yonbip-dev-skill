---
title: "编码规则服务"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/23-bianmaguizefuwu"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 编码规则服务

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/23-bianmaguizefuwu | 所属：指南

# [](#编码规则服务)编码规则服务

## [](#1-接入文档)1. 接入文档

《编码规则-自动编码》([https://gfwiki.yyrd.com/pages/viewpage.action?pageId=42394290](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=42394290))

## [](#2-常见问题)2. 常见问题

- 未调用自动编码接口

排查一下meta接口返回值的isCoded参数，看看是否返回值为true，为true才会走后续的自动编码接口。