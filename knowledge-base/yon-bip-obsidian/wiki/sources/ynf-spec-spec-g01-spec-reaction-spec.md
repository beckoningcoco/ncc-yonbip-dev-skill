---
title: "Reaction 协议"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/spec/g01-spec-reaction-spec"
section: "YNF-协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 协议]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# Reaction 协议

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/spec/g01-spec-reaction-spec | 所属：YNF-协议

# [](#reaction-协议)Reaction 协议

## [](#1-ui-reactions-object前端业务副作用)1. UI Reactions Object前端业务副作用

||字段名称||字段类型||业务含义||说明（示例）|
||serialCode||String||YNF模型编号||唯一标识OID格式|
||parentSerialCode||String||父级YNF模型编号|||
||controlType||String||固定值Reactions|||
||alias||String||别名|||
||caption||String||名称|||
||orderNum||Number||排序|||
||level||Number||层级数|||
||nid||String||设计器内组件id||"nid_239"|
||children||UI Reaction Item Object||Reaction Item集合对象|||

## [](#2-ui-reaction-item-object前端业务副作用项)2. UI Reaction Item Object前端业务副作用项

||字段名称||字段类型||业务含义||说明（示例）|
||serialCode||String||YNF模型编号||唯一标识OID格式|
||parentSerialCode||String||父级YNF模型编号|||
||alias||String||别名|||
||caption||String||Reaction名称||cardReaction|
||dataSourceAlias||String|||||
||controlType||String||CardReaction||现在只支持CardReaction|
||libCode||String||Reaction二方包名称||ynf-core-store/reactions|
||cardStore||String||cardStore||现在只支持cardStore|
||filter||String||查询store||filterStore|
||list||String||关联列表store||tableStore|
||paging||String||关联分页store||pagingStore|
||summary||String||关联汇总store||summaryStore|
||nid||String||设计器内组件id||"nid_239"|