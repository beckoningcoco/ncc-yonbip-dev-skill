---
title: "Consul配置自动同步排查"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/04-auto-consul"
section: "MDF服务"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, MDF服务]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# Consul配置自动同步排查

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/04-auto-consul | 所属：MDF服务

# [](#consul配置自动同步排查)Consul配置自动同步排查

## [](#1-检查是否生效)1. **检查是否生效**

将预发环境构建产物下载后解压，看一下是否有 conf/app.config.json 文件

- 如果有则是正确的
- 如果没有按以下常见问题进行排查（排查不出原因可以联系周磊帮助）

## [](#2-常见问题排查)2. 常见问题排查

**1、检查 MDF 前端脚手架是否升级到 4.1**

检查脚手架 package.json 是否依赖 3.1 版本的@mdf/create-app，如果没有依赖，参考文档：

[MDF 4.1 脚手架升级指南](#/introduce/03-mdf-cli41-upgrade)
，升级即可。

**2、检查 dockerfile 文件内 node 版本是否是 14**

如果 node 版本是 14 以下，改成 14 即可

![img](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/image2023-7-4_15-46-17.ccd843d4.png)

**3、检查预发环境 dockerfile 文件内上传 oss 地址是否更新**

检查预发的 uploadoss.sh 地址必须是下图的 url，如果不是按此地址修改
(其中 DOMAIN_KEY 替换为领域自己的， SERVER_ENV 为当前环境)

![img](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/image2023-7-4_15-33-46.6c7d8535.png)

**4、是否将 uploadoss.sh 放到启动命令中了**

如果将上传 oss 的命令放到启动命令中了，需要在上传 ypr 的命令脚本中添加 SERVERE_ENV 环境变量,
值为当前环境

![img](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/image2023-7-4_15-37-53.f7c17dcf.png)

// 示例

RUN npx upload-ypr SERVER_ENV=test DOMAIN=xxxx DOMAIN_KEY=xxxxx bash

## [](#3-检查前端项目的-packjsonlockjson-是否删掉如果不删除或者走缓存会导致-creat-app-包不更新)3. 检查前端项目的 packjson.lock.json 是否删掉（如果不删除，或者走缓存，会导致 creat-app 包不更新）