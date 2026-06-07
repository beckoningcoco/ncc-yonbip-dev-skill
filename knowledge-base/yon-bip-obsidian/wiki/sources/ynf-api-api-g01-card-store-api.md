---
title: "CardStore"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g01-card-store-api"
section: "YNF-API"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, API]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# CardStore

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g01-card-store-api | 所属：YNF-API

# [](#cardstore)CardStore

主要功能介绍：（cardStore基本功能）

- cardStore 分块区域管理Store，用于页面formStore、子表tableStore等分块区域化管理
- 提供该区域下状态管理、区域检验、值的收集与设置等

## [](#cardstore设计器配置)CardStore设计器配置

// CardStore数据对象协议基本结构(设计器支持插入自动创建) cardStore用来分区域管理页面对象通常用于详情页，包含控制受控区域状态（编辑、浏览、新增等状态)、页面数据收集和设置等

{

 "alias": "cardStore",

 "caption": "cardStore",

 "compType": "xcontainer",

 "controlType": "CardStore", // store数据对象类型

 "dataSource": "mainEntity",

 "disabled": false,

 "formStore": "formStore", // 受控表单store

 "libCode": "ynf-core-engine", // store数据模型的导出代码库

 "nid": "nid_392",

 "storeType": "CardStore",

 "tableStores": [ // 受控子表stores，支持多个子表

 {

 "alias": "ynf_son_oneListStore", // 受控子表

 "dataSource": "ynf_son_oneList", // 数据源别名alias

 "filter": "ynf_son_oneListFilterStore", // 子表查询store

 "paging": "ynf_son_oneListPagingStore" // 子表分页store

 },

 {

 "alias": "test_ynf_son_twoListStore",

 "dataSource": "test_ynf_son_twoList",

 "filter": "test_ynf_son_twoListFilterStore",

 "paging": "test_ynf_son_twoListPagingStore"

 }

 ],

 "visible": true,

 "UIT#designProps": {

 "UIT#controlOrderArr": [],

 "UIT#otherOrderArr": []

 }

}

## [](#cardstore-类api文档)CardStore 类API文档

### [](#构造函数constructor)构造函数(constructor)

`CardStore`构造函数初始化卡片视图的存储，包括子表和孙表的数据和行为。它负责设置UI状态、注册反应式函数以及处理数据合并逻辑。构造函数接收参数如下：

||参数名||类型||描述||默认值|
||props||any||包含formStore、tableStores和dataSource的配置对象||无|
||rootStore||any||根存储实例，用于访问其他store和全局状态||无|

### [](#类属性parameters)类属性(Parameters)

||属性名||类型||是否可观察||描述||默认值|
||dataClean||any||是||用于存储原始数据，供取消编辑时恢复数据用||null|
||formStore||string||否||表单存储的别名||''|
||dataSource||string||否||数据源描述||''|
||tableStores||Array||否||子表存储数组||[]|
||rootStore||any||是||页面根rootStore实例||{}|
||uiState||string||是||当前界面状态，如编辑、浏览等||'init'|
||storeType||string||否||存储类型标识符||'CardStore'|
||merging||boolean||否||是否处于数据合并过程中||false|
||mergeStrategy||any||否||数据合并策略||defaultMergeStrategy|

### [](#计算属性-computed)计算属性 (Computed)

计算属性是基于可观察状态的派生值。

||属性名||返回类型||描述||依赖项|
||isBrowse||boolean||是否处于浏览态||uiState|
||isEdit||boolean||是否处于编辑态（包括新增和编辑）||uiState|
||isAdd||boolean||是否处于新增态||uiState|

### [](#动作函数-actions)动作函数 (Actions)

动作函数用于执行可以修改可观察状态的操作。

||方法名||描述||参数||返回类型|
||setUiState||设置界面状态，同步到表单和子表存储||uiState: string||void|
||setValue||设置数据，可以选择合并或替换||data: any, options: object||void|
||saveSubRow||保存子表行数据，通常在子表编辑后触发||options: object||void|
||getValue||获取cardStore管理区域数据||dirtyCheck：boolean||object|

### [](#辅助函数-utilities)辅助函数 (Utilities)

辅助函数用于执行不直接修改状态的操作。

||方法名||描述||参数||返回类型|
||validate||验证数据是否符合要求，包括表单和表格数据||无||boolean|
||dispatchData||分发数据到成员，包括表单和表格数据存储||无||void|
||mergeData||合并数据到成员||data: any, mergeStrategy: object||void|

### [](#反应式函数-reactions)反应式函数 (Reactions)

反应式函数用于响应特定属性的变化。

- 页面状态变更reaction：当UI状态变化时，执行特定的逻辑。
- rootStore就绪状态变化reaction：当rootStore准备好后，执行初始化逻辑。

📢说明

- `CardStore`类负责管理卡片视图中的主表、子表和孙表的数据和行为。
- 通过 `setUiState`方法可以同步界面状态到表单和所有子表存储。
- `setValue`方法用于设置数据，支持合并或替换现有数据。
- `add`方法用于处理新增操作，设置默认值并打开新增界面。
- `saveSubRow`和 `openSubPageByRow`方法分别用于处理子表的保存和详情页的跳转。
- 计算属性 `isBrowse`、`isEdit`和 `isAdd`用于判断当前的界面状态。
- 辅助函数 `validate`、`dispatchData`和 `mergeData`提供了数据验证、分发和合并逻辑。
- 反应式函数 `UIStateReaction`和 `rootStoreReadyReaction`用于响应状态变化和rootStore的就绪状态。

## [](#cardstore-扩展开发)CardStore 扩展开发

// 1. 领域扩展使用示例创建自己的CardStore

import { CardStore } from 'ynf-core-store'

// 手动创建一个CardStore实例

const cardStore = new CardStore()

// 基于CardStore创建自己的cardStore数据对象

class ExtendCardStore extends CardStore{

 constructor(props: any, rootStore: any) {

 super(props: any, rootStore: any);

 }

 // 自定义属性、方法

 ...

}

// 2. 扩展当前cardStore实例

function extendCardStore(rootStore: object) {

 extendObservable(rootStore.cardStore, {

 // observable 属性

 cards: [],

 // action 方法

 addCard(title, description) {

 const newId = this.cards.length + 1;

 this.cards.push({ id: newId, title, description, completed: false });

 },

 // computed 计算属性

 get totalCards() {

 return this.cards.length;

 }

 });

} 

extendCardStore(rootStore)

## [](#cardstore-典型示例)CardStore 典型示例