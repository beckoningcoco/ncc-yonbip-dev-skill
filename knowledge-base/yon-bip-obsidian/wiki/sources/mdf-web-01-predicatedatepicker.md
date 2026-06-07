---
title: "日期范围 Predicatedatepicker"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-predicatedatepicker"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 4
---

# 日期范围 Predicatedatepicker

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-predicatedatepicker | 所属：Web组件

# [](#日期范围-predicatedatepicker)日期范围 Predicatedatepicker

## [](#1-功能说明)1. 功能说明

此组件用来控制日期范围。

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Predicatedatepickerriqifanwei-image1.d8d3f0e6.png)

后面的日期框是RangePicker1组件，具体api请点击 [DatePicker日期](#/components-web/01-datepicker) 

## [](#3-使用方式)3. 使用方式

直接在查询区内预置这个条件即可使用，用户可以自由修改快捷日期项（需要有方案设置权限）

如果有方案设置权限，请按图中方式修改快捷日期项：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Predicatedatepickerriqifanwei-image2.37291b47.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Predicatedatepickerriqifanwei-image3.03e08b62.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Predicatedatepickerriqifanwei-image4.682b1950.png)

## [](#4-事件)4. 事件

onPredicateChange

切换日期范围的时候触发，参数是当前选中的项。

## [](#5-faq)5. FAQ

- [pb_meta_filter_item]表的itemType配置为predicatedatepicker
，页面报错，查询区出不来？

检查下枚举cEnumType是否配置，并且是否配置正确。

- 查询区里枚举日期组件怎么赋值？

看需求，比如是想直接选一个枚举值，选中近7天，或者其他枚举，那就扩展代码这么写：

filterViewModel.get('vouchdate //你的cItemName是啥就是啥，别照抄').getFromModel().setState('predicateValue', '-7' // 你配的枚举是啥你就写啥别照抄)

如果是想单独设置后面的日期，请你这么写：

filterViewModel.get('vouchdate').getFromModel().setValue({value1: '2023-03-08', value2: '2023-03-15'}) // 想设置哪个写哪个，value1是前面的，value2是后面的