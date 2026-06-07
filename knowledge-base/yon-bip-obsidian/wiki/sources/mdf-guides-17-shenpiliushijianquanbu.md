---
title: "审批流事件全部"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/17-shenpiliushijianquanbu"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 审批流事件全部

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/17-shenpiliushijianquanbu | 所属：指南

# [](#审批流事件全部)审批流事件全部

## [](#1-pc审批面板审批流按钮-action-workflow)1. PC审批面板（审批流按钮 action: 'workflow'）

### [](#11-beforeworkflow)1.1. beforeWorkflow

打开审批组件前事件

// @params params action传入的参数

// @params data 传给审批组件的参数

viewmodel.on('beforeWorkflow', ({ params, data }) => {

 // 可以在这里修改传给审批组件的值 data.bussinessKey等

 data.rejectToActivity = true // 开启由退回人选择的时候可以通过这个参数设置默认的退回重新提交方式为提交成功之后重新返回本环节

 data.mobileUrl = '移动端真实地址，用于评论发出的消息地址'

})

### [](#12-workflowclose)1.2. workFlowClose

关闭审批组件都会走

// @params callbackData 审批流面板操作返回参数

viewmodel.on('workFlowClose', (callbackData) => {

})

### [](#13-afterworkflowbeforequeryasync)1.3. afterWorkflowBeforeQueryAsync

点击审批面板里下图所示区域操作按钮后事件

审批以后事件

![审批以后事件](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shenpiliushijianquanbu_image1.45cd73fc.png)

viewmodel.on('afterWorkflowBeforeQueryAsync', (data) => { 

 // 处理逻辑 

})

### [](#14-beforeworkflowaction)1.4. beforeWorkflowAction

点击审批按钮前置事件

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shenpiliushijianquanbu_image2.87755671.png)

data参数说明

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shenpiliushijianquanbu_image3.12fb3281.png)

// resolve必须执行

// resolve传入true 代表成功

// resolve传入false 代表失败

// 领域在扩展脚本的init中监听事件

viewmodel.on('beforeWorkflowAction', ({ data, resolve }) => {

 // data: 审批流传入的数据

 // resolve： 自己的异步逻辑执行完成之后成功调用 resolve(true) 失败调用

 resolve(false)

 if ('成功') {

 resolve(true)

 } else {

 resolve(false)

 }

 return false; // 这个也必须这么写

});

## [](#2-移动审批面板审批按钮)2. 移动审批面板（审批按钮）

### [](#21-beforeworkflowshow)2.1. beforeWorkflowShow

审批加载实例前事件

// @parmas params 请求审批流的参数

viewmodel.on('beforeWorkflowShow', function(params) {

 // 可以在这里修改审批流传人参数，比如businessKey等

})

### [](#22-beforeworkflowclose)2.2. beforeWorkflowClose

审批关闭前，包括点了审批点了审批按钮以后

// @parmas params 请求审批流的参数

viewmodel.on('beforeWorkflowClose', function(params) {

 if (params.processStatus) {

 // 点了审批按钮

 } else {

 // 单纯的关闭审批面板

 }

})

### [](#23-beforeworkflowaction)2.3. beforeWorkflowAction

审批流前置事件添加方法，点审批流按钮前事件

// resolve必须执行

// resolve传入true 代表成功

// resolve传入false 代表失败

// 领域在扩展脚本的init中监听事件

viewmodel.on('beforeWorkflowAction', ({ data, resolve }) => {

 // data: 审批流传入的数据

 // resolve： 自己的异步逻辑执行完成之后成功调用 resolve(true) 失败调用

 resolve(false)

 if ('成功') {

 resolve(true)

 } else {

 resolve(false)

 }

 return false; // 这个也必须这么写

});

## [](#3-审批流字断权限移动和pc)3. 审批流字断权限（移动和PC）

### [](#31-beforesetworkflow)3.1. beforeSetWorkflow

审批流字断权限请求前

// @parmas params 请求审批流的参数

viewmodel.on('beforeSetWorkflow', function(params) {

 // 可以在这里修改审批流传人参数，比如businessKey等

 return false; // 如果return false 就不清楚流程字段权限了

})

### [](#32-beforeworkflowcallback)3.2. beforeWorkflowCallback

审批流字断权限请求后，设置前

// @params workflowFields 返回的字断权限 workflowFields == 'workflownoctrl' 所有字断都不可编辑 workflownoctrl == 对象，根据对象里的字断控制

viewmodel.on('beforeWorkflowCallback', function (workflowFields) {

 // 可以在这里修改字断权限

});

### [](#33-afterworkflowcallback)3.3. afterWorkflowCallback

字断权限处理后事件

// @params workflowFields 返回的字断权限 workflowFields == 'workflownoctrl' 所有字断都不可编辑 workflownoctrl == 对象，根据对象里的字断控制

viewmodel.on('afterWorkflowCallback', function(workflowFields) {

});

### [](#34-afterworkflowtask)3.4. afterWorkflowTask

当前是不是有代办消息

// @params hasTodoTask 是否有代办 true 有 false 没有

viewmodel.on('afterWorkflowTask', function({ hasTodoTask }) {

 // hasTodoTask

});