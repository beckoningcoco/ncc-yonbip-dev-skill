---
title: "标签模型 TagModel"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/02-tag-model"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 标签模型 TagModel

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/02-tag-model | 所属：API

# [](#标签模型-tagmodel)标签模型 TagModel

## [](#1-模型说明)1. 模型说明

继承BaseModel 所有API

## [](#2-模型配置)2. 模型配置

new cb.models.TagModel(options)

||参数||属性含义||值类型||说明||默认|
||value||设置的值||any||模型的值||underfined|
||multiple||是否多选||Boolean||true-是||false|
||bill2ReferKeyFieldMap||||Object||||{}|
||refer2BillKeyFieldMap||||Object||||{}|
||textField||取数据名称的 key||String||||name|
||convert||||Boolean||||true|
||needRefCode||是否需要参照类型||Boolean||true-需要||false|
||innerStatusField||数据默认标识||String||||_status|
||selfCollected||数据是否要收集||Boolean||true-不获取 false 获取||false|
||...||可在模型上添加任意参数，更详细配置可参考单据上模型的 __data|||||||

## [](#3-方法)3. 方法

### [](#31-validate)3.1. validate()

**说明**

校验模型选择的值，showValue

会受模型配置 checkMsg和bIsNull 的影响

### [](#32-setdirtydirty)3.2. setDirty(dirty)

**说明**

将组件绑定的模型上propertyNames的值， 更新到当前组件上

**参数**

||参数||属性含义||值类型||说明|
||dirty||标记模型是否是脏数据||Boolean||true-是false-否|

### [](#33-getdirtydata)3.3. getDirtyData()

**说明**

获取模型数据，会根据模型是否是脏数据判断是取全部数据还是变更的数据

### [](#34-getdirtyrowindexes)3.4. getDirtyRowIndexes()

**说明**

获取脏数据行index的数组,对应模型上dirtyRowIndexes 的值

### [](#35-getdata)3.5. getData()

**说明**

获取模型当前的数据

### [](#36-getalldata)3.6. getAllData()

**说明**

获取模型所有数据，包括已经删除的数据

### [](#37-setdatadata)3.7. setData(data)

**说明**

设置模型的数据，在value上

**参数**

data | Array

### [](#38-clear)3.8. clear()

**说明**

清空模型上的数据。 value-> []

### [](#39-getshowvalue)3.9. getShowValue()

**说明**

获取显示的值。

**返回值**

mode._get_data('showValue')

### [](#310-getshowvaluecount)3.10. getShowValueCount()

**说明**

获取显示值的个数

### [](#311-settreefilterfilter)3.11. setTreeFilter(filter)

**说明**

添加树请求查询条件 treeFilter， referType == 'TreeList'/Tree

**参数**

filter | object

### [](#312-gettreefilter)3.12. getTreeFilter()

**说明**

filter 过滤

**返回值**

mode._get_data('treeFilter')

### [](#313-setfilterfilter)3.13. setFilter(filter)

**说明**

filter 过滤， 类似setTreeFilter referType不是TreeList'/Tree 的清空

### [](#314-getfilter)3.14. getFilter()

**说明**

获取tagmodel过滤

**返回值**

mode._get_data('filter')

### [](#315-setconditioncondition--要完善)3.15. setCondition(condition) // 要完善

**说明**

设置condition

### [](#316-getcondition)3.16. getCondition()

**说明**

获取condition

### [](#317-setvaluevalue-check-group)3.17. setValue(value, check, group)

**说明**

设置模型显示的值，showValue

**参数**

||参数||属性含义||值类型||说明|
||value||设置显示值||array|||
||check||是否触发value 改变事件||Boolean||true- 触发 (before/after)ValueChange|
||group||||Boolean|||

### [](#318-getvalue)3.18. getValue()

**说明**

获取模型上value的值

### [](#319-deleteitemindex)3.19. deleteItem(index)

**说明**

删除对应index显示的值

**参数**

index 要删除数据的下标

### [](#320-deleteitemsindexs)3.20. deleteItems(indexs)

**说明**

批量删除删除显示的值

**参数**

indexs ---> array/string 批量删除/删除当前

### [](#321-setcellvalueindex-cellname-cellvalue)3.21. setCellValue(index, cellName, cellValue)

**说明**

设置value中某一列的值

**参数**

||参数||属性含义||值类型||说明|
||index||序号|||||
||cellName||列名|||||
||cellValue||值|||||

### [](#322-setcellvaluesvalues)3.22. setCellValues(values)

**说明**

批量执行setCellValue

**参数**

values = [{index: 1, cellName: 'xxx', cellValue: 'xxx' }, ...]

### [](#323-setmultiplemultiple)3.23. setMultiple(multiple)

**说明**

设置模型是否多选

**参数**

multiple Boolean类型 true多选 false单选

### [](#324-setrefcodecode-crefretid)3.24. setRefCode(code, cRefRetId)

**说明**

设置模型cRefType = code

cRefRetId 是参照携带

**参数**

code| string/number

cRefRetId | json.stringfly

### [](#325-setfocusedrowindexindex)3.25. setFocusedRowIndex(index)

**说明**

设置焦点行

**参数**

index | number

### [](#326-getrowindex)3.26. getRow(index)

**说明**

根据index获取行数据

**参数**

index | number

### [](#327-geteditrowmodel)3.27. getEditRowModel()

**说明**

获取行viewmodel

## [](#4-事件)4. 事件

### [](#41-beforebrowse)4.1. beforeBrowse

**说明**

点击按钮弹出参照前事件,返回true则继续进行弹出参照操作，返回false则终止弹出。

viewmodel.get(propertyName).on('beforeBrowse', function () {return true;});

### [](#42-afterbrowse)4.2. afterBrowse

**说明**

点击按钮弹出参照后事件

viewmodel.get(propertyName).on('afterBrowse', function () {});

### [](#43-beforevaluechange)4.3. beforeValueChange

**说明**

参照确定返回数据改变前事件,返回true则继续进行value的改变，返回false则终止value的改变

//例：示例中data格式为{ value: value, oldValue: oldValue }

viewmodel.get(propertyName).on('beforeValueChange', function (data) {

 return true;

});

### [](#44-aftervaluechange)4.4. afterValueChange

**说明**

参照确定返回数据改变后事件，允许对改变后的数据进行操作

//例： 示例中data格式为{ value: value, oldValue: oldValue }

viewmodel.get(propertyName).on('afterValueChange', function (data){});