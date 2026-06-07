---
title: "卡片导航"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/06-kapiandaohang"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 卡片导航

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/06-kapiandaohang | 所属：指南

# [](#anchor-卡片导航)Anchor 卡片导航

## [](#1-效果图)1. 效果图

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kapiandaohangimage1.0ed1472f.png)

## [](#2-基本属性)2. 基本属性

cControlType - 组件类型

||左侧组件名称||组件含义||值类型||组件说明|
||table||左侧导航区为table类型||string||"cControlType": "table" 表格类型|
||htmlcontent||标题配置||string||"cControlType": "htmlcontent"|

## [](#3-cstyle属性配置)3. cStyle属性配置

table的cStyle中配置

||属性名称||属性含义||值类型||属性说明|
||cardNav||是否是卡片导航||boolean||true开启，false不开启（默认）|
||cardNavClass||自定义卡片导航类名||string||自定义className，领域写扩展样式|
||cardNavLen||显示的条数||number||显示的个数|

内容区cControltype为item的cStyle配置

||属性名称||属性含义||值类型||属性说明|
||className||自定义样式名称||string||自定义className，领域写扩展样式|
||widthCol2||内容两列展示||string||内容区可以配置一行显示2个字段，默认一行展示一个字段|

简版toolbar展示在cControltype为Toolbar组件的 cExtProps配置
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kapiandaohangimage2.231adb9e.png)

||属性名称||属性含义||值类型||属性说明|
||simpleToolbar||是否显示简版toolbar||boolean||true开启，false不开启（默认）|
||residentButton||展示在下拉外的常驻按钮||boolean||true开启，false不开启|

## [](#4-数据结构)4. 数据结构

### [](#41-业务数据)4.1. 业务数据

列表默认取list接口的数据，可以通过setDataSource设置

### [](#42-模板数据)4.2. 模板数据

