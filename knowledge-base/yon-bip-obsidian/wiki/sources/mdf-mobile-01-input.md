---
title: "文本框 Input"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/01-input"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 文本框 Input

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/01-input | 所属：移动组件

# [](#文本框-input)文本框 Input

## [](#1-效果展示)1. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Inputwenbenkuang-image1.99684b65.png)

## [](#2-标准属性)2. 标准属性

||名称||含义||说明|
||名称||含义||说明|
||bCanModify||是否可编辑||可以配置format格式化，包括前缀prefix、后缀suffix|
||bIsNull||是否必输||true-非必输   false -必输|
||readOnly||只读|||
||disabled||禁用|||
||iMaxLength||最大长度||可输入最大的字符长度|
||cStyle||扩展属性|||
||cFormatData||format格式化，可配置前缀prefix/before、后缀suffix/after，后缀类型afterType||afterType:'unit'会显示为单位类型|

**注意：**

- 此处的属性对应**billitem_base**表中的字段，值类型为前端类型，可能与数据库中不匹配，如：前端的bIsNull是true/false，在数据库中是0/1

## [](#3-扩展属性-cstyle)3. 扩展属性 cStyle

在cStyle中配置属性，例：{"bShowVoice": true}

||名称||含义||说明|
||名称||含义||说明|
||bShowVoice||支持语音录入|||
||placeholder||提示文本|||
||className||扩展样式|||
||type||扩展input类型||比如 可配置password 支持密码类型|
||singleLine||标题和内容是否单行显示||false-上下显示； true-单选显示|
||txtStyle||浏览态试输入框文本样式||txtStyle:{color: '颜色(#999)',fontSize:'0.3rem'}可配好多，具体可以问下前端|
||iconTips||显示帮助图标，点击图标显示帮助信息||录入类组件均需支持字段级帮助（input、日期、级联、参照、证件、联系方式、枚举选择、图片、附件、文本域等等），点击目标对象出现文字提示，操作气泡弹出框外区域消失。|
||allowClear||显示删除图标，可清空输入框文本||文本清除功能，默认值为true|

## [](#4-扩展属性-cextprops)4. 扩展属性 cExtProps

可通过在cExtProps中配置

||名称||含义||说明|
||名称||含义||说明|
||singleLine||标题和内容是否单行显示||cExtProps: {"singleLine": true}|

## [](#5-控制示例)5. 控制示例

想要控制组件的状态，需要先拿到组件的模型，在MDF框架中，每个组件都会绑定一个模型，我们可以在扩展脚本中通过**viewmodel.get(cItemName)的方式获取到想要操作组件的模型，利用模型的API进行组件的控制，其中cItemName为该组件对应**billitem_base表中的cItemName

**示例：**

// 设置条件隐藏

viewmodel.get(cItemName).setVisible(false)

 

// 设置条件只读

viewmodel.get(cItemName).setReadOnly(true)

 

// 设置条件禁用

viewmodel.get(cItemName).setDisabled(true)

 

// 设置提示信息

viewmodel.get(cItemName).setState('placeholder', '提示信息')