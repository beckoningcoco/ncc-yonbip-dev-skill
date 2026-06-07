---
title: "--查询条件属性描述"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-chaxuntiaojianshuxingmiaoshu"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# --查询条件属性描述

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-chaxuntiaojianshuxingmiaoshu | 所属：Web组件

# [](#查询条件属性描述)查询条件属性描述

## [](#1-属性描述)1. 属性描述

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ChaXunTiaoJianShuXingMiaoShuimage1.fb96f6e3.png)

查询条件作为查询区的重要组成部分，可以配置特定属性满足对应的需求场景，下表详细描述了各个属性以及对应的能力描述：

||属性名||属性编码||能力描述|
||属性名||属性编码||能力描述|
||搜索方式||bAutoflt||bAutoflt是true，则该查询条件可以在值改变的时候触发搜索|
||布局位置||refType||refType是'2'的时候是导航区 '0'或'1'是查询区，该属性决定查询条件的位置，导航区其实就是左侧的搜索树形态，一般只有参照或枚举类型条件才可修改该属性|
||是否必填||mustInput||mustInput是1是必填 0是非必填|
||是否允许修改||disabled||disabled是true是禁用，false是非禁用|
||条件是否必选||mustSelect||mustSelect是true的话，该条件在新增方案的时候会默认带出此条件且不可删除，该属性只能在数据库中预制，用户态不能修改必选配置方式为 pb_meta_filter_item表中找到对应条件，配置cExtProps属性：'{"mustSelect":true}'|

上面提到的几个属性如果在对应表中没有对应同名字段的话，可以以JSON字符串的形式写入到对应表的cExtProps中，若要修改当前方案的条件，需要在pb_filter_solution_common表中修改对应条件的属性，如果要修改所有待选条件的属性，需要在pb_meta_filter_item表中修改。

## [](#2-常见问题)2. 常见问题

Q：数据库中原厂预制了某个条件是必填，但是用户可以将条件修改为非必填，导致出现查询性能问题，如何防止用户修改？

A：预制某条件必填的同时增加必选属性，用户就不能修改必填属性了，且该条件不可被删除。