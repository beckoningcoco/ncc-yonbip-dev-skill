---
title: "MDF框架版本说明"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/04-framework-version"
section: "MDF服务"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, MDF服务]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# MDF框架版本说明

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/04-framework-version | 所属：MDF服务

# [](#mdf-框架版本说明)MDF 框架版本说明

## [](#1-常用环境)1. 常用环境

||环境||MDF服务分支||MDF 框架分支||说明|
||测试环境||develop||develop|||
||日常环境||daily||release/3.1|||
||预发环境||release||release/3.4|||
||核心1环境||release||release/3.4||紧急上线：hotfix/<迭代号>-fix + release/3.6|
||核心2环境||release||release/3.4||紧急上线：hotfix/<迭代号-1>-fix + release/3.7|
||核心3环境||release||release/3.4||紧急上线：hotfix/<迭代号-1>-fix + release/3.7|
||核心4环境||release||release/3.4||紧急上线：hotfix/<迭代号-1>-fix + release/3.7|
||商开环境||release||release/3.4||紧急上线：hotfix/<迭代号-1>-fix + release/3.7|
||海外核心1环境||release||release/3.4||紧急上线：hotfix/<迭代号-1>-fix + release/3.7|

## [](#2-几个特殊环境)2. 几个特殊环境

||环境||MDF服务分支||MDF 框架分支||说明|
||平台开发环境||develop||develop|||
||日常多数据库环境||daily||release/3.1|||
||核心1补丁环境||core1-hotfix||release/3.6||核心1紧急上线|
||核心2补丁环境||core2-hotfix||release/3.7||核心2紧急上线|
||R1联调环境||onpremise-R1_2212||release/3.3||R1出盘|
||专属迭代（630工作流）||onpremise-V3R2_20230630_sp||release/3.8||V3R2 630SP出盘|
||专属迭代（930工作流）||onpremise-V3R2_20230930_sp||release/3.9||V3R2 930SP出盘|
||专属迭代（V3R5金盘工作流）||onpremise-V3R5_20240510_QP||release/3.11||V3R5金盘出盘|
||专属迭代（V3R5 517SP工作流）||onpremise-V3R5_20240518_SP||release/3.11||V3R5 517SP出盘|
||私有化环境-发版（V3R6工作流）||onpremise-V3R5_20240712||release/3.12||V3R6出盘|

## [](#3-mdf-框架常用版本)3. MDF 框架常用版本

||环境||MDF服务分支|
||elease-3.1||对应日常环境|
||release-3.2||上下文改造之前的版本|
||release-3.3||R1分支|
||release-3.4||对应预发及生产环境|
||release-3.5||灰度分支|
||release-3.6||核心1紧急分支|
||release-3.7||核心2紧急分支|
||release-3.9||630SP分支|
||release-3.9||930SP分支|
||release-3.11||V3R5 和 V3R5 517SP分支|
||release-3.12||V3R6分支|
||snapshot||对应测试环境|

## [](#4-mdf-脚手架版本)4. MDF 脚手架版本

常见的脚手架版本：

- 1.0  早期 yxyweb 的版本（19 年之前未分包时期）
- 2.0  19 年-20 的脚手架版本（分包后）
- 3.0  21 年的版本（统一去 iframe 之后的版本）
- 4.1  22 年以后的版本（统一接入 TNS 后的版本）

## [](#5-各分支代码迭代节奏)5. 各分支代码迭代节奏

- develop 分支，没有机会上线
- bugfix 分支，需要 1 个月到 2 个半月才能迭代到线上
- release/3.1 分支，需要 15 天到 30 天才能迭代到线上
- release/3.4 分支，最近的一次上线带上

## [](#6-查看当前环境版本)6. 查看当前环境版本

**方法一：可通过查看/mdf/assets/javascripts/index.xxxx.min.js 查看框架代码版本**

![img](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/image2023-2-22_9-20-221.3c75477f.png)

**方法二：控制台输入 mdfjs.version 查看**

![img](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/image2023-12-13_14-9-24.9e9aa50c.png)