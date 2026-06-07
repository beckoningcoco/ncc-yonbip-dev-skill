---
title: "高德地图 AMap"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/01-amap"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 5
---

# 高德地图 AMap

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/01-amap | 所属：移动组件

# [](#高德地图-amap)高德地图 AMap

## [](#1-功能说明)1. 功能说明

- 移动端高德地图组件，编辑态展示地点输入框。点击地点输入框选择地点带入parentViewModal中当前输入框value以及parentViewModal中latitude、longitude经纬度。支持拓展脚本动态更新经纬度与地址信息。
- 浏览态showMapPosition:true参数控制展示地图。默认不展示，支持全屏操作。参见《拓展属性cStyle》
- 浏览态hideAddressTxt参数控制隐藏地址文字，默认显示。参见《拓展属性cStyle》

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/AMapgaodeditu-image1.83275e9f.jpeg) 
               
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/AMapgaodeditu-image2.bca95834.jpeg) 
               
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/AMapgaodeditu-image3.cf5444d1.jpeg) 
               
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/AMapgaodeditu-image4.dbca74e6.jpeg)

## [](#3-基本属性)3. 基本属性

## [](#4-拓展属性cstyle)4. 拓展属性cStyle

||属性名称||属性含义||值类型||属性说明|
||属性名称||属性含义||值类型||属性说明|
||showMapPosition||是否展示地图（浏览态）||bool||默认为false|
||hideAddressTxt||是否隐藏地址信息文字（浏览态）||bool||默认为false|

## [](#5-拓展脚本支持)5. 拓展脚本支持

**拓展脚本动态设置经纬度与地址信息**

viewmodel.get('position').setValue({

 latitude: "45.331008",

 longitude: "117.178927",

 address: "测试内蒙古位置"

});

## [](#6-使用场景示例)6. 使用场景示例

### [](#61-隐藏地址信息展示地图)6.1. 隐藏地址信息展示地图

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/AMapgaodeditu-image5.08c1908c.jpeg)

#### [](#611-关键配置)6.1.1. 关键配置

"cStyle":
"{"showMapPosition":true，"hideAddressTxt":true}"

#### [](#612-meta示例)6.1.2. meta示例

