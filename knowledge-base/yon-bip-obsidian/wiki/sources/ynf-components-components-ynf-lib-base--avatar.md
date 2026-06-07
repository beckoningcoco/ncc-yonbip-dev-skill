---
title: "头像 Avatar"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--avatar"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 头像 Avatar

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--avatar | 所属：YNF-组件

# [](#头像-avatar)头像 Avatar

用来代表用户或事物，支持图片、图标或字符展示。

import { Avatar } from "ynf-lib-base"

## [](#何时使用)何时使用

- 在用户个人资料页、评论区、聊天界面等地方，用于展示用户的形象。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||头像来源||sourceType||'modelPath' | 'imgUrl' | 'upload'||当为modelPath，关联其他字段，当为imgUrl时，代表图片图片资源地址，当为upload属性，代表上传图片||modelPath|||
||图像形状||shape||'circle' | 'square'||圆形（circle）、方形（square）||circle|||
||图像大小||size||'large' | 'default' | 'small'||大（large）、默认（default）、小（small）||default|||
||图像无法显示时的替代文本||alt||string|||||||
||点击事件||onClick||Function(event)||点击头像的事件|||||
||图片加载失败||onError||Function(event)||图片加载失败时的事件|||||