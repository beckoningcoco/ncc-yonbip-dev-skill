---
title: "跨引擎业务流推拉单"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/07-kuayinqingyewuliutuiladan"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 跨引擎业务流推拉单

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/07-kuayinqingyewuliutuiladan | 所属：指南

# [](#跨引擎业务流推拉单)跨引擎业务流推拉单

## [](#1-背景)1. 背景

打通MDF与YNF2个架构间单据的互相融合，包括推单和拉单等场景

## [](#2-概念)2. 概念

跨引擎服务推拉单这里是指，从MDF服务推单数据到YNF服务之间的互相推拉单，目前支持场景有

- MDF从上游（YNF）拉单到生单保存或上游到下游再到上下游保存
- MDF上游列表下推到YNF服务的下推生单保存
- YNF上游列表下推到MDF服务的下推生单保存
- MDF列表进YNF卡片下推生单保存
- YNF列表进MDF卡片下推生单保存

## [](#3-流程图)3. 流程图

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kuayinqingyewuliutuiladan_image1.ac210dfa.png)

## [](#4-mdf跨引擎推单到ynf引擎服务iframe包含移动端)4. MDF跨引擎推单到YNF引擎服务(iframe)包含移动端

配置说明

MDF列表选择数据，下推到YNF服务，需要在下推的按钮UI元数据设置cParameter中crossEngineParams

**一般来说参数可以默认不设置，优先从cSvrUrl里解析参数，targetBillNo、fev=ynf（作为引擎模式开关）主要参数**

**移动端配置batchPush按钮动作里的cSvrUrl参数，&fev=ynf开启跨引擎推单，其他参数就是下游参数**

// 下游跳转地址假如：

// 参数完全可配置到cParameter

// https://bip-test.yyuap.com/mdf-node/fragment/pullvoucher?domainKey=developplatform&terminalType=1&billnum=billnum&action=mdf2ynf&crossEngineKey=mdf2ynfkey&iframeCloseId=ynfIframe

{

 crossEngineParams: {

 host: "https://bip-test.yyuap.com/mdf-node",

 url: "/fragment",

 domainKey: "developplatform",

 billnum: "orderList",

 action: "mdf2ynf",

 crossEngineKey:"mdf2ynfkey",

 iframeCloseId:"ynfIframe"

 }

}

### [](#41-属性说明)4.1. 属性说明

一般来说只需要配置billnum和enabled即可，enabled是开关，其他用默认v：

||**参数**||**说明**||**默认值**||**备注**|
||url||跳转跨引擎服务的地址，也就是iframe跳转地址||-|||
||index||容器唯一值||-|||
||db||跨引擎临时存储的indexedDB的库名||mdf2ynfdb|||
||table||表名||mdf2ynf|||
||key||跨引擎存储的唯一key，用来YNF读取推单数据使用||mdf2ynfkey|||
||billnum||iframe模式使用，单据的billnum或billNo||-|||
||domainKey||iframe模式使用，单据的domainKey||developplatform|||
||action||iframe模式使用，跨引擎的标识一般不用设置用默认值||mdf2ynf|||
||crossEngineKey||iframe模式使用，单据跳转取indexedDB的key默认值即可||mdf2ynfkey|||
||iframeCloseId||iframe模式使用，用于关闭当前iframe||ynfIframe|||

## [](#5-ynf跨引擎推单到mdf服务iframe)5. YNF跨引擎推单到MDF服务(iframe)

