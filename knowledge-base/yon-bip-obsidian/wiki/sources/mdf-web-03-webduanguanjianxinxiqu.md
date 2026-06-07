---
title: "--Web端关键信息区"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/03-webduanguanjianxinxiqu"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 8
---

# --Web端关键信息区

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/03-webduanguanjianxinxiqu | 所属：Web组件

# [](#web端关键信息区)Web端关键信息区

关键信息区仅支持在浏览态显示，编辑态不会显示

先看tablelayout布局组件文档，关键信息区不是个组件或容器，是通过tableLayout布局结合框架其它控件配置出的一个信息展示区。

## [](#1-仔细阅读)1. **仔细阅读**

考虑到各领域开发不是做前端的，不知道如何调布局调样式，平台这边特提供大致通用样式，考虑各领域布局不同，平台这边尽量实现大致的样式，细微的地方可能还是需要自己配下，望理解。
整体配置的思路，一定要先根据布局 配置结构 然后补样式

## [](#2-配置思路及具体步骤)2. **配置思路及具体步骤**

1
和最开始一样配置结构，这些还是一样，规定用下面的第一种方式配，更直观的布局结构请看tablelayout文档的图8，那个配置基本上能配大部分的结构。下面的第一种就是图8的稍微升级版。如果连excel也不知道怎么配的请看最佳实践部配置的，要下excel。
2 如果没有特殊样式不需要配置style现在平台统一做
3 容器tablelayout的cStyle配置

maxColumn: 最大列需要根据个人项目50-100之间就行

boxClass: 配置类名默认的两个 如果自己扩展可以继续加中间用空格隔开

 clearDefault：通用的样式

 defaultTheme1:默认样式第一版

 

"cStyle": "{\"maxColumn\":54,\"boxClass\":\"clearDefault defaultTheme1\"}",

4 配置tableitem的cStyle配置

现在如果不扩展，只有这两种

rightBorder: 就边框容器需要

tableFlow: 如果你的tableitem容器配置了多个控件，想让他们同一行就配这个，否则不需要

非这两种其它不用配

 

"cStyle": "{\"class\":\"tableFlow\"}"

"cStyle": "{\"class\":\"rightBorder\"}"

5
把这些配完后，如果通用不满足需要想改某个控件的颜色或者大小，还是要配置控件的cStyle

配这个就行

"blue"是字体颜色如（#fff #000）这种，替换下就行

"18px" 大小

这俩找你们ui要下替换上就行，如果只配一个 另外一个删除就行

"cStyle": "{\"style\":{\"color\":\"blue\",\"fontSize\":\"18px\"}"

6 如果到这里结构布局有大问题，友空间联系"陈达"，发设计图，账号 租户 单据 （前提是结构要有，就是iCols_tb: '1', iRows_tb: '1',rowSpan: '1', colSpan: '10'，这几个要有），我来补充新的布局样式。
7 配到这里大体结构就出来了，如果会写样式，可以看第3点，在boxClass里加自定义样式名称写扩展样式

8 容器的显示隐藏 可以用下面这段扩展代码，如果要做用户级显示隐藏 现在只能扩展脚本控制 状态存本地浏览器然后扩展取 来进行控制。如果要配置显示隐藏可以在容器的cstyle里配置 visible:false

// 显示 code的值为meta元数据中返回的cGroupCode的值

viewmodel.execute('updateViewMeta', {code: 'pu_sendorderscanlist', visible: false});

## [](#3-特殊配置)3. 特殊配置

### [](#31-配置图标)3.1. 配置图标

图标的配置其实还是组件层配置，有两种样式。

![](data:image/png;base64,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)

一种是图标只在标题内容的左侧。这种先确认标题是通过控件渲染出来的，还是通过关键信息区的配置出来的

- 

如果是取的关键信息区名称，在配名称的地方
扩展个titleIcon字段（图标名称）

- 

如果是控件渲染出来的，现在作为标题的控件只有input和span
支持配置图标。在控件的cStyle配置

- 

平台还有个图标组件 Icons，（组件有问题，后续补充）

size，color都不是必配的 看自己的需要和样式

beforeIcon:'icon名称'

beforeIcon:{icon:'xxx',size:'16px',color:'xxx'}

beforeIcon:{icon:'xxx',size:'16px',type:'svg'}

### [](#32-配置提示)3.2. 配置提示

类似上面的图标配置

size（图标大小），color（图标颜色）,tip（提示语） 都不是必配的
看自己的需要和样式

