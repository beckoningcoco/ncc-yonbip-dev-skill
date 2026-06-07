---
title: "审批 WorkFlow"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-fw-workflow-lib--work-flow"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 审批 WorkFlow

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-fw-workflow-lib--work-flow | 所属：YNF-组件

# [](#审批-workflow)审批 WorkFlow

展示审批相关按钮和审批流程

import { WorkFlow } from "ynf-fw-workflow-lib"

## [](#何时使用)何时使用

- 需要审批时使用, 审批相关人员可以查看当前的审批流程, 并执行相关的审批操作

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||审批||cStyle||Style||审批相关样式设置||-|||
||显示标题||isShowTitle||boolean||是否显示审批标题||true|||
||面板模式||mode||string||面板模式。 一直展示审批数据, 还是点击展示审批数据||default|||
||是否展示空数据占位||isShowEmpty||Bool||是否展示空数据占位。没有审批时, 是否展示空提示占位||true|||
||是否固定审批按钮操作区||isFixedButtons||Bool||是否固定审批按钮操作区||true|||
||是否显示面板阴影||isShowShadow||Bool||是否显示面板阴影||false|||