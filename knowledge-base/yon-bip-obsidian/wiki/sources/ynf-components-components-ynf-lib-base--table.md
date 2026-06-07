---
title: "表格 Table"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--table"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 表格 Table

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--table | 所属：YNF-组件

# [](#表格-table)表格 Table

展示行列数据。

import { Table } from "ynf-lib-base"

## [](#何时使用)何时使用

- 当有大量结构化的数据需要展现时;
- 当需要对数据进行排序、搜索、分页、自定义操作等复杂行为时。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||无数据时提示文字||noDataText||string||无数据时显示的内容 Function():string () => {return "内容文字"}|||||
||表头属性设置||tableHeader||object||可以针对列配置visible,require,disabled,readOnly,支持boolean和mobx脚本, 
 {visible:"", readOnly:""}||{}|||
||显示序号||showRowNum||boolean||展示序号功能，false时不展示，true时展示默认情况，可传入自定义配置信息||false|||
||自定义序号||showCustomRowNum||boolean||该功能是开启显示序号功能以后可配置，针对的树表的序号||false|||
||是否收起行按钮||isFoldMenu||boolean||表格的行按钮是否展开和收起||false|||
||显示列表设置||showColumnSetting||boolean||是否开启表格列表设置功能，包括列的显示隐藏和列的排序，目前只支持本地设置||true|||
||表头超出折行||headerDisplayInRow||boolean||设置表头的内容显示一行，超出显示省略号||false|||
||行点击自动勾选||autoCheckedByClickRows||boolean||设置为 false 时，表格行点击事件，不会自动勾选复选框||false|||
||是否启用拖拽调整列宽||canDragBorder||boolean||是否启用表格拖拽调整列宽度||true|||
||是否启用列固定||lockable||boolean||是否开启锁定列功能||true|||
||开启多表头||multilistHeader||boolean||为true时开启多列表头功能，columns[n] 可以内嵌 children，以渲染分组表头。||false|||
||开启排序||isSort||boolean||开启排序功能||false|||
||编辑方式||editType||Radio||选择编辑方式，行内编辑是当前行编辑，侧滑编辑是右侧弹出抽屉编辑||inline|||
||侧滑宽度||drawerWidth||Text||开启侧滑编辑以后，可配置抽屉的宽度||50%|||
||行选中方式||rowSelection||Radio||表格的单选多选功能||null|||
||选择框的默认属性配置||getCheckboxProps||Text||选择框的默认属性配置
 function(record)||-|||
||布局样式||cStyle||Style||布局样式||-|||
||表头样式||headerStyle||Style||表头样式||-|||
||表体样式||bodyStyle||Style||表体样式||-|||
||行单击||onRowClick||Function(rowStore, index, event)||行的点击事件钩子函数||`rowStore` : 当前行的数据
 `index` : 当前行的index
 `event` : 事件对象|||
||行双击||onRowDoubleClick||Function(rowStore, index, event)||行的双击事件钩子函数||`rowStore` : 当前行的数据
 `index` : 当前行的index
 `event` : 事件对象|||
||选中改变||onChange||Function(selectedData)||选中项发生变化时的回调||`selectedData` : 里面包含当前表格的实例tableStore和选中行的key数组|||
||选中||onSelect||Function(selectedData)||选择某行的回调||`selectedData` : 里面包含当前表格的实例tableStore和行的实例rowStore|||
||取消选中||UnSelect||Function(selectedData)||取消选择某行的回调||`selectedData` : 里面包含当前表格的实例tableStore和行的实例rowStore|||
||多选-全选||onSelectAll||Function(selectedData)||选择/取消选择所有行的回调||`selectedData` : 里面包含当前表格的实例tableStore|||
||多选-取消全选||onUnSelectAll||取消选择所有行的回调||Function(selectedData)||`selectedData` : 里面包含当前表格的实例tableStore|||
||鼠标移入行||onRowHover||Function(hoverData)||行hover时的回调函数`慎用在此回调函数中进行setState等引发重绘的操作，会频繁触发重绘，可能影响性能`||`hoverData` : 里面包含当前表格的实例rowStore|||
||鼠标移出行||onRowHoverOut||Function(hoverData)||行hover时的回调函数`慎用在此回调函数中进行setState等引发重绘的操作，会频繁触发重绘，可能影响性能`||`hoverData` : 里面包含当前表格的实例rowStore|||
||鼠标移出表体||onBodyMouseLeave||Function()||移除表体的回调事件|||||
||table body 横向滚动的回调||onHandleScrollX||Function(scrollTop,treeType, event)||水平滚动的回调事件||`scrollTop` : number类型
 `treeType` : boolean类型
 `event` : 事件对象|||