---
title: "子表多行文本组件弹窗形式配置说明"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/15-zibiaoduohangwenbenzujiantanchuangxingshipeizhishuoming"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 4
---

# 子表多行文本组件弹窗形式配置说明

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/15-zibiaoduohangwenbenzujiantanchuangxingshipeizhishuoming | 所属：指南

# [](#子表多行文本组件弹窗形式配置说明)子表多行文本组件弹窗形式配置说明

## [](#1-展现形态)1. 展现形态

以弹窗形式出现，高度固定不变。

编辑态：鼠标点击输入框后弹出弹窗，可直接在弹窗中编辑文本。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/zibiaoduohangwenbenzujiantanchuangxingshipeizhishuoming_image1.36f89a52.jpeg)

可以配置minRows和maxRows
控制输入框的高度，minRows：最小高度；maxRows：最大高度

浏览态：点击【查看详情】按钮，在弹窗中浏览文本。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/zibiaoduohangwenbenzujiantanchuangxingshipeizhishuoming_image2.6eeaf711.png)

## [](#2-配置方式)2. 配置方式

设计器制单参考下面截图配置。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/zibiaoduohangwenbenzujiantanchuangxingshipeizhishuoming_image3.29765dbb.png)

excel制单方式：在cExtProps配置openContentHeight为false，
bCloseContentHeight为true。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/zibiaoduohangwenbenzujiantanchuangxingshipeizhishuoming_image4.aef79b64.png)