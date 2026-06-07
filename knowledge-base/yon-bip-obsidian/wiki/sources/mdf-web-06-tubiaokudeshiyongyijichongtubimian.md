---
title: "图标库的使用以及冲突避免"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/06-tubiaokudeshiyongyijichongtubimian"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 图标库的使用以及冲突避免

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/06-tubiaokudeshiyongyijichongtubimian | 所属：Web组件

# [](#图标库的使用以及冲突避免)图标库的使用以及冲突避免

[iconfont.cn](http://iconfont.cn)上传图标，即可以使用线上的，也可以下载到本地使用（以下使用方法）

## [](#1-字体图标使用)1. 字体图标使用

### [](#11-字体文件下载到本地在项目中引入iconfontless)1.1 字体文件下载到本地，在项目中引入iconfont.less

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/tubiaokudeshiyongyijichongtubimian_image1.3728e369.png)

### [](#12-mdf中使用)1.2 MDF中使用

`<Icon type='XXX' >` xxx为fontclass

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/tubiaokudeshiyongyijichongtubimian_image2.eae27fcf.png)

## [](#2-svg图标使用)2. svg图标使用

### [](#21-字体文件下载到本地在项目中引入iconfontjs同上)2.1. 字体文件下载到本地，在项目中引入iconfont.js，同上

### [](#22-mdf中使用-svgicon-typexxx-)2.2. MDF中使用: `<svgIcon type='XXX' />`

## [](#3-避免图标冲突)3. 避免图标冲突

项目中加载多个图标库时，使用自定义名称显示，可以避免冲突

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/tubiaokudeshiyongyijichongtubimian_image3.3d287f19.png)