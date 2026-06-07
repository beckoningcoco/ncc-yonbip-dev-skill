---
title: "下拉按钮 Dropdown"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--dropdown"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 下拉按钮 Dropdown

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--dropdown | 所属：YNF-组件

# [](#下拉按钮-dropdown)下拉按钮 Dropdown

以条形菜单栏和菜单栏中每个菜单项的弹出菜单窗口两部分组成，一般作为应用系统的主菜单使用。

import { Dropdown } from "ynf-lib-base"

## [](#何时使用)何时使用

- 当页面上的操作命令过多时，用此组件可以收纳操作元素。
- 点击或移入触点，会出现一个下拉菜单。可在列表中进行选择，并执行相应的命令

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||按钮类型||btnType||string||设置主按钮的填充类型||default|||
||主图标按钮||icon||IframeModal||设置主按钮的图标, 只有按钮类型为图标文字按钮时生效|||||
||触发方式||trigger||string||设置触发下拉弹窗展示的方式||hover|||
||展开方向||placement||string||设置下拉弹窗的弹出方向||bottomLeft|||
||按钮设置||children||Custom||配置下拉弹窗中的子按钮||-|||
||下拉按钮||cStyle||object||下拉按钮||-|||
||点击主按钮事件||onClickPrimary||||点击主按钮事件||-|||