---
title: "合同模板 ContractWrapper"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-contractwrapper"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 合同模板 ContractWrapper

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-contractwrapper | 所属：Web组件

# [](#合同模板-contractwrapper)合同模板 ContractWrapper

## [](#1-功能说明)1. 功能说明

加载渲染电子合同条款

## [](#2-效果展示)2. 效果展示

切换合同模板参照，渲染不同的合同模板

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ContractWrapperhetongmubanimg1.ede7540a.jpg)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ContractWrapperhetongmubanimg2.7fa198ab.jpg)

说明
为了实现合同模板正常展示，通常需要配置下面参数
1 key为ctTplId的合同模版ID
2 key为transactionTypeId的合同类型ID

const ctTplId = viewmodel.get('ctTplId')?.getValue();

const transactionTypeId = viewModel.get('transactionTypeId')?.getValue();

## [](#3-基本参数)3. 基本参数

以下参数都通过组件自己获取

||属性名称||值类型||属性含义|
||contractTemplateId||string||合同模板ID|
||orgId||string||组织ID|
||mode||string||当前页面状态edit、add、browse默认edit|
||billId||string||单据ID|
||billNum||string||单据编码|
||serviceCode||string||serviceCode|
||data||string||暂存数据|

## [](#4-说明)4. 说明

组件内部通过beforeSave事件挂载数据到提交数据上，要保证该事件正常执行。

## [](#5-后端mdd操作)5. 后端MDD操作

后端需要对mdf保存单据的接口进行处理，先进行单据的保存，拿到billId和billNum，和前端传过来的条款数据组合之后调电子合同后端服务接口
绑定条款和单据的关联关系。

{

 "billId": "202103191034",

 "billNum": "bd_staff_list",

 "terms": [

 {

 "contractTermsId": "4028046775f3cb760175f408e5ff0057",

 "termNum": "HTTK490756280370696192",

 "termName": "演示专用误删6666",

 "termContent": "合同双方签字盖章生效后， ${日期}$ 日内到货 ${日期}$（如有变动以需方通知为准）",

 "termsVariableDTOS": [

 {

 "contractTermVariable": "日期",

 "contractTermValue": "123323"

 }

 ],

 "versionNo": null,

 "contractTermVersionId": null,

 "billNum": "bd_staff_list",

 "billId": "202103191034",

 "orderNum": -1

 }

 ]

}

电子合同后端接口：/rest/billContractTerms/create