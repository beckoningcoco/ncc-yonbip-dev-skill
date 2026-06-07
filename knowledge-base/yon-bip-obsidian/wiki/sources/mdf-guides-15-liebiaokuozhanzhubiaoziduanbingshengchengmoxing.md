---
title: "列表扩展主表字段并生成模型"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/15-liebiaokuozhanzhubiaoziduanbingshengchengmoxing"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 4
---

# 列表扩展主表字段并生成模型

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/15-liebiaokuozhanzhubiaoziduanbingshengchengmoxing | 所属：指南

# [](#列表扩展主表字段并生成模型)列表扩展主表字段并生成模型

以移动设计器为例

场景示例图：
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liebiaokuozhanzhubiaoziduanbingshengchengmoxingimage1.10258e56.png)

## [](#1-新增虚拟子实体)1. 新增虚拟子实体

如果设计器右键不能新增，可右键实体清单编辑添加
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liebiaokuozhanzhubiaoziduanbingshengchengmoxingimage2.d9471aca.png)

## [](#2-设置字段ibillentityid和entitycode)2. 设置字段iBillEntityId和entityCode

把字段的iBillEntityId跟添加的虚拟子实体设置一致，entityCode跟虚拟子实体的cCode设置一致

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liebiaokuozhanzhubiaoziduanbingshengchengmoxingimage3.c5bf85a8.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liebiaokuozhanzhubiaoziduanbingshengchengmoxingimage4.347f6de4.png)

按照以上步骤设置完保存后，即可在列表页扩展主表字段，并生成对应模型