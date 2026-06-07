---
title: "FormStore"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g01-form-store-api"
section: "YNF-API"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, API]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# FormStore

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g01-form-store-api | 所属：YNF-API

# [](#formstore)FormStore

主要功能介绍：（formStore基本功能）

- formStore是表单区域对应的数据对象store，用于操作表单区域数据对象相关逻辑控制，包含：默认值、状态、校验、必填、禁用、显隐、表单数据组织等功能。

存储表单的数据，提供写入和读取的方法，不包含子表数据
- 管理表单状态，提供Computed控制只读，可编辑与扩展
- 数据校验：必输校验，校验规则从DataSource上读取

- formStore存储了页面detail表单的全量数据，使用getValue获取key对应的值，获取到的值是可观测对象
- formStore是用数据源生成的记录数据的数据模型store

## [](#form设计器配置)Form设计器配置

// FormStore数据对象协议基本结构(设计器支持插入自动创建)

{

 "libCode": "ynf-core-engine", // store数据模型的来源路径（导出代码库中导出路径）

 "storeType": "FormStore",

 "controlType": "FormStore", // store数据对象类型

 "alias": "formStore", // 该数据模型formStore实例对象的唯一标识

 "caption": "formStore",

 "type": "entity",

 "fieldsArr": [...] // formStore字段描述

}

## [](#formstore-类api文档)FormStore 类API文档

### [](#构造函数constructor)构造函数(constructor)

`FormStore`构造函数初始化表单存储，包括表单字段、验证器以及状态管理，并注册可观察属性和计算属性。构造函数接收参数如下：

||参数名||类型||描述||默认值|
||storeMeta||StoreMeta||表单storeMeta配置对象||无|
||rootStore||any||根存储实例，用于访问其他store||无|

### [](#类属性parameters)类属性(Parameters)

||属性名||类型||是否可观察||描述||默认值|
||fields||Map||是||表单字段的映射||observable.map()|
||fieldFactory||FieldFactory||否||字段工厂，用于创建字段实例||new FieldFactory(this)|
||formValidator||FormValidator||否||表单验证器||new FormValidator()|
||uiState||string||是||当前表单状态||PageStatusType.INIT|
||rootStore||any||是||根存储实例||无|
||storeType||string||否||存储类型标识符||'FormStore'|
||showRequiredFields||boolean||是||是否显示必填字段||false|
||masterOrgField||string||是||主组织id字段||''|
||masterOrgNameField||string||是||主组织name字段||''|
||masterOrgInfo||object||是||主组织信息字段||{}|
||masterOrgValue||string||是||主组织id + name的值拼接||''|
||transTypeField||string||是||交易类型id字段||''|
||transTypeNameField||string||是||交易类型name字段||''|
||transTypeValue||string||是||交易类型id + name的值拼接||''|

### [](#计算属性-computed)计算属性 (Computed)

计算属性是基于可观察状态的派生值。

||属性名||返回类型||描述||是否可观察|
||hasErr||boolean||表单中是否存在校验未通过的字段||是|
||readOnly||boolean||表单是否为只读状态，根据isBrowse计算||是|
||isBrowse||boolean||是否处于浏览态||是|
||isEdit||boolean||是否处于编辑态（包括初始化、新增、编辑）||是|
||isAdd||boolean||是否处于新增态||是|
||isUnEdit||boolean||是否处于非编辑态（启用、停用、上一页、下一页、打印、复制）||是|
||systemFieldVisible||boolean||系统字段是否可见，根据isBrowse计算||是|
||systemFieldReadonly||boolean||系统字段是否只读，始终为true||是|
||btnAuditVisible||boolean||审核按钮是否可见||是|
||btnWorkFlowVisible||boolean||审批流按钮是否可见||是|
||btnUnAuditVisible||boolean||弃审按钮是否可见||是|
||btnEditVisible||boolean||编辑按钮是否可见||是|
||btnEditWithApproveStatus||boolean||编辑按钮在审批中是否显示||是|
||btnSubmitVisible||boolean||提交按钮是否可见||是|
||btnUnSubmitVisible||boolean||撤回按钮是否可见||是|
||btnDeleteVisible||boolean||删除按钮是否可见||是|
||isMasterOrgField||boolean||主组织字段是否可见||是|

### [](#动作函数-actions)动作函数 (Actions)

