---
title: "Refer 参照常用扩展梳理"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/05-canzhaochangyongkuozhanshuli"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 11
---

# Refer 参照常用扩展梳理

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/05-canzhaochangyongkuozhanshuli | 所属：指南

# [](#refer-参照常用扩展梳理)Refer 参照常用扩展梳理

## [](#1修改参照弹窗title)1.修改参照弹窗title

方案1 ：修改参照使用方引用字段的cShowCaption(billitem_base表)

方案2: referModel.setState('modalTitle', '***');
方案3: modalTitle 也能配置cstyle里

## [](#2自定义参照加载过滤区打开参照直接加载数据)2.自定义参照加载过滤区，打开参照直接加载数据：  

//参照自动加载数据

let taskPlan= viewmodel.get('task_plan_id_Name');

taskPlan.on('afterInitVm',function () {

 const referViewModel=taskPlan.getCache('vm');

 referViewModel.on('afterInitCommonViewModel',function () {

 const filterVieModel=referViewModel.getCache('FilterViewModel');

 filterVieModel.getParams().autoLoad=true;

 })

})

## [](#3高级查询支持操作符不可更)3.高级查询支持操作符不可更

viewmodel.on('handleSchemeData', (id, data, callback) => {

 if (data && data.length > 0) {

 data.map((filterItem,index) => {

 if(index==2) filterItem.fixCompareLogic=true;

 });

 }

})

## [](#4通过一个按钮弹出一个参照)4.通过一个按钮弹出一个参照

1.在excel中新增一个div容器，容器内配置一个你需要弹出的参照，billItem_base表的bVmExclude配置为1

2.在扩展脚本中监听你配置按钮的click方法，然后调参照的弹出方法即可,代码如下：

// 以下代码需要在扩展脚本中实现

var transferReferModel = new cb.models.ReferModel({

 cRefType: 'auth_User_Ref', // 弹出参照的refCode

 multiple: 'rue', // 是否多

 domainKey: process.env.__DOMAINKEY__,

});

// TransferTable就是你单据上配置的那个参照的cItemName

viewmodel.addProperty('TransferTable', transferReferModel); // 将这个参照添加到单据的viewmodel中

transferReferModel.setVisible(false); // 将页面配置的参照隐藏 // 监听按钮的点击事件

viewmodel.get('btnAllocateUser').on('click',function(data){

 // ...如果参照需要回显，这里还需要获取参照已选值，执行参照的setValue方法给参照赋值

 // 比如: transferReferModel.setValue([{id:**,name:**}])

 transferReferModel.browse(true);// 参照弹出

})

transferReferModel.on('afterValueChange',function(data){

 console.log(data.value); // 参照选择后的值

})

3.如果是按钮弹出卡片上已有的一个参照

const referModel = viewModel.get("参照CItemName")

referModel.setVisible(false);

viewmodel.get('按钮').on('click',function (data){

 referModel.browse(true); // 参照弹出

})

 referModel.on('afterValueChange',function (data){

 console.log(data.value); // 参照选择后的值

})

## [](#5动态修改表参照的rowkeyfield)5.动态修改表参照的rowKeyField

referModel.on('afterInitVm',function(){

 const referViewModel = this.getCache('vm');

 referViewModel.on('getRefMetaReady',function(){

 referModel.setState('refKeyField', '***');

 });

})

## [](#6如何给参照添加请求参数和值)6.如何给参照添加请求参数和值

// setFilter方法 最终拼接到getRefData中参数为 condition:condition

viewmodel.get("cName").on('beforeBrowse', function (data) {

 var condition = {

 "isExtend": true,

 simpleVOs: []

 };

 condition.simpleVOs.push({

 field: 'productOfflineRetail.businessAttribute', // 字段

 op: 'eq', // in like nin...

 value1: 3

 });

 this.setFilter(condition); // conditon是你需要拼接的参数

});

// 1、 setCondition方法 最终拼接到getRefData中参数为 mapCondition:condition

viewmodel.get("cName").on('beforeBrowse', function (data) {

 var condition = {

 "params1":111, // 自定义参数

 "params2":222,

 };

 this.setCondition(condition); // conditon是你需要拼接的参数

});

