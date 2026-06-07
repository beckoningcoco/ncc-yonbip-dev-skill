---
title: "审批流 Workflow"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-workflow"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 审批流 Workflow

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-workflow | 所属：Web组件

# [](#审批流-workflow)审批流 Workflow

## [](#1-效果展示)1. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Workflowshenpiliuimage1.4d2833fc.png)

cControlType:
'workflow'（lineTab配置个审批的页签，里面配置workflow容器）

说明：组件只在浏览态展示，新增和编辑不展示。

组件依赖数据中一些字断 isWfControlled || pk_procdefins || procinstId
这个判断存在

并且字断 verifystate 值不等于0

## [](#2-基本属性)2. 基本属性

||属性名称||属性含义||值类型||属性说明|

## [](#3-事件)3. 事件

// 审批组件加载时候触发

viewmodel.on('updateWorkflowComponent', () => {

 // 领域逻辑

 return false; 不走审批流渲染

 return true; 正常执行

});

## [](#4-审批组件展示的条件)4. 审批组件展示的条件

const billData = viewmodel.getAllData();

const verifystate = viewmodel?.get('verifystate')?.getValue?.();

if (billData && (billData.isWfControlled || billData.pk_procdefins || billData.procinstId) && verifystate) {

 // 展示审批面板

}

## [](#5-审批组件终审后如何禁止自动轮询进度球)5. 审批组件终审后如何禁止自动轮询进度球

正常框架会在终审同意后的事件里会自动轮询接口动作30次，接口有进度信息后才会启用进度球，如果不想使用，可以通过审核按钮的UI模板里的字段cmdParameter.disableAsyncProcess禁止使用，这个值是JSON字符串。

代码配置如下：

params.cmdParameter= '{"disableAsyncProcess": true }'

## [](#6-相关链接)6. 相关链接

《[审批流事件全部](#/guides/17-shenpiliushijianquanbu)》

《[审批流相关参数说明](#/guides/17-shenpiliuxiangguancanshushuoming)》