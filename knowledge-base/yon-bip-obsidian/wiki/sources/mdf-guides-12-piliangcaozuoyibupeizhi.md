---
title: "批量操作异步配置"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/12-piliangcaozuoyibupeizhi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 批量操作异步配置

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/12-piliangcaozuoyibupeizhi | 所属：指南

# [](#批量操作异步配置)批量操作异步配置

## [](#1-批量操作异步配置)1 批量操作异步配置

批量操作由同步改进成异步，需要进行如下配置，以批量check为例：

### [](#11-启用异步)1.1 启用异步

按钮（bill_toolbaritem表）的parameter属性中配置isAsync属性

{"isAsync": true}

bill_toolbaritem主要属性如下：

||属性||值|
||parameter||{"isAsync": true}|

### [](#12-修改请求地址)1.2 修改请求地址

命令（bill_command表）修改action为batchdo、svcurl为/bill/batchDo?action=check

bill_command主要属性如下：

||属性||值|
||action||batchdo|
||svcurl||/bill/batchDo?action=check|
||method||POST|

## [](#2-批量处理在框架中的应用)2 批量处理在框架中的应用

### [](#21-批量操作)2.1 批量操作

判断按钮中的parameter，请求接口动态添加参数如下：

||参数||值|
||externalData||{isAsync: true}|

#### [](#211-批量删除)2.1.1 批量删除

请求接口地址：

||接口地址||执行动作||备注|
||/bill/batchdelete||batchDelete||按钮中的参数|

#### [](#212-批量修改)2.1.2 批量修改

请求接口地址：

||接口地址||执行动作||备注|
||/bill/batchModify||batchModify组件中handleOk方法||按钮参数暂时不可控|

#### [](#213-批量检查)2.1.3 批量检查

### [](#22-导入导出)2.2 导入导出

## [](#3-其它场景通用action)3 其它场景通用Action

针对其它特殊场景框架提供了通用的动作：asyncprocess

可以扩展脚本查询异步处理进度

Action参数：

||参数||类型||说明|
||url||String||异步进度轮询接口地址|
||asyncKey||String||异步Key，后台异步进程的标识，用于查询当前异步进程的进度信息|
||asyncName||String||异步名称，用于显示在反馈结果框中|
||asyncInterval||Integer||异步轮询时间间隔，单位s，如：2 为每2秒查询一次异步进度|
||btnCallBack||Function||轮询结果回调|
||fileSize||String||文件导入导出特有属性，文件大小|
||fileName||String||文件导入导出特有属性，文件名称|