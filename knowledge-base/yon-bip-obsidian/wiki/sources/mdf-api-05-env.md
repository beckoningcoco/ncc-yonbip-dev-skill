---
title: "环境信息 Env"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-env"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 环境信息 Env

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-env | 所属：API

# [](#环境信息-env)环境信息 Env

## [](#1-获取服务地址)1. 获取服务地址

`cb.env.getServiceUrl()`
去iframe的场景下和`cb.env.getNodeServerUrl()`返回值一致

**参数：** 无

**返回值：** 获取服务地址，需要转发的请求

**此方法对应以前的写法：**

- `cb.utils.getServiceUrl()`

## [](#2-获取node端服务地址)2. 获取Node端服务地址

`cb.env.getNodeServerUrl()`
去iframe的场景下和`cb.env.getServiceUrl()`返回值一致

**参数：**

||**参数**||**类型**||**必填**||**备注**|
||isHttp||boolean||否||是否是http|

**返回值：** Node端服务地址

**此方法对应以前的写法：**

- `cb.utils.getNodeServerUrl()`

## [](#3-是否专属化)3. 是否专属化

`cb.env.isPremisesEnv()`

**参数：** 无

**返回值：** 是否是专属化

**此方法对应以前的写法：**

- 

`cb.utils.isPremisesEnv()`

- 

日常多数据库环境是专属化方式部署的，也返回true

## [](#4-获取业务中台域名)4. 获取业务中台域名

`cb.env.getMainOriginUrl()`

**参数：** 无

**返回值：** 业务中台域名

**此方法对应以前的写法：**

- `cb.utils.getMainOriginUrl()`

## [](#5-获取mdf服务前缀)5. 获取MDF服务前缀

`cb.env.getWindowBaseUrl()`

**参数：** 无

**返回值：** MDF服务前缀，如：mdf-node

## [](#6-是否本地访问)6. 是否本地访问

`cb.env.isFileProtocol()`

**参数：** 无

**返回值：** 是否本地协议访问，true是本地协议，false非本地协议