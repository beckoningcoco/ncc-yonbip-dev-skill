---
title: "表单头部栏 Header"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--header"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 表单头部栏 Header

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--header | 所属：YNF-组件

# [](#表单头部栏-header)表单头部栏 Header

用于展示页面标题、导航按钮和操作工具等信息，通常在页面顶部展示。

import { Header } from "ynf-lib-base"

## [](#何时使用)何时使用

- 表单页面: 在表单输入页面顶部显示标题和操作按钮，以帮助用户导航和操作。
- 应用程序界面: 提供一致的导航和操作区域，提升用户体验。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||自定义标题||customTitle||string||设置标题内容, 只有在开启显示标题时生效|||||
||显示返回按钮||visibleBackButton||boolean||开启后, 组件最左侧显示返回按钮||true|||
||显示标题图标||visibleTitleIcon||boolean||开启后, 标题左侧显示图标||true|||
||显示只看必填项||visibleMustSelect||boolean||开启后, 在编辑态时显示只看必填项勾选按钮||true|||
||表单头部栏||cStyle||Style||表单头部栏||-|||
||返回点击事件||onBackClick||||点击返回按钮时的回调函数||-|||
||只看必填点击事件||onRequiredClick||||勾选只看必填项时的回调函数||-|||