---
title: "资源中心"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/guides/g01-resource-center"
section: "YNF-开发指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 开发指南]
platform_version: "BIP V5"
source_type: ynf-docs
images: 14
---

# 资源中心

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/guides/g01-resource-center | 所属：YNF-开发指南

# [](#资源中心)资源中心

## [](#1概述)1.概述

资源中心主要有两个作用：

- 托管资源
- 描述组件库的组件的属性

### [](#11-托管资源)1.1 托管资源

目前资源中心主要是托管YNF二方包的资源，比如组件库、模版等

![image-20240716172859563](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/image-20240716172859563.9d1d6045.png)

![image-20240716173044190](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/image-20240716173044190.ac271565.png)

### [](#12描述组件库的组件的属性)1.2.描述组件库的组件的属性

如果我们更新了组件的mannifest配置以后，走完流水线部署成功，通过组件包更新以后，点击进入组件包，能看到最新的更新记录

比如我们更新了base库组件的文本框组件的属性，就可以点击文本框组件，看到我们更新后的组件的所有属性

![image-20240716194714581](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/image-20240716194714581.a18323bd.png)

## [](#2创建组件库)2.创建组件库

组件库创建：**流水线**

**流水线**：在前端引擎节点创建流水线，资源中心通过流水线项目编码（前缀必须是：“ynf-”）,创建组件库。

- 适用应用类型：YNF。
- 各个坏境的组件库文件由对应坏境流水线部署。
- 支持多文件上传。
- 支持多语。

资源中心节点位置：业务中台>云平台>低代码开发平台>专业开发服务>开发资源管理>资源中心

**注意**：零代码组件库和低代码组件库都在这个节点下

![image-20240703150256989](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/2-01.9e952825.png)

### [](#21流水线方式创建组件库)2.1.流水线方式创建组件库

#### [](#211创建组件库)2.1.1.创建组件库

流水线在对应坏境部署成功后，在业务中台，打开资源中心节点，组件库->新建 在新建弹窗 编码输入流水线的项目编码(前缀是："ynf-")，选择构建版本后（可自动完善信息），**引擎版本选择6**，适配端根据需求进行选择，点击确定按钮，组件库就建立完成。

**注意：适配端的选择会对应组件包在不同设计器的使用，pc组件包只能在pc设计器使用，移动组件包只能在移动设计器使用**

![image-20240717102318085](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/image-20240717102318085.f27dc0ad.png)

#### [](#212更新组件库)2.1.2.更新组件库

执行对应坏境的流水线成功后，在资源中心点击更新按钮，选择构建版本，可以看到最新执行流水线以后的构建版本，选择这个构建版本即可。
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/2-1-2-01.466fd89e.png)
**注意：如果有增/删/改组件，或修改了组件的manifest配置，需要在资源中心重新选择流水线构建版本，然后发布组件库版本。**

#### [](#213发布组件库)2.1.3.发布组件库

**注意**：**只有组件库发布以后，设计器界面才能看到组件属性修改后的效果**

只有未发布状态和更新状态可发布。

- **未发布**:新建按钮，新建成功后，未发布过的状态。
- **更新**：已发布过版本，点击更新按钮或组件设计按钮后的组件库状态。
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/2-1-3-01.cc4b96a4.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/2-1-3-02.7c8d808b.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/2-1-3-03.c4e701e8.png)

## [](#3在设计器中使用资源中心创建的组件包)3.在设计器中使用资源中心创建的组件包

首先，打开设计器，在组件模块下搜索自己的组件包

![image-20240716171733651](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/image-20240716171733651.7a19c266.png)

找到组件包以后，，可以看到自己扩展的组件，通过拖拽的方式把组件拖到画布区

![image-20240716172122306](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/image-20240716172122306.aa6c1346.png)

## [](#4迁移到其他坏境)4.迁移到其他坏境

迁移指的是将组件库在测试坏境开发完成后，迁移到日常/预发/生产/专属化坏境
**[点击查看迁移文档](https://uap-wiki.yyrd.com/x/thYgCg)**

## [](#常见问题)常见问题

### [](#q1创建的组件库在设计器中未找到)Q1、创建的组件库在设计器中未找到？

设计器加载组件库的默认过滤条件：

- 加载与设计器终端一致的组件。
- 加载与设计器引擎版本一致的组件库

解决方案：

- 检查在资源中心的组件库的终端(pc/移动)是否与打开的设计器一致。如果不一致，请在资源中心修改组件库的终端，并重新发布。
- 检查资源中心的组件库的应用引擎版本是否与设计器的引擎版本一致。如果不一致，请在资源中心修改组件库的应用引擎版本，并重新发布。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/q1-01.889fbe02.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/q1-02.d636e74a.png)

### [](#q2更新组件库时报错ynf二方包流水线中未找到描述文件)Q2、更新组件库时报错：YNF二方包流水线中未找到描述文件

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/q2-01.8f26efbd.png)
解决方案：

- 检查本地是否开启了该组件库的代理，如果开启了，请关闭代理后重新编辑组件库。
- 流水线虽然执行成功了，未生成manifest.json文件。判断方法：在浏览器打开地址描述文件地址：{{host}}/{{ynf-XXX}}/ucf-wh/manifest.json如果404的话，则表示项目构建运行的打包命令未生成描述文件，查看项目代码是否有问题。

 注：{{host}}表示域名；{{ynf-xxx}}表示组件库编码。