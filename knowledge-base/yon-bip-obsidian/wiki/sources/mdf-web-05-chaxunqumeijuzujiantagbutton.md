---
title: "--查询区枚举组件 TagButton"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-chaxunqumeijuzujiantagbutton"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# --查询区枚举组件 TagButton

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-chaxunqumeijuzujiantagbutton | 所属：Web组件

# [](#查询区枚举组件-tagbutton)查询区枚举组件 TagButton

# [](#功能说明)功能说明

查询区的枚举条件的一种展现组件，可以单选多选，只能在查询区中使用。

# [](#效果展示)效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/chaxunqumeijuzujianTagButtonimage1.5295680d.png)

# [](#基本属性)基本属性

组件基本属性同查询区其他条件属性，包括但不限于单/多选、必填等，属性都是根据协议决定，而不是UI模板配置，此组件无扩展属性。

协议示例：

{

 "filtersId": 55332509,

 "allowUpdateCompare": 0,

 "itemTitle": "订单状态",

 "autoFlt": true,

 "precision": 0,

 "refType": 0,

 "cRefId": 0,

 "ctrlType": "tagbutton",

 "multSelect": 0,

 "isMasterOrg": false,

 "itemName": "nextStatusName",

 "bAutoFlt": true,

 "isCommon": 1,

 "rangeInput": 0,

 "id": 55332513,

 "enumArray": "[\n {\n \"nameType\": \"text\",\n \"icon\": \"yxc_graystate\",\n \"cDataRule\": null,\n \"value\": \"开立\",\n \"resid\": \"UID:P_SCM-SCMSA-UI_17E9879005403759\",\n \"key\": \"CONFIRMORDER\"\n },\n {\n \"nameType\": \"text\",\n \"icon\": \"yxc_yellowstate\",\n \"cDataRule\": null,\n \"value\": \"部分发货\",\n \"resid\": \"UID:P_SCM-SCMSA-UI_17E987900540375E\",\n \"key\": \"DELIVERY_PART\"\n },\n {\n \"nameType\": \"text\",\n \"icon\": \"yxc_yellowstate\",\n \"cDataRule\": null,\n \"value\": \"部分发货待收货\",\n \"resid\": \"UID:P_SCM-SCMSA-UI_17E9879005403760\",\n \"key\": \"DELIVERY_TAKE_PART\"\n },\n {\n \"nameType\": \"text\",\n \"icon\": \"yxc_yellowstate\",\n \"cDataRule\": null,\n \"value\": \"待发货\",\n \"resid\": \"UID:P_SCM-SCMSA-UI_17E987900540375B\",\n \"key\": \"DELIVERGOODS\"\n },\n {\n \"nameType\": \"text\",\n \"icon\": \"yxc_yellowstate\",\n \"cDataRule\": null,\n \"value\": \"待收货\",\n \"resid\": \"UID:P_SCM-SCMSA-UI_17E9879005403766\",\n \"key\": \"TAKEDELIVERY\"\n },\n {\n \"nameType\": \"text\",\n \"icon\": \"yxc_greenstate\",\n \"cDataRule\": null,\n \"value\": \"已完成\",\n \"resid\": \"UID:P_SCM-SCMSA-UI_17E9879005403762\",\n \"key\": \"ENDORDER\"\n },\n {\n \"nameType\": \"text\",\n \"icon\": \"yxc_redstate\",\n \"cDataRule\": null,\n \"value\": \"已取消\",\n \"resid\": \"UID:P_SCM-SCMSA-UI_17E9879005403764\",\n \"key\": \"OPPOSE\"\n },\n {\n \"nameType\": \"text\",\n \"icon\": \"yxc_bluestate\",\n \"cDataRule\": null,\n \"value\": \"审批中\",\n \"resid\": \"UID:P_SCM-SCMSA-UI_17E987900540379C\",\n \"key\": \"APPROVING\"\n }\n]",

 "compareLogic": "eq",

 "extendField": "{\n \"topShow\": true,\n \"useIcon\": false\n}",

 "mustInput": 0,

 "cShowCaption": "订单状态",

 "bSelfDefine": false,

 "descValue": 0,

 "bAutoflt": true,

 "dataSource": "nextStatus",

 "isSys": 1,

 "enumString": "{\n \"CONFIRMORDER\": \"开立\",\n \"DELIVERY_PART\": \"部分发货\",\n \"DELIVERY_TAKE_PART\": \"部分发货待收货\",\n \"DELIVERGOODS\": \"待发货\",\n \"TAKEDELIVERY\": \"待收货\",\n \"ENDORDER\": \"已完成\",\n \"OPPOSE\": \"已取消\",\n \"APPROVING\": \"审批中\"\n}"

}

||前端所接收协议名||含义|
||前端所接收协议名||含义|
||bAutoflt||值改变搜索|
||compareLogic||比较符|
||isCommon||是否在面板上显示|
||multSelect||是否多选|
||value1||默认值|

# [](#常见问题)常见问题

- tagbutton分多选单选，多选tagbutton默认没有"全部"选项，单选tagbutton默认有"全部选项"，看图：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/chaxunqumeijuzujianTagButtonimage2.157466b9.png)