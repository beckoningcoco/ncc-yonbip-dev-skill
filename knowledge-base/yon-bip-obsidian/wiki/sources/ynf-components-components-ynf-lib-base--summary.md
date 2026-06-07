---
title: "指标卡 Summary"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--summary"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 指标卡 Summary

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--summary | 所属：YNF-组件

# [](#指标卡-summary)指标卡 Summary

关键指标数据展示。

import { Summary } from "ynf-lib-base"

## [](#何时使用)何时使用

- 需要对数据快速概览时。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||间隔显示||isGap||boolean||间隔显示||false|||
||对齐方式||align||"center" | "tl" | "tr"||居中 | 居左 | 居右||center|||
||列数||col||number||列数||2|||
||数据配置||columns||Custom||自定义指标卡内容||[{"fieldName":"指标1","fieldName_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880718","fieldValue":"900","suffix":"元","suffix_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880719"},{"fieldName":"指标2","fieldName_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC0488071A","fieldValue":"900","suffix":"元","suffix_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880719"},{"fieldName":"指标3","fieldName_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC0488071B","fieldValue":"800","suffix":"元","suffix_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880719"},{"fieldName":"指标4","fieldName_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC0488071C","fieldValue":"800","suffix":"元","suffix_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880719"}]|||
||千位分隔符||toThousands||boolean||千位分隔符||false|||
||精度||precision||number||精度||2|||