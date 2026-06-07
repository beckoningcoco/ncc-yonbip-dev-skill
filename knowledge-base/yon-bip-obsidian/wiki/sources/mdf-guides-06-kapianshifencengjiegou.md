---
title: "卡片式分层结构"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/06-kapianshifencengjiegou"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 卡片式分层结构

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/06-kapianshifencengjiegou | 所属：指南

# [](#卡片式分层结构)卡片式分层结构

## [](#1-增加底部折叠组件)1. 增加底部折叠组件

标准主子表没有一级标题，并且只显示二级标题（如下图：灰色的折叠展开是二级标题）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kapianshifencengjiegou_image1.1774749e.jpeg)

在主表区的GroupContainner组件的cSytle中配置showMoreLine属性

底部折叠组件显示
（规则：默认展开显示，默认收起到三行高度，只有一个组的情况，并且小于三行高度，折叠组件会隐藏，可以自定义收起的高度），详见：《[卡片式折叠收起](#/guides/06-kapianshizhedieshouqi)》

## [](#2-支持一级标题显示)2. 支持一级标题显示

流式布局中使用一级标题，不使用底部折叠组件（如下图：红色的折叠展开是一级标题）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kapianshifencengjiegou_image2.a2811201.jpeg)

## [](#3-属性说明)3. 属性说明

### [](#31-基本属性)3.1. 基本属性

||属性名称||属性含义||值类型||属性说明|
||cName||标题显示||String||一级标题取groupcontainer中的，二级标题取group中的|

### [](#32-扩展属性-cstyle)3.2. 扩展属性 cStyle

单据在groupContainer容器的cStyle中配置属性，如：{"autoSize": true}

||属性名称||属性含义||值类型||示例|
||firstTitle||是否显示一级标题||boolean||{"firstTitle"：true}|
||collapse||控制一级标题或者底部折叠组件的展开折叠||boolean||false 展开（默认），true 折叠|
||底部折叠组件的展开折叠区分浏览态与编辑态，默认值编辑态展开，浏览态折叠||json||"cStyle": "{"collapse":[{"mode":"add","collapse":flase},{"mode":"browse","collapse":true}]}"|||
||definedcollapseHeight||一级标题或者底部折叠组件自定义折叠高度||||{"definedcollapseHeight":"60px"}|
||classname||自定义样式类名||string||"classname":"groupContainerWhite" 可设置groupcontainer背景色为白色|
||hideShowMoreLine||是否隐藏底部折叠组件||boolean||false 展示（默认）true隐藏|
||cancelContainerMaxHeight||是否取消groupcontainer展开的最大高度||boolean||false不取消（默认）true取消|
||containerMaxHeightScale||展开最大高度比例设置||number||示例0.3，展开页面高度（除去工作台头部高度）的比列|

二级标题在group容器的cStyle中配置属性

||属性名称||属性含义||值类型||示例|
||collapse||二级标题是否显示展开、折叠功能||boolean||true 显示 false 不显示|
||collapsed||二级标题控制展开折叠状态||boolean||true折叠，false 展开|
||collapsedObj||二级标题浏览态与编辑态折叠状态配置( collapsedObj优先级更高)||json||"cStyle": "{"visible":true,"collapsedObj":[{"mode":"add","collapsed":true},{"mode":"browse","collapsed":false}],"collapse":true}"|

## [](#4-数据示例)4. 数据示例

1. groupContainer 中嵌套
group，每个groupContainer最多有一个底部折叠组件，每个groupContainer只能有一个一级标题

{

 "groupId": 2733,

 "parentId": 2731,

 "cName": "表头页签",

 "cNameResid": "P_YS_SD_SDOC-UI_0000170501",

 "iOrder": 3,

 "bMain": true,

 "cCode": "rmm_workorder_card",

 "cDataSourceName": "rmm.workorder.WorkOrderVO",

 "cControlType": "GroupContainer",

 "cGroupCode": "rmm_workorder_cardgroupcontainer",

 "cAlign": "top",

 "iCols": 0,

 "containers": [{

 "groupId": 2734,

 "parentId": 2733,

 "cName": "概要",

 "cNameResid": "P_YS_AM_RMM-UI_0001217367",

 "iOrder": 4,

 "bMain": true,

 "cCode": "rmm_workorder_card",

 "cDataSourceName": "rmm.workorder.WorkOrderVO",

 "cControlType": "Group",

 "cGroupCode": "rmm_workorder_cardgroup_base",

 "cAlign": "center",

 "iCols": 0,

 "cStyle": "{"collapse":"true","collapsed":false}",

 "containers": [{

 "groupId": 2735,

 "parentId": 2734,

 "cName": "概要数据",

 "cNameResid": "P_YS_AM_RMM-UI_0001217368",

 "iOrder": 5,

 "bMain": true,

 "cCode": "rmm_workorder_card",

 "cDataSourceName": "rmm.workorder.WorkOrderVO",

 "cControlType": "Div",

 "cGroupCode": "rmm_workorder_carddiv_base",

 "cAlign": "center",

 "iCols": 3,

 "controls": [{

 "cItemName": "memo",

 "cCaption": "备注",

 "cCaptionResid": "P_YS_FI_CM_0000029174",

 "cShowCaption": "备注",

 "cShowCaptionResid": "P_YS_FI_CM_0000029174",

 "iMaxLength": 200,

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

 "iTabIndex": 600,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "Input",

 "iOrder": 600,

 "bMain": true,

 "id": 68833,

 "bVmExclude": 0,

 "iBillTplGroupId": 2735,

 "iBillId": 138,

 "iBillEntityId": 551,

 "iTplId": 155,

 "cSubId": "rmm",

 "iSystem": 1,

 "cName": "memo",

 "cFieldName": "memo",

 "authLevel": 3,

 "cDataSourceName": "rmm.workorder.WorkOrderVO",

 "enterDirection": 4,

 "bEnableFormat": false

 }],

 "iBillEntityId": 551

 }],

 "iBillEntityId": 551

 }],

 "iBillEntityId": 551

}

