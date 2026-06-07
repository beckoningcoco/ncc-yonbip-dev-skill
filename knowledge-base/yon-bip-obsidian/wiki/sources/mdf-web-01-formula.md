---
title: "公式组件 Formula"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-formula"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 公式组件 Formula

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-formula | 所属：Web组件

# [](#公式组件-formula)公式组件 Formula

## [](#1-功能说明)1. 功能说明

提供录入公式的组件，组件引用了yyuap-formula组件
[[https://www.npmjs.com/package/yyuap-formula](https://www.npmjs.com/package/yyuap-formula)]（联系肖小勇[xiaoxyong@yonyou.com](mailto:xiaoxyong@yonyou.com)）。

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Formulagongshizujian-image1.2ab7ad74.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Formulagongshizujian-image2.3fbd5000.jpeg)

## [](#3-扩展属性-cstyle)3. 扩展属性 cStyle

||属性||类型||默认值||含义||备注|
||属性||类型||默认值||含义||备注|
||requestParams||String||null||请求参数||{"userVar": {"isRefresh": true}}|
||leftPannel||String||null||左侧面板||["math", "string", "custom"]|
||rightPannel||String||null||右侧面板||["context", "meta", "userVar", "userConst"]|
||isJSON||Boolean||null||值是否是JSON格式 显示中文 数据库存储code||true/false|

## [](#4-功能列表)4. 功能列表

### [](#41-修改组件中的上下文)4.1. 修改组件中的上下文

（对应公式面板中的属性(单据字段)，
其他比如元数据，自定义变量等通过接口调用）

viewmodel.get('totalPrice').on("afterInitContext", function(data) {

 // data为当前上下文的值

 let addData = [{

 code: 'name',

 name: '姓名',

 paramType: 'String',

 children: [], //此属性只有树节点需要

 disabled: true //此属性只有树节点需要

 }];

 let newdata = data.concat(addData);

 this.doPropertyChange('updateContext', newdata); //此方法可二次修改context值

})

 

//监听组件生命周期componentWillReceiveProps触发事件

viewmodel.get('totalPrice').on("afterReceiveContext", function(data) {

 

})

 

//如果是异步接口获取

viewmodel.getGridModel().getEditRowModel().get('totalPrice').on("beforeBrowse", function(data) {

 var promise = new Promise();

 fun(promise);

 return promise;

})

 

function fun(promise){

 ajax(...).then((res)=>{

 viewmodel.getGridModel().getEditRowModel().get('totalPrice').doPropertyChange('updateContext', res); //此方法可二次修改context值

 promise.resolve()

 })

}

### [](#42-修改接口请求参数)4.2. 修改接口请求参数

//表格中

viewmodel.getGridModel().getEditRowModel().get('totalPrice').on("beforeBrowse", function(data) {

 var name = viewmodel.getGridModel().getEditRowModel().get('name').getValue();

 this.doPropertyChange('updateRequestParams', {func:{domainKey: 'xx'},meta:{domainKey: 'xx'},userVar:{domainKey: 'xx'},userConst:{domainKey: 'xx',name: name}, search: {domainKey: 'xx'}});

})

### [](#43-自定义显示值)4.3. 自定义显示值

（界面显示中文公式）cStyle中需要配置 isJSON=true

const fun = function({name,code,parentCode,parentName}){

 return {flag: true, display: (parentName ? '[' + parentName + ']' + '<->[' + name + ']' : name)}

}

viewmodel.get('totalPrice').on("afterInitContext", function(data) {

 viewmodel.get('formulaxxx').doPropertyChange('updateCustomShowFn', fun);

})

### [](#44-自定义extend)4.4. 自定义extend

公式右侧自定义扩展面板

const com = cb.extend.Components[domainKey].basic.com; // 自定扩展组件

 

viewmodel.get('formulaxxx').doPropertyChange('updateExtend', {title:'t',component: com})

### [](#45-yyuap-formula)4.5. yyuap-formula

yyuap-formula其他属性扩展，参考[https://www.npmjs.com/package/yyuap-formula](https://www.npmjs.com/package/yyuap-formula)

viewmodel.get('formulaxxx').doPropertyChange('updateExtendProps','{

 paramList: {},

 ...

}')

### [](#46-弹窗点击关闭)4.6. 弹窗点击关闭

公式弹窗点击关闭回调，获取公式相关code和name

viewmodel.get('formulaxxx').on('afterHandleOk', function (args) {

 // args.formulaExpression 公式code

 // args.formulaExpressionDisplay 公式name

 // args.formulaList 公式拆分

 // args.value 公式组件的值

})

### [](#47-开启业务对象)4.7. 开启业务对象

领域级：打开特性开关 formulaUseBusiness
单据级: cStyle配置 extendProps: {useBusiness: true}

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Formulagongshizujian-image3.1fb8618a.png)