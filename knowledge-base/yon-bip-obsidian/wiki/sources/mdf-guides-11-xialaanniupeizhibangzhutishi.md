---
title: "下拉按钮配置帮助提示"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/11-xialaanniupeizhibangzhutishi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 下拉按钮配置帮助提示

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/11-xialaanniupeizhibangzhutishi | 所属：指南

## [](#下拉按钮配置帮助提示)下拉按钮配置帮助提示

### [](#1配置方式)1.配置方式

原厂预置单据：

在数据库中bill_toolbaritem表找到，对应的按钮，配置parameter属性，增加配置{"tips":xxx}即可。

设计器：

在层级中找到对应的按钮，右键打开编辑器，增加属性即可

"cParameter": {

 "tips": "xxxx"

 }

## [](#2展示效果)2.展示效果

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/xialaanniupeizhibangzhutishi_image1.b5bc7ed2.jpeg)