---
title: "悬浮按钮 FixedButton"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--fixed-button"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 悬浮按钮 FixedButton

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--fixed-button | 所属：YNF-组件

# [](#悬浮按钮-fixedbutton)悬浮按钮 FixedButton

用于执行主要的操作或提供快捷功能，能够在页面的任意位置显示，以提高用户的交互体验。

import { FixedButton } from "ynf-lib-base"

## [](#何时使用)何时使用

- 脱离文档流：按钮悬浮在页面上，不会影响页面的其他布局。
- 重要操作快捷入口：用于提供用户对重要功能的快速访问，比如添加新内容、提交表单等。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||组件布局||fixedButtonStyle||string||组件布局||-|||
||图标||iconStyle||string||图标||-|||
||内容||innerStyle||string||内容||-|||
||按钮类型||type||string||设置按钮的填充类型||icon|||
||按钮文本||Text||string||设置按钮的文本内容, 只有按钮类型为文字或文字+图标时生效||标题|||
||底部距离||bottom||number||设置按钮距离页面底部的距离, 单位为px||10|||
||右侧距离||right||number||设置按钮距离页面右侧的距离, 单位为px||10|||
||跳转链接||url||string||设置后, 点击按钮跳转到对应的链接地址|||||