---
title: "保存数据"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/06-save-data"
section: "MDF服务"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, MDF服务]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 保存数据

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/06-save-data | 所属：MDF服务

# [](#保存数据)保存数据

${domain.iuap-mdf-node}/bill/save

## [](#1-接口说明)1. 接口说明

此接口用于数据的保存

## [](#2-接口类型)2. 接口类型

**POST**

## [](#3-请求参数)3. 请求参数

{

 "billnum": "cust_contactcard",

 "data": "{\"id\":2747092521472256,\"name\":\"地方是沃尔电饭锅\",\"gender\":1,\"customer\":\"1440267615769460739\",\"customer_code\":\"wzyxycs\",\"customer_name\":\"wzy信用测试\",\"customer_isPotential\":false,\"isDefault\":true,\"contactType_name\":null,\"superiorContact_name\":null,\"terminal_name\":null,\"isremind\":false,\"timeNotFollowedUp\":\"未跟进\",\"clue_name\":null,\"picture1\":\"e25cd7e0-ce00-11ec-a298-8936489834b9\",\"country_name\":null,\"role_name\":null,\"attitude_name\":null,\"org\":\"2367785652474624\",\"org_name\":\"zjj-组织\",\"saleArea_name\":null,\"dept_name\":null,\"ower\":\"2392916015943936\",\"ower_name\":\"张三\",\"pubts\":\"2022-05-07 20:26:15\",\"_status\":\"Update\"}"

}

## [](#4-参数说明)4. 参数说明

||**参数**||**是否可空**||**说明**|
||billno||否||表单billno|
||data||是||收集的页面数据|

## [](#5-返回结构)5. 返回结构

{

 "code": 200,

 "message": "操作成功",

 "data": {

 "id": 2747092521472256,

 "name": "地方是沃尔电饭锅",

 "gender": 1,

 "customer": "1440267615769460739",

 "customer_code": "wzyxycs",

 "customer_name": "wzy信用测试",

 "customer_isPotential": false,

 "isDefault": true,

 "isremind": false,

 "timeNotFollowedUp": "未跟进",

 "picture1": "e25cd7e0-ce00-11ec-a298-8936489834b9",

 "org": "2367785652474624",

 "org_name": "zjj-组织",

 "ower": "2392916015943936",

 "ower_name": "张三",

 "pubts": "2022-05-07 20:26:33",

 "originValue": [{

 "ower": "2392916015943936",

 "creator": "赵建军",

 "gender": 1,

 "modifyDate": "2022-05-07 00:00:00",

 "timeNotFollowedUp": "未跟进",

 "org": "2367785652474624",

 "modifier": "王章宇",

 "creatorId": 2367779274150144,

 "modifierId": 2648147090740992,

 "picture1": "e25cd7e0-ce00-11ec-a298-8936489834b9",

 "isDefault": true,

 "modifyTime": "2022-05-07 20:26:15",

 "createTime": "2022-04-25 14:47:01",

 "name": "地方是沃尔电饭锅",

 "id": 2747092521472256,

 "contactUser": "1",

 "pubts": "2022-05-07 20:26:15",

 "isremind": false,

 "stopstatus": true,

 "tenant": 2364607263428864,

 "customer": "1440267615769460739",

 "createDate": "2022-04-25 00:00:00",

 "contactRelatedObjList": [{

 "relatedType": "merchant_contacter",

 "secondId": "1440267615769460739",

 "contactId": 2747092521472256,

 "id": 2747092521472257,

 "pubts": "2022-04-25 14:47:01",

 "tenant": 2364607263428864,

 "relatedId": "1440267615769460741"

 }]

 }],

 "modifier": "王章宇",

 "modifierId": 2648147090740992,

 "modifyTime": "2022-05-07 20:26:33",

 "modifyDate": "2022-05-07 20:26:33",

 "newBizObject": {

 "ower": "2392916015943936",

 "creator": "赵建军",

 "gender": 1,

 "modifyDate": "2022-05-07 00:00:00",

 "timeNotFollowedUp": "未跟进",

 "org": "2367785652474624",

 "modifier": "王章宇",

 "creatorId": 2367779274150144,

 "modifierId": 2648147090740992,

 "picture1": "e25cd7e0-ce00-11ec-a298-8936489834b9",

 "isDefault": true,

 "modifyTime": "2022-05-07 20:26:33",

 "createTime": "2022-04-25 14:47:01",

 "name": "地方是沃尔电饭锅",

 "id": 2747092521472256,

 "contactUser": "1",

 "pubts": "2022-05-07 20:26:33",

 "isremind": false,

 "stopstatus": true,

 "tenant": 2364607263428864,

 "customer": "1440267615769460739",

 "createDate": "2022-04-25 00:00:00",

 "contactRelatedObjList": [{

 "relatedType": "merchant_contacter",

 "secondId": "1440267615769460739",

 "contactId": 2747092521472256,

 "id": 2747092521472257,

 "pubts": "2022-04-25 14:47:01",

 "tenant": 2364607263428864,

 "relatedId": "1440267615769460741"

 }]

 }

 }

}

## [](#6-返回参数说明)6. 返回参数说明

||**参数**||**是否可空**||**说明**|
||data||否||保存后的数据|