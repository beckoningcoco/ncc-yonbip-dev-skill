---
title: "侧滑容器 TableEditRowModal"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-tableeditrowmodal"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 侧滑容器 TableEditRowModal

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-tableeditrowmodal | 所属：Web组件

# [](#侧滑容器-tableeditrowmodal)侧滑容器 TableEditRowModal

## [](#1-功能说明)1. 功能说明

表格上点击新增或者编辑，侧滑弹出可编辑的卡片，方便用户输入。侧滑弹窗内可自定义字段排版结构。如果配置了侧滑，表格单元格应配置不可编辑，侧滑内字段按照需求配置是否可编辑。

侧滑内字段值的修改会同步到表格中，点蒙层关闭，关闭按钮关闭，取消按钮关闭会直接关闭侧滑弹窗，不会校验。点确定按钮，会先校验通过后再关闭。

表格侧滑容器有两种方式，

1、自定义侧滑内容，可对字段进行分组，模板需要单独配置容器

2、默认平铺表格列到侧滑卡片上，模板无需单独配置容器

## [](#2-效果展示)2. 效果展示

默认标题格式：表格cName + '_' +
序号，右上角自带放大和关闭按钮，自带取消和确定按钮

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/TableEditRowModalcehuarongqiimage1.a3b8a64f.jpg)

## [](#3-配置ui)3. 配置UI

### [](#31-tableeditrowmodal)3.1. tableeditrowmodal

配置类型为tableeditrowmodal容器，parent为当前表格，用来显示侧滑弹窗。

||属性名称||值类型||属性说明|
||cControlType||string||tableeditrowmodal|

### [](#32-tableeditrow)3.2. tableeditrow

配置类型为tableeditrow容器，parent为tableeditrowmodal，用来显示侧滑弹窗中间内容。

||属性名称||值类型||属性说明|
||cControlType||string||tableeditrow|

### [](#33-toolbar)3.3. toolbar

配置类型为toolbar容器，parent为tableeditrowmodal，用来显示侧滑弹窗顶部操作栏，可自定义按钮。**可不配。**

### [](#34-侧滑容器中的字段)3.4. 侧滑容器中的字段

字段需要单独再配置一套，配置到tableeditrow内，字段属性默认跟表格保持一致即可。

## [](#4-不配置ui)4. 不配置UI

如配置了如上的 tableeditrowmodal 容器，则以以上配置展示。

如不配置UI, 可通过配置特性开关启用侧滑功能。单据配置禁用侧滑功能。

领域级配置： 开启特性开关 **supportTableEditRowDrawer。**

领域开启侧滑但某一个单据需要禁用：表格 (table) 的 cStyle 配置
**{disableTableEditRowDrawer: true}**

不配置ui时，侧滑字段和侧滑的行按钮都是同步表格的数据

## [](#5-拓展属性cstyle)5. 拓展属性（cStyle）

配置了 ui 时 cStyle 为 tableeditrowmodal 的，不配置 ui 时 cStyle 为
table 的。

||属性名称||值类型||属性说明|
||titleGroupCode||string||配置页签的cGroupCode，将页签的cName显示到侧滑容器的标题上|
||modalSize||string||弹窗尺寸，支持两种 'sm', 'lg'，默认 ‘lg’'sm': 最小宽度 648px, 宽度占页面 50%'lg': 最小宽度 960px, 宽度占页面 75%如果没配置 iCols, 默认小尺寸展示两列，大尺寸展示三列|
||modalStyle||object||自定义弹窗样式, 配置ui默认宽度为1000px, 不配置ui遵循上一条 modalSize 控制|
||openValidate||boolean||点确定以及上下行切换时是否开启数据校验，默认 true 开启|
||maskClosable||boolean||蒙层是否触发关闭，默认true|

## [](#6-toolbar配置cstyle)6. Toolbar配置（cStyle）

||showTurnPageBtn||boolean||是否显示翻页按钮, 开侧滑特性默认值true; 配侧滑元数据的默认值false|
||hideToolBar||boolean||是否隐藏toolbar, 默认false|

## [](#7-配置事件)7. 配置事件

### [](#71-新增)7.1. 新增

action为addtablerow

### [](#72-编辑)7.2. 编辑

action为edittablerow

## [](#8-使用快捷键)8. 使用快捷键

- 

行双击打开

- 

表格有焦点行时，CTRL + E 切换 (打开/关闭) 侧滑容器

- 

表格有焦点行时，ALT + N 在当前行向下插入一行

- 

打开抽屉时，CTRL + S 保存行编辑数据, 关闭抽屉时，CTRL + S 保存单据

- 

打开抽屉时，TAB Z字形跳转，TAB + SHAFT Z字形反向跳转

- 

打开抽屉时，上下箭头换行，支持循环切换

## [](#9-支持独立侧滑容器字段设置)9. 支持独立侧滑容器字段设置

需要配置独立的侧滑元数据，也就是配置了 tableeditrowmodal 以及
tableeditrow 容器，字段设置将支持对 tableeditrow
内的字段进行字段顺序，字段显隐进行设置。

由于并不是所有领域都有这个需求，并且 tableeditrow
内不止可以配单独字段，还会有多层容器配置，这样就实现不了对
该容器内的字段进行顺序等设置，所以这个功能使用在配置了独立侧滑元数据等同时还需要开启特性开关 

enableTableEditRowSetting 才能支持。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/TableEditRowModalcehuarongqiimage2.12e01376.png)

## [](#10-参考案例)10. 参考案例

人力云 员工信息节点。

## [](#11-列表页侧滑)11. 列表页侧滑

不用配置UI元数据，在扩展脚本进行控制

参考
[页面管理配置](#/api/05-page)

## [](#12-扩展api)12. 扩展API

### [](#121-侧滑弹出初始化)12.1. 侧滑弹出初始化

const editRowModel = viewmodel.get('childrenField').getEditRowModel(); // editRowModel指当前表格的行模型

editRowModel.on('tableEditRowModalDidMount', function(args){

 // args.meta 侧滑内容

})

### [](#122-取消操作回调)12.2. 取消操作回调

editRowModel.on('hanldeTableEditModalCancel', function(args){

 

})

### [](#123-保存前事件)12.3. 保存前事件

editRowModel.on('beforeTableEditRowModalOk', function(args){

 

})

### [](#124-保存后事件)12.4. 保存后事件

editRowModel.on('hanldeTableEditModalOk', function(args){

 

})