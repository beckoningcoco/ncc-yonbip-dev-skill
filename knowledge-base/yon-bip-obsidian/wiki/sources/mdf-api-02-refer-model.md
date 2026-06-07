---
title: "参照模型 ReferModel"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/02-refer-model"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 参照模型 ReferModel

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/02-refer-model | 所属：API

# [](#参照模型-refermodel)参照模型 ReferModel

## [](#1-模型说明)1. 模型说明

参照与tag绑定Model类型

## [](#2-方法)2. 方法

### [](#21-clear)2.1. clear()

**说明**：清除数据

//例：

model.clear()

### [](#22-setfilterfilter)2.2. setFilter(filter)

**说明**：设置filter

model.setFilter(filter)

### [](#23-getfilter)2.3. getFilter()

**说明**：获取filter

model.getFilter()

### [](#24-setconditioncondition)2.4. setCondition(condition)

**说明：**设置Condition

model.setCondition(condition)

### [](#25-getcondition)2.5. getCondition()

**说明：**获取Condition

model.getCondition()

### [](#26-setreturnfieldsfields)2.6. setReturnFields(fields)

** 说明**：设置参照返回的携带字段

//说明：设置参照返回携带字段,

//入参：fields 参照返回携带字段对象

model.setReturnFields(fields)

### [](#27-setvaluevaluecheck)2.7. setValue(value,check)

**说明：**设置Value值

//入参：value：为想要设置的值

// check：boolean型 内部调用参数 可不传

model.setValue(value) // value为[{id:**,name:**}]等

### [](#28-getvalue)2.8. getValue()

**说明：**获取Value值

model.getValue()

### [](#29-getselectednodes)2.9. getSelectedNodes()

**说明**：绑定组件为tag时，调用该方法获取参照选中返回数据

model.getSelectedNodes()

### [](#210-setrefcode)2.10. setRefCode()

**说明**：修改成一个新参照

// 入参 code为refCode是必须 cRefRetId为参照携带

model.setRefCode(code, cRefRetId, domainKey = '')

## [](#3-事件)3. 事件

### [](#31-beforebrowse)3.1. beforeBrowse

**说明**：点击按钮弹出参照前事件,
返回true则继续进行弹出参照操作，返回false则终止弹出

viewmodel.get(propertyName).on('beforeBrowse', function () {

 return true;

});

### [](#32-afterbrowse)3.2. afterBrowse

**说明**：点击按钮弹出参照后事件

viewmodel.get(propertyName).on('afterBrowse', function () {});

### [](#33-beforevaluechange)3.3. beforeValueChange

**说明：** 参照确定返回数据改变前事件,
返回true则继续进行value的改变，返回false则终止value的改变

//例：示例中data格式为{ value: value, oldValue: oldValue }

viewmodel.get(propertyName).on('beforeValueChange', function (data) {

 return true;

});

### [](#34-aftervaluechange)3.4. afterValueChange

 **说明**：参照确定返回数据改变后事件，允许对改变后的数据进行操作

//例：示例中data格式为{ value: value, oldValue: oldValue }

viewmodel.get(propertyName).on('afterValueChange', function (data){});