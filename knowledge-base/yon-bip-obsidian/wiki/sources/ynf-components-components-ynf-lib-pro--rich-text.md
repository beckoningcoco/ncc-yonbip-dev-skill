---
title: "富文本 RichText"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-pro--rich-text"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 富文本 RichText

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-pro--rich-text | 所属：YNF-组件

# [](#富文本-richtext)富文本 RichText

基于TinyMCE封装的富文本组件, 是一个轻量级的, 基于浏览器的, 所见即所得的编辑器

import { RichText } from "ynf-lib-pro"

## [](#何时使用)何时使用

- 网页编辑器：用于创建和编辑网页内容，包括文字、图片、视频等元素；
- 博客编辑器：供博主撰写和编辑博客文章，包括格式化文字、插入图片、链接等功能;
- 电子邮件编辑器：用于撰写电子邮件内容，支持添加附件、格式化文字等功能;
- 内容管理系统（CMS）编辑器：用于管理网站内容的编辑器，可以让用户轻松地发布和编辑文章、页面等内容;
- 在线教育平台：用于创建和编辑课程内容，包括文字、图像、视频等元素;
- 社交媒体发布器：提供给用户发布社交媒体内容的编辑器，支持文字、图片、视频等多媒体元素的插入和编辑。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||预览态水平居中||horizontally||boolean||预览态水平居中||false|||
||预览态垂直居中||verticalCenter||boolean||预览态垂直居中||false|||
||值变更回调||onChange||||值变更回调||-|||
||文件选择回调||filePickerCallback||||文件选择回调||-|||