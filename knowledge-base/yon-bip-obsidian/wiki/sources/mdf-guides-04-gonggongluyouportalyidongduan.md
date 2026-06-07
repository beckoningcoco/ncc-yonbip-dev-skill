---
title: "容器组件 meta(移动端)"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/04-gonggongluyouportalyidongduan"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 容器组件 meta(移动端)

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/04-gonggongluyouportalyidongduan | 所属：指南

# [](#公共路由-portal移动端)公共路由 portal(移动端)

## [](#1-扩展公共路由组件导入位置)1. 扩展公共路由组件导入位置

### [](#11-portal下的组件类型是路由组件)1.1. portal下的组件类型是路由组件

领域使用路由类型扩展组件，需要把组件放到portal目录下面，并在index.jsx文件中将组件导出。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gonggongluyouportalyidongduan_image1.a45cad8d.png)

### [](#12-在入口文件导出组件)1.2. 在入口文件导出组件

src/client/mobile/components/portal/index.jsx

import * as selfItem from './def-selfItem/selfItem.jsx'

 

const PortalComponents = {

 'selfItem': selfItem,

}

 

export default PortalComponents

## [](#2-自定义路由组件的使用)2. 自定义路由组件的使用

### [](#21-代码跳转)2.1. 代码跳转

**url：上面定义的路由名字，必须保持一致**

**type：platform（固定传值，不要修改）**

viewModel.communication({

 payload: {

 url: 'character', // 路由名字

 type: 'platform', // 固定值

 modal: viewmodel, // 传递模型

 params: params, // 自定义参数

 }

})

### [](#22-url直接访问)2.2. URL直接访问

https://<业务中台>/mdf-node/platform/definepage?domainKey=upu

详细文档参考《[路由使用](#/api/05-page)》第2.1章节，注意公共路由无法路过鉴权，如需要跳过鉴权使用自定义路径，参考2.1.2章节

## [](#3-自定义路由组件示例)3. 自定义路由组件示例

import React from 'react'

 

class SelfItem extends React.Component {

 constructor(props) {

 super(props)

 // 传递的参数在props中可以取到

 this.state = {

 modal: props.modal, // 传递过来的模型

 params: props.params, // 传递过来的其他参数

 }

 }

 

 componentDidMount() {

 

 }

 

 componentWillUnmount() {

 

 }

 

 render() {

 return (

 <div className='xxx'>

 自定义公共路由组件

 </div>

 )

 }

}

 

export default SelfItem