---
title: "获取列表数据"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/06-list"
section: "MDF服务"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, MDF服务]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 获取列表数据

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/06-list | 所属：MDF服务

# [](#获取列表数据)获取列表数据

${domain.iuap-mdf-node}/bill/list

## [](#1-接口说明)1. 接口说明

此接口一般会发两个，第一个用于获取列表数据，第二个用于获取列表数量、分页信息等。

## [](#2-接口类型)2. 接口类型

**POST**

## [](#3-请求参数)3. 请求参数

{

 "page": {

 "pageSize": 20,

 "pageIndex": 1,

 "totalCount": 1

 },

 "billnum": "st_othinrecordlist",

 "condition": {

 "commonVOs": [{

 "itemName": "schemeName",

 "value1": "默认方案"

 }, {

 "itemName": "isDefault",

 "value1": true

 }],

 "filtersId": "2244441",

 "solutionId": 122118427,

 "bInit": true

 },

 "bEmptyWithoutFilterTree": true,

 "locale": "zh_CN",

 "serviceCode": "st_othinrecordlist",

 "refimestamp": "1651921276384",

 "isNewTpl": true,

 "ownDomain": "ustock",

 "tplid": 9148318

}

## [](#4-参数说明)4. 参数说明

||参数||是否可空||说明|
||page||否||分页信息，其中pageSize为每页的条数；pageIndex为当前页码；totalCount为1时取数据，为-1时为分页信息|
||billnum||否||单据的billno|
||condition||否||过滤信息|
||bEmptyWithoutFilterTree||否||导航外是否存在其他条件|
||locale||否||语言信息|
||serviceCode||否||应用编码|
||refimestamp||否||时间戳|
||isNewTpl||否||是否新模板|
||ownDomain||否||所属domain|
||tplid||否||模板id|

## [](#5-返回结构)5. 返回结构

