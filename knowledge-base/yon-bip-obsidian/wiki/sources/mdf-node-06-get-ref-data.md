---
title: "获取参照数据"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/06-get-ref-data"
section: "MDF服务"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, MDF服务]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 获取参照数据

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/06-get-ref-data | 所属：MDF服务

# [](#获取参照数据)获取参照数据

${domain.iuap-mdf-node}/bill/list

## [](#1-接口说明)1. 接口说明

此接口一般会发两次，第一次用于获取参照数据信息，第二次用于获取参照分页信息

## [](#2-接口类型)2. 接口类型

**POST**

## [](#3-请求参数)3. 请求参数

{

 "page": {

 "pageSize": 10,

 "pageIndex": 1,

 "totalCount": 1

 },

 "dataType": "grid",

 "refCode": "productcenter.productref",

 "fullname": "st.othinrecord.OthInRecords",

 "datasource": "product.cCode",

 "key": "product_cCode",

 "bSelfDefine": false,

 "billnum": "st_othinrecord",

 "masterOrgValue": "2367785652474624",

 "billEntityId": 14504581,

 "data": "{\"id\":2730219221653504,\"org\":\"2367785652474624\",\"org_name\":\"zjj-组织\",\"isWfControlled\":true,\"inventoryowner_name\":null,\"ownertype\":0,\"code\":\"QTRK20220413000004\",\"vouchdate\":\"2022-04-13 00:00:00\",\"bustype\":\"2376026494702080\",\"bustype_name\":\"借入入库\",\"shop\":-1,\"warehouse\":2401760924029184,\"department_name\":null,\"operator_name\":null,\"bustype_extend_attrs_json\":\"{\\\"otherInType\\\":\\\"12\\\",\\\"isUpdateCost\\\":\\\"false\\\",\\\"sendtowms\\\":\\\"false\\\"}\",\"barCode\":\"st_othinrecord|2730219221653504\",\"warehouse_iSerialManage\":false,\"warehouse_isGoodsPosition\":false,\"warehouse_countCost\":true,\"pubts\":\"2022-04-13 16:42:38\",\"tplid\":0,\"inventoryowner\":0,\"lendType\":0,\"lendCustom\":2367802419859712,\"isUpdateCost\":false,\"warehouse_isGoodsPositionStock\":false,\"costStart\":false,\"stockStart\":true,\"othInRecords\":[{\"lineno\":10,\"inventoryowner\":0,\"isUpdateCost\":false,\"id\":2730219221653505,\"productClass\":\"\",\"productClassName\":\"\",\"returnDate\":\"2022-04-13 00:00:00\",\"isSerialNoManage\":\"\",\"product\":null,\"product_cCode\":null,\"ownertype\":0,\"productsku\":null,\"productsku_cCode\":null,\"stockStatusDoc_name\":\"合格\",\"stockStatusDoc\":2346257360557441,\"reserveid\":0,\"goodsposition_cName\":null,\"batchno\":null,\"contactsQuantity\":6,\"contactsPieces\":null,\"unit\":null,\"invExchRate\":0,\"stockUnitId\":null,\"stockUnit_name\":\"\",\"taxRate\":0,\"unitExchangeType\":0,\"pubts\":\"2022-04-13 16:42:37\",\"bodyItem!id\":2730219221653505,\"isBatchManage\":\"\",\"isExpiryDateManage\":\"\",\"autoCalcCost\":true}]}",

 "serviceCode": "st_othinrecordlist",

 "condition": {

 "commonVOs": [{

 "itemName": "schemeName",

 "value1": "默认方案"

 }, {

 "itemName": "isDefault",

 "value1": true

 }],

 "filtersId": "304057688",

 "solutionId": 1002364096,

 "bInit": true

 }

}

## [](#4-参数说明)4. 参数说明

