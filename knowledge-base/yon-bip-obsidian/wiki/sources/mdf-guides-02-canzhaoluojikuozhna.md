---
title: "参照逻辑扩展"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/02-canzhaoluojikuozhna"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 14
---

# 参照逻辑扩展

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/02-canzhaoluojikuozhna | 所属：指南

# [](#参照逻辑扩展)参照逻辑扩展

<!-- -->

- 实现原理[《Refer 参照》](#/components-web/01-refer)

## [](#1-修改参照弹窗title)1. 修改参照弹窗title

方案1 ：修改参照使用方引用字段的cShowCaption(billitem_base表)

方案2: referModel.setState('modalTitle', '***');

## [](#2-自定义参照加载过滤区打开参照直接加载数据)2. 自定义参照加载过滤区，打开参照直接加载数据  

//参照自动加载数据

let taskPlan= viewmodel.get('task_plan_id_Name');

taskPlan.on('afterInitVm',function () {

 const referViewModel=taskPlan.getCache('vm');

 referViewModel.on('afterInitCommonViewModel',function () {

 const filterVieModel=referViewModel.getCache('FilterViewModel');

 filterVieModel.getParams().autoLoad=true;

 })

})

## [](#3-动态修改表参照的rowkeyfield)3. 动态修改表参照的rowKeyField

referModel.on('afterInitVm',function(){

 const referViewModel = this.getCache('vm');

 referViewModel.on('getRefMetaReady',function(){

 referModel.setState('refKeyField', '***');

 });

})

## [](#4-如何给参照添加请求参数和值)4. 如何给参照添加请求参数和值

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

 "params1":111, // 自定义参数

 "params2":222,

 };

 this.setTreeFilter(condition);

 });

 

 

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

## [](#5-如果参照不是在卡片上则需要用别的方式获取参照模型)5. 如果参照不是在卡片上，则需要用别的方式获取参照模型

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

 

arg.vm.on('afterOkClick',function(){})

 

})

 

参照值改变前事件

 

referModel.on('beforeValueChange',function(data){})

 

 

参照点击前事件

 

referModel.on('beforeBrowse',function(data){})

## [](#6-如何获取参照的refertype)6. 如何获取参照的referType

referModel.on('afterInitVm',function(arg){

 const vm = arg.vm;

 const referType = vm.getCache('referType') // Tree || Table || TreeTable || TreeList || TransferTable || HasSelectTable

})

## [](#7-参照如何动态切换单选多选状态)7. 参照如何动态切换单选多选状态

referModel.setMultiple(bool)

## [](#8-卡片如何配置多选参照)8. 卡片如何配置多选参照

如果配置控件类型为Refer的话，多选参照的name是非持久化存储，在编辑进入详情的时候，无法查到name字段，就无法正确显示参照的数据，故需要将字段的控件类型配置成Tag，以子表形式存储多选的字段。

tag配置参考以下excel：

![](data:image/png;base64,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)

招聘职位运行时界面参考：

人力服务-招聘管理-招聘职位

费用项目excel:

![](data:image/png;base64,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)

## [](#9-参照赋值默认值根据id赋值)9. 参照赋值默认值(根据id赋值)

// item为参照referModel

cb.utils.triggerReferBrowse(item, [{ field:'id', op:'eq', value1:defaultValue }]);

## [](#10-cn参照赋值默认值)10. CN参照赋值默认值

this.model = new cb.models.ReferModel({

 cRefType: 'ucf-org-center.bd_factoryorg',

 displayname: 'name', // 显示字段的key

 valueField: 'id',

 externalData: "filter",

 domainKey: 'productcenter',

 value:'1501176823582976', // id值

 text:'新世界', // name值

 });

## [](#11-如何让参照可直接手动录入)11. 如何让参照可直接手动录入

referModel.setState('inputValid',true) // 获取referModel见第7条

