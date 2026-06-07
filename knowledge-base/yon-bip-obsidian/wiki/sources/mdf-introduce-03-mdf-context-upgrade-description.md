---
title: "MDF框架上下文改造注意事项"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/03-mdf-context-upgrade-description"
section: "介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 介绍]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# MDF框架上下文改造注意事项

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/03-mdf-context-upgrade-description | 所属：介绍

# [](#mdf框架上下文改造注意事项)MDF框架上下文改造注意事项

BIP产品正在做上下文缩减，有些上下文会被排掉，**领域排查登记下使用到了哪些上下文**。等登记完后再分析处理。改造后存在下面25个标准上下文，如果不在这个里面的需要领域开启queryLoginUser特性进行扩展调用。

标准上下文见文档：[https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=162354919](https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=162354919)，下面是截取的**MDF的上下文**。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFkuiangjiashangxiawengaizaozhuyishixiang_image1.10fb8762.png)

## [](#时间节奏)时间节奏

test - 12.10号上日常 - 12.17预发 - 12.23号上核心1

## [](#上下文介绍)上下文介绍

对于前端来说，**cb.rest.AppContext下面获取到的信息就是上下文，里面包括后端返回(绝大部分)和前端框架组装的**。领域扩展脚本可能通过下面几种方式获取到。举例来说cb.rest.getAppContext().tenant.newArch代表是否是新架构。

- viewModel.getAppContext()
- cb.rest.getAppContext(domainKey)
- cb.rest.AppContext[domainKey]
- cb.rest.AppContext
- cb.rest.getAppContext()

## [](#改造前)改造前

扩展脚本调用1/2/3获取到的上下文，如果领域开启了queryLoginUser特性开关，优先取领域上下文（领域服务），取不到再取公共上下文（
UI模板服务），如果没开特性，取的是公共上下文（UI模板服务）。

扩展脚本调用4/5会取到公共上下文（UI模板服务）。

## [](#改造后)改造后

改造后公共上下文被精简，默认有25个标准上下文。**该方式可能会使领域前端扩展脚本使用的AppContext属性失效**，领域需要全盘排查所有的扩展脚本，**找出所有用到AppContext的地方，并对比上面提到的25个标准上下文，找出丢失的属性**，开启queryLoginUser进行扩展(需要后端开发来扩展)。

建议把所有用到的属性登记到文档中（领域可建文档），再进行分析处理，参考[https://xxx/l/0bC2BCa57118](https://docs.diwork.com/l/0bC2BCa57118)。

改造后，**获取上下文建议使用的标准API（如果上下文没失效的也可以先不改，领域自行决定）**。平台API目前已提交到test环境，后续会跟着上下文节奏一起上线（12.23号）。

**需要注意**，globalization下的上下文也被标准了，比如之前cb.rest.AppContext.globalization.tenantId这种不规范的方式会被弃用，正确使用应该为cb.rest.AppContext.tenant.tenantId

## [](#排查方式)排查方式

### [](#1文件夹全局搜索)1、文件夹全局搜索

需要注意获取AppContext脚本可能有下面几种，1/2/3
是先获取领域服务，如果没有再取UI模板服务，4/5直接取UI模板服务，所以排查扩展脚本时得注意都搜索一下。

- viewModel.getAppContext()
- cb.rest.getAppContext(domainKey)
- cb.rest.AppContext[domainKey]
- cb.rest.AppContext
- cb.rest.getAppContext()

搜索方式：
文件夹搜索关键字，vsCode可以使用正则匹配的方式搜索，防止出现问号(?)，如果搜索到
cb.rest.AppContext.user.orgId，那么**user.orgId**就是用到的上下文。

- **cb?.rest?.AppContext**
- **getAppContext**
- **cb?.rest?.getAppContext**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFkuiangjiashangxiawengaizaozhuyishixiang_image2.bac63d87.png)

### [](#2脚本查看)2、脚本查看

脚手架先重新拉取node_modules，执行下面命令，会生成/logs/context.log文件，里面有上下文信息。

npx search-context

后期会加到领域流水线上，将扩展代码中所有包含AppContext的信息都打印出来。

搜索整理得到MDF使用到的上下文有（参考）：

cb.rest?.AppContext?.globalization?.businessDate;

cb.rest.AppContext.globalization.cbGlobalization

cb.rest.AppContext.globalization.cbGlobalization.dataformat

cb.rest.AppContext.globalization.cbGlobalization.timezone

