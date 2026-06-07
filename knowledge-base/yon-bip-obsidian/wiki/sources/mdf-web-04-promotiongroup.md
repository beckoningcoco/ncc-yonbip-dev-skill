---
title: "活动组 PromotionGroup"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-promotiongroup"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 4
---

# 活动组 PromotionGroup

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-promotiongroup | 所属：Web组件

# [](#活动组-promotiongroup)活动组 PromotionGroup

## [](#1-功能说明)1. 功能说明

PromotionGroup 组件是把子表的展示形式作为卡片来展示。

模型的获取：viewModel.get("childenfield").getCache('editRowModels')

## [](#2-效果展示)2. 效果展示

客户档案新增：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/PromotionGrouphuodongzuimg1.4ef294f4.png)

零售店铺新增：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/PromotionGrouphuodongzuimg2.48f96106.png)

## [](#3-扩展配置)3. 扩展配置

1、标题配置:PromotionGroup组件的cStyle中配置**{'promotionTitle':"cItemName"}，cItemName**为当前分组下字段的cItemName，比如上图中配置的字段是"平台类型"的cItemName，字段类型目前支持下拉、参照和文本框。

2、当设置了analysis时

(1)动态设置标题：监听setGroupTitle(meta, controlModel, editRowModel,
index)，动态设置每组的标题editRowModel.setState('grouptitle',
'xxxxx')

(2)动态设置副标题：监听setGroupTitle(meta, controlModel, editRowModel,
index)，动态设置每组的副标题editRowModel.setState('subtitle',
{subTitle:'xxx', color:'xxxxstate'});

                                 
其中subTitle为标题，color为枚举，对应枚举值为cyanstate, bluestate,
orangestate, greenstate, redstate, graystate

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/PromotionGrouphuodongzuimg3.2f997ab2.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/PromotionGrouphuodongzuimg4.64a62f97.png)