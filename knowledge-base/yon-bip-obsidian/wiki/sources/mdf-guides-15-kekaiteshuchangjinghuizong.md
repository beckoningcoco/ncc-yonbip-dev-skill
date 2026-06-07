---
title: "客开特殊场景汇总"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/15-kekaiteshuchangjinghuizong"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 客开特殊场景汇总

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/15-kekaiteshuchangjinghuizong | 所属：指南

# [](#客开特殊场景汇总)客开特殊场景汇总

样例地址：[https://xxx/mdf-node/meta/VoucherList/mdd_Voucher_introduce/?domainKey=iuap-metadata-mdd](https://xxx.yyuap.com/mdf-node/meta/VoucherList/mdd_Voucher_introduce/?domainKey=iuap-metadata-mdd)

注意：访问地址前先登录测试环境，任意账号租户即可。

## [](#1-进入详情页自动聚焦子表的某行某列的参照然后录入数据)1. 进入详情页自动聚焦子表的某行某列的参照，然后录入数据

viewmodel.getGridModel(对应子表的childrenField).doPropertyChange('onCellClickWrap', {index: 行索引, columnKey: 对应列的itemName, noAutoAdd: true/false 是否自动增行})

// 聚焦操作 然后聚焦了就能直接录入数据了

## [](#2-低代码做的单据要适配查询区二级页签场景)2. 低代码做的单据要适配查询区二级页签场景

低代码服务应用构建做的单据不太好适配二级页签（这个存储能力可能支持UI模板+MDD的场景，至少得有advance那张表并且能读取数据）

如果想适配怎么做呢，通过客开脚本渲染该页签；

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kekaiteshuchangjinghuizongimage1.b560c0bf.png)
按下面代码写就行，二级页签本质上就是一棵树，可以抄下来下面的代码然后根据报错进行微调即可（比如调整对应的itemName、value1、valueKey等）

viewModel.on('afterInitCommonViewModel', () => {

 const FilterViewModel = viewModel.getCache('FilterViewModel');

 FilterViewModel.on('afterInit',function(){

 FilterViewModel.execute("updateAdvanceModel", advanceModelData)

 })

})

 

