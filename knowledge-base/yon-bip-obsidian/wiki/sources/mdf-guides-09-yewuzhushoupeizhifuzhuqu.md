---
title: "业务助手配置（辅助区）"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/09-yewuzhushoupeizhifuzhuqu"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 6
---

# 业务助手配置（辅助区）

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/09-yewuzhushoupeizhifuzhuqu | 所属：指南

# [](#业务助手配置辅助区)业务助手配置（辅助区）

## [](#1-效果图)1. 效果图

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yewuzhushoupeizhifuzhuqu_image1.bcf8f393.png)

## [](#2-配置说明)2. 配置说明

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yewuzhushoupeizhifuzhuqu_image2.dee56232.png)

### [](#21-配置业务助手)2.1. 配置业务助手 

**1、配置一个splitcontainer容器，左右布局，左侧为原单据内容，右侧配置一个类型为Intelligentarea的容器,
业主助手页签配置一个billassisitant容器**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yewuzhushoupeizhifuzhuqu_image3.697bba6a.png)

**2、业务助手页签内部组件可以是任意在MDF中注册的容器组件，结构参考如下：**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yewuzhushoupeizhifuzhuqu_image4.5a9288c7.png)

### [](#22-配置审批组件)2.2. **配置审批组件**

**审批页签配置文档：[Workflow审批流](#/components-web/05-workflow)，参考结构如下：**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yewuzhushoupeizhifuzhuqu_image5.6737cbdb.png)

### [](#23-配置协作组件)2.3. 配置协作组件

**协作页签配置文档：[Cooperation协作](#/components-web/05-cooperation)，参考结构如下：**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yewuzhushoupeizhifuzhuqu_image6.e8f21c82.png)

### [](#24-属性说明)2.4. **属性说明**

SplitContainer容器cStyle参数

||参数||说明||类型||是否必填||默认值||配置值|
||splitDirection||助手显示位置，建议显示到右侧||string||是||'left'||'right'|
||rightDefaultWidth||助手默认宽度||number||否||300|||
||defaultShowRight||单据初始化是否显示助手||bool||否||true|||

## [](#3-逻辑控制)3. 逻辑控制

- **如果想在扩展脚本隐藏智能辅助区域，可以在页面渲染完后执行viewModel.execute('updateViewMeta',
{splitSwitch: true});**
- **billassisitant容器内支持配置领域自定义组件。**
- **如果想隐藏整个智能辅助区域且不无法手动展开，在Intelligentarea组件的cStyle配置visible为false即可**
- **如果想切换业务助手里面的页签，可以参考LineTabs文档[LineTabs配置及使用说明](#/components-web/04-linetabs)第一条，此处仅展示常见的三种组件。**
- **如果想把辅助区域完全隐藏，可以在页面渲染完后执行viewModel.execute('updateViewMeta',
{hideSplitContainer: true});**