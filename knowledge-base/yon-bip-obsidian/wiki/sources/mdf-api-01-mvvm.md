---
title: "基于MVVM的设计"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/01-mvvm"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 基于MVVM的设计

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/01-mvvm | 所属：API

# [](#基于mvvm的设计)基于MVVM的设计

## [](#1-viewmodel-在-mvvm-架构中的重要性)1. ViewModel 在 MVVM 架构中的重要性

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MVVMzhengtishejiimage1.79f590da.png)

以上图片中，大体的介绍了 MVVM 中各个分层关系以及通讯方式。

对应到 MDF 前端框架的具体实现上：

- View 层为基于 React 的组件化实现，其中配合 Redux 应用状态管理框架实现了应用级的状态数据管理；
- 根据（1）的描述，Model 层对应为基于 Redux 提供的 Store 数据中心，store 中的数据来自 Node 层提供的 viewApplication 与 viewModel 等相关元数据，通过 props 数据流动接入到 UI 组件中。
- MDF 前端框架中的 ViewModel 概念与上述 MVVM 架构图中的分层一致，但在实现上为框架自研方案，未采用 Mobx、Vuex 等社区解决方案。

## [](#2-mdf-中viewmodel-的访问方式)2. MDF 中 ViewModel 的访问方式

MDF 中的 ViewModel  分为两种：

- 第一类：通过 cb.models.register 注册，挂载到 cb.models 命名空间下，通过 cb.models.xx 访问）；
- 第二类：通过 cb.viewmodels.register 注册，挂载到 cb.viewmodels 命名空间下，通过 cb.viewmodels.xx 访问）；

## [](#3-不同层级的-viewmodel)3. 不同层级的 ViewModel 

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MVVMzhengtishejiimage2.4df81ccd.png)

## [](#4-常见用法)4. 常见用法

var viewmodel = new cb.models.ReportModel({});

 

viewmodel.addProperty('instructions', new cb.models.SimpleModel());

viewmodel.get("instructions").setReadOnly(true);

 

viewmodel.on('afterLoadData', function(data) {

 var instructions = '支付宝支付设置指南：在进行支付宝参数设置前，请先确保有支付宝支付能力。详情可登录支付宝官方网站，查看各支付场景的接入指南。';

 viewmodel.get("instructions").setValue(instructions);

 viewmodel.get("instructions").setReadOnly(true);

});

## [](#5-一切皆modelmodel-嵌套)5. 一切皆Model：Model 嵌套

// viewmodel 是个大 model，不同的key上还存着小 model，层层嵌套

var detailModel = viewmodel.get("adjustPriceDetail");

var storeModel = viewmodel.get("adjustPriceStore");

var regionModel = viewmodel.get("adjustPriceRegion");

var memberlevelModel = viewmodel.get("adjustPriceMemberlevel");

 

viewmodel.on("beforeAddRow", function(condition) {

 // todo

}

 

detailModel.on('beforeBrowse', function (data) {

 // todo

}

说嵌套其实也比较简单，看下面这段代码就清楚了。

cb.viewmodels.register('ReferViewModel', function (modelType) {

 var model = function (data) {

 cb.models.ContainerModel.call(this, data);

 this.init();

 };

 model.prototype = cb.utils.getPrototype(cb.models.ContainerModel.prototype);

 model.prototype.modelType = modelType;

 

 model.prototype.init = function () {

 // ... 其他代码不重要，看这里 ... //

 var fields = {

 referInput: new cb.models.SimpleModel(),

 tree: new cb.models.TreeModel({ keyField: 'code', titleField: 'name', multiple: this.getParams().multiple }),

 };

 

 this.setData(fields);

 // ... 其他代码不重要，看这里 ... //

 }

}

## [](#6-viewmodel-与组件的关联)6. ViewModel 与组件的关联

export default class CascaderControl extends React.Component {

 constructor(props) {

 super(props);

 }

 componentDidMount() {

 if (this.props.model)

 this.props.model.addListener(this);

 }

 componentDidUpdate() {

 if (this.props.model)

 this.props.model.addListener(this);

 }

 componentWillUnmount() {

 if (this.props.model)

 this.props.model.removeListener(this);

 }

 // 监听外部props的变化, 如果变化了需要更新组件的state

 componentWillReceiveProps(nextProps) {

 if (nextProps.model) {

 if (!this.props.model) {

 nextProps.model.addListener(this);

 }

 } else {

 if (this.props.model) {

 this.props.model.removeListener(this);

 }

 }

 }

 

 handleBodyClick = (e) => {

 this.props.model.execute('blur');

 }

 render(){

 

 }

}