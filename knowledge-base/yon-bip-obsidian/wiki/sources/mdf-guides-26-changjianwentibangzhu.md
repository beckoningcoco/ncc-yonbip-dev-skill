---
title: "常见问题帮助"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/26-changjianwentibangzhu"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 9
---

# 常见问题帮助

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/26-changjianwentibangzhu | 所属：指南

# [](#常见问题帮助)常见问题帮助

## [](#1-关于订单动向)1. 关于订单动向

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/changjianwentibangzhu1.df8a4871.png)

订单动向的问题--代码设计有问题。

只能配置两个controls，配多了，会显示多次订单动向数据第一条

## [](#2-加载不到扩展代码)2. 加载不到扩展代码

如果控制台信息中报`**call...**`字样的错误，则说明是MANIFEST版本不对

此时应注意区分，调试本地Node中的代码用`**npm run debug:extend**`，调试线上Node中的代码应该用`**npm run debug:extend:prod**`

两个命名的区分就是**MANIFEST**不一样

## [](#3-扩展代码语法错误)3. 扩展代码语法错误

此问题应先排查是否问题1导致的，判断依据就是刷新整个浏览器，再打开单据看控制台有无`call...`字样的错误

如果不是上面的问题，则就一定是扩展代码有真正的语法错误，此时还是找控制台报错信息，一定会有其它的报错信息

再有就是排查扩展脚本第一行`**cb.define**`的第一个参数是否`**process.env.__DOMAINKEY__**`

## [](#4-移动端查询方案相关)4. 移动端查询方案相关

### [](#41-多查询方案如何隐藏其中某一个)4.1. 多查询方案如何隐藏其中某一个

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/changjianwentibangzhu2.32aea5f9.png)

在filterViewModel的扩展脚本中

// viewmodel为filterViewModel

viewmodel.on('beforeInit',() => {

 const data = viewmodel.getCache('schemeList');

 // 操作data数据，把需要隐藏的数据移除，生成新的data数据

 viewmodel.setCache('schemeList', newData)

})

## [](#5-移动端列表接口按单数据)5. 移动端列表接口按单数据

移动端列表没有配按单按料切换，数据查询是按料的数据如何处理，如何查询为按单数据

// 扩展脚本init方法里增加此段代码

viewmodel.setCache("isSum", true);

## [](#6-移动端子表详情页根据某些参数某些字段设置禁用)6. 移动端子表详情页根据某些参数，某些字段设置禁用

### [](#61-首次进入子表详情页关联字段设置禁用)6.1. 首次进入子表详情页，关联字段设置禁用

const gridModel = viewmodel.get(childrenField); // 获取表格模型,需要子表的key

const editRowModel = gridModel.getEditRowModel();// 获取编辑行模型

editRowModel.on('afterLoadData', ( { rowIndex, row } ) => {

 // 当某个字段是什么的时候,setCellState 某个字段的 disabled为true

 gridModel.setCellState(rowIndex, cItemName, 'disabled', true) // 可以写这个，任选其一

 editRowModel.get(cItemName).setDisabled(true); //也可以写这个，任选其一

})

### [](#62-修改某些字段后关联其它字段设置禁用)6.2. 修改某些字段后，关联其它字段设置禁用

const gridModel = viewmodel.get(childrenField); // 获取表格模型,需要子表的key

const editRowModel = gridModel.getEditRowModel();// 获取编辑行模型

// 某个字段编辑后

editRowModel.on('afterCellEdit', ( { rowIndex, cellName, row } ) => {

 // 当某个字段是什么的时候,setCellState 某个字段的 disabled为true

 gridModel.setCellState(rowIndex, cItemName, 'disabled', true) // 可以写这个，任选其一

 editRowModel.get(cItemName).setDisabled(true); //也可以写这个，任选其一

})

## [](#7-移动端子表浏览态需要显示子表按钮)7. 移动端子表浏览态需要显示子表按钮

voucherdetail容器组件配cStyle {"showBrowseButton": true}

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/changjianwentibangzhu3.a6105c67.png)

## [](#8-移动端如何配置主子孙)8. 移动端如何配置主子孙

子表详情一般是voucherdetail-table(子表gridmodel)

子表详情中显示孙表则meta元数据配成detailpage

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/changjianwentibangzhu4.2ffbc713.png)

## [](#9-移动端子表详情页)9. 移动端子表详情页

处理某些字段根据其他字段不修改

const gridmodel = viewmodel.get(childrenField)

const editRowModel = gridmodel.getEditRowModel();

editRowModel.get(cItemName).on('beforeValueChange', () => {

 const row = editRowModel.getData();

 if (row.*** > 1){

 return false;

 } else {

 return true

 }

});

## [](#10-移动端如何配置按钮平分)10. 移动端如何配置按钮平分

