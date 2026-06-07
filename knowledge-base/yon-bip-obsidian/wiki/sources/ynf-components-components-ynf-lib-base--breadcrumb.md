---
title: "面包屑 Breadcrumb"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--breadcrumb"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 面包屑 Breadcrumb

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--breadcrumb | 所属：YNF-组件

# [](#面包屑-breadcrumb)面包屑 Breadcrumb

显示当前页面在系统层级结构中的位置，并能向上返回。

import { Breadcrumb } from "ynf-lib-base"

## [](#何时使用)何时使用

- 导航路径显示，辅助用户浏览。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||数据配置||data||Custom||自定义面包屑内容||[{"uitype":"","key":1,"title":"首页","title_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC048804AE"},{"uitype":"","key":2,"title":"列表页","title_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC048804AF","href":"","blank":false},{"uitype":"","key":3,"title":"详情页","title_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC048804B1","href":"","blank":true}]|||
||分隔符||separator||string||分隔符||/|||
||加载||onLoadComponent||Function()||初始化加载组件时的事件||-|||