// 2、自定义参数 这样params1和params2就会放到最外层的请求参数中

viewmodel.get("cName").on('beforeBrowse', function (data) {

 data.params1 = 111;

 data.params2 = 222;

});

 

// 3、如果tree或者treelist参照设置过滤条件 最终拼接到getRefData中参数为 treeCondition:condition

viewmodel.get("cName").on('beforeBrowse', function (data) {

 var condition = {

 "isExtend": true,

 simpleVOs: []

 };

 condition.simpleVOs.push({

 field: 'productOfflineRetail.businessAttribute', // 字段

 op: 'eq', // in like nin...

 value1: 3

 });

 this.setTreeFilter(condition);

});

// 真实场景示例： https://www.yuque.com/docs/share/4d8aa155-e05f-47ed-96f0-578dfc4801cf?# 《扩展开发-级联参照开发》

 

// 如果是子表参照gridModel监听的beforeBrowse事件，

gridModel.on('beforeBrowse',function(arg){

 // 上面第一种加参数，

 var condition = {

 "params1":111, // 自定义参数

 "params2":222,

 };

 arg.context.setCondition(condition); // conditon是你需要拼接的参数

 // 上面第二种加参数

 arg.carryParams.params1 = 111

 arg.carryParams.params2 = 111

 // 上面第三种加参数

 var condition = {

 "params1":111, // 自定义参数

 "params2":222,

 };

 arg.context.setTreeFilter(condition);

})

如果参照不是在卡片上，则需要用别的方式获取参照模型

// 以上viewmodel.get("cName")获取当前参照model，如果是表格内的参照你需要先获取当前的表格模型，

viewmodel.getGridModel().on('beforeBrowse',function(arg){

 ***

})

// 如果是查询区的参照获取参照模型，则需要在查询区的扩展脚本内，

viewmodel.get('xxx').getFromModel().on('beforeBrowse',function(arg){

 ***

})

参照携带竖线意思：
左侧携带是全部覆盖，右侧是有值不覆盖，没值填充

参照确定按钮点击事件

referModel.on('afterInitVm',function(arg){

 arg.vm.on('beforeOkClick',function(){})

 arg.vm.on('afterOkClick',function(){})

})

参照值改变前事件

referModel.on('beforeValueChange',function(data){})

参照点击前事件

referModel.on('beforeBrowse',function(data){})

## [](#7如何获取参照的refertype)7.如何获取参照的referType

referModel.on('afterInitVm',function(arg){

 const vm = arg.vm;

 const referType = vm.getCache('referType') // Tree || Table || TreeTable || TreeList || TransferTable || HasSelectTable

})

## [](#8参照如何动态切换单选多选状态)8.参照如何动态切换单选多选状态

referModel.setMultiple(bool)

## [](#9卡片如何配置多选参照)9.卡片如何配置多选参照

如果配置控件类型为Refer的话，多选参照的name是非持久化存储，在编辑进入详情的时候，无法查到name字段，就无法正确显示参照的数据，故需要将字段的控件类型配置成Tag，以子表形式存储多选的字段。

