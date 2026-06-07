---
title: "轮播图 Carousel"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--carousel"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 轮播图 Carousel

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--carousel | 所属：YNF-组件

# [](#轮播图-carousel)轮播图 Carousel

一组轮播的区域，可以自由切换轮播的内容。

import { Carousel } from "ynf-lib-base"

## [](#何时使用)何时使用

- 当有一组平级的内容。
- 当内容空间不足时，可以用轮播图的形式进行收纳，进行轮播展现。
- 常用于一组图片或卡片轮播。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||数据配置||dataSource||Custom||自定义轮播图内容||[{"key":1,"src":"","name":1},{"key":2,"src":"","name":2},{"key":3,"src":"","name":3},{"key":4,"src":"","name":4}]|||
||切换间隔（ms）||autoplaySpeed||number||轮播图之间切换的时间间隔（ms）||2000|||
||自动播放||autoplay||boolean||自动播放轮播图的内容||true|||
||显示面板指示点||dots||boolean||显示面板指示点||true|||
||面板指示点位置||dotPosition||'bottom', | 'top' | 'left' | 'right'||下方 | 上方 | 左侧 | 右侧||bottom|||
||动画效果||effect||'fade' | 'scrollx'||渐变 | 滚动||-|||
||显示切换箭头||showArrow||boolean||显示切换箭头||false|||
||切换时||onChange||Function()||切换时||-|||
||加载||onLoadComponent||Function()||加载||-|||