---
title: "YNF面向模型驱动设计"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/introduce/g015-driven-by-model"
section: "YNF-介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 介绍]
platform_version: "BIP V5"
source_type: ynf-docs
images: 3
---

# YNF面向模型驱动设计

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/introduce/g015-driven-by-model | 所属：YNF-介绍

# [](#ynf面向模型驱动设计)YNF面向模型驱动设计

## [](#1设计要素)1.设计要素

![设计要素](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/design-feature.5fdb84c7.jpg)

## [](#2设计推演过程)2.设计推演过程

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/design-path-for-model-driven.c02626aa.jpg)

结合实际的应用开发场景，我们采用 `React + MobX` 技术组合开发应用，会经历面向业务过程的开发。此时，对一个页面的完整构成分析出关键的要素：

- `UI`：`React Components`
- `Store`：数据
- `Action`：交互动作
- `Service`：数据请求
- `Reaction`：`side effect` 副作用，也可理解为交互反馈/数据反馈。

在这个开发基础上，团队会逐步考虑可复用的设计：

- `UI` 组件库
- 可复用的 `Store` 数据模型封装
- 可复用的 `Action` 动作模型封装
- 可复用的 `Reaction` 模型封装
- 可复用的 `Service API` 封装

## [](#3构建面向开发者可扩展的-rootstore-对象)3.构建面向开发者可扩展的 rootStore 对象

在MobX中，通常会将一个应用程序分为多个小模块。每个模块都有自己的store，存储相关的状态和行为。rootStore是每个模块store的顶级父级。
在基于YNF的开发中，我们约定每个原子服务一个 RootStore 实例（原子服务可以是一个页面或一个SPA单页应用，在工作台中注册了唯一的一个serviceCode）。
RootStore的用途有以下三种：

- 
收集所有的store，使它们可以方便地访问和管理。例如，如果一个子组件需要使用某个store的数据或方法，它可以通过rootStore来访问该store。

- 
统一管理应用程序的状态。rootStore可以跟踪应用程序中的所有状态变化，并且可以执行某些操作以确保应用程序的状态保持一致。

- 
使用中间件和插件。通过rootStore，您可以轻松地添加和管理与Web服务或其他外部系统通信的中间件和插件。

在YNF应用中，每个RootStore下将管理以下三类数据模型：

import { PageStore, BaseStore } from 'ynf-core-engine'

class RootStore extends BaseStore {

 constructor(props) {

 super();

 /**

 * 一、全局通用数据

 * 其中，context、env、utils等为基础数据模型，全局只实例化一次；

 * constants、dataSource、pageInfo、routes、loading等为页面级数据模型，每个页面实例化一次。

 */

 this.context = {}

 this.apis = {} //

 this.env = {}

 this.utils = {}

// 异常处理、提示、loadingStore（不放到request）

 this.utils.request = request 

 this.pageStore = new PageStore()

 /**

 * 二、业务 Domain Store 实例化，继承YNF Store。TableStore、TreeStore、FilterStore、ReferStore等。

 * 特别说明：默认都需要将第一部分的通用数据传入

 */

 this.filter = new ContractTypeFilterStore(this);

 this.paging = new ContractTypePagingStore(this);

 this.table = new ContractTypeTableStore(this);

 this.tree = new ContractTypeTreeStore(this);

 // 针对参照、主子表等有固定业务场景的可以加一层store实例的命名空间方便维护数据。

 this.cardRootStore = {

 table1: new ContractTypeSubTableStore(),

 table2: new ContractTypeTableStore(),

 }

 // ..... and more

 /**

 * 三、通用Action和业务Action（包括action、reaction等）。

 * 特别说明：默认都需要将 rootStore 传入

 */

 this.actions = {};

 this.actions.cmdAdd = new ActionStore(this);

 this.reactions = {}

this.reactions.TreeListReaction = TreeListReaction(this)

 }

}

## [](#4ynf-store-数据模型)4.YNF Store 数据模型

### [](#41-定义)4.1 定义

Stores 的主要职责是将 逻辑（logic） 和 状态(state) 从组件中移至一个可独立测试的单元，并能同时在前后端的 JavaScript 中使用不同Store之间通过依赖注入、addListener、emit 等机制联动。将**State、model、controller 等概念都统一到 MobX Store 来理解，但是有不同类型的 Store。

- 平台只提供通用的Domain Store，实现清单见本文3.3章节。
- 业务 Store 继承YNF Store 实现。
- 页面 RootStore 内组装所需的公共实例化数据。
- 业务组件内可实现业务 Action 函数，并对外提供。
- 通用Store、业务Store中需要使用全局数据的场景，通过继承 BaseStore实现。

### [](#42-store设计)4.2 store设计

||store||名称||业务含义||说明|
||BaseStore||基础数据模型|||||
||PageStore||页面数据模型||页面实例的公共数据|||
||ArrayStore||列表型数据模型|||||
||ObjectStore||对象数据模型|||||
||TreeStore||树形数据模型|||||
||TableStore||表格型数据模型|||||
||FormStore||表单数据模型|||||
||FilterStore||查询方案数据模型|||||
||PagingStore||分页数据模型|||||
||ReferStore||参照类数据模型|||||
||ActionStore||操作类数据模型|||||
|||||||||

- 基础数据对象

BaseStore
- ArrayStore
- ObjectStore
- TreeStore

- 业务数据对象Store

FilterStore 查询区&&查询方案数据对象store
- TableStore 表格数据对象store
- PagingStore 分页数据对象store
- TreeStore 树数据对象store
- CardStore 区域数据对象store，内部可进一步管理formStore && tableStore
- PageStore 页面数据对象store, 包含页面信息

## [](#5ynf-action-动作模型)5.YNF Action 动作模型

### [](#51-定义)5.1 定义

模式化场景的 RootStore 实现，打散到 ynf-core-action API 二方包中，在运行时进行动态组装。分模式化场景提供 action 集合，用于支持组装实现场景化的RootStore。

- 约定：实现场景化功能的默认系列 `Action` 函数；
- 配置：基于默认 `Action` 函数的 `Options` 策略模式；
- 重载：对默认 `Action` 的修改通过 `override` 重载。

以上设计原则用于解决模式化页面功能的扩展性不足、进而出现框架能力制约业务实现的问题。

### [](#52-action-设计)5.2 action 设计

||actions类别||说明||使用说明|
||bill||单据增删改查函数||save, delete, add, copy, add, draft, move, impot, export等|
||businessflow||业务流函数||batchPush, batchPull等|
||navigate||导航函数||goBack, openBill等|
||print||打印函数||batchPrint, printPreview, print等|
||workflow||工作流函数||approval, audit, submit, batchAudit, batchSubmit, batchUnAudit, batchUnSubmit等|

## [](#6ynf-reaction-副作用模型)6.YNF Reaction 副作用模型

### [](#61-定义)6.1 定义

reaction

### [](#62-reaction设计)6.2 reaction设计

- ListReaction 列表页reaction、行编辑表reaction
- CardReaction 详情也reaction
- TreeListReaction 树表reaction
- TreeCardReaction 树卡reaction
- TableTreeReaction 树形表reaction

## [](#7ynf-actionstore)7.YNF ActionStore

### [](#71-actionstore)7.1 ActionStore

：Action 的生成工厂类

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/actionstore.2772ade9.png)

<ActionStore运行流程图>

||可观察对象||注解||业务含义||默认值|
||visibale||observable||按钮的显示、隐藏状态。|||
||enable||observable||按钮是否可用，要根据权限信息等、动态computed计算|||
||doAction||action||CommonAction|||