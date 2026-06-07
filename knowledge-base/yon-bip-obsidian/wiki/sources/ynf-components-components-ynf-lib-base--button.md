---
title: "按钮 Button"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--button"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 按钮 Button

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--button | 所属：YNF-组件

# [](#按钮-button)按钮 Button

用于通过点击执行一个具体的行为或动作。

import { Button } from "ynf-lib-base"

## [](#何时使用)何时使用

- 标记了一个操作命令，响应用户点击行为，触发相应的业务逻辑。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||样式设置||cStyle||Style||样式设置||-|||
||按钮类型||type||string||设置按钮主题类型||default|||
||圆角||shape||string||设置按钮圆角类型||default|||
||按钮大小||size||string||设置按钮大小||md|||
||图标位置||iconPosition||string||设置按钮图标位置||left|||
||单击前||onBeforeClick||||单击前||-|||
||单击后||onAfterClick||||单击后||-|||