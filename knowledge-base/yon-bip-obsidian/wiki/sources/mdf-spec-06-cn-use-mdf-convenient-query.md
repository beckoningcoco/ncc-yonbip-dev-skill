---
title: "CN使用MDF查询设置面板"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/06-cn-use-mdf-convenient-query"
section: "协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 协议]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# CN使用MDF查询设置面板

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/06-cn-use-mdf-convenient-query | 所属：协议

# [](#cn使用mdf查询设置面板)CN使用MDF查询设置面板

## [](#1-渲染查询条件设置面板)1. 渲染查询条件设置面板

cb.cn.filter.render

**作用：** 通过billNo、domainKey等参数获取查询组件，挂在到特定dom中dom的id要叫yxyweb-support-container

**参数列表：**

||参数||作用||内容/格式|
||params||传递参数||{billNo: 'xxx',domainKey: 'xxx',serviceCode: 'xxx'};|
||dom||将内容插入到dom中||<div id='xxx'></div>|

示例：

cb.cn.filter.render({

 params: {

 billNo: 'st_purchaseorderlist',

 domainKey: 'upu',

 serviceCode: 'st_purchaseorderlist'

 },

 dom: document.getElementsByClassName('portal-workbench-item')[12],

 isMobile: false

})

友空间调用传入isMobile为true，isMobile为false时候可以省略不传

**注意如果领域的url中有其他参数，应该解析之后注入到params的query中，结构**

params: {

 billNo: 'xxx',

 domainKey: 'xx',

 serviceCode: 'xx',

 query: {

 a: 1,

 b: 2,

 c: 3

 }

}

**初始化方案的时候如果想要带入默认条件，可以在params中添加参数condition，**

**condition的结构为 condition:{commonVOs: [{xxxx},{xxxxx}]}**

## [](#2-获取设置的查询方案)2. 获取设置的查询方案

[cb.cn](http://cb.cn).filter.getConditions

**作用：** 通过billNo、domainKey等参数获取查询组件当前的条件

||参数||含义|
||billNo||单据的billNo|
||domainKey||领域的domainKey|

示例：

cb.cn.filter.getConditions({

 billNo: 'st_purchaseorder',

 domainKey: 'upu',

 isMobile: false

})

友空间调用传入isMobile为true，isMobile为false时候可以省略不传