- groupContainer 中如果嵌套多页签使用

{

 "UI#designType": "ysmdd",

 "UI#otherCount": 4,

 "bMain": false,

 "cAlign": "right",

 "cCode": "body_entity_001_2770944491426048",

 "cControlType": "groupcontainer",

 "cDataSourceName": "",

 "cGroupCode": "groupcontainer38nb",

 "cName": "卡片组6",

 "cStyle": "{\"firstTitle\":true,\"collapse\":false}",

 "children": [

 {

 "UI#designType": "ysmdd",

 "UI#otherCount": 4,

 "bMain": false,

 "cAlign": "right",

 "cCode": "body_entity_001_2770944491426048",

 "cControlType": "linetabs",

 "cDataSourceName": "",

 "cGroupCode": "linetabs14yf",

 "cName": "多页签7",

 "cStyle": "{\"tabsVisible\":true}",

 "children": [

 {

 "UI#TabType": "tabpane",

 "UI#designType": "ysmdd",

 "UI#otherCount": 6,

 "UI#repeat": true,

 "bMain": false,

 "cAlign": "right",

 "cCode": "sub_entity_001_2770944491426049",

 "cControlType": "tabpane",

 "cDataSourceName": "",

 "cGroupCode": "tabpane15zg",

 "cName": "子页签1",

 "children": [

 {

 "UI#controlCount": 15,

 "UI#designType": "ysmdd",

 "UI#repeat": true,

 "bMain": false,

 "cAlign": "right",

 "cCode": "sub_entity_001_2770944491426049",

 "cControlType": "table",

 "cDataSourceName": "GT14530AT5.GT14530AT5.sub_entity_001",

 "cGroupCode": "table18pc",

 "cName": "表格1",

 "cParentCode": "body_entity_001_2770944491426048",

 "cPrimaryKey": "id",

 "children": [

 {

 "UI#designType": "ysmdd",

 "UI#repeat": true,

 "bCanModify": false,

 "bEnableFormat": true,

 "bEnum": false,

 "bExtend": false,

 "bFilter": true,

 "bHidden": false,

 "bIsNull": true,

 "bJointQuery": false,

 "bMain": true,

 "bMustSelect": false,

 "bNeedSum": false,

 "bShowIt": true,

 "bSplit": false,

 "bVmExclude": 2,

 "cCaption": "时间框1",

 "cControlType": "timepicker",

 "cDataSourceName": "",

 "cEnumString": "",

 "cEnumType": "",

 "cFieldName": "item168kk",

 "cItemName": "item168kk",

 "cRefRetId": "{}",

 "cRefType": "",

 "cShowCaption": "时间框1",

 "cSubId": "GT14530AT5",

 "designId": "billItem_1536851990055223297",

 "enterDirection": 0,

 "entityCode": "sub_entity_001_2770944491426049",

 "iBillEntityId": "10038616",

 "iBillTplGroupId": "1536851990055223296",

 "iColWidth": 150,

 "iOrder": 250,

 "iSystem": false,

 "id": "1536851990055223297",

 "ideDesignType": "ysmdd",

 "isExport": true,

 "multiple": false,

 "nid": "nid_1662113967055_4_1662114346409_0",

 "pubts": "1662113862546",

 "refReturn": "",

 "uiObject": "controls",

 "uiTable": "BillItemBase",

 "uikey": "item168kk",

 "uititle": "时间框1",

 "uitype": "timepicker",

 "uncopyable": true,

 "virtualField": true,

 "UI#isShow": true

 },

 {

 "UI#designType": "ysmdd",

 "UI#repeat": true,

 "bCanModify": true,

 "bEnum": false,

 "bExtend": false,

 "bFilter": true,

 "bHidden": false,

 "bIsNull": true,

 "bJointQuery": false,

 "bMain": true,

 "bMustSelect": false,

 "bNeedSum": false,

 "bShowIt": true,

 "bSplit": false,

 "bVmExclude": 0,

 "cCaption": "名称",

 "cControlType": "input",

 "cDataSourceName": "GT14530AT5.GT14530AT5.sub_entity_001",

 "cEnumString": "",

 "cEnumType": "",

 "cFieldName": "mingchen",

 "cItemName": "mingchen",

 "cRefRetId": "{}",

 "cRefType": "",

 "cShowCaption": "名称",

 "cSubId": "GT14530AT5",

 "cSumType": "support",

 "designId": "billItem_1536851990055223298",

 "enterDirection": 0,

 "entityCode": "sub_entity_001_2770944491426049",

 "iBillEntityId": "10038616",

 "iBillTplGroupId": "1536851990055223296",

 "iColWidth": 150,

 "iMaxLength": 200,

 "iOrder": 260,

 "iSystem": false,

 "id": "1536851990055223298",

 "ideDesignType": "ysmdd",

 "isExport": true,

 "multiple": false,

 "nid": "nid_1662114048308_5_1662114346409_1",

 "pubts": "1662113862546",

 "refReturn": "",

 "sysFlag": 0,

 "uiObject": "controls",

 "uiTable": "BillItemBase",

 "uikey": "mingchen",

 "uititle": "名称",

 "uitype": "input",

 "uncopyable": true,

 "UI#isShow": true

 },

 {

 "UI#designType": "ysmdd",

 "UI#repeat": true,

 "bCanModify": true,

 "bEnum": false,

 "bExtend": false,

 "bFilter": true,

 "bHidden": false,

 "bIsNull": true,

 "bJointQuery": false,

 "bMain": true,

 "bMustSelect": true,

 "bNeedSum": false,

 "bShowIt": false,

 "bSplit": false,

 "bVmExclude": 0,

 "cCaption": "ID",

 "cControlType": "input",

 "cDataSourceName": "GT14530AT5.GT14530AT5.sub_entity_001",

 "cEnumString": "",

 "cEnumType": "",

 "cFieldName": "id",

 "cItemName": "id",

 "cRefRetId": "{}",

 "cRefType": "",

 "cShowCaption": "ID",

 "cSubId": "GT14530AT5",

 "cSumType": "support",

 "designId": "billItem_1536851990055223299",

 "enterDirection": 0,

 "entityCode": "sub_entity_001_2770944491426049",

 "iBillEntityId": "10038616",

 "iBillTplGroupId": "1536851990055223296",

 "iColWidth": 150,

 "iMaxLength": 200,

 "iOrder": 270,

 "iSystem": false,

 "id": "1536851990055223299",

 "ideDesignType": "ysmdd",

 "isExport": true,

 "multiple": false,

 "nid": "nid_1662114048310_6_1662114346409_2",

 "pubts": "1662113862546",

 "refReturn": "",

 "sysFlag": 1,

 "uiObject": "controls",

 "uiTable": "BillItemBase",

 "uikey": "id",

 "uititle": "ID",

 "uitype": "input",

 "uncopyable": true,

 "UI#isShow": true

 },

 {

 "UI#designType": "ysmdd",

 "UI#repeat": true,

 "bCanModify": false,

 "bEnableFormat": true,

 "bEnum": false,

 "bExtend": false,

 "bFilter": true,

 "bHidden": false,

 "bIsNull": true,

 "bJointQuery": false,

 "bMain": true,

 "bMustSelect": false,

 "bNeedSum": false,

 "bShowIt": true,

 "bSplit": false,

 "bVmExclude": 2,

 "cCaption": "时间框1",

 "cControlType": "timepicker",

 "cDataSourceName": "",

 "cEnumString": "",

 "cEnumType": "",

 "cFieldName": "item168kk",

 "cItemName": "item168kk",

 "cRefRetId": "{}",

 "cRefType": "",

 "cShowCaption": "时间框1",

 "cSubId": "GT14530AT5",

 "designId": "billItem_1536854498316124166",

 "enterDirection": 0,

 "entityCode": "sub_entity_001_2770944491426049",

 "iBillEntityId": "10038616",

 "iBillTplGroupId": "1536851990055223296",

 "iColWidth": 150,

 "iOrder": 280,

 "iSystem": false,

 "id": "1536854498316124166",

 "ideDesignType": "ysmdd",

 "isExport": true,

 "multiple": false,

 "nid": "nid_1662113967055_4_1662114346409_3",

 "pubts": "1662113862546",

 "refReturn": "",

 "uiObject": "controls",

 "uiTable": "BillItemBase",

 "uikey": "item168kk",

 "uititle": "时间框1",

 "uitype": "timepicker",

 "uncopyable": true,

 "virtualField": true,

 "UI#isShow": true

 },

 {

 "UI#designType": "ysmdd",

 "UI#repeat": true,

 "bCanModify": true,

 "bEnum": false,

 "bExtend": false,

 "bFilter": true,

 "bHidden": false,

 "bIsNull": true,

 "bJointQuery": false,

 "bMain": true,

 "bMustSelect": false,

 "bNeedSum": false,

 "bShowIt": true,

 "bSplit": false,

 "bVmExclude": 0,

 "cCaption": "名称",

 "cControlType": "input",

 "cDataSourceName": "GT14530AT5.GT14530AT5.sub_entity_001",

 "cEnumString": "",

 "cEnumType": "",

 "cFieldName": "mingchen",

 "cItemName": "mingchen",

 "cRefRetId": "{}",

 "cRefType": "",

 "cShowCaption": "名称",

 "cSubId": "GT14530AT5",

 "cSumType": "support",

 "designId": "billItem_1536854498316124167",

 "enterDirection": 0,

 "entityCode": "sub_entity_001_2770944491426049",

 "iBillEntityId": "10038616",

 "iBillTplGroupId": "1536851990055223296",

 "iColWidth": 150,

 "iMaxLength": 200,

 "iOrder": 290,

 "iSystem": false,

 "id": "1536854498316124167",

 "ideDesignType": "ysmdd",

 "isExport": true,

 "multiple": false,

 "nid": "nid_1662114048308_5_1662114346409_4",

 "pubts": "1662113862546",

 "refReturn": "",

 "sysFlag": 0,

 "uiObject": "controls",

 "uiTable": "BillItemBase",

 "uikey": "mingchen",

 "uititle": "名称",

 "uitype": "input",

 "uncopyable": true,

 "UI#isShow": true

 },

 {

 "UI#designType": "ysmdd",

 "UI#repeat": true,

 "bCanModify": true,

 "bEnum": false,

 "bExtend": false,

 "bFilter": true,

 "bHidden": false,

 "bIsNull": true,

 "bJointQuery": false,

 "bMain": true,

 "bMustSelect": true,

 "bNeedSum": false,

 "bShowIt": false,

 "bSplit": false,

 "bVmExclude": 0,

 "cCaption": "ID",

 "cControlType": "input",

 "cDataSourceName": "GT14530AT5.GT14530AT5.sub_entity_001",

 "cEnumString": "",

 "cEnumType": "",

 "cFieldName": "id",

 "cItemName": "id",

 "cRefRetId": "{}",

 "cRefType": "",

 "cShowCaption": "ID",

 "cSubId": "GT14530AT5",

 "cSumType": "support",

 "designId": "billItem_1536854498316124168",

 "enterDirection": 0,

 "entityCode": "sub_entity_001_2770944491426049",

 "iBillEntityId": "10038616",

 "iBillTplGroupId": "1536851990055223296",

 "iColWidth": 150,

 "iMaxLength": 200,

 "iOrder": 300,

 "iSystem": false,

 "id": "1536854498316124168",

 "ideDesignType": "ysmdd",

 "isExport": true,

 "multiple": false,

 "nid": "nid_1662114048310_6_1662114346409_5",

 "pubts": "1662113862546",

 "refReturn": "",

 "sysFlag": 1,

 "uiObject": "controls",

 "uiTable": "BillItemBase",

 "uikey": "id",

 "uititle": "ID",

 "uitype": "input",

 "uncopyable": true,

 "UI#isShow": true

 }

 ],

 "designId": "group_1536851990055223296",

 "groupId": "1536851990055223296",

 "iBillEntityId": "10038616",

 "iCols": 1,

 "iOrder": 140,

 "iParentId": "1536850675795230730",

 "ideDesignType": "ysmdd",

 "multiRowModel": false,

 "nid": "nid_1662113928685_3_1662114346409_6",

 "pubts": "1662113862544",

 "showCheckBox": true,

 "showRowNo": true,

 "suitetable": "",

 "suitetableHideHeader": false,

 "uiObject": "containers",

 "uiTable": "BillTplGroupBase",

 "uikey": "table18pc",

 "uititle": "表格1",

 "uitype": "table",

 "virtualField": true,

 "UI#isShow": true,

 "UI#controlOrderArr": [

 250,

 260,

 270,

 280,

 290,

 300

 ],

 "UI#otherOrderArr": []

 },

 {

 "UI#controlCount": 3,

 "UI#designType": "ysmdd",

 "UI#repeat": true,

 "bMain": false,

 "cAlign": "right",

 "cCode": "sub_entity_001_2770944491426049",

 "cControlType": "table",

 "cDataSourceName": "GT14530AT5.GT14530AT5.sub_entity_001",

 "cGroupCode": "table18pc",

 "cName": "表格1",

 "cParentCode": "body_entity_001_2770944491426048",

 "cPrimaryKey": "id",

 "designId": "group_1536854498316124169",

 "groupId": "1536854498316124169",

 "iBillEntityId": "10038616",

 "iCols": 1,

 "iOrder": 150,

 "iParentId": "1536850675795230730",

 "ideDesignType": "ysmdd",

 "multiRowModel": false,

 "nid": "nid_1662113928685_3_1662114346409_7",

 "pubts": "1662113862544",

 "showCheckBox": true,

 "showRowNo": true,

 "suitetable": "",

 "suitetableHideHeader": false,

 "uiObject": "containers",

 "uiTable": "BillTplGroupBase",

 "uikey": "table18pc",

 "uititle": "表格1",

 "uitype": "table",

 "virtualField": true,

 "UI#isShow": true,

 "UI#controlOrderArr": [],

 "UI#otherOrderArr": []

 }

 ],

 "designId": "group_1536850675795230730",

 "groupId": "1536850675795230730",

 "iBillEntityId": "10038616",

 "iCols": 1,

 "iOrder": 130,

 "iParentId": "1536850675795230729",

 "ideDesignType": "ysmdd",

 "nid": "nid_1662113891125_1662113891125_2_1662114346409_8",

 "pubts": "1662113862544",

 "uiObject": "containers",

 "uiTable": "BillTplGroupBase",

 "uikey": "tabpane15zg",

 "uititle": "子页签1",

 "uitype": "tabpane",

 "UI#isShow": true,

 "UI#controlOrderArr": [],

 "UI#otherOrderArr": [

 140,

 150

 ]

 }

 ],

 "designId": "group_1536850675795230729",

 "groupId": "1536850675795230729",

 "iBillEntityId": "10038615",

 "iCols": 1,

 "iOrder": 120,

 "iParentId": "1536850675795230728",

 "ideDesignType": "ysmdd",

 "nid": "nid_1662114296429_1",

 "pubts": "1662113862544",

 "uiObject": "containers",

 "uiTable": "BillTplGroupBase",

 "uikey": "linetabs14yf",

 "uititle": "多页签7",

 "uitype": "linetabs",

 "virtualField": true,

 "UI#isShow": true,

 "UI#controlOrderArr": [],

 "UI#otherOrderArr": [

 130

 ]

 }

 ],

 "designId": "group_1536850675795230728",

 "groupId": "1536850675795230728",

 "iBillEntityId": "10038615",

 "iCols": 1,

 "iOrder": 110,

 "ideDesignType": "ysmdd",

 "nid": "nid_1662113857884_0",

 "pubts": "1662113862544",

 "uiObject": "containers",

 "uiTable": "BillTplGroupBase",

 "uikey": "groupcontainer38nb",

 "uititle": "卡片组6",

 "uitype": "groupcontainer",

 "virtualField": true,

 "UI#isShow": true,

 "UI#controlOrderArr": [],

 "UI#otherOrderArr": [

 120

 ]

}

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kapianshifencengjiegou_image3.8460f871.jpeg)

