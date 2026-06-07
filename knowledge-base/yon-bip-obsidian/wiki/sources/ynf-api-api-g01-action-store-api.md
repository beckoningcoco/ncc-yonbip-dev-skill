---
title: "ActionStore"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g01-action-store-api"
section: "YNF-API"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, API]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# ActionStore

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g01-action-store-api | 所属：YNF-API

# [](#actionstore)ActionStore

主要功能介绍：（actionStore基本功能）

- `ActionStore`类采用策略设计模式，所有的Action最终会通过 `ActionStore`基类面向对象实例化，并且存储在 `rootStore.actions` 命名空间下向全站提供Action服务，`ActionStore`存在的意义处理用来执行 `Action`之外我们还为 `Action`抽象了显隐属性、可用属性、别名、扩展、执行中状态属性等等。
- 更新状态：action方法通过请求接口等操作完成数据对象store的状态更新，依赖Mobx的响应式机制，当状态发生变化时，action更新的数据对象会自动通知到依赖这些状态的组件自动重新渲染。
- 处理异常操作：action方法可以包含异步操作，如API请求、数据获取等。当进一步完成后，action方法会自动更新应用中的状态。

## [](#actionstore-类设计)ActionStore 类设计

### [](#设计器配置)设计器配置

// 配置在设计器actions下的协议，均通过ActionStore这个类实例化下述action

{

 "alias": "save", // 该action的唯一标识

 "caption": "保存",

 "caption_resid": "UID:P_LIB-WEB-YNF-FE_18A20B5605A8021B",

 "controlType": "save", // action类型

 "iOrder": 250,

 "libCode": "ynf-core-engine/actions/bill", // action来源路径

 "nid": "nid_save_888",

 "orderNum": 25,

 "params": {

 "cardStoreKey": "cardStore",

 "entityUri": "AT1B83CC880B58000B.AT1B83CC880B58000B.yizhuduozi",

 "isGoBackAfterSave": false,

 "url": [

 "/bill/save"

 ]

 }

}

### [](#actionstore类扩展)ActionStore类扩展

- 覆盖模式：如果通过扩展doAction覆盖实现，那么则会覆盖内置action的实现，逻辑完全由扩展实现
- 插入模式：如果通过扩展Hook钩子扩展实现，则会通过扩展钩子实现action插入代码的效果

## [](#actionstore-类api文档)ActionStore 类API文档

### [](#构造函数constructor)构造函数(constructor)

`ActionStore`构造函数初始化实例，设置基础属性，应用 `makeAutoObservable`自动配置MobX的可观察性，并设置一个 `when`侦听器以等待 `rootStore.ready`为真时自动应用可观察性。构造函数接收参数如下：

||参数名||类型||描述||默认值|
||props||any||actionMeta协议||无|
||rootStore||any||根存储实例，用于访问其他store和全局状态||无|

### [](#类属性parameters)类属性(Parameters)

||属性名||类型||是否可观察||描述||默认值|
||storeType||string||是||类别声明||'ActionStore'|
||name||string||否||实例名称，对应协议里面的alias字段，便于调试和日志||''|
||caption||string||否||实例标题，对应协议里面的caption字段，便于调试和日志||''|
||libCode||string||否||引用的action包名，对应协议里面的libCode字段，便于调试和日志||''|
||controlType||string||否||引用的action函数，对应协议里面的controlType字段，便于调试和日志||''|
||rootStore||any||是||内置引用rootStore||{}|
||params||any||是||实例参数，对应协议里面的params字段，用于定义参数和特性||{}|
||visible||boolean||是||实例显隐控制状态||true|
||enable||boolean||是||实例启禁用控制状态||true|
||debounce||boolean||是||防抖开关||true|
||loading||boolean||否||实例是否处理中控制状态||false|
||isOperationLog||boolean||是||实例是否触发操作日志控制状态||true|
||validator||string||是||校验规则||''|

### [](#计算属性-computed)计算属性 (Computed)

当前类中没有显式定义计算属性。计算属性通常基于其他可观察属性的值进行缓存和派生。

### [](#动作函数-actions)动作函数 (Actions)

||方法名||描述||参数||返回类型|
||doAction||默认Action执行函数，可以被覆盖||无||void|
||setDoAction||用于设置具体的Action执行函数||doAction: Function||void|
||makeAutoObservable||自动设置类的可观察性||无||void|

### [](#辅助函数-utilities)辅助函数 (Utilities)

||方法名||描述||参数||返回类型|
||abort||中止Action行为并抛出 `AbortError`||err: any||void|
||mixin||应用mixin以扩展当前实例的功能||...mixins: any[]||void|

### [](#反应式函数-reactions)反应式函数 (Reactions)

||函数名||描述||触发条件|
||when||等待 `rootStore.ready`为真时执行 `makeAutoObservable`||this.rootStore.ready|

说明

- 类使用 `ActionMixin`混入，提供了一系列额外的功能和属性。
- `doAction`是一个可被覆盖的方法，用于执行Action。
- `setDoAction`允许用户传入一个新的函数来替换 `doAction`方法。
- `makeAutoObservable`自动应用MobX的可观察性，基于MobX的推断规则。
- `abort`方法用于中止Action并记录错误信息。
- `mixin`方法允许动态扩展实例的功能。