tag配置参考以下excel:
[招聘职位卡片](https://docs.yonyoucloud.com/l/0e33bc7f87b5 【友空间云文档】招聘职位卡片.xlsm)

招聘职位运行时界面参考:

人力服务-招聘管理-招聘职位

费用项目excel:
[费用项目业务单元分配卡片](https://docs.yonyoucloud.com/l/7c13242c91f9 【友空间云文档】费用项目业务单元分配卡片.xlsm)

如果是设计器开发的

[20220707-低代码对参照多选设置支持](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=7511678)

## [](#10参照赋值默认值根据id赋值)10.参照赋值默认值(根据id赋值)

// item为参照referModel

cb.utils.triggerReferBrowse(item, [{ field: 'id', op: 'eq', value1: defaultValue }]);

## [](#11cn参照赋值默认值)11.CN参照赋值默认值

this.model = new cb.models.ReferModel({

 cRefType: 'ucf-org-center.bd_factoryorg',

 displayname: 'name', // 显示字段的key

 valueField: 'id',

 externalData: "filter",

 domainKey: 'productcenter',

 value:'1501176823582976', // id值

 text:'新世界', // name值

});

## [](#12如何让参照可直接手动录入)12.如何让参照可直接手动录入

// 如果前端实现

referModel.setState('inputValid',true) // 获取referModel见第7条

// 如果后端实现

在使用参照的billitem_base表里面的cExtProps里面配置一个inputValid为true即可

## [](#13表格内参照多选如何不增行)13.表格内参照多选如何不增行

// 如果前端实现

referModel.setState('returnText',true) // 获取referModel见第7条

// 如果后端实现

在使用参照的billitem_base表里面的cExtProps里面配置一个returnText为true即可

## [](#14参照支持智能搜索参照提供方或参照使用方仅一方配置即可)14.参照支持智能搜索（参照提供方或参照使用方仅一方配置即可）

// 1.参照使用方配置

// 如果是普通的单据中主表 || 子表上的参照

在单据billitem_base表里面的cStyle配置一个字段配置bSmartSearch为true即可

// 如果是查询区参照

在查询区pb_meta_filter_item表的extendField字段配置bSmartSearch为true即可

// 如果是cn参照

this.model = new cb.models.ReferModel({

 // ...

 bSmartSearch:true

});

// 2.参照提供方配置

在参照pub_ref表里面的extendField字段配置一个字段bSmartSearch为true即可，这样，所有使用该参照的单据，均支持智能搜索。

运行时效果：
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Refercanzhaochangyongkuozhanshuliimage3.9fe23177.png)
注意：如果对于树参照，参照UI模板的searchTree容器下得有controls才行（参照提供方处理）
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Refercanzhaochangyongkuozhanshuliimage4.18a96ef5.png)
cItemName配具体数据 如 正常的 code name id， 里面的其它字段随便配

## [](#15参照智能搜索只显示一列)15.参照智能搜索只显示一列

// 1.参照使用方配置

// 如果是普通的单据中主表 || 子表上的参照

在单据billitem_base表里面的cStyle配置一个字段配置bSmartSearch为true

且bSmartSearchType配置为select

// 如果是查询区参照

在查询区pb_meta_filter_item表的extendField字段配置bSmartSearch为true

且bSmartSearchType配置为select

// 如果是cn参照

this.model = new cb.models.ReferModel({

 // ...

 bSmartSearch:true,

 bSmartSearchType: 'select'

});

// 2.参照提供方配置

在参照pub_ref表里面的extendField字段配置一个字段bSmartSearch为true且bSmartSearchType配置为select，这样，所有使用该参照的单据，均在智能搜索时显示一列

运行时效果：
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Refercanzhaochangyongkuozhanshuliimage5.5235287d.png)

## [](#16参照扩展修改搜索框placeholder)16.参照扩展修改搜索框placeholder

// 扩展代码

referModel.on('afterInitVm',function(arg){

 const vm = arg.vm;

 vm.get('tree').setState('placeholder', '**'); // 树参照修改placeholder

 vm.get('searchBox').setState('placeholder', '**'); // 表参照|| 树表参照修改 placeholder

})

// 后端配置

表参照pub_ref表extendField配置refTablePlaceholder

## [](#17带查询区的参照如何给查询区赋默认值或者获取参照查询区字段模型)17.带查询区的参照如何给查询区赋默认值（或者获取参照查询区字段模型）

referModel.on('afterInitVm', function(arg){

 const referViewModel = arg.vm;

 referViewModel.on('afterInitCommonViewModel',function(){

 const filterViewModel = referViewModel.getCache('FilterViewModel');

 filterViewModel.on('afterInit', () => {

 const filterItemModel = filterViewModel.get('xxx').getFromModel() //参照查询区字段模型获取方式，xxx指的是查询区字段编码

 filterItemModel.setValue('111');

 })

 })

})

## [](#18获取参照内树模型或者表格模型)18.获取参照内树模型或者表格模型

// 获取参照中的表格模型 referModel的获取如果在查询区，请参考https://gfwiki.yyrd.com/pages/viewpage.action?pageId=20772758

