---
title: "页面 Page"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--page"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 页面 Page

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--page | 所属：YNF-组件

# [](#页面-page)页面 Page

用于根据配置的单据信息动态渲染页面内容。

import { Page } from "ynf-lib-base"

## [](#何时使用)何时使用

- 动态文档生成: 当需要根据不同配置生成不同内容的页面，如合同、报告或表单;
- 模板应用: 生成基于模板的页面，其中模板定义了布局和内容结构，而单据信息提供了实际数据。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||页面||cStyle||Style||页面||-|||
||自定义单据编码||pageBillNo||string||设置billNo的值, 该属性将作为页面url的参数||-|||
||自定义单据所属领域||pageDomainKey||string||设置domainKey的值, 该属性将作为页面url的参数||-|||
||自定义单据所属业务对象||pageBusiObj||string||设置busiObj的值, 该属性将作为页面url的参数||-|||
||自定义单据其他属性||pageOtherParams||object||设置其他参数的值, 可配置mobx动态数据, 该属性将作为页面url的参数||-|||
||获取页面rootStore||onGetRootStore||||页面加载时触发，用于获取页面rootStore||-|||