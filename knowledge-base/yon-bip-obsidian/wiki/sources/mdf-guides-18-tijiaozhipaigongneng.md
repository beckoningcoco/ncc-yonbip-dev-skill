---
title: "提交指派功能"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/18-tijiaozhipaigongneng"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 提交指派功能

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/18-tijiaozhipaigongneng | 所属：指南

# [](#提交指派功能)提交指派功能

开启前端特性开关：hasProcessHandler

## [](#1-列表页)1. 列表页

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/tijiaozhipaigongneng_image1.7f1ed2b6.png)

**如果想配置【编码、交易类型、创建人】的展示：**

需要有三个字段，分别是编码、交易类型、创建人，默认这三个字段的key为
code, bustype_name, auditor 取当前选中行里的这几个字段

如果业务数据和这三个字段不匹配或者名字为其他字段，可以通过action中配置cmdParameter解决，示例配置如下：

'{"fieldMap":{"code":"myCode","auditor":"myAuditor","bustype_name":"myBustype_name"}}'

## [](#2-卡片页)2. 卡片页

不需要额外配置