referModel.on('afterInitVm',function(arg){

 arg.vm.get('table')

})

// 获取参照中树模型

referModel.on('afterInitVm',function(arg){

 arg.vm.get('tree')

})

// 如果是在参照的扩展脚本内

viewModel.get('tree') || viewModel.get('table')

## [](#19listrefer和treerefer及树参照如何将code和name同时显示如果想显示多个字段后面继续拼接即可)19.listRefer和treeRefer及树参照，如何将code和name同时显示(如果想显示多个字段，后面继续拼接即可)

将参照的pub_ref表的extendField配置一个titleField字段值为"<%code%>
<%name%>",如下图
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Refercanzhaochangyongkuozhanshuliimage6.721c33e7.png)

## [](#20参照模糊搜索配置说明只针对表参照和左树右表参照)20.参照模糊搜索配置说明（只针对表参照和左树右表参照）

单据运行时界面
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Refercanzhaochangyongkuozhanshuliimage7.edb5888f.png)

**领域级开关**

模糊搜索配置功能，默认是没有的，如果需要这个功能，需要领域将这个特性（supportConfigCheckFlds）在统一node配置上即可，每个领域都有对应的负责人）。

模糊搜索字段修改后，改的是参照pub_ref表的 cCheckFlds
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Refercanzhaochangyongkuozhanshuliimage8.e8e8e108.png)

备注：
如果一个领域某些单据不需要这个功能可以在单据扩展脚本执行viewmodel.disableFeature('supportConfigCheckFlds')
即可

**参照级开关**

在参照的pub_ref表里面的extendField字段里面配置一个supportConfigCheckFlds值为true即可，这样所有使用该参照的单据都有这个功能了

## [](#21树参照只选末级非懒加载树)21.树参照只选末级（非懒加载树）

1.扩展脚本实现

referModel.setState('treeTypeValue', '3');

## [](#22带查询区的参照如何给查询区内参照增加参数或者参照内导航树)22.带查询区的参照如何给查询区内参照增加参数(或者参照内导航树)

referModel.on('afterInitVm',function (arg){

 const referViewModel = arg.vm;

 referViewModel.on('afterInitCommonViewModel', function() {

 const filterViewModel = referViewModel.getCache('FilterViewModel');

 filterViewModel.on('afterInit', function (){

 const filterReferModel = filterViewModel.get('**').getFromModel(); // **为参照code

 filterReferModel.on('beforeBrowse',function(data){

 // 参照第六条

 })

 })

 })

})

## [](#23如何配置一个穿梭参照)23.如何配置一个穿梭参照

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Refercanzhaochangyongkuozhanshuliimage9.0762f698.png)

在参照pub_ref表的cTpltype配置成TransferTable即可，别的和普通的表参照一样就行

## [](#24树参照如何支持code和name均可搜索)24.树参照如何支持code和name均可搜索

参照提供者的pub_ref表配置extendField增加一个filters字段，值为["code","name"]即可

## [](#25树参照设置默认展开层级)25.树参照设置默认展开层级

treeModel.setState('expandLayer', 3); // 默认展开3层

treeModel获取参考18条

## [](#26参照弹窗的关闭事件)26.参照弹窗的关闭事件

// vm获取参考上面第8条

vm.on('referModalClose',function(){

 //参照弹窗取消 或者关闭事件

})

## [](#27参照过滤支持默认选中默认隐藏默认选中并隐藏精准搜索)27.参照过滤支持默认选中/默认隐藏/默认选中并隐藏精准搜索

① 参照使用方修改方法：

//afterBrowse或其他事件(referViewModel的listener中包括referToolbar即可)中触发改变

referModel.on('afterBrowse', () => {

 //params必须为对象，实际情况只需要以下三个字段之一就可以

 const params = {

 exactSearchDefaultChecked: true, // 默认选中

 exactSearchDefaultHide：true, // 默认隐藏

 exactSearchDefaultCheckedAndHide: true, // 默认选中并隐藏精准搜索

 etc... // 其他想配置的条件（非必须）

 }

 referModel.getCache('vm').doPropertyChange('setState', {'exactSearchParams': params});

})

