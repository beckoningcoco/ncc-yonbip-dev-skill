---
title: "--查询区交互升级"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-chaxunqujiaohushengji"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 10
---

# --查询区交互升级

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-chaxunqujiaohushengji | 所属：Web组件

# [](#查询区交互升级)查询区交互升级

# [](#1-新增功能-简版普通版查询区切换)1. 新增功能 简版/普通版查询区切换

简版模糊搜索本质上是一个controlType为searchbox的查询条件，需要进行配置方可使用。

## [](#11-效果图)1.1. 效果图

简版：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ChaXunQuJiaoHuShengJiimage1.d39a4ee0.png)

普通版：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ChaXunQuJiaoHuShengJiimage2.21aa7f98.png)

## [](#12-配置方式)1.2. 配置方式

开启这个功能有几个必要条件：

- 首先需要在getInitFilterInfo接口返回的数据中第0个对象中返回字段cExtProps

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ChaXunQuJiaoHuShengJiimage3.0f3d4f13.png)

cExtProps的值为："{"simpleFltSwitch":
true}"，true代表开启切换功能，false代表关闭。

- 需要预制一个ctrlType为"searchbox"的查询条件，然后**此查询条件的dataSource字段必须配置，且值为要查询的字段名称。**

# [](#2-方案弹窗交互升级)2. 方案弹窗交互升级

现有的查询方案整理信息量过大，比较乱，有些不常用的功能或标签需要隐藏，而且目前的查询区，想要通过调整公式进行搜索，必须先进"设置"，保存方案，再查询，不能直接进行公式搜索，不是很符合用户心智模型。

为了简化交互，更加符合用户的心智模型，进行了交互升级。

## [](#21-方案浮层)2.1. 方案浮层

取消移动方案，自定义过滤条件功能，移动到方案弹窗内展示。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ChaXunQuJiaoHuShengJiimage4.b73bef8b.png)

## [](#22-方案弹窗)2.2. 方案弹窗

入口有两个地方，一个是方案浮层的设置按钮，一个是高级按钮，设置按钮进入弹窗后会定位到左侧tabs的候选条件，点击左侧条件可以直接添加条件。不同于以往的批量勾选条件，升级后点击条件即时添加，**并且不会清空之前条件内设定的查询值。**

**自定义过滤条件移动到侯选条件中，有权限的用户可以直接新增自定义过滤条件，新增后实时更新在侯选条件中。**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ChaXunQuJiaoHuShengJiimage5.85d5c492.png)

条件位置和自动搜索功能集成在条件后的设置齿轮按钮内，可以通过此弹窗进行搜索方式和布局位置切换。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ChaXunQuJiaoHuShengJiimage6.0d1c9758.png)

从高级点击进入的弹窗如下：

移动方案和web方案通过下拉切换，和升级前杂糅的效果不同，新交互更加简洁明朗。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ChaXunQuJiaoHuShengJiimage7.c2c14b45.png)

## [](#23-新增方案)2.3. 新增方案

新增方案移动到查询方案中，点击新增方案会聚焦于侯选条件tab中，而且弹窗标题更新为新增方案。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ChaXunQuJiaoHuShengJiimage8.62bdd006.png)

## [](#24-临时查询)2.4. 临时查询

在方案弹窗内的条件中输入查询值后，即时不保存方案，点击右下角查询按钮也可以进行临时查询(有方案设置权限的用户可以使用)。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ChaXunQuJiaoHuShengJiimage9.d94e29ef.png)

## [](#25-方案名称设置)2.5. 方案名称设置

所有的方案名称设置都是在点击保存、保存方案、另存为新方案后进行二次弹窗确认，这里以保存方案为例：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ChaXunQuJiaoHuShengJiimage10.4b67f99c.png)