---
title: "多行文本框 TextArea"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--text-area"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 多行文本框 TextArea

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--text-area | 所属：YNF-组件

# [](#多行文本框-textarea)多行文本框 TextArea

用于接受用户输入的多行文本

import { TextArea } from "ynf-lib-base"

## [](#何时使用)何时使用

- 表单输入: 在需要用户输入较长文本的表单中使用，例如评论、反馈、描述等, 提供了一个可调整大小的文本区域，以便用户输入较长的内容。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||文本框样式||cStyle||Style||文本框样式||-|||
||标题垂直位置||labelAlign||string||标题在垂直方向上的位置, 只有开启显示标题时生效||start|||
||最大输入长度||maxLength||number||设置能输入的字符数长度||200|||
||自适应内容高度||autoSize||boolean||自适应内容高度, 不开启时组件高度为样式设置高度, 开启后样式高度失效, 开启后可设置minRows和maxRows, 不设置maxRows和minRows时组件高度根据内容动态计算, 性能会有所损耗||false|||
||最大显示行数||maxRows||number||开启autoSize后生效, 默认跟随内容高度变化, 如有设定值则超出设定值会显示滚动条||-|||
||最小显示行数||minRows||number||开启autoSize后生效, 默认为2||2|||
||显示清空按钮||showClose||boolean||开启后显示清除按钮, 鼠标悬浮时显示, 点击清除输入框内容||true|||
||显示最大允许输入长度||showMaxLabel||boolean||开启后输入框右下角显示最大允许输入长度和已输入内容长度||true|||