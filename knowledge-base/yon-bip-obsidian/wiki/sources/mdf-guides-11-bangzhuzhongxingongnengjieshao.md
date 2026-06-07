---
title: "帮助中心功能介绍"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/11-bangzhuzhongxingongnengjieshao"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 8
---

# 帮助中心功能介绍

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/11-bangzhuzhongxingongnengjieshao | 所属：指南

# [](#帮助中心功能介绍)帮助中心功能介绍

样例地址：[https://xxx/mdf-node/meta/VoucherList/mdd_Voucher_introduce/?domainKey=iuap-metadata-mdd](https://xxx.yyuap.com/mdf-node/meta/VoucherList/mdd_Voucher_introduce/?domainKey=iuap-metadata-mdd)

注意：访问地址前先登录测试环境，任意账号租户即可。

## [](#1-基础属性)1. 基础属性

### [](#11-tablelayout的cstyle配置整体布局)1.1. tablelayout的cStyle配置（整体布局）

||属性名称||属性含义||值类型||属性说明|
||helpCard||卡片默认类名||string||自带卡片的背景色及默认样式，boxClass: 'helpCard'|
||render||tablelayout可以在浏览态、编辑态显示||boolean||false只在编辑态显示（默认），true各种状态显示|
||boxStyle||扩展样式||string||扩展样式，如color：red|
||close||是否显示关闭按钮||boolean||true显示，false不显示（默认）|
||collapse||是否显示右上角折叠组件||boolean||false不显示（默认），true显示|
||collapseContent||折叠后显示的内容||string||配合collapse使用，收起后要显示的内容|
||cancelHelpCenter||点击关闭按钮是否调起帮助中心||boolean||false启用（默认），true不启用|

### [](#12-htmlcontent的cstyle配置标题与文本)1.2. htmlcontent的cStyle配置（标题与文本）

||属性名称||属性含义||值类型||属性说明|
||helpTitle||卡片默认一级标题类名||string||自带卡片一级标题样式"classname": "helpTitle"|
||helpText||卡片默认文本类名||string||自带卡片文本样式"classname": "helpText"|
||value||内容显示||string||文本组件要展示的内容"value":"我是标题"|
||data-event||领域扩展穿透事件||string||穿透事件示例，<a data-event='click1'>更多详细介绍</a>|

### [](#13-icons与image的cstyle配置图标与图片)1.3. icons与image的cStyle配置（图标与图片）

||属性名称||属性含义||值类型||属性说明|
||helpIcon||卡片图标默认类名||string||卡片icon图标默认样式|
||helpImg||卡片图片默认类名||string||卡片图片默认样式|
||showPreviewImage||是否可以预览大图||boolean||false默认不开启，true|

### [](#14-帮助助手对接)1.4. 帮助助手对接

唤起帮助中心方法

cb.utils.getHelpCenter()

## [](#2-类型格式配置)2. 类型格式配置

### [](#21-纯文字)2.1. 纯文字

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/bangzhuzhongxingongnengjieshao_image1.a77003da.png)

{

 cControlType: 'tablelayout',

 cDataSourceName: 'GT95842AT9.GT95842AT9.ceshi0914',

 cStyle: { boxClass: 'helpCard', boxStyle: {}, render: true, close: true },

 iCols: 5,

 containers: [{

 cControlType: 'tableItem',

 iCols_tb: '1',

 iRows_tb: '1',

 rowSpan: '5',

 colSpan: '15',

 controls: [{

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 "cStyle": "{\"classname\":\"helpTitle\",\"style\":{},\"value\":\"我是标题\"}",

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "htmlcontent"

 }, {

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 "cStyle": "{ \"classname\": \"helpText\", \"style\": {},\"value\":\"您可以在科目分类选择影响因素，科目对照编辑选择科目分类时会自动带出现在设置的影响因素；您也可以不在科目分类中设置影响因素，直接在科目对照编辑中直接关联影响因素。<a data-event='click1'>更多详细介绍</a>\"}",

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "htmlcontent"

 }]

 }]

 }

