---
title: "页面容器 Page"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-page"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 页面容器 Page

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-page | 所属：Web组件

# [](#页面容器-page)页面容器 Page

## [](#1-功能说明)1. 功能说明

可以在一个表单中嵌入另一个表单的容器

## [](#2-基本属性)2. 基本属性

在billtplgroup_base表中Page容器的cStyle字段中配置

||属性名称||属性含义||值类型||属性说明|
||billnum||需要打开页面的单据编码||string|||
||billtype||需要打开页面的单据类型，默认为voucherlist||string|||
||params||打开page页面携带的参数||string|||
||params.domainKey||子页面domainKey||string||domainKey：子页面的domainKey|
||params.query||子页面的请求参数||{}||给子页面所有请求携带的参数，如：busiObj 、transtype 、serviceCode等示例：{"params":{"query":{"busiObj":"xxx"}}}|
||refmap||page容器内、外字段进行关联a的配置项|||||
||classname||外层容器的扩展类名||string|||
||saveNoUpdate|| 一个单据页面嵌套多张单据保存时，由用户决定是否更新保存逻辑的redux里的信息||boolean||默认是空，不需要更新时，值为true|
||newOpenTabs||是否透传上层viewmodel的newOpenTabs属性值||boolean||如需开启需配为true，默认false，不适配。|

### [](#21-refmap配置示例)2.1. refmap配置示例

refmap: {

 main: [{

 op: 'eq', // 比较符

 srcfield: 'id', // 关联字段源（page外）

 dstfield: 'mainid' // 关联字段（page内）

 }]

}

## [](#3-page子页面渲染事件)3. page子页面渲染事件

// viewmodel为page外的主页面模型

viewmodel.on('beforeSubPageRender', function (data) {

 const { vm, viewmeta } = data;

 // vm为page的页面模型

})

## [](#4-更新组件参数)4. 更新组件参数

### [](#41-更新单据信息)4.1. 更新单据信息

viewmodel.execute('updateViewMeta', {

 code: 'cGourpCode',

 params: {

 id: "id",

 domainKey: ""

 },

 billtype: '单据类型',

 billnum: '单据编码',

 visible: true

});

**如果一个viewmodel下挂载了多个page，需要自行维护各page的模型**

**更多参考：[父子页面间通讯](#/api/01-page-connect)**