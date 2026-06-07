---
title: "协同附件服务"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/19-xietongfujianfuwu"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 4
---

# 协同附件服务

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/19-xietongfujianfuwu | 所属：指南

# [](#协同附件服务)协同附件服务

### [](#1-服务说明)1. 服务说明

MDD框架中部分附件组件使用的是协同提供的服务，比如上传、下载、删除、预览等，部分附件组件同事使用协同提供的组件和服务。

### [](#2-mdf加载协同资源)2. MDF加载协同资源

#### [](#21-服务端地址说明)2.1. 服务端地址说明

部分MDF组件只使用协同服务，通过window.__MDF_FILEURL__获取服务地址，然后拼接正确接口路径，主要用到下面接口

举例 window.**MDF_FILEURL** = https://<工作台域名>/iuap-apcom-file

id通常是前端自己生成的uuid

appCode的取值规则是 appCode = yya.getEnv('appCode') || 'mdf';
其中env中的appCode可以在consul里配置

list: `${window.__MDF_FILEURL__}/rest/v1/file/${appCode}/${id}/files`, // 查询文件列表

upload: `${window.__MDF_FILEURL__}/rest/v1/file/${appCode}/${id}/`, // 上传文件

delete: `${window.__MDF_FILEURL__}/rest/v1/file/${id}`, // 删除文件

info: `${window.__MDF_FILEURL__}/rest/v1/file/${id}/info/`, // 文件信息

batchDelete: `${window.__MDF_FILEURL__}/rest/v1/file/delete`, // 批处理

batchDownload: `${window.__MDF_FILEURL__}/rest/v1/file/list/zip/stream`, // 批量下载

#### [](#22-服务端地址window__mdf_fileurl__配置)2.2. 服务端地址window.__MDF_FILEURL__配置

- /src/common/config.env.js 文件

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/xietongfujianfuwu_image1.954625d9.png)

- node处理window.__MDF_FILEURL__逻辑如下：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/xietongfujianfuwu_image2.7b506819.png)

### [](#3-协同资源简单使用示例)3. 协同资源简单使用示例

在工作台打开或者node渲染时都会先去加载上述协同的资源文件，加载完成后资源文件会在window上上挂载所有操作组件和渲染组件的方法window.YYCooperationBridge

- 渲染附件组件方法 window.YYCooperationBridge.YYRenderFile
- 渲染协同套件方法 window.YYCooperationBridge.YYRenderCooperation
- 渲染评论组件方法 window.YYCooperationBridge.YYRenderComment
- 下面为前端调用附件组件举例

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/xietongfujianfuwu_image3.5b56be69.png)

渲染后结果

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/xietongfujianfuwu_image4.4a1d495b.png)