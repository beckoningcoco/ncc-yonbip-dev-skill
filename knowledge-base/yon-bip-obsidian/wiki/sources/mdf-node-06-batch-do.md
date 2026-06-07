---
title: "批量操作"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/06-batch-do"
section: "MDF服务"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, MDF服务]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 批量操作

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/06-batch-do | 所属：MDF服务

# [](#批量操作)批量操作

${domain.iuap-mdf-node}/bill/batchDo

## [](#1-接口说明)1. 接口说明

此接口用于批量操作

## [](#2-接口类型)2. 接口类型

**POST**

## [](#3-请求参数)3. 请求参数

***/mdf-node/uniform/bill/batchDo?action=unsubmit&terminalType=1&serviceCode=st_othinrecordlist&isNewTpl=true

{

 "billnum": "st_othinrecordlist",

 "data": "[{\"code\":\"QTRK20220505000001\",\"org\":\"2370216314639360\",\"org_name\":\"卓越者\",\"isWfControlled\":true,\"bustype\":\"2364609089622281\",\"bustype_extend_attrs_json\":\"{\\\"sendtowms\\\":\\\"false\\\",\\\"otherInType\\\":\\\"11\\\",\\\"isUpdateCost\\\":\\\"false\\\"}\",\"status\":3,\"pubts\":\"2022-05-07 19:08:25\",\"org_code\":\"zyz003\",\"othInRecords_product_productClass_code\":\"zjj001\",\"othInRecords_unit_code\":\"xiang\",\"othInRecords_product\":2728825723425536,\"othInRecords_unit\":2367796577194240,\"othInRecords_product_oUnitId\":2367796577194240,\"othInRecords_product_productOfflineRetail_purchaseUnit\":2367796577194240,\"bodyItem!id\":2761116991738113,\"barCode\":\"st_othinrecord|2761116991738112\",\"othInRecords_source\":\"uscmf.uscmf_lendrecord\",\"lineno\":10,\"uplineno\":10,\"firstuplineno\":10,\"id\":2761116991738112}]"

}

## [](#4-参数说明)4. 参数说明

||参数||是否可空||说明|
||action||否||具体的批量操作的action|
||billnum||是||单据的billno|
||data||是||相关数据信息|

## [](#5-返回结构)5. 返回结构

{

 "code": 200,

 "message": "操作成功",

 "data": {

 "count": 1,

 "sucessCount": 1,

 "failCount": 0,

 "messages": [],

 "infos": [{

 "org": "2370216314639360",

 "isWfControlled": true,

 "othInRecords_product_oUnitId": "2367796577194240",

 "othInRecords_source": "uscmf.uscmf_lendrecord",

 "bustype": "2364609089622281",

 "othInRecords_unit": "2367796577194240",

 "bodyItem": {

 "id": "2761116991738113"

 },

 "barCode": "st_othinrecord|2761116991738112",

 "lineno": "10",

 "firstuplineno": "10",

 "othInRecords_unit_code": "xiang",

 "othInRecords_product": "2728825723425536",

 "othInRecords_product_productClass_code": "zjj001",

 "othInRecords_product_productOfflineRetail_purchaseUnit": "2367796577194240",

 "uplineno": "10",

 "id": 2761116991738112,

 "org_name": "卓越者",

 "bustype_extend_attrs_json": "{\"sendtowms\":\"false\",\"otherInType\":\"11\",\"isUpdateCost\":\"false\"}",

 "pubts": "2022-05-07 19:09:14",

 "org_code": "zyz003",

 "status": 0,

 "verifystate": 0

 }],

 "failInfos": []

 }

}

## [](#6-返回参数说明)6. 返回参数说明

||**参数**||**是否可空**||**说明**|
||count||否||总数量|
||sucessCount||否||成功数量|
||failCount||否||失败数量|
||messages||否||提示信息|
||infos||否||成功信息|
||failInfos||否||失败信息|