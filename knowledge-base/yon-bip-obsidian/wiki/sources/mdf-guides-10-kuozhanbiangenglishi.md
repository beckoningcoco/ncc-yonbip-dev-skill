---
title: "扩展实现变更历史"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/10-kuozhanbiangenglishi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 扩展实现变更历史

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/10-kuozhanbiangenglishi | 所属：指南

# [](#扩展实现变更历史)扩展实现变更历史

## [](#1-需求背景)1. 需求背景

部分业务场景可能通过框架的原生action无法满足业务需求，因此框架提供了单独的数据对比方法和渲染方法，只要单据运行时是MDF，由UI元数据渲染的单据，均可以使用此方式进行自行接入变更历史。

## [](#2-核心api)2. 核心API

数据对比方法：

cb.utils.jsonDiffValue(params)

变更数据渲染方法：

viewmodel.setPrevData(data, Option, skipAfterAct)

## [](#3-使用方式)3. 使用方式

变更：

// 首先需要自行获取当前数据和历史数据

// 然后将数据传入第一个api

const newData = cb.utils.jsonDiffValue({

 detail: originData, // 原始数据

 current: prevData, // 当前数据

 vm: viewmodel, // 模型

 postData: { // sourceChildrenId、modifySourceChildrenId这俩框架默认取id，有的领域业务数据变更后，id也会跟着变，对比逻辑会无法区分这条数据是否是新增的还是变更的，所以需要指定一个不会变的key来指定唯一数据。

 modifySourceChildrenId: 'XXX', // 当前数据子表的主键字段（有的领域不是id，是别的比如orgId之类的，这样需要传入这个key来标识唯一数据，否则对比会出问题）

 sourceChildrenId: 'XXX' // 历史数据子表的主键字段，同上

 }

})

 

// 这一步之后会将数据对比完成并返回一个差异数据对象，也就是变更数据，下一步将其渲染即可 其中历史数据表现为 newData中 key为__prev开头的数据

viewmodel.setPrevData(newData)

 

// 隐藏变更，只需要将setPrevData方法第二个参数传入true即可

viewmodel.setPrevData(current, true)

扩展开发要做的就是把数据保证对，如果对比结果和理想中有出入，请仔细检查数据是否key一致。

Demo:

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kuozhanbiangenglishi_image1.7d2cbd04.png)

## [](#4-注意事项)4. 注意事项

### [](#41-如果发现有的组件不渲染历史数据有几个原因)4.1. 如果发现有的组件不渲染历史数据，有几个原因：

- 可能是组件没支持，排查方法为：如果这个组件是主表的字段，且对应的模型中有prevvalue值但是没有渲染变更，则没支持，需要新支持；
- 子表的字段，则需要查看对应表模型中dataSource中__prev +
cItemName组合的字段，如果有值但是没有渲染变更，也是没支持的原因。
- 如果以上字段没值，就是数据出错，请排查数据

### [](#42-重要注意事项)4.2. **重要注意事项**

**变更历史最佳实践是针对浏览态的能力，如果涉及到数据交互一定要保证传给后端的是原始数据备份，因为变更API是会修改原始数据的！！！（重要！！！）**

**变更历史最佳实践是针对浏览态的能力，如果涉及到数据交互一定要保证传给后端的是原始数据备份，因为变更API是会修改原始数据的！！！（重要！！！）**

**变更历史最佳实践是针对浏览态的能力，如果涉及到数据交互一定要保证传给后端的是原始数据备份，因为变更API是会修改原始数据的！！！（重要！！！）**

**变更历史最佳实践是针对浏览态的能力，如果涉及到数据交互一定要保证传给后端的是原始数据备份，因为变更API是会修改原始数据的！！！（重要！！！）**

**变更历史最佳实践是针对浏览态的能力，如果涉及到数据交互一定要保证传给后端的是原始数据备份，因为变更API是会修改原始数据的！！！（重要！！！）**

**例如：currentData是你组装好的当前数据，detailData是你组装好的历史数据，那么当你调用完jsonDiffValue之后，currentData以及返回的newData可能都不是最开始你组装好的currentData，因此最好做一次深拷贝把数据备份出来，在隐藏变更的时候setPrevData(备份数据，
true)即可还原，进一步去做数据交互等操作。**

import _ from 'lodash'

 

const currentData = {XXX}

const originalData = _.cloneDeep(currentData) // 深拷贝 用啥方法深拷贝都行，不会的自行百度

const detailData = {XXX}

 

// 显示变更

const newData = cb.utils.jsonDiffValue({

 detail: detailData, // 原始数据

 current: currentData, // 当前数据

 vm: viewmodel, // 模型

})

 

viewmodel.setPrevData(newData)

 

// 隐藏变更

viewmodel.setPrevData(originalData, true)

 

// 如果隐藏变更后，保存、提交、审批等操作报子表附件必填错误的话，请模仿下面demo将hasFilelist标记先置为false，绕过校验；

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kuozhanbiangenglishi_image2.88431587.png)