文档[Toolbar 按钮组](#/components-mobile/02-toolbar)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/changjianwentibangzhu5.8e56cdff.png)

## [](#11-移动端如何配置-只看必填项)11. 移动端如何配置-只看必填项

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/changjianwentibangzhu6.f01e93db.png)

领域级特性开关

checkbIsNull 如果开启，领域的所有卡片页面都会有这个功能

setCheckbIsNull, 如何开启这个特性，只看必填项默认为打开状态

// 如何手动修改单据的只看必填项的值

viewModel.execute('setCheckbIsNull', true); -- 打开

viewModel.execute('setCheckbIsNull', false); -- 关闭

## [](#12-卡片详情页去掉背景)12. 卡片详情页去掉背景

cControlType 为view的cStyle中增加

{"className": "light"}

如下图位置:

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/changjianwentibangzhu7.988d0155.png)

## [](#13-卡片详情页去掉自动刷新)13. 卡片详情页去掉自动刷新

cControlType 为view的cStyle中增加

{"disableRefresh": true}

## [](#14-卡片页不显示header)14. 卡片页不显示header

cControlType 为view的cStyle中增加

{"bShowHeader": false}

## [](#15-卡片页mode变化时page组件不执行modechange方法)15. 卡片页mode变化时page组件不执行modeChange方法

需要配置page时增加参数subPageRelyParent为true

当父页面mode改变时,子页面也会触发modeChange方法

如果配置page [Page子页面](#/components-mobile/04-page)

## [](#16-移动端如何tips适配)16. 移动端如何tips适配

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/changjianwentibangzhu8.bcad8242.png)

**固定提示文案**

基础组件 cStyle tips 或者validateMsg 配置即可

{"tips": "此输入用来*****"}

{"validateMsg": "此输入用来*****"}

**动态修改需要模型**

// cItemName 是个变量，根据你的字段填写

const model = viewmodel.get('cItemName');

model.setValidateMsg({

 type:'help',

 msg: '请输入*****'

})

## [](#17-子表详情页以modal方式弹出)17. 子表详情页以modal方式弹出

voucherdetail配置table或者detailpage的cStyle的pageType 为modal即可。

新增和编辑需要分别配置子表的按钮的action为addrowmodal 和 editrowmodal

## [](#18-子表行支持多选批量操作)18. 子表行支持多选批量操作

### [](#181-效果展示)18.1. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/changjianwentibangzhu9.741dc761.png)

voucherdetail容器

cStyle: "{"isEdit":"false","showBatch":"false"}"

isEdit是默认显示全选和勾选按钮的

showBatch是显示批量选择和退出批量选择按钮的

### [](#182-扩展属性-cstyle)18.2. 扩展属性 cStyle

||**属性**||**说明**|
||isEdit||是否显示批量按钮-默认为false|
||showBatch||是否可批量选择-默认为false|

### [](#183-控制示例)18.3. 控制示例

/**

 * 如果动态控制是否子表是否支持批量选择

**/

// 支持批量

gridModel.execute('isEdit', true);

// 取消批量

gridModel.execute('isEdit', false);

## [](#19-子表批改功能支持配置非全部批改)19. 子表批改功能支持配置非全部批改

批改的action为batchmodify，需要支持非全部批改，需要在batchmodify批改动作的command中，paramter配{"isSelect":true}
则支持非全部批改

由于需要配合子表的批量全选操作

voucherdetail的cStyle配置showBatch{"showBatch":true} 显示批量按钮。

## [](#20-子表按钮操作栏吸顶)20.  子表按钮操作栏吸顶

toolbar的cStyle上配置fixedToTop{"fixedToTop":true}
为子表按钮操作栏吸顶。

## [](#21-h5通栏如何关闭)21. h5通栏如何关闭

领域级特性开关，closeFullScreen----关闭mdf相关通栏代码

注,如果关闭通栏需要注意自己的代码是否调用了window.mtl?.setNavBar ||
window.mtl?.upesn?.settingNavBar这两个方法，需要把fullScreen参数由1改为0.或者直接删掉fullScreen参数---领域自行关闭通栏相关代码

## [](#22-子表setcolumnstates和setcolumns实现)22. 子表setColumnStates和setColumns实现

// setColumns

gridModel.execute('updateMetaColumns', { childrenField: 子表对应的childrenField, columns: {columns1: {...}, columns1: {...}} })

 

// setColumnStates

gridModel.execute('updateMetaColumns', { childrenField: 子表对应的childrenField, columns: [{cellName: cItemName, name: 'visible', value: false}] })

## [](#23-子表动态增行-addcolumns)23. 子表动态增行 addColumns

// columns1必要属性 _cGroupCode 指定插入到哪个分组中

// _insertAfter指定插入顺序 默认插入指定分组最前面 true的时候插入到最后面

gridModel.execute('addColumns', { childrenField: 子表对应的childrenField, columns: {columns1: { _cGroupCode: 'aaa', ...}, columns2: {_cGroupCode: 'aaa', ...}} })