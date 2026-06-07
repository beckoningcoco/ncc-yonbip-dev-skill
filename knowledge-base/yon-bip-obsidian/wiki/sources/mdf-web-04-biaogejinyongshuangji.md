---
title: "--表格禁用双击功能"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-biaogejinyongshuangji"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# --表格禁用双击功能

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-biaogejinyongshuangji | 所属：Web组件

# [](#表格禁用双击功能)表格禁用双击功能

为了增强UI交互性，提升用户体验，增加了表格双击功能。设计目的主要包括两个方面，列表页表格双击进入卡片
详情；参照表格双击，选中已选项+该双击项，并关闭弹窗。但是会存在部分不符合的场景，如拉单界面，无查询详情页面。因此提供了禁用双击的方法，大致包含以下场景，如有考虑不到的场景后续会补充：

列表页，表格双击禁用

gridModel._set_data('forbiddenDblClick',true,true);

列表页，树型表双击禁用

treeModel._set_data('forbiddenDblClick',true,true);

查询区，参照表格双击 禁用

const referModel= filterViewModel.get('xxx').getFromModel(); // 参照模型

referModel.on('afterInitVm',function () {

 const vm =referModel.getCache('vm') // referviewmodel

 const gridModel=vm.get('table');

 if(gridModel){

 gridModel._set_data('forbiddenDblClick',true,true);

 }

})

主表区，参照表格双击 禁用

const referModel= viewmodel.get('xxx'); // 参照模型

referModel.on('afterInitVm',function () {

 const vm =referModel.getCache('vm') // referviewmodel

 const gridModel=vm.get('table');

 if(gridModel){

 gridModel._set_data('forbiddenDblClick',true,true);

 }

})

表格中的参照双击禁用

const referModel = gridModel.getEditRowModel().get('xxx') // 参照模型

referModel.on('afterInitVm',function () {

 const vm =referModel.getCache('vm') // referviewmodel

 const gridModel=vm.get('table');

 if(gridModel){

 gridModel._set_data('forbiddenDblClick',true,true);

 }

})