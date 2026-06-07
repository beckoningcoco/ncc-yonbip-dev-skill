---
title: "页签 Tabs"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--tabs"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 页签 Tabs

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--tabs | 所属：YNF-组件

# [](#页签-tabs)页签 Tabs

用于分隔内容上有关联但属于不同类别的数据集合。

import { Tabs } from "ynf-lib-base"

## [](#何时使用)何时使用

- 提供平级的区域将大块内容进行收纳和展现，保持界面整洁。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||默认页签||initialActiveKey||string||如果defaultActiveKey没有设置的时候, 当初始化的时候设置当前激活的tabPanel的key||-|||
||当前页签||defaultActiveKey||string||设置当前激活的tabPanel的key||-|||
||页签样式||tabType||string||设置页签的显示样式||line|||
||页签位置||tabPosition||string||设置页签导航区的位置||top|||
||页签数量过多时||moreType||Radio||当页签比较多超出容器时, Tabs的展示形式, moreTabsSelect下拉框展示更多页签, moreTabsArrow箭头横向滚动查看更多页签||moreTabsArrow|||
||页签点击||onTabClick||||点击页签的回调方法||-|||