---
title: "推单参数梳理"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/07-tuidancanshushuli"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 推单参数梳理

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/07-tuidancanshushuli | 所属：指南

# [](#推单参数梳理)推单参数梳理

## [](#1postman接口试例)1、postman接口试例

![](data:image/png;base64,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)

## [](#2参数来源)2、参数来源

### [](#21url参数)2.1、url参数

[https://www.xxx.com/mdf-node/uniform/bizflow/batchPush?ruleId=f2ed460a-236f-11ed-a5dc-98039b6e2fa0&ruleSysId=b9fd7ee3-eac3-11ec-983b-0c42a165133c&sourceDomainKey=yonbip-fi-earap&billnum=arPublicEvent&code=arPublicEvent&groupCode=arPublicEvent2collection&busiObj=arPublicEvent&targetBillNo=collection&domain=yonbip-fi-earapbill&showConvertedBill=true&terminalType=1&serviceCode=ear_event_receivable&sbillno=fiear_event_receivable_list](https://www.xxx.com/mdf-node/uniform/bizflow/batchPush?ruleId=f2ed460a-236f-11ed-a5dc-98039b6e2fa0&ruleSysId=b9fd7ee3-eac3-11ec-983b-0c42a165133c&sourceDomainKey=yonbip-fi-earap&billnum=arPublicEvent&code=arPublicEvent&groupCode=arPublicEvent2collection&busiObj=arPublicEvent&targetBillNo=collection&domain=yonbip-fi-earapbill&showConvertedBill=true&terminalType=1&serviceCode=ear_event_receivable&sbillno=fiear_event_receivable_list)

||**参数名**||**参数来源**||**参数值**||**解释**|
||ruleId||领域自定义|||||
||ruleSysId||领域自定义|||||
||sourceDomainKey|||||||
||code|||||||
||groupCode|||||||
||busiObj|||||||
||targetBillNo|||||||
||domain|||||||
||showConvertedBill|||||||
||terminalType|||||||
||serviceCode|||||||
||sbillno|||||||

### [](#22params参数)2.2、params参数

{

 "code": "arPublicEvent",

 "isMainSelect": 0,

 "childIds": [

 "1951828972721405963"

 ],

 "mainIds": [

 "1951828972721405961"

 ],

 "data": [

 {

 "accDate": "2024-03-14",

 "id": "1951828972721405961",

 "code": "AR0601240314000002",

 "financeOrgName": "收入中台演示销售组织1",

 "financeOrg": "1526180336229679105",

 "org": "1526180336229679105",

 "orgName": "收入中台演示销售组织1",

 "accBook": "1546573588296892425",

 "accPurpose": "1525696886125625605",

 "accBookName": "宝可梦宇宙对外账簿",

 "accPeriodCod_code": "2024-03",

 "accPeriod": "1570148526338867210",

 "srcBillCode": "222111",

 "srcBillDate": "2024-03-14",

 "srcSystem": "4",

 "srcApp": "131",

 "srcBillType": "SCMSA8",

 "bizBillType": "SCMSA8",

 "bizTradeType": "1525696834604892295",

 "eventType": "2738391568884992",

 "objectType": "1",

 "customerName": "客户A",

 "customer": "1540469434740637701",

 "oriCurrency": "1525696886140829722",

 "oriCurrencyCode": "CNY1111",

 "oriCurrencyMoneyDigit": 3,

 "oriCurrencyPriceDigit": 2,

 "accCurrency": "1525696886140829722",

 "accCurrencyCode": "CNY1111",

 "accCurrencyNam_name": "人民币1111",

 "accCurrencyMoneyDigit": 3,

 "accCurrencyPriceDigit": 2,

 "orgCurrency": "1525696886140829722",

 "orgCurrencyCode": "CNY1111",

 "orgCurrencyNam_name": "人民币1111",

 "orgCurrencyPriceDigit": 2,

 "status": "1",

 "pubts": "2024-03-14 21:26:48",

 "voucherType": "~",

 "bodyItem_id": "1951828972721405962",

 "freeChId": {

 "id": "1951828981299806217"

 },

 "freeChId__id": "1951828981299806217",

 "bodyItem_srcBillType": "SCMSA8",

 "bodyItem_oriCurrency": "1525696886140829722",

 "bodyItem_material": "1648858200085102597",

 "bodyItem_unit": "1536168471585357824",

 "bodyItem_invoiceType": "0",

 "bodyItem_project": "1628802412223397893",

 "bodyItem_accExchangeRateType": "0000L6YTYEY5FUZPXE0000",

 "bodyItem_orgExchangeRateType": "0000L6YTYEY5FUZPXE0000",

 "bodyItem_staff": "1551740116107526153",

 "bodyItem_freeChId": {

 "id": "1951828981299806216"

 },

 "bodyItem_freeChId__id": "1951828981299806216",

 "bodyItem_grandsonItem_id": "1951828972721405963",

 "bodyItem_taxOutSubjectVid": "1540464590004420706",

 "bodyItem_incomeSubjectVid": "1540464590004420795",

 "bodyItem_grandsonItem_arSubjectVid": "1540464590004420619",

 "bodyItem_grandsonItem_quickType": "1525696886125625612",

 "bodyItem_grandsonItem_quickType_name": "应收款"

 }

 ],

 "groupCode": "arPublicEvent2collection",

 "custMap": {

 "businessFlowId": "c510edc6-eac2-11ec-a7dc-0c42a1a23638",

 "ruleId": "b9fd7ee3-eac3-11ec-983b-0c42a165133c",

 "ruleSysId": "b9fd7ee3-eac3-11ec-983b-0c42a165133c",

 "tenantId": "0000L6YTYEY5FUZPXE0000",

 "billnum": "fiear_event_receivable_list",

 "sourceDomain": "yonbip-fi-earap",

 "targetDomain": "yonbip-fi-earapbill"

 }

}