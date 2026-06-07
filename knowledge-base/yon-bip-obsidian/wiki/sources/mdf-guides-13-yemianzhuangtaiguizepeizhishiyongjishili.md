---
title: "页面状态规则配置使用及示例"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/13-yemianzhuangtaiguizepeizhishiyongjishili"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 页面状态规则配置使用及示例

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/13-yemianzhuangtaiguizepeizhishiyongjishili | 所属：指南

# [](#页面状态规则配置使用及示例)页面状态规则配置使用及示例

## [](#1-启用配置)1. 启用配置

需要在脚手架中新增配置来启用规则配置。
1、client/index.js中增加

const envConfig = require('../common/config.env').default;

const { setEnvConfig } = require('@mdf/cube/lib/extend')

setEnvConfig(envConfig)

2、common/config.env.js中增加

export default {

 ...

 USESTATERULE: true, //true 代表启用staterule

 USEFORMULARULE: true //true 代表启用formularule

}

## [](#2-公式计算场景)2. 公式计算场景

控制台通过yya.getCache('formulaRules')获取规则。
根据返回的UI元数据进行计算，其中iFormula为1，formula为公式表达式。前端会将UI元数据转换成rule对象进行计算。

### [](#21-卡片中计算)2.1 卡片中计算

{

 type: 0,

 // triggers: '',

 // eventName: '',

 actionGroups: [{

 actions: [{

 exprType: 0,

 target: 'totalPrice', 

 expression: 'price*number'

 }]

 }]

}

### [](#22-表格行合计)2.2 表格行合计

{

 type: 0,

 // triggers: '',

 // eventName: '',

 ctionGroups: [{

 actions: [{

 exprType: 0,

 target: 'limyt_formula_personList.totalPrice',

 expression: 'limyt_formula_personList.price*limyt_formula_personList.number'

 }]

 }]

 

}

### [](#23-表格列合计)2.3 表格列合计

{

 type: 0,

 //triggers: '',

 //eventName: '',

 actionGroups: [{

 actions: [{

 xprType: 0,

 target: 'totalPrice',

 expression: 'sum(limyt_formula_personList,\'limyt_formula_personList.price\')'

 }]

 }]

}

## [](#3-事件触发场景)3. 事件触发场景

控制台通过yya.get('stateRules')获取规则。
通过meta接口返回，数据放在生成代码中，可以通过viewmodel,get('stateRules')获取

接口返回数据:

{

 type: 1, //1 事件触发

 triggers: 'number', //触发源

 eventName: 'afterValueChange', //触发事件

 actionGroups: [{

 conditions: [{

 leftLogicOpre: '&&',

 leftExprType: 0, //0 leftExpression生效 1 leftTarget，leftProperty生效

 leftExpression: 'limyt_formula_personList.totalPrice',

 leftTarget: '', // leftTarget为1 leftTarget生效

 leftProperty: '', // leftTarget为1，并且leftProperty存在 leftProperty生效

 compareOper: '>', // > >= <= == === != like !like in !in

 rightExprType: 0, //类似leftExprType

 rightExpression: '1000',

 rightTarget: '',

 rightProperty: ''

 }],

 actions: [{

 exprType: 0, // 0 赋值 1 赋属性 2 设置容器 

 target: 'totalPrice', //必输

 property: '', // 例如 condtion.condtion1 赋值为key-value形式 例如bShowIt 显示隐藏

 scrExprType: 0, // 0 srcExpression生效 1 source和srcProperty生效

 srcExpression: "price*rate",

 source: "",

 srcProperty: "",

 },{

 exprType: 1,

 target: 'realPrice',

 property: 'disabled', //bShowIt是否可见 disabled是否可修改

 scrExprType: 1,

 srcExpression: "",

 source: "price",

 srcProperty: "bCanModify",

 },{

 exprType: 2,

 target: '0293d255105948ffb7b003e6b3597c52', //容器的cGroupCode 支持bShowIt 容器支持group(包含于container) groupcontainer toolbar form

 property: 'visible',

 scrExprType: 0,

 srcExpression: "false",

 source: "",

 srcProperty: "",

 }]

 }]

 }

### [](#31-判断日期大于今天隐藏容器)3.1 判断日期大于今天，隐藏容器

{

 type: 1,

 triggers: 'price',

 eventName: 'afterValueChange',

 actionGroups: [{

 conditions: [{

 leftLogicOper: '&&',

 leftExprType: 0,

 leftExpression: 'moment(price)',

 leftTarget: '',

 leftProperty: '',

 compareOper: '>',

 rightExprType: 0,

 rightExpression: 'new Date().getTime()',

 rightTarget: '',

 rightProperty: ''

 }],

 actions: [{

 exprType: 2,

 target: '59266289d64944119fb46ad594be2fd6', //容器的cGroupCode

 property: 'visible',

 scrExprType: 0,

 srcExpression: "false",

 source: "",

 srcProperty: "",

 }]

 }]

}

