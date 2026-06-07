---
title: "PageStore"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g01-page-store-api"
section: "YNF-API"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, API]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# PageStore

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g01-page-store-api | 所属：YNF-API

# [](#pagestore)PageStore

主要功能介绍：（pageStore基本功能）

- pageStore页面数据模型是rootStore实例下的页面级实例，包含params、query、routes、loading等数据（默认在rootStore下会创建一个pageStore对象--> 不需要在设计器中配置）
- 提供页面路由操作：push、goBack、history等方法
- 提供打开弹窗、打开单据等方法

## [](#pagestore-类api文档)PageStore 类API文档

### [](#构造函数constructor)构造函数(constructor)

`PageStore`构造函数初始化页面存储，包括页面状态、查询参数、枚举数据等，并注册可观察属性和计算属性。构造函数接收参数如下：

||参数名||类型||描述||默认值|
||props||PageStoreProps||包含页面配置的属性对象||{}|

### [](#类属性parameters)类属性(Parameters)

||属性名||类型||是否可观察||描述||默认值|
||status||string||是||当前页面状态||PageStatusType.BROWSE|
||storeType||string||否||存储类型标识符||'PageStore'|
||rootStore||any||是||根存储实例||{}|
||query||any||是||查询参数||{}|
||params||any||是||页面参数||{}|
||enumData||any||是||枚举数据||{}|
||metaData||any||否||元数据，包括多语言、权限、用户定义数据||{}|
||characterStore||CharacterStore||否||页面特征store实例||new CharacterStore()|
||referStore||ReferStore||否||参照元数据带入store实例||new ReferStore()|
||history||any||否||历史记录实例||{}|
||bRunInDesigner||boolean||是||是否在设计器中运行||false|
||bNeedRefresh||boolean||是||是否需要刷新||false|
||pageRefresh||string||是||页面刷新标识||new Date().toString()|
||loadingCount||number||是||页面加载计数||0|
||pageCache||PageCache||是||页面缓存实例||new PageCache()|
||result||Result||是||详情页回列表页面携带参数||new Result()|
||childPageStack||any[]||是||子页面栈||[]|
||dialogStack||any[]||是||对话框栈||[]|

### [](#计算属性-computed)计算属性 (Computed)

计算属性是基于可观察状态的派生值。

||属性名||返回类型||描述||是否可观察|
||isInit||boolean||是否处于初始化状态||是|
||isEdit||boolean||是否处于编辑状态||是|
||isBrowse||boolean||是否处于浏览状态||是|
||hasResume||boolean||页面回调触发机制观测对象||是|
||generalSetting||any||获取通用设置||是|
||feature||object||获取特性配置||是|
||commonOption||object||获取公共配置||是|
||currentChildPage||string||获取当前子页面||是|

### [](#动作函数-actions)动作函数 (Actions)

动作函数用于执行可以修改可观察状态的操作。

||方法名||描述||参数||返回类型|
||add||设置页面状态为新增||无||void|
||edit||设置页面状态为编辑||无||void|
||browse||设置页面状态为浏览||无||void|
||getStatus||获取当前页面状态||无||string|
||setStatus||设置当前页面状态||value: string||void|
||startLoading||增加loading计数，计数大于1页面有loading动画||无||number|
||endLoading||减少loading计数，计数小于1页面loading动画消失||无||number|
||setResult||设置上个页面返回的结果||param: any||void|
||getResult||获取上个页面返回的结果||无||any|
||openModal||打开模态框，兼容旧API||props: any||void|
||closeModal||关闭模态框，兼容旧API||props?: any||void|
||openDialog||打开对话框，管理对话框栈||dialog: any||void|
||closeDialog||关闭对话框，管理对话框栈||index: number = -1||void|
||showPage||显示子页面，管理子页面栈||pageCode: string||void|
||closePage||关闭子页面，管理子页面栈||无||void|

### [](#辅助函数-utilities)辅助函数 (Utilities)

辅助函数用于执行不直接修改状态的操作。

||方法名||描述||参数||返回类型|
||getPermissions||根据动作获取权限数据||action: string||any|

