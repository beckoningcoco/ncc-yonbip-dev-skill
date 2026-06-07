---
title: "审批流程图 ApproveProcess"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-fw-workflow-mobile-lib--approve-process"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 审批流程图 ApproveProcess

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-fw-workflow-mobile-lib--approve-process | 所属：YNF-组件

# [](#审批流程图-approveprocess)审批流程图 ApproveProcess

展示审批流执行的流程图

import { ApproveProcess } from "ynf-fw-workflow-mobile-lib"

## [](#何时使用)何时使用

- 当只需要展示审批流程图时使用, 展示当前单据所有执行的审批流节点

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||数据源||formStore||Text||表单数据对象, 用于控制表单数据相关逻辑||mobx://rootStore.formStore|||
||容器样式||cStyle||Style||审批流程图组件相关样式设置||-|||