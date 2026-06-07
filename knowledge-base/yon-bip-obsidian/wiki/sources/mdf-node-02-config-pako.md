---
title: "MDF压缩与加密配置"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/02-config-pako"
section: "MDF服务"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, MDF服务]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# MDF压缩与加密配置

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/02-config-pako | 所属：MDF服务

# [](#mdf压缩与加密配置)MDF压缩与加密配置

开启压缩和加密的方法如下，需要注意的是：

- 开启后性能略有降低；
- 非MDF框架开发的单据不受控

## [](#1-公有云)1. 公有云

公有云仅支持按租户开启加密（如需开启请求联系MDF服务负责人），不支持按租户开启压缩

## [](#2-私有化)2. 私有化

私有化支持2种维度：

- 支持按环境开启压缩和加密
- 支持按租户开启加密（不支持按租户开启压缩）

### [](#21-压缩)2.1. 压缩

配置方法与配置项详细说明：[《项目级配置工具（R5 & R6）》](#/node/03-config-tool) 和 [《MDF服务配置项说明》](#/node/02-config-item-desc))
**示例：**项目级全局配置

{

 "globalVars": {

 "__DEFINE_STYLE__": {

 "enableDeflate": true

 }

 }

}

### [](#22-加密废弃)2.2. 加密（废弃）

#### [](#221-按环境配置)2.2.1. 按环境配置

配置方法与配置项详细说明：[《项目级配置工具（R5 & R6）》](#/node/03-config-tool) 和 [《MDF服务配置项说明》](#/node/02-config-item-desc))

**示例：**项目级全局配置

{

 "globalVars": {

 "__MDF_ENCRYPT__": {

 "platform": ["all"],

 "excludePath": [],

 "includePath": []

 }

 }

}

#### [](#222-按租户配置)2.2.2. 按租户配置

*不推荐*