### [](#22-文字图标穿透)2.2. 文字+图标+穿透

穿透事件

viewModel.on('click1', function(){ })

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/bangzhuzhongxingongnengjieshao_image2.df5a1545.png)

{

 cControlType: 'tablelayout',

 cDataSourceName: 'GT95842AT9.GT95842AT9.ceshi0914',

 cStyle: { boxClass: 'helpCard', boxStyle: {background:'#f2f6fe',border:'none'}, render: true },

 iCols: 5,

 containers: [{

 cControlType: 'tableItem',

 iCols_tb: '1',

 iRows_tb: '1',

 rowSpan: '5',

 colSpan: '1',

 controls: [{

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "level": 4,

 "YTENANT_ID": "～",

 "value": 'gantanhao',

 "cControlType": "icons",

 "iColWidth": 1,

 "UI#metaDataField": "new1",

 "bShowIt": true,

 "cStyle": "{ \"classname\": \"helpIcon\", \"style\": {} }",

 "cItemName": "new1",

 "uncopyable": false,

 "cFieldName": "new1",

 "authLevel": 5,

 "uititle": "字段1",

 "cCaption": "字段1"

 }]

 }, {

 cControlType: 'tableItem',

 iCols_tb: '2',

 iRows_tb: '1',

 rowSpan: '1',

 colSpan: '15',

 controls: [{

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 "cStyle": "{ \"classname\": \"helpTitle\", \"style\": {},\"value\": \"如何设置科目分类？\"}",

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "htmlcontent"

 }, {

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 "cStyle": "{ \"classname\": \"helpText\", \"style\": {},\"value\":\"您可以在科目分类选择影响因素，科目对照编辑选择科目分类时会自动带出现在设置的影响因素；您也可以不在科目分类中设置影响因素，直接在科目对照编辑中直接关联影响因素。<a data-event='click1'>更多详细介绍</a>\"}",

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "htmlcontent"

 }]

 }]

 }

### [](#23-文字插图功能入口)2.3. 文字+插图+功能入口

图片存储路径：领域项目 /src/client/web/styles/default/images

||属性名称||属性含义||值类型||属性说明|
||src||要显示的图片名称||string||图片的地址"src": "icon-logo.png"（文件名称）|
||prefix||图片的路径||boolean||true获取领域的路径（建议用这种方式，图片存项目中），false（默认）注：取值为false时，src可以用https地址的图片（直接用https地址涉及到外网地址访问问题）|

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/bangzhuzhongxingongnengjieshao_image3.93d9f918.png)

