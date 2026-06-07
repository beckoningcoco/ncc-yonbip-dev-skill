---
title: "FilterStore"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g01-filter-store-api"
section: "YNF-API"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, API]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# FilterStore

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g01-filter-store-api | 所属：YNF-API

# [](#filterstore)FilterStore

主要功能介绍：（filterStore基本功能）

- filterStore 是 查询方案 or 查询区对应的操作逻辑store，主要负责组织查询条件的功能。
- 带有查询逻辑的页面，如需要额外增加查询条件，扩展脚本拿到filterStore，在扩展脚本里面增加扩展查询条件。

## [](#filterstore设计器配置)FilterStore设计器配置

{

 "alias": "filterStore", // filterStore实例对象别名alias

 "caption": "filterStore",

 "controlType": "FilterStore", // store数据对象类型

 "disabled": false,

 "fieldsArr": [...], // filterStore字段描述

 "libCode": "ynf-core-engine", // store数据模型的导出代码库

 "nid": "nid_208",

 "storeType": "FilterStore",

 "visible": true,

 "UIT#designProps": {

 "UIT#controlOrderArr": [],

 "UIT#otherOrderArr": []

 }

}

## [](#filterstore-核心类介绍)FilterStore 核心类介绍

||名称||描述|
||FilterStore||主类|
||Logic||一组查询条件，逻辑类|
||FilterItem||查询子项类-最小查询单元 继承与Expression|
||OrderItem||排序子项类|

## [](#filterstore-类api文档)FilterStore 类API文档

### [](#构造函数constructor)构造函数(constructor)

`FilterStore`构造函数初始化过滤存储，包括条件存储、排序存储、扩展条件存储等，并配置相关的JSONSchema和API接口。构造函数接收参数如下：

||参数名||类型||描述||默认值|
||storeMeta||any||存储元数据||无|
||rootStore||any||根存储实例||无|

### [](#类属性parameters)类属性(Parameters)

||属性名||类型||是否可观察||描述||默认值|
||condition||Logic||是||条件存储||new Logic(LogicOperator.AND)|
||orderBy||Array||是||排序存储||[]|
||extraCondition||Map||是||扩展条件存储||new Map()|
||queryCondition||object||否||真正执行查询的条件||{ conditions: [], orders: [] }|
||advanceCondition||object||是||高级查询条件||{ op: 'and', items: [] }|
||bAdvance||boolean||是||是否使用高级查询||false|
||storeType||string||否||类型||"FilterStore"|
||$queryTrigger||number||否||查询触发器||0|
||rootStore||any||否||根存储实例||无|
||haveSystem||boolean||是||是否添加系统方案||false|
||isQueryReady||boolean||是||查询区设置就绪||false|

### [](#计算属性-computed)计算属性 (Computed)

当前类中没有显式定义计算属性。计算属性通常基于其他可观察属性的值进行缓存和派生。

### [](#动作函数-actions)动作函数 (Actions)

动作函数用于执行可以修改可观察状态的操作。

||方法名||描述||参数||返回类型|
||addCondition||添加查询条件（系统预置）||conditions: any[]||void|
||setCondition||设置查询条件（系统预置）||conditions: any[]||void|
||removeCondition||删除查询条件（系统预置）||item: string||FilterItem|
||updateCondition||用于查询区或者查询方案更新条件（系统预置）||name:code,value:123,operator:'like'/eq/in/between,activated = true,visible = true||void|
||clear||清空所有条件||无||void|
||clearConditionValue||清空查询区条件的值||无||void|
||clearExtraConditionValue||清空扩展条件的值||无||void|
||addExtraCondition||扩展脚本增加扩展查询条件||key: string, operator: string, values:为一个或者多个查询 item 对象||void|
||removeExtraCondition||扩展脚本删除扩展||key: string||void|
||updateExtraCondition||扩展脚本更新扩展||key: string, operator: string, values:为一个或者多个查询 item 对象||void|
||getExtraCondition||扩展脚本获取扩展查询条件||key?: string||-|
||createFilterItem||创建 FilterItem||item: any||FilterItem|
||getFilterItemByName||根据名称获取查询项||name: string||FilterItem|
||copyCondition||复制条件到查询执行条件||无||void|
||getQueryCondition||返回 queryCondition 条件||无||{conditions: [],orders:[]}|
||validate||校验查询区是否必填||无||[]|
||setQueryTrigger||触发查询触发器||flag: boolean||void|
||addOrderBy||增加排序条件||name: string, value: OrderType, activated: boolean, visible: boolean, meta: object||void|
||removeOrderBy||删除排序条件||name: string||void|
||updateOrderBy||更新排序字段||name: string, value: OrderType, activated: boolean, visible: boolean||void|

