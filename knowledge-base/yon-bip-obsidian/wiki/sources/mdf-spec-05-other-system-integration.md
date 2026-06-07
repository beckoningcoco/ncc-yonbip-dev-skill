---
title: "与第三方系统集成"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/05-other-system-integration"
section: "协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 协议]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 与第三方系统集成

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/05-other-system-integration | 所属：协议

# [](#与第三方系统集成)与第三方系统集成

## [](#1-目标与效果)1. 目标与效果

BIP单据在三方系统打开时失去了BIP预加速能力，页面打开会比较慢，此文档用于优化BIP单据在三方系统中的打开速度

优化思路：

- 提前加载MDF框架相关资源
- 调用cb.render()来实现无iframe方式打开MDF单据，以减小资源重复加载，加快页面打开速度

优化方案：简单优化与深入优化

- 方案一：简单优化目的是提前下载框架所需要的资源，可以节省资源下载的耗时，无法去掉资源装载的耗时，仅能提高部分性能，适用于单页面OA等系统集成
- 方案二：深入优化目的是去掉iframe，以减小资源重复加载，加快页面打开速度，通过门户OA等系统管理页面实现DIV切换，对于多页面且能配合优化的系统建议采用此方案

## [](#2-方案一简单优化)2. 方案一：简单优化

优化后打开页面耗时应该在3-4s为正常水平

### [](#21-资源预加载)2.1. 资源预加载

方式1：通过script标签引入

<script src="https://<工作台域名>/mdf-node/mdf/resource?mdfrefer=true"></script>

方式2：通过require引入

require("https://<工作台域名>/mdf-node/mdf/resource?mdfrefer=true"

## [](#3-方案二深入优化)3. 方案二：深入优化

优化后打开页面耗时在2s内为正常水平

### [](#31-资源预加载)3.1. 资源预加载

方式1：通过script标签引入

<script src="https://<工作台域名>/mdf-node/mdf/resource?mdfrefer=true"></script>

方式2：通过require引入

require("https://<工作台域名>/mdf-node/mdf/resource?mdfrefer=true"

### [](#32-样式隔离)3.2. 样式隔离

如果以上方式打开的单据页面存在样式问题，请在渲染MDF的DOM外层包2层DOM，如下：

<body>

 <div id='xx'></div> <!--挂载业务容器的id,随便定义-->

 ...

 <div id="yxyweb-support-container"><!--# yxyweb-support-container 为固定ID-->

 <div id="yxyweb-support-mount-popover"></div><!--popover/select挂载容器 固定ID-->

 <div id="yxyweb-support-mount-model"></div><!--model挂载容器固定ID -->

 <!-- 渲染MDF区域的DOM，即传给cb.render参数的DOM -->

 </div>

</body>

### [](#33-常见问题)3.3. 常见问题

- 资源加载完成后会调用window.cbReady()，所以对于以下API的调用请在window.cbReady()后使用。
- 可通过在控制台打印 **cb.utils.getNodeServerUrl()** 获取工作台域名
- 如果存在跨域问题请在cbReady中执行 **cb.rest.setServiceUrl(cb.utils.getNodeServerUrl())**

// 解决时机问题

if (cb.cn) {

 cb.render(...)

} else {

 window.cbReady = () => {

 cb.render(...)

 }

}

 

// 解决跨域问题

if (cb.rest || cb.utils) {

 cb.rest.setServiceUrl(cb.utils.getNodeServerUrl())

} else {

 window.cbReady = () => {

 cb.rest.setServiceUrl(cb.utils.getNodeServerUrl())

 }

}

### [](#34-api清单)3.4. API清单

#### [](#341-打开单据)3.4.1. 打开单据

// 定义打开单据参数

const params = {

 "billtype": "voucherlist",

 "billno": "po_production_order_list",

 "domainKey": "productionorder",

 "diworkCode": "po_production_order_list",

 "params": {

 "query": {

 "serviceCode": "po_production_order_list",

 "refimestamp": "1631082065819"

 }

 }

}

// 查找MDF渲染容器

const dom = document.getElementById('dom');

 

// 调用render开启单据

cb.render(params, dom);

#### [](#342-刷新单据)3.4.2. 刷新单据

cb.communication({

 "action": "activeTab",

 "activeKey": "u8c_GZTACT010",

 "data": true

})

#### [](#343-关闭页签)3.4.3. 关闭页签

cb.communication({

 "action": "isCloseAction",

 "activeKey": "u8c_GZTACT010",

 "data": true

})

#### [](#344-重新打开页签)3.4.4. 重新打开页签

cb.communication({

 "action": "isCloseAction",

 "activeKey": "u8c_GZTACT010",

 "data": true

})