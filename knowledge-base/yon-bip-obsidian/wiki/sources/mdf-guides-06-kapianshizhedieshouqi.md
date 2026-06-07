---
title: "卡片式折叠收起"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/06-kapianshizhedieshouqi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 5
---

# 卡片式折叠收起

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/06-kapianshizhedieshouqi | 所属：指南

# [](#卡片式折叠收起)卡片式折叠收起

## [](#1-目标效果)1. 目标效果

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kapianshizhedieshouqi_image1.7e8a3eb4.png)

图为推荐场景，最终效果请联系本领域产品和UE商定并提供设计图，以最终设计图为准调整。

## [](#2-如果配置)2. 如果配置？

在主表区的GroupContainner组件的cSytle中配置showMoreLine属性，示例：cStyle:
{ "showMoreLine": true }

### [](#21-场景1)2.1. 场景1

#### [](#211-场景说明)2.1.1. 场景说明

主表区是一个 GroupContainer 内包含多个 Group 或 Form
的情况（推荐场景），最终效果如上图，模板结构如下图：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kapianshizhedieshouqi_image2.fba2738b.png)

#### [](#212-实现规则)2.1.2. **实现规则**

- 新增和编辑态默认展开所有组，浏览态默认只展开第1组（不受第1组有几行影响）
- 展开时最大高度为页面的65%，超过65%时主表区出现滚动条
- 有记忆功能，下次进入以上次状态为准，区分新增编辑和浏览态

### [](#22-场景2)2.2. 场景2

#### [](#221-场景说明)2.2.1. 场景说明

主表区是一个 GroupContainer 内包含一个 Group 或 Form
的情况，模板结构如下图：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kapianshizhedieshouqi_image3.37a51fa0.png)或
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kapianshizhedieshouqi_image4.7a4a3560.png)

#### [](#222-实现规则)2.2.2. 实现规则

- 新增和编辑态默认展开所有行，浏览态默认展开前3行
- 行数小于等于3行，不显示展开折叠按钮
- 展开时最大高度为页面的65%，超过65%时主表区出现滚动条
- 有记忆功能，下次进入以上次状态为准，区分新增编辑和浏览态

#### [](#223-自定义展开高度)2.2.3. 自定义展开高度

如果默认3行不能满足要求，可以在GroupContainer的cStyle属性中配置definedcollapseHeight，值为展开的调试，单位px

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kapianshizhedieshouqi_image5.1f7a384f.png)

### [](#23-场景3)2.3. 场景3

#### [](#231-场景说明)2.3.1. 场景说明

主表区和子表区是流式部局的场景，此场景不需要适配，保持流式部局即可，如：费控云的通用报销单、资产云的资产卡片

## [](#3-相关文档)3. 相关文档

《[卡片式分层结构](#/guides/06-kapianshifencengjiegou)》

**如不在以上场景范围内的请评估是否能调整为以上模式之一，如果不能请联系MDF框架开发部讨论方案**