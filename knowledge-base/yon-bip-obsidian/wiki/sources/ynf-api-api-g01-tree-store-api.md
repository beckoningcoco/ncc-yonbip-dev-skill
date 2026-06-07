---
title: "TreeStore"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g01-tree-store-api"
section: "YNF-API"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, API]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# TreeStore

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g01-tree-store-api | 所属：YNF-API

# [](#treestore)TreeStore

主要功能介绍：（treeStore基本功能）

- treeStore树对象的数据模型，支持树节点选择、添加、更新、删除等

## [](#treestore设计器配置)TreeStore设计器配置

// TreeStore数据对象协议基本结构(设计器支持插入自动创建)

{

 "libCode": "ynf-core-engine", // store数据模型的导出代码库

 "storeType": "TreeStore",

 "controlType": "TreeStore", // store数据对象类型

 "alias": "treeStore", // treeStore实例对象别名alias

 "caption": "treeStore", 

 "type": "entity",

 "fieldsArr": [...] // 字段描述

}

## [](#treestore-类api文档)TreeStore 类API文档

### [](#构造函数constructor)构造函数(constructor)

构造函数初始化 `TreeStore`实例，设置默认属性，并注册可观察属性。构造函数接收参数如下：

||参数名||类型||描述||默认值|
||_storeMeta||any||storeMeta，可选||无|
||rootStore||any||根存储实例，可选||无|

### [](#类属性parameters)类属性(Parameters)

||属性名||类型||是否可观察||描述||默认值|
||storeType||string||否||store类型标识符||'TreeStore'|
||treename||string||是||树形结构实体名称||''|
||selectedKeys||Array `<string>`||是||当前选中节点的keys集合||[]|
||checkedKeys||Array `<string>`||是||被勾选节点的keys集合||[]|
||keyMap||object||是||树节点key到节点对象的映射||{}|
||fieldNames||object||否||树节点字段名称映射||`{ title: 'name', key: 'id', children: 'children' }`|
||treeData||Array `<object>`||否||原始树形数据源||[]|
||dataSource||Array `<object>`||是||可观察的树形数据源||[]|

### [](#计算属性-computed)计算属性 (Computed)

计算属性是基于可观察状态的派生值，通常是只读的。

||属性名||类型||描述||依赖项|
||getSelectedNodes||Array `<object>`||根据selectedKeys获取选中节点||selectedKeys, treeData|
||getCheckedNodes||Array `<object>`||根据checkedKeys获取勾选节点||checkedKeys, treeData|

### [](#动作和辅助函数-actions-and-utilities)动作和辅助函数 (Actions and Utilities)

动作是改变可观察状态的方法，通常是同步执行的。辅助函数用于执行不直接修改状态的操作，可能依赖于可观察属性。

||方法名||描述||输入参数||输出|
||setName||设置树形结构实体名称||name: string||void|
||getName||获取当前树形结构实体名称||无||string|
||onSelect||设置选中节点的keys集合||selectedKeys: Array `<string>`||void|
||onCheck||设置勾选节点的keys集合||checkedKeys: Array `<string>`||void|
||addTreeNode||添加树节点到数据源下||id: string, data: object||void|
||updateTreeNode||更新树节点数据||data: object||void|
||delTreeNode||删除树节点||data: object||void|
||removeKeyMap||从映射对照表中删除节点||data: object||void|
||delAndSelectTreeNode||删除节点后选择另一个节点，如果可能||data: object, index: number||void|
||createKeyMap||为树节点数据创建映射对照表，优化查找效率||data: Array `<object>`||void|
||setValue||设置整个树形数据源，通常用于从服务器获取新数据||data: Array `<object>`||void|
||clear||清空所有数据，重置store状态||无||void|
||findNodeByKey||根据key查找树节点||data: Array `<object>`, id: string||object|
||getValue||获取当前数据源的JSON序列化形式||无||Array `<object>`|

请注意，`Action`函数和辅助函数通常不返回值（即 `void`），除非它们执行了某些返回值的操作。计算属性是响应可观察属性变化的，它们依赖于其他可观察属性的值。

## [](#treestore-扩展开发)TreeStore 扩展开发

// 1. 领域扩展使用示例

import { TreeStore } from 'ynf-core-engine'

// 手动创建一个treeStore实例

const treeStore = new TreeStore()

// 基于treeStore创建自己的tree数据对象

class ExtendTreeStore extends TreeStore{

 constructor(prop?: any, rootStore?: any) {

 super();

 }

 // 自定义属性、方法

 ...

}

// 2. 扩展当前treeStore实例

function extendTreeStore(rootStore: object) {

 // 使用 extendObservable 扩展 treeStore 对象的属性、方法和计算属性

 extendObservable(rootStore.treeStore, {

 // observable 属性示例：添加一个新的 observable 属性

 newNodeName: '',

 // action 方法示例：添加一个新的 action 方法

 addNode: action(function (node) {

 this.nodes.push(node);

 }),

 // computed 计算属性示例：添加一个新的计算属性

 get nodeCount() {

 return this.nodes.length;

 }

 });

} 

extendTreeStore(rootStore)

## [](#treestore-典型示例)TreeStore 典型示例