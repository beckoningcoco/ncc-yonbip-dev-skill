---
title: "协议组件 Agreement"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-agreement"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 协议组件 Agreement

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-agreement | 所属：Web组件

# [](#协议组件-agreement)协议组件 Agreement

## [](#1-功能说明)1. 功能说明

勾选展示协议

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Agreementxieyizujianimage1.21e8aef7.png)

## [](#3-基本属性)3. 基本属性

### [](#31-在单据中)3.1. 在单据中

||属性名称||属性含义||值类型||属性说明|
||bHidden||是否隐藏||boolean||true-隐藏 false -显示|
||bIsNull||是否必输||boolean||true-非必输 false -必输|
||cDefaultValue||默认值||string||value值|

## [](#4-扩展属性-cstyle)4. 扩展属性 cStyle

单据在cStyle中、查询区在extendField中配置属性，如：{"autoSize":true}

||属性名称||属性含义||值类型||示例|
||agreementDataSource||协议数据源||array||[{ agreementName:'协议1', mustSelect:false, ... }, { agreementName:'协议2', mustSelect:true, ... },]|

## [](#5-控制示例)5. 控制示例

目前协议打开这部分由领域控制 后续根据需求平台可加入统一打开协议效果

**示例：**

// 点击协议时候触发 showAgreement 领域写入自定义打开协议逻辑

 model?.fireEvent('showAgreement', item)

## [](#6-faq)6. FAQ

**常见问题1 ?**

解答内容...

**常见问题2 ?**

解答内容...