---
title: "标签 Tag"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--tag"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 标签 Tag

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--tag | 所属：YNF-组件

# [](#标签-tag)标签 Tag

进行标记和分类的小标签。

import { Tag } from "ynf-lib-base"

## [](#何时使用)何时使用

- 用于标记事物的属性和维度。
- 进行分类。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||是否可关闭||closable||boolean||是否可关闭||true|||
||标签大小||size||"lg" | "md" | "sm"||大| 中 | 小||md|||
||标签类型||tagStyle||string||标签类型||border|||
||标签文案||tagContent||"text" | "border" | "fill" | "seal"||文字标签 | 线框标签 | 填充标签 | 印章标签||标签|||
||关闭||onClose||function(val)||关闭标签时的回调事件||-|||