---
title: "TreeCardReaction"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g03-tree-card-reaction-api"
section: "YNF-API"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, API]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# TreeCardReaction

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g03-tree-card-reaction-api | 所属：YNF-API

# [](#treecardreaction)TreeCardReaction

主要功能介绍：（树卡页（左树右卡页）页面逻辑基本逻辑）

- 页面初始化加载：监听页面是否为运行时状态执行初始化操作
- 页面数据刷新：监听页面pageStore的bNeedRefresh标识执行页面数据刷
- 树节点选中：加载树节点对应的详情detail数据
- 默认带入：新增卡片数据自动带入上级字段

## [](#treecardreaction-设计器配置)TreeCardReaction 设计器配置

{

 "alias": "TreeCardReaction297", // 该reaction的唯一标识

 "caption": "基础服务",

 "cardStore": "cardStore",

 "compType": "xcontainer",

 "controlType": "TreeCardReaction", // reaction类型

 "dataSourceAlias": "mainEntity",

 "disabled": false,

 "filter": "filterStore",

 "libCode": "ynf-core-engine/reactions", // reaction来源路径

 "tree": "treeStore",

 "visible": true

}

## [](#treecardreaction-参数说明)TreeCardReaction 参数说明

||属性类型||参数||类型||描述||默认值||必填|
||基础属性||alias||String||reaction实例名||-||是|
||基础属性||caption||String||显示在设计器的名称||-||是|
||基础属性||libCode||String||reaction来源库||-||是|
||基础属性||controlType||String||reaction类型||-||是|
||TreeCardReaction基础属性||tree||String||树stor||"treeStore"||是|
||TreeCardReaction基础属性||filter||String||查询store||"filterStore"||是|
||TreeCardReaction基础属性||cardStore||String||区域store||"cardStore"||是|
||TreeCardReaction基础属性||dataSourceAlias||String||数据源实体别名||-||是|
||TreeCardReaction基础属性||treeAlias||String||数据源实体别名(兼容历史单据协议，建议使用dataSourceAlias)||-||否|
||扩展属性params||billNo||String||单据页面编码||-||否|

## [](#treecardreaction-api文档)TreeCardReaction API文档

// reaction是自执行函数，treeCardReaction抽象了标准列表场景业务逻辑，支持扩展

// 场景一 页面初始化

init: 

mobx.when封装，页面初始化时请求queryTree detail接口

扩展:

beforeHook

beforeLoadTreeOnTreeCardHook

afterLoadTreeOnTreeCardHook

afterHook

// 场景二 选择树节点

treeSelected: 

mobx.reaction封装，页面触发树节点时请求detail接口

扩展:

beforeHook

afterHook

// 场景三 defaultInput

pageInfoChanged: 

mobx.reaction封装，页面卡片新增状态时自动带入选中节点到上级节点字段

扩展:

beforeHook

afterHook

// 场景四 页面接口重载

reload: 

mobx.reaction封装，页面重载时请求queryTree detail接口

扩展:

beforeHook

beforeLoadTreeOnTreeCardHook

afterLoadTreeOnTreeCardHook

afterHook

## [](#treecardreaction-扩展开发)TreeCardReaction 扩展开发

// reaction 是一种 MobX 提供的工具，用于监控某个数据表述（data expression），并在该数据变化时触发特定的副作用（side effect）

// 1. 自定义业务需要的reaction，让应用状态保持同步

export default function (rootStore: any) {

 return {

 // 自定义业务需要的reaction，让应用状态保持同步

autoBackdatedReasonReaction: reaction(

 () => rootStore.formStore.visibleToBackdatedReason,

 (newVal, oldVal) => {

 rootStore?.formStore.get('backDateCause')?.setRequired(newVal)

 }

 )

 };

}

// 2. 使用钩子扩展treeCardReaction

export default function (rootStore: any) {

 return {

 init: {

 beforeHook: (rootStore, args) => {

 // 自定义逻辑

 },

 afterHook: (rootStore, res) => {

 // 自定义逻辑

 // const subData = rootStore.ysy0627sListStore.getValue()

 // console.log("zzz---11", subData)

 }

 }

 };

}

## [](#treecardreaction-典型示例)TreeCardReaction 典型示例

// treeCardReaction初始化扩展

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