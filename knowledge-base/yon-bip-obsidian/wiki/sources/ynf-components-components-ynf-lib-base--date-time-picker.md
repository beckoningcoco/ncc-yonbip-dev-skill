---
title: "日期时间 DateTimePicker"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--date-time-picker"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 2
---

# 日期时间 DateTimePicker

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--date-time-picker | 所属：YNF-组件

# [](#日期时间-datetimepicker)日期时间 DateTimePicker

输入或选择日期时间的控件。

import { DateTimePicker } from "ynf-lib-base"

## [](#何时使用)何时使用

- 当用户需求输入一个日期时间或者选择一个日期时间的时候，提升用户输入效率与体验。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||日期时间格式||format||'system' | 'YYYY-MM-DD HH:mm:ss' | 'YYYY-MM-DD HH:mm' | 'YYYY-MM-DD' | 'YYYY-MM' | 'YYYY'||system为系统格式||system|||
||最小可选日期||minDate||date||最小可选日期||-|||
||最大可选日期||maxDate||date||最大可选日期||-|||
||显示清空按钮||allowClear||boolean||显示清空按钮||true|||

注意，系统格式是从工作台获取到的格式

点击账号头像

![image-20240726135639395](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/image-20240726135503299.1c6e92a5.png)

在我的首选里面就可以看到工作台的格式

![image-20240726135639395](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/image-20240726135639395.68c3eae3.png)