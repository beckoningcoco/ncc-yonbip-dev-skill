---
title: "移动端参照适配新增编辑功能"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/26-yidongduancanzhaoshipeixinzengbianjigongneng"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 移动端参照适配新增编辑功能

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/26-yidongduancanzhaoshipeixinzengbianjigongneng | 所属：指南

## [](#移动端参照适配新增编辑功能)移动端参照适配新增编辑功能

**实现参照的新增或者编辑的前提是参照提供方要有参照新增页面的移动端模板**

表参照/树表参照

1 在参照模板的table分组下增加一个toolbar
里面预制新增(btnAdd)或者编辑(btnEdit)按钮

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yidongduancanzhaoshipeixinzengbianjigongneng.c5d7a1b7.png)

2 使用方在页面模板的参照字段的cStyle加一个showActionToolBar: true