### [](#32-页面初始化将组件隐藏)3.2 页面初始化将组件隐藏

{

 type: 1,

 triggers: 'price',

 eventName: 'onInit',

 actionGroups: [{

 actions: [{

 exprType: 0,

 target: 'price',

 property: 'visible',

 scrExprType: 0,

 srcExpression: "false",

 source: "",

 srcProperty: "",

 }]

 }]

}

### [](#33-新增态编辑态按钮隐藏)3.3 新增态编辑态按钮隐藏

{

 type: 1,

 triggers: 'price',

 eventName: 'onInit',

 stateConditions: [{

 mode: 'edit' // edit browse add

 },{

 mode: 'add'

 }]

 actionGroups: [{

 actions: [{

 exprType: 0,

 target: 'price',

 property: 'visible',

 scrExprType: 0,

 srcExpression: "false",

 source: "",

 srcProperty: "",

 }]

 }]

}

### [](#34-给参照赋条件)3.4 给参照赋条件

{

 type: 1,

 triggers: 'new10,new7',

 eventName: 'afterValueChange',

 actionGroups: [{

 actions: [{

 exprType: 1,

 target: 'new4_name',

 property: 'condtion.simpleVOs.a1',

 scrExprType: 1,

 srcExpression: 'new10',

 source: '',

 srcProperty: ''

 }, {

 exprType: 1,

 target: 'new4_name',

 property: 'condtion.a2',

 scrExprType: 1,

 srcExpression: 'new7',

 source: '',

 srcProperty: '',

 }, {

 exprType: 1,

 target: 'cgddzbList.new9_name',

 property: 'condition.simpleVOs.a3',

 scrExprType: 1,

 srcExpression: 'new7',

 source: '',

 srcProperty: ''

 }, {

 exprType: 1,

 target: 'cgddzbList.new9_name',

 property: 'condition.a4',

 scrExprType: 1,

 srcExpression: 'new10',

 source: '',

 srcProperty: ''

 }]

 }]

}

// 或者参照本身打开给自己赋值

{

 type: 1,

 triggers: 'new4_name',

 eventName: 'beforeBrowse',

 actionGroups: [{

 actions: [{

 exprType: 1,

 target: 'new4_name',

 property: 'condtion.simpleVOs.a1',

 scrExprType: 1,

 srcExpression: 'new10',

 source: '',

 srcProperty: ''

 }, {

 exprType: 1,

 target: 'new4_name',

 property: 'condtion.a2',

 scrExprType: 1,

 srcExpression: 'new7',

 source: '',

 srcProperty: '',

 }]

 }]

}

### [](#35-逻辑比较符)3.5 逻辑比较符

{

 type: 1,

 triggers: 'price',

 eventName: 'afterValueChange',

 actionGroups: [{

 conditions: [{

 leftLogicOper: '&&',

 leftExprType: 0,

 leftExpression: 'price',

 leftTarget: '',

 leftProperty: '',

 compareOper: 'like', // like !like in !in

 rightExprType: 0,

 rightExpression: 'qw',

 rightTarget: '',

 rightProperty: ''

 }],

 actions: [{

 exprType: 0,

 target: 'price',

 property: 'visible',

 scrExprType: 0,

 srcExpression: "false",

 source: "",

 srcProperty: "",

 }]

 }]

}

### [](#36-精度必输控制)3.6 精度/必输控制

{

 type: 1,

 triggers: 'price',

 eventName: 'afterValueChange',

 actionGroups: [{

 conditions: [{

 leftLogicOper: '&&',

 leftExprType: 0,

 leftExpression: 'price',

 leftTarget: '',

 leftProperty: '',

 compareOper: 'like', // like !like in !in

 rightExprType: 0,

 rightExpression: 'qw',

 rightTarget: '',

 rightProperty: ''

 }],

 actions: [{

 exprType: 0,

 target: 'price',

 property: 'iNumPoint', // 控制精度属性

 // property: 'bIsNull', // 必填项

 scrExprType: 0,

 srcExpression: "3", // 精度值

 // srcExpression: "false", // 必填

 source: "",

 srcProperty: "",

 }]

 }]

}

### [](#37-页面校验规则)3.7 页面校验规则

