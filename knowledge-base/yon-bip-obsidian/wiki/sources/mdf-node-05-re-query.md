---
title: "获取查询方案"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/05-re-query"
section: "MDF服务"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, MDF服务]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 获取查询方案

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/05-re-query | 所属：MDF服务

# [](#获取查询方案)获取查询方案

${domain.iuap-mdf-node}/client/getInitFilterInfo

## [](#1-接口说明)1. 接口说明

此接口用于获取查询方案相关信息。

## [](#2-接口类型)2. 接口类型

**GET**

## [](#3-请求参数)3. 请求参数

***/mdf-node/client/getInitFilterInfo?terminalType=1&filterId=2244441&billnum=st_othinrecord

## [](#4-参数说明)4. 参数说明

||**参数**||**是否可空**||**说明**|
||terminalType||否||端类型，1为PC端，3为APP端，2为触屏端|
||filterId||是||查询id|
||billnum||是||单据的billno|

## [](#5-请求头)5. 请求头

||**参数**||**是否可空**||**说明**|
||Domain-Key||否||领域前端编码|

## [](#6-返回结构)6. 返回结构

{

 "code": 200,

 "data": [{

 "code": 200,

 "message": "操作成功",

 "data": {

 "id": 2244441,

 "filterName": "ST_st_othinrecordlist",

 "filterDesc": "其他入库单过滤",

 "subId": "ST",

 "createTime": "2017-12-25 13:48:51",

 "isUpGrade": 0,

 "advanceSupport": 0,

 "behaviorObject": "ST/ST_st_othinrecordlist_filterVM.Extend.js",

 "dr": 0

 }

 },

 {

 "code": 200,

 "message": "操作成功",

 "data": [{

 "id": 122118427,

 "filtersId": 2244441,

 "solutionName": "默认方案",

 "solutionNameResid": "C_YS_PF_GZTTMP_0000198929",

 "isDefault": 1,

 "isPublic": 1,

 "orderId": 0,

 "terminalType": "1",

 "tenantId": 2364607263428864,

 "sysid": 2095183,

 "solutionNameMultiLang": {

 "zh_TW": "默認方案",

 "en_US": "Default Scheme",

 "zh_CN": "默认方案"

 },

 "cExtProps": "{\"isInitLoadData\":true}"

 }]

 },

 {

 "code": 200,

 "message": "操作成功",

 "data": {

 "Order": {

 "multiple": false,

 "OrderModel": []

 },

 "solutionName": "默认方案",

 "mddVersion": "304",

 "AdvanceModel": {},

 "CommonModel": [{

 "itemTitle": "单据编号",

 "orderId": 0,

 "refType": 0,

 "cRefId": 0,

 "cShowCaption": "单据编号",

 "ctrlType": "Input",

 "iType": 0,

 "multSelect": 0,

 "token": 0,

 "itemId": 2222398,

 "itemName": "code",

 "isCommon": 1,

 "rangeInput": 0,

 "compareLogic": "like",

 "itemTitleMultiLang": {

 "zh_TW": "單據編號",

 "en_US": "Doc No.",

 "zh_CN": "单据编号"

 }

 },

 {

 "itemTitle": "单据日期",

 "orderId": 1,

 "refType": 0,

 "cRefId": 0,

 "cShowCaption": "单据日期",

 "ctrlType": "DatePicker",

 "iType": 0,

 "multSelect": 0,

 "token": 0,

 "itemId": 2222399,

 "itemName": "vouchdate",

 "isCommon": 1,

 "rangeInput": 1,

 "compareLogic": "between",

 "itemTitleMultiLang": {

 "zh_TW": "單據日期",

 "en_US": "Doc Date",

 "zh_CN": "单据日期"

 }

 },

 {

 "itemTitle": "仓库",

 "orderId": 2,

 "refType": 0,

 "cRefId": 0,

 "cShowCaption": "仓库",

 "ctrlType": "refer",

 "iType": 0,

 "multSelect": 1,

 "token": 0,

 "itemId": 2222400,

 "itemName": "warehouse_name",

 "cRefType": "aa_warehouse",

 "isCommon": 1,

 "rangeInput": 0,

 "compareLogic": "in",

 "itemTitleMultiLang": {

 "zh_TW": "倉庫",

 "en_US": "Warehouse",

 "zh_CN": "仓库"

 }

 },

 {

 "itemTitle": "库存组织",

 "orderId": 3,

 "refType": 0,

 "cRefId": 0,

 "cShowCaption": "库存组织",

 "ctrlType": "Refer",

 "iType": 0,

 "multSelect": 1,

 "token": 0,

 "itemId": 599782056,

 "itemName": "org_id",

 "cRefType": "aa_orgstock",

 "isCommon": 1,

 "rangeInput": 0,

 "compareLogic": "in",

 "itemTitleMultiLang": {

 "zh_TW": "庫存組織",

 "en_US": "Inv Org",

 "zh_CN": "库存组织"

 }

 },

 {

 "itemTitle": "物料",

 "orderId": 4,

 "refType": 0,

 "cRefId": 0,

 "cShowCaption": "物料",

 "ctrlType": "Refer",

 "iType": 0,

 "multSelect": 1,

 "token": 0,

 "itemId": 113829991,

 "itemName": "product_cName",

 "cRefType": "aa_productsku",

 "isCommon": 1,

 "rangeInput": 0,

 "compareLogic": "in",

 "itemTitleMultiLang": {

 "zh_TW": "物料",

 "en_US": "Material",

 "zh_CN": "物料"

 }

 },

 {

 "itemTitle": "交易类型",

 "orderId": 5,

 "refType": 0,

 "cRefId": 0,

 "cShowCaption": "交易类型",

 "ctrlType": "refer",

 "iType": 0,

 "multSelect": 0,

 "token": 0,

 "cExtProps": "{\"bAutoflt\":false}",

 "itemId": 599789797,

 "itemName": "bustype",

 "cRefType": "transtype.bd_billtyperef",

 "isCommon": 1,

 "rangeInput": 0,

 "compareLogic": "eq",

 "itemTitleMultiLang": {

 "zh_TW": "交易類型",

 "en_US": "Transa. Type",

 "zh_CN": "交易类型"

 }

 },

 {

 "itemTitle": "物料分类",

 "orderId": 6,

 "refType": 0,

 "cRefId": 0,

 "cShowCaption": "物料分类",

 "ctrlType": "TreeRefer",

 "iType": 0,

 "multSelect": 1,

 "token": 0,

 "itemId": 113829992,

 "itemName": "product.productClass.name",

 "cRefType": "aa_productclass",

 "isCommon": 1,

 "rangeInput": 0,

 "compareLogic": "in",

 "itemTitleMultiLang": {

 "zh_TW": "物料分類",

 "en_US": "Matl Category",

 "zh_CN": "物料分类"

 }

 },

 {

 "itemTitle": "WMS转入状态",

 "value1": "",

 "orderId": 7,

 "refType": 0,

 "cRefId": 0,

 "cShowCaption": "WMS转入状态",

 "ctrlType": "tagbutton",

 "iType": 0,

 "multSelect": 0,

 "token": 0,

 "itemId": 599783467,

 "itemName": "wmsInStatus",

 "isCommon": 1,

 "rangeInput": 0,

 "compareLogic": "eq",

 "itemTitleMultiLang": {

 "zh_TW": "WMS轉入狀態",

 "en_US": "WMS Transfer-in Status",

 "zh_CN": "WMS转入状态"

 }

 },

 {

 "itemTitle": "WMS单号",

 "orderId": 8,

 "refType": 0,

 "cRefId": 0,

 "cShowCaption": "WMS单号",

 "ctrlType": "Input",

 "iType": 0,

 "multSelect": 0,

 "token": 0,

 "itemId": 599783468,

 "itemName": "wmsBillno",

 "isCommon": 1,

 "rangeInput": 0,

 "compareLogic": "like",

 "itemTitleMultiLang": {

 "zh_TW": "WMS單號",

 "en_US": "WMS Doc No.",

 "zh_CN": "WMS单号"

 }

 },

 {

 "itemTitle": "单据状态",

 "value1": "",

 "orderId": 9,

 "refType": 0,

 "cRefId": 0,

 "cShowCaption": "单据状态",

 "ctrlType": "tagbutton",

 "iType": 0,

 "multSelect": 0,

 "token": 0,

 "itemId": 599786930,

 "itemName": "status",

 "isCommon": 1,

 "rangeInput": 0,

 "compareLogic": "eq",

 "itemTitleMultiLang": {

 "zh_TW": "單據狀態",

 "en_US": "Doc Status",

 "zh_CN": "单据状态"

 }

 },

 {

 "itemTitle": "货主",

 "orderId": 10,

 "refType": 0,

 "cRefId": 0,

 "cShowCaption": "货主",

 "ctrlType": "Refer",

 "iType": 0,

 "multSelect": 1,

 "token": 0,

 "itemId": 599787716,

 "itemName": "inventoryowner",

 "cRefType": "aa_inventoryownerref",

 "isCommon": 1,

 "rangeInput": 0,

 "compareLogic": "in",

 "itemTitleMultiLang": {

 "zh_TW": "貨主",

 "en_US": "Owner",

 "zh_CN": "货主"

 }

 },

 {

 "itemTitle": "库管员",

 "orderId": 11,

 "refType": 0,

 "cRefId": 0,

 "cShowCaption": "库管员",

 "ctrlType": "refer",

 "iType": 0,

 "multSelect": 1,

 "token": 0,

 "itemId": 113829988,

 "itemName": "stockMgr_name",

 "cRefType": "ucf-staff-center.bd_staff_outer_ref",

 "isCommon": 1,

 "rangeInput": 0,

 "compareLogic": "in",

 "itemTitleMultiLang": {

 "zh_TW": "庫管員",

 "en_US": "Warehouse Keeper",

 "zh_CN": "库管员"

 }

 },

 {

 "itemTitle": "业务员",

 "orderId": 12,

 "refType": 0,

 "cRefId": 0,

 "cShowCaption": "业务员",

 "ctrlType": "refer",

 "iType": 0,

 "multSelect": 1,

 "token": 0,

 "itemId": 113829989,

 "itemName": "operator_name",

 "cRefType": "ucf-staff-center.bd_staff_outer_ref",

 "isCommon": 1,

 "rangeInput": 0,

 "compareLogic": "in",

 "itemTitleMultiLang": {

 "zh_TW": "業務員",

 "en_US": "Operator",

 "zh_CN": "业务员"

 }

 },

 {

 "itemTitle": "货权归属",

 "orderId": 13,

 "refType": 0,

 "cRefId": 0,

 "cShowCaption": "货权归属",

 "ctrlType": "Select",

 "iType": 0,

 "multSelect": 0,

 "token": 0,

 "cExtProps": "{\"bAutoflt\":true}",

 "itemId": 599787717,

 "itemName": "ownertype",

 "isCommon": 1,

 "rangeInput": 0,

 "compareLogic": "eq",

 "itemTitleMultiLang": {

 "zh_TW": "貨權歸屬",

 "en_US": "Freight Ownership",

 "zh_CN": "货权归属"

 }

 },

 {

 "itemTitle": "供应商",

 "orderId": 14,

 "refType": 0,

 "cRefId": 0,

 "cShowCaption": "供应商",

 "ctrlType": "refer",

 "iType": 0,

 "multSelect": 0,

 "token": 0,

 "itemId": 599787946,

 "itemName": "vendor_name",

 "cRefType": "yssupplier.aa_vendor",

 "isCommon": 1,

 "rangeInput": 0,

 "compareLogic": "eq",

 "itemTitleMultiLang": {

 "zh_TW": "供應商",

 "en_US": "Supplier",

 "zh_CN": "供应商"

 }

 }

 ],

 "isDefault": 1,

 "AllFilterModel": [{

 "filtersId": 2244441,

 "allowUpdateCompare": 0,

 "itemTitle": "单据编号",

 "precision": 0,

 "refType": 0,

 "cRefId": 0,

 "ctrlType": "Input",

 "multSelect": 0,

 "isMasterOrg": false,

 "itemName": "code",

 "isCommon": 0,

 "rangeInput": 0,

 "id": 2222398,

 "compareLogic": "like",

 "mustInput": 0,

 "cShowCaption": "单据编号",

 "bSelfDefine": false,

 "descValue": 0,

 "dataSource": "code",

 "isSys": 1

 },

 {

 "filtersId": 2244441,

 "allowUpdateCompare": 0,

 "itemTitle": "单据日期",

 "precision": 0,

 "refType": 0,

 "cRefId": 0,

 "ctrlType": "DatePicker",

 "cFormatData": "",

 "multSelect": 0,

 "isMasterOrg": false,

 "itemName": "vouchdate",

 "isCommon": 0,

 "rangeInput": 1,

 "id": 2222399,

 "compareLogic": "between",

 "mustInput": 0,

 "cShowCaption": "单据日期",

 "bSelfDefine": false,

 "descValue": 0,

 "dataSource": "vouchdate",

 "isSys": 1

 },

 {

 "filtersId": 2244441,

 "allowUpdateCompare": 0,

 "itemTitle": "仓库",

 "precision": 0,

 "refType": 0,

 "cRefId": 0,

 "ctrlType": "refer",

 "multSelect": 1,

 "isMasterOrg": false,

 "itemName": "warehouse_name",

 "isCommon": 0,

 "rangeInput": 0,

 "id": 2222400,

 "refReturn": "name",

 "compareLogic": "in",

 "mustInput": 0,

 "cShowCaption": "仓库",

 "bSelfDefine": false,

 "displayname": "name",

 "cRefType": "aa_warehouse",

 "descValue": 0,

 "dataSource": "warehouse.name",

 "isSys": 1

 },

 {

 "filtersId": 2244441,

 "allowUpdateCompare": 0,

 "itemTitle": "库管员",

 "precision": 0,

 "refType": 0,

 "cRefId": 0,

 "ctrlType": "refer",

 "multSelect": 1,

 "isMasterOrg": false,

 "itemName": "stockMgr_name",

 "isCommon": 0,

 "rangeInput": 0,

 "id": 113829988,

 "refReturn": "id",

 "compareLogic": "in",

 "mustInput": 0,

 "cShowCaption": "库管员",

 "bSelfDefine": false,

 "displayname": "name",

 "cRefType": "ucf-staff-center.bd_staff_outer_ref",

 "descValue": 0,

 "dataSource": "stockMgr",

 "isSys": 1

 },

 {

 "filtersId": 2244441,

 "allowUpdateCompare": 0,

 "itemTitle": "业务员",

 "precision": 0,

 "refType": 0,

 "cRefId": 0,

 "ctrlType": "refer",

 "multSelect": 1,

 "isMasterOrg": false,

 "itemName": "operator_name",

 "isCommon": 0,

 "rangeInput": 0,

 "id": 113829989,

 "refReturn": "id",

 "compareLogic": "in",

 "mustInput": 0,

 "cShowCaption": "业务员",

 "bSelfDefine": false,

 "displayname": "name",

 "cRefType": "ucf-staff-center.bd_staff_outer_ref",

 "descValue": 0,

 "dataSource": "operator",

 "isSys": 1

 },

 {

 "filtersId": 2244441,

 "allowUpdateCompare": 0,

 "itemTitle": "部门",

 "precision": 0,

 "refType": 0,

 "cRefId": 0,

 "ctrlType": "treerefer",

 "multSelect": 1,

 "isMasterOrg": false,

 "itemName": "department_name",

 "isCommon": 0,

 "rangeInput": 0,

 "id": 113829990,

 "refReturn": "id",

 "compareLogic": "in",

 "extendField": "{\"cStyle\":{\"filterTree\":\"true\"}}",

 "mustInput": 0,

 "cShowCaption": "部门",

 "bSelfDefine": false,

 "displayname": "name",

 "cRefType": "ucf-org-center.bd_admindepttreeviewref",

 "descValue": 0,

 "dataSource": "department",

 "isSys": 1

 },

 {

 "filtersId": 2244441,

 "allowUpdateCompare": 0,

 "itemTitle": "物料",

 "precision": 0,

 "refType": 0,

 "cRefId": 0,

 "ctrlType": "Refer",

 "multSelect": 1,

 "isMasterOrg": false,

 "itemName": "product_cName",

 "isCommon": 0,

 "rangeInput": 0,

 "id": 113829991,

 "refReturn": "id",

 "compareLogic": "in",

 "mustInput": 0,

 "cShowCaption": "物料",

 "bSelfDefine": false,

 "displayname": "cName",

 "cRefType": "aa_productsku",

 "descValue": 0,

 "dataSource": "othInRecords.product.id",

 "isSys": 1

 },

 {

 "filtersId": 2244441,

 "allowUpdateCompare": 0,

 "itemTitle": "物料分类",

 "precision": 0,

 "refType": 0,

 "cRefId": 0,

 "ctrlType": "TreeRefer",

 "multSelect": 1,

 "isMasterOrg": false,

 "itemName": "product.productClass.name",

 "isCommon": 0,

 "rangeInput": 0,

 "id": 113829992,

 "refReturn": "id",

 "compareLogic": "in",

 "mustInput": 0,

 "cShowCaption": "物料分类",

 "bSelfDefine": false,

 "displayname": "name",

 "cRefType": "aa_productclass",

 "descValue": 0,

 "dataSource": "othInRecords.product.manageClass",

 "isSys": 1

 },

 {

 "filtersId": 2244441,

 "allowUpdateCompare": 0,

 "itemTitle": "库存组织",

 "precision": 0,

 "refType": 0,

 "cRefId": 0,

 "ctrlType": "Refer",

 "multSelect": 1,

 "isMasterOrg": true,

 "itemName": "org_id",

 "isCommon": 0,

 "rangeInput": 0,

 "id": 599782056,

 "refReturn": "id",

 "compareLogic": "in",

 "mustInput": 0,

 "cShowCaption": "库存组织",

 "bSelfDefine": false,

 "displayname": "name",

 "cRefType": "aa_orgstock",

 "descValue": 0,

 "dataSource": "org",

 "isSys": 1

 },

 {

 "filtersId": 2244441,

 "allowUpdateCompare": 0,

 "itemTitle": "WMS转入状态",

 "autoFlt": true,

 "precision": 0,

 "refType": 0,

 "cRefId": 0,

 "ctrlType": "tagbutton",

 "multSelect": 0,

 "isMasterOrg": false,

 "itemName": "wmsInStatus",

 "bAutoFlt": true,

 "isCommon": 0,

 "rangeInput": 0,

 "id": 599783467,

 "enumArray": "[\n {\n \"nameType\": \"text\",\n \"icon\": null,\n \"cDataRule\": null,\n \"value\": \"转入中\",\n \"resid\": \"P_YS_SD_SDOC-UI_0000170549\",\n \"key\": \"1\"\n },\n {\n \"nameType\": \"text\",\n \"icon\": null,\n \"cDataRule\": null,\n \"value\": \"已回传\",\n \"resid\": \"P_YS_SCM_USTOCK-UI_0001289122\",\n \"key\": \"4\"\n },\n {\n \"nameType\": \"text\",\n \"icon\": null,\n \"cDataRule\": null,\n \"value\": \"未转入\",\n \"resid\": \"P_YS_SD_SDOC-UI_0000170352\",\n \"key\": \"0\"\n },\n {\n \"nameType\": \"text\",\n \"icon\": null,\n \"cDataRule\": null,\n \"value\": \"转入成功\",\n \"resid\": \"P_YS_SD_SDOC-UI_0000170551\",\n \"key\": \"2\"\n },\n {\n \"nameType\": \"text\",\n \"icon\": null,\n \"cDataRule\": null,\n \"value\": \"转入失败\",\n \"resid\": \"P_YS_SD_SDOC-UI_0000170550\",\n \"key\": \"3\"\n }\n]",

 "compareLogic": "eq",

 "extendField": "{\"cols\":1}",

 "mustInput": 0,

 "cShowCaption": "WMS转入状态",

 "bSelfDefine": false,

 "descValue": 0,

 "bAutoflt": true,

 "dataSource": "wmsInStatus",

 "isSys": 1,

 "enumString": "{\n \"1\": \"转入中\",\n \"4\": \"已回传\",\n \"0\": \"未转入\",\n \"2\": \"转入成功\",\n \"3\": \"转入失败\"\n}"

 },

 {

 "filtersId": 2244441,

 "allowUpdateCompare": 0,

 "itemTitle": "WMS单号",

 "precision": 0,

 "refType": 0,

 "cRefId": 0,

 "ctrlType": "Input",

 "multSelect": 0,

 "isMasterOrg": false,

 "itemName": "wmsBillno",

 "isCommon": 0,

 "rangeInput": 0,

 "id": 599783468,

 "compareLogic": "like",

 "mustInput": 0,

 "cShowCaption": "WMS单号",

 "bSelfDefine": false,

 "descValue": 0,

 "dataSource": "wmsBillno",

 "isSys": 1

 },

 {

 "filtersId": 2244441,

 "allowUpdateCompare": 0,

 "itemTitle": "单据状态",

 "autoFlt": true,

 "precision": 0,

 "refType": 0,

 "cRefId": 0,

 "ctrlType": "tagbutton",

 "multSelect": 0,

 "isMasterOrg": false,

 "itemName": "status",

 "bAutoFlt": true,

 "isCommon": 1,

 "rangeInput": 0,

 "id": 599786930,

 "enumArray": "[\n {\n \"nameType\": \"text\",\n \"icon\": null,\n \"cDataRule\": null,\n \"value\": \"开立\",\n \"resid\": \"P_YS_SCM_PU_0000028170\",\n \"key\": \"0\"\n },\n {\n \"nameType\": \"text\",\n \"icon\": null,\n \"cDataRule\": null,\n \"value\": \"审核中\",\n \"resid\": \"P_YS_SCM_PU_0000028406\",\n \"key\": \"3\"\n },\n {\n \"nameType\": \"text\",\n \"icon\": null,\n \"cDataRule\": null,\n \"value\": \"已审核\",\n \"resid\": \"P_YS_SCM_PU_0000028093\",\n \"key\": \"1\"\n }\n]",

 "compareLogic": "eq",

 "extendField": "{\"cols\":1}",

 "mustInput": 0,

 "cShowCaption": "单据状态",

 "bSelfDefine": false,

 "descValue": 0,

 "bAutoflt": true,

 "dataSource": "status",

 "isSys": 1,

 "enumString": "{\n \"0\": \"开立\",\n \"3\": \"审核中\",\n \"1\": \"已审核\"\n}"

 },

 {

 "filtersId": 2244441,

 "allowUpdateCompare": 0,

 "itemTitle": "货主",

 "precision": 0,

 "refType": 0,

 "cRefId": 0,

 "ctrlType": "Refer",

 "multSelect": 1,

 "isMasterOrg": false,

 "itemName": "inventoryowner",

 "isCommon": 0,

 "rangeInput": 0,

 "id": 599787716,

 "refReturn": "id",

 "compareLogic": "in",

 "mustInput": 0,

 "cShowCaption": "货主",

 "bSelfDefine": false,

 "displayname": "name",

 "cRefType": "aa_inventoryownerref",

 "descValue": 0,

 "dataSource": "othInRecords.inventoryowner",

 "isSys": 1

 },

 {

 "filtersId": 2244441,

 "allowUpdateCompare": 0,

 "itemTitle": "货权归属",

 "precision": 0,

 "refType": 0,

 "cRefId": 0,

 "ctrlType": "Select",

 "multSelect": 0,

 "isMasterOrg": false,

 "itemName": "ownertype",

 "isCommon": 0,

 "rangeInput": 0,

 "id": 599787717,

 "enumArray": "[\n {\n \"nameType\": \"text\",\n \"icon\": null,\n \"cDataRule\": null,\n \"value\": \"自有\",\n \"resid\": \"P_YS_SCM_USTOCK-UI_0001083443\",\n \"key\": \"0\"\n },\n {\n \"nameType\": \"text\",\n \"icon\": null,\n \"cDataRule\": null,\n \"value\": \"供应商\",\n \"resid\": \"P_YS_PF_GZTSYS_0000012772\",\n \"key\": \"1\"\n }\n]",

 "compareLogic": "eq",

 "mustInput": 0,

 "cShowCaption": "货权归属",

 "bSelfDefine": false,

 "descValue": 0,

 "dataSource": "othInRecords.ownertype",

 "isSys": 1,

 "enumString": "{\n \"0\": \"自有\",\n \"1\": \"供应商\"\n}"

 },

 {

 "filtersId": 2244441,

 "allowUpdateCompare": 0,

 "itemTitle": "供应商",

 "precision": 0,

 "refType": 0,

 "cRefId": 0,

 "ctrlType": "refer",

 "multSelect": 0,

 "isMasterOrg": false,

 "itemName": "vendor_name",

 "isCommon": 0,

 "rangeInput": 0,

 "id": 599787946,

 "refReturn": "id",

 "compareLogic": "eq",

 "mustInput": 0,

 "cShowCaption": "供应商",

 "bSelfDefine": false,

 "displayname": "name",

 "cRefType": "yssupplier.aa_vendor",

 "descValue": 0,

 "dataSource": "vendor",

 "isSys": 1

 },

 {

 "filtersId": 2244441,

 "allowUpdateCompare": 0,

 "itemTitle": "交易类型",

 "precision": 0,

 "refType": 0,

 "cRefId": 0,

 "ctrlType": "refer",

 "multSelect": 0,

 "isMasterOrg": false,

 "itemName": "bustype",

 "isCommon": 0,

 "rangeInput": 0,

 "id": 599789797,

 "refReturn": "id",

 "compareLogic": "eq",

 "mustInput": 0,

 "cShowCaption": "交易类型",

 "bSelfDefine": false,

 "displayname": "name",

 "cRefType": "transtype.bd_billtyperef",

 "descValue": 0,

 "dataSource": "bustype",

 "isSys": 1

 }

 ],

 "isPublic": 1,

 "enableNavFromRefType": true,

 "id": 122118427,

 "solutionNameMultiLang": {

 "zh_TW": "默認方案",

 "en_US": "Default Scheme",

 "zh_CN": "默认方案"

 },

 "isInitLoadData": true,

 "isSys": false

 }

 }

 ]

}

## [](#7-返回参数说明)7. 返回参数说明

||**参数**||**是否可空**||**说明**|
||data[0]||否||过滤条件相关信息，对应数据库中的pb_meta_filters|
||data[1]||否||查询方案相关信息|
||data[2]||否||具体查询方案及查询条件信息|