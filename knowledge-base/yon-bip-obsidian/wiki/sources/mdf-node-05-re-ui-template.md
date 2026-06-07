---
title: "获取UI模板"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/05-re-ui-template"
section: "MDF服务"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, MDF服务]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 获取UI模板

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/05-re-ui-template | 所属：MDF服务

# [](#获取ui模板)获取UI模板

${domain.iuap-mdf-node}/meta

## [](#1-接口说明)1. 接口说明

此接口用于获取模板的视图模型viewApplication和存储模型viewmodel

## [](#2-接口类型)2. 接口类型

**POST**

## [](#3-请求参数)3. 请求参数

{

 "query":

 {

 "locale": "zh_CN",

 "serviceCode": "st_othinrecordlist",

 "refimestamp": "1651921276384",

 "isNewTpl": true

 },

 "serviceCode": "st_othinrecordlist",

 "menuId": true,

 "metaType": "voucherlist",

 "name": "其他入库",

 "loadMetaAdvance": true,

 "tplid": 9148318,

 "multitpl": false,

 "saveReloadMultitpl": false,

 "billNo": "st_othinrecordlist",

 "noCache": false,

 "type": "bill",

 "newBillMeta": true

}

## [](#4-参数说明)4. 参数说明

||**参数**||**是否可空**||**说明**|
||query||否||其中locale为语言环境，serviceCode为应用编码，refimestamp为时间戳，isNewTpl为新模板|
||serviceCode||否||应用编码|
||menuId||否||是否菜单|
||metaType||否||单据的billtype|
||name||否||单据名称|
||loadMetaAdvance||否||性能优化开关参数|
||tplid||否||*模板id*|
||multitpl||是||是否多模板|
||saveReloadMultitpl||是||保存后是否重新渲染模板|
||billNo||是||单据billno|
||noCache||是||是否缓存|
||type||是||单据类型|
||newBillMeta||是||新模板参数，区分getbill还是getfebill|

## [](#5-请求头)5. 请求头

||**参数**||**是否可空**||**说明**|
||Domain-Key||否||领域前端编码|

## [](#6-返回结构)6. 返回结构

