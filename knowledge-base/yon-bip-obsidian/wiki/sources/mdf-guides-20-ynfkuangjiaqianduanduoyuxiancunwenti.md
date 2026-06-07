---
title: "YNF框架前端多语现存问题"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/20-ynfkuangjiaqianduanduoyuxiancunwenti"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# YNF框架前端多语现存问题

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/20-ynfkuangjiaqianduanduoyuxiancunwenti | 所属：指南

# [](#ynf框架前端多语现存问题)YNF框架前端多语现存问题

## [](#1ynf前端多语机制)1、YNF前端多语机制

YNF框架多语资源跟YNF组件绑定的，YNF组件拉取前，先拉取当前组件所关联的多语资源，放到内存中，然后再走组件的render

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ynfkuangjiaqianduanduoyuxiancunwenti_image1.161747f1.png)

## [](#2面临问题)2、面临问题

### [](#21非ynf框架引用ynf组件)2.1、非YNF框架引用YNF组件

非YNF框架加载引用YNF组件，得由非YNF框架项目入口往window上挂载，load2ndLangResource函数，或者在非YNF框架入口，加载当前项目多语资源时，连同YNF组件对应的多语资源一块加载

### [](#22工作台加载ynf节点)2.2、工作台加载YNF节点

因YNF框架往window上挂载load2ndLangResource函数，是在ynf-core-middleware包内挂载的，如果工作台在切换语种时，不等待ynf-core-middleware包加载完成，就打开YNF节点，就会导致load2ndLangResource函数未挂载，YNF节点对应的多语资源无法拉取，从而导致多语问题

## [](#3目前多语分组)3、目前多语分组

YS_FED_LIB-WEB-YNF-FE

YS_FED_CORE-YNF-FE

YS_FED_LIB-MOBILE-YNF-FE

所属服务： ybbase