- 流式布局 - 多个CollapseContainer
一级标题为CollapseContainer的cName，同时cStyle里配置{"firstTitle"：true}

{

 "groupId": 40071,

 "parentId": 2731,

 "cName": "锚点容器",

 "cNameResid": "P_YS_AM_RMM-UI_0001221161",

 "iOrder": 6,

 "bMain": true,

 "cCode": "rmm_workorder_card",

 "cDataSourceName": "rmm.workorder.WorkOrderVO",

 "cControlType": "CollapseContainer",

 "cGroupCode": "rmm_workorder_collapsecontainer",

 "cAlign": "center",

 "iCols": 0,

 "cStyle": "{\"classname\":\"masonryLayout\",\"anchorFixedOpen\":false}",

 "containers": [{

 "groupId": 40210,

 "parentId": 40071,

 "iOrder": 7,

 "bMain": true,

 "cCode": "rmm_workorder_card",

 "cDataSourceName": "rmm.workorder.WorkOrderVO",

 "cControlType": "LineTabs",

 "cGroupCode": "rmm_workorder_cardlinetabs_head",

 "cAlign": "center",

 "iCols": 0,

 "cStyle": "{\"anchorCollapse\":true,\"tabsVisible\":false}",

 "containers": [{

 "groupId": 2736,

 "parentId": 40210,

 "cName": "故障信息",

 "cNameResid": "P_YS_PES_PES-FE_0001108278",

 "iOrder": 6,

 "bMain": true,

 "cCode": "rmm_workorder_card",

 "cDataSourceName": "rmm.workorder.WorkOrderVO",

 "cControlType": "Group",

 "cGroupCode": "rmm_workorder_cardgroup_failure",

 "cAlign": "center",

 "iCols": 0,

 "cStyle": "{\"collapse\":\"true\"}",

 "containers": [{

 "groupId": 2737,

 "parentId": 2736,

 "cName": "故障信息数据",

 "cNameResid": "P_YS_AM_RMM-UI_0001217341",

 "iOrder": 7,

 "bMain": true,

 "cCode": "rmm_workorder_card",

 "cDataSourceName": "rmm.workorder.WorkOrderVO",

 "cControlType": "group",

 "cGroupCode": "rmm_workorder_carddiv_failure",

 "cAlign": "center",

 "iCols": 3,

 "controls": [{

 "cItemName": "failure_time",

 "cCaption": "故障异常时间",

 "cCaptionResid": "P_YS_SCM_UPU-UI_0001213010",

 "cShowCaption": "故障异常时间",

 "cShowCaptionResid": "P_YS_SCM_UPU-UI_0001213010",

 "iMaxLength": 100,

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

 "iTabIndex": 840,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "DateTimePicker",

 "iOrder": 840,

 "bMain": true,

 "id": 68858,

 "bVmExclude": 0,

 "iBillTplGroupId": 2737,

 "iBillId": 138,

 "iBillEntityId": 551,

 "iTplId": 155,

 "cSubId": "rmm",

 "iSystem": 1,

 "cName": "failure_time",

 "cFieldName": "failure_time",

 "authLevel": 3,

 "cDataSourceName": "rmm.workorder.WorkOrderVO",

 "enterDirection": 4,

 "bEnableFormat": false

 }, {

 "cItemName": "pk_failure_detect__name",

 "cCaption": "发现途径",

 "cCaptionResid": "P_YS_PF_GZTSYS_0000135307",

 "cShowCaption": "发现途径",

 "cShowCaptionResid": "P_YS_PF_GZTSYS_0000135307",

 "iMaxLength": 100,

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

 "iTabIndex": 860,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "Refer",

 "cRefType": "ucf-amc-aim.ampub_failure_detect_ref",

 "cRefRetId": "{\"pk_failure_detect\": \"id\"}",

 "refReturn": "name",

 "iOrder": 860,

 "bMain": true,

 "cStyle": "{\"selectedHasBg\":true}",

 "id": 68860,

 "bVmExclude": 0,

 "iBillTplGroupId": 2737,

 "iBillId": 138,

 "iBillEntityId": 551,

 "iTplId": 155,

 "cSubId": "rmm",

 "iSystem": 1,

 "cName": "pk_failure_detect__name",

 "cFieldName": "pk_failure_detect.name",

 "authLevel": 3,

 "cDataSourceName": "rmm.workorder.WorkOrderVO",

 "enterDirection": 4,

 "bEnableFormat": false

 }, {

 "cItemName": "report_time",

 "cCaption": "申请日期",

 "cCaptionResid": "P_YS_HR_HRJQF_0000054487",

 "cShowCaption": "申请日期",

 "cShowCaptionResid": "P_YS_HR_HRJQF_0000054487",

 "iMaxLength": 100,

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

 "cFormatData": "YYYY-MM-DD",

 "iTabIndex": 920,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "DatePicker",

 "iOrder": 920,

 "bMain": true,

 "id": 68866,

 "bVmExclude": 0,

 "iBillTplGroupId": 2737,

 "iBillId": 138,

 "iBillEntityId": 551,

 "iTplId": 155,

 "cSubId": "rmm",

 "iSystem": 1,

 "cName": "report_time",

 "cFieldName": "report_time",

 "authLevel": 3,

 "cDataSourceName": "rmm.workorder.WorkOrderVO",

 "enterDirection": 4,

 "bEnableFormat": false

 }],

 "iBillEntityId": 551

 }],

 "iBillEntityId": 551

 }, {

 "groupId": 2748,

 "parentId": 40210,

 "cName": "成本",

 "cNameResid": "ficloud.000074",

 "iOrder": 18,

 "bMain": true,

 "cCode": "rmm_workorder_card",

 "cDataSourceName": "rmm.workorder.WorkOrderVO",

 "cControlType": "Group",

 "cGroupCode": "rmm_workorder_cardgroup_cost",

 "cAlign": "center",

 "iCols": 0,

 "cStyle": "{\"collapse\":\"true\"}",

 "containers": [{

 "groupId": 2749,

 "parentId": 2748,

 "cName": "成本数据",

 "cNameResid": "P_YS_AM_RMM-UI_0001217330",

 "iOrder": 19,

 "bMain": true,

 "cCode": "rmm_workorder_card",

 "cDataSourceName": "rmm.workorder.WorkOrderVO",

 "cControlType": "group",

 "cGroupCode": "rmm_workorder_carddiv_cost",

 "cAlign": "center",

 "iCols": 3,

 "controls": [{

 "cItemName": "pl_mtr_mny_org",

 "cCaption": "计划物料成本",

 "cCaptionResid": "P_YS_SCM_UPU-UI_0001213044",

 "cShowCaption": "计划物料成本",

 "cShowCaptionResid": "P_YS_SCM_UPU-UI_0001213044",

 "iMaxLength": 28,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "iNumPoint": 2,

 "bCanModify": false,

 "iMaxShowLen": 255,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "cDefaultValue": "0",

 "cFormatData": "{\"related\":\"pk_currtype__moneyDigit\"}",

 "iTabIndex": 1640,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "InputNumber",

 "iOrder": 1640,

 "bMain": true,

 "cStyle": "{\"min\":0}",

 "id": 68938,

 "bVmExclude": 0,

 "iBillTplGroupId": 2749,

 "iBillId": 138,

 "iBillEntityId": 551,

 "iTplId": 155,

 "cSubId": "rmm",

 "iSystem": 1,

 "cName": "pl_mtr_mny_org",

 "cFieldName": "pl_mtr_mny_org",

 "authLevel": 3,

 "cDataSourceName": "rmm.workorder.WorkOrderVO",

 "enterDirection": 4,

 "bEnableFormat": false

 }, {

 "cItemName": "ac_mtr_mny_org",

 "cCaption": "实际物料成本",

 "cCaptionResid": "P_YS_SCM_UPU-UI_0001212986",

 "cShowCaption": "实际物料成本",

 "cShowCaptionResid": "P_YS_SCM_UPU-UI_0001212986",

 "iMaxLength": 28,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "iNumPoint": 2,

 "bCanModify": false,

 "iMaxShowLen": 255,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "cDefaultValue": "0",

 "cFormatData": "{\"related\":\"pk_currtype__moneyDigit\"}",

 "iTabIndex": 1670,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "InputNumber",

 "iOrder": 1670,

 "bMain": true,

 "cStyle": "{\"min\":0}",

 "id": 68941,

 "bVmExclude": 0,

 "iBillTplGroupId": 2749,

 "iBillId": 138,

 "iBillEntityId": 551,

 "iTplId": 155,

 "cSubId": "rmm",

 "iSystem": 1,

 "cName": "ac_mtr_mny_org",

 "cFieldName": "ac_mtr_mny_org",

 "authLevel": 3,

 "cDataSourceName": "rmm.workorder.WorkOrderVO",

 "enterDirection": 4,

 "bEnableFormat": false

 }, {

 "cItemName": "pl_lbr_mny_org",

 "cCaption": "计划人工成本",

 "cCaptionResid": "P_YS_SCM_UPU-UI_0001213034",

 "cShowCaption": "计划人工成本",

 "cShowCaptionResid": "P_YS_SCM_UPU-UI_0001213034",

 "iMaxLength": 28,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "iNumPoint": 2,

 "bCanModify": false,

 "iMaxShowLen": 255,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "cDefaultValue": "0",

 "cFormatData": "{\"related\":\"pk_currtype__moneyDigit\"}",

 "iTabIndex": 1700,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "InputNumber",

 "iOrder": 1700,

 "bMain": true,

 "cStyle": "{\"min\":0}",

 "id": 68944,

 "bVmExclude": 0,

 "iBillTplGroupId": 2749,

 "iBillId": 138,

 "iBillEntityId": 551,

 "iTplId": 155,

 "cSubId": "rmm",

 "iSystem": 1,

 "cName": "pl_lbr_mny_org",

 "cFieldName": "pl_lbr_mny_org",

 "authLevel": 3,

 "cDataSourceName": "rmm.workorder.WorkOrderVO",

 "enterDirection": 4,

 "bEnableFormat": false

 }, {

 "cItemName": "ac_lbr_mny_org",

 "cCaption": "实际人工成本",

 "cCaptionResid": "P_YS_SCM_UPU-UI_0001212976",

 "cShowCaption": "实际人工成本",

 "cShowCaptionResid": "P_YS_SCM_UPU-UI_0001212976",

 "iMaxLength": 28,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "iNumPoint": 2,

 "bCanModify": false,

 "iMaxShowLen": 255,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "cDefaultValue": "0",

 "cFormatData": "{\"related\":\"pk_currtype__moneyDigit\"}",

 "iTabIndex": 1730,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "InputNumber",

 "iOrder": 1730,

 "bMain": true,

 "cStyle": "{\"min\":0}",

 "id": 68947,

 "bVmExclude": 0,

 "iBillTplGroupId": 2749,

 "iBillId": 138,

 "iBillEntityId": 551,

 "iTplId": 155,

 "cSubId": "rmm",

 "iSystem": 1,

 "cName": "ac_lbr_mny_org",

 "cFieldName": "ac_lbr_mny_org",

 "authLevel": 3,

 "cDataSourceName": "rmm.workorder.WorkOrderVO",

 "enterDirection": 4,

 "bEnableFormat": false

 }, {

 "cItemName": "pl_oth_mny_org",

 "cCaption": "计划其他成本",

 "cCaptionResid": "P_YS_SCM_UPU-UI_0001213037",

 "cShowCaption": "计划其他成本",

 "cShowCaptionResid": "P_YS_SCM_UPU-UI_0001213037",

 "iMaxLength": 28,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "iNumPoint": 2,

 "bCanModify": false,

 "iMaxShowLen": 255,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "cDefaultValue": "0",

 "cFormatData": "{\"related\":\"pk_currtype__moneyDigit\"}",

 "iTabIndex": 1760,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "InputNumber",

 "iOrder": 1760,

 "bMain": true,

 "cStyle": "{\"min\":0}",

 "id": 68950,

 "bVmExclude": 0,

 "iBillTplGroupId": 2749,

 "iBillId": 138,

 "iBillEntityId": 551,

 "iTplId": 155,

 "cSubId": "rmm",

 "iSystem": 1,

 "cName": "pl_oth_mny_org",

 "cFieldName": "pl_oth_mny_org",

 "authLevel": 3,

 "cDataSourceName": "rmm.workorder.WorkOrderVO",

 "enterDirection": 4,

 "bEnableFormat": false

 }, {

 "cItemName": "ac_oth_mny_org",

 "cCaption": "实际其他成本",

 "cCaptionResid": "P_YS_SCM_UPU-UI_0001212979",

 "cShowCaption": "实际其他成本",

 "cShowCaptionResid": "P_YS_SCM_UPU-UI_0001212979",

 "iMaxLength": 28,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "iNumPoint": 2,

 "bCanModify": false,

 "iMaxShowLen": 255,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "cDefaultValue": "0",

 "cFormatData": "{\"related\":\"pk_currtype__moneyDigit\"}",

 "iTabIndex": 1790,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "InputNumber",

 "iOrder": 1790,

 "bMain": true,

 "cStyle": "{\"min\":0}",

 "id": 68953,

 "bVmExclude": 0,

 "iBillTplGroupId": 2749,

 "iBillId": 138,

 "iBillEntityId": 551,

 "iTplId": 155,

 "cSubId": "rmm",

 "iSystem": 1,

 "cName": "ac_oth_mny_org",

 "cFieldName": "ac_oth_mny_org",

 "authLevel": 3,

 "cDataSourceName": "rmm.workorder.WorkOrderVO",

 "enterDirection": 4,

 "bEnableFormat": false

 }, {

 "cItemName": "pl_ttl_mny_org",

 "cCaption": "计划总成本",

 "cCaptionResid": "P_YS_SCM_UPU-UI_0001213041",

 "cShowCaption": "计划总成本",

 "cShowCaptionResid": "P_YS_SCM_UPU-UI_0001213041",

 "iMaxLength": 28,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "iNumPoint": 2,

 "bCanModify": false,

 "iMaxShowLen": 255,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "cDefaultValue": "0",

 "cFormatData": "{\"related\":\"pk_currtype__moneyDigit\"}",

 "iTabIndex": 1820,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "InputNumber",

 "iOrder": 1820,

 "bMain": true,

 "cStyle": "{\"min\":0}",

 "id": 68956,

 "bVmExclude": 0,

 "iBillTplGroupId": 2749,

 "iBillId": 138,

 "iBillEntityId": 551,

 "iTplId": 155,

 "cSubId": "rmm",

 "iSystem": 1,

 "cName": "pl_ttl_mny_org",

 "cFieldName": "pl_ttl_mny_org",

 "authLevel": 3,

 "cDataSourceName": "rmm.workorder.WorkOrderVO",

 "enterDirection": 4,

 "bEnableFormat": false

 }, {

 "cItemName": "ac_ttl_mny_org",

 "cCaption": "实际总成本",

 "cCaptionResid": "P_YS_SCM_UPU-UI_0001212983",

 "cShowCaption": "实际总成本",

 "cShowCaptionResid": "P_YS_SCM_UPU-UI_0001212983",

 "iMaxLength": 28,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "iNumPoint": 2,

 "bCanModify": false,

 "iMaxShowLen": 255,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "cDefaultValue": "0",

 "cFormatData": "{\"related\":\"pk_currtype__moneyDigit\"}",

 "iTabIndex": 1850,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "InputNumber",

 "iOrder": 1850,

 "bMain": true,

 "cStyle": "{\"min\":0}",

 "id": 68959,

 "bVmExclude": 0,

 "iBillTplGroupId": 2749,

 "iBillId": 138,

 "iBillEntityId": 551,

 "iTplId": 155,

 "cSubId": "rmm",

 "iSystem": 1,

 "cName": "ac_ttl_mny_org",

 "cFieldName": "ac_ttl_mny_org",

 "authLevel": 3,

 "cDataSourceName": "rmm.workorder.WorkOrderVO",

 "enterDirection": 4,

 "bEnableFormat": false

 }],

 "iBillEntityId": 551

 }],

 "iBillEntityId": 551

 }],

 "iBillEntityId": 551

 }

}

## [](#5-更多参考)5. 更多参考

- 《[视频](#/introduce/04-mdf-media-week2022)》
- 《[卡片式折叠收起](#/guides/06-kapianshizhedieshouqi)》

## [](#6-faq-常见问题)6. FAQ 常见问题

### [](#61-存在蓝底需要领域适配的情况)6.1. 存在蓝底需要领域适配的情况

适配过程中遇到的大片背景色，则为显示不正确，框架大部分都做了兼容适配，包括divcontainer，建议按照标准的groupcontainer来配置（避免之后出现如果框架有修改，领域无法适用）

- 多页签情况下底部存在蓝底的在 CardTabs 的cStyle配置cardTabFullHeight: true
- 没有多页签情况下底部存在蓝底的在最后一个GroupContainer的cStyle中配置groupContainerFullHeight: true
- 动态配置groupContainerFullHeight     

viewModal.execute("updateViewMeta",{groupContainerFullHeight: true, code:'card_head'})  })

### [](#62-隐藏标题)6.2. 隐藏标题

- 二级标题只有一个时候默认隐藏 如何显示 ？

groupcontainer的cStyle里配置 hideOneGroupTitle：false

### [](#63-其它问题排查)6.3. 其它问题排查

- 领域自己开发的组件，需要自己适配，处理扩展样式
- 如何排查样式问题，f12看产生问题的文件引用，index.*.min.css文件的问题是框架处理，extend.min.css是领域扩展的，.scss后缀的是tinpernext