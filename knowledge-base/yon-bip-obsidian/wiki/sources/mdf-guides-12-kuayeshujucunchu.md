---
title: "跨页数据存储"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/12-kuayeshujucunchu"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 跨页数据存储

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/12-kuayeshujucunchu | 所属：指南

## [](#跨页数据存储)跨页数据存储

### [](#背景)背景：

跨页数据存储的支持一下场景：

-  表格行数据跨页多选；
- 支持可编辑表格，跨页增删改查操作。

### [](#配置)配置：

 目前跨页数据存储以完成出版，并自测完成，但是表格设计的场景较多无法一一覆盖，暂时跨页存储支持单节点配置，后期测试充分后可全面开启。可在扩展脚本处理：

//开启跨页数据存储

viewmodel.getParams().enableCachePaginationRowData=true;

注意项：

  1 开发者自定义的ation，无法重置缓存数据，需要统一修改;

const gridModels = viewmodel.getGridModels();

gridModels.forEach(gridModel => {

 gridModel._set_data('cachePaginationRowData', [], true);

 const selectedKeysSet = gridModel._get_data('selectedKeysSet');

 if (selectedKeysSet) selectedKeysSet.clear();

})

2 可编辑单表（editvoucherlist), 处于非浏览态时会隐藏切换一页显示条数；

3 可编辑单表（editvoucherlist)，切换页时会校验表格当前页修改是否完成；