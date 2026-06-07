---
title: "卡片编辑态变更历史功能特性"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/10-kapianbianjitaibiangenglishigongnengtexing"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 4
---

# 卡片编辑态变更历史功能特性

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/10-kapianbianjitaibiangenglishigongnengtexing | 所属：指南

# [](#卡片编辑态变更历史功能特性)卡片编辑态变更历史功能特性

MDF框架支持卡片页主子表的变更历史，常见的主子表卡片单据都可以配置使用，需要打开特性开关**editChangeHistory**。下面对此功能以及常见问题进行说明。

## [](#1-开启特性)1. 开启特性

开启特性开关后，在控制台可以通过yya.hasFeature('editChangeHistory')验证，打开后正确结果如下图。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kapianbianjitaibiangenglishigongnengtexing_image1.e84258f9.png)

开启特性后，从列表页找到可编辑的数据进入卡片页后，即可体现此功能，主表字段会直接展示首次进入编辑状态的值，子表有三种状态，分别是新增、删除以及变更，复制行后也属于新增，新增不会展示任何变更字段，删除后字段不可编辑，具体效果如下图。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kapianbianjitaibiangenglishigongnengtexing_image2.ec553787.png)

对上图进行说明，主表单据日期进行修改，记录了首次进入编辑态的值：2022-04-26，之后修改不会变其他的值，只记录首次值；子表中行2是复制行产生，因此为新增行，修改数据不会发生变更，子表行3为删除行，删除行不可进行编辑，行4为原有数据，修改后会展示首次值，变更同样支持批改操作，批量进行子表行数据修改也会展示为变更行。对上述结果进行保存后效果如下图。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kapianbianjitaibiangenglishigongnengtexing_image3.38768bd6.png)

此图仅为保存后的浏览态展示，刷新页面或者重新进入此条目数据，移除标志的行会消失，其他行恢复无标志状态，同时子表变更记录消失。

## [](#2-常见问题)2. 常见问题

- 如果新进入编辑态未做任何修改但是主表或子表显示变更标识，是因为扩展脚本中有业务操作，比如修改某字段的操作，为避免下图（主表散户未做修改，但是有变更历史）情况，需要在扩展脚本中加入此参数**firstLoadData为true。**

vm.getParams().firstLoadData = true // vm为单据viewModel

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kapianbianjitaibiangenglishigongnengtexing_image4.e96097bb.png)

- 如果保存后不是和前面效果图一致，而是闪一下全部变为新增标志，是因为关闭了特性开关**banSaveRefresh，导致保存后刷新数据，开启即可。**