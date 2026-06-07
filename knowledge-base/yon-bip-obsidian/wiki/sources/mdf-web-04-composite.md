---
title: "复合单元格 Composite"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-composite"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 4
---

# 复合单元格 Composite

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-composite | 所属：Web组件

# [](#复合单元格-composite)复合单元格 Composite

导语：在业务场景中会遇到一些想要把多个列合并展示在某一个列上的需求，此时便用到了复合单元格的特性

## [](#1-什么是复合单元格)1. 什么是复合单元格

复合单元格，顾名思义，将多个列复合到一个列上的操作叫做复合单元格，即在某一列上集中展示多个列的操作，这个展示列需要为**虚拟列virtual**（只存在UI不对应数据库字段），**列的类型(cControlType)为composite。**

## [](#2-复合单元格的配置方式)2. 复合单元格的配置方式

## [](#3-单实体复合单元格配置方式)3. 单实体复合单元格配置方式

如第一步所说，想要使用复合单元格，需要先有一个复合单元格的虚拟列，并且配置此列的扩展字段cExtProps，配置示例见**参考配置表1。**

**参考配置表1：**

||字段名称||字段含义||配置示例|
||compositeLayout||复合单元格浏览态展示内容||参见 参考配置 - 浏览态|
||compositeControls||复合单元格编辑态展示内容||参见 参考配置 - 编辑态|

**参考配置 - 浏览态：**

"compositeLayout": [

 {

 "row": [ // 行

 {

 "col": [ // 列

 {

 "bShowCaption": true,// 是否显示label

 "style": { // 样式

 "color": "red",

 "fontWeight": 700

 },

 "joinIcon": "~", //多个字段之间使用的连接符号

 "cItemName": "shuzhi" // 字段名称 cItemName

 },

 {

 "cItemName": "zhengshu"

 }

 ]

 }

 ]

 },

 {

 "row": [

 {

 "col": [

 {

 "cItemName": "danxuan"

 }

 ]

 }

 ]

 },

 {

 "row": [

 {

 "col": [

 {

 "cItemName": "riqi"

 }

 ]

 }

 ]

 }

**注：
上面的配置示例中，实际效果为复合单元格中展示三行，第一行为字段shuzhi和字段zhengshu，字段shuzhi的font-weight为700
颜色为红色，字段zhengshu为正常显示，且显示label，两个字段的值之间使用～进行连接，第二行显示字段danxuan，第三行显示字段riqi，另外，所有需要展示的字段均需要有UI元数据,否则可能会导致页面渲染异常。**

**参考配置 - 编辑态：**

"compositeControls": {

 "controls": [

 {

 "cItemName": "shuzhi"

 },

 {

 "cItemName": "zhengshu"

 },

 {

 "cItemName": "riqi"

 }

 ]

},

**注: 上面配置示例中，controls代表在编辑态弹窗中显示哪些字段**

## [](#4-显示示例)4. 显示示例

**按照上面配置示例配出来的页面渲染效果如下**

**浏览态**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Compositefuhedanyuangeimage1.e961480e.png)

**编辑态**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Compositefuhedanyuangeimage2.d9be9cf7.jpg)

## [](#5-跨实体复合单元格配置方式)5. 跨实体复合单元格配置方式

跨实体复合单元格只能是虚拟列，虚拟复合列配置方式与一对一场景一样，额外需要在表格容器的cExtProps上增加配置字段"**isCrossEntityGrid**"为true，虚拟复合列的cExtProps上需要增加字段"**crossEntity**"，值为关联子实体的childrenField的值，用来反查相关信息。

跨实体复合单元格中，实体不能交叉配置，如果存在跨多个实体的场景，那么需要增加多个复合列，每个复合列展示单一实体中的所有字段。

跨实体的本质是把另外一张表上的列通过配置复合到当前表格中的某一列进行显示，所以正确配置完成后，页面应该是多张表格的，然后将跨实体的表格进行隐藏即可。

**参考配置**

**与单实体配置不同的是，跨实体无需区分浏览态和编辑态，配置方式如下**

"compositeControls": {

 "controls": [

 {

 "cItemName": "shuzhi",

 "bHideInCell": true,// 非弹窗时不显示此字段内容

 "style": {} // 样式，字段级，

 "bJointQuery": true //开启穿透效果

 },

 {

 "cItemName": "zhengshu"

 },

 {

 "cItemName": "riqi"

 }

 ]

}

注：跨实体复合单元格不支持显示label、修改样式等配置，故无需配置compositeLayout，仅配置compositeControls即可

### [](#51-监听穿透事件)5.1. 监听穿透事件

gridModel.on('crossEntityJointCellQuery', function(data) {

 console.log(data.rowIndex) //当前点击的数据在对应子表中的行索引

 console.log(data.cellName) //当前点击的数据在对应子表中对应的列的cItemName

 console.log(data.row) //当前点击的数据在对应子表中对应的行数据

 console.log(data.parentRowIndex) //当前点击的数据在对应主表中的行索引

 console.log(data.parentColumnKey) //当前点击的数据在对应主表中的列cItemName

 console.log(data.viewModel) //页面模型

 console.log(data.gridModel) //子表模型

})

## [](#6-显示示例)6. 显示示例

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Compositefuhedanyuangeimage3.a26f637b.jpg)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Compositefuhedanyuangeimage4.c34d7072.jpg)

## [](#7-适配要求)7. 适配要求

适配复合单元格功能，单实体的场景下仅前端修改UI元数据配置即可实现。

跨实体复合则需要配合后端进行适配，需要后端增加bill/listdetailpager接口规则接入且可以返回和list接口一样结构的数据。具体适配方案可以联系MDD咨询。

[MDD适配文档](https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=162361043)

## [](#8-常见问题)8. 常见问题

### [](#81-复合单元格在编辑时不同条件下想展示不同的复合单元格编辑列怎么处理比如a条件下复合单元格编辑弹窗里展示4个colsb条件下展示两个怎么通过脚本动态处理)8.1. 复合单元格在编辑时。不同条件下想展示不同的复合单元格编辑列怎么处理？（比如a条件下，复合单元格编辑弹窗里展示4个cols，b条件下，展示两个，怎么通过脚本动态处理）

解决方案：通过表格模型的setColumnState，具体Demo见下方：

viewModel.getGridModel().setColumnState('你的复合单元格字段', 'compositeControls', 新的复合单元格对象)

 

// 下面拿一个测试数据演示：

// 这里有四个controls，如果想隐藏或者增加几个，只需要改一下这个controls数组的元素就好了，然后原封不动放到setColumnState的第三个参数中。

viewModel.getGridModel().setColumnState('bookComposite', 'compositeControls', {"controls": [{style: {}, cItemName: 'accRate'}]})