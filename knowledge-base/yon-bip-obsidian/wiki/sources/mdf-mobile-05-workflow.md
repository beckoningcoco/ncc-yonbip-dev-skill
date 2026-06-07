---
title: "审批历史 Workflow"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/05-workflow"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 审批历史 Workflow

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/05-workflow | 所属：移动组件

# [](#审批历史-workflow)审批历史 Workflow

## [](#1-效果展示)1. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Workflowshenpilishi1.fdff0d32.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Workflowshenpilishi2.a9721b37.png)

cControlType: 'workflow'

说明：组件只在浏览态展示，新增和编辑不展示。

组件依赖数据中一些字断 isWfControlled || pk_procdefins || procinstId
这个判断存在

并且字断 verifystate 值不等于0

## [](#2-基本属性-cstyle)2.  基本属性 cStyle

||**属性名称**||**属性含义**||**值类型**||**属性说明**|
||hideSticky||**false**||**boolean**||**是否要吸底效果**|
||showWorkflowUrl||**true**||**boolean**||**是否展示审批流程图**|

## [](#3-事件)3. 事件

// 审批组件加载时候触发

viewmodel.on('updateWorkflowComponent', () => {

 // 领域逻辑

 return false; 不走审批流渲染

 return true; 正常执行

});

## [](#4-审批组件展示的条件)4. 审批组件展示的条件

const billData = viewmodel.getAllData();

const verifystate = viewmodel?.get('verifystate')?.getValue?.();

if (billData && (billData.isWfControlled || billData.pk_procdefins || billData.procinstId) && verifystate) {

 // 展示审批面板

}