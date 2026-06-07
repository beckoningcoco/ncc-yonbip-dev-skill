---
title: "单据幂等性保存"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/14-danjumidengxingbaocun"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 单据幂等性保存

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/14-danjumidengxingbaocun | 所属：指南

# [](#单据幂等性保存)单据幂等性保存

## [](#1-名词解释)1. 名词解释

幂等（idempotent、idempotence）是一个数学与计算机学概念，常见于抽象代数中。
在编程中一个幂等操作的特点是其任意多次执行所产生的影响均与一次执行的影响相同。幂等函数，或幂等方法，是指可以使用相同参数重复执行，并能获得相同结果的函数。这些函数不会影响系统状态，也不用担心重复执行会对系统造成改变。例如，"setTrue()"函数就是一个幂等函数,无论多次执行，其结果都是一样的.更复杂的操作幂等保证是利用唯一交易号(流水号)实现。

## [](#2-存在问题)2. 存在问题

作为MDF前端框架的单据保存，基于B/S架构的系统或多或少都有一些网络上的问题，速度快慢连接在网络层是有短板的，那么我们的单据在录制的过程中，遇到了无法避免的传输问题。

从业务场景上来说，如：现在互联网电商的下单服务，同一个用户在短时间内调用某一个下单服务，只能下单成功一次；银行账户之间的转账，A账户给B账户转账，无论系统出现什么问题或故障，也只能转账成功一次；前端页面对相同表单的内容多次向后端发起提交请求，后端只能给出一个相同的结果等都属于幂等的范畴。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/danjumidengxingbaocun_image1.7cce1b9a.png)

试想一下，如果提供的这些服务不是幂等的，客户在下单时由于网络不稳定或是连续点了几次下单按钮，实际客户只下了一单，结果系统里给客户生成了多单，那平台/商家将是无法承受的，如果被"羊毛党"盯上，损失是无可估量的；银行之间的转账，A账户本来实际给B账户只转了一百万，结果B账户收到了几百万，这在业务上是不可接受的。分析这些业务场景，开发者发现，无论是下单服务、转账服务还是表单提交都是一个个业务请求，提供这些业务服务的接口或方法都应该保证无论服务是超时、重试或有故障等异常情况，都要满足业务上的处理结果是正确的。业务上的一次或多次请求，最终的处理结果是一致的，即：在一定时间内，服务的幂等其实就是请求的幂等.

## [](#3-支持场景)3. 支持场景

新增、编辑、推单、生单

## [](#4-使用配置)4. 使用配置

简单使用的话需要Consul配置领域的domainKey下的idempotencySave即可

// 找到自己领域的domainkey添加

{

"features": ["idempotencySave"]

}

## [](#5-高级配置)5. 高级配置

||属性||说明||备注|
||viewmodel.getParams().resubmitCheckKey||幂等值后端传递字段||默认值：resubmitCheckKey可以扩展脚本修改|

## [](#6-代码设计)6. 代码设计

开启特性后，创建幂等字段（resubmitCheckKey）、构造幂等规则（billNo+动作+uuid）、获取当前行为、创建虚拟模型用于数据填充获取，代码如下：

export const idempotencySave = (billNo, viewmodel, cAction, data = {},

result = {}) => {

// 多次保存发起会造成保存幂等问题

if (viewmodel.hasFeature('idempotencySave')) {

const resubmitCheckKey = viewmodel.getParams().resubmitCheckKey ||

'resubmitCheckKey'; // 创建幂等key字段

let resubmitCheckValue; // 创建幂等值

if (cb.utils.isEmptyObject(result)) { // 创建开始

if (viewmodel.getParams().idempotencySave) {

data[resubmitCheckKey] = viewmodel.getParams().idempotencySave;

} else {

resubmitCheckValue = `${billNo}_${cAction}_${uuid()}`;

data[resubmitCheckKey] = resubmitCheckValue;

viewmodel.getParams().idempotencySave = resubmitCheckValue;

}

}

if (cb.utils.isEmptyObject(result)) {

cb.uba?.businessInfo?.(`[idempotencySave] 幂等生成

动作:${cAction},幂等字段:${resubmitCheckKey},幂等值:${viewmodel.getParams().idempotencySave}`);

} else {

viewmodel.getParams().idempotencySave = null;

cb.uba?.businessInfo?.(`[idempotencySave] 幂等生成单据回调

单据ID:${result.id},单据code:${result.code},幂等字段:${resubmitCheckKey},幂等值:${result.resubmitCheckKey}`);

}

}

}

**注入data**

common.idempotencySave(billNo, viewmodel, viewmodel.getParams().action

|| viewmodel.getParams().mode, data); // 幂等值注入

## [](#7-什么时候失效)7. 什么时候失效

当录制完数据后，保存为草稿、保存为模板、自动保存等功能开启使用的时候，幂等值失效