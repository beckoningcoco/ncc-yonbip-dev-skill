---
title: "加载中 Loading"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-loading"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 加载中 Loading

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-loading | 所属：API

# [](#加载中-loading)加载中 Loading

## [](#1-场景说明)1. 场景说明

仅适用于Web端，只针对在工作台中打开的去iframe的节点。节点是 iframe 形式打开，或者不是集成在工作台中以页签形式打开的可以忽略。每一个服务打开，加载数据时都会伴随 loading 效果的出现。原来在工作台中打开多个页签是共用同一个 loading，会造成有服务正在加载数据时其他无需加载数据的节点也不能进行任何操作。所以改为了一个页签一个 loading，服务间互不干扰。故如若拓展脚本调用了自动加载 loading 的方法（如调用 .start(), .end() 方法，调用 MDF 加载数据的方法等...），需要做些修改。该修改可以随时上线，无需同步 MDF 上线节奏。对于 web 和 mobile 共用一套拓展脚本的也可以修改，不会影响移动端。

## [](#2-使用方法)2. 使用方法

### [](#21-cbutilsloadingcontrol)2.1. cb.utils.loadingControl

/*

 * 需要在调用时传一个 diworkCode 参数, 值为当前节点的 diworkCode (即节点页签dom的唯一id), 可以通过 viewModel.getParams().diworkCode 获取

 * 调用 start 和 end 传的 diworkCode 需要相同，并且调用次数需要相同

 * 不传除了不会出现 '加载中...' 的 loading 效果, 不会有任何其它影响

 */

const diworkCode = viewModel.getParams().diworkCode

 

cb.utils.loadingControl.start({ diworkCode })

cb.utils.loadingControl.end({ diworkCode })

### [](#22-cbrestdynamicproxycreate)2.2. cb.rest.DynamicProxy.create

/*

 * 只需在 options 中多加一个 diworkCode 参数, 值为当前节点的 diworkCode(即节点页签dom的唯一id), 可以通过 viewModel.getParams().diworkCode 获取

 * 不传除了不会出现 '加载中...' 的 loading 效果, 不会有任何其它影响

 * 上面两种方法传参方式相同

 */

const diworkCode = viewModel.getParams().diworkCode

 

cb.rest.DynamicProxy.create({

 proxyName: {

 url: 'aaa',

 method: 'GET',

 options: { token: true, diworkCode },

 },

})

## [](#3-显示问题)3. 显示问题

loading 显示从无到有会有约 1.5s 的过渡时间，只针对界面展示。不影响操作。请求时间在 1.5s 内就不会看到有加载中的效果。

## [](#4-问题排查方法)4. 问题排查方法

- 控制台输入 **cb.utils.panelLoading** 可查看当前状态下所有节点的 loading 调用堆栈以及 loading 状态。
- 如遇到某个节点 loading 不消失情况，可先自行排查 **cb.utils.panelLoading[diworkCode]** 下的数据 **startLoadingStack 和 endLoadingStack**，查看调用对应情况，理论上需要一一对应。