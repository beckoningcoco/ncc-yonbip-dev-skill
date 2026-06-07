---
title: "第一张单据"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/introduce/g021-bill"
section: "YNF-介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 介绍]
platform_version: "BIP V5"
source_type: ynf-docs
images: 16
---

# 第一张单据

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/introduce/g021-bill | 所属：YNF-介绍

# [](#第一张单据)第一张单据

基础开发的主要是围绕在数字化工作台创建页面到发布页面的一个完整闭环，同时确保这一闭环能够基于标准能力进行简单而灵活的扩展开发。辅助新手快速上手，从0开发单据页面。

## [](#1-开发流程)1 开发流程

以下是开发一张单据的整体流程，包括对象建模、应用建模、流程配置和发布等。
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/creat-bill_image.dab3dd0f.png)
接下来，以使用标准模板开发一张合同单据为例，首先介绍如何使用标准模板来开发一张基础合同单据，逐步深入到如何通过扩展开发实现单据的灵活性与定制化，逐步介绍开发流程。

### [](#11-登录环境)1.1 登录环境

登陆 [测试环境](https://bip-test.yonyoucloud.com) 或者
[日常环境](https://bip-daily.yonyoucloud.com)，输入登陆账号和登陆密码进入数字化工作台。

### [](#12-应用构建)1.2 应用构建

#### [](#步骤一新建应用)步骤一：新建应用

**找到“应用构建”模块**：在工作台中，定位到“应用构建”模块，准备开始新建应用。

![应用构建](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/creat-bill_intro.4b3fd695.png)**选择空白模板**：在“新建应用”的界面中，选择“空白模板”作为起点，这将为你提供一个干净的画布来构建你的应用。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/create-bill-new.0a7061f0.png)**填写应用信息**：点击“下一步”后，你将需要输入应用的相关信息，包括：

- **应用名称**：为应用起一个清晰、简洁的名称。
- **所属领域**：选择或指定应用所属的业务领域或部门。
- **应用引擎**：选择你的应用引擎。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/create-bill-new2.9b4b911a.png)

#### [](#步骤二进入新建应用并进行对象建模)步骤二：进入新建应用并进行对象建模

**进入新建应用**：在创建完成后，点击进入你刚刚新建的应用。
**选择对象建模**：在应用内部，选择“对象建模”--“新增业务对象”，进行业务对象的定义。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/create-bill-newobj.3c16c328.png)**编辑并发布实体元数据**：点击“编辑”，根据业务需求定义业务属性，填写实体名称、类型属性等。完成实体定义后，确保进行“发布”操作，这样定义的实体才能在应用中生效和使用。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/create-bill-editobj.45af803c.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/create-bill-newobj2.8faa39b4.png)

### [](#13-页面构建)1.3 页面构建

**选择页面建模**：选择“页面建模”---“新增”，开始构建页面。
**使用模板构建页面**：根据业务需求，选择适合的页面模板（如单卡、一主多子、左数右表等），填写页面名称，页面编码和元数据（元数据请选择选择刚创建的对象）。在构建过程中，系统将同时为你生成PC端和移动端的页面，确保多端一致性。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/create-bill-newpage.244f5229.png)
其中，如果你在这里选择单卡，填写元数据，系统会自动生成列表页面。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/create-bill-newpage2.d012cdfe.png)

### [](#14-设计器编辑设计)1.4 设计器编辑设计

选择pc端或者移动端，进入设计器页面开始设计一张单据，对页面字段，样式，元数据等进行调整，设计一张完成的单据。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/create-bill-designer3.30f7950b.png)
设计器是一个用于创建和编辑单据的工具，主要由组件物料区、编辑画布区和组件级配置区三个核心模块和一个工具栏组成。

![设计器页面](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/create-bill-designer2.f04da0f1.png)**组件物料区**

