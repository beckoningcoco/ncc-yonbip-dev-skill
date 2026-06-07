---
title: "多列表页面配置"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/06-duoliebiaoyemianpeizhi"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 多列表页面配置

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/06-duoliebiaoyemianpeizhi | 所属：移动组件

# [](#多列表页面配置)多列表页面配置

## [](#1-设计图)1. 设计图

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/duoliebiaoyemianpeizhiimage1.cacf03af.png)

## [](#2-如何配置)2. 如何配置

TabPage+ group组件，TabPage
组件下配置多个group，每个group代表一个页签，cStyle中{"billnum":"pu_sendorderlist"}指明此页签是哪个单据。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/duoliebiaoyemianpeizhiimage2.ef6dab7f.png)

## [](#3-配置页签图标)3. 配置页签图标

在excel里对应group的cImage属性中配置

- 

**方式1：**配置anasn|anasnfocus，可以指定非激活态（anasn）和激活态（anasnfocus）的图标，2个图标可以相同

- 

**方式2：**配置anasn，anasn是非激活态图标，激活态图标默认加focus，如：anasnfocus

注意：不带颜色（灰色，没有full填充）的图标自动根据激活态和非激活态切换颜色，带颜色的图标无法自动切换

目前支持的图标：[《图标库》](https://at.alicdn.com/t/project/628910/58a493c1-e13c-478e-8be9-e4b74588b7dc.html?spm=a313x.7781069.1998910419.58)