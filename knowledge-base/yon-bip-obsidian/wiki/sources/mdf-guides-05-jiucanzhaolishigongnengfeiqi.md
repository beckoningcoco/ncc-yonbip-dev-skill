---
title: "旧参照历史功能废弃"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/05-jiucanzhaolishigongnengfeiqi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 旧参照历史功能废弃

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/05-jiucanzhaolishigongnengfeiqi | 所属：指南

# [](#旧参照历史功能废弃)旧参照历史功能废弃

## [](#现象)现象

参照请求遇到下面截图的错误（该错误仅在日常测试提示，后续前端框架直接去掉这个接口调用）
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jiucanzhaolishigongnengfeiqiimage1.292df9a5.png)

错误内容：此功能已废弃，请切换到新的参照热点入口，具体对接步骤请咨询MDF前端同事

## [](#原因)原因

领域前端开启了特性referRecentList，此特性为老特性，目前这个特性对应的功能MDD那边已经废弃了，对应的新功能是参照的收藏功能，

具体废弃原因：

- 使用旧的refhot的功能要求领域服务配置一个redisTemplate @Qualifier("mddRankRedisTemplate")
- 有的领域服务没有配置，前端调用/hot/list的接口就会抛出异常。还有领域反馈其他的抛错。
- 考虑到Reids架构部统一要求配置成缓存中心，这个单独的redisTemplate如果使用也需要配置。 并且这个老版本参照热点的功能并不完善，经常会出现异常。
- 所以统一在前后端废弃掉这个功能，使用新的参照收藏功能来替代是最好的解决方案。

## [](#修改方案)修改方案

- 如果还想开参照收藏和历史功能，要按照[参照收藏功能使用配置](#/guides/05-canzhaoshoucanggongnengshiyongpeizhi) 把前端和后端都适配好
- 根据参照请求domainKey(联系[MDF领域接口人登记表-外链](https://docs.yonyoucloud.com/l/7c878c5ca721))把referRecentList这个特性删掉（旧参照历史）
- 按照上述文档适配，前后端均适配好后如仍有问题，前端可联系周磊/陈达，后端可联系（严明、孙敬宇、或者王思懿）