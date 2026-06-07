---
title: "弹窗顶部支持配置Alert组件"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/15-tanchuangdingbuzhichipeizhialertzujian"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 弹窗顶部支持配置Alert组件

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/15-tanchuangdingbuzhichipeizhialertzujian | 所属：指南

# [](#弹窗顶部支持配置alert组件)弹窗顶部支持配置Alert组件

## [](#1-功能特性)1. 功能特性

组件支持文字链接，鼠标悬浮时，文字链接出现下滑线；关闭按钮可配置是否显示。

组件支持展开/收起，展开图标默认灰色#999999，展开后颜色变为#505766；

组件高度根据内容自适应，最大高度为132px，超出后在该区域内上下滑动；支持标题加内容可折叠：

## [](#2-效果预览)2. 效果预览

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liebiaodingbuzhichipeizhialertzujian_image1.3bad5d43.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liebiaodingbuzhichipeizhialertzujian_image2.95da455d.png)

## [](#3-配置参考)3. 配置参考

文字链接配置参考：

cStyle = {"referAlert":{"cControlType": "Alert","closable":true,"colors":"info", "message":"内容详情<a data-event='事件名称'>影响因素关联</a>"}}

折叠提示配置参考：

cStyle = {"referAlert":{"cControlType": "Alert","props": {"closable":true,"colors":"info","defaultState":true,"head": "标题","message":"内容","collapsible":false}}}

## [](#4-说明)4. 说明

事件名称：a标签属性data-event对应的值

链接事件触发：yya.execute(事件名称 , {e});

## [](#5-参数列表)5. 参数列表

||属性名称||表示的含义||属性值类型||默认|
||head||标题||string/html片段||无|
||message||内容||string/html片段||无|
||closable||关闭按钮（默认可关闭）||boolean||true|
||colors||状态（`success`、`info`、`warning`、`error`）||string||info|
||collapsible||支持折叠（标题+内容）||boolean||false|
||defaultState||默认折叠状态（收起）||boolean||false|

设计指南请查阅钉耙官方文档