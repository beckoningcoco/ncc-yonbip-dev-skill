---
title: "Action 协议"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/spec/g01-spec-action-spec"
section: "YNF-协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 协议]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# Action 协议

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/spec/g01-spec-action-spec | 所属：YNF-协议

# [](#action-协议)Action 协议

## [](#1-ui-actions-object前端业务动作)1. UI Actions Object前端业务动作

||字段名称||字段类型||业务含义||说明（示例）|
||serialCode||String||YNF模型编号||唯一标识OID格式|
||parentSerialCode||String||父级YNF模型编号|||
||alias||String||action列表字段别名||actions|
||caption||String||action列表显示名称||Actions|
||children||[Action Item Object](#_Action Item Object数据对象)||action集合对象||[]|
||controlType||String||action列表类型||Actions|
||orderNum||Number||排序|||
||level||Number||层级数|||
||nid||String||设计器内组件id||"nid_239"|

## [](#2-ui-action-item-object前端业务动作项)2. Ui Action Item Object前端业务动作项

||字段名称||字段类型||业务含义||说明（示例）|
||serialCode||String||YNF模型编号||唯一标识OID格式|
||parentSerialCode||String||父级YNF模型编号|||
||alias||String||action字段别名||cmdBatchDelete|
||caption||String||action名称||批量删除|
||authid||String||授权编号|||
||controlType||String||action类型||batchDelete|
||onClick||String||点击事件|||
||libCode||String||action二方包名称||ynf-core-store/actions/bill|
||params||Ui Action Parameter Object||Action 参数对象|||
||orderNum||Number||排序|||
||level||Number||层级数|||
||nid||String||设计器内组件id||"nid_239"|

## [](#3-ui-action-parameter-object前端业务动作参数)3. Ui Action Parameter Object前端业务动作参数

||字段名称||字段类型||业务含义||说明（示例）|
||serialCode||String||YNF模型编号||唯一标识OID格式|
||svcUrl||String||请求URL|||
||target||String||动作目标||formarea|
||isAsync||String||异步|||
||externalData||Map||外部数据||{ "fileType":"zip" }|
||param||Map<String,Obect>||其他参数|||