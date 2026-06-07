---
title: "获取详情数据"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/06-detail"
section: "MDF服务"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, MDF服务]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 获取详情数据

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/06-detail | 所属：MDF服务

# [](#获取详情数据)获取详情数据

${domain.iuap-mdf-node}/bill/detail

## [](#1-接口说明)1. 接口说明

此接口用于获取单据详情

## [](#2-接口类型)2. 接口类型

**GET**

## [](#3-请求参数)3. 请求参数

***/mdf-node/uniform/report/detail?terminalType=1&serviceCode=st_othinrecordlist&isNewTpl=true&billnum=st_othinrecord&tplid=8916472&id=2730219221653504

## [](#4-参数说明)4. 参数说明

||**参数**||**是否可空**||**说明**|
||terminalType||否||端类型，1为PC端，3为APP端，2为触屏端|
||serviceCode||是||应用编码|
||isNewTpl||是||是否新模板|
||billnum||是||单据的billno|
||tplid||是||*模板id*|
||id||否||单据数据id|

## [](#5-返回结构)5. 返回结构

{

 "code": 200,

 "message": "操作成功",

 "data": {

 "returncount": 0,

 "totalPieces": 0,

 "verifystate": 0,

 "code": "QTRK20220413000004",

 "shop": -1,

 "masterOrgKeyField": "org",

 "bustype_name": "借入入库",

 "warehouse_isGoodsPositionStock": false,

 "creatorId": 2370224694350080,

 "vouchdate": "2022-04-13 00:00:00",

 "natCurrency": "2364609091195136",

 "totalQuantity": 0,

 "id": 2730219221653504,

 "warehouse_isGoodsPosition": false,

 "org_name": "zjj-组织",

 "bustype_extend_attrs_json": "{\"otherInType\":\"12\",\"isUpdateCost\":\"false\",\"sendtowms\":\"false\"}",

 "pubts": "2022-04-13 16:42:38",

 "tplid": 0,

 "lendCustom_name": "zjj客户1",

 "createDate": "2022-04-13 00:00:00",

 "creator": "wangwenfeng",

 "org": "2367785652474624",

 "isWfControlled": true,

 "stockStart": true,

 "lendCustom": 2367802419859712,

 "accountOrg": "2367785652474624",

 "costStart": false,

 "warehouse": 2401760924029184,

 "warehouse_iSerialManage": false,

 "transTypeKeyField": "bustype",

 "bustype": "2376026494702080",

 "warehouse_countCost": true,

 "barCode": "st_othinrecord|2730219221653504",

 "warehouse_name": "wls仓库1",

 "natCurrency_moneyDigit": 2,

 "natCurrency_priceDigit": 2,

 "createTime": "2022-04-13 16:42:37",

 "accountOrg_name": "zjj-组织",

 "ownertype": 0,

 "othInRecords": [{

 "autoCalcCost": true,

 "stockUnit_name": "箱",

 "reserveid": 0,

 "product_cCode": "078340",

 "product_unitName": "箱",

 "stockStatusDoc": 2346257360557441,

 "stockStatusDoc_name": "合格",

 "productsku_cName": "签收000",

 "returnDate": "2022-04-13 00:00:00",

 "product_cName": "签收000",

 "bodyItem!define11": "84e53301-1e1d-4dd7-adb5-a3717b5a9f2b",

 "isBatchManage": false,

 "isExpiryDateManage": false,

 "productClassName": "饮料",

 "stockUnitId_Precision": 4,

 "id": 2730219221653505,

 "mainid": 2730219221653504,

 "pubts": "2022-04-13 16:42:37",

 "isSerialNoManage": false,

 "rowno": 1,

 "product": 2687494993481984,

 "productClass": 2370264335388928,

 "bodyItem!define2": "1212456567",

 "unitExchangeType": 0,

 "recorddate": "2022-04-13 00:00:00",

 "isScrap": false,

 "bodyItem!id": 2730219221653505,

 "taxRate": 0,

 "unit": 2367796577194240,

 "lineno": 10,

 "productsku": 2687495064310016,

 "productsku_cCode": "078340",

 "ownertype": 0,

 "unit_Precision": 4,

 "contactsPieces": 6,

 "invExchRate": 1,

 "contactsQuantity": 6,

 "inventoryowner": 0,

 "isUpdateCost": false,

 "stockUnitId": 2367796577194240

 }, {

 "autoCalcCost": true,

 "stockUnit_name": "箱",

 "reserveid": 0,

 "product_cCode": "078340",

 "product_unitName": "箱",

 "stockStatusDoc": 2346257360557441,

 "stockStatusDoc_name": "合格",

 "productsku_cName": "签收000",

 "returnDate": "2022-04-13 00:00:00",

 "product_cName": "签收000",

 "bodyItem!define11": "84e53301-1e1d-4dd7-adb5-a3717b5a9f2b",

 "isBatchManage": false,

 "isExpiryDateManage": false,

 "productClassName": "饮料",

 "stockUnitId_Precision": 4,

 "id": 2730219221653505,

 "mainid": 2730219221653504,

 "pubts": "2022-04-13 16:42:37",

 "isSerialNoManage": false,

 "rowno": 1,

 "product": 2687494993481984,

 "productClass": 2370264335388928,

 "bodyItem!define2": "1212456567",

 "unitExchangeType": 0,

 "recorddate": "2022-04-13 00:00:00",

 "isScrap": false,

 "bodyItem!id": 2730219221653505,

 "taxRate": 0,

 "unit": 2367796577194240,

 "lineno": 10,

 "productsku": 2687495064310016,

 "productsku_cCode": "078340",

 "ownertype": 0,

 "unit_Precision": 4,

 "contactsPieces": 6,

 "invExchRate": 1,

 "contactsQuantity": 6,

 "inventoryowner": 0,

 "isUpdateCost": false,

 "stockUnitId": 2367796577194240

 }, {

 "autoCalcCost": true,

 "stockUnit_name": "箱",

 "reserveid": 0,

 "product_cCode": "078340",

 "product_unitName": "箱",

 "stockStatusDoc": 2346257360557441,

 "stockStatusDoc_name": "合格",

 "productsku_cName": "签收000",

 "returnDate": "2022-04-13 00:00:00",

 "product_cName": "签收000",

 "bodyItem!define11": "a49dca53-ebb5-44de-8e22-68ed20b98214",

 "isBatchManage": false,

 "isExpiryDateManage": false,

 "productClassName": "饮料",

 "stockUnitId_Precision": 4,

 "id": 2730219221653506,

 "mainid": 2730219221653504,

 "pubts": "2022-04-13 16:42:37",

 "isSerialNoManage": false,

 "rowno": 2,

 "product": 2687494993481984,

 "productClass": 2370264335388928,

 "bodyItem!define2": "1212456567",

 "unitExchangeType": 0,

 "recorddate": "2022-04-13 00:00:00",

 "isScrap": false,

 "bodyItem!id": 2730219221653506,

 "taxRate": 0,

 "unit": 2367796577194240,

 "lineno": 20,

 "productsku": 2687495064310016,

 "productsku_cCode": "078340",

 "ownertype": 0,

 "unit_Precision": 4,

 "contactsPieces": 6,

 "invExchRate": 1,

 "contactsQuantity": 6,

 "inventoryowner": 0,

 "isUpdateCost": false,

 "stockUnitId": 2367796577194240

 }, {

 "autoCalcCost": true,

 "stockUnit_name": "箱",

 "reserveid": 0,

 "product_cCode": "078340",

 "product_unitName": "箱",

 "stockStatusDoc": 2346257360557441,

 "stockStatusDoc_name": "合格",

 "productsku_cName": "签收000",

 "returnDate": "2022-04-13 00:00:00",

 "product_cName": "签收000",

 "bodyItem!define11": "a49dca53-ebb5-44de-8e22-68ed20b98214",

 "isBatchManage": false,

 "isExpiryDateManage": false,

 "productClassName": "饮料",

 "stockUnitId_Precision": 4,

 "id": 2730219221653506,

 "mainid": 2730219221653504,

 "pubts": "2022-04-13 16:42:37",

 "isSerialNoManage": false,

 "rowno": 2,

 "product": 2687494993481984,

 "productClass": 2370264335388928,

 "bodyItem!define2": "1212456567",

 "unitExchangeType": 0,

 "recorddate": "2022-04-13 00:00:00",

 "isScrap": false,

 "bodyItem!id": 2730219221653506,

 "taxRate": 0,

 "unit": 2367796577194240,

 "lineno": 20,

 "productsku": 2687495064310016,

 "productsku_cCode": "078340",

 "ownertype": 0,

 "unit_Precision": 4,

 "contactsPieces": 6,

 "invExchRate": 1,

 "contactsQuantity": 6,

 "inventoryowner": 0,

 "isUpdateCost": false,

 "stockUnitId": 2367796577194240

 }],

 "lendType": 0,

 "inventoryowner": 0,

 "status": 0,

 "isUpdateCost": false

 }

}

## [](#6-返回参数说明)6. 返回参数说明

||**参数**||**是否可空**||**说明**|
||data||否||数据信息，其中的list一般为子表信息|