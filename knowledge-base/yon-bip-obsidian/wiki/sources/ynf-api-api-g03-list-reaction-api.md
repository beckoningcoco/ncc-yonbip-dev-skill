---
title: "ListReaction"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g03-list-reaction-api"
section: "YNF-API"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, API]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# ListReaction

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g03-list-reaction-api | 所属：YNF-API

# [](#listreaction)ListReaction

主要功能介绍：（列表场景页面基本逻辑）

- 页面初始化：监听页面是否为运行时执行初始化操作
- 点击查询：监听页面filterStore的queryTrigger标识执行查询操作
- 分页信息变化：监听页面pagingStore的pageInfoChanged标识执行分页数据查询
- 页面数据刷新：监听页面pageStore的bNeedRefresh标识执行页面数据刷新

## [](#listreaction-设计器配置)ListReaction 设计器配置

// reaction协议基本结构(设计器支持插入自动创建)

// 列表页面reaction

{

 "alias": "listReaction", // 该reaction的唯一标识

 "caption": "listReaction",

 "controlType": "ListReaction", // reaction类型

 "dataSourceAlias": "mainEntity",

 "filter": "filterStore", 

 "initPageSearch": true,

 "libCode": "ynf-core-engine/reactions", // reaction的来源路径

 "list": "tableStore",

 "listAction": "mobx://rootStore.actions.list",

 "paging": "pagingStore"

}

## [](#listreaction-参数说明)ListReaction 参数说明

||属性类型||参数||类型||描述||默认值||必填|
||基础属性||alias||String||reaction实例名||-||是|
||基础属性||caption||String||显示在设计器的名称||-||是|
||基础属性||libCode||String||reaction来源库||-||是|
||基础属性||controlType||String||reaction类型||-||是|
||ListReaction基础属性||filter||String||查询store||"filterStore"||是|
||ListReaction基础属性||list||String||表格store（兼容历史协议建议使用table）||"tableStore"||否|
||ListReaction基础属性||table||String||表格store||"tableStore"||是|
||ListReaction基础属性||paging||String||分页store||"pagingStore"||是|
||ListReaction基础属性||rollingLoad||Boolean||滚动加载--移动||-||否|
||ListReaction基础属性||dataSourceAlias||String||实体数据源名||-||是|
||扩展属性params||initPageSearch||Boolean||初始化页面查询控制||-||否|
||扩展属性params||noRefresh||Boolean||不刷新||-||否|
||扩展属性params||listAction||String||外部配置的listAction||-||否|
||扩展属性params||isListAction||Boolean||是否为listAction||-||否|
||扩展属性params||pagingTag||Boolean||paging标识||-||否|

## [](#listreaction-api文档)ListReaction API文档

// reaction是自执行函数，listReaction抽象了标准列表场景业务逻辑，支持扩展

// 场景一 页面初始化

init: 

mobx.when封装，主要通过监听pageStore.bRunInDesigner在页面初始化时请求list接口

钩子扩展:

beforeHook

beforeListHook

afterListHook

afterHook

// 场景二 触发查询

queryTrigger: 

mobx.reaction封装，主要通过监听filterStore.queryTrigger在页面触发查询时请求list接口

钩子扩展:

beforeHook

beforeListHook

afterListHook

afterHook

// 场景三 分页信息变化

pageInfoChanged: 

mobx.reaction封装，主要通过监听pagingStore.pageInfoChanged在页面分页信息变化时请求list接口

钩子扩展:

beforeHook

beforeListHook

afterListHook

afterHook

// 场景四 页面接口刷新

reload: 

mobx.reaction封装，主要通过监听pageStore.bNeedRefresh在页面重载刷新时请求list接口

钩子扩展:

beforeHook

beforeListHook

afterListHook

afterHook

## [](#listreaction-扩展开发)ListReaction 扩展开发

// reaction 是一种 MobX 提供的工具，用于监控某个数据表述（data expression），并在该数据变化时触发特定的副作用（side effect）

// 1. 自定义业务需要的reaction

export default function (rootStore: any) {

 return {

 // 自定义业务需要的reaction，在页面触发数据刷新时候自定义逻辑

autoBackdatedReasonReaction: reaction(

 () => rootStore.pageStore.bNeedRefresh,

 (newVal, oldVal) => {

 // 自定义逻辑

 }

 )

 };

}

// 2. 使用钩子扩展listreaction

export default function (rootStore: any) {

 return {

 init: {

 beforeHook: (rootStore, args) => {

 // 自定义逻辑

 },

 afterHook: (rootStore, res) => {

	// 自定义逻辑

 // const subData = rootStore.tableStore.getValue()

 // console.log("zzz---11", subData)

 }

 }

 };

}

## [](#listreaction-典型示例)ListReaction 典型示例

// 在默认reaction事件前后添加自定义操作（如修改数据等）

function ExtendReaction(rootStore){

 return {

 init: {

 beforeListHook(rootStore, res) {

 // 自定义列表排序条件

 rootStore?.filterStore?.addOrderBy("billDate", "desc")

 rootStore?.filterStore?.addOrderBy("code", "desc")

 },

 afterListHook(rootStore: object, res: object) {

 // list接口返回的summary信息--存储到summaryStore

 if (listRes?.data?.data && rootStore?.summaryStore) {

 rootStore.summaryStore.elementData = listRes?.data?.data

 }

 },

 } 

 }

}