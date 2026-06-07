---
title: "变更历史"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/10-biangenglishi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 变更历史

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/10-biangenglishi | 所属：指南

## [](#变更历史)变更历史

### [](#变更工作台展示效果多版本对比配置简单推荐使用)变更工作台展示效果（多版本对比，配置简单，推荐使用！）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/biangenglishi_image1.7eec8097.png)

- 配置一个按钮，按钮的action为changehistory （浏览态详情卡片页面）
- 如果领域自己有配置getLoginUser调用领域自己的接口，且接口返回的租户信息中没有tenantId字段，则需要在viewmodel模型的params参数中加入一个changeHistoryTenantId字段，值为当前租户id，否则默认取工作台提供的租户id
- 因为有些后台逻辑，当页面表类型的内容变更的时候，id是随着变化的，这样就没有办法通过id去对比出同一条数据，这种情况我们可以将表格可以表示唯一标识符的列
对应的实体表中的cExtProps增加一个属性"isMainKeyField" : true，
这样就会通过这个字段做数据对比了

后端对接业务日志，参考文档：[https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=153196296](https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=153196296)

### [](#单据内变更历史展示效果单版本对比)单据内变更历史展示效果（单版本对比）

配置方式，参考文档：[单据历史变更接入说明](#/guides/12-pilinagyouhuayibubaocundengqitaxingongneng#3-%E5%8D%95%E6%8D%AE%E5%8E%86%E5%8F%B2%E5%8F%98%E6%9B%B4%E6%8E%A5%E5%85%A5%E8%AF%B4%E6%98%8E)