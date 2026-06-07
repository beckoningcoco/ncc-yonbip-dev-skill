---
title: "跨页筛选和页面刷新"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/14-kuayeshaixuanheyemianshuaxin"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 跨页筛选和页面刷新

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/14-kuayeshaixuanheyemianshuaxin | 所属：指南

# [](#跨页筛选和页面刷新)跨页筛选和页面刷新

领域根据需求程度自行选择适配

## [](#1-跨页筛选与跨页排序)1. 跨页筛选与跨页排序

### [](#11-后端文档)1.1. 后端文档

列表跨页筛选后端适配参考文档（接入查询仓）：[https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=162344267](https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=162344267)

### [](#12-前端特性)1.2. 前端特性

配置方式：修改Consul上的配置即可，各部门对应前端特性人员权限：[MDF领域接口人登记表](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=20771722)

特性名称：跨页筛选：filteringCrossPage，跨页排序：filtingQueryBy

## [](#2-页面刷新功能)2. 页面刷新功能

### [](#21-说明文档)2.1. 说明文档

[列表刷新SQL脚本参考文档](#/guides/14-shuaxingongnengpeizhi#3-%E5%88%97%E8%A1%A8%E5%88%B7%E6%96%B0sql%E8%84%9A%E6%9C%AC%E5%8F%82%E8%80%83%E6%96%87%E6%A1%A3)

### [](#22-适配策略)2.2. 适配策略

在日常环境适配、验证过程中发现部分领域因历史问题对于列表刷新按钮功能的适配难度较大，适配周期可能需要延长，部分特殊单据还需做额外处理等原因，经商讨决定在预发、生产环境将不再在公共脚本中处理列表刷新按钮，由领域根据需求紧急程度自行执行脚本，难度较大领域可适当延缓上线时间。

## [](#3-相关视频)3. 相关视频

- 跨页筛选功能和页面刷新功能演示、说明会议录屏回看地址：
[https://docs.diwork.com/l/6f1E58de056c](https://docs.diwork.com/l/6f1E58de056c)