② 参照提供方使用方法：
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Refercanzhaochangyongkuozhanshuliimage10.8fb7db68.png)

//只需在extendField中配置如下参数即可

//params必须为对象，实际情况只需要以下三个字段之一就可以

const params = {

 exactSearchDefaultChecked: true, // 默认选中

 exactSearchDefaultHide：true, // 默认隐藏

 exactSearchDefaultCheckedAndHide: true, // 默认选中并隐藏精准搜索

 etc... // 其他想配置的条件（非必须）

}

const extendFieldStr = JSON.stringify({'exactSearchParams': params})

 

//Meta返回数据如下即可：

extendField：<JSON> extendFieldStr

## [](#28参照只支持选择不支持手动录入)28.参照只支持选择不支持手动录入

参照使用方billItem_base表的的cStyle配置bCanHandleInput为false

## [](#29表形参照新增回显前置事件)29.表形参照新增回显前置事件

referViewModel.on('beforeRefReturnInsertRow', (data) => {

 //data为保存成功后返回到前端的数据

 ************

 Your Business Logic

 Your Business Logic

 Your Business Logic

 ************

 return false； //此处会取消默认插入到第一行的行为

})

## [](#30参照配置servicecode参照新增和参照上的查询方案均使用参照提供方配置的servicecode)30.参照配置serviceCode（参照新增和参照上的查询方案均使用参照提供方配置的serviceCode）

参照的pub_ref表的extendField配置一个serviceCode属性即可

## [](#31参照明明选择了多行左下角却只显示选了一条)31.参照明明选择了多行，左下角却只显示选了一条

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Refercanzhaochangyongkuozhanshuliimage11.7aa8691f.png)

参照的pub_ref配置的cEntityKeyFld为参照数据的唯一标识（参照getRefMeta接口返回的cEntityKeyFld字段），cEntityKeyFld如果是id，出现这个情况，就是参照数据的id重复导致的

## [](#32树形表参照treelist多选支持包含下级)32.树形表参照（treelist）多选支持包含下级

参照提供方的参照pub_ref配置的extendField增加includeChildren属性，value为树形表某一列的cItemName（如："code"）

## [](#33隐藏参照新增按钮)33.隐藏参照新增按钮

referModel.on('afterInitVm', function(arg){

 const vm = arg.vm;

 vm.get('btnAdd').setVisible(false);

})

## [](#34修改参照提供方扩展属性--参照唯一值)34.修改参照提供方扩展属性 || 参照唯一值

referModel.on('afterInitVm',function (arg){

 const vm = arg.vm;

 vm.on('afterGetRefMeta',function (params){

 params.refEntity.extendField = *** // 需要先JSON.parse 再JSON.stringify()

 params.refEntity.cEntityKeyFld = ** // 修改参照唯一值

 })

})

## [](#35隐藏参照已选区域)35.隐藏参照已选区域

referModel.on('afterInitVm',function(arg){

 const vm = arg.vm;

 vm.get('table').setState('showSelRows', false);

})

## [](#36根据参照数据id获取id对应的全部数据)36.根据参照数据id获取id对应的全部数据

// item为参照referModel **为参照数据的id值

const res = await cb.utils.getRefDataByCommon(item, [{ field: 'id', op: 'eq', value1: '**' }]);

// 如果需要查全部数据，第二个参数为空数组([])即可

// 用法如下图，返回的是一个promise

 

// 如果需要修改别的参数

referModel.on('beforeGetRefDataByParams', function(params){

 // 直接修改params ，可以改pageSize等

})

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Refercanzhaochangyongkuozhanshuliimage12.d183d2e3.png)

## [](#37动态修改参照code)37.动态修改参照code

referModel.setRefCode(code, cRefRetId)

// code为参照编码

// cRefRetId为参照携带，是个json字符串

## [](#38参照没有回显mdd单据)38.参照没有回显（MDD单据）

// 1、查看参照唯一标识（查看getRefMeta接口返回的refEntity.cEntityKeyFld值，比如："id"）

