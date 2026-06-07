---
title: "进度条 Progress"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--progress"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 进度条 Progress

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--progress | 所属：YNF-组件

# [](#进度条-progress)进度条 Progress

展示任务进度。

import { Progress } from "ynf-lib-base"

## [](#何时使用)何时使用

- 需要显示任务进度时。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||设置百分比||percent||number||设置百分比||0|||
||进度条类型||type||string||进度条类型||line|||
||显示数值||showInfo||boolean||显示数值||true|||
||总步数||steps||number||总步数||0|||
||状态||status||string||状态||normal|||
||进度条缺口位置||gapPosition||string||进度条缺口位置||bottom|||
||进度条缺口角度||gapDegree||number||进度条缺口角度||0|||
||进度条线的宽度||strokeWidth||number||进度条线的宽度||5|||