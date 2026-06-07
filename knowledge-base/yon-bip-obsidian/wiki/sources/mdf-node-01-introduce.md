---
title: "MDF服务介绍"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/01-introduce"
section: "MDF服务"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, MDF服务]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# MDF服务介绍

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/01-introduce | 所属：MDF服务

# [](#mdf服务介绍)MDF服务介绍

## [](#1-服务概览)1. **服务概览**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/mdffuwujieshao_image1.937c2ed8.png)

## [](#2-服务演变)2. **服务演变**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/mdffuwujieshao_image2.a99da808.jpeg)

## [](#3-能力清单)3. **能力清单**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/mdffuwujieshao_image3.73e9ab4c.png)

### [](#31-统一资源)3.1. **统一资源**

#### [](#311-工作台集成-web)3.1.1. **工作台集成-Web**

- 全球化信息
- 上下文信息

#### [](#312-友空间集成-mobile)3.1.2. 友空间集成-Mobile

- 轻应用
- 友空间小程序
- 移动端鉴权方案
- 本地化跨域处理

#### [](#313-资源服务)3.1.3. 资源服务

**去IFame方式**

- resource
- loadStyle
- getScriptUrl - extend
- getResourceJson
- getAppletResources

**Viewhook方式**

- resourceJson
- extendJson

#### [](#314-统一图标库)3.1.4. 统一图标库

- 图标库版本配置
- md5码生成

#### [](#315-领域依赖)3.1.5. 领域依赖

         
为减小构建产物体量，组件包不再单独引入，如果需要使用metaui-web或metaui-mobile中的组件，可通过控制台打印cb.components查看支持的内容，引入示例如下：

**组件依赖：**

// PC端 不需要单独引入tinper-next和@mdf/metaui-web

import { Form, Button, Card } = window.TinperNext;

const { TreeRefer, Label, Input } = require('mdf-metaui-web').basic;

 

// 移动端 不需要单独引入baseui-mobile和@mdf/metaui-mobile

import { Button, DatePicker } = window.BaseuiMobile;

const { Refer } = require('mdf-metaui-mobile').basic;

**脚本依赖：**

// 不需要单独引入@mdf/cube

const { setMode, getWebUrl } = viewmodel.biz.action().common;

### [](#32-配置中心-consul)3.2. 配置中心 Consul

#### [](#321-consul的使用)3.2.1. Consul的使用

#### [](#322-数据备份与还原)3.2.2. 数据备份与还原

#### [](#323-动态注册domainkey)3.2.3. 动态注册domainKey

- 公有云
- 专属化

#### [](#324-降级策略)3.2.4. **降级策略**

#### [](#325-配置项说明)3.2.5. 配置项说明

- 公共配置
- 领域配置
- getEnv与hasFeature

### [](#33-路由转发)3.3. **路由转发**

#### [](#331-路由注册)3.3.1. 路由注册

- 前端路由
- 后端路由

#### [](#332-路由转发与代理转发)3.3.2. 路由转发与代理转发

针对除文件流之外的简单请求和非简单请求

#### [](#333-路由透传与代理透传)3.3.3. 路由透传与代理透传

针对文件上传下载

### [](#34-模型生成)3.4. 模型生成

#### [](#341-art-template)3.4.1. art-template

#### [](#342-模型覆盖逻辑)3.4.2. 模型覆盖逻辑

### [](#35-中间件)3.5. 中间件

#### [](#351-中间件介绍)3.5.1. 中间件介绍

- common 公共逻辑
- cors 跨域处理
- pako 请求数据压缩
- compress gzip压缩
- log4js 日志
- als 上下文携带
- debug 调试
- log 日志
- print 打印
- env 环境变量
- proxy 代理转发
- auth 鉴权
- viewhook 服务器端渲染
- router 路由表
- consul 配置中心
- jwt 权限认证

#### [](#352-cors方案)3.5.2. CORS方案

《CORS原理及@koa/cors源码解析》

### [](#36-性能优化)3.6. 性能优化

#### [](#361-redis缓存)3.6.1. Redis缓存

- 缓存内容
- 单例、集群与哨兵

#### [](#362-资源缓存)3.6.2. 资源缓存

- 领域资源相互依赖
- 领域资源加载

### [](#37-资源固化)3.7. 资源固化

#### [](#371-版本固化与版本管控)3.7.1. 版本固化与版本管控

- 多版本共存
- 版本切换机制

#### [](#372-资源灰度机制)3.7.2. 资源灰度机制