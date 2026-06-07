---
title: "即时分析按钮配置"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/21-jishifenxianniushezhi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 即时分析按钮配置

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/21-jishifenxianniushezhi | 所属：指南

# [](#即时分析按钮配置)即时分析按钮配置

框架提供了公共的action openreport，触发openreport

action会在Diwork（工作台门户）中打开一个新页签显示当前单据的即时分析结果，没有工作台环境的会重新打开一个浏览器页签进行即时分析结果的展示。

### [](#1-配置按钮元数据)1 配置按钮元数据

- 首先在bill_toolbaritem表中添加一个按钮，name为spliter,command为spliter,type为Spliter （避免新增的即时分析按钮与原来的按钮贴在一起
- 在bill_toolbaritem表中添加一个按钮，name为btnOpenReport,command为cmdOpenReport, type为Button text为"即时分析" icon为qingfenxi ，cParameter为 '{"classname":"button-only-icon"}'，iStyle为2
- 在bill_command表中添加一个command,name为cmdOpenReport，action为openreport

**注：以上配置只含报表相关必要属性，其余属性使用者自行配置，如tenant_id等**

### [](#2-设计效果)2 设计效果

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jishifenxianniushezhi_image1.68630067.png)