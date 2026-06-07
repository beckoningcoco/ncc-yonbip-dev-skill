---
title: "领域React Router扩展"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/03-linyureactrouterkuozhan"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 领域React Router扩展

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/03-linyureactrouterkuozhan | 所属：指南

# [](#领域react-router扩展)领域React Router扩展

## [](#1-前端路由扩展)1. 前端路由扩展

扩展路由在`src/client/web | mobile/routes/index.jsx`中扩展

**示例：**

// 示例开始

import { Demo } from "../components/basic"; // 目前支持参数 exact | path | component 支持嵌套路由属性children

export default [

 { exact: true, path: "/demo", component: Demo }

];

// 示例结束

## [](#2-node端路由扩展)2. Node端路由扩展

### [](#21-本地或独立node访问)2.1. 本地或独立Node访问

本地或独立Node访问时，需要在config.env.js文件中注册Node端路由，如下：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/linyureactrouterkuozhan_image1.0dac40c6.png)

### [](#22-统一node访问)2.2. 统一Node访问

通过统一Node访问页面时，需要在Consul配置中心或者配置文件中注册Node端路由，如下：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/linyureactrouterkuozhan_image2.235da456.png)

## [](#3-如何访问)3. 如何访问

前2步前端路由和Node端都扩展了，才可以正常访问页面

参考：[《页面管理》](#/api/05-page) 2.1.2章节 
自定义路由