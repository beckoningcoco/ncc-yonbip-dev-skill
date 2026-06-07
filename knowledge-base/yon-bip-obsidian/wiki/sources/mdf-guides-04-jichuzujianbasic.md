---
title: "基础组件 basic"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/04-jichuzujianbasic"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 基础组件 basic

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/04-jichuzujianbasic | 所属：指南

# [](#基础组件-basic)基础组件 basic

## [](#1-扩展组件的实现)1. 扩展组件的实现

basic下的组件类型一般是基础组件，比如input、select之类，如果领域需要扩展基础组件，要**把组件放到basic目录下面**，并导出组件，如下图中UserDefineExtendCode组件：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jichuzujianbasic_image1.75b1713c.png)

## [](#2-扩展组件的使用)2. 扩展组件的使用

在模板中(UI元数据)把组件类型cControlType改为扩展组件的名字即可

通过下面的方法验证扩展组件是否注册成功：

启动本地项目

- 方式一：cb.extend.Components[domainKey][type][cControlType]
- 方式二：cb.extend.getComponent(domainKey,type,cControlType)

如果注册成功，会显示改组件的名字UserDefineExtendCode，如下图：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jichuzujianbasic_image2.f9894d37.png)

**注意：basic下面的组件对应meta接口返回数据的controls里边的组件，如果扩展组件没有加载成功，除了上面的排查方法之外，还需要排查下meta接口是否返回了该组件。**

## [](#3-扩展组件示例)3. 扩展组件示例

### [](#31-无模型绑定样例)3.1. 无模型绑定样例

import React from 'react'

 

class UserDefineExtendCode extends React.Component {

 constructor(props) {

 super(props)

 this.state = {

 

 }

 }

 

 componentDidMount() {

 

 }

 

 componentWillUnmount() {

 

 }

 

 render() {

 return (

 <div className='xxx'>

 这是一个基础组件

 </div>

 )

 }

}

 

export default UserDefineExtendCode

### [](#32-有模型绑定样例)3.2. 有模型绑定样例

import React from 'react'

 

class UserDefineExtendCode extends React.Component {

 constructor(props) {

 super(props)

 // cStyle：配置自定义属性，比如给组件配置className，cStyle="{"className": "XXX"}" 

 const { cStyle } = props;

 let config = null

 if (cStyle) {

 config = cb.utils.stringToJSON(cStyle)

 }

 this.state = Object.assign({

 

 }, config);

 }

 

 componentDidMount() {

 //初始化的时候绑定模型

 if (this.props.model) {

 this.props.model.addListener(this);

 }

 }

 

 componentWillUnmount() {

 // 组件卸载的时候销毁模型

 if (this.props.model) {

 this.props.model.removeListener(this);

 }

 }

 

 render() {

 // className是组件cStyle中的扩展属性，在组件初始化的时候解析到state中。

 const { className} = this.state;

 const { model} = this.props;

 return (

 <div className={className}>

 // 获取组件的值，调用模型的getValue方法

 <div>{model.getValue()}</div>

 </div>

 )

 }

}

 

export default UserDefineExtendCode