{

 "code": 200,

 "message": "操作成功",

 "data": {

 "pageIndex": 5,

 "pageSize": 20,

 "recordCount": 1,

 "recordList": [{

 "bustype_name": "借入入库",

 "othInRecords_product_oUnitId": 2367796577194240,

 "othInRecords_invExchRate": 1,

 "totalQuantity": 0,

 "othInRecords_product_manageClass_code": "001",

 "othInRecords_unit_code": "xiang",

 "id": 2730219221653504,

 "tplid": 0,

 "lendCustom_name": "zjj客户1",

 "bustype_extend_attrs_json": "{\"otherInType\":\"12\",\"isUpdateCost\":\"false\",\"sendtowms\":\"false\"}",

 "isWfControlled": true,

 "warehouse": 2401760924029184,

 "othInRecords_stockUnitId": 2367796577194240,

 "barCode": "st_othinrecord|2730219221653504",

 "othInRecords_unit": 2367796577194240,

 "stockUnitId_precision": 4,

 "warehouse_name": "wls仓库1",

 "natCurrency_moneyDigit": 2,

 "othInRecords_product": 2687494993481984,

 "othInRecords_rowno": 1,

 "natCurrency_priceDigit": 2,

 "accountOrg_name": "zjj-组织",

 "unit_Precision": 4,

 "othInRecords_product_productClass_code": "002",

 "othInRecords_productsku_cCode": "078340",

 "othInRecords_product_cName": "签收000",

 "othInRecords_unit_name": "箱",

 "contactsPieces": 6,

 "org_code": "zjj-001",

 "contactsQuantity": 6,

 "status": 0,

 "returncount": 0,

 "totalPieces": 0,

 "verifystate": 0,

 "code": "QTRK20220413000004",

 "warehouse_code": "00000000000",

 "product_unitName": "箱",

 "othInRecords_ownertype": 0,

 "othInRecords_productsku": 2687495064310016,

 "stockUnitId_name": "箱",

 "vouchdate": "2022-04-13 00:00:00",

 "returnDate": "2022-04-13 00:00:00",

 "bodyItem!define11": "84e53301-1e1d-4dd7-adb5-a3717b5a9f2b",

 "pubts": "2022-04-13 16:42:38",

 "org_name": "zjj-组织",

 "othInRecords_product_cCode": "078340",

 "creator": "wangwenfeng",

 "othInRecords_productsku_cName": "签收000",

 "bodyItem!define2": "1212456567",

 "org": "2367785652474624",

 "lendCustom": 2367802419859712,

 "accountOrg": "2367785652474624",

 "bustype": "2376026494702080",

 "bodyItem!id": 2730219221653505,

 "lineno": 10,

 "createTime": "2022-04-13 16:42:37",

 "othInRecords_id": 2730219221653505,

 "othInRecords_product_productOfflineRetail_purchaseUnit": 2367796577194240,

 "lendType": 0

 }, {

 "bustype_name": "借入入库",

 "othInRecords_product_oUnitId": 2367796577194240,

 "othInRecords_invExchRate": 1,

 "totalQuantity": 0,

 "othInRecords_product_manageClass_code": "001",

 "othInRecords_unit_code": "xiang",

 "id": 2730219221653504,

 "tplid": 0,

 "lendCustom_name": "zjj客户1",

 "bustype_extend_attrs_json": "{\"otherInType\":\"12\",\"isUpdateCost\":\"false\",\"sendtowms\":\"false\"}",

 "isWfControlled": true,

 "warehouse": 2401760924029184,

 "othInRecords_stockUnitId": 2367796577194240,

 "barCode": "st_othinrecord|2730219221653504",

 "othInRecords_unit": 2367796577194240,

 "stockUnitId_precision": 4,

 "warehouse_name": "wls仓库1",

 "natCurrency_moneyDigit": 2,

 "othInRecords_product": 2687494993481984,

 "othInRecords_rowno": 2,

 "natCurrency_priceDigit": 2,

 "accountOrg_name": "zjj-组织",

 "unit_Precision": 4,

 "othInRecords_product_productClass_code": "002",

 "othInRecords_productsku_cCode": "078340",

 "othInRecords_product_cName": "签收000",

 "othInRecords_unit_name": "箱",

 "contactsPieces": 6,

 "org_code": "zjj-001",

 "contactsQuantity": 6,

 "status": 0,

 "returncount": 0,

 "totalPieces": 0,

 "verifystate": 0,

 "code": "QTRK20220413000004",

 "warehouse_code": "00000000000",

 "product_unitName": "箱",

 "othInRecords_ownertype": 0,

 "othInRecords_productsku": 2687495064310016,

 "stockUnitId_name": "箱",

 "vouchdate": "2022-04-13 00:00:00",

 "returnDate": "2022-04-13 00:00:00",

 "bodyItem!define11": "a49dca53-ebb5-44de-8e22-68ed20b98214",

 "pubts": "2022-04-13 16:42:38",

 "org_name": "zjj-组织",

 "othInRecords_product_cCode": "078340",

 "creator": "wangwenfeng",

 "othInRecords_productsku_cName": "签收000",

 "bodyItem!define2": "1212456567",

 "org": "2367785652474624",

 "lendCustom": 2367802419859712,

 "accountOrg": "2367785652474624",

 "bustype": "2376026494702080",

 "bodyItem!id": 2730219221653506,

 "lineno": 20,

 "createTime": "2022-04-13 16:42:37",

 "othInRecords_id": 2730219221653506,

 "othInRecords_product_productOfflineRetail_purchaseUnit": 2367796577194240,

 "lendType": 0

 }, {

 "bustype_name": "借入入库",

 "othInRecords_product_oUnitId": 2367796577194240,

 "othInRecords_invExchRate": 1,

 "totalQuantity": 0,

 "othInRecords_product_manageClass_code": "001",

 "othInRecords_unit_code": "xiang",

 "id": 2730066695526656,

 "tplid": 0,

 "lendCustom_name": "zjj客户1",

 "bustype_extend_attrs_json": "{\"otherInType\":\"12\",\"isUpdateCost\":\"false\",\"sendtowms\":\"false\"}",

 "isWfControlled": true,

 "warehouse": 2401760924029184,

 "othInRecords_stockUnitId": 2367796577194240,

 "barCode": "st_othinrecord|2730066695526656",

 "othInRecords_unit": 2367796577194240,

 "stockUnitId_precision": 4,

 "warehouse_name": "wls仓库1",

 "natCurrency_moneyDigit": 2,

 "othInRecords_product": 2687494993481984,

 "othInRecords_rowno": 1,

 "natCurrency_priceDigit": 2,

 "accountOrg_name": "zjj-组织",

 "unit_Precision": 4,

 "othInRecords_product_productClass_code": "002",

 "othInRecords_productsku_cCode": "078340",

 "othInRecords_product_cName": "签收000",

 "othInRecords_unit_name": "箱",

 "contactsPieces": 6,

 "org_code": "zjj-001",

 "contactsQuantity": 6,

 "status": 0,

 "returncount": 0,

 "totalPieces": 0,

 "verifystate": 0,

 "code": "QTRK20220413000003",

 "warehouse_code": "00000000000",

 "product_unitName": "箱",

 "othInRecords_ownertype": 0,

 "othInRecords_productsku": 2687495064310016,

 "stockUnitId_name": "箱",

 "vouchdate": "2022-04-13 00:00:00",

 "returnDate": "2022-04-13 00:00:00",

 "bodyItem!define11": "db4bbc6b-2e9b-4b01-84e5-4658604b7c3b",

 "pubts": "2022-04-13 16:38:51",

 "org_name": "zjj-组织",

 "othInRecords_product_cCode": "078340",

 "creator": "门浩",

 "othInRecords_productsku_cName": "签收000",

 "bodyItem!define2": "1212456567",

 "org": "2367785652474624",

 "lendCustom": 2367802419859712,

 "accountOrg": "2367785652474624",

 "bustype": "2376026494702080",

 "bodyItem!id": 2730066695526657,

 "lineno": 10,

 "createTime": "2022-04-13 14:07:28",

 "othInRecords_id": 2730066695526657,

 "othInRecords_product_productOfflineRetail_purchaseUnit": 2367796577194240,

 "lendType": 0

 }, {

 "othInRecords_qty": 100,

 "bustype_name": "其他入库",

 "modifier": "赵建军",

 "othInRecords_product_oUnitId": 2370279691358464,

 "othInRecords_invExchRate": 1,

 "subQty": 100,

 "totalQuantity": 324,

 "modifyTime": "2022-04-13 13:38:29",

 "othInRecords_product_manageClass_code": "001",

 "othInRecords_unit_code": "001",

 "id": 2730037975668992,

 "tplid": 0,

 "bustype_extend_attrs_json": "{\"sendtowms\":\"false\",\"otherInType\":\"1\",\"isUpdateCost\":\"true\"}",

 "isWfControlled": false,

 "warehouse": 2687618850771968,

 "othInRecords_stockUnitId": 2370279691358464,

 "barCode": "st_othinrecord|2730037975668992",

 "othInRecords_unit": 2370279691358464,

 "stockUnitId_precision": 2,

 "warehouse_name": "wzyck2",

 "natCurrency_moneyDigit": 2,

 "othInRecords_product": 2722824832947456,

 "othInRecords_rowno": 1,

 "natCurrency_priceDigit": 2,

 "accountOrg_name": "王章宇全职能",

 "unit_Precision": 2,

 "othInRecords_product_productClass_code": "002",

 "othInRecords_productsku_cCode": "079449",

 "othInRecords_product_cName": "zzh测试物料1",

 "othInRecords_unit_name": "瓶",

 "org_code": "wzyqzn",

 "status": 0,

 "returncount": 0,

 "totalPieces": 324,

 "verifystate": 0,

 "code": "QTRK20220413000002",

 "warehouse_code": "00001057",

 "product_unitName": "瓶",

 "othInRecords_ownertype": 0,

 "othInRecords_productsku": 2722824899482880,

 "stockUnitId_name": "瓶",

 "vouchdate": "2022-04-13 00:00:00",

 "bodyItem!define11": "046efc22-92cc-47c4-aa09-0201872fd481",

 "pubts": "2022-04-13 13:38:30",

 "org_name": "王章宇全职能",

 "othInRecords_product_cCode": "079449",

 "creator": "赵建军",

 "othInRecords_subQty": 100,

 "othInRecords_productsku_cName": "zzh测试物料1",

 "org": "2670747703349504",

 "accountOrg": "2670747703349504",

 "bustype": "2364609089081606",

 "bodyItem!id": 2730037975668993,

 "lineno": 10,

 "createTime": "2022-04-13 13:38:14",

 "othInRecords_id": 2730037975668993,

 "othInRecords_product_productOfflineRetail_purchaseUnit": 2370279691358464

 }, {

 "othInRecords_qty": 12,

 "bustype_name": "其他入库",

 "modifier": "赵建军",

 "othInRecords_product_oUnitId": 2670834028483328,

 "othInRecords_invExchRate": 1,

 "subQty": 12,

 "totalQuantity": 324,

 "modifyTime": "2022-04-13 13:38:29",

 "othInRecords_product_manageClass_code": "01",

 "othInRecords_unit_code": "EA",

 "id": 2730037975668992,

 "tplid": 0,

 "bustype_extend_attrs_json": "{\"sendtowms\":\"false\",\"otherInType\":\"1\",\"isUpdateCost\":\"true\"}",

 "isWfControlled": false,

 "warehouse": 2687618850771968,

 "othInRecords_stockUnitId": 2670834028483328,

 "barCode": "st_othinrecord|2730037975668992",

 "othInRecords_unit": 2670834028483328,

 "stockUnitId_precision": 2,

 "warehouse_name": "wzyck2",

 "natCurrency_moneyDigit": 2,

 "othInRecords_product": 2672306791453184,

 "othInRecords_rowno": 3,

 "natCurrency_priceDigit": 2,

 "accountOrg_name": "王章宇全职能",

 "unit_Precision": 2,

 "othInRecords_product_productClass_code": "01",

 "othInRecords_productsku_cCode": "00001",

 "othInRecords_product_cName": "苹果12-64G",

 "othInRecords_unit_name": "个",

 "org_code": "wzyqzn",

 "status": 0,

 "returncount": 0,

 "totalPieces": 324,

 "verifystate": 0,

 "code": "QTRK20220413000002",

 "warehouse_code": "00001057",

 "product_unitName": "个",

 "othInRecords_ownertype": 0,

 "othInRecords_productsku": 2672306800267776,

 "stockUnitId_name": "个",

 "vouchdate": "2022-04-13 00:00:00",

 "bodyItem!define11": "80556a8b-84ea-45e0-964f-3adc6e5ed3ec",

 "pubts": "2022-04-13 13:38:30",

 "org_name": "王章宇全职能",

 "othInRecords_product_cCode": "00001",

 "creator": "赵建军",

 "othInRecords_subQty": 12,

 "othInRecords_productsku_cName": "苹果12-64G",

 "org": "2670747703349504",

 "accountOrg": "2670747703349504",

 "bustype": "2364609089081606",

 "bodyItem!id": 2730037975668994,

 "lineno": 30,

 "createTime": "2022-04-13 13:38:14",

 "othInRecords_id": 2730037975668994,

 "othInRecords_product_productOfflineRetail_purchaseUnit": 2670834028483328

 }, {

 "othInRecords_qty": 100,

 "bustype_name": "其他入库",

 "modifier": "赵建军",

 "othInRecords_product_oUnitId": 2370279691358464,

 "othInRecords_invExchRate": 1,

 "subQty": 100,

 "totalQuantity": 324,

 "modifyTime": "2022-04-13 13:38:29",

 "othInRecords_product_manageClass_code": "001",

 "othInRecords_unit_code": "001",

 "id": 2730037975668992,

 "tplid": 0,

 "bustype_extend_attrs_json": "{\"sendtowms\":\"false\",\"otherInType\":\"1\",\"isUpdateCost\":\"true\"}",

 "isWfControlled": false,

 "warehouse": 2687618850771968,

 "othInRecords_stockUnitId": 2370279691358464,

 "barCode": "st_othinrecord|2730037975668992",

 "othInRecords_unit": 2370279691358464,

 "stockUnitId_precision": 2,

 "warehouse_name": "wzyck2",

 "natCurrency_moneyDigit": 2,

 "othInRecords_product": 2722824832947456,

 "othInRecords_rowno": 4,

 "natCurrency_priceDigit": 2,

 "accountOrg_name": "王章宇全职能",

 "unit_Precision": 2,

 "othInRecords_product_productClass_code": "002",

 "othInRecords_productsku_cCode": "079449",

 "othInRecords_product_cName": "zzh测试物料1",

 "othInRecords_unit_name": "瓶",

 "org_code": "wzyqzn",

 "status": 0,

 "returncount": 0,

 "totalPieces": 324,

 "verifystate": 0,

 "code": "QTRK20220413000002",

 "warehouse_code": "00001057",

 "product_unitName": "瓶",

 "othInRecords_ownertype": 0,

 "othInRecords_productsku": 2722824899482880,

 "stockUnitId_name": "瓶",

 "vouchdate": "2022-04-13 00:00:00",

 "bodyItem!define11": "e4e1a756-9192-45ea-9b68-17d6fd523661",

 "pubts": "2022-04-13 13:38:30",

 "org_name": "王章宇全职能",

 "othInRecords_product_cCode": "079449",

 "creator": "赵建军",

 "othInRecords_subQty": 100,

 "othInRecords_productsku_cName": "zzh测试物料1",

 "org": "2670747703349504",

 "accountOrg": "2670747703349504",

 "bustype": "2364609089081606",

 "bodyItem!id": 2730037975668996,

 "lineno": 40,

 "createTime": "2022-04-13 13:38:14",

 "othInRecords_id": 2730037975668996,

 "othInRecords_product_productOfflineRetail_purchaseUnit": 2370279691358464

 }, {

 "othInRecords_qty": 100,

 "bustype_name": "其他入库",

 "modifier": "赵建军",

 "othInRecords_product_oUnitId": 2370279691358464,

 "othInRecords_invExchRate": 1,

 "subQty": 100,

 "totalQuantity": 324,

 "modifyTime": "2022-04-13 13:38:29",

 "othInRecords_product_manageClass_code": "001",

 "othInRecords_unit_code": "001",

 "id": 2730037975668992,

 "tplid": 0,

 "bustype_extend_attrs_json": "{\"sendtowms\":\"false\",\"otherInType\":\"1\",\"isUpdateCost\":\"true\"}",

 "isWfControlled": false,

 "warehouse": 2687618850771968,

 "othInRecords_stockUnitId": 2370279691358464,

 "barCode": "st_othinrecord|2730037975668992",

 "othInRecords_unit": 2370279691358464,

 "stockUnitId_precision": 2,

 "warehouse_name": "wzyck2",

 "natCurrency_moneyDigit": 2,

 "othInRecords_product": 2722824832947456,

 "othInRecords_rowno": 5,

 "natCurrency_priceDigit": 2,

 "accountOrg_name": "王章宇全职能",

 "unit_Precision": 2,

 "othInRecords_product_productClass_code": "002",

 "othInRecords_productsku_cCode": "079449",

 "othInRecords_product_cName": "zzh测试物料1",

 "othInRecords_unit_name": "瓶",

 "org_code": "wzyqzn",

 "status": 0,

 "returncount": 0,

 "totalPieces": 324,

 "verifystate": 0,

 "code": "QTRK20220413000002",

 "warehouse_code": "00001057",

 "product_unitName": "瓶",

 "othInRecords_ownertype": 0,

 "othInRecords_productsku": 2722824899482880,

 "stockUnitId_name": "瓶",

 "vouchdate": "2022-04-13 00:00:00",

 "pubts": "2022-04-13 13:38:30",

 "org_name": "王章宇全职能",

 "othInRecords_product_cCode": "079449",

 "creator": "赵建军",

 "othInRecords_subQty": 100,

 "othInRecords_productsku_cName": "zzh测试物料1",

 "org": "2670747703349504",

 "accountOrg": "2670747703349504",

 "bustype": "2364609089081606",

 "lineno": 50,

 "createTime": "2022-04-13 13:38:14",

 "othInRecords_id": 2730037975668997,

 "othInRecords_product_productOfflineRetail_purchaseUnit": 2370279691358464

 }, {

 "othInRecords_qty": 12,

 "bustype_name": "其他入库",

 "modifier": "赵建军",

 "othInRecords_product_oUnitId": 2670834028483328,

 "othInRecords_invExchRate": 1,

 "subQty": 12,

 "totalQuantity": 324,

 "modifyTime": "2022-04-13 13:38:29",

 "othInRecords_product_manageClass_code": "01",

 "othInRecords_unit_code": "EA",

 "id": 2730037975668992,

 "tplid": 0,

 "bustype_extend_attrs_json": "{\"sendtowms\":\"false\",\"otherInType\":\"1\",\"isUpdateCost\":\"true\"}",

 "isWfControlled": false,

 "warehouse": 2687618850771968,

 "othInRecords_stockUnitId": 2670834028483328,

 "barCode": "st_othinrecord|2730037975668992",

 "othInRecords_unit": 2670834028483328,

 "stockUnitId_precision": 2,

 "warehouse_name": "wzyck2",

 "natCurrency_moneyDigit": 2,

 "othInRecords_product": 2672306791453184,

 "othInRecords_rowno": 2,

 "natCurrency_priceDigit": 2,

 "accountOrg_name": "王章宇全职能",

 "unit_Precision": 2,

 "othInRecords_product_productClass_code": "01",

 "othInRecords_productsku_cCode": "00001",

 "othInRecords_product_cName": "苹果12-64G",

 "othInRecords_unit_name": "个",

 "org_code": "wzyqzn",

 "status": 0,

 "returncount": 0,

 "totalPieces": 324,

 "verifystate": 0,

 "code": "QTRK20220413000002",

 "warehouse_code": "00001057",

 "product_unitName": "个",

 "othInRecords_ownertype": 0,

 "othInRecords_productsku": 2672306800267776,

 "stockUnitId_name": "个",

 "vouchdate": "2022-04-13 00:00:00",

 "bodyItem!define11": "6bdb7396-6b6e-461a-bf36-8adc9673a29a",

 "pubts": "2022-04-13 13:38:30",

 "org_name": "王章宇全职能",

 "othInRecords_product_cCode": "00001",

 "creator": "赵建军",

 "othInRecords_subQty": 12,

 "othInRecords_productsku_cName": "苹果12-64G",

 "org": "2670747703349504",

 "accountOrg": "2670747703349504",

 "bustype": "2364609089081606",

 "bodyItem!id": 2730038217644288,

 "lineno": 20,

 "createTime": "2022-04-13 13:38:14",

 "othInRecords_id": 2730038217644288,

 "othInRecords_product_productOfflineRetail_purchaseUnit": 2670834028483328

 }, {

 "othInRecords_qty": 100,

 "bustype_name": "其他入库",

 "othInRecords_product_oUnitId": 2370279691358464,

 "othInRecords_invExchRate": 1,

 "subQty": 100,

 "totalQuantity": 300,

 "othInRecords_product_manageClass_code": "001",

 "othInRecords_unit_code": "001",

 "id": 2730029938792704,

 "tplid": 0,

 "bustype_extend_attrs_json": "{\"sendtowms\":\"false\",\"otherInType\":\"1\",\"isUpdateCost\":\"true\"}",

 "isWfControlled": false,

 "warehouse": 2687618850771968,

 "othInRecords_stockUnitId": 2370279691358464,

 "barCode": "st_othinrecord|2730029938792704",

 "othInRecords_unit": 2370279691358464,

 "stockUnitId_precision": 2,

 "warehouse_name": "wzyck2",

 "natCurrency_moneyDigit": 2,

 "othInRecords_product": 2722824832947456,

 "othInRecords_rowno": 1,

 "natCurrency_priceDigit": 2,

 "accountOrg_name": "王章宇全职能",

 "unit_Precision": 2,

 "othInRecords_product_productClass_code": "002",

 "othInRecords_productsku_cCode": "079449",

 "othInRecords_product_cName": "zzh测试物料1",

 "othInRecords_unit_name": "瓶",

 "org_code": "wzyqzn",

 "status": 0,

 "returncount": 0,

 "totalPieces": 300,

 "verifystate": 0,

 "code": "QTRK20220413000001",

 "warehouse_code": "00001057",

 "product_unitName": "瓶",

 "othInRecords_ownertype": 0,

 "othInRecords_productsku": 2722824899482880,

 "stockUnitId_name": "瓶",

 "vouchdate": "2022-04-13 00:00:00",

 "returnDate": "2022-01-15 00:00:00",

 "bodyItem!define11": "1ac938e2-5692-4d54-96e0-8b05d908ff15",

 "pubts": "2022-04-13 13:30:11",

 "org_name": "王章宇全职能",

 "othInRecords_product_cCode": "079449",

 "creator": "test",

 "othInRecords_subQty": 100,

 "othInRecords_productsku_cName": "zzh测试物料1",

 "bodyItem!define2": "1212456567",

 "org": "2670747703349504",

 "accountOrg": "2670747703349504",

 "bustype": "2364609089081606",

 "bodyItem!id": 2730029938809088,

 "lineno": 10,

 "createTime": "2022-04-13 13:30:04",

 "othInRecords_id": 2730029938809088,

 "othInRecords_product_productOfflineRetail_purchaseUnit": 2370279691358464

 }, {

 "othInRecords_qty": 100,

 "bustype_name": "其他入库",

 "othInRecords_product_oUnitId": 2370279691358464,

 "othInRecords_invExchRate": 1,

 "subQty": 100,

 "totalQuantity": 300,

 "othInRecords_product_manageClass_code": "001",

 "othInRecords_unit_code": "001",

 "id": 2730029938792704,

 "tplid": 0,

 "bustype_extend_attrs_json": "{\"sendtowms\":\"false\",\"otherInType\":\"1\",\"isUpdateCost\":\"true\"}",

 "isWfControlled": false,

 "warehouse": 2687618850771968,

 "othInRecords_stockUnitId": 2370279691358464,

 "barCode": "st_othinrecord|2730029938792704",

 "othInRecords_unit": 2370279691358464,

 "stockUnitId_precision": 2,

 "warehouse_name": "wzyck2",

 "natCurrency_moneyDigit": 2,

 "othInRecords_product": 2722824832947456,

 "othInRecords_rowno": 2,

 "natCurrency_priceDigit": 2,

 "accountOrg_name": "王章宇全职能",

 "unit_Precision": 2,

 "othInRecords_product_productClass_code": "002",

 "othInRecords_productsku_cCode": "079449",

 "othInRecords_product_cName": "zzh测试物料1",

 "othInRecords_unit_name": "瓶",

 "org_code": "wzyqzn",

 "status": 0,

 "returncount": 0,

 "totalPieces": 300,

 "verifystate": 0,

 "code": "QTRK20220413000001",

 "warehouse_code": "00001057",

 "product_unitName": "瓶",

 "othInRecords_ownertype": 0,

 "othInRecords_productsku": 2722824899482880,

 "stockUnitId_name": "瓶",

 "vouchdate": "2022-04-13 00:00:00",

 "returnDate": "2022-01-15 00:00:00",

 "bodyItem!define11": "fbbc560f-0c8c-49f2-853c-020af253b1a7",

 "pubts": "2022-04-13 13:30:11",

 "org_name": "王章宇全职能",

 "othInRecords_product_cCode": "079449",

 "creator": "test",

 "othInRecords_subQty": 100,

 "othInRecords_productsku_cName": "zzh测试物料1",

 "bodyItem!define2": "1212456567",

 "org": "2670747703349504",

 "accountOrg": "2670747703349504",

 "bustype": "2364609089081606",

 "bodyItem!id": 2730029938809089,

 "lineno": 20,

 "createTime": "2022-04-13 13:30:04",

 "othInRecords_id": 2730029938809089,

 "othInRecords_product_productOfflineRetail_purchaseUnit": 2370279691358464

 }, {

 "othInRecords_qty": 100,

 "bustype_name": "其他入库",

 "othInRecords_product_oUnitId": 2370279691358464,

 "othInRecords_invExchRate": 1,

 "subQty": 100,

 "totalQuantity": 300,

 "othInRecords_product_manageClass_code": "001",

 "othInRecords_unit_code": "001",

 "id": 2730029938792704,

 "tplid": 0,

 "bustype_extend_attrs_json": "{\"sendtowms\":\"false\",\"otherInType\":\"1\",\"isUpdateCost\":\"true\"}",

 "isWfControlled": false,

 "warehouse": 2687618850771968,

 "othInRecords_stockUnitId": 2370279691358464,

 "barCode": "st_othinrecord|2730029938792704",

 "othInRecords_unit": 2370279691358464,

 "stockUnitId_precision": 2,

 "warehouse_name": "wzyck2",

 "natCurrency_moneyDigit": 2,

 "othInRecords_product": 2722824832947456,

 "othInRecords_rowno": 3,

 "natCurrency_priceDigit": 2,

 "accountOrg_name": "王章宇全职能",

 "unit_Precision": 2,

 "othInRecords_product_productClass_code": "002",

 "othInRecords_productsku_cCode": "079449",

 "othInRecords_product_cName": "zzh测试物料1",

 "othInRecords_unit_name": "瓶",

 "org_code": "wzyqzn",

 "status": 0,

 "returncount": 0,

 "totalPieces": 300,

 "verifystate": 0,

 "code": "QTRK20220413000001",

 "warehouse_code": "00001057",

 "product_unitName": "瓶",

 "othInRecords_ownertype": 0,

 "othInRecords_productsku": 2722824899482880,

 "stockUnitId_name": "瓶",

 "vouchdate": "2022-04-13 00:00:00",

 "returnDate": "2022-01-15 00:00:00",

 "pubts": "2022-04-13 13:30:11",

 "org_name": "王章宇全职能",

 "othInRecords_product_cCode": "079449",

 "creator": "test",

 "othInRecords_subQty": 100,

 "othInRecords_productsku_cName": "zzh测试物料1",

 "bodyItem!define2": "1212456567",

 "org": "2670747703349504",

 "accountOrg": "2670747703349504",

 "bustype": "2364609089081606",

 "bodyItem!id": 2730029938809090,

 "lineno": 30,

 "createTime": "2022-04-13 13:30:04",

 "othInRecords_id": 2730029938809090,

 "othInRecords_product_productOfflineRetail_purchaseUnit": 2370279691358464

 }, {

 "othInRecords_qty": 100,

 "bustype_name": "其他入库",

 "modifier": "赵建军",

 "othInRecords_product_oUnitId": 2370279691358464,

 "othInRecords_invExchRate": 1,

 "subQty": 100,

 "totalQuantity": 412,

 "modifyTime": "2022-04-13 13:36:13",

 "othInRecords_product_manageClass_code": "001",

 "othInRecords_unit_code": "001",

 "id": 2729055226648064,

 "tplid": 0,

 "bustype_extend_attrs_json": "{\"sendtowms\":\"false\",\"otherInType\":\"1\",\"isUpdateCost\":\"true\"}",

 "isWfControlled": false,

 "warehouse": 2687618850771968,

 "othInRecords_stockUnitId": 2370279691358464,

 "barCode": "st_othinrecord|2729055226648064",

 "othInRecords_unit": 2370279691358464,

 "stockUnitId_precision": 2,

 "warehouse_name": "wzyck2",

 "natCurrency_moneyDigit": 2,

 "othInRecords_product": 2722824832947456,

 "othInRecords_rowno": 5,

 "natCurrency_priceDigit": 2,

 "accountOrg_name": "王章宇全职能",

 "unit_Precision": 2,

 "othInRecords_product_productClass_code": "002",

 "othInRecords_productsku_cCode": "079449",

 "othInRecords_product_cName": "zzh测试物料1",

 "othInRecords_unit_name": "瓶",

 "org_code": "wzyqzn",

 "status": 0,

 "returncount": 0,

 "totalPieces": 412,

 "verifystate": 0,

 "code": "QTRK20220412000011",

 "warehouse_code": "00001057",

 "product_unitName": "瓶",

 "othInRecords_ownertype": 0,

 "othInRecords_productsku": 2722824899482880,

 "stockUnitId_name": "瓶",

 "vouchdate": "2022-04-12 00:00:00",

 "pubts": "2022-04-13 13:36:14",

 "org_name": "王章宇全职能",

 "othInRecords_product_cCode": "079449",

 "creator": "test",

 "othInRecords_subQty": 100,

 "othInRecords_productsku_cName": "zzh测试物料1",

 "org": "2670747703349504",

 "accountOrg": "2670747703349504",

 "bustype": "2364609089081606",

 "lineno": 50,

 "createTime": "2022-04-12 20:58:33",

 "othInRecords_id": 2729055226664448,

 "othInRecords_product_productOfflineRetail_purchaseUnit": 2370279691358464

 }, {

 "othInRecords_qty": 100,

 "bustype_name": "其他入库",

 "modifier": "赵建军",

 "othInRecords_product_oUnitId": 2370279691358464,

 "othInRecords_invExchRate": 1,

 "subQty": 100,

 "totalQuantity": 412,

 "modifyTime": "2022-04-13 13:36:13",

 "othInRecords_product_manageClass_code": "001",

 "othInRecords_unit_code": "001",

 "id": 2729055226648064,

 "tplid": 0,

 "bustype_extend_attrs_json": "{\"sendtowms\":\"false\",\"otherInType\":\"1\",\"isUpdateCost\":\"true\"}",

 "isWfControlled": false,

 "warehouse": 2687618850771968,

 "othInRecords_stockUnitId": 2370279691358464,

 "barCode": "st_othinrecord|2729055226648064",

 "othInRecords_unit": 2370279691358464,

 "stockUnitId_precision": 2,

 "warehouse_name": "wzyck2",

 "natCurrency_moneyDigit": 2,

 "othInRecords_product": 2722824832947456,

 "othInRecords_rowno": 4,

 "natCurrency_priceDigit": 2,

 "accountOrg_name": "王章宇全职能",

 "unit_Precision": 2,

 "othInRecords_product_productClass_code": "002",

 "othInRecords_productsku_cCode": "079449",

 "othInRecords_product_cName": "zzh测试物料1",

 "othInRecords_unit_name": "瓶",

 "org_code": "wzyqzn",

 "status": 0,

 "returncount": 0,

 "totalPieces": 412,

 "verifystate": 0,

 "code": "QTRK20220412000011",

 "warehouse_code": "00001057",

 "product_unitName": "瓶",

 "othInRecords_ownertype": 0,

 "othInRecords_productsku": 2722824899482880,

 "stockUnitId_name": "瓶",

 "vouchdate": "2022-04-12 00:00:00",

 "bodyItem!define11": "fbbc560f-0c8c-49f2-853c-020af253b1a7",

 "pubts": "2022-04-13 13:36:14",

 "org_name": "王章宇全职能",

 "othInRecords_product_cCode": "079449",

 "creator": "test",

 "othInRecords_subQty": 100,

 "othInRecords_productsku_cName": "zzh测试物料1",

 "org": "2670747703349504",

 "accountOrg": "2670747703349504",

 "bustype": "2364609089081606",

 "bodyItem!id": 2729994747959552,

 "lineno": 40,

 "createTime": "2022-04-12 20:58:33",

 "othInRecords_id": 2729994747959552,

 "othInRecords_product_productOfflineRetail_purchaseUnit": 2370279691358464

 }, {

 "othInRecords_qty": 100,

 "bustype_name": "其他入库",

 "modifier": "赵建军",

 "othInRecords_product_oUnitId": 2370279691358464,

 "othInRecords_invExchRate": 1,

 "subQty": 100,

 "totalQuantity": 412,

 "modifyTime": "2022-04-13 13:36:13",

 "othInRecords_product_manageClass_code": "001",

 "othInRecords_unit_code": "001",

 "id": 2729055226648064,

 "tplid": 0,

 "bustype_extend_attrs_json": "{\"sendtowms\":\"false\",\"otherInType\":\"1\",\"isUpdateCost\":\"true\"}",

 "isWfControlled": false,

 "warehouse": 2687618850771968,

 "othInRecords_stockUnitId": 2370279691358464,

 "barCode": "st_othinrecord|2729055226648064",

 "othInRecords_unit": 2370279691358464,

 "stockUnitId_precision": 2,

 "warehouse_name": "wzyck2",

 "natCurrency_moneyDigit": 2,

 "othInRecords_product": 2722824832947456,

 "othInRecords_rowno": 1,

 "natCurrency_priceDigit": 2,

 "accountOrg_name": "王章宇全职能",

 "unit_Precision": 2,

 "othInRecords_product_productClass_code": "002",

 "othInRecords_productsku_cCode": "079449",

 "othInRecords_product_cName": "zzh测试物料1",

 "othInRecords_unit_name": "瓶",

 "org_code": "wzyqzn",

 "status": 0,

 "returncount": 0,

 "totalPieces": 412,

 "verifystate": 0,

 "code": "QTRK20220412000011",

 "warehouse_code": "00001057",

 "product_unitName": "瓶",

 "othInRecords_ownertype": 0,

 "othInRecords_productsku": 2722824899482880,

 "stockUnitId_name": "瓶",

 "vouchdate": "2022-04-12 00:00:00",

 "bodyItem!define11": "1ac938e2-5692-4d54-96e0-8b05d908ff15",

 "pubts": "2022-04-13 13:36:14",

 "org_name": "王章宇全职能",

 "othInRecords_product_cCode": "079449",

 "creator": "test",

 "othInRecords_subQty": 100,

 "othInRecords_productsku_cName": "zzh测试物料1",

 "org": "2670747703349504",

 "accountOrg": "2670747703349504",

 "bustype": "2364609089081606",

 "bodyItem!id": 2729995182020864,

 "lineno": 10,

 "createTime": "2022-04-12 20:58:33",

 "othInRecords_id": 2729995182020864,

 "othInRecords_product_productOfflineRetail_purchaseUnit": 2370279691358464

 }, {

 "othInRecords_qty": 100,

 "bustype_name": "其他入库",

 "modifier": "赵建军",

 "othInRecords_product_oUnitId": 2370279691358464,

 "othInRecords_invExchRate": 1,

 "subQty": 100,

 "totalQuantity": 412,

 "modifyTime": "2022-04-13 13:36:13",

 "othInRecords_product_manageClass_code": "001",

 "othInRecords_unit_code": "001",

 "id": 2729055226648064,

 "tplid": 0,

 "bustype_extend_attrs_json": "{\"sendtowms\":\"false\",\"otherInType\":\"1\",\"isUpdateCost\":\"true\"}",

 "isWfControlled": false,

 "warehouse": 2687618850771968,

 "othInRecords_stockUnitId": 2370279691358464,

 "barCode": "st_othinrecord|2729055226648064",

 "othInRecords_unit": 2370279691358464,

 "stockUnitId_precision": 2,

 "warehouse_name": "wzyck2",

 "natCurrency_moneyDigit": 2,

 "othInRecords_product": 2722824832947456,

 "othInRecords_rowno": 3,

 "natCurrency_priceDigit": 2,

 "accountOrg_name": "王章宇全职能",

 "unit_Precision": 2,

 "othInRecords_product_productClass_code": "002",

 "othInRecords_productsku_cCode": "079449",

 "othInRecords_product_cName": "zzh测试物料1",

 "othInRecords_unit_name": "瓶",

 "org_code": "wzyqzn",

 "status": 0,

 "returncount": 0,

 "totalPieces": 412,

 "verifystate": 0,

 "code": "QTRK20220412000011",

 "warehouse_code": "00001057",

 "product_unitName": "瓶",

 "othInRecords_ownertype": 0,

 "othInRecords_productsku": 2722824899482880,

 "stockUnitId_name": "瓶",

 "vouchdate": "2022-04-12 00:00:00",

 "bodyItem!define11": "66a54289-d5f3-41fa-8024-e9b4c5af2824",

 "pubts": "2022-04-13 13:36:14",

 "org_name": "王章宇全职能",

 "othInRecords_product_cCode": "079449",

 "creator": "test",

 "othInRecords_subQty": 100,

 "othInRecords_productsku_cName": "zzh测试物料1",

 "org": "2670747703349504",

 "accountOrg": "2670747703349504",

 "bustype": "2364609089081606",

 "bodyItem!id": 2730035296606465,

 "lineno": 30,

 "createTime": "2022-04-12 20:58:33",

 "othInRecords_id": 2730035296606465,

 "othInRecords_product_productOfflineRetail_purchaseUnit": 2370279691358464

 }, {

 "othInRecords_qty": 12,

 "bustype_name": "其他入库",

 "modifier": "赵建军",

 "othInRecords_product_oUnitId": 2670834028483328,

 "othInRecords_invExchRate": 1,

 "subQty": 12,

 "totalQuantity": 412,

 "modifyTime": "2022-04-13 13:36:13",

 "othInRecords_product_manageClass_code": "01",

 "othInRecords_unit_code": "EA",

 "id": 2729055226648064,

 "tplid": 0,

 "bustype_extend_attrs_json": "{\"sendtowms\":\"false\",\"otherInType\":\"1\",\"isUpdateCost\":\"true\"}",

 "isWfControlled": false,

 "warehouse": 2687618850771968,

 "othInRecords_stockUnitId": 2670834028483328,

 "barCode": "st_othinrecord|2729055226648064",

 "othInRecords_unit": 2670834028483328,

 "stockUnitId_precision": 2,

 "warehouse_name": "wzyck2",

 "natCurrency_moneyDigit": 2,

 "othInRecords_product": 2672306791453184,

 "othInRecords_rowno": 2,

 "natCurrency_priceDigit": 2,

 "accountOrg_name": "王章宇全职能",

 "unit_Precision": 2,

 "othInRecords_product_productClass_code": "01",

 "othInRecords_productsku_cCode": "00001",

 "othInRecords_product_cName": "苹果12-64G",

 "othInRecords_unit_name": "个",

 "org_code": "wzyqzn",

 "status": 0,

 "returncount": 0,

 "totalPieces": 412,

 "verifystate": 0,

 "code": "QTRK20220412000011",

 "warehouse_code": "00001057",

 "product_unitName": "个",

 "othInRecords_ownertype": 0,

 "othInRecords_productsku": 2672306800267776,

 "stockUnitId_name": "个",

 "vouchdate": "2022-04-12 00:00:00",

 "bodyItem!define11": "7b45fa67-ffd6-416f-bb6c-2bd973404eae",

 "pubts": "2022-04-13 13:36:14",

 "org_name": "王章宇全职能",

 "othInRecords_product_cCode": "00001",

 "creator": "test",

 "othInRecords_subQty": 12,

 "othInRecords_productsku_cName": "苹果12-64G",

 "org": "2670747703349504",

 "accountOrg": "2670747703349504",

 "bustype": "2364609089081606",

 "bodyItem!id": 2730035990616320,

 "lineno": 20,

 "createTime": "2022-04-12 20:58:33",

 "othInRecords_id": 2730035990616320,

 "othInRecords_product_productOfflineRetail_purchaseUnit": 2670834028483328

 }, {

 "othInRecords_qty": 100,

 "bustype_name": "其他入库",

 "othInRecords_product_oUnitId": 2370280474218752,

 "othInRecords_invExchRate": 1,

 "subQty": 100,

 "totalQuantity": 100,

 "othInRecords_product_manageClass_code": "0000000",

 "othInRecords_unit_code": "002",

 "othInRecords_inventoryowner_name": "zjj供应商1",

 "id": 2728944115470592,

 "tplid": 0,

 "bustype_extend_attrs_json": "{\"sendtowms\":\"false\",\"otherInType\":\"1\",\"isUpdateCost\":\"true\"}",

 "isWfControlled": false,

 "warehouse": 2649129847755008,

 "othInRecords_stockUnitId": 2370280474218752,

 "barCode": "st_othinrecord|2728944115470592",

 "othInRecords_unit": 2370280474218752,

 "stockUnitId_precision": 3,

 "warehouse_name": "wzyck1",

 "natCurrency_moneyDigit": 2,

 "othInRecords_product": 2647993054580992,

 "othInRecords_rowno": 1,

 "natCurrency_priceDigit": 2,

 "accountOrg_name": "zjj-组织",

 "unit_Precision": 3,

 "othInRecords_product_productClass_code": "002",

 "othInRecords_productsku_cCode": "073267",

 "othInRecords_product_cName": "wzy收发存测试",

 "othInRecords_unit_name": "个",

 "org_code": "zjj-001",

 "status": 0,

 "returncount": 0,

 "totalPieces": 100,

 "verifystate": 0,

 "code": "QTRK20220412000010",

 "warehouse_code": "00000024",

 "product_unitName": "个",

 "othInRecords_ownertype": 1,

 "othInRecords_productsku": 2647993063919872,

 "stockUnitId_name": "个",

 "vouchdate": "2022-04-12 00:00:00",

 "bodyItem!define11": "16576953-fffb-441f-8608-7ceec79db052",

 "pubts": "2022-04-12 19:05:32",

 "org_name": "zjj-组织",

 "othInRecords_product_cCode": "073267",

 "creator": "赵建军",

 "othInRecords_subQty": 100,

 "othInRecords_productsku_cName": "wzy收发存测试",

 "org": "2367785652474624",

 "accountOrg": "2367785652474624",

 "bustype": "2364609089081606",

 "bodyItem!id": 2728944115470593,

 "lineno": 10,

 "othInRecords_inventoryowner_vendor": 2373375765827840,

 "createTime": "2022-04-12 19:05:31",

 "othInRecords_id": 2728944115470593,

 "othInRecords_product_productOfflineRetail_purchaseUnit": 2370280474218752

 }, {

 "othInRecords_qty": 1,

 "bustype_name": "其他入库",

 "modifier": "王章宇",

 "othInRecords_product_oUnitId": 2370280474218752,

 "othInRecords_invExchRate": 1,

 "subQty": 1,

 "totalQuantity": 3,

 "modifyTime": "2022-04-12 19:05:37",

 "othInRecords_product_manageClass_code": "0000000",

 "othInRecords_unit_code": "002",

 "id": 2728934143087360,

 "tplid": 0,

 "bustype_extend_attrs_json": "{\"sendtowms\":\"false\",\"otherInType\":\"1\",\"isUpdateCost\":\"true\"}",

 "isWfControlled": false,

 "warehouse": 2493685207815680,

 "othInRecords_stockUnitId": 2370280474218752,

 "barCode": "st_othinrecord|2728934143087360",

 "othInRecords_unit": 2370280474218752,

 "stockUnitId_precision": 3,

 "warehouse_name": "序列号仓库",

 "natCurrency_moneyDigit": 2,

 "othInRecords_product": 2493675470181888,

 "othInRecords_rowno": 1,

 "natCurrency_priceDigit": 2,

 "accountOrg_name": "wls组织",

 "unit_Precision": 3,

 "othInRecords_product_productClass_code": "002",

 "othInRecords_productsku_cCode": "073172",

 "othInRecords_product_cName": "序列号物料wls12",

 "othInRecords_unit_name": "个",

 "org_code": "0000000",

 "status": 0,

 "returncount": 0,

 "totalPieces": 3,

 "verifystate": 0,

 "batchno": "1",

 "code": "QTRK20220412000009",

 "warehouse_code": "000000",

 "product_unitName": "个",

 "othInRecords_ownertype": 0,

 "othInRecords_productsku": 2493675479062016,

 "stockUnitId_name": "个",

 "vouchdate": "2022-04-12 00:00:00",

 "returnDate": "2022-01-15 00:00:00",

 "bodyItem!define11": "c5a0e0e5-116d-4fcf-963c-1a9d9ac69110",

 "pubts": "2022-04-12 19:05:38",

 "org_name": "wls组织",

 "othInRecords_product_cCode": "073172",

 "creator": "王章宇",

 "othInRecords_subQty": 1,

 "othInRecords_productsku_cName": "序列号物料wls12",

 "bodyItem!define2": "1212456567",

 "org": "2391894927365888",

 "accountOrg": "2391894927365888",

 "bustype": "2364609089081606",

 "bodyItem!id": 2728944226701568,

 "lineno": 10,

 "createTime": "2022-04-12 18:55:22",

 "othInRecords_id": 2728944226701568,

 "othInRecords_product_productOfflineRetail_purchaseUnit": 2370280474218752

 }, {

 "othInRecords_qty": 2,

 "bustype_name": "其他入库",

 "modifier": "王章宇",

 "othInRecords_product_oUnitId": 2370280474218752,

 "othInRecords_invExchRate": 1,

 "subQty": 2,

 "totalQuantity": 3,

 "modifyTime": "2022-04-12 19:05:37",

 "othInRecords_product_manageClass_code": "0000000",

 "othInRecords_unit_code": "002",

 "othInRecords_inventoryowner_name": "eflong供应商",

 "id": 2728934143087360,

 "tplid": 0,

 "bustype_extend_attrs_json": "{\"sendtowms\":\"false\",\"otherInType\":\"1\",\"isUpdateCost\":\"true\"}",

 "isWfControlled": false,

 "warehouse": 2493685207815680,

 "othInRecords_stockUnitId": 2370280474218752,

 "barCode": "st_othinrecord|2728934143087360",

 "othInRecords_unit": 2370280474218752,

 "stockUnitId_precision": 3,

 "warehouse_name": "序列号仓库",

 "natCurrency_moneyDigit": 2,

 "othInRecords_product": 2493675470181888,

 "othInRecords_rowno": 2,

 "natCurrency_priceDigit": 2,

 "accountOrg_name": "wls组织",

 "unit_Precision": 3,

 "othInRecords_product_productClass_code": "002",

 "othInRecords_productsku_cCode": "073172",

 "othInRecords_product_cName": "序列号物料wls12",

 "othInRecords_unit_name": "个",

 "org_code": "0000000",

 "status": 0,

 "returncount": 0,

 "totalPieces": 3,

 "verifystate": 0,

 "batchno": "1",

 "code": "QTRK20220412000009",

 "warehouse_code": "000000",

 "product_unitName": "个",

 "othInRecords_ownertype": 1,

 "othInRecords_productsku": 2493675479062016,

 "stockUnitId_name": "个",

 "vouchdate": "2022-04-12 00:00:00",

 "returnDate": "2022-01-15 00:00:00",

 "bodyItem!define11": "5ea304fd-b2af-4d65-972b-31f0e916b7b8",

 "pubts": "2022-04-12 19:05:38",

 "org_name": "wls组织",

 "othInRecords_product_cCode": "073172",

 "creator": "王章宇",

 "othInRecords_subQty": 2,

 "othInRecords_productsku_cName": "序列号物料wls12",

 "bodyItem!define2": "1212456567",

 "org": "2391894927365888",

 "accountOrg": "2391894927365888",

 "bustype": "2364609089081606",

 "bodyItem!id": 2728944226701570,

 "lineno": 20,

 "othInRecords_inventoryowner_vendor": 2401707677274368,

 "createTime": "2022-04-12 18:55:22",

 "othInRecords_id": 2728944226701570,

 "othInRecords_product_productOfflineRetail_purchaseUnit": 2370280474218752

 }, {

 "othInRecords_qty": 25,

 "bustype_name": "其他入库",

 "othInRecords_product_oUnitId": 2370280474218752,

 "othInRecords_invExchRate": 1,

 "subQty": 25,

 "totalQuantity": 25,

 "othInRecords_product_manageClass_code": "0729",

 "othInRecords_unit_code": "002",

 "id": 2728908524524032,

 "tplid": 0,

 "bustype_extend_attrs_json": "{\"sendtowms\":\"false\",\"otherInType\":\"1\",\"isUpdateCost\":\"true\"}",

 "product_model": "%牛奶00",

 "isWfControlled": false,

 "warehouse": 2667616839029504,

 "othInRecords_stockUnitId": 2370280474218752,

 "othInRecords_product_defaultAlbumId": "https://ys-yxy-testres.yonyoucloud.com/8642ee47-fb58-461e-aefb-bcb10e55f518.png",

 "barCode": "st_othinrecord|2728908524524032",

 "othInRecords_unit": 2370280474218752,

 "stockUnitId_precision": 3,

 "warehouse_name": "小黄仓库",

 "natCurrency_moneyDigit": 2,

 "othInRecords_product": 2667625160430336,

 "othInRecords_rowno": 1,

 "natCurrency_priceDigit": 2,

 "accountOrg_name": "小黄公司",

 "unit_Precision": 3,

 "othInRecords_product_productClass_code": "xh001",

 "othInRecords_productsku_cCode": "073323",

 "othInRecords_product_cName": "牛奶",

 "othInRecords_unit_name": "个",

 "org_code": "xh001",

 "othInRecords_productsku_modelDescription": "牛奶00",

 "status": 0,

 "returncount": 0,

 "totalPieces": 25,

 "verifystate": 0,

 "code": "QTRK20220412000008",

 "warehouse_code": "00000045",

 "product_unitName": "个",

 "othInRecords_ownertype": 0,

 "othInRecords_productsku": 2667625167065856,

 "stockUnitId_name": "个",

 "vouchdate": "2022-04-12 00:00:00",

 "returnDate": "2022-01-15 00:00:00",

 "bodyItem!define11": "12eb5916-52f0-4e29-ba1c-a76f1e6f6e47",

 "othInRecords_product_modelDescription": "牛奶00",

 "pubts": "2022-04-12 18:29:20",

 "org_name": "小黄公司",

 "othInRecords_product_cCode": "073323",

 "creator": "一三",

 "othInRecords_subQty": 25,

 "othInRecords_productsku_cName": "牛奶",

 "bodyItem!define2": "1212456567",

 "org": "2647760533918208",

 "accountOrg": "2647760533918208",

 "bustype": "2364609089081606",

 "bodyItem!id": 2728908524524033,

 "lineno": 10,

 "createTime": "2022-04-12 18:29:18",

 "othInRecords_id": 2728908524524033,

 "othInRecords_product_productOfflineRetail_purchaseUnit": 2370280474218752

 }],

 "sumRecordList": [],

 "pageCount": 1,

 "beginPageIndex": 1,

 "endPageIndex": 1

 }

}

## [](#6-返回参数说明)6. 返回参数说明

||参数||是否可空||说明|
||pageIndex||否||当前页码|
||pageSize||否||每页条数|
||recordCount||否||总条数|
||recordList||否||数据信息|
||sumRecordList||否||合计信息|
||pageCount||否||页码数|
||beginPageIndex||否|||
||endPageIndex||否|||