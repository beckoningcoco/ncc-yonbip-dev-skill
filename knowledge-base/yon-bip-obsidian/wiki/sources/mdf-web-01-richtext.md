---
title: "富文本 RichText"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-richtext"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 富文本 RichText

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-richtext | 所属：Web组件

# [](#富文本-richtext)富文本 RichText

## [](#1-功能说明)1. 功能说明

通过鼠标或键盘输入内容。
上传图片：

- 

支持截图直接粘贴（Ctrl+V）；

- 

支持本地上传图片；

- 

支持批量上传图片；

上传视频：

- 

网址上传；

- 

本地视频上传；（注：新版tinper富文本暂未实现该功能）

## [](#2-效果展示)2. 效果展示

### [](#21-旧版ueditor富文本)2.1. 旧版UEditor富文本

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/RichTextfuwenben_image1.645015b4.png)

### [](#22-新版tinper富文本)2.2. 新版tinper富文本

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/RichTextfuwenben_image2.0bbc548f.png)

## [](#3-基本属性)3. 基本属性

### [](#31-在单据中)3.1. 在单据中

||属性名称||属性含义||值类型||属性说明|
||cShowCaption||标题||string|||
||visible||是否显示||boolean||true-显示 false-隐藏|
||readOnly||只读||boolean||true-只读 ，false - 非只读|
||cStyle||扩展属性||string||所有的扩展属性都配在这个属性中|

## [](#4-扩展属性-cstyle)4. 扩展属性 cStyle

单据在cStyle中、查询区在extendField中配置属性，如：{"className": ""}

||属性名称||属性含义||值类型||属性说明|
||className||扩展class类名||string||用来处理扩展样式|
||font_family_formats||字体表||string||自定义字体列表例:微软雅黑=Microsoft YaHei;方正楷体简体=方正楷体简体;宋体=SimSun;黑体=SimHei;仿宋=FangSong;楷体=KaiTi;隶书=LiSu;幼圆=YouYuan;|
||usePrivateBucket||图片上传开启私有桶||boolean||注：新版Tinper富文本支持该属性，老版UEdtior富文本不支持配置开启私有桶|

## [](#5-控制示例)5. 控制示例

[SimpleModel 简单模型](#/api/02-simple-model)

### [](#51-在卡片中)5.1. 在卡片中

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

## [](#6-设置富文本容器的高度)6. 设置富文本容器的高度

**旧版UEditor富文本设置方式：**

editor.setHeight(number);

viewmodel.get(cItemName)?.on('afterEditorReady', function ({ editorId }) {

 window.UE?.getEditor(editorId)?.setHeight(document.body.offsetHeight - 280)

})

**新版tinper富文本设置方式：**

扩展属性cStyle中设置height

## [](#7-设置富文本字号的默认大小)7. 设置富文本字号的默认大小

### [](#71-旧版ueditor富文本设置默认字号方式)7.1. **旧版UEditor富文本设置默认字号方式：**

window.UE?.getEditor(editorId)?.execCommand('fontsize','24px')

新版tinper富文本暂不支持设置富文本字体的默认大小

## [](#8-定制工具栏)8. 定制工具栏

工具栏上的按钮列表可以自定义配置,只需要通过修改配置项就可以实现需求

### [](#81-旧版ueditor工具栏配置方式)8.1. 旧版UEditor工具栏配置方式：

把要显示的项配置在cStyle的toolbars数组里，会做覆盖，如果不配置就显示默认的：
const cStyle = '{"toolbars":["fullscreen","source","bold"]}'

默认支持的：

['fullscreen', 'source', 'undo', 'redo', 'insertunorderedlist','insertorderedlist', 'link', 'unlink', 'help', 'insertvideo','simpleupload', 'insertimage', 'emotion', 'pagebreak', 'date','bold', 'italic', 'fontborder', 'strikethrough',
'underline','forecolor','fontfamily','fontsize','paragraph','justifyleft','justifycenter','justifyright','justifyjustify','rowspacingbottom','rowspacingtop','lineheight']
附：工具栏图标字段说明：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/RichTextfuwenben_image3.22f276d5.png)

### [](#82-新版tinper富文本工具栏配置方式)8.2. 新版tinper富文本工具栏配置方式：

把要显示的项配置在cStyle的toolbars数组里，会做覆盖，如果不配置就显示默认的：

const cStyle = '{"toolbars":["fullscreen", "|", "undo", "redo", "|", "formatpainter", "removeformat", "|", "blocks", "fontfamily", "fontsize", "bold", "italic", "underline", "strikethrough", "|", "forecolor", "backcolor", "|", "alignleft", "aligncenter", "alignright", "alignjustify", "lineheight", "outdent", "indent", "|", "bullist", "numlist", "|", "link", "unlink", "|", "table", "image", "media", "|", "hr", "pagebreak"]}'

注：竖线用以toolbars分组，可不配置竖线，不配置则不进行分组。

## [](#9-xss过滤)9. XSS过滤

如富文本内图片src保存被过滤掉，可能是YMS为了防XSS攻击给过滤了，需配置白名单

参考文档：[yms-security使用指南](https://uap-wiki.yyrd.com/x/_VTICw)