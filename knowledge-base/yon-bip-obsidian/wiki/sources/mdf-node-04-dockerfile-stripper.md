---
title: "流水线去除dockerfile"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/04-dockerfile-stripper"
section: "MDF服务"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, MDF服务]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 流水线去除dockerfile

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/04-dockerfile-stripper | 所属：MDF服务

# [](#流水线去除dockerfile)流水线去除dockerfile

## [](#基本信息)基本信息

### [](#1背景)1.背景

流水线 dockerfile 黑盒，不够透明，导致使用方不了解流水线里做了什么事情，
遇到问题排查困难

### [](#2目标)2.目标

简化流水线配置，使用简单的配置将 dockerfile 里的执行脚本内置化管理，减少用户配置。便于问题定位和排查

## [](#dockerfile-功能盘点)dockerfile 功能盘点

### [](#标准版)标准版

# 统一Node(UCF)镜像缓存策略

FROM ycr.yonyoucloud.com/base/node:14-ucf AS builder

 

# 安装工具

RUN apk add git bash zip

 

# 添加资源

WORKDIR /design/

ADD ./ /design

 

# 生成静态资源

RUN ynpm i && npm run build:extend && npm run build:extend:applet

 

# 上传静态资源到OSS

RUN npx upload-oss SERVER_ENV=daily DOMAIN_KEY=exceltraincenter

 

# 输出YPR制品

# yonyoucloud-buildproduct 这个注释不能删

RUN npx upload-ypr SERVER_ENV=daily DOMAIN=iuap-metadata-import DOMAIN_KEY=exceltraincenter bash

**功能细分**

- npm run build:extend： 生成静态资源
- npm run build:extend:applet： 生成小程序静态资源
- npx upload-oss：资源上传 oss (启动命令里)
- npx upload-ypr： 资源上传 ypr
- npx sync-consul： 同步统一 node 配置
- ynpm ucf:cdn : 主要用作域名的绝对路径转成相对路径

### [](#其他命令)其他命令

- CMD npm run start： 启动 server 服务
- ENV LANGUAGE zh_CN:zh：设置容器变量
- bash build.sh：自定义执行脚本命令
- ADD ./xxx/fed /design：代码在某个目录下（前后端代码在一个 git 仓库）
- npm config set unsafe-perm true：设置镜像源

## [](#后续计划)后续计划

结合目标，与产品一起规划后续，通过计划实现目标

#### [](#️-后续结论)⛳️ 后续结论

build 阶段：

- resources
- module.xml