---
title: "文本框 Input"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--input"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 文本框 Input

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--input | 所属：YNF-组件

# [](#文本框-input)文本框 Input

最基础的文本输入控件

import { Input } from "ynf-lib-base"

## [](#何时使用)何时使用

- 表单输入: 用于接收用户输入的简短文本、数字或其他数据;
- 交互控制: 通过自定义事件处理和正则属性, 校验用户输入

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||文本框样式||cStyle||Style||文本框样式||-|||
||格式类型||subuitype||string||除自定义类型外其他类型会自动根据类型进行输入内容校验||text|||
||最大输入长度||maxLength||number||超出设定的长度不可输入||200|||
||正则字符串||regText||string||用来自定义校验用户输入, 只有开启"开启校验(check)"属性时才生效||-|||
||开启加密||encrypt||boolean||开启后不会明文显示用户输入内容, 可以用于密码框等||false|||
||开启校验||check||boolean||是否要开启自定义格式校验, 开启后可以通过配置正则字符串来校验用户输入||false|||
||校验错误提示||regRuleText||string||自定义校验不通过时的错误提示信息, 只有开启"开启校验(check)"属性时才生效|||||
||后缀||addonAfter||string||设置后缀, 显示在input框内的最右侧||-|||
||前缀||addonBefore||string||设置前缀, 显示在input框内的最左侧||-|||
||显示清空按钮||showClose||boolean||显示清空按钮||true|||