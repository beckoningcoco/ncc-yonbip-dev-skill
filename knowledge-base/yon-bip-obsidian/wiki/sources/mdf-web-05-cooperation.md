---
title: "协作 Cooperation"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-cooperation"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 4
---

# 协作 Cooperation

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-cooperation | 所属：Web组件

# [](#协作-cooperation)协作 Cooperation

- [**1. 主要功能**](#/components-web/05-cooperation#Cooperation%E5%8D%8F%E4%BD%9C-%E4%B8%BB%E8%A6%81%E5%8A%9F%E8%83%BD)
- [**2. 实现效果**](#/components-web/05-cooperation#Cooperation%E5%8D%8F%E4%BD%9C-%E5%AE%9E%E7%8E%B0%E6%95%88%E6%9E%9C)
- [**3. 基本属性**](#/components-web/05-cooperation#Cooperation%E5%8D%8F%E4%BD%9C-%E5%9F%BA%E6%9C%AC%E5%B1%9E%E6%80%A7)

### [](#1-主要功能)1. **主要功能**

支持在单据右侧业务助手面板内配置协作组件

### [](#2-实现效果)2. **实现效果**

1、协作

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Cooperationxiezuoimage1.9020ec8c.png)

2、评论

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Cooperationxiezuoimage2.779c2ea5.png)

3、附件

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Cooperationxiezuoimage3.621eac85.png)

## [](#3基本属性).3、基本属性

||属性名称||属性含义||值类型||默认值||属性说明|
||renderReceiptsFile||是否展示附件||boolean||false||附件、协作、评论只能展示一个默认展示协作|
||renderReceiptsComment||是否展示评论||boolean||false||附件、协作、评论只能展示一个|
||otherSetting||组件接受的其他参数，透传给组件的||object||{showTask: false}||8.1.9 协作助手 |

### [](#3-othersetting可配置相关参数)3. otherSetting可配置相关参数

||属性名称||属性含义||值类型||默认值||属性说明|
||  showTask||显示任务模块||boolean||true||默认展示|
||showCooperationFlow||显示协作流程模块||boolean||true||默认展示|

### [](#4-参考属性)4. 参考属性

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Cooperationxiezuoimage4.ea9494d6.png)

### [](#5-接入流程)5. **接入流程**

{

 "groupId": "1680747885668335662",

 "parentId": "1680747885668335660",

 "cName": "业务助手",

 "cNameResid": "P_YS_CRM_CRM-FE_0001319819",

 "iOrder": 20,

 "bMain": true,

 "cCode": "znbzbx_travelexpbill",

 "cDataSourceName": "znbzbx.travelexpensebill.TravelExpenseBillVO",

 "cControlType": "businessassisitant",

 "cGroupCode": "znbzbx_travelexpbill_right_div",

 "cAlign": "right",

 "iCols": 0,

 "containers": [

 {

 "groupId": "1680747885668335663",

 "parentId": "1680747885668335662",

 "cName": "业务助手页签",

 "cNameResid": "P_YS_ZNBZ_BZBX-UI_1508538242677866503",

 "iOrder": 20,

 "bMain": true,

 "cCode": "znbzbx_travelexpbill",

 "cDataSourceName": "znbzbx.travelexpensebill.TravelExpenseBillVO",

 "cControlType": "linetabs",

 "cGroupCode": "znbzbx_travelexpbill_right_div_tab",

 "cAlign": "top",

 "iCols": 0,

 "cStyle": "{\n \"showMaxBtn\": false\n}",

 "containers": [

 {

 "groupId": "1680747885668335665",

 "parentId": "1680747885668335663",

 "cName": "协作",

 "cNameResid": "P_YS_PF_GZTSYS_0000012589",

 "iOrder": 2,

 "bMain": true,

 "cCode": "znbzbx_travelexpbill",

 "cDataSourceName": "znbzbx.travelexpensebill.TravelExpenseBillVO",

 "cControlType": "tabpane",

 "cGroupCode": "znbzbx_travelexpbill_Approve",

 "cAlign": "top",

 "iCols": 0,

 "containers": [

 {

 "groupId": "1680747885668335671",

 "parentId": "1680747885668335665",

 "cName": "协作组件",

 "cNameResid": "P_YS_YC_YC-UI_0001132870",

 "iOrder": 20,

 "bMain": true,

 "cCode": "znbzbx_travelexpbill",

 "cDataSourceName": "znbzbx.travelexpensebill.TravelExpenseBillVO",

 "cControlType": "cooperation", // 重点

 "cStyle": "{\n \"renderReceiptsFile\": true\n}", // 此处决定内部控件类型

 "cGroupCode": "znbzbx_travelexpbill_ApprovalComponent",

 "cAlign": "center",

 "iCols": 0,

 "iBillEntityId": 29809016,

 "cExtProps": "{\"uiObject\":\"containers\"}",

 "uiObject": "containers"

 }

 ],

 "iBillEntityId": 29809016,

 "cExtProps": "{\"uiObject\":\"containers\"}",

 "uiObject": "containers"

 }

 ],

 "iBillEntityId": 29809016,

 "cExtProps": "{\"uiObject\":\"containers\"}",

 "uiObject": "containers"

 }

 ],

 "iBillEntityId": 29809016,

 "cExtProps": "{\"uiObject\":\"containers\"}",

 "uiObject": "containers"

}

### [](#6-前置事件)6. **前置事件  **

- beforeInitiateCooperation

- 

beforeInitiateReceiptsFile

- 

beforeInitiateReceiptsComment

模型：viewmodel           

viewmode.on('beforeCooperationData', ({ data, params }) => {

 data.xxx = 'xxxx'

})

### [](#7-排查说明)7. **排查说明**

        显示逻辑：

        默认: 发起协作面板

        renderReceiptsFile: 附件面板

        renderReceiptsComment: 评论面板

如有协作内部控件问题可以友空间联系宋磊老师