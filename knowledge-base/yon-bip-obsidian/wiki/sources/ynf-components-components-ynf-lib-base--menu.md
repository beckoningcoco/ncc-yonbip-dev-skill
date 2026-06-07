---
title: "菜单 Menu"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--menu"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 菜单 Menu

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--menu | 所属：YNF-组件

# [](#菜单-menu)菜单 Menu

用于帮助用户快速地从一个站点跳转到另一个站点。为页面和功能提供导航的列表。

import { Menu } from "ynf-lib-base"

## [](#何时使用)何时使用

- 导航菜单是一个网站的灵魂，用户依赖导航在各个页面中进行跳转。一般分为顶部导航和侧边导航，顶部导航提供全局性的类目和功能，侧边导航提供多级结构来收纳和排列网站架构。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||组件||componentStyle||string||组件||-|||
||菜单项||dataSourceCustom||Json||配置菜单项, JSON格式, 配置项含义: key唯一标识, text显示文本, icon图标, children子菜单项, type: group分组, 默认为普通菜单项||[{"key":"组织1","key_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880509","text":"组织1","text_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880509","icon":"uf-4square-3","children":[{"key":"选项1","key_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC0488050C","text":"选项1","text_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC0488050C"},{"key":"选项2","key_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC0488050E","text":"选项2","text_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC0488050E"},{"key":"组1","key_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC0488050F","text":"组1","text_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC0488050F","type":"group","children":[{"key":"选项3","key_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880512","text":"选项3","text_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880512"},{"key":"选项4","key_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880515","text":"选项4","text_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880515"}]},{"key":"组2","key_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880519","text":"组2","text_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880519","type":"group","children":[{"key":"选项5","key_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC0488051B","text":"选项5","text_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC0488051B"},{"key":"选项6","key_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC0488051D","text":"选项6","text_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC0488051D"}]}]},{"key":"组织2","key_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880520","text":"组织2","text_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880520","icon":"uf-9square-2"},{"key":"组织3","key_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880523","text":"组织3","text_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880523","icon":"uf-navmenu","children":[{"key":"选项7","key_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880527","text":"选项7","text_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880527"},{"key":"选项8","key_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880529","text":"选项8","text_resid":"UID:P_LIB-WEB-YNF-FE_1BEB30FC04880529"}]}]|||
||菜单布局||mode||string||设置菜单布局样式||horizontal|||
||主题颜色||theme||string||设置菜单的主题颜色||light|||
||默认展开全部||expandAll||boolean||开启后, 默认展开所有子菜单项||false|||
||支持多选||multiple||boolean||开启后, 菜单项支持多选||false|||
||是否缩起||inlineCollapsed||boolean||开启后, 主菜单项缩起只展示缩略图, 只有在菜单布局为内嵌模式时生效||false|||
||被选中时调用||onSelect||||被选中时调用||-|||
||取消选中时调用，仅在 multiple 生效||onDeselect||||取消选中时调用，仅在 multiple 生效||-|||
||SubMenu 展开/关闭的回调||onOpenChange||||SubMenu 展开/关闭的回调||-|||
||键盘操作回调函数||onKeyDown||||键盘操作回调函数||-|||
||点击子菜单标题||onTitleClick||||点击子菜单标题||-|||