// 2、参照使用方得配置这个参照携带必须包含id（将id赋值给另一个字段,也就是说cRefRetId中有一个配置为："**":"id"）

以上两条均满足即可

## [](#39树参照包含下级勾选父自动选中子)39.树参照包含下级（勾选父自动选中子）

// 1、参照使用方billitem_base表cStyle配置treeType为"1"(表单内) || 参照使用方pb_meta_filter_item表extendField字段配置treeType为"1"(查询区)

或者

// 2、treeModel.setState('treeTypeValue', '1');

## [](#40动态修改参照的label)40.动态修改参照的label

referModel.setState('caption', '***');

## [](#41树参照控制某一个节点不可选中)41.树参照控制某一个节点不可选中

在当前树参照数据中维护selectable属性，如：

[{

 "name": "节点1",

 "code": "node2",

 "selectable": true // 节点可选

}, {

 "name": "节点1",

 "code": "node2",

 "selectable": false // 节点不可选

}]

在当前树参照数据中维护disabled属性，如：

[{

 "name": "节点1",

 "code": "node2",

 "disabled": true // 节点不可选

}, {

 "name": "节点1",

 "code": "node2",

 "disabled": false // 节点可选

}]

## [](#42refergroup参照加过滤条件)42.referGroup参照加过滤条件

referModel.on('referGroupInitVm', function(arg){

 const vm = arg.vm;

 vm.on('beforeGetRefData', function(params){

 // 修改params即可

 })

})

## [](#43refergroup参照修改参照树数据及设置只选末级)43.referGroup参照修改参照树数据及设置只选末级

referModel.on('referGroupInitVm', function(arg){

 const vm = arg.vm;

 vm.setCache('onlyLast', true) // 设置只选末级

 const treeModel = vm.get('tree')

 treeModel.on('beforeSetDataSource', function(data){

 // 修改data数据，

 })

})

## [](#44treetable类型参照只给左侧树加过滤条件)44.treeTable类型参照只给左侧树加过滤条件

referModel.on('afterInitVm', function(arg){

 const vm = arg.vm;

 vm.on('beforeGetRefTreeData', function(params){

 // 修改params即可

 })

})

## [](#45treetable类型参照初始化不加载右侧数据)45.treeTable类型参照，初始化不加载右侧数据

// 参照提供方修改pub_ref表的extendField配置defaultNoSearchData为true即可

## [](#46treetable类型参照左侧树只能选末级)46.treeTable类型参照，左侧树只能选末级

referModel.on('afterInitVm', function(arg){

 const vm = arg.vm;

 vm.get('tree').setCache('onlyLast')

})

## [](#47树参照包含同级按钮点击不生效)47.树参照包含同级按钮点击不生效

检查参照getRefMeta返回的cEntityKeyFld字段，

1、cEntityKeyFld如果是id，就需要检查下getRefData返回的数据，需要保证父的id值等于子的parent值，

2、如果cEntityKeyFld如果是code，就需要检查下getRefData返回的数据，需要保证父的code值等于子的parent_code值（如果没有parent_code值，建议找参照提供方将参照pub_ref表的cEntityKeyFld改成id）

## [](#49参照点击弹出自定义弹窗)49.参照点击弹出自定义弹窗

referModel.setState('selfDefineClick', function() {

 // 执行你弹窗弹出事件

});

## [](#50参照请求前置事件)50.参照请求前置事件

referModel.on('afterInitVm', function(arg){

 const vm = arg.vm;

 vm.on('beforeGetRefData', function(param){

 // 修改param参数改变请求条件

 })

})

## [](#51表参照隐藏重置按钮)51.表参照隐藏重置按钮

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Refercanzhaochangyongkuozhanshuliimage13.67ba6acb.png)

referModel.on('afterInitVm', function(arg){

 const vm = arg.vm;

 vm.get('reload').setVisible(false)

})

导航树参照支持包含下级

查询区字段cExtProps增加filterSearchIncludesSub属性

## [](#52修改参照请求的externaldata数据)52.修改参照请求的externalData数据

referModel.on('beforeBrowse', function(arg){

 this._set_data('externalData', ****);

})