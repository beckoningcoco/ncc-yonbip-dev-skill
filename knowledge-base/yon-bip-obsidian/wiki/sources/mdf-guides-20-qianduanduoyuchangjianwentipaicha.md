---
title: "前端多语常见问题排查"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/20-qianduanduoyuchangjianwentipaicha"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 5
---

# 前端多语常见问题排查

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/20-qianduanduoyuchangjianwentipaicha | 所属：指南

# [](#前端多语常见问题排查)前端多语常见问题排查

## [](#1-检查多语编码是否注册)1. 检查多语编码是否注册

打开一个节点所有前端静态中文的地方均显示编码，需要检查前端工程入口，是否传入当前项目的groupCode。且检查是否正确，如果没传请传入当前项目多语编码

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qianduanduoyuchangjianwentipaicha_image1.6490ec6c.png)

## [](#2-判断未翻译的字段是前端多语还是后端多语以前端多语为例)2. 判断未翻译的字段是前端多语还是后端多语（以前端多语为例）

### [](#21-检查当前多语词条对应目groupcode拉取的多语资源)2.1. 检查当前多语词条对应目groupCode拉取的多语资源

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qianduanduoyuchangjianwentipaicha_image2.47764399.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qianduanduoyuchangjianwentipaicha_image3.ca731415.png)

在当前groupCode拉取的多语资源中搜未翻译字段，如果未搜到，先排查下你们多语资源是否由测试环境同步到当前环境了。

### [](#22-中文写到组件外导致未翻译)2.2. 中文写到组件外导致未翻译

一个页面中只有个别中文未翻译，别的均翻译了，有一种可能是静态中文写到组件外部（如下图）了，因为组件外优先渲染，此时多语资源还未返回。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qianduanduoyuchangjianwentipaicha_image4.cb4121ed.png)

## [](#3-表单title或者表格title为中文未翻译则说明为前端ui元数据多语需要后端排查)3. 表单title或者表格title为中文未翻译，则说明为前端UI元数据多语，需要后端排查

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qianduanduoyuchangjianwentipaicha_image5.7b57f511.png)