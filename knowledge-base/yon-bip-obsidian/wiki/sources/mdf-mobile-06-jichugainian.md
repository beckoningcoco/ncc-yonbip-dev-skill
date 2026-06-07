---
title: "基础概念"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/06-jichugainian"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 基础概念

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/06-jichugainian | 所属：移动组件

# [](#基础概念)基础概念

## [](#1-前言)1. 前言

此文档针对已经熟练配置excel的开发人员使用。

## [](#2-excel相关文档)2. Excel相关文档

详见 列表页配置 和 卡片页配置

## [](#3-移动端与pc端的区别)3. 移动端与PC端的区别

### [](#31-后台请求区别)3.1. 后台请求区别

#### [](#311-pc端)3.1.1. PC端

[https://xxx/mdf-node/uniform/bill/list](https://xxx/mdf-node/uniform/bill/list)?terminalType=1

[https://xxx/mdf-node/uniform/bill/batchaudit](https://xxx/mdf-node/uniform/bill/batchaudit)?terminalType=1

#### [](#312-移动端)3.1.2. 移动端

[http://xxx/mdf-node/uniform/bill/list](http://xxx/mdf-node/uniform/bill/list)?terminalType=3

[http://xxx/mdf-node/uniform/bill/batchaudit](http://xxx/mdf-node/uniform/bill/batchaudit)?terminalType=3

#### [](#313-参数区别)3.1.3. 参数区别

可以看出参数terminalType=3是用来区分端的。

### [](#32-ui模版区别)3.2. UI模版区别

移动端和PC端共有的单据（billnum相同），使用同一bill_base、bill_entity、pb_meta_filters、pb_meta_filter_item以及一套生单分单回写规则。其它表预制区分如下：

#### [](#321-billtemplate_base)3.2.1. billtemplate_base

iTplMode=3

||模版类型|
||iTplMode|
||3|

#### [](#322-billtplgroup_base和billitem_base)3.2.2. billtplgroup_base和billitem_base

通过单据模板ID字段iTplId关联billtemplate_base区分

#### [](#323-pb_filter_solution)3.2.3. pb_filter_solution

terminalType=3

||terminalType|
||3|

#### [](#324-pb_filter_solution_common)3.2.4. pb_filter_solution_common

通过方案ID solutionId关联pb_filter_solution区分

#### [](#325-bill_toolbar)3.2.5. bill_toolbar

tplmode=3、templateType=3、terminalType=3

#### [](#326-bill_toolbaritem)3.2.6. bill_toolbaritem

通过分组 toolbar关联bill_toolbar区分

### [](#33-关于应用标题)3.3. 关于应用标题

- 

标准情况，工作台打开应用菜单时应通过appTitle参数传入当前语种的应用名称，作为标题显示，如果私有版没有这个逻辑需要和公有版对齐
2.
兜底策略，交易类型发布的同时会修改billtemplate_base的cTitle，如果billtemplate_base的cTitle没有被修改为交易类型名称（如果是交易类型发布的菜单时）

### [](#34-脚手架区别)3.4. 脚手架区别

#### [](#341-区别)3.4.1.  区别

- 

移动端和PC共用一个脚手架、一套后端服务、一套扩展脚手、一套模型

- 

不同的是前端组件和渲染模板是两套

#### [](#342-获取脚手架)3.4.2. 获取脚手架

新工程请使用此[『MDF3.0脚手架』](http://git.yyrd.com/yonyou-mdf/mdf-server-app)

## [](#4-统一node服务)4. 统一Node服务

### [](#41-domainkey注册)4.1. domainKey注册

把领域Code（建议和后台服务域的domain相同）、**前端域名、后端域名**按以下格式发给
[yaoleib@yonyou.com](mailto:yaoleib@yonyou.com)

uhy: {

 "appServer": "/yonbip-xxx-xxx",

 "useOSS": true // 除测试环境必需是https，建议不要使用长域名

}

- 如果PC已经注册过则不需要再注册，和PC共用一个。

- 

统一Node中内置了大量的变量可配置，如：是否使用异步导出、是否开启缓存、是否开启UI模板，详细统一Node配置中心配置项说明文档请移步[《统一Node配置项说明》](#/node/02-config-item-desc)

### [](#42-调试本地扩展代码)4.2. 调试本地扩展代码

MDF3.0启动两个服务、前端和后端nodejs部分，命令整合之后可以启动一套命令，MDF3.0部署方式有两种，一种是独立Node、另一种则是统一Node，官方强烈建议使用统一Node

- 方式一：在url上添加 scriptUrl=[http://localhost:3004/static](http://localhost:3004/static)
参数即可加载本地扩展代码

用户可根据部署环境不同，自由扩展；本地启动时需要在src/common/config.env.js中配置对应的后端服务地址

切换 MANIFEST=production

- 

如果调试的是本地Node，则需要在启动命令中添加 MANIFEST=production

- 

如果调式的是线上环境，则需要在启动命令中添加 MANIFEST=development

### [](#43-本地调试启动)4.3. 本地调试启动

# 1. 启动默认调试，会开启前后端服务，默认接口为src/web/common/config.env.js中的daily

npm run debug

 

# 2. 单独启动前端工程

npm run debug:extend

 

# 3. 单独启动后端node.js服务

npm run debug:server

### [](#44-部署上线服务)4.4. 部署上线服务

# 1. 构建web端部署

npm run build

 

# 2. 启动服务

npm run start

### [](#45-扩展脚本cdn加速)4.5. 扩展脚本CDN加速

如果流水线和统一Node启用了扩展资源上传OSS，则只需要启动前端debug:extend命令即可

## [](#5-开发注意事项)5. 开发注意事项

**请遵守如下规范：**

### [](#51-依赖引入方式)5.1. 依赖引入方式

为减小构建产物体量，组件包不再单独引入，如果需要使用metaui-web或metaui-mobile中的组件，可通过控制台打印cb.components查看支持的内容，引入示例如下：

**1、组件依赖**

// PC端

const { Form, Button, Card } = window.YonuiYs; // 不需要单独引入yonui-ys

const { TreeRefer, Label, Input } = require('mdf-metaui-web').basic; // 不需要单独引入@mdf/metaui-web

 

// 移动端：

const { Button, DatePicker } = window.AntdMobile; // 需要单独引入@mdf/baseui-mobile

const { Refer } = require('mdf-metaui-mobile').basic; // 不需要单独引入@mdf/metaui-mobile

**2、脚本依赖**

const { setMode, getWebUrl } = viewmodel.biz.action().common; // 不需要单独引入@mdf/cube

### [](#52-配置domainkey)5.2. 配置domainKey

修改package.json中的domainKey为本领域

### [](#53-访问单据)5.3. 访问单据

**1、移动端访问简易门户（PC无）：**

**测试环境：**[https://<工作台域名>/mdf-node/](http://mdf-node.test.app.yyuap.com)

**其它环境：**用 cb.utils.getNodeServerUrl() 在控制台打印出来就是

携带参数domainKey=领域code，即只访问自己域的菜单。例如：

https://<工作台域名>/mdf-node/?domainKey=upu

也可以在统一Node配置中心配置domainKey组，从而在简易门户中显示多个domainKey对应的菜单

**2、访问统一Node单据页面（PC和移动通用）：**

示例：[https://<工作台域名>/mdf-node/meta/voucherlist/st_purchaseorderlist?domainKey=upu](https://mdf-server-daily.yyuap.com/meta/voucherlist/st_purchaseorderlist?domainKey=upu)

**3、访问本地单据页面（PC和移动通用）：**

示例：[http://local.xxx.com:3003/meta/voucherlist/st_purchaseorderlist](http://local.yyuap.com:3003/meta/voucherlist/st_purchaseorderlist)

### [](#54-配置mdf版本)5.4. 配置MDF版本

独立Node配置框架版本（统一Node不需要）

process.env.MDF_RESOURCE_VERSION

process.env.MDF_MOBILE_RESOURCE_VERSION

独立Node需要在package.json或流水线环境变量中配置框架版本，以上具体变量值请向MDF框架开发团队索取

## [](#6-mtl相关)6. MTL相关

[《MTL的相关API》](https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=169878261)

《[备用地址](https://bip-pre.yonyoucloud.com/yonbip-ec-pc/ucf-wh/pc-bridge/mtl-doc/index.html#/)》

### [](#61-获取当前设备访问平台)6.1. 获取当前设备访问平台

platform获取当前运行平台

**支持平台**

||微信||友空间||安卓||iOS|
||✔︎||✔︎||✔︎||✔︎|

let platform = mtl.platform; // 获取当前运行平台，wx|ios|android|h5|upesn