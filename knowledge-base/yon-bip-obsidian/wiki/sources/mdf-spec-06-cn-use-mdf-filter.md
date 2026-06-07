---
title: "CN使用MDF查询区"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/06-cn-use-mdf-filter"
section: "协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 协议]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# CN使用MDF查询区

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/06-cn-use-mdf-filter | 所属：协议

# [](#cn使用mdf查询区)CN使用MDF查询区

## [](#1-mdf过滤区介绍)1. MDF过滤区介绍

MDF参照依赖MDF.js，项目中无需安装任何@mdf的包，方便使用。

## [](#2-mdf参照使用)2. MDF参照使用

### [](#21-资源加载)2.1. 资源加载

加载必要的js文件，区分本地调试和上线环境(以daily为例)。

在项目的index.html目录中加入如下代码，线上环境:(daily、test要配置响应的地址)，加载resource时候需要**mdfrefer=true**

<script src="https://<工作台域名>/mdf-node/mdf/resource?mdfrefer=true"></script>

页面index.html

<body>

 ...

 // 页面上提供渲染组件的容器 将dom传入cb.cn.filter.render(config)

 <div id="xxx">

 // 对于查询组件 移动端都是侧拉效果建议结合Drawer组件如下使用,如不是侧拉效果页面正常提供dom容器即可

 <Drawer

 ...

 sidebar={

 <div id='xxx'></div>

 }

 />

 </div>

</body>

### [](#22-api清单)2.2. API清单

以react使用为例

import React, { Component } from 'react';

 

class xxFilter extends Component {

 constructor(props) {

 super(props);

 }

 

 // 组件渲染后调用初始化参照组件，如果是vue也需要在响应生命周期函数中设置即可。

 componentDidMount() {

 let id = this.props.continerId;

 cb.cn.filter.render({

 domainKey: 'xxx',

 billNo: 'xxx',

 serviceCode: 'xxx',

 query: 'xxx',

 fail: () => {},

 success: () => {},

 dom: document.getElementById('filter'),

 isMobile: false

 });

 }

 

 render() {

 return (<div id='yxyweb-support-container'>

 <div id='自定义id'></div>

 </div>)

 }

}

上述逻辑也可以写在window.cbReady中

<script>

 window.cbReady = ()=>{

 cb.businessContext = {};

 cb.cn.filter.render({

 domainKey: 'xxx',

 billNo: 'xxx',

 serviceCode: 'xxx',

 query: 'xxx',

 fail: () => {},

 success: () => {},

 dom: document.getElementById('filter'),

 isMobile: false

 });

 }

</script>

**参数说明：**

CN项目使用查询区是在一个特定的dom中渲染MDF项目的查询区，例：在一个自主项目中使用采购订单的查询区

||参数名字||是否必输||value|
||domainKey||是||被使用查询区所属的domainKey|
||billNo||是||被使用查询区所属表单的billNo|
||serviceCode||是||被使用查询区所属领域的serviceCode|
||query||否||地址栏参数|
||fail||否||失败的回调函数|
||success||否||成功的回调函数|
||dom||是||查询区渲染在哪个容器的dom|
||isMobile||否||是否加载移动端查询方案|