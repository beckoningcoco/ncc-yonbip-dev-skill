---
title: "动态渲染"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/spec/g04-spec-dynamic-meta"
section: "YNF-协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 协议]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 动态渲染

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/spec/g04-spec-dynamic-meta | 所属：YNF-协议

# [](#动态渲染)动态渲染

本章节主要介绍如何在运行时动态修改协议，通过动态修改Meta协议达到页面的运行时动态渲染

## [](#阅读须知)阅读须知

- 需要熟悉YNF框架渲染原理(即页面由Meta协议渲染)
- 页面整体协议、以及局部(容器、组件)协议
- 熟悉YNF框架的组件

## [](#通用介绍)通用介绍

我们可以通过rootStore.metaView.{alias}获取到该组件的操作对象，从而达到动态修改组件的目的

### [](#rootstoremetaview-是什么)rootStore.metaView 是什么

在ynf的根节点上有一个metaView属性，这个属性是一个key-value对象，获取到这个对象可以动态修改里面的属性，从而达到动态渲染的目的

### [](#metview-对象的key-和-value-是什么)metView 对象的key 和 value 是什么

- key : 里面存放的是当前页面支持动态修改的组件的alias;
- value : 一个支持修改Meta协议的对象( extends MetaItem)。我们可以通过rootStore.metaView.{alias}获取到该组件的操作对象

## [](#支持动态修改组件)支持动态修改组件

||控件类型||模型类型||含义|
||Table||MetaTable|||
||WaterfallList||MetaTable|||
||Form||MetaForm|||
||开发中||...||...|

## [](#类介绍)类介绍

||内部类||描述||示例|
||MetaTable||对列表元数据操作的抽象类||提供了一下操作方法|
||MetaForm||对Form元数据操作的抽象类||提供了一下操作方法|
||MetaType||UI元数据协议||其实就是一个原子协议,大多数为组件协议|

## [](#api-介绍)api 介绍

### [](#metatable-api)MetaTable api

// 设置一个全新的子合集

setChildren(children: Array<MetaType>): void;

// 添加一个子

addChildren(item: MetaType): void;

// 删除一个子

removeChildren(alias: string): number; // 0删除成功 , -1 表示没有找到

// 获取全部子

getChildren(): Array<MetaType>;

// 立即刷新

invalidate(): void;

## [](#示例-table-如何动态修改)示例 Table 如何动态修改

const tableMeta = rootStore.metaView.tableAlias;

// 获取全部子

const children = tableMeta.getChildren();

// todo 去做一些操作，删除一些或者增加一些

const newChildren = children.filter(item => { });

// 设置新的数据

tableMeta.setChildren(newChildren);

// 立即刷新

tableMeta.invalidate();