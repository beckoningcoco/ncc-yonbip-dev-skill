---
title: "原厂单据子表下增补孙表"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/26-yuanchangdanjuzibiaoxiazengbusunbiao"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 原厂单据子表下增补孙表

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/26-yuanchangdanjuzibiaoxiazengbusunbiao | 所属：指南

## [](#原厂单据子表下增补孙表)原厂单据子表下增补孙表

1 对应子表voucherderail下插入detailpage
detailpage下面插入cardheader和voucherdetail

注 **cardheader需要关联子表childrenField
并在cardheader协议里增加useOriginTableMeta: true和metaGroupCode组件
metaGroupCode的值为子表table对应的cGroupCode**

**voucherdetail关联孙表childrenField 下面插入vouherdetailrow toolbar
table（孙表）**

**vouherdetailrow下面插入flex flex下面放孙表字段 显示在孙表行上**

**toolbar关联孙表childrenField 下面放孙表行操作按钮 已增行为例
插入button 按钮动作面板 添加命令 cmdAddRowDetail**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yuanchangdanjuzibiaoxiazengbusunbiao.e629009c.png)