{

 type: 1, // 交互规则

 // triggers: '',

 eventName: 'beforeSave', // 保存

 code: 'test001', // 规则编码

 name: 'test001', // 规则名称

 stateConditions: [{

 mode: 'add' // 浏览态/编辑态/新增态

 }, {

 mode: 'edit' // 浏览态/编辑态/新增态

 }],

 actionGroups: [{

 conditions: [{

 leftLogicOper: '&&',

 leftExprType: 0,

 leftExpression: 'price',

 leftTarget: '',

 leftProperty: '',

 compareOper: '>',

 rightExprType: 0,

 rightExpression: '100',

 rightTarget: '',

 rightProperty: ''

 }, {

 leftLogicOper: '&&',

 leftExprType: 0,

 leftExpression: 'price',

 leftTarget: '',

 leftProperty: '',

 compareOper: '<',

 rightExprType: 0,

 rightExpression: '10000',

 rightTarget: '',

 rightProperty: ''

 }],

 actions: [{

 exprType: 3, // 3 弹窗提示

 target: 'confirm/alert', // 弹窗类型 弹窗/提示信息 confirm/alert

 property: 'disabled', // 是否禁止下一步？ disabled/是 ''/不是

 scrExprType: 2, // 数据类型为常量

 srcExpressionValueType: 'String', // 值类型为String

 srcExpression: "当销售金额大于100并且小于10000时不允许保存", // 提示信息

 source: "",

 srcProperty: "",

 }]

 }]

}

### [](#38-参照过滤条件)3.8 参照过滤条件

{

 "code":"refCondition_headItem!define1_name_code95051055",

 "name":"refCondition_headItem!define1_name_name91907974",

 "type":1,

 "triggers":"recruitJobrankVO", // 配置过滤条件的参照字段

 "eventName":"beforeBrowse", // 时机

 "actionGroups":[{

 "id":"e9053220-9abc-4382-a812-b75d8ef29b9e",

 "ruleId":"ebcbc3f2-7d7f-4aab-902e-497bf6a3c170",

 "code":"headItem!define1_name_group_code_0",

 "name":"headItem!define1_name_group_name_0",

 "ctype":0,

 "system":0,

 "ordernum":0,

 "disabled":0,

 "tenantId":"2059847388156160",

 "actions":[{

 "id":"b8ae87ec-badb-4678-bcef-2190e41fb048",

 "actionGroupId":"e9053220-9abc-4382-a812-b75d8ef29b9e",

 "code":"headItem!define1_name_action_code_0",

 "name":"headItem!define1_name_action_name_0",

 "ordernum":0,

 "exprType":1,

 "target":"recruitJobrankVO", // 参照字段

 "property":"condition.name", // 赋条件 name

 "srcExprType":2,

 "srcExpression":"大易测试A级", // 赋条件 值

 "srcExpressionValueLogicOper":"eq",

 "system":0,

 "pubts":"2021-10-21 20:08:15",

 "tenantId":"2059847388156160",

 "disabled":0

 }]

 }]

}

### [](#39-参照多选为条件或动作)3.9 参照多选为条件或动作

{

 type: 1, // 交互规则

 triggers: 'all0310_CurrencyTenantVOList', // 参照的实体名称

 eventName: 'afterValueChange',

 code: 'test001', // 规则编码

 name: 'test001', // 规则名称

 stateConditions: [{

 mode: 'add' // 浏览态/编辑态/新增态

 }, {

 mode: 'edit' // 浏览态/编辑态/新增态

 }],

 actionGroups: [{

 conditions: [{

 leftLogicOper: '&&',

 leftExprType: 1,

 leftExpression: '',

 leftTarget: 'all0310_CurrencyTenantVOList', // 参照的实体名称

 leftProperty: '',

 compareOper: 'in',

 rightExprType: 2,

 rightExpression: '[{"id":"2513244582400513","name":"欧元"},{"id":"2513244582400521","name":"新加坡元"}]', // 条件是id和name的JSON格式

 rightExpressionValueType: 'Object',

 rightTarget: '',

 rightProperty: ''

 }],

 actions: [{

 exprType: 0, // 0 赋值

 target: 'all0310zi2List.all0310zi2_CurrencyTenantVO1List', // 子表上的多选参照

 property: '',

 scrExprType: 2, // 数据类型为常量

 srcExpressionValueType: 'Object', // 值类型为Object

 srcExpression: '[{

 "CurrencyTenantVO":"2513244582400515",

 "all0310zi2_CurrencyTenantVOList":"港元",

 "code":"HKD",

 "name":"港元",

 "currTypeSign":"HK$",

 "id":"2513244582400515",

 "moneyDigit":1,

 "priceDigit":1,

 "_id":"rowId_32"

 },{

 "CurrencyTenantVO":"2513244582400513",

 "all0310zi2_CurrencyTenantVOList":"欧元",

 "code":"EUR",

 "name":"欧元",

 "currTypeSign":"€",

 "id":"2513244582400513",

 "moneyDigit":2,

 "priceDigit":2,

 "_id":"rowId_33"

 }]', // 赋值为表格上所有数据

 source: "",

 srcProperty: "",

 }]

 }]

}

设置协同附件组件必填

{

 type: 1,

 triggers: 'price',

 eventName: 'afterValueChange',

 actionGroups: [{

 actions: [{

 exprType: 2,

 target: '59266289d64944119fb46ad594be2fd6', //附件组件(cControltype='ecsuite')的cGroupCode

 property: 'bIsNull',

 scrExprType: 0,

 srcExpression: "false",

 source: "",

 srcProperty: "",

 }]

 }]

}