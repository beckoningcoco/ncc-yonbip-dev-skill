---
title: "关于YNF"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/introduce/g012-introduce"
section: "YNF-介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 介绍]
platform_version: "BIP V5"
source_type: ynf-docs
images: 3
---

# 关于YNF

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/introduce/g012-introduce | 所属：YNF-介绍

# [](#关于ynf)关于YNF

## [](#目标)目标

知识点：
YNF由UIMeta， 组件， Store， Action, Reaction组成，以及它们之间的关系
YNF的开发工具有应用构建、设计器、CLI和资源中心，以及各自的作用
售前必备知识

## [](#名词解释)名词解释

- `YNF` 是 Yonyou New-generation Front-end-framework 的简称，即用友新一代统一前端框架。
- `MobX` 是一款简单的、可扩展的状态管理库，它通过运用透明的函数式响应编程使状态管理变得简单和可扩展。
- `TinperNext` 是基于React技术实现的新一代Web前端基础组件库。
- `ArcUI` 是基于React技术实现的移动基础组件库。
- `TNS` 是Tinper Next Server 的简称，支持YonBIP前端统一部署、统一前端三方包管理等公共能力。
- `YonDesign` 是Yonyou Design System 的简称，特指YonBIP的统一设计语言系统。
- `YPD` 是Yonyou Platform Development 的简称，指新一代的YonBIP平台开发框架。

## [](#为什么要做-ynf)为什么要做 YNF？

- 随着 `YonBIP` 产品的快速发展，针对产品体验相关的交互效果、布局灵活性和扩展开发等需求越来越高。
- 在产品智能化和研发提效方面，需要为实现 `AI` 友好的、智能化的产品体验提供重要的前端技术支撑。
- 领域、行业、项目、ISV等开发者对原厂产品能力的扩展需求和自定义业务开发的需求旺盛，前端编程模型上需要对开发者更友好，让开发者更易于学习和理解，更具备可扩展、可编程的能力。

`YNF` 统一前端框架的能力设计的初衷，就是从需求出发、从底层设计开始，基于协议和规范逐步打造的一个完整前端开发体系。

## [](#ynf-是什么)YNF 是什么？

![YNF 是什么](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/what-is-ynf.ca865c62.jpg)

## [](#ynf-编程模型有什么特点)YNF 编程模型有什么特点？

![编程模型有什么特点？](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/ynf-tech-arch.7f7f040f.jpg)

- 响应式编程风格：引入 `MobX` 响应式数据方案，降低业务复杂度，开发规范化。
- 分层设计：框架只实现必要的核心功能，且进行了合理的分层设计和实现，并提供默认扩展。
- 降低开发门槛：框架提供的框架方法属性大幅减少，开发者无需掌握大量框架 `API` 的使用。
- 提供程序主动权：领域业务开发受框架制约少，增加领域开发对代码的掌控度，赋能创新
- 界面灵活多变：实现页面布局灵活性，渲染模式由模板式生成升级为组合式生成

## [](#扩展开发模式上和mdf有什么区别)扩展开发模式上和MDF有什么区别？

扩展开发方式上更趋近于基于 React + MobX 的标准应用开发.

import GenReactions from './stores/ext/GenReactions'

import GenStores from './stores/ext/GenStore'

import { extendActions } from './stores/ext/GenActions'

import GenRootStore from './stores/ext/GenRootStore'

import './index.less'

/**

 * 基于YNF Store，扩展开发领域、行业的业务stores

 * 定义：Domain Store

 */

export function ExtendStore (rootStore: object) {

 return GenStores(rootStore)

}

/**

 * 针对YNF common actions 的扩展

 * 绑定和加载领域、行业自定义的 action

 * 定义：明确的、静态的 action 动作

 */

export function ExtendAction(rootStore: object) {

 return extendActions(rootStore)

}

/**

 * 针对 YNF Reaction 的扩展

 * 绑定和加载领域、行业自定义的 reactions

 * 定义：reactions track 具体的状态值，接收指定的 store 并按明确的逻辑更新 domain store 中的数据，

 * reactions 也可以调用 rootStore 中的 API、Action 等

 */

export function ExtendReaction (rootStore: object) {

 return GenReactions(rootStore)

}

/**

 * ExtendRootStore

 * 针对全局通用的 api、utils、pagestore等扩展

 * 也可以直接定义具体的业务扩展逻辑

 *

 */

export function ExtendRootStore (rootStore: object) {

 return GenRootStore(rootStore)

}

## [](#基于-ynf-的应用开发在元数据模型上有什么变更和联系)基于 YNF 的应用开发，在元数据模型上有什么变更和联系？

实体元数据和UI元数据是复用的，数据模型不变。在 UI 模版协议和存储上发生了变化，具体如下：

![json schema](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/json-schema.ea29f667.png)