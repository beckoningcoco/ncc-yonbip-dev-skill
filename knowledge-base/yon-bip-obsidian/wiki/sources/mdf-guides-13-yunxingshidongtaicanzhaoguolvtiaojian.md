---
title: "运行时动态参照过滤条件"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/13-yunxingshidongtaicanzhaoguolvtiaojian"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 运行时动态参照过滤条件

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/13-yunxingshidongtaicanzhaoguolvtiaojian | 所属：指南

# [](#运行时动态参照过滤条件)运行时动态参照过滤条件

## [](#1-设计背景)1. 设计背景

- 在某种场景下，打开参照的时候需要动态的为参照设置过滤参数（过滤条件）
- 参照有查询方案，但是很多场景参照是没有查询方案的，另外查询方案是一个需要用户参与的功能，对于简单参照参数显得过重
- 这些动态设置参照过滤条件可抽象为两类（对参照而言）

推的方式：满足某种条件下为一个参照动态设置一个参数，即主动推给参照参数。
可采用监听某些事件触发并满足一定的设定条件时，设置目标参照的过滤条件（condition）
例如：页面初始化（事件）时，可以设置目标参照的condition，即目标参照由外部触发时机被动的接受过滤条件（condition）

- 

拉的方式：打开一个参照时，从当前上下文动态获取值作为当前参照的过滤条件，即参照主动去拉取当前参数
实现方式：在目标参照beforeBrowse事件触发时，设置目标参照的过滤条件（condition），即参照在弹窗展示前才主动的去获取（拉取）过滤条件（condition）

## [](#2-设计思想)2. 设计思想

- 动态设置参照过滤条件本质上是前端交互规则的一种
- 利用现有的交互规则的存储模型和存储服务
- 使用前端交互规则运行时解释引擎来实现

## [](#3-模型定义)3. 模型定义

### [](#31-模型定义思想)3.1 模型定义思想

模型定义思想：

- 基于单据状态交互规则模型，本质上仍然是给一个目标设置一个值（表达式或数据）
- 使用单据装填交互规则模型来描述

target:参照字段 property：“condition.conditino1”

对应运行时：
xxx.addDynamicFilterSimpleVOs("conditon1", {
field: 'xx',
op: 'eq',
value1: '123'
})

||属性||属性值||示例||含义|
||target||xxxxxx.yy||Employee_nameorderlines.Employee_name||这里的target仍然是字段，可以是主表字段、子表字段，即通过viewmodel字段|
||property||condition.xxx或codition.simpleVOs.xxxexternalData.myfield||condition.DeptIdcondition.simpleVOs.DeptIdexternalData.currentServiceCode，其中currentServiceCode是开发自己定义的参数||这里不再是【值属性】，而是【条件属性】|
||如果是以关键字condition.后z兼容历史：如果没有simpleVOs或commonVOs关键字，则认为condition.是参照字段属性，默认按照simpleVOs来处理，相当于省略了simpleVOs如果是以externalData.开始，则.后是自定义参照名|||||||

### [](#32-运行时解析逻辑)3.2 运行时解析逻辑

要点：
（1）如果property存在condition.或condition.simpleVOs则去后面的内容，理解为参照（target）的参数（属性）
（2）如果condition.后没有simpleVOs或commonVOs，则认为condition.后直接就是参照（target）的参数（属性）

### [](#33-示例模型定义)3.3 示例模型定义

target:xxx 

property：“conditon.conditino2”

### [](#34-实现代码)3.4 实现代码

function _setMeta (target, property, value) {

 let _viewmodel = getViewModel(target);

 const propertyLeft = property.split('.')[0];

 let propertyRight = property.split('.')[1];

 if (getModelType(target) == 'GridModel') {

 _viewmodel = getViewModel(target).getEditRowModel().get(getColumnName(target));

 }

 if (!_viewmodel) return;

 if (_viewmodel.modelType == 'ReferModel') {

 if (propertyRight !== 'simpleVOs' && propertyRight !== 'commonVOs') { // 兼容condition.xx

 property = propertyLeft + '.simpleVOs.' + propertyRight

 }

 propertyRight = property.split('.')[2];

 const propertyType = property.split('.')[1];

 const condition = {

 field: propertyRight,

 op: 'eq'

 }

 if (isJSON(value)) {

 const valueObj = JSON.parse(value);

 condition.op = valueObj.logicOper;

 if (isJSON(valueObj.value1)) valueObj.value1 = JSON.parse(valueObj.value1).id; // 条件为参照

 condition.value1 = valueObj.value1;

 if (['between'].includes(valueObj.logicOper)) {

 if (isJSON(valueObj.value2)) valueObj.value2 = JSON.parse(valueObj.value2).id; // 条件为参照

 condition.value2 = valueObj.value2;

 }

 } else {

 condition.value1 = value

 }

 const VOs = 'addDynamicFilter' + propertyType.substring(0, 1).toUpperCase() + propertyType.substring(1);

 if (!_viewmodel[VOs]) {

 console.log('cb.model.js ' + VOs + ' not found')

 return;

 };

 _viewmodel[VOs](condition);

 const metaParams = _viewmodel?.getCache('vm')?.getParams();

 cb.utils.extend(metaParams, { where: { ...metaParams?.where, dynamicFilter: _viewmodel.get('dynamicFilter') } });

 }

 }

## [](#4-新增字段)4. 新增字段

参照查询方案SolutionCommon模型，需要有value1和value2

||srcExprType||1|||
||srcExpression||orgids|||
||srcExpressionValueType|||||
||target||product_name|||
||property||condition.org||condition.后如果没有simpleVO或commonVOs, .后面认为是字段，直接按照simpleVOs来处理|
||srcExprType||1||动态参照赋simpleVOs条件|
||srcExpression||orgids|||
||srcExpressionValueType||number|||
||srcExpr2Type||2||新增字段|
||srcExpression2||1000234||新增字段|
||srcExpressionValue2Type||number||新增字段|
||srcExpressionValueLogicOper||between||新增字段 between gr lr ne,eq,notIn,In参考查询方案条件枚举；使用场景：给参照赋条件，该条件不等于xxxx，用来表示不等于、大于等|
||source2||目标字段id||新增字段，当srcExpr2Type为1时生效|
||srcProperty2||目标字段属性||新增字段，当srcExpr2Type为1时生效|
||target||product_name||参照refcode|
||property||condition.simpleVOs.org||条件|

## [](#5-废弃方案)5. 废弃方案

以下为当初设计时的废弃方案，做记录，对今后做参考借鉴

|------------------------|---------------------------------------------|------------------|
| srcExprType | 4 | 动态参照赋simpleVOs条件 |
| srcExpressionValueType | | |
| extdev | {"field":"org","op":"in","value1":"orgids"} | |
| target | product_name | 参照refcode |
| property | condition.simpleVOs | 条件 |
| | | |