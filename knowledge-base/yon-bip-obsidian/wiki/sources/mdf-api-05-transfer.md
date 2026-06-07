---
title: "跨域转发 Transfer"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-transfer"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 跨域转发 Transfer

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-transfer | 所属：API

# [](#跨域转发-transfer)跨域转发 Transfer

## [](#1-api描述)1. API描述

`cb.rest.transferCommonRest()`

用于解决跨服务调用时存在的越权问题

## [](#2-api示例)2. API示例

### [](#21-使用示例1)2.1. 使用示例1

const url = '/log-pub/rest/operation/save';

const targetServiceKey = 'iuap-apcom-auditlog';

const method = 'POST';

const parameter = { aaa: true };

const callback = (data) => {

 console.log(data)

} 

cb.rest.transferCommonRest(viewmodel, {

 params: {url, targetServiceKey, method, parameter},

 domainKey: 'xx',

 query: {xx: xx},

 mask: true

}, callback);

### [](#22-使用示例2)2.2. 使用示例2

const url = '/log-pub/rest/operation/save';

const targetServiceKey = 'iuap-apcom-auditlog';

const method = 'POST';

const parameter = { aaa: true };

const result = cb.rest.transferCommonRest(viewmodel, {

 params: {url, targetServiceKey, method, parameter},

 domainKey: 'xx',

 query: {xx: xx},

 mask: true

});

const data = result.data || []

data.forEach(item => {

...

})

## [](#3-参数说明)3. 参数说明

||**属性**||**含义**||**必输**||**类型**||**默认值**|
||viewmodel||页面模型||是||model||无|
||query||请求url携带参数||否||{}||无|
||mask||请求是否有遮罩层||否||boolean||false|
||domainKey||原请求方domainKey||否||''||根据服务方要求传递|
||proxyKey||setProxy的key||否||''||同一个请求频繁调用时如API调用时传递的参数均不会发生改变可传递此key作为性能优化使用|
||params||原请求参数||是||{}||无|
||--targetServiceKey||原请求微服务编码||是||''||无|
||--method||原请求请求方式||是||''||GET|
||--parameter||原请求请求参数||是||{}||无|
||--url||原请求地址||是||''||无|
||callback||回调函数||否||function||无|