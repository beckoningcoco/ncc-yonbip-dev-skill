---
title: "MDF脚手架多语接入"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/20-clijiaoshoujiaduoyujieru"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# MDF脚手架多语接入

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/20-clijiaoshoujiaduoyujieru | 所属：指南

# [](#mdf脚手架多语接入)MDF脚手架多语接入

- 先联系赵东升发邮件多语分组注册[1.2.8.3 多语平台使用手册 （总体)](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=12156444) [多语新模型升级抽取工具2.0](https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=188187365)
- 前端入口注册多语即可

cb.lang.registerLang(process.env.__DOMAINKEY__, require("../pack"), ""); // 最后一个参数传入groupCode即可

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFjiaoshoujiaduoyujieru_image1.79eae57d.png)