||参数||是否可空||说明|
||page||否||分页信息|
||dataType||否||数据类型，grid是表格，tree是树|
||refCode||否||参照编码|
||fullname||否||对应后端的fullname|
||datasource||否||对应字段的cFIeldName|
||key||否||对应字段的cName|
||bSelfDefine||否||是否自定义|
||billnum||否||所属单据的billno|
||masterOrgValue||否||主组织id|
||billEntityId||否||实体id|
||data||否||数据信息|
||serviceCode||否||应用编码|
||condition||否||参照过滤信息|

## [](#5-返回结构)5. 返回结构

{

 "code": 200,

 "message": "操作成功",

 "data": {

 "pageIndex": 1,

 "pageSize": 10,

 "recordCount": 1,

 "recordList": [{

 "code": "073101",

 "rangeType": 1,

 "unit_Code": "xiang",

 "detail!shortName": "zjj批次物料",

 "productApplyRange_orgId": "2367785652474624",

 "unit_Name": "箱",

 "unit": 2367796577194240,

 "productApplyRangeId": 2367797379993856,

 "name": "zjj批次效期物料",

 "id": 2367797377290496,

 "productref_product_userDefine002": 2367794913333504,

 "detail!mnemonicCode": "zjjPCXQWL",

 "productref_product_userDefine001": "zjj-组织",

 "productref_product_userDefine004": "测试",

 "productApplyRange_orgId_Name": "zjj-组织",

 "productref_product_userDefine003": "2367785652474624"

 }, {

 "code": "073102",

 "rangeType": 1,

 "unit_Code": "xiang",

 "detail!shortName": "zjj普通",

 "productApplyRange_orgId": "2367785652474624",

 "unit_Name": "箱",

 "modelDescription": "234",

 "unit": 2367796577194240,

 "productApplyRangeId": 2367905038192896,

 "name": "zjj普通",

 "id": 2367905030770944,

 "productref_product_userDefine002": 2367794913333504,

 "detail!mnemonicCode": "zjjPT",

 "productref_product_userDefine001": "zjj-组织",

 "productref_product_userDefine004": "测试",

 "productApplyRange_orgId_Name": "zjj-组织",

 "productref_product_userDefine003": "2367785652474624"

 }, {

 "code": "073109",

 "rangeType": 1,

 "unit_Code": "002",

 "detail!shortName": "9501序列号物料",

 "productApplyRange_orgId": "2367785652474624",

 "unit_Name": "个",

 "unit": 2370280474218752,

 "productApplyRangeId": 2372068447113472,

 "name": "9501序列号物料",

 "id": 2372068444950784,

 "productref_product_userDefine002": 2367794913333504,

 "detail!mnemonicCode": "9501XLHWL",

 "productref_product_userDefine001": "zjj-组织",

 "productref_product_userDefine004": "测试",

 "productApplyRange_orgId_Name": "zjj-组织",

 "productref_product_userDefine003": "2367785652474624"

 }, {

 "code": "073110",

 "rangeType": 1,

 "unit_Code": "002",

 "detail!shortName": "zjj普通",

 "productApplyRange_orgId": "2367785652474624",

 "unit_Name": "个",

 "unit": 2370280474218752,

 "productApplyRangeId": 2380391338479872,

 "name": "固定换算物料wls",

 "id": 2380391334842624,

 "productref_product_userDefine002": 2367794913333504,

 "detail!mnemonicCode": "GDHSWLwls",

 "productref_product_userDefine001": "zjj-组织",

 "productref_product_userDefine004": "测试",

 "productApplyRange_orgId_Name": "zjj-组织",

 "productref_product_userDefine003": "2367785652474624"

 }, {

 "code": "073111",

 "rangeType": 1,

 "unit_Code": "002",

 "detail!shortName": "固定换算物料wls",

 "productApplyRange_orgId": "2367785652474624",

 "unit_Name": "个",

 "unit": 2370280474218752,

 "productApplyRangeId": 2380397117952256,

 "name": "固定换算物料wls12",

 "id": 2380397111611648,

 "productref_product_userDefine002": 2367789981765888,

 "detail!mnemonicCode": "GDHSWLwls12",

 "productref_product_userDefine001": "zjj-组织",

 "productref_product_userDefine004": "zjj物料分类",

 "productApplyRange_orgId_Name": "zjj-组织",

 "productref_product_userDefine003": "2367785652474624"

 }, {

 "code": "073112",

 "rangeType": 1,

 "unit_Code": "xiang",

 "detail!shortName": "zjj普通",

 "productApplyRange_orgId": "2367785652474624",

 "unit_Name": "箱",

 "modelDescription": "123",

 "unit": 2367796577194240,

 "productApplyRangeId": 2380403094638848,

 "name": "zjj普通12",

 "id": 2380403092017408,

 "productref_product_userDefine002": 2367794913333504,

 "detail!mnemonicCode": "zjjPT12",

 "productref_product_userDefine001": "zjj-组织",

 "productref_product_userDefine004": "测试",

 "productApplyRange_orgId_Name": "zjj-组织",

 "productref_product_userDefine003": "2367785652474624"

 }, {

 "code": "073113",

 "rangeType": 1,

 "unit_Code": "xiang",

 "detail!shortName": "zjj普通",

 "productApplyRange_orgId": "2367785652474624",

 "unit_Name": "箱",

 "unit": 2367796577194240,

 "productApplyRangeId": 2380405401997568,

 "name": "zjj普通123",

 "id": 2380405394592000,

 "productref_product_userDefine002": 2367794913333504,

 "detail!mnemonicCode": "zjjPT123",

 "productref_product_userDefine001": "zjj-组织",

 "productref_product_userDefine004": "测试",

 "productApplyRange_orgId_Name": "zjj-组织",

 "productref_product_userDefine003": "2367785652474624"

 }, {

 "code": "073115",

 "rangeType": 1,

 "unit_Code": "xiang",

 "detail!shortName": "zjj普通-5",

 "productApplyRange_orgId": "2367785652474624",

 "unit_Name": "箱",

 "unit": 2367796577194240,

 "productApplyRangeId": 2380521427259648,

 "name": "zjj普通-5",

 "id": 2380521424736512,

 "productref_product_userDefine002": 2367794913333504,

 "detail!mnemonicCode": "zjjPT-5",

 "productref_product_userDefine001": "zjj-组织",

 "productref_product_userDefine004": "测试",

 "productApplyRange_orgId_Name": "zjj-组织",

 "productref_product_userDefine003": "2367785652474624"

 }, {

 "code": "073116",

 "rangeType": 1,

 "unit_Code": "xiang",

 "detail!shortName": "zjj普通-6",

 "productApplyRange_orgId": "2367785652474624",

 "unit_Name": "箱",

 "modelDescription": "123",

 "unit": 2367796577194240,

 "productApplyRangeId": 2380535000830208,

 "name": "zjj普通-6",

 "model": "grgr",

 "id": 2380534997930240,

 "st_othinrecords_userDefine001": "grgr",

 "productref_product_userDefine002": 2367794913333504,

 "detail!mnemonicCode": "zjjPT-6",

 "productref_product_userDefine001": "zjj-组织",

 "productref_product_userDefine004": "测试",

 "productApplyRange_orgId_Name": "zjj-组织",

 "productref_product_userDefine003": "2367785652474624"

 }, {

 "code": "073117",

 "rangeType": 1,

 "unit_Code": "002",

 "detail!shortName": "普通物料117",

 "productApplyRange_orgId": "2367785652474624",

 "unit_Name": "个",

 "unit": 2370280474218752,

 "productApplyRangeId": 2380543462084864,

 "name": "普通物料117",

 "id": 2380543458873600,

 "productref_product_userDefine002": 2367794913333504,

 "detail!mnemonicCode": "PTWL117",

 "productref_product_userDefine001": "zjj-组织",

 "productref_product_userDefine004": "测试",

 "productApplyRange_orgId_Name": "zjj-组织",

 "productref_product_userDefine003": "2367785652474624"

 }],

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