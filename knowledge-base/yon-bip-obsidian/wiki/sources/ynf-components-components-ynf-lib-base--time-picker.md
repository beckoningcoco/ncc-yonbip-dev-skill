---
title: "时间 TimePicker"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--time-picker"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 时间 TimePicker

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--time-picker | 所属：YNF-组件

# [](#时间-timepicker)时间 TimePicker

时间选择器。

import { TimePicker } from "ynf-lib-base"

## [](#何时使用)何时使用

- 需要显示时间时。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||格式类型||format||'system' | 'HH:mm:ss' | 'HH:mm'||系统格式 | 时分秒 | 时分||system|||
||是否12小时制||use12Hours||boolean||是否12小时制||false|||
||小时步长||hourStep||Number||小时步长||1|||
||分钟步长||minuteStep||Number||分钟步长||1|||
||秒步长||secondStep||Number||秒步长||1|||
||显示清空按钮||showClear||boolean||显示清空按钮||true|||
||设置禁用的小时||disabledHours（与Tinper的时间组件的属性用法一致）||Function||设置禁用的小时|||||
||设置禁用的分钟||disabledMinutes（与Tinper的时间组件的属性用法一致）||Function||设置禁用的小时|||||
||设置禁用的秒||disabledSeconds（与Tinper的时间组件的属性用法一致）||Function||设置禁用的小时|||||