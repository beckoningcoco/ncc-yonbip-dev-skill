---
title: "活动组 PromotionGroup"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/04-promotiongroup"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 活动组 PromotionGroup

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/04-promotiongroup | 所属：移动组件

# [](#活动组-promotiongroup)活动组 PromotionGroup

## [](#1功能说明)1. 功能说明

PromotionGroup 组件是把子表的展示形式作为卡片来展示。

模型的获取：yya.get("childenfield").getCache('editRowModels')

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/PromotionGroupfengzurongqi_image1.6a8ce7b3.png)

## [](#3扩展属性-cstyle)3. 扩展属性 cStyle

||属性名称||属性说明||默认值|
||属性名称||属性说明||默认值|
||title||分组标题||无|

## [](#4孙表批量删除配置)4.孙表批量删除配置

配置需要以下三个步骤

1.预置按钮容器：领域需要在bill_toolbar表中预置按钮组，其父级（parent）对应billtplgroup_base表中cType为promotiongroup的数据的cCode。

2.预置按钮：领域需要在bill_toolbaritem表中预置按钮，其中toolbar值为刚刚预置的bill_toolbar表中数据的name，并定义type为batchbutton。

3.预置动作：领域需要在bill_command表中预置动作，其中aciton值为deleteSunRows，parameter中需要定义parentField值为所属子表的childrenField、childrenField值为孙表本身的childrenField，如{"parentField":"purInRecords","childrenField":"purInRecordsSNs"}。