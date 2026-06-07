---
title: "Iframe Iframe"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--iframe"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# Iframe Iframe

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--iframe | 所属：YNF-组件

# [](#iframe-iframe)Iframe Iframe

网页嵌入工具。

import { Iframe } from "ynf-lib-base"

## [](#何时使用)何时使用

- 需要内容嵌入、广告展示等。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||地址||url||string||网页嵌入的地址||''|||
||iframe属性||iframeAttr||object||iframe属性||{"src":"","width":"100%","height":"100%"}|||

### [](#iframe属性)iframe属性

iframe属性为一个对象，里面可以配置一些原生的HTML iframe标签的属性，属性详细介绍见[https://www.runoob.com/tags/tag-iframe.html](https://www.runoob.com/tags/tag-iframe.html)