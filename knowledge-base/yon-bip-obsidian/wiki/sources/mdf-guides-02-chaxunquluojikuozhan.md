---
title: "查询区逻辑扩展"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/02-chaxunquluojikuozhan"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 查询区逻辑扩展

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/02-chaxunquluojikuozhan | 所属：指南

# [](#查询区逻辑扩展)查询区逻辑扩展

由于查询区的UI元数据不随标准协议接口返回，在单据的扩展脚本的viewmodel中无法获取查询区的字段模型，因此查询区可以增加单独的扩展脚本，在扩展脚本中实现类似模板扩展脚本中的交互。查询区扩展脚本也是放在business文件夹中。

**查询区所有逻辑请写在查询区扩展文件里，脚本联动配置如果通过脚本配置的话也请在查询区的脚本中修改，查询区扩展脚本的viewmodel是单独的filterViewModel，不是单据的viewmodel，请悉知。**

**脚本联动开启方式：脚本联动在查询区组件的cStyle配置{"designSolutionExtend":
true}，或者查询区脚本中viewmodel.getParams().designSolutionExtend =
true**

## [](#1-命名规则)1. 命名规则

查询区的扩展文件名是在excel中配置的。在excel中[pb_meta_filters]表中behaviorObject字段定义当前查询区扩展文件的路径，如果excel中无此列字段可手动添加。查询区扩展脚本也放在子产品编码文件夹下。

默认规范：'子产品编码_'+'单据编码_'+'filterVM.Extend.js'。

**eg:** EMM_emm_inspectstd_list_filterVM.Extend.js

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/chaxunquluojikuozhan_image1.98474242.png)

**注：** 查询区扩展脚本定义需加上子产品编码文件夹路径，如：
EMM/EMM_emm_inspectstd_list_filterVM.Extend.js

## [](#2-加载流程和逻辑)2. 加载流程和逻辑

在查询区的公共脚本（filterViewModel.js）中一段代码用于加载查询区的扩展脚本，如下：

proxy.getInitFilterInfo(params, function (errors, results) {

 ...

 if (data && data.behaviorObject && !extendInit) {

 ...

 cb.require([data.behaviorObject], function (extend) {

 extend.doAction('init', viewModel);

 self.extendReady1(viewModel, results, solutionId, viewId);

 }, function (error) {

 console.error(error.message);

 self.extendReady1(viewModel, results, solutionId, viewId);

 })

 }

 ...

});

## [](#3-使用方式)3. 使用方式

查询区扩展脚本的使用方式和单据扩展一致。

cb.define([ 'common/common_list_VM.Extend.js' ], function(common) {

 var emm_emm_inspectstd_list_filterVM_Extend = {

 doAction: function(name, viewmodel) {

 if (this[name]) {

 this[name](viewmodel);

 }

 },

 init: function(viewmodel) {

 common.initOrgFilter(viewmodel, 'pk_org');

 common.initCardFilter(viewmodel, 'pk_org', 'pcstdlkvos__pk_equip');

 }

 };

 try {

 module.exports = emm_emm_inspectstd_list_filterVM_Extend;

 } catch (error) {

 console.log(error);

 }

 return emm_emm_inspectstd_list_filterVM_Extend;

});

## [](#4-生命周期)4. 生命周期

cb.define([ 'common/common_list_VM.Extend.js' ], function(common) {

 var emm_emm_inspectstd_list_filterVM_Extend = {

 doAction: function(name, viewmodel) {

 if (this[name]) {

 this[name](viewmodel);

 }

 },

 init: function(viewmodel) {

 // 查询区脚本加载前

 viewmodel.on('beforeInit', function() {

 

 });

 // 查询区脚本加载后，搜索执行前

 viewmodel.on('afterInit', function() {

 

 });

 // 报表的查询区加载后

 viewmodel.on('afterReportInit', function() {

 

 });

 // 重置按钮点击后

 viewmodel.on('afterResetClick', function() {

 

 });

 // 高级查询相关处理

 viewmodel.on('updateAdvanceModel', function() {

 

 });

 // 查询前

 viewmodel.on('beforeSearch', function() {

 

 });

 }

 };

 try {

 module.exports = emm_emm_inspectstd_list_filterVM_Extend;

 } catch (error) {

 console.log(error);

 }

 return emm_emm_inspectstd_list_filterVM_Extend;

});

典型场景

### [](#41-在列表页面中获取查询区模型获取具体查询条件模型)4.1. 在列表页面中获取查询区模型，获取具体查询条件模型

viewmodel.on('afterInitCommonViewModel',function() {

 const filterViewModel = viewmodel.getCache('FilterViewModel');

 const xxx = filterViewModel.get('xxx').getFromModel();

})

2.修改查询条件的必填

