---
title: "移动端变更历史（时间轴形式多版本对比）"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/10-yidongduanbiangenglishishijianzhouduobanbengduibi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 4
---

# 移动端变更历史（时间轴形式多版本对比）

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/10-yidongduanbiangenglishishijianzhouduobanbengduibi | 所属：指南

# [](#移动端变更历史时间轴形式多版本对比)移动端变更历史（时间轴形式多版本对比）

## [](#1-功能描述)1. 功能描述

单据变更支持查看变更历史并切换显示变更单据详情

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yidongduanbiangenglishishijianzhouduobanbengduibi_image1.58451689.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yidongduanbiangenglishishijianzhouduobanbengduibi_image2.b37e8827.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yidongduanbiangenglishishijianzhouduobanbengduibi_image3.33d43277.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yidongduanbiangenglishishijianzhouduobanbengduibi_image4.20ff2b45.png)

## [](#3-配置方式)3. 配置方式

需要在toolbar中配置一个组件，controlType为**ChangeBentchSelector，配置完即可使用该功能**

## [](#4-注意事项)4. 注意事项

如果提示**当前变更记录为空，请编辑数据后重新点击按钮（有一定的延迟，取决于应用支撑部门的日志服务）**

如果编辑多次还是提示变更记录为空，请检查history接口是否传了租户id，如果没有，请在扩展脚本中添加以下代码：

viewmodel.getParams().changeHistoryTenantId = 'XXXX' // 租户id传进来

如果想要初始状态是最新变更版本的对比页面，需要扩展脚本中执行一个action，示例代码如下：

viewmodel.on('afterLoadData', () => {

 viewmodel.biz.do('changehistory', viewmodel, {})

})

此版本变更历史还在完善，有问题及时沟通