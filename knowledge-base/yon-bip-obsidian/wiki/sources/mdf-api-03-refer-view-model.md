---
title: "参照模型 ReferViewModel"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/03-refer-view-model"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 参照模型 ReferViewModel

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/03-refer-view-model | 所属：API

# [](#参照模型-referviewmodel)参照模型 ReferViewModel

## [](#1-事件)1. 事件

### [](#11-beforebrowse)1.1. beforeBrowse

说明：点击按钮弹出参照前事件

// propertyName为参照的cItemName

viewmodel.get(propertyName).on('beforeBrowse,function (data) {

 // 一般在这个事件内给参照请求增加过滤参数，示例如下

});

示例：

// setFilter方法 最终拼接到getRefData中参数为 condition:condition

viewmodel.get("cName").on('beforeBrowse', function (data) {

 var condition = {

 "isExtend": true,

 simpleVOs: []

 };

 condition.simpleVOs.push({

 field: 'productOfflineRetail.businessAttribute', // 字段

 op: 'eq', // in like...

 value1: 3

 });

 this.setFilter(condition); // conditon是你需要拼接的参数

});

 

// setCondition方法 最终拼接到getRefData中参数为 mapCondition:condition

viewmodel.get("cName").on('beforeBrowse', function (data) {

 var condition = {

 "params1":111, // 自定义参数

 "params2":222,

 };

 this.setCondition(condition); // conditon是你需要拼接的参数

});

 

// 自定义参数 这样params1和params2就会放到最外层的请求参数中

viewmodel.get("cName").on('beforeBrowse', function (data) {

 data.params1 = 111;

 data.params2 = 222;

});

 

// 如果tree或者treelist参照设置过滤条件 最终拼接到getRefData中参数为 treeCondition:condition

 

viewmodel.get("cName").on('beforeBrowse', function (data) {

 var condition = {

 "params1":111, // 自定义参数

 "params2":222,

 };

 this.setTreeFielter(condition);

});

// 真实场景示例： https://www.yuque.com/docs/share/4d8aa155-e05f-47ed-96f0-578dfc4801cf?# 《扩展开发-级联参照开发》

### [](#12-afertinitvm)1.2. afertInitVm

说明：参照弹窗模型（referViewModel）初始化完毕

referModel.on('afterInitVm',function(arg){

 const vm = arg.vm;

 // 处理参照表数据

 vm.get('table').on('beforeSetDataSource',function(data){}) // 参照表格数据setDataSource前置事件

 // 处理参照树数据

 vm.get('tree').on('beforeSetDataSource',function(data){}) // 参照树setDataSource前置事件

 // 获取参照的类型

 const referType = vm.getCache('referType') // Tree || Table || TreeTable || TreeList || TransferTable || HasSelectTable

 // 参照选完值后确定前置事件 data为参照选中的数据，return false则取消赋值

 vm.on('beforeOkClick',function(data){})

 // 参照选完值后置事件 data为参照赋值数据

 vm.on('afterReferOkClick',function(data){})

 

}

### [](#13-beforevaluechange)1.3. beforeValueChange

说明：参照值改变前置事件

viewmodel.get(propertyName).on('beforeValueChange',function (data) {

 // data为参照的选中的值

});

### [](#14-aftervaluechange)1.4. afterValueChange

说明：参照值改变后置事件

viewmodel.get(propertyName).on('afterValueChange',function (data) {

 // data为参照的选中的值

});

### [](#15-beforegetrefmeta)1.5. beforeGetRefMeta

说明：参照调getRefMeta前置事件

referModel.on('beforeGetRefMeta',function (param) {

// param为调getRefMeta接口的参数，这里可以直接修改

});

### [](#16-beforegetrefdata)1.6. beforeGetRefData

说明：参照调getRefData前置事件

referModel.on('beforeGetRefData',function (param) {

// param为调getRefData接口的参数，这里可以直接修改

});

表格内参照特有事件

### [](#17-beforebrowse)1.7. beforeBrowse

说明：改事件为参照模型透传到表格模型上

// arg参数 { rowIndex: index, cellName: this.getName(), context: this,

carryParams: carryParams }

gridModel.on('beforeBrowse',function(arg){

const rowIndex = arg.rowIndex; // 行索引

const cellName = arg.cellName; // 列cellName

const carryParams = arg.carryParams; // 同1的data

})

### [](#18-beforeinsertrowfromrefer-refer多选)1.8. beforeInsertRowFromRefer （Refer多选）

说明：该事件为子表或者孙表多选参照插入行前置事件（

如果选择两条参照数据，第二条才会触发这个事件，如果选择三条参照数据，第二条第三条才会触发。。）

// arg参数 { index: rowIndex + index, row: rowData, columnName: cellName}

gridModel.on('beforeInsertRowFromRefer',function(arg){

 const rowIndex = arg.index; // 行索引

 const row = arg.row; // 行数据

 const columnName = arg.columnName; // 列名称

})

### [](#19-beforeinsertrowsfromreferrefer多选)1.9. beforeInsertRowsFromRefer（Refer多选）

说明：该事件为子表或者孙表多选参照插入全部行前置事件（只会触发一次）

// arg参数 { index: rowIndex, rows: rowDatas, columnName: cellName,values: data }

gridModel.on('beforeInsertRowsFromRefer',function(arg){

 const rowIndex = arg.index; // 行索引

 const rows = arg.rows; // 表格要插入的全部行数据

 const columnName = arg.columnName; // 列名称

 const referValue = arg.values // 参照选择的全部数据

})

### [](#110-afterokclick)1.10. afterOkClick 

 说明： 点击确认框后的回调事件

 参数：data：在表参照、树表参照返回选中行数据，在树参照中返回当前选中的树节点

referViewMode.on('afterOkClick',(data)=>{

 console.log('当前选中的数据'，data);

})

### [](#111-getrefmetaready)1.11. getRefMetaReady

 说明：请求完参照的meta信息的回调事件

## [](#2-model获取)2. Model获取

获取参照弹出框对应的ReferViewModel请参考[这里](#/guides/05-canzhaoshejishuoming)