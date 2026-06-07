---
title: "CardReaction"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g03-card-reaction-api"
section: "YNF-API"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, API]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# CardReaction

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g03-card-reaction-api | 所属：YNF-API

# [](#cardreaction)CardReaction

主要功能介绍：（卡片详情场景页面基本逻辑）

- 页面初始化加载：监听页面是否为运行时状态执行初始化操作
- 页面数据刷新：监听页面pageStore的bNeedRefresh标识执行页面数据刷
- 主组织及交易类型相关逻辑
- 单卡详情页子表查询逻辑（完善中...）

## [](#cardreaction-设计器配置)CardReaction 设计器配置

// reaction协议基本结构(设计器支持插入自动创建)

// 详情页面reaction

{

 "alias": "cardReaction", // 该reaction的唯一标识

 "caption": "cardReaction",

 "cardStore": "cardStore",

 "controlType": "CardReaction", // reaction类型

 "libCode": "ynf-core-engine/reactions", // reaction来源路径

 "nid": "nid_cardReaction_684",

 "UIT#designProps": {

 "UIT#isShow": true,

 "UIT#baseControlType": "CardReaction",

 "UIT#baseLibCode": "ynf-core-engine/reactions"

 }

}

## [](#cardreaction-参数说明)CardReaction 参数说明

||属性类型||参数||类型||描述||默认值||必填|
||基础属性||alias||String||reaction实例名||-||是|
||基础属性||caption||String||显示在设计器的名称||-||是|
||基础属性||libCode||String||reaction来源库||-||是|
||基础属性||controlType||String||reaction类型||-||是|
||CardReaction基础属性||cardStore||String||区域cardStore||"cardStore"||是|
||CardReaction基础属性||dataSourceAlias||String||实体数据源名||-||是|
||扩展属性params||detailAction||Boolean||外部配置的detailAction||-||否|
||扩展属性params||copyAction||Boolean||外部配置的copyAction||-||否|
||扩展属性params||addAction||String||外部配置的addAction||-||否|
||扩展属性params||copyAllData||Boolean||复制是否请求全部数据||分页size||否|
||扩展属性params||subSearchErrorMessage||Boolean||子表查询前错误提示配置语||-||否|
||扩展属性params||stopSubPagingWarning||Boolean||关闭子表页码切换的提示||-||否|
||扩展属性params||subPagingErrorMessage||String||子表页码切换错误提示配置语||-||否|

## [](#cardreaction-api文档)CardReaction API文档

// reaction是自执行函数，cardReaction抽象了标准列表场景业务逻辑，支持扩展

// 场景一 页面初始化

init: 

mobx.when封装，页面初始化时请求detail接口

扩展:

beforeHook

afterHook

// 场景二 页面接口重载

reload: 

mobx.reaction封装，页面初始化时请求detail接口

扩展:

beforeHook

afterHook

## [](#cardreaction-扩展开发)CardReaction 扩展开发

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

// 2. 使用钩子扩展cardreaction

export default function (rootStore: any) {

 return {

 init: {

 beforeHook: (rootStore, args) => {

 // 自定义逻辑

 },

 afterHook: (rootStore, res) => {

 // 自定义逻辑

 // const subData = rootStore.formStore.getValue()

 // console.log("zzz---11", subData)

 }

 }

 };

}

## [](#cardreaction-典型示例)CardReaction 典型示例

// CardReaction初始化扩展

// 在默认reaction事件前后添加自定义操作（如修改数据等）

function ExtendReaction(rootStore){

 return {

 init: {

 beforeHook(rootStore: object, res: object) {

 // 初始化前处理写这里

 },

 afterHook(rootStore: object, res: object) {

 // 初始化后处理逻辑写这里

 reaction(()=>rootStore.formStore.getValue('id'), (id)=>{

rootStore.formStore.get('econtractTempId').setValue(id)

})

 },

 } 

 }

}