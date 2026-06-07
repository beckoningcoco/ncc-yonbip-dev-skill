---
title: "页面穿透跳转（档案穿透联查）"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/05-yemianchuantoutiaozhuan"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 页面穿透跳转（档案穿透联查）

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/05-yemianchuantoutiaozhuan | 所属：指南

# [](#页面穿透跳转档案穿透联查)页面穿透跳转（档案穿透联查）

## [](#1-功能说明)1. 功能说明

- 三大档案（客户、物料、供应商）平台默认实现穿透联查，是总体部统一要求的，无特殊情况不允许关闭
- 支持参照组件和input组件的数据穿透功能，支持组件在主表和子表中穿透到列表和卡片页面

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yemianchuantoutiaozhuanimage1.0c4e62c3.png)

## [](#2-三大档案r6及以后的版本无需适配)2. 三大档案(R6及以后的版本无需适配)

三大档案（客户、物料、供应商）平台默认实现穿透联查，不需要领域适配

### [](#21-问题排查)2.1. 问题排查

查看参照name字段对应的id字段是否有referEntityUri属性，分别对应以下情况：

- 没有referEntityUri属性，MDD联系严明排查，YPD联系董政凯排查
- 有referEntityUri属性，值为["pc.product.Product", "aa.merchant.Merchant", "aa.vendor.Vendor"]之一，应该没问题，如果有问题联系MDF排查
- 有referEntityUri属性，值不是["pc.product.Product", "aa.merchant.Merchant", "aa.vendor.Vendor"]之一，此种情况平台无法统一处理，需要按照第2、3章节适配
- 这个开关要开
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yemianchuantoutiaozhuanimage2.1e67f2b7.png)

## [](#3-领域适配)3. 领域适配

R6以下的版本或不属于三大档案的穿透需要业务适配

### [](#31-主表字段)3.1. 主表字段

配置开关： 组件上配置bJointQuery:true

#### [](#311-标题穿透)3.1.1. 标题穿透

配置详情：在组件的cStyle里配置

||字段||说明||默认||是否必填|
||serviceCode||单据的serviceCode||空||否|

例：cStyle: { jointQueryOpt: { serviceCode: 'xxxx' } }

#### [](#312-值穿透)3.1.2. 值穿透

配置详情： 在组件的cStyle里配置

##### [](#同步配置)同步配置

||字段||说明||默认||是否必填|
||billtype||单据类型/取单据类型的 'key'||voucher||否|
||billno||要跳转单据的单据号||空||是|
||keyField||详情页的唯一值(取模型的关键字)||空||否|
||newOpen||如果不配label又想新页签打开单据。(值和serviceCode的值一样)||空||否|
||domainKey||如果跨领域 必须配置，否则报错||空||否|
||任意字段||一些固定的键值对放到params里带到下个页面||空||否|

例：cStyle: { jointQueryOpt: { billno: 'xxxx' , keyField: 'xxxx' , .... } }

##### [](#异步配置)异步配置

说明：特殊单据从当前上下文取不到穿透的信息时 使用基础档案的接口 查询单据信息

||字段||说明||默认||是否必填|
||asyncField||formIdKey, transtypeIdKey, tenantIdKey,  在当前上下文取值的key||空||否|

例：cStyle: { jointQueryOpt: { asyncField: 'formIdKey, transtypeIdKey, tenantIdKey' } }

不配的可以配空用逗号隔开如asyncField:'formIdKey,,'

### [](#32-子表字段)3.2. 子表字段

配置开关： 表格的列属性上配置bJointQuery:true

#### [](#321-标题穿透)3.2.1. 标题穿透

同 2.1.1

#### [](#322-值穿透)3.2.2. 值穿透

配置详情： 在组件的cStyle里配置

#### [](#3221-同步配置)3.2.2.1. 同步配置

||字段||说明||默认||是否必填|
||billtype||单据类型/取单据类型的 'key'||voucher||否|
||billno||固定单据号/取单据号的 'key'||空||是|
||rowId||数据的唯一值的key||id||是|
||newOpen||是否打开新页签/ 本身会作为新页签的 serviceCode 或者是取serviceCode 的key（行数据）||空||否|
||serviceCode||新页签的serviceCode /列名点击跳转的 serviceCode （标题+行数据）||空||否|
||othField||兼容部分领域需要前个单据主表数据列： 'aaa,bbb,cccc', 这几个字段会在下个单据的carryParams里||空||否|
||domainKey||如果跨领域 必须配置，否则报错||空||否|

例：cStyle: { jointQueryOpt: { billno: 'xxxx' , keyField: 'xxxx' , .... } }

#### [](#3222-异步配置)3.2.2.2. 异步配置

同 2.1.22

区别 取值的范围 加上当前表格的行数据

## [](#4-非参照字段领域适配)4. 非参照字段(领域适配)

### [](#41-主表字段)4.1. 主表字段

配置开关： 组件上配置bJointQuery:true

#### [](#411-标题穿透)4.1.1. 标题穿透

配置详情：在组件的cStyle里配置

||字段||说明||默认||是否必填|
||serviceCode||单据的serviceCode||空||否|

例：cStyle: { jointQueryOpt: { serviceCode: 'xxxx' } }

#### [](#412-值穿透)4.1.2. 值穿透

配置详情： 在组件的cStyle里配置

||字段||说明||默认||是否必填|
||billtype||单据类型/取单据类型的 'key'||voucher||否|
||billno||要跳转单据的单据号||空||是|
||keyField||详情页的唯一值(取模型的关键字)||空||否|
||newOpen||如果不配label又想新页签打开单据。(值和serviceCode的值一样)||空||否|
||domainKey||如果跨领域 必须配置，否则报错||空||否|
||任意字段||一些固定的键值对放到params里带到下个页面||空||否|

例：cStyle: { jointQueryOpt: { billno: 'xxxx' , keyField: 'xxxx' , .... }

### [](#42-主表字段)4.2. 主表字段

#### [](#421-标题穿透)4.2.1. 标题穿透

同 2.1.1

#### [](#422-值穿透)4.2.2. 值穿透

同 2.1.2