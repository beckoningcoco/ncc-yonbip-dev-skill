---
title: "列表视图平铺模式配置"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/14-liebiaoshitupingpumoshipeizhi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 列表视图平铺模式配置

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/14-liebiaoshitupingpumoshipeizhi | 所属：指南

# [](#列表视图平铺模式配置)列表视图平铺模式配置

列表数据一键平铺需要在对应表格公共按钮的**Toolbar**中添加一个容器，ControlType为**radiobutton，然后在此容器中配置两个button，两个button的**action分别配置为showlistcard(显示平铺模式)，hidelistcard(恢复列表模式)即可。

注意：按钮的action一定要配置正确，其他的标题领域自行处理即可。

下面的UI元数据结构仅供参考，注意外层为radiobutton，内层包含两个button。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liebiaoshitupingpumoshipeizhi_image1.6373622f.png)

配置完成通过点击按钮触发不同的action进而切换视图。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liebiaoshitupingpumoshipeizhi_image2.67fd70ad.png)

**注：该功能目前仅支持在浏览态使用，非浏览态时请领域配置按钮组的隐藏，以避免不必要的问题。**