---
title: "列表卡片分屏视图配置"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/14-liebiaokapianfenpingshitupeizhi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 列表卡片分屏视图配置

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/14-liebiaokapianfenpingshitupeizhi | 所属：指南

# [](#列表卡片分屏视图配置)列表卡片分屏视图配置

表卡分屏视图是在列表页**Toolbar**中添加一个容器，ControlType为**radiobutton，为然后在此容器中配置两个button，两个button的**action分别配置为showsplitview(显示分屏视图)，hidesplitview(隐藏分屏视图)即可。

注意：按钮的action一定要配置正确，其他的标题领域自行处理即可。

下面的UI元数据结构仅供参考，注意外层为radiobutton，内层包含两个button。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liebiaokapianfenpingshitupeizhi_image1.96769421.png)

配置完成通过点击按钮触发不同的action进而切换视图。

注意：由于分屏视图采用的是简版查询区，所有条件将都不会展示，取而代之的是一个模糊搜索框，ctrlType为searchBox，因此需要预制一个ctrlType为"searchbox"的查询条件，然后**此查询条件的dataSource字段必须配置，且值为要查询的字段名称。**