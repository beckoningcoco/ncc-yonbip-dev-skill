---
title: "基础组件 basic(移动端)"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/04-jichuzujianbasicyidongduan"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 基础组件 basic(移动端)

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/04-jichuzujianbasicyidongduan | 所属：指南

# [](#基础组件-basic移动端)基础组件 basic(移动端)

## [](#1扩展组件的实现)1、扩展组件的实现

1.1、basic下的组件类型是基础组件

领域使用基础类型扩展组件，需要把组件放到basic目录下面，如下图lsfcPersonalCenter和demo：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jichuzujianbasicyidongduan_image1.996ac188.png)

1.2、在入口文件导出组件

src/client/mobile/components/basic/index.jsx

export * from "./demo"

export * from "./lsfcPersonalCenter";

1.3、使用组件：**在模板中(UI元数据)把组件类型cControlType改为扩展组件的名字即可**

1.4、启动本地项目，验证扩展组件有没有加载成功，如果没有加载成功按照下面的方式排查：

在浏览器控制台输入下列方法

- 

方式一：cb.extend.Components[domainKey][type][cControlType]

- 

方式二：cb.extend.getComponent(domainKey,type,cControlType)

如果注册成功，会显示该组件的名字，如下图：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jichuzujianbasicyidongduan_image2.71c110dc.png)

**注意：basic下面的组件对应meta接口返回数据的controls里边的组件，如果扩展组件没有加载成功，除了上面的排查方法之外，还需要排查下meta接口是否返回了该组件。**

## [](#2扩展组件示例)2、扩展组件示例

### [](#21无模型绑定样例)2.1无模型绑定样例

import React from 'react'

import './index.less'

 

class BasicDemo extends React.Component {

 constructor(props) {

 super(props)

 this.state = { 

 // 初始化状态

 }

 } 

 componentDidMount() {

 // 组件挂载后的操作

 }

 

 componentWillUnmount() {

 // 组件即将卸载时的操作

 } 

 render() {

 return (

 <div className='xxx'>

 这是一个基础组件

 </div>

 )

 }

}

 

export default BasicDemo

### [](#22有模型绑定样例)2.2有模型绑定样例

import React from 'react'

 

class BasicDemo extends React.Component {

 constructor(props) {

 super(props)

 // 在模板上给字段配置cStyle属性（自定义属性）与组件进行交互，比如给组件配置className，示例：cStyle="{"className": "XXX"}" 

 const { cStyle } = props;

 let config = null

 if (cStyle) {

 config = cb.utils.parseCStyle(cStyle)

 }

 this.state = Object.assign({

 

 }, config);

 }

 

 componentDidMount() {

 // 初始化的时候绑定模型

 if (this.props.model) {

 this.props.model.addListener(this);

 }

 //其他业务逻辑

 }

 

 componentWillUnmount() {

 //组件销毁的时候销毁模型

 if (this.props.model) {

 this.props.model.removeListener(this);

 }

 }

 

 render() {

 // className是组件cStyle中的扩展属性，在组件初始化的时候解析到state中。 

 const { className } = this.state;

 const { model } = this.props; 

 return ( // 下面是一个获取组件值，调用模型的getValue方法的示例

 <div className={className}>

 这是一个绑定模型的扩展组件

 <div>{model.getValue()}</div> 

 </div>

 )

 }

}

 

export default BasicDemo

## [](#3扩展脚本调用扩展组件事件示例)3、扩展脚本调用扩展组件事件示例

**注册事件**

viewmodel.on('eventName',function(){ // eventName方法名为领域自定义，需要扩展脚本和扩展组件保持一致

 //具体业务逻辑

})

**卸载事件**

viewmodel.un('eventName',function(){

 //具体业务逻辑

}) // 如在扩展组件中注册事件，在组件卸载时需要卸载事件

**执行事件**

viewmodel.execute('eventName',args) // eventName方法名为领域自定义，需要扩展脚本和扩展组件保持一致

实际使用场景示例：

**扩展脚本**

cb.define(process.env.__DOMAINKEY__,['common/common_VM.Extend.js'], function (common) {

 var xxx_VM_Extend = {

 doAction: function (name, viewmodel) {

 if (this[name])

 this[name](viewmodel);

 },

 init: function (viewmodel) {

 viewmodel.execute('eventName',{ name: "mobile基础组件示例" }); 

 }

 try {

 module.exports = xxx_VM_Extend;

 } catch (error) {

 

 }

 return xxx_VM_Extend;

});

**扩展组件实际示例**

import React, { Component } from 'react';

import './../lsfcPersonalCenter.less'

 

export default class IsfcTop extends Component {

 constructor(props) {

 super(props)

 const { cStyle } = props

 const config = cb.utils.stringToJSON(cStyle);

 this.state = Object.assign({

 name: ''

 }, config);

 }

 componentDidMount() {

 if (this.props.model) {

 this.props.model.addListener(this);

 }

 this.props.model?.on('eventName', this.handleAfterSave);

 }

 componentWillUnmount () {

 if (this.props.model) {

 this.props.model.removeListener(this);

 }

 this.props.model?.un('eventName', this.handleAfterSave);

 }

 

 handleAfterSave(args) {

 this.setState({

 name: args.name

 });

 }

 

 setVisible (visible) {

 this.setState({ visible })

 }

 

 topClick() { // 点击事件 

 this.setState({

 name: '已触发点击事件'

 });

 }

 

 render() {

 const { name, visible } = this.state

 if (!visible) return null

 return (

 <div className="iMain" onClick={this.topClick.bind(this)}>

 {name}

 </div>

 )

 }

}

效果图：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jichuzujianbasicyidongduan_image3.fc70871c.png)