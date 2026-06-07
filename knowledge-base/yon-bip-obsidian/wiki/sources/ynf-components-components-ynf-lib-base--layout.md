---
title: "布局 Layout"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--layout"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 2
---

# 布局 Layout

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--layout | 所属：YNF-组件

# [](#布局-layout)布局 Layout

布局组件, 可以拖入任何组件, 并配置统一样式

import { Layout } from "ynf-lib-base"

## [](#何时使用)何时使用

- 当需要对部分内容进行展示修改时, 可以使用此组件

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||模块是否可拖拽||draggable||boolean||当前模块选中后是否可拖拽||false|||
||宽度是否可拖拽||widthDragable||boolean||当前模块是否可以拖拽显示宽度||false|||
||折叠按钮位置||foldPosition||string||当前模块是否显示折叠按钮, 显示的折叠按钮的是左侧还是右侧||null|||
||使用分割器||isShowAssistant||boolean||当前模块是否使用分割器。 和折叠按钮区分使用||false|||
||分割布局||layoutSplit||string||使用分割器时, 分割区域布局方向, 在上、下、左、右位置||-|||
||默认展开||collapsed||boolean||使用分割器时, 分割区域默认是展开还是收起||false|||
||布局模式||mode||string||使用分割器时, 分割区域挤占悬浮模式||mixed|||
||折叠区高度/宽度||defaultSize||number||分割区域默认宽度||300|||
||折叠区最小高度/宽度||minSize||number||分割区限制拖拽最小尺寸||200|||
||折叠区最大高度/宽度||maxSize||number||分割区限制拖拽最大尺寸||300|||
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
||拖动后事件||onAfterDrag||Function()||组件拖动后回调事件|||||

## [](#isshowassistant)isShowAssistant

当开启使用分割器以后，会显示分割布局 、默认收起、是否展开、布局模式、是否可收起、折叠区高度/宽度、折叠区最小高度/宽度、折叠区最大高度/宽度属性

![image-20240823135653542](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/image-20240823135653542.4daf3a72.png)

同时可以向Layout布局的左右两侧拖入组件

![image-20240823135902141](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/image-20240823135902141.6b7b475e.png)