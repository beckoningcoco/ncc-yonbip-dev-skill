---
title: "标签选项 TagOption"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--tag-option"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 标签选项 TagOption

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--tag-option | 所属：YNF-组件

# [](#标签选项-tagoption)标签选项 TagOption

内容分段管理。

import { TagOption } from "ynf-lib-base"

## [](#何时使用)何时使用

- 需要对内容进行分段控制时。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||数据配置||dropdownOptions||Custom||自定义标签选项的内容||-|||
||允许新增||allowAdd||boolean||允许新增||true|||
||回调函数||onRemove||Function(args)||取消选择当前标签的事件。||-|||
||组件挂载||onLoadComponent||Function()||组件初始化挂载的事件。||-|||
||搜索||onSearch||Function(args)||下拉选择搜索框的事件。||-|||