---
title: "与第三方系统集成"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/07-other-system-integration"
section: "协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 协议]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 与第三方系统集成

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/07-other-system-integration | 所属：协议

# [](#与第三方系统集成)与第三方系统集成

## [](#1-目标与效果)1. 目标与效果

第三方系统需要集成MDF单据打开能力时，需要加载MDF相关资源后，调用cb.render()来实现无iframe方式打开MDF单据，以减小资源重复加载，加快页面打开速度。

## [](#2-预加载mdf资源)2. 预加载MDF资源

### [](#21-资源加载)2.1. 资源加载

方式1：通过script标签引入

<script src="https://<工作台域名>/mdf-node/mdf/resource?mdfrefer=true\"></script>

方式2：通过require引入

require("https://<工作台域名>/mdf-node/mdf/resource?mdfrefer=true")

**注意：**

- 资源加载完成后会调用window.cbReady()，所以对于以下API的调用请在window.cbReady()后使用。
- 以上示例是日常环境，其它环境域名可通过在控制台打印 **cb.utils.getNodeServerUrl()** 获取
- 如果存在跨域问题请在cbReady中执行 **cb.rest.setServiceUrl(cb.utils.getNodeServerUrl())**

### [](#22-样式隔离)2.2. 样式隔离

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

### [](#23-常见问题)2.3. 常见问题

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

## [](#3-api清单)3. API清单

### [](#31-打开单据)3.1. 打开单据

示例：

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

参数说明：

||参数||说明||可选值|
||billtype||单据类型||[voucherlist,voucher,editvoucherlist,freeview]|
||billno||单据号|||
||domainKey||domainKey是统一node识别，并不是后端的domain，统一node注册的是什么就是什么|||
||diworkCode||diworkCode|||
||params||query: {
serviceCode, // 同上一致
refimestamp // 时间戳可不传
}|||

### [](#32-监听关闭mdf节点事件)3.2. 监听关闭mdf节点事件

cb.events.on('closeMdfBill', (history) => {

 处理逻辑

})