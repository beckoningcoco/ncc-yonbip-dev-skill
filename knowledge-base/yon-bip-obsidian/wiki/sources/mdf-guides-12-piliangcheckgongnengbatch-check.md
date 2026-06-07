---
title: "批量check功能（batchCheck）"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/12-piliangcheckgongnengbatch-check"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 批量check功能（batchCheck）

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/12-piliangcheckgongnengbatch-check | 所属：指南

# [](#批量check功能batchcheck)批量check功能（batchCheck）

## [](#基本信息)基本信息

### [](#1背景)1.背景

当check数据达到一定数量时，例如10000条，那么check会发出10000个接口，这显然是不合理的，所以需要根据特性场景下使用批量check来处理性能问题，还要应对check失败后的数据回滚问题

### [](#2目标)2.目标

支持自定义check数量和批次，可以根据业务的具体情况设置合理的check批次和数量。当check失败后的数据可以回滚到上一次填写的值

## [](#名词解释)名词解释

### [](#check)check

当发起一个字段的修改时，调后端接口，根据后端的规则，对其他字段（数据）进行检查，并做出响应更新

### [](#check的分类)check的分类

#### [](#按接口分类)按接口分类

单个check：接口为bill/check

多个check(batchCheck)：接口为/bill/batchDo

开启前端特性开关**batchCheckSupport**后走batchCheck接口

#### [](#按场景分类)按场景分类

主表

触发前端check方法

子表

触发前端cellcheck方法

### [](#check串行xíng)check串行(xíng)

在常规操作中，对表格字段的check通常采用并行方式执行，这意味着当多个字段值被修改时，会同步触发多个check请求。这种方式的主要优势在于效率高，总耗时较短，但由于多个check同时进行，存在数据冲突的风险

为了解决这一问题，引入了check串行机制。在这种模式下，首先收集所有待check的数据，然后依次逐个发起check请求，确保每次只有一个check在运行。这种方法有效避免了数据冲突，保证了数据的一致性和准确性，但其缺点是由于请求不能并行处理，总的check耗时会增加。

综上所述，串行化check策略通过牺牲部分效率来换取数据完整性和事务一致性，适用于对数据准确性要求较高的应用场景。

**开启check串行**条件：开启前端特性开关hasBatchCheck

### [](#batchcheck设置批次数量)batchCheck设置批次数量

当check数据量很大时，或者本身单条的数据量很大时，批量check允许设置单次发送check的条数batchCheckChunkNum

例如：当有100条数据需要check时， 设置batchCheckChunkNum为20，
那么将发送5个batchCheck的接口

**配置方式**：需要在前端统一node的环境变量里设置batchCheckChunkNum

### [](#check数据回退)check数据回退

当修改某个字段后，发起check接口返回错误信息时，
需将该字段修改的数据重置到上一次修改

## [](#check流程图)check流程图

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/piliangcheckgongnengbatchCheck_image1.7e29cd38.png)

## [](#对接计划)对接计划

[https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=230725267](https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=230725267)