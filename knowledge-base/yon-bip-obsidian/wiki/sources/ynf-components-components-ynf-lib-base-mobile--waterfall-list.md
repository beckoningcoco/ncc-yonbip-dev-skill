---
title: "瀑布流列表 WaterfallList"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base-mobile--waterfall-list"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 瀑布流列表 WaterfallList

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base-mobile--waterfall-list | 所属：YNF-组件

# [](#瀑布流列表-waterfalllist)瀑布流列表 WaterfallList

填写组件描述

import { WaterfallList } from "ynf-lib-base-mobile"

## [](#何时使用)何时使用

填写使用场景

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||样式设置||cStyle||Style||样式设置||-|||
||无数据时提示文字||noDataText||string||无数据时提示文字||-|||
||无数据时提示图片||noDataImage||string||无数据时提示图片||no-data-easy|||
||显示底部区域||showFooter||boolean||显示底部区域||true|||
||加载更多的方式||status||number||加载更多的方式||-1|||
||滚动方向||scrollDirection||boolean||滚动方向||column|||
||展示列数||columnCount||string||纵向滚动时的列数, 设置为auto时根据子元素宽度自适应||1|||
||分页方式||pageMode||boolean||分页方式||end|||
||展示行数||rowCount||string||横向滚动时的行数, 设置为auto时根据子元素高度自适应||1|||
||行间距(px)||rowGap||number||行间距(px)||5|||
||列间距(px)||columnGap||number||列间距(px)||5|||
||禁用下拉||disabledPull||boolean||禁用下拉||false|||
||加载更多||onReachBottom||||加载更多||-|||