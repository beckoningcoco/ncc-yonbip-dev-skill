---
title: "流程信息 WorkFlowInfo"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-fw-workflow-mobile-lib--work-flow-info"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 流程信息 WorkFlowInfo

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-fw-workflow-mobile-lib--work-flow-info | 所属：YNF-组件

# [](#流程信息-workflowinfo)流程信息 WorkFlowInfo

展示流程信息(审批历史、审批流)。可以配置监听页面滚动, 控制是展示在页面内, 还是浮层展示标题

import { WorkFlowInfo } from "ynf-fw-workflow-mobile-lib"

## [](#何时使用)何时使用

- 当配置了审批组件时, 需要查看审批历史、审批流时使用。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||高度||height||string||审批组件展示高度||400px|||
||距离底部高度||bottomPadding||string||距离底部高度, 设置的是底部按钮栏高度, 防止遮挡底部按钮栏内容||50|||
||滚动监听元素||scrollDom||string||监听滚动事件的元素, 处理页面滑动过程中, 组件是否悬浮到底部按钮栏上面展示或页面展示|||||
||容器样式||cStyle||Style||流程信息组件相关样式设置||-|||