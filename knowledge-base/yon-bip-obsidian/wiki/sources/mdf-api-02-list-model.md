---
title: "枚举模型 ListModel"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/02-list-model"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 枚举模型 ListModel

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/02-list-model | 所属：API

# [](#枚举模型-listmodel)枚举模型 ListModel

## [](#1-模型说明)1. 模型说明

## [](#2-模型配置)2. 模型配置

new cb.models.ListModel(options)

||参数||属性含义||值类型||说明||默认|
||value||设置的值||any||模型的值||空|
||multiple||是否多选||Boolean||true-是||false|
||allowClear||||Boolean||||true|
||valueField||数据key||String||列item 的唯一值||value|
||textField||数据key||String||列item 的名称||text|
||dataSource||数据源||Array||列表数据源||true|
||dataSourceMode||列表数据是否用本地的||string||local-本地 其它-网络请求||local|
||keyMap||数据对象||Object||||{}|
||autoComplete||自定义输入||Boolean||true-自定义||false|
||...||可在模型上添加任意参数，更详细配置可参考单据上模型的 __data|||||||

## [](#3-方法)3. 方法

### [](#31-setdatadata)3.1. setData(data)

**说明**

设置模型的值 value

**参数**

data | any

### [](#32-getdata)3.2. getData()

**说明**

获取模型的值 value

### [](#33-clearusedefault)3.3. clear(useDefault)

**说明**

将组件绑定的模型上propertyNames的值， 更新到当前组件上

**参数**

||参数||属性含义||值类型||说明|
||useDefault||是否恢复默认值||Boolean||true-设置value为模型上的cDefaultValuefalse-设置value 为underfined|

### [](#34-setdatasourceproxyconfig-queryparams-callback)3.4. setDataSource(proxyConfig, queryParams, callback)

**说明**

设置模型的列表数据（dataSource）

**参数**

如果ListModel中dataSourceMode为local则proxyConfig参数传递为真实数据。

否则proxyConfig参数传递服务请求地址，queryParams传递请求参数，callback传递回调函数。

||参数||属性含义||值类型||说明|
||proxyConfig||请求配置/真实数据||Object|||
||queryParams||请求参数||Object|||
||callback||请求回调||function||如果有callback， 将不会走模型的数据改变的方法|

**示例**

//例：dataSourceMode为local

model.setDataSource(listData)

//dataSourceMode不为local

model.setDataSource('bill/list.do',{id:1},function(result){})

### [](#35-getnodesbykeyskeys)3.5. getNodesByKeys(keys)

**说明**

获取当前节点数据

**参数**

keys 模型配置的valueField值的数据

**返回值**

类型： object

### [](#36-selectselectedkeys-manually)3.6. select(selectedKeys, manually)

**说明**

列表数据项选择事件

**参数**

||参数||属性含义||值类型||说明|
||selectedKeys||选择的数据||array||模型配置的valueField值|
||manually|||||||

**示例**

//入参：selectedKeys传递要选中的key值 ['key1','key2']

model.selete(selectedKeys);

### [](#37-getselectednodes)3.7. getSelectedNodes()

**说明**

获取选中的数据项

**参数**

keys 模型配置的valueField值的数据

**返回值**

类型： object

### [](#38-getselectedkeys)3.8. getSelectedKeys()

**说明**

获取选中的数据项的 key

### [](#39-setvaluevalue-check)3.9. setValue(value, check)

**说明**

将组件绑定的模型上propertyNames的值， 更新到当前组件上

**参数**

||参数||属性含义||值类型||说明|
||selectedKeys||选择的数据||array||模型配置的valueField值|
||manually|||||||

### [](#310-setprevvaluevalue)3.10. setPrevValue(value)

**说明**

在模型上设置prevvalue值， 用于变更数据的对比

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/listModelmeijumoxingimage1.14fc52ba.png)

### [](#311-getvalue)3.11. getValue()

**说明**

获取模型上的value

## [](#4-事件)4. 事件

### [](#41-beforesetdatasource)4.1. beforeSetDataSource

**说明**：DataSource改变前事件,返回true则继续进行DataSource的改变，返回false则终止DataSource的改变

//例：

viewmodel.get(propertyName).on('beforeSetDataSource', function (data)

{

 return true;

});

### [](#42-aftersetdatasource)4.2. afterSetDataSource

**说明**：DataSource改变后事件

//例：

viewmodel.get(propertyName).on('afterSetDataSource', function (data)

{});

### [](#43-beforeselect)4.3. beforeSelect

**说明**：select选择前事件,返回true则继续进行select的改变，返回false则终止select的改变

//例：示例中的data为select选中数据

viewmodel.get(propertyName).on('beforeSelect', function (data) {

 return true;

});

### [](#44-afterselect)4.4. afterSelect

**说明**：select选择后事件

//例：示例中的data为select选中数据

viewmodel.get(propertyName).on('afterSelect', function (data) {});

### [](#45-beforevaluechange)4.5. beforeValueChange

**说明**：
Value改变前事件,返回true则继续进行value的改变，返回false则终止value的改变

//示例中data格式为{ value: value, oldValue: oldValue }

viewmodel.get(propertyName).on('beforeValueChange', function (data) {

 return true;

});

### [](#46-aftervaluechange)4.6. afterValueChange

**说明**： value改变后事件，允许对改变后的数据进行操作

//例：示例中data格式为{ value: value, oldValue: oldValue }

viewmodel.get(propertyName).on('afterValueChange', function (data){});