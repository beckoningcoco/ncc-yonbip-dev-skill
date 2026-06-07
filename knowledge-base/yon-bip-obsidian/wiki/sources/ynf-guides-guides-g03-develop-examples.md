---
title: "YNF 典型场景"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/guides/g03-develop-examples"
section: "YNF-开发指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 开发指南]
platform_version: "BIP V5"
source_type: ynf-docs
images: 6
---

# YNF 典型场景

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/guides/g03-develop-examples | 所属：YNF-开发指南

# [](#ynf-典型场景)YNF 典型场景

典型场景给出开发中常见的场景，助你翻阅和查看。这些场景覆盖了日常开发中常见的用例，旨在帮助您快速定位问题、学习最佳实践，并促进高效开发。通过深入理解这些场景，您将能够更有效地利用YNF框架的功能。

在深入学习这些典型场景之前，假设您已具备编写扩展脚本的基础知识。如果您对如何编写扩展脚本尚不熟悉，推荐您先阅读第一章基础开发中扩展开发部分，了解扩展脚本的编写方法、技巧。因为许多场景的实现将依赖于编写或修改扩展脚本来扩展或新增store、action和reaction。

## [](#1-页面跳转)1 页面跳转

### [](#11-业务场景一概述)1.1 业务场景一概述

列表页面携带参数跳转到详情页

### [](#12-实现方式)1.2 实现方式

step1：选中绑定按钮，打开action元数据编辑器（注意：区分于层级打开编辑器）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/example-turn-page1.fa6e75aa.png)
step2：添加携带参数，新增action点击编辑设计或者在右侧属性中配置打开方式、状态、目标页面等

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/example-turn-page12.56e2428b.png)
step3：组件点击新增跳转到详情页携带参数在pageStore下面，返回页面通常使用goBack函数实现业务逻辑，params参数中是在页面间进行传递的参数

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/example-turn-page13.8107dc9f.png)

### [](#13-业务场景二概述)1.3 业务场景二概述

页面弹窗，包括普通弹窗和单据弹窗两种。

### [](#14-实现方式)1.4 实现方式

利用pageStore下的openModal()和closeModal()方法

#### [](#普通弹窗)普通弹窗

// 打开弹窗

rootStore.pageStore.openModal({

 uiType:'component',

 component:"12345",

 bodyStyle:{width:1000，height:1000},

 onOk:()=>{ console.log("弹窗确认")},

 onCancel:()=>{ console.log("弹窗取消")}

})

//关闭当前弹窗

rootStore.pageStore.closeModal({uiType:'component'})

//关闭所有弹窗

rootStore.pageStore.closeMadal({uiType:'component',allClean:true})

#### [](#单据弹窗需要传递-billno)单据弹窗（需要传递 billNo）

//query内需要各类页面参数 domainKey/serviceCode/terminalType/busiObj等

//可传其它参数在params属性。

rootStore.pageStore.openModal({billNo:'clmContract',query:{},params:{}})

rootStore.pageStore.closeModal()

### [](#15-业务场景三概述)1.5 业务场景三概述

设计自定义弹窗内容（设计器设计并控制弹窗显隐）

### [](#16-实现方式)1.6 实现方式

step1：拖入弹窗组件，对弹窗中内容进行设计（通常与formStore表单协议一致）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/example-turn-page3.250a7ec4.png)
step2：配置visible及onHide等组件接收的事件函数

（例如：rootStore.formStore.setValue('modalVisible', true)可以控制弹窗的显隐）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/example-turn-page32.443417a3.png)

## [](#2-卡片页面默认值设置)2 卡片页面默认值设置

### [](#21-业务场景概述)2.1 业务场景概述

在页面处于初始化或新增状态时，根据业务需求设置卡片页面的默认值。

### [](#22-代码实现)2.2 代码实现

#### [](#方式一根据一个值的变化修改另外值)方式一：根据一个值的变化，修改另外值

function ExtendReaction() {

 return {

 clearSignSubjectIdReaction: reaction(

 () => rootStore.formStore.getValue('signsubjectId'),

 (newVal, oldVal) => {

 if (!oldVal) return;

 if (!newVal || newVal !== oldVal) {

 rootStore.formStore.get('deptId')?.clear();

 rootStore.formStore.get('personId'?.clear);

 }

 }

 )

 }

}

#### [](#方式二根据cardstore页面状态更新状态)方式二：根据cardStore页面状态更新状态

function ExtendReaction() {

 return {

 modeReaction: reaction(

 () => rootStore.cardStore.uiState,

 (newVal, oldVal) => {

 console.log("mode:", newVal);

 if (newVal != oldVal) {

 const contractTermsStore = rootStore.contractTermsStore;

 contractTermsStore.handleUpdateOptions({

 mode: newVal,

 });

 }

 }

 )

 }

}

