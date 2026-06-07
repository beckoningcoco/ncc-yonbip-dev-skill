---
title: "文本 Text"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--text"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 文本 Text

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--text | 所属：YNF-组件

# [](#文本-text)文本 Text

用于在页面中展示静态文本或富文本内容。

import { Text } from "ynf-lib-base"

## [](#何时使用)何时使用

- 静态内容展示: 用于页面中展示静态的文字信息，例如标题、描述、文章内容等;
- 文档和说明: 显示帮助文档、说明文字或教程。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||文本类型||type||string||设置展示的文本类型||default|||
||显示文本||richDataSource||string||要展示的富文本的值, 文本类型为富文本时生效||-|||
||显示文本||dataSource||string||要展示的普通文本的值, 文本类型为默认时生效|||||
||溢出省略||textOverflow||boolean||开启后, 显示文本超出最大行数时, 会使用省略号代替, 只有在文本类型为默认时生效||false|||
||最大行数||maxLine||number||设置显示文本的最大行数, 开启溢出省略时, 超出该设定值会使文本省略, 只有在文本类型为默认且开启溢出省略时生效||1|||
||文本||cStyle||Style||文本||-|||