{

 cControlType: 'tablelayout',

 cDataSourceName: 'GT95842AT9.GT95842AT9.ceshi0914',

 cStyle: { boxClass: 'helpCard', boxStyle: { background: '#fff9ec', border: 'none' }, render: true },

 iCols: 5,

 containers: [{

 cControlType: 'tableItem',

 iCols_tb: '1',

 iRows_tb: '1',

 rowSpan: '1',

 colSpan: '11',

 controls: [{

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 "cStyle": "{ \"classname\": \"helpTitle\", \"style\": {},\"value\": \"如何设置科目分类？\"}",

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "htmlcontent"

 }, {

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 "cStyle": "{ \"classname\": \"helpText\", \"style\": {},\"value\":\"您可以在科目分类选择影响因素，科目对照编辑选择科目分类时会自动带出现在设置的影响因素；您也可以不在科目分类中设置影响因素，直接在科目对照编辑中直接关联影响因素。<a data-event='click1'>更多详细介绍</a>\"}",

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "htmlcontent"

 }, {

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",p

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 cStyle: { classname: 'helpText', style: {}, value: '2、您可以在科目分类选择影响因素 ，科目对照编辑选择科目分类时会自动带出现在设置的影响因素；您也可以不在科目分类中设置影响因素，直接在科目对照编辑中直接关联影响因素。<a data-event='click1'>更多详细介绍</a>' },

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "htmlcontent"

 }]

 }, {

 cControlType: 'tableItem',

 iCols_tb: '1',

 iRows_tb: '2',

 rowSpan: '1',

 colSpan: '11',

 containers: [{

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "Toolbar",

 controls: [{

 cItemName: "btnReg",

 cCaption: "业务事项注册",

 cShowCaption: "业务事项注册",

 bEnum: false,

 cControlType: "primarybutton",

 authId: "7dc65f13cmdEdit",

 authLevel: 3,

 bEnableFormat: false,

 cName: "btnEdit",

 cSubId: "GT14530AT5",

 enterDirection: 0,

 iOrder: 20,

 iStyle: 0,

 iSystem: 1,

 id: 10599026,

 key: "Control.ToolbarItem.10599026",

 ytenant_id: "xx",

 }, {

 cItemName: "btnReg",

 cCaption: "功能入口一",

 cShowCaption: "功能入口一",

 bEnum: false,

 cControlType: "button",

 authId: "7dc65f13cmdEdit",

 authLevel: 3,

 type: 'text',

 bEnableFormat: false,

 icon: "jiezhang-liebiao",

 cName: "btnEdit",

 cSubId: "GT14530AT5",

 enterDirection: 0,

 iOrder: 20,

 iStyle: 0,

 iSystem: 1,

 id: 10599026,

 }]

 }]

 }, {

 cControlType: 'tableItem',

 iCols_tb: '12',

 iRows_tb: '1',

 rowSpan: '5',

 colSpan: '5',

 controls: [{

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "level": 4,

 "value": 'gantanhao',

 "cControlType": "image",

 "iColWidth": 1,

 "UI#metaDataField": "new1",

 "bShowIt": true,

 "prefix": true, // 必须配置才会取领域的地址

 cStyle: { className: 'helpImg', style: {} },

 "src": "icon-logo.png",

 "cItemName": "new1",

 "uncopyable": false,

 "cFieldName": "new1",

 "authLevel": 5,

 "uititle": "字段1",

 "cCaption": "字段1"

 }]

 }]

 }

### [](#24-文字视频案例功能入口)2.4. 文字+视频案例+功能入口

视频支持ogg、mp4、webm格式

Ogg = 带有 Theora 视频编码 + Vorbis 音频编码
MPEG4 = 带有 **H.264 视频编码 + AAC 音频编码**
WebM = 带有 VP8 视频编码 + Vorbis 音频编码

1、视频存储路径：

领域项目 /src/client/web/styles/default/videos，同时设置prefix为true，
也可支持外链形式不 需要设置prefix，配置src为视频名称，示例："src":
"video.mp4"

2、视频封面存储路径：

同上，配置videoCover为视频封面图片 ，示例："videoCover":
"viedeo.png"

3、视频弹窗配置

工具栏Toolbar配置一个按钮（下图的功能入口按钮），动作为 videoModal

||属性名称||属性含义||值类型||属性说明|
||cParameter||配置弹窗视频名称||json||bill_command表中参数列{"videoModal":["XXX视频名称"]}|
||prefix||视频路径方式||json||cParameter里配置true默认领域本地路径，false外链形式|

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/bangzhuzhongxingongnengjieshao_image4.467e70cf.png)

