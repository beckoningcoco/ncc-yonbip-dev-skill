---
title: "双表组件 SplitPane"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/03-splitpane"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 双表组件 SplitPane

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/03-splitpane | 所属：Web组件

# [](#双表组件-splitpane)双表组件 SplitPane

## [](#1-api)1. API

1、viewModel.execute("hidePane",xxx); 参数：false为显示双表容器，true为隐藏双表容器，不传参数则是切换显示/隐藏，只能隐藏第二个pane

2、双表组件cStyle里可配置{hidePane:true};

## [](#2-cstyle属性)2. cStyle属性

||属性名||属性默认值||属性含义|
||splitDirection||horizontal||horizontal：上下结构；vertical：左右结构|
||synchronizeScroller||true||双表是否一起滚动|
||minSize||180||单个pane最小高(宽)度|
||defaultHeight||||列表页默认吸底，如果配置defaultHeight属性，吸底显示时小于defaultHeight会设置高度是defaultHeight；卡片页页如果容器高度小于可视区域高度的40%或者小于defaultHeight，则设置高度defaultHeight或者640；defaultHeight只针对上下布局|
||disableSwitch||false||禁用切换布局功能|

## [](#3-代码控制)3. 代码控制

### [](#31-隐藏pane)3.1. 隐藏pane

1、viewmodel.execute('hidePane', true) // 只有一个splitpane，隐藏右侧(下侧)pane
2、viewmodel.execute('hidePane', { code: cGroupCode, hide: true, hideLeftPane:true }) // splitpane嵌套splitpane时
参数说明：
code：如果是splitpane嵌套splitpane，隐藏pane的时候需要指明隐藏的是哪个splitpane下的pane，如果只有一个splitpane，可以不传
hide：使用隐藏
hideLeftPane：隐藏的是否是左侧(上侧)pane

参数说明：

code：如果是splitpane嵌套splitpane，隐藏pane的时候需要指明隐藏的是哪个splitpane下的pane，如果只有一个splitpane，可以不传

hide：使用隐藏

hideLeftPane：隐藏的是否是左侧(上侧)pane

## [](#4-常见问题)4. 常见问题

### [](#41设计器页面双表容器一侧不显示内容)4.1设计器页面双表容器一侧不显示内容

检查下双表容器两个children的cAlign值，需要一个值是left,，一个是right

参考示例：[双表布局-配置](file:////pages/viewpage.action%3fpageId=12150016)