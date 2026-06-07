---
title: "TreeListReaction"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g03-tree-list-reaction-api"
section: "YNF-API"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, API]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# TreeListReaction

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g03-tree-list-reaction-api | 所属：YNF-API

# [](#treelistreaction)TreeListReaction

主要功能介绍：（树表（左树右表）场景页面）

- 页面初始化加载：监听页面是否为运行时状态执行初始化操作
- 页面数据刷新：监听页面pageStore的bNeedRefresh标识执行页面数据刷
- 树节点选中：加载树节点对应的详情detail数据
- 分页信息变化：监听页面pagingStore的pageInfoChanged标识执行数据查询
- 默认带入：新增卡片数据自动带入上级字段

## [](#treelistreaction-设计器配置)TreeListReaction 设计器配置

{

 "alias": "TreeListReaction250", // 该reaction的唯一标识

 "caption": "基础服务",

 "compType": "xcontainer",

 "controlType": "TreeListReaction", // reaction类型

 "dataSourceAlias": "danka_zuoshuyoubiao",

 "disabled": false,

 "filter": "filterStore",

 "libCode": "ynf-core-engine/reactions", // reaction来源路径

 "nid": "nid_249",

 "paging": "pagingStore",

 "table": "tableStore",

 "tree": "treeStore",

 "treeAlias": "shu0428List",

 "visible": true

}

## [](#treelistreaction-参数说明)TreeListReaction 参数说明

||属性类型||参数||类型||描述||默认值||必填|
||基础属性||alias||String||reaction实例名||-||是|
||基础属性||caption||String||显示在设计器的名称||-||是|
||基础属性||libCode||String||reaction来源库||-||是|
||基础属性||controlType||String||reaction类型||-||是|
||TreeListReaction基础属性||filter||String||查询store||"filterStore"||是|
||TreeListReaction基础属性||paging||String||分页store||"pagingStore"||是|
||TreeListReaction基础属性||table||String||表格store||"tableStore"||是|
||TreeListReaction基础属性||dataSourceAlias||String||数据源实体别名||-||是|
||TreeListReaction基础属性||treeAlias||String||数据源实体别名(兼容历史单据协议，建议使用dataSourceAlias)||-||否|
||TreeListReaction基础属性||tree||String||树store||"treeStore"||否|
||TreeListReaction基础属性||list||String||表格store（兼容历史协议建议使用table）||||否|
||扩展属性params||billNo||String||单据页面编码||-||否|
||扩展属性params||refreshTable||Boolean||是否刷新tree请求||-||否|
||扩展属性params||refreshTree||Boolean||是否刷新table请求||-||否|
||扩展属性params||closeInitTreeSearch||Boolean||关闭初始化tree查询||-||否|
||扩展属性params||closeInitListSearch||Boolean||关闭初始化list查询||-||否|

## [](#treelistreaction-api文档)TreeListReaction API文档

// reaction是自执行函数，TreeListReaction抽象了标准列表场景业务逻辑，支持扩展

// 场景一 页面初始化

init: 

mobx.when封装，页面初始化时请求queryTree detail接口

扩展:

beforeHook

beforeLoadTreeOnTreeListHook

afterLoadTreeOnTreeListHook

beforeLoadListOnTreeListHook

afterLoadListOnTreeLisHook

afterHook

// 场景二 选择树节点

treeSelected: 

mobx.reaction封装，页面触发树节点时请求detail接口

扩展:

beforeHook

beforeLoadListOnTreeListHook

afterLoadListOnTreeLisHook

afterHook

// 场景三 分页变化

pageInfoChanged: 

mobx.reaction封装，页面卡片新增状态时自动带入选中节点到上级节点字段

扩展:

beforeHook

beforeLoadListOnTreeListHook

afterLoadListOnTreeLisHook

afterHook

// 场景四 页面接口重载

reload: 

mobx.reaction封装，页面重载时请求queryTree detail接口

扩展:

beforeHook

beforeLoadTreeOnTreeListHook

afterLoadTreeOnTreeListHook

beforeLoadListOnTreeListHook

afterLoadListOnTreeLisHook

afterHook

// 场景五 触发查询

queryTrigger: 

mobx.reaction封装，页面触发查询时请求list接口

扩展:

beforeHook

beforeLoadListOnTreeListHook

afterLoadListOnTreeLisHook

afterHook

## [](#treelistreaction-扩展开发)TreeListReaction 扩展开发

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

// 2. 使用钩子扩展treelistreaction

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

## [](#treelistreaction-典型示例)TreeListReaction 典型示例

// TreeListReaction初始化扩展

// 在默认reaction事件前后添加自定义操作（如修改store等）

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