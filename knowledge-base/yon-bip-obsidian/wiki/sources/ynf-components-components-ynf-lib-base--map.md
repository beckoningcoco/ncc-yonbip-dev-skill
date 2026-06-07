---
title: "定位 Map"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--map"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 定位 Map

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--map | 所属：YNF-组件

# [](#定位-map)定位 Map

用于地图定位, 选择地点或经纬度。

import { Map } from "ynf-lib-base"

## [](#何时使用)何时使用

- 地点选择: 用户需要选择某个地点并将其地址或坐标填写到表单中，如注册地址、送货地址等;
- 用户交互: 提供直观的地图界面以增强用户体验，方便用户准确选择位置。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||文本框样式||cStyle||Style||文本框样式||-|||
||展示内容||showType||string||设置位置信息的展示形式||address|||
||高德key||amapKey||string||高德地图key，用于调用高德地图API||-|||
||高德Secret||amapSecret||string||高德地图Secret，用于调用高德地图API||-|||
||显示地址搜索框||searchAddress||boolean||开启后, 地图弹窗中显示地址搜索框||true|||
||标记是否可拖动||markDrag||boolean||开启后, 地图定位指针可以拖动||true|||