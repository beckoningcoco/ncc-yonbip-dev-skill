---
title: "附件变更历史"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/10-fujianbiangenglishi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 6
---

# 附件变更历史

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/10-fujianbiangenglishi | 所属：指南

# [](#附件变更历史)附件变更历史

## [](#1-实现原理)1. 实现原理

**目前附件和单据关联是一个uuid,
无法区分是否上传过是否有附件，有几个附件，所以目前的数据无法实现附件变更，为了实现变更需要数据中多存一个数据，fileKeyField：文件ID字符串，需要领域保存且下次查询能返回这个值**

**实现原理：**
领域需要处理模板，需要在元数据中设置fileKeyField，fileKeyField对应一个隐藏字断

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/fujianbiangenglishi_image1.94f36feb.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/fujianbiangenglishi_image2.fdc8cbb1.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/fujianbiangenglishi_image3.ed2764c4.png)

## [](#2-web端变更效果)2. Web端变更效果

### [](#21-表头)2.1. 表头

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/fujianbiangenglishi_image4.3a8d397c.png)

### [](#22-表体)2.2. 表体

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/fujianbiangenglishi_image5.b5e3bf56.png)

## [](#3-移动端变更效果)3. 移动端变更效果

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/fujianbiangenglishi_image6.b488a9f3.png)