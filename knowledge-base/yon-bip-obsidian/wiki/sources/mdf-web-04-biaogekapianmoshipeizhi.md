---
title: "--表格卡片模式配置"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-biaogekapianmoshipeizhi"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 7
---

# --表格卡片模式配置

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-biaogekapianmoshipeizhi | 所属：Web组件

# [](#表格卡片模式配置)表格卡片模式配置

## [](#1-卡片区配置)1. 卡片区配置

在列表的配置中，配置一个container，它的cControlType==='listcard'，

它可以包含两个子container------卡片区标题（cControlType==='ListCardTop'
）、卡片区内容（cControlType==='ListCardContent' ）

## [](#2-卡片区标题配置)2. 卡片区标题配置

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/biaogekapianmoshipeizhiimg1.0653b301.png)

卡片区标题（cControlType==='ListCardTop'
）其中可以配置两项在controls中：

标题(cControlType==='listtoptitle')、卡片状态(cControlType==='listtopflag')

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/biaogekapianmoshipeizhiimg2.a76d90cb.png)

卡片区内容（cControlType==='ListCardContent'）

其中文字部分配置在container（cControlType==='ListCardContentItem'）中

文字部分的字段与列表中的字段一样，只有cControlType不一样（cControlType==='item'）

如果该字段需要变成超链接，可以点击跳转到卡片页，需要在列表的controls中将该字段的bJointQuery:
true

在卡片区内容中，可以配置图片controls（cControlType==='ListCardImg'）

## [](#3-卡表切换按钮配置)3. 卡表切换按钮配置

在列表的表头区中配置，cControlType：radiobutton

在字段中配置两个container

其中配置与按钮配置类似 其中

cCaption cShowCaption 为悬浮提示文字

cControlType为button

扩展脚本监听点击事件 进行控制

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/biaogekapianmoshipeizhiimg7.07180902.png)

## [](#4-卡表外层容器自定义配置)4. 卡表外层容器自定义配置

table组件的cStyle里配置cardSetting: true，然后自己扩展meta组件

## [](#5-卡片内部容器布局自定义配置)5. 卡片内部容器布局自定义配置

