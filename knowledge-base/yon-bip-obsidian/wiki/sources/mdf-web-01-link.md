---
title: "链接 Link"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-link"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 链接 Link

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-link | 所属：Web组件

# [](#链接-link)链接 Link

## [](#1-功能说明)1. 功能说明

页面插入超链接

## [](#2-效果展示)2. 效果展示

### [](#21-浏览态)2.1. 浏览态

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Linklianjie-image1.e23d0cf1.png)

### [](#22-编辑态)2.2. 编辑态

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Linklianjie-image2.51170bb1.png)

浏览态：文本以链接形式展现，点击打开新标签跳转到网址。

编辑态：由 '域名'+ '网址'+ '文本'组成。动态更改链接文本和地址。

网址框支持粘贴，域名值会自动适配新网址的域名。

## [](#3-基本属性)3. 基本属性

||属性名称||属性含义||值类型||默认值||属性说明|
||disabled||激活状态||boolean||false||true 不可编辑|
||bCanModify||编辑状态||boolean||true||false 不可编辑|
||visible||可见状态||boolean||true||false 不展示|
||addressHolder||地址占位符||string||网址||-|
||showTextHolder||文本占位符||string||文本||-|
||addressDomain||域名||string||http://||-|
||addressDomainList||域名下拉列表||array||['http://', 'https://']||-|
||value||值||string||||值为json字符串'{linkText:"",linkAddress:""}'|

## [](#4-api)4. API

- 更改网址placeholder

model.setState('addressHolder', '网址默认文本')

- 更改文本placeholder

model.setState('showTextHolder', '文字默认文本')

- 自定义校验提示

// 前端公共组件提供简单的格式校验，校验规则如下：

1、"网址" 输入框正则校验。(可以输入ip地址，不允许输入中文和空格，域名后缀需以 ".com", ".cn", ".com.cn", ".net", ".org", ".edu", ".info", ".gov" 其中之一结尾.)

2、输入了 "文本" 后 "网址" 不允许为空;

3、非必输时 “文本”允许为空，为空时在页面上显示网址链接;

// 若需要拓展处理网址信息和文本信息的检验逻辑，可重写 selfVerfication 方法。

model.setCache('selfVerfication', function (value) => { // value 为当前model的value

 ...

 自定义逻辑

 ...

 

 // 返回值需按如下格式

 return {

 valid: boolean // 必传 true 符合校验， false 不符合校验，会弹出不能为空的 error 弹窗

 unValidMessage：{

 unValidAddress: {

 unValid: true, // true 代表网址部分符合校验，false 不符合校验、输入框变红

 errorMsg: "不能为空" // 自定义提示信息，可改

 },

 unValidText: {

 unValid: true, // true 代表网址部分符合校验，false 不符合校验、输入框变红

 errorMsg: "不能为空" // 自定义提示信息，可改

 }

 }

 }

})

// 注：返回值中valid为必传。

如果 valid 为 true, unValidMessage 可不传。

如果 valid 为 false, unValidMessage 为必传、否则没有校验的提示信息、会导致报错。

unValidMessage 中。key 可传可不传，如若传了 key 、key 值不可改。

- 设默认值

cStyle里配置 linkText: xxx, linkAddress: xxx