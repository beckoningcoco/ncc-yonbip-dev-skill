---
title: "项目级配置文件 R2"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/03-config-file"
section: "MDF服务"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, MDF服务]
platform_version: "BIP V5"
source_type: mdf-docs
images: 10
---

# 项目级配置文件 R2

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/03-config-file | 所属：MDF服务

# [](#项目级配置文件-r2)项目级配置文件 R2

**最新的 V3R5 及以后的版本（20240122 以后）请使用配置工具：《[项目级配置工具](#/node/03-config-tool)》**

## [](#1-配置文件说明)1. 配置文件说明

MDF 服务支持配置项目级配置文件，解决以下问题

- 项目级配置不会被打补丁覆盖
- 满足客开的 DomainKey 的配置以及对原厂配置进行覆盖
- 对于已经存在的配置在 new4 如果需要删除的话，必须把配置改成空串，否则去不掉（配置有合并的逻辑）

![img](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/image2023-11-2_10-7-14.c17f1816.png)

## [](#2-项目级领域配置)2. **项目级领域配置**

### [](#21-创建文件)2.1. **创建文件**

**在 MDF 服务的流水线中创建**

创建流程：技术中台->流水线->MDF 服务（或 iuap-mdf-server）->应用配置->配置文件 → 添加配置文件

![img](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/image2023-11-2_10-1-11.7f686e12.png)

可以通过相对路径或绝对路径 2 种方式添加文件：

- **绝对路径：/design/app.config.project.json 推荐 20211230 之后的版本**
- 相对路径：/iuap-mdf-node/app.config.project.json 20211230 之前的版本

如下图第二个文件

![img](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/image2023-3-6_14-3-35.9477e355.png)

### [](#22-内容示例)2.2. 内容示例

{

 "domainKey1": { // 同名的domainKey会深度覆盖，可以只覆盖部分属性

 "env": {

 "__WORKFLOW_META__": { "appSource": "PU" }

 }

 },

 "domainKey2": { // 不同的domainKey会新增

 "features": { // 数组会整个数组覆盖，所以新增项时需要加上原来的

 "queryLoginUser":true

 },

 "appServer": "/yx-dispatchcentersrv",

 "staticHost": "/yx-dispatchcenterweb"

 }

}

### [](#23-启用配置)2.3. **启用配置**

确认配置文件是否启用，如果没有启用需在属性页面启用一下（点右上角的编辑图标） 版本必须一致，否则不会生效

![img](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/image2023-9-8_13-59-23.8cc1c4de.png)

![img](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/image2023-11-1_20-42-22.a7af84b7.png)

![img](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/image2023-11-1_20-42-51.8dc75b12.png)

![img](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/image2023-9-8_14-0-47.07fe180d.png)

### [](#24-检查是否成功)2.4. **检查是否成功**

- 确保是一个标准的 JSON 结构（Key 需要有双引号）
- 重启完进入容器控制台看当前根目录的是否有新的加配置文件（app.config.project.json），cat 查看内部是否正确
- features 可以通过在控制台打印`cb.extend.features.<damainKey>`查看配置是否生效
- env 可以通过在控制台打印`viewmodel.getEnv('<Key>')`查看配置是否生效 或者使用` cb.extend.Env['yonbip-scm-scp']`

## [](#3-项目级全局配置)3. **项目级全局配置**

### [](#31-创建文件)3.1. **创建文件**

**在 MDF 服务 的流水线中创建**

创建流程：技术中台->流水线->MDF 服务（或 iuap-mdf-server）->应用配置->配置文件->添加配置文件
可以通过相对路径或绝对路径 2 种方式添加文件：

- **绝对路径：/design/app.common.config.project.json 推荐 20211230 之后的版本**
- 相对路径：/iuap-mdf-node/app.common.config.project.json 20211230 之前的版本

如下图第一个文件

![img](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/image2023-3-6_14-3-35.9477e355.png)

### [](#32-内容示例)3.2. **内容示例**

{

 "MOBILE_SHOW_VCONSOLE": true,

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

### [](#33-启用配置)3.3. **启用配置**

确认配置文件是否启用，如果没有启用需在属性页面启用一下（点右上角的编辑图标）

![img](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/image2023-9-8_13-59-23.8cc1c4de.png)

![img](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/image2023-9-8_14-0-47.07fe180d.png)

勾选启用后，选择好版本，点保存—重启并同步流水线

### [](#34-检查是否成功)3.4. **检查是否成功**

- **确保是一个标准的 JSON 结构（Key 需要有双引号）**
- **重启完进入容器控制台看当前根目录的是否有新的加配置文件（app.common.config.project.json），cat 查看内部是否正确**

## [](#4-配置项说明)4. **配置项说明**

[《MDF 服务配置项说明》](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=20771730)