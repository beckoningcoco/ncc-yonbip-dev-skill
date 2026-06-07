---
title: "新增数据"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/06-add"
section: "MDF服务"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, MDF服务]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 新增数据

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/06-add | 所属：MDF服务

# [](#新增数据)新增数据

${domain.iuap-mdf-node}/bill/add

## [](#1-接口说明)1. 接口说明

此接口用于获取新增时的默认数据

## [](#2-接口类型)2. 接口类型

**POST**

## [](#3-请求参数)3. 请求参数

{"billnum":"st_othinrecord"}

## [](#4-参数说明)4. 参数说明

||**参数**||**是否可空**||**说明**|
||billnum||否||表单billno|

## [](#5-返回结构)5. 返回结构

{

 "code": 200,

 "message": "操作成功",

 "data": {

 "returncount": 0,

 "exchRateType_code": "01",

 "verifystate": 0,

 "code": "QTRK20220507000001",

 "masterOrgKeyField": "org",

 "extend_attrs_json": "{\"sendtowms\":\"false\",\"otherInType\":\"1\",\"isUpdateCost\":\"true\"}",

 "bustype_name": "其他入库",

 "masterorg_auto": {

 "code": "zjj-001",

 "name": "zjj-组织",

 "id": "2367785652474624"

 },

 "modifier": null,

 "creatorId": 2648147090740992,

 "modifierId": null,

 "businesstype": "2364609089081606",

 "vouchdate": "2022-05-07",

 "modifyTime": null,

 "id": null,

 "pubts": null,

 "bustype_extend_attrs_json": "{\"sendtowms\":\"false\",\"otherInType\":\"1\",\"isUpdateCost\":\"true\"}",

 "exchRateType_digit": 6,

 "tenant": 2364607263428864,

 "createDate": "2022-05-07",

 "auditDate": null,

 "creator": "王章宇",

 "modifyDate": null,

 "isWfControlled": false,

 "org": "2367785652474624",

 "exchRateType_name": "基准汇率",

 "auditor": null,

 "transTypeKeyField": "bustype",

 "bustype": "2364609089081606",

 "auditorId": null,

 "createTime": "2022-05-07 19:04:34",

 "auditTime": null,

 "exchRateType": "2364609079120128",

 "businesstype_name": "其他入库",

 "status": 0,

 "batchnoCodeRule": 0

 },

 "errorDetail": null

}

## [](#6-返回参数说明)6. 返回参数说明

||**参数**||**是否可空**||**说明**|
||data||否||新增的默认值数据|