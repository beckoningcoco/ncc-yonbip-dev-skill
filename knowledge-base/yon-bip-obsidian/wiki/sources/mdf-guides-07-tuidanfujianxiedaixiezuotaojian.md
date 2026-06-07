---
title: "推单携带协作套件附件"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/07-tuidanfujianxiedaixiezuotaojian"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 5
---

# 推单携带协作套件附件

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/07-tuidanfujianxiedaixiezuotaojian | 所属：指南

# [](#推单携带协作套件附件)推单携带协作套件附件

举例说明：【采购发票】推【付款申请单】

## [](#1采购发票推付款申请单)1、【采购发票】推【付款申请单】

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/tuidanfujianxiedaixiezuotaojian_image1.96adc772.png)

## [](#2说明协作套件的附件关联的是单据id并且附件的搜索依赖单据id和appcode)2、说明：协作套件的附件关联的是单据ID，并且附件的搜索依赖单据ID和appCode

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/tuidanfujianxiedaixiezuotaojian_image2.0824c79e.png)

前端为了能将附件推到下游需要知道 上游单据的单据ID和appCode，然后通过附件复制方式 将附件复制一份到下游单据上个。因为下游单据并不知道上有单据的appCode。所以需要领域在上游单据的下推按钮上配置sourceAppCode

## [](#3试例)3、试例

1、从UI模版中进去修改地址上sceneData这个参数改成domainext

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/tuidanfujianxiedaixiezuotaojian_image3.4034b37d.png)

2、打开控制台在控制台 输入 yyds.getSceneData = () => false 回车。

3、从层级的最顶部右键点编辑

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/tuidanfujianxiedaixiezuotaojian_image4.3b545d09.png)

4、找到付款申请这个下推按钮
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/tuidanfujianxiedaixiezuotaojian_image5.142c6fe1.png)

4、试例说明：因为采购发票推付款申请单 实际上试采购订单推应付事物然后应付事物推付款申请单 所以在采购发票单据的付款申请单的推单按钮上配置的是应付事物appCode