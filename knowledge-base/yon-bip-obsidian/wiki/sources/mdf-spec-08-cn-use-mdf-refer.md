---
title: "CN使用MDF参照"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/08-cn-use-mdf-refer"
section: "协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 协议]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# CN使用MDF参照

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/08-cn-use-mdf-refer | 所属：协议

# [](#cn使用mdf参照)CN使用MDF参照

## [](#1-参照介绍)1. 参照介绍

MDF参照依赖MDF.js，项目中无需安装任何@mdf的包，方便使用。

效果如图：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/cn-mdf-canzhao.58c48e2b.png)

## [](#2-如何使用)2. 如何使用

### [](#21-资源加载)2.1. 资源加载

方式1：通过script标签引入

<script src="https://<工作台域名>/mdf-node/mdf/resource?mdfrefer=true"></script>

方式2：通过require引入

require("https://<工作台域名>/mdf-node/mdf/resource?mdfrefer=true")

**注意：**

- 资源加载完成后会调用window.cbReady()，所以对于以下API的调用请在window.cbReady()后使用。
- 以上示例是日常环境，其它环境域名可通过在控制台打印 **cb.utils.getNodeServerUrl()** 获取
- 如果存在跨域问题请在cbReady中执行 **cb.rest.setServiceUrl(cb.utils.getNodeServerUrl())**

### [](#22-常见问题)2.2. 常见问题

// 解决时机问题

if (cb.cn) {

 cb.cn.refer.render(config)

} else {

 window.cbReady = () => {

 cb.cn.refer.render(config)

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

### [](#23-使用示例)2.3. 使用示例

以React使用为例

import React, { Component } from 'react';

class xxRefer extends Component {

 constructor(props) {

 super(props);

 //实例化参照模型

 this.model = new cb.models.ReferModel({

 cRefType: props.refcode || '',

 multiple: props.multiSelect,

 displayname: 'name',

 valueField: 'id',

 text: props.dataName || '',

 value: props.dataValue || ''

 });

 //设置参照config

 this.config = {

 modelconfig: {

 afterValueChange: this.props.afterOkClick

 },

 modalContainerDOM //参照弹窗渲染的容器dom 非必传

 }

 }

 // 组件渲染后调用初始化参照组件，如果是vue也需要在响应生命周期函数中设置即可。

 componentDidMount() {

 let id = this.props.continerId;

 cb.cn.refer.render({

 modelName: 'refer',

 model: this.model,

 dom: document.getElementById('自定义id'), // 获取下面dom容器

 config: this.config

 });

 }

 render() {

 let { refcode, record, beforeGetData } = this.props

 return (<div id='yxyweb-support-container'>

 <div id='自定义id'></div>

 </div>)

 }

}

上述逻辑也可以写在window.cbReady中

<script>

window.cbReady = () => {

 //实例化参照模型

 this.model = new cb.models.ReferModel({

 cRefType: props.refcode || '',

 multiple: props.multiSelect,

 displayname: 'name',

 valueField: 'id',

 text: props.dataName || '',

 value: props.dataValue || ''

 });

 this.config = {

 modalContainerDOM //参照弹窗渲染的容器dom 非必传

 };

 cb.cn.refer.render({

 modelName: 'refer',

 model: this.model,

 dom: document.getElementById('自定义id'), // 获取页面渲染refer组件用的dom容器

 config: this.config

 });

}

</script>

**参数说明：**

||**参数名字**||**是否必输**||**说明**|
||modelName||是||查询区组件: filter参照组件: refer, listrefer, treerefer|
||model||是||组件所需模型|
||dom||是||页面渲染组件所需要容器dom|
||config||否||增加一些配置 当是查询组件时 { filterType:'list' }|
||langCongig||否||多语配置|