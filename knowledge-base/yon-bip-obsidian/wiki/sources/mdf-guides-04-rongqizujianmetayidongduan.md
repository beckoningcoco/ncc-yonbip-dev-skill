---
title: "容器组件 meta(移动端)"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/04-rongqizujianmetayidongduan"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 容器组件 meta(移动端)

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/04-rongqizujianmetayidongduan | 所属：指南

# [](#容器组件-meta移动端)容器组件 meta(移动端)

## [](#1扩展组件导入位置)1、扩展组件导入位置

1.1、meta下的组件类型是容器组件

领域使用容器类型扩展组件，需要把组件放到meta目录下面，如下图：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/rongqizujianmetayidongduan_image1.7ce78942.png)

1.2、在入口文件导出组件

src/client/mobile/components/meta/index.jsx

export * from "./TaskGroup";

export * from "./IsfcTop";

export * from "./CapacityHeader";

1.3、使用组件：**在模板中(UI元数据)把容器类型的cControlType改为扩展容器组件的名字即可**

1.4、启动本地项目，验证扩展组件有没有加载成功，如果没有加载成功按照下面的方式排查：

在浏览器控制台输入下列方法

- 

方式一：cb.extend.Components[domainKey][type][cControlType]

- 

方式二：cb.extend.getComponent(domainKey,type,cControlType)

如果注册成功，会显示该组件的名字，如下图：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/rongqizujianmetayidongduan_image2.914a2d51.png)

**注意：meta下面的组件对应meta接口返回数据的containers这一级的组件，如果扩展组件没有加载成功，除了上面的排查方法之外，还需要排查下meta接口是否返回了该组件**

## [](#2扩展组件示例)2、扩展组件示例

**自定义布局容器组件**

import React from 'react'

import './index.less'

 

class metaDemo extends React.Component {

 constructor(props) {

 super(props)

 // props.meta中配置cStyle属性，比如给组件配置className，cStyle="{"className": "XXX"}" 

 const config = cb.utils.stringToJSON(props.meta.cStyle);

 this.state = Object.assign({

 

 }, config);

 }

 

 componentDidMount() {

 const { viewModel, meta } = this.props;

 // 事件监听:下面的updateViewMeta方法是控制组件的显示与隐藏，具体实现体现在render方法中

 // 触发事件:扩展脚本执行viewModel.execute('updateViewMeta',{code:'xxx', visible: false })，code是meta返回数据中对应容器的“cGroupCode”

 viewModel.on('updateViewMeta', this.updateViewMeta, undefined, true);

 }

 

 componentWillUnmount() {

 // 组件即将卸载时的操作 

 viewModel?.un('updateViewMeta', this.updateViewMeta);

 } 

 

 updateViewMeta = (args) => {

 const { meta } = this.props;

 const { code, visible } = args;

 if (code !== meta.cGroupCode) return;

 this.setState({ visible });

 }

 

 render() { 

 // className是组件cStyle中的扩展属性，在组件初始化的时候解析到state中。

 const { className, visible } = this.state;

 // 控制组件显示与隐藏有两种方式，第一种：当visible是false的时候return null，组件不渲染；第二种：在组件的最外层元素加“hide”的className名字即可，框架已经预制好样式。两种方式的区别是，第二种方式组件的dom会存在。

 // 第一种

 if ( visible == false ) return null;

 // 第二种,类名拼接的时候一定要加空格

 const className = visible == false ? className+" hide" : className

 return (

 <div className={className}>

 这是一个容器组件

 </div>

 )

 }

} 

export default metaDemo

**使用框架解析引擎容器组件**

import React from 'react'

import './index.less'

 

class metaDemo extends React.Component {

 constructor(props) {

 super(props)

 // props.meta中配置cStyle属性，比如给组件配置className，cStyle="{"className": "XXX"}" 

 const config = cb.utils.stringToJSON(props.meta.cStyle);

 this.state = Object.assign({

 

 }, config);

 }

 

 componentDidMount() {

 

 }

 

 componentWillUnmount() {

 

 } 

 render() { 

 const {meta,viewModel} = this.props;

 // 参数说明: meta: 当前组件的meta数据 viewModel:单据模型 这两个属性必传

 // width, height, index, hasTree, handleClick, parents, extraProps: 根据需要传递，如果不需要这些参数，直接调用cb.components.engine.parseContainer(meta, viewModel)即可。

 const container = cb.components.engine.parseContainer(meta, viewModel, width, height, index, hasTree, handleClick, parents, { ...extraProps }); 

 return (

 <div className='xxx'>

 {container}

 </div>

 ) 

 }

} 

export default metaDemo

## [](#3扩展脚本调用扩展组件事件示例)3、扩展脚本调用扩展组件事件示例

**注册事件**

viewmodel.on('eventName',function(){ // eventName方法名为领域自定义，需要扩展脚本和扩展组件保持一致

 //具体业务逻辑

})

**卸载事件**

viewmodel.un('eventName') //如在扩展组件中注册事件，在组件卸载时需要卸载事件

在合适的时机执行事件

**执行事件**

viewmodel.execute('eventName',args) // eventName方法名为领域自定义，需要扩展脚本和扩展组件保持一致

实际使用场景示例：

**扩展脚本**

cb.define(process.env.__DOMAINKEY__,function (common) {

 var xxx_VM_Extend = {

 doAction: function (name, viewmodel) {

 if (this[name])

 this[name](viewmodel);

 },

 init: function (viewmodel) {

 ...

 viewmodel.get('buttonName')?.on('click', function(args){ // buttonName是ui元数据的cItemName

 viewmodel.execute('eventName',args);

 })

 ...

 }

 try {

 module.exports = xxx_VM_Extend;

 } catch (error) {

 

 }

 return xxx_VM_Extend;

});

**扩展组件**

import React, { Component } from 'react';

import lessModule from './CardDetail.less';

process.env.__CLIENT__ && lessModule

 

export default class TaskGroup extends Component {

 constructor(props) {

 super(props);

 const { cStyle } = props.meta;

 let config = {};

 if (cStyle) {

 config = cb.utils.parseCStyle(cStyle)

 }

 this.state = Object.assign({

 

 }, config);

 }

 

 renderContainer = (viewModel, meta) => {

 const containerArr = [];

 meta.containers?.forEach(item => {

 containerArr.push(cb.components.engine.parseContainer(item, viewModel));

 });

 return containerArr;

 }

 

 render() {

 const { viewModel, meta } = this.props;

 return (

 <div className=' TaskGroup'>

 {this.renderContainer(viewModel, meta)}

 </div>

 );

 }

}

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/rongqizujianmetayidongduan_image3.e1accf09.png)