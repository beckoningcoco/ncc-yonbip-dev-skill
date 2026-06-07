---
title: "其它表单组件扩展实例"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/04-qitabiaodanzujiankuozhanshili"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 其它表单组件扩展实例

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/04-qitabiaodanzujiankuozhanshili | 所属：指南

# [](#其它表单组件扩展实例)其它表单组件扩展实例

## [](#1-自定义一个数值输入框组件)1. 自定义一个数值输入框组件

### [](#11-组件定义)1.1. 组件定义

在basic目录下或其它目录下创建Input.jsx。

import React, { Component } from 'react'

import FormControl from 'bee-form-control';

 

export default class Input extends Component {

 constructor(props) {

 super(props);

 }

 static model2Props = (props) => {

 const {model} = props

 return {

 value: model.getValue(),

 afterChange: val => model.setValue(val)

 }

 }

 handleBlur = (data) => {

 ..... // 数据处理，没有问题后存储到模型上

 const {afterChange} = this.props;

 if(typeof afterChange === 'function') {

 afterChange(data);

 }

 }

 render(){

 const {value} = this.props;

 return (

 <FormControl onBlur={this.handleBlur} onChange={this.handleBlur} value={value}/>

 ) 

 }

}

我们可以按照正常的React开发先把整体组件实现，如需组件和模型的关联需要增加model2Props属性。实现了真正的组件和模型的解构，不需要在组件中再绑定模型。

**model2Props **
这个内容我们可以理解成除了UI元数据其他的附加属性，这些属性也会传给组件。例如上面的value、afterChange方法，其中的value值来自于当前控件对应的模型的value，afterChange是更改模型中的value值。

我们控件上处理完的数据，如需同步到模型，或者想调用模型一些事件，都可以在这里定义。例如上图中将输入框修改的数据同步到模型上时，会调用新增的afterChange事件，将value值同步到模型上。

### [](#12-组件注册)1.2. 组件注册

在basic目录下的index.jsx文件中导出会自动注册。

export InputNumber from /'./InputNumber/';

### [](#13-组件使用)1.3. 组件使用

方法一：在UI模板设计器上配置类型为InputNumber的字段，如下：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qitabiaodanzujiankuozhanshili_image1.08c44bb8.png)

方法二：在excel中配置billitem_base的cControlType属性为InputNumber

### [](#14-运行时效果)1.4. 运行时效果

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qitabiaodanzujiankuozhanshili_image2.068bfe8b.png)

## [](#2-自定义一个二维码组件)2. 自定义一个二维码组件

### [](#21-组件的定义)2.1. 组件的定义

首先在src/web/common/extends/basic增加InputQrCode文件

import React from 'react';

import Label from '@mdf/metaui-web/lib/components/basic/label';

import QRCode from 'qrcode.react';

import {Input,Popover} from '@mdf/baseui'

 

export default class InputQrcode extends React.Component {

 constructor(props) {

 super(props);

 ......

 this.state = Object.assign({

 visible: !props.bHidden,

 size: props.size || 110,

 value: props.defaultValue

 }, config);

 }

 componentDidMount() {

 if (this.props.model) {

 this.props.model.addListener(this);

 }

 }

 componentWillUnmount() {

 if (this.props.model) {

 this.props.model.removeListener(this);

 }

 }

 

 baseControl(){

 const {value,size} = this.state;

 let content = (<QRCode value={value} size={size}/>)

 if(value) {

 return <Popover placement="right" title={''} content={content} trigger="hover" overlayClassName='input-qrcode-img'>

 <a className='input-qrcode-name'>查看二维码</a>

 </Popover>

 } else {

 return <Input disabled="disabled" placeholder="未生成"/>

 }

 }

 render() {

 const {cShowCaption } = this.props;

 const {size} = this.state;

 let control = (cShowCaption ? <Label control={this.baseControl()} title={<label>{cShowCaption}</label>}/> : this.baseControl());

 let style = this.state.visible ? {} : { display: "none" };

 return (

 <div style={style} className='basic-input-qrcode'>

 {control}

 </div>

 );

 }

}

### [](#22-组件的注册)2.2. 组件的注册

注册方式都相同，参考inputNumber例子

### [](#23-组件使用)2.3. 组件使用

方法一：在UI模板设计器上配置类型为InputQrCode的字段，如下：

方法二：在excel中配置billitem_base的cControlType属性为InputQrCode

### [](#24-运行时效果)2.4. 运行时效果

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qitabiaodanzujiankuozhanshili_image3.a802f147.png)