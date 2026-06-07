---
title: "通用选择器 ListPanelPicker"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/01-listpanelpicker"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 通用选择器 ListPanelPicker

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/01-listpanelpicker | 所属：移动组件

# [](#通用选择器-listpanelpicker)通用选择器 ListPanelPicker

## [](#1-效果展示)1. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Listpanelpicker-image1.376772c8.png)

## [](#2-扩展属性-cextprops)2. 扩展属性 cExtProps

页面view下新增cControlType为ListPanelPicker的基础组件（非容器组件）
在cExtProps中配置增加data配置 格式如下

"data": "[{"key":"1","text":"修改所有日程"},{"key":"2","text":"修改将来所有日程"},{"key":"3","text":"删除日程","delete":true}]"

## [](#3-使用方式)3. 使用方式

- 列表页(没有模型 通过viewmodel进行控制)

// 显示隐藏

viewModel.execute('updateViewMeta', { code: cItemName || cGroupCode, visible })

// 监听按钮点击事件

viewModel.on(cItemName + '_onSelect', (args) => {// 点击时候的逻辑})

- 卡片页（一般卡片页有模型）

// 显示隐藏

viewModel.get(cItemName).setVisible(bool)

// 监听按钮点击事件

viewModel.get(cItemName).on('select', (args) => {// 点击时候的逻辑})

 

也可以使用列表页的viewmodel的方式进行控制

**开箱即用，无需特殊配置。**

**配置controlType为timezoneselector即可。**