afterIcon:'icon名称'

afterIcon:{icon:'xxx',size:'16px',color:'xxx',tip:'这是提示语'}

afterIcon:{icon:'xxx',size:'16px',type:'svg',tip:'这是提示语'}

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Webduanguanjianxinxiqu_image2.573b3a24.png)

### [](#33-配置按钮)3.3. 配置按钮  

和正常配置组件一样，配个button 这是默认颜色

配置图标按钮，就正常配置button的配置

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Webduanguanjianxinxiqu_image3.ad9f72f0.png)

还有一种比较难，是ue要求的

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Webduanguanjianxinxiqu_image4.d712164b.png)

这种其实就是这种，左侧的图换成图标了，如果要配置这种先配结构，然后在里面配置个span控件在里面配置beforeIcon，配些样式。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Webduanguanjianxinxiqu_image5.7abfa703.png)

## [](#4-示例)4. 示例

### [](#41-第一种)4.1. 第一种

预览效果：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Webduanguanjianxinxiqu_image6.b7e026c9.png)

{

 "cName": "第一种",

 "cControlType": "tablelayout",

 "cStyle": "{\"extendStyle\":{\"padding\":\"20px 20px\",\"background\":\"#f5f5f5\"},\"maxColumn\":54,\"clearDefault\":true}",

 "containers": [

 {

 "cControlType": "tableItem",

 "cStyle": "{\"style\":{\"padding\":\"10px 0 10px 0\"}}",

 "controls": [

 {

 "cItemName": "new1",

 "cCaption": "",

 "cShowCaption": "",

 "cSeparatTag": '第一个信息区',

 "cStyle": "{\"style\":{\"color\":\"#666\",\"color\":\"red\"}}",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "span",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 // "iBillTplGroupId": 10114502,

 // "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }

 ],

 iCols_tb: '1',

 iRows_tb: '1',

 rowSpan: '1',

 colSpan: '10',

 "iCols": 0,

 },

 {

 "cControlType": "tableItem",

 "controls": [

 {

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 },

 {

 "cItemName": "new1",

 "cCaption": "字段22222",

 "cShowCaption": "字段22222",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }

 ],

 "iCols": 0,

 "cStyle": "{\"style\":{\"background\":\"#ddd\"},\"class\":\"tableFlow\"}",

 iCols_tb: '1',

 iRows_tb: '2',

 rowSpan: '1',

 colSpan: '10'

 },

 {

 "cControlType": "tableItem",

 "controls": [

 {

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "cStyle": "{\"style\":{\"color\":\"blue\",\"fontSize\":\"18px\",\"lineHeight\":\"1\"}}",

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }

 ],

 "iCols": 0,

 "cStyle": "{}",

 iCols_tb: '1',

 iRows_tb: '3',

 rowSpan: '1',

 colSpan: '10'

 },{

 "cControlType": "tableItem",

 "controls": [

 ],

 "iCols": 0,

 "cStyle": "{\"class\":\"rightBorder\"}",

 iCols_tb: '11',

 iRows_tb: '1',

 rowSpan: '10',

 colSpan: '1'

 },

 {

 "cControlType": "tableItem",

 "controls": [

 {

 "cItemName": "item26xj",

 "cCaption": "静态图片9",

 "cShowCaption": "静态图片9",

 "bEnum": false,

 "bMustSelect": false,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": false,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "bIsNull": true,

 "bJointQuery": false,

 "cControlType": "picture",

 "cRefType": "",

 "cRefRetId": "{}",

 "refReturn": "",

 "iOrder": 130,

 "bMain": true,

 "id": "1536810990297415684",

 "bVmExclude": 2,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 0,

 "cName": "item26xj",

 "cFieldName": "item26xj",

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.1536810990297415684",

 "cExtProps": "{\"bMain\":true,\"fileInfo\":{\"mine\":false,\"imageThumbPath\":\"iuap-apcom-file/2022/09/02/16/55/4967cc41-b1c8-407e-a922-7d4b4ee42680.png.thumb.jpg\",\"fileName\":\"00000\",\"downloadEnable\":true,\"priveiwUrl\":\"https://bip-daily.yyuap.com/iuap-apcom-file/rest/v1/server/file/6311c5020568e943c8d49348/0/ocstream?downThumb=true&token=yonbip_esn_lightapp629a46f4a467737e34353835dd5561fa&isWaterMark=false&fileName=file\",\"md5Hex\":\"0111d84b5fbb9ca83c1cf5422c4c9ecc\",\"sign\":\"3dded53e25dcded781527e96eedf4b46\",\"fileSizeText\":\"66 KB\",\"fileSize\":67694,\"fileExtension\":\".png\",\"attributes\":{\"businessId\":\"309eae96-952d-4a19-be43-0e1531b0ef73\",\"businessType\":\"mdf-runtime\"},\"copy\":false,\"id\":\"6311c5020568e943c8d49348\"},\"virtualField\":true,\"ideDesignType\":\"ysmdd\"}",

 "fileInfo": {

 "mine": false,

 "imageThumbPath": "iuap-apcom-file/2022/09/02/16/55/4967cc41-b1c8-407e-a922-7d4b4ee42680.png.thumb.jpg",

 "fileName": "00000",

 "downloadEnable": true,

 "priveiwUrl": "https://bip-daily.yyuap.com/iuap-apcom-file/rest/v1/server/file/6311c5020568e943c8d49348/0/ocstream?downThumb=true&token=yonbip_esn_lightapp629a46f4a467737e34353835dd5561fa&isWaterMark=false&fileName=file",

 "md5Hex": "0111d84b5fbb9ca83c1cf5422c4c9ecc",

 "sign": "3dded53e25dcded781527e96eedf4b46",

 "fileSizeText": "66 KB",

 "fileSize": 67694,

 "fileExtension": ".png",

 "attributes": {

 "businessId": "309eae96-952d-4a19-be43-0e1531b0ef73",

 "businessType": "mdf-runtime"

 },

 "copy": false,

 "id": "6311c5020568e943c8d49348"

 },

 "virtualField": true,

 "ideDesignType": "ysmdd"

 }

 ],

 "iCols": 0,

 "cStyle": "{\"style\":{\"padding\":\"10px 0 10px 0\"}}",

 iCols_tb: '12',

 iRows_tb: '1',

 rowSpan: '10',

 colSpan: '2'

 },

 {

 "cControlType": "tableItem",

 "controls": [

 {

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "cStyle": "{\"style\":{\"fontSize\":\"16px\",\"color\":\"red\"}}",

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }

 ],

 "iCols": 0,

 "cStyle": "{\"style\":{\"padding\":\"10px 0 10px 0\"}}",

 iCols_tb: '14',

 iRows_tb: '1',

 rowSpan: '1',

 colSpan: '8'

 },

 {

 "cControlType": "tableItem",

 "controls": [

 {

 "cItemName": "new1",

 "cCaption": "",

 "cShowCaption": "",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }

 ],

 "iCols": 0,

 "cStyle": "{}",

 iCols_tb: '14',

 iRows_tb: '2',

 rowSpan: '1',

 colSpan: '8'

 },{

 "cControlType": "tableItem",

 "controls": [

 {

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }

 ],

 "iCols": 0,

 "cStyle": "{}",

 iCols_tb: '14',

 iRows_tb: '3',

 rowSpan: '1',

 colSpan: '8'

 },{

 "cControlType": "tableItem",

 "controls": [

 ],

 "iCols": 0,

 "cStyle": "{\"class\":\"rightBorder\",\"background\":\"#f5f5f5\"}",

 iCols_tb: '22',

 iRows_tb: '1',

 rowSpan: '10',

 colSpan: '1'

 },

 {

 "cControlType": "tableItem",

 "cStyle": "{\"style\":{\"padding\":\"10px 0 10px 0\"}}",

 "controls": [

 {

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }

 ],

 "iCols": 0,

 iCols_tb: '23',

 iRows_tb: '1',

 rowSpan: '1',

 colSpan: '10'

 },{

 "cControlType": "tableItem",

 "controls": [

 {

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }

 ],

 "iCols": 0,

 "cStyle": "{}",

 iCols_tb: '23',

 iRows_tb: '2',

 rowSpan: '1',

 colSpan: '10'

 },{

 "cControlType": "tableItem",

 "controls": [

 {

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }

 ],

 "iCols": 0,

 "cStyle": "{}",

 iCols_tb: '23',

 iRows_tb: '3',

 rowSpan: '1',

 colSpan: '10'

 },{

 "cControlType": "tableItem",

 "controls": [

 ],

 "iCols": 0,

 "cStyle": "{\"class\":\"rightBorder\",\"background\":\"#f5f5f5\"}",

 iCols_tb: '33',

 iRows_tb: '1',

 rowSpan: '10',

 colSpan: '1'

 },

 {

 "cControlType": "tableItem",

 "cStyle": "{\"style\":{\"padding\":\"10px 0 10px 0\"}}",

 "controls": [

 {

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }

 ],

 "iCols": 0,

 iCols_tb: '34',

 iRows_tb: '1',

 rowSpan: '1',

 colSpan: '10'

 },{

 "cControlType": "tableItem",

 "controls": [

 {

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }

 ],

 "iCols": 0,

 "cStyle": "{}",

 iCols_tb: '34',

 iRows_tb: '2',

 rowSpan: '1',

 colSpan: '10'

 },{

 "cControlType": "tableItem",

 "controls": [

 {

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }

 ],

 "iCols": 0,

 "cStyle": "{}",

 iCols_tb: '34',

 iRows_tb: '3',

 rowSpan: '1',

 colSpan: '10'

 },{

 "cControlType": "tableItem",

 "controls": [

 ],

 "iCols": 0,

 "cStyle": "{\"class\":\"rightBorder\",\"background\":\"#f5f5f5\"}",

 iCols_tb: '44',

 iRows_tb: '1',

 rowSpan: '10',

 colSpan: '1'

 },

 {

 "cControlType": "tableItem",

 "cStyle": "{\"style\":{\"padding\":\"10px 0 10px 0\"}}",

 "controls": [

 {

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }

 ],

 "iCols": 0,

 iCols_tb: '45',

 iRows_tb: '1',

 rowSpan: '1',

 colSpan: '10'

 },{

 "cControlType": "tableItem",

 "controls": [

 {

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }

 ],

 "iCols": 0,

 "cStyle": "{}",

 iCols_tb: '45',

 iRows_tb: '2',

 rowSpan: '1',

 colSpan: '10'

 },{

 "cControlType": "tableItem",

 "controls": [

 {

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }

 ],

 "iCols": 0,

 "cStyle": "{}",

 iCols_tb: '45',

 iRows_tb: '3',

 rowSpan: '1',

 colSpan: '10'

 },

 ]

}

### [](#42-第二种)4.2. 第二种

预览效果：

![](data:image/png;base64,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)

{

 "cControlType": "tablelayout",

 cName: '第二种',

 "cStyle": "{\"extendStyle\":{\"padding\":\"20px 30px\",\"background\":\"#fff\"},\"maxColumn\":54,\"clearDefault\":true}",

 "containers": [

 {

 iCols_tb: '1',

 iRows_tb: '1',

 rowSpan: '2',

 colSpan: '10',

 "cControlType": "tableItem",

 "controls": [

 {

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 },

 {

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }

 ],

 "iCols": 0,

 "cStyle": "{\"class\":\"tableFlow\"}",

 },

 {

 iCols_tb: '11',

 iRows_tb: '1',

 rowSpan: '2',

 colSpan: '1',

 "cControlType": "tableItem",

 "cStyle": "{\"style\":{\"padding\":\"10px 0 10px 0\"},\"class\":\"rightBorder\"}",

 },

 {

 iCols_tb: '12',

 iRows_tb: '1',

 rowSpan: '2',

 colSpan: '10',

 "cControlType": "tableItem",

 "controls": [

 {

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }

 ],

 "iCols": 0,

 "cStyle": "{}",

 },

 {

 iCols_tb: '3',

 iRows_tb: '1',

 rowSpan: '2',

 colSpan: '10',

 "cControlType": "tableItem",

 "controls": [

 {

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }

 ],

 "iCols": 0,

 "cStyle": "{}",

 },

 {

 iCols_tb: '23',

 iRows_tb: '1',

 rowSpan: '2',

 colSpan: '10',

 "cControlType": "tableItem",

 "controls": [

 {

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }

 ],

 "iCols": 0,

 "cStyle": "{}",

 },

 {

 iCols_tb: '34',

 iRows_tb: '1',

 rowSpan: '2',

 colSpan: '10',

 "cControlType": "tableItem",

 "controls": [

 {

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }

 ],

 "iCols": 0,

 "cStyle": "{}",

 },

 {

 iCols_tb: '45',

 iRows_tb: '1',

 rowSpan: '2',

 colSpan: '10',

 "cControlType": "tableItem",

 "controls": [

 {

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }

 ],

 "iCols": 0,

 "cStyle": "{}",

 },

 {

 iCols_tb: '1',

 iRows_tb: '2',

 rowSpan: '2',

 colSpan: '10',

 "cControlType": "tableItem",

 "controls": [

 {

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }

 ],

 "iCols": 0,

 "cStyle": "{}",

 },

 {

 iCols_tb: '12',

 iRows_tb: '2',

 rowSpan: '2',

 colSpan: '10',

 "cControlType": "tableItem",

 "controls": [

 {

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }

 ],

 "iCols": 0,

 "cStyle": "{}",

 },

 {

 iCols_tb: '3',

 iRows_tb: '2',

 rowSpan: '2',

 colSpan: '10',

 "cControlType": "tableItem",

 "controls": [

 {

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }

 ],

 "iCols": 0,

 "cStyle": "{}",

 },

 {

 iCols_tb: '23',

 iRows_tb: '2',

 rowSpan: '2',

 colSpan: '10',

 "cControlType": "tableItem",

 "controls": [

 {

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }

 ],

 "iCols": 0,

 "cStyle": "{}",

 },

 {

 iCols_tb: '34',

 iRows_tb: '2',

 rowSpan: '2',

 colSpan: '10',

 "cControlType": "tableItem",

 "controls": [

 {

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }

 ],

 "iCols": 0,

 "cStyle": "{}",

 },

 {

 iCols_tb: '45',

 iRows_tb: '2',

 rowSpan: '2',

 colSpan: '10',

 "cControlType": "tableItem",

 "controls": [

 {

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }

 ],

 "iCols": 0,

 "cStyle": "{}",

 },

 ]

}

只有这种布局才有 某一个容器高度过高把同行的其它容器高度撑起 的效果

### [](#43-第三种)4.3. 第三种

预览效果：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Webduanguanjianxinxiqu_image8.e240a0ce.png)

