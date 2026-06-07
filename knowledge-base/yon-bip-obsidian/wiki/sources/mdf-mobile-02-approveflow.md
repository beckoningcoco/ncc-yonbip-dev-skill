---
title: "审批按钮 ApproveFlow"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/02-approveflow"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 审批按钮 ApproveFlow

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/02-approveflow | 所属：移动组件

# [](#审批按钮-approveflow)审批按钮 ApproveFlow

## [](#1-功能说明)1. 功能说明

审批流中按钮平铺到单据上

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ApproveFlowShenpianniu_image1.800151eb.png)

## [](#3-基本属性)3. 基本属性

### [](#31-在单据中)3.1. 在单据中

||属性名称||属性含义||值类型||属性说明|
||value||当前数||number||当前数|
||disabled||可否点击||boolean||true-不可点击 false可点击|
||count||总数||number||上限值|
||allowHalf||是否允许半选||boolean||true-可以 false不可以|
||cStyle||扩展属性||string||所有的扩展属性都配在这个属性中|
||onChange||选择时的回调||function||参数为当前数|
||onHoverChange||鼠标经过时的回调||function||参数为当前数|

cStyle扩展属性

||属性名称||属性含义||值类型||属性说明|
||workFlowNames||按钮自定义名称||object||{agree: '自定义同意按钮名称'}|
|||||||||
|||||||||
|||||||||

### [](#32-按钮位置实现原理)3.2. 按钮位置实现原理

找到cControlType是ApproveFlow的按钮，把该位置替换成审批接口返回的按钮列表。想要控制审批平铺后位置

就控制ApproveFlow按钮的位置

## [](#4-建议)4. 建议

在配置了审批按钮平铺后，建议将原始单据上的撤回按钮去掉。领域自行处理

## [](#5-扩展)5. 扩展

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ApproveFlowShenpianniu_image2.88f64158.png)

如图，同意和退回是审批流返回的按钮，在meta元数据里是没有的。元数据里只有cControlType：ApproveFlow
这个组件

### [](#51-怎么获取到审批流返回的按钮)5.1. 怎么获取到审批流返回的按钮

viewmodel.on('workflowLoaded', (list) => {

	setTimeout(() => {

		// 按钮是数组形式，循环list

		console.log('--list', list)

		list.forEach((item) => {

			// 这个举例agree ，具体可以打印这个list看下按钮的cItemName是什么

			if (item.btn？.cItemName) {

				viewmodel.get(item.btn.cItemName).setVisible(false); // 获取到按钮设置隐藏

			}

		})

	}, 10)

})

### [](#51-怎么同时把审批流按钮也展示处理)5.1. 怎么同时把审批流按钮也展示处理

需要在这个组件的父级toolbar的cStyle里配置hideWorkflowBtn: false; //
默认是隐藏的 

## [](#配置说明)配置说明

审批流按钮需要在toolbar里配一个cControltype='approveflow'类型的按钮。这个按钮会把审批流里的按钮【同意、退回等】带出来放在单据上，
默认情况下审批流本身按钮是隐藏的，可以在toolbar的cStyle里设置hideWorkflowBtn:
false把审批流按钮放出来

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/approveflowshenpianniuzujian_image1.a4160af3.png)

### [](#按钮出现的条件)按钮出现的条件

- 当前登陆人有这个有审批的某些按钮的权限
- 有单据ID 并且单据里有审批流存在的标志 isWfControlled ||
pk_procdefins || procinstId 并且 verifystate 或者verifyState
的值大于0

### [](#审批流按钮怎么获取)审批流按钮怎么获取

viewmodel.get('审批流按钮返回的cItemName')

eg： viewmodel.get('agree').setVisible(false); // 隐藏同意按钮 具体是否是agree需要看返回

### [](#审批流按钮排序不支持)审批流按钮排序（不支持）

### [](#事件)事件

#### [](#beforeworkflowaction)beforeWorkflowAction

// 点击审批按钮前事件

// resolve必须执行

// resolve传入true 代表成功

// resolve传入false 代表失败

// 领域在扩展脚本的init中监听事件

viewmodel.on('beforeWorkflowAction', ({ data, resolve }) => {

 // data: 审批流传入的数据

 // resolve： 自己的异步逻辑执行完成之后成功调用 resolve(true) 失败调用 resolve(false)

 if ('成功') {

 resolve(true)

 } else {

 resolve(false)

 }

 return false; // 这个也必须这么写

});

#### [](#beforeworkflowclose)beforeWorkflowClose

审批后事件

viewmodel.on('beforeWorkflowClose', (data) => {

 if (data.processStatus) {

 // 点击了审批按钮

 }

});