## [](#12-表格内参照多选如何不增行)12. 表格内参照多选如何不增行

referModel.setState('returnText',true) // 获取referModel见第7条

## [](#13-参照支持智能搜索)13. 参照支持智能搜索

// 1.参照使用方配置

 

// 如果是普通的单据中主表 || 子表上的参照

在单据billitem_base表里面的cStyle配置一个字段配置bSmartSearch为true即可

 

// 如果是查询区参照

在查询区pb_meta_filter_item表的extendField字段配置bSmartSearch为true即可

 

// 如果是cn参照

this.model = new cb.models.ReferModel({

 // ...

 bSmartSearch:true 

})

 

// 2.参照提供方配置

 

// 在参照pub_ref表里面的extendField字段配置一个字段bSmartSearch为true即可，这样，所有使用该参照的单据，均支持智能搜索。

运行时效果：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/canzhaoluojikuozhna_image3.8977c817.png)

注意：如果对于树参照，参照UI模板的searchTree容器下得有controls才行（参照提供方处理）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/canzhaoluojikuozhna_image4.088652f3.png)

cItemName配具体数据 如 正常的 code name id， 里面的其它字段随便配

## [](#14-参照智能搜索只显示一列)14. 参照智能搜索只显示一列

// 1.参照使用方配置

 // 如果是普通的单据中主表 || 子表上的参照

 在单据billitem_base表里面的cStyle配置一个字段配置bSmartSearch为true 且bSmartSearchType配置为select

 // 如果是查询区参照

 在查询区pb_meta_filter_item表的extendField字段配置bSmartSearch为true 且bSmartSearchType配置为select

 // 如果是cn参照

 this.model = new cb.models.ReferModel({

 // ...

 bSmartSearch:true, 

 bSmartSearchType: 'select'

 });

 

// 2.参照提供方配置

在参照pub_ref表里面的extendField字段配置一个字段bSmartSearch为true且bSmartSearchType配置为select，这样，所有使用该参照的单据，均在智能搜索时显示一列

**运行时效果：**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/canzhaoluojikuozhna_image5.a3c2b213.png)

## [](#15-参照扩展修改搜索框placeholder)15. 参照扩展修改搜索框placeholder

referModel.on('afterInitVm',function(arg){

 const vm = arg.vm;

 vm.get('tree').setState('placeholder', '**'); // 树参照修改placeholder

 vm.get('searchBox').setState('placeholder', '**'); // 表参照|| 树表参照修改 placeholder

})

## [](#16-带查询区的参照如何给查询区赋默认值)16. 带查询区的参照如何给查询区赋默认值

referModel.on('afterInitVm',function(arg){

 const referViewModel = arg.vm;

 referViewModel.on('afterInitCommonViewModel',function(){

 const filterViewModel = referViewModel.getCache('FilterViewModel');

 filterViewModel.on('beforeSearch',function(arg){

 // arg内就是查询参数，直接修改arg即可

 });

 })

})

库存领域扩展脚本文件

![](data:image/png;base64,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)

下载后需要解压为zip后缀

## [](#17-获取参照内树模型或者表格模型)17. 获取参照内树模型或者表格模型

// 获取参照中的表格模型

referModel.on('afterInitVm',function(arg){

 arg.vm.get('table')

})

// 获取参照中树模型

referModel.on('afterInitVm',function(arg){

 arg.vm.get('tree')

})

 

// 如果是在参照的扩展脚本内

viewModel.get('tree') || viewModel.get('table')

## [](#18-listrefer和treerefer如何将code和name同时显示)18. listRefer和treeRefer如何将code和name同时显示

将参照的pub_ref表的extendField配置一个titleField字段值为"<%code%>
<%name%>",如下图

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/canzhaoluojikuozhna_image7.9d954880.png)

## [](#19-参照模糊搜索配置说明只针对表参照和左树右表参照)19. 参照模糊搜索配置说明（只针对表参照和左树右表参照）

