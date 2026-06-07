---
title: "容器组件 meta"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/04-zujianrongqimeta"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 容器组件 meta

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/04-zujianrongqimeta | 所属：指南

# [](#容器组件-meta)容器组件 meta

## [](#1-扩展组件的实现)1. 扩展组件的实现

meta下的组件类型一般是容器组件，如果领域需要使用扩展的容器组件，**需要把组件放到meta目录下面**，并导出组件，如下图：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/rongqizujianqimeta_image1.a42a75e8.png)

## [](#2-扩展组件的使用)2. 扩展组件的使用

在模板中(UI元数据)把容器类型的cControlType改为扩展容器组件的名字即可

通过下面的方法验证扩展组件是否注册成功：

- 

方式一：cb.extend.Components[domainKey][type][cControlType]

- 

方式二：cb.extend.getComponent(domainKey,type,cControlType)

如果注册成功，会显示改组件的名字，如下图：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/rongqizujianqimeta_image2.adddcac3.png)

**注意：meta下面的组件对应meta接口返回数据的containers这一级的组件，如果扩展组件没有加载成功，除了上面的排查方法之外，还需要排查下meta接口是否返回了该组件**

## [](#3-扩展组件示例)3. 扩展组件示例

### [](#31-一般组件样例自定义布局)3.1. 一般组件样例（自定义布局）

import React from 'react'

 

class CharactBatch extends React.Component {

 constructor(props) {

 super(props)

 // props.meta中配置cStyle属性，比如给组件配置className，cStyle="{"className": "XXX"}" 

 const config = cb.utils.stringToJSON(props.meta.cStyle);

 this.state = Object.assign({

 

 }, config);

 }

 

 componentDidMount() {

 const { model, meta } = this.props;

 // 事件监听:下面的updateViewMeta方法是控制组件的显示与隐藏，具体实现体现在render方法中

 // 触发事件:扩展脚本执行viewModel.execute('updateViewMeta',{code:'xxx', visible: false })，code是meta返回数据中对应容器的“cGroupCode”

 this.updateViewMeta = args => {

 const { code, visible } = args;

 if (code != meta.cGroupCode) return;

 this.setState({ visible });

 }

 model.on('updateViewMeta', this.updateViewMeta, undefined, true)

 }

 

 componentWillUnmount() {

 // 组件卸载的时候卸载事件

 this.props.model?.un('updateViewMeta', this.updateViewMeta);

 }

 

 render() {

 // className是组件cStyle中的扩展属性，在组件初始化的时候解析到state中。

 const { className,visible } = this.state;

 // 控制组件显示与隐藏有两种方式，第一种：当visible是false的时候return null，组件不渲染；第二种：在组件的最外层元素加“hide”的className名字即可，框架已经预制好样式。两种方式的区别是，第二种方式组件的dom会存在。

 // 第一种

 if ( visible == false ) return null;

 // 第二种,类名拼接的时候一定要加空格

 const cla = visible == false ? className+" hide" : className

 return (

 <div className={cla}>

 这是一个容器组件

 </div>

 )

 }

}

 

export default CharactBatch

### [](#32-使用框架parsecontainer方法解析controls的样例)3.2. 使用框架parseContainer方法解析controls的样例

当容器组件中配了**controls**，可以通过cb.components.engine.parseContainer方法解析。

import React from 'react'

 

class CharactBatch extends React.Component {

 constructor(props) {

 super(props) 

 this.state = Object.assign{

 

 }

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

 

export default CharactBatch