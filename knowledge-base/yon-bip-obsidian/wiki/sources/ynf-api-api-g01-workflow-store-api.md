---
title: "WorkFlowStore"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g01-workflow-store-api"
section: "YNF-API"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, API]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# WorkFlowStore

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g01-workflow-store-api | 所属：YNF-API

# [](#workflowstore)WorkFlowStore

主要功能介绍：（workFlowStore基本功能）

- 接入流程中心的审批组件及相关功能；
- 封装api加载前端资源，调起流程中心封装的审批组件；
- 初始化审批组件并获取当前单据审批组件的实例；

## [](#workflowstore-类api文档)WorkFlowStore 类API文档

### [](#构造函数constructor)构造函数(constructor)

构造函数初始化 `WorkFlowStore`实例，设置属性，并注册可观察属性和计算属性。同时，它处理页面刷新和审批状态变化的响应逻辑。构造函数接收参数如下：

||参数名||类型||描述||默认值|
||isTable||boolean||是否为列表页||false|
||rootStore||any||rootStore实例||无|
||formStore||any||详情页对应的store||无|
||rowStore||any||列表页对应的store||无|

### [](#类属性parameters)类属性(Parameters)

||属性名||类型||是否可观察||描述||默认值|
||storeType||string||否||store类型标识符||'WorkFlowStore'|
||isTable||boolean||是||是否为列表页||false|
||rootStore||any||是||rootStore实例||无|
||formStore||any||是||详情页对应的store||无|
||rowStore||any||是||列表页对应的store||无|
||flowInstance||any||是||流程实例||null|
||actionBtns||any||是||流程按钮||[]|
||detailUrl||string||是||流程图地址||''|
||fieldAuth||any||是||流程权限||null|
||latestStatus||boolean||是||是否是最新状态||false|
||flowJsLoaded||boolean||是||审批中心js资源加载完毕||false|
||noNeedRefreshWorkflow||boolean||是||是否不执行refresh workflow||false|
||flowIsError||boolean||是||审批流程是否加载失败||false|
||currentBillId||string||是||当前billId||""|
||hooks||any||是||注册事件(通过formStore注册)||无|

### [](#计算属性-computed)计算属性 (Computed)

计算属性是基于可观察属性的派生值。

||属性名||类型||描述||依赖项|
||currentTaskAuth||any||获取当前任务的权限信息||fieldAuth|

### [](#动作函数-actions)动作函数 (Actions)

动作函数用于执行特定的操作，可能会修改可观察属性。

||方法名||描述||参数||返回类型|
||init||初始化审批流程||无||void|
||loadFlowJS||加载审批中心js资源||无||void|
||setFormStore||设置审批关联的formStore||form: FormStore||void|
||setRowStore||设置审批关联的rowStore||row: BaseRowStore`<any>`||void|
||getDetailUrl||获取审批中心需要的pc和移动url地址||type: string||string|
||setHooks||设置审批的hooks钩子||hooks: object||void|
||showOldFlow||移动端旧版审批组件调用方式||el: string||void|
||renderAssigneeNew||pc端发起指派||assignData: any||Promise|
||showAssignCheck||移动端发起指派||assignInfoData: any||Promise|
||setTaskAuth||设置任务权限信息||newAuth: any||void|

### [](#反应式函数-reactions)反应式函数 (Reactions)

反应式函数用于响应特定属性的变化。

- 页面刷新，更新store
- 详情页审批状态变化，更新store

## [](#workflowstore-扩展开发)WorkFlowStore 扩展开发

// 1. 领域扩展使用示例

import { WorkFlowStore } from 'ynf-core-engine'

// 手动创建一个workFlowStore实例

const workFlowStore = new WorkFlowStore()

// 基于workFlowStore创建自己的workflow数据对象

class ExtendWorkFlowStore extends WorkFlowStore{

 constructor(prop?: any, rootStore?: any) {

 super();

 }

 // 自定义属性、方法

 ...

}

// 使用：加载流程中心审批相关js并完成初始化

await workFlowStore.loadFlowJS()

workFlowStore.init()

// 2. 扩展当前treeStore实例

function extendWorkFlowStore(rootStore: object) {

 extendObservable(rootStore.pageStore.workFlowStore, {

 // observable 属性示例

 tasks: [],

 // observable 属性：selectedTaskId

 selectedTaskId: null,

 // action 方法示例：addTask

 addTask: action(function (task) {

 this.tasks.push(task);

 }),

 // action 方法示例：selectTask

 selectTask: action(function (taskId) {

 this.selectedTaskId = taskId;

 }),

 // computed 计算属性示例：completedTasks

 get completedTasks() {

 return this.tasks.filter(task => task.completed);

 }

 });

} 

 extendWorkFlowStore(rootStore)

## [](#workflowstore-典型示例)WorkFlowStore 典型示例

// WorkFlowStore提供了钩子setHooks, 可以在调用审批前设置相关hooks

function ExtendStore(rootStore){

 rootStore.pageStore.workFlowStore.setHooks({

 initWorkFlow: (workFlowStore)=>{

 console.log('setWorkFlowHooks==============================initWorkFlow')

 rootStore.pageStore.params.aaaaa = "1111111111111"

 },

 onBeforeAction: (data)=>{

 console.log('setWorkFlowHooks==============================onBeforeAction')

 return new Promise((resolve) => {

 resolve(true);

 });

 },

 onAfterAction: (data)=>{

 console.log('setWorkFlowHooks==============================onAfterAction')

 },

 onCloseAction: (data) => {

 console.log('setWorkFlowHooks==============================onCloseAction')

 }

 })

};

return { 

 ExtendStore

};