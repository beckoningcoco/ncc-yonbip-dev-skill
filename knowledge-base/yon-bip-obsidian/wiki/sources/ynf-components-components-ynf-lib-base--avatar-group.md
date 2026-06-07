---
title: "头像组 AvatarGroup"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--avatar-group"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 头像组 AvatarGroup

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--avatar-group | 所属：YNF-组件

# [](#头像组-avatargroup)头像组 AvatarGroup

用于集中展示多个用户头像的组件

import { AvatarGroup } from "ynf-lib-base"

## [](#何时使用)何时使用

- 需要同时展示多个用户头像的场景，如用户列表、聊天界面和评论区等。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||数据源||dataSourceCustom||Custom||自定义头像组内容||[{},{},{},{},{},{}]|||
||显示的最大头像个数||maxCount||Number||显示的最大头像个数||5|||
||超出最大个数时||mode||'showRemaining' | 'showOperationButtons' | none||显示剩余人数（showRemaining）、显示操作按钮（showOperationButtons）、不显示内容（none）||showRemaining|||
||气泡弹出方式||maxPopoverTrigger||'hover' | 'click'||悬浮（hover）、c点击（click）||hover|||
||气泡弹出位置||maxPopoverPlacement||'top' | 'bottom'||上方（top）、下方（bottom）|||||
||图像形状||shape||'circle' | 'square'||圆形（circle'）、方形（square）||circle|||
||图像大小||size||'large' | 'default' | 'small'||大（large）、默认（default）、小（small）||default|||
||单击头像||onAvatarClick||Function({event, dataSourceCustom})||头像点击时的事件|||||
||单击按钮||onButtonClick||Function({event})||按钮点击时的事件|||||