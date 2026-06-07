---
title: "布局 Layout"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base-mobile--layout"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 布局 Layout

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base-mobile--layout | 所属：YNF-组件

# [](#布局-layout)布局 Layout

布局组件, 可以拖入任何组件, 并配置统一样式

import { Layout } from "ynf-lib-base-mobile"

## [](#何时使用)何时使用

- 当需要对部分内容进行展示修改时, 可以使用此组件

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||样式设置||cStyle||Style||布局组件相关样式设置||{"display":"flex","position":"relative","margin":0,"flex":"0 1 auto","zIndex":"auto","flexDirection":"column","justifyContent":"flex-start","alignItems":"stretch","padding":0,"minWidth":50,"minHeight":50}|||
||模块是否可拖拽||draggable||boolean||当前模块选中后是否可拖拽||false|||
||是否开启下拉刷新||isEnableRefresh||boolean||是否开启下拉刷新||false|||
||初始化事件||onInitLoad||Function()||组件初始化回调事件|||||
||双击||onDblClick||Function()||组件双击回调事件|||||
||鼠标按下||onMouseDown||Function()||鼠标按下时触发回调事件|||||
||鼠标松开||onMouseUp||Function()||鼠标松开时触发回调事件|||||
||鼠标移入||onMouseEnter||Function()||鼠标移入到组件上时回调事件|||||
||鼠标离开||onMouseLeave||Function()||鼠标移出组件上时回调事件|||||
||鼠标移动||onMouseMove||Function()||鼠标移动时回调事件|||||
||鼠标浮上||onMouseOver||Function()||鼠标移到目标组件时回调事件|||||
||鼠标移开||onMouseOut||Function()||鼠标离开目标组件时回调事件|||||
||拖动事件||onDrag||Function()||组件正在拖动时回调事件|||||
||开始拖动||onDragStart||Function()||组件开始被拖动时回调事件|||||
||结束拖动||onDragEnd||Function()||完成组件拖动时回调事件|||||
||拖动移入||onDragEnter||Function()||拖动组件进入放置目标时回调事件|||||
||拖动移出||onDragLeave||Function()||拖动组件离开放置目标时回调事件|||||
||拖到目标上||onDragOver||Function()||拖动组件在放置目标上时回调事件|||||
||拖动放置||onDrop||Function()||拖动组件放置在目标区域时回调事件|||||
||滚动监听||onScroll||Function()||组件滚动时回调事件|||||
||下拉刷新||onRefresh||Function()||下拉刷新执行回调事件|||||
||拖动后事件||onAfterDrag||Function()||组件拖动后回调事件|||||