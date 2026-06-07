---
title: "数据脱敏领域接入文档"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/14-shujutuominlingyujieruwendang"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 6
---

# 数据脱敏领域接入文档

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/14-shujutuominlingyujieruwendang | 所属：指南

# [](#数据脱敏领域接入文档)数据脱敏领域接入文档

**注意：**

**1. 如点击设置脱敏策略之后未生效，可以清空浏览器缓存后再查看脱敏是否生效**

**2. 如果配置之后依然没有生效或者返回为空值，可以看下vm脱敏开关是否打开，detail接口是否有_m_des为后缀的脱敏字段，**

**若vm上脱敏开关仍为false，可以跟下这个方法，
com.yonyou.mdf.runtime.uimeta.service.ViewModelService#markDesensitizationFields，确定通过billNo拿到了正确的业务对，详情可以咨询mdd严明老师**

## [](#1-当前支持组件类型)1. 当前支持组件类型

### [](#11-支持组件类型)1.1. 支持组件类型

目前已支持pc端以下类型组件

||cControlType||input， mobilelocale|
||cControlType||input， mobilelocale|

移动端暂未支持

### [](#12-场景示例)1.2. 场景示例

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shujutuominlingyujieruwendang_image1.7ed874f0.png)

## [](#2-配置方法)2. 配置方法

### [](#21-后端配置脱敏开关)2.1. 后端配置脱敏开关

详情可参考mdd脱敏接入文档

[MDD框架之【脱敏适配】](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=42393630)

### [](#22-在数据隐私保护节点设置脱敏字段)2.2. 在数据隐私保护节点设置脱敏字段

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shujutuominlingyujieruwendang_image2.76950990.png)

流程：设置数据分级-->设置数据分类-->设置隐私策略-->编辑数据隐私保护

#### [](#221-设置数据分级针对数据设置不同的级别)2.2.1. 设置数据分级，针对数据设置不同的级别

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shujutuominlingyujieruwendang_image3.f2f9f795.png)

#### [](#222-设置数据分类针对不同的数据设置范围)2.2.2. 设置数据分类，针对不同的数据设置范围

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shujutuominlingyujieruwendang_image4.054eac79.png)

#### [](#223-设置隐私策略针对不同字段设置不同的隐私策略可以选择脱敏类型比如掩码截取hash以及选择不同的脱敏算法)2.2.3. 设置隐私策略，针对不同字段设置不同的隐私策略。可以选择脱敏类型，比如掩码、截取、hash，以及选择不同的脱敏算法

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shujutuominlingyujieruwendang_image5.8471d4bd.png)

#### [](#224-设置数据隐私保护)2.2.4. 设置数据隐私保护

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shujutuominlingyujieruwendang_image6.06b9b943.png)

首先选择需要做脱敏处理的业务对象，点击"添加实体属性字段"，选择需要做脱敏处理的字段，分别设置分级，设置分类，设置隐私策略。

设置隐私策略时，需要选择场景，比如页面显示、数据导出、打印显示，然后选择相应策略。

#### [](#225-数据隐私保护以及数据隐私策略节点使用手册请参考如下文档)2.2.5. 数据隐私保护以及数据隐私策略节点使用手册请参考如下文档

[https://docs.yonyoucloud.com/l/C259eD3050fE?locale=zh_CN](https://docs.yonyoucloud.com/l/C259eD3050fE?locale=zh_CN)

以上操作如有疑问请联系汪晋，范传军咨询详情