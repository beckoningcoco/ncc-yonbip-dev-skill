---
title: "TinperNext升级及去除vendor依赖技术实现方案"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/03-tinper-next-remove-vendor"
section: "介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 介绍]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# TinperNext升级及去除vendor依赖技术实现方案

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/03-tinper-next-remove-vendor | 所属：介绍

# [](#tinpernext升级及去除vendor依赖技术实现方案)TinperNext升级及去除vendor依赖技术实现方案

## [](#1将yonuiys换成tinpernext)1、将YonuiYs换成TinperNext

const { Form, Button, Card } = window.YonuiYs;

// 换成

const { Form, Button, Card } = window.TinperNext;

## [](#2取消dllreferenceplugin分包方式)2、取消DllReferencePlugin分包方式

### [](#1删除webpackconfigjs里面下图两块代码)1、删除webpack.config.js里面下图两块代码

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/TinperNextshengjijiquchuvendoryilaijishufanganshixian_image1.c1df556c.png)

### [](#2删除staticscriptsmanifestdevelopmentjson和staticscriptsmanifestproductionjson)2、删除static/scripts/manifest.development.json和static/scripts/manifest.production.json

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/TinperNextshengjijiquchuvendoryilaijishufanganshixian_image2.59ec2046.png)

## [](#3排除常用三方包)3、排除常用三方包

externals: ["meta-touch", {

 'react': 'React',

 'react-dom': 'ReactDOM',

 '@tinper/next-ui': 'TinperNext'

}].concat(

 process.env.BUILD_TYPE ? [] : ["role", "authority"]

)

## [](#4现在最新mdf脚手架地址)4、现在最新MDF脚手架地址

[http://xxx/yonyou-mdf/mdf-server-app](http://git.yyrd.com/yonyou-mdf/mdf-server-app)