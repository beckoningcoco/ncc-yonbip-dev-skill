---
title: "扩展资源"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/07-load-extend"
section: "MDF服务"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, MDF服务]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 扩展资源

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/07-load-extend | 所属：MDF服务

# [](#扩展资源)扩展资源

${domain.iuap-mdf-node}/mdf/resource/loadExtend

## [](#1-接口说明)1. 接口说明

获取领域资源与配置

## [](#2-接口类型)2. 接口类型

**GET**

## [](#3-请求参数)3. 请求参数

https://<业务中台地址>/mdf-node/mdf/resource/loadExtend?domainKey=upu

## [](#4-参数说明)4. 参数说明

||参数||是否可空||说明|
||domainKey||否||领域前端编码|

## [](#5-返回结构)5. 返回结构

{

 "code": 200,

 "data": {

 "baseUrls": {

 "productcenter": "https://xxx/static/mdf/productcenter/daily_79e442178_20221214112757",

 "uscmpub": "https://xxx/static/mdf/uscmpub/daily_4a587ab_20221219221741",

 "upu": "https://xxx/static/mdf/upu/daily_ea77ebc3_20221217212127"

 },

 "domainConfigs": {

 "productcenter": {},

 "uscmpub": {},

 "upu": {}

 },

 "scriptUrls": [

 "https://xxx/static/mdf/productcenter/daily_79e442178_20221214112757/javascripts/extend.external.min.js",

 "https://xxx/static/mdf/uscmpub/daily_4a587ab_20221219221741/javascripts/extend.external.min.js",

 "https://xxx/static/mdf/upu/daily_ea77ebc3_20221217212127/javascripts/extend.min.js"

 ],

 "styleUrls": [

 "https://xxx/static/mdf/productcenter/daily_79e442178_20221214112757/stylesheets/extend.external.min.css",

 "https://xxx/static/mdf/uscmpub/daily_4a587ab_20221219221741/stylesheets/extend.external.min.css",

 "https://xxx/static/mdf/upu/daily_ea77ebc3_20221217212127/stylesheets/extend.min.css"

 ]

 }

}

## [](#6-返回参数说明)6. 返回参数说明

||参数||是否可空||说明|
||baseUrls||否||返回多个服务前端基础地址|
||upu||否||domainKey为upu的服务对应的地址|
||domainConfigs||否||返回多个服务前端配置项|
||upu||否||domainKey为upu的服务对应的配置项|
||scriptUrls||否||领域js入口地址|
||styleUrls||否||领域css入口地址|