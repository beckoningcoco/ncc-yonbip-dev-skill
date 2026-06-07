---
title: "报表服务公共地址"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/21-baobiaofuwugonggongdizhi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 报表服务公共地址

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/21-baobiaofuwugonggongdizhi | 所属：指南

# [](#报表服务公共地址)报表服务公共地址

## [](#common)common

方法一：

const commonUrl = (window._YMSHOST_ || window.__MAIN_ORIGIN__) + '/iuap-data-common' // 非MDF中使用

方法二：

const commonUrl = cb.utils.getMainOriginUrl() + '/iuap-data-common'  

// MDF中使用

## [](#analytic)analytic

方法一：

const analyticUrl = (window._YMSHOST_ ||

window.__MAIN_ORIGIN__) + '/iuap-data-analytic'     

// 非MDF中使用

方法二：

const analyticUrl = cb.utils.getMainOriginUrl() + '/iuap-data-analytic'     

// MDF中使用