单据运行时界面

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/canzhaoluojikuozhna_image8.4fb6190f.png)

**1、领域级开关**

模糊搜索配置功能，默认是没有的，如果需要这个功能，需要领域将这个特性（supportConfigCheckFlds）在统一node配置上即可，每个领域都有对应的负责人）。

模糊搜索字段修改后，改的是参照pub_ref表的 cCheckFlds

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/canzhaoluojikuozhna_image9.b845def4.png)

备注：
如果一个领域某些单据不需要这个功能可以在单据扩展脚本执行viewmodel.disableFeature('supportConfigCheckFlds')
即可

**2、参照级开关**

在参照的pub_ref表里面的extendField字段里面配置一个supportConfigCheckFlds值为true即可，这样所有使用该参照的单据都有这个功能了

## [](#20-树参照只选末级非懒加载树)20. 树参照只选末级（非懒加载树）

1.扩展脚本实现

referModel.setState('treeTypeValue', '3');

## [](#21-带查询区的参照如何给查询区内参照增加参数)21. 带查询区的参照如何给查询区内参照增加参数

referModel.on('afterInitVm', function (arg) {

 const referViewModel = arg.vm;

 referViewModel.on('afterInitCommonViewModel', function () {

 const filterViewModel = referViewModel.getCache('FilterViewModel');

 filterViewModel.on('afterInit', function () {

 const filterReferModel = filterViewModel.get('**').getFromModel(); // **为参照code

 filterReferModel.on('beforeBrowse', function (data) {

 // 参照第六条

 })

 })

 })

})referModel.on('afterInitVm', function (arg) {

 const referViewModel = arg.vm;

 referViewModel.on('afterInitCommonViewModel', function () {

 const filterViewModel = referViewModel.getCache('FilterViewModel');

 filterViewModel.on('afterInit', function () {

 const filterReferModel = filterViewModel.get('**').getFromModel(); // **为参照code

 filterReferModel.on('beforeBrowse', function (data) {

 // 参照第六条

 })

 })

 })

})

## [](#22-如何配置一个穿梭参照)22. 如何配置一个穿梭参照

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/canzhaoluojikuozhna_image10.c2e4e886.png)

在参照pub_ref表的cTpltype配置成TransferTable即可，别的和普通的表参照一样就行

## [](#23-树参照如何支持code和name均可搜索)23. 树参照如何支持code和name均可搜索

参照提供者的pub_ref表配置extendField增加一个filters字段，值为["code","name"]即可

## [](#24-树参照设置默认展开层级)24. 树参照设置默认展开层级

referModel.setState('spreadXlevel', 3) // 默认展开3级

## [](#25-参照弹窗的关闭事件)25. 参照弹窗的关闭事件

// vm获取参考上面第8条

vm.on('referModalClose',function(){

 //参照弹窗取消 或者关闭事件

})

## [](#26-参照模型获取)26. 参照模型获取

在单据的扩展脚本中通过ReferModel中缓存（Cache）的'vm'属性，获取弹出参照中的模型，拿到编程模型之后可按API提供的能力进行扩展编程。如下：

 

// 获取卡片中弹出参照的模型

viewmodel.get('field1').getCache('vm').getTreeModel();

// 获取表格中弹出参照的模型

viewmodel.get('table1').getEditRowModel().get('column1').getCache('vm').getTreeModel();

 

// 获取卡片中弹出参照的模型

viewmodel.get('field1').getCache('vm').getGridModel();

// 获取表格中弹出参照的模型

viewmodel.get('table1').getEditRowModel().get('column1').getCache('vm').getGridModel();

## [](#27-参照中初始化的模型)27. 参照中初始化的模型

参照中初始化的编程模型，被初始化的模型都可以通过上述方法获取。

// 参照中模型初始化代码片段