由YNF引擎服务跳转到MDF统一node的卡片地址([https://www.xxx.com/mdf-node/meta/voucher/:billNo/add?domainKey=${domainKey}&serviceCode=${serviceCode}&action=mdf2ynf&crossEngineKey=mdf2ynfkey](https://www.xxx.com/mdf-node/meta/voucher/ycSupFeedback/add?domainKey=yonbip-cpu-suppliermgr&serviceCode=st_purchaseorderlist&action=mdf2ynf&crossEngineKey=mdf2ynfkey))

携带GET参数为crossEngineKey=mdf2ynfkey，写入到indexedDB后，跳转到MDF服务地址，进行生单现场还原

indexedDB 数据格式为：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kuayinqingyewuliutuiladan_image2.62ae5926.jpeg)

// [https://www.xxx.com/mdf-node/meta/voucher/ycSupFeedback/add?domainKey=yonbip-cpu-suppliermgr&serviceCode=st_purchaseorderlist&crossEngineKey=mdf2ynfkey](https://www.xxx.com/mdf-node/meta/voucher/ycSupFeedback/add?domainKey=yonbip-cpu-suppliermgr&serviceCode=st_purchaseorderlist&crossEngineKey=mdf2ynfkey)

### [](#51-属性说明)5.1. 属性说明

MDF统一node生单地址参数

要补全MDF卡片生单的基本参数外，额外新增了以下几种参数：

||**参数**||**说明**||**默认值**||**备注**|
||crossEngineKey||从indexedDB读取生单数据的key||mdf2ynfkey|||

## [](#6-打开mdf生单界面服务工作台方式)6. 打开MDF生单界面服务（工作台方式）

cb.renderServicePage(params)

params:

### [](#61-属性说明)6.1. 属性说明

||**参数**||**说明**||**默认值**||**备注**|
||billNo||单据ID||-||必传|
||serviceCode||权限编码||-||必传|
||billType||单据类型||voucher|||
||domainKey||领域编码||-|||
||pullVouchData||推单数据对象包含：dimensionKeys、targetData||Array||必传|
||query||URL参数||{}|||
||diworkCode||渲染的区域DOM id||||必传|

pullVouchData 格式：

pullVouchData: {

 dimensionKeys:[],

 targetData:{}

}

通过API打开生单界面

const renderServicePageParams = {

 serviceCode,

 diworkCode,

 billNo,

 billType,

 domainKey,

 query,

 externalData,

 pullVouchData

}

 

cb.renderServicePage(renderServicePageParams)

控制台调试示例：

cb.renderServicePage({

 serviceCode: 'ycSupFeedbackList',

 billNo: 'ycSupFeedback',

 domainKey: 'yonbip-cpu-suppliermgr',

 diworkCode: 'FsMessageCenterNewNew_1690402018563719177',

 pullVouchData: {

 targetData: {

 name: '测试说的数据是'

 },

 dimensionKeys: [{

 "groupTaskKey": "dimensionKeys_2910033146761808_voucher_order2voucher_delivery_e6073b5e-8e7e-475b-940b-4f0fc93dead5",

 "name": "普通销售（有发货）+白糖+白糖+是+人民币+基准汇率+false+null+可达鸭",

 "key": "f4669ef5-236f-11ed-a5dc-98039b6e2fa01526348802052587525+1526348802052587525+true+1525696886140829722+0000L6YTYEY5FUZPXE0000+false+0+1526181160863399939"

 }, {

 "groupTaskKey": "dimensionKeys_2910033146761808_voucher_order2voucher_delivery_e6073b5e-8e7e-475b-940b-4f0fc93dead5",

 "name": "普通销售（有发货）+黑炭+黑炭+是+人民币+基准汇率+false+null+宝可梦宇宙",

 "key": "f4669ef5-236f-11ed-a5dc-98039b6e2fa01530101813171716099+1530101813171716099+true+1525696886140829722+0000L6YTYEY5FUZPXE0000+false+0+1526180336229679105"

 }, {

 "groupTaskKey": "dimensionKeys_2910033146761808_voucher_order2voucher_delivery_e6073b5e-8e7e-475b-940b-4f0fc93dead5",

 "name": "白糖+白糖+是+人民币+基准汇率+false+null+宝可梦宇宙",

 "key": "1526348802052587525+1526348802052587525+true+1525696886140829722+0000L6YTYEY5FUZPXE0000+false+0+1526180336229679105"

 }]

 }

})

## [](#7-打开ynf生单界面服务工作台方式)7. 打开YNF生单界面服务（工作台方式）

import { renderServicePage } from 'ynf-core-runtime/WorkbenchRuntime';

 

renderServicePage({

 serviceCode: "MyContract",

 diworkCode: "MyContract_pullVunch_01",//当前页签渲染时的domId

 billNo: "clmContractList",

 billType: "",

 domainKey: 'yonbip-ec-contract',

 query: {

 busiObj: "clmContract",

 terminalType: 1

 },//jDiwork.openService 的第二个参数的值

 pullVouchData: {

 dimensionKeys: []

 targetData: {}

 }

})

### [](#71-属性说明)7.1. 属性说明

||**参数**||**说明**||**默认值**||**备注**|
||billNo||单据ID|||||
||serviceCode||权限编码|||||
||billType 单据类型|||||||
||domainKey||领域编码|||||
||pullVouchData 推单数据对象包含：dimensionKeys、targetData Array|||||||
||query||URL参数||{}|||
||diworkCode||渲染的区域DOMid|||||

## [](#8-补充)8. 补充

### [](#81-mdf跨引擎推单到ynf单页面)8.1. MDF跨引擎推单到YNF(单页面)

下推按钮设置cParameter参数开启跨引擎模式，以batchPush动作为例配置

其他参数是读取的cSvrUrl里的参数解析来的

params.cParameter = '{"crossEngineParams":{"enabled":true}}'