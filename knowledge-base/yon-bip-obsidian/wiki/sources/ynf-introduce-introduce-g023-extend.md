---
title: "扩展开发"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/introduce/g023-extend"
section: "YNF-介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 介绍]
platform_version: "BIP V5"
source_type: ynf-docs
images: 17
---

# 扩展开发

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/introduce/g023-extend | 所属：YNF-介绍

# [](#扩展开发)扩展开发

设计器提供了强大的扩展开发功能，允许开发者在多个层面进行定制和扩展。以下将详细介绍如何在设计器中进行脚本、store、action和reaction的扩展开发。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/extend-intro.9347cccc.png)

## [](#1-设计器脚本扩展开发)1 设计器脚本扩展开发

在设计器的工具栏中，你可以添加扩展脚本，这些脚本能够扩展store、action和reaction的功能。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/extend-intro2.82e5a1a2.png)
经过之前的学习，相信你已经掌握了如何开发一张单据，但在实际业务中，我们需要更加灵活且个性化的功能，例如：保存合同单据前，想要先对部分数据进行校验；查询列表时可以自定义查询条件等。这都可以通过编写和配置扩展脚本来实现扩展开发。

接下来，基于之前创建好的基础合同单据，介绍通过以下三种扩展开发方式，开发出一个具有合同状态字段，可以根据合同状态查询合同列表，并具有签约、续签按钮的高度个性化的合同单据。

## [](#2-store-扩展开发)2 store 扩展开发

store 扩展允许您创建新的 store 对象，这些对象作为数据的容器，可以包含可观测的属性、方法以及计算属性。这不仅让数据的管理变得更加灵活，还促进了组件之间的数据流动和业务逻辑的处理。你可以选择继承现有的YNF store进行开发，或者完全自定义一个新的store并实例化它。这些store可以在组件中进行配置和使用。

- 扩展属性：添加新的可观测数据属性。
- 扩展函数：定义与数据相关的业务逻辑函数。
- 扩展计算属性：基于store中的其他属性计算得出的新属性。

#### [](#示例场景)示例场景

合同中添加合同状态字段，并编写动作函数，计算属性，例如：可以在动作函数里实现签约，续签等，计算属性里实现根据合同状态确认签约、续签按钮显隐。

### [](#21-扩展store)2.1 扩展store

#### [](#编写脚本)编写脚本

针对已经实例化的store数据模型，需要新增可观察属性，用于组件的绑定，一般结合业务需要新增observable、action、computed等注解类型。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/extend-form-store.e818005f.png)

#### [](#设计器绑定对应扩展属性)设计器绑定对应扩展属性

对于新增的属性、函数、计算属性需要手动打开编辑器进行绑定，操作步骤为：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/extend-form-store2.2a4b6c08.png)
在数据编辑器中根据需求绑定对应属性：

- 绑定扩展属性: rootStore.formStore.creatMethod
- 绑定扩展函数: rootStore.formStore.toContractChangePage()
- 绑定扩展计算属性：rootStore.formStore.btnEditVisible()

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/extend-form-store3.c590746a.png)

#### [](#验证)验证

在运行时打开控制台验证是否绑定成功。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/extend-form-store4.223a364a.png)

### [](#22-新增store)2.2 新增store

#### [](#编写脚本-1)编写脚本

使用 makeObservable 添加可观察属性、动作函数和计算属性，并需要在扩展脚本中将实例挂载到rootStore上便可完成绑定。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/extend-new-store.a33a5f8f.png)

#### [](#验证-1)验证

运行时查看绑定字段或事件是否生效。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/extend-new-store2.2f877f17.png)

## [](#3-action-扩展开发)3 action 扩展开发

action扩展允许你自定义业务函数并将其配置到设计器中。这些函数可以在特定的用户交互或事件触发时执行，用于执行各种业务逻辑。

公共action

- 基础函数：与数据基础操作相关的函数，如增删改查。
- 业务流函数：处理复杂业务流程的函数。
- 导航函数：控制页面导航的函数。
- 打印函数：与打印相关的函数。
- 工作流相关函数：与工作流引擎交互的函数。

#### [](#示例场景-1)示例场景

在保存合同单据前，通过脚本对关键字段进行校验，确保数据的准确性和完整性。

### [](#31-扩展action)3.1 扩展action

#### [](#编写脚本-2)编写脚本

在ExtendAction函数里编写扩展脚本，以公共函数save为例函数前后校验、提示、修改数据等操作。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/extend-save-action.4646d62f.png)

#### [](#验证-2)验证

在运行时打开控制台验证是否绑定成功。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/extend-save-action2.fd785cd3.png)

### [](#32-新增action)3.2 新增action

#### [](#编写脚本-3)编写脚本

自定义保存前校验函数并在扩展脚本中将实例挂载到rootStore上。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/extend-new-action2.cd35f632.png)

#### [](#设计器配置)设计器配置

需要在数据编辑器为按钮配置action才能生效。

"onClick": "mobx://rootStore.actions.checkContractSave"

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/extend-new-action3.0e4fa23d.png)

#### [](#验证-3)验证

在运行时打开控制台验证是否绑定成功。
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/extend-new-action.87d9678f.png)

## [](#4-reaction-扩展开发)4 reaction 扩展开发

reaction扩展允许你自定义业务需要的reaction，确保应用状态的同步和一致性。reaction是用于观察和自动追踪数据变化的机制，当数据变化时，会执行特定的副作用操作。reaction可以看做一种监听状态变化的机制。包括自动追踪依赖、灵活的触发时机和副作用处理等。
举例： ListReaction是一个典型的reaction示例，它可能包含以下操作：

- 页面初始化时加载数据。
- 触发查询条件时重新加载数据。
- 重载刷新页面时重新加载数据。
- 翻页时加载不同页的数据。

#### [](#示例场景-2)示例场景

对合同查询增加自定义查询条件时，可以通过编写reaction的方式实现。

### [](#41-扩展reaction)4.1 扩展reaction

#### [](#编写脚本-4)编写脚本

扩展ListReaction在默认reaction事件前后添加自定义操作。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/extend-list-reaction.de7fcad2.png)

#### [](#验证-4)验证

在运行时打开控制台验证是否绑定成功

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/extend-list-reaction2.b3d9e87d.png)

### [](#42-新增reaction)4.2 新增reaction

#### [](#编写脚本-5)编写脚本

自定义业务需要的reaction，让应用状态保持同步。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/extend-data-reaction.aa786d47.png)

#### [](#验证-5)验证

在运行时打开控制台验证是否绑定成功。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/extend-data-reaction2.7fd0da93.png)

## [](#qa)Q&A

## [](#参考)参考