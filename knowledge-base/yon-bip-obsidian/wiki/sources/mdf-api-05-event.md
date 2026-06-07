---
title: "事件管理 Event"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-event"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 事件管理 Event

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-event | 所属：API

# [](#事件管理-event)事件管理 Event

## [](#1-cbevents)1. cb.events

### [](#11-cbeventson)1.1. cb.events.on

注册全局事件

**使用方法：**

cb.events.on('事件名', '回调函数', '上下文')

事件名和回调函数是必传的。同一个事件名可以注册多个回调函数。

### [](#12-cbeventsun)1.2. cb.events.un

卸载全局事件

**使用方法：**

cb.events.un('函数名', '回调函数')

事件名是必传的。对于注册多个回调函数的同一事件名，传第二个参数的时候会在事件回调函数的数组寻找这个回调方法，找到了则删除它。

### [](#13-cbeventshasevent)1.3. cb.events.hasEvent

判断是否注册了某个事件

**使用方法：**

cb.events.hasEvent('事件名')

事件名是必传的，返回是否注册了某个事件的布尔值。

### [](#14-cbeventsexecute)1.4. cb.events.execute

执行某个全局方法

**使用方法：**

cb.events.execute('事件名')

事件名是必传的，将去寻找是否注册该事件，如果有，则找到注册的回调函数数组，依次执行，如果有执行失败的方法，则返回`false`，反之返回`true`。