{

 cControlType: 'tablelayout',

 cDataSourceName: 'GT95842AT9.GT95842AT9.ceshi0914',

 cStyle: { boxClass: 'helpCard', boxStyle: { background: '#fff2f0', border: 'none' } },

 iCols: 5,

 containers: [{

 cControlType: 'tableItem',

 iCols_tb: '1',

 iRows_tb: '1',

 rowSpan: '1',

 colSpan: '11',

 controls: [{

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 "cStyle": "{ \"classname\": \"helpTitle\", \"style\": {},\"value\": \"如何设置科目分类？\"}",

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "htmlcontent"

 }, {

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 "cStyle": "{ \"classname\": \"helpText\", \"style\": {},\"value\":\"您可以在科目分类选择影响因素，科目对照编辑选择科目分类时会自动带出现在设置的影响因素；您也可以不在科目分类中设置影响因素，直接在科目对照编辑中直接关联影响因素。<a data-event='click1'>更多详细介绍</a>\"}",

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "htmlcontent"

 }, {

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 cStyle: { classname: 'helpText', style: {}, value:'2、您可以在科目分类选择影响因素 ，科目对照编辑选择科目分类时会自动带出现在设置的影响因素；您也可以不在科目分类中设置影响因素，直接在科目对照编辑中直接关联影响因素。<a data-event='click1'>更多详细介绍</a>' },

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "htmlcontent"

 }]

 }, {

 cControlType: 'tableItem',

 iCols_tb: '1',

 iRows_tb: '2',

 rowSpan: '1',

 colSpan: '11',

 containers: [{

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "Toolbar",

 controls: [{

 cItemName: "btnReg",

 cCaption: "业务事项注册",

 cShowCaption: "业务事项注册",

 bEnum: false,

 cControlType: "primarybutton",

 authId: "7dc65f13cmdEdit",

 authLevel: 3,

 bEnableFormat: false,

 cName: "btnEdit",

 cSubId: "GT14530AT5",

 enterDirection: 0,

 iOrder: 20,

 iStyle: 0,

 iSystem: 1,

 id: 10599026,

 key: "Control.ToolbarItem.10599026",

 ytenant_id: "xx",

 }, {

 cItemName: "btnReg",

 cCaption: "功能入口一",

 cShowCaption: "功能入口一",

 bEnum: false,

 cControlType: "button",

 authId: "7dc65f13cmdEdit",

 authLevel: 3,

 type: 'text',

 bEnableFormat: false,

 icon: "jiezhang-liebiao",

 cName: "btnEdit",

 cSubId: "GT14530AT5",

 enterDirection: 0,

 iOrder: 20,

 iStyle: 0,

 iSystem: 1,

 id: 10599026,

 }]

 }]

 }, {

 cControlType: 'tableItem',

 iCols_tb: '12',

 iRows_tb: '1',

 rowSpan: '5',

 colSpan: '5',

 controls: [{

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "level": 4,

 "value": 'gantanhao',

 "cControlType": "video",

 "iColWidth": 1,

 "UI#metaDataField": "new1",

 "bShowIt": true,

 "prefix": true, // 必须配置才会取领域的地址

 "cStyle": "{ \"style\": {} }",

 "src": "video.mp4",

 "videoCover": "viedeo.png",

 "cItemName": "new1",

 "uncopyable": false,

 "cFieldName": "new1",

 "authLevel": 5,

 "uititle": "字段1",

 "cCaption": "字段1"

 }]

 }]

 }

### [](#25-页面级功能介绍--上文下图)2.5. 页面级功能介绍 / 上文下图

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/bangzhuzhongxingongnengjieshao_image5.165a265e.png)