#### [](#方式三根据cardstore页面新增态时候设置默认值validate)方式三：根据cardstore页面新增态时候设置默认值valiDate

function ExtendReaction() {

 return {

 addDefReaction: reaction(

 () => rootStore.cardStore.uiState,

 (newVal, oldVal) => {

 const uiState = rootStore.cardStore.uiState;

 if (uiState === "add" || uiState === "init") {

 const signDate = rootStore.context.businessDate || ${ newDate().getFullYear()

 } -${ String(new Date().getMonth() + 1).padStart(2, "0") } -${ String(new Date().getDate()).padStart(2, "0") };

 rootStore.formStore.setValue({ fvaliDate: signDate });

 }

 })

 }

}

## [](#3-自定义按钮action函数)3 自定义按钮action函数

### [](#31-业务场景概述)3.1 业务场景概述

在页面中常常需要定义一个自定义的按钮，当点击这个按钮时，需要执行一个操作，并将这个操作绑定到actions上。

### [](#32-代码实现)3.2 代码实现

// 绑定一个撤销定稿actions到rootStore.actions路径下

rootStore.actions.withdrawfinalizeContract = withdrawFinalizeContract.bind(null, rootStore)

// 实现撤销定稿action方法

export const withdrawFinalizeContract = async (rootStore: any) => {

 const { utils = {}, pageStore = {}, formStore = {} } = rootStore;

 try {

 //todo

 }catch (err) {

 utils.message.danger(err.message || lang.templateByUuid('UID:P_YONBIP-EC-CONTRACT-FE_189CFA8605B800C5','撤销定稿失败', undefined,{ returnstr: true }));

 return Promise.reject(err);

 } finally {

 pageStore?.endLoading?.();

 }

}

## [](#4-卡片页面动态控制字段显隐)4 卡片页面动态控制字段显隐

### [](#41-业务场景概述)4.1 业务场景概述

在卡片页面中，根据一些条件需要动态控制字段的显示和隐藏。

### [](#42-代码实现)4.2 代码实现

step1：使用extendObservable函数扩展formStore实例的计算属性

//根据合同状态是否为生效合同，显示和隐藏变更历史查看按钮

function extendStore(rootStore) {

 extendObservable(rootStore.formStore, {

 get visibleToHistory() {

 if (rootStore.formStore.getValue('status') === '8') {

 return true

 } else {

 return false

 }

 }

 })

}

//根据是否倒签，显示隐藏和必填倒签原因

//上传文件方式起草，跳转新增页面，需要隐藏合同模板参照

function extendStore(rootStore) {

 extendObservable(rootStore.formStore, {

 get visibleToBackdatedReason(){

 if (rootStore.formStore.getValue('isBackDate') === '1') return true

 else {

 rootStore.formStore.get('backDateCause').clear();

 return false

 }

 }

 })

}

step2：将计算属性配置到组件visible、required协议上，这些计算属性将基于当前状态来决定某些组件的可见性和必填性。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/example-visable.d7bcefd4.png)

## [](#5-页面数据校验相关)5 页面数据校验相关

### [](#51-业务场景概述)5.1 业务场景概述

在业务场景中，我们需要在用户尝试保存数据前进行数据校验。这里提供了两种方案。

### [](#52-代码实现)5.2 代码实现

#### [](#方案1在保存前找时机将对应store中字段的必填required设置为true然后利用某个全局的校验机制来检查这些字段是否已填写)方案1：在保存前找时机将对应store中字段的必填required设置为true，然后利用某个全局的校验机制来检查这些字段是否已填写。

//方案一:在save前找时机将required设置为true

function ExtendReaction() {

 return {

 autoBackdatedReasonReaction: reaction(

 () => rootStore.formStore.visibleToBackdatedReason,

 (newVal, oldVal) => {

 rootStore?.formStore.get("backDateCause")?.setRequired(newVal);

 }

 )

 }

}

#### [](#方案2在保存action中提供一个validatehook这个钩子函数会在保存前被调用并在其中添加自定义的校验项)方案2：在保存action中提供一个validateHook，这个钩子函数会在保存前被调用，并在其中添加自定义的校验项。

//方案二:在保存提供的validateHook中添加校验项

function ExtendAction(rootStore) {

 return {

 save: {

 validateHook(rootStore, data, { innerValidata }) {

 //非标准合同-合同文本必传校验

 if (!rootStore.formStore.getValue('submitCsFile') && !rootStore.formStore.isStandardContract) {

 rootStore.utils.message.danger('请上传合同文本')

 this?.abort?.('请上传合同文本')

 return new Error('请上传合同文本')

 }

 innerValidata?.()

 }

 }

 }

}

## [](#6-列表页面添加默认查询条件)6 列表页面添加默认查询条件

