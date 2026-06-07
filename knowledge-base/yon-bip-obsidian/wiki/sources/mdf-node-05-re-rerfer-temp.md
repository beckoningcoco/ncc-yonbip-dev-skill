---
title: "获取参照模板"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/05-re-rerfer-temp"
section: "MDF服务"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, MDF服务]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 获取参照模板

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/05-re-rerfer-temp | 所属：MDF服务

# [](#获取参照模板)获取参照模板

${domain.iuap-mdf-node}/pub/ref/getRefMeta

## [](#1-接口说明)1. 接口说明

此接口用于获取参照的模型相关信息

## [](#2-接口类型)2. 接口类型

**GET**

## [](#3-请求参数)3. 请求参数

***/mdf-node/uniform/pub/ref/getRefMeta?terminalType=1&refCode=aa_orgstock

## [](#4-参数说明)4. 参数说明

||**参数**||**是否可空**||**说明**|
||terminalType||否||端类型,1为PC端，3为APP端，2为触屏端|
||refCode||否||*参照编码*|

## [](#5-返回结构)5. 返回结构

{

 "code": 200,

 "message": "操作成功",

 "data": {

 "refEntity": {

 "id": 111216,

 "code": "aa_orgstock",

 "name": "库存组织",

 "name_resid": "P_YS_FED_FW_0000022291",

 "description": "库存组织",

 "refType": "aa_orgstock",

 "isOrgRel": false,

 "datasourceType": "meta",

 "cBillnum": "aa_orgstockref",

 "cSub_ID": "AA",

 "cEntityKeyFld": "code",

 "cTpltype": "Table",

 "cEntityNameFld": "name",

 "cRetFld": "code",

 "bMultiSel": false,

 "cRefFilterSql": "0",

 "bAuth": false,

 "cCheckFlds": "code,name",

 "bPage": false,

 "clsName": "name",

 "cDataGrid_FullName": "aa.baseorg.InventoryOrgMV",

 "cDataGrid_classFk": "id",

 "cDataClass_FullName": "aa.baseorg.InventoryOrgMV",

 "cDataClass_RefClsName": "code",

 "bDataClass_Rule": false,

 "bDataClass_RetEndData": false,

 "cDataClass_lsCode": "code",

 "cDataClass_lsName": "name",

 "cDataClass_sortField": "code",

 "extendField": "{\"placeholder\":\"编码/名称\",\"placeholder_ori\":\"编码/名称\"}",

 "domain": "ucf-org-center",

 "supportConfigCheckFlds": true

 },

 "gridMeta": {

 "viewmodel": {

 "iBillId": 1002398416,

 "cBillName": "库存组织参照",

 "cName_resid": "P_YS_PF_BD-UI_0000157807",

 "cBillNo": "aa_orgstockref",

 "bPrintLimited": true,

 "cBillType": "ArchiveList",

 "cSubId": "AA",

 "bBatchOperate": true,

 "entities": [{

 "cCode": "aa_orgstockref",

 "cEntityName": "库存组织",

 "cEntityNameResid": "P_YS_FED_FW_0000022291",

 "cType": "Bill",

 "cDataSourceName": "aa.baseorg.InventoryOrgMV",

 "cPrimaryKey": "id",

 "iBillEntityId": 3857554,

 "bMain": true,

 "cControlType": "Table",

 "fields": [{

 "cFieldName": "org.code",

 "fieldRuntimeState": false,

 "cItemName": "code",

 "cCaption": "组织编码",

 "cCaptionResid": "P_YS_HR_HRCOREF_0000058481",

 "cShowCaption": "组织编码",

 "cShowCaptionResid": "P_YS_HR_HRCOREF_0000058481",

 "iBillEntityId": 3857554,

 "iBillTplGroupId": 19485230,

 "iTplId": 2197404,

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 255,

 "iColWidth": 255,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "bIsNull": false,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cOrder": "asc",

 "bCheck": true,

 "cTplGroupName": "组织档案左树",

 "bMain": true,

 "cDataSourceName": "aa.baseorg.InventoryOrgMV",

 "cControlType": "Input",

 "cStyle": "{\"fileType\":\"image\",\"maxQuantity\":\"5\"}",

 "bVmExclude": 0,

 "multiple": false,

 "iOrder": 1,

 "isshoprelated": false,

 "iSystem": 1,

 "authLevel": 3,

 "isExport": true,

 "uncopyable": false,

 "isMasterOrg": false,

 "iAlign": 1,

 "bEnableFormat": false,

 "id": 16812

 }, {

 "cFieldName": "org.name",

 "fieldRuntimeState": false,

 "cItemName": "name",

 "cCaption": "组织名称",

 "cCaptionResid": "P_YS_FED_UCFORG_0000031965",

 "cShowCaption": "组织名称",

 "cShowCaptionResid": "P_YS_FED_UCFORG_0000031965",

 "iBillEntityId": 3857554,

 "iBillTplGroupId": 19485230,

 "iTplId": 2197404,

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 255,

 "iColWidth": 255,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "bIsNull": false,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cTplGroupName": "组织档案左树",

 "bMain": true,

 "cDataSourceName": "aa.baseorg.InventoryOrgMV",

 "cControlType": "Input",

 "cStyle": "{\"fileType\":\"image\",\"maxQuantity\":\"5\"}",

 "bVmExclude": 0,

 "multiple": false,

 "iOrder": 2,

 "isshoprelated": false,

 "iSystem": 1,

 "authLevel": 3,

 "isExport": true,

 "uncopyable": false,

 "isMasterOrg": false,

 "iAlign": 1,

 "bEnableFormat": false,

 "id": 16814

 }, {

 "cFieldName": "finorgid",

 "fieldRuntimeState": false,

 "cItemName": "finorgid",

 "cCaption": "会计主体",

 "cCaptionResid": "P_YS_FED_FW_0000022114",

 "cShowCaption": "上级组织",

 "cShowCaptionResid": "P_YS_PF_GZTTMP_0000073635",

 "iBillEntityId": 3857554,

 "iBillTplGroupId": 19485230,

 "iTplId": 2197404,

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": false,

 "bHidden": true,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 255,

 "iColWidth": 255,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cTplGroupName": "组织档案左树",

 "bMain": true,

 "cDataSourceName": "aa.baseorg.InventoryOrgMV",

 "cControlType": "Input",

 "cStyle": "{\"fileType\":\"image\",\"maxQuantity\":\"5\"}",

 "bVmExclude": 0,

 "multiple": false,

 "iOrder": 3,

 "isshoprelated": false,

 "iSystem": 1,

 "authLevel": 3,

 "isExport": false,

 "uncopyable": false,

 "isMasterOrg": false,

 "iAlign": 1,

 "bEnableFormat": false,

 "id": 16816

 }, {

 "cFieldName": "finorgid.org.code",

 "fieldRuntimeState": false,

 "cItemName": "finorg_code",

 "cCaption": "会计主体编码",

 "cCaptionResid": "P_YS_FI_IA_0000054970",

 "cShowCaption": "上级组织编码",

 "cShowCaptionResid": "P_YS_PF_PC-UI_0000159802",

 "iBillEntityId": 3857554,

 "iBillTplGroupId": 19485230,

 "iTplId": 2197404,

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": false,

 "bHidden": true,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 255,

 "iColWidth": 255,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cTplGroupName": "组织档案左树",

 "bMain": true,

 "cDataSourceName": "aa.baseorg.InventoryOrgMV",

 "cControlType": "Refer",

 "refReturn": "code",

 "cStyle": "{\"fileType\":\"image\",\"maxQuantity\":\"5\"}",

 "bVmExclude": 0,

 "multiple": false,

 "iOrder": 4,

 "isshoprelated": false,

 "iSystem": 1,

 "authLevel": 3,

 "isExport": false,

 "uncopyable": false,

 "isMasterOrg": false,

 "iAlign": 1,

 "bEnableFormat": false,

 "id": 16818

 }, {

 "cFieldName": "finorgid.org.name",

 "fieldRuntimeState": false,

 "cItemName": "finorg_name",

 "cCaption": "会计主体名称",

 "cCaptionResid": "P_YS_FI_IA_0000054979",

 "cShowCaption": "上级组织编码",

 "cShowCaptionResid": "P_YS_PF_PC-UI_0000159802",

 "iBillEntityId": 3857554,

 "iBillTplGroupId": 19485230,

 "iTplId": 2197404,

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": false,

 "bHidden": true,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 255,

 "iColWidth": 255,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cTplGroupName": "组织档案左树",

 "bMain": true,

 "cDataSourceName": "aa.baseorg.InventoryOrgMV",

 "cControlType": "Refer",

 "refReturn": "code",

 "cStyle": "{\"fileType\":\"image\",\"maxQuantity\":\"5\"}",

 "bVmExclude": 0,

 "multiple": false,

 "iOrder": 4,

 "isshoprelated": false,

 "iSystem": 1,

 "authLevel": 3,

 "isExport": false,

 "uncopyable": false,

 "isMasterOrg": false,

 "iAlign": 1,

 "bEnableFormat": false,

 "id": 16820

 }, {

 "cFieldName": "id",

 "fieldRuntimeState": false,

 "cItemName": "id",

 "cCaption": "ID",

 "cShowCaption": "ID",

 "iBillEntityId": 3857554,

 "iBillTplGroupId": 19485230,

 "iTplId": 2197404,

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": true,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 255,

 "iColWidth": 255,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cTplGroupName": "组织档案左树",

 "bMain": true,

 "cDataSourceName": "aa.baseorg.InventoryOrgMV",

 "cControlType": "Input",

 "cStyle": "{\"fileType\":\"image\",\"maxQuantity\":\"5\"}",

 "bVmExclude": 0,

 "multiple": false,

 "iOrder": 14,

 "isshoprelated": false,

 "iSystem": 1,

 "authLevel": 3,

 "isExport": true,

 "uncopyable": false,

 "isMasterOrg": false,

 "iAlign": 1,

 "bEnableFormat": false,

 "id": 16822

 }],

 "isTplExport": true

 }, {

 "cEntityName": "Toolbar",

 "cType": "Toolbar",

 "bMain": true,

 "fields": [{

 "fieldRuntimeState": false,

 "cItemName": "btnBillsetting",

 "cCaption": "UI模板",

 "cCaptionResid": "P_YS_PF_GZTSYS_0000013482",

 "cShowCaption": "UI模板",

 "cShowCaptionResid": "P_YS_PF_GZTSYS_0000013482",

 "bEnum": false,

 "cControlType": "button",

 "iStyle": 0,

 "cCommand": "cmdBillsetting",

 "bVmExclude": 0,

 "iOrder": 0,

 "uncopyable": false,

 "bEnableFormat": false,

 "key": "673152087"

 }, {

 "fieldRuntimeState": false,

 "cItemName": "btnShortCutsHelp",

 "cCaption": "快捷键帮助",

 "cCaptionResid": "P_YS_FW-PUB_MDD-BACK_0001345842",

 "cShowCaption": "快捷键帮助",

 "cShowCaptionResid": "P_YS_FW-PUB_MDD-BACK_0001345842",

 "bEnum": false,

 "cControlType": "button",

 "iStyle": 0,

 "cCommand": "cmdShortCutsHelp",

 "bVmExclude": 0,

 "iOrder": 0,

 "uncopyable": false,

 "bEnableFormat": false,

 "key": "1849710490220545"

 }, {

 "fieldRuntimeState": false,

 "cItemName": "btnReviewEventLog",

 "cCaption": "事件中心联查",

 "cCaptionResid": "P_YS_FW-PUB_MDD-BACK_0001523514",

 "cShowCaption": "事件中心联查",

 "cShowCaptionResid": "P_YS_FW-PUB_MDD-BACK_0001523514",

 "bEnum": false,

 "cControlType": "button",

 "iStyle": 0,

 "cCommand": "cmdReviewEventLog",

 "bVmExclude": 0,

 "iOrder": 0,

 "uncopyable": false,

 "bEnableFormat": false,

 "key": "1849710501849919"

 }],

 "key": "Entity.ViewModel.Toolbar",

 "parentKey": "Entity.ViewModel.Toolbar"

 }],

 "actions": [{

 "cCommand": "cmdShortCutsHelp",

 "cAction": "shortcutshelp",

 "cHttpMethod": "POST"

 }, {

 "cCommand": "cmdBillsetting",

 "cAction": "billsetting",

 "cSvcUrl": "/bill/billsetting",

 "cHttpMethod": "POST"

 }, {

 "cCommand": "cmdReviewEventLog",

 "cAction": "revieweventlog",

 "cHttpMethod": "POST"

 }],

 "isCoded": false,

 "pubts": "2022-05-07 19:04:39",

 "enumVersion": 8159,

 "supportTimeline": false,

 "defTplId": 2197404

 },

 "viewApplication": {

 "billid": 1002398416,

 "cBillName": "库存组织参照",

 "cBillNameResid": "P_YS_PF_BD-UI_0000157807",

 "bPrintLimited": true,

 "cBillType": "ArchiveList",

 "cBillNo": "aa_orgstockref",

 "bAllowMultiTpl": true,

 "cSubId": "AA",

 "cCardKey": "aa_orgstockref",

 "view": {

 "iTplId": 2197404,

 "cTemplateName": "组织档案",

 "cTemplateNameResid": "P_YS_PF_GZTTMP_0000075233",

 "iTplMode": 0,

 "iWidth": 10000,

 "cTemplateTitle": "组织",

 "cTitle_resid": "P_YS_PF_GZTSYS_0000012499",

 "containers": [{

 "groupId": 673152087,

 "cName": "commonToolbar",

 "iOrder": 0,

 "cDataSourceName": "Toolbar",

 "cControlType": "Toolbar",

 "cGroupCode": "commonToolbar",

 "cAlign": "top",

 "iCols": 0,

 "cStyle": "{\"type\":\"common\"}",

 "controls": [{

 "cItemName": "btnBillsetting",

 "cCaption": "UI模板",

 "cCaptionResid": "P_YS_PF_GZTSYS_0000013482",

 "cShowCaption": "UI模板",

 "cShowCaptionResid": "P_YS_PF_GZTSYS_0000013482",

 "bEnum": false,

 "cControlType": "button",

 "iOrder": 4,

 "iStyle": 0,

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.673152087"

 }, {

 "icon": "kuaijiejianbangzhu",

 "cItemName": "btnShortCutsHelp",

 "cCaption": "快捷键帮助",

 "cCaptionResid": "P_YS_FW-PUB_MDD-BACK_0001345842",

 "cShowCaption": "快捷键帮助",

 "cShowCaptionResid": "P_YS_FW-PUB_MDD-BACK_0001345842",

 "bEnum": false,

 "cControlType": "button",

 "iOrder": 5,

 "iStyle": 0,

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710490220545"

 }, {

 "icon": "tongzhi",

 "cItemName": "btnReviewEventLog",

 "cCaption": "事件中心联查",

 "cCaptionResid": "P_YS_FW-PUB_MDD-BACK_0001523514",

 "cShowCaption": "事件中心联查",

 "cShowCaptionResid": "P_YS_FW-PUB_MDD-BACK_0001523514",

 "bEnum": false,

 "cControlType": "button",

 "iOrder": 10,

 "iStyle": 0,

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710501849919"

 }],

 "key": "ContainerToolbarcommonToolbar",

 "parentKey": "commonToolbar"

 }, {

 "groupId": 19485230,

 "cName": "组织档案左树",

 "cNameResid": "P_YS_PF_PC-UI_0000160600",

 "iOrder": 10,

 "bMain": true,

 "cCode": "aa_orgstockref",

 "cDataSourceName": "aa.baseorg.InventoryOrgMV",

 "cControlType": "Table",

 "cGroupCode": "aa_orgtree_tree",

 "cAlign": "center",

 "iCols": 0,

 "controls": [{

 "cItemName": "code",

 "cCaption": "组织编码",

 "cCaptionResid": "P_YS_HR_HRCOREF_0000058481",

 "cShowCaption": "组织编码",

 "cShowCaptionResid": "P_YS_HR_HRCOREF_0000058481",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 255,

 "iColWidth": 255,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "bIsNull": false,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "Input",

 "iOrder": 1,

 "cOrder": "asc",

 "bMain": true,

 "cStyle": "{\"fileType\":\"image\",\"maxQuantity\":\"5\"}",

 "id": 16812,

 "bVmExclude": 0,

 "iBillTplGroupId": 19485230,

 "iBillId": 1002398416,

 "iBillEntityId": 3857554,

 "iTplId": 2197404,

 "cSubId": "AA",

 "iSystem": 1,

 "cName": "code",

 "cFieldName": "org.code",

 "authLevel": 3,

 "cDataSourceName": "aa.baseorg.InventoryOrgMV",

 "enterDirection": 4,

 "bEnableFormat": false

 }, {

 "cItemName": "name",

 "cCaption": "组织名称",

 "cCaptionResid": "P_YS_FED_UCFORG_0000031965",

 "cShowCaption": "组织名称",

 "cShowCaptionResid": "P_YS_FED_UCFORG_0000031965",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 255,

 "iColWidth": 255,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "bIsNull": false,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "Input",

 "iOrder": 2,

 "bMain": true,

 "cStyle": "{\"fileType\":\"image\",\"maxQuantity\":\"5\"}",

 "id": 16814,

 "bVmExclude": 0,

 "iBillTplGroupId": 19485230,

 "iBillId": 1002398416,

 "iBillEntityId": 3857554,

 "iTplId": 2197404,

 "cSubId": "AA",

 "iSystem": 1,

 "cName": "name",

 "cFieldName": "org.name",

 "authLevel": 3,

 "cDataSourceName": "aa.baseorg.InventoryOrgMV",

 "enterDirection": 4,

 "bEnableFormat": false

 }],

 "iBillEntityId": 3857554

 }],

 "sysFlag": 1

 },

 "extscripturls": [],

 "isCoded": false,

 "bFuncAuthControl": false,

 "pubts": "2022-05-07 19:04:39"

 }

 }

 }

}

## [](#6-返回参数说明)6. 返回参数说明

||**参数**||**是否可空**||**说明**|
||refEntity||否||实体相关信息模板id|
||gridMeta||否||viewmodel为参照的模型，viewApplication为参照的页面view|