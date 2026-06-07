---
title: "带背景色的枚举配置"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/15-daibeijingsedemeijupeizhi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 带背景色的枚举配置

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/15-daibeijingsedemeijupeizhi | 所属：指南

# [](#带背景色的枚举配置)带背景色的枚举配置

**1、枚举配置**

[billitem_base]表：字段对应的**bEnum**配置为1，**cEnumType**配置为aa_enum表里面的enumtype，这样一个枚举字段就配置出来了。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/daibeijingsedemeijupeizhi_image1.4015c14c.png)

**2、背景色配置**

aa_enum表中，找到对应的enumtype，找到icon这一列，列内容配置为对应的色值，支持的色值见下表：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/daibeijingsedemeijupeizhi_image2.66049242.png)

||icon||说明（对应效果图颜色）|
||cyanstate||流程起始、开立、生成|
||bluestate||部分发货、待收货、待发货、进行中、查验中、报销中、审核中|
||orangestate||部分付款、付款待确认、警示、提醒、驳回到制单|
||greenstate||付款成功、完成、已报销、已审核|
||redstate||未付款、失败、禁止、错误、超期、查验失败、票据异常、查验存疑|
||graystate||取消、失效、终止态|

仅支持以上列出的色值。

**注意：配置完成后需要清redis缓存。**