const advanceModelData =

 {

 "id": "2002055359662391316",

 "parentId": null,

 "filterId": 1992509107798540300,

 "solutionId": null,

 "logicSymbol": "or",

 "itemId": null,

 "itemName": null,

 "itemTitle": null,

 "compareLogic": null,

 "value1": null,

 "value2": null,

 "valueKey": null,

 "valueTitle": null,

 "value2Key": null,

 "value2Title": null,

 "bHidden": 0,

 "bAutoFlt": 0,

 "bRelatedSolutionCommon": 0,

 "iOrder": 1,

 "pubts": "28/5/2024 15:04:10",

 "itemTitle_resid": null,

 "valueTitle_resid": null,

 "value2Title_resid": null,

 "ytenant_id": 0,

 "conditionType": 0,

 "cExtProps": null,

 "children": [

 {

 "id": "2002055359662391317",

 "parentId": "2002055359662391316",

 "filterId": 1992509107798540300,

 "solutionId": null,

 "logicSymbol": "and",

 "itemId": null,

 "itemName": null,

 "itemTitle": null,

 "compareLogic": null,

 "value1": null,

 "value2": null,

 "valueKey": null,

 "valueTitle": null,

 "value2Key": null,

 "value2Title": null,

 "bHidden": 0,

 "bAutoFlt": 0,

 "bRelatedSolutionCommon": 0,

 "iOrder": 2,

 "pubts": "28/5/2024 15:04:10",

 "itemTitle_resid": null,

 "valueTitle_resid": null,

 "value2Title_resid": null,

 "ytenant_id": 0,

 "conditionType": 0,

 "cExtProps": null,

 "children": [

 {

 "id": "2002055359662391324",

 "parentId": "2002055359662391317",

 "filterId": 1992509107798540300,

 "solutionId": null,

 "logicSymbol": null,

 "itemId": 63204,

 "itemName": "codeStatus",

 "itemTitle": "单据状态",

 "compareLogic": "eq",

 "value1": "all",

 "value2": null,

 "valueKey": "all",

 "valueTitle": "全部",

 "value2Key": null,

 "value2Title": null,

 "bHidden": 0,

 "bAutoFlt": 1,

 "bRelatedSolutionCommon": 0,

 "iOrder": 9,

 "pubts": "28/5/2024 16:02:34",

 "itemTitle_resid": "",

 "valueTitle_resid": "",

 "value2Title_resid": null,

 "ytenant_id": 0,

 "conditionType": 0,

 "cExtProps": null

 }

 ]

 },

 {

 "id": "2002055359662391318",

 "parentId": "2002055359662391316",

 "filterId": 1992509107798540300,

 "solutionId": null,

 "logicSymbol": "and",

 "itemId": null,

 "itemName": null,

 "itemTitle": null,

 "compareLogic": null,

 "value1": null,

 "value2": null,

 "valueKey": null,

 "valueTitle": null,

 "value2Key": null,

 "value2Title": null,

 "bHidden": 0,

 "bAutoFlt": 0,

 "bRelatedSolutionCommon": 0,

 "iOrder": 3,

 "pubts": "28/5/2024 15:04:10",

 "itemTitle_resid": null,

 "valueTitle_resid": null,

 "value2Title_resid": null,

 "ytenant_id": 0,

 "conditionType": 0,

 "cExtProps": null,

 "children": [

 {

 "id": "2002055359662391325",

 "parentId": "2002055359662391318",

 "filterId": 1992509107798540300,

 "solutionId": null,

 "logicSymbol": null,

 "itemId": 63204,

 "itemName": "codeStatus",

 "itemTitle": "单据状态",

 "compareLogic": "eq",

 "value1": 0,

 "value2": null,

 "valueKey": 0,

 "valueTitle": "中转待确认",

 "value2Key": null,

 "value2Title": null,

 "bHidden": 0,

 "bAutoFlt": 1,

 "bRelatedSolutionCommon": 0,

 "iOrder": 10,

 "pubts": "28/5/2024 16:02:35",

 "itemTitle_resid": "",

 "valueTitle_resid": "",

 "value2Title_resid": null,

 "ytenant_id": 0,

 "conditionType": 0,

 "cExtProps": null

 }

 ]

 },

 {

 "id": "2002055359662391319",

 "parentId": "2002055359662391316",

 "filterId": 1992509107798540300,

 "solutionId": null,

 "logicSymbol": "and",

 "itemId": null,

 "itemName": null,

 "itemTitle": null,

 "compareLogic": null,

 "value1": null,

 "value2": null,

 "valueKey": null,

 "valueTitle": null,

 "value2Key": null,

 "value2Title": null,

 "bHidden": 0,

 "bAutoFlt": 0,

 "bRelatedSolutionCommon": 0,

 "iOrder": 4,

 "pubts": "28/5/2024 15:04:10",

 "itemTitle_resid": null,

 "valueTitle_resid": null,

 "value2Title_resid": null,

 "ytenant_id": 0,

 "conditionType": 0,

 "cExtProps": null,

 "children": [

 {

 "id": "2002055359662391326",

 "parentId": "2002055359662391319",

 "filterId": 1992509107798540300,

 "solutionId": null,

 "logicSymbol": null,

 "itemId": 63204,

 "itemName": "codeStatus",

 "itemTitle": "单据状态",

 "compareLogic": "eq",

 "value1": 1,

 "value2": null,

 "valueKey": 1,

 "valueTitle": "中转待配送",

 "value2Key": null,

 "value2Title": null,

 "bHidden": 0,

 "bAutoFlt": 1,

 "bRelatedSolutionCommon": 0,

 "iOrder": 11,

 "pubts": "28/5/2024 16:02:35",

 "itemTitle_resid": "",

 "valueTitle_resid": "",

 "value2Title_resid": null,

 "ytenant_id": 0,

 "conditionType": 0,

 "cExtProps": null

 }

 ]

 },

 {

 "id": "2002055359662391320",

 "parentId": "2002055359662391316",

 "filterId": 1992509107798540300,

 "solutionId": null,

 "logicSymbol": "and",

 "itemId": null,

 "itemName": null,

 "itemTitle": null,

 "compareLogic": null,

 "value1": null,

 "value2": null,

 "valueKey": null,

 "valueTitle": null,

 "value2Key": null,

 "value2Title": null,

 "bHidden": 0,

 "bAutoFlt": 0,

 "bRelatedSolutionCommon": 0,

 "iOrder": 5,

 "pubts": "28/5/2024 15:04:10",

 "itemTitle_resid": null,

 "valueTitle_resid": null,

 "value2Title_resid": null,

 "ytenant_id": 0,

 "conditionType": 0,

 "cExtProps": null,

 "children": [

 {

 "id": "2002055359662391327",

 "parentId": "2002055359662391320",

 "filterId": 1992509107798540300,

 "solutionId": null,

 "logicSymbol": null,

 "itemId": 63204,

 "itemName": "codeStatus",

 "itemTitle": "单据状态",

 "compareLogic": "eq",

 "value1": "2",

 "value2": null,

 "valueKey": "2",

 "valueTitle": "中转配送中",

 "value2Key": null,

 "value2Title": null,

 "bHidden": 0,

 "bAutoFlt": 1,

 "bRelatedSolutionCommon": 0,

 "iOrder": 12,

 "pubts": "28/5/2024 16:02:35",

 "itemTitle_resid": "",

 "valueTitle_resid": "",

 "value2Title_resid": null,

 "ytenant_id": 0,

 "conditionType": 0,

 "cExtProps": null

 }

 ]

 },

 {

 "id": "2002055359662391321",

 "parentId": "2002055359662391316",

 "filterId": 1992509107798540300,

 "solutionId": null,

 "logicSymbol": "and",

 "itemId": null,

 "itemName": null,

 "itemTitle": null,

 "compareLogic": null,

 "value1": null,

 "value2": null,

 "valueKey": null,

 "valueTitle": null,

 "value2Key": null,

 "value2Title": null,

 "bHidden": 0,

 "bAutoFlt": 0,

 "bRelatedSolutionCommon": 0,

 "iOrder": 6,

 "pubts": "28/5/2024 15:04:10",

 "itemTitle_resid": null,

 "valueTitle_resid": null,

 "value2Title_resid": null,

 "ytenant_id": 0,

 "conditionType": 0,

 "cExtProps": null,

 "children": [

 {

 "id": "2002055359662391328",

 "parentId": "2002055359662391321",

 "filterId": 1992509107798540300,

 "solutionId": null,

 "logicSymbol": null,

 "itemId": 63204,

 "itemName": "codeStatus",

 "itemTitle": "单据状态",

 "compareLogic": "eq",

 "value1": "3",

 "value2": null,

 "valueKey": "3",

 "valueTitle": "已妥投",

 "value2Key": null,

 "value2Title": null,

 "bHidden": 0,

 "bAutoFlt": 1,

 "bRelatedSolutionCommon": 0,

 "iOrder": 13,

 "pubts": "28/5/2024 16:02:35",

 "itemTitle_resid": "",

 "valueTitle_resid": "",

 "value2Title_resid": null,

 "ytenant_id": 0,

 "conditionType": 0,

 "cExtProps": null

 }

 ]

 },

 {

 "id": "2002055359662391322",

 "parentId": "2002055359662391316",

 "filterId": 1992509107798540300,

 "solutionId": null,

 "logicSymbol": "and",

 "itemId": null,

 "itemName": null,

 "itemTitle": null,

 "compareLogic": null,

 "value1": null,

 "value2": null,

 "valueKey": null,

 "valueTitle": null,

 "value2Key": null,

 "value2Title": null,

 "bHidden": 0,

 "bAutoFlt": 0,

 "bRelatedSolutionCommon": 0,

 "iOrder": 7,

 "pubts": "28/5/2024 15:10:04",

 "itemTitle_resid": null,

 "valueTitle_resid": null,

 "value2Title_resid": null,

 "ytenant_id": 0,

 "conditionType": 0,

 "cExtProps": null,

 "children": [

 {

 "id": "2002055359662391329",

 "parentId": "2002055359662391322",

 "filterId": 1992509107798540300,

 "solutionId": null,

 "logicSymbol": null,

 "itemId": 63204,

 "itemName": "codeStatus",

 "itemTitle": "单据状态",

 "compareLogic": "eq",

 "value1": "4",

 "value2": null,

 "valueKey": "4",

 "valueTitle": "已拒收",

 "value2Key": null,

 "value2Title": null,

 "bHidden": 0,

 "bAutoFlt": 1,

 "bRelatedSolutionCommon": 0,

 "iOrder": 14,

 "pubts": "28/5/2024 16:02:35",

 "itemTitle_resid": "",

 "valueTitle_resid": "",

 "value2Title_resid": null,

 "ytenant_id": 0,

 "conditionType": 0,

 "cExtProps": null

 }

 ]

 }

 ]

 }

