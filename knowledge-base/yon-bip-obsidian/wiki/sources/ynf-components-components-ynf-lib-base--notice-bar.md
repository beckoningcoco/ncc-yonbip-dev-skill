---
title: "公告栏 NoticeBar"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--notice-bar"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 公告栏 NoticeBar

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--notice-bar | 所属：YNF-组件

# [](#公告栏-noticebar)公告栏 NoticeBar

信息展示窗口，传递重要通知与动态。

import { NoticeBar } from "ynf-lib-base"

## [](#何时使用)何时使用

- 用于发布重要通知，实时信息展示场景。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||数据配置||dataSource||Custom||自定义公告栏内容。||-|||
||切换方向||direction||string||切换方向||vertical|||
||切换间隔(ms)||autoplayInterval||number||切换间隔(ms)||3000|||
||滚动速度||speed||number||滚动速度||500|||
||显示图标||showIcon||boolean||显示图标||true|||
||显示关闭图标||closeIcon||boolean||显示关闭图标||true|||
||点击公告回调||onSelect||Function(data, dataSource)||点击公告栏时的事件。||-|||