说明：

- `FilterStore`类负责管理查询和过滤逻辑，包括条件、排序和高级查询。
- 通过构造函数可以初始化查询面板、方案和弹窗的JSONSchema和API接口。
- 可观察属性如 `condition`、`orderBy`、`extraCondition`等允许状态变化被追踪和响应。
- 动作函数如 `addCondition`、`setCondition`、`removeCondition`等用于修改查询条件。
- 类支持查询条件的添加、删除、更新和复制到查询执行条件。
- 支持排序条件的添加、删除和更新。
- 提供了多语言支持和操作日志记录的功能。

## [](#logic-类api文档)Logic 类API文档

### [](#构造函数constructor-1)构造函数(constructor)

`Logic`构造函数初始化逻辑存储，包括表达式列表和逻辑运算符。构造函数接收参数如下：

||参数名||类型||描述||默认值|
||operator||LogicOperator||一组表达式的操作符||LogicOperator.AND|
||name||string||一组表达式的名称||"default"|

### [](#类属性parameters-1)类属性(Parameters)

||属性名||类型||是否可观察||描述||默认值|
||expressionList||Array `<FilterItem>`||是||存储一个属性结构的列表，可以扩展为Logic||[]|
||logicOperator||LogicOperator||否||一组表达式的操作符||无|
||name||string||否||一组表达式的名称||"default"|

### [](#计算属性-computed-1)计算属性 (Computed)

当前类中没有显式定义计算属性。计算属性通常基于其他可观察属性的值进行缓存和派生。

### [](#动作函数-actions-1)动作函数 (Actions)

动作函数用于执行可以修改可观察状态的操作。

||方法名||描述||参数||返回类型|
||validate||校验表达式列表中的必填项||无||Array|
||clearValue||清空查询FilterItem的值，设置默认值||无||void|
||doUpdate||更新expressionList 引用||无||void|
||setExpressionList||设置逻辑下的查询Items，依据name Update||list: FilterItem[]||void|
||addFilter||添加查询条件||item: FilterItem||void|
||removeFilter||删除查询条件||item: FilterItem||string|
||updateFilter||根据name更新条件||item: FilterItem||void|
||getQueryValue||获取查询值，构建数据结构并返回对象{op, items}||isActivated: boolean, intercept?: Function||object|
||getName||获取一组表达式的名称||无||string|
||getFilterItemByName||根据名称获取查询项||name: string||FilterItem|

📢说明

- `Logic`类负责管理一组查询条件的逻辑关系，包括AND/OR等。
- 通过构造函数可以初始化逻辑表达式列表和逻辑运算符。
- 可观察属性 `expressionList`允许状态变化被追踪和响应。
- 动作函数如 `addFilter`、`removeFilter`、`updateFilter`等用于修改查询条件集合。
- 辅助函数如 `getQueryValue`等提供了逻辑表达式的获取和查询值构建的逻辑。
- 类支持逻辑表达式的校验、清空、更新和条件获取。

## [](#filteritem-类api文档)FilterItem 类API文档

### [](#构造函数constructor-2)构造函数(constructor)

`FilterItem`构造函数初始化单个查询条件项，包括名称、操作符、值、字段等属性。构造函数接收参数如下：

||参数名||类型||描述||默认值|
||name||string||查询字段名称||无|
||value||any||查询字段值||""|
||operator||Operator||查询操作符||Operator.EQUAL|
||activated||boolean||是否激活||true|
||visible||boolean||是否可见||true|
||meta||any||协议数据信息||无|
||field||string||实体字段||无|
||filterStore||any||所属的FilterStore实例||无|

### [](#类属性parameters-2)类属性(Parameters)

||属性名||类型||是否可观察||描述||默认值|
||operator||Operator||是||查询操作符||Operator.EQUAL|
||name||string||是||查询字段名称||""|
||value||any||是||查询字段值||""|
||field||string||是||实体字段||""|
||filterStore||any||否||所属的FilterStore实例||无|

### [](#计算属性-computed-2)计算属性 (Computed)

当前类中没有显式定义计算属性。计算属性通常基于其他可观察属性的值进行缓存和派生。

### [](#动作函数-actions-2)动作函数 (Actions)

动作函数用于执行可以修改可观察状态的操作。

||方法名||描述||参数||返回类型|
||setOperator||设置查询操作符||operator: Operator||void|
||setValue||设置查询字段值||value: any||void|
||getValue||获取查询字段值||无||any|
||setName||设置查询字段名称||name: string||void|
||getName||获取查询字段名称||无||string|
||getQueryValue||查询条件值处理，返回查询条件对象||无||object|

📢说明

