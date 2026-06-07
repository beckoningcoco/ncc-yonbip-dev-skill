---
title: "高德地图密钥配置"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/25-gaodeditumiyaopeizhi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 高德地图密钥配置

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/25-gaodeditumiyaopeizhi | 所属：指南

# [](#高德地图密钥配置)高德地图密钥配置

## [](#1-背景)1. 背景

高德地图在使用前需要在高德开发平台注册使用的key，然后拿着这个key才可以完成相应的接口调用功能。目前出盘默认带的Key是免费版本（调用次数限制100次/天），请求量大了以后高德那边报日访问量过大，请求就会被拒绝。

## [](#2-解决办法)2. 解决办法

### [](#21-获取key)2.1. 获取Key

在高德官网申请Key，客户可根据自己的情况申请个人版、企业版或付费版，收费和调用限制详见高德网站

高德地址：[https://console.amap.com/dev/key/app](https://console.amap.com/dev/key/app) ，获取以下Key后在配置文件中配置，专属化配置和领域配置二选一即可，领域配置只有对应的单个服务生效

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gaodeditumiyaopeizhi_image1.ef787f41.png)

### [](#22-专属化配置)2.2. 专属化配置

在项目级公共配置文件中修改全局变量  AMAPKEY  和  AMAPSECRETKEY

详见：[《项目级配置文件（R5）》](#/node/03-config-file)

### [](#23-领域配置公有云)2.3. 领域配置（公有云）

领域可以在consul中配置自己的key，对应下面的位置

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gaodeditumiyaopeizhi_image2.dedae5fe.png)