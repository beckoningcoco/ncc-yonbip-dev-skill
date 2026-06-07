---
title: "扩展注册 Extend"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-extend"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 扩展注册 Extend

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-extend | 所属：API

# [](#扩展注册-extend)扩展注册 Extend

## [](#1-注册扩展脚本)1. 注册扩展脚本

扩展脚本在`src/business`中编写，通过以下方法注册

// 注册扩展脚本

const businessContext = require.context("business");

cb.extend.registerScripts(process.env.__DOMAINKEY__, businessContext);

## [](#2-注册扩展组件)2. 注册扩展组件

扩展组件在`src/client/web|mobile/components`中编写，通过以下方法注册

// 注册扩展组件

const extendComponents = require("./mobile/components").default;

cb.extend.registerComponents(process.env.__DOMAINKEY__, extendComponents);

## [](#3-注册reducer)3. 注册reducer

扩展reducers在`src/client/mobile/redux/reducers.jsx`中编写，通过以下方法注册

// 注册reducer

const extendReducers = require("./mobile/redux/reducers").default;

cb.extend.registerReducers(process.env.__DOMAINKEY__, extendReducers);

## [](#4-注册router)4. 注册router

扩展路由在`src/client/mobile/routes/index.jsx`中编写，通过以下方法注册

// 注册router

const extendRoutes = require("./mobile/routes").default;

cb.extend.registerRoutes(process.env.__DOMAINKEY__, extendRoutes);

## [](#5-注册扩展action)5. 注册扩展action

扩展Action在`src/client/common/biz/actions.js`中编写，通过以下方法注册

// 注册扩展action

const extendBizAction = require("./common/biz/actions").default;

cb.extend.registerBizAction(process.env.__DOMAINKEY__, extendBizAction);

## [](#6-注册变量)6. 注册变量

// 注册变量（框架使用的变量前后添加__）

cb.extend.registerEnv(process.env.__DOMAINKEY__, { // registerEnv的第2个参数可以是个方法，接收一个当前环境env参数

 __PRINT_META__: { // 框架使用的打印变量

 domainCode: "SCM",

 printDataServer: EnvConfig.HTTP_PRINT_DATA_SERVERURL

 },

 __WORKFLOW_META__: { // 框架使用的审批流变量

 appSource: "PU"

 },

 currentEnv: "daily" // 领域自定义变量示例（小驼峰规范），变量使用：viewmodel.getEnv('currentEnv')

});

## [](#7-注册多语)7. 注册多语

// 注册多语

cb.lang.registerLang(process.env.__DOMAINKEY__, require("../pack"), "");

## [](#8-扩展样式)8. 扩展样式

扩展样式在`src/client/mobile/styles`中编写，在打包入口文件中引入即可。