cb.rest.AppContext.globalization

cb.rest.AppContext.globalization.dataformat

cb.rest.AppContext?.globalization?.dataformat?.numberFormat

cb.rest.AppContext?.globalization?.multilingualFlag

cb.rest.AppContext.globalization.sysLocale

cb.rest.AppContext.globalization.locale

cb.rest.AppContext.globalization.multilist

cb.rest.AppContext.globalization.dataformat?.addressFormat

cb.rest.AppContext.globalization.tenantId

cb.rest?.AppContext?.globalization?.user?.userId

cb.rest.AppContext?.globalization?.identities?.[0]?.id // 全局上下文中取identites的第1条信息中的ID就是当前用户id（陈长林确认）

cb.rest.AppContext.globalization.ytenantId

cb.rest.AppContext.globalization.locale

cb.rest.AppContext.globalization = cb.rest.AppContext;

 

cb.rest.AppContext[domainKey]

cb.rest.AppContext[billNo]

cb.rest.AppContext.predicateDate // predicate/getAllExplain服务获取

cb.rest.AppContext.predicateDate['<%defaultUserId%>']

cb.rest.AppContext.portalTreeData // leftMenu.jsx

 

cb.rest.AppContext.serviceUrl(不推荐) cb.utils.getServiceUrl()(推荐)

cb.rest.AppContext.ignoreuniform // 请求中不加/unifrom

 

cb.rest.AppContext.query.extend

cb?.rest?.AppContext?.query?.local

cb.rest.AppContext.query.random

cb.rest.AppContext.query.mask

cb.rest?.AppContext?.query?.serviceCode

cb.rest.AppContext.query.debug

 

// 统一封装API

cb.rest.AppContext.user

cb.rest.AppContext.user.id

cb?.rest?.AppContext?.user?.userId;

cb.rest.AppContext[domainKey].user.userId

cb.rest.AppContext.user.orgId

cb.rest.AppContext.user.locale

cb.rest.AppContext.tenant

cb?.rest?.AppContext?.tenant?.dimension?.docId // 商家级别租户id

cb.rest.AppContext.tenant?.mj // 是否密级租户

cb.rest.AppContext.user.token

cb.rest.AppContext.token

 

cb.utils.getTenantId(); // 推荐

cb.rest.getAppContext(domainKey)?.user?.yhtTenantId;

cb.rest.getAppContext()?.user?.yhtTenantId;

cb.rest.getAppContext()?.tenant?.newArch

 

cb.rest?.AppContext?.option.amountofdecimal

cb.rest?.AppContext?.option.monovalentdecimal

cb.rest.AppContext.option.isOpenUdh

cb.rest.AppContext.option.screenPlayTime

 

cb.rest.AppContext.formatAddressValue()

cb.rest.AppContext.getOptionValue()

cb.rest.AppContext.getOptionValues()

 

// 函数调用

getAppContext() => cb.rest.getAppContext

cb.rest.getAppContext(domainKey) => cb.rest.AppContext[domainKey] cb.rest.AppContext

cb.rest.getAppContext()?.tenant?.newArch

cb.rest.getAppContext(params.domainKey).user?.id

cb.rest.getAppContext(params.domainKey).user?.userId

 

 

// 下面是包含AppContext的函数

cb.rest.setServiceUrl() => cb.rest.AppContext.serviceUrl

cb.rest.getImgSrc() => cb.rest.AppContext.serviceUrl

cb.rest._getUrl() => cb.rest.AppContext[billNo] cb.rest.AppContext.token || cb.rest.AppContext.user.token cb.rest.AppContext.ignoreuniform cb.rest.AppContext.serviceUrl

cb.utils.changePredicateDate() => cb.rest.AppContext.predicateDate

cb.utils.getPredicateValue() => cb.rest.AppContext[predicate[0]]

cb.utils.getUserId() => cb?.rest?.AppContext[domainKey]?.user?.userId || cb?.rest?.AppContext?.user?.userId

## [](#上下文丢失登记文档)上下文丢失登记文档