📢说明

- `PageStore`类负责管理页面的状态和数据，包括枚举数据、页面参数、历史记录等。
- 通过 `add`、`edit`、`browse`方法可以设置页面的状态。
- `getStatus`和 `setStatus`方法用于获取和设置当前的页面状态。
- 页面状态相关的计算属性 `isInit`、`isEdit`、`isBrowse`可以判断当前页面是否处于初始化、编辑或浏览状态。
- 页面加载相关的 `startLoading`和 `endLoading`方法用于管理页面加载的计数。
- `setResult`和 `getResult`方法用于设置和获取上个页面返回的结果。
- `openModal`和 `closeModal`方法用于管理模态框的显示和隐藏。
- `openDialog`和 `closeDialog`方法用于管理对话框的显示和隐藏。
- `showPage`和 `closePage`方法用于管理子页面的显示和隐藏。
- `getPermissions`方法用于获取特定动作的权限数据。
- 类属性 `pageCache`和 `result`分别用于页面缓存和结果管理。
- `metaData`属性包含了多语言、权限、用户定义的元数据。

## [](#pagestore-扩展开发)PageStore 扩展开发

// 1. 领域扩展使用示例

import { PageStore } from 'ynf-core-engine/stores'

// 1. 手动创建一个pageStore实例

const formStore = new PageStore()

// 2. 基于PageStore创建自己的页面数据对象

class ExtendPageStore extends PageStore{

 constructor(storeMeta?: any, rootStore?: any) {

 super(storeMeta?: any, rootStore?: any);

 }

 // 自定义属性、方法

 ...

}

// 2. 扩展当前pageStore实例

function extendPageStore(rootStore: object) {

 extendObservable(rootStore.pageStore, {

 // observable属性

 contractChangeHistory: {},

 // action方法

 setContractChangeHistory: (res: object) => {

 rootStore.formStore.contractChangeHistory = res

 },

 toContractChangePage: (item: object) => {

 return navigate?.openBillByRoute(rootStore, {

 billNo: "clmContractChange",

 billId: item?.id,

 mode: 'browse'

 })

 },

 // 计算属性

 get btnEditVisible () {

 // 根据formStore状态控制编辑按钮显隐

 return rootStore.formStore.isEdit

 }

 }

 } 

extendPageStore(rootStore)

## [](#pagestore-典型示例)PageStore 典型示例

### [](#普通弹窗)普通弹窗

// 打开弹窗

rootStore.pageStore.openModal({

 uiType: 'component',

 component: "12345",

 bodyStyle: { width: 1000, height: 1000 },

 onOk: () => { console.log("弹窗确认") },

 onCancel: () => { console.log("弹窗取消") }

})

//关闭当前弹窗

rootStore.pageStore.closeModal({uiType:'component'})

//关闭所有弹窗

rootStore.pageStore.closeModal({uiType:'component',allClean:true})

### [](#单据弹窗)单据弹窗

- 需要传递 billNo
- query内需要各类页面参数 domainKey/serviceCode/terminalType/busiObj等
- 可传其它参数在params属性

rootStore.pageStore.openModal({billNo:'clmContract',query:{},params:{}})

rootStore.pageStore.closeModal()

||**参数**||**说明**||**类型**||**默认值**|
||uiType||弹窗类型||'component'| 'billNo'||-|
||component||普通弹窗(必填项)||DOM元素/React组件||-|
||bodyStyle||弹窗css样式，可用于设置浮层宽高等样式||object||-|
||onOk||点击确定回调(传递则支持footer)||function||-|
||onCancel||右上角叉或取消按钮的关闭弹窗回调(传递则支持footer)||function||-|
||showModal||是否打开模态框||boolean||true|
||title||弹窗标题||string||-|
||billNo||单据弹窗(必填项)||string||-|
||query||query参数||object||-|
||params||参数||object||-|
||headStyle||弹窗头部样式||object||-|
||footerStyle||弹窗底部样式||object||-|
||......||其余参数将会传递给弹窗属性||object||-|