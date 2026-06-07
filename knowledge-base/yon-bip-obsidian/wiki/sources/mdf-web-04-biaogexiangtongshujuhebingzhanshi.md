---
title: "--表格相同数据行合并展示"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-biaogexiangtongshujuhebingzhanshi"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# --表格相同数据行合并展示

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-biaogexiangtongshujuhebingzhanshi | 所属：Web组件

# [](#表格相同数据行合并展示)表格相同数据行合并展示

### [](#1-场景描述)1. 场景描述

在表格展现中，相邻两行的数据一致时，要求两行的数据合并成一个单元格展示。

### [](#2-实现效果)2. 实现效果

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/biaogexiangtongshujuhebingzhanshiimg1.42f5b905.png)

### [](#3-代码实现)3. 代码实现

如果需要开启单元格合并功能，则需要在前端的扩展脚本中加入以下代码，其中mergeCells默认为false，设置为true可以开启此功能。

viewModel.getGridModel().setState('mergeCells', true);

其中，某一列是否开启合并可以通过扩展脚本控制，默认为不开启，设置bMergeCol为true时开启。

代码如下

// 其中xxx为具体列的cName

viewModel.getGridModel().setColumnState("xxx", "bMergeCol", true);

表格单元格合并目前支持两种形式：顺序合并和按数据合并。

#### [](#31-顺序合并默认是顺序合并mergemode1)3.1. 顺序合并(默认是顺序合并mergeMode:1)

从第一列开始，如果第1、2、3行数据可以合并，则第二列仅会在1、2、3行的范围内进行合并。此时即使第二列中第3、4行的数据相同也不会做合并。

代码如下

viewModel.getGridModel().setState("mergeMode", 1);

注意：模式1合并，合并列需要从第一列排列，中间不能有非合并的列；

比如：

设置第1、3列合并，因为第2列不是合并列，所以第3列的合并属性不生效；

设置第2、3列合并，因为第1列不是合并列，所以2、3列的合并属性不生效

#### [](#32-按数据合并)3.2. 按数据合并

此时可以指定数据合并，此场景常用于子表+明细展示时，相同的主表数据进行合并，子表数据分开展示。默认会按照数据的id进行合并。

代码如下

viewModel.getGridModel().setState('mergeMode', 2);

viewModel.getGridModel().setState('mergeSourceName', 'xx'); //根据哪个字段合并，默认根据主键(默认是id)合并

viewModel.getGridModel().setState('mergePosition','first');//合并方式向上对齐，默认是居中center合并

### [](#4-复合列合并单元格)4. 复合列合并单元格

1、设置bMergeCol属性

viewModel.getGridModel().setColumnState(cItemName, "bMergeCol", true);

 

2、扩展实现复合列单元格的内容比较

监听isCompositeMerged钩子，参数有{index, nextIndex, columnKey, isMerge}，判断单元格内容是否需要合并，修改isMerge值