动作函数用于执行可以修改可观察状态的操作。

||方法名||描述||参数||返回类型|
||get||获取表单字段信息||fieldKey: string||Field|
||set||记录表单字段表述信息||fieldAlias: string, fieldDesc: FieldDesc||void|
||clear||表单清空||无||void|
||reset||清空表单并将表单状态置为init||无||void|
||add||清空表单并将表单状态置为add||无||void|
||cancelEdit||取消编辑，恢复数据并设置状态为browse||无||void|
||validate||校验表单每一项，收集错误信息||无||string[]|
||setUiState||设置表单状态||uiState: string||void|
||setVisible||设置表单字段的显示隐藏||fieldAlias: string, visible: boolean||void|
||setRequired||设置表单字段的必填||fieldAlias: string, required: boolean||void|
||setTransTypeField||设置交易类型相关字段||transTypeField: string||void|
||setMasterOrgValue||设置主组织value||id: string, name: string||void|
||setTransTypeValue||设置交易类型value||id: string, name: string||void|
||toggleShowRequiredFields||切换显示必填字段||无||void|

📢说明

- `FormStore`类负责管理表单的数据、状态、验证规则以及与工作流相关的钩子。
- 通过 `get`和 `set`方法可以获取和设置表单字段信息。
- `clear`、`reset`、`add`和 `cancelEdit`方法用于管理表单的状态。
- `validate`方法用于校验表单字段并返回错误信息。
- `setUiState`方法用于设置表单的状态。
- 计算属性如 `isBrowse`、`isEdit`、`isAdd`等用于判断表单的当前状态。
- `setVisible`和 `setRequired`方法用于控制表单字段的显示和必填属性。
- `setTransTypeField`和 `setMasterOrgValue`方法用于设置交易类型和主组织字段。
- 动作函数和辅助函数通常用于修改表单状态或执行与表单相关的操作。

## [](#formstore-扩展开发)FormStore 扩展开发

// 1. 领域扩展使用示例

import { FormStore } from 'ynf-core-engine/stores'

// 1. 手动创建一个treeStore实例

const formStore = new FormStore()

// 2. 基于formStore创建自己的表单数据对象

class ExtendFormStore extends FormStore{

 constructor(storeMeta?: any, rootStore?: any) {

 super(storeMeta?: any, rootStore?: any);

 }

 // 自定义属性、方法

 ...

}

// 2. 扩展当前formStore实例

function extendFormStore(rootStore: object) {

 extendObservable(rootStore.formStore, {

 // observable属性

 contractChangeHistory: {},

 // action方法

 setContractChangeHistory: (res: object) => {

 rootStore.formStore.contractChangeHistory = res

 },

 // 计算属性

 get btnEditVisible () {

 // 根据formStore状态控制编辑按钮显隐

 return rootStore.formStore.isEdit

 }

 }

 } 

extendFormStore(rootStore)

## [](#fomstore-典型示例)FomStore 典型示例

### [](#表单简单取值设置值)表单简单取值&设置值

// 设置code字段值

formStore.setValue('code', '111')

formStore.setValue({code: '111'})

// 获取code字段值

formStore.getValue('code')

// 获取表单所有值

formStore.getValue()

// ...

### [](#表单参照取值设置值)表单参照取值&设置值

const formStore = rootStore.formStore // 页面formStore表单数据模型实例对象

// 设置单选参照字段值

formStore?.get('parent').setValue({ id:'1234567890987654'})

formStore?.setValue('parent', { id:'1234567890987654'})

formStore?.setValue({parent: { id:'1234567890987654'}})

// 获取单选参照字段值

formStore.getValue('parent') // parent为参照对应的storeField

// 获取多选参照字段值

formStore.getValue('parent') // parent为参照对应的dataSourceAlias

// 设置多选参照字段值

const formStore = rootStore.formStore

formStore?.get('parent').setValue([{ id:'1234567890987654'}])

formStore?.setValue('parent', [{ id:'1234567890987654'}])

formStore?.setValue({parent: [{ id:'1234567890987654'}]})

### [](#表单校验)表单校验

// 校验表单每一项, 收集错误信息

formStore.validate()

// 表单中是否存在校验未通过的字段

formStore.hasErr

### [](#表单页面状态设置)表单页面状态设置

// 设置表单状态： add edit browse

formStore.setUiState('add')

formStore.setUiState('edit')