{

 "groupId": 8437674,

 "parentId": 8437673,

 "cName": "地址信息数据区",

 "cNameResid": "P_YS_AM_AMBD-UI_0001210709",

 "iOrder": 17,

 "bMain": true,

 "cCode": "aim_equip_card_head",

 "cDataSourceName": "aim.equip.EquipHeadVO",

 "cControlType": "group",

 "cGroupCode": "card_address_info_data",

 "cAlign": "center",

 "iCols": 3,

 "controls": [

 {

 "cItemName": "position",

 "cCaption": "坐标位置",

 "cCaptionResid": "P_YS_AM_AMBD-UI_0001210710",

 "cShowCaption": "坐标位置",

 "cShowCaptionResid": "P_YS_AM_AMBD-UI_0001210710",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": false,

 "bHidden": false,

 "bCanModify": true,

 "iMaxShowLen": 255,

 "iColWidth": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 22,

 "bIsNull": true,

 "bPrintCaption": true,

 "cControlType": "map",

 "iOrder": 22,

 "bMain": true,

 "id": "10700000000040361",

 "bVmExclude": 2,

 "iBillTplGroupId": 8437674,

 "iBillId": 1420069,

 "iBillEntityId": 2270614,

 "iTplId": 1609022,

 "cSubId": "ambd",

 "iSystem": 1,

 "cName": "position",

 "cFieldName": "position",

 "authLevel": 3,

 "cDataSourceName": "aim.equip.EquipHeadVO",

 "enterDirection": 4,

 "bEnableFormat": false,

 "cStyle": "{\"showMapPosition\":true，\"hideAddressTxt\":true}",

 "bCanImport": "false"

 },

 {

 "cItemName": "install_location",

 "cCaption": "行政区划",

 "cCaptionResid": "P_YS_PF_GZTTMP_0000073851",

 "cShowCaption": "行政区划",

 "cShowCaptionResid": "P_YS_PF_GZTTMP_0000073851",

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bCanModify": true,

 "iColWidth": 1,

 "bShowIt": true,

 "iTabIndex": 42,

 "bIsNull": true,

 "cControlType": "cascader",

 "iOrder": 42,

 "bMain": true,

 "cStyle": "{\"proxy\":{\"method\":\"POST\",\"url\":\"/region/getAllregion\"},\"params\":{\"domain\":\"ucfbasedoc\"},\"explains_ori\":\"请输入安装地点名称（省-市-县（区））\",\"explains\":\"请输入安装地点名称（省-市-县（区））\"}",

 "id": "10700000000040462",

 "bVmExclude": 0,

 "iBillTplGroupId": 8437674,

 "iBillId": 1420069,

 "iBillEntityId": 2270614,

 "iTplId": 1609022,

 "cSubId": "ambd",

 "iSystem": 1,

 "cName": "install_location",

 "cFieldName": "install_location",

 "authLevel": 3,

 "cDataSourceName": "aim.equip.EquipHeadVO",

 "enterDirection": 4,

 "bEnableFormat": false

 },

 {

 "cItemName": "latitude",

 "cCaption": "纬度",

 "cCaptionResid": "P_YS_FED_FW_0000022217",

 "cShowCaption": "纬度",

 "cShowCaptionResid": "P_YS_FED_FW_0000022217",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bCanModify": false,

 "iMaxShowLen": 255,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 72,

 "bIsNull": true,

 "bPrintCaption": true,

 "cControlType": "input",

 "iOrder": 72,

 "bMain": true,

 "cStyle": "{\"examples\":\"102.989821\"}",

 "id": "10700000000039710",

 "bVmExclude": 0,

 "iBillTplGroupId": 8437674,

 "iBillId": 1420069,

 "iBillEntityId": 2270614,

 "iTplId": 1609022,

 "cSubId": "ambd",

 "iSystem": 1,

 "cName": "latitude",

 "cFieldName": "latitude",

 "authLevel": 3,

 "cDataSourceName": "aim.equip.EquipHeadVO",

 "enterDirection": 4,

 "bEnableFormat": false

 },

 {

 "cItemName": "longitude",

 "cCaption": "经度",

 "cCaptionResid": "P_YS_FED_FW_0000021775",

 "cShowCaption": "经度",

 "cShowCaptionResid": "P_YS_FED_FW_0000021775",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bCanModify": false,

 "iMaxShowLen": 255,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 73,

 "bIsNull": true,

 "bPrintCaption": true,

 "cControlType": "input",

 "iOrder": 73,

 "bMain": true,

 "cStyle": "{\"examples\":\"90.9893223\"}",

 "id": "10700000000039711",

 "bVmExclude": 0,

 "iBillTplGroupId": 8437674,

 "iBillId": 1420069,

 "iBillEntityId": 2270614,

 "iTplId": 1609022,

 "cSubId": "ambd",

 "iSystem": 1,

 "cName": "longitude",

 "cFieldName": "longitude",

 "authLevel": 3,

 "cDataSourceName": "aim.equip.EquipHeadVO",

 "enterDirection": 4,

 "bEnableFormat": false

 },

 {

 "cItemName": "coordinate_data",

 "cCaption": "区域经纬度数据",

 "cShowCaption": "区域经纬度数据",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 255,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 75,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": true,

 "cControlType": "Input",

 "iOrder": 74,

 "bMain": true,

 "id": "10700000000162161",

 "bVmExclude": 2,

 "iBillTplGroupId": 8437674,

 "iBillId": 1420069,

 "iBillEntityId": 2270614,

 "iTplId": 1609022,

 "cSubId": "ambd",

 "iSystem": 1,

 "cName": "coordinate_data",

 "cFieldName": "coordinate_data",

 "authLevel": 3,

 "cDataSourceName": "aim.equip.EquipHeadExtendVO",

 "enterDirection": 4,

 "bEnableFormat": false

 }

 ],

 "iBillEntityId": 2270614

}