{

 "cName": "第三种",

 "cControlType": "tablelayout",

 "cStyle": "{\"extendStyle\":{\"padding\":\"20px 20px\",\"background\":\"#f5f5f5\"},\"maxColumn\":5,\"clearDefault\":true}",

 containers: [

 {

 "cControlType": "tableItem",

 "iCols": 0,

 "cStyle": "{}",

 containers:[{

 "cName": "第一个区域左图右数据",

 "cControlType": "tablelayout",

 "cStyle": "{\"extendStyle\":{\"padding\":\"10px\",\"background\":\"#f5f5f5\"},\"maxColumn\":5,\"clearDefault\":true}",

 containers: [

 {

 "cControlType": "tableItem",

 "iCols": 0,

 "cStyle": "{\"style\":{\"padding\":\"5px\"}}",

 "controls": [{

 "cItemName": "item26xj",

 "cCaption": "静态图片9",

 "cShowCaption": "静态图片9",

 "bEnum": false,

 "bMustSelect": false,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": false,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "bIsNull": true,

 "bJointQuery": false,

 "cControlType": "picture",

 "cRefType": "",

 "cRefRetId": "{}",

 "refReturn": "",

 "iOrder": 130,

 "bMain": true,

 "id": "1536810990297415684",

 "bVmExclude": 2,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 0,

 "cName": "item26xj",

 "cFieldName": "item26xj",

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 0,

 "bEnableFormat": false,

 "key": "Control.1536810990297415684",

 "cExtProps": "{\"bMain\":true,\"fileInfo\":{\"mine\":false,\"imageThumbPath\":\"iuap-apcom-file/2022/09/02/16/55/4967cc41-b1c8-407e-a922-7d4b4ee42680.png.thumb.jpg\",\"fileName\":\"00000\",\"downloadEnable\":true,\"priveiwUrl\":\"https://xxxx/iuap-apcom-file/rest/v1/server/file/6311c5020568e943c8d49348/0/ocstream?downThumb=true&token=yonbip_esn_lightapp629a46f4a467737e34353835dd5561fa&isWaterMark=false&fileName=file\",\"md5Hex\":\"0111d84b5fbb9ca83c1cf5422c4c9ecc\",\"sign\":\"3dded53e25dcded781527e96eedf4b46\",\"fileSizeText\":\"66 KB\",\"fileSize\":67694,\"fileExtension\":\".png\",\"attributes\":{\"businessId\":\"309eae96-952d-4a19-be43-0e1531b0ef73\",\"businessType\":\"mdf-runtime\"},\"copy\":false,\"id\":\"6311c5020568e943c8d49348\"},\"virtualField\":true,\"ideDesignType\":\"ysmdd\"}",

 "fileInfo": {

 "mine": false,

 "imageThumbPath": "iuap-apcom-file/2022/09/02/16/55/4967cc41-b1c8-407e-a922-7d4b4ee42680.png.thumb.jpg",

 "fileName": "00000",

 "downloadEnable": true,

 "priveiwUrl": "https://xxxx/iuap-apcom-file/rest/v1/server/file/6311c5020568e943c8d49348/0/ocstream?downThumb=true&token=yonbip_esn_lightapp629a46f4a467737e34353835dd5561fa&isWaterMark=false&fileName=file",

 "md5Hex": "0111d84b5fbb9ca83c1cf5422c4c9ecc",

 "sign": "3dded53e25dcded781527e96eedf4b46",

 "fileSizeText": "66 KB",

 "fileSize": 67694,

 "fileExtension": ".png",

 "attributes": {

 "businessId": "309eae96-952d-4a19-be43-0e1531b0ef73",

 "businessType": "mdf-runtime"

 },

 "copy": false,

 "id": "6311c5020568e943c8d49348"

 },

 "virtualField": true,

 "ideDesignType": "ysmdd"

 }],

 iCols_tb: '1',

 iRows_tb: '1',

 rowSpan: '5',

 colSpan: '1'

 },

 {

 "cControlType": "tableItem",

 "iCols": 0,

 "cStyle": "{}",

 "controls": [{

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }],

 iCols_tb: '2',

 iRows_tb: '1',

 rowSpan: '1',

 colSpan: '4'

 },

 {

 "cControlType": "tableItem",

 "iCols": 0,

 "cStyle": "{}",

 "controls": [{

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }],

 iCols_tb: '2',

 iRows_tb: '2',

 rowSpan: '1',

 colSpan: '4'

 }

 ]

 }],

 iCols_tb: '1',

 iRows_tb: '1',

 rowSpan: '2',

 colSpan: '1'

 },

 {

 "cControlType": "tableItem",

 containers:[{

 "cName": "第二个区域",

 "cControlType": "tablelayout",

 "cStyle": "{\"extendStyle\":{\"padding\":\"10px\",\"background\":\"#f5f5f5\"},\"maxColumn\":5,\"clearDefault\":true}",

 containers: [

 {

 "cControlType": "tableItem",

 "iCols": 0,

 "cStyle": "{}",

 "controls": [{

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }],

 iCols_tb: '1',

 iRows_tb: '1',

 rowSpan: '2',

 colSpan: '5'

 },

 {

 "cControlType": "tableItem",

 "iCols": 0,

 "cStyle": "{}",

 "controls": [{

 "cItemName": "new1",

 "cCaption": "字段1",

 "cShowCaption": "字段1",

 "iMaxLength": 200,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 200,

 "iColWidth": 1,

 "iAlign": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": true,

 "iTabIndex": 0,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "input",

 "iOrder": 120,

 "controls": [],

 "id": 11110240,

 "bVmExclude": 0,

 "iBillTplGroupId": 10114502,

 "iBillEntityId": 10050065,

 "cSubId": "GT98685AT12",

 "iSystem": 1,

 "cName": "new1",

 "cFieldName": "new1",

 "authLevel": 5,

 "cDataSourceName": "GT98685AT12.GT98685AT12.referE01",

 "enterDirection": 4,

 "bEnableFormat": false,

 "key": "Control.11110240",

 "cExtProps": "{\"ytenant_id\":\"0000KPNHEQML4GORAX0000\",\"controls\":[],\"sysFlag\":0}",

 "ytenant_id": "0000KPNHEQML4GORAX0000",

 "sysFlag": 0

 }],

 iCols_tb: '1',

 iRows_tb: '2',

 rowSpan: '2',

 colSpan: '5'

 }

 ]

 }],

 "iCols": 0,

 "cStyle": "{}",

 iCols_tb: '2',

 iRows_tb: '1',

 rowSpan: '2',

 colSpan: '1'

 },

 {

 "cControlType": "tableItem",

 "iCols": 0,

 "cStyle": "{}",

 iCols_tb: '3',

 iRows_tb: '1',

 rowSpan: '2',

 colSpan: '1'

 },

 {

 "cControlType": "tableItem",

 "iCols": 0,

 "cStyle": "{}",

 iCols_tb: '4',

 iRows_tb: '1',

 rowSpan: '2',

 colSpan: '1'

 },

 {

 "cControlType": "tableItem",

 "iCols": 0,

 "cStyle": "{}",

 iCols_tb: '5',

 iRows_tb: '1',

 rowSpan: '2',

 colSpan: '1'

 },

 ]

}