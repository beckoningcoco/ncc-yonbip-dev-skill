---
title: "国际化组件"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/20-guojihuazujian"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 5
---

# 国际化组件

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/20-guojihuazujian | 所属：指南

# [](#国际化组件)国际化组件

## [](#1-姓名格式主表字段)1. 姓名格式（主表字段）

不同国家姓名的显示规则，及显示字段不同，需要先在姓名格式节点，设置每个国家的姓名显示规则后，单据使用时可选择不同国家，录入对应的姓名格式字段。

billItem_base表的cControlType配置成NameFormat即可

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/guojihuazujian_image1.b0acd542.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/guojihuazujian_image2.4a463eac.png)

## [](#2-地址组件建议主表配置)2. 地址组件（建议主表配置）

不同国家的地址显示规则不同，单据使用时可选择不同国家，录入对应的地址格式字段

billItem_base表的cControlType配置成Address2即可

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/guojihuazujian_image3.aa4fdde8.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/guojihuazujian_image4.353a0e09.png)

## [](#3-时区组件)3. 时区组件

billItem_base表的cControlType配置成TimeZone即可（移动端配置为TimezoneSelector）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/guojihuazujian_image5.4f44bf77.png)

## [](#4-性别组件)4. 性别组件

枚举格式，枚举code改成Gender

[

 {

 "id": "1769870621620306021",

 "code": "0",

 "name": {

 "zh_TW": "未知",

 "en_US": "Not known",

 "zh_CN": "未知"

 },

 "nameResid": "UID:P_GZTBDM_1768E18404900015",

 "custenumdefid": "1769870621620306018",

 "dr": 0,

 "sortnum": 0,

 "ispreset": 0,

 "ytenantId": "0"

 },

 {

 "id": "1769870621620306022",

 "code": "1",

 "name": {

 "zh_TW": "男",

 "en_US": "Male",

 "zh_CN": "男"

 },

 "nameResid": "UID:P_GZTBDM_18903CB005B80009",

 "custenumdefid": "1769870621620306018",

 "dr": 0,

 "sortnum": 0,

 "ispreset": 0,

 "ytenantId": "0"

 },

 {

 "id": "1769870621620306025",

 "code": "10",

 "name": {

 "zh_TW": "非二元性別",

 "en_US": "Non-binary",

 "zh_CN": "非二元性别"

 },

 "nameResid": "UID:P_GZTBDM_1892C5C805B80006",

 "custenumdefid": "1769870621620306018",

 "dr": 0,

 "sortnum": 0,

 "ispreset": 0,

 "ytenantId": "0",

 "countryCode": "DE,AT,NP,NZ,AU,AR,MT,PK,DK"

 },

 {

 "id": "1769870621620306026",

 "code": "11",

 "name": {

 "zh_TW": "跨性别人士",

 "en_US": "Transgender",

 "zh_CN": "跨性别人士"

 },

 "nameResid": "UID:P_GZTBDM_1892C68C05B80001",

 "custenumdefid": "1769870621620306018",

 "dr": 0,

 "sortnum": 0,

 "ispreset": 0,

 "ytenantId": "0",

 "countryCode": "IN"

 },

 {

 "id": "1769870621620306027",

 "code": "12",

 "name": {

 "zh_TW": "海吉拉斯",

 "en_US": "Hijras",

 "zh_CN": "海吉拉斯"

 },

 "nameResid": "UID:P_GZTBDM_1892C7A805B80002",

 "custenumdefid": "1769870621620306018",

 "dr": 0,

 "sortnum": 0,

 "ispreset": 0,

 "ytenantId": "0",

 "countryCode": "BD"

 },

 {

 "id": "1769870621620306023",

 "code": "2",

 "name": {

 "zh_TW": "女",

 "en_US": "Female",

 "zh_CN": "女"

 },

 "nameResid": "UID:P_GZTBDM_18903CCC04500005",

 "custenumdefid": "1769870621620306018",

 "dr": 0,

 "sortnum": 0,

 "ispreset": 0,

 "ytenantId": "0"

 },

 {

 "id": "1769870621620306024",

 "code": "9",

 "name": {

 "zh_TW": "未說明",

 "en_US": "Not applicable",

 "zh_CN": "未说明"

 },

 "nameResid": "UID:P_GZTBDM_18903A2A04500001",

 "custenumdefid": "1769870621620306018",

 "dr": 0,

 "sortnum": 0,

 "ispreset": 0,

 "ytenantId": "0"

 }

]

选不同的国家后，执行这个枚举的listmodel事件

listModel.doPropertyChange('filterDataSource', {value: 'DE', filterKey: 'countryCode'});