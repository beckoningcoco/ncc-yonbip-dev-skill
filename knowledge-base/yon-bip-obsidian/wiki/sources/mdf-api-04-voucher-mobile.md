---
title: "移动卡片 Voucher Mobile"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/04-voucher-mobile"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 移动卡片 Voucher Mobile

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/04-voucher-mobile | 所属：API

# [](#移动卡片-voucher-mobile)移动卡片 Voucher Mobile

**注**：移动端共用Web端的voucher里的方法，详细可见 [卡片 Voucher](#/api/04-voucher)

## [](#1-biz-action清单)1. Biz Action清单

||**方法名**||**解析**||**用法**|
||workflow||审批||配置可用|
||workflowhistory||审批历史||配置可用|
||share||分享||配置可用，也可配合扩展脚本-修改分享的模版|
||printpreview||WIFI打印||支持设备：映美|
||bluetoothprint||蓝牙打印||支持设备：达普|
||ems||物流信息||需配合扩展脚本使用，并且meta元数据配置物流信息页面-routerpage|
||attachment||协同附件||配置可用|
||ecsuite||协同-协作组件(评论、任务)||配置可用|
||addrowdetail||新增子表行-跳转到子表详情页||配置可用|
||editrow||编辑子表行-跳转到子表详情页||配置可用|
||expandeditrow||展开编辑子表-在当前页面展开子表并编辑||配置可用|
||copyrow||复制子表行-跳转到子表详情页||配置可用|
||save||保存(订单反馈页面)||目前反馈页面是需要配置在save保存动作的command中，paramter配{"showFeedback":true}|