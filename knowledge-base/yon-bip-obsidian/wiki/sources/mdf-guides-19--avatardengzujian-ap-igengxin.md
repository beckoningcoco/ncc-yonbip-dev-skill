---
title: "Avatar等组件API更新"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/19--avatardengzujian-ap-igengxin"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# Avatar等组件API更新

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/19--avatardengzujian-ap-igengxin | 所属：指南

# [](#avatar等组件api更新)Avatar等组件API更新

## [](#1cbutilsgetfileurlbyfileid)1、cb.utils.getFileUrlByFileid

- 原调用方式：同步
- 现在调用方式：异步

替换API如下：

// fileids: 'fileid1,fileid2,fileid3....' 逗号隔离

// viewmodel 单据级的viewmodel

cb.utils.getFileUrlByFileid(fileids, viewmodel).then(({ data }) => {

 // data： 返回的数组对象

})