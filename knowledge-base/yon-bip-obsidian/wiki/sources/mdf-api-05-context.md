---
title: "上下文 Context"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-context"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 上下文 Context

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-context | 所属：API

# [](#上下文-context)上下文 Context

**注意：** 此文档中所有API取的是平台的标准上下文。领域如果想取自己的上下文，需要打开特性开关 queryLoginUser，详细见[MDF服务配置项说明-特性开关](#/node/02-config-item-desc)（开了特性后前端会调用user/getLoginUser接口，后端对user/getOrgsAndStores接口进行扩展），然后领域前端通过调用cb.context.getExtra(viewmodel,property)获取对应属性。

## [](#1-租户信息)1. 租户信息

### [](#11-获取友互通租户标识)1.1. 获取友互通租户标识

cb.context.getTenantId()

**参数：**

无

**返回值：**

友互通租户ID

**对应后台上下文：**

yhtTenantId 友户通租户标识

### [](#12-获取营销云租户标识)1.2. 获取营销云租户标识

cb.context.getYxyTenantId()

**参数：**

||**参数**||**类型**||**必填**||**备注**|
||viewmodel||string||否||单据模型|

**返回值：**

如果传viewmodel返回领域自己扩展的租户ID，如果不传直接返回营销云租户ID

**对应后台上下文：**

yxyTenantId 营销云租户标识

### [](#13-获取组织标识)1.3. 获取组织标识

cb.context.getOrgId()

**参数：**
无

**返回值：**

单个组织才返回，多组织不返回改字段

**对应后台上下文：**

orgId 单组织标识，仅单组织时有值

### [](#14-获取默认业务单元)1.4. 获取默认业务单元

cb.context.getDefaultOrg()

**参数：**

无

**返回值：**

默认组织ID

**对应后台上下文：**

defaultOrg 默认组织

### [](#15-是否是单组织)1.5. 是否是单组织

cb.context.isSingleOrg()

**参数：**

无

**返回值：**

true-单组织 false-多组织

**对应后台上下文：**

isSingleOrg 是否是单组织

### [](#16-是否是新架构)1.6. 是否是新架构

cb.context.isNewArch()

**参数：**

无

**返回值：**

true-是新架构 false-不是新架构

**对应后台上下文：**

newArch 财务新架构标识

### [](#17-是否是财务新架构)1.7. 是否是财务新架构

cb.context.isNewFiArch()

**参数：**

无

**返回值：**

true-是财务新架构 false-不是财务新架构

**对应后台上下文：**

n_f_f 财务新架构标识

### [](#18-获取产品线)1.8. 获取产品线

cb.context.getProductLine()

**参数：**
无

**返回值：**

产品线

**对应后台上下文：**

productLine 产品线

### [](#19-是否是密集租户)1.9. 是否是密集租户

cb.context.isMjTenant()

**参数：**
无

**返回值：**

密集租户

**对应后台上下文：无**

## [](#2-用户信息)2. 用户信息

### [](#21-获取用户标识)2.1. 获取用户标识

cb.context.getUserId()

**参数：**

无

**返回值：**

用户ID

**对应后台上下文：**

yhtUserId 友互通用户ID

### [](#22-获取营销云用户标识)2.2. 获取营销云用户标识

cb.context.getYxyUserId()/cb.context.getIdentityId()

**参数：**

||**参数**||**类型**||**必填**||**备注**|
||viewmodel||string||否||单据模型|

**返回值：**

营销云用户ID

**对应后台上下文：**

yxyUserId 营销云用户ID

### [](#23-获取用户类型)2.3. 获取用户类型

cb.context.getUserType()

**参数：**

无

**返回值：**

用户类型

**对应后台上下文：**

userType 用户类型

### [](#24-获取用户名称)2.4. 获取用户名称

cb.context.getUserName()

**参数：**

无

**返回值：**

用户名称

**对应后台上下文：**

name 用户名称

### [](#25-当前用户登录身份关联的客户或供应商标识)2.5. 当前用户登录身份关联的客户或供应商标识

cb.context.getDocId()

**参数：**

无

**返回值：**

当前用户登录身份关联的客户或供应商标识

**对应后台上下文：**

docId 当前用户登录身份关联的客户或供应商标识

### [](#26-获取客户供应商tobtoc等类型)2.6. 获取客户、供应商、toB、toC等类型

cb.context.getDocType()

**参数：**

无

**返回值：**

客户、供应商、toB、toC等类型

**对应后台上下文：**

docType 客户、供应商、toB、toC等类型

## [](#3-全球化信息)3. 全球化信息

### [](#31-获取当前语种)3.1. 获取当前语种

cb.context.global.getLocale()

**参数：**

无

**返回值：**

当前语种

**对应后台上下文：**

locale 语种

### [](#32-获取默认语种)3.2. 获取默认语种

cb.context.global.getSysLocale()

**参数：**

无

**返回值：**

默认语种

**对应后台上下文：**

无

### [](#33-获取时区)3.3. 获取时区

cb.context.global.getTimeZone()

**参数：**

无

**返回值：**

时区

**对应后台上下文：**

timezone 时区

### [](#34-是否开启多语)3.4. 是否开启多语

cb.context.global.isMultilingualFlag()

**参数：**
无

**返回值：**

true-开启了多语标识 false-没开启多语标识

**对应后台上下文：**

multilingualFlag 多语标识

### [](#35-获取语种列表)3.5. 获取语种列表

cb.context.global.getMultilist()

**参数：**
无

**返回值：**

语种列表

**对应后台上下文：**

LANGVO_LIST 语种列表

### [](#36-获取数据格式)3.6. 获取数据格式

cb.context.global.getDataFormat()

**参数：**
无

**返回值：**

数据格式

**对应后台上下文：**
无

### [](#37-获取业务日期)3.7. 获取业务日期

cb.context.global.getBusinessDate()

**参数：**
无

**返回值：**

业务日期

**对应后台上下文：**

businessDate 产品线

## [](#4-其它)4. 其它

### [](#41-获取公共参数)4.1. 获取公共参数

cb.context.getCommonOptionValue(name)

公共参数会框架初始化时预加载，获取时并不会发起接口调用

**参数：**

||**参数**||**类型**||**必填**||**备注**|
||name||string||是||参数名称|

**返回值：**

返回参数值

**对应后台上下文：**

无

### [](#42-获取单个业务参数)4.2. 获取单个业务参数

viewmodel.getOptionValue(name, orgId, domain) ***（推荐）***

cb.context.getOptionValue(name, orgId, domain, domainKey, query)
*（无viewmodel时使用）*

**参数：**

||**参数**||**类型**||**必填**||**备注**|
||name||string||是||配置属性名称|
||orgId||string||否||组织id，作为参数传给option/getOptionValueByName|
||domain||string||否||跨服务需要传，作为参数传给option/getOptionValueByName|
||domainKey||string||否||前端领域标识，作为参数传给option/getOptionValueByName|
||query||object||否||拼接参数，作为参数传给option/getOptionValueByName|

**注意：**只传name取的是平台公共参数（兼容，推荐使用cb.context.getCommonOptionValue,
**530后不再支持取公共参数**），如果传orgId(组织id)、domain(跨服务需要传)、domainKey(领域编码)，会优先取领域参数。query主要为处理越权问题，在query中放入serviceCode参数

**返回值：**

返回属性值

**对应后台上下文：**

无

### [](#43-获取多个业务参数)4.3. 获取多个业务参数

viewmodel.getOptionValues(name, orgId, domain) ***（推荐）***

cb.context.getOptionValues(name, orgId, domain, domainKey)
*（无viewmodel时使用）*

**参数：**

||**参数**||**类型**||**必填**||**备注**|
||name||array||是||配置属性名称，数组形式|
||orgId||string||否||组织id，作为参数传给option/getOptionValueByName|
||domain||string||否||跨服务需要传，作为参数传给option/getOptionValueByName|
||domainKey||string||否||前端领域标识，作为参数传给option/getOptionValueByName|

**返回值：**

返回多个属性值

**对应后台上下文：**

无

### [](#44-获取url上的参数)4.4. 获取URL上的参数

cb.context.getQuery()

**参数：**
无

**返回值：**

url上的参数，返回一个JSON对象

**对应后台上下文：**
无

### [](#45-获取领域扩展属性)4.5. 获取领域扩展属性

cb.context.getExtra(viewmodel,property)

**参数：**

||**参数**||**类型**||**必填**||**备注**|
||viewmodel||object/string||是||页面模型或者传domainKey|
||property||string||是||a.b.c的形式穿透，比如[user.id](http://user.id),[tenant.id](http://tenant.id)，可以参考cb.context.AppContext[domainKey]返回数据结构进行获取|

**返回值：**

扩展属性

**对应后台上下文：**
无

### [](#46-获取公共服务谓词)4.6. 获取公共服务谓词

cb.context.getPredicateDate(name)

备注：会调用/predicate/getAllExplain服务获取谓词信息

**参数：**

||**参数**||**类型**||**必填**||**备注**|
||name||string||是||比如 <%businessDate%>，<%defaultOrg%>|

**返回值：**

返回对应谓词信息，比如默认组织id或者当前业务日期

**对应后台上下文：**
无

### [](#47-获取友互通token)4.7. 获取友互通token

cb.context.getYhtAccessToken()

**参数：无**

**返回值：**

友互通token

**对应后台上下文：**
无

## [](#5-附)5. 附

标准上下文见文档：[https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=162354919](https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=162354919)下面是截取的**MDF的上下文**。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shangxiawenContext.b376c84f.png)