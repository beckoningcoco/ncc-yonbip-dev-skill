---
title: "其它API"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-other"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 其它API

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-other | 所属：API

# [](#其它api)其它API

## [](#1-命名空间api)1. 命名空间API

### [](#11-cbnamespace)1.1. cb.namespace

命名空间方法

## [](#2-路由相关apicbroute)2. 路由相关API（cb.route）

### [](#21-cbroute)2.1. cb.route

路由相关方法，可将其他与路由相关的操作挂载到这个对象上去。例如脚手架中提供的redirectLoginPage（跳转到登录页）和pushPage（跳转到某个路由）

## [](#3-工具方法cbutils)3. 工具方法（cb.utils）

### [](#31-cbutilsquerystring)3.1. cb.utils.queryString

通过new运算符，生成一个解析与格式化 URL
的查询字符串后的，带有set，get，del，toStr，has等方法的对象。

cb.utils.queryString = function (url) {}

使用方法：const queryString = new cb.utils.queryString(queryUrl)，后续根据需要可调用queryString的各种方法。

### [](#32-cbutilsextend)3.2. cb.utils.extend

拷贝方法，实现深、浅拷贝。

cb.utils.extend = function () {}

使用方法：通过传入不同的参数，可以实现不同的拷贝，例如一个深拷贝可以这样来实现：

cb.utils.extend(true, row, rowData);

第一个参数传入true，告知方法要进行深拷贝，方法会将rowData中的数据拷贝到row中

说明是一次浅拷贝的布尔值可以不传给方法的第一个参数，这时可以这样写：

cb.utils.extend(row, rowData);

当方法看到第一个参数不是布尔值，将默认使用浅拷贝。

### [](#33-cbutilsbrowser)3.3. cb.utils.browser

判断浏览器环境。

使用方法：直接调用。目前只有对IE的判断，如果是IE浏览器，则返回字符串IE，否则返回null

### [](#34-cbutilsisarray)3.4. cb.utils.isArray

判断一个值是否是数组。

使用方法：传入要判断的值。

const isArray = cb.utils.isArray(arr)

### [](#35-cbutilsisplainobject)3.5. cb.utils.isPlainObject

判断指定的参数是否是一个纯粹的对象

使用方法：传入要判断的值。

const isPlainObject = cb.utils.isPlainObject()

### [](#36-cbutilsgetcookie)3.6. cb.utils.getCookie

获取cookie

使用方法：传入要获取的cookie名字

const token = cb.utils.getCookie('token')

### [](#37-cbutilsgetnewid)3.7. cb.utils.getNewId

获取一个新的id，目前只在setIds这个方法中用到

使用方法：传入新id的前缀

cb.utils.getNewId('rowId')

### [](#38-cbutilsgetnewguid)3.8. cb.utils.getNewGuid

生成一个随机的Guid，形如"09844044-784f-c046-9ab6-56f7d2772726",用在一些key中

使用方法：直接调用即可

const asyncKey = 'asyncImport_' + cb.utils.getNewGuid().replace(/-/g, '');

### [](#39-cbutilsgetnowformatdate)3.9. cb.utils.getNowFormatDate

生成一个当前时间的标准字符串，形如"2020-03-10 13:55:11"

使用方法：直接调用

## [](#4-dom工具cbdom)4. DOM工具（cb.dom）

和页面dom有关的方法

使用方法：传入选定的dom数组

const dom = cb.dom(dom节点)

这个方法创建的对象包含一些方法

dom.hasClass(class)

## [](#5-与工作台相关apijdiwork)5. 与工作台相关API（jDiwork）

工作台相关API是指jDiwork下的所有部分，具体详见对方文档：[https://docs.diwork.com/l/153965449Eb5](https://docs.diwork.com/l/153965449Eb5)

### [](#51-如何打开mdf单据)5.1. 如何打开MDF单据

jDiwork.openService('st_purchaseorderlist', {billtype: 'voucher',

billno: 'st_purchaseorder'}, {code:'st_purchaseorder,data: {action:'add', mode: 'add'}})

## [](#6-操作日志api)6. 操作日志API

### [](#61-记录操作日志)6.1. 记录操作日志

《[日志服务](#/guides/24-qianduanrizhi)》