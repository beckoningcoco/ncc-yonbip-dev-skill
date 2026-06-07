---
title: "子表容器 VoucherDetail"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/04-voucherdetail"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 子表容器 VoucherDetail

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/04-voucherdetail | 所属：移动组件

# [](#子表容器-voucherdetail)子表容器 VoucherDetail

## [](#1-功能说明)1. 功能说明

## [](#2-效果展示)2. 效果展示

## [](#3-扩展属性-cstyle)3. 扩展属性 cStyle

## [](#4-控制示例)4. 控制示例

### [](#41-移动端子表详情页根据某些参数某些字段设置禁用)4.1. 移动端子表详情页根据某些参数，某些字段设置禁用

#### [](#411-首次进入子表详情页关联字段设置禁用)4.1.1. 首次进入子表详情页，关联字段设置禁用

const gridModel = viewmodel.get(childrenField); // 获取表格模型,需要子表的key

const editRowModel = gridModel.getEditRowModel();// 获取编辑行模型

editRowModel.on('afterLoadData', ( { rowIndex, row } ) => {

 // 当某个字段是什么的时候,setCellState 某个字段的 disabled为true

 gridModel.setCellState(rowIndex, cItemName, 'disabled', true) // 可以写这个，任选其一

 editRowModel.get(cItemName).setDisabled(true); //也可以写这个，任选其一

})

#### [](#412-修改某些字段后关联其它字段设置禁用)4.1.2. 修改某些字段后，关联其它字段设置禁用

const gridModel = viewmodel.get(childrenField); // 获取表格模型,需要子表的key

const editRowModel = gridModel.getEditRowModel();// 获取编辑行模型

// 某个字段编辑后

editRowModel.on('afterCellEdit', ( { rowIndex, cellName, row } ) => {

 // 当某个字段是什么的时候,setCellState 某个字段的 disabled为true

 gridModel.setCellState(rowIndex, cItemName, 'disabled', true) // 可以写这个，任选其一

 editRowModel.get(cItemName).setDisabled(true); //也可以写这个，任选其一

})

### [](#42-移动端子表浏览态需要显示子表按钮)4.2. 移动端子表浏览态需要显示子表按钮

voucherdetail容器组件配cStyle {"showBrowseButton": true}

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/VoucherDetailzibiaorongqi_image1.a6105c67.png)

### [](#43-子表详情页以弹窗方式弹出)4.3. 子表详情页以弹窗方式弹出

voucherdetail配置table或者detailpage的cStyle的pageType 为modal即可。

新增和编辑需要分别配置子表的按钮的action为addrowmodal 和 editrowmodal

### [](#44-子表行支持多选批量操作)4.4. 子表行支持多选批量操作

#### [](#441-效果展示)4.4.1. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/VoucherDetailzibiaorongqi_image2.741dc761.png)

voucherdetail容器

cStyle: "{"isEdit":"false","showBatch":"false"}"

isEdit是默认显示全选和勾选按钮的

showBatch是显示批量选择和退出批量选择按钮的

#### [](#442-扩展属性-cstyle)4.4.2. 扩展属性 cStyle

||属性||说明|
||isEdit||是否显示批量按钮-默认为false|
||showBatch||是否可批量选择-默认为false|

#### [](#443-扩展控制)4.4.3. 扩展控制

/**

 * 如果动态控制是否子表是否支持批量选择

**/

// 支持批量

gridModel.execute('isEdit', true);

// 取消批量

gridModel.execute('isEdit', false);

### [](#45-子表批改功能支持配置非全部批改)4.5. 子表批改功能支持配置非全部批改

批改的action为batchmodify，需要支持非全部批改，需要在batchmodify批改动作的command中，paramter配{"isSelect":true}
则支持非全部批改

由于需要配合子表的批量全选操作

voucherdetail的cStyle配置showBatch{"showBatch":true} 显示批量按钮。

### [](#46-子表按钮操作栏吸顶)4.6. 子表按钮操作栏吸顶

toolbar的cStyle上配置fixedToTop{"fixedToTop":true}
为子表按钮操作栏吸顶。