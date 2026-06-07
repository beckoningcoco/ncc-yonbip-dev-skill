---
title: "YNF架构设计原则"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/introduce/g013-design-rules"
section: "YNF-介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 介绍]
platform_version: "BIP V5"
source_type: ynf-docs
images: 1
---

# YNF架构设计原则

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/introduce/g013-design-rules | 所属：YNF-介绍

# [](#ynf架构设计原则)YNF架构设计原则

## [](#1ai友好原则)1.AI友好原则

在 `AI` 普及应用的新时代，`YNF` 新前端框架将 `UI For AI` 作为重要特性进行设计和落地。为BIP产品智能化提供前端技术支撑，面向机器学习友好。

## [](#2响应式编程原则)2.响应式编程原则

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/mobx-observer.ab81f3c9.jpg)

我们期望运用透明的函数式响应编程，使应用的状态管理变得简单和可扩展，`MobX` 是这方面的优秀实现，YNF新前端框架将会直接基于 `MobX` 实现应用中数据流动和精细化管理。

## [](#3程序员友好原则)3.程序员友好原则

- 淡化 `引擎+协议` 的概念：实现 `F(引擎，协议)=>代码` 、或 `F(引擎，协议，扩展代码)=>代码`
- 尽量采用公开的技术：基于 `Mobx/ React UI/ YNF Libs` 开发体系实现。
- 实现面向后端应用开发的新一代前端架构体系。

## [](#4系统化体系化设计原则)4.系统化体系化设计原则

- 基于 `YonDesign` 设计语言
- 基于 `Design Token System` 管理主题能力
- 支持 `RTL`

## [](#5无缝衔接mdf原则)5.无缝衔接MDF原则

- `YNF` 的组件库和 `API` 等标准二方包能力，可无缝接入 `MDF` 框架运行。
- 参照适配
- 推单、拉单场景适配