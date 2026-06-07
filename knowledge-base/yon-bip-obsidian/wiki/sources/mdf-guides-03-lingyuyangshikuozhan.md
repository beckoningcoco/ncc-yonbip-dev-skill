---
title: "领域样式扩展"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/03-lingyuyangshikuozhan"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 领域样式扩展

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/03-lingyuyangshikuozhan | 所属：指南

## [](#领域样式扩展)领域样式扩展

扩展样式在`src/client/web | mobile/styles`中扩展

【/src/client/web/styles/default/extend.less】【/src/client/mobile/styles/default/extend.less】

示例：

// 示例
mdd-fw为对应的domainKey，所有代码都写到对应的领域下，避免样式相互影响

#mdd-fw {

 .web-demo {

 height: 100%;

 }

}