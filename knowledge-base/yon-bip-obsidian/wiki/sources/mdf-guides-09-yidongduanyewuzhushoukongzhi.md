---
title: "移动端业务助手控制"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/09-yidongduanyewuzhushoukongzhi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 移动端业务助手控制

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/09-yidongduanyewuzhushoukongzhi | 所属：指南

# [](#移动端业务助手控制)移动端业务助手控制

## [](#1-组件配置)1. 组件配置

《[BusinessAssisitant业务助手](#/components-mobile/05-businessassisitant)》

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yidongduanyewuzhushoukongzhi_image1.22d056c8.png)

## [](#2-业务助手中审批流默认交互)2. 业务助手中审批流默认交互

### [](#21-触发控制时机)2.1. 触发控制时机

1、modeChange 时判断是不是要展示审批面板

2、点击业务助手头部是否展示审批面板

3、afterLoadData 时判断是不是默认选中审批面板作为选中tab [故事]
[QDKJ-12933](https://gfjira.yyrd.com/browse/QDKJ-12933?src=confmacro) -
由于意外的错误不能检索数据。

### [](#22-审批流是否展示控制逻辑)2.2. 审批流是否展示控制逻辑

当单据中verifyState || verifystate字段返回大于0
且viewmodel.getParams().mode === 'browse'

具体控制代码：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yidongduanyewuzhushoukongzhi_image2.5e191de1.png)

## [](#3-领域阻止审批流默认展示行为)3. 领域阻止审批流默认展示行为

// 说明： 领域阻止了默认行为，需要领域自己处理审批面板的隐藏逻辑

 

viewmodel.on("beforeBusinessAssistantSetWorkflow", () => {

 return false;

})

## [](#4-业务助手容器整体隐藏事件)4.  业务助手容器整体隐藏事件

领域触发

viewmodel.execute('hideBusinessAssistant', true); // true 展示 false 隐藏