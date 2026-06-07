---
title: "--表格分组展示"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-biaogefenzuzhanshi"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# --表格分组展示

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-biaogefenzuzhanshi | 所属：Web组件

# [](#表格分组展示)表格分组展示

## [](#1-配置方式)1. 配置方式

表格cExtProps里配置groupcolumn:'' 指明分组字段;

## [](#2-分组内容扩展可选)2. 分组内容扩展（可选）

分组默认展示指定字段的值，可通过脚本修改

model.setColumnState('xxx', 'formattergroup', (index, cellvalue) => {

 const a = {}

 a.html = '<span>你好年后你好年后你好年后你好年后你好年后你好年后</span>'

 

 return a;

})

## [](#3-常用api)3. 常用API

展开/收起全部

model.expandAllRow(true/false)

## [](#4-故事链接)4. 故事链接

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/biaogefenzuzhanshiimg1.64c1170e.png)