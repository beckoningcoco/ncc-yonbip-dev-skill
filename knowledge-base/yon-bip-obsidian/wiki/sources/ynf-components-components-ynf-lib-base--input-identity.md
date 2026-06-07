---
title: "证件号 InputIdentity"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--input-identity"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 证件号 InputIdentity

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--input-identity | 所属：YNF-组件

# [](#证件号-inputidentity)证件号 InputIdentity

用于输入和验证不同类型证件号码的组件。它支持身份证、军官证和护照三种常见证件类型的输入，并提供相应的格式校验功能。

import { InputIdentity } from "ynf-lib-base"

## [](#何时使用)何时使用

- 表单输入: 身份信息收集，适用于需要用户提供身份证明的场景，如注册、实名认证、订票等服务;
- 交互控制: 通过自定义正则, 可以方便用户输入和验证不同国家的护照号码

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||文本框样式||cStyle||Style||文本框样式||-|||
||是否校验||check||boolean||是否要开启自定义格式校验, 开启后可以通过配置正则字符串来校验用户输入||false|||
||正则字符串||regText||string||用来自定义校验用户输入, 只有开启"是否校验(check)"属性时才生效|||||
||校验错误提示||regRuleText||string||自定义校验不通过时的错误提示信息, 只有开启"是否校验(check)"属性时才生效|||||
||显示清空按钮||showClose||boolean||显示清空按钮||true|||