布局容器的配置查看[tablelayout文档](#/components-web/03-tablelayout)

**UI模板示例** 展开源码

{

 "groupId": "1577555688827719343",

 "cName": "表格",

 "iOrder": 40,

 "bMain": false,

 "cCode": "wj01_1747649285569642497",

 "cDataSourceName": "GT14530AT5.GT14530AT5.wj01",

 "cControlType": "table",

 "cGroupCode": "7e37d13ce64746feb0ebc13d709a9d5e",

 "cAlign": "right",

 "iCols": 0,

 "containers": [{

 "groupId": "1456804640021545065",

 "parentId": 4625009,

 "cName": "工作台卡片区",

 "iOrder": 4,

 "bMain": true,

 "cControlType": "listcard",

 "cGroupCode": "ListCard",

 "cAlign": "bottom",

 "iCols": 0,

 "cStyle": "{\"actionBtnShowNum\": 4, \"cardNew\": true}",

 "containers": [{

 "groupId": "1748246251683971082",

 "cName": "",

 "iOrder": 100,

 "bMain": false,

 "cCode": "body_entity_001_1514471748693131268",

 "cDataSourceName": "",

 "cControlType": "tablelayout",

 "cGroupCode": "infolayoutgroup12lc",

 "cAlign": "right",

 "iCols": 1,

 "cStyle": "{\"render\": true}",

 "containers": [{

 "groupId": "1748246251683971084",

 "parentId": "1748246251683971082",

 "iOrder": 110,

 "cCode": "body_entity_001_1514471748693131268",

 "cControlType": "tableitem",

 "iCols": 0,

 "controls": [],

 "iBillId": 10029412,

 "iBillEntityId": 10056303,

 "iTplId": 10029338,

 "cExtProps": "{\"rowSpan\":\"1\",\"cCode\":\"body_entity_001_1514471748693131268\",\"colSpan\":\"3\",\"iRows_tb\":\"2\",\"uiObject\":\"containers\",\"iCols_tb\":\"1\"}",

 "rowSpan": "1",

 "colSpan": "3",

 "iRows_tb": "2",

 "uiObject": "containers",

 "iCols_tb": "1"

 },

 {

 "groupId": "1748246251683971085",

 "parentId": "1748246251683971082",

 "iOrder": 120,

 "cCode": "body_entity_001_1514471748693131268",

 "cControlType": "tableitem",

 "iCols": 0,

 "controls": [],

 "iBillId": 10029412,

 "iBillEntityId": 10056303,

 "iTplId": 10029338,

 "cExtProps": "{\"rowSpan\":\"5\",\"cCode\":\"body_entity_001_1514471748693131268\",\"colSpan\":\"12\",\"iRows_tb\":\"1\",\"uiObject\":\"containers\",\"iCols_tb\":\"4\"}",

 "rowSpan": "5",

 "colSpan": "13",

 "iRows_tb": "1",

 "uiObject": "containers",

 "iCols_tb": "4"

 }

 ],

 "iBillId": 10029412,

 "iBillEntityId": 10056303,

 "iTplId": 10029338,

 "cExtProps": "{\"cCode\":\"body_entity_001_1514471748693131268\",\"virtualField\":true,\"showBorder\":true,\"uiObject\":\"containers\",\"ideDesignType\":\"ysmdd\"}",

 "virtualField": true,

 "showBorder": true,

 "uiObject": "containers",

 "ideDesignType": "ysmdd"

 }],

 "iBillEntityId": 940176,

 "cExtProps": "{\"uiDesignHidden\":\"true\"}",

 "uiDesignHidden": "true"

 },

 {

 "groupId": "1577555688827718185",

 "cName": "SinpleTableTable",

 "iOrder": 50,

 "cCode": "SinpleTableTable",

 "cDataSourceName": "Toolbar",

 "cControlType": "Toolbar",

 "cGroupCode": "SinpleTableTable",

 "cAlign": "top",

 "iCols": 0,

 "controls": [],

 "key": "ContainerToolbarSinpleTableTable",

 "cExtProps": "{\"ytenant_id\":\"0000KWEB7NON92GMJ40000\",\"cName\":\"SinpleTableTable\",\"ismain\":true,\"uiObject\":\"containers\"}",

 "ytenant_id": "0000KWEB7NON92GMJ40000",

 "ismain": true,

 "uiObject": "containers"

 }

 ],

 "iBillId": "1577555688827716472",

 "iBillEntityId": "1577555688827717205",

 "iTplId": "1577555688827716480",

 "cExtProps": "{\"ytenant_id\":\"0000KWEB7NON92GMJ40000\",\"cCode\":\"wj01_1747649285569642497\",\"uiObject\":\"containers\"}",

 "ytenant_id": "0000KWEB7NON92GMJ40000",

 "uiObject": "containers"

}

## [](#6-卡表状态位置调整配置)6. 卡表状态位置调整配置

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/biaogekapianmoshipeizhiimg3.b4f81303.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/biaogekapianmoshipeizhiimg4.9237f2d1.png)

## [](#7-卡表显示本页全选)7. 卡表显示本页全选

cstyle里配置cardShowSelectAll: true

## [](#8-卡表分组展示配置)8. 卡表分组展示配置

table配置当前cstyle 为
{"cardGroupField":"pk_category__category_name"},cardGroupField
是需要按照分组的字段

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/biaogekapianmoshipeizhiimg5.ad810446.png)

## [](#9-卡表卡片右侧区域支持扩展)9. 卡表卡片右侧区域支持扩展

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/biaogekapianmoshipeizhiimg6.5859c5cd.png)

**cControlType为'ListCardContentItem**'的容器中配置扩展组件，标题区的扩展字段（cstyle里配置cardTitleExtend）要配在标题字段(cstyle里配置了tableCardTitle)前，正文区域与辅助信息区域直接配扩展组件即可