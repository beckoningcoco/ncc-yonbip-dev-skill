---
title: "参照查看最近历史功能适配"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/05-canzhaozhakanzuijinlishigongnengshipei"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 参照查看最近历史功能适配

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/05-canzhaozhakanzuijinlishigongnengshipei | 所属：指南

# [](#参照查看最近历史功能适配)参照查看最近历史功能适配

1、参照弹窗内新增报权限问题
参照提供方在参照pub_ref表的extendField字段增加一个serviceCode字段（参照档案的serviceCode）即可。

## [](#1-领域后端适配)1. 领域后端适配

《后端配置》（对文档不清楚可联系mdd后端老师）

## [](#2-统一node配置)2. 统一node配置

增加一个referRecentList特性即可，每个领域负责人见
[MDF服务配置中心权限](#/node/02-config-item-desc)

## [](#3-日常环境效果)3. 日常环境效果

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/canzhaozhakanzuijinlishigongnengshipeiimage1.ef89357a.png)
备注： 如果需要修改pub_ref表的cEntityKeyFld，则需要同时修改pub_ref表的extendField字段增加realCEntityKeyFld改成老的值