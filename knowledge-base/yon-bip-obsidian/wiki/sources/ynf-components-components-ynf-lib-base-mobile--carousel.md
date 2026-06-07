---
title: "轮播图 Carousel"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base-mobile--carousel"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 轮播图 Carousel

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base-mobile--carousel | 所属：YNF-组件

# [](#轮播图-carousel)轮播图 Carousel

填写组件描述

import { Carousel } from "ynf-lib-base-mobile"

## [](#何时使用)何时使用

填写使用场景

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||组件||carouselStyle||string||组件||-|||
||数据配置||dataSource||Custom||数据配置||[{"key":1,"src":"","name":1},{"key":2,"src":"","name":2},{"key":3,"src":"","name":3},{"key":4,"src":"","name":4}]|||
||自动切换间隔(ms)||speed||number||自动切换间隔(ms)||2000|||
||默认轮播项（索引）||selectedIndex||number||默认轮播项（索引）||0|||
||自动播放||autoplay||boolean||自动播放||true|||
||循环播放||infinite||boolean||循环播放||true|||
||手势切换||slither||boolean||手势切换||true|||
||切换方向||direction||string||切换方向||horizontal|||
||切换时||onChange||||切换时||-|||
||加载||onLoadComponent||||加载||-|||