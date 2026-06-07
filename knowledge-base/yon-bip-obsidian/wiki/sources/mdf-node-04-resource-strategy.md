---
title: "资源分流与灰度方案"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/04-resource-strategy"
section: "MDF服务"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, MDF服务]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 资源分流与灰度方案

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/04-resource-strategy | 所属：MDF服务

# [](#mdf-资源分流与灰度方案)MDF 资源分流与灰度方案

## [](#1-设计背景)1. 设计背景

*待技术中台提供设计文档*

## [](#2-领域扩展资源)2. 领域扩展资源

理论上此功能实现领域不需要做任何事情，如果领域有特殊的情况（如自行管理了资源版本、存在未纳入版本管理的资源）请反馈

### [](#21-流量规则前端-sdk)2.1. 流量规则前端 SDK

此 SDK 由技术中台提供，详见附件 md 文档

[https://gfwiki.yyrd.com/pages/viewpage.action?pageId=59119537&preview=/59119537/59119607/README.md](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=59119537&preview=/59119537/59119607/README.md)

### [](#22-mdf-服务实现)2.2. MDF 服务实现

MDF 实现领域扩展资源分流与灰度，做了以下工作：

- MDF 服务启动时调用 SDK 初始化 client、获取流量规则，将 client 和流量规则数据存储到 als 里
- 启动一个定时任务，每 5 分钟再调用 SDK 轮询查一次流量规则存到 als 里
- 通过 loadExtend 访问领域扩展资源时，根据第一步获取到的流量规则，调用 SDK 计算对应的版本，返回对应的版本资源

### [](#23-优先级规则)2.3. 优先级规则

租户组灰度 > 用户分流 > 业务分流 > 租户分流 > 租户组分流

## [](#3-流程图设计)3. 流程图设计

![img](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/image2024-8-13_21-6-47.dd4f5978.png)

## [](#4-框架资源)4. 框架资源

框架本身资源对应的版本由 Node 服务托管，因此对于框架资源的分流与灰度，依赖 Node 服务实例的分流与灰度即可。

## [](#5-运维流程与步骤)5. 运维流程与步骤

*待补充*