---
title: "领域配置迁移方案 R6"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/03-domain-config-migration"
section: "MDF服务"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, MDF服务]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 领域配置迁移方案 R6

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/03-domain-config-migration | 所属：MDF服务

# [](#领域配置迁移方案-r6)领域配置迁移方案 R6

**本方案只适用于R6发版后R6及以上的专属化场景**

如果你是后端不会处理，请找自领域的前端接口人或者架构师，对应邮件之前已经通知到接口人和架构师，领域接口人清单：《[MDF领域接口人登记表](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=20771722)》

## [](#1-mdf脚手架构建的工程)1. MDF脚手架构建的工程

在工程的根目录下增加一个文件夹conf，conf中维护一个文件，文件名为app.config.json，内容是当前consul里对应domainkey的内容（是全部内容，不要只复制feature，appServer和useOss等都需要！！！）

![img](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/image2024-5-7_17-4-7.c0e523dd.png)

## [](#2-非mdf脚手架构建的工程没有前端工程的domainkey)2. 非MDF脚手架构建的工程（没有前端工程的domainKey）

检查公有云consul配置中，useOSS不可为true，可以不配，如有配置错误请改正，特殊情况可私下联系杨月沟通

注：只做转发不做配置的，useOSS不配，框架会自动托管

## [](#3-一个工程下对应多个domainkey的)3. 一个工程下对应多个domainKey的

一个前端MDF工程对应多个domainkey的，conf目录下配置工程主domainkey的配置内容，框架支持配置映射关系，其他集成的domainkey会自动保持与主domainkey相同的配置和转发，由框架统一管理映射关系，此部分内容请尽快联系框架进行登记，联系人：姚磊、杨月，统一出盘后登记的不会自动同步到盘里

## [](#4-常见问题)4. 常见问题

- 如果项目**没有引入**mdf-create-app包的webpack.common的配置或者领域自己的webpack.config.json中有使用插件copy-webpack-plugin，领域需要在自己的webpack.config.json中的插件选项中(plugins)添加如下配置

const CopyWebpackPlugin = require('copy-webpack-plugin');

const config = {

 pligins: [

 new CopyWebpackPlugin([

 { from: './conf/app.config.json', to: './conf/app.config.json' }

 ])

 ]

}

- 检查项目中是否有pnpm-lock.yaml、package.lock.json等固化二三方包版本的锁文件，如mdf-create-app包版本过低可能导致无法将项目中的conf/app.config.json的目录同步到制品里

- 

mdf-create-app包版本不是“snpshot"、“release-3.1”、“release-3.4”的