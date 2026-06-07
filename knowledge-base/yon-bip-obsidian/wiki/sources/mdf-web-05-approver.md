---
title: "当前审批人 Approver"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-approver"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 当前审批人 Approver

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-approver | 所属：Web组件

# [](#当前审批人-approver)当前审批人 Approver

## [](#1-功能说明)1. 功能说明

在列表中显示当前审批人，仅支持在列表中使用，仅支持在Web端使用

cControlType: Approver，可先添加文本列，然后协议改为Approver

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Approverdangqianshenpirenimage1.58f02ad6.png)

## [](#3-实现逻辑)3. 实现逻辑

列表页表格列组件类型配置成 Approver 即可，不需要额外的处理

meta接口返回示例：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Approverdangqianshenpirenimage2.3e1a62fb.png)

## [](#4-检查)4. 检查

如果配置后不显示当前审批人，请按以下步骤检查：

**1. 检查是否发送请求**

配置组件后，打开列表页会发送 bpm/getAuditors 接口请求

**2. 检查请求参数和返回值**

请求参数：请求参数为列表页数据的id数组，如：["1882492524234277017","1835785244525985802","1764430109567614976","1696898921430777872","1617583494069747722"]

返回值：如果请求参数有id数组，但返回值为空，检查是否有处于审批中的数据，如果有审批中数据还是返回空联系审批流研发排查