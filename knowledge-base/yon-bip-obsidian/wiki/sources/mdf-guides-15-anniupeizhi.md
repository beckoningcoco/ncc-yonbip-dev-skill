---
title: "按钮配置"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/15-anniupeizhi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 按钮配置

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/15-anniupeizhi | 所属：指南

# [](#按钮配置)按钮配置

**1、下拉按钮配置**

按钮类型配置为**dropdownbutton**，下拉按钮配置为**button**，并且要指定按钮的parent是dropdownbutton。

下拉按钮可点击：在下拉按钮的parameter中配置{"displaymode":"button"}

**2、按钮组配置**

按钮组只需要在第一个按钮的前面和最后一个按钮的后面配上**spliter**即可，如下图：

对应数据库表名[bill_toolbaritem]

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/anniupeizhi_image1.41cc6208.png)

**3、带图标的按钮**

在[bill_toolbaritem]表中**icon**一项配置成要显示的图标即可。

**3、按钮与按钮之间的间距配置**

按钮之间的间距是通过配置**spliter**控制的，如果按钮之间没有间距，检查是否配置**spliter**。