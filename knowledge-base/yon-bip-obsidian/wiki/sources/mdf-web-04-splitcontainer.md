---
title: "左右分隔容器 SplitContainer"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-splitcontainer"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 左右分隔容器 SplitContainer

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-splitcontainer | 所属：Web组件

# [](#左右分隔容器-splitcontainer)左右分隔容器 SplitContainer

## [](#1-功能)1. 功能

折叠方向向左时(splitDirection == 'left')：支持折叠、拖拽

折叠方向向右时(splitDirection == 'right')：支持挤占、隐藏、悬浮三态切换

折叠方向为右侧固定时(splitDirection == 'rightroot')：支持左右固定区域展示，子container中align=='right'的项会放在左侧展示，而align=='rightroot'的项会放在右侧展示（不可拖拽、折叠）

配置为spliterContainerSpecial时：支持左右固定区域展示，由splitDirection决定分割线偏移位置（不可拖拽、折叠）

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/SplitContainerzuoyoufengerongqi_image1.9c2c914a.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/SplitContainerzuoyoufengerongqi_image2.9a51d6bc.png)

## [](#3-cstyle中可识别参数一览表)3. cstyle中可识别参数一览表

||参数名称||类型||默认值||参数说明|
||参数名称||类型||默认值||参数说明|
||splitDirection||string||left||折叠方向|
||defaultShowRight||boolean||true||右侧默认是否展示|
||defalutShowLeft||boolean||true||左侧默认是否展示|
||rightDefaultWidth||number||||右侧初始宽度（建议splitDirection为right时配置使用），支持传入百分比|
||splitMinWidth||number||240||拖拽最小宽度，此项也可以作为初始宽度使用|
||splitMaxWidth||number||800||拖拽最大宽度|
||outsideMetaHeight||number||||外层meta高度，初始化时会减去|
||spliterContainerSpecial||boolean||false||开启特殊显示模式，支持功能1.4splitMinWidth|
||leftVisible||boolean||true||是否显示左侧区域，为false时整个左侧区域及热区隐藏|
||rightVisible||boolean||true||是否显示右侧区域，为false时整个右侧区域及热区隐藏|

## [](#4-事件)4. 事件

||名称||参数||说明||备注|
||名称||参数||说明||备注|
||updateViewMeta||{
code: groupId string
 splitSwitch boolean
 leftVisible rightVisible<boolean visible boolean
 hideSplitContainer boolean>
 subtractHeight number }||更新splitcontainer状态||当splitSwitch传入但code未传入时，会将当前页面的所有splitcontainer进行折叠。（嵌套使用该组件的情况请注意）其他参数均需要传入codesplitSwitch折叠规则：1.折叠方向向左时(splitDirection == 'left')：为折叠打开状态的互相切换2.折叠方向向右时(splitDirection == 'right')：如果当前为挤占状态，则会切换到隐藏状态。如果当前为隐藏状态，则会切换到悬浮状态。如果当前为悬浮状态，则会切换到隐藏状态。3.配置为spliterContainerSpecial时，会隐藏/展示配置方向（splitDirection）一侧的子容器subtractHeight：当outsideMetaHeight无法满足时，可以使用此参数动态更新高度，传入+num即为减去number，反之为加上number|
||openSplitContainer||<boolean>||打开splitcontainer||此处存在其他公用逻辑，传入true即可在任意状态下展开容器。|
||commonReRender||||重新渲染splitcontainer||容器组件不干涉内部组件的状态，提供该方法来更新组件|

## [](#5-辅助区配置规则)5. 辅助区配置规则

[业务助手配置（辅助区）](#/guides/09-yewuzhushoupeizhifuzhuqu)

## [](#6-注意事项)6. 注意事项

后续随着上线进度，splitcontainer和newsplitcontainer会统一为newsplitcontainer