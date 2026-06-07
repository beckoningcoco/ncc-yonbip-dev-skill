---
title: "小程序资源"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/07-applet-resource"
section: "MDF服务"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, MDF服务]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 小程序资源

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/07-applet-resource | 所属：MDF服务

# [](#小程序资源)小程序资源

${domain.iuap-mdf-node}/mdf/getAppletResource

**示例：**

资源包：/mdf/getAppletResource?resourceCode=exceltraincenter

应用包：/mdf/getAppletResource?resourceCode=exceltraincenter_0_bd_exceltrainloglist

## [](#1-接口说明)1. 接口说明

根据资源包编码获取资源包信息。

## [](#2-接口类型)2. 接口类型

**GET**

## [](#3-请求参数)3. 请求参数

?resourceCode=exceltraincenter

## [](#4-参数说明)4. 参数说明

||参数||是否可空||说明|
||resourceCode||否||资源包编码：
1、资源包-为领域的domainKey
2、应用包-为领域的domainKey + *0* + 单据编码billno|

## [](#5-返回结构)5. 返回结构

// 资源包

{

 "id": "daily_a5b2518_20220520183141",

 "resourceid": "exceltraincenter",

 "version": "1.0.0",

 "zipdetailurl": "https://***/static/mdf/exceltraincenter/test_a5b2518_20220520200623/applets/exceltraincenter.zip",

 "zipPath": "exceltraincenter/1.0.0"

}

 

// 应用包

{

 "id": "daily_a5b2518_20220520183141",

 "resourceid": "exceltraincenter_0_bd_exceltrainloglist",

 "version": "DEFAULT_VERSION",

 "zipdetailurl": "https://***/static/mdf/exceltraincenter/test_a5b2518_20220520200623/applets/exceltraincenter_0_bd_exceltrainloglist.zip",

 "zipPath": ""

}

## [](#6-返回参数说明)6. 返回参数说明

||参数||是否可空||说明|
||id||否||资源包记录标识|
||resourceid||否||资源包编码： 1、资源包-为领域的domainKey 2、应用包-为领域的domainKey + *0* + 单据编码billno|
||version||否||版本： 1、资源包-【app.applet.json】中维护的版本，默认 1.0.0； 2、应用包- 固定值 DEFAULT_VERSION|
||zipdetailurl||否||资源包下载地址|
||zipPath||是||解压路径： 1、资源包- 为领域的domainKey 2、应用包-【填空】|