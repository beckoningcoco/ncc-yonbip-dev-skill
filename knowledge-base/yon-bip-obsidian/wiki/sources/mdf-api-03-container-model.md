---
title: "容器模型 ContainerModel"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/03-container-model"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 容器模型 ContainerModel

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/03-container-model | 所属：API

# [](#容器模型-containermodel)容器模型 ContainerModel

## [](#1-模型说明)1. 模型说明

所有model的基类

## [](#2-方法)2. 方法

### [](#21-getpropertyname)2.1. get(propertyName)

说明：根据子model属性名获取子model

入参：propertyName：子model属性名

viewmodel.get(propertyName)

### [](#22-addpropertypropertyname-value)2.2. addProperty(propertyName, value)

说明：新增子model

入参：propertyName：子model属性名；value：子model值

viewmodel.addProperty(propertyName,value)

### [](#23-removepropertypropertyname)2.3. removeProperty(propertyName)

说明：根据属性名移除子model

入参：propertyName：子model属性名

viewmodel.removeProperty(propertyName)

### [](#24-getdata)2.4. getData()

说明：获取基类数据

viewmodel.getData()

### [](#25-getoriginaldata)2.5. getOriginalData()

说明：获取基类model中初始数据

viewmodel.getOriginalData()

### [](#26-getnecessarydata)2.6. getNecessaryData()

说明：获取基类model中bMustSelect为true的数据

viewmodel.getNecessaryData()

### [](#27-setdirtydirty)2.7. setDirty(dirty)

说明：设置是否收集数据时只收集脏数据(true为收集所有数据，false为只收集脏数据)

入参：dirty：true or false

viewmodel.setDirty()

### [](#28-validate)2.8. validate()

说明：表单校验

### [](#29-getdirtydata)2.9. getDirtyData()

说明：获取脏数据(差异化数据)方法

viewmodel.getDirtyData()

### [](#210-loaddatadata)2.10. loadData(data)

说明：加载数据方法

入参：data：需加载的数据

viewmodel.loadData()

### [](#211-loaddirtydatadata)2.11. loadDirtyData(data)

说明：加载脏数据方法

入参：data：需加载的数据

viewmodel.loadDirtyData()

### [](#212-clear)2.12. clear()

说明：清除数据方法

viewmodel.clear()

### [](#213-collectdataall)2.13. collectData(all)

说明：收集数据方法(all为true收集所有数据，false为只收集脏数据)

入参：all：true or false

viewmodel.collectData(all)

### [](#214-getalldatawithoutgrid)2.14.  getAllData(withOutGrid)

说明：收集数据(withOutGrid为true只收集表头数据，false收集表头、表体数据)

入参：withOutGrid：true or false

viewmodel.getAllData(withOutGrid)

### [](#215-setreadonlyvalue)2.15. setReadOnly(value)

说明：设置只读属性readOnly方法

入参：value：true or false

### [](#216-getgridmodelpropertyname)2.16. getGridModel(propertyName)

说明：根据属性名获取GridModel

#### [](#2161-viewmodel下只有一个gridmodel只有一张表)2.16.1. viewmodel下只有一个gridModel（只有一张表）

无需入参，直接获取表格模型

viewmodel.getGridModel()

#### [](#2162-viewmodel下有多个gridmodel有多张表)2.16.2. viewmodel下有多个gridModel（有多张表）

##### [](#21621-获取主表)2.16.2.1. 获取主表

注：需要在实体上对应表的实体配置bMain属性将其设置为主表

viewmodel.getGridModel()

##### [](#21622-获取子表)2.16.2.2. 获取子表

入参：propertyName：子model属性名 
如propertyName不传则默认取基类model中第一个GridModel

viewmodel.getGridModel(propertyName)

### [](#217-gettreemodelpropertyname)2.17. getTreeModel(propertyName)

说明：根据属性名获取TreeModel

入参：propertyName：子model属性名 
如propertyName不传则默认取基类model中第一个TreeModel

viewmodel.getTreeModel(propertyName)

### [](#218-getsubpageviewmodels)2.18. getSubPageViewModels()

说明：获取当前页面模型下所有嵌入关联对象(page)模型的映射Map

注:
使用前提是页面嵌入了关联对象且使用refmap形式嵌入，refmap配置参照文档[Page 页面容器](#/components-web/04-page)

viewmodel.getSubPageViewModels()

### [](#219-getsubpageviewmodelbillno)2.19. getSubPageViewModel(billNo)

说明：根据billNo获取页面模型下特定关联对象(page)的模型

入参：billNo：嵌入关联对象的单据编码

注:
获取模型的前提是这个关联对象加载过，尚未加载的关联对象模型无法获取，所以使用时机需要控制在点击切换之后的事件中

viewmodel.getSubPageViewModel(billNo)