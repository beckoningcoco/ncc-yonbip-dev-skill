---
title: "自定义空数据 NoDataHelper"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-nodatahelper"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 自定义空数据 NoDataHelper

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-nodatahelper | 所属：Web组件

# [](#自定义空数据-nodatahelper)自定义空数据 NoDataHelper

## [](#1-功能说明)1. 功能说明

支持领域自定义空数据时表格的状态

## [](#2-配置方法)2. 配置方法

配置在table表格中

例：（节选）

||[billtplgroup_base]|||
||主键||模板分组编码|
||*id*||cCode|
||*36*||materialTable|
||*50*||emptyData|

按钮区正常配置在toolbar中

例：（节选）

||[bill_toolbar]|||
||主键||名字|
||*id*||name|
||*603*||noData|

||[bill_toolbaritem]|
||主键|
||*id*|
||*738*|
||*739*|

按钮功能可以通过调用平台预制好的接口也可以通过在扩展脚本中获取button
自定义功能

viewmodel.get('button1').on('click', () => {})

注意：如果配置行按钮 需要把行按钮的order顺序在nodatahelp之前

例：如果billtplgroup_base表中 nodatahelper的iorder是10
那么在bill_toolbar表中的行按钮的ordernum要小于10 

## [](#3-基本属性)3. 基本属性

在billtplgroup_base表中table配置noDataHelper

在nodatahelper的cStyle中配置

||属性名称||属性含义||值类型||属性说明|
||description||描述文字||string||例："暂时没有数据哦，建议您手动新增业务对象"|
||type||自定义控制空数据图标||string||例："type":"no-visualize-data"参考tinper empty组件的几种图片  【tinper官网 – 空状态 Empty】|

[https://yondesign.yonyou.com/website/#/detail/component/wui-empty/bip](https://yondesign.yonyou.com/website/#/detail/component/wui-empty/bip)
参考tinper 空状态api：image