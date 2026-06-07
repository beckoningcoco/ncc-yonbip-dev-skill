---
title: "网络请求 Proxy"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-proxy"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 网络请求 Proxy

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-proxy | 所属：API

# [](#网络请求-proxy)网络请求 Proxy

## [](#1-目录)1. 目录

- cb.rest

cb.rest.getImgSrc
- cb.rest._getUrl
- cb.rest._appenUrl
- cb.rest.DynamicProxy

cb.rest.DynamicProxy.create
- cb.rest.DynamicProxy.prototype.init
- cb.rest.DynamicProxy.prototype.Do
- cb.rest.DynamicProxy.prototype.Ajax

- cb.rest.MergeProxy

cb.rest.MergeProxy.create

- cb.rest.ajax
- cb.rest.AjaxRequestManager
- cb.rest.ContextBuilder

cb.rest.ContextBuilder.constuct

## [](#2-接口调用)2. 接口调用

### [](#21-viewmodelsetproxy)2.1. viewmodel.setProxy

有ViewModel时的情况，框架自动处理domainKey参数

**示例：**

// 声明，saveByToken为方法名，一般为接口名，同一个单据中名字最好不要相同

const proxy = viewmodel.setProxy({

 saveByToken: {

 url: '/xxx/xxx/saveByToken',

 method: 'POST',

 options: {

 mask: false

 }

 }

});

 

// 异步调用

proxy.saveByToken(params, function (data) {

 console.log('success', data)

})

 

// 同步调用，需要在options里传入async=false参数

const data = proxy.saveByToken(params)

console.log(data)

**参数说明：**

||**参数**||**类型**||**备注**|
||url||`''`||请求地址|
||method||`GET | POST`||请求类型|
||context||`{}`||上下文参数|
||options||`{}`|||
||  options.mask||`boolean`||是否显示Loading，默认true|
||  options.uniform||`boolean`||是否走unifrom路由转发，默认true|
||  options.async||`boolean`||是否异步，true-异步；false-同步，默认异步|
||  options.deflate||`boolean`||是否压缩传输，默认false|
||  options.timeout||`number`||超时时间 毫秒|
||  options.contentType||`''`||Content类型，默认application/json;charset=utf-8|
||  options.domainKey||`''`||目标服务domainKey，默认取viewmodel上的|
||  options.dateType||`''`||json | file，默认无|
||  options.withCredentials||`boolean`||是否跨域携带cookie，默认false|
||  options.jsonp||`boolean`||是否jsonp请求，默认false|
||  options.serviceCode||`''`||指定serviceCode|
||  options.query||`{}`||指定query参数，比如添加transtype参数等|
||callback||`function`||回调函数|
||params||`{}`||请求业务参数|

### [](#22-cbrestdynamicproxy)2.2. cb.rest.DynamicProxy

无ViewModel时的情况，需要自行传入domainKey参数（不推荐使用，需要补options.query参数）

**示例：**

// 声明，autoPick为方法名，一般为接口名，同一个单据中名字最好不要相同

var proxy = cb.rest.DynamicProxy.create({

 autoPick: {

 url: '/xxx/xxx/autoPick',

 method: 'POST'

 }

});

 

// 异步调用

proxy.autoPick(params, function (err, result) {

 console.log('success', result)

}

 

// 同步调用，需要在options里传入async=false参数

const data = proxy.autoPick(params)

console.log(data)

**参数说明：**

同上

## [](#3-上传文件废弃)3. 上传文件（废弃）

/**

* 1. diworkCode：替换下diworkCode（作为loading使用，不用可以不加）

* 2. domainKey：替换下domainKey为领域自己的

* 3. 接口需要的参数放到formData里

* 4. url可以自定义，/uniformdata/xxxxx,即 可修改xxxxx为自定义的接口名称，abc，那最终接口拼接为 /uniformdata/abc

* 5. callback里的返回值：err为接口报错信息，res为接口数据返回信息

*/

const eleInput = document.createElement('input');

eleInput.type = 'file';

eleInput.style.display = 'none';

eleInput.onchange = function (e) {

 const file = e.target.files[0];

 const formData = new FormData();

 formData.enctype = 'multipart/form-data';

 formData.append('file', file);

 const url = '/uniformdata/xxxxx'

 cb.utils.loadingControl.start({ diworkCode: 'xxxxx' })

 cb.rest.ajax(url, {

 method: 'post',

 uniform: false,

 mask: false,

 dateType: true,

 domainKey: 'xxxx',

 params: formData,

 callback: (err, res) => {

 cb.utils.loadingControl.end({ diworkCode: 'xxxxx' })

 if (err) {

 console.log(err)

 } else {

 console.log(res)

 }

 }

 })

 

 document.body.removeChild(eleInput);

}

 

document.body.appendChild(eleInput);

eleInput.click()

## [](#4-下载文件废弃)4. 下载文件（废弃）

/**

* 1. 后端需要的参数可以放到data的json里

* 2. vm为扩展脚本里的viewmodel，确定后直接替换下即可

* 3. xxx 为后端接口（确保能返回流文件）

*/

vm.get('xxxx按钮').on('click', () => {

 const data = { json: { fileName: 'xxxx', xx: xxx } }

 const prefix = cb.utils.getServiceUrl();

 const url = `${prefix}/files/xxx`;

 const { common } = vm.biz.action()

 common.createDownloadForm({ url, params: data });

});

## [](#5-公共转发规则)5. 公共转发规则

- `/uniform`

所有以 `/uniform` 开头的请求会原封不动以 JSON 形式转到 Java 服务，Node 不做任何处理（仅处理 JSON 类型数据）

- 

`/formdata`

所有以 `/formdata` 开头的请求会原封不动以 FormData 形式转到 Java 服务，Node 不做任何处理（仅处理 FormData 类型数据）

- 

`/uniformdata`

所有以 `/uniformdata` 开头的请求会原封不动透传到 Java 服务，数据量大时不建议使用（缩减大小），文件上传下载不建议使用（直接对接文件服务），会影响 Node 服务性能

- 

Node 对所有过境请求流量限制最大 50M