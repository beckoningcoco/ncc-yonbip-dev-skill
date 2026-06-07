---
title: "参照显示停用（未启用）功能适配"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/05-canzhaoxianshitingyong"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 参照显示停用（未启用）功能适配

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/05-canzhaoxianshitingyong | 所属：指南

# [](#参照显示停用未启用功能适配)参照显示停用（未启用）功能适配

## [](#1-ui展示)1. UI展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/canzhaoxianshitingyongimage1.6a45ce62.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/canzhaoxianshitingyongimage2.3f617336.png)

## [](#2-代码适配)2. 代码适配

参照提供方再pub_ref表的extendfield字段加上

"isShowDisabledData":{"field": "enablestate","op":"in","enabled":"2","disabled":"3", "nonenabled":"1"}

// enablestate 为当前参照显示停用控制字段

// enabled已启用

// disabled已停用

// nonenabled未启用

### [](#21-查询区参照使用方配置)2.1. 查询区参照（使用方配置）

默认显示（如果是懒加载树，还需要参照使用方pb_meta_filter_item表的extendField字段配置showLazyTreeDisabled为true 或者参照提供方的pub_ref表的extendField字段配置showLazyTreeDisabled为true（（显示“显示未启用”则需要额外配置showNotEnabled为true）） ）

### [](#22-表单参照使用方配置)2.2. 表单参照（使用方配置）

默认显示：参照使用方在billitem_base表的cStyle字段配置isShowDisabled为true即可（显示“显示未启用”则需要额外配置showNotEnabled为true）

默认勾选：参照使用方在billitem_base表的cStyle字段配置defaultShowDisabledData为true即可

### [](#23-非mdd单据使用方配置)2.3. 非MDD单据（使用方配置）

默认显示：new 参照模型时，增加cStyle属性，cStyle字配置 json字符串：isShowDisabled为true即可（显示“显示未启用”则需要额外配置showNotEnabled为true）

默认勾选：new 参照模型时，增加cStyle属性，cStyle字配置 json字符串： defaultShowDisabledData为true即可