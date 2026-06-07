---
title: "网络布局 GridLayout"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/03-gridlayout"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 网络布局 GridLayout

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/03-gridlayout | 所属：移动组件

# [](#网络布局-gridlayout)网络布局 GridLayout

## [](#1-使用基础)1. 使用基础

- GridLayout的cStyle设置columns，默认是3，是将布局分成多少列。
- GridLayout下的base_item字段cStyle可以设置width，和height。表示该item占几行几列
- width，和height默认都为1，表示在网格占1行1列

<!-- -->

- 注意单个base_item的width不能超过YSGridLayout的columns

- 

排列方式从上到下从左到右紧凑排布

## [](#2-添加样式)2. 添加样式

GridLayout的cStyle，可以添加props，直接放在在外层div

eg.{"props":{"style":{"padding":12,"background":"#dd"}}}

网格padding是12，背景色#ddd