{

 "groupId": 10142897,

 "cName": "表格",

 "iOrder": 40,

 "bMain": false,

 "cCode": "wj02_1554681619056951303",

 "cDataSourceName": "GT14530AT5.GT14530AT5.wj02",

 "cControlType": "table",

 "cStyle": "{\"cardNavClass\":\"cardNavTable\",\"cardNav\":true}",

 "cGroupCode": "5185f4bcf2cc4aea9e69be5930e50b79",

 "cAlign": "right",

 "iCols": 0,

 "containers": [{

 "groupId": 10092574,

 "cName": "SinpleTableTable",

 "iOrder": 50,

 "cCode": "SinpleTableTable",

 "cDataSourceName": "Toolbar",

 "cControlType": "Toolbar",

 "cGroupCode": "SinpleTableTable",

 "cAlign": "top",

 "iCols": 0,

 "key": "ContainerToolbarSinpleTableTable",

 "cExtProps": "{\"ytenant_id\":\"0000KWEB7NON92GMJ40000\",\"cName\":\"SinpleTableTable\",\"ismain\":true}",

 "ytenant_id": "0000KWEB7NON92GMJ40000",

 "ismain": true

 }, {

 "groupId": "1456804640021545065",

 "parentId": 4625009,

 "cName": "工作台卡片区",

 "iOrder": 4,

 "bMain": true,

 "cControlType": "listcard",

 "cGroupCode": "ListCard",

 "cAlign": "bottom",

 "iCols": 0,

 "cStyle": "{\"actionBtnShowNum\": 4}",

 "containers": [{

 "groupId": "1456804640021545068",

 "parentId": "1456804640021545065",

 "cName": "工作台卡片区标题",

 "iOrder": 5,

 "bMain": true,

 "cCode": "saa_myequip_pull_head",

 "cDataSourceName": "aim.equip.EquipHeadVO",

 "cControlType": "listcardtop",

 "cGroupCode": "ListCardTop",

 "cAlign": "bottom",

 "iCols": 0,

 "controls": [{

 "cItemName": "pk_temp",

 "cCaption": "模板",

 "cShowCaption": "模板",

 "iMaxLength": 36,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bCanModify": true,

 "iMaxShowLen": 255,

 "iColWidth": 150,

 "iAlign": 1,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 240,

 "bIsNull": true,

 "bPrintCaption": true,

 "cControlType": "listtoptitle",

 "iOrder": 1002,

 "bMain": true,

 "id": "1456804640021545607",

 "bVmExclude": 0,

 "iBillTplGroupId": "1456804640021545068",

 "iBillId": 692408,

 "iBillEntityId": 940176,

 "iTplId": 694070,

 "cSubId": "saa",

 "iSystem": 1,

 "cName": "pk_temp",

 "cFieldName": "pk_temp",

 "authLevel": 3,

 "cDataSourceName": "aim.equip.EquipHeadVO",

 "enterDirection": 4,

 "bEnableFormat": false

 }, {

 "cFieldName": "new1",

 "fieldRuntimeState": false,

 "cItemName": "new1",

 "cCaption": "当前的时间状态",

 "cShowCaption": "当前的时间状态",

 "iBillTplGroupId": 10142890,

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cDataSourceName": "GT14530AT5.GT14530AT5.wj02",

 "cControlType": "listtopflag",

 "icon": "zuidahua1",

 "bVmExclude": 0,

 "iOrder": 190,

 "isshoprelated": false,

 "iSystem": 1,

 "isExport": true,

 "uncopyable": false,

 "iAlign": 1,

 "bEnableFormat": false,

 "key": "Field102423695",

 "cExtProps": "{\"ytenant_id\":\"0000KWEB7NON92GMJ40000\",\"sysFlag\":0}",

 "ytenant_id": "0000KWEB7NON92GMJ40000",

 "sysFlag": 0,

 "cStyle": "{\"className\":\"extendFlag\"}",

 }],

 "iBillEntityId": 940176,

 "cExtProps": "{\"uiDesignHidden\":\"true\"}",

 "uiDesignHidden": "true"

 }, {

 "groupId": "1456804640021545071",

 "parentId": "1456804640021545065",

 "cName": "工作台卡片区内容",

 "iOrder": 6,

 "bMain": true,

 "cControlType": "listcardcontent",

 "cGroupCode": "ListCardContent",

 "cAlign": "bottom",

 "iCols": 0,

 "containers": [{

 "groupId": "1456804640021545074",

 "parentId": "1456804640021545071",

 "cName": "content",

 "iOrder": 7,

 "bMain": true,

 "cCode": "saa_myequip_pull_head",

 "cDataSourceName": "aim.equip.EquipHeadVO",

 "cControlType": "listcardcontentitem",

 "cGroupCode": "content",

 "cAlign": "bottom",

 "iCols": 0,

 "controls": [{

 "cItemName": "version",

 "cCaption": "版本",

 "cCaptionResid": "P_YS_FED_EXAMP_0000020286",

 "cShowCaption": "版本",

 "cShowCaptionResid": "P_YS_FED_EXAMP_0000020286",

 "iMaxLength": 36,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bCanModify": true,

 "iMaxShowLen": 255,

 "iColWidth": 150,

 "iAlign": 1,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 240,

 "bIsNull": true,

 "bPrintCaption": true,

 "cControlType": "item",

 "iOrder": 1005,

 "bMain": true,

 "id": "1456804640021545616",

 "bVmExclude": 0,

 "iBillTplGroupId": "1456804640021545074",

 "iBillId": 692408,

 "iBillEntityId": 940176,

 "iTplId": 694070,

 "cSubId": "saa",

 "iSystem": 1,

 "cName": "version",

 "cFieldName": "version",

 "authLevel": 3,

 "cDataSourceName": "aim.equip.EquipHeadVO",

 "enterDirection": 4,

 "bEnableFormat": false

 }, {

 "cItemName": "bizFlowName",

 "cCaption": "流程名称",

 "cShowCaption": "流程名称",

 "iMaxLength": 36,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bCanModify": true,

 "iMaxShowLen": 255,

 "iColWidth": 150,

 "iAlign": 1,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 240,

 "bIsNull": true,

 "bPrintCaption": true,

 "cControlType": "item",

 "iOrder": 1010,

 "bMain": true,

 "id": "1456804640021545619",

 "bVmExclude": 0,

 "iBillTplGroupId": "1456804640021545074",

 "iBillId": 692408,

 "iBillEntityId": 940176,

 "iTplId": 694070,

 "cSubId": "saa",

 "iSystem": 1,

 "cName": "bizFlowName",

 "cFieldName": "bizFlowName",

 "authLevel": 3,

 "cDataSourceName": "aim.equip.EquipHeadVO",

 "enterDirection": 4,

 "bEnableFormat": false,

 "cStyle": "{\"className\":\"guige\", \"icol\":\"widthCol2\"}",

 }],

 "iBillEntityId": 940176,

 "cExtProps": "{\"uiDesignHidden\":\"true\"}",

 "uiDesignHidden": "true"

 }],

 "controls": [{

 "cItemName": "equipimage_url",

 "cCaption": "图片",

 "cShowCaption": "图片",

 "iMaxLength": 36,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bCanModify": true,

 "iMaxShowLen": 255,

 "iColWidth": 150,

 "iAlign": 1,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 240,

 "bIsNull": true,

 "bPrintCaption": true,

 "cControlType": "listcardimg",

 "iOrder": 1004,

 "bMain": true,

 "cStyle": "{\"suffix\":false,\"displaymode\":\"default1\",\"tips\":\"\"}",

 "id": "1456804640021545613",

 "bVmExclude": 0,

 "iBillTplGroupId": "1456804640021545071",

 "iBillId": 692408,

 "iBillEntityId": 940176,

 "iTplId": 694070,

 "cSubId": "saa",

 "iSystem": 1,

 "cName": "equipimage_url",

 "cFieldName": "equip_image",

 "authLevel": 3,

 "cDataSourceName": "aim.equip.EquipHeadVO",

 "enterDirection": 4,

 "bEnableFormat": false

 }],

 "iBillEntityId": 940176,

 "cExtProps": "{\"uiDesignHidden\":\"true\"}",

 "uiDesignHidden": "true"

 }],

 "iBillEntityId": 940176,

 "cExtProps": "{\"uiDesignHidden\":\"true\"}",

 "uiDesignHidden": "true"

 }],

 "controls": [{

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 150,

 "cSumType": "support",

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 250,

 "id": 102423735,

 "bVmExclude": 0,

 "iBillTplGroupId": 10142897,

 "iBillEntityId": 10062169,

 "cSubId": "GT14530AT5",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "cDataSourceName": "GT14530AT5.GT14530AT5.wj02",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.102423735",

 "cExtProps": "{\"ytenant_id\":\"0000KWEB7NON92GMJ40000\",\"sysFlag\":0}",

 "ytenant_id": "0000KWEB7NON92GMJ40000",

 "sysFlag": 0

 }, {

 "cItemName": "verifystate",

 "cCaption": "单据状态",

 "cCaptionResid": "P_YS_FI_CM_0000029118",

 "cShowCaption": "单据状态",

 "cShowCaptionResid": "P_YS_FI_CM_0000029118",

 "iMaxLength": 6,

 "iFieldType": 1,

 "bEnum": true,

 "cEnumString": "{\n \"2\": \"已审核\",\n \"3\": \"终止态\",\n \"4\": \"驳回到制单\",\n \"0\": \"开立态\",\n \"1\": \"审核中\"\n}",

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": false,

 "iMaxShowLen": 6,

 "iColWidth": 150,

 "cSumType": "support",

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "optionwidget",

 "iOrder": 450,

 "id": 102423752,

 "bVmExclude": 0,

 "iBillTplGroupId": 10142897,

 "iBillEntityId": 10062169,

 "cSubId": "GT14530AT5",

 "iSystem": 1,

 "cName": "verifystate",

 "cFieldName": "verifystate",

 "cDataSourceName": "GT14530AT5.GT14530AT5.wj02",

 "enterDirection": 4,

 "cEnumType": "sys_verifystate",

 "enumArray": "[\n {\n \"nameType\": \"string\",\n \"icon\": null,\n \"cDataRule\": null,\n \"value\": \"已审核\",\n \"resid\": \"P_YS_SCM_PU_0000028093\",\n \"key\": \"2\"\n },\n {\n \"nameType\": \"string\",\n \"icon\": null,\n \"cDataRule\": null,\n \"value\": \"终止态\",\n \"resid\": \"P_YS_PF_SUPPORT-UI_0001122339\",\n \"key\": \"3\"\n },\n {\n \"nameType\": \"string\",\n \"icon\": null,\n \"cDataRule\": null,\n \"value\": \"驳回到制单\",\n \"resid\": \"P_YS_MF_ED-UI_0001303303\",\n \"key\": \"4\"\n },\n {\n \"nameType\": \"string\",\n \"icon\": null,\n \"cDataRule\": null,\n \"value\": \"开立态\",\n \"resid\": \"P_YS_OA_app_xtywlj_0001084362\",\n \"key\": \"0\"\n },\n {\n \"nameType\": \"string\",\n \"icon\": null,\n \"cDataRule\": null,\n \"value\": \"审核中\",\n \"resid\": \"P_YS_SCM_PU_0000028406\",\n \"key\": \"1\"\n }\n]",

 "bEnableFormat": false,

 "key": "Control.102423752",

 "cExtProps": "{\"ytenant_id\":\"0000KWEB7NON92GMJ40000\",\"subuitype\":\"select\",\"sysFlag\":1,\"cCaptionResid\":\"P_YS_FI_CM_0000029118\",\"cShowCaptionResid\":\"P_YS_FI_CM_0000029118\"}",

 "ytenant_id": "0000KWEB7NON92GMJ40000",

 "subuitype": "select",

 "sysFlag": 1

 }],

 "iBillId": 10032883,

 "iBillEntityId": 10062169,

 "iTplId": 10032809,

 "cExtProps": "{\"ytenant_id\":\"0000KWEB7NON92GMJ40000\",\"cCode\":\"wj02_1554681619056951303\"}",

 "ytenant_id": "0000KWEB7NON92GMJ40000"

}

## [](#5-控制示例)5. 控制示例

// 设置数据

viewModel.getGridModels()[0].setDataSource([

 {

 "tenant_id": "0000L61OHFZXDBYQ6F0000",

 "path": "1547246884719951876|",

 "new1": "01天01时27分55秒后结束",

 "equip_code": "文本文本3",

 "org_id": "1508525383726137346",

 "spec": "文本文本4",

 "equip_name": "我是标题我是标题",

 "id": "1547246884719951876",

 "pubts": "2022-09-16 18:14:04",

 "isEnd": true

 },

 {

 "tenant_id": "0000L61OHFZXDBYQ6F0000",

 "path": "1547246781640736776|",

 "new1": "02天01时27分55秒后结束",

 "equip_code": "文本文本33",

 "org_id": "1508523193278660615",

 "spec": "文本文本44",

 "equip_name": "我是标题2222",

 "id": "1547246781640736776",

 "pubts": "2022-09-16 18:13:52",

 "isEnd": true

 }

])

// 设置本地数据

viewmodel.getGridModels()[0].setState('dataSourceMode', 'local')

// 点击事件

viewmodel.getGridModel().on('afterSelect',(index) => {})