viewmodel.on('beforeInit', function() {

 viewmodel.get('xxx').setState('mustInput', true); // 搜索的时候会校验住

});

 

// 或以下代码：

viewmodel.on('beforeInit', function() {

 viewmodel.execute('updateViewMeta', {code: 'XXX', mustInput: true }) // 条件会出现*必输符号

});

 

// 或在任何时机执行

viewmodel.execute('updateViewMeta', {code: 'XXX', mustInput: true }) // 条件会出现*必输符号

### [](#42-查询条件设置默认值)4.2. 查询条件设置默认值

viewmodel.on('afterInit', function() {

 viewmodel.get('xxx').getFromModel().setValue('111');

 // 区间类型设置ToModel

 viewmodel.get('xxx').getToModel().setValue('222');

});

### [](#43-设置单据是否自动搜索)4.3. 设置单据是否自动搜索

viewmodel.on('afterInit', function() {

 viewmodel.getParams().autoLoad = false;

});

### [](#44-查询方案隐藏)4.4. 查询方案隐藏

只隐藏查询方案列表：

列表中：修改billtplgroup_base表中，对应类型为ConvenientQuery的容器，在cStyle中配置{"bHideFilterScheme":
true}

参照中：修改pub_ref表中，对应参照的extendField，配置{"bHideFilterScheme":
true}

隐藏查询方案整个容器：

viewmodel.setState('bHideFilterScheme', true);

### [](#45-查询方案中自定义过滤条件按钮隐藏)4.5. 查询方案中自定义过滤条件按钮隐藏

列表中：修改billtplgroup_base表中，对应类型为ConvenientQuery的容器，在cStyle中配置{"bHideAddDefFilterItemBtn":
true}

参照中：修改pub_ref表中，对应参照的extendField，配置{"bHideAddDefFilterItemBtn":
true}

### [](#46-隐藏搜索按钮)4.6. 隐藏搜索按钮

修改billtplgroup_base表中，对应类型为ConvenientQuery的容器，在cStyle中配置{"bHideSearchStr":
true}

### [](#47-隐藏查询条件)4.7. 隐藏查询条件

viewmodel.execute('updateViewMeta', {code:'xxx',visible:false});

// 方案设置弹窗里隐藏，需要先配置脚本联动，然后需要在第二个参数对象中增加参数 bHideItemStatesInAddAndEdit: true

viewmodel.execute('updateViewMeta', {code:'xxx',visible:false, bHideItemStatesInAddAndEdit: true});

### [](#48-时间日期数字精度设置)4.8. 时间日期、数字精度设置

时间日期类型支持配置cFormatData

数字类型支持配置precision

### [](#49-查询区日期选择器自定义footer)4.9. 查询区日期选择器自定义footer

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/chaxunquluojikuozhan_image2.3f95e7a9.png)

// 框架原始的枚举：“今天”、“昨天”等枚举项，是通过getEnumStrFetch接口获取的，如果可以直接修改接口返回值，那么可以通过修改这个枚举值来做到修改快捷项的目的，扩展脚本可以通过拿到自定义的key去进行对应日期的转换。

viewmodel.on('afterInit', () => {

 if (viewmodel.get('yourItemName').getFromModel().getValue() === 'yourKey') {

 viewmodel.get('yourItemName').getFromModel().setValue('yourValue')

 }

})

 

// 如果不修改接口返回值，仅仅是覆盖框架默认的枚举项，可以通过下面的代码实现，首先开启脚本联动，然后查询区扩展脚本中加这些代码

