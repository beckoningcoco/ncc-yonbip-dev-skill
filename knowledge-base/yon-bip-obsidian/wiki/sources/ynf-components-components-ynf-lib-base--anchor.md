---
title: "锚点 Anchor"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--anchor"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 锚点 Anchor

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--anchor | 所属：YNF-组件

# [](#锚点-anchor)锚点 Anchor

用于跳转到页面指定位置。

import { Anchor } from "ynf-lib-base"

## [](#何时使用)何时使用

- 需要展现当前页面上可供跳转的锚点链接，以及快速在锚点之间跳转。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||目标容器alias||targetAlias||string||指定滚动的容器的标识|||||
||距离窗口顶部达到指定偏移量后触发||offsetTop||number||设置距离窗口顶部达到指定位置后触发锚点的偏移量值||-|||
||锚点方向||direction||string||指定锚点方向, 有横向和纵向两种展示形式||vertical|||
||锚点选项||items||string||设置锚点元素, JSON格式, 如: "[{"title":"标题", "anchorId": "绑定的容器alias"}]"||[{"title":"标题", "anchorId": "绑定的容器alias"}]|||
||自定义样式名||className||string||自定义样式名|||||
||容器样式||cStyle||Style||容器样式||-|||
||按钮样式||itemStyle||Style||按钮样式||-|||
||间隔线样式||dottedStyle||Style||间隔线样式||-|||
||被激活的回调||activeHandle||||被激活的回调，三个参数,以基本示例为例，列表li、锚点a、激活区域p||-|||
||激活后的回调||deactiveHandle||||激活后的回调||-|||
||监听锚点链接改变||onChange||||监听锚点链接改变||-|||