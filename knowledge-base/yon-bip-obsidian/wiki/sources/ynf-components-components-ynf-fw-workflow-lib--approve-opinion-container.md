---
title: "审批意见 ApproveOpinionContainer"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-fw-workflow-lib--approve-opinion-container"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 审批意见 ApproveOpinionContainer

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-fw-workflow-lib--approve-opinion-container | 所属：YNF-组件

# [](#审批意见-approveopinioncontainer)审批意见 ApproveOpinionContainer

展示审批人审核后，添加的审批意见

import { ApproveOpinionContainer } from "ynf-fw-workflow-lib"

## [](#何时使用)何时使用

- 当需要展示审批人的审批意见时使用

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||审批意见||cStyle||Style||组件样式配置, 接收css样式||{"display":"flex","position":"relative","margin":0,"flex":"0 1 auto","zIndex":"auto","flexDirection":"column","justifyContent":"flex-start","alignItems":"stretch","padding":0,"minWidth":50,"minHeight":50}|||
||审批环节||approveHistoryProcess||Custom||审批环节配置||-|||
||仅显示有效审批意见(驳回不显示)||effectiveOnly||boolean||设置是否仅显示有效审批意见(驳回不显示)||false|||
||初始化事件||onInitLoad||Function()||初始化事件|||||
||选择事件||onSelected||Function()||选择事件|||||