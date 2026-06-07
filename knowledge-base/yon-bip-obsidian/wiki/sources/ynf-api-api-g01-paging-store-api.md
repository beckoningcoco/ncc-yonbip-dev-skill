---
title: "PagingStore"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g01-paging-store-api"
section: "YNF-API"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, API]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# PagingStore

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g01-paging-store-api | 所属：YNF-API

# [](#pagingstore)PagingStore

主要功能介绍：（pagingStore基本功能）

- pagingStore是分页组件的数据模型store，通常与表格数据对象tableStore同时使用
- 当从数据库中检索大量数据时，为了提高性能和用户体验可以将结果分页展示，用户可以通过分页控件切换不同的页码实现懒加载。

## [](#pagingstore-设计器配置)PagingStore 设计器配置

// 设计器协议描述了pagingStore信息，运行时会根据该协议实例化一个pagingStore实例

{

 "alias": "pagingStore", // 该store实例对象的唯一标识

 "caption": "pagingStore",

 "compType": "xcontainer",

 "controlType": "PagingStore",

 "disabled": false,

 "libCode": "ynf-core-engine", // store的来源路径

 "nid": "nid_247",

 "storeType": "PagingStore", // store类型

 "visible": true

}

## [](#pagingstore-类api文档)PagingStore 类API文档

### [](#构造函数constructor)构造函数(constructor)

构造函数初始化 `PagingStore`实例，设置默认的分页大小，并注册可观察属性、计算属性和动作的函数。构造函数接收参数如下：

||参数名||类型||描述||默认值|
||datasource||any||storeMeta，可选||无|
||_rootStore||any||根rootStore，可选||无|

### [](#类属性-parameters)类属性 (Parameters)

||属性名||类型||是否可观察||描述||默认值|
||pageIndex||number||是||当前页码||1|
||pageSize||number||是||每页显示的条目数量||10|
||total||number||是||总条目数量||0|
||pageInfoChanged||boolean||是||分页信息是否发生变化||false|
||errorMessage||string||是||错误消息||''|
||storeType||string||否||存储类型，固定为 'PagingStore'||'PagingStore'|
||hooks||any||否||钩子函数集合，用于自定义行为||{}|

### [](#计算属性-computed)计算属性 (Computed)

||属性名||类型||描述||依赖项|
||pageInfo||object||当前分页信息的快照||pageIndex, pageSize, total|
||isFirst||boolean||是否为第一页||pageIndex|
||isLast||boolean||是否为最后一页||pageIndex, pageSize, total|
||endPageIndex||number||最后一页的页码||total, pageSize|

### [](#动作函数actions)动作函数(Actions)

||方法名||描述||参数||输出|
||setPageIndex||设置当前页码||index: number||void|
||setPageSize||设置每页显示的条目数量||index: number||void|
||setPageTotal||设置总条目数量||num: number||void|
||setPageInfo||设置分页信息||pageInfo: object||void|
||previous||跳转到前一页，如果当前页大于第一页||无||void|
||next||跳转到后一页，如果滚动加载准备好||无||void|
||first||跳转到第一页||无||void|
||last||跳转到最后一页||无||void|
||onChange||根据传入的分页信息更新当前分页状态||pageInfo: Pagination||void|
||init||初始化分页信息，重置页码和条目数量||无||void|

请注意，`Action`函数通常不返回值（即 `void`），因为它们的主要目的是修改可观察状态。然而，如果某个 `Action`函数确实有返回值，应该在"输出"列中明确指出。

## [](#pagingstore-扩展开发)PagingStore 扩展开发

// 1. 领域扩展使用示例

import { PagingStore } from 'ynf-core-engine/stores'

// 手动创建一个pagingStore实例

const pagingStore = new PagingStore()

// 基于pagingStore创建自己的表单数据对象

class ExtendPagingStore extends PagingStore{

 constructor(storeMeta?: any, rootStore?: any) {

 super(storeMeta?: any, rootStore?: any);

 }

 // 自定义属性、方法

 ...

}

// 2. 扩展当前pagingStore实例

function extendPagingStore(rootStore: object) {

 // 使用 extendObservable 扩展属性、方法和计算属性

 extendObservable(rootStore.pagingStore, {

 // observable 属性：添加一个新的 observable 属性

 selectedPage: null,

 // action 方法：添加一个新的 action 方法

 selectPage: action(function (page) {

 if (page >= 1 && page <= this.totalPages) {

 this.selectedPage = page;

 } else {

 console.error(`Page ${page} is out of range.`);

 }

 }),

 // computed 计算属性：添加一个新的计算属性

 get pageRange() {

 return `Page ${this.currentPage} of ${this.totalPages}`;

 }

 });

} 

extendPagingStore(rootStore)

## [](#pagingstore-典型示例)PagingStore 典型示例

// 根据pagingStore页码的变化做一些额外的处理

import { reaction } from 'mobx';

reaction(

 () => pagingStore.pageIndex,

 (pageIndex) => {

 // 发送请求的逻辑

 console.log('pageIndex changed:', pageIndex);

 // 在这里写入发送请求的代码

 sendRequest(pageIndex);

 }

);