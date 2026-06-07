---
title: "帮助标识 FieldHelp"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-fieldhelp"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 9
---

# 帮助标识 FieldHelp

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-fieldhelp | 所属：Web组件

# [](#帮助标识-fieldhelp)帮助标识 FieldHelp

## [](#1-功能说明)1. 功能说明

共有两个位置的帮助标识可供选择：

1、全局性帮助：需要对该录入框整体功能进行解释说明时，使用全局性帮助，
位置在录入框右侧；

2、Label帮助：需要对录入项标题（label文字）的含义进行解释说明时，使
用Label帮助，位置在Label文字的右侧

## [](#2-效果展示)2. 效果展示

只需简单的把字段名配置在cStyle中即可实现效果：

控制input的提示信息--->配置字段名称是： tips || text || tips_ori

控制label的提示信息--->配置字段名称是： label_tips

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/FieldHelpbangzhubiaoshi-image1.51b585a3.jpeg)

### [](#21-配置示例)2.1. 配置示例

input 后面的提示信息：cStyle: {"tips_ori":"最多输入255个字符","tips":"最多输入255个字符"}

label 后面的提示信息：cStyle: {"label_tips":"测试提示消息"}

### [](#22-控制示例)2.2. 控制示例

**隐藏label后的提示信息**

viewModel.get('XXX').setState('labelTipsHidden', true)

### [](#23-拓展属性)2.3. 拓展属性

基础控件支持文字帮助提示，在需要显示提示的控件上配置 cStyle
属性。以下配置均为 cStyle 中的属性。

trigger 设置为 click 时，
由于底层组件不支持，页面滚动时提示框不会跟随滚动。建议使用默认的 hover
形式，通过控制提示框大小达到显示全部内容的效果。

||属性||说明||属性值||默认值|
||属性||说明||属性值||默认值|
||titlename||提示标题||string||-|
||tips, text, tips_ori||提示内容||array string htmlElement||无提示文字~|
||trigger||触发显示方式||click hover||hoverhover|
||maxWidth||提示框宽度||number||300|
||maxHeight||提示框高度||number||260|
||placement||提示框弹出位置||top left right bottom topLeft topRight bottomLeft bottomRight leftTop leftBottom rightTop rightBottom||bottom|

### [](#24-支持的控件)2.4. 支持的控件

InputMultiLang Avatar CheckBox DatePicker TimePicker Formula Input
progressBar Radio ScanCode Select TagArea AMap AutoComplete
AutoCompleteMultiLang InputAddress InputEmail InputIdentity InputLink
InputNumber InputPhone Refer ReferTree ListRefer tag2 Mobile
PictureUpload QRcode Table

### [](#25-radio--checkbox-组件支持对单个选项配置帮助内容)2.5. Radio & CheckBox 组件支持对单个选项配置帮助内容

整体设计图：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/FieldHelpbangzhubiaoshi-image2.38f4d32b.jpeg)

字段说明：

||属性||说明||属性值|
||属性||说明||属性值|
||showGroupTips||控制整组的信息提示的配置是否开启||boolean (默认不展示：false)|
||label_tips||label标题右侧的配置tips||string|
||unFold||单个选项配置的帮助说明是否平铺||boolean|

若要展示单个radio后面的提示信息，在enumArray里每一项里配置tips属性即可，如果有中文后端无法翻译，需要通过扩展脚本地前端追加。

#### [](#251-单个选项配置帮助说明)2.5.1. 单个选项配置帮助说明

**展现形式1（平铺状态）：**

这里拿radio做展示说明，checkbox同理，配置好后展示状态如下图所示：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/FieldHelpbangzhubiaoshi-image3.37dd4822.png)

ExtProps设置扩展字段

enumArray:[

 {

 "nameType":"text",

 "value":"自动开启",

 "key":1,

 ...

 "tips":"自动开启提示说明"，

 "unFold": true

 },

 {

 "nameType":"text",

 "value":"手动开启",

 "key":2,

 ...

 "tips":"手动开启提示说明",

 "unFold": true

 }

]

**展现形式2（收起状态）：**

这里拿checkbox做展示说明，radio同理，配置好后展示状态如下图所示：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/FieldHelpbangzhubiaoshi-image4.e04238db.png)

**帮助说明里的值读取的是enumArray的tips属性，如果有中文后端无法翻译，需要通过扩展脚本地前端追加。：**

enumArray:[

 {

 "nameType":"text",

 "value":"未选中项",

 "key":1,

 ...

 "tips":"未选中项提示说明"

 },

 {

 "nameType":"text",

 "value":"已选中项",

 "key":2,

 ...

 "tips":"已选中项提示说明"

 }

]

#### [](#252-组选项配置帮助说明)2.5.2. 组选项配置帮助说明

**展现形式1（平铺状态）：**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/FieldHelpbangzhubiaoshi-image5.7852641b.png)

在cStyle上有个字段开关设置showGroupTips，默认值是false，不显示，如果显示需要配置上此字段，值改成true。

读取的值是：label_tips || tips || text || tips_ori
中的一个，配置一个即可，优先顺序从前往后。

cStyle = {"showGroupTips":true,"tips_ori":"对于组选项的帮助信息说明"}

**展现形式2（收起状态）：**

**为区分组和单个的帮助说明，摒弃了之前都放在右侧的场景，整组的提示需要放在label的右侧。**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/FieldHelpbangzhubiaoshi-image6.4611cd7c.png)

配置说明： cStyle = {"label_tips":"对于组选项的帮助信息说明"}

### [](#26-支持配置链接)2.6. 支持配置链接

展示形式：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/FieldHelpbangzhubiaoshi-image7.94b67630.png)

配置链接内容要放置在a标签中，cStyle = {"tips":"关联过得影响因素才可以选择影响因素关联"} 对应的回调函数，例如：

viewmodel.on('billno-events',function(){

 /**影响因素关联业务代码 */

})

## [](#3-提示信息平铺配置)3. 提示信息平铺配置

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/FieldHelpbangzhubiaoshi-image8.64f21df9.png)

cStyle里配置   
"tipSetting":{"tipPosition":"tipBottom","tipFlush":true},"tips":"最多输入255个字符"

||属性||说明||属性值|
||属性||说明||属性值|
||tipFlush||提示信息是否平铺展示||默认false（在帮助图标里展示），true平铺展示|
||tipPosition||提示信息相对于组件的平铺方向||tipBottom 底部展示，tipTop顶部展示，tipAfter后面展示|

## [](#4-弹出式气泡配置)4. 弹出式气泡配置

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/FieldHelpbangzhubiaoshi-image9.bd0822d4.png)

涉及组件：输入框、日期、时间、参照、下拉、单选、复选、数值

cStyle里配置  
 "tipFocus":true,"tips":"最多输入255个字符"

||属性||说明||属性值|
||属性||说明||属性值|
||tipFocus||是否开启弹出式气泡||默认false（不开启），true开启|

## [](#5-相关文档)5. 相关文档

- 

[《ButtonTips帮助》](#/components-web/02-button)

- 

[《查询区Tips帮助》](#/components-web/05-convenientquery)