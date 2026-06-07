---
title: "树参照 ReferTree"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-refertree"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 树参照 ReferTree

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-refertree | 所属：Web组件

# [](#树参照-refertree)树参照 ReferTree

## [](#1-功能背景)1. 功能背景

这个包含下级是规则级的，包含下级会将当前节点下的所有子节点全部选中，并将这个节点数据标记存到模型里。未做后端存储，

## [](#2-配置设置)2. 配置设置

参照ui模板的cStyle配置 ruleSelect: true

## [](#3-效果展示)3. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ReferTreebaohanxiaji-image.2d5e44a2.png)

## [](#4-扩展功能)4. 扩展功能

取数据
包含下级的数据存储在参照模型 （referModel.get('ruleCheckAllchildren')）
数据格式 { xx1: ['aa1', 'aa2'...], xx2: ['aa1', 'aa2'...]} 。xx1, xx2 规则级包含下级当前节点的key， aa1,aa2 包含的子节点（非懒加载时，或者懒加载时展开才有）

反显
可在参照beforeBrowse 扩展钩子里执行 referModel._set_data('ruleCheckAllchildren', {xx1: [], xx2: []}) // 参照打开前赋值就行