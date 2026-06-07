---
title: "拉单携带协作套件附件"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/07-ladanxiedaixiezuotaojianfujian"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 拉单携带协作套件附件

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/07-ladanxiedaixiezuotaojianfujian | 所属：指南

# [](#拉单携带协作套件附件)拉单携带协作套件附件

举例说明：【请购单】拉【销售订单】，因为当前生单页面没有准确的销售订单的billNo，所以前端取不到销售订单对应的appCode，附件就搜不出来。为了解决这个问题，需要领域在位置3的按钮上配置

sourceAppCode 销售订单的appCode

或者 cParameter里配置sourceAppCode

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ladanxiedaixiezuotaojianfujian_image1.b0d33b08.png)