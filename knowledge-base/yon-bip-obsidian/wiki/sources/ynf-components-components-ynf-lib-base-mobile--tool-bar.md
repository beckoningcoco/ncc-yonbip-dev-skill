---
title: "工具栏容器 ToolBar"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base-mobile--tool-bar"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 工具栏容器 ToolBar

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base-mobile--tool-bar | 所属：YNF-组件

# [](#工具栏容器-toolbar)工具栏容器 ToolBar

简化工具栏变成一个简单容器,需要手动拖放按钮组件

import { ToolBar } from "ynf-lib-base-mobile"

## [](#何时使用)何时使用

填写使用场景

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||样式设置||cStyle||Style||样式设置||-|||
||适配IOS安全区||isShowSafeArea||boolean||适配IOS安全区||false|||
||按钮显示数量||maxVisibleNum||number||按钮显示数量||3|||
||按钮渲染||onButtonRender||function||按钮渲染||-|||
||按钮均分功能||buttonWidthAuto||boolean||开启以后toolbar里面的按钮自动根据宽度均分，多余的按钮放到`...`里面||false|||
||对齐方式||direction||left`/`right||buttonWidthAuto`为`true，direction为right，此时`...`左侧，如果想在右侧，需要配置direction值为left||right|||