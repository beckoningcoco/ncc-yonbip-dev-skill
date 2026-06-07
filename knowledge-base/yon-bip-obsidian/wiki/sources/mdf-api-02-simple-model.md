---
title: "简单模型 SimpleModel"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/02-simple-model"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 简单模型 SimpleModel

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/02-simple-model | 所属：API

# [](#简单模型-simplemodel)简单模型 SimpleModel

## [](#1-模型说明)1. 模型说明

继承BaseModel的所有API

## [](#2-模型配置)2. 模型配置

new cb.models.SimpleModel(options)

||参数||属性含义||值类型||说明||默认值|
||value||设置的值||any||模型的值||空|
||needCollect||是否需要容器模型取数据||boolean||true-收集||空|
||bIsNull||是否必输||boolean||false-必输||空|
||bMustSelect||||||||空|
||needClear||和needCollect一起判断，容器是否取模型数据||||true-收集||空|
||...||可在模型上添加任意参数，更详细配置可参考单据上简单模型|||||||

## [](#3-方法)3. 方法

### [](#31-setdatadata)3.1. setData(data)

**说明**

设置模型上value上的值

**参数**

data | any

**示例**

modal.setData(111)

### [](#32-setvaluevalue-check)3.2. setValue(value, check)

**说明**

设置模型上value上的值

**参数**

||参数||属性含义||值类型||说明|
||value||设置的值||any|||
||check||是否监听值的变化(beforeValueChange/afterValueChange)||boolean||true-监听 false-正常设置值|

### [](#33-getvalue)3.3. getValue()

**说明**

获取当前模型上value的值

**返回值**

模型的value

### [](#34-clearusedefault)3.4. clear(useDefault)

**说明**

将组件绑定的模型上propertyNames的值， 更新到当前组件上

**参数**

||参数||属性含义||值类型||说明|
||useDefault||是否恢复默认值||Boolean||true-设置value为模型上的cDefaultValuefalse-设置value 为underfined|

### [](#35-setprevvaluevalue)3.5. setPrevValue(value)

**说明**

在model属性上设置prevvalue值,用于新老数据变更的对比，

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/SimpleModeljiandanmoxingimage1.14fc52ba.png)

**参数**

data | any

## [](#4-事件)4. 事件

### [](#41-beforevaluechange)4.1. beforeValueChange

**说明**

value改变前事件

//例：示例中data格式为{ value: value, oldValue: oldValue }

viewmodel.get(propertyName).on('beforeValueChange', function (data) {

 return true;

});

//返回true则继续进行value的改变，返回false则终止value的改变

### [](#42-aftervaluechange)4.2. afterValueChange

**说明**

value改变后事件，允许对改变后的数据进行操作

//例：示例中data格式为{ value: value, oldValue: oldValue }

viewmodel.get(propertyName).on('afterValueChange', function (data){});