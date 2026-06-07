---
title: "图片 Image"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--image"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 图片 Image

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--image | 所属：YNF-组件

# [](#图片-image)图片 Image

用于在页面上对图片的展示或者查看。

import { Image } from "ynf-lib-base"

## [](#何时使用)何时使用

- 展示图片：当你需要在应用中展示静态或动态的图片;
- 查看大图功能：当用户点击图片时希望展示更大版本或详细视图时。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||图片样式||cStyle||Style||图片样式||-|||
||图片来源||sourceType||string||设置图片来源方式||modelPath|||
||图片资源地址||imgUrl||string||设置要展示的图片地址, 只有在图片来源为图片资源地址时生效|||||
||上传图片||upload||IframeModal||上传要展示的图片, 只有在图片来源为上传图片时生效|||||
||布局模式||fit||string||设置图片填充容器的方式||fill|||
||缩略图点击放大||thumbnailZoom||boolean||开启后, 点击图片可查看大图||true|||
||图片可旋转||rotatable||boolean||开启后, 在图片查看器中支持图片旋转, 只有开启缩略图点击放大时生效||true|||
||图片可缩放||zoomable||boolean||开启后, 在图片查看器中支持图片缩放, 只有开启缩略图点击放大时生效||true|||
||最小缩放比例||minZoomRatio||number||设置最小缩放比例, 只有开启缩略图点击放大时生效||0.01|||
||最大缩放比例||maxZoomRatio||number||设置最大缩放比例, 只有开启缩略图点击放大时生效||100|||
||图片加载失败||onError||||图片加载失败时的回调函数||-|||