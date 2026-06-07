---
title: "宫格 Grid"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base-mobile--grid"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 宫格 Grid

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base-mobile--grid | 所属：YNF-组件

# [](#宫格-grid)宫格 Grid

宫格组件, 展示多个按钮, 跳转到指定页面。可以配置按钮名称、图标、跳转地址

import { Grid } from "ynf-lib-base-mobile"

## [](#何时使用)何时使用

- 当需要使用较强功能入口时使用

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||组件样式||GridStyle||string||宫格组件相关样式设置||-|||
||标题样式||titleStyle||string||宫格组件标题相关样式设置||-|||
||内容样式||innerStyle||string||宫格组件内容相关样式设置||-|||
||数据配置||dataSourceUserDefine||Custom||宫格组件展示内容配置||[{"icon":"arcperson","text":"菜单一","text_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC048806B6","number":100,"key":1},{"icon":"arcemail","text":"菜单二","text_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC048806BA","number":18,"key":2},{"icon":"arcminimize","text":"菜单三","text_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC048806BE","number":10,"key":3},{"icon":"arcmessage-square","text":"菜单四","text_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC048806C1","number":88,"key":4}]|||
||显示标题||showCaption||boolean||是否展示组件标题||true|||
||显示更多||showMore||boolean||是否显示更多按钮, 用于跳转页面展示更多内容数据||true|||
||宫格标题||gridCaption||string||配置宫格标题名称||标题|||
||图文布局||itemDirection||string||组件内容图文布局方式||上下布局|||
||显示徽标||showBadge||boolean||组件内容右上角是否徽标, 可用于特殊提示||false|||
||徽标样式||badgeStyle||string||徽标显示类型。number:数字、text:文字、dot:红点||dot|||
||徽标文字||badgeText||string||配合徽标类型为文字时使用, 配置文字内容||新|||
||徽标最大值||badgeMaxNumber||number||配合徽标类型为数字时使用, 配置最大值||99|||
||列数||columns||number||组件内容显示列数||4|||
||分页显示||showPage||boolean||组件是否分页显示。超过一定数量, 分页展示数据||false|||
||分页行数||lines||number||组件分页显示时, 每页显示行数||2|||
||值改变回调||onSelect||Function()||点击组件内按钮回调事件, 返回所有内容配置|||||