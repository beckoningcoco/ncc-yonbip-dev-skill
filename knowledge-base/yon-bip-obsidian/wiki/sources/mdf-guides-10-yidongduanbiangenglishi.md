---
title: "移动端变更历史"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/10-yidongduanbiangenglishi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 移动端变更历史

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/10-yidongduanbiangenglishi | 所属：指南

# [](#移动端变更历史)移动端变更历史

## [](#1-功能描述)1. 功能描述

展示单据的当前数据和前一次历史数据的对比，通过变更标识表示，同PC端

## [](#2-功能接入)2. 功能接入

接入该功能分两步：

- 配置对应action
- 编写扩展脚本控制显隐

## [](#3-配置方式)3. 配置方式

变更历史显隐功能通过两个按钮（action）来实现，所以思路就是配置两个按钮的action来控制显隐。

规范：

- 显示变更的action叫：**changehistory** 按钮名称为："显示变更";
- 隐藏变更的action叫：**unchangehistorymobile**
按钮名称为："隐藏变更"。

必须配置到移动端的Footer的Toolbar中，具体配置方式可以咨询各自领域前端架构师

## [](#4-扩展脚本编写)4. 扩展脚本编写

扩展脚本主要是为了控制按钮的显隐，因为"显示变更"和"隐藏变更"不可以同时展示，因此需要脚本来控制显隐。

// 假如显示变更按钮的cItemName配成了btnDisplayChanges

// 假如隐藏变更按钮的cItemName配成了btnHideChanges

// 下面的代码block是点击显示变更按钮后隐藏自己，同时展示出隐藏变更按钮

viewmodel.get('btnDisplayChanges').on('click',() => {

 viewmodel.get('btnDisplayChanges').setVisible(false);

 viewmodel.get('btnHideChanges').setVisible(true);

})

// 下面的代码block是点击隐藏变更按钮后隐藏自己，同时展示出显示变更按钮

viewmodel.get('btnHideChanges').on('click',() => {

 viewmodel.get('btnHideChanges').setVisible(false);

 viewmodel.get('btnDisplayChanges').setVisible(true);

})

## [](#5-页面初始化特殊需求)5. 页面初始化特殊需求

有的需求让页面一加载好就显示变更，所以需要扩展脚本多写一步

viewmodel.on('afterLoadData', () => {

 viewmodel.get('btnDisplayChanges')?.fireEvent('click')

})

## [](#6-常见问题)6. 常见问题

如果提示当前变更记录为空，请编辑数据后重新点击按钮（有一定的延迟，取决于应用支撑部门的日志服务）

如果编辑多次还是提示变更记录为空，请检查history接口是否传了租户id，如果没有，请在扩展脚本中添加以下代码：

viewmodel.getParams().changeHistoryTenantId = 'XXXX' // 租户id传进来