{

 cControlType: 'tablelayout',

 cDataSourceName: 'GT95842AT9.GT95842AT9.ceshi0914',

 cStyle: { boxClass: 'helpCard', boxStyle: { backgroundImage: 'linear-gradient(0deg, #f8f8f8 33%, #fff 100%)' }, render: true },

 iCols: 5,

 containers: [{

 cControlType: 'tableItem',

 iCols_tb: '1',

 iRows_tb: '1',

 rowSpan: '3',

 colSpan: '16',

 controls: [{

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 "cStyle": "{ \"classname\": \"helpTitle\", \"style\": {},\"value\": \"如何设置科目分类？\"}",

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "htmlcontent"

 }, {

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 "cStyle": "{ \"classname\": \"helpText\", \"style\": {},\"value\":\"您可以在科目分类选择影响因素，科目对照编辑选择科目分类时会自动带出现在设置的影响因素；您也可以不在科目分类中设置影响因素，直接在科目对照编辑中直接关联影响因素。<a data-event='click1'>更多详细介绍</a>\"}",

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "htmlcontent"

 }, {

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 cStyle: { classname: 'helpSecondTitle', style: {}, value: '第一步：新建应用注册' },

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "htmlcontent"

 }, {

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 cStyle: { classname: 'helpText', style: {}, value: '请先点击左侧侧边栏中的「应用注册」按钮，注册一个应用' },

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "htmlcontent"

 }, {

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 cStyle: { classname: 'helpSecondTitle', style: {},value: '第一步：新建应用注册' },

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "htmlcontent"

 }, {

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 cStyle: { classname: 'helpText', style: {}, value: '请先点击左侧侧边栏中的「应用注册」按钮，注册一个应用' },

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "htmlcontent"

 }]

 }, {

 cControlType: 'tableItem',

 iCols_tb: '1',

 iRows_tb: '2',

 rowSpan: '2',

 colSpan: '16',

 containers: [{

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "Toolbar",

 controls: [{

 cItemName: "btnReg",

 cCaption: "业务事项注册",

 cShowCaption: "业务事项注册",

 bEnum: false,

 cControlType: "primarybutton",

 authId: "7dc65f13cmdEdit",

 authLevel: 3,

 bEnableFormat: false,

 cName: "btnEdit",

 cSubId: "GT14530AT5",

 enterDirection: 0,

 iOrder: 20,

 iStyle: 0,

 iSystem: 1,

 id: 10599026,

 key: "Control.ToolbarItem.10599026",

 ytenant_id: "xx",

 }, {

 cItemName: "btnReg",

 cCaption: "功能入口一",

 cShowCaption: "功能入口一",

 bEnum: false,

 cControlType: "button",

 authId: "7dc65f13cmdEdit",

 authLevel: 3,

 type: 'text',

 bEnableFormat: false,

 icon: "jiezhang-liebiao",

 cName: "btnEdit",

 cSubId: "GT14530AT5",

 enterDirection: 0,

 iOrder: 20,

 iStyle: 0,

 iSystem: 1,

 id: 10599026,

 }]

 }]

 }, {

 cControlType: 'tableItem',

 iCols_tb: '1',

 iRows_tb: '4',

 rowSpan: '3',

 colSpan: '16',

 controls: [{

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "level": 4,

 "value": 'gantanhao',

 "cControlType": "image",

 "iColWidth": 1,

 "UI#metaDataField": "new1",

 "bShowIt": true,

 "prefix": true,

 cStyle: { className: 'helpImg', style: { marginTop: '20px' } },

 "src": "icon-logo.png",

 "cItemName": "new1",

 "uncopyable": false,

 "cFieldName": "new1",

 "authLevel": 5,

 "uititle": "字段1",

 "cCaption": "字段1"

 }]

 }]

 }

### [](#26-页面级功能介绍--左文右图)2.6. 页面级功能介绍 / 左文右图

