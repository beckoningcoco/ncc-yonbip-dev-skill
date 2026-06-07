---
title: "表格标题、小计合计扩展实例"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/04-biaogebiaotixiaojihejikuozhanshili"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 表格标题、小计合计扩展实例

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/04-biaogebiaotixiaojihejikuozhanshili | 所属：指南

# [](#表格标题小计合计扩展实例)表格标题、小计合计扩展实例

此扩展依赖formatter扩展，formatter扩展文档参考：《[格式化表格列formatter](#/guides/04-geshihuabiaogelieformatter)》

## [](#1-表格列标题扩展)1. 表格列标题扩展

// 参考列扩展

gridModel.setColumnState('xxx', 'formatterheader', (column) => {

 return {

 formatterKey: '', // 扩展的formatter组件

 props: {

 column

 }

 }

})

## [](#2-表格小计合计扩展)2. 表格小计合计扩展

// 参考列扩展

// 小计

gridModel.setColumnState('xxx', 'formattersubtotal', (cellProps) => {

 return {

 formatterKey: '', // 扩展的formatter组件

 props: {

 cellProps

 }

 }

})

// 合计

gridModel.setColumnState('xxx', 'formatteraggregates', (cellProps) => {

 return {

 formatterKey: '', // 扩展的formatter组件

 props: {

 cellProps

 }

 }

})

## [](#3-表格父标题扩展)3. 表格父标题扩展

gridModel.setColumnState('xxx', 'formatterparent', (cellProps) => {

 return {

 formatterKey: '', // 扩展的formatter组件

 props: {

 cellProps

 }

 }

})

## [](#4-表格小计按父标题分组扩展)4. 表格小计按父标题分组扩展

和扩展小计扩展相同，另外再加一个配置

gridModel.setColumnState('xxx', 'formattergroup',true)