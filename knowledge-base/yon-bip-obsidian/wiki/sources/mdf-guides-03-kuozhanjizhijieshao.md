---
title: "扩展机制介绍"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/03-kuozhanjizhijieshao"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 扩展机制介绍

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/03-kuozhanjizhijieshao | 所属：指南

# [](#扩展机制介绍)扩展机制介绍

## [](#1-扩展方式)1. 扩展方式

||扩展分类||扩展方式||扩展场景|
||领域逻辑扩展||单据扩展|||
||查询区扩展||通过扩展实现参照联动|||
||参照扩展|||||
||事件|||||
||viewmodel扩展|||||
||UI组件扩展||基础组件|||
||容器组件|||||
||弹窗组件|||||
||页面Action扩展||页面Action扩展|||
||样式扩展||样式扩展|||
||Redux Reducer扩展||Redux Reducer扩展|||
||React Router扩展||React Router扩展|||
||高级扩展||租户级扩展|||
||组件属性扩展|||||
||FreeView扩展|||||
||模型扩展|||||
||模板类型扩展|||||

## [](#2-目录与扩展对照)2. 目录与扩展对照

||目录名称||路径||作用|
||business||src/business||扩展脚本的容身之地，存放当前领域的业务扩展js|
||components||src/components||扩展组件(自定义组件/自定义页面/自定义门户)等文件存放处|
||basic||src/components/basic||基础扩展组件的文件存放位置，对应UI元数据中的controls--即UI模板中的billitem_base|
||formatter||src/components/formatter||表格自定义列的文件存放位置，对应表格实体下的billitem|
||home||src/components/home||自定义页面的文件存放位置|
||meta||src/components/meta||自定义容器组件的文件存放位置，对应UI元数据中的containers--即UI模板中的billtplgroup_base|
||modal||src/components/modal||自定义弹窗的文件存放位置|
||popover||src/components/popover||自定义popover的文件存放位置|
||portal||src/components/portal||自定义门户的文件存放位置|
||toolbar||src/components/toolbar||自定义工具栏的文件存放位置，对应UI模板中的bill_toolbar|
||styles||src/styles||扩展样式文件的导出目录|
||extend.less||src/styles/extend.less||扩展样式代码的写入文件，注意文件最外层需要使用领域的domainKey作为隔离层，避免样式影响全局|