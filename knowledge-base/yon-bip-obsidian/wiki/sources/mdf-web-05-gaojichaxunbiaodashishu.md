---
title: "--高级查询表达式树"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-gaojichaxunbiaodashishu"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# --高级查询表达式树

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-gaojichaxunbiaodashishu | 所属：Web组件

# [](#高级查询表达式树)高级查询表达式树

## [](#1-示意图)1. 示意图

在查询方案编辑弹窗中，或者面板上的高级按钮打开：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/GaoJiChaXunBiaoDaShiShuimage1.451d3a39.png)

## [](#2-使用方法)2. 使用方法

该功能仅支持MDD应用使用，使用前请开启特性开关advanceFilterExpression，可以通过consul、领域配置文件app.config.json、或者扩展脚本开启

扩展脚本开启办法：

viewModel.enableFeature('advanceFilterExpression')

点击树节点上的新增，可以新增分组/新增表达式

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/GaoJiChaXunBiaoDaShiShuimage2.0e7933d7.png)

表达式可以具体选择条件项、比较符、条件值等，双击可以进行浏览态、编辑态切换。

## [](#3-扩展方法)3. 扩展方法

部分业务需求会对参照进行扩展处理，比如扩展条件、扩展额外参数等。

### [](#31-扩展参照条件)3.1. 扩展参照条件

// 在查询区扩展脚本中

viewModel.setCache({

 userDefine_7_031: {

 conditionField: 'id',

 conditionRelatedField: 'userDefine_7_030'

 },

 userDefine_7_030: {

 conditionField: 'id',

 conditionValue: ''

 }

})

 

// 在单据扩展脚本中

viewModel.on('afterInitCommonViewModel', () => {

 const FilterViewModel = viewModel.getCache('FilterViewModel')

 FilterViewModel.setCache({

 userDefine_7_031: {

 conditionField: 'id',

 conditionRelatedField: 'userDefine_7_030'

 },

 userDefine_7_030: {

 conditionField: 'id',

 conditionValue: ''

 }

 })

})

 

// key含义解释

 

{

 userDefine_7_031: {

 conditionField: 'id',

 conditionRelatedField: 'userDefine_7_030'

 },

 userDefine_7_030: {

 conditionField: 'id',

 conditionValue: ''

 }

}

 

// 这是一个配置，其中，每一组对象的key，是被扩展参照条件的itemName

// conditionField，是扩展条件simpleVOs中传给后端的field字段，一般是id，个别业务参照可能是code、orgId、deptId等

// conditionRelatedField，是依赖其他的参照的itemName，比如当前参照的getRefData的条件依赖其他参照值，所以这个key的value可以配置另外一个参照的itemName，用来取依赖参照的value

// conditionValue，是一个固定条件，比如当前参照仅仅需要一个条件值为{field: 'id', op: 'in', value1: '22314245123244'}，那么这里直接写死一个条件值即可，注意，多选参照这里应该是一个数组，单选参照是字符串或者数字，否则后端报错

### [](#32-扩展参照参数)3.2. 扩展参照参数

高级方案表达式树，每次进入一个条件项的编辑态时，会生成一个模型，当其他条件项变成编辑态时，当前条件的模型销毁，重新为新条件项创建一个模型，因此每次扩展能拿到的模型有且仅有一个，可以通过这个模型进行全生命周期扩展；

// 获取模型方法

// 在查询区扩展脚本中

viewModel.on('afterInit', () => {

 viewModel.get('advanceItemModal').on('afterBindModel', (itemModel) => {

 // 这个itemModel就是当前激活的模型，在这扩展逻辑就行

 })

})

 

// 在单据扩展脚本中

viewModel.on('afterInitCommonViewModel', () => {

 const FilterViewModel = viewModel.getCache('FilterViewModel')

 FilterViewModel.on('afterInit', () => {

 FilterViewModel.get('advanceItemModal').on('afterBindModel', (itemModel) => {

 // 这个itemModel就是当前激活的模型，在这扩展逻辑就行

 })

 })

})

有问题可及时联系[zhanghaoaq@yonyou.com](mailto:zhanghaoaq@yonyou.com)