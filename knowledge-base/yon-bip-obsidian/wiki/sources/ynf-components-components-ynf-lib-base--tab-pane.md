---
title: "子页签 TabPane"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--tab-pane"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 子页签 TabPane

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--tab-pane | 所属：YNF-组件

# [](#子页签-tabpane)子页签 TabPane

用于分隔内容上有关联但属于不同类别的数据集合。子页签是只能用于页签内的子组件。

import { TabPane } from "ynf-lib-base"

## [](#何时使用)何时使用

- 提供平级的区域将大块内容进行收纳和展现，保持界面整洁。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||绑定的子表||store||Custom||绑定的子表的store对象, 绑定后可以用子表的名称来切换所在的页签||-|||
||隐藏图标||hiddenIcon||boolean||开启后, 会隐藏子页签的图标||false|||