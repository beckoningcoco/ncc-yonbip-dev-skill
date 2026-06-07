---
title: "草稿功能"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/15-caogaogongneng"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 4
---

# 草稿功能

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/15-caogaogongneng | 所属：指南

# [](#草稿功能)草稿功能

## [](#基本信息)基本信息

通过配置草稿功能，暂存已填写的信息

## [](#页面展示)页面展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/caogaogongneng_image1.7a0cd323.png)

## [](#查看已保存的草稿)查看已保存的草稿

配置新的展示草稿按钮， 将按钮的类型为''draftbutton''
,即在**bill_toolbaritem**表配置按钮，属性ctype为draftbutton
(如何配置按钮可以找下部门负责人）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/caogaogongneng_image2.9514298d.png)

## [](#配置方法)配置方法

#### [](#1-mdd单据)1. mdd单据

配置新的保存草稿按钮， 将按钮的action起名为savedraft

(如何配置按钮可以找下部门负责人）

||action名称||描述|
||savedraft||暂存按钮的点击动作|

#### [](#2-ypd单据)**2. ypd单据 **

保存为草稿按钮配置: cmdSaveDraft

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/caogaogongneng_image3.c08206e5.png)

草稿展示按钮: 搜索草稿按钮组件

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/caogaogongneng_image4.306350a8.png)

## [](#存储模式)存储模式

目前草稿存储有2种方式即

- 

保存在客户端（浏览器）

- 

保存在服务端

默认是存储到**客户端**，如果想存储到**服务端**需开启特性开关：**saveDraftOnServer（前端统一node服务上配置，找部门前端负责人配置）**

## [](#实时草稿)实时草稿

需开启特性开关：realTimeDraft**（前端统一node服务上配置，找部门前端负责人配置）**

## [](#faq)**FAQ**

**Q:下推单据保存草稿, 存在保存后的草稿丢失问题?**

**A: 需按照下面方式解决：**

传递目标页面的serviceCode，
**配置方式是在该下推按钮的command表的cSvcUrl字段携带下推单据的serviceCode
参数名称为targetServiceCode**

**示例：**采购合同 下推 对公预付单 传递对公预付单的serviceCode：xxxxx

cSvcUrl: /bill/pullVoucher.do?targetBillNo=xxx&domain=xxx&groupCode=xxx&targetServiceCode=xxx

**Q:点击加载草稿详情有哪些扩展事件吗?**

**A: 可以监听以下方法**

**加载前：beforeDraftDetailRender**

**加载后：afterDraftDetailRender**