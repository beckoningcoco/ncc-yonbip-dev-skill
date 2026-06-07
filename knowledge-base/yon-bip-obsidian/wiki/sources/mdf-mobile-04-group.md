---
title: "分组容器 Group"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/04-group"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 分组容器 Group

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/04-group | 所属：移动组件

# [](#分组容器-group)分组容器 Group

### [](#1-功能说明)1. 功能说明

容器类组件，可以展开收起

### [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Groupfengzurongqi_image1.dd7fa1da.png)

### [](#3-扩展属性-cstyle)3. 扩展属性 cStyle

||属性名称||属性说明||默认值|
||属性名称||属性说明||默认值|
||collapse||是否收起[false-展开，true-收起]||false(展开)|
||icon||标题前的小图标||无|
||subTitle||二级标题||无|
||hideCollapseIcon||隐藏展开收起图标||false|
||bEmptyHide||无值隐藏[字段值为空，则隐藏该字段]||cExtProps中配置|

### [](#4-标题行扩展toolbar)4. 标题行扩展toolbar

#### [](#41-功能说明)4.1. 功能说明

用于扩展标题行右侧toolbar

#### [](#42-效果展示)4.2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Groupfengzurongqi_image2.f0037872.png)

#### [](#43-基本配置demo)4.3. 基本配置demo

**设置标题行扩展toolbar**

{

 cControlType: "group",

 cGroupCode: "relationObject_quote_salesquotation",

 cName: "销售报价单",

 containers: [

 {

 cAlign: "top", // 必须设置该属性

 cControlType: "Toolbar",

 cGroupCode: "relation_quote_salesquotationpage_toolbar",

 cName: "relation_quote_salesquotationpage_toolbar",

 controls: [

 {

 cControlType: "button",

 cItemName: "btnAdd4",

 iOrder: 200,

 iStyle: 2,

 icon: "jiahao",

 }

 ],

 iOrder: 200,

 }

 ]

}

### [](#5-事件及控制示例)5. 事件及控制示例

#### [](#51-如何监听group的collapse)5.1. 如何监听group的collapse

// collapse false为展开状态,true为收起状态注意，此处参数PC端为collapsed，移动端是collapse

viewmodel.on('toggleGroup',({collapse, meta}) => {

 // 处理代码

})

#### [](#52-如何显示隐藏容器)5.2. 如何显示隐藏容器

// 显示 code的值为meta元数据中返回的cGroupCode的值

viewmodel.execute('updateViewMeta', {code: 'pu_sendorderscanlist', visible: true});

 

// 隐藏

viewmodel.execute('updateViewMeta', {code: 'pu_sendorderscanlist', visible: false});

#### [](#53-如何使容器展开或者收起)5.3. 如何使容器展开或者收起

// 收起

viewmodel.execute('updateViewMeta', {code: 'pu_sendorderscanlist',

collapse: false});

// 展开

viewmodel.execute('updateViewMeta', {code: 'pu_sendorderscanlist',

collapse: true});