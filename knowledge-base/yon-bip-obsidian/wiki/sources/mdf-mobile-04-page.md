---
title: "子页面 Page"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/04-page"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 子页面 Page

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/04-page | 所属：移动组件

# [](#子页面-page)子页面 Page

## [](#1-功能说明)1. 功能说明

可以在一个表单中嵌入另一个表单的容器

注:常见为卡片页嵌套列表页面

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Pageziyemian_image1.e19e7e8d.png)

## [](#3-扩展属性-cstyle)3. 扩展属性 cStyle

在billtplgroup_base表中Page容器的cStyle字段中配置

示例

cStyle:

cStyle: "{"billnum":"mka_summarylist","key":"id","filter":"activity",

"params":{"domainKey":"yycrm"}}"

||属性||说明|
||属性||说明|
||billnum||单据billno|
||billtype||单据类型-不传默认是voucherlist|
||filter||过滤项的itemName|
||key||当前过滤项取值需要的key|
||filtertype||可传'simple', 默认为'common'， 默认为commonVOs,为simple则使用simpleVOs处理|
||params||参数|

params 参数展开

||属性||说明|
||属性||说明|
||mode||edit-编辑；add-新增；browse-浏览|
||bShowHeader||卡片页是否显示header组件，默认为true, 配置为false则不显示|
||className||className，配置为'light',卡片详情态不显示背景图片|
||domainKey||领域的domainKey|
||query||给子页面携带的所有请求参数，如：busiObj 、transtype 、serviceCode等示例：{"params":{"query":{"busiObj":"xxx"}}}|

注：filtertype和filter和key是初始加载该页面时的查询条件---需要和查询方案一起使用

## [](#4-控制示例)4. 控制示例

### [](#41-page内与主页面通信)4.1. page内与主页面通信

// viewmodel为page外的主页面模型

viewmodel.on('beforeSubPageRender', function (data) {

 const { vm, viewmeta } = data;

 // vm为page的页面模型

})

## [](#5-更新组件参数)5. 更新组件参数

### [](#51-更新单据信息)5.1. 更新单据信息

viewmodel.execute('updateViewMeta', {

 code: 'cGourpCode',

 params: {

 id: "id",

 domainKey: ""

 },

 billtype: '单据类型',

 billnum: '单据编码',

 visible: true

});

**如果一个viewmodel下挂载了多个page，需要自行维护各page的模型**