### [](#61-业务场景概述)6.1 业务场景概述

在列表页面的查询功能中，查询条件通常分为两种：系统条件和扩展条件。

- 系统条件：与页面上的查询区组件直接对应，允许设置默认值并在页面加载时显示在查询区组件中。
- 扩展条件：用户可以根据需要额外添加的查询条件，用于更精确地筛选数据。

### [](#62-代码实现)6.2 代码实现

function ExtendReaction() {

 return {

 init: {

 beforeHook: (rootStore) => {

 // 额外的查询条件，与页面查询区无关联

 rootStore.filterStore.addExtracondition("allStatus", "and", [{ name: "shuzhi", operator: "in", value: ['0.123', 0.134] }]);

 // 添加默认查询条件，正确设置value会显示在页面查询区

 //方法-(原子方法)

 rootStore.filterStore.addCondition([{

 name: "wenben", value: 123, operator: 'like'

 }])

 rootStore.filterStore.copyCondition()

 //方法二(抽象方法)

 rootStore.filterStore.addDefLikeCondition([{ wenben: '123' }])

 rootStore.filterStore.addDefEqcondition({ dywb: '12' })

 //方法三(抽象方法的底层原子方法)

 rootStore.filterStore, upsertDefCondition([{ wenben: '123' }], 'like')

 }

 }

 }

}

function ExtendReaction(){

 return {

 defaultSearchCondition: reaction(()=>rootStore?.filterStore.isQueryReady, (isQueryReady)=>{

 // 添加普通条件

 rootStore?.filterStore?.getFilterItemByName("wenben").setValue('111')

 // 添加单选参照默认条件

 rootStore?.filterStore?.getFilterItemByName("danxuanyinyong").setValue({id: "1623643074168094746", name: "人民币"})

 // 添加默认排序条件

 rootStore.filterStore.addOrderBy('key', value)

 rootStore?.filterStore?.copyCondition()

 rootStore?.filterStore?.setQueryTrigger()

 })

 }

};

## [](#7-列表页面表格自定义行内按钮)7 列表页面表格自定义行内按钮

### [](#71-业务场景概述)7.1 业务场景概述

在列表页面的表格中，需要为每一行数据添加自定义的按钮，这些按钮的可见性（visible）可能依赖于行内数据的状态，并通过计算属性（submitVis）来控制这些按钮的可见性。

### [](#72-代码实现)7.2 代码实现

step1：get 定义一个计算属性submitVis响应行内数据控制返回true or false

export class extendRowStore extends RowStore {

 get submitVis({

 return ['1', '0'].includes(this.getValue('status'))

 })

}

step2：将行上submitVis扩展计算属性设置到tableStore上，使得所有行都有扩展属性

/**

 如果tableStore 有继承或者扩展的话。tableStore的构造函数第三个参数传递给父类。

 或者tableStore.extendRowStore=extendRowStore,

 在添加行数据的时候，tableStore 会构建 用户扩展的类实例

 **/

step3：rowStore将具有submitVis等计算属性，绑定表达式到按钮visible属性上

## [](#8-卡片页面按钮显隐控制)8 卡片页面按钮显隐控制

### [](#81-业务场景概述)8.1 业务场景概述

在卡片页面中，需要根据页面状态或数据状态来控制按钮的显示与隐藏。例如，当卡片处于编辑状态时，编辑按钮可能应该隐藏，而保存或取消按钮应该显示。

### [](#82-代码实现)8.2 代码实现

step1：定义一个函数来扩展formStore的功能

function extendStore(rootStore: object) {

 /// 使用extendObservable方法来扩展formStore的属性和方法 

 extendObservable(rootStore.formStore, {

 contractChangeHistory: {},

 createMethod: '',

 contractChangeTab: [],

 // 计算属性，用于根据formStore状态控制编辑按钮的显隐 

 get btnEditVisible() {

 // 当isEdit为true时，编辑按钮可见；否则，隐藏

 return rootStore.formStore.isEdit

 }

 })

}

extendFormStore(rootStore)

step2：给按钮绑定计算属性

## [](#多选参照设置值)多选参照设置值

### [](#场景概述)场景概述

### [](#代码实现)代码实现

/**

*formStore多选参照操作数据统一使用数据对象store所控制字段alias属性，即组件中接收的storeField属性

**/

// 获取多选参照字段值--parent为参照对应的storeField

formStore.getValue('parent')

// 设置多选参照字段值

const formStore = rootStore.formStoreformStore?.get('parent').setValue([{ id: '1234567890987654' }])

formStore?.setValue('parent', [{ id: '1234567890987654' }])

formStore?.setValue({ parent: [{ id: '1234567890987654' }] })

## [](#qa)Q&A

## [](#参考)参考