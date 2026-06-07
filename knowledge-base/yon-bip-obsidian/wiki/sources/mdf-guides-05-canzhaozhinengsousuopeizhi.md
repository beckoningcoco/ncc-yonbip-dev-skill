---
title: "参照智能搜索配置"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/05-canzhaozhinengsousuopeizhi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 参照智能搜索配置

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/05-canzhaozhinengsousuopeizhi | 所属：指南

# [](#参照智能搜索配置)参照智能搜索配置

## [](#1-效果图)1. 效果图

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/canzhaozhinengsousuopeizhiimage2.9fe23177.png)

## [](#2-适配方法)2. 适配方法

1.参照使用方配置
1.1 如果是普通的单据中主表 || 子表上的参照
在单据billitem_base表里面的cStyle配置一个字段配置bSmartSearch为true即可
1.2 如果是查询区参照
在查询区pb_meta_filter_item表的extendField字段配置bSmartSearch为true即可
1.3 如果是cn参照

this.model = new cb.models.ReferModel({

 // ...

 bSmartSearch:true 

});

2.参照提供方配置

在参照pub_ref表里面的extendField字段配置一个字段bSmartSearch为true即可，这样，所有使用该参照的单据，均支持智能搜索s树

## [](#3-树形参照特殊)3. 树形参照（特殊）

注意：如果对于树参照，参照UI模板的searchTree容器下得有controls才行（参照提供方处理）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/canzhaozhinengsousuopeizhiimage1.18a96ef5.png)

cItemName配具体数据 如 正常的 code name id， 里面的其它字段随便配