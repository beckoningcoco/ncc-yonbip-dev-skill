---
title: "TableTreeReaction"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g03-table-tree-reaction-api"
section: "YNF-API"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, API]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# TableTreeReaction

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g03-table-tree-reaction-api | 所属：YNF-API

# [](#tabletreereaction)TableTreeReaction

主要功能介绍：（列表场景页面基本逻辑）

- 页面初始化：监听页面是否为运行时及是否执行初始化操作
- 点击查询：监听页面filterStore的queryTrigger标识执行查询操作
- 页面数据刷新：监听页面pageStore的bNeedRefresh标识执行页面数据刷新

## [](#tabletreereaction-设计器配置)TableTreeReaction 设计器配置

{

 "alias": "TableTreeReaction297", // 该reaction的唯一标识

 "caption": "基础服务",

 "compType": "xcontainer",

 "controlType": "TableTreeReaction", // reaction类型

 "dataSourceAlias": "mainEntity",

 "disabled": false,

 "filter": "filterStore",

 "libCode": "ynf-core-engine/reactions", // reaction来源路径

 "table": "tableStore",

 "tree": "treeStore",

 "visible": true,

}

## [](#tabletreereaction-参数说明)TableTreeReaction 参数说明

||属性类型||参数||类型||描述||默认值||必填|
||基础属性||alias||String||reaction实例名||-||是|
||基础属性||caption||String||显示在设计器的名称||-||是|
||基础属性||libCode||String||reaction来源库||-||是|
||基础属性||controlType||String||reaction类型||-||是|
||TableTreeReaction基础属性||list||String||表格store（兼容历史协议建议使用table）||"tableStore"||是|
||TableTreeReaction基础属性||filter||String||查询store||"filterStore"||是|
||TableTreeReaction基础属性||table||String||表格store||"tableStore"||是|
||TableTreeReaction基础属性||dataSourceAlias||String||数据源实体别名||-||是|
||TableTreeReaction基础属性||treeAlias||String||数据源实体别名(兼容历史单据协议，建议使用dataSourceAlias)||-||否|
||扩展属性params||lazyLoadTree||Boolean||是否开启懒加载||-||否|
||扩展属性params||billNo||String||单据页面编码||-||否|
||扩展属性params||overTenTips||String||外部配置的超过10层的错误提示||-||否|

## [](#tabletreereaction-api文档)TableTreeReaction API文档

// reaction是自执行函数，tabletreeReaction抽象了标准列表场景业务逻辑，支持扩展

// 场景一 页面初始化

init: 

mobx.when封装，页面初始化时请求queryTree接口

扩展:

beforeHook

beforeLoadTreeOnTableTreeHook

afterLoadTreeOnTableTreeHook

afterHook

// 场景二 触发查询

queryTrigger: 

mobx.reaction封装，携带filterStore查询条件请求queryTree接口

扩展:

beforeHook

beforeLoadTreeOnTableTreeHook

afterLoadTreeOnTableTreeHook

afterHook

// 场景三 页面接口重载

reload: 

mobx.reaction封装，页面重载时请求queryTree接口

扩展:

beforeHook

beforeLoadTreeOnTableTreeHook

afterLoadTreeOnTableTreeHook

afterHook

## [](#tabletreereaction-扩展开发)TableTreeReaction 扩展开发

// reaction 是一种 MobX 提供的工具，用于监控某个数据表述（data expression），并在该数据变化时触发特定的副作用（side effect）

// 1. 自定义业务需要的reaction，让应用状态保持同步

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

// 2. 使用钩子扩展tabletreereaction

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

## [](#tabletreereaction-典型示例)TableTreeReaction 典型示例

// TableTreeReaction初始化扩展

// 在默认reaction事件前后添加自定义操作（如修改数据等）

function ExtendReaction(rootStore){

 return {

 init: {

 beforeHook(rootStore: object, param: object) {

 // param是reaction协议可在该处执行修改

 // console.log(param)

 },

 afterHook(rootStore: object, res: object) {

 // init函数执行后事件

 },

 } 

 }

}