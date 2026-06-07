---
title: "弹窗 Modal"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-modal"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 弹窗 Modal

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-modal | 所属：API

# [](#弹窗-modal)弹窗 Modal

## [](#1-打开弹窗组件)1. 打开弹窗组件

**示例**

viewModel.communication({

 type: 'modal',

 payload: {

 key: 'ModifyQuantity',

 data: {

 ...

 }

 }

});

ModifyQuantity为在modal/index.jsx文件中导出的组件名

**弹窗位置适配**

增加以下代码：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/tanchuangModal.99acdcc8.png)

getFilterContainer = () => {

 const id = this.viewModel?.getServiceCode?.() || 'yxyweb-support-mount-model';

 const container = document.getElementById(id) || document.body;

 const _div = document.createElement('div')

 container.appendChild(_div);

 return _div

}

**参数说明**

||**属性**||**含义**||**必输**||**类型**||**默认值**|
||type||单据编码||是||''||无|
||payload||领域Key||是||{}||无|
||--key||在modal中注册的组件名||是||''||无|
||--data||传递的数据||否||{}||无|
||--mode||弹出类型||否||''||html-HTML片段；inner-内部元数据，与groupCode对应|
||--groupCode||容器组编码||否||''||与mode配合使用|

## [](#2-打开弹窗页面)2. 打开弹窗页面

### [](#21-弹出单据模板)2.1. 弹出单据模板

方法和通过API打开页面一样，唯一不同的是打开的目标单据中的templateType=modal，也可以在params中传。

参考[[《页面管理-API打开页面》](#/api/05-page)]

- 支持指定弹窗宽度，在billtemplate_base表中配置iWidth属性；当iWidth值大于10时为px单位，如：800（是指800px）；当iWidth值是0-10时为百分比，如：8（是指定宽度占比80%）
- 支持指定弹窗高度，在billtemplate_base表cExtProps属性中配置{"cStyle":{"height":500}}；当height值大于10时为px单位，如：800（是指800px）；当height值是1-10时为百分比，如：8（是指定宽度占比80%）

### [](#22-弹出页面区域)2.2. 弹出页面区域

- 在页面中配置一个cControlType=modal的容器，容器中配置想要显示的组件
- 调用方法弹出容器区域
- 支持指定弹窗宽度和高度，在cGrupCode对应容器的cStyle中配置width和weight属性；当width和weight值大于10时为px单位，如：800（是指800px）；当width和weight值是0-10时为百分比，如：8（是指定宽度占比80%）

viewmodel.communication({

 type: 'modal',

 payload: {

 mode: 'inner',

 groupCode: '容器区域cGroupCode',

 viewModel: viewmodel,

 data: { ... }

 }

})

### [](#23-弹出自定义路由)2.3. 弹出自定义路由

viewmodel.communication({

 type: 'modal',

 payload: {

 type: 'platform',

 url: 'billmaker',

 data: { ... }

 }

})

platform为公共路由，使用方法：在protal/index.jsx注册一个组件即可

### [](#24-弹出app小应用)2.4. 弹出APP小应用

viewmodel.communication({

 type: 'modal', // 弹窗模式

 payload: {

 key: 'billNo_model001', // 唯一标识，自定义弹窗页面编码

 data: {

 type: 'app', // app 指打开小应用

 providerMode: 'react', // 页面框架，默认为react

 onError: (e) => { console.log(e) }, // 错误回调

 onSuccess: (e) => { console.log(e) }, // 成功回调

 width: '90%', // 宽

 height: '90%', // 高

 providerName: 'iuap_apcom_ruleengine_fe', // 小应用服务名，根据需要修改

 providerEntry: 'bootstrap', // 小应用入口名，根据需要修改

 providerHost: 'iuap-apcom-ruleengine/ucf-wh/', // 小应用入口路径，根据需要修改

 routePath: '/relevantRule', // 路由地址，根据需要修改

 routeParam: {serviceCode:"XGXGZ"}, // 路由参数，根据需要修改

 }

 }

})

### [](#25-弹出iframe页面)2.5. 弹出iframe页面

viewmodel.communication({

 type: 'modal',

 payload: {

 key: 'http://www.xxxxx.com',

 data: {

 type: 'iframe',

 width: '90%',

 height: '90%'

 }

 }

})

## [](#3-关闭弹窗)3. 关闭弹窗

### [](#31-关闭modal页面弹窗)3.1. 关闭Modal页面弹窗

**示例**

viewmodel.communication({ type: 'return' })

### [](#32-关闭自定义组件弹窗)3.2. 关闭自定义组件弹窗

**示例**

viewModel.communication({

 type: 'modal',

 payload: {

 key: 'ModifyQuantity'

 }

});

### [](#33-关闭iframe弹窗)3.3. 关闭Iframe弹窗

**示例**

viewModel.communication({

 type: 'modal',

 payload: {

 key: 'http://www.xxxxx.com',

 data: false

 }

})

## [](#4-监听弹窗按钮事件)4. 监听弹窗按钮事件

### [](#41-ui模板配置按钮)4.1. UI模板配置按钮

如果UI模板中配置了弹窗的按钮，则监听按钮对应的action前后置事件

### [](#42-框架默认按钮)4.2. 框架默认按钮

// 确定

viewmodel.on('afterOkClick')

 

// 取消

viewmodel.on('beforeClose')

viewmodel.on('afterClose')