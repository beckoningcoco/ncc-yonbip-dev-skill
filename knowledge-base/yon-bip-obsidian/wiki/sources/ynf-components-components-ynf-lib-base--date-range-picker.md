---
title: "日期范围 DateRangePicker"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--date-range-picker"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 日期范围 DateRangePicker

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--date-range-picker | 所属：YNF-组件

# [](#日期范围-daterangepicker)日期范围 DateRangePicker

日期范围选择框。

import { DateRangePicker } from "ynf-lib-base"

## [](#何时使用)何时使用

- 需要选择日期段的场景，提升数据筛选效率。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||开始日期||startDateStoreField||Custom||开始日期|||||
||结束日期||endDateStoreField||Custom||结束日期|||||
||日期框样式||cStyle||Style||日期框样式||-|||
||设置日期格式||format||string||设置日期格式||YYYY-MM-DD|||
||最小可选日期||minDate||date||最小可选日期||-|||
||最大可选日期||maxDate||date||最大可选日期||-|||
||显示清空按钮||showClose||boolean||显示清空按钮||true|||
||展示的面板类型||picker||string||展示的面板类型||date|||
||显示筛选项||isShowOptions||boolean||显示筛选项||false|||
||显示更多||isShowMoreOption||boolean||显示更多||false|||