viewmodel.on('afterInit', () => {

 viewmodel.setCache('enumStrFetch', [{

 "nameType": "text",

 "icon": null,

 "cDataRule": null,

 "value": "2024-12-02", // 这个value可以自己算出来赋值进去

 "key": "yourKey" // 不要设定0 1 2 3 4 5 6 7 8 9等这些数字或者字符串枚举，请设置可以唯一区分的具有意义的key，否则可能在某些场景会触发框架的枚举计算

 }]

})

### [](#410-查询区搜索前修改请求参数)4.10. 查询区搜索前，修改请求参数

cb.define([], function () {

 var PC_pc_productlist_filterVM_Extend = {

 doAction: function (name, viewmodel) {

 if (this[name])

 this[name](viewmodel);

 },

 init: function (viewmodel) {

 //点击查询区搜索按钮前，将字段参数传入

 viewmodel.on('beforeSearch', function (args) {

 //设置具体的查询条件

 var condition = {

 "isExtend": true,

 simpleVOs: []

 };

 //字段stopstatus等于0的数据进行查询

 condition.simpleVOs.push({

 field: 'stopstatus',

 op: 'eq',

 value1: 0

 });

 });

 }

 }

 try {

 module.exports = PC_pc_productlist_filterVM_Extend;

 } catch (error) {}

 return PC_pc_productlist_filterVM_Extend;

});

### [](#411-手动触发搜索)4.11. 手动触发搜索

// 获取当前查询方案id

const schemeId = viewmodel.getCache('schemeId');

viewmodel.get('search').fireEvent('click', { solutionid: schemeId});

### [](#412-查询条件占多行)4.12. 查询条件占多行

当前查询方案生效：

修改pb_filter_solution_common表的cExtProps，配置{"cols":2}

全部方案生效：

修改pb_meta_filter_item表的extendField，配置{"cols":2}

### [](#413-查询方案设置中比较符禁用)4.13. 查询方案设置中比较符禁用

修改pb_meta_filter_item表中的allowUpdateCompare字段为2

### [](#414-默认展示多行查询条件)4.14. 默认展示多行查询条件

viewmodel.getParams().filterRows = 3;// 默认展示的行数

### [](#415-设置查询方案不可删除)4.15. 设置查询方案不可删除

修改pb_filter_solution表中的cExtProps，配置{"prohibitDeletion": true}

### [](#416-值改变自动搜索)4.16. 值改变自动搜索

设置备选条件默认为值改变搜索：

修改pb_meta_filter_item表中的cExtProps，配置{"bAutoflt": 1}

设置查询区面板默认条件为值改变搜索：

修改pb_filter_solution_common表中对应方案中对应条件的cExtProps，配置同上

### [](#417-高级查询切换)4.17. 高级查询切换

viewmodel.on('updateAdvanceModel', function(args) {

// do something

})

### [](#418-查询区整体禁用)4.18. 查询区整体禁用

filterViewModel.on('afterInit', () => {

 const propertyNames = filterViewModel._get_data('propertyNames');

 for (let i = 0; i < propertyNames.length; i++) {

 const propertyName = propertyNames[i];

 const property = filterViewModel.get(propertyName);

 if (!(property instanceof cb.models.FilterModel)) continue;

 const fromModel = property.getFromModel && property.getFromModel();

 const toModel = property.getToModel && property.getToModel();

 fromModel && fromModel.setState('disabled', true);

 toModel && toModel.setState('disabled', true);

 }

 filterViewModel.getCache('filterTreeCacheModel')?.setState?.('disabled', true)

 filterViewModel.execute('filterTreeUpdate', filterViewModel.getCache('filterTreeFields'))

 filterViewModel.execute('updateShowSearchCommons');

 filterViewModel.setState('btnDisabled', true)

})

### [](#419-高级按钮隐藏)4.19.  高级按钮隐藏

viewmodel.getParams().btnAdvanceIsHidden = true

### [](#420-查询区导航区扩展脚本树参照选中默认值)4.20. 查询区导航区扩展脚本树参照选中默认值

// 此方法适用于树参照！！！树参照！！！！树参照！！！！！

filterViewModel.get('id')?.getFromModel().on('afterInitVm', (res) => { // id就是你对应的那个导航区的树参照

 const treeModel = res.vm.get('tree')

 treeModel.on('afterSetDataSource', () => {

 treeModel.select(planBookId) // 选中树节点

 const TreeDataKeyMap = treeModel.get('keyMap')

 let tempId = planBookId

 const expandedKeys = [planBookId]

 while (!cb.utils.isEmpty(TreeDataKeyMap?.[tempId].parent)) { // 当节点没有父节点时

 tempId = String(TreeDataKeyMap[tempId].parent)

 expandedKeys.push(tempId)

 }

 treeModel.onExpand({expandedKeys}) // 展开节点

 })

})

### [](#421-查询区获取搜索条件值)4.21. 查询区获取搜索条件值

FilterViewModel.getSearchData() // 这个api能拿到当前面板上填写的查询条件，并且会转换对应的枚举值等需要特殊处理的数据，这个api拿到的结果就是传给后端的查询条件

### [](#422-查询区取消点击自动搜索)4.22. 查询区取消点击自动搜索

viewModel.setCache('disabledAutoFlt', true)

### [](#423-查询区特殊业务场景配置了checkbox类型的条件如何在已选条件栏将truefalse转换成对应业务含义的中文)4.23. 查询区特殊业务场景配置了checkbox类型的条件，如何在已选条件栏将true/false转换成对应业务含义的中文

// 查询区扩展脚本中

viewModel.on('beforeSetSearchCondition', searchCommons => {

 searchCommons.forEach(item => {

 // TODO: 把对应条件的value1改改就行，记得抽多语

 })

})

### [](#424-如何获取查询区三合一接口的所有内容)4.24. 如何获取查询区三合一接口的所有内容

// 查询区扩展脚本中

viewModel.on('afterGetFinterInit', result => {console.log(result}) // 这个result就是三合一接口的全部内容，具体请在netWork调试中查看getInitFilterInfo接口的返回数据