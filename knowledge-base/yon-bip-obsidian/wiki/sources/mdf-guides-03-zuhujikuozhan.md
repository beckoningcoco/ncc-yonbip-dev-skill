---
title: "租户级扩展"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/03-zuhujikuozhan"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 租户级扩展

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/03-zuhujikuozhan | 所属：指南

# [](#租户级扩展)租户级扩展

## [](#1-租户级扩展脚本的引入流程)1. 租户级扩展脚本的引入流程

租户管理员可以在自定义按钮菜单，进入配置自己的扩展脚本，这样就实现不同租户加载不同的扩展脚本。通过自定义按钮菜单配置的在java端返回的协议中会多个extscripturls字段，运行是会再加载extscripturls对应的扩展脚本。

extscripturls ：存放的是额外扩展文件的服务器地址，其类型为数组。

## [](#2-配置方式)2. 配置方式

可以在数据库 [bill_customerdef] 表中配置租户要加载的扩展脚本

||中文描述||数据库字段||类型||描述|
||主键||id||bigint(20)||自动编号|
||单据编码||cbillno||varchar(100)||对应bill_base表的cBillNo字段|
||扩展脚本地址||extscripturl||varchar(100)|||
||租户ID||tenant_id||bigint(20)|||
||时间戳||pubts||timestamp||时间戳，不需要预置|

extscripturl

// 示例

[https://xxxx.com/cpu-extend-fe/src/zhonghua/mdf/yssupplier/aa_vendor.js](https://xxxx.com/cpu-extend-fe/src/zhonghua/mdf/yssupplier/aa_vendor.js)

配置成功后，看一下加载该单据的 meta 数据时，extscripturls
数据里是否有内容。如果 extscripturls
里没用内容，检查一下上述的配置项哪里有遗漏。如果像下图一样有配置的拓展地址，恭喜你。拓展脚本添加成功！再看一下控制台有没有成功加载这个文件。就可以开始调试了。

## [](#3-拓展脚本示例)3. 拓展脚本示例

cb.defineInner([], function() {

var TestExternal = {

//外部调用方法入口

doAction: function(name, viewModel) {

if (this[name]) {

this[name](viewModel);

}

},

//初始化整个扩展脚本

init: function(viewModel) {

try {

// 国家参照afterEvent added by zhangliy

var countryCode_ZHONGHUA = '';

viewModel.get("customItems!define5").on("afterValueChange",

function(data) {

countryCode_ZHONGHUA = data.value && data.value.code ? data.value.code :

'';

})

// 省份参照beforeEvent added by zhangliy

viewModel.get("customItems!define6").on("beforeBrowse",

function(data) {

var condition = {

"isExtend": true,

simpleVOs: []

};

condition.simpleVOs = [{ field: 'code', op: 'leftlike', value1:

countryCode_ZHONGHUA }];

viewModel.get("customItems!define6").setFilter(condition);

})

// 省份参照afterEvent added by zhangliy

var provinceCode_ZHONGHUA = '';

viewModel.get("customItems!define6").on("afterValueChange",

function(data) {

provinceCode_ZHONGHUA = data.value && data.value.code ?

data.value.code.slice(2, data.value.code.length) : '';

})

// 城市参照beforeEvent added by zhangliy

viewModel.get("customItems!define7").on("beforeBrowse",

function(data) {

var condition = {

"isExtend": true,

simpleVOs: []

};

condition.simpleVOs = [{ field: 'code', op: 'leftlike', value1:

provinceCode_ZHONGHUA }];

viewModel.get("customItems!define7").setFilter(condition);

})

} catch(err) {

console.log(err);

}

}

}

return TestExternal;

})

写法与厂单据
拓展写法一致，不能认为是二开上来就拿模型拿数据问为什么不生效，为什么报错！比如你需要在这个客开脚本里去控制表格行按钮的显示隐藏。也是需要去监听gridModel的生命周期的，在afterLoadData之后，才能拿到对应数据。

## [](#4-拓展自定义组件)4. 拓展自定义组件

这里的租户级拓展都是对逻辑层面 viewModel
的拓展。如果需要使用租户级拓展来实现加载租户级的组件的拓展，可以仿照领域拓展开发，用
【领域拓展脚手架】
工程实现自定义组件拓展，然后在拓展文件里，再引用该工程打包后的文件地址，即可实现对组件的客开拓展。

cb.define(process.env.__DOMAINKEY__,

['http://localhost:8080/extend.js'], function() {

// 将 http://localhost:8080/extend.js 替换成 拓展组件工程地址即可

// 这里第二个参数为数组，可配置多个文件地址。

var testExtend = {

doAction: function(name, viewModel) {

if (this[name]) {

this[name](viewModel);

}

},

//初始化整个扩展脚本

init: function(viewModel) {

...

}

return testExtend;

})