{

 cControlType: 'tablelayout',

 cDataSourceName: 'GT95842AT9.GT95842AT9.ceshi0914',

 cStyle: { boxClass: 'helpCard', boxStyle: { backgroundImage: 'linear-gradient(0deg, #f8f8f8 33%, #fff 100%)' }, render: true },

 iCols: 5,

 containers: [{

 cControlType: 'tableItem',

 iCols_tb: '1',

 iRows_tb: '1',

 rowSpan: '1',

 colSpan: '8',

 controls: [{

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 "cStyle": "{ \"classname\": \"helpTitle\", \"style\": {},\"value\": \"如何设置科目分类？\"}",

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "htmlcontent"

 }, {

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 "cStyle": "{ \"classname\": \"helpText\", \"style\": {},\"value\":\"您可以在科目分类选择影响因素，科目对照编辑选择科目分类时会自动带出现在设置的影响因素；您也可以不在科目分类中设置影响因素，直接在科目对照编辑中直接关联影响因素。<a data-event='click1'>更多详细介绍</a>\"}",

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "htmlcontent"

 }, {

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 cStyle: { classname: 'helpSecondTitle', style: {}, value: '第一步：新建应用注册' },

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "htmlcontent"

 }, {

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 cStyle: { classname: 'helpText', style: {}, value: '请先点击左侧侧边栏中的「应用注册」按钮，注册一个应用' },

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "htmlcontent"

 }, {

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 cStyle: { classname: 'helpSecondTitle', style: {}, value: '第一步：新建应用注册' },

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "htmlcontent"

 }, {

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 cStyle: { classname: 'helpText', style: {}, value: '请先点击左侧侧边栏中的「应用注册」按钮，注册一个应用' },

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "htmlcontent"

 }]

 }, {

 cControlType: 'tableItem',

 iCols_tb: '1',

 iRows_tb: '2',

 rowSpan: '1',

 colSpan: '8',

 containers: [{

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "Toolbar",

 controls: [{

 cItemName: "btnReg",

 cCaption: "业务事项注册",

 cShowCaption: "业务事项注册",

 bEnum: false,

 cControlType: "primarybutton",

 authId: "7dc65f13cmdEdit",

 authLevel: 3,

 bEnableFormat: false,

 cName: "btnEdit",

 cSubId: "GT14530AT5",

 enterDirection: 0,

 iOrder: 20,

 iStyle: 0,

 iSystem: 1,

 id: 10599026,

 key: "Control.ToolbarItem.10599026",

 ytenant_id: "xx",

 }, {

 cItemName: "btnReg",

 cCaption: "功能入口一",

 cShowCaption: "功能入口一",

 bEnum: false,

 cControlType: "button",

 authId: "7dc65f13cmdEdit",

 authLevel: 3,

 type: 'text',

 bEnableFormat: false,

 icon: "jiezhang-liebiao",

 cName: "btnEdit",

 cSubId: "GT14530AT5",

 enterDirection: 0,

 iOrder: 20,

 iStyle: 0,

 iSystem: 1,

 id: 10599026,

 }]

 }]

 }, {

 cControlType: 'tableItem',

 iCols_tb: '9',

 iRows_tb: '1',

 rowSpan: '3',

 colSpan: '8',

 controls: [{

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "level": 4,

 "value": 'gantanhao',

 "cControlType": "image",

 "iColWidth": 1,

 "UI#metaDataField": "new1",

 "bShowIt": true,

 "prefix": true,

 cStyle: { className: 'helpImg', style: { } },

 "src": "icon-logo.png",

 "cItemName": "new1",

 "uncopyable": false,

 "cFieldName": "new1",

 "authLevel": 5,

 "uititle": "字段1",

 "cCaption": "字段1"

 }]

 }]

 }

### [](#27-页面级功能介绍--视频案例)2.7. 页面级功能介绍 / 视频案例

