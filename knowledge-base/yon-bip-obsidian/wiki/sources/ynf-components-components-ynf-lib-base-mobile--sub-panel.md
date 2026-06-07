---
title: "辅助面板 SubPanel"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base-mobile--sub-panel"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 辅助面板 SubPanel

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base-mobile--sub-panel | 所属：YNF-组件

# [](#辅助面板-subpanel)辅助面板 SubPanel

辅助面板组件, 可以配合页签、审批等组件使用, 页面或浮层展示内容

import { SubPanel } from "ynf-lib-base-mobile"

## [](#何时使用)何时使用

- 需要浮层展示审批信息是可以使用, 配合页签组件, 特殊展示内容信息

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||高度||height||string||组件展示最低高度||400px|||
||距离底部高度||bottomPadding||string||浮层展示时距离底部高度, 防止遮挡底部按钮等内容||50|||
||滚动监听元素||scrollDom||string||监听滚动事件元素, 当区域滚动时, 控制辅助面板组件是浮层展示、页面内展示|||||
||无流程隐藏||hideSubPanel||boolean||当配置了审批流程时, 用于控制无流程时是否隐藏辅助面板组件||false|||
||审批流关联的数据源||store||Custom||用于判断数据源是否配置了审批流||mobx://rootStore.formStore|||
||审批子页签位置||tabPaneNumber||Number||审批流程所在子页签位置, 用于控制是否隐藏改子页签||0|||