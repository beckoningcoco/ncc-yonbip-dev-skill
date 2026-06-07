---
title: "过滤模型 FilterModel"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/02-filter-model"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 过滤模型 FilterModel

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/02-filter-model | 所属：API

# [](#过滤模型-filtermodel)过滤模型 FilterModel

## [](#1-方法)1. 方法

FilterModel 正常情况只有FromModel，当查询条件为区间条件时同时存在FormModel和ToModel。

### [](#11-getfrommodel)1.1. getFromModel()

**说明：** 获取过滤开始的 model 。

- getFromModel 是 filterModel 特有的 API ；
- filterModel 在创建并初始化 data 的时候，会创建一个 data.fromModel 用于存储对应数据模型， fromModel 会根据不同的 `ctrlType` 创建不同的 model 类型。
- 所以，和其他的 model 通过 get() 方法获取 data上的数据不同的是，filterModel 单独提供了 `getFromModel()` 这个方法去取 data.fromModel 。

**入参：**

- 无

**返回值：**

- fromModel：区间开始的模型

**示例：**

const fromModel = model.getFromModel()

### [](#12-gettomodel)1.2. getToModel()

**说明：** 获取过滤结束model，只存在于区间类过滤 如开始-结束日期

**入参：**

- 无

**返回值：**

- toModel：区间结束的模型

**示例：**

const toModel = model.getToModel()

### [](#13-getfromdisplaymodel)1.3. getFromDisplayModel()

**说明：** 获取过滤显示model

**入参：**

- 无

**返回值：**

- fromDisplayModel：过滤显示模型

**示例：**

const fromDisplayModel = model.getFromDisplayModel()

### [](#14-getdirtydata)1.4. getDirtyData()

**说明：** 获取脏数据

**入参：**

- 无

**返回值：**

- dirtyData：脏数据的值

**示例：**

const dirtyData = model.getDirtyData()

### [](#15-getdatadirty)1.5. getData(dirty)

**说明：** 获取数据

**入参：**

- dirty：是否脏数据 Boolean

**返回值：**

- data：数据

**示例：**

// dirty => true 脏数据 dirty => false 全部数据

const data = model.getData(dirty)