var fields = {

 referInput: new cb.models.SimpleModel(),

 referButton: new cb.models.SimpleModel(),

 filter: new cb.models.SimpleModel(),

 reload: new cb.models.SimpleModel(),

 searchBox: new cb.models.SimpleModel(),

 tree: new cb.models.TreeModel({

 keyField: 'code',

 titleField: 'name',

 multiple: this.getParams().multiple

 }),

 table: new cb.models.GridModel({

 showAggregates: false,

 multiple: this.getParams().multiple,

 dataSourceMode: 'remote',

 override: cb.rest.interMode === 'touch' ? false : true,

 pageInfo: { pageSize: pageSize, pageIndex: 1 }

 }),

 submit: new cb.models.SimpleModel(),

 cancel: new cb.models.SimpleModel(),

 switch: new cb.models.SimpleModel()

};

this.setData(fields);

## [](#28-参照联动以省市参照联动)28. 参照联动（以省市参照联动）

新建一个文件名为AA_enterprise_VM.Extend.js放到omc_test_web/src/client/business/AA下

里面init函数内代码如下：

init: function (viewmodel) {

 // 在城市参照弹出之前，获取省参照的value，通过setFilter将value存放到过滤条件中（在城市参照获取城市列表时，会通过getFilter()获取value，作为过滤参数传到服务端）

 viewmodel.get("bankcity").on('beforeBrowse', function (data) {

 var provinceValue;

 if(!viewmodel.get("bankprovince").getValue()){

 cb.utils.alert("请选择开户省");

 return false;

 }else{

 provinceValue = viewmodel.get("bankprovince").getValue();

 }

 var condition = {

 "isRefreshData": true,

 "parentId":provinceValue,

 "province":provinceValue

 };

 this.setFilter(condition);

 });

 // 如果省参照的值有改变，就将城市参照的值清空

 viewmodel.get("bankprovince").on('afterValueChange', function (data) {

 viewmodel.get("bankcity").setValue(null);

 });

}

注：

- 

"bankcity"为城市选择参照的字段名称（excel表中对应的cFieldName）

- 

"bankprovince"
为省选择参照的字段名称，provinceValue为获取的省选择参照的id。

- 

模版内所有字段名称可在 omc_test_web/autogenerate/viewmodel/AA
下自动生成的对应的渲染模版js文件内找到

- 

"beforeBrowse"为城市选择参照，参照model弹出前的方法

## [](#29-参照动态增加参数)29. 参照动态增加参数

使用simpleVOs

示例1：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/canzhaoluojikuozhna_image11.3fd3b88d.png)

示例2

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/canzhaoluojikuozhna_image12.34709ef9.png)

示例3

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/canzhaoluojikuozhna_image13.49e7fd7c.png)

示例4

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/canzhaoluojikuozhna_image14.cb0f120b.png)

## [](#30-获取参照的refertype)30. 获取参照的referType

viewmodel.get("xxx").on('afterInitVm',function(arg){

 const vm = arg.vm;

 vm.on('getRefMetaReady',function(){

 const referType = vm.getCache('referType')

 console.log(referType)

 })

})

## [](#31-参照如何动态切换单选多选状态)31. 参照如何动态切换单选多选状态

viewmodel.getGridModel().getEditRowModel().get('xxx').setMultiple(false);

## [](#32-表格内参照多选如何不增行)32. 表格内参照多选如何不增行

viewmodel.getGridModel().getEditRowModel().get('xxx').setState('returnText',true)

## [](#33-隐藏参照弹窗新增按钮)33. 隐藏参照弹窗新增按钮

// 单据扩展脚本

referModal.on('afterInitVm',function(arg){

 const vm = arg.vm;

 vm.on('afterInit',function(){

 vm.get('btnAdd').setVisible(false);

 })

})

 

// 参照扩展脚本 viewModel为参照扩展脚本入口viewModel

viewModel.on('afterInit',function(){

 viewModel.get('btnAdd').setVisible(false);

})