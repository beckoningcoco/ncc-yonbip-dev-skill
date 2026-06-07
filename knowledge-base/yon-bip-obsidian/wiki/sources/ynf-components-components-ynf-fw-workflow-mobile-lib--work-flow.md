---
title: "审批 WorkFlow"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-fw-workflow-mobile-lib--work-flow"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 审批 WorkFlow

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-fw-workflow-mobile-lib--work-flow | 所属：YNF-组件

# [](#审批-workflow)审批 WorkFlow

展示当前审批节点需要执行的审批操作按钮

import { WorkFlow } from "ynf-fw-workflow-mobile-lib"

## [](#何时使用)何时使用

- 当配置审批历史、审批流时, 需要使用审批操作按钮。 用于处理审批操作

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||审批||cStyle||Style||审批组件相关样式设置||-|||
||数据源||formStore||Text||表单数据对象, 用于控制表单数据相关逻辑||mobx://rootStore.formStore|||
||审批类型||sourceType||string||审批组件展示类型||actionInit|||
||审批按钮名称||content||string||审批类型为菜单时的按钮名称||审批|||
||按钮大小||size||string||审批按钮大小||large|||
||按钮类型||type||string||审批按钮类型||default|||