## [](#3-客开扩展标品的查询区二级页签区域)3. 客开扩展标品的查询区二级页签区域

首先明白，二级页签区域是根据查询区advanceModel协议返回的，协议和上文中的那个JSON结构一致，因此，直接在根结点的children中扩展一个map即可增加一个页签。

代码如下

viewModel.on('updateAdvanceModel', args => {

 args.children.push({

 "children": [

 {

 "value2": "",

 "value1": "purconfirm", // 这个就是传给后端的条件值

 "bRelatedSolutionCommon": false,

 "cShowCaption": "单据状态",

 "valueTitleMultiLang": { // 多语标题

 "en_US": "Pending My Confirmation",

 "zh_CN": "待我确认"

 },

 "valueTitleResid": "UID:C_GZTTMP_0000LLNF8N32HHLIXH0000_1C1025CC0A700006",

 "valueTitle": "待我确认",

 "multSelect": 0,

 "itemId": 63204,

 "itemName": "billstatus", // 这个就是传给后端的条件field

 "value2Key": "",

 "bAutoFlt": true,

 "bHidden": false,

 "conditionType": 0,

 "id": "3859538913530114",

 "valueKey": "purconfirm", // 这个就是传给后端的条件值，和value1保持一致

 "compareLogic": "eq",

 "iOrder": 9 // 随便改

 }

 ],

 "logicSymbol": "and",

 "conditionType": 0,

 "id": "3859538913530113",

 "iOrder": 3

 })

})

