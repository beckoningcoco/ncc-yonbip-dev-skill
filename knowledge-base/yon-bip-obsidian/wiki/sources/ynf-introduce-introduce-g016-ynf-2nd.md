---
title: "YNF二方包机制"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/introduce/g016-ynf-2nd"
section: "YNF-介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 介绍]
platform_version: "BIP V5"
source_type: ynf-docs
images: 1
---

# YNF二方包机制

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/introduce/g016-ynf-2nd | 所属：YNF-介绍

# [](#ynf二方包机制)YNF二方包机制

## [](#1设计介绍)1.设计介绍

YNF二方包采用 `Module Federation` 模块联邦机制，解决分布式系统中的模块共享问题，将前端资源包“服务化”部署，取代传统的NPM发包、本地装包过程，所有资源包都是托管在云存储服务或统一 `NGINX` 服务上，运行时按需加载资源，本地不打包服务化包相关真实代码。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/module-federation.7f1ed82b.jpg)

## [](#2设计原则)2.设计原则

- 一个前端仓库对应唯一的一个制品。
- 一个前端场景，需要对应一个Git仓库，并产出对应的前端制品

- 前端业务应用，对应一个Git仓库，对应一个流水线，产出对应的前端制品。
- 前端组件库，对应一个Git仓库，对应一个流水线，产出对应的前端制品。
- 前端SDK，对应一个Git仓库，对应一个流水线，产出对应的前端制品。

领域YNF新前端应用创建时，使用 ynf-dx-cli 开发者工具（使用ynpm下载）新建各个工程模版。

## [](#3二方包规范)3.二方包规范

- [详细规范请访问：《二方包规范》](#/iuap-yonbuilder-designer/ucf-wh/docs/introduce/ynf-2nd)

## [](#4创建二方包)4.创建二方包

- [《如何创建YNF应用扩展脚本二方包》](#/iuap-yonbuilder-designer/ucf-wh/docs/guides/how-to-create-ynf-app)
- [《如何创建YNF组件库二方包》](#/iuap-yonbuilder-designer/ucf-wh/docs/guides/how-to-create-ynf-component)
- [《如何创建YNF SDK二方包》](#/iuap-yonbuilder-designer/ucf-wh/docs/guides/how-to-create-ynf-sdk)

## [](#5二方包的-devops-和资源访问)5.二方包的 DevOps 和资源访问

- 《统一前端二方包管理和接入》[https://docs.yonyoucloud.com/l/77c3ca1ecb16](https://docs.yonyoucloud.com/l/77c3ca1ecb16)

## [](#6二方包清单)6.二方包清单

- 详细清单文档：[https://docs.diwork.com/l/033b7e99c37C](https://docs.diwork.com/l/033b7e99c37C) 【友空间云文档】YNF 前端二方包微服务基本信息.xlsx