---
title: "CN使用YNF参照"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/06-cn-use-ynf-refer"
section: "协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 协议]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# CN使用YNF参照

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/06-cn-use-ynf-refer | 所属：协议

# [](#cn使用ynf参照)CN使用YNF参照

## [](#11-原理)1.1. 原理

参照依赖
ynf-fw-apcom-lib包，只要是脚手架接入tns，对本地构建资源无任何增加，直接使用即可(移动端依赖ynf-fw-apcom-mobile-lib)

## [](#12-优点)1.2. 优点

- 领域代码中不用再安装任何参照相关的包。
- 使用系统档案参照，只需要提供refCode及domainKey等极少参数即可

## [](#13-适配手册)1.3. 适配手册

试例代码

import React, { Component } from 'react'

import { ReferInput } from 'ynf-fw-apcom-lib';

 

class YnfCnDemo extends Component {

 constructor (props) {

 super(props);

 

 this.state = {

 refParams: null,

 value: null

 }

 }

 

 componentDidMount () {

 const multiple = true;

 const res = {

 refCode: "ucfbasedoc.bd_countryref",

 multiple,

 refReturn: ['name'],

 domainKey: "developplatform",

 // value: [{id:'1111', name:'张三'}] // 多选 单选{id:'1111', name:'张三'}

 onChange: (arg) => { // 参照选完后的数据

 // 多选直接设置arg 单选设置arg[0]

 

 },

 beforeOpen: function (arg) { // 参照打开前事件

 console.log('参照打开前', arg);

 }

 // 设计器面板支持的事件 在这里都支持

 }

 this.setState({ refParams: res });

 }

 

 render () {

 const { refParams, value } = this.state;

 return <div>

 {refParams ? <ReferInput value = {value} {...refParams} /> : null}

 

 </div>

 }

}

 

export default YnfCnDemo

## [](#14-参照参数及钩子解析)1.4. 参照参数及钩子解析

||参数||值||默认值||是否必填||说明|
||refCode||如："ucfbasedoc.bd_countryref"|| 无|| 是|| 参照编码|
||domainKey||如：“developplatform”||无||是||用来做参照服务转发，前端会根据domainKey转发到对应的参照服务上|
||multiple||如：true ||false||否||是否多选|
||onOk||回调函数||无||是||参照选值完成以后回调|
||beforeOpen||回调函数||无||否||参照打开前事件，支持异步|