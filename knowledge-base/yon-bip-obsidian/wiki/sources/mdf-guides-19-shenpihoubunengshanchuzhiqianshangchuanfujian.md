---
title: "审批后不能删除之前上传附件"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/19-shenpihoubunengshanchuzhiqianshangchuanfujian"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 4
---

# 审批后不能删除之前上传附件

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/19-shenpihoubunengshanchuzhiqianshangchuanfujian | 所属：指南

# [](#审批后不能删除之前上传附件)审批后不能删除之前上传附件

## [](#1-说明)1 说明

单据在审批成功之前上传了附件，在审批之后不希望删除之前上传的附件，但是希望能够删除审批之后上传的附件

## [](#2-pc配置)2 PC配置

### [](#21-协作套件配置)2.1 协作套件配置

说明：在billtplgroup_base表里配置，在 cStyle 中配置

||属性名称||属性含义||值类型||默认值||属性说明|
||noDeleteBeforeApproveFile||是否开启审批后不能删除之前附件||boolean||false|||
||deleteRelationItem||单据中审批成功时间字断||string||''||单据中必须存在该字断，并且字断可以转成正常的时间戳|

## [](#3-移动配置)3 移动配置

### [](#31-附件按钮类型配置)3.1 附件按钮类型配置

#### [](#展示)展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shenpihoubunengshanchuzhiqianshangchuanfujian_image1.81d6d4ed.png)

#### [](#cparameter-中配置)cParameter 中配置

[bill_command]表中 parameter字断

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shenpihoubunengshanchuzhiqianshangchuanfujian_image2.330c681d.png)

||属性名称||属性含义||值类型||默认值||属性说明|
||noDeleteBeforeApproveFile||是否开启审批后不删除之前上传附件||boolean||false||--|
||deleteRelationItem||需要根据哪个字断的值判断时间||string||''||单据中必须存在该字断，并且字断可以转成正常的时间戳|

### [](#32-附件字断类型配置)3.2 附件字断类型配置

#### [](#展示-1)展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shenpihoubunengshanchuzhiqianshangchuanfujian_image3.a6e3c4eb.png)

#### [](#配置)配置

说明：[billitem_base]表中 附件字断配置cStyle

||属性名称||属性含义||值类型||默认值||属性说明|
||noDeleteBeforeApproveFile||是否开启审批后不删除之前上传附件||boolean||false||--|
||deleteRelationItem||需要根据哪个字断的值判断时间||string||''||单据中必须存在该字断，并且字断可以转成正常的时间戳|

### [](#33-审批后不允许删除之前附件功能需要支持租户级设置时间字断)3.3 审批后不允许删除之前附件功能，需要支持租户级设置时间字断

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shenpihoubunengshanchuzhiqianshangchuanfujian_image4.514c0718.png)

window.__MDF_FEATURE_CONFIG__?.fileWorkflowDeleteRelationItem || {};

const _tenantId = cb.utils.getTenantId(this.viewModel?.getDomainKey());

const fileWorkflowDeleteRelationItem = {

 [_tenantId]: {

 [billNo]: '时间字断值',

 }

}