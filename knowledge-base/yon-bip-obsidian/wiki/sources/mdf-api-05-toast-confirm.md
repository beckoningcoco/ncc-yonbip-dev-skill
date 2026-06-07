---
title: "提示 Toast Confirm"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-toast-confirm"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 8
---

# 提示 Toast Confirm

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-toast-confirm | 所属：API

# [](#提示-toast-confirm)提示 Toast Confirm

## [](#1-轻提示-toast)1. 轻提示 Toast

**示例**

cb.utils.alert('选择数量超过上传限制，请重新上传！', 'fail');

**参数说明**

- args0：提示文本
- args1：提示类型，success 或 error-失败；warning 或 info-警告

cb.utils.alert({

 title: '我是标题', // 弹窗文本内容

 type: 'info', // 默认’info‘。可选 'error', 'success', 'warning', 'info', 'noIcon'

 duration: 3, // 自动关闭的延时，单位秒

 mask: true, // 是否显示透明蒙层，防止触摸穿透。false时不阻塞页面操作

 onClose: () => {} // 关闭后回调

})

## [](#2-询问提示-confirm)2. 询问提示 Confirm

### [](#21-默认)2.1. 默认

**示例**

cb.utils.confirm('确定删除吗?', () => {

 console.log('确定回调');

}, () => {

 console.log('取消回调');

})

**参数说明**

- args0：提示文本
- args1：确定回调函数
- args2：取消回调函数

### [](#22-自定义按钮)2.2. 自定义按钮

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/tishiToastConfirm1.58001cb1.png)

**示例**

cb.utils.confirm({

 title: '确定下载吗',

 content: ‘下载内容’,

 iconType: 'info',

 actions:[{

 text: '上传并下载',

 type:'primary',

 onPress: () => { }

 },{

 text: '直接下载',

 onPress: () => { }

 },{

 text: '取消',

 onPress: () => { }

 }]

})

**参数说明**

- args0：提示文本
- args1：按钮数组，text-按钮文本；onPress-按钮事件

cb.utils.confirm({

 title: '弹窗标题', // String 或 React.Element

 message: '弹窗内容', // String 或 React.Element

 iconType: '', // 提示框的图标类型，默认为confirm，可支持 success、error、info

 actions: [], // 按钮组,移动端使用 {text(显示名称), onPress(点击回调), style(样式), type(按钮风格)}, 值为数组。不传该参数显示默认的确定取消。传 [] 则不显示操作按钮

 footer: []， // 数组 与actions功能相同 PC端使用

 okFunc: () => {

 console.log('确定回调')

 },

 cancelFunc: () => {

 console.log('取消回调')

 },

})

## [](#3-web端alert场景)3. Web端alert场景

### [](#31-简单弹窗)3.1. 简单弹窗

#### [](#311-异常报错新规范)3.1.1. 异常报错（新规范）

如果是前端扩展脚本调用参数中有displayCode和level，会按新的规范弹窗弹出错误框；如果是后端调用，接口返回displayCode和level也是一样的

cb.utils.alert({ // 推荐使用

 code: xxx,

 message: '因参数不合法导致查询失败,请检查参数查询条件是否填写完整因导',//异常摘要

 displayCode:"120-230-100006", //状态码

 detailMsg: 'dddddddddddddddddddddddddddddddddddd', // 异常详情

 showDetail: true, // 是否展示错误详情 detailMsg

 level:0, // 异常级别，0错误(默认) 1警告 2询问

 traceId:"sd00034129",// 链路ID

 uploadable:0 //是否可上报，0否(默认)，1是

})

cb.utils.alert({

 displayCode:"120-230-100006",

 ajaxResult: {

 code: xxx,

 message: '因参数不合法导致查询失败,请检查参数查询条件是否填写完整因导',//异常摘要

 displayCode:"120-230-100006", //状态码

 detailMsg: 'dddddddddddddddddddddddddddddddddddd', // 异常详情

 level:0, // 异常级别，0错误(默认) 1警告 2询问

 traceId:"sd00034129",// 链路ID

 uploadable:0 //是否可上报，0否(默认)，1是

 }

})

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/tishiToastConfirm2.073c656a.png)

#### [](#312-服务端错误异常点击错误详情进入详情弹窗)3.1.2. 服务端错误异常（点击错误详情进入详情弹窗）

如果是扩展脚本调用，参数如下；如果是后端返回，增加errorDetail属性，格式如下：

cb.utils.alert({

 code: 999,

 message: '因参数不合法导致查询失败,请检查参数查询条件是否填写完整因导',

 errorDetail: {traceId:"4be612702f01f9c1",timestamp:"2021-06-18 15:19:59",userId:"9ea99994-b8f2-4674-9922-785b1ef9d48d",tenantId:"ev3qqwud",eMessage:"获取期间异常"},

 type: 'error'

})

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/tishiToastConfirm3.4abe2550.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/tishiToastConfirm4.c93f022d.png)

#### [](#313-普通简单弹窗)3.1.3. 普通简单弹窗

cb.utils.alert({

 title: '因参数不合法导致查询失败,请检查参数查询条件是否填写完整因导因参数不合法导致查询失败,请检查参数查询条件是否填写完整因导因参数不合法导致查询失败,请检查参数查询条件是否填写完整因导',

 type: 'error',

 duration: 3, // 自动关闭的延时，单位秒

})

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/tishiToastConfirm5.22b6e438.png)

#### [](#314-展开收起的简单弹窗---收起到2行高度)3.1.4. 展开收起的简单弹窗 - 收起到2行高度

cb.utils.alert({

 content: '因参数不合法导致查询失败,请检查参数查询条件是否填写完整因导因参数不合法导致查询失败,请检查参数查询条件是否填写完整因导因参数不合法导致查询失败,请检查参数查询条件是否填写完整因导',

 expand: true,

 type: 'error',

 duration: 3, // 自动关闭的延时，单位秒

})

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/tishiToastConfirm6.463722a8.png)

### [](#32-复杂弹窗-保存校验错误提示点击左侧面板进去右侧小弹窗)3.2. 复杂弹窗-保存校验错误提示（点击左侧面板进去右侧小弹窗）

cb.utils.alert({

 type: 'error',

 content: errArray,

 size: 'lg',

 complexType: true,

 containerObj: {},

 viewmodel

});

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/tishiToastConfirm7.21eeb561.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/tishiToastConfirm8.cad8bde0.png)