- 组件：浏览并查找各类组件，通过点击并拖拽组件到画布区，用户可以快速构建单据的初步结构。
- 模块：包含单据的布局和业务，进一步构建单据页面。
- 数据（元数据）：定义了单据所需的数据源，包括页面实体数据、字段映射等。
- 层级：可以调整页面内的组件树结构，组件树结构展示了页面内所有组件的层级关系，包括数据对象（store）、页面反应（reaction）和公共函数（action）。

**编辑画布区**

- 组件属性配置：选中画布上的组件后，右侧面板将展示该组件的属性配置选项。用户可以在此区域设置组件的基础属性，如名称、值、可见性等。
- 组件排列与布局：用户可以通过拖拽操作调整组件在画布上的位置，以改变单据的布局。支持将组件拖拽到容器类型的组件中，以实现更复杂的布局效果。
- 组件复制：点击组件右上角的复制按钮，可以快速复制组件并生成一个副本。
- 组件删除：点击组件右上角的删除按钮，可以删除选中的组件。

**组件级配置**

- 选中组件定位：用户可以从页面顶层节点开始，逐步点击并选择需要的组件，实现精确的组件定位。选中组件后，界面将自动切换到对应组件的配置界面。
- 选中组件配置：根据组件类型不同，当前选中组件支持如下子类目配置：

属性配置：设置组件的基础属性，如标签、值绑定、必填项等。
- 样式配置：自定义组件的样式，包括颜色、字体、边距、边框等。
- 动作配置：为组件绑定对外暴露事件，如点击、输入事件等。

**工具栏**

- 基本操作：保存、撤回、重做、查看历史页面和发布元数据等。
- 脚本编辑：用户可编写扩展脚本实现复杂逻辑。
- 预览：跳转到运行时查看单据效果并进行调试。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/create-bill-designer.e104ac2a.png)
如上图，通过在设计器里进行简单配置，一张包含基础字段的，设计了必填校验，且具有新增，提交，导入导出、删除和打印的合同单据应用已经构建好。你可以进行其他尝试，包括但不限于对不同组件的使用，样式调整，事件绑定等，设计器将为你提供强大的应用构建功能。

### [](#15-运行时查看验证效果)1.5 运行时查看验证效果

点击“工具栏--预览”按钮查看单据效果。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/create-bill-runtime.e819858d.png)
运行时可以查看最终单据效果。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/create-bill-runtime1.cc7dd98c.png)
至此，你已成功掌握了新建一张单据的流程。接下来，你还将学习到如何给应用配置流程（工作流和业务流），如何对单据进行扩展开发以及如何发布应用等。

## [](#2-流程配置非必须)2 流程配置（非必须）

### [](#21-工作流)2.1 工作流

工作流是支持工作流和审批流自动化的高性能平台，设计态提供工作流设计器，运行态提供流程管理，任务管理，流程查询，历史查询等一系列SDK接口，在业务平台中起到对业务单据进行审批的作用。

配置工作流入口如下：

点击“流程&自动化”-“工作流”，选择需要配置的业务对象，点击“新建”，输入流程名称即可。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/create-bill-process.1c066ff2.png)
这里，只需要了解配置入口。

### [](#22-业务流)2.2 业务流

业务流实现单据按不同交易类型定义不同的业务流程自定义，同时支持领域单据和应用构建平台单据之间的自定义流程，满足企业业务流程规范化、自动化、易调整的管理要求。

系统预置标准业务流流程，企业可根据实际业务管理要求对标准流程进行扩展补充。例如补充字段映射 (如自定义项的上下游携带)、回写规则，在动作前后事件中补充业务处理和控制，例如保存前校验、审核后触发自动业务处理等。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/create-bill-process2.22c60aa5.png)
这里，只需要了解配置入口。

## [](#3-实践总结)3 实践总结

通过构建从数字化工作台创建页面到发布页面的闭环，并基于标准能力进行简单扩展开发，能够快速响应业务需求，提高开发效率。同时，灵活可扩展的架构和统一的开发标准将为未来的功能扩展和系统升级打下坚实的基础。

## [](#qa)Q&A

## [](#参考)参考

- [工作流服务概要设计说明](https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=138314373)
- [业务流适配](https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=205295802)