---
title: "审批流程 WorkFlowProcess"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-fw-workflow-mobile-lib--work-flow-process"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 审批流程 WorkFlowProcess

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-fw-workflow-mobile-lib--work-flow-process | 所属：YNF-组件

# [](#审批流程-workflowprocess)审批流程 WorkFlowProcess

展示审批流、审批历史。需要配置辅助面板组件使用

import { ApproveOpinionContainer } from "ynf-fw-workflow-mobile-lib"

## [](#何时使用)何时使用

- 当配置了审批组件、辅助面板组件时, 需要查看审批流、审批历史时使用

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||显示内容||workFlowType||string||审批组件展示内容。 审批流程图、审批历史, 还是两个都展示||approveAll|||
||数据源||formStore||Text||表单数据对象, 用于控制表单数据相关逻辑||mobx://rootStore.formStore|||
||容器样式||cStyle||Style||审批流程组件相关样式设置||-|||