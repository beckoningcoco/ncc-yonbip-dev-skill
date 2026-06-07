---
title: "富文本 RichText"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/01-richtext"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 富文本 RichText

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/01-richtext | 所属：移动组件

# [](#富文本-richtext)富文本 RichText

## [](#1-功能说明)1. 功能说明

通过鼠标或键盘输入内容。

上传图片：

- 支持本地上传图片；

## [](#2-效果图)2. 效果图

### [](#21-老富文本quill)2.1 老富文本（quill）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/RichTextfuwenbenyidong-image1.23d15de9.png)

### [](#22-新富文本ckeditor)2.2 新富文本（ckeditor）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/RichTextfuwenbenyidong-image2.518d7edc.png)

## [](#3-基本属性)3. 基本属性

### [](#31-在单据中)3.1 在单据中

||属性名称||属性含义||值类型||属性说明|
||cShowCaption||标题||string|||
||visible||是否显示||boolean||true-显示 false-隐藏|
||readOnly||只读||boolean||true-只读 ，false - 非只读|
||cStyle||扩展属性||string||所有的扩展属性都配在这个属性中|

## [](#4-扩展属性-cstyle)4. 扩展属性 cStyle

单据在cStyle中、查询区在extendField中配置属性，如：{"className": ""}

||属性名称||属性含义||值类型||属性说明|
||className||扩展class类名||string||用来处理扩展样式|

## [](#5-控制示例)5. 控制示例

[SimpleModel 简单模型](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=20774667)

### [](#51-在卡片中)5.1 在卡片中

想要控制组件的状态，需要先拿到组件的模型，在MDF框架中，每个组件都会绑定一个模型，我们可以在扩展脚本中通过**viewmodel.get(cItemName)的方式获取到想要操作组件的模型，利用模型的API进行组件的控制，其中cItemName为该组件对应**billitem_base表中的cItemName

**示例：**

// 设置条件隐藏 viewmodel.get(cItemName).setVisible(false)

// 设置条件只读 viewmodel.get(cItemName).setReadOnly(true)

// 设置条件禁用 viewmodel.get(cItemName).setDisabled(true)

// 设置提示信息 viewmodel.get(cItemName).setState('placeholder', '提示信息')

## [](#6-定制工具栏)6. 定制工具栏

### [](#61-老富文本定制工具栏)6.1 老富文本定制工具栏

const cStyle = 

'{"toolbars":{"toolbar":["bold","italic","underline","strike",{"header":[1,2,3,4,5,6,false]},{"list":"ordered"},{"list":"bullet"},{"indent":"-1"},{"indent":"+1"},{"script":"sub"},{"script":"super"},{"color":[],"background":[],"align":[],"link","image","clean"]}}';

如不想显示图片上传，可将上面配置中image去掉

{

 "toolbars": {

 "toolbar":[

 "bold",

 "italic",

 "underline",

 "strike",

 {"header":[1,2,3,4,5,6,false]},

 {"list":"ordered"},

 {"list":"bullet"},

 {"indent":"-1"},

 {"indent":"+1"},

 {"script":"sub"},

 {"script":"super"},

 {"color":[]},

 {"background":[]},

 {"align":[]},

 "link",

 "image",

 "clean"

 ]

 }

}