{

 cControlType: 'tablelayout',

 cDataSourceName: 'GT95842AT9.GT95842AT9.ceshi0914',

 cStyle: { boxClass: 'helpCard', boxStyle: { backgroundImage: 'linear-gradient(0deg, #f8f8f8 33%, #fff 100%)' }, render: true },

 iCols: 5,

 containers: [{

 cControlType: 'tableItem',

 iCols_tb: '1',

 iRows_tb: '1',

 rowSpan: '1',

 colSpan: '8',

 controls: [{

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 "cStyle": "{ \"classname\": \"helpTitle\", \"style\": {},\"value\": \"如何设置科目分类？\"}",

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "htmlcontent"

 }, {

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 cStyle: { classname: 'helpText', style: {}, value:'您可以在科目分类选择影响因素 ，科目对照编辑选择科目分类时会自动带出现在设置的影响因素；您也可以不在科目分类中设置影响因素，直接在科目对照编辑中直接关联影响因素' },

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "htmlcontent"

 }, {

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "value": "第一步：新建应用注册",

 "isExport": true,

 "uiTable": "BillItemBase",

 cStyle: { classname: 'helpSecondTitle', style: {} },

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "htmlcontent"

 }, {

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 cStyle: { classname: 'helpText', style: {}, value: '请先点击左侧侧边栏中的「应用注册」按钮，注册一个应用' },

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "htmlcontent"

 }, {

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "value": "第一步：新建应用注册",

 "isExport": true,

 "uiTable": "BillItemBase",

 cStyle: { classname: 'helpSecondTitle', style: {}, value: '第一步：新建应用注册' },

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "htmlcontent"

 }, {

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 cStyle: { classname: 'helpText', style: {}, value: '请先点击左侧侧边栏中的「应用注册」按钮，注册一个应用' },

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "htmlcontent"

 }]

 }, {

 cControlType: 'tableItem',

 iCols_tb: '1',

 iRows_tb: '2',

 rowSpan: '1',

 colSpan: '8',

 containers: [{

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "iBillTplGroupId": "10042185",

 "iFieldType": 1,

 "bRowAuthDim": false,

 "level": 4,

 "isExport": true,

 "uiTable": "BillItemBase",

 "bExtend": false,

 "bMustSelect": true,

 "bEnableFormat": false,

 "cControlType": "Toolbar",

 controls: [{

 cItemName: "btnReg",

 cCaption: "业务事项注册",

 cShowCaption: "业务事项注册",

 bEnum: false,

 cControlType: "primarybutton",

 authId: "7dc65f13cmdEdit",

 authLevel: 3,

 bEnableFormat: false,

 cName: "btnEdit",

 cSubId: "GT14530AT5",

 enterDirection: 0,

 iOrder: 20,

 iStyle: 0,

 iSystem: 1,

 id: 10599026,

 key: "Control.ToolbarItem.10599026",

 ytenant_id: "xx",

 }, {

 cItemName: "btnReg",

 cCaption: "功能入口一",

 cShowCaption: "功能入口一",

 bEnum: false,

 cControlType: "button",

 authId: "7dc65f13cmdEdit",

 authLevel: 3,

 type: 'text',

 bEnableFormat: false,

 icon: "jiezhang-liebiao",

 cName: "btnEdit",

 cSubId: "GT14530AT5",

 enterDirection: 0,

 iOrder: 20,

 iStyle: 0,

 iSystem: 1,

 id: 10599026,

 }]

 }]

 }, {

 cControlType: 'tableItem',

 iCols_tb: '9',

 iRows_tb: '1',

 rowSpan: '3',

 colSpan: '8',

 controls: [{

 "bEnum": false,

 "nid": "nid_1640076576615_24",

 "bShowInRowAuth": false,

 "level": 4,

 "value": 'gantanhao',

 "cControlType": "video",

 "iColWidth": 1,

 "UI#metaDataField": "new1",

 "bShowIt": true,

 "prefix": true,

 cStyle: { className: 'helpImg', style: {} },

 "src": "icon-logo.mp4",

 "cItemName": "new1",

 "uncopyable": false,

 "cFieldName": "new1",

 "authLevel": 5,

 "uititle": "字段1",

 "cCaption": "字段1"

 }]

 }]

 }

## [](#3-相关组件文档)3. 相关组件文档

[TableLayout布局](#/components-web/03-tablelayout)

## [](#4-常见问题)4. 常见问题

1、H5中的video标签无法播放mp4文件

音频流是mp4a，视频流是H264，video标签是支持的。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/bangzhuzhongxingongnengjieshao_image6.f32ded0b.png)

音频流是mp4a，但视频流是mp4v，video标签是不支持的。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/bangzhuzhongxingongnengjieshao_image7.703849b9.png)

解决方法

利用格式工厂对视频，用h264视频编码格式重新编码，得到的视频就可以使用了。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/bangzhuzhongxingongnengjieshao_image8.9f105b4d.png)