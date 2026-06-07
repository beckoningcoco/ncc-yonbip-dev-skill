---
title: "MDF前端接口调用规范化"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/03-mdf-impl-request-introduce"
section: "介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 介绍]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# MDF前端接口调用规范化

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/03-mdf-impl-request-introduce | 所属：介绍

# [](#mdf前端接口调用规范化)MDF前端接口调用规范化

## [](#1-问题背景)1. 问题背景

- **现象：** 权限改造专项后的版本，领域存在发布为交易类型的菜单，且用户只有交易类型菜单权限而没有原单权限时，打开交易类型节点会报【无权限】
- **原因：** 交易类型节点中部分接口没有传transtype参数，此时会使用原单做权限校验（正常打开交易类型节点时所有的接口调用都需要传transtype参数）

## [](#2-改造方案)2. 改造方案

### [](#21-改造原则)2.1. 改造原则

- 所有的接口调用都使用框架提供的标准API，即viewmodel.setProxy方法
- 框架会在此方法内部实现中统一补transtype参数
- 框架发起的调用由框架统一处理，领域发起的调用需要领域按以下方案适配
- 不涉及到交易类型及交易类型发布新菜单的服务可以延后处理（领域各自充分评估）

### [](#22-影响范围)2.2. 影响范围

- 框架中调用的所有接口
- 领域扩展脚本和组件中调用的所有接口
- 领域个别调用框架提供的JS API
- 客开的脚本中调用的所有接口
- 不包含调用非MDF服务的接口（前端直调审批、打印和第3方服务等）
- 此次问题移动端单据不受影响（需要测试回归验证）

### [](#23-领域改造事项)2.3. 领域改造事项

#### [](#231-检查扩展脚本和组件中的接口调用)2.3.1. 检查扩展脚本和组件中的接口调用

需要改造的写法清单：

- cb.rest.DynamicProxy.create
- cb.rest.ajax
- axios插件发起的调用
- request插件发起的调用
- jquery插件发起的调用
- 以及其它所有非viewmodel.setProxy发起的调用

如果领域使用了以上方式调用接口，需要改成viewmodel.setProxy，如果没有viewmodel应从上游往下传递viewmodel或query（query可以通过viewmodel.getParams().query获取）

**原本旧代码：** 为cb.rest.DynamicProxy.create方式创建（其它类似），示例如下：

const proxy = cb.rest.DynamicProxy.create({

 xxx: {

 url: 'xxxxxxxx',

 method: 'GET',

 options: {

 domainKey: params.domainKey

 }

 }

});

**修改方式1：** 此时能获取到viewmodel,则通过setProxy方式修改

const proxy = viewmodel.setProxy({

 saveByToken: {...}

});

 

// 异步调用

proxy.saveByToken(params, function (data) {

console.log('success', data)

})

 

// 同步调用

const data = proxy.saveByTokenSync(params)

console.log(data)

**修改方式2：** 此时无法获取viewmodel,通过补query参数方式修改

// 如果可以获取字段模型或者表格模型等

const rootModel = model.getRootParent();

const query = rootModel.getParams().query;

 

const proxy = cb.rest.DynamicProxy.create({

 saveByToken: {

 ...

 options: {

 query: query // 重点在这里，query应从上游往下传递！！！

 }

 }

});

 

// 异步调用

proxy.autoPick(params, function (data) {

 console.log('success', data)

})

 

// 同步调用

const data = proxy.autoPick(params)

console.log(data)

**标准API文档：[《viewmodel.setProxy》](#/api/05-proxy#21-viewmodelsetproxy)**

#### [](#232-检查扩展中调用的js-api)2.3.2. 检查扩展中调用的JS API

涉及到的API清单：

- cb.context.getPredicateDate(name, args)
- cb.context.isMjTenant(args)
- cb.context.getOptionValue(name, orgId, domain, domainKey, args)
- cb.context.getOptionValues(name, orgId, domain, domainKey, args)
- cb.context.getCommonOptionValue(name, args)

如果领域使用了以上API，args可以传递页面viewmodel或者query，query正常为当前单据的所有URL参数（至少需要包含transtype参数，可以通过viewmodel.getParams().query获取，如果没有viewmodel应从上游往下传递viewmodel或query）

**由于上周上线的版本以上5个API对应的接口开了白名单，所以2.3.2章节的改造时间上不用这么紧迫，在530前改造完成即可**

## [](#3-改造上线时间)3. 改造上线时间

### [](#31-需要领域上线时间)3.1. 需要领域上线时间

- 5月10号改造完上测试和日常环境
- 5月11号上预发环境（有条件的可以在这天上核心1）
- 最晚5月12号上核心1（赶在推核心2之前，否则核心23会大面积爆发问题）

### [](#32-框架上线时间)3.2. 框架上线时间

- 5月9号上测试和日常环境
- 5月10号上预发环境
- 5月11号上核心1（延期到5月12号）

## [](#4-文档更新记录)4. 文档更新记录

### [](#41-2023-05-10-093500)4.1. 2023-05-10 09:35:00

- 修订了影响范围

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFqianduanjiekoudiaoyongguifanhua_image1.2bb97145.png)

- 修订了改造内容

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFqianduanjiekoudiaoyongguifanhua_image2.83ee5aaa.png)