{

 "code": 200,

 "data":

 {

 "viewmeta":

 {

 "billid": 1008594310,

 "cBillName": "其他入库单列表",

 "cBillNameResid": "P_YS_FI_YYFI-UI_0000161076",

 "bPrintLimited": true,

 "cBillType": "VoucherList",

 "cBillNo": "st_othinrecordlist",

 "bAllowMultiTpl": true,

 "cSubId": "ST",

 "cCardKey": "st_othinrecord",

 "view":

 {

 "iTplId": 9148318,

 "cTemplateName": "其他入库单列表显示模板",

 "cTemplateNameResid": "P_YS_FI_YYFI-UI_0000161077",

 "iTplMode": 0,

 "iWidth": 10000,

 "cTemplateTitle": "其他入库单列表",

 "cTitle_resid": "P_YS_FI_YYFI-UI_0000161076",

 "containers": [

 {

 "groupId": 193877109958,

 "cName": "其他入库单列表摘要",

 "cNameResid": "P_YS_FI_YYFI-UI_0000167699",

 "iOrder": 0,

 "bMain": false,

 "cCode": "st_othinrecordlist",

 "cDataSourceName": "st.othinrecord.OthInRecord",

 "cControlType": "ListHeader",

 "cGroupCode": "st_othinrecordlist_abstract",

 "cAlign": "top",

 "iCols": 0,

 "containers": [

 {

 "groupId": 1849710493407206,

 "parentId": 193877109958,

 "cName": "ListHeader",

 "iOrder": 0,

 "cDataSourceName": "Toolbar",

 "cControlType": "Toolbar",

 "cGroupCode": "ListHeader",

 "cAlign": "top",

 "iCols": 0,

 "controls": [

 {

 "cItemName": "btnAddDrop",

 "cCaption": "新增",

 "cCaptionResid": "P_YS_FED_FW_0000021020",

 "cShowCaption": "新增",

 "cShowCaptionResid": "P_YS_FED_FW_0000021020",

 "bEnum": false,

 "cParameter": "{\"displaymode\":\"button\",\"action\":\"add\"}",

 "cControlType": "dropdownbutton",

 "iOrder": 0,

 "iStyle": 0,

 "controls": [

 {

 "cItemName": "btnAdd",

 "cCaption": "空白单据",

 "cCaptionResid": "P_YS_SCM_USTOCK-UI_0000174216",

 "cShowCaption": "空白单据",

 "cShowCaptionResid": "P_YS_SCM_USTOCK-UI_0000174216",

 "cControlType": "button",

 "iOrder": 1,

 "iStyle": 0,

 "cParent": "1849710493407206",

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407196",

 "parentKey": "Control.ToolbarItem.1849710493407206"

 },

 {

 "cItemName": "btnAddLendIn",

 "cCaption": "借入入库",

 "cCaptionResid": "P_YS_SCM_USTOCK-UI_0001318046",

 "cShowCaption": "借入入库",

 "cShowCaptionResid": "P_YS_SCM_USTOCK-UI_0001318046",

 "cControlType": "button",

 "iOrder": 28,

 "iStyle": 0,

 "cParent": "1849710493407206",

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710499326132",

 "parentKey": "Control.ToolbarItem.1849710493407206",

 "cExtProps": "{\"iOrder\":28.0}"

 },

 {

 "cItemName": "btnAddOrderLendrecord",

 "cCaption": "借出归还入库",

 "cCaptionResid": "P_YS_SCM_UIT_0001264492",

 "cShowCaption": "借出归还入库",

 "cShowCaptionResid": "P_YS_SCM_UIT_0001264492",

 "cControlType": "button",

 "iOrder": 30,

 "iStyle": 0,

 "cParent": "1849710493407206",

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710495008383",

 "parentKey": "Control.ToolbarItem.1849710493407206",

 "cExtProps": "{\"iOrder\":30.0}"

 }],

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407206"

 },

 {

 "cItemName": "spliter",

 "bEnum": false,

 "cControlType": "spliter",

 "iOrder": 1,

 "iStyle": 0,

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407220"

 },

 {

 "cItemName": "btnBatchSubmitDrop",

 "cCaption": "提交",

 "cCaptionResid": "P_YS_FED_UCFBASEDOC_0000024984",

 "cShowCaption": "提交",

 "cShowCaptionResid": "P_YS_FED_UCFBASEDOC_0000024984",

 "bEnum": false,

 "cParameter": "{\"displaymode\":\"button\"}",

 "cControlType": "dropdownbutton",

 "iOrder": 3,

 "iStyle": 0,

 "controls": [

 {

 "cItemName": "btnBatchSubmit",

 "cCaption": "提交",

 "cCaptionResid": "P_YS_FED_UCFBASEDOC_0000024984",

 "cShowCaption": "提交",

 "cShowCaptionResid": "P_YS_FED_UCFBASEDOC_0000024984",

 "cControlType": "button",

 "iOrder": 3,

 "iStyle": 0,

 "cParent": "1849710493407231",

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407232",

 "parentKey": "Control.ToolbarItem.1849710493407231"

 },

 {

 "cItemName": "btnBatchUnsubmit",

 "cCaption": "撤回",

 "cCaptionResid": "P_YS_FED_UCFBASEDOC_0000025104",

 "cShowCaption": "撤回",

 "cShowCaptionResid": "P_YS_FED_UCFBASEDOC_0000025104",

 "cControlType": "button",

 "iOrder": 3,

 "iStyle": 0,

 "cParent": "1849710493407231",

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407233",

 "parentKey": "Control.ToolbarItem.1849710493407231"

 }],

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407231"

 },

 {

 "cItemName": "btnBatchAuditDrop",

 "cCaption": "审核",

 "cCaptionResid": "P_YS_FED_UCFBASEDOC_0000024727",

 "cShowCaption": "审核",

 "cShowCaptionResid": "P_YS_FED_UCFBASEDOC_0000024727",

 "bEnum": false,

 "cParameter": "{\"displaymode\":\"button\"}",

 "cControlType": "dropdownbutton",

 "iOrder": 3,

 "iStyle": 0,

 "controls": [

 {

 "cItemName": "btnBatchAudit",

 "cCaption": "审核",

 "cCaptionResid": "P_YS_FED_UCFBASEDOC_0000024727",

 "cShowCaption": "审核",

 "cShowCaptionResid": "P_YS_FED_UCFBASEDOC_0000024727",

 "cControlType": "button",

 "iOrder": 3,

 "iStyle": 0,

 "cParent": "1849710493407234",

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407235",

 "parentKey": "Control.ToolbarItem.1849710493407234"

 },

 {

 "cItemName": "btnBatchUnaudit",

 "cCaption": "弃审",

 "cCaptionResid": "P_YS_PF_PROCENTER_0000027468",

 "cShowCaption": "弃审",

 "cShowCaptionResid": "P_YS_PF_PROCENTER_0000027468",

 "cControlType": "button",

 "iOrder": 3,

 "iStyle": 0,

 "cParent": "1849710493407234",

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407236",

 "parentKey": "Control.ToolbarItem.1849710493407234"

 }],

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407234"

 },

 {

 "cItemName": "spliter",

 "bEnum": false,

 "cControlType": "spliter",

 "iOrder": 3,

 "iStyle": 0,

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407230"

 },

 {

 "cItemName": "spliter",

 "bEnum": false,

 "cControlType": "spliter",

 "iOrder": 3,

 "iStyle": 0,

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407227"

 },

 {

 "cItemName": "spliter",

 "bEnum": false,

 "cControlType": "spliter",

 "iOrder": 3,

 "iStyle": 0,

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407228"

 },

 {

 "cItemName": "spliter",

 "bEnum": false,

 "cControlType": "spliter",

 "iOrder": 3,

 "iStyle": 0,

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407229"

 },

 {

 "cItemName": "spliter",

 "bEnum": false,

 "cControlType": "spliter",

 "iOrder": 3,

 "iStyle": 0,

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407237"

 },

 {

 "cItemName": "spliter",

 "bEnum": false,

 "cControlType": "spliter",

 "iOrder": 5,

 "iStyle": 0,

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407207"

 },

 {

 "cItemName": "spliter",

 "bEnum": false,

 "cControlType": "spliter",

 "iOrder": 15,

 "iStyle": 0,

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407214"

 },

 {

 "cItemName": "btnPrintDrop",

 "cCaption": "打印",

 "cCaptionResid": "P_YS_FED_UCFBASEDOC_0000025433",

 "cShowCaption": "打印",

 "cShowCaptionResid": "P_YS_FED_UCFBASEDOC_0000025433",

 "bEnum": false,

 "cParameter": "{\"displaymode\":\"button\"}",

 "cControlType": "dropdownbutton",

 "iOrder": 16,

 "iStyle": 0,

 "controls": [

 {

 "cItemName": "btnPrintReview",

 "cCaption": "打印预览",

 "cCaptionResid": "P_YS_PF_PROCENTER_0000027569",

 "cShowCaption": "打印预览",

 "cShowCaptionResid": "P_YS_PF_PROCENTER_0000027569",

 "cControlType": "button",

 "iOrder": 16,

 "iStyle": 0,

 "cParent": "1849710493407215",

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407216",

 "parentKey": "Control.ToolbarItem.1849710493407215"

 },

 {

 "cItemName": "btnPrintNow",

 "cCaption": "直接打印",

 "cCaptionResid": "P_YS_PF_PROCENTER_0000027368",

 "cShowCaption": "直接打印",

 "cShowCaptionResid": "P_YS_PF_PROCENTER_0000027368",

 "cControlType": "button",

 "iOrder": 17,

 "iStyle": 0,

 "cParent": "1849710493407215",

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407217",

 "parentKey": "Control.ToolbarItem.1849710493407215"

 }],

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407215"

 },

 {

 "cItemName": "btnExportDrop",

 "cCaption": "导出",

 "cCaptionResid": "P_YS_FED_IMP_IOT0000007727",

 "cShowCaption": "导出",

 "cShowCaptionResid": "P_YS_FED_IMP_IOT0000007727",

 "bEnum": false,

 "cControlType": "dropdownbutton",

 "iOrder": 20,

 "iStyle": 0,

 "controls": [

 {

 "cItemName": "btnExport",

 "cCaption": "导出所选记录",

 "cCaptionResid": "P_YS_PF_GZTTMP_0000079981",

 "cShowCaption": "导出所选记录",

 "cShowCaptionResid": "P_YS_PF_GZTTMP_0000079981",

 "cControlType": "button",

 "iOrder": 3,

 "iStyle": 0,

 "cParent": "1849710493407208",

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407202",

 "parentKey": "Control.ToolbarItem.1849710493407208"

 },

 {

 "cItemName": "btnExport1",

 "cCaption": "导出查询结果",

 "cCaptionResid": "P_YS_PF_GZTTMP_0000079931",

 "cShowCaption": "导出查询结果",

 "cShowCaptionResid": "P_YS_PF_GZTTMP_0000079931",

 "cControlType": "button",

 "iOrder": 4,

 "iStyle": 0,

 "cParent": "1849710493407208",

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407213",

 "parentKey": "Control.ToolbarItem.1849710493407208"

 }],

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407208"

 },

 {

 "cItemName": "btnImportDrop",

 "cCaption": "导入",

 "cCaptionResid": "P_YS_FED_UCFBASEDOC_0000024986",

 "cShowCaption": "导入",

 "cShowCaptionResid": "P_YS_FED_UCFBASEDOC_0000024986",

 "bEnum": false,

 "cControlType": "dropdownbutton",

 "iOrder": 25,

 "iStyle": 0,

 "controls": [

 {

 "cItemName": "btnImport",

 "cCaption": "导入",

 "cCaptionResid": "P_YS_FED_UCFBASEDOC_0000024986",

 "cShowCaption": "导入",

 "cShowCaptionResid": "P_YS_FED_UCFBASEDOC_0000024986",

 "cControlType": "button",

 "iOrder": 5,

 "iStyle": 0,

 "cParent": "1849710493407209",

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407199",

 "parentKey": "Control.ToolbarItem.1849710493407209"

 },

 {

 "cItemName": "btnTempexport",

 "cCaption": "模板下载",

 "cCaptionResid": "P_YS_PF_PROCENTER_0000027470",

 "cShowCaption": "模板下载",

 "cShowCaptionResid": "P_YS_PF_PROCENTER_0000027470",

 "cControlType": "button",

 "iOrder": 6,

 "iStyle": 0,

 "cParent": "1849710493407209",

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407200",

 "parentKey": "Control.ToolbarItem.1849710493407209"

 }],

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407209"

 },

 {

 "cItemName": "spliter",

 "bEnum": false,

 "cControlType": "spliter",

 "iOrder": 30,

 "iStyle": 0,

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407210"

 },

 {

 "cItemName": "btnBatchDelete",

 "cCaption": "删除",

 "cCaptionResid": "P_YS_FED_IMP_IOT0000008165",

 "cShowCaption": "删除",

 "cShowCaptionResid": "P_YS_FED_IMP_IOT0000008165",

 "bEnum": false,

 "cControlType": "button",

 "iOrder": 40,

 "iStyle": 0,

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407211"

 },

 {

 "cItemName": "spliter2OpenReport",

 "bEnum": false,

 "cControlType": "spliter",

 "iOrder": 490,

 "iStyle": 0,

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407219"

 },

 {

 "icon": "qingfenxi",

 "cItemName": "btnOpenReport",

 "cCaption": "即时分析",

 "cCaptionResid": "P_YS_FED_FW_0001060913",

 "cShowCaption": "即时分析",

 "cShowCaptionResid": "P_YS_FED_FW_0001060913",

 "bEnum": false,

 "cParameter": "{\"classname\":\"button-only-icon\"}",

 "cControlType": "button",

 "iOrder": 500,

 "iStyle": 2,

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407218"

 }],

 "key": "ContainerToolbarListHeader",

 "parentKey": "Container193877109958"

 },

 {

 "groupId": 193877109959,

 "parentId": 193877109958,

 "cName": "其他入库单列表过滤",

 "cNameResid": "P_YS_FI_YYFI-UI_0000167700",

 "iOrder": 10,

 "bMain": true,

 "cCode": "st_othinrecordlist",

 "cDataSourceName": "st.othinrecord.OthInRecord",

 "cControlType": "ConvenientQuery",

 "cGroupCode": "st_othinrecordlist_filter",

 "cAlign": "left",

 "iCols": 0,

 "iBillEntityId": 14709957

 },

 {

 "groupId": 193877109961,

 "parentId": 193877109958,

 "cName": "其他入库单列表汇总区域",

 "cNameResid": "P_YS_SCM_USTOCK-UI_0000173573",

 "iOrder": 12,

 "bMain": true,

 "cCode": "st_othinrecordlist",

 "cDataSourceName": "st.othinrecord.OthInRecord",

 "cControlType": "SumSwitch",

 "cGroupCode": "st_othinrecordlist_SumSwitch",

 "cAlign": "top",

 "iCols": 0,

 "cStyle": "{\"keys\":{\"false\":\"othInRecords_id\"}}",

 "iBillEntityId": 14709957

 }],

 "iBillEntityId": 14709957

 },

 {

 "groupId": 673152087,

 "cName": "commonToolbar",

 "iOrder": 0,

 "cDataSourceName": "Toolbar",

 "cControlType": "Toolbar",

 "cGroupCode": "commonToolbar",

 "cAlign": "top",

 "iCols": 0,

 "cStyle": "{\"type\":\"common\"}",

 "controls": [

 {

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

 },

 {

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

 },

 {

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

 },

 {

 "groupId": 193877109960,

 "cName": "其他入库单列表区域",

 "cNameResid": "P_YS_FI_YYFI-UI_0000167698",

 "iOrder": 11,

 "bMain": true,

 "cCode": "st_othinrecordlist",

 "cDataSourceName": "st.othinrecord.OthInRecord",

 "cControlType": "Table",

 "cGroupCode": "st_othinrecordlist_grid",

 "cAlign": "bottom",

 "iCols": 0,

 "containers": [

 {

 "groupId": 1849710493407197,

 "parentId": 193877109960,

 "cName": "ListBody",

 "iOrder": 0,

 "cDataSourceName": "Toolbar",

 "cControlType": "Toolbar",

 "cGroupCode": "ListBody",

 "cAlign": "left",

 "iCols": 0,

 "controls": [

 {

 "cItemName": "btnEdit",

 "cCaption": "编辑",

 "cCaptionResid": "P_YS_FED_IMP-DFM-FE_0000020875",

 "cShowCaption": "编辑",

 "cShowCaptionResid": "P_YS_FED_IMP-DFM-FE_0000020875",

 "bEnum": false,

 "cControlType": "button",

 "iOrder": 6,

 "iStyle": 0,

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407197"

 },

 {

 "cItemName": "btnDelete",

 "cCaption": "删除",

 "cCaptionResid": "P_YS_FED_IMP_IOT0000008165",

 "cShowCaption": "删除",

 "cShowCaptionResid": "P_YS_FED_IMP_IOT0000008165",

 "bEnum": false,

 "cControlType": "button",

 "iOrder": 7,

 "iStyle": 0,

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407198"

 },

 {

 "cItemName": "btnAudit",

 "cCaption": "审核",

 "cCaptionResid": "P_YS_FED_UCFBASEDOC_0000024727",

 "cShowCaption": "审核",

 "cShowCaptionResid": "P_YS_FED_UCFBASEDOC_0000024727",

 "bEnum": false,

 "cControlType": "button",

 "iOrder": 8,

 "iStyle": 0,

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407238"

 },

 {

 "cItemName": "btnUnaudit",

 "cCaption": "弃审",

 "cCaptionResid": "P_YS_PF_PROCENTER_0000027468",

 "cShowCaption": "弃审",

 "cShowCaptionResid": "P_YS_PF_PROCENTER_0000027468",

 "bEnum": false,

 "cControlType": "button",

 "iOrder": 8,

 "iStyle": 0,

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407239"

 },

 {

 "cItemName": "btnSubmit",

 "cCaption": "提交",

 "cCaptionResid": "P_YS_FED_UCFBASEDOC_0000024984",

 "cShowCaption": "提交",

 "cShowCaptionResid": "P_YS_FED_UCFBASEDOC_0000024984",

 "bEnum": false,

 "cControlType": "button",

 "iOrder": 8,

 "iStyle": 0,

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407240"

 },

 {

 "cItemName": "btnUnsubmit",

 "cCaption": "撤回",

 "cCaptionResid": "P_YS_FED_UCFBASEDOC_0000025104",

 "cShowCaption": "撤回",

 "cShowCaptionResid": "P_YS_FED_UCFBASEDOC_0000025104",

 "bEnum": false,

 "cControlType": "button",

 "iOrder": 8,

 "iStyle": 0,

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407241"

 },

 {

 "cItemName": "btnWorkflow",

 "cCaption": "审批流",

 "cCaptionResid": "P_YS_FED_FW_0000021634",

 "cShowCaption": "审批流",

 "cShowCaptionResid": "P_YS_FED_FW_0000021634",

 "bEnum": false,

 "cControlType": "button",

 "iOrder": 8,

 "iStyle": 0,

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407242"

 },

 {

 "cItemName": "btnCopy",

 "cCaption": "复制",

 "cCaptionResid": "P_YS_FED_IMP-DFM-FE_0000020886",

 "cShowCaption": "复制",

 "cShowCaptionResid": "P_YS_FED_IMP-DFM-FE_0000020886",

 "bEnum": false,

 "cControlType": "button",

 "iOrder": 270,

 "iStyle": 0,

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407212"

 },

 {

 "cItemName": "btnBodyJointquery",

 "cCaption": "全局联查",

 "cCaptionResid": "P_YS_SD_SCMSA-UI_0000162076",

 "cShowCaption": "全局联查",

 "cShowCaptionResid": "P_YS_SD_SCMSA-UI_0000162076",

 "bEnum": false,

 "cControlType": "button",

 "iOrder": 300,

 "iStyle": 0,

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.ToolbarItem.1849710493407221"

 }],

 "key": "ContainerToolbarListBody",

 "parentKey": "Container193877109960"

 }],

 "controls": [

 {

 "cItemName": "vouchdate",

 "cCaption": "单据日期",

 "cCaptionResid": "P_YS_PF_PROCENTER_0000022686",

 "cShowCaption": "单据日期",

 "cShowCaptionResid": "P_YS_PF_PROCENTER_0000022686",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": false,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": false,

 "iMaxShowLen": 255,

 "iColWidth": 100,

 "cSumType": "support",

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "cFormatData": "YYYY-MM-DD",

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "DatePicker",

 "iOrder": 1,

 "cOrder": "desc",

 "bMain": true,

 "cStyle": "{\"tips\":\"\"}",

 "id": 1849710500065526,

 "bVmExclude": 0,

 "iBillTplGroupId": 193877109960,

 "iBillId": 1008594310,

 "iBillEntityId": 14709957,

 "iTplId": 9148318,

 "cSubId": "ST",

 "iSystem": 1,

 "cName": "vouchdate",

 "cFieldName": "vouchdate",

 "authLevel": 3,

 "cDataSourceName": "st.othinrecord.OthInRecord",

 "enterDirection": 4,

 "bEnableFormat": false

 },

 {

 "cItemName": "code",

 "cCaption": "单据编号",

 "cCaptionResid": "P_YS_FI_CM_0000030058",

 "cShowCaption": "单据编号",

 "cShowCaptionResid": "P_YS_FI_CM_0000030058",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": false,

 "iMaxShowLen": 255,

 "iColWidth": 200,

 "cSumType": "support",

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": true,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "Column",

 "iOrder": 2,

 "cOrder": "desc",

 "bMain": true,

 "id": 1849710500065525,

 "bVmExclude": 0,

 "iBillTplGroupId": 193877109960,

 "iBillId": 1008594310,

 "iBillEntityId": 14709957,

 "iTplId": 9148318,

 "cSubId": "ST",

 "iSystem": 1,

 "cName": "code",

 "cFieldName": "code",

 "authLevel": 3,

 "cDataSourceName": "st.othinrecord.OthInRecord",

 "enterDirection": 4,

 "bEnableFormat": false

 },

 {

 "cItemName": "operator_name",

 "cCaption": "业务员",

 "cCaptionResid": "P_YS_SD_SDMA_0000038452",

 "cShowCaption": "业务员",

 "cShowCaptionResid": "P_YS_SD_SDMA_0000038452",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 255,

 "iColWidth": 200,

 "cSumType": "support",

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "cFormatData": "{\"decimal\":\"<%option.amountofdecimal%>\"}",

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "Refer",

 "cRefType": "ucf-staff-center.bd_staff_outer_ref",

 "cRefRetId": "{\"operator\":\"id\"}",

 "refReturn": "name",

 "iOrder": 9,

 "bMain": true,

 "id": 1849710500065584,

 "bVmExclude": 0,

 "iBillTplGroupId": 193877109960,

 "iBillId": 1008594310,

 "iBillEntityId": 14709957,

 "iTplId": 9148318,

 "cSubId": "ST",

 "iSystem": 1,

 "cName": "operator_name",

 "cFieldName": "operator.name",

 "authLevel": 3,

 "cDataSourceName": "st.othinrecord.OthInRecord",

 "enterDirection": 4,

 "cDataRule": "\"<%loginUser.docId%>\"==\"null\"",

 "bEnableFormat": false

 },

 {

 "cItemName": "org_name",

 "cCaption": "库存组织",

 "cCaptionResid": "P_YS_FED_FW_0000022291",

 "cShowCaption": "库存组织",

 "cShowCaptionResid": "P_YS_FED_FW_0000022291",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 255,

 "iColWidth": 200,

 "cSumType": "support",

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "Refer",

 "cRefType": "aa_orgtree",

 "cRefRetId": "{\"org\":\"id\"}",

 "refReturn": "name",

 "iOrder": 9,

 "bMain": true,

 "id": 1849710500065586,

 "bVmExclude": 0,

 "iBillTplGroupId": 193877109960,

 "iBillId": 1008594310,

 "iBillEntityId": 14709957,

 "iTplId": 9148318,

 "cSubId": "ST",

 "iSystem": 1,

 "cName": "org_name",

 "cFieldName": "org.name",

 "authLevel": 3,

 "cDataSourceName": "st.othinrecord.OthInRecord",

 "enterDirection": 4,

 "cDataRule": "\"<%u8c-config.option.singleOrg%>\"==\"false\"",

 "bEnableFormat": false

 },

 {

 "cItemName": "auditDate",

 "cCaption": "审核日期",

 "cCaptionResid": "P_YS_PF_PRINT_0000057248",

 "cShowCaption": "审核日期",

 "cShowCaptionResid": "P_YS_PF_PRINT_0000057248",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": false,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": false,

 "iMaxShowLen": 255,

 "iColWidth": 200,

 "cSumType": "support",

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": false,

 "cFormatData": "YYYY-MM-DD",

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "DatePicker",

 "iOrder": 12,

 "bMain": true,

 "cStyle": "{\"tips\":\"\"}",

 "id": 1849710500065762,

 "bVmExclude": 0,

 "iBillTplGroupId": 193877109960,

 "iBillId": 1008594310,

 "iBillEntityId": 14709957,

 "iTplId": 9148318,

 "cSubId": "ST",

 "iSystem": 1,

 "cName": "auditDate",

 "cFieldName": "auditDate",

 "authLevel": 3,

 "cDataSourceName": "st.othinrecord.OthInRecord",

 "enterDirection": 4,

 "bEnableFormat": false

 },

 {

 "cItemName": "warehouse_name",

 "cCaption": "仓库",

 "cCaptionResid": "P_YS_PF_GZTSYS_0000012561",

 "cShowCaption": "仓库",

 "cShowCaptionResid": "P_YS_PF_GZTSYS_0000012561",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": false,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": false,

 "iMaxShowLen": 255,

 "iColWidth": 150,

 "cSumType": "support",

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "Column",

 "cRefType": "aa_warehouse",

 "refReturn": "name",

 "iOrder": 314,

 "bMain": true,

 "id": 1849710500065530,

 "bVmExclude": 0,

 "iBillTplGroupId": 193877109960,

 "iBillId": 1008594310,

 "iBillEntityId": 14709957,

 "iTplId": 9148318,

 "cSubId": "ST",

 "iSystem": 1,

 "cName": "warehouse_name",

 "cFieldName": "warehouse.name",

 "authLevel": 3,

 "cDataSourceName": "st.othinrecord.OthInRecord",

 "enterDirection": 4,

 "bEnableFormat": false

 },

 {

 "cItemName": "stockMgr_name",

 "cCaption": "库管员",

 "cCaptionResid": "P_YS_PF_GZTSYS_0000012963",

 "cShowCaption": "库管员",

 "cShowCaptionResid": "P_YS_PF_GZTSYS_0000012963",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": false,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 255,

 "iColWidth": 200,

 "cSumType": "support",

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "cFormatData": "{\"decimal\":\"<%option.amountofdecimal%>\"}",

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "Refer",

 "cRefType": "ucf-staff-center.bd_staff_outer_ref",

 "cRefRetId": "{\"stockMgr\":\"id\"}",

 "refReturn": "name",

 "iOrder": 316,

 "bMain": true,

 "id": 1849710500065579,

 "bVmExclude": 0,

 "iBillTplGroupId": 193877109960,

 "iBillId": 1008594310,

 "iBillEntityId": 14709957,

 "iTplId": 9148318,

 "cSubId": "ST",

 "iSystem": 1,

 "cName": "stockMgr_name",

 "cFieldName": "stockMgr.name",

 "authLevel": 3,

 "cDataSourceName": "st.othinrecord.OthInRecord",

 "enterDirection": 4,

 "cDataRule": "\"<%loginUser.userType%>\"!=\"4\" && \"<%loginUser.userType%>\"!=\"5\"",

 "bEnableFormat": false

 },

 {

 "cItemName": "bustype_name",

 "cCaption": "业务类型",

 "cCaptionResid": "P_YS_FED_EXAMP_0000019909",

 "cShowCaption": "交易类型",

 "cShowCaptionResid": "P_YS_PF_GZTSYS_0000012631",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": false,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": false,

 "iMaxShowLen": 255,

 "iColWidth": 150,

 "cSumType": "support",

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "Column",

 "cRefType": "aa_user",

 "refReturn": "name",

 "iOrder": 316,

 "bMain": true,

 "id": 1849710500065532,

 "bVmExclude": 0,

 "iBillTplGroupId": 193877109960,

 "iBillId": 1008594310,

 "iBillEntityId": 14709957,

 "iTplId": 9148318,

 "cSubId": "ST",

 "iSystem": 1,

 "cName": "bustype_name",

 "cFieldName": "bustype.name",

 "authLevel": 3,

 "cDataSourceName": "st.othinrecord.OthInRecord",

 "enterDirection": 4,

 "bEnableFormat": false

 },

 {

 "cItemName": "accountOrg_name",

 "cCaption": "会计主体",

 "cCaptionResid": "P_YS_FED_FW_0000022114",

 "cShowCaption": "会计主体",

 "cShowCaptionResid": "P_YS_FED_FW_0000022114",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": false,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 255,

 "iColWidth": 200,

 "cSumType": "support",

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "Refer",

 "cRefType": "aa_orgtree",

 "cRefRetId": "{\"accountOrg\":\"id\"}",

 "refReturn": "name",

 "iOrder": 316,

 "bMain": true,

 "id": 1849710500065582,

 "bVmExclude": 0,

 "iBillTplGroupId": 193877109960,

 "iBillId": 1008594310,

 "iBillEntityId": 14709957,

 "iTplId": 9148318,

 "cSubId": "ST",

 "iSystem": 1,

 "cName": "accountOrg_name",

 "cFieldName": "accountOrg.name",

 "authLevel": 3,

 "cDataSourceName": "st.othinrecord.OthInRecord",

 "enterDirection": 4,

 "cDataRule": "\"<%u8c-config.option.singleOrg%>\"==\"false\"",

 "bEnableFormat": false

 },

 {

 "cItemName": "status",

 "cCaption": "单据状态",

 "cCaptionResid": "P_YS_FI_CM_0000029118",

 "cShowCaption": "单据状态",

 "cShowCaptionResid": "P_YS_FI_CM_0000029118",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": true,

 "cEnumString": "{\n \"0\": \"开立\",\n \"3\": \"审核中\",\n \"1\": \"已审核\"\n}",

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": false,

 "iMaxShowLen": 255,

 "iColWidth": 100,

 "cSumType": "support",

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "select",

 "iOrder": 317,

 "bMain": true,

 "id": 1849710500065533,

 "bVmExclude": 0,

 "iBillTplGroupId": 193877109960,

 "iBillId": 1008594310,

 "iBillEntityId": 14709957,

 "iTplId": 9148318,

 "cSubId": "ST",

 "iSystem": 1,

 "cName": "status",

 "cFieldName": "status",

 "authLevel": 3,

 "cDataSourceName": "st.othinrecord.OthInRecord",

 "enterDirection": 4,

 "cEnumType": "othinrecord_status",

 "enumArray": "[\n {\n \"nameType\": \"text\",\n \"icon\": null,\n \"cDataRule\": null,\n \"value\": \"开立\",\n \"resid\": \"P_YS_SCM_PU_0000028170\",\n \"key\": \"0\"\n },\n {\n \"nameType\": \"text\",\n \"icon\": null,\n \"cDataRule\": null,\n \"value\": \"审核中\",\n \"resid\": \"P_YS_SCM_PU_0000028406\",\n \"key\": \"3\"\n },\n {\n \"nameType\": \"text\",\n \"icon\": null,\n \"cDataRule\": null,\n \"value\": \"已审核\",\n \"resid\": \"P_YS_SCM_PU_0000028093\",\n \"key\": \"1\"\n }\n]",

 "bEnableFormat": false

 },

 {

 "cItemName": "creator",

 "cCaption": "创建人",

 "cCaptionResid": "P_YS_OA_XTTMCENTER_0000035090",

 "cShowCaption": "创建人",

 "cShowCaptionResid": "P_YS_OA_XTTMCENTER_0000035090",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": false,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": false,

 "iMaxShowLen": 255,

 "iColWidth": 100,

 "cSumType": "support",

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "Column",

 "iOrder": 320,

 "bMain": true,

 "id": 1849710500065534,

 "bVmExclude": 0,

 "iBillTplGroupId": 193877109960,

 "iBillId": 1008594310,

 "iBillEntityId": 14709957,

 "iTplId": 9148318,

 "cSubId": "ST",

 "iSystem": 1,

 "cName": "creator",

 "cFieldName": "creator",

 "authLevel": 3,

 "cDataSourceName": "st.othinrecord.OthInRecord",

 "enterDirection": 4,

 "bEnableFormat": false

 },

 {

 "cItemName": "memo",

 "cCaption": "备注",

 "cCaptionResid": "P_YS_FI_CM_0000029174",

 "cShowCaption": "备注",

 "cShowCaptionResid": "P_YS_FI_CM_0000029174",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": false,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": false,

 "iMaxShowLen": 255,

 "iColWidth": 200,

 "cSumType": "support",

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "Column",

 "iOrder": 326,

 "bMain": true,

 "id": 1849710500065540,

 "bVmExclude": 0,

 "iBillTplGroupId": 193877109960,

 "iBillId": 1008594310,

 "iBillEntityId": 14709957,

 "iTplId": 9148318,

 "cSubId": "ST",

 "iSystem": 1,

 "cName": "memo",

 "cFieldName": "memo",

 "authLevel": 3,

 "cDataSourceName": "st.othinrecord.OthInRecord",

 "enterDirection": 4,

 "bEnableFormat": false

 },

 {

 "cItemName": "headItem!define1",

 "cCaption": "表头自定义项1",

 "cCaptionResid": "P_YS_PF_PRINT_0000057792",

 "cShowCaption": "仓库1",

 "cShowCaptionResid": "C_YS_PF_GZTBDM_0000KRO9UW4WFX42RO0000_0000435305",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": false,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": false,

 "iMaxShowLen": 255,

 "iColWidth": 150,

 "cSumType": "support",

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": false,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": true,

 "cSelfDefineType": "headDefine1",

 "cControlType": "Input",

 "iOrder": 331,

 "bMain": true,

 "cStyle": "{\"examples\":\"文字内容示例\",\"explains_ori\":\"文本型自定义项\",\"explains\":\"文本型自定义项\"}",

 "id": 1849710500065545,

 "bVmExclude": 0,

 "iBillTplGroupId": 193877109960,

 "iBillId": 1008594310,

 "iBillEntityId": 14709957,

 "iTplId": 9148318,

 "cSubId": "ST",

 "iSystem": 1,

 "cName": "headItem!define1",

 "cFieldName": "headItem.define1",

 "authLevel": 3,

 "cDataSourceName": "st.othinrecord.OthInRecord",

 "enterDirection": 4,

 "bEnableFormat": false

 },

 {

 "cItemName": "headItem!define2",

 "cCaption": "表头自定义项2",

 "cCaptionResid": "P_YS_PF_PRINT_0000057791",

 "cShowCaption": "小黄自定义项",

 "cShowCaptionResid": "C_YS_PF_GZTBDM_0000KRO9UW4WFX42RO0000_1432136211891748864",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": false,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": false,

 "iMaxShowLen": 255,

 "iColWidth": 150,

 "cSumType": "support",

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": false,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": true,

 "cSelfDefineType": "headDefine2",

 "cControlType": "Input",

 "iOrder": 332,

 "bMain": true,

 "cStyle": "{\"examples\":\"文字内容示例\",\"explains_ori\":\"文本型自定义项\",\"explains\":\"文本型自定义项\"}",

 "id": 1849710500065546,

 "bVmExclude": 0,

 "iBillTplGroupId": 193877109960,

 "iBillId": 1008594310,

 "iBillEntityId": 14709957,

 "iTplId": 9148318,

 "cSubId": "ST",

 "iSystem": 1,

 "cName": "headItem!define2",

 "cFieldName": "headItem.define2",

 "authLevel": 3,

 "cDataSourceName": "st.othinrecord.OthInRecord",

 "enterDirection": 4,

 "bEnableFormat": false

 },

 {

 "cItemName": "headItem!define3",

 "cCaption": "表头自定义项3",

 "cCaptionResid": "P_YS_PF_PRINT_0000057790",

 "cShowCaption": "表头自定义项一",

 "cShowCaptionResid": "C_YS_PF_GZTBDM_0000KRO9UW4WFX42RO0000_1433685501071065088",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": false,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": false,

 "iMaxShowLen": 255,

 "iColWidth": 150,

 "cSumType": "support",

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": false,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": true,

 "cSelfDefineType": "headDefine3",

 "cControlType": "Input",

 "iOrder": 333,

 "bMain": true,

 "cStyle": "{\"examples\":\"文字内容示例\",\"explains_ori\":\"文本型自定义项\",\"explains\":\"文本型自定义项\"}",

 "id": 1849710500065547,

 "bVmExclude": 0,

 "iBillTplGroupId": 193877109960,

 "iBillId": 1008594310,

 "iBillEntityId": 14709957,

 "iTplId": 9148318,

 "cSubId": "ST",

 "iSystem": 1,

 "cName": "headItem!define3",

 "cFieldName": "headItem.define3",

 "authLevel": 3,

 "cDataSourceName": "st.othinrecord.OthInRecord",

 "enterDirection": 4,

 "bEnableFormat": false

 },

 {

 "cItemName": "othInRecords_product_cCode",

 "cCaption": "物料编码",

 "cCaptionResid": "P_YS_PF_PRINT_0000065042",

 "cShowCaption": "物料编码",

 "cShowCaptionResid": "P_YS_PF_PRINT_0000065042",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": false,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 255,

 "iColWidth": 150,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "refer",

 "cRefType": "aa_nomalproduct",

 "cRefRetId": "{\"product\":\"id\",\r\n\"product_cName\":\"cName\",\r\n\"productsku\":\"productskus_id\",\r\n\"productsku_cCode\":\"productskus_cCode\",\r\n\"productsku_cName\":\"skuName\",\r\n\"product_oUnitId\":\"oUnitId\",\r\n\"unit\":\"productOfflineRetail_storeOrderUnit\",\r\n\"product_productOfflineRetail_purchaseUnit\":\"purchaseUnit\",\r\n\"unit_name\":\"purchaseUnit_name\",\r\n\"invExchRate\":\"purchaseRate\",\r\n\"productOfflineRetail_purchaseRate\":\"purchaseRate\",\r\n\"taxRate\":\"productOfflineRetail_inputTax\",\r\n\"product_primeCosts\":\"primeCosts\",\r\n\"productsku_primeCosts\":\"productskus_primeCosts\",\r\n\"isBatchManage\":\"productOfflineRetail_isBatchManage\",\r\n\"isSerialNoManage\":\"productOfflineRetail_isSerialNoManage\",\r\n\"isExpiryDateManage\":\"productOfflineRetail_isExpiryDateManage\",\r\n\"expireDateNo\":\"productOfflineRetail_expireDateNo\",\r\n\"expireDateUnit\":\"productOfflineRetail_expireDateUnit\",\r\n\"free@1@@10\":\"retailskus!free@1@@10\",\r\n\"skudefine@1@@60\":\"productSkuProps!define@1@@60\",\r\n\"prodefine@1@@30\":\"productProps!define@1@@30\",\r\n\"propertiesValue\":\"propertiesValue\",\r\n\"product_modelDescription\":\"modelDescription\",\r\n\"productskus_modelDescription\":\"productskus_modelDescription\"}",

 "refReturn": "cCode",

 "iOrder": 760,

 "bMain": true,

 "id": 1849710500065618,

 "bVmExclude": 0,

 "iBillTplGroupId": 193877109960,

 "iBillId": 1008594310,

 "iBillEntityId": 14709957,

 "iTplId": 9148318,

 "cSubId": "ST",

 "iSystem": 1,

 "cName": "othInRecords_product_cCode",

 "cFieldName": "othInRecords.product.cCode",

 "authLevel": 3,

 "cDataSourceName": "st.othinrecord.OthInRecords",

 "enterDirection": 4,

 "bEnableFormat": false

 },

 {

 "cItemName": "othInRecords_product_cName",

 "cCaption": "物料名称",

 "cCaptionResid": "P_YS_PF_PRINT_0000065262",

 "cShowCaption": "物料名称",

 "cShowCaptionResid": "P_YS_PF_PRINT_0000065262",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": false,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": false,

 "iMaxShowLen": 255,

 "iColWidth": 200,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "refer",

 "cRefType": "aa_nomalproduct",

 "cRefRetId": "{\"product\":\"id\",\r\n\"product_cName\":\"cName\",\r\n\"productsku\":\"productskus_id\",\r\n\"productsku_cCode\":\"productskus_cCode\",\r\n\"productsku_cName\":\"skuName\",\r\n\"product_oUnitId\":\"oUnitId\",\r\n\"unit\":\"productOfflineRetail_storeOrderUnit\",\r\n\"product_productOfflineRetail_purchaseUnit\":\"purchaseUnit\",\r\n\"unit_name\":\"purchaseUnit_name\",\r\n\"invExchRate\":\"purchaseRate\",\r\n\"productOfflineRetail_purchaseRate\":\"purchaseRate\",\r\n\"taxRate\":\"productOfflineRetail_inputTax\",\r\n\"product_primeCosts\":\"primeCosts\",\r\n\"productsku_primeCosts\":\"productskus_primeCosts\",\r\n\"isBatchManage\":\"productOfflineRetail_isBatchManage\",\r\n\"isSerialNoManage\":\"productOfflineRetail_isSerialNoManage\",\r\n\"isExpiryDateManage\":\"productOfflineRetail_isExpiryDateManage\",\r\n\"expireDateNo\":\"productOfflineRetail_expireDateNo\",\r\n\"expireDateUnit\":\"productOfflineRetail_expireDateUnit\",\r\n\"free@1@@10\":\"retailskus!free@1@@10\",\r\n\"skudefine@1@@60\":\"productSkuProps!define@1@@60\",\r\n\"prodefine@1@@30\":\"productProps!define@1@@30\",\r\n\"propertiesValue\":\"propertiesValue\",\r\n\"product_modelDescription\":\"modelDescription\",\r\n\"productskus_modelDescription\":\"productskus_modelDescription\"}",

 "refReturn": "cName",

 "iOrder": 770,

 "bMain": true,

 "id": 1849710500065619,

 "bVmExclude": 0,

 "iBillTplGroupId": 193877109960,

 "iBillId": 1008594310,

 "iBillEntityId": 14709957,

 "iTplId": 9148318,

 "cSubId": "ST",

 "iSystem": 1,

 "cName": "othInRecords_product_cName",

 "cFieldName": "othInRecords.product.cName",

 "authLevel": 3,

 "cDataSourceName": "st.othinrecord.OthInRecords",

 "enterDirection": 4,

 "bEnableFormat": false

 },

 {

 "cItemName": "othInRecords_qty",

 "cCaption": "主计量数量",

 "cCaptionResid": "P_YS_SD_UDHWS_0000066531",

 "cShowCaption": "数量",

 "cShowCaptionResid": "P_YS_FED_EXAMP_0000020130",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": false,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "iNumPoint": 8,

 "bCanModify": true,

 "iMaxShowLen": 255,

 "iColWidth": 150,

 "cSumType": "SUM",

 "iAlign": 3,

 "bNeedSum": true,

 "bShowIt": true,

 "bFilter": true,

 "cFormatData": "{\"related\":\"unit_Precision\"}",

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "InputNumber",

 "iOrder": 806,

 "bMain": true,

 "id": 1849710500065623,

 "bVmExclude": 0,

 "iBillTplGroupId": 193877109960,

 "iBillId": 1008594310,

 "iBillEntityId": 14709957,

 "iTplId": 9148318,

 "cSubId": "ST",

 "iSystem": 1,

 "cName": "othInRecords_qty",

 "cFieldName": "othInRecords.qty",

 "authLevel": 3,

 "cDataSourceName": "st.othinrecord.OthInRecords",

 "enterDirection": 4,

 "bEnableFormat": false

 },

 {

 "cItemName": "othInRecords_unit_name",

 "cCaption": "计量单位",

 "cCaptionResid": "P_YS_PF_GZTSYS_0000012671",

 "cShowCaption": "计量单位",

 "cShowCaptionResid": "P_YS_PF_GZTSYS_0000012671",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": false,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": false,

 "iMaxShowLen": 255,

 "iColWidth": 150,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "refer",

 "cRefType": "aa_productunit",

 "cRefRetId": "{\"unit\":\"id\"}",

 "refReturn": "name",

 "iOrder": 809,

 "bMain": true,

 "id": 1849710500065627,

 "bVmExclude": 0,

 "iBillTplGroupId": 193877109960,

 "iBillId": 1008594310,

 "iBillEntityId": 14709957,

 "iTplId": 9148318,

 "cSubId": "ST",

 "iSystem": 1,

 "cName": "othInRecords_unit_name",

 "cFieldName": "othInRecords.unit.name",

 "authLevel": 3,

 "cDataSourceName": "st.othinrecord.OthInRecords",

 "enterDirection": 4,

 "bEnableFormat": false

 },

 {

 "cItemName": "bodyItem!define5",

 "cCaption": "表体自定义项5",

 "cCaptionResid": "P_YS_PF_PRINT_0000057624",

 "cShowCaption": "自定义项5",

 "cShowCaptionResid": "C_YS_PF_GZTBDM_0000KRO9UW4WFX42RO0000_0000409932",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": false,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 255,

 "iColWidth": 150,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": true,

 "cSelfDefineType": "bodyDefine5",

 "cControlType": "Input",

 "iOrder": 1020,

 "bMain": true,

 "cStyle": "{\"examples\":\"文字内容示例\",\"explains_ori\":\"文本型自定义项\",\"explains\":\"文本型自定义项\"}",

 "id": 1849710500065640,

 "bVmExclude": 0,

 "iBillTplGroupId": 193877109960,

 "iBillId": 1008594310,

 "iBillEntityId": 14709957,

 "iTplId": 9148318,

 "cSubId": "ST",

 "iSystem": 1,

 "cName": "bodyItem!define5",

 "cFieldName": "othInRecords.bodyItem.define5",

 "authLevel": 3,

 "cDataSourceName": "st.othinrecord.OthInRecords",

 "enterDirection": 4,

 "bEnableFormat": false

 },

 {

 "cItemName": "bodyItem!define6",

 "cCaption": "表体自定义项6",

 "cCaptionResid": "P_YS_PF_PRINT_0000057622",

 "cShowCaption": "自定义项6",

 "cShowCaptionResid": "C_YS_PF_GZTBDM_0000KRO9UW4WFX42RO0000_0000434861",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": true,

 "cEnumString": "{\n \"true\": \"是\",\n \"false\": \"否\"\n}",

 "bMustSelect": false,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 255,

 "iColWidth": 150,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": true,

 "cSelfDefineType": "bodyDefine6",

 "cControlType": "Select",

 "iOrder": 1030,

 "bMain": true,

 "cStyle": "{\"examples\":\"true\",\"explains_ori\":\"布尔型自定义项,是的话填写 true,否的话填写 false\",\"explains\":\"布尔型自定义项,是的话填写“true”,否的话填写“false”\"}",

 "id": 1849710500065641,

 "bVmExclude": 0,

 "iBillTplGroupId": 193877109960,

 "iBillId": 1008594310,

 "iBillEntityId": 14709957,

 "iTplId": 9148318,

 "cSubId": "ST",

 "iSystem": 1,

 "cName": "bodyItem!define6",

 "cFieldName": "othInRecords.bodyItem.define6",

 "authLevel": 3,

 "cDataSourceName": "st.othinrecord.OthInRecords",

 "enterDirection": 4,

 "cEnumType": "aa_boolean",

 "enumArray": "[\n {\n \"nameType\": \"text\",\n \"icon\": null,\n \"cDataRule\": null,\n \"value\": \"是\",\n \"resid\": \"P_YS_FED_EXAMP_0000020600\",\n \"key\": \"true\"\n },\n {\n \"nameType\": \"text\",\n \"icon\": null,\n \"cDataRule\": null,\n \"value\": \"否\",\n \"resid\": \"P_YS_FED_EXAMP_0000020344\",\n \"key\": \"false\"\n }\n]",

 "bEnableFormat": false

 },

 {

 "cItemName": "bodyItem!define7",

 "cCaption": "表体自定义项7",

 "cCaptionResid": "P_YS_PF_PRINT_0000057631",

 "cShowCaption": "自定义项7",

 "cShowCaptionResid": "C_YS_PF_GZTBDM_0000KRO9UW4WFX42RO0000_0000435347",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": false,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 255,

 "iColWidth": 150,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": true,

 "cSelfDefineType": "bodyDefine7",

 "cControlType": "ListRefer",

 "cRefType": "u8c-userdefine.pb_userdefine",

 "cRefRetId": "{\"bodyItem!define7\":\"name\",\"bodyItem!define7\":\"id\"}",

 "refReturn": "name",

 "iOrder": 1040,

 "bMain": true,

 "cStyle": "{\"examples\":\"自定义枚举的参照名称\",\"explains_ori\":\"自定义枚举型自定义项,参照自定义枚举的参照名称填写\",\"explains\":\"自定义枚举型自定义项,参照自定义枚举的参照名称填写\"}",

 "id": 1849710500065642,

 "bVmExclude": 0,

 "iBillTplGroupId": 193877109960,

 "iBillId": 1008594310,

 "iBillEntityId": 14709957,

 "iTplId": 9148318,

 "cSubId": "ST",

 "iSystem": 1,

 "cName": "bodyItem!define7",

 "cFieldName": "othInRecords.bodyItem.define7",

 "authLevel": 3,

 "cDataSourceName": "st.othinrecord.OthInRecords",

 "enterDirection": 4,

 "bEnableFormat": false

 },

 {

 "cItemName": "bodyItem!define8_name",

 "cCaption": "表体自定义项8",

 "cCaptionResid": "P_YS_PF_PRINT_0000057630",

 "cShowCaption": "自定义项8",

 "cShowCaptionResid": "C_YS_PF_GZTBDM_0000KRO9UW4WFX42RO0000_0000435354",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": false,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 255,

 "iColWidth": 150,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": true,

 "cSelfDefineType": "bodyDefine8",

 "cControlType": "refer",

 "cRefType": "ucfbasedoc.0003",

 "cRefRetId": "{\"bodyItem!define8\":\"id\"}",

 "refReturn": "name",

 "iOrder": 1050,

 "bMain": true,

 "cStyle": "{\"examples\":\"ZDY00001\",\"explains_ori\":\"自定义档案型自定义项,参照自定义档案值的编码填写\",\"explains\":\"自定义档案型自定义项,参照自定义档案值的编码填写\"}",

 "id": 1849710555487045,

 "bVmExclude": 0,

 "iBillTplGroupId": 193877109960,

 "iBillId": 1008594310,

 "iBillEntityId": 14709957,

 "iTplId": 9148318,

 "cSubId": "ST",

 "iSystem": 1,

 "cName": "bodyItem!define8_name",

 "cFieldName": "othInRecords.bodyItem.define8.name",

 "authLevel": 3,

 "cDataSourceName": "st.othinrecord.OthInRecords",

 "enterDirection": 4,

 "bEnableFormat": false

 },

 {

 "cItemName": "bodyItem!define17",

 "cCaption": "表体自定义项17",

 "cCaptionResid": "P_YS_PF_PRINT_0000057556",

 "cShowCaption": "自定义文本测试",

 "cShowCaptionResid": "C_YS_PF_GZTBDM_0000KRO9UW4WFX42RO0000_1434948238646968320",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": false,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 255,

 "iColWidth": 150,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": true,

 "cSelfDefineType": "bodyDefine17",

 "cControlType": "Input",

 "iOrder": 1140,

 "bMain": true,

 "cStyle": "{\"examples\":\"文字内容示例\",\"explains_ori\":\"文本型自定义项\",\"explains\":\"文本型自定义项\"}",

 "id": 1849710500065652,

 "bVmExclude": 0,

 "iBillTplGroupId": 193877109960,

 "iBillId": 1008594310,

 "iBillEntityId": 14709957,

 "iTplId": 9148318,

 "cSubId": "ST",

 "iSystem": 1,

 "cName": "bodyItem!define17",

 "cFieldName": "othInRecords.bodyItem.define17",

 "authLevel": 3,

 "cDataSourceName": "st.othinrecord.OthInRecords",

 "enterDirection": 4,

 "bEnableFormat": false

 }],

 "iBillEntityId": 14709957

 }],

 "templateType": "FilterList"

 },

 "extscripturls": [],

 "isCoded": false,

 "bFuncAuthControl": false,

 "pubts": "2022-05-07 19:01:18",

 "vmName": "ST_st_othinrecordlist_VM",

 "extendFileName": "ST_st_othinrecordlist_VM.Extend.js",

 "extendVmName": "ST_st_othinrecordlist_VM_Extend"

 },

 "vm": "\n //voucherlist\n \n console.info('%c ST_st_othinrecordlist_VM js init, yon can debug it by setting the [window.__debugger = true]', 'color:steelblue');\n if (window && window.__debugger) debugger;\n cb.viewmodels.register('ST_st_othinrecordlist_VM', function (modelType) {\n\n var model = function (data) {\n cb.models.ContainerModel.call(this,data);\n this.init();\n };\n model.prototype = cb.utils.getPrototype(cb.models.ContainerModel.prototype);\n model.prototype.modelType = modelType;\n\n model.prototype.init = function () {\n console.info('%c ST_st_othinrecordlist_VM js viewmodel init, yon can debug it by setting the [window.__debugger_init = true]', 'color:steelblue');\n if (window && window.__debugger_init) debugger;\n var _this = this;\n var fields = {\n \n \n 'btnAddDrop':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnAddDrop\",\"cCaption\":\"新增\",\"cCaptionResid\":\"P_YS_FED_FW_0000021020\",\"cShowCaption\":\"新增\",\"cShowCaptionResid\":\"P_YS_FED_FW_0000021020\",\"bEnum\":false,\"cControlType\":\"dropdownbutton\",\"iStyle\":0,\"cCommand\":\"cmdAddDrop\",\"cParameter\":\"{\\\"displaymode\\\":\\\"button\\\",\\\"action\\\":\\\"add\\\"}\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407206\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnAdd':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnAdd\",\"cCaption\":\"空白单据\",\"cCaptionResid\":\"P_YS_SCM_USTOCK-UI_0000174216\",\"cShowCaption\":\"空白单据\",\"cShowCaptionResid\":\"P_YS_SCM_USTOCK-UI_0000174216\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cParent\":\"1849710493407206\",\"cCommand\":\"cmdAdd\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407196\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'spliter':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"spliter\",\"bEnum\":false,\"cControlType\":\"spliter\",\"iStyle\":0,\"cCommand\":\"spliter\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407220\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnExport':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnExport\",\"cCaption\":\"导出所选记录\",\"cCaptionResid\":\"P_YS_PF_GZTTMP_0000079981\",\"cShowCaption\":\"导出所选记录\",\"cShowCaptionResid\":\"P_YS_PF_GZTTMP_0000079981\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cParent\":\"1849710493407208\",\"cCommand\":\"cmdExport\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407202\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnBatchSubmitDrop':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnBatchSubmitDrop\",\"cCaption\":\"提交\",\"cCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024984\",\"cShowCaption\":\"提交\",\"cShowCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024984\",\"bEnum\":false,\"cControlType\":\"dropdownbutton\",\"iStyle\":0,\"cCommand\":\"cmdSubmit\",\"cParameter\":\"{\\\"displaymode\\\":\\\"button\\\"}\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407231\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnBatchSubmit':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnBatchSubmit\",\"cCaption\":\"提交\",\"cCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024984\",\"cShowCaption\":\"提交\",\"cShowCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024984\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cParent\":\"1849710493407231\",\"cCommand\":\"cmdSubmit\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407232\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnBatchUnsubmit':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnBatchUnsubmit\",\"cCaption\":\"撤回\",\"cCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000025104\",\"cShowCaption\":\"撤回\",\"cShowCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000025104\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cParent\":\"1849710493407231\",\"cCommand\":\"cmdUnsubmit\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407233\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnBatchAuditDrop':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnBatchAuditDrop\",\"cCaption\":\"审核\",\"cCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024727\",\"cShowCaption\":\"审核\",\"cShowCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024727\",\"bEnum\":false,\"cControlType\":\"dropdownbutton\",\"iStyle\":0,\"cCommand\":\"cmdAudit\",\"cParameter\":\"{\\\"displaymode\\\":\\\"button\\\"}\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407234\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnBatchAudit':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnBatchAudit\",\"cCaption\":\"审核\",\"cCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024727\",\"cShowCaption\":\"审核\",\"cShowCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024727\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cParent\":\"1849710493407234\",\"cCommand\":\"cmdAudit\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407235\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnBatchUnaudit':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnBatchUnaudit\",\"cCaption\":\"弃审\",\"cCaptionResid\":\"P_YS_PF_PROCENTER_0000027468\",\"cShowCaption\":\"弃审\",\"cShowCaptionResid\":\"P_YS_PF_PROCENTER_0000027468\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cParent\":\"1849710493407234\",\"cCommand\":\"cmdUnaudit\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407236\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'spliter':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"spliter\",\"bEnum\":false,\"cControlType\":\"spliter\",\"iStyle\":0,\"cCommand\":\"spliter\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407227\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'spliter':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"spliter\",\"bEnum\":false,\"cControlType\":\"spliter\",\"iStyle\":0,\"cCommand\":\"spliter\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407228\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'spliter':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"spliter\",\"bEnum\":false,\"cControlType\":\"spliter\",\"iStyle\":0,\"cCommand\":\"spliter\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407229\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'spliter':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"spliter\",\"bEnum\":false,\"cControlType\":\"spliter\",\"iStyle\":0,\"cCommand\":\"spliter\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407237\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'spliter':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"spliter\",\"bEnum\":false,\"cControlType\":\"spliter\",\"iStyle\":0,\"cCommand\":\"spliter\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407230\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnExport1':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnExport1\",\"cCaption\":\"导出查询结果\",\"cCaptionResid\":\"P_YS_PF_GZTTMP_0000079931\",\"cShowCaption\":\"导出查询结果\",\"cShowCaptionResid\":\"P_YS_PF_GZTTMP_0000079931\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cParent\":\"1849710493407208\",\"cCommand\":\"cmdExport1\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407213\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnImport':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnImport\",\"cCaption\":\"导入\",\"cCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024986\",\"cShowCaption\":\"导入\",\"cShowCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024986\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cParent\":\"1849710493407209\",\"cCommand\":\"cmdImport\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407199\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'spliter':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"spliter\",\"bEnum\":false,\"cControlType\":\"spliter\",\"iStyle\":0,\"cCommand\":\"spliter\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407207\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnTempexport':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnTempexport\",\"cCaption\":\"模板下载\",\"cCaptionResid\":\"P_YS_PF_PROCENTER_0000027470\",\"cShowCaption\":\"模板下载\",\"cShowCaptionResid\":\"P_YS_PF_PROCENTER_0000027470\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cParent\":\"1849710493407209\",\"cCommand\":\"cmdTempexport\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407200\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'spliter':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"spliter\",\"bEnum\":false,\"cControlType\":\"spliter\",\"iStyle\":0,\"cCommand\":\"spliter\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407214\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnPrintDrop':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnPrintDrop\",\"cCaption\":\"打印\",\"cCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000025433\",\"cShowCaption\":\"打印\",\"cShowCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000025433\",\"bEnum\":false,\"cControlType\":\"dropdownbutton\",\"iStyle\":0,\"cCommand\":\"cmdPrint\",\"cParameter\":\"{\\\"displaymode\\\":\\\"button\\\"}\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407215\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnPrintReview':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnPrintReview\",\"cCaption\":\"打印预览\",\"cCaptionResid\":\"P_YS_PF_PROCENTER_0000027569\",\"cShowCaption\":\"打印预览\",\"cShowCaptionResid\":\"P_YS_PF_PROCENTER_0000027569\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cParent\":\"1849710493407215\",\"cCommand\":\"cmdPrint\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407216\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnPrintNow':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnPrintNow\",\"cCaption\":\"直接打印\",\"cCaptionResid\":\"P_YS_PF_PROCENTER_0000027368\",\"cShowCaption\":\"直接打印\",\"cShowCaptionResid\":\"P_YS_PF_PROCENTER_0000027368\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cParent\":\"1849710493407215\",\"cCommand\":\"cmdPrintNow\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407217\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnExportDrop':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnExportDrop\",\"cCaption\":\"导出\",\"cCaptionResid\":\"P_YS_FED_IMP_IOT0000007727\",\"cShowCaption\":\"导出\",\"cShowCaptionResid\":\"P_YS_FED_IMP_IOT0000007727\",\"bEnum\":false,\"cControlType\":\"dropdownbutton\",\"iStyle\":0,\"cCommand\":\"cmdExportDrop\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407208\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnImportDrop':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnImportDrop\",\"cCaption\":\"导入\",\"cCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024986\",\"cShowCaption\":\"导入\",\"cShowCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024986\",\"bEnum\":false,\"cControlType\":\"dropdownbutton\",\"iStyle\":0,\"cCommand\":\"cmdImportDrop\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407209\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnAddLendIn':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnAddLendIn\",\"cCaption\":\"借入入库\",\"cCaptionResid\":\"P_YS_SCM_USTOCK-UI_0001318046\",\"cShowCaption\":\"借入入库\",\"cShowCaptionResid\":\"P_YS_SCM_USTOCK-UI_0001318046\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cParent\":\"1849710493407206\",\"cCommand\":\"cmdAdd\",\"bVmExclude\":0,\"iOrder\":28,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710499326132\",\"cExtProps\":\"{\\\"iOrder\\\":28.0}\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'spliter':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"spliter\",\"bEnum\":false,\"cControlType\":\"spliter\",\"iStyle\":0,\"cCommand\":\"spliter\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407210\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnAddOrderLendrecord':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnAddOrderLendrecord\",\"cCaption\":\"借出归还入库\",\"cCaptionResid\":\"P_YS_SCM_UIT_0001264492\",\"cShowCaption\":\"借出归还入库\",\"cShowCaptionResid\":\"P_YS_SCM_UIT_0001264492\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cParent\":\"1849710493407206\",\"cCommand\":\"cmdPullLendrecord\",\"bVmExclude\":0,\"iOrder\":30,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710495008383\",\"cExtProps\":\"{\\\"iOrder\\\":30.0}\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnBatchDelete':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnBatchDelete\",\"cCaption\":\"删除\",\"cCaptionResid\":\"P_YS_FED_IMP_IOT0000008165\",\"cShowCaption\":\"删除\",\"cShowCaptionResid\":\"P_YS_FED_IMP_IOT0000008165\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cCommand\":\"cmdBatchDelete\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407211\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'spliter2OpenReport':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"spliter2OpenReport\",\"bEnum\":false,\"cControlType\":\"spliter\",\"iStyle\":0,\"cCommand\":\"spliter\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407219\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnOpenReport':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnOpenReport\",\"cCaption\":\"即时分析\",\"cCaptionResid\":\"P_YS_FED_FW_0001060913\",\"cShowCaption\":\"即时分析\",\"cShowCaptionResid\":\"P_YS_FED_FW_0001060913\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":2,\"cCommand\":\"cmdOpenReport\",\"cParameter\":\"{\\\"classname\\\":\\\"button-only-icon\\\"}\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407218\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnEdit':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnEdit\",\"cCaption\":\"编辑\",\"cCaptionResid\":\"P_YS_FED_IMP-DFM-FE_0000020875\",\"cShowCaption\":\"编辑\",\"cShowCaptionResid\":\"P_YS_FED_IMP-DFM-FE_0000020875\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cCommand\":\"cmdEdit\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407197\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnDelete':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnDelete\",\"cCaption\":\"删除\",\"cCaptionResid\":\"P_YS_FED_IMP_IOT0000008165\",\"cShowCaption\":\"删除\",\"cShowCaptionResid\":\"P_YS_FED_IMP_IOT0000008165\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cCommand\":\"cmdDelete\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407198\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnAudit':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnAudit\",\"cCaption\":\"审核\",\"cCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024727\",\"cShowCaption\":\"审核\",\"cShowCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024727\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cCommand\":\"cmdAudit\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407238\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnUnaudit':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnUnaudit\",\"cCaption\":\"弃审\",\"cCaptionResid\":\"P_YS_PF_PROCENTER_0000027468\",\"cShowCaption\":\"弃审\",\"cShowCaptionResid\":\"P_YS_PF_PROCENTER_0000027468\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cCommand\":\"cmdUnaudit\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407239\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnSubmit':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnSubmit\",\"cCaption\":\"提交\",\"cCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024984\",\"cShowCaption\":\"提交\",\"cShowCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024984\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cCommand\":\"cmdSubmit\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407240\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnUnsubmit':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnUnsubmit\",\"cCaption\":\"撤回\",\"cCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000025104\",\"cShowCaption\":\"撤回\",\"cShowCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000025104\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cCommand\":\"cmdUnsubmit\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407241\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnWorkflow':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnWorkflow\",\"cCaption\":\"审批流\",\"cCaptionResid\":\"P_YS_FED_FW_0000021634\",\"cShowCaption\":\"审批流\",\"cShowCaptionResid\":\"P_YS_FED_FW_0000021634\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cCommand\":\"cmdWorkflow\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407242\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnCopy':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnCopy\",\"cCaption\":\"复制\",\"cCaptionResid\":\"P_YS_FED_IMP-DFM-FE_0000020886\",\"cShowCaption\":\"复制\",\"cShowCaptionResid\":\"P_YS_FED_IMP-DFM-FE_0000020886\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cCommand\":\"cmdCopy\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407212\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnBodyJointquery':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnBodyJointquery\",\"cCaption\":\"全局联查\",\"cCaptionResid\":\"P_YS_SD_SCMSA-UI_0000162076\",\"cShowCaption\":\"全局联查\",\"cShowCaptionResid\":\"P_YS_SD_SCMSA-UI_0000162076\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cCommand\":\"cmdJointquery\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407221\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnJointquery':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnJointquery\",\"cCaption\":\"联查\",\"cCaptionResid\":\"P_YS_PF_PROCENTER_0000027081\",\"cShowCaption\":\"联查\",\"cShowCaptionResid\":\"P_YS_PF_PROCENTER_0000027081\",\"bEnum\":false,\"cControlType\":\"YSButton\",\"iStyle\":0,\"cCommand\":\"cmdJointquery\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407225\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnShare':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnShare\",\"cCaption\":\"分享\",\"cCaptionResid\":\"P_YS_PF_PROCENTER_0000027482\",\"cShowCaption\":\"分享\",\"cShowCaptionResid\":\"P_YS_PF_PROCENTER_0000027482\",\"bEnum\":false,\"cControlType\":\"YSButton\",\"iStyle\":0,\"cCommand\":\"cmdShare\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407223\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnAttachment':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnAttachment\",\"cCaption\":\"附件\",\"cShowCaption\":\"附件\",\"bEnum\":false,\"cControlType\":\"YSAttachmentButton\",\"iStyle\":2,\"cCommand\":\"cmdAttachment\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"2752796256490382\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnBillsetting':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnBillsetting\",\"cCaption\":\"UI模板\",\"cCaptionResid\":\"P_YS_PF_GZTSYS_0000013482\",\"cShowCaption\":\"UI模板\",\"cShowCaptionResid\":\"P_YS_PF_GZTSYS_0000013482\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cCommand\":\"cmdBillsetting\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"673152087\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnShortCutsHelp':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnShortCutsHelp\",\"cCaption\":\"快捷键帮助\",\"cCaptionResid\":\"P_YS_FW-PUB_MDD-BACK_0001345842\",\"cShowCaption\":\"快捷键帮助\",\"cShowCaptionResid\":\"P_YS_FW-PUB_MDD-BACK_0001345842\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cCommand\":\"cmdShortCutsHelp\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710490220545\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'btnReviewEventLog':new cb.models.SimpleModel({\"fieldRuntimeState\":false,\"cItemName\":\"btnReviewEventLog\",\"cCaption\":\"事件中心联查\",\"cCaptionResid\":\"P_YS_FW-PUB_MDD-BACK_0001523514\",\"cShowCaption\":\"事件中心联查\",\"cShowCaptionResid\":\"P_YS_FW-PUB_MDD-BACK_0001523514\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cCommand\":\"cmdReviewEventLog\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710501849919\",\"domainKey\":\"ustock\",\"needClear\":false}),\n \n \n 'st_othinrecordlist':new cb.models.GridModel({\"domainKey\":\"ustock\",\"columns\":{\"vouchdate\":{\"cFieldName\":\"vouchdate\",\"fieldRuntimeState\":false,\"cItemName\":\"vouchdate\",\"cCaption\":\"单据日期\",\"cCaptionResid\":\"P_YS_PF_PROCENTER_0000022686\",\"cShowCaption\":\"单据日期\",\"cShowCaptionResid\":\"P_YS_PF_PROCENTER_0000022686\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":100,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"cFormatData\":\"YYYY-MM-DD\",\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cOrder\":\"desc\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"DatePicker\",\"cStyle\":\"{\\\"tips\\\":\\\"\\\"}\",\"bVmExclude\":0,\"iOrder\":1,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":true,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065526},\"code\":{\"cFieldName\":\"code\",\"fieldRuntimeState\":false,\"cItemName\":\"code\",\"cCaption\":\"单据编号\",\"cCaptionResid\":\"P_YS_FI_CM_0000030058\",\"cShowCaption\":\"单据编号\",\"cShowCaptionResid\":\"P_YS_FI_CM_0000030058\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":true,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":200,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":true,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cOrder\":\"desc\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"bVmExclude\":0,\"iOrder\":2,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":true,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065525},\"operator\":{\"cFieldName\":\"operator\",\"fieldRuntimeState\":false,\"cItemName\":\"operator\",\"cCaption\":\"业务员ID\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065184\",\"cShowCaption\":\"业务员ID\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065184\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":true,\"bHidden\":true,\"cDataRule\":\"\\\"<%loginUser.docId%>\\\"==\\\"null\\\"\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":200,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"cFormatData\":\"{\\\"decimal\\\":\\\"<%option.amountofdecimal%>\\\"}\",\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"bVmExclude\":0,\"iOrder\":9,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065583},\"operator_name\":{\"cFieldName\":\"operator.name\",\"fieldRuntimeState\":false,\"cItemName\":\"operator_name\",\"cCaption\":\"业务员\",\"cCaptionResid\":\"P_YS_SD_SDMA_0000038452\",\"cShowCaption\":\"业务员\",\"cShowCaptionResid\":\"P_YS_SD_SDMA_0000038452\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":true,\"bHidden\":false,\"cRefType\":\"ucf-staff-center.bd_staff_outer_ref\",\"cRefRetId\":\"{\\\"operator\\\":\\\"id\\\"}\",\"cDataRule\":\"\\\"<%loginUser.docId%>\\\"==\\\"null\\\"\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":200,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"cFormatData\":\"{\\\"decimal\\\":\\\"<%option.amountofdecimal%>\\\"}\",\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Refer\",\"refReturn\":\"name\",\"bVmExclude\":0,\"iOrder\":9,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065584},\"org\":{\"cFieldName\":\"org\",\"fieldRuntimeState\":false,\"cItemName\":\"org\",\"cCaption\":\"库存组织\",\"cCaptionResid\":\"P_YS_FED_FW_0000022291\",\"cShowCaption\":\"库存组织\",\"cShowCaptionResid\":\"P_YS_FED_FW_0000022291\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":true,\"bHidden\":true,\"cDataRule\":\"\\\"<%u8c-config.option.singleOrg%>\\\"==\\\"false\\\"\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":200,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"cFormatData\":\"{\\\"decimal\\\":\\\"<%option.amountofdecimal%>\\\"}\",\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"bVmExclude\":0,\"iOrder\":9,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065585},\"org_name\":{\"cFieldName\":\"org.name\",\"fieldRuntimeState\":false,\"cItemName\":\"org_name\",\"cCaption\":\"库存组织\",\"cCaptionResid\":\"P_YS_FED_FW_0000022291\",\"cShowCaption\":\"库存组织\",\"cShowCaptionResid\":\"P_YS_FED_FW_0000022291\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":true,\"bHidden\":false,\"cRefType\":\"aa_orgtree\",\"cRefRetId\":\"{\\\"org\\\":\\\"id\\\"}\",\"cDataRule\":\"\\\"<%u8c-config.option.singleOrg%>\\\"==\\\"false\\\"\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":200,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Refer\",\"refReturn\":\"name\",\"bVmExclude\":0,\"iOrder\":9,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065586},\"auditDate\":{\"cFieldName\":\"auditDate\",\"fieldRuntimeState\":false,\"cItemName\":\"auditDate\",\"cCaption\":\"审核日期\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057248\",\"cShowCaption\":\"审核日期\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057248\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":200,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":false,\"cFormatData\":\"YYYY-MM-DD\",\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"DatePicker\",\"cStyle\":\"{\\\"tips\\\":\\\"\\\"}\",\"bVmExclude\":0,\"iOrder\":12,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":true,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065762},\"isWfControlled\":{\"cFieldName\":\"isWfControlled\",\"fieldRuntimeState\":false,\"cItemName\":\"isWfControlled\",\"cCaption\":\"是否审批流控制\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065041\",\"cShowCaption\":\"是否审批流控制\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065041\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":true,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":1,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Radio\",\"bVmExclude\":0,\"iOrder\":12,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":true,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065763},\"verifystate\":{\"cFieldName\":\"verifystate\",\"fieldRuntimeState\":false,\"cItemName\":\"verifystate\",\"cCaption\":\"审批状态\",\"cCaptionResid\":\"P_YS_SD_SDMA_0000039189\",\"cShowCaption\":\"审批状态\",\"cShowCaptionResid\":\"P_YS_SD_SDMA_0000039189\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":1,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"select\",\"bVmExclude\":0,\"iOrder\":12,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":true,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065764},\"returncount\":{\"cFieldName\":\"returncount\",\"fieldRuntimeState\":false,\"cItemName\":\"returncount\",\"cCaption\":\"退回次数\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065349\",\"cShowCaption\":\"退回次数\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065349\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":2,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":1,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"input\",\"bVmExclude\":0,\"iOrder\":12,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":true,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065765},\"department\":{\"cFieldName\":\"department\",\"fieldRuntimeState\":false,\"cItemName\":\"department\",\"cCaption\":\"部门\",\"cCaptionResid\":\"P_YS_PF_GZTSYS_0000012557\",\"cShowCaption\":\"部门\",\"cShowCaptionResid\":\"P_YS_PF_GZTSYS_0000012557\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"cDataRule\":\"\\\"<%loginUser.docId%>\\\"==\\\"null\\\"\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":200,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"bVmExclude\":0,\"iOrder\":32,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065715},\"department_name\":{\"cFieldName\":\"department.name\",\"fieldRuntimeState\":false,\"cItemName\":\"department_name\",\"cCaption\":\"部门\",\"cCaptionResid\":\"P_YS_PF_GZTSYS_0000012557\",\"cShowCaption\":\"部门\",\"cShowCaptionResid\":\"P_YS_PF_GZTSYS_0000012557\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"cDataRule\":\"\\\"<%loginUser.docId%>\\\"==\\\"null\\\"\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":200,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"bVmExclude\":0,\"iOrder\":32,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065716},\"department_code\":{\"cFieldName\":\"department.code\",\"fieldRuntimeState\":false,\"cItemName\":\"department_code\",\"cCaption\":\"部门编码\",\"cCaptionResid\":\"P_YS_HR_HRCOREF_0000058206\",\"cShowCaption\":\"部门编码\",\"cShowCaptionResid\":\"P_YS_HR_HRCOREF_0000058206\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"cDataRule\":\"\\\"<%loginUser.docId%>\\\"==\\\"null\\\"\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":200,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"bVmExclude\":0,\"iOrder\":32,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065717},\"othInRecords_inventoryowner_name\":{\"cFieldName\":\"othInRecords.inventoryowner.vendor.name\",\"fieldRuntimeState\":false,\"cItemName\":\"othInRecords_inventoryowner_name\",\"cCaption\":\"货主\",\"cCaptionResid\":\"P_YS_AM_AMC-UI_0000176788\",\"cShowCaption\":\"货主\",\"cShowCaptionResid\":\"P_YS_AM_AMC-UI_0000176788\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"cRefType\":\"aa_inventoryownerref\",\"cRefRetId\":\"{\\\"inventoryowner\\\":\\\"id\\\",\\\"ownertype\\\":\\\"ownertype\\\"}\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":200,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"refer\",\"refReturn\":\"cName\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":51,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710504966699},\"othInRecords_ownertype\":{\"cFieldName\":\"othInRecords.ownertype\",\"fieldRuntimeState\":false,\"cItemName\":\"othInRecords_ownertype\",\"cCaption\":\"货权归属\",\"cCaptionResid\":\"P_YS_SCM_USTOCK-UI_0001448239\",\"cShowCaption\":\"货权归属\",\"cShowCaptionResid\":\"P_YS_SCM_USTOCK-UI_0001448239\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":true,\"cEnumString\":\"{\\n \\\"0\\\": \\\"自有\\\",\\n \\\"1\\\": \\\"供应商\\\"\\n}\",\"enumArray\":\"[\\n {\\n \\\"nameType\\\": \\\"text\\\",\\n \\\"icon\\\": null,\\n \\\"cDataRule\\\": null,\\n \\\"value\\\": \\\"自有\\\",\\n \\\"resid\\\": \\\"P_YS_SCM_USTOCK-UI_0001083443\\\",\\n \\\"key\\\": \\\"0\\\"\\n },\\n {\\n \\\"nameType\\\": \\\"text\\\",\\n \\\"icon\\\": null,\\n \\\"cDataRule\\\": null,\\n \\\"value\\\": \\\"供应商\\\",\\n \\\"resid\\\": \\\"P_YS_PF_GZTSYS_0000012772\\\",\\n \\\"key\\\": \\\"1\\\"\\n }\\n]\",\"cEnumType\":\"stock_ownertype\",\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"select\",\"bVmExclude\":0,\"iOrder\":52,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710504966955},\"store\":{\"cFieldName\":\"store\",\"fieldRuntimeState\":false,\"cItemName\":\"store\",\"cCaption\":\"门店id\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057136\",\"cShowCaption\":\"门店id\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057136\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"cDataRule\":\"\\\"<%productcenter.option.isOpenURetail%>\\\"==\\\"true\\\"\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"bVmExclude\":0,\"iOrder\":311,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065527},\"store_name\":{\"cFieldName\":\"store.name\",\"fieldRuntimeState\":false,\"cItemName\":\"store_name\",\"cCaption\":\"门店\",\"cCaptionResid\":\"P_YS_PF_GZTSYS_0000015903\",\"cShowCaption\":\"门店\",\"cShowCaptionResid\":\"P_YS_PF_GZTSYS_0000015903\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"cRefType\":\"aa_department\",\"cDataRule\":\"\\\"<%productcenter.option.isOpenURetail%>\\\"==\\\"true\\\"\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"refReturn\":\"name\",\"bVmExclude\":0,\"iOrder\":312,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065528},\"warehouse\":{\"cFieldName\":\"warehouse\",\"fieldRuntimeState\":false,\"cItemName\":\"warehouse\",\"cCaption\":\"仓库id\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057456\",\"cShowCaption\":\"仓库id\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057456\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"bVmExclude\":0,\"iOrder\":313,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065529},\"warehouse_name\":{\"cFieldName\":\"warehouse.name\",\"fieldRuntimeState\":false,\"cItemName\":\"warehouse_name\",\"cCaption\":\"仓库\",\"cCaptionResid\":\"P_YS_PF_GZTSYS_0000012561\",\"cShowCaption\":\"仓库\",\"cShowCaptionResid\":\"P_YS_PF_GZTSYS_0000012561\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"cRefType\":\"aa_warehouse\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"refReturn\":\"name\",\"bVmExclude\":0,\"iOrder\":314,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065530},\"bustype\":{\"cFieldName\":\"bustype\",\"fieldRuntimeState\":false,\"cItemName\":\"bustype\",\"cCaption\":\"业务类型id\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057582\",\"cShowCaption\":\"业务类型id\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057582\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":true,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"bVmExclude\":0,\"iOrder\":315,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"isTransTypeKey\":true,\"id\":1849710500065531},\"warehouse_code\":{\"cFieldName\":\"warehouse.code\",\"fieldRuntimeState\":false,\"cItemName\":\"warehouse_code\",\"cCaption\":\"仓库编码\",\"cCaptionResid\":\"P_YS_SD_UDHWS_0000069944\",\"cShowCaption\":\"仓库编码\",\"cShowCaptionResid\":\"P_YS_SD_UDHWS_0000069944\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"cRefType\":\"aa_warehouse\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"refReturn\":\"name\",\"bVmExclude\":0,\"iOrder\":315,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065718},\"bustype_extend_attrs_json\":{\"cFieldName\":\"bustype.extend_attrs_json\",\"fieldRuntimeState\":false,\"cItemName\":\"bustype_extend_attrs_json\",\"cCaption\":\"入库类型\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057966\",\"cShowCaption\":\"入库类型\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057966\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":true,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"bVmExclude\":0,\"iOrder\":315,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065575},\"totalPieces\":{\"cFieldName\":\"totalPieces\",\"fieldRuntimeState\":false,\"cItemName\":\"totalPieces\",\"cCaption\":\"整单件数\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065033\",\"cShowCaption\":\"整单件数\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065033\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":200,\"cSumType\":\"support\",\"bNeedSum\":true,\"bShowIt\":true,\"bFilter\":true,\"cFormatData\":\"{\\\"decimal\\\":\\\"<%option.amountofdecimal%>\\\"}\",\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"bVmExclude\":0,\"iOrder\":316,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065580},\"bustype_name\":{\"cFieldName\":\"bustype.name\",\"fieldRuntimeState\":false,\"cItemName\":\"bustype_name\",\"cCaption\":\"业务类型\",\"cCaptionResid\":\"P_YS_FED_EXAMP_0000019909\",\"cShowCaption\":\"交易类型\",\"cShowCaptionResid\":\"P_YS_PF_GZTSYS_0000012631\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"cRefType\":\"aa_user\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"refReturn\":\"name\",\"bVmExclude\":0,\"iOrder\":316,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065532},\"accountOrg\":{\"cFieldName\":\"accountOrg\",\"fieldRuntimeState\":false,\"cItemName\":\"accountOrg\",\"cCaption\":\"会计主体\",\"cCaptionResid\":\"P_YS_FED_FW_0000022114\",\"cShowCaption\":\"会计主体\",\"cShowCaptionResid\":\"P_YS_FED_FW_0000022114\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"cDataRule\":\"\\\"<%u8c-config.option.singleOrg%>\\\"==\\\"false\\\"\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":200,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"cFormatData\":\"{\\\"decimal\\\":\\\"<%option.amountofdecimal%>\\\"}\",\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"bVmExclude\":0,\"iOrder\":316,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065581},\"accountOrg_name\":{\"cFieldName\":\"accountOrg.name\",\"fieldRuntimeState\":false,\"cItemName\":\"accountOrg_name\",\"cCaption\":\"会计主体\",\"cCaptionResid\":\"P_YS_FED_FW_0000022114\",\"cShowCaption\":\"会计主体\",\"cShowCaptionResid\":\"P_YS_FED_FW_0000022114\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"cRefType\":\"aa_orgtree\",\"cRefRetId\":\"{\\\"accountOrg\\\":\\\"id\\\"}\",\"cDataRule\":\"\\\"<%u8c-config.option.singleOrg%>\\\"==\\\"false\\\"\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":200,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Refer\",\"refReturn\":\"name\",\"bVmExclude\":0,\"iOrder\":316,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065582},\"stockMgr\":{\"cFieldName\":\"stockMgr\",\"fieldRuntimeState\":false,\"cItemName\":\"stockMgr\",\"cCaption\":\"库管员ID\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065376\",\"cShowCaption\":\"库管员ID\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065376\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"cDataRule\":\"\\\"<%loginUser.userType%>\\\"!=\\\"4\\\" && \\\"<%loginUser.userType%>\\\"!=\\\"5\\\"\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":200,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"cFormatData\":\"{\\\"decimal\\\":\\\"<%option.amountofdecimal%>\\\"}\",\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"bVmExclude\":0,\"iOrder\":316,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065578},\"stockMgr_name\":{\"cFieldName\":\"stockMgr.name\",\"fieldRuntimeState\":false,\"cItemName\":\"stockMgr_name\",\"cCaption\":\"库管员\",\"cCaptionResid\":\"P_YS_PF_GZTSYS_0000012963\",\"cShowCaption\":\"库管员\",\"cShowCaptionResid\":\"P_YS_PF_GZTSYS_0000012963\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"cRefType\":\"ucf-staff-center.bd_staff_outer_ref\",\"cRefRetId\":\"{\\\"stockMgr\\\":\\\"id\\\"}\",\"cDataRule\":\"\\\"<%loginUser.userType%>\\\"!=\\\"4\\\" && \\\"<%loginUser.userType%>\\\"!=\\\"5\\\"\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":200,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"cFormatData\":\"{\\\"decimal\\\":\\\"<%option.amountofdecimal%>\\\"}\",\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Refer\",\"refReturn\":\"name\",\"bVmExclude\":0,\"iOrder\":316,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065579},\"status\":{\"cFieldName\":\"status\",\"fieldRuntimeState\":false,\"cItemName\":\"status\",\"cCaption\":\"单据状态\",\"cCaptionResid\":\"P_YS_FI_CM_0000029118\",\"cShowCaption\":\"单据状态\",\"cShowCaptionResid\":\"P_YS_FI_CM_0000029118\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":true,\"cEnumString\":\"{\\n \\\"0\\\": \\\"开立\\\",\\n \\\"3\\\": \\\"审核中\\\",\\n \\\"1\\\": \\\"已审核\\\"\\n}\",\"enumArray\":\"[\\n {\\n \\\"nameType\\\": \\\"text\\\",\\n \\\"icon\\\": null,\\n \\\"cDataRule\\\": null,\\n \\\"value\\\": \\\"开立\\\",\\n \\\"resid\\\": \\\"P_YS_SCM_PU_0000028170\\\",\\n \\\"key\\\": \\\"0\\\"\\n },\\n {\\n \\\"nameType\\\": \\\"text\\\",\\n \\\"icon\\\": null,\\n \\\"cDataRule\\\": null,\\n \\\"value\\\": \\\"审核中\\\",\\n \\\"resid\\\": \\\"P_YS_SCM_PU_0000028406\\\",\\n \\\"key\\\": \\\"3\\\"\\n },\\n {\\n \\\"nameType\\\": \\\"text\\\",\\n \\\"icon\\\": null,\\n \\\"cDataRule\\\": null,\\n \\\"value\\\": \\\"已审核\\\",\\n \\\"resid\\\": \\\"P_YS_SCM_PU_0000028093\\\",\\n \\\"key\\\": \\\"1\\\"\\n }\\n]\",\"cEnumType\":\"othinrecord_status\",\"bMustSelect\":true,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":100,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"select\",\"bVmExclude\":0,\"iOrder\":317,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":true,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065533},\"totalQuantity\":{\"cFieldName\":\"totalQuantity\",\"fieldRuntimeState\":false,\"cItemName\":\"totalQuantity\",\"cCaption\":\"整单数量\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057874\",\"cShowCaption\":\"整单数量\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057874\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":100,\"cSumType\":\"support\",\"bNeedSum\":true,\"bShowIt\":true,\"bFilter\":true,\"cFormatData\":\"{\\\"decimal\\\":\\\"<%option.quantitydecimal%>\\\"}\",\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"InputNumber\",\"bVmExclude\":0,\"iOrder\":317,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":3,\"bEnableFormat\":false,\"id\":1849710500065577},\"creator\":{\"cFieldName\":\"creator\",\"fieldRuntimeState\":false,\"cItemName\":\"creator\",\"cCaption\":\"创建人\",\"cCaptionResid\":\"P_YS_OA_XTTMCENTER_0000035090\",\"cShowCaption\":\"创建人\",\"cShowCaptionResid\":\"P_YS_OA_XTTMCENTER_0000035090\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":100,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"bVmExclude\":0,\"iOrder\":320,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":true,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065534},\"createTime\":{\"cFieldName\":\"createTime\",\"fieldRuntimeState\":false,\"cItemName\":\"createTime\",\"cCaption\":\"创建时间\",\"cCaptionResid\":\"P_YS_OA_XTLCZX_0000030652\",\"cShowCaption\":\"创建时间\",\"cShowCaptionResid\":\"P_YS_OA_XTLCZX_0000030652\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"datetimepicker\",\"bVmExclude\":0,\"iOrder\":321,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":true,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065535},\"modifier\":{\"cFieldName\":\"modifier\",\"fieldRuntimeState\":false,\"cItemName\":\"modifier\",\"cCaption\":\"修改人\",\"cCaptionResid\":\"P_YS_PF_GZTORG_0000035173\",\"cShowCaption\":\"修改人\",\"cShowCaptionResid\":\"P_YS_PF_GZTORG_0000035173\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":100,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"bVmExclude\":0,\"iOrder\":322,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":true,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065536},\"modifyTime\":{\"cFieldName\":\"modifyTime\",\"fieldRuntimeState\":false,\"cItemName\":\"modifyTime\",\"cCaption\":\"修改时间\",\"cCaptionResid\":\"P_YS_PF_GZTORG_0000035405\",\"cShowCaption\":\"修改时间\",\"cShowCaptionResid\":\"P_YS_PF_GZTORG_0000035405\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"datetimepicker\",\"bVmExclude\":0,\"iOrder\":323,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":true,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065537},\"auditor\":{\"cFieldName\":\"auditor\",\"fieldRuntimeState\":false,\"cItemName\":\"auditor\",\"cCaption\":\"审核人\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057037\",\"cShowCaption\":\"审核人\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057037\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":100,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"bVmExclude\":0,\"iOrder\":324,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":true,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065538},\"auditTime\":{\"cFieldName\":\"auditTime\",\"fieldRuntimeState\":false,\"cItemName\":\"auditTime\",\"cCaption\":\"审核时间\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057137\",\"cShowCaption\":\"审核时间\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057137\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"datetimepicker\",\"bVmExclude\":0,\"iOrder\":325,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":true,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065539},\"memo\":{\"cFieldName\":\"memo\",\"fieldRuntimeState\":false,\"cItemName\":\"memo\",\"cCaption\":\"备注\",\"cCaptionResid\":\"P_YS_FI_CM_0000029174\",\"cShowCaption\":\"备注\",\"cShowCaptionResid\":\"P_YS_FI_CM_0000029174\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":200,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"bVmExclude\":0,\"iOrder\":326,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065540},\"id\":{\"cFieldName\":\"id\",\"fieldRuntimeState\":false,\"cItemName\":\"id\",\"cCaption\":\"ID\",\"cShowCaption\":\"ID\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"group\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"bVmExclude\":0,\"iOrder\":327,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065541},\"pubts\":{\"cFieldName\":\"pubts\",\"fieldRuntimeState\":false,\"cItemName\":\"pubts\",\"cCaption\":\"时间戳\",\"cCaptionResid\":\"P_YS_PF_GZTORG_0000035390\",\"cShowCaption\":\"时间戳\",\"cShowCaptionResid\":\"P_YS_PF_GZTORG_0000035390\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":true,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"bVmExclude\":0,\"iOrder\":328,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065542},\"tplid\":{\"cFieldName\":\"tplid\",\"fieldRuntimeState\":false,\"cItemName\":\"tplid\",\"cCaption\":\"模板id\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057169\",\"cShowCaption\":\"模板id\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057169\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"bVmExclude\":0,\"iOrder\":329,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065543},\"headItem!id\":{\"cFieldName\":\"headItem.id\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!id\",\"cCaption\":\"表头自定义项id\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057880\",\"cShowCaption\":\"表头自定义项id\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057880\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"bVmExclude\":0,\"iOrder\":330,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065544},\"lendType\":{\"cFieldName\":\"lendType\",\"fieldRuntimeState\":false,\"cItemName\":\"lendType\",\"cCaption\":\"借用对象类型\",\"cCaptionResid\":\"P_YS_SCM_USTOCK-UI_0001246237\",\"cShowCaption\":\"借用对象类型\",\"cShowCaptionResid\":\"P_YS_SCM_USTOCK-UI_0001246237\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":true,\"cEnumString\":\"{\\n \\\"0\\\": \\\"客户\\\",\\n \\\"2\\\": \\\"供应商\\\"\\n}\",\"enumArray\":\"[\\n {\\n \\\"nameType\\\": \\\"text\\\",\\n \\\"icon\\\": null,\\n \\\"cDataRule\\\": null,\\n \\\"value\\\": \\\"客户\\\",\\n \\\"resid\\\": \\\"P_YS_PF_GZTSYS_0000012583\\\",\\n \\\"key\\\": \\\"0\\\"\\n },\\n {\\n \\\"nameType\\\": \\\"text\\\",\\n \\\"icon\\\": null,\\n \\\"cDataRule\\\": null,\\n \\\"value\\\": \\\"供应商\\\",\\n \\\"resid\\\": \\\"P_YS_PF_GZTSYS_0000012772\\\",\\n \\\"key\\\": \\\"2\\\"\\n }\\n]\",\"cEnumType\":\"lendIn_type\",\"bMustSelect\":true,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":100,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"select\",\"bVmExclude\":0,\"iOrder\":331,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710507197326},\"headItem!define1\":{\"cFieldName\":\"headItem.define1\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define1\",\"cCaption\":\"表头自定义项1\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057792\",\"cShowCaption\":\"仓库1\",\"cShowCaptionResid\":\"C_YS_PF_GZTBDM_0000KRO9UW4WFX42RO0000_0000435305\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine1\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"cStyle\":\"{\\\"examples\\\":\\\"文字内容示例\\\",\\\"explains_ori\\\":\\\"文本型自定义项\\\",\\\"explains\\\":\\\"文本型自定义项\\\"}\",\"bVmExclude\":0,\"iOrder\":331,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065545},\"lendDept\":{\"cFieldName\":\"lendDept\",\"fieldRuntimeState\":false,\"cItemName\":\"lendDept\",\"cCaption\":\"借用部门\",\"cCaptionResid\":\"P_YS_AM_AUM-UI_0001211099\",\"cShowCaption\":\"借用部门\",\"cShowCaptionResid\":\"P_YS_AM_AUM-UI_0001211099\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":true,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"bVmExclude\":0,\"iOrder\":332,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710507199276},\"lendDept_name\":{\"cFieldName\":\"lendDept.name\",\"fieldRuntimeState\":false,\"cItemName\":\"lendDept_name\",\"cCaption\":\"借用对象-部门\",\"cCaptionResid\":\"P_YS_SCM_USTOCK-UI_0001246236\",\"cShowCaption\":\"借用对象\",\"cShowCaptionResid\":\"P_YS_SCM_USTOCK-UI_0001274489\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"cRefType\":\"ucf-org-center.bd_adminorgsharetreeref\",\"cRefRetId\":\"{\\\"lendDept\\\":\\\"id\\\"}\",\"cDataRule\":\"1==2\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"bCheck\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"refReturn\":\"name\",\"bVmExclude\":0,\"iOrder\":332,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710507199948},\"lendSupplier\":{\"cFieldName\":\"lendSupplier\",\"fieldRuntimeState\":false,\"cItemName\":\"lendSupplier\",\"cCaption\":\"借用对象\",\"cCaptionResid\":\"P_YS_SCM_USTOCK-UI_0001274489\",\"cShowCaption\":\"借用对象\",\"cShowCaptionResid\":\"P_YS_SCM_USTOCK-UI_0001274489\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":true,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"bVmExclude\":0,\"iOrder\":332,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710507197742},\"headItem!define2\":{\"cFieldName\":\"headItem.define2\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define2\",\"cCaption\":\"表头自定义项2\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057791\",\"cShowCaption\":\"小黄自定义项\",\"cShowCaptionResid\":\"C_YS_PF_GZTBDM_0000KRO9UW4WFX42RO0000_1432136211891748864\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine2\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"cStyle\":\"{\\\"examples\\\":\\\"文字内容示例\\\",\\\"explains_ori\\\":\\\"文本型自定义项\\\",\\\"explains\\\":\\\"文本型自定义项\\\"}\",\"bVmExclude\":0,\"iOrder\":332,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065546},\"lendSupplier_name\":{\"cFieldName\":\"lendSupplier.name\",\"fieldRuntimeState\":false,\"cItemName\":\"lendSupplier_name\",\"cCaption\":\"借用对象-供应商\",\"cCaptionResid\":\"P_YS_SCM_USTOCK-UI_0001246233\",\"cShowCaption\":\"借用对象\",\"cShowCaptionResid\":\"P_YS_SCM_USTOCK-UI_0001274489\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"cRefType\":\"yssupplier.aa_vendor\",\"cRefRetId\":\"{\\\"lendSupplier\\\":\\\"id\\\"}\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"bCheck\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"refReturn\":\"name\",\"bVmExclude\":0,\"iOrder\":332,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710507198414},\"headItem!define3\":{\"cFieldName\":\"headItem.define3\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define3\",\"cCaption\":\"表头自定义项3\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057790\",\"cShowCaption\":\"表头自定义项一\",\"cShowCaptionResid\":\"C_YS_PF_GZTBDM_0000KRO9UW4WFX42RO0000_1433685501071065088\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine3\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"cStyle\":\"{\\\"examples\\\":\\\"文字内容示例\\\",\\\"explains_ori\\\":\\\"文本型自定义项\\\",\\\"explains\\\":\\\"文本型自定义项\\\"}\",\"bVmExclude\":0,\"iOrder\":333,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065547},\"lendCustom\":{\"cFieldName\":\"lendCustom\",\"fieldRuntimeState\":false,\"cItemName\":\"lendCustom\",\"cCaption\":\"借用客户\",\"cCaptionResid\":\"P_YS_SCM_USTOCK-UI_0001272493\",\"cShowCaption\":\"借用客户\",\"cShowCaptionResid\":\"P_YS_SCM_USTOCK-UI_0001272493\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":true,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"bVmExclude\":0,\"iOrder\":333,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710565840843},\"lendCustom_name\":{\"cFieldName\":\"lendCustom.name\",\"fieldRuntimeState\":false,\"cItemName\":\"lendCustom_name\",\"cCaption\":\"借用对象-客户\",\"cCaptionResid\":\"P_YS_SCM_USTOCK-UI_0001246234\",\"cShowCaption\":\"借用对象\",\"cShowCaptionResid\":\"P_YS_SCM_USTOCK-UI_0001274489\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"cRefType\":\"productcenter.aa_merchantref\",\"cRefRetId\":\"{\\\"lendCustom\\\":\\\"id\\\"}\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"bCheck\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"refReturn\":\"name\",\"bVmExclude\":0,\"iOrder\":333,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710565841521},\"headItem!define4\":{\"cFieldName\":\"headItem.define4\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define4\",\"cCaption\":\"表头自定义项4\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057797\",\"cShowCaption\":\"表头自定义项4\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057797\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"iNumPoint\":8,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine4\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":334,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":3,\"bEnableFormat\":false,\"id\":1849710500065548},\"headItem!define5\":{\"cFieldName\":\"headItem.define5\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define5\",\"cCaption\":\"表头自定义项5\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057795\",\"cShowCaption\":\"表头自定义项5\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057795\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine5\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":335,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065549},\"headItem!define6\":{\"cFieldName\":\"headItem.define6\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define6\",\"cCaption\":\"表头自定义项6\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057794\",\"cShowCaption\":\"表头自定义项6\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057794\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"iNumPoint\":0,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"cFormatData\":\"YYYY-MM-DD HH:mm:ss\",\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine6\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"DateTimePicker\",\"bVmExclude\":0,\"iOrder\":336,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065550},\"headItem!define7\":{\"cFieldName\":\"headItem.define7\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define7\",\"cCaption\":\"表头自定义项7\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057793\",\"cShowCaption\":\"表头自定义项7\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057793\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"iNumPoint\":0,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine7\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":337,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065551},\"headItem!define8\":{\"cFieldName\":\"headItem.define8\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define8\",\"cCaption\":\"表头自定义项8\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057801\",\"cShowCaption\":\"表头自定义项8\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057801\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"iNumPoint\":0,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine8\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":338,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065552},\"headItem!define9\":{\"cFieldName\":\"headItem.define9\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define9\",\"cCaption\":\"表头自定义项9\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057800\",\"cShowCaption\":\"表头自定义项9\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057800\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine9\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":339,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065553},\"headItem!define10\":{\"cFieldName\":\"headItem.define10\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define10\",\"cCaption\":\"表头自定义项10\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000056943\",\"cShowCaption\":\"表头自定义项10\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000056943\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"iNumPoint\":0,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine10\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":340,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065554},\"headItem!define11\":{\"cFieldName\":\"headItem.define11\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define11\",\"cCaption\":\"表头自定义项11\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000056950\",\"cShowCaption\":\"表头自定义项11\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000056950\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"iNumPoint\":0,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine11\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":341,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065555},\"headItem!define12\":{\"cFieldName\":\"headItem.define12\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define12\",\"cCaption\":\"表头自定义项12\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000056949\",\"cShowCaption\":\"表头自定义项12\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000056949\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"iNumPoint\":0,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine12\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":342,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065556},\"headItem!define13\":{\"cFieldName\":\"headItem.define13\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define13\",\"cCaption\":\"表头自定义项13\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000056947\",\"cShowCaption\":\"表头自定义项13\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000056947\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine13\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":343,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065557},\"headItem!define14\":{\"cFieldName\":\"headItem.define14\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define14\",\"cCaption\":\"表头自定义项14\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000056946\",\"cShowCaption\":\"表头自定义项14\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000056946\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine14\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":344,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065558},\"headItem!define15\":{\"cFieldName\":\"headItem.define15\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define15\",\"cCaption\":\"表头自定义项15\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000056963\",\"cShowCaption\":\"表头自定义项15\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000056963\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"iNumPoint\":0,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine15\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":345,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065559},\"headItem!define16\":{\"cFieldName\":\"headItem.define16\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define16\",\"cCaption\":\"表头自定义项16\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000056961\",\"cShowCaption\":\"表头自定义项16\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000056961\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine16\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":346,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065560},\"headItem!define17\":{\"cFieldName\":\"headItem.define17\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define17\",\"cCaption\":\"表头自定义项17\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000056958\",\"cShowCaption\":\"表头自定义项17\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000056958\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine17\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":347,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065561},\"headItem!define18\":{\"cFieldName\":\"headItem.define18\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define18\",\"cCaption\":\"表头自定义项18\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000056956\",\"cShowCaption\":\"表头自定义项18\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000056956\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine18\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":348,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065562},\"headItem!define19\":{\"cFieldName\":\"headItem.define19\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define19\",\"cCaption\":\"表头自定义项19\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000056970\",\"cShowCaption\":\"表头自定义项19\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000056970\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine19\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":349,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065563},\"othInRecords_product_manageClass_code\":{\"cFieldName\":\"othInRecords.product.manageClass.code\",\"fieldRuntimeState\":false,\"cItemName\":\"othInRecords_product_manageClass_code\",\"cCaption\":\"物料分类编码\",\"cCaptionResid\":\"P_YS_PF_PROCENTER_0000023567\",\"cShowCaption\":\"物料分类编码\",\"cShowCaptionResid\":\"P_YS_PF_PROCENTER_0000023567\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"null\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":349,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065761},\"headItem!define20\":{\"cFieldName\":\"headItem.define20\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define20\",\"cCaption\":\"表头自定义项20\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000056906\",\"cShowCaption\":\"表头自定义项20\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000056906\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine20\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":350,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065564},\"org_code\":{\"cFieldName\":\"org.code\",\"fieldRuntimeState\":false,\"cItemName\":\"org_code\",\"cCaption\":\"库存组织编码\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000064970\",\"cShowCaption\":\"库存组织编码\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000064970\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":true,\"bHidden\":false,\"cRefType\":\"aa_orgtree\",\"cRefRetId\":\"{\\\"org\\\":\\\"id\\\"}\",\"cDataRule\":\"\\\"<%u8c-config.option.singleOrg%>\\\"==\\\"false\\\"\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Refer\",\"refReturn\":\"name\",\"bVmExclude\":0,\"iOrder\":350,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065727},\"othInRecords_product_productClass_code\":{\"cFieldName\":\"othInRecords.product.productClass.code\",\"fieldRuntimeState\":false,\"cItemName\":\"othInRecords_product_productClass_code\",\"cCaption\":\"商品分类编码\",\"cCaptionResid\":\"P_YS_PF_PROCENTER_0000023139\",\"cShowCaption\":\"商品分类编码\",\"cShowCaptionResid\":\"P_YS_PF_PROCENTER_0000023139\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":true,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":350,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065728},\"othInRecords_unit_code\":{\"cFieldName\":\"othInRecords.unit.code\",\"fieldRuntimeState\":false,\"cItemName\":\"othInRecords_unit_code\",\"cCaption\":\"计量单位编码\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065598\",\"cShowCaption\":\"计量单位编码\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065598\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":true,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":350,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065729},\"headItem!define21\":{\"cFieldName\":\"headItem.define21\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define21\",\"cCaption\":\"表头自定义项21\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000056905\",\"cShowCaption\":\"表头自定义项21\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000056905\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine21\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":351,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065565},\"headItem!define22\":{\"cFieldName\":\"headItem.define22\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define22\",\"cCaption\":\"表头自定义项22\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000056911\",\"cShowCaption\":\"表头自定义项22\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000056911\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine22\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":352,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065566},\"headItem!define23\":{\"cFieldName\":\"headItem.define23\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define23\",\"cCaption\":\"表头自定义项23\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000056910\",\"cShowCaption\":\"表头自定义项23\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000056910\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine23\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":353,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065567},\"headItem!define24\":{\"cFieldName\":\"headItem.define24\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define24\",\"cCaption\":\"表头自定义项24\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000056908\",\"cShowCaption\":\"表头自定义项24\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000056908\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine24\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":354,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065568},\"headItem!define25\":{\"cFieldName\":\"headItem.define25\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define25\",\"cCaption\":\"表头自定义项25\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000056907\",\"cShowCaption\":\"表头自定义项25\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000056907\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine25\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":355,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065569},\"headItem!define26\":{\"cFieldName\":\"headItem.define26\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define26\",\"cCaption\":\"表头自定义项26\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000056922\",\"cShowCaption\":\"表头自定义项26\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000056922\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine26\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":356,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065570},\"headItem!define27\":{\"cFieldName\":\"headItem.define27\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define27\",\"cCaption\":\"表头自定义项27\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000056920\",\"cShowCaption\":\"表头自定义项27\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000056920\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine27\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":357,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065571},\"headItem!define28\":{\"cFieldName\":\"headItem.define28\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define28\",\"cCaption\":\"表头自定义项28\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000056919\",\"cShowCaption\":\"表头自定义项28\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000056919\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine28\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":358,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065572},\"headItem!define29\":{\"cFieldName\":\"headItem.define29\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define29\",\"cCaption\":\"表头自定义项29\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000056918\",\"cShowCaption\":\"表头自定义项29\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000056918\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine29\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":359,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065573},\"headItem!define30\":{\"cFieldName\":\"headItem.define30\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define30\",\"cCaption\":\"表头自定义项30\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000056923\",\"cShowCaption\":\"表头自定义项30\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000056923\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine30\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":360,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065574},\"headItem!define31\":{\"cFieldName\":\"headItem.define31\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define31\",\"cCaption\":\"表头自定义项31\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065153\",\"cShowCaption\":\"表头自定义项31\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065153\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine31\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065588},\"headItem!define45\":{\"cFieldName\":\"headItem.define45\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define45\",\"cCaption\":\"表头自定义项45\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065130\",\"cShowCaption\":\"表头自定义项45\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065130\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine45\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065596},\"headItem!define49\":{\"cFieldName\":\"headItem.define49\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define49\",\"cCaption\":\"表头自定义项49\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065133\",\"cShowCaption\":\"表头自定义项49\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065133\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine49\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065604},\"headItem!define60\":{\"cFieldName\":\"headItem.define60\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define60\",\"cCaption\":\"表头自定义项60\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065112\",\"cShowCaption\":\"表头自定义项60\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065112\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine60\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065612},\"headItem!define34\":{\"cFieldName\":\"headItem.define34\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define34\",\"cCaption\":\"表头自定义项34\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065157\",\"cShowCaption\":\"表头自定义项34\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065157\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine34\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065589},\"headItem!define38\":{\"cFieldName\":\"headItem.define38\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define38\",\"cCaption\":\"表头自定义项38\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065164\",\"cShowCaption\":\"表头自定义项38\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065164\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine38\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065597},\"headItem!define42\":{\"cFieldName\":\"headItem.define42\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define42\",\"cCaption\":\"表头自定义项42\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065125\",\"cShowCaption\":\"表头自定义项42\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065125\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine42\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065605},\"headItem!define55\":{\"cFieldName\":\"headItem.define55\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define55\",\"cCaption\":\"表头自定义项55\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065143\",\"cShowCaption\":\"表头自定义项55\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065143\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine55\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065613},\"headItem!define32\":{\"cFieldName\":\"headItem.define32\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define32\",\"cCaption\":\"表头自定义项32\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065152\",\"cShowCaption\":\"表头自定义项32\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065152\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine32\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065590},\"headItem!define46\":{\"cFieldName\":\"headItem.define46\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define46\",\"cCaption\":\"表头自定义项46\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065129\",\"cShowCaption\":\"表头自定义项46\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065129\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine46\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065598},\"headItem!define52\":{\"cFieldName\":\"headItem.define52\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define52\",\"cCaption\":\"表头自定义项52\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065137\",\"cShowCaption\":\"表头自定义项52\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065137\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine52\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065606},\"headItem!define56\":{\"cFieldName\":\"headItem.define56\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define56\",\"cCaption\":\"表头自定义项56\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065142\",\"cShowCaption\":\"表头自定义项56\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065142\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine56\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065614},\"headItem!define35\":{\"cFieldName\":\"headItem.define35\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define35\",\"cCaption\":\"表头自定义项35\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065156\",\"cShowCaption\":\"表头自定义项35\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065156\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"iNumPoint\":0,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine35\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065591},\"headItem!define39\":{\"cFieldName\":\"headItem.define39\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define39\",\"cCaption\":\"表头自定义项39\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065163\",\"cShowCaption\":\"表头自定义项39\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065163\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine39\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065599},\"headItem!define50\":{\"cFieldName\":\"headItem.define50\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define50\",\"cCaption\":\"表头自定义项50\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065145\",\"cShowCaption\":\"表头自定义项50\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065145\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine50\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065607},\"headItem!define57\":{\"cFieldName\":\"headItem.define57\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define57\",\"cCaption\":\"表头自定义项57\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065140\",\"cShowCaption\":\"表头自定义项57\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065140\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine57\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065615},\"headItem!define43\":{\"cFieldName\":\"headItem.define43\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define43\",\"cCaption\":\"表头自定义项43\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065124\",\"cShowCaption\":\"表头自定义项43\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065124\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine43\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065592},\"headItem!define47\":{\"cFieldName\":\"headItem.define47\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define47\",\"cCaption\":\"表头自定义项47\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065128\",\"cShowCaption\":\"表头自定义项47\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065128\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine47\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065600},\"headItem!define53\":{\"cFieldName\":\"headItem.define53\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define53\",\"cCaption\":\"表头自定义项53\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065136\",\"cShowCaption\":\"表头自定义项53\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065136\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine53\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065608},\"headItem!define58\":{\"cFieldName\":\"headItem.define58\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define58\",\"cCaption\":\"表头自定义项58\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065139\",\"cShowCaption\":\"表头自定义项58\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065139\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine58\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065616},\"headItem!define36\":{\"cFieldName\":\"headItem.define36\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define36\",\"cCaption\":\"表头自定义项36\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065155\",\"cShowCaption\":\"表头自定义项36\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065155\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine36\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065593},\"headItem!define40\":{\"cFieldName\":\"headItem.define40\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define40\",\"cCaption\":\"表头自定义项40\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065127\",\"cShowCaption\":\"表头自定义项40\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065127\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine40\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065601},\"headItem!define51\":{\"cFieldName\":\"headItem.define51\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define51\",\"cCaption\":\"表头自定义项51\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065138\",\"cShowCaption\":\"表头自定义项51\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065138\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine51\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065609},\"headItem!define44\":{\"cFieldName\":\"headItem.define44\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define44\",\"cCaption\":\"表头自定义项44\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065131\",\"cShowCaption\":\"表头自定义项44\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065131\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine44\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065594},\"headItem!define48\":{\"cFieldName\":\"headItem.define48\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define48\",\"cCaption\":\"表头自定义项48\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065134\",\"cShowCaption\":\"表头自定义项48\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065134\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine48\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065602},\"headItem!define59\":{\"cFieldName\":\"headItem.define59\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define59\",\"cCaption\":\"表头自定义项59\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065147\",\"cShowCaption\":\"表头自定义项59\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065147\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine59\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065610},\"headItem!define33\":{\"cFieldName\":\"headItem.define33\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define33\",\"cCaption\":\"表头自定义项33\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065158\",\"cShowCaption\":\"表头自定义项33\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065158\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine33\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065587},\"headItem!define37\":{\"cFieldName\":\"headItem.define37\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define37\",\"cCaption\":\"表头自定义项37\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065165\",\"cShowCaption\":\"表头自定义项37\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065165\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine37\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065595},\"headItem!define41\":{\"cFieldName\":\"headItem.define41\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define41\",\"cCaption\":\"表头自定义项41\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065126\",\"cShowCaption\":\"表头自定义项41\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065126\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine41\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065603},\"headItem!define54\":{\"cFieldName\":\"headItem.define54\",\"fieldRuntimeState\":false,\"cItemName\":\"headItem!define54\",\"cCaption\":\"表头自定义项54\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065135\",\"cShowCaption\":\"表头自定义项54\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065135\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"headDefine54\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":361,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065611},\"othInRecords_product\":{\"cFieldName\":\"othInRecords.product\",\"fieldRuntimeState\":false,\"cItemName\":\"othInRecords_product\",\"cCaption\":\"物料id\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065114\",\"cShowCaption\":\"物料id\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065114\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":true,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":750,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065617},\"othInRecords_product_cCode\":{\"cFieldName\":\"othInRecords.product.cCode\",\"fieldRuntimeState\":false,\"cItemName\":\"othInRecords_product_cCode\",\"cCaption\":\"物料编码\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065042\",\"cShowCaption\":\"物料编码\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065042\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"cRefType\":\"aa_nomalproduct\",\"cRefRetId\":\"{\\\"product\\\":\\\"id\\\",\\r\\n\\\"product_cName\\\":\\\"cName\\\",\\r\\n\\\"productsku\\\":\\\"productskus_id\\\",\\r\\n\\\"productsku_cCode\\\":\\\"productskus_cCode\\\",\\r\\n\\\"productsku_cName\\\":\\\"skuName\\\",\\r\\n\\\"product_oUnitId\\\":\\\"oUnitId\\\",\\r\\n\\\"unit\\\":\\\"productOfflineRetail_storeOrderUnit\\\",\\r\\n\\\"product_productOfflineRetail_purchaseUnit\\\":\\\"purchaseUnit\\\",\\r\\n\\\"unit_name\\\":\\\"purchaseUnit_name\\\",\\r\\n\\\"invExchRate\\\":\\\"purchaseRate\\\",\\r\\n\\\"productOfflineRetail_purchaseRate\\\":\\\"purchaseRate\\\",\\r\\n\\\"taxRate\\\":\\\"productOfflineRetail_inputTax\\\",\\r\\n\\\"product_primeCosts\\\":\\\"primeCosts\\\",\\r\\n\\\"productsku_primeCosts\\\":\\\"productskus_primeCosts\\\",\\r\\n\\\"isBatchManage\\\":\\\"productOfflineRetail_isBatchManage\\\",\\r\\n\\\"isSerialNoManage\\\":\\\"productOfflineRetail_isSerialNoManage\\\",\\r\\n\\\"isExpiryDateManage\\\":\\\"productOfflineRetail_isExpiryDateManage\\\",\\r\\n\\\"expireDateNo\\\":\\\"productOfflineRetail_expireDateNo\\\",\\r\\n\\\"expireDateUnit\\\":\\\"productOfflineRetail_expireDateUnit\\\",\\r\\n\\\"free@1@@10\\\":\\\"retailskus!free@1@@10\\\",\\r\\n\\\"skudefine@1@@60\\\":\\\"productSkuProps!define@1@@60\\\",\\r\\n\\\"prodefine@1@@30\\\":\\\"productProps!define@1@@30\\\",\\r\\n\\\"propertiesValue\\\":\\\"propertiesValue\\\",\\r\\n\\\"product_modelDescription\\\":\\\"modelDescription\\\",\\r\\n\\\"productskus_modelDescription\\\":\\\"productskus_modelDescription\\\"}\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"refer\",\"refReturn\":\"cCode\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":760,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065618},\"othInRecords_product_cName\":{\"cFieldName\":\"othInRecords.product.cName\",\"fieldRuntimeState\":false,\"cItemName\":\"othInRecords_product_cName\",\"cCaption\":\"物料名称\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065262\",\"cShowCaption\":\"物料名称\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065262\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"cRefType\":\"aa_nomalproduct\",\"cRefRetId\":\"{\\\"product\\\":\\\"id\\\",\\r\\n\\\"product_cName\\\":\\\"cName\\\",\\r\\n\\\"productsku\\\":\\\"productskus_id\\\",\\r\\n\\\"productsku_cCode\\\":\\\"productskus_cCode\\\",\\r\\n\\\"productsku_cName\\\":\\\"skuName\\\",\\r\\n\\\"product_oUnitId\\\":\\\"oUnitId\\\",\\r\\n\\\"unit\\\":\\\"productOfflineRetail_storeOrderUnit\\\",\\r\\n\\\"product_productOfflineRetail_purchaseUnit\\\":\\\"purchaseUnit\\\",\\r\\n\\\"unit_name\\\":\\\"purchaseUnit_name\\\",\\r\\n\\\"invExchRate\\\":\\\"purchaseRate\\\",\\r\\n\\\"productOfflineRetail_purchaseRate\\\":\\\"purchaseRate\\\",\\r\\n\\\"taxRate\\\":\\\"productOfflineRetail_inputTax\\\",\\r\\n\\\"product_primeCosts\\\":\\\"primeCosts\\\",\\r\\n\\\"productsku_primeCosts\\\":\\\"productskus_primeCosts\\\",\\r\\n\\\"isBatchManage\\\":\\\"productOfflineRetail_isBatchManage\\\",\\r\\n\\\"isSerialNoManage\\\":\\\"productOfflineRetail_isSerialNoManage\\\",\\r\\n\\\"isExpiryDateManage\\\":\\\"productOfflineRetail_isExpiryDateManage\\\",\\r\\n\\\"expireDateNo\\\":\\\"productOfflineRetail_expireDateNo\\\",\\r\\n\\\"expireDateUnit\\\":\\\"productOfflineRetail_expireDateUnit\\\",\\r\\n\\\"free@1@@10\\\":\\\"retailskus!free@1@@10\\\",\\r\\n\\\"skudefine@1@@60\\\":\\\"productSkuProps!define@1@@60\\\",\\r\\n\\\"prodefine@1@@30\\\":\\\"productProps!define@1@@30\\\",\\r\\n\\\"propertiesValue\\\":\\\"propertiesValue\\\",\\r\\n\\\"product_modelDescription\\\":\\\"modelDescription\\\",\\r\\n\\\"productskus_modelDescription\\\":\\\"productskus_modelDescription\\\"}\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":200,\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"refer\",\"refReturn\":\"cName\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":770,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065619},\"othInRecords_product_defaultAlbumId\":{\"cFieldName\":\"othInRecords.product.defaultAlbumId\",\"fieldRuntimeState\":false,\"cItemName\":\"othInRecords_product_defaultAlbumId\",\"cCaption\":\"物料首图片\",\"cCaptionResid\":\"P_YS_PF_GZTTMP_0000075917\",\"cShowCaption\":\"物料首图片\",\"cShowCaptionResid\":\"P_YS_PF_GZTTMP_0000075917\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"cRefType\":\"aa_nomalproduct\",\"cRefRetId\":\"{\\\"product\\\":\\\"id\\\",\\r\\n\\\"product_cName\\\":\\\"cName\\\",\\r\\n\\\"productsku\\\":\\\"productskus_id\\\",\\r\\n\\\"productsku_cCode\\\":\\\"productskus_cCode\\\",\\r\\n\\\"productsku_cName\\\":\\\"skuName\\\",\\r\\n\\\"product_oUnitId\\\":\\\"oUnitId\\\",\\r\\n\\\"unit\\\":\\\"productOfflineRetail_storeOrderUnit\\\",\\r\\n\\\"product_productOfflineRetail_purchaseUnit\\\":\\\"purchaseUnit\\\",\\r\\n\\\"unit_name\\\":\\\"purchaseUnit_name\\\",\\r\\n\\\"invExchRate\\\":\\\"purchaseRate\\\",\\r\\n\\\"productOfflineRetail_purchaseRate\\\":\\\"purchaseRate\\\",\\r\\n\\\"taxRate\\\":\\\"productOfflineRetail_inputTax\\\",\\r\\n\\\"product_primeCosts\\\":\\\"primeCosts\\\",\\r\\n\\\"productsku_primeCosts\\\":\\\"productskus_primeCosts\\\",\\r\\n\\\"isBatchManage\\\":\\\"productOfflineRetail_isBatchManage\\\",\\r\\n\\\"isSerialNoManage\\\":\\\"productOfflineRetail_isSerialNoManage\\\",\\r\\n\\\"isExpiryDateManage\\\":\\\"productOfflineRetail_isExpiryDateManage\\\",\\r\\n\\\"expireDateNo\\\":\\\"productOfflineRetail_expireDateNo\\\",\\r\\n\\\"expireDateUnit\\\":\\\"productOfflineRetail_expireDateUnit\\\",\\r\\n\\\"free@1@@10\\\":\\\"retailskus!free@1@@10\\\",\\r\\n\\\"skudefine@1@@60\\\":\\\"productSkuProps!define@1@@60\\\",\\r\\n\\\"prodefine@1@@30\\\":\\\"productProps!define@1@@30\\\",\\r\\n\\\"propertiesValue\\\":\\\"propertiesValue\\\",\\r\\n\\\"product_modelDescription\\\":\\\"modelDescription\\\",\\r\\n\\\"productskus_modelDescription\\\":\\\"productskus_modelDescription\\\"}\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":200,\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"refer\",\"refReturn\":\"cName\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":770,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065731},\"othInRecords_productsku\":{\"cFieldName\":\"othInRecords.productsku\",\"fieldRuntimeState\":false,\"cItemName\":\"othInRecords_productsku\",\"cCaption\":\"商品SKUid\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057509\",\"cShowCaption\":\"物料SKUid\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000064942\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":780,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065620},\"othInRecords_productsku_cCode\":{\"cFieldName\":\"othInRecords.productsku.cCode\",\"fieldRuntimeState\":false,\"cItemName\":\"othInRecords_productsku_cCode\",\"cCaption\":\"物料sku编码\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065739\",\"cShowCaption\":\"物料sku编码\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065739\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"cRefType\":\"aa_productsku\",\"cRefRetId\":\"{\\\"product\\\":\\\"id\\\",\\r\\n\\\"product_cName\\\":\\\"cName\\\",\\r\\n\\\"productsku\\\":\\\"productskus_id\\\",\\r\\n\\\"productsku_cCode\\\":\\\"productskus_cCode\\\",\\r\\n\\\"productsku_cName\\\":\\\"skuName\\\",\\r\\n\\\"product_oUnitId\\\":\\\"oUnitId\\\",\\r\\n\\\"unit\\\":\\\"productOfflineRetail_storeOrderUnit\\\",\\r\\n\\\"product_productOfflineRetail_purchaseUnit\\\":\\\"purchaseUnit\\\",\\r\\n\\\"unit_name\\\":\\\"purchaseUnit_name\\\",\\r\\n\\\"invExchRate\\\":\\\"purchaseRate\\\",\\r\\n\\\"productOfflineRetail_purchaseRate\\\":\\\"purchaseRate\\\",\\r\\n\\\"taxRate\\\":\\\"productOfflineRetail_inputTax\\\",\\r\\n\\\"product_primeCosts\\\":\\\"primeCosts\\\",\\r\\n\\\"productsku_primeCosts\\\":\\\"productskus_primeCosts\\\",\\r\\n\\\"isBatchManage\\\":\\\"productOfflineRetail_isBatchManage\\\",\\r\\n\\\"isSerialNoManage\\\":\\\"productOfflineRetail_isSerialNoManage\\\",\\r\\n\\\"isExpiryDateManage\\\":\\\"productOfflineRetail_isExpiryDateManage\\\",\\r\\n\\\"expireDateNo\\\":\\\"productOfflineRetail_expireDateNo\\\",\\r\\n\\\"expireDateUnit\\\":\\\"productOfflineRetail_expireDateUnit\\\",\\r\\n\\\"free@1@@10\\\":\\\"retailskus!free@1@@10\\\",\\r\\n\\\"skudefine@1@@60\\\":\\\"productSkuProps!define@1@@60\\\",\\r\\n\\\"prodefine@1@@30\\\":\\\"productProps!define@1@@30\\\",\\r\\n\\\"propertiesValue\\\":\\\"propertiesValue\\\",\\r\\n\\\"product_modelDescription\\\":\\\"modelDescription\\\",\\r\\n\\\"productskus_modelDescription\\\":\\\"productskus_modelDescription\\\"}\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"refer\",\"refReturn\":\"productskus_cCode\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":790,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065621},\"othInRecords_productsku_cName\":{\"cFieldName\":\"othInRecords.productsku.skuName\",\"fieldRuntimeState\":false,\"cItemName\":\"othInRecords_productsku_cName\",\"cCaption\":\"物料sku名称\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065776\",\"cShowCaption\":\"物料sku名称\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065776\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"cRefType\":\"aa_productsku\",\"cRefRetId\":\"{\\\"product\\\":\\\"id\\\",\\r\\n\\\"product_cName\\\":\\\"cName\\\",\\r\\n\\\"productsku\\\":\\\"productskus_id\\\",\\r\\n\\\"productsku_cCode\\\":\\\"productskus_cCode\\\",\\r\\n\\\"productsku_cName\\\":\\\"skuName\\\",\\r\\n\\\"product_oUnitId\\\":\\\"oUnitId\\\",\\r\\n\\\"unit\\\":\\\"productOfflineRetail_storeOrderUnit\\\",\\r\\n\\\"product_productOfflineRetail_purchaseUnit\\\":\\\"purchaseUnit\\\",\\r\\n\\\"unit_name\\\":\\\"purchaseUnit_name\\\",\\r\\n\\\"invExchRate\\\":\\\"purchaseRate\\\",\\r\\n\\\"productOfflineRetail_purchaseRate\\\":\\\"purchaseRate\\\",\\r\\n\\\"taxRate\\\":\\\"productOfflineRetail_inputTax\\\",\\r\\n\\\"product_primeCosts\\\":\\\"primeCosts\\\",\\r\\n\\\"productsku_primeCosts\\\":\\\"productskus_primeCosts\\\",\\r\\n\\\"isBatchManage\\\":\\\"productOfflineRetail_isBatchManage\\\",\\r\\n\\\"isSerialNoManage\\\":\\\"productOfflineRetail_isSerialNoManage\\\",\\r\\n\\\"isExpiryDateManage\\\":\\\"productOfflineRetail_isExpiryDateManage\\\",\\r\\n\\\"expireDateNo\\\":\\\"productOfflineRetail_expireDateNo\\\",\\r\\n\\\"expireDateUnit\\\":\\\"productOfflineRetail_expireDateUnit\\\",\\r\\n\\\"free@1@@10\\\":\\\"retailskus!free@1@@10\\\",\\r\\n\\\"skudefine@1@@60\\\":\\\"productSkuProps!define@1@@60\\\",\\r\\n\\\"prodefine@1@@30\\\":\\\"productProps!define@1@@30\\\",\\r\\n\\\"propertiesValue\\\":\\\"propertiesValue\\\",\\r\\n\\\"product_modelDescription\\\":\\\"modelDescription\\\",\\r\\n\\\"productskus_modelDescription\\\":\\\"productskus_modelDescription\\\"}\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"refer\",\"refReturn\":\"cName\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":800,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065622},\"othInRecords_productsku_modelDescription\":{\"cFieldName\":\"othInRecords.productsku.modelDescription\",\"fieldRuntimeState\":false,\"cItemName\":\"othInRecords_productsku_modelDescription\",\"cCaption\":\"sku规格型号\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065774\",\"cShowCaption\":\"sku规格型号\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065774\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":801,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065666},\"othInRecords_product_modelDescription\":{\"cFieldName\":\"othInRecords.product.modelDescription\",\"fieldRuntimeState\":false,\"cItemName\":\"othInRecords_product_modelDescription\",\"cCaption\":\"规格说明\",\"cCaptionResid\":\"P_YS_PF_GZTTMP_0000103278\",\"cShowCaption\":\"规格说明\",\"cShowCaptionResid\":\"P_YS_PF_GZTTMP_0000103278\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":802,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065667},\"othInRecords_propertiesValue\":{\"cFieldName\":\"othInRecords.productsku.retailskus.propertiesValue\",\"fieldRuntimeState\":false,\"cItemName\":\"othInRecords_propertiesValue\",\"cCaption\":\"规格\",\"cCaptionResid\":\"P_YS_FED_EXAMP_0000020703\",\"cShowCaption\":\"规格\",\"cShowCaptionResid\":\"P_YS_FED_EXAMP_0000020703\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":803,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065668},\"producedate\":{\"cFieldName\":\"othInRecords.producedate\",\"fieldRuntimeState\":false,\"cItemName\":\"producedate\",\"cCaption\":\"生产日期\",\"cCaptionResid\":\"P_YS_SCM_STOCK_0000034363\",\"cShowCaption\":\"生产日期\",\"cShowCaptionResid\":\"P_YS_SCM_STOCK_0000034363\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":2,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"bCheck\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"DatePicker\",\"bVmExclude\":0,\"iOrder\":804,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065719},\"batchno\":{\"cFieldName\":\"othInRecords.batchno\",\"fieldRuntimeState\":false,\"cItemName\":\"batchno\",\"cCaption\":\"批次号\",\"cCaptionResid\":\"P_YS_PF_GZTSYS_0000013621\",\"cShowCaption\":\"批次号\",\"cShowCaptionResid\":\"P_YS_PF_GZTSYS_0000013621\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":2,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"bCheck\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":804,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065673},\"invaliddate\":{\"cFieldName\":\"othInRecords.invaliddate\",\"fieldRuntimeState\":false,\"cItemName\":\"invaliddate\",\"cCaption\":\"有效期至\",\"cCaptionResid\":\"P_YS_SCM_STOCK_0000034216\",\"cShowCaption\":\"有效期至\",\"cShowCaptionResid\":\"P_YS_SCM_STOCK_0000034216\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":2,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"cFormatData\":\"YYYY-MM-DD\",\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"bCheck\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"DatePicker\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":805,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065674},\"othInRecords_qty\":{\"cFieldName\":\"othInRecords.qty\",\"fieldRuntimeState\":false,\"cItemName\":\"othInRecords_qty\",\"cCaption\":\"主计量数量\",\"cCaptionResid\":\"P_YS_SD_UDHWS_0000066531\",\"cShowCaption\":\"数量\",\"cShowCaptionResid\":\"P_YS_FED_EXAMP_0000020130\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"iNumPoint\":8,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"SUM\",\"bNeedSum\":true,\"bShowIt\":true,\"bFilter\":true,\"cFormatData\":\"{\\\"related\\\":\\\"unit_Precision\\\"}\",\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"InputNumber\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":806,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":3,\"bEnableFormat\":false,\"id\":1849710500065623},\"othInRecords_subQty\":{\"cFieldName\":\"othInRecords.subQty\",\"fieldRuntimeState\":false,\"cItemName\":\"othInRecords_subQty\",\"cCaption\":\"副计量数量\",\"cCaptionResid\":\"P_YS_PF_GZTTMP_0000079001\",\"cShowCaption\":\"副计量数量\",\"cShowCaptionResid\":\"P_YS_PF_GZTTMP_0000079001\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"iNumPoint\":2,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"cFormatData\":\"{\\\"decimal\\\":\\\"<%option.quantitydecimal%>\\\"}\",\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"InputNumber\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":807,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":3,\"bEnableFormat\":false,\"id\":1849710500065624},\"contactsQuantity\":{\"cFieldName\":\"othInRecords.contactsQuantity\",\"fieldRuntimeState\":false,\"cItemName\":\"contactsQuantity\",\"cCaption\":\"往来数量\",\"cCaptionResid\":\"P_YS_PF_GZTTMP_0000077543\",\"cShowCaption\":\"往来数量\",\"cShowCaptionResid\":\"P_YS_PF_GZTTMP_0000077543\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":2,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"bCheck\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":808,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065675},\"othInRecords_unit_name\":{\"cFieldName\":\"othInRecords.unit.name\",\"fieldRuntimeState\":false,\"cItemName\":\"othInRecords_unit_name\",\"cCaption\":\"计量单位\",\"cCaptionResid\":\"P_YS_PF_GZTSYS_0000012671\",\"cShowCaption\":\"计量单位\",\"cShowCaptionResid\":\"P_YS_PF_GZTSYS_0000012671\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"cRefType\":\"aa_productunit\",\"cRefRetId\":\"{\\\"unit\\\":\\\"id\\\"}\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"refer\",\"refReturn\":\"name\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":809,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065627},\"subQty\":{\"cFieldName\":\"othInRecords.subQty\",\"fieldRuntimeState\":false,\"cItemName\":\"subQty\",\"cCaption\":\"往来件数\",\"cCaptionResid\":\"P_YS_PF_GZTTMP_0000078208\",\"cShowCaption\":\"件数\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065185\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":2,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"SUM\",\"bNeedSum\":true,\"bShowIt\":false,\"bFilter\":true,\"cFormatData\":\"{\\\"related\\\":\\\"stockUnitId_precision\\\"}\",\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"bCheck\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"InputNumber\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":810,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":3,\"bEnableFormat\":false,\"id\":1849710500065676},\"stockUnitId_name\":{\"cFieldName\":\"othInRecords.stockUnitId.name\",\"fieldRuntimeState\":false,\"cItemName\":\"stockUnitId_name\",\"cCaption\":\"库存单位\",\"cCaptionResid\":\"P_YS_PF_PROCENTER_0000023057\",\"cShowCaption\":\"库存单位\",\"cShowCaptionResid\":\"P_YS_PF_PROCENTER_0000023057\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":2,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"bCheck\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":811,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065677},\"project_code\":{\"cFieldName\":\"othInRecords.project.code\",\"fieldRuntimeState\":false,\"cItemName\":\"project_code\",\"cCaption\":\"项目编码\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065360\",\"cShowCaption\":\"项目编码\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065360\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"cRefType\":\"ucfbasedoc.bd_projectcardref\",\"cRefRetId\":\"{\\\"project\\\":\\\"id\\\",\\\"project_code\\\":\\\"code\\\",\\\"project_name\\\":\\\"name\\\"}\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Refer\",\"refReturn\":\"code\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":812,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065670},\"project_name\":{\"cFieldName\":\"othInRecords.project.name\",\"fieldRuntimeState\":false,\"cItemName\":\"project_name\",\"cCaption\":\"项目名称\",\"cCaptionResid\":\"P_YS_FED_FW_0000022137\",\"cShowCaption\":\"项目名称\",\"cShowCaptionResid\":\"P_YS_FED_FW_0000022137\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"cRefType\":\"ucfbasedoc.bd_projectcardref\",\"cRefRetId\":\"{\\\"project\\\":\\\"id\\\",\\\"project_code\\\":\\\"code\\\",\\\"project_name\\\":\\\"name\\\"}\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Refer\",\"refReturn\":\"name\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":813,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065671},\"natUnitPrice\":{\"cFieldName\":\"othInRecords.natUnitPrice\",\"fieldRuntimeState\":false,\"cItemName\":\"natUnitPrice\",\"cCaption\":\"成本单价\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065426\",\"cShowCaption\":\"成本单价\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065426\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":2,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"cFormatData\":\"{\\\"related\\\":\\\"natCurrency_priceDigit\\\"}\",\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"bCheck\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"InputNumber\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":816,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":3,\"bEnableFormat\":false,\"id\":1849710500065678},\"natMoney\":{\"cFieldName\":\"othInRecords.natMoney\",\"fieldRuntimeState\":false,\"cItemName\":\"natMoney\",\"cCaption\":\"成本金额\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065362\",\"cShowCaption\":\"成本金额\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065362\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":2,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"SUM\",\"bNeedSum\":true,\"bShowIt\":false,\"bFilter\":true,\"cFormatData\":\"{\\\"related\\\":\\\"natCurrency_moneyDigit\\\"}\",\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"bCheck\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"InputNumber\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":821,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":3,\"bEnableFormat\":false,\"id\":1849710500065679},\"othInRecords_rowno\":{\"cFieldName\":\"othInRecords.rowno\",\"fieldRuntimeState\":false,\"cItemName\":\"othInRecords_rowno\",\"cCaption\":\"行号\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000056996\",\"cShowCaption\":\"行号\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000056996\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"iNumPoint\":2,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"InputNumber\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":830,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":3,\"bEnableFormat\":false,\"id\":1849710500065625},\"unit_Precision\":{\"cFieldName\":\"othInRecords.unit.precision\",\"fieldRuntimeState\":false,\"cItemName\":\"unit_Precision\",\"cCaption\":\"主计量精度\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000064962\",\"cShowCaption\":\"主计量精度\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000064962\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":2,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"max\",\"bNeedSum\":true,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"bCheck\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":840,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065672},\"othInRecords_unit\":{\"cFieldName\":\"othInRecords.unit\",\"fieldRuntimeState\":false,\"cItemName\":\"othInRecords_unit\",\"cCaption\":\"单位id\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057504\",\"cShowCaption\":\"单位id\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057504\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":true,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":840,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065626},\"othInRecords_product_oUnitId\":{\"cFieldName\":\"othInRecords.product.oUnitId\",\"fieldRuntimeState\":false,\"cItemName\":\"othInRecords_product_oUnitId\",\"cCaption\":\"零售单位id\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057747\",\"cShowCaption\":\"零售单位id\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057747\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":true,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":860,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065628},\"product_model\":{\"cFieldName\":\"othInRecords.product.model\",\"fieldRuntimeState\":false,\"cItemName\":\"product_model\",\"cCaption\":\"型号\",\"cCaptionResid\":\"P_YS_PF_GZTTMP_0000077237\",\"cShowCaption\":\"型号\",\"cShowCaptionResid\":\"P_YS_PF_GZTTMP_0000077237\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bCanModify\":false,\"iColWidth\":150,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"cStyle\":\"{\\\"bSmartSearch\\\":true,\\\"tips_ori\\\":\\\"必输，请精确到sku\\\",\\\"tips\\\":\\\"必输，请精确到sku\\\"}\",\"bVmExclude\":0,\"iOrder\":866,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"bEnableFormat\":false,\"id\":1849710500065723},\"othInRecords_product_productOfflineRetail_purchaseUnit\":{\"cFieldName\":\"othInRecords.product.productOfflineRetail.purchaseUnit\",\"fieldRuntimeState\":false,\"cItemName\":\"othInRecords_product_productOfflineRetail_purchaseUnit\",\"cCaption\":\"采购单位id\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000056459\",\"cShowCaption\":\"采购单位id\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000056459\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":true,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":870,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065629},\"othInRecords_invExchRate\":{\"cFieldName\":\"othInRecords.invExchRate\",\"fieldRuntimeState\":false,\"cItemName\":\"othInRecords_invExchRate\",\"cCaption\":\"换算率\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057664\",\"cShowCaption\":\"换算率\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057664\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"iNumPoint\":6,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":100,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"InputNumber\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":880,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":3,\"bEnableFormat\":false,\"id\":1849710500065630},\"othInRecords_productOfflineRetail_purchaseRate\":{\"cFieldName\":\"othInRecords.product.productOfflineRetail.purchaseRate\",\"fieldRuntimeState\":false,\"cItemName\":\"othInRecords_productOfflineRetail_purchaseRate\",\"cCaption\":\"采购单位换算率\",\"cCaptionResid\":\"P_YS_PF_PROCENTER_0000023328\",\"cShowCaption\":\"采购单位换算率\",\"cShowCaptionResid\":\"P_YS_PF_PROCENTER_0000023328\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"iNumPoint\":6,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":100,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"InputNumber\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":890,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":3,\"bEnableFormat\":false,\"id\":1849710500065631},\"othInRecords_product_primeCosts\":{\"cFieldName\":\"othInRecords.product.primeCosts\",\"fieldRuntimeState\":false,\"cItemName\":\"othInRecords_product_primeCosts\",\"cCaption\":\"进货价格\",\"cCaptionResid\":\"P_YS_FED_EXAMP_0000020618\",\"cShowCaption\":\"进货价格\",\"cShowCaptionResid\":\"P_YS_FED_EXAMP_0000020618\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"iNumPoint\":6,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":100,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"InputNumber\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":900,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":3,\"bEnableFormat\":false,\"id\":1849710500065632},\"othInRecords_productsku_primeCosts\":{\"cFieldName\":\"othInRecords.productsku.primeCosts\",\"fieldRuntimeState\":false,\"cItemName\":\"othInRecords_productsku_primeCosts\",\"cCaption\":\"sku进货价格\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000058042\",\"cShowCaption\":\"sku进货价格\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000058042\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"iNumPoint\":6,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":100,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"InputNumber\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":910,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":3,\"bEnableFormat\":false,\"id\":1849710500065633},\"othInRecords_memo\":{\"cFieldName\":\"othInRecords.memo\",\"fieldRuntimeState\":false,\"cItemName\":\"othInRecords_memo\",\"cCaption\":\"表体备注\",\"cCaptionResid\":\"P_YS_SCM_USTOCK-UI_0000176155\",\"cShowCaption\":\"备注\",\"cShowCaptionResid\":\"P_YS_FI_CM_0000029174\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Column\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":960,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065634},\"bodyItem!id\":{\"cFieldName\":\"othInRecords.bodyItem.id\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!id\",\"cCaption\":\"表体自定义项id\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000056895\",\"cShowCaption\":\"表体自定义项id\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000056895\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":true,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Column\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":970,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065635},\"bodyItem!define1\":{\"cFieldName\":\"othInRecords.bodyItem.define1\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define1\",\"cCaption\":\"表体自定义项1\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057621\",\"cShowCaption\":\"自定义项1\",\"cShowCaptionResid\":\"C_YS_PF_GZTBDM_0000312694\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":50,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine1\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"cStyle\":\"{\\\"examples\\\":\\\"文字内容示例\\\",\\\"explains_ori\\\":\\\"文本型自定义项\\\",\\\"explains\\\":\\\"文本型自定义项\\\"}\",\"bVmExclude\":0,\"iOrder\":980,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065636},\"bodyItem!define2\":{\"cFieldName\":\"othInRecords.bodyItem.define2\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define2\",\"cCaption\":\"表体自定义项2\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057620\",\"cShowCaption\":\"可用量自定义\",\"cShowCaptionResid\":\"C_YS_PF_GZTBDM_0000360204\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":15,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"iNumPoint\":0,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine2\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"InputNumber\",\"cStyle\":\"{\\\"examples\\\":\\\"6.666\\\",\\\"explains_ori\\\":\\\"数值型自定义项\\\",\\\"explains\\\":\\\"数值型自定义项\\\"}\",\"bVmExclude\":0,\"iOrder\":990,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065637},\"natCurrency_priceDigit\":{\"cFieldName\":\"accountOrg.currency.priceDigit\",\"fieldRuntimeState\":false,\"cItemName\":\"natCurrency_priceDigit\",\"cCaption\":\"单价精度\",\"cCaptionResid\":\"P_YS_FED_FW_0000021660\",\"cShowCaption\":\"单价精度\",\"cShowCaptionResid\":\"P_YS_FED_FW_0000021660\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":2,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"max\",\"bNeedSum\":true,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"bCheck\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":990,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065680},\"bodyItem!define3\":{\"cFieldName\":\"othInRecords.bodyItem.define3\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define3\",\"cCaption\":\"表体自定义项3\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057628\",\"cShowCaption\":\"zjj自定义项（可用量）\",\"cShowCaptionResid\":\"C_YS_PF_GZTBDM_0000KRO9UW4WFX42RO0000_0000409670\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine3\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"cStyle\":\"{\\\"examples\\\":\\\"文字内容示例\\\",\\\"explains_ori\\\":\\\"文本型自定义项\\\",\\\"explains\\\":\\\"文本型自定义项\\\"}\",\"bVmExclude\":0,\"iOrder\":1000,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065638},\"natCurrency_moneyDigit\":{\"cFieldName\":\"accountOrg.currency.moneyDigit\",\"fieldRuntimeState\":false,\"cItemName\":\"natCurrency_moneyDigit\",\"cCaption\":\"金额精度\",\"cCaptionResid\":\"P_YS_FED_FW_0000021928\",\"cShowCaption\":\"金额精度\",\"cShowCaptionResid\":\"P_YS_FED_FW_0000021928\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":2,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"max\",\"bNeedSum\":true,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"bCheck\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1000,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065681},\"stockUnitId_precision\":{\"cFieldName\":\"othInRecords.stockUnitId.precision\",\"fieldRuntimeState\":false,\"cItemName\":\"stockUnitId_precision\",\"cCaption\":\"件数精度\",\"cCaptionResid\":\"P_YS_SCM_USTOCK-UI_0000175665\",\"cShowCaption\":\"件数精度\",\"cShowCaptionResid\":\"P_YS_SCM_USTOCK-UI_0000175665\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":2,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"max\",\"bNeedSum\":true,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"bCheck\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1000,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065682},\"bodyItem!define4\":{\"cFieldName\":\"othInRecords.bodyItem.define4\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define4\",\"cCaption\":\"表体自定义项4\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057627\",\"cShowCaption\":\"zjj自定义数值\",\"cShowCaptionResid\":\"C_YS_PF_GZTBDM_0000KRO9UW4WFX42RO0000_0000409726\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":15,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"iNumPoint\":4,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine4\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"InputNumber\",\"cStyle\":\"{\\\"examples\\\":\\\"6.666\\\",\\\"explains_ori\\\":\\\"数值型自定义项\\\",\\\"explains\\\":\\\"数值型自定义项\\\"}\",\"bVmExclude\":0,\"iOrder\":1010,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065639},\"othInRecords_id\":{\"cFieldName\":\"othInRecords.id\",\"fieldRuntimeState\":false,\"cItemName\":\"othInRecords_id\",\"cCaption\":\"订单行id\",\"cCaptionResid\":\"P_YS_PF_GZTTMP_0000079205\",\"cShowCaption\":\"订单行id\",\"cShowCaptionResid\":\"P_YS_PF_GZTTMP_0000079205\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"iNumPoint\":8,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":true,\"bShowIt\":true,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"InputNumber\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1010,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":3,\"bEnableFormat\":false,\"id\":1849710500065713},\"bodyItem!define5\":{\"cFieldName\":\"othInRecords.bodyItem.define5\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define5\",\"cCaption\":\"表体自定义项5\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057624\",\"cShowCaption\":\"自定义项5\",\"cShowCaptionResid\":\"C_YS_PF_GZTBDM_0000KRO9UW4WFX42RO0000_0000409932\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine5\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"cStyle\":\"{\\\"examples\\\":\\\"文字内容示例\\\",\\\"explains_ori\\\":\\\"文本型自定义项\\\",\\\"explains\\\":\\\"文本型自定义项\\\"}\",\"bVmExclude\":0,\"iOrder\":1020,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065640},\"bodyItem!define6\":{\"cFieldName\":\"othInRecords.bodyItem.define6\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define6\",\"cCaption\":\"表体自定义项6\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057622\",\"cShowCaption\":\"自定义项6\",\"cShowCaptionResid\":\"C_YS_PF_GZTBDM_0000KRO9UW4WFX42RO0000_0000434861\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":true,\"cEnumString\":\"{\\n \\\"true\\\": \\\"是\\\",\\n \\\"false\\\": \\\"否\\\"\\n}\",\"enumArray\":\"[\\n {\\n \\\"nameType\\\": \\\"text\\\",\\n \\\"icon\\\": null,\\n \\\"cDataRule\\\": null,\\n \\\"value\\\": \\\"是\\\",\\n \\\"resid\\\": \\\"P_YS_FED_EXAMP_0000020600\\\",\\n \\\"key\\\": \\\"true\\\"\\n },\\n {\\n \\\"nameType\\\": \\\"text\\\",\\n \\\"icon\\\": null,\\n \\\"cDataRule\\\": null,\\n \\\"value\\\": \\\"否\\\",\\n \\\"resid\\\": \\\"P_YS_FED_EXAMP_0000020344\\\",\\n \\\"key\\\": \\\"false\\\"\\n }\\n]\",\"cEnumType\":\"aa_boolean\",\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine6\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Select\",\"cStyle\":\"{\\\"examples\\\":\\\"true\\\",\\\"explains_ori\\\":\\\"布尔型自定义项,是的话填写 true,否的话填写 false\\\",\\\"explains\\\":\\\"布尔型自定义项,是的话填写“true”,否的话填写“false”\\\"}\",\"bVmExclude\":0,\"iOrder\":1030,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065641},\"bodyItem!define7\":{\"cFieldName\":\"othInRecords.bodyItem.define7\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define7\",\"cCaption\":\"表体自定义项7\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057631\",\"cShowCaption\":\"自定义项7\",\"cShowCaptionResid\":\"C_YS_PF_GZTBDM_0000KRO9UW4WFX42RO0000_0000435347\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"cRefType\":\"u8c-userdefine.pb_userdefine\",\"cRefRetId\":\"{\\\"bodyItem!define7\\\":\\\"name\\\",\\\"bodyItem!define7\\\":\\\"id\\\"}\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine7\",\"bCheck\":true,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"ListRefer\",\"refReturn\":\"name\",\"cStyle\":\"{\\\"examples\\\":\\\"自定义枚举的参照名称\\\",\\\"explains_ori\\\":\\\"自定义枚举型自定义项,参照自定义枚举的参照名称填写\\\",\\\"explains\\\":\\\"自定义枚举型自定义项,参照自定义枚举的参照名称填写\\\"}\",\"bVmExclude\":0,\"iOrder\":1040,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065642},\"bodyItem!define8_name\":{\"cFieldName\":\"othInRecords.bodyItem.define8.name\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define8_name\",\"cCaption\":\"表体自定义项8\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057630\",\"cShowCaption\":\"自定义项8\",\"cShowCaptionResid\":\"C_YS_PF_GZTBDM_0000KRO9UW4WFX42RO0000_0000435354\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"cRefType\":\"ucfbasedoc.0003\",\"cRefRetId\":\"{\\\"bodyItem!define8\\\":\\\"id\\\"}\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine8\",\"bCheck\":true,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"refer\",\"refReturn\":\"name\",\"cStyle\":\"{\\\"examples\\\":\\\"ZDY00001\\\",\\\"explains_ori\\\":\\\"自定义档案型自定义项,参照自定义档案值的编码填写\\\",\\\"explains\\\":\\\"自定义档案型自定义项,参照自定义档案值的编码填写\\\"}\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1050,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710555487045},\"bodyItem!define8\":{\"cFieldName\":\"othInRecords.bodyItem.define8\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define8\",\"cCaption\":\"表体自定义项8\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057630\",\"cShowCaption\":\"自定义项8\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057301\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine8\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"cStyle\":\"{\\\"examples\\\":\\\"ZDY00001\\\",\\\"explains_ori\\\":\\\"自定义档案型自定义项,参照自定义档案值的编码填写\\\",\\\"explains\\\":\\\"自定义档案型自定义项,参照自定义档案值的编码填写\\\"}\",\"bVmExclude\":0,\"iOrder\":1050,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065643},\"bodyItem!define9\":{\"cFieldName\":\"othInRecords.bodyItem.define9\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define9\",\"cCaption\":\"表体自定义项9\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057629\",\"cShowCaption\":\"基本档案1\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine9\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"cStyle\":\"{\\\"examples\\\":\\\"DD00001\\\",\\\"explains_ori\\\":\\\"基本档案型自定义项,参照基本档案值的编码填写\\\",\\\"explains\\\":\\\"基本档案型自定义项,参照基本档案值的编码填写\\\"}\",\"bVmExclude\":0,\"iOrder\":1060,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065644},\"bodyItem!define9_name\":{\"cFieldName\":\"othInRecords.bodyItem.define9.name\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define9_name\",\"cCaption\":\"表体自定义项9\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057629\",\"cShowCaption\":\"基本档案1\",\"cShowCaptionResid\":\"C_YS_PF_GZTBDM_0000KRO9UW4WFX42RO0000_0000448610\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"cRefType\":\"yonbip-hy-jgmj.usersecretobjref_list\",\"cRefRetId\":\"{\\\"bodyItem!define9\\\":\\\"id\\\"}\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine9\",\"bCheck\":true,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"refer\",\"refReturn\":\"name\",\"cStyle\":\"{\\\"examples\\\":\\\"DD00001\\\",\\\"explains_ori\\\":\\\"基本档案型自定义项,参照基本档案值的编码填写\\\",\\\"explains\\\":\\\"基本档案型自定义项,参照基本档案值的编码填写\\\"}\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1060,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710585091293},\"bodyItem!define10\":{\"cFieldName\":\"othInRecords.bodyItem.define10\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define10\",\"cCaption\":\"表体自定义项10\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057564\",\"cShowCaption\":\"自定义图片\",\"cShowCaptionResid\":\"C_YS_PF_GZTBDM_0000KRO9UW4WFX42RO0000_0000448606\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine10\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"avatar\",\"cStyle\":\"{\\\"examples_ori\\\":\\\"暂不支持\\\",\\\"examples\\\":\\\"暂不支持\\\",\\\"explains_ori\\\":\\\"图片型自定义项，暂不支持导入\\\",\\\"explains\\\":\\\"图片型自定义项，暂不支持导入\\\",\\\"style\\\":{\\\"width\\\":100,\\\"height\\\":10}}\",\"bVmExclude\":0,\"iOrder\":1070,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065645},\"bodyItem!define11\":{\"cFieldName\":\"othInRecords.bodyItem.define11\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define11\",\"cCaption\":\"表体自定义项11\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057566\",\"cShowCaption\":\"自定义附件\",\"cShowCaptionResid\":\"C_YS_PF_GZTBDM_0000KRO9UW4WFX42RO0000_0000448607\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine11\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"filelist\",\"cStyle\":\"{\\\"hideTitle\\\":false}\",\"bVmExclude\":0,\"iOrder\":1080,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065646},\"bodyItem!define12\":{\"cFieldName\":\"othInRecords.bodyItem.define12\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define12\",\"cCaption\":\"表体自定义项12\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057559\",\"cShowCaption\":\"基本档案2\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine12\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"cStyle\":\"{\\\"examples\\\":\\\"DD00001\\\",\\\"explains_ori\\\":\\\"基本档案型自定义项,参照基本档案值的编码填写\\\",\\\"explains\\\":\\\"基本档案型自定义项,参照基本档案值的编码填写\\\"}\",\"bVmExclude\":0,\"iOrder\":1090,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065647},\"bodyItem!define12_name\":{\"cFieldName\":\"othInRecords.bodyItem.define12.name\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define12_name\",\"cCaption\":\"表体自定义项12\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057559\",\"cShowCaption\":\"基本档案2\",\"cShowCaptionResid\":\"C_YS_PF_GZTBDM_0000KRO9UW4WFX42RO0000_0000448650\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"cRefType\":\"productcenter.aa_custcategoryref\",\"cRefRetId\":\"{\\\"bodyItem!define12\\\":\\\"id\\\"}\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine12\",\"bCheck\":true,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"refer\",\"refReturn\":\"name\",\"cStyle\":\"{\\\"examples\\\":\\\"DD00001\\\",\\\"explains_ori\\\":\\\"基本档案型自定义项,参照基本档案值的编码填写\\\",\\\"explains\\\":\\\"基本档案型自定义项,参照基本档案值的编码填写\\\"}\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1090,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710585091438},\"bodyItem!define13\":{\"cFieldName\":\"othInRecords.bodyItem.define13\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define13\",\"cCaption\":\"表体自定义项13\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057561\",\"cShowCaption\":\"自定义日期时间\",\"cShowCaptionResid\":\"C_YS_PF_GZTBDM_0000KRO9UW4WFX42RO0000_0000449536\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"cFormatData\":\"YYYY-MM-DD HH:mm:ss\",\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine13\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"DateTimePicker\",\"cStyle\":\"{\\\"examples\\\":\\\"2022-01-01 18:30:00\\\",\\\"explains_ori\\\":\\\"日期时间型自定义项,日期和时间之间用空格隔开,例如 2022-01-01 18:30:00\\\",\\\"explains\\\":\\\"日期时间型自定义项,日期和时间之间用空格隔开,例如：2022-01-01 18:30:00\\\"}\",\"bVmExclude\":0,\"iOrder\":1100,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065648},\"bodyItem!define14\":{\"cFieldName\":\"othInRecords.bodyItem.define14\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define14\",\"cCaption\":\"表体自定义项14\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057562\",\"cShowCaption\":\"自定义日期\",\"cShowCaptionResid\":\"C_YS_PF_GZTBDM_0000KRO9UW4WFX42RO0000_0000449629\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"cFormatData\":\"YYYY-MM-DD\",\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine14\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"DatePicker\",\"cStyle\":\"{\\\"examples\\\":\\\"2022-01-01\\\",\\\"explains_ori\\\":\\\"日期型自定义项,例如 2022-01-01\\\",\\\"explains\\\":\\\"日期型自定义项,例如：2022-01-01\\\"}\",\"bVmExclude\":0,\"iOrder\":1110,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065649},\"bodyItem!define15\":{\"cFieldName\":\"othInRecords.bodyItem.define15\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define15\",\"cCaption\":\"表体自定义项15\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057563\",\"cShowCaption\":\"自定义时间\",\"cShowCaptionResid\":\"C_YS_PF_GZTBDM_0000KRO9UW4WFX42RO0000_0000449630\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine15\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"timepicker\",\"cStyle\":\"{\\\"examples\\\":\\\"18:30:00\\\",\\\"explains_ori\\\":\\\"时间型自定义项,例如 18:30:00\\\",\\\"explains\\\":\\\"时间型自定义项,例如：18:30:00\\\"}\",\"bVmExclude\":0,\"iOrder\":1120,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065650},\"bodyItem!define16\":{\"cFieldName\":\"othInRecords.bodyItem.define16\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define16\",\"cCaption\":\"表体自定义项16\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057555\",\"cShowCaption\":\"11111\",\"cShowCaptionResid\":\"C_YS_PF_GZTBDM_0000KRO9UW4WFX42RO0000_0000460495\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine16\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"cStyle\":\"{\\\"examples\\\":\\\"文字内容示例\\\",\\\"explains_ori\\\":\\\"文本型自定义项\\\",\\\"explains\\\":\\\"文本型自定义项\\\"}\",\"bVmExclude\":0,\"iOrder\":1130,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065651},\"bodyItem!define17\":{\"cFieldName\":\"othInRecords.bodyItem.define17\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define17\",\"cCaption\":\"表体自定义项17\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057556\",\"cShowCaption\":\"自定义文本测试\",\"cShowCaptionResid\":\"C_YS_PF_GZTBDM_0000KRO9UW4WFX42RO0000_1434948238646968320\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine17\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"cStyle\":\"{\\\"examples\\\":\\\"文字内容示例\\\",\\\"explains_ori\\\":\\\"文本型自定义项\\\",\\\"explains\\\":\\\"文本型自定义项\\\"}\",\"bVmExclude\":0,\"iOrder\":1140,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065652},\"bodyItem!define18\":{\"cFieldName\":\"othInRecords.bodyItem.define18\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define18\",\"cCaption\":\"表体自定义项18\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057557\",\"cShowCaption\":\"表体自定义项18\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057557\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine18\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1150,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065653},\"bodyItem!define19\":{\"cFieldName\":\"othInRecords.bodyItem.define19\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define19\",\"cCaption\":\"表体自定义项19\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057558\",\"cShowCaption\":\"表体自定义项19\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057558\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine19\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1160,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065654},\"bodyItem!define20\":{\"cFieldName\":\"othInRecords.bodyItem.define20\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define20\",\"cCaption\":\"表体自定义项20\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057583\",\"cShowCaption\":\"表体自定义项20\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057583\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine20\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1170,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065655},\"bodyItem!define21\":{\"cFieldName\":\"othInRecords.bodyItem.define21\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define21\",\"cCaption\":\"表体自定义项21\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057585\",\"cShowCaption\":\"表体自定义项21\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057585\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine21\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1180,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065656},\"returnDate\":{\"cFieldName\":\"othInRecords.returnDate\",\"fieldRuntimeState\":false,\"cItemName\":\"returnDate\",\"cCaption\":\"预计归还日期\",\"cCaptionResid\":\"P_YS_PF_METADATA_0001039902\",\"cShowCaption\":\"预计归还日期\",\"cShowCaptionResid\":\"P_YS_PF_METADATA_0001039902\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":2,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"bCheck\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"DatePicker\",\"bVmExclude\":0,\"iOrder\":1181,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710507200646},\"bodyItem!define22\":{\"cFieldName\":\"othInRecords.bodyItem.define22\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define22\",\"cCaption\":\"表体自定义项22\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057586\",\"cShowCaption\":\"表体自定义项22\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057586\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine22\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1190,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065657},\"bodyItem!define23\":{\"cFieldName\":\"othInRecords.bodyItem.define23\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define23\",\"cCaption\":\"表体自定义项23\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057576\",\"cShowCaption\":\"表体自定义项23\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057576\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine23\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1200,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065658},\"bodyItem!define24\":{\"cFieldName\":\"othInRecords.bodyItem.define24\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define24\",\"cCaption\":\"表体自定义项24\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057577\",\"cShowCaption\":\"表体自定义项24\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057577\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine24\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1210,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065659},\"bodyItem!define25\":{\"cFieldName\":\"othInRecords.bodyItem.define25\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define25\",\"cCaption\":\"表体自定义项25\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057579\",\"cShowCaption\":\"表体自定义项25\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057579\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine25\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1220,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065660},\"bodyItem!define26\":{\"cFieldName\":\"othInRecords.bodyItem.define26\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define26\",\"cCaption\":\"表体自定义项26\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057581\",\"cShowCaption\":\"表体自定义项26\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057581\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine26\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1230,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065661},\"bodyItem!define27\":{\"cFieldName\":\"othInRecords.bodyItem.define27\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define27\",\"cCaption\":\"表体自定义项27\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057572\",\"cShowCaption\":\"表体自定义项27\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057572\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine27\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1240,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065662},\"bodyItem!define28\":{\"cFieldName\":\"othInRecords.bodyItem.define28\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define28\",\"cCaption\":\"表体自定义项28\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057573\",\"cShowCaption\":\"表体自定义项28\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057573\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine28\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1250,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065663},\"bodyItem!define29\":{\"cFieldName\":\"othInRecords.bodyItem.define29\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define29\",\"cCaption\":\"表体自定义项29\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057574\",\"cShowCaption\":\"表体自定义项29\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057574\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine29\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1260,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065664},\"bodyItem!define30\":{\"cFieldName\":\"othInRecords.bodyItem.define30\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define30\",\"cCaption\":\"表体自定义项30\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057526\",\"cShowCaption\":\"表体自定义项30\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057526\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine30\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1270,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065665},\"vendor\":{\"cFieldName\":\"vendor\",\"fieldRuntimeState\":false,\"cItemName\":\"vendor\",\"cCaption\":\"供应商id\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057078\",\"cShowCaption\":\"供应商\",\"cShowCaptionResid\":\"P_YS_PF_GZTSYS_0000012772\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":200,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"bVmExclude\":0,\"iOrder\":1290,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710503704228},\"vendor_code\":{\"cFieldName\":\"vendor.code\",\"fieldRuntimeState\":false,\"cItemName\":\"vendor_code\",\"cCaption\":\"供应商编码\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065573\",\"cShowCaption\":\"供应商编码\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065573\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"cRefType\":\"aa_user\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Refer\",\"refReturn\":\"name\",\"bVmExclude\":0,\"iOrder\":1290,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710503704484},\"vendor_name\":{\"cFieldName\":\"vendor.name\",\"fieldRuntimeState\":false,\"cItemName\":\"vendor_name\",\"cCaption\":\"供应商\",\"cCaptionResid\":\"P_YS_PF_GZTSYS_0000012772\",\"cShowCaption\":\"供应商\",\"cShowCaptionResid\":\"P_YS_PF_GZTSYS_0000012772\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"cRefType\":\"aa_user\",\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":200,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Refer\",\"refReturn\":\"name\",\"bVmExclude\":0,\"iOrder\":1290,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710503704740},\"expireDateNo\":{\"cFieldName\":\"othInRecords.product.productOfflineRetail.expireDateNo\",\"fieldRuntimeState\":false,\"cItemName\":\"expireDateNo\",\"cCaption\":\"保质期\",\"cCaptionResid\":\"P_YS_PF_PROCENTER_0000022885\",\"cShowCaption\":\"保质期\",\"cShowCaptionResid\":\"P_YS_PF_PROCENTER_0000022885\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"cStyle\":\"{\\\"explains_ori\\\":\\\"显示项，不用输入\\\",\\\"explains\\\":\\\"显示项，不用输入\\\"}\",\"bVmExclude\":0,\"iOrder\":1302,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065724},\"expireDateUnit\":{\"cFieldName\":\"othInRecords.product.productOfflineRetail.expireDateUnit\",\"fieldRuntimeState\":false,\"cItemName\":\"expireDateUnit\",\"cCaption\":\"保质期单位\",\"cCaptionResid\":\"P_YS_PF_PROCENTER_0000022808\",\"cShowCaption\":\"保质期单位\",\"cShowCaptionResid\":\"P_YS_PF_PROCENTER_0000022808\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":true,\"cEnumString\":\"{\\n \\\"1\\\": \\\"年\\\",\\n \\\"2\\\": \\\"月\\\",\\n \\\"6\\\": \\\"天\\\"\\n}\",\"enumArray\":\"[\\n {\\n \\\"nameType\\\": \\\"text\\\",\\n \\\"icon\\\": null,\\n \\\"cDataRule\\\": null,\\n \\\"value\\\": \\\"年\\\",\\n \\\"resid\\\": \\\"P_YS_FED_FW_0000022328\\\",\\n \\\"key\\\": \\\"1\\\"\\n },\\n {\\n \\\"nameType\\\": \\\"text\\\",\\n \\\"icon\\\": null,\\n \\\"cDataRule\\\": null,\\n \\\"value\\\": \\\"月\\\",\\n \\\"resid\\\": \\\"P_YS_FED_FW_0000022392\\\",\\n \\\"key\\\": \\\"2\\\"\\n },\\n {\\n \\\"nameType\\\": \\\"text\\\",\\n \\\"icon\\\": null,\\n \\\"cDataRule\\\": null,\\n \\\"value\\\": \\\"天\\\",\\n \\\"resid\\\": \\\"P_YS_FED_FW_0000021729\\\",\\n \\\"key\\\": \\\"6\\\"\\n }\\n]\",\"cEnumType\":\"st_expiredateunit\",\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"select\",\"cStyle\":\"{\\\"explains_ori\\\":\\\"显示项，不用输入\\\",\\\"explains\\\":\\\"显示项，不用输入\\\"}\",\"bVmExclude\":0,\"iOrder\":1306,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065725},\"project\":{\"cFieldName\":\"othInRecords.project\",\"fieldRuntimeState\":false,\"cItemName\":\"project\",\"cCaption\":\"项目id\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065281\",\"cShowCaption\":\"项目id\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065281\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1320,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065669},\"bodyItem!define31\":{\"cFieldName\":\"othInRecords.bodyItem.define31\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define31\",\"cCaption\":\"表体自定义项31\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065494\",\"cShowCaption\":\"表体自定义项31\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065494\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine31\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1380,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065683},\"bodyItem!define32\":{\"cFieldName\":\"othInRecords.bodyItem.define32\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define32\",\"cCaption\":\"表体自定义项32\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065495\",\"cShowCaption\":\"表体自定义项32\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065495\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine32\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1390,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065684},\"bodyItem!define33\":{\"cFieldName\":\"othInRecords.bodyItem.define33\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define33\",\"cCaption\":\"表体自定义项33\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065496\",\"cShowCaption\":\"表体自定义项33\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065496\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine33\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1400,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065685},\"bodyItem!define34\":{\"cFieldName\":\"othInRecords.bodyItem.define34\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define34\",\"cCaption\":\"表体自定义项34\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065490\",\"cShowCaption\":\"表体自定义项34\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065490\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine34\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1410,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065686},\"bodyItem!define35\":{\"cFieldName\":\"othInRecords.bodyItem.define35\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define35\",\"cCaption\":\"表体自定义项35\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065491\",\"cShowCaption\":\"表体自定义项35\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065491\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine35\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1420,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065687},\"bodyItem!define36\":{\"cFieldName\":\"othInRecords.bodyItem.define36\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define36\",\"cCaption\":\"表体自定义项36\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065492\",\"cShowCaption\":\"表体自定义项36\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065492\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine36\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1430,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065688},\"contactsPieces\":{\"cFieldName\":\"othInRecords.contactsPieces\",\"fieldRuntimeState\":false,\"cItemName\":\"contactsPieces\",\"cCaption\":\"应收件数\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065438\",\"cShowCaption\":\"应收件数\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065438\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"iNumPoint\":8,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":true,\"bShowIt\":false,\"bFilter\":true,\"cFormatData\":\"{\\\"related\\\":\\\"stockUnitId_Precision\\\"}\",\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"bCheck\":true,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"InputNumber\",\"refReturn\":\"cName\",\"bVmExclude\":0,\"iOrder\":1434,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":3,\"bEnableFormat\":false,\"id\":1849710500065720},\"bodyItem!define37\":{\"cFieldName\":\"othInRecords.bodyItem.define37\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define37\",\"cCaption\":\"表体自定义项37\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065493\",\"cShowCaption\":\"表体自定义项37\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065493\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine37\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1440,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065689},\"product_unitName\":{\"cFieldName\":\"othInRecords.product.oUnitId.name\",\"fieldRuntimeState\":false,\"cItemName\":\"product_unitName\",\"cCaption\":\"主计量\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065174\",\"cShowCaption\":\"主计量\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065174\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"bCheck\":true,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"refer\",\"refReturn\":\"cName\",\"cStyle\":\"{\\\"explains_ori\\\":\\\"显示项，不需要输入\\\",\\\"explains\\\":\\\"显示项，不需要输入\\\"}\",\"bVmExclude\":0,\"iOrder\":1446,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065722},\"bodyItem!define38\":{\"cFieldName\":\"othInRecords.bodyItem.define38\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define38\",\"cCaption\":\"表体自定义项38\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065488\",\"cShowCaption\":\"表体自定义项38\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065488\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine38\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1450,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065690},\"bodyItem!define39\":{\"cFieldName\":\"othInRecords.bodyItem.define39\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define39\",\"cCaption\":\"表体自定义项39\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065489\",\"cShowCaption\":\"表体自定义项39\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065489\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine39\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1460,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065691},\"bodyItem!define40\":{\"cFieldName\":\"othInRecords.bodyItem.define40\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define40\",\"cCaption\":\"表体自定义项40\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065508\",\"cShowCaption\":\"表体自定义项40\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065508\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine40\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1470,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065692},\"bodyItem!define41\":{\"cFieldName\":\"othInRecords.bodyItem.define41\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define41\",\"cCaption\":\"表体自定义项41\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065504\",\"cShowCaption\":\"表体自定义项41\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065504\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine41\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1480,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065693},\"bodyItem!define42\":{\"cFieldName\":\"othInRecords.bodyItem.define42\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define42\",\"cCaption\":\"表体自定义项42\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065505\",\"cShowCaption\":\"表体自定义项42\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065505\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine42\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1490,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065694},\"bodyItem!define43\":{\"cFieldName\":\"othInRecords.bodyItem.define43\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define43\",\"cCaption\":\"表体自定义项43\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065506\",\"cShowCaption\":\"表体自定义项43\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065506\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine43\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1500,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065695},\"bodyItem!define44\":{\"cFieldName\":\"othInRecords.bodyItem.define44\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define44\",\"cCaption\":\"表体自定义项44\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065507\",\"cShowCaption\":\"表体自定义项44\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065507\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine44\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1510,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065696},\"bodyItem!define45\":{\"cFieldName\":\"othInRecords.bodyItem.define45\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define45\",\"cCaption\":\"表体自定义项45\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065500\",\"cShowCaption\":\"表体自定义项45\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065500\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine45\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1520,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065697},\"bodyItem!define46\":{\"cFieldName\":\"othInRecords.bodyItem.define46\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define46\",\"cCaption\":\"表体自定义项46\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065501\",\"cShowCaption\":\"表体自定义项46\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065501\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine46\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1530,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065698},\"group_number\":{\"cFieldName\":\"othInRecords.group_number\",\"fieldRuntimeState\":false,\"cItemName\":\"group_number\",\"cCaption\":\"组号\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065599\",\"cShowCaption\":\"组号\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065599\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"cFormatData\":\"{\\\"decimal\\\":\\\"<%option.amountofdecimal%>\\\"}\",\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"cStyle\":\"{\\\"explains_ori\\\":\\\"显示项，不用输入\\\",\\\"explains\\\":\\\"显示项，不用输入\\\"}\",\"bVmExclude\":0,\"iOrder\":1538,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065721},\"bodyItem!define47\":{\"cFieldName\":\"othInRecords.bodyItem.define47\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define47\",\"cCaption\":\"表体自定义项47\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065502\",\"cShowCaption\":\"表体自定义项47\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065502\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine47\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1540,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065699},\"bodyItem!define48\":{\"cFieldName\":\"othInRecords.bodyItem.define48\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define48\",\"cCaption\":\"表体自定义项48\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065503\",\"cShowCaption\":\"表体自定义项48\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065503\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine48\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1550,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065700},\"bodyItem!define49\":{\"cFieldName\":\"othInRecords.bodyItem.define49\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define49\",\"cCaption\":\"表体自定义项49\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065499\",\"cShowCaption\":\"表体自定义项49\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065499\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine49\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1560,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065701},\"upcode\":{\"cFieldName\":\"othInRecords.upcode\",\"fieldRuntimeState\":false,\"cItemName\":\"upcode\",\"cCaption\":\"上游单据号\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057998\",\"cShowCaption\":\"上游单据号\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057998\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"iOrder\":1566,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065726},\"bodyItem!define50\":{\"cFieldName\":\"othInRecords.bodyItem.define50\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define50\",\"cCaption\":\"表体自定义项50\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065533\",\"cShowCaption\":\"表体自定义项50\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065533\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine50\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1570,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065702},\"bodyItem!define51\":{\"cFieldName\":\"othInRecords.bodyItem.define51\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define51\",\"cCaption\":\"表体自定义项51\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065534\",\"cShowCaption\":\"表体自定义项51\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065534\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine51\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1580,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065703},\"bodyItem!define52\":{\"cFieldName\":\"othInRecords.bodyItem.define52\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define52\",\"cCaption\":\"表体自定义项52\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065529\",\"cShowCaption\":\"表体自定义项52\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065529\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine52\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1590,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065704},\"bodyItem!define53\":{\"cFieldName\":\"othInRecords.bodyItem.define53\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define53\",\"cCaption\":\"表体自定义项53\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065530\",\"cShowCaption\":\"表体自定义项53\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065530\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine53\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1600,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065705},\"bodyItem!define54\":{\"cFieldName\":\"othInRecords.bodyItem.define54\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define54\",\"cCaption\":\"表体自定义项54\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065531\",\"cShowCaption\":\"表体自定义项54\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065531\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine54\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1610,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065706},\"bodyItem!define55\":{\"cFieldName\":\"othInRecords.bodyItem.define55\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define55\",\"cCaption\":\"表体自定义项55\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065532\",\"cShowCaption\":\"表体自定义项55\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065532\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine55\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1620,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065707},\"bodyItem!define56\":{\"cFieldName\":\"othInRecords.bodyItem.define56\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define56\",\"cCaption\":\"表体自定义项56\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065522\",\"cShowCaption\":\"表体自定义项56\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065522\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine56\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1630,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065708},\"bodyItem!define57\":{\"cFieldName\":\"othInRecords.bodyItem.define57\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define57\",\"cCaption\":\"表体自定义项57\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065524\",\"cShowCaption\":\"表体自定义项57\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065524\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine57\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1640,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065709},\"bodyItem!define58\":{\"cFieldName\":\"othInRecords.bodyItem.define58\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define58\",\"cCaption\":\"表体自定义项58\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065526\",\"cShowCaption\":\"表体自定义项58\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065526\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine58\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1650,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065710},\"bodyItem!define59\":{\"cFieldName\":\"othInRecords.bodyItem.define59\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define59\",\"cCaption\":\"表体自定义项59\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065527\",\"cShowCaption\":\"表体自定义项59\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065527\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine59\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1660,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065711},\"bodyItem!define60\":{\"cFieldName\":\"othInRecords.bodyItem.define60\",\"fieldRuntimeState\":false,\"cItemName\":\"bodyItem!define60\",\"cCaption\":\"表体自定义项60\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065543\",\"cShowCaption\":\"表体自定义项60\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065543\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":false,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":true,\"cSelfDefineType\":\"bodyDefine60\",\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":1670,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065712},\"barCode\":{\"cFieldName\":\"barCode\",\"fieldRuntimeState\":false,\"cItemName\":\"barCode\",\"cCaption\":\"单据条码\",\"cCaptionResid\":\"P_YS_TBS_TBS-UI_0001110778\",\"cShowCaption\":\"单据条码\",\"cShowCaptionResid\":\"P_YS_TBS_TBS-UI_0001110778\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":true,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":200,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"bVmExclude\":0,\"iOrder\":1991,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":true,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065730},\"othInRecords_source\":{\"cFieldName\":\"othInRecords.source\",\"fieldRuntimeState\":false,\"cItemName\":\"othInRecords_source\",\"cCaption\":\"上游单据类型\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000057185\",\"cShowCaption\":\"上游单据类型\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000057185\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":true,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":true,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":2000,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"isMasterOrg\":false,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065714},\"wmsBillno\":{\"cFieldName\":\"wmsBillno\",\"fieldRuntimeState\":false,\"cItemName\":\"wmsBillno\",\"cCaption\":\"WMS单号\",\"cCaptionResid\":\"P_YS_SCM_USTOCK-UI_0001215728\",\"cShowCaption\":\"WMS单号\",\"cShowCaptionResid\":\"P_YS_SCM_USTOCK-UI_0001215728\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":true,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":200,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":true,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"Column\",\"bVmExclude\":0,\"iOrder\":7000,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":true,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065732},\"wmsInStatus\":{\"cFieldName\":\"wmsInStatus\",\"fieldRuntimeState\":false,\"cItemName\":\"wmsInStatus\",\"cCaption\":\"WMS转入状态\",\"cCaptionResid\":\"P_YS_SCM_USTOCK-UI_0001215729\",\"cShowCaption\":\"WMS转入状态\",\"cShowCaptionResid\":\"P_YS_SCM_USTOCK-UI_0001215729\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":true,\"cEnumString\":\"{\\n \\\"1\\\": \\\"转入中\\\",\\n \\\"4\\\": \\\"已回传\\\",\\n \\\"0\\\": \\\"未转入\\\",\\n \\\"2\\\": \\\"转入成功\\\",\\n \\\"3\\\": \\\"转入失败\\\"\\n}\",\"enumArray\":\"[\\n {\\n \\\"nameType\\\": \\\"text\\\",\\n \\\"icon\\\": null,\\n \\\"cDataRule\\\": null,\\n \\\"value\\\": \\\"转入中\\\",\\n \\\"resid\\\": \\\"P_YS_SD_SDOC-UI_0000170549\\\",\\n \\\"key\\\": \\\"1\\\"\\n },\\n {\\n \\\"nameType\\\": \\\"text\\\",\\n \\\"icon\\\": null,\\n \\\"cDataRule\\\": null,\\n \\\"value\\\": \\\"已回传\\\",\\n \\\"resid\\\": \\\"P_YS_SCM_USTOCK-UI_0001289122\\\",\\n \\\"key\\\": \\\"4\\\"\\n },\\n {\\n \\\"nameType\\\": \\\"text\\\",\\n \\\"icon\\\": null,\\n \\\"cDataRule\\\": null,\\n \\\"value\\\": \\\"未转入\\\",\\n \\\"resid\\\": \\\"P_YS_SD_SDOC-UI_0000170352\\\",\\n \\\"key\\\": \\\"0\\\"\\n },\\n {\\n \\\"nameType\\\": \\\"text\\\",\\n \\\"icon\\\": null,\\n \\\"cDataRule\\\": null,\\n \\\"value\\\": \\\"转入成功\\\",\\n \\\"resid\\\": \\\"P_YS_SD_SDOC-UI_0000170551\\\",\\n \\\"key\\\": \\\"2\\\"\\n },\\n {\\n \\\"nameType\\\": \\\"text\\\",\\n \\\"icon\\\": null,\\n \\\"cDataRule\\\": null,\\n \\\"value\\\": \\\"转入失败\\\",\\n \\\"resid\\\": \\\"P_YS_SD_SDOC-UI_0000170550\\\",\\n \\\"key\\\": \\\"3\\\"\\n }\\n]\",\"cEnumType\":\"aa_wmsInStatus\",\"bMustSelect\":true,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":100,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"select\",\"bVmExclude\":0,\"iOrder\":7010,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":true,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065733},\"wmsCancelStatus\":{\"cFieldName\":\"wmsCancelStatus\",\"fieldRuntimeState\":false,\"cItemName\":\"wmsCancelStatus\",\"cCaption\":\"WMS取消状态\",\"cCaptionResid\":\"P_YS_SD_SDOC-UI_0001178960\",\"cShowCaption\":\"WMS取消状态\",\"cShowCaptionResid\":\"P_YS_SD_SDOC-UI_0001178960\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":true,\"cEnumString\":\"{\\n \\\"0\\\": \\\"未取消\\\",\\n \\\"1\\\": \\\"取消中\\\",\\n \\\"2\\\": \\\"取消成功\\\",\\n \\\"3\\\": \\\"取消失败\\\"\\n}\",\"enumArray\":\"[\\n {\\n \\\"nameType\\\": \\\"text\\\",\\n \\\"icon\\\": null,\\n \\\"cDataRule\\\": null,\\n \\\"value\\\": \\\"未取消\\\",\\n \\\"resid\\\": \\\"P_YS_SCM_USTOCK-UI_0001215743\\\",\\n \\\"key\\\": \\\"0\\\"\\n },\\n {\\n \\\"nameType\\\": \\\"text\\\",\\n \\\"icon\\\": null,\\n \\\"cDataRule\\\": null,\\n \\\"value\\\": \\\"取消中\\\",\\n \\\"resid\\\": \\\"P_YS_SCM_USTOCK-UI_0001215731\\\",\\n \\\"key\\\": \\\"1\\\"\\n },\\n {\\n \\\"nameType\\\": \\\"text\\\",\\n \\\"icon\\\": null,\\n \\\"cDataRule\\\": null,\\n \\\"value\\\": \\\"取消成功\\\",\\n \\\"resid\\\": \\\"P_YS_HR_HRJXF_0000059668\\\",\\n \\\"key\\\": \\\"2\\\"\\n },\\n {\\n \\\"nameType\\\": \\\"text\\\",\\n \\\"icon\\\": null,\\n \\\"cDataRule\\\": null,\\n \\\"value\\\": \\\"取消失败\\\",\\n \\\"resid\\\": \\\"P_YS_HR_HRSSC_0000135821\\\",\\n \\\"key\\\": \\\"3\\\"\\n }\\n]\",\"cEnumType\":\"aa_wmsCancelStatus\",\"bMustSelect\":true,\"bHidden\":true,\"bSplit\":false,\"bExtend\":false,\"bCanModify\":false,\"iMaxShowLen\":255,\"iColWidth\":100,\"cSumType\":\"support\",\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":true,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecord\",\"cControlType\":\"select\",\"bVmExclude\":0,\"iOrder\":7020,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":true,\"uncopyable\":true,\"iAlign\":1,\"bEnableFormat\":false,\"id\":1849710500065734},\"lineno\":{\"cFieldName\":\"othInRecords.lineno\",\"fieldRuntimeState\":false,\"cItemName\":\"lineno\",\"cCaption\":\"行号\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000056996\",\"cShowCaption\":\"行号\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000056996\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":true,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"iNumPoint\":2,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":8000,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":3,\"bEnableFormat\":false,\"id\":1849710592781028},\"uplineno\":{\"cFieldName\":\"othInRecords.uplineno\",\"fieldRuntimeState\":false,\"cItemName\":\"uplineno\",\"cCaption\":\"上游业务行号\",\"cCaptionResid\":\"P_YS_SCM_UPU-UI_0001469506\",\"cShowCaption\":\"来源单据行号\",\"cShowCaptionResid\":\"P_YS_PF_GZTTMP_0000076764\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":true,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"iNumPoint\":2,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":8100,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":3,\"bEnableFormat\":false,\"id\":1849710592781156},\"firstuplineno\":{\"cFieldName\":\"othInRecords.firstuplineno\",\"fieldRuntimeState\":false,\"cItemName\":\"firstuplineno\",\"cCaption\":\"源头单据行号\",\"cCaptionResid\":\"P_YS_PF_GZTTMP_0000077073\",\"cShowCaption\":\"源头单据行号\",\"cShowCaptionResid\":\"P_YS_PF_GZTTMP_0000077073\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":true,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"iNumPoint\":2,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":8200,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":3,\"bEnableFormat\":false,\"id\":1849710592781284},\"sourceOrderlineno\":{\"cFieldName\":\"othInRecords.sourceOrderlineno\",\"fieldRuntimeState\":false,\"cItemName\":\"sourceOrderlineno\",\"cCaption\":\"来源订单行号\",\"cCaptionResid\":\"P_YS_PF_PRINT_0000065432\",\"cShowCaption\":\"来源订单行号\",\"cShowCaptionResid\":\"P_YS_PF_PRINT_0000065432\",\"iBillEntityId\":14709957,\"iBillTplGroupId\":193877109960,\"iTplId\":9148318,\"iMaxLength\":255,\"iFieldType\":1,\"bEnum\":false,\"bMustSelect\":true,\"bHidden\":false,\"bSplit\":false,\"bExtend\":false,\"iNumPoint\":2,\"bCanModify\":true,\"iMaxShowLen\":255,\"iColWidth\":150,\"bNeedSum\":false,\"bShowIt\":false,\"bFilter\":false,\"bIsNull\":true,\"bPrintCaption\":true,\"bJointQuery\":false,\"bPrintUpCase\":false,\"bSelfDefine\":false,\"cTplGroupName\":\"其他入库单列表区域\",\"bMain\":true,\"cDataSourceName\":\"st.othinrecord.OthInRecords\",\"cControlType\":\"Input\",\"bVmExclude\":0,\"multiple\":false,\"iOrder\":8300,\"isshoprelated\":false,\"iSystem\":1,\"authLevel\":3,\"isExport\":false,\"uncopyable\":false,\"iAlign\":3,\"bEnableFormat\":false,\"id\":1849710592781412}},\"pagination\":true,\"pageInfo\":{\"pageSize\":20,\"pageIndex\":1},\"dataSourceMode\":\"remote\",\"showCheckBox\":true,\"showAggregates\":true,\"showSubtotal\":true}),\n \n \n 'states':[{\"code\":\"listUnaudit\",\"condition\":\"!data.isWfControlled && data.status==0\",\"items\":[{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnUnaudit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnCopy\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnEdit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnBodyJointquery\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnShare\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnSubmit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnUnsubmit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnWorkflow\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnDelete\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnAudit\",\"cGroup\":\"toolbaritem\"}]},{\"code\":\"listAudited\",\"condition\":\"!data.isWfControlled && data.status==1\",\"items\":[{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnCopy\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnBodyJointquery\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnEdit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnDelete\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnUnsubmit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnUnaudit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnAudit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnShare\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnSubmit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnWorkflow\",\"cGroup\":\"toolbaritem\"}]},{\"code\":\"listClosed\",\"condition\":\"data.status==2\",\"items\":[{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnCopy\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnAudit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnDelete\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnSubmit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnUnaudit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnUnsubmit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnShare\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnEdit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnWorkflow\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnBodyJointquery\",\"cGroup\":\"toolbaritem\"}]},{\"code\":\"listAudited4Wf\",\"condition\":\"data.isWfControlled && data.status==1 && data.verifystate==2\",\"items\":[{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnEdit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnCopy\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnSubmit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnUnaudit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnAudit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnWorkflow\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnDelete\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnBodyJointquery\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnUnsubmit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnShare\",\"cGroup\":\"toolbaritem\"}]},{\"code\":\"listUnsubmit\",\"condition\":\"data.isWfControlled && data.status==0 && data.verifystate==0\",\"items\":[{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnEdit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnCopy\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnBodyJointquery\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnShare\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnUnaudit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnAudit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnSubmit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnWorkflow\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnDelete\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnUnsubmit\",\"cGroup\":\"toolbaritem\"}]},{\"code\":\"listUnsubmit4RejectToStart\",\"condition\":\"data.isWfControlled && data.status==0 && data.verifystate==4\",\"items\":[{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnUnaudit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnCopy\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnSubmit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnEdit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnShare\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnWorkflow\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnBodyJointquery\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnUnsubmit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnDelete\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnAudit\",\"cGroup\":\"toolbaritem\"}]},{\"code\":\"sumlist\",\"condition\":\"data.sumSwitch == true \",\"items\":[{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnOpenReport\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnUnaudit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnDelete\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnBatchAudit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnPrintReview\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnBatchSubmit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnShortCutsHelp\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnEdit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnAudit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnSubmit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnBatchUnsubmit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnCopy\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnImport\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"spliter2OpenReport\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnBodyJointquery\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnTempexport\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnAdd\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnBatchSubmitDrop\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnReviewEventLog\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnPrintDrop\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnImportDrop\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnAttachment\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnBatchDelete\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnAddDrop\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnExport\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnUnsubmit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnWorkflow\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnPdfexport\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnBatchAuditDrop\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnBatchUnaudit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnExport1\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnJointquery\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnPrintNow\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnAddOrderLendrecord\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnExportDrop\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnAddLendIn\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnBillsetting\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"spliter\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnShare\",\"cGroup\":\"toolbaritem\"}]},{\"code\":\"detaillist\",\"condition\":\"data.sumSwitch == false \",\"items\":[{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnPrintNow\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnExport1\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnBatchSubmit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnImport\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnWorkflow\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnShortCutsHelp\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnAdd\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnBatchAudit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnBatchAuditDrop\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnCopy\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnAddOrderLendrecord\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnAddLendIn\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnExport\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnOpenReport\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnAddDrop\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnExportDrop\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnBatchSubmitDrop\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnAudit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnImportDrop\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnBatchUnsubmit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnDelete\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnBatchDelete\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnUnsubmit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnBatchUnaudit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnPdfexport\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnBodyJointquery\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnShare\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnAttachment\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"spliter\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnJointquery\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnEdit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnPrintReview\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnSubmit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnBillsetting\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"spliter2OpenReport\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnReviewEventLog\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnUnaudit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnTempexport\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnPrintDrop\",\"cGroup\":\"toolbaritem\"}]},{\"code\":\"listSubmited\",\"condition\":\"data.isWfControlled && data.status==3 && data.verifystate==1\",\"items\":[{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnAudit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnUnaudit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnShare\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnSubmit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnWorkflow\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnDelete\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnUnsubmit\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnCopy\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":true,\"bEnable\":true,\"cName\":\"btnBodyJointquery\",\"cGroup\":\"toolbaritem\"},{\"bVisible\":false,\"bEnable\":false,\"cName\":\"btnEdit\",\"cGroup\":\"toolbaritem\"}]}],\n \n \n 'params':{\"billNo\":\"st_othinrecordlist\",\"billType\":\"VoucherList\",\"filterId\":\"2244441\",\"supportTimeline\":false,\"hasDataSource\":true,\"transTypeKeyField\":\"bustype\",\"masterOrgKeyField\":null,\"approverField\":null,\"tsField\":null,\"mainJointQueryField\":null,\"domainKey\":\"ustock\"},\n \n };\n this.setData(fields);\n this.setDirty(false);\n\n \n\n var billType = \"voucherlist\" || 'voucherlist';\n var biz;\n if (billType == 'editvoucherlist'||billType == 'edittreevoucherlist') {\n biz = cb.biz.common['editvoucherlist'];\n } else {\n biz = cb.biz.common.voucherlist;\n }\n\n \n //common command events start\n //actions\n \n _this.allActions = [{\"cCommand\":\"cmdOpenReport\",\"cAction\":\"openreport\",\"cHttpMethod\":\"POSt\",\"fieldName\":\"btnOpenReport\"},{\"cCommand\":\"cmdAdd\",\"cAction\":\"add\",\"cSvcUrl\":\"/bill/add\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"fieldName\":\"btnAddLendIn\"},{\"cCommand\":\"cmdReviewEventLog\",\"cAction\":\"revieweventlog\",\"cHttpMethod\":\"POST\",\"fieldName\":\"btnReviewEventLog\"},{\"cCommand\":\"cmdBillsetting\",\"cAction\":\"billsetting\",\"cSvcUrl\":\"/bill/billsetting\",\"cHttpMethod\":\"POST\",\"fieldName\":\"btnBillsetting\"},{\"cCommand\":\"cmdAudit\",\"cAction\":\"batchaudit\",\"cSvcUrl\":\"/bill/batchaudit\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"fieldName\":\"btnAudit\"},{\"cCommand\":\"cmdImport\",\"cAction\":\"batchimport\",\"cSvcUrl\":\"/bill/billImport\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"cParameter\":\"{\\\"isAsync\\\":true,\\\"isLogEvent\\\":true}\",\"fieldName\":\"btnImport\"},{\"cCommand\":\"cmdWorkflow\",\"cAction\":\"workflow\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListBody\",\"fieldName\":\"btnWorkflow\"},{\"cCommand\":\"cmdUnaudit\",\"cAction\":\"batchunaudit\",\"cSvcUrl\":\"/bill/batchunaudit\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"fieldName\":\"btnUnaudit\"},{\"cCommand\":\"cmdBatchUnaudit\",\"cAction\":\"batchunaudit\",\"cSvcUrl\":\"/bill/batchunaudit\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\"},{\"cCommand\":\"cmdShare\",\"cAction\":\"share\",\"cTarget\":\"YSListViewToolBar_right\",\"fieldName\":\"btnShare\"},{\"cCommand\":\"cmdSubmit\",\"cAction\":\"batchsubmit\",\"cSvcUrl\":\"/bill/batchsubmit\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"fieldName\":\"btnSubmit\"},{\"cCommand\":\"cmdRevoke\",\"cAction\":\"batchunaudit\",\"cSvcUrl\":\"/bill/batchunaudit\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListBody\"},{\"cCommand\":\"cmdPrintNow\",\"cAction\":\"printnow\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"cParameter\":\"{\\\"meta\\\":0, \\\"domainDataBaseByCode\\\":\\\"SD\\\",\\\"printcode\\\":\\\"SCM9975911561358670000\\\", \\\"classifyCode\\\":\\\"ST.st_othinrecord\\\", \\\"params\\\":{\\\"billno\\\":\\\"st_othinrecord\\\"}}\",\"fieldName\":\"btnPrintNow\"},{\"cCommand\":\"cmdTempexport\",\"cAction\":\"tempexport\",\"cSvcUrl\":\"/billtemp/export?action=output\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"fieldName\":\"btnTempexport\"},{\"cCommand\":\"cmdShortCutsHelp\",\"cAction\":\"shortcutshelp\",\"cHttpMethod\":\"POST\",\"fieldName\":\"btnShortCutsHelp\"},{\"cCommand\":\"cmdCopy\",\"cAction\":\"copy\",\"cSvcUrl\":\"/bill/copy\",\"cHttpMethod\":\"POST\",\"fieldName\":\"btnCopy\"},{\"cCommand\":\"cmdExport\",\"cAction\":\"batchoutput\",\"cSvcUrl\":\"/bill/export?action=output\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"fieldName\":\"btnExport\"},{\"cCommand\":\"cmdDelete\",\"cAction\":\"batchdelete\",\"cSvcUrl\":\"/bill/batchdelete\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListBody\",\"cParameter\":\"{\\\"isAsync\\\":true,\\\"isAsyncOne\\\":true}\",\"fieldName\":\"btnDelete\"},{\"cCommand\":\"cmdBatchAuditDrop\",\"cAction\":\"batchaudit\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\"},{\"cCommand\":\"cmdExport1\",\"cAction\":\"reportexport\",\"cSvcUrl\":\"/bill/export?action=output\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"fieldName\":\"btnExport1\"},{\"cCommand\":\"cmdPrint\",\"cAction\":\"printpreview\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"cParameter\":\"{\\\"classifyCode\\\":\\\"ST.st_othinrecord\\\", \\\"params\\\":{\\\"billno\\\":\\\"st_othinrecord\\\"}}\",\"fieldName\":\"btnPrintReview\"},{\"cCommand\":\"cmdJointquery\",\"cAction\":\"jointquery\",\"cHttpMethod\":\"GET\",\"cTarget\":\"ListBody\",\"fieldName\":\"btnJointquery\"},{\"cCommand\":\"cmdBatchAudit\",\"cAction\":\"batchaudit\",\"cSvcUrl\":\"/bill/batchaudit\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\"},{\"cCommand\":\"cmdEdit\",\"cAction\":\"edit\",\"cSvcUrl\":\"/bill/edit\",\"cHttpMethod\":\"GET\",\"cTarget\":\"ListBody\",\"fieldName\":\"btnEdit\"},{\"cCommand\":\"cmdList\",\"cAction\":\"list\",\"cSvcUrl\":\"/bill/list\",\"cHttpMethod\":\"POST\"},{\"cCommand\":\"cmdPullLendrecord\",\"cAction\":\"pullx\",\"cTarget\":\"ListHeader\",\"cParameter\":\"{\\\"billnumber\\\":\\\"othinrecordlist_pull_lendrecord\\\",\\\"target\\\":\\\"uscmf_lendrecord\\\"}\",\"fieldName\":\"btnAddOrderLendrecord\"},{\"cCommand\":\"cmdImportDrop\",\"cAction\":\"tempexport\",\"cSvcUrl\":\"/billtemp/export?action=output\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"fieldName\":\"btnImportDrop\"},{\"cCommand\":\"cmdPdfexport\",\"cAction\":\"batchoutput\",\"cSvcUrl\":\"/bill/pdfexport\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\"},{\"cCommand\":\"cmdJointquery\",\"cAction\":\"jointquery\",\"cTarget\":\"YSListViewToolBar_right\"},{\"cCommand\":\"cmdUnsubmit\",\"cAction\":\"batchdo\",\"cSvcUrl\":\"/bill/batchDo?action=unsubmit\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"fieldName\":\"btnUnsubmit\"},{\"cCommand\":\"cmdAddDrop\",\"cAction\":\"add\",\"cSvcUrl\":\"/bill/add\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"fieldName\":\"btnAddDrop\"},{\"cCommand\":\"cmdAttachment\",\"cAction\":\"attachment\",\"cTarget\":\"YSListViewToolBar_left\",\"fieldName\":\"btnAttachment\"},{\"cCommand\":\"cmdBatchDelete\",\"cAction\":\"batchdelete\",\"cSvcUrl\":\"/bill/batchdelete\",\"cHttpMethod\":\"POST\",\"cParameter\":\"{\\\"isAsync\\\":true,\\\"isAsyncOne\\\":true}\",\"fieldName\":\"btnBatchDelete\"},{\"cCommand\":\"cmdExportDrop\",\"cAction\":\"batchoutput\",\"cSvcUrl\":\"/bill/export?action=output\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"fieldName\":\"btnExportDrop\"}];\n \n \n \n \n _this.get('btnOpenReport').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cCommand\":\"cmdOpenReport\",\"cAction\":\"openreport\",\"cHttpMethod\":\"POSt\",\"fieldName\":\"btnOpenReport\",\"fieldRuntimeState\":false,\"cItemName\":\"btnOpenReport\",\"cCaption\":\"即时分析\",\"cCaptionResid\":\"P_YS_FED_FW_0001060913\",\"cShowCaption\":\"即时分析\",\"cShowCaptionResid\":\"P_YS_FED_FW_0001060913\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":2,\"cParameter\":\"{\\\"classname\\\":\\\"button-only-icon\\\"}\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407218\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnOpenReport'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n biz.do('openreport',_this, args)\n });\n \n \n _this.get('btnAdd').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cCommand\":\"cmdAdd\",\"cAction\":\"add\",\"cSvcUrl\":\"/bill/add\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"fieldName\":\"btnAdd\",\"fieldRuntimeState\":false,\"cItemName\":\"btnAdd\",\"cCaption\":\"空白单据\",\"cCaptionResid\":\"P_YS_SCM_USTOCK-UI_0000174216\",\"cShowCaption\":\"空白单据\",\"cShowCaptionResid\":\"P_YS_SCM_USTOCK-UI_0000174216\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cParent\":\"1849710493407206\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407196\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnAdd'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n var self = this;\n args.disabledCallback = function () {\n self.setDisabled(true);\n }\n args.enabledCallback = function () {\n self.setDisabled(false);\n }\n \n biz.do('add',_this, args)\n });\n \n \n _this.get('btnAddLendIn').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cCommand\":\"cmdAdd\",\"cAction\":\"add\",\"cSvcUrl\":\"/bill/add\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"fieldName\":\"btnAddLendIn\",\"fieldRuntimeState\":false,\"cItemName\":\"btnAddLendIn\",\"cCaption\":\"借入入库\",\"cCaptionResid\":\"P_YS_SCM_USTOCK-UI_0001318046\",\"cShowCaption\":\"借入入库\",\"cShowCaptionResid\":\"P_YS_SCM_USTOCK-UI_0001318046\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cParent\":\"1849710493407206\",\"bVmExclude\":0,\"iOrder\":28,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710499326132\",\"cExtProps\":\"{\\\"iOrder\\\":28.0}\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnAddLendIn'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n var self = this;\n args.disabledCallback = function () {\n self.setDisabled(true);\n }\n args.enabledCallback = function () {\n self.setDisabled(false);\n }\n \n biz.do('add',_this, args)\n });\n \n \n _this.get('btnReviewEventLog').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cCommand\":\"cmdReviewEventLog\",\"cAction\":\"revieweventlog\",\"cHttpMethod\":\"POST\",\"fieldName\":\"btnReviewEventLog\",\"fieldRuntimeState\":false,\"cItemName\":\"btnReviewEventLog\",\"cCaption\":\"事件中心联查\",\"cCaptionResid\":\"P_YS_FW-PUB_MDD-BACK_0001523514\",\"cShowCaption\":\"事件中心联查\",\"cShowCaptionResid\":\"P_YS_FW-PUB_MDD-BACK_0001523514\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710501849919\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnReviewEventLog'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n biz.do('revieweventlog',_this, args)\n });\n \n \n _this.get('btnBillsetting').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cCommand\":\"cmdBillsetting\",\"cAction\":\"billsetting\",\"cSvcUrl\":\"/bill/billsetting\",\"cHttpMethod\":\"POST\",\"fieldName\":\"btnBillsetting\",\"fieldRuntimeState\":false,\"cItemName\":\"btnBillsetting\",\"cCaption\":\"UI模板\",\"cCaptionResid\":\"P_YS_PF_GZTSYS_0000013482\",\"cShowCaption\":\"UI模板\",\"cShowCaptionResid\":\"P_YS_PF_GZTSYS_0000013482\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"673152087\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnBillsetting'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n var self = this;\n args.disabledCallback = function () {\n self.setDisabled(true);\n }\n args.enabledCallback = function () {\n self.setDisabled(false);\n }\n \n biz.do('billsetting',_this, args)\n });\n \n \n _this.get('btnBatchAuditDrop').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cCommand\":\"cmdAudit\",\"cAction\":\"batchaudit\",\"cSvcUrl\":\"/bill/batchaudit\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"fieldName\":\"btnBatchAuditDrop\",\"fieldRuntimeState\":false,\"cItemName\":\"btnBatchAuditDrop\",\"cCaption\":\"审核\",\"cCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024727\",\"cShowCaption\":\"审核\",\"cShowCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024727\",\"bEnum\":false,\"cControlType\":\"dropdownbutton\",\"iStyle\":0,\"cParameter\":\"{\\\"displaymode\\\":\\\"button\\\"}\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407234\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnBatchAuditDrop'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n var self = this;\n args.disabledCallback = function () {\n self.setDisabled(true);\n }\n args.enabledCallback = function () {\n self.setDisabled(false);\n }\n \n biz.do('batchaudit',_this, args)\n });\n \n \n _this.get('btnBatchAudit').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cCommand\":\"cmdAudit\",\"cAction\":\"batchaudit\",\"cSvcUrl\":\"/bill/batchaudit\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"fieldName\":\"btnBatchAudit\",\"fieldRuntimeState\":false,\"cItemName\":\"btnBatchAudit\",\"cCaption\":\"审核\",\"cCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024727\",\"cShowCaption\":\"审核\",\"cShowCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024727\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cParent\":\"1849710493407234\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407235\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnBatchAudit'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n var self = this;\n args.disabledCallback = function () {\n self.setDisabled(true);\n }\n args.enabledCallback = function () {\n self.setDisabled(false);\n }\n \n biz.do('batchaudit',_this, args)\n });\n \n \n _this.get('btnAudit').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cCommand\":\"cmdAudit\",\"cAction\":\"batchaudit\",\"cSvcUrl\":\"/bill/batchaudit\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"fieldName\":\"btnAudit\",\"fieldRuntimeState\":false,\"cItemName\":\"btnAudit\",\"cCaption\":\"审核\",\"cCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024727\",\"cShowCaption\":\"审核\",\"cShowCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024727\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407238\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnAudit'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n var self = this;\n args.disabledCallback = function () {\n self.setDisabled(true);\n }\n args.enabledCallback = function () {\n self.setDisabled(false);\n }\n \n biz.do('batchaudit',_this, args)\n });\n \n \n _this.get('btnImport').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cmdParameter\":\"{\\\"isAsync\\\":true,\\\"isLogEvent\\\":true}\",\"cCommand\":\"cmdImport\",\"cAction\":\"batchimport\",\"cSvcUrl\":\"/bill/billImport\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"cParameter\":\"{\\\"isAsync\\\":true,\\\"isLogEvent\\\":true}\",\"fieldName\":\"btnImport\",\"fieldRuntimeState\":false,\"cItemName\":\"btnImport\",\"cCaption\":\"导入\",\"cCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024986\",\"cShowCaption\":\"导入\",\"cShowCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024986\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cParent\":\"1849710493407209\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407199\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnImport'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n var self = this;\n args.disabledCallback = function () {\n self.setDisabled(true);\n }\n args.enabledCallback = function () {\n self.setDisabled(false);\n }\n \n biz.do('batchimport',_this, args)\n });\n \n \n _this.get('btnWorkflow').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cCommand\":\"cmdWorkflow\",\"cAction\":\"workflow\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListBody\",\"fieldName\":\"btnWorkflow\",\"fieldRuntimeState\":false,\"cItemName\":\"btnWorkflow\",\"cCaption\":\"审批流\",\"cCaptionResid\":\"P_YS_FED_FW_0000021634\",\"cShowCaption\":\"审批流\",\"cShowCaptionResid\":\"P_YS_FED_FW_0000021634\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407242\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnWorkflow'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n biz.do('workflow',_this, args)\n });\n \n \n _this.get('btnBatchUnaudit').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cCommand\":\"cmdUnaudit\",\"cAction\":\"batchunaudit\",\"cSvcUrl\":\"/bill/batchunaudit\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"fieldName\":\"btnBatchUnaudit\",\"fieldRuntimeState\":false,\"cItemName\":\"btnBatchUnaudit\",\"cCaption\":\"弃审\",\"cCaptionResid\":\"P_YS_PF_PROCENTER_0000027468\",\"cShowCaption\":\"弃审\",\"cShowCaptionResid\":\"P_YS_PF_PROCENTER_0000027468\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cParent\":\"1849710493407234\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407236\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnBatchUnaudit'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n var self = this;\n args.disabledCallback = function () {\n self.setDisabled(true);\n }\n args.enabledCallback = function () {\n self.setDisabled(false);\n }\n \n biz.do('batchunaudit',_this, args)\n });\n \n \n _this.get('btnUnaudit').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cCommand\":\"cmdUnaudit\",\"cAction\":\"batchunaudit\",\"cSvcUrl\":\"/bill/batchunaudit\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"fieldName\":\"btnUnaudit\",\"fieldRuntimeState\":false,\"cItemName\":\"btnUnaudit\",\"cCaption\":\"弃审\",\"cCaptionResid\":\"P_YS_PF_PROCENTER_0000027468\",\"cShowCaption\":\"弃审\",\"cShowCaptionResid\":\"P_YS_PF_PROCENTER_0000027468\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407239\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnUnaudit'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n var self = this;\n args.disabledCallback = function () {\n self.setDisabled(true);\n }\n args.enabledCallback = function () {\n self.setDisabled(false);\n }\n \n biz.do('batchunaudit',_this, args)\n });\n \n \n _this.get('btnShare').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cCommand\":\"cmdShare\",\"cAction\":\"share\",\"cTarget\":\"YSListViewToolBar_right\",\"fieldName\":\"btnShare\",\"fieldRuntimeState\":false,\"cItemName\":\"btnShare\",\"cCaption\":\"分享\",\"cCaptionResid\":\"P_YS_PF_PROCENTER_0000027482\",\"cShowCaption\":\"分享\",\"cShowCaptionResid\":\"P_YS_PF_PROCENTER_0000027482\",\"bEnum\":false,\"cControlType\":\"YSButton\",\"iStyle\":0,\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407223\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnShare'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n biz.do('share',_this, args)\n });\n \n \n _this.get('btnBatchSubmitDrop').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cCommand\":\"cmdSubmit\",\"cAction\":\"batchsubmit\",\"cSvcUrl\":\"/bill/batchsubmit\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"fieldName\":\"btnBatchSubmitDrop\",\"fieldRuntimeState\":false,\"cItemName\":\"btnBatchSubmitDrop\",\"cCaption\":\"提交\",\"cCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024984\",\"cShowCaption\":\"提交\",\"cShowCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024984\",\"bEnum\":false,\"cControlType\":\"dropdownbutton\",\"iStyle\":0,\"cParameter\":\"{\\\"displaymode\\\":\\\"button\\\"}\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407231\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnBatchSubmitDrop'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n var self = this;\n args.disabledCallback = function () {\n self.setDisabled(true);\n }\n args.enabledCallback = function () {\n self.setDisabled(false);\n }\n \n biz.do('batchsubmit',_this, args)\n });\n \n \n _this.get('btnBatchSubmit').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cCommand\":\"cmdSubmit\",\"cAction\":\"batchsubmit\",\"cSvcUrl\":\"/bill/batchsubmit\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"fieldName\":\"btnBatchSubmit\",\"fieldRuntimeState\":false,\"cItemName\":\"btnBatchSubmit\",\"cCaption\":\"提交\",\"cCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024984\",\"cShowCaption\":\"提交\",\"cShowCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024984\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cParent\":\"1849710493407231\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407232\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnBatchSubmit'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n var self = this;\n args.disabledCallback = function () {\n self.setDisabled(true);\n }\n args.enabledCallback = function () {\n self.setDisabled(false);\n }\n \n biz.do('batchsubmit',_this, args)\n });\n \n \n _this.get('btnSubmit').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cCommand\":\"cmdSubmit\",\"cAction\":\"batchsubmit\",\"cSvcUrl\":\"/bill/batchsubmit\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"fieldName\":\"btnSubmit\",\"fieldRuntimeState\":false,\"cItemName\":\"btnSubmit\",\"cCaption\":\"提交\",\"cCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024984\",\"cShowCaption\":\"提交\",\"cShowCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024984\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407240\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnSubmit'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n var self = this;\n args.disabledCallback = function () {\n self.setDisabled(true);\n }\n args.enabledCallback = function () {\n self.setDisabled(false);\n }\n \n biz.do('batchsubmit',_this, args)\n });\n \n \n _this.get('btnPrintNow').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cmdParameter\":\"{\\\"meta\\\":0, \\\"domainDataBaseByCode\\\":\\\"SD\\\",\\\"printcode\\\":\\\"SCM9975911561358670000\\\", \\\"classifyCode\\\":\\\"ST.st_othinrecord\\\", \\\"params\\\":{\\\"billno\\\":\\\"st_othinrecord\\\"}}\",\"cCommand\":\"cmdPrintNow\",\"cAction\":\"printnow\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"cParameter\":\"{\\\"meta\\\":0, \\\"domainDataBaseByCode\\\":\\\"SD\\\",\\\"printcode\\\":\\\"SCM9975911561358670000\\\", \\\"classifyCode\\\":\\\"ST.st_othinrecord\\\", \\\"params\\\":{\\\"billno\\\":\\\"st_othinrecord\\\"}}\",\"fieldName\":\"btnPrintNow\",\"fieldRuntimeState\":false,\"cItemName\":\"btnPrintNow\",\"cCaption\":\"直接打印\",\"cCaptionResid\":\"P_YS_PF_PROCENTER_0000027368\",\"cShowCaption\":\"直接打印\",\"cShowCaptionResid\":\"P_YS_PF_PROCENTER_0000027368\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cParent\":\"1849710493407215\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407217\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnPrintNow'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n biz.do('printnow',_this, args)\n });\n \n \n _this.get('btnTempexport').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cCommand\":\"cmdTempexport\",\"cAction\":\"tempexport\",\"cSvcUrl\":\"/billtemp/export?action=output\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"fieldName\":\"btnTempexport\",\"fieldRuntimeState\":false,\"cItemName\":\"btnTempexport\",\"cCaption\":\"模板下载\",\"cCaptionResid\":\"P_YS_PF_PROCENTER_0000027470\",\"cShowCaption\":\"模板下载\",\"cShowCaptionResid\":\"P_YS_PF_PROCENTER_0000027470\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cParent\":\"1849710493407209\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407200\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnTempexport'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n var self = this;\n args.disabledCallback = function () {\n self.setDisabled(true);\n }\n args.enabledCallback = function () {\n self.setDisabled(false);\n }\n \n biz.do('tempexport',_this, args)\n });\n \n \n _this.get('btnShortCutsHelp').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cCommand\":\"cmdShortCutsHelp\",\"cAction\":\"shortcutshelp\",\"cHttpMethod\":\"POST\",\"fieldName\":\"btnShortCutsHelp\",\"fieldRuntimeState\":false,\"cItemName\":\"btnShortCutsHelp\",\"cCaption\":\"快捷键帮助\",\"cCaptionResid\":\"P_YS_FW-PUB_MDD-BACK_0001345842\",\"cShowCaption\":\"快捷键帮助\",\"cShowCaptionResid\":\"P_YS_FW-PUB_MDD-BACK_0001345842\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710490220545\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnShortCutsHelp'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n biz.do('shortcutshelp',_this, args)\n });\n \n \n _this.get('btnCopy').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cCommand\":\"cmdCopy\",\"cAction\":\"copy\",\"cSvcUrl\":\"/bill/copy\",\"cHttpMethod\":\"POST\",\"fieldName\":\"btnCopy\",\"fieldRuntimeState\":false,\"cItemName\":\"btnCopy\",\"cCaption\":\"复制\",\"cCaptionResid\":\"P_YS_FED_IMP-DFM-FE_0000020886\",\"cShowCaption\":\"复制\",\"cShowCaptionResid\":\"P_YS_FED_IMP-DFM-FE_0000020886\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407212\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnCopy'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n var self = this;\n args.disabledCallback = function () {\n self.setDisabled(true);\n }\n args.enabledCallback = function () {\n self.setDisabled(false);\n }\n \n biz.do('copy',_this, args)\n });\n \n \n _this.get('btnExport').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cCommand\":\"cmdExport\",\"cAction\":\"batchoutput\",\"cSvcUrl\":\"/bill/export?action=output\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"fieldName\":\"btnExport\",\"fieldRuntimeState\":false,\"cItemName\":\"btnExport\",\"cCaption\":\"导出所选记录\",\"cCaptionResid\":\"P_YS_PF_GZTTMP_0000079981\",\"cShowCaption\":\"导出所选记录\",\"cShowCaptionResid\":\"P_YS_PF_GZTTMP_0000079981\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cParent\":\"1849710493407208\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407202\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnExport'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n var self = this;\n args.disabledCallback = function () {\n self.setDisabled(true);\n }\n args.enabledCallback = function () {\n self.setDisabled(false);\n }\n \n biz.do('batchoutput',_this, args)\n });\n \n \n _this.get('btnDelete').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cmdParameter\":\"{\\\"isAsync\\\":true,\\\"isAsyncOne\\\":true}\",\"cCommand\":\"cmdDelete\",\"cAction\":\"batchdelete\",\"cSvcUrl\":\"/bill/batchdelete\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListBody\",\"cParameter\":\"{\\\"isAsync\\\":true,\\\"isAsyncOne\\\":true}\",\"fieldName\":\"btnDelete\",\"fieldRuntimeState\":false,\"cItemName\":\"btnDelete\",\"cCaption\":\"删除\",\"cCaptionResid\":\"P_YS_FED_IMP_IOT0000008165\",\"cShowCaption\":\"删除\",\"cShowCaptionResid\":\"P_YS_FED_IMP_IOT0000008165\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407198\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnDelete'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n var self = this;\n args.disabledCallback = function () {\n self.setDisabled(true);\n }\n args.enabledCallback = function () {\n self.setDisabled(false);\n }\n \n biz.do('batchdelete',_this, args)\n });\n \n \n _this.get('btnExport1').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cCommand\":\"cmdExport1\",\"cAction\":\"reportexport\",\"cSvcUrl\":\"/bill/export?action=output\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"fieldName\":\"btnExport1\",\"fieldRuntimeState\":false,\"cItemName\":\"btnExport1\",\"cCaption\":\"导出查询结果\",\"cCaptionResid\":\"P_YS_PF_GZTTMP_0000079931\",\"cShowCaption\":\"导出查询结果\",\"cShowCaptionResid\":\"P_YS_PF_GZTTMP_0000079931\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cParent\":\"1849710493407208\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407213\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnExport1'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n var self = this;\n args.disabledCallback = function () {\n self.setDisabled(true);\n }\n args.enabledCallback = function () {\n self.setDisabled(false);\n }\n \n biz.do('reportexport',_this, args)\n });\n \n \n _this.get('btnPrintDrop').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cmdParameter\":\"{\\\"classifyCode\\\":\\\"ST.st_othinrecord\\\", \\\"params\\\":{\\\"billno\\\":\\\"st_othinrecord\\\"}}\",\"cCommand\":\"cmdPrint\",\"cAction\":\"printpreview\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"cParameter\":\"{\\\"displaymode\\\":\\\"button\\\"}\",\"fieldName\":\"btnPrintDrop\",\"fieldRuntimeState\":false,\"cItemName\":\"btnPrintDrop\",\"cCaption\":\"打印\",\"cCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000025433\",\"cShowCaption\":\"打印\",\"cShowCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000025433\",\"bEnum\":false,\"cControlType\":\"dropdownbutton\",\"iStyle\":0,\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407215\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnPrintDrop'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n biz.do('printpreview',_this, args)\n });\n \n \n _this.get('btnPrintReview').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cmdParameter\":\"{\\\"classifyCode\\\":\\\"ST.st_othinrecord\\\", \\\"params\\\":{\\\"billno\\\":\\\"st_othinrecord\\\"}}\",\"cCommand\":\"cmdPrint\",\"cAction\":\"printpreview\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"cParameter\":\"{\\\"classifyCode\\\":\\\"ST.st_othinrecord\\\", \\\"params\\\":{\\\"billno\\\":\\\"st_othinrecord\\\"}}\",\"fieldName\":\"btnPrintReview\",\"fieldRuntimeState\":false,\"cItemName\":\"btnPrintReview\",\"cCaption\":\"打印预览\",\"cCaptionResid\":\"P_YS_PF_PROCENTER_0000027569\",\"cShowCaption\":\"打印预览\",\"cShowCaptionResid\":\"P_YS_PF_PROCENTER_0000027569\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cParent\":\"1849710493407215\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407216\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnPrintReview'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n biz.do('printpreview',_this, args)\n });\n \n \n _this.get('btnBodyJointquery').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cCommand\":\"cmdJointquery\",\"cAction\":\"jointquery\",\"cHttpMethod\":\"GET\",\"cTarget\":\"ListBody\",\"fieldName\":\"btnBodyJointquery\",\"fieldRuntimeState\":false,\"cItemName\":\"btnBodyJointquery\",\"cCaption\":\"全局联查\",\"cCaptionResid\":\"P_YS_SD_SCMSA-UI_0000162076\",\"cShowCaption\":\"全局联查\",\"cShowCaptionResid\":\"P_YS_SD_SCMSA-UI_0000162076\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407221\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnBodyJointquery'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n biz.do('jointquery',_this, args)\n });\n \n \n _this.get('btnJointquery').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cCommand\":\"cmdJointquery\",\"cAction\":\"jointquery\",\"cHttpMethod\":\"GET\",\"cTarget\":\"ListBody\",\"fieldName\":\"btnJointquery\",\"fieldRuntimeState\":false,\"cItemName\":\"btnJointquery\",\"cCaption\":\"联查\",\"cCaptionResid\":\"P_YS_PF_PROCENTER_0000027081\",\"cShowCaption\":\"联查\",\"cShowCaptionResid\":\"P_YS_PF_PROCENTER_0000027081\",\"bEnum\":false,\"cControlType\":\"YSButton\",\"iStyle\":0,\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407225\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnJointquery'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n biz.do('jointquery',_this, args)\n });\n \n \n _this.get('btnEdit').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cCommand\":\"cmdEdit\",\"cAction\":\"edit\",\"cSvcUrl\":\"/bill/edit\",\"cHttpMethod\":\"GET\",\"cTarget\":\"ListBody\",\"fieldName\":\"btnEdit\",\"fieldRuntimeState\":false,\"cItemName\":\"btnEdit\",\"cCaption\":\"编辑\",\"cCaptionResid\":\"P_YS_FED_IMP-DFM-FE_0000020875\",\"cShowCaption\":\"编辑\",\"cShowCaptionResid\":\"P_YS_FED_IMP-DFM-FE_0000020875\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407197\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnEdit'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n var self = this;\n args.disabledCallback = function () {\n self.setDisabled(true);\n }\n args.enabledCallback = function () {\n self.setDisabled(false);\n }\n \n biz.do('edit',_this, args)\n });\n \n \n _this.get('btnAddOrderLendrecord').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cmdParameter\":\"{\\\"billnumber\\\":\\\"othinrecordlist_pull_lendrecord\\\",\\\"target\\\":\\\"uscmf_lendrecord\\\"}\",\"cCommand\":\"cmdPullLendrecord\",\"cAction\":\"pullx\",\"cTarget\":\"ListHeader\",\"cParameter\":\"{\\\"billnumber\\\":\\\"othinrecordlist_pull_lendrecord\\\",\\\"target\\\":\\\"uscmf_lendrecord\\\"}\",\"fieldName\":\"btnAddOrderLendrecord\",\"fieldRuntimeState\":false,\"cItemName\":\"btnAddOrderLendrecord\",\"cCaption\":\"借出归还入库\",\"cCaptionResid\":\"P_YS_SCM_UIT_0001264492\",\"cShowCaption\":\"借出归还入库\",\"cShowCaptionResid\":\"P_YS_SCM_UIT_0001264492\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cParent\":\"1849710493407206\",\"bVmExclude\":0,\"iOrder\":30,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710495008383\",\"cExtProps\":\"{\\\"iOrder\\\":30.0}\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnAddOrderLendrecord'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n biz.do('pullx',_this, args)\n });\n \n \n _this.get('btnImportDrop').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cCommand\":\"cmdImportDrop\",\"cAction\":\"tempexport\",\"cSvcUrl\":\"/billtemp/export?action=output\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"fieldName\":\"btnImportDrop\",\"fieldRuntimeState\":false,\"cItemName\":\"btnImportDrop\",\"cCaption\":\"导入\",\"cCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024986\",\"cShowCaption\":\"导入\",\"cShowCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000024986\",\"bEnum\":false,\"cControlType\":\"dropdownbutton\",\"iStyle\":0,\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407209\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnImportDrop'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n var self = this;\n args.disabledCallback = function () {\n self.setDisabled(true);\n }\n args.enabledCallback = function () {\n self.setDisabled(false);\n }\n \n biz.do('tempexport',_this, args)\n });\n \n \n _this.get('btnBatchUnsubmit').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cCommand\":\"cmdUnsubmit\",\"cAction\":\"batchdo\",\"cSvcUrl\":\"/bill/batchDo?action=unsubmit\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"fieldName\":\"btnBatchUnsubmit\",\"fieldRuntimeState\":false,\"cItemName\":\"btnBatchUnsubmit\",\"cCaption\":\"撤回\",\"cCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000025104\",\"cShowCaption\":\"撤回\",\"cShowCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000025104\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"cParent\":\"1849710493407231\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407233\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnBatchUnsubmit'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n var self = this;\n args.disabledCallback = function () {\n self.setDisabled(true);\n }\n args.enabledCallback = function () {\n self.setDisabled(false);\n }\n \n biz.do('batchdo',_this, args)\n });\n \n \n _this.get('btnUnsubmit').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cCommand\":\"cmdUnsubmit\",\"cAction\":\"batchdo\",\"cSvcUrl\":\"/bill/batchDo?action=unsubmit\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"fieldName\":\"btnUnsubmit\",\"fieldRuntimeState\":false,\"cItemName\":\"btnUnsubmit\",\"cCaption\":\"撤回\",\"cCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000025104\",\"cShowCaption\":\"撤回\",\"cShowCaptionResid\":\"P_YS_FED_UCFBASEDOC_0000025104\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407241\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnUnsubmit'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n var self = this;\n args.disabledCallback = function () {\n self.setDisabled(true);\n }\n args.enabledCallback = function () {\n self.setDisabled(false);\n }\n \n biz.do('batchdo',_this, args)\n });\n \n \n _this.get('btnAddDrop').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cCommand\":\"cmdAddDrop\",\"cAction\":\"add\",\"cSvcUrl\":\"/bill/add\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"fieldName\":\"btnAddDrop\",\"fieldRuntimeState\":false,\"cItemName\":\"btnAddDrop\",\"cCaption\":\"新增\",\"cCaptionResid\":\"P_YS_FED_FW_0000021020\",\"cShowCaption\":\"新增\",\"cShowCaptionResid\":\"P_YS_FED_FW_0000021020\",\"bEnum\":false,\"cControlType\":\"dropdownbutton\",\"iStyle\":0,\"cParameter\":\"{\\\"displaymode\\\":\\\"button\\\",\\\"action\\\":\\\"add\\\"}\",\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407206\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnAddDrop'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n var self = this;\n args.disabledCallback = function () {\n self.setDisabled(true);\n }\n args.enabledCallback = function () {\n self.setDisabled(false);\n }\n \n biz.do('add',_this, args)\n });\n \n \n _this.get('btnAttachment').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cCommand\":\"cmdAttachment\",\"cAction\":\"attachment\",\"cTarget\":\"YSListViewToolBar_left\",\"fieldName\":\"btnAttachment\",\"fieldRuntimeState\":false,\"cItemName\":\"btnAttachment\",\"cCaption\":\"附件\",\"cShowCaption\":\"附件\",\"bEnum\":false,\"cControlType\":\"YSAttachmentButton\",\"iStyle\":2,\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"2752796256490382\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnAttachment'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n biz.do('attachment',_this, args)\n });\n \n \n _this.get('btnBatchDelete').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cmdParameter\":\"{\\\"isAsync\\\":true,\\\"isAsyncOne\\\":true}\",\"cCommand\":\"cmdBatchDelete\",\"cAction\":\"batchdelete\",\"cSvcUrl\":\"/bill/batchdelete\",\"cHttpMethod\":\"POST\",\"cParameter\":\"{\\\"isAsync\\\":true,\\\"isAsyncOne\\\":true}\",\"fieldName\":\"btnBatchDelete\",\"fieldRuntimeState\":false,\"cItemName\":\"btnBatchDelete\",\"cCaption\":\"删除\",\"cCaptionResid\":\"P_YS_FED_IMP_IOT0000008165\",\"cShowCaption\":\"删除\",\"cShowCaptionResid\":\"P_YS_FED_IMP_IOT0000008165\",\"bEnum\":false,\"cControlType\":\"button\",\"iStyle\":0,\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407211\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnBatchDelete'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n var self = this;\n args.disabledCallback = function () {\n self.setDisabled(true);\n }\n args.enabledCallback = function () {\n self.setDisabled(false);\n }\n \n biz.do('batchdelete',_this, args)\n });\n \n \n _this.get('btnExportDrop').on('click',function(params){\n var args = cb.utils.extend(true, {}, {\"cCommand\":\"cmdExportDrop\",\"cAction\":\"batchoutput\",\"cSvcUrl\":\"/bill/export?action=output\",\"cHttpMethod\":\"POST\",\"cTarget\":\"ListHeader\",\"fieldName\":\"btnExportDrop\",\"fieldRuntimeState\":false,\"cItemName\":\"btnExportDrop\",\"cCaption\":\"导出\",\"cCaptionResid\":\"P_YS_FED_IMP_IOT0000007727\",\"cShowCaption\":\"导出\",\"cShowCaptionResid\":\"P_YS_FED_IMP_IOT0000007727\",\"bEnum\":false,\"cControlType\":\"dropdownbutton\",\"iStyle\":0,\"bVmExclude\":0,\"iOrder\":0,\"uncopyable\":false,\"bEnableFormat\":false,\"key\":\"1849710493407208\",\"domainKey\":\"ustock\",\"needClear\":false}, { key: 'btnExportDrop'},{ params: params });\n args.cShowCaption = this._get_data('cShowCaption');\n args.cCaption = this._get_data('cCaption');\n \n var self = this;\n args.disabledCallback = function () {\n self.setDisabled(true);\n }\n args.enabledCallback = function () {\n self.setDisabled(false);\n }\n \n biz.do('batchoutput',_this, args)\n });\n \n \n \n //check\n \n \n\n _this.on('columnSetting',function(params){\n biz.do('columnSetting',_this,params);\n });\n //common command events end\n \n \n // common standard events start ***************>>>\n // standardEvents\n \n \n //common standard events end <<<***************\n \n \n // common GridModel column events start >>>>>>>>>>>>>>>>>\n \n \n // >>>>>>>>>>>>>>>>>> common gridmodel colum events end\n \n \n // common proxy events start ============>\n // events\n \n \n //common proxy events end <============\n \n\n if(billType == 'editvoucherlist'){\n var girdModelKeys = [\"st_othinrecordlist\"]\n if(girdModelKeys){\n girdModelKeys.forEach(function(key){\n var gridModel = _this.get(key);\n if(gridModel){\n gridModel.on('afterCellValueChange',function(params){\n // if(params) params.childrenField = key;\n biz.do('cellCheck',_this, params);\n })\n }\n })\n }\n }\n\n _this.on('toggle',function(params){\n biz.do('toggle',_this,params);\n });\n //注册\n _this.on('filterClick',function(params){\n biz.do('search',_this,params);\n });\n\n \n\n this.biz = biz;\n // this.initData();\n };\n model.prototype.initData = function () {\n console.info('%c ST_st_othinrecordlist_VM js viewmodel initData, yon can debug it by setting the [window.__debugger_initData = true]', 'color:steelblue');\n if (window && window.__debugger_initData) debugger;\n // if(cb.biz['ST'] && cb.biz['ST']['ST_st_othinrecordlist_VM_Extend']){\n // console.info('%c ST_st_othinrecordlist_VM_Extend extendjs doAction', 'color:green');\n // cb.biz['ST']['ST_st_othinrecordlist_VM_Extend'].doAction(\"init\", this);\n // }else{\n // console.log('%c no extend js' , 'font-size:22pt;color:red');\n // }\n var self = this;\n var extendFile = 'ST/ST_st_othinrecordlist_VM.Extend.js';\n cb.require('ustock', [extendFile], function (extend){\n if (extend && extend.doAction) {\n console.info('%c ST_st_othinrecordlist_VM_Extend extendjs doAction', 'color:green');\n // 处理扩展脚本异常导致渲染失败 yueming\n try {\n // 临时切换到lazyExecute\n cb.models.BaseModel.prototype.lazyExecuteMode = true\n extend.doAction(\"init\", self);\n // 再切换回来\n cb.models.BaseModel.prototype.lazyExecuteMode = false\n } catch (error) {\n console.error('Exception in business script, please check');\n console.error(error);\n }\n } else {\n console.error('%c 语法错误 ' + extendFile , 'font-size:12pt;color:#860786');\n console.error('%c extendVmName-->ST_st_othinrecordlist_VM_Extend','font-size:12pt;color:#860786')\n }\n self.execute('extendReady',self);\n }, function(error){\n console.info('%c 未找到 ' + extendFile , 'font-size:12pt;color:#860786');\n console.info('%c extendVmName-->ST_st_othinrecordlist_VM_Extend','font-size:12pt;color:#860786')\n self.execute('extendReady',self);\n });\n };\n\n return model;\n });\n\n \n "

 }

}

## [](#7-返回参数说明)7. 返回参数说明

||**参数**||**是否可空**||**说明**|
||tplId||否||模板id|
||hasMultiMode||否||是否多模板，一般用于编辑和详情多模板|