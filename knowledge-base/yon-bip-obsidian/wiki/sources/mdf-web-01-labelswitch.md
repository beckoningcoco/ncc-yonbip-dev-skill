---
title: "标签开关 LabelSwitch"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-labelswitch"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 标签开关 LabelSwitch

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-labelswitch | 所属：Web组件

# [](#标签开关-labelswitch)标签开关 LabelSwitch

## [](#1-功能说明)1. 功能说明

通过鼠标选择内容，是最基础的表单域组件

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/LabelSwitchbiaoqiankaiguan-image1.b5c20ead.png)

## [](#3-基本属性)3. 基本属性

### [](#31-在单据中)3.1. 在单据中

||属性名称||属性含义||值类型||属性说明|
||bHidden||是否隐藏||boolean||true-隐藏 false -显示|
||bIsNull||是否必输||boolean||true-非必输 false -必输|

## [](#4-扩展属性-cstyle)4. 扩展属性 cStyle

单据在cStyle中、查询区在extendField中配置属性，如：{"autoSize":true}

||属性名称||属性含义||值类型||属性说明|
||disabled||禁用（置灰）||boolean||true-置灰 ，false - 正常|
||className||扩展class类名||string||用来处理扩展样式|
||checkedChildren||只读状态的文本展示||string||默认√|
||unCheckedChildren||默认X|||||
||Y/N||启用/停用||string||通过value值控制启用停用|

## [](#5-控制示例)5. 控制示例

### [](#51-在卡片中)5.1. 在卡片中

想要控制组件的状态，需要先拿到组件的模型，在MDF框架中，每个组件都会绑定一个模型，我们可以在扩展脚本中通过**viewmodel.get(cItemName)的方式获取到想要操作组件的模型，利用模型的API进行组件的控制，其中cItemName为该组件对应**billitem_base表中的cItemName

**示例：**

// 设置条件隐藏

viewmodel.get(cItemName).setVisible(false)

 

// 设置条件禁用

viewmodel.get(cItemName).setDisabled(true)

 

// 设置值

viewmodel.get(cItemName).setValue('设置的值')

## [](#6-faq)6. FAQ

**常见问题1 ?**

解答内容...

**常见问题2 ?**

解答内容...