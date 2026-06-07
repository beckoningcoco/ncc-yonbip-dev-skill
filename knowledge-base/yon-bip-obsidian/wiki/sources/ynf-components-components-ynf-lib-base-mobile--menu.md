---
title: "菜单 Menu"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base-mobile--menu"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 菜单 Menu

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base-mobile--menu | 所属：YNF-组件

# [](#菜单-menu)菜单 Menu

填写组件描述

import { Menu } from "ynf-lib-base-mobile"

## [](#何时使用)何时使用

填写使用场景

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||样式||style||string||样式||-|||
||标签||tagStyle||string||标签||-|||
||图标||iconStyle||string||图标||-|||
||菜单项||dataSourceCustom||object||菜单项||[{"text":"组织一","text_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC048800B1","key":"organization one","children":[{"key":"option one","text":"选项一","text_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC048800B3"},{"key":"option two","text":"选项二","text_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC048800B5"},{"key":"option three","text":"选项三","text_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC048800B7"}]},{"text":"组织二","text_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC048800B9","key":"organization two","children":[{"key":"option four","text":"选项四","text_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC048800BB"},{"key":"option five","text":"选项五","text_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC048800BD"},{"key":"option six","text":"选项六","text_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC048800BE"}]}]|||
||显示模式||showMode||Select||显示模式||menu|||
||展开方向||direction||Select||展开方向||bottom|||
||是否多选||multiple||boolean||是否多选||false|||
||显示遮罩层||showPopup||boolean||显示遮罩层||true|||
||点击遮罩层是否自动隐藏||afterClickAutoHidden||boolean||点击遮罩层是否自动隐藏||true|||
||显示展开图标||showIcon||boolean||显示展开图标||true|||
||展开图标的位置||iconPosition||string||展开图标的位置||right|||
||点击菜单项||onMenuClick||||点击菜单项||-|||
||被选中时||onConfirm||||被选中时||-|||
||关闭时||onClose||||关闭时||-|||