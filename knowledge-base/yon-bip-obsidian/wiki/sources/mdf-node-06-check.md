---
title: "数据校验、赋值"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/06-check"
section: "MDF服务"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, MDF服务]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 数据校验、赋值

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/06-check | 所属：MDF服务

# [](#数据校验赋值)数据校验、赋值

${domain.iuap-mdf-node}/bill/check

## [](#1-接口说明)1. 接口说明

此接口用于页面数据变更后，触发整单页面的值变更操作。

## [](#2-接口类型)2. 接口类型

**POST**

## [](#3-请求参数)3. 请求参数

{

 "billnum": "st_othinrecord",

 "item": "{\"location\":0,\"key\":\"product_cCode\",\"childrenField\":\"othInRecords\",\"value\":\"{}\",\"type\":\"refer\",\"fieldname\":\"product.cCode\",\"checkOldData\":\"{\\\"id\\\":2730219221653504,\\\"org\\\":\\\"2367785652474624\\\",\\\"org_name\\\":\\\"zjj-组织\\\",\\\"isWfControlled\\\":true,\\\"verifystate\\\":0,\\\"returncount\\\":0,\\\"accountOrg\\\":\\\"2367785652474624\\\",\\\"accountOrg_name\\\":\\\"zjj-组织\\\",\\\"vendor_name\\\":null,\\\"inventoryowner_name\\\":null,\\\"ownertype\\\":0,\\\"code\\\":\\\"QTRK20220413000004\\\",\\\"vouchdate\\\":\\\"2022-04-13 00:00:00\\\",\\\"bustype\\\":\\\"2376026494702080\\\",\\\"bustype_name\\\":\\\"借入入库\\\",\\\"shop\\\":-1,\\\"store_name\\\":null,\\\"warehouse\\\":2401760924029184,\\\"warehouse_name\\\":\\\"wls仓库1\\\",\\\"department_name\\\":null,\\\"stockMgr_name\\\":null,\\\"operator_name\\\":null,\\\"bustype_extend_attrs_json\\\":\\\"{\\\\\\\"otherInType\\\\\\\":\\\\\\\"12\\\\\\\",\\\\\\\"isUpdateCost\\\\\\\":\\\\\\\"false\\\\\\\",\\\\\\\"sendtowms\\\\\\\":\\\\\\\"false\\\\\\\"}\\\",\\\"totalQuantity\\\":0,\\\"totalPieces\\\":0,\\\"status\\\":0,\\\"barCode\\\":\\\"st_othinrecord|2730219221653504\\\",\\\"warehouse_iSerialManage\\\":false,\\\"warehouse_isGoodsPosition\\\":false,\\\"warehouse_countCost\\\":true,\\\"pubts\\\":\\\"2022-04-13 16:42:38\\\",\\\"tplid\\\":0,\\\"inventoryowner\\\":0,\\\"natCurrency\\\":\\\"2364609091195136\\\",\\\"natCurrency_priceDigit\\\":2,\\\"lendType\\\":0,\\\"lendSupplier_name\\\":null,\\\"lendDept_name\\\":null,\\\"lendCustom\\\":2367802419859712,\\\"lendCustom_name\\\":\\\"zjj客户1\\\",\\\"natCurrency_moneyDigit\\\":2,\\\"isUpdateCost\\\":false,\\\"warehouse_isGoodsPositionStock\\\":false,\\\"costStart\\\":false,\\\"stockStart\\\":true,\\\"creator\\\":\\\"wangwenfeng\\\",\\\"createTime\\\":\\\"2022-04-13 16:42:37\\\",\\\"createDate\\\":\\\"2022-04-13 00:00:00\\\",\\\"creatorId\\\":2370224694350080,\\\"othInRecords\\\":[{\\\"autoCalcCost\\\":true,\\\"stockUnit_name\\\":\\\"\\\",\\\"reserveid\\\":0,\\\"product_cCode\\\":null,\\\"product_unitName\\\":\\\"\\\",\\\"stockStatusDoc\\\":2346257360557441,\\\"stockStatusDoc_name\\\":\\\"合格\\\",\\\"productsku_cName\\\":null,\\\"returnDate\\\":\\\"2022-04-13 00:00:00\\\",\\\"product_cName\\\":null,\\\"bodyItem!define11\\\":\\\"84e53301-1e1d-4dd7-adb5-a3717b5a9f2b\\\",\\\"isBatchManage\\\":\\\"\\\",\\\"isExpiryDateManage\\\":\\\"\\\",\\\"productClassName\\\":\\\"\\\",\\\"stockUnitId_Precision\\\":4,\\\"id\\\":2730219221653505,\\\"mainid\\\":2730219221653504,\\\"pubts\\\":\\\"2022-04-13 16:42:37\\\",\\\"isSerialNoManage\\\":\\\"\\\",\\\"rowno\\\":1,\\\"product\\\":null,\\\"productClass\\\":\\\"\\\",\\\"bodyItem!define2\\\":\\\"1212456567\\\",\\\"unitExchangeType\\\":0,\\\"recorddate\\\":\\\"2022-04-13 00:00:00\\\",\\\"isScrap\\\":false,\\\"bodyItem!id\\\":2730219221653505,\\\"taxRate\\\":0,\\\"unit\\\":null,\\\"lineno\\\":10,\\\"productsku\\\":null,\\\"productsku_cCode\\\":null,\\\"ownertype\\\":0,\\\"unit_Precision\\\":\\\"\\\",\\\"contactsPieces\\\":6,\\\"invExchRate\\\":0,\\\"contactsQuantity\\\":6,\\\"inventoryowner\\\":0,\\\"isUpdateCost\\\":false,\\\"stockUnitId\\\":\\\"\\\",\\\"hasDefaultInit\\\":true,\\\"attachmentId\\\":2730219221653505,\\\"_id\\\":\\\"rowId_150\\\",\\\"_tableDisplayOutlineAll\\\":true,\\\"expireDateNo\\\":\\\"\\\",\\\"expireDateUnit\\\":\\\"\\\",\\\"prodefine@1@@30\\\":\\\"\\\",\\\"modelDescription\\\":null,\\\"product_model\\\":null,\\\"goodsposition\\\":null,\\\"goodsposition_cName\\\":null,\\\"batchno\\\":null,\\\"producedate\\\":null,\\\"invaliddate\\\":null,\\\"mddCoordinatedData\\\":null},{\\\"autoCalcCost\\\":true,\\\"stockUnit_name\\\":\\\"箱\\\",\\\"reserveid\\\":0,\\\"product_cCode\\\":\\\"078340\\\",\\\"product_unitName\\\":\\\"箱\\\",\\\"stockStatusDoc\\\":2346257360557441,\\\"stockStatusDoc_name\\\":\\\"合格\\\",\\\"productsku_cName\\\":\\\"签收000\\\",\\\"returnDate\\\":\\\"2022-04-13 00:00:00\\\",\\\"product_cName\\\":\\\"签收000\\\",\\\"bodyItem!define11\\\":\\\"84e53301-1e1d-4dd7-adb5-a3717b5a9f2b\\\",\\\"isBatchManage\\\":false,\\\"isExpiryDateManage\\\":false,\\\"productClassName\\\":\\\"饮料\\\",\\\"stockUnitId_Precision\\\":4,\\\"id\\\":2730219221653505,\\\"mainid\\\":2730219221653504,\\\"pubts\\\":\\\"2022-04-13 16:42:37\\\",\\\"isSerialNoManage\\\":false,\\\"rowno\\\":2,\\\"product\\\":2687494993481984,\\\"productClass\\\":2370264335388928,\\\"bodyItem!define2\\\":\\\"1212456567\\\",\\\"unitExchangeType\\\":0,\\\"recorddate\\\":\\\"2022-04-13 00:00:00\\\",\\\"isScrap\\\":false,\\\"bodyItem!id\\\":2730219221653505,\\\"taxRate\\\":0,\\\"unit\\\":2367796577194240,\\\"lineno\\\":20,\\\"productsku\\\":2687495064310016,\\\"productsku_cCode\\\":\\\"078340\\\",\\\"ownertype\\\":0,\\\"unit_Precision\\\":4,\\\"contactsPieces\\\":6,\\\"invExchRate\\\":1,\\\"contactsQuantity\\\":6,\\\"inventoryowner\\\":0,\\\"isUpdateCost\\\":false,\\\"stockUnitId\\\":2367796577194240,\\\"hasDefaultInit\\\":true,\\\"attachmentId\\\":2730219221653505,\\\"_id\\\":\\\"rowId_151\\\"},{\\\"autoCalcCost\\\":true,\\\"stockUnit_name\\\":\\\"箱\\\",\\\"reserveid\\\":0,\\\"product_cCode\\\":\\\"078340\\\",\\\"product_unitName\\\":\\\"箱\\\",\\\"stockStatusDoc\\\":2346257360557441,\\\"stockStatusDoc_name\\\":\\\"合格\\\",\\\"productsku_cName\\\":\\\"签收000\\\",\\\"returnDate\\\":\\\"2022-04-13 00:00:00\\\",\\\"product_cName\\\":\\\"签收000\\\",\\\"bodyItem!define11\\\":\\\"a49dca53-ebb5-44de-8e22-68ed20b98214\\\",\\\"isBatchManage\\\":false,\\\"isExpiryDateManage\\\":false,\\\"productClassName\\\":\\\"饮料\\\",\\\"stockUnitId_Precision\\\":4,\\\"id\\\":2730219221653506,\\\"mainid\\\":2730219221653504,\\\"pubts\\\":\\\"2022-04-13 16:42:37\\\",\\\"isSerialNoManage\\\":false,\\\"rowno\\\":3,\\\"product\\\":2687494993481984,\\\"productClass\\\":2370264335388928,\\\"bodyItem!define2\\\":\\\"1212456567\\\",\\\"unitExchangeType\\\":0,\\\"recorddate\\\":\\\"2022-04-13 00:00:00\\\",\\\"isScrap\\\":false,\\\"bodyItem!id\\\":2730219221653506,\\\"taxRate\\\":0,\\\"unit\\\":2367796577194240,\\\"lineno\\\":30,\\\"productsku\\\":2687495064310016,\\\"productsku_cCode\\\":\\\"078340\\\",\\\"ownertype\\\":0,\\\"unit_Precision\\\":4,\\\"contactsPieces\\\":6,\\\"invExchRate\\\":1,\\\"contactsQuantity\\\":6,\\\"inventoryowner\\\":0,\\\"isUpdateCost\\\":false,\\\"stockUnitId\\\":2367796577194240,\\\"hasDefaultInit\\\":true,\\\"attachmentId\\\":2730219221653506,\\\"_id\\\":\\\"rowId_152\\\"},{\\\"autoCalcCost\\\":true,\\\"stockUnit_name\\\":\\\"箱\\\",\\\"reserveid\\\":0,\\\"product_cCode\\\":\\\"078340\\\",\\\"product_unitName\\\":\\\"箱\\\",\\\"stockStatusDoc\\\":2346257360557441,\\\"stockStatusDoc_name\\\":\\\"合格\\\",\\\"productsku_cName\\\":\\\"签收000\\\",\\\"returnDate\\\":\\\"2022-04-13 00:00:00\\\",\\\"product_cName\\\":\\\"签收000\\\",\\\"bodyItem!define11\\\":\\\"a49dca53-ebb5-44de-8e22-68ed20b98214\\\",\\\"isBatchManage\\\":false,\\\"isExpiryDateManage\\\":false,\\\"productClassName\\\":\\\"饮料\\\",\\\"stockUnitId_Precision\\\":4,\\\"id\\\":2730219221653506,\\\"mainid\\\":2730219221653504,\\\"pubts\\\":\\\"2022-04-13 16:42:37\\\",\\\"isSerialNoManage\\\":false,\\\"rowno\\\":4,\\\"product\\\":2687494993481984,\\\"productClass\\\":2370264335388928,\\\"bodyItem!define2\\\":\\\"1212456567\\\",\\\"unitExchangeType\\\":0,\\\"recorddate\\\":\\\"2022-04-13 00:00:00\\\",\\\"isScrap\\\":false,\\\"bodyItem!id\\\":2730219221653506,\\\"taxRate\\\":0,\\\"unit\\\":2367796577194240,\\\"lineno\\\":40,\\\"productsku\\\":2687495064310016,\\\"productsku_cCode\\\":\\\"078340\\\",\\\"ownertype\\\":0,\\\"unit_Precision\\\":4,\\\"contactsPieces\\\":6,\\\"invExchRate\\\":1,\\\"contactsQuantity\\\":6,\\\"inventoryowner\\\":0,\\\"isUpdateCost\\\":false,\\\"stockUnitId\\\":2367796577194240,\\\"hasDefaultInit\\\":true,\\\"attachmentId\\\":2730219221653506,\\\"_id\\\":\\\"rowId_153\\\"}],\\\"barcodeTask\\\":[],\\\"barcodeRecord\\\":[],\\\"batchnoCodeRule\\\":0,\\\"sncheckbox\\\":false,\\\"resubmitCheckKey\\\":\\\"st_othinrecord_edit_cd06cea0-ce00-11ec-a298-8936489834b9\\\"}\"}",

 "data": "{\"id\":2730219221653504,\"org\":\"2367785652474624\",\"org_name\":\"zjj-组织\",\"isWfControlled\":true,\"verifystate\":0,\"returncount\":0,\"accountOrg\":\"2367785652474624\",\"accountOrg_name\":\"zjj-组织\",\"vendor_name\":null,\"inventoryowner_name\":null,\"ownertype\":0,\"code\":\"QTRK20220413000004\",\"vouchdate\":\"2022-04-13 00:00:00\",\"bustype\":\"2376026494702080\",\"bustype_name\":\"借入入库\",\"shop\":-1,\"store_name\":null,\"warehouse\":2401760924029184,\"warehouse_name\":\"wls仓库1\",\"department_name\":null,\"stockMgr_name\":null,\"operator_name\":null,\"bustype_extend_attrs_json\":\"{\\\"otherInType\\\":\\\"12\\\",\\\"isUpdateCost\\\":\\\"false\\\",\\\"sendtowms\\\":\\\"false\\\"}\",\"totalQuantity\":0,\"totalPieces\":0,\"status\":0,\"barCode\":\"st_othinrecord|2730219221653504\",\"warehouse_iSerialManage\":false,\"warehouse_isGoodsPosition\":false,\"warehouse_countCost\":true,\"pubts\":\"2022-04-13 16:42:38\",\"tplid\":0,\"inventoryowner\":0,\"natCurrency\":\"2364609091195136\",\"natCurrency_priceDigit\":2,\"lendType\":0,\"lendSupplier_name\":null,\"lendDept_name\":null,\"lendCustom\":2367802419859712,\"lendCustom_name\":\"zjj客户1\",\"natCurrency_moneyDigit\":2,\"isUpdateCost\":false,\"warehouse_isGoodsPositionStock\":false,\"costStart\":false,\"stockStart\":true,\"creator\":\"wangwenfeng\",\"createTime\":\"2022-04-13 16:42:37\",\"createDate\":\"2022-04-13 00:00:00\",\"creatorId\":2370224694350080,\"othInRecords\":[{\"autoCalcCost\":true,\"stockUnit_name\":\"\",\"reserveid\":0,\"product_cCode\":null,\"product_unitName\":\"\",\"stockStatusDoc\":2346257360557441,\"stockStatusDoc_name\":\"合格\",\"productsku_cName\":null,\"returnDate\":\"2022-04-13 00:00:00\",\"product_cName\":null,\"bodyItem!define11\":\"84e53301-1e1d-4dd7-adb5-a3717b5a9f2b\",\"isBatchManage\":\"\",\"isExpiryDateManage\":\"\",\"productClassName\":\"\",\"stockUnitId_Precision\":4,\"id\":2730219221653505,\"mainid\":2730219221653504,\"pubts\":\"2022-04-13 16:42:37\",\"isSerialNoManage\":\"\",\"rowno\":1,\"product\":null,\"productClass\":\"\",\"bodyItem!define2\":\"1212456567\",\"unitExchangeType\":0,\"recorddate\":\"2022-04-13 00:00:00\",\"isScrap\":false,\"bodyItem!id\":2730219221653505,\"taxRate\":0,\"unit\":null,\"lineno\":10,\"productsku\":null,\"productsku_cCode\":null,\"ownertype\":0,\"unit_Precision\":\"\",\"contactsPieces\":6,\"invExchRate\":0,\"contactsQuantity\":6,\"inventoryowner\":0,\"isUpdateCost\":false,\"stockUnitId\":\"\",\"hasDefaultInit\":true,\"attachmentId\":2730219221653505,\"_id\":\"rowId_150\",\"_tableDisplayOutlineAll\":true,\"expireDateNo\":\"\",\"expireDateUnit\":\"\",\"prodefine@1@@30\":\"\",\"modelDescription\":null,\"product_model\":null,\"goodsposition\":null,\"goodsposition_cName\":null,\"batchno\":null,\"producedate\":null,\"invaliddate\":null,\"mddCoordinatedData\":null},{\"autoCalcCost\":true,\"stockUnit_name\":\"箱\",\"reserveid\":0,\"product_cCode\":\"078340\",\"product_unitName\":\"箱\",\"stockStatusDoc\":2346257360557441,\"stockStatusDoc_name\":\"合格\",\"productsku_cName\":\"签收000\",\"returnDate\":\"2022-04-13 00:00:00\",\"product_cName\":\"签收000\",\"bodyItem!define11\":\"84e53301-1e1d-4dd7-adb5-a3717b5a9f2b\",\"isBatchManage\":false,\"isExpiryDateManage\":false,\"productClassName\":\"饮料\",\"stockUnitId_Precision\":4,\"id\":2730219221653505,\"mainid\":2730219221653504,\"pubts\":\"2022-04-13 16:42:37\",\"isSerialNoManage\":false,\"rowno\":2,\"product\":2687494993481984,\"productClass\":2370264335388928,\"bodyItem!define2\":\"1212456567\",\"unitExchangeType\":0,\"recorddate\":\"2022-04-13 00:00:00\",\"isScrap\":false,\"bodyItem!id\":2730219221653505,\"taxRate\":0,\"unit\":2367796577194240,\"lineno\":20,\"productsku\":2687495064310016,\"productsku_cCode\":\"078340\",\"ownertype\":0,\"unit_Precision\":4,\"contactsPieces\":6,\"invExchRate\":1,\"contactsQuantity\":6,\"inventoryowner\":0,\"isUpdateCost\":false,\"stockUnitId\":2367796577194240,\"hasDefaultInit\":true,\"attachmentId\":2730219221653505,\"_id\":\"rowId_151\"},{\"autoCalcCost\":true,\"stockUnit_name\":\"箱\",\"reserveid\":0,\"product_cCode\":\"078340\",\"product_unitName\":\"箱\",\"stockStatusDoc\":2346257360557441,\"stockStatusDoc_name\":\"合格\",\"productsku_cName\":\"签收000\",\"returnDate\":\"2022-04-13 00:00:00\",\"product_cName\":\"签收000\",\"bodyItem!define11\":\"a49dca53-ebb5-44de-8e22-68ed20b98214\",\"isBatchManage\":false,\"isExpiryDateManage\":false,\"productClassName\":\"饮料\",\"stockUnitId_Precision\":4,\"id\":2730219221653506,\"mainid\":2730219221653504,\"pubts\":\"2022-04-13 16:42:37\",\"isSerialNoManage\":false,\"rowno\":3,\"product\":2687494993481984,\"productClass\":2370264335388928,\"bodyItem!define2\":\"1212456567\",\"unitExchangeType\":0,\"recorddate\":\"2022-04-13 00:00:00\",\"isScrap\":false,\"bodyItem!id\":2730219221653506,\"taxRate\":0,\"unit\":2367796577194240,\"lineno\":30,\"productsku\":2687495064310016,\"productsku_cCode\":\"078340\",\"ownertype\":0,\"unit_Precision\":4,\"contactsPieces\":6,\"invExchRate\":1,\"contactsQuantity\":6,\"inventoryowner\":0,\"isUpdateCost\":false,\"stockUnitId\":2367796577194240,\"hasDefaultInit\":true,\"attachmentId\":2730219221653506,\"_id\":\"rowId_152\"},{\"autoCalcCost\":true,\"stockUnit_name\":\"箱\",\"reserveid\":0,\"product_cCode\":\"078340\",\"product_unitName\":\"箱\",\"stockStatusDoc\":2346257360557441,\"stockStatusDoc_name\":\"合格\",\"productsku_cName\":\"签收000\",\"returnDate\":\"2022-04-13 00:00:00\",\"product_cName\":\"签收000\",\"bodyItem!define11\":\"a49dca53-ebb5-44de-8e22-68ed20b98214\",\"isBatchManage\":false,\"isExpiryDateManage\":false,\"productClassName\":\"饮料\",\"stockUnitId_Precision\":4,\"id\":2730219221653506,\"mainid\":2730219221653504,\"pubts\":\"2022-04-13 16:42:37\",\"isSerialNoManage\":false,\"rowno\":4,\"product\":2687494993481984,\"productClass\":2370264335388928,\"bodyItem!define2\":\"1212456567\",\"unitExchangeType\":0,\"recorddate\":\"2022-04-13 00:00:00\",\"isScrap\":false,\"bodyItem!id\":2730219221653506,\"taxRate\":0,\"unit\":2367796577194240,\"lineno\":40,\"productsku\":2687495064310016,\"productsku_cCode\":\"078340\",\"ownertype\":0,\"unit_Precision\":4,\"contactsPieces\":6,\"invExchRate\":1,\"contactsQuantity\":6,\"inventoryowner\":0,\"isUpdateCost\":false,\"stockUnitId\":2367796577194240,\"hasDefaultInit\":true,\"attachmentId\":2730219221653506,\"_id\":\"rowId_153\"}],\"barcodeTask\":[],\"barcodeRecord\":[],\"batchnoCodeRule\":0,\"sncheckbox\":false,\"resubmitCheckKey\":\"st_othinrecord_edit_cd06cea0-ce00-11ec-a298-8936489834b9\"}"

}

