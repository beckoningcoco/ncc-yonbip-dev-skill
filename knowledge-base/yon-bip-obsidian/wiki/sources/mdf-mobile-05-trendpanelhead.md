---
title: "订单动向头部 TrendPanelHead"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/05-trendpanelhead"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 4
---

# 订单动向头部 TrendPanelHead

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/05-trendpanelhead | 所属：移动组件

# [](#订单动向头部-trendpanelhead)订单动向头部 TrendPanelHead

## [](#1-功能说明)1. 功能说明

订单动向展示在单据卡片头部，包含订单与审批流信息，点击详情文字展示单据审批流信息。较订单动向组件去除单据编码显示。支持隐藏详情文字，隐藏后不发vm请求，参见《拓展属性cStyle》

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/TrendPanelHead-dingdandongxiangtoubu1.ff9b5a97.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/TrendPanelHead-dingdandongxiangtoubu2.71673b8c.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/TrendPanelHead-dingdandongxiangtoubu3.66433619.png)

## [](#3-标准属性)3. 标准属性

||**属性名称**||**属性含义**||**值类型**||**属性说明**|
|||||||||

## [](#4-拓展属性cstyle)4. 拓展属性cStyle

||**属性名称**||**属性含义**||**值类型**||**属性说明**|
||hideSummary||是否隐藏动向详情文字，为true时不发vm请求||bool||默认为false|

## [](#5-使用方式)5. 使用方式

### [](#51-配置要点)5.1. 配置要点

- billtplgroup_base配置Header容器，添加Header的CStyle:{"showCustomCom":true}
- billtplgroup_base配置TrendPanelHead容器，父容器为Header容器
- billitem_base配置订单状态行，父容器为TrendPanelHead容器

### [](#52-meta示例)5.2. meta示例

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/TrendPanelHead-dingdandongxiangtoubu4.ae4372a1.png)

"containers": [

 {

 "groupId": 2693033353702574,

 "parentId": 2693033353702530,

 "cName": "订单详情",

 "cNameResid": "P_YS_PF_PROCENTER_0000027440",

 "iOrder": 10,

 "bMain": true,

 "cCode": "voucher_order",

 "cDataSourceName": "voucher.order.Order",

 "cControlType": "Header",

 "cGroupCode": "norderView_head_new",

 "iCols": 0,

 "cStyle": "{\"showCustomCom\":true}",

 "containers": [

 {

 "groupId": 2693033353702575,

 "parentId": 2693033353702574,

 "cName": "订单动向",

 "cNameResid": "P_YS_SCM_UPU-UI_0001085778",

 "iOrder": 10,

 "bMain": true,

 "cCode": "voucher_order",

 "cDataSourceName": "voucher.order.Order",

 "cControlType": "TrendPanelHead",

 "cGroupCode": "norderView_trend_new",

 "iCols": 0,

 "cStyle": "{\"more\":true}",

 "controls": [

 {

 "cItemName": "nextStatusName",

 "cCaption": "订单状态",

 "cShowCaption": "订单状态",

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": false,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": false,

 "iMaxShowLen": 255,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": false,

 "bIsNull": true,

 "bPrintCaption": false,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "Input",

 "iOrder": 10,

 "bMain": true,

 "id": 2693033354153321,

 "bVmExclude": 0,

 "iBillTplGroupId": 2693033353702575,

 "iBillId": 1010913383,

 "iBillEntityId": 21712440,

 "iTplId": 2693033353696017,

 "cSubId": "SCMSA",

 "iSystem": 1,

 "cName": "nextStatusName",

 "cFieldName": "nextStatusName",

 "authLevel": 5,

 "cDataSourceName": "voucher.order.Order",

 "enterDirection": 4,

 "bEnableFormat": false

 }

 ],

 "iBillEntityId": 21712440,

 "cExtProps": "{\"uiDesignHidden\":\"true\"}",

 "uiDesignHidden": "true"

 }

 ],

 "iBillEntityId": 21712440,

 "cExtProps": "{\"uiDesignHidden\":\"true\"}",

 "uiDesignHidden": "true"

 }

]