## [](#4-客开扩展页面增加查询条件)4. 客开扩展页面增加查询条件

扩展页面没法直接改协议，只能前端干预：

viewModel.on('afterInitCommonViewModel',function() {

 const filterViewModel = viewModel.getCache('FilterViewModel');

 filterViewModel.on('afterGetFinterInit', (results) => {

 const Common = { // 这是条件的协议

 "filtersId": 8,

 "allowUpdateCompare": 0,

 "itemTitle": "地域",

 "autoFlt": true,

 "precision": 0,

 "refType": 0,

 "cRefId": 0,

 "ctrlType": "cascader",

 "multSelect": 1,

 "isMasterOrg": false,

 "itemName": "region",

 "bAutoFlt": true,

 "isCommon": 1,

 "rangeInput": 0,

 "id": 99,

 "compareLogic": "eq",

 "mustInput": 0,

 "cShowCaption": "地域",

 "bSelfDefine": false,

 "descValue": 0,

 "bAutoflt": true,

 "isSys": 1,

 "iType": 0,

 "token": 0,

 "itemId": 62,

 "isCommonModel": true,

 keyField: 'id',

 titleField: 'name',

 dataSourceMode: 'remote', // remote为请求数据源，local为本地数据源

 needCollect: true, // 是否需要收集

 bIsNull: true, // 是否可空

 bMustSelect:false,//必输

 changeOnSelect: true, // true为逐级选择，不传或者false为仅选末级

 bVmExclude: 0,

 }

 // 下面两行都是为了增加查询条件

 results[2].data.AllFilterModel.push(Common)

 results[2].data.CommonModel.push(Common)

 })

})