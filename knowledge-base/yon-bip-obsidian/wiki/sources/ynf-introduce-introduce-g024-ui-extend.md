---
title: "UI模板扩展"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/introduce/g024-ui-extend"
section: "YNF-介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 介绍]
platform_version: "BIP V5"
source_type: ynf-docs
images: 4
---

# UI模板扩展

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/introduce/g024-ui-extend | 所属：YNF-介绍

# [](#ui模板扩展)UI模板扩展

UI模板扩展开发主要是将原厂历史开发、设计完成的系统级元数据模型，复制一份到低代码原厂开发租户中，用于领域使用应用构建做后续的租户级开发。

## [](#1-ui模板)1 UI模板

UI模板包含系统模板、 预置模板、自定义模板；系统模板由领域原厂单据预置。

预置模板通过按钮“启用租户模板”生成，生成后即可对该模板进行“复制、设计、多语、预览”等操作，一旦生成不允许删除、编辑；复制之后产生的是普通的自定义模板，支持“删除、编辑、设计、复制”等操作；
**打开方式**：工作台搜索ui模板即可打开如下页面，通过视频讲解学习详细的ui模板相关内容。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/uiextend-homepage.e14e9db2.png)

## [](#2-ui模板的核心能力)2 UI模板的核心能力

- 支持多模板配置、复制、预览、重命名、设置默认、删除
- 支持按照领域分类的结构来查询UI模板
- 支持在企业账号级设置当前国家的语言和其他国家的语言，目前支持中文、英文、繁体的模板设置
- 支持使用者在首选语言确定后选择自己的首选语言设置模板
- 支持模板的三级显示:按领域、应用、模板分类(比如单据类型)。模板分类(比如单据类型)下如果还有细分比如交易类型，则交易类型的模板也统一显示在模板分类(单据类型)下。支持查询方案能够按照过滤条件设置方案
- 支持UI模板的普通设计，修改列宽、是否显示、显示顺序
- 设置页面规则的高级设计，完整属性，所见所得的设置UI模板支持UI模板

## [](#3-ui模板扩展)3 UI模板扩展

### [](#31-设计)3.1 设计

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/uiextend-design.c2c99e4e.png)
通过“设计”进入的高级设计器是对UI元数据的扩展配置工具，不仅支持字段/子集等组件属性的显示、是否必填、显隐等常用设置，还支持“表格字段设置、公式、参照带入、交互规则、校验规则、脚本”等高级设置能力，实现了原厂单据在不同业务场景的个性化扩展；

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/uiextend-design2.3fa9403a.png)

### [](#32-复制)3.2 复制

“复制”出来的自定义模板支持两层条件设置：

第一层关联“业务活动规则、交易类型、组织管理”条件；

第二层分配“用户、角色”条件，组织管理属于必填，其它均根据业务需求是否设置。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/uiextend-copy.9415efd2.png)

## [](#4-新增特性)4 新增特性

- 完善组织级UI模板，支持为业务单据设置组织级的模板。
- 完善UI模板的整体交互，强化UE统一风格。
- 完善UI模板的简版设计器，完善显示/隐藏、默认值设置口支持UI模板的高级设计，在页面建模所见所的设置UI模板，支持灵活的公式设置，支持页面交互规则，支持参照携带返回等特性。
- 完善参照模板，支持扩展显示数据，支持公式设置。

## [](#qa)Q&A

## [](#参考)参考