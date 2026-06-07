---
title: "邮箱 InputEmail"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--input-email"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 邮箱 InputEmail

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--input-email | 所属：YNF-组件

# [](#邮箱-inputemail)邮箱 InputEmail

用于在用户输入邮箱地址时提供便捷选择邮箱后缀的组件。允许用户输入他们的邮箱用户名部分，并从预定义的邮箱后缀列表中选择或自定义邮箱地址。

import { InputEmail } from "ynf-lib-base"

## [](#何时使用)何时使用

- 表单输入: 适用于需要用户提供邮箱地址的任何表单，如注册新账号或登录现有账号时

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||文本框样式||cStyle||Style||文本框样式||-|||
||邮箱后缀||emailDomainList||string||自定义所有邮箱后缀的列表, 格式为用逗号分隔的字符串||yonyou.com, 163.com, qq.com, gmail.com, yahoo.com, msn.com, hotmail.com, aol.com, ask.com, live.com, 0355.net, 126.com, outlook.com|||
||输入长度||maxLength||number||设置用户输入的最大长度||20|||
||显示清空按钮||showClose||boolean||显示清空按钮||true|||