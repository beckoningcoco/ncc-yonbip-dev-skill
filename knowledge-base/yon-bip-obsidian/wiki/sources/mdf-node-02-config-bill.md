---
title: "MDF特性单据级控制"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/02-config-bill"
section: "MDF服务"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, MDF服务]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# MDF特性单据级控制

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/02-config-bill | 所属：MDF服务

# [](#mdf特性单据级控制)MDF特性单据级控制

导语：
MDF框架支持领域配置公共特性开关，以控制特定属性的开启与关闭，然而根据业务场景的不同，统一domainKey下的不同单据可能会要求有不同表现形式，此时就需要对特性进行单据级的控制。

## [](#1-特性配置对照表)1. 特性配置对照表

特性对照表参考文档：[《MDF服务配置项说明》](#/node/02-config-item-desc)

## [](#2-单据级特性控制)2. 单据级特性控制

### [](#21-通过线上配置控制推荐)2.1. 通过线上配置控制（推荐）

通过扩展脚本的方式虽然可以实现单据单据级控制，但是会有一些弊端

- 第一：脚本控制的方式不能实现实时生效，必须通过重新部署流水线的方式才能让代码生效
- 第二：如果需要配置的单据较多的时候需要频繁的修改扩展脚本，在工作量方面不是很友好。

此时可以通过修改consul线上配置中features属性数据结构的方式进行单据级控制，处理方式如下：

- 首先，我们需要了解现有consul配置中features的结构，如下图所示：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/mdftexingdanjujikongzhi_image1.35fe51ce.png)

图中所示为某领域domainKey级配置文件，其中features为数组结构，开启了metaClientCache、loadDataAdvance等六个特性。

- 通过对上面的结构进行修改，将features从数组结构修改为对象结构，即可实现单据级配置，配置示例如下：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/mdftexingdanjujikongzhi_image2.bb650072.png)

图中所示为修改后的features结构，代表当前domainKey下的单据仍然开启了loadDataAdvance、importWorkbench、formLayout、getTplIdFirst这四个公共特性，但是metaClientCache特性只对billNo1、billNo2、billNo3开启，cacheFilterFeature特性对除billNo4、billNo5之外的单据开启。

### [](#22-通过扩展脚本控制)2.2. 通过扩展脚本控制

**开启特性：**

consul上未配置相关特性，但是某个特定单据中想要开启此特性时，参照如下代码:

viewmodel.enableFeature('featureName') // 当前单据开启特性featureName

**关闭特性：**

consul上已配置相关特性，但是某个特定单据中想要关闭此特性时，参照如下代码：

viewmodel.disableFeature('featureName') // 当前单据开启特性featureName