- `FilterItem`类负责定义单个查询条件项，可以设置操作符、值、字段等。
- 通过构造函数可以初始化查询条件项的基础属性。
- 可观察属性如 `operator`、`name`、`value`、`field`允许状态变化被追踪和响应。
- 动作函数如 `setOperator`、`setValue`、`setName`等用于修改查询条件项的属性。
- `getQueryValue`方法用于获取查询条件项的值，构建查询条件对象。

请注意，文档中的动作函数和辅助函数的"是否可观察"列指明该动作是否会影响可观察状态。如果类中有其他计算属性或方法，请根据实际情况添加到文档中。

## [](#orderitem-类api文档)OrderItem 类API文档

### [](#构造函数constructor-3)构造函数(constructor)

`OrderItem`构造函数初始化排序项，包括名称、排序类型等属性。构造函数接收参数如下：

||参数名||类型||描述||默认值|
||name||string||排序字段名称||无|
||value||OrderType||排序类型||无|
||activated||boolean||是否激活||true|
||visible||boolean||是否可见||true|
||meta||any||元数据信息||无|

### [](#类属性parameters-3)类属性(Parameters)

||属性名||类型||是否可观察||描述||默认值|
||name||string||是||排序字段名称||无|
||value||OrderType||是||排序类型||无|

### [](#计算属性-computed-3)计算属性 (Computed)

当前类中没有显式定义计算属性。计算属性通常基于其他可观察属性的值进行缓存和派生。

### [](#动作函数-actions-3)动作函数 (Actions)

动作函数用于执行可以修改可观察状态的操作。

||方法名||描述||参数||返回类型|
||getQueryValue||获取排序项的值||无||object|
||setValue||设置排序类型||value: OrderType||void|
||getValue||获取当前排序类型||无||OrderType|

### [](#辅助函数-utilities)辅助函数 (Utilities)

当前类中没有定义辅助函数。

📢说明

- `OrderItem`类负责定义单个排序项，可以设置字段名称、排序类型等。
- 通过构造函数可以初始化排序项的基础属性。
- 可观察属性 `name`和 `value`允许状态变化被追踪和响应。
- 动作函数 `setQueryValue`用于获取排序项的值，构建为对象。
- 动作函数 `setValue`和 `getValue`用于设置和获取排序类型。
- 类支持排序类型的设置和获取。

请注意，文档中的动作函数的"是否可观察"列指明该动作是否会影响可观察状态。如果类中有其他计算属性或方法，请根据实际情况添加到文档中。

## [](#filterstore-扩展开发)FilterStore 扩展开发

// 1. 领域扩展使用示例

import { FilterStore } from 'ynf-core-engine/stores'

// 手动创建一个filterStore实例

const filterStore = new FilterStore()

// 基于filterStore创建自己的表单数据对象

class ExtendFilterStore extends FilterStore{

 constructor(storeMeta?: any, rootStore?: any) {

 super(storeMeta?: any, rootStore?: any);

 }

 // 自定义属性、方法

 ...

}

// 2. 扩展当前filterStore实例

function extendFormStore(rootStore: object) {

 // 使用 extendObservable 扩展属性、方法和计算属性

 extendObservable(rootStore.filterStore, {

 // observable 属性：添加一个新的 observable 属性

 filters: {

 category: 'all',

 priceRange: 'all',

 sortBy: 'latest'

 },

 // action 方法：添加一个新的 action 方法

 setCategory: action(function (category) {

 this.filters.category = category;

 }),

 // action 方法：添加另一个 action 方法

 setPriceRange: action(function (range) {

 this.filters.priceRange = range;

 }),

 // computed 计算属性：添加一个新的计算属性

 get activeFilters() {

 const active = [];

 for (const key in this.filters) {

 if (this.filters[key] !== 'all') {

 active.push(`${key}: ${this.filters[key]}`);

 }

 }

 return active.join(', ');

 }

 });

} 

extendFormStore(rootStore)

## [](#filterstore-典型示例)FilterStore 典型示例

// 单选参照设置值

rootStore?.filterStore?.getFilterItemByName("danxuanyinyong").setValue({id: "1623643074168094746", name: "浜烘皯甯"})

// 查询区设置并触发查询

rootStore?.filterStore?.getFilterItemByName(cl.name).setValue(cl.value)

rootStore?.filterStore?.copyCondition()

rootStore?.filterStore?.setQueryTrigger()

function ExtendReaction(){

 return {

 defaultSearchCondition: reaction(()=>rootStore?.filterStore.isQueryReady, (isQueryReady)=>{

 rootStore?.filterStore?.getFilterItemByName("danxuanyinyong").setValue({id: "1623643074168094746", name: "人民币"})

 rootStore?.filterStore?.copyCondition()

 rootStore?.filterStore?.setQueryTrigger()

 })

 }

};