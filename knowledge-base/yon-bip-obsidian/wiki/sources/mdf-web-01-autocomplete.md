---
title: "自动完成 AutoComplete"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-autocomplete"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 自动完成 AutoComplete

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-autocomplete | 所属：Web组件

# [](#自动完成-autocomplete)自动完成 AutoComplete

## [](#1-功能说明)1. 功能说明

根据用户的输入，进行自动匹配显示列表，用户可以进行按需选择自己需要的内容

## [](#2-效果展示)2. 效果展示

![](data:image/png;base64,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)

## [](#3-基本属性)3. 基本属性

### [](#31-在单据中)3.1. 在单据中

||属性名称||属性含义||值类型||属性说明|
||addonBefore||带标签的 input，设置前置标签||element|||
||addonAfter||带标签的 input，设置后置标签||element|||
||onPressEnter||按下回车的回调||function|||
||value||传入输入框的值||string|||

## [](#4-扩展属性-cstyle)4. 扩展属性 cStyle

单据在cStyle中、查询区在extendField中配置属性，如：{"autoSize":true}

||属性名称||属性含义||值类型||属性说明|
||after||组件右侧内容||||位于组件的后置内容|
||before||组件左侧内容||||位于组件的前置内容|
||bottom||组件下方内容||||位于组件下方的内容|

## [](#5-控制示例)5. 控制示例

### [](#51-在卡片中)5.1. 在卡片中

想要控制组件的状态，需要先拿到组件的模型，在MDF框架中，每个组件都会绑定一个模型，我们可以在扩展脚本中通过**viewmodel.get(cItemName) 的方式获取到想要操作组件的模型，利用模型的API进行组件的控制，其中cItemName为该组件对应**billitem_base表中的cItemName

**示例：**

// 设置条件隐藏

viewmodel.get(cItemName).setVisible(false)

// 设置条件禁用

viewmodel.get(cItemName).setDisabled(true)

<Autocompletemultilang>是自动补全的多语组件，api同上。