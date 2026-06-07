---
title: "数字框 InputNumber"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--input-number"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 数字框 InputNumber

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--input-number | 所属：YNF-组件

# [](#数字框-inputnumber)数字框 InputNumber

用于在一个文本框中输入数字类型的数据

import { InputNumber } from "ynf-lib-base"

## [](#何时使用)何时使用

- 需要精确输入数字的场景：当用户需要输入明确的数字值时，例如设置数量、金额、百分比等。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||文本框样式||cStyle||Style||文本框样式||-|||
||格式类型||subuitype||string||限制输入的数值的格式, 其中系统格式会根据我的首选中的数字格式进行格式化||system|||
||后缀||addonAfter||string||带标签的 input，设置后置标签||-|||
||前缀||addonBefore||string||带标签的 input，设置前置标签||-|||
||最大值||max||number||失焦时校验||-|||
||最小值||min||number||失焦时校验||-|||
||千位分隔符||toThousands||boolean||是否自动添加千分符||false|||
||精度||precision||number||小数位数, 格式类型为整数时不生效||-|||
||设置精度到store||usePrecisionInStore||boolean||开启后会将精度属性的值同步到store中||false|||