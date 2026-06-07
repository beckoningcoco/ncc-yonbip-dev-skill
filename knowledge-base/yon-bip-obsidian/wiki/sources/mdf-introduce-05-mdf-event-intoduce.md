---
title: "前端框架事件机制"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/05-mdf-event-intoduce"
section: "介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 介绍]
platform_version: "BIP V5"
source_type: mdf-docs
images: 4
---

# 前端框架事件机制

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/05-mdf-event-intoduce | 所属：介绍

# [](#前端框架事件机制)前端框架事件机制

## [](#1-概述)1. 概述

MDF前端框架事件整体采用发布订阅模式 实现了发布者和订阅者的解耦合、易用性高。

事件分为两个维度 cb.events (全局事件 不建议使用) viewmodel层级事件(常用)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qianduankuangjiashijianjizhi_image1.f4205f40.png)

## [](#2-api介绍)2. API介绍

// cb.events

cb.events.on(evenName, callBack) // 注册事件

cb.events.execute(eventName, args) // 触发事件

cb.events.un(eventName) // 卸载事件

cb.events.hasEvent(eventName) // 检查是否有该事件

// viewmodel (模型)

viewmodel.on(evenName, callBack) // 注册事件

viewmodel.execute(eventName, args) // 触发事件

viewmodel.un(eventName) // 卸载事件

viewmodel.hasEvent(eventName) // 检查是否有该事件

## [](#3-使用示例)3. 使用示例

以列表页按单按料后更新页数为例

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qianduankuangjiashijianjizhi_image2.cdb10463.png)

按单按料切换后 更新list dataSource 然后触发view.execute('afterSetDataSource')

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qianduankuangjiashijianjizhi_image3.565eb5d7.png)

页面组件内监听afterSetDataSource 跟新新页数

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qianduankuangjiashijianjizhi_image4.bd4d596d.png)