[领域使用AppContext统计表.xlsx](https://docs.diwork.com/l/0bC2BCa57118)
（密码：97c7ab）

## [](#规范前端api)规范前端API

文档地址

- [上下文 Context](#/api/05-context)
- [配置信息 Config](#/api/05-config)
- [环境信息 Env](#/api/05-env)

// 租户用户相关

cb.context.getTenantId() // 租户id

cb.context.getUserId() // 用户id

cb.context.getOrgId() // 组织id

cb.context.getDefaultOrgId() // 默认业务单元

cb.context.isSingleOrg() // 是否是单组织

cb.context.getBusinessDate() // 业务日期

cb.context.isNewArch() // 是否是新架构

cb.context.getDocType(); // 获取客户、供应商、toB、toC等类型

cb.context.getProductLine(); // 获取产品线

cb.context.getUserType(); // 获取用户类型

cb.context.getExtra('user.id'); // 获取额外属性，支持a.b.c透传

cb.context.getOptionValue(); // 获取option值

cb.context.getQuery(); // 获取url上的参数

cb.context.isMjTenant(); // 是否是mj租户

// 全球化

cb.context.golbal.getLocale() // 当前语种

cb.context.golbal.getMultiList() // 语种列表

cb.context.golbal.getDataFormat() // 数据格式

cb.context.golbal.getTimeZone() // 时区

cb.context.golbal.isMultilingualFlag(); // 是否开启多语

// 环境信息

cb.env.getServiceUrl() // 服务地址

cb.env.getNodeServerUrl() // Node服务地址

cb.env.isPremisesEnv(); // 是否是专属化

cb.env.getMainOriginUrl(); // 业务中台地址

// 配置信息

cb.config.getDomainCode(); // 工作台领域编码

cb.config.getApplicationCode(); // 工作台应用编码

## [](#后端新老接口变化)后端新老接口变化

user.xxxx

{

 encodeBy: -,

 salt: '', -

 secretKey: '', -

 ts: {}, 格式修改，改为json

 userPassword: '', -

 cityAutoSet: [], 格式修改，改为数组

 cityLimitSet: [], 格式修改，改为数组

 realName: '', +

 scope: '', +

 absoluteUserAvator: '', +

}

以前null 变成了0或''

 

tenant.xx，新增属性太多不再列举

{

 currentIdentities: '',- 不要了

 identities: '', - 不要了

 isSingleOrg: '', - isSingleOrg是单组织才返回

 syscode: '', - 不要了

}

## [](#后端如何扩展)后端如何扩展？

打开领域节点前端会先调用user/getLoginUser接口，后端对user/getOrgsAndStores进行扩展。

## [](#cbrestappcontext-标准内容)cb.rest.AppContext 标准内容

cb.rest.AppContext = {

 "globalization": {

 "locale": "zh_CN", // 语种 locale

 "sysLocale": "zh_CN", // 默认语种 DEFAULT_LANGVO

 "timezone": "UTC+08:00", // 时区 timezone

 "multilingualFlag": true, // 多语标识 multilingualFlag

 "multilist": [{}, {}, {}], // 语种列表 LANGVO_LIST

 "theme": "", // 主题 theme

 "businessDate": "", // 业务日期 businessDate

 "dataformat": {} // 格式化信息 ???

 },

 "user": {

 "userId": "4be9794e-ec5f-4e4d-b37f-fb89c8e5efff", // 友户通用户标识 yhtUserId

 "yxyUserId": "", // 营销云用户标识 yxyUserId ???

 "enterpriseUserId": "", // 企业用户标识 enterpriseUserId

 "userType": "", // 用户类型 userType

 "userName": "昵称", // 用户名称 name

 "docId": "", // 当前用户登录身份关联的客户或供应商标识 docId

 "docType": "", // 客户、供应商、toB、toC等类型 docType

 "docName": "", // ???

 "loginTs": 1667364601768 // 登录时间 loginTime

 },

 "tenant": {

 "newArch": false, // 新架构标识 newArch

 "tenantId": "0000KPDEKPDIBLPTSA0000", // 友户通租户标识 yhtTenantId

 "yxyTenantId": "", // 营销云租户标识 yxyTenantId

 "providerId": "", // ISV标识 providerid

 "orgId": "", // 组织标识 orgId

 "defaultOrg": "", // 默认组织 defaultOrg

 "isSingleOrg": false, // 是否是单组织 isSingleOrg

 "productLine": "diwork" // 产品线 productLine

 },

 [domainKey]: {

 x1: 111,

 x2: 111,

 ...

 }

}

 

// 以前获取方式

// cb.rest.AppContext.globalization.locale

// 标准获取方式

// cb.context.golbal.getLocale()

 

// 领域以前获取方式

// viewModel.getAppContext().tenant.idd

// 领域标准获取方式

// cb.context.getExtra(viewModel, 'tenant.idd')