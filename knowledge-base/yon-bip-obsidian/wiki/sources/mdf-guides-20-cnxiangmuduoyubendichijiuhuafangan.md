---
title: "CN项目多语本地持久化方案"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/20-cnxiangmuduoyubendichijiuhuafangan"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 4
---

# CN项目多语本地持久化方案

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/20-cnxiangmuduoyubendichijiuhuafangan | 所属：指南

# [](#cn项目多语本地持久化方案)CN项目多语本地持久化方案

## [](#1-测试环境中在控制台console中执行)1. 测试环境中在控制台（console）中执行

lang.jsonpUuid(0, groupCode, '/iuap-apcom-i18n', undefined, undefined, false) // 此处groupCode为提前获取的隔离资源code

## [](#2-切换到网络network下会看到如下图所示选取自己需要持久化的langjs)2. 切换到网络（network）下会看到如下图所示，选取自己需要持久化的lang.js

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/cnxiangmuduoyubendichijiuhuafangan_image1.ba6a9dc3.png)

## [](#3-在预览中将下图data-右键复制object)3. 在预览中将下图data->右键复制object

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/cnxiangmuduoyubendichijiuhuafangan_image2.60684b37.png)

## [](#4-粘贴至任意编辑器并调整为语种--uuid-词条内容-此处示例使用vscode)4. 粘贴至任意编辑器并调整为'语种': { 'UUID': '词条内容' }，此处示例使用vscode

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/cnxiangmuduoyubendichijiuhuafangan_image3.debe3e43.png)

## [](#5-切换不同语种重复1-4步操作汇总为一个object如下图所示)5. 切换不同语种，重复1-4步操作，汇总为一个object，如下图所示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/cnxiangmuduoyubendichijiuhuafangan_image4.53f04ce9.png)

## [](#6-使用ac-lang-cn进行本地持久化至此一次更新完成当多语词条新增时重复1-5步覆盖defaultvalue即可)6. 使用ac-lang-cn进行本地持久化,至此一次更新完成。当多语词条新增时，重复1-5步覆盖defaultValue即可。

三种导入方式：data是上图示例的数据， locale是当前语种信息

- lang.init(data, locale) 初始化的时候传入
- lang.setLanguage(data, locale) 回调事件后可传入
- lang.setPack(data[locale]) 回调事件后可传入