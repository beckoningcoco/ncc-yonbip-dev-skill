---
title: "单选框 Radio"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/01-radio"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 单选框 Radio

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/01-radio | 所属：移动组件

# [](#单选框-radio)单选框 Radio

## [](#1功能说明)1.功能说明

移动端Radio组件用于在移动设备上展示一组单选按钮，用户可以通过鼠标选择一个选项。

## [](#2效果展示)2.效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Radiodanxuankuangyi-image1.a4155516.png)

## [](#3基础属性)3.基础属性

枚举数据可以通过配置枚举类型（cEnumType）确定。

||名称||含义||说明|
||名称||含义||说明|
||cEnumType||选择框的枚举文本数据||需要在aa_enum表中配置枚举项，例："cEnumType": "yontest_y_n",|
||className||支持自定义类名|||
||readOnly||只读||true-非必输 false -必输|
||disabled||禁用|||
||bIsNull||是否必填|||
||bshowit||是否显示||true显示，false隐藏|

## [](#4扩展属性-cextprops)4.扩展属性-cExtProps

||名称||含义||说明|
||名称||含义||说明|
||singleLine||标题和内容是否单行显示||cExtProps: {"singleLine": true}|
||splitline||是否有分割线||cExtProps: {"splitline": true}|
||singleLineCenter||是否单行集中||cExtProps: {"singleLineCenter": true}|

## [](#5事件)5.事件

支持领域自定义事件，可以在设计器中添加action。框架会将事件绑定到模型上。

以onchange事件为例

"_actions": {

 "onChange": [

 {

 "scriptId": "358230b35c75494399d22b1a4329980e",

 "isNoCommand": false,

 "action": "hresp_proof_apply_cardMobileArchive_customTemplate_onChange",

 "description": "前端函数",

 "event": "onChange",

 "type": "fun"

 }

 ]

},

## [](#6控制示例)6.控制示例

支持控制显示或隐藏

viewmodel.get(cItemName).setVisible(false)