## [](#4-参数说明)4. 参数说明

||**参数**||**是否可空**||**说明**|
||billnum||否||表单billno|
||item||是||当前check的item|
||data||是||当前check的数据|

## [](#5-返回结构)5. 返回结构

{

 "code": 200,

 "message": "操作成功",

 "data": {

 "_realtype": null,

 "_entityName": null,

 "_keyName": null,

 "autoCalcCost": true,

 "stockUnit_name": "",

 "reserveid": 0,

 "product_cCode": "078340",

 "product_unitName": "箱",

 "stockStatusDoc": 2346257360557441,

 "stockStatusDoc_name": "合格",

 "productsku_cName": "签收000",

 "returnDate": "2022-04-13 00:00:00",

 "product_cName": "签收000",

 "_convert_bodyItem": null,

 "isBatchManage": "",

 "isExpiryDateManage": "",

 "productClassName": "",

 "stockUnitId_Precision": "4",

 "id": 2730219221653505,

 "mainid": 2730219221653504,

 "pubts": "2022-04-13 16:42:37",

 "isSerialNoManage": "",

 "rowno": 1,

 "product": 2687494993481984,

 "productClass": "",

 "unitExchangeType": 0,

 "recorddate": "2022-04-13 00:00:00",

 "isScrap": false,

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

 "stockUnitId": null,

 "hasDefaultInit": true,

 "attachmentId": "2730219221653505",

 "expireDateNo": "",

 "expireDateUnit": "",

 "_status": null,

 "_parent": null,

 "virtualProductAttribute": null,

 "subQty": null,

 "qty": null,

 "oriMoney": null,

 "oriUnitPrice": null,

 "oriTax": null,

 "natUnitPrice": null,

 "natTaxUnitPrice": null,

 "natMoney": null,

 "natSum": null,

 "natTax": null,

 "oriTaxUnitPrice": null,

 "oriSum": null,

 "bodyItem!define11": "84e53301-1e1d-4dd7-adb5-a3717b5a9f2b",

 "bodyItem!define2": "1212456567",

 "bodyItem!id": 2730219221653505

 },

 "errorDetail": null

}

## [](#6-返回参数说明)6. 返回参数说明

||**参数**||**是否可空**||**说明**|
||data||否||check返回的数据|