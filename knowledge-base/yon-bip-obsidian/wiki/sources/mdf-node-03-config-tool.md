---
title: "项目级配置工具 R5R6"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/03-config-tool"
section: "MDF服务"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, MDF服务]
platform_version: "BIP V5"
source_type: mdf-docs
images: 4
---

# 项目级配置工具 R5R6

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/03-config-tool | 所属：MDF服务

# [](#项目级配置工具-r5r6)项目级配置工具 R5R6

- **旧版 即 V3R5 以前的版本（20231222 以前）请使用配置文件：《[项目级配置文件](#/node/03-config-file)》**
- **修改配置的时候注意不要误改其他人的配置内容**

## [](#1-配置工具说明)1. 配置工具说明

### [](#11-访问地址)1.1. 访问地址

https://<业务中台域名>/mdf-node/nodeConfig

访问前需先登录业务中台

### [](#12-配置说明)1.2. 配置说明

MDF 服务支持配置项目级配置，解决以下问题

- 项目级配置不会被打补丁覆盖
- 可以点右上角查看原厂配置
- 新加配置会和原厂自带配置合并，对象属性合并，数组属性覆盖
- 领域配置修改后立即生效，公共配置修改后需要重启 MDF 服务才会生效
- 满足客开的 DomainKey 的配置以及对原厂配置进行覆盖
- 对于已经存在的配置，如果需要删除的话，必须把配置改成空串，否则去不掉

![img](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/image2024-1-3_18-1-21.e5c68ade.png)

## [](#2-项目级领域配置)2. 项目级领域配置

### [](#21-界面效果)2.1. 界面效果

![img](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/image2024-7-15_16-17-26.fe6d4df4.png)

### [](#22-内容示例)2.2. 内容示例

**示例 1：**

前端微服务编码：domainKey1

领域配置内容：

// 同名的domainKey会深度覆盖，可以只覆盖部分属性

{

 "env": {

 "__WORKFLOW_META__": { "appSource": "PU" }

 }

}

**示例 2：**

前端微服务编码：domainKey2

领域配置内容：

// 不同的domainKey会新增

{

 "features": { // 数组会整个数组覆盖，所以新增项时需要加上原来的

 "queryLoginUser":true

 },

 "appServer": "/yx-dispatchcentersrv",

 "staticHost": "/yx-dispatchcenterweb"

}

### [](#23-检查是否成功)2.3. 检查是否成功

- 确保是一个标准的 JSON 结构（Key 需要有双引号）
- 保存成功后立即生效，刷新浏览器即可验证，可通过技术中台，微服务管理 → 实例管理 → 容器日志查看是否打印出了最新的配置
- features 可以通过在控制台打印`cb.extend.features.<damainKey>`查看配置是否生效
- env 可以通过在控制台打印`viewmodel.getEnv('<Key>')`查看配置是否生效 或者使用`cb.extend.Env['yonbip-scm-scp']`

## [](#3-项目级全局配置)3. 项目级全局配置

### [](#31-界面效果)3.1. 界面效果

![img](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/image2023-12-24_20-17-16.6f788688.png)

### [](#32-内容示例)3.2. 内容示例

{

 "MOBILE_SHOW_VCONSOLE": true,

 "useNewAppCode": false,

 "openCanaryDebug": true,

 "globalVars": {

 "__MDF_FEATURE_CONFIG__": {

 "workflowSync": "~",

 "workflowSync": {

 "租户tenantId": ["单据billNo"]

 }

 },

 "__DEFINE_STYLE__": {

 "bSmartSearch": false,

 "disableShowWorkflow": ["租户ID"]

 },

 "AMAPKEY": "",

 "AMAPSECRETKEY": ""

 }

}

### [](#33-检查是否成功)3.3. 检查是否成功

- 确保是一个标准的 JSON 结构（Key 需要有双引号）
- 保存成功后需要重启 MDF 服务，可通过技术中台，微服务管理 → 实例管理 → 容器日志查看是否打印出了最新的配置

## [](#4-项目级缓存清理工具r6)4. 项目级缓存清理工具（R6）

### [](#41-界面效果)4.1. 界面效果

![img](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/image2024-8-2_9-16-26.55c1d14c.png)

### [](#42-使用操作)4.2. 使用操作

选择要清理缓存的 domainKey，点击“清理 Redis 按钮”即可清理该 domainkey 的全部缓存

### [](#43-使用场景)4.3. 使用场景

用于领域打补丁更新配置的情况，此时清理 Redis 可达到无需重启服务更新全局缓存的效果，配置界面上产生的修改不需要清缓存

## [](#5-专属化制盘抽脚本)5. 专属化制盘抽脚本

- 《[前端](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=59124055)[服务 domainKey 配置抽取](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=59124055)[脚本](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=59124055)》

## [](#6-配置项说明)6. 配置项说明

- [《MDF 服务配置项说明》](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=20771730)

## [](#7-推荐文档)7. 推荐文档

- 《[MDF 谷歌调试插件](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=28023672)》
- 《[MDF 框架实施手册](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=20772993)》