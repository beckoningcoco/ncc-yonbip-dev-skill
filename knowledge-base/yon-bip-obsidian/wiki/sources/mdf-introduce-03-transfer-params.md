---
title: "关于嵌套和上下游单据补参方案"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/03-transfer-params"
section: "介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 介绍]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 关于嵌套和上下游单据补参方案

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/03-transfer-params | 所属：介绍

# [](#关于嵌套和上下游单据补参方案)关于嵌套和上下游单据补参方案

**写在前面**

- 补参用于解决越权、附件权限等问题，如：附件没有操作按钮、附件丢失、子页面报无权限、下游单据传的是上游的serviceCode或busiObj等
- 方案一与方案二有所区别，请关注
- 如果没有配置参数，部分参数默认会继承父单据或上游单据的参数；如果发现子单据或下游单据带的是上游单据参数，则是因为没有配置参数
- 以下补参方案策略是一致的，都是在params.query中补参数，如：serviceCode、busiObj、transtype等等
- 正常busiObj的传参方式是在页面的url上添加busiObj参数，存在以下场景时才需要补参

## [](#1-方案一)1. 方案一

### [](#11-嵌套单据场景)1.1. 嵌套单据场景

#### [](#111-通过pagegroup组件嵌入)1.1.1. 通过Page、Group组件嵌入

- **问题原因：** 未指定子单据的serviceCode，默认继承了父单据
- **配置方式：** 在billtplgroup_base表中Page、Group容器的cStyle字段中配置，示例：{"params":{"query":{"serviceCode":"xxx"}}}
- **详细说明：** Web端《[Page 页面容器](#/components-web/04-page)》、移动端《[Page 子页面](#/components-mobile/04-page)》

### [](#12-推拉单场景)1.2. 推拉单场景

#### [](#121-通过标准action实现)1.2.1. 通过标准Action实现

- **问题原因：** 未指定子单据的serviceCode，默认继承了父单据
- **涉及范围：** push、bizflowpush、bizflowbatchpush、pull、pullx、batchpush和singlepush
- **配置方式：** 在按钮对应的bill_command表的paramter属性中配置，示例：{"query":
{"serviceCode":"xxx", "busiObj":"xxx",
"transtype":"xxx"}}，此方法可以往下游传递任意参数，所有query中参数都会带到下游单据的所有接口请求中 

#### [](#122-扩展脚本实现)1.2.2. 扩展脚本实现

参考：3.1 章节

### [](#13-扩展脚本跳转场景)1.3. 扩展脚本跳转场景

#### [](#131-通过runcommandline跳转)1.3.1. 通过runCommandLine跳转

- **问题原因：** 未指定子单据的serviceCode，默认继承了父单据
- **传参方式：** 在参数params的query中传入，示例：params:
{query:{serviceCode:'xxx'}}
- **详细说明：** 《[页面管理 Page](#/api/05-page)》

#### [](#132-通过openservice跳转)1.3.2. 通过openService跳转

- **问题原因：** 未指定子单据的serviceCode，默认继承了父单据
- **修改方式：** 改成runCommandLine调用，如果需要新开页签能力，传入newOpenTabs参数，serviceCode在参数params的query中传入，示例：params:
{query:{serviceCode:'xxx'}}
- **详细说明：** 《[页面管理 Page](#/api/05-page)》

#### [](#133-通过vmcommunication跳转)1.3.3. 通过vm.communication跳转

- **传参方式：** 具体情况待分析，原则是层层往下传递

## [](#2-方案二)2. 方案二

- 为了减少领域代码修改量和模板配置修改量，6月9日上午和安全部、文件服务共同制定了方案二
- 方案二不需要领域修改扩展脚本和模板配置，仅需要在文件服务原来预置的权限数据中增加一个字段，具体方案细节请查看宋杰和李豪发的邮件
- 方案二仅解决附件相关问题，如果需要补busiObj、transtype等参数，请使用方案一