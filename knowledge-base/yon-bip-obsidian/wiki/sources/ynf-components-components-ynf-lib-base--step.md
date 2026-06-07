---
title: "步骤条 Step"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--step"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 步骤条 Step

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--step | 所属：YNF-组件

# [](#步骤条-step)步骤条 Step

展示步骤状态。。

import { Step } from "ynf-lib-base"

## [](#何时使用)何时使用

- 需要对复杂任务分解、用户引导、进度展示等场景。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||数据配置||dataSource||Custom||自定义步骤条内容。||[{"title":"标题","title_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880593","description":"描述","description_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880594"},{"title":"标题","title_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880593","description":"描述","description_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880594"},{"title":"标题","title_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880593","description":"描述","description_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880594"},{"title":"标题","title_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880593","description":"描述","description_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880594"}]|||
||状态||status||"process" | "wait" | "finish" | "error"||进行中 | 等待 | 已完成 | 错误||process|||
||方向||direction||"horizontal" | "vertical"||横向 | 纵向||horizontal|||
||节点样式||stepType||"default" | "arrow" | "dot" | "number"||默认 | 箭头 | 圆点 | 数字||default|||
||当前步骤||current||number||当前步骤||0|||
||大小||size||string||大小||default|||
||是否多步骤条||more||boolean||是否多步骤条||false|||