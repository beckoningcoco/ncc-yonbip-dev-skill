---
title: "异步处理 Promise"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-promise"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 异步处理 Promise

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-promise | 所属：API

# [](#异步处理-promise)异步处理 Promise

## [](#1-cbpromise)1. cb.promise

通过`new`操作，初始化一个promise对象，保存一些异步函数。

**例如：** `_this.promise = new cb.promise()`

### [](#11-cbpromiseprototyperesolve)1.1. cb.promise.prototype.resolve

返回一个给定的结果解析后的promise对象

**使用方法：**

_this.promise.resolve(value)

### [](#12-cbpromiseprototypereject)1.2. cb.promise.prototype.reject

返回一个给定的拒绝结果的promise对象

**使用方法：**

_this.promise.reject(value)

### [](#13-cbpromiseprototypecomplete)1.3. cb.promise.prototype.complete

当promise对象中还存在一些异步函数的时候，取下第一个执行给定结果的promise方法

**使用方法：**

_this.promise.complete('类型', '值')

### [](#14-cbpromiseprototypethen)1.4. cb.promise.prototype.then

为promise对象增加成功和失败的回调方法

**使用方法：**

_this.promise.then('成功回调方法', '失败回调方法')