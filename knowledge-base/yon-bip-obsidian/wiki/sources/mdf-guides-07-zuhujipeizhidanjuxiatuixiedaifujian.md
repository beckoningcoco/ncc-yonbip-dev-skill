---
title: "租户级配置单据下推携带附件"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/07-zuhujipeizhidanjuxiatuixiedaifujian"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 租户级配置单据下推携带附件

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/07-zuhujipeizhidanjuxiatuixiedaifujian | 所属：指南

# [](#租户级配置单据下推携带附件)租户级配置单据下推携带附件

## [](#背景)背景

客户需要在销售订单下推采购订单时候携带销售订单的附件到采购订单作为流转附件

由于下推操作复杂目前只能做到单条数据下推会携带协作套件，后面支持多条还要看产品规划

## [](#配置方式)配置方式

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/zuhujipeizhidanjuxiatuixiedaifujian_image1.c7dd2eed.png)

## [](#租户级配置)租户级配置

{ 

 "globalVars": { 

 "__MDF_FEATURE_CONFIG__": { 

 "pushOrPullFile": {

 "yccontract": ["st_purchaseorder", "st_scancodedetail"]} // 上游单据billNo 卡片 yccontract: ['目标单据billNo1', '目标单据billNo2']

 "yccontract_list": ["st_purchaseorder", "st_scancodedetail"]} // 上游单据billNo 列表yccontract_list: ['目标单据billNo1', '目标单据billNo2'] 

 } 

 }

}

领域或者现场提供配置参数格数

应付事务 -> 付款单：

应付事务：apPublicEvent，apPublicEvent_list

付款单：payment，paymentList

应付事务 -> 付款申请单：

应付事务：apPublicEvent，apPublicEvent_list

付款申请单：paymentApply, paymentApplyList

应付事务 -> 付款退款单：

应付事务：apPublicEvent，apPublicEvent_list

付款退款：apRefund，apRefundList

付款申请 -> 付款单

付款申请单：paymentApply, paymentApplyList

付款单：payment，paymentList

租户id：

1、核心3：租户id: xxxx 租户名称： xxxx