## [](#actionstore使用)ActionStore使用

### [](#api使用actionstore概览)API使用ActionStore概览

以下公共action均通过actionStore实例化提供beforeHook、afterHook、catchHook、finallyHook事件

- doAction 该动作的实现逻辑 fn()
- beforeHook doAction动作之前的钩子事件，返回args即为doAction的入参，可在此hook里修改doAction的入参
- afterHook doAction动作之后的钩子事件
- catchHook beforeHook、doAction、afterHook出现异常时的钩子事件
- finallyHook 上述所有事件执行后的钩子事件

||actions类别||说明||使用说明|
||bill||单据增删改查函数||save, delete, add, copy, add, draft, move, impot, export等|
||businessflow||业务流函数||batchPush, batchPull等|
||navigate||导航函数||goBack, openBill等|
||print||打印函数||batchPrint, printPreview, print等|
||workflow||工作流函数||approval, audit, submit, batchAudit, batchSubmit, batchUnAudit, batchUnSubmit等|

### [](#actionstore实例扩展说明)ActionStore实例扩展说明

所有的action，都继承了actionStore公共的hook事件，所以均可扩展自己的（比如add）公共事件（beforeHook、afterHook、catchHook、finallyHook事件）钩子

// Action add扩展自己的公共事件钩子

function ExtendAction(rootStore){

 return {

 add: {

 beforeHook(rootStore:any, args: any[]=[]) {

 /*

 * 1. 在Action执行开始之前执行，参数：rootStore, args

 * 2. 参数说明：

 * 2.1 rootStore

 * 2.2 args： action执行参数数组， 通常是[rootStore, params]

 * 3. beforeHook 返回值args

 */

 return args;

 },

 afterHook(rootStore: any, res: any) {

 /*

 * 1. 在Action执行成功后执行，参数：rootStore, res

 * 2. 参数说明：

 * 2.1 rootStore

 * 2.2 error： action执行返回值

 * 3. afterHook 返回值res

 */

 return res

 },

 catchHook(rootStore: any, error: any) {

 /*

 * 1. 在Action执行异常后执行，参数：rootStore, error

 * 2. 参数说明：

 * 2.1 rootStore

 * 2.2 error： action执行错误

 * 3. catchHook 返回值error

 */

 return error

 },

 finallyHook(rootStore: any) {

 /*

 * 1. finallyHook在Action最终执行，参数：rootStore

 * 2. 参数说明：

 * 2.1 rootStore

 */

 }

 } 

 }

}

某些action，除了继承action公共的hook事件之外，doAction函数里还有自己action专属的hook，比如save的beforeSaveHook、afterSaveHook、validateHook

// Action save扩展自己的doAction内的钩子

function ExtendAction(rootStore){

 return {

 save: {

 validateHook(rootStore, data, { innerValidata }) {

 /*

 * 1. 不支持return返回值

 * 2. 扩展自行决定内部检验[innerValidata]是否执行

 * 3. 校验不通过的规则自行决定是否弹出全局提示[rootStore.messgae.danger('Error-Text')]

 */

 innerValidate()

 },

 beforeSaveHook(rootStore, data) {

 /*

 * 1. 支持return返回值，return返回需要与data同类型

 * 2. 如果需要参与Action的运行逻辑，那么return返回值

 * 3. 如果不需要参与Action的运行逻辑，那么作为执行时机使用，不需要return返回值

 */

 return data

 },

 afterSaveHook(rootStore, data) {

 /*

 * 1. 支持return返回值，return返回需要与data同类型

 * 2. 如果需要参与Action的运行逻辑，那么return返回值

 * 3. 如果不需要参与Action的运行逻辑，那么作为执行时机使用，不需要return返回值

 */

 return data

 }

 } 

 }

}

## [](#actionstore-使用典型示例)ActionStore 使用典型示例

所有公共的Action最终会通过 `ActionStore`基类面向对象的实例化，如下save实例化后具有公共的hook事件及自己的hook，示例：

// save action是ActionStore的实例，最终统一收集到rootStore.actions该命名空间下

rootStore.actions[alias] = new ActionStore({ doAction }, options, hooks)

// Action save扩展

function ExtendAction(rootStore){

 return {

 save: {

 validateHook(rootStore, data, { innerValidata }) {

 // 非标准合同-合同文本必传校验

 if (!rootStore.formStore.getValue('submitCsFile') && !rootStore.formStore.isStandardContract) {

 rootStore.utils.message.danger('请上传合同文本')

 this?.abort?.('请上传合同文本')

 return new Error('请上传合同文本')

 }

 },

 beforeSaveHook(rootStore, data) {

 // 条款数据保存

 const contractitemBshowSetting = rootStore.formStore.getValue("contractitemBshowSetting");

 if (contractitemBshowSetting && contractitemBshowSetting.indexOf(4) != -1) {

 const terms = rootStore.contractTermsStore.handleGetTermsData();

 if (!data.data.custMap) data.data.custMap = {}

 data.data.custMap.terms = terms;

 return data;

 }

 },

 afterSaveHook(rootStore, data) {

 // 返回到列表页

 rootStore.pageStore.goBack();

 }

 } 

 }

}