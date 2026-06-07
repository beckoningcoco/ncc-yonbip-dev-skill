---
title: "读懂MDF和MDD"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/05-read-mdf-and-mdd"
section: "介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 介绍]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 读懂MDF和MDD

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/05-read-mdf-and-mdd | 所属：介绍

# [](#读懂mdf和mdd)读懂MDF和MDD

## [](#1-简要介绍)1. 简要介绍

||MDD（Model Driven Development：模型驱动开发模式）|
||MDD是一种以模型作为主要工件的高级别抽象的开发方法，是iuap平台下的元数据驱动设计框架，前后端的统一基于元数据的架构。模型在工具的支持下，作为核心资产被转换成代码或者可运行配置，可以降低开发成本，应对复杂需求变更。|
||MDD开发框架，是用友云针对企业数字化中台理念实现的一套开发框架。从企业云服务核心问题域出发，总结提炼出最佳实践，且形成了统一的标准及规约。致力于支撑中台能力快速孵化，形成中台各能力间连接的纽带，最终实现中台基础上的企业数字化业务重构及创新快速开发实现。|

||MDF（Model Driven Framework：前端应用架构）|
||MDF是一个基于元数据的模型驱动开发框架。它支持通过模式化的配置自动生成并渲染页面，继承了bpass业务中台的支撑服务和能力中心相关能力。|
||Web开发和Mobile移动开发共用一套开发框架，共用一套扩展脚本，并支持不同维度的扩展开发（js扩展脚本、新增Metaui扩展组件、扩展及配置组件样式和交互等）。具有分层架构，分包解耦，架构灵活的特点。|

## [](#2-mdd架构图)2. MDD架构图

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/dudongMDFheMDD_image1.4e148e21.png)

## [](#3-mdf架构图)3. MDF架构图

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/dudongMDFheMDD_image2.fb981a0f.png)

## [](#4-什么是viewmodel模型)4. 什么是ViewModel（模型）？

- UI视图模型，模板中涉及绑定字段、动作、状态等UI元数据描述。
- Node端转译成前端可执行的ViewModel对象并发送给起那段，前端执行从而生成MVVM框架中的ViewModel对象，承担前端编程模型的角色。
- 前端对所有UI组件的操作都通过对ViewModel操作来实现，体现MVVM思想。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/dudongMDFheMDD_image3.f9e06dcb.png)

## [](#5-mdf框架核心模块)5. MDF框架核心模块

MDF 模型驱动开发框架 V2.0
以后采用分层分包的插件化架构进行管理和维护，支持开发者通过扩展的方式新增插件包的方式来灵活响应产品需求，现将框架提供的官方模块功能进行如下说明：

||Package Name||Package Description|
||mdf-cube||Cube Core SDK -- 含ViewModel|
||mdf-baseui||基于tinper-next组件库的公共交互层|
||mdf-baseui-mobile||基于antd-mobile组件库的公共交互层|
||mdf-metaui-mobile||MetaUI 组件包（Mobile交互风格）|
||mdf-metaui-web||MetaUI 组件包（Web交互风格）|
||mdf-middlewares-auth||BFF服务：权限验证KOA中间件|
||mdf-middlewares-log4js||BFF服务：日志KOA中间件|
||mdf-plugin-meta||BFF服务：UI元数据、 前端JS代码生成|

## [](#6-专业术语)6. 专业术语

||名词||说明|
||元数据（Metadata）||用来描述数据的数据|
||ViewModel||为编程模型，所有可编程操作的对象均为viewmodel。小到一个组件、大到一个UI模板均为一个viewModel对象。|
||UI模版||基于元数据配置和生成的模式化页面，一个模板由实体元数据和UI元数据进行抽象描述。|
||Node层||基于NodeJS的BFF中间层，能够实现微服务接口的聚合、转发、跨域、资源托管、自动生成模板级viewmodel（js可执行代码）等能力。|
||BFF||Backend For Frontend：用户体验适配层。（领域模型与页面数据是两种思维模式，通过BFF可以很好地解耦开，让彼此更专业高效。）|