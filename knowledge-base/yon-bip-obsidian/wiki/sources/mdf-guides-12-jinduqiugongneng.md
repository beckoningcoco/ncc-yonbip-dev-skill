---
title: "进度球功能"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/12-jinduqiugongneng"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 进度球功能

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/12-jinduqiugongneng | 所属：指南

# [](#进度球功能)进度球功能

## [](#1-概述)1. 概述

进度球可以实时展示接口处理的进度。例如：批量删除数据，批量导出数据，导入，异步保存等。

## [](#2-原理)2. 原理

进度的实时展示，使用轮询实现，以循环导出100条数据为例进行说明。

已有导出接口（interface_export）：/biz/export

修改interface_export为异步接口，interface_export响应前端后，开启前端的轮询逻辑。前端轮询发送get请求，每次获取执行的进度进行展示。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jinduqiugongneng_image1.9e4d085a.png)

## [](#3-接入流程)3. 接入流程

1、 修改interface_export为异步执行。
可以使用线程池实现，主线程不执行删除任务，删除由线程池中新的线程执行。主线程返回数据结构：

其中  url为轮询进度接口,
asyncKey为一个自定义的随机数，根据这个数获取进度

{

 "code": 200,

 "message": "操作成功",

 "data": {

 "count": 0,

 "sucessCount": 0,

 "failCount": 0,

 "messages": [],

 "infos": [{

 "asyncKey": "asyncOutput_dd86da65f2da4497e052dcea9b893fe4",

 "url": "/billtemp/getExportProcess"

 }],

 "failInfos": []

 }

}

2、 新增接口（getExportProcess），实时返回处理的进度。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jinduqiugongneng_image2.ae498a2f.png)

**接收参数：**
asyncKey的值为interface_export返回值。

**返回值：**

{

 "code":200,

 "message":"操作成功",

 "data":"{

 \"flag\":1,

 \"code\":200,

 \"data\":{

 \"count\":4,

 \"failCount\":1,

 \"infos\":[],

 \"messages\":[\"HX202205172042获取Owner失败\"],

 \"sucessCount\":3

 },

 \"failCount\":1,

 \"count\":4,

 \"totalCount\":4,

 \"percentage\":100,

 \"successCount\":3

 }"

}

注意：第一层data属性为字符串

第1层data属性说明：

||属性||值||说明|
||flag||1||1代表成功，0代表失败|
||code||200||状态码|
||percentage||20||每次请求，返回当前进度|
||totalCount||100||总数|
||count||20||已处理数据数目|
||successCount||19||成功的数目|
||failCount||1||失败的数目|

第2层data属性说明：

||属性||值||说明|
||totalCount||100||总数|
||count||20||已处理数据数目|
||sucessCount||19||成功的数目|
||failCount||1||失败的数目|
||message||NullPointerException||错误说明|

注意：第2层data中**sucessCount的拼写。**

第二层数据，点击《查看错误明细》时，展示，如图：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jinduqiugongneng_image3.8c656398.png)

## [](#4-前端配置)4. 前端配置

const proxy = viewModel.setProxy({

 doExport: {

 url,

 method: 'get',

 options: {

 domainKey: process.env.__DOMAINKEY__

 }

 }

})

 

const postData = { xxx: '请求参数' }

 

proxy.doExport(postData, function (error, result) {

 if (error) {

 cb.utils.alert(error.message);

 return;

 } else {

 const [info]= result?.infos || [];

 const queryParams = {

 asyncKey: info?.asyncKey,

 domainKey: process.env.__DOMAINKEY__,

 url: info?.url,

 asyncName: '显示标题'

 }

 cb.utils.queryAsyncProcess('参数1', viewModel, queryParams);

 }

});

 

/**

* 参数1：对应billno

* viewModel：为当前模型

*/

### [](#411-参数说明)4.1.1. 参数说明

||属性||说明|
||viewModel||当前界面模型|
||url||请求地址|
||method||请求方法|
||postData||请求参数|
||options.domainkey||领域domainkey|
||参数1||对应billno|

result为第一个接口返回值。使用result获取访问的url与asyncKey。url为getExportProcess的访问url。

cb.utils.queryAsyncProcess方法，会轮询发起get请求。

- 进度轮询结束即进度球100%后的成功回调监听函数afterImport，在回调函数里做后续的操作
- 进度轮询失败后的监听回调asyncFinishedWithError

// 示例代码 viewmodel替换为页面模型

// 成功回调

viewmodel.on('afterImport', () => {

 // do something

})

 

// 失败回调

viewmodel.on('asyncFinishedWithError', () => {

 // do something

})

## [](#5-后端说明)5. 后端说明

Get请求第一层data属性的值为json字符串，因为可以方便的适配Redis。可以直接放入Redis，key可以使用asyncKey构造。

共需要循环n(例如20)次，每次循环结束，更新Redis，get请求轮询获取值，设置为属性。

## [](#6-faq)6. FAQ

### [](#6111-q-异步进度完成条件)6.1.1.1. Q: 异步进度完成条件？

**A: 分为2种情况成功和失败**

- **返回值flag为1，percentage为100时为成功结束**
- **flag为0或者Throw Error报错为失败结束**

### [](#6112-q-适配文档说明)6.1.1.2. Q: 适配文档说明？

**A:** 前端开发人员需关心【前端配置】介绍，其余需后端开发完成。

### [](#6113-q-进度球刷新问题)6.1.1.3. Q: 进度球刷新问题？

**A:
领域在调 cb.utils.queryAsyncProcess方法后，当进度球结束后会默认刷新当前页面，如果不需要刷新页面，可以配置refresh:false**

// 示例代码 viewmodel替换为页面模型

const queryParams = {

 xx: xxx,

 xx: xxx,

 refresh: false,

 ...

 }

 

cb.utils.queryAsyncProcess('参数1', viewModel, queryParams);

 

/**

 * 参数1：对应billno

 * viewModel：为当前模型

 */