---
title: "搜索树 SearchTree"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-searchtree"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 13
---

# 搜索树 SearchTree

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-searchtree | 所属：Web组件

# [](#搜索树-searchtree)搜索树 SearchTree

## [](#1-功能说明)1. 功能说明

搜索树，通过选择的节点，对表格数据进行过滤。

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/SearchTreesousuoshuimage1.305cbf58.png)

## [](#3-基本属性)3. 基本属性

||属性名称||属性含义||值类型||属性说明|
||showSearchInput||是否显示搜索框||boolean||true或false|
||multiple||是否允许选择多个树节点||boolean||this.props.multiple|
||checkable||节点前添加 Checkbox 复选框||boolean||this.props.checkable|
||expandAll||是否展开所有树节点||boolean||this.props.expandAll|
||expandedKeys||展开指定的树节点||array||this.props.expandedKeys|
||dataSource||数据源||array|||

## [](#4-扩展属性cstyle)4. 扩展属性cStyle

||属性名称||属性含义||值类型||属性说明|
||showSelectAll||是否显示全选按钮||boolean||true或false，默认为false|
||draggable||是否支持拖拽||boolean||true或false，默认为false|
||substractHeight||减去额外高度||number||如果树顶部或者底部有别的区域，需要减去|
||titleField||树显示字段(默认值name)||string||如果配置多个字段"<%code%> <%name%>"|
|||||||||
||refTreeFilters||参照左侧树的搜索字段||string（json字符串）|||

## [](#5-使用场景示例)5. 使用场景示例

### [](#51-支持全选的搜索树)5.1. 支持全选的搜索树

#### [](#511-效果展示)5.1.1. 效果展示

可以支持全选和反选树上的内容，在cStyle配置showSelectAll属性控制

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/SearchTreesousuoshuimage2.d45b3e31.png)

#### [](#512-meta示例)5.1.2. meta示例

关键属性：showSelectAll（配置在cStyle中）,默认false

{

 "groupId": 80353101,

 "parentId": 80353097,

 "cName": "行政区划",

 "cNameResid": "P_YS_PF_GZTTMP_0000073851",

 "iOrder": 9,

 "bMain": true,

 "cCode": "ec_regionentity",

 "cDataSourceName": "aa.regioncorp.RegionCorp",

 "cModelType": "TreeModel",

 "cControlType": "SearchTree",

 "cGroupCode": "ec_region_tree",

 "cAlign": "top",

 "iCols": 0,

 "cStyle": "{\"placeholder\":\"编码/名称1111111111\",\"showSelectAll\":true,\"substractHeight\":\"89\",\"classname\":\"tree-left\",\"filters\":[\"cityCode\",\"name\"],\"placeholder_ori\":\"编码/名称\"}",

 "controls": [

 {

 "cItemName": "name",

 "cCaption": "名称",

 "cCaptionResid": "P_YS_FED_EXAMP_0000020808",

 "cShowCaption": "名称",

 "cShowCaptionResid": "P_YS_FED_EXAMP_0000020808",

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 255,

 "iColWidth": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": false,

 "iTabIndex": 1,

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "Input",

 "iOrder": 0,

 "bMain": true,

 "id": 1054927275,

 "bVmExclude": 0,

 "iBillTplGroupId": 80353101,

 "iBillId": 1002668220,

 "iBillEntityId": 4573344,

 "iTplId": 2721130,

 "cSubId": "EC",

 "iSystem": 1,

 "cName": "name",

 "cFieldName": "showName",

 "authLevel": 3,

 "cDataSourceName": "aa.regioncorp.RegionCorp",

 "enterDirection": 4,

 "bEnableFormat": false

 },

 {

 "cItemName": "showName",

 "cCaption": "简称",

 "cCaptionResid": "P_YS_HR_HRYGF_0000055706",

 "cShowCaption": "简称",

 "cShowCaptionResid": "P_YS_HR_HRYGF_0000055706",

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": false,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 255,

 "iColWidth": 1,

 "bNeedSum": false,

 "bShowIt": true,

 "bFilter": false,

 "iTabIndex": 2,

 "bIsNull": false,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cControlType": "TreeRefer",

 "refReturn": "name",

 "iOrder": 1,

 "bMain": true,

 "id": 1054927276,

 "bVmExclude": 0,

 "iBillTplGroupId": 80353101,

 "iBillId": 1002668220,

 "iBillEntityId": 4573344,

 "iTplId": 2721130,

 "cSubId": "EC",

 "iSystem": 1,

 "cName": "showName",

 "cFieldName": "showName",

 "authLevel": 3,

 "cDataSourceName": "aa.regioncorp.RegionCorp",

 "enterDirection": 4,

 "bEnableFormat": false

 },

 {

 "cItemName": "cityCode",

 "cCaption": "编码",

 "cCaptionResid": "P_YS_FED_EXAMP_0000020286",

 "cShowCaption": "编码",

 "cShowCaptionResid": "P_YS_FED_EXAMP_0000020286",

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bCanModify": true,

 "iColWidth": 1,

 "bShowIt": true,

 "iTabIndex": 3,

 "bIsNull": false,

 "cControlType": "Input",

 "iOrder": 2,

 "bMain": true,

 "id": 1054927277,

 "bVmExclude": 0,

 "iBillTplGroupId": 80353101,

 "iBillId": 1002668220,

 "iBillEntityId": 4573344,

 "iTplId": 2721130,

 "cSubId": "EC",

 "iSystem": 1,

 "cName": "cityCode",

 "cFieldName": "cityCode",

 "authLevel": 3,

 "cDataSourceName": "aa.regioncorp.RegionCorp",

 "enterDirection": 4,

 "bEnableFormat": false

 },

 {

 "cItemName": "parent_name",

 "cCaption": "行政上级",

 "cCaptionResid": "P_YS_SD_SDOC-UI_0000175518",

 "cShowCaption": "行政上级",

 "cShowCaptionResid": "P_YS_SD_SDOC-UI_0000175518",

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bCanModify": true,

 "iColWidth": 1,

 "bShowIt": true,

 "iTabIndex": 7,

 "bIsNull": true,

 "cControlType": "TreeRefer",

 "cRefType": "ec_region",

 "cRefRetId": "{\"parent\":\"id\"}",

 "refReturn": "name",

 "iOrder": 6,

 "bMain": true,

 "id": 1054927279,

 "bVmExclude": 0,

 "iBillTplGroupId": 80353101,

 "iBillId": 1002668220,

 "iBillEntityId": 4573344,

 "iTplId": 2721130,

 "cSubId": "EC",

 "iSystem": 1,

 "cName": "parent_name",

 "cFieldName": "parent.name",

 "authLevel": 3,

 "cDataSourceName": "aa.regioncorp.RegionCorp",

 "enterDirection": 4,

 "bEnableFormat": false

 }

 ],

 "iBillEntityId": 4573344

}

#### [](#513-支持配置模块级标题)5.1.3. 支持配置模块级标题

searchTree的cStyle配置属性

||属性名称||属性含义||值类型||eg|
||searchTreeTitle||树名称||string|||
||searchTreeTitleTips||树名称帮助提示||string||html|

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/SearchTreesousuoshuimage3.a39a88ac.png)

#### [](#514-支持树节点显示tips)5.1.4. 支持树节点显示tips

树数据增加tips属性

||属性名称||属性含义||值类型||备注|
||tips||树数据tips||string||{"tips":"**", "trigger": "click|

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/SearchTreesousuoshuimage4.1eaa2dea.png)

## [](#6-常见问题)6. 常见问题

### [](#61-树按钮上根据不同结点显示隐藏按钮)6.1. 树按钮上根据不同结点显示隐藏按钮

treeModel.setActionsState(actionState);//
见下图，其中itemName为按钮的name key为树节点id 需要将所有节点都枚举出来

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/SearchTreesousuoshuimage5.40b2b626.png)

### [](#62-新增按钮配置)6.2. 新增按钮配置

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/SearchTreesousuoshuimage6.5dc45475.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/SearchTreesousuoshuimage7.55c2aa99.png)

### [](#63-treevoucher单据树节点跨行编辑不发detail请求导致右侧跟左侧节点不一致问题httpsxxxxxbrowsexwzt-27026)6.3. treeVoucher单据树节点跨行编辑不发detail请求，导致右侧跟左侧节点不一致问题（[https://xxxxx/browse/XWZT-27026）](https://xxxxx/browse/XWZT-27026%EF%BC%89)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/SearchTreesousuoshuimage8.0a075b7e.png)

需要将编辑按钮的cParameter配置needDetail为true即可，参考下图：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/SearchTreesousuoshuimage9.afadd4b2.png)

### [](#64-左侧树默认展开某些节点)6.4. 左侧树默认展开某些节点

// 1、有全部节点时

// **代表需要展开节点的key

treeModel.setState('expandedKeys', ['all', **]);

// 2、无全部节点时

// **代表需要展开节点的key

treeModel.setState('expandedKeys', [**，**,]);

### [](#65-左侧树增加tag标记)6.5. 左侧树增加tag标记

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/SearchTreesousuoshuimage10.2874e139.png)

tree每条数据上增加tagName和tagBackColor两个属性

||属性名称||属性含义||值类型||备注|
||tagName||tag名称||string||比如：类别|
||tagBackColor||tag背景色||string||比如：red|

### [](#66-树节点searchtree左侧加图标)6.6. 树节点（searchTree）左侧加图标

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/SearchTreesousuoshuimage11.672e0393.png)

1、tree数据里面增加一个icon属性，值为图标的名字，比如使用图标`<Icon type="zuidahua" />`

数据增加一个icon:
'zuidahua'即可(图标库地址：[http://xxxxx/static/mdd/ys/newfont/demo_index.html](http://xxxxx/static/mdd/ys/newfont/demo_index.html)
)

2、执行treeModel.setState('showIcon', true);

### [](#67-树节点searchtree右侧加图标)6.7. 树节点（searchTree）右侧加图标

tree数据里面增加一个rightIcon属性，值为图标的名字，比如使用图标`<Icon type="zuidahua" />`
数据增加一个rightIcon: 'zuidahua'即可(图标库地址：[http://xxxxx/static/mdd/ys/newfont/demo_index.html](http://xxxxx/static/mdd/ys/newfont/demo_index.html)
)

### [](#68-如何去除左侧树的全部节点及修改全部文字)6.8. 如何去除左侧树的全部节点及修改"全部"文字

1.如果是树表单据：

方法1:可以在searchTree的cStyle配置showAllNode为false即可，配置allNodeText为**替换"全部"两个文字。

方法2:在单据的扩展脚本中，执行viewModel.getTreeModel().setState('showAllNode', false) 将"全部"隐藏

执行viewModel.getTreeModel().setState('allNodeText', '**')
修改"全部"文字

2.如果是treeTable参照

拿到参照左侧树模型(不清楚的话，参考[Refer
参照常用扩展梳理](file:////pages/viewpage.action%3fpageId=20772632)第19条)，执
行treeModel.setState('showAllNode', false) 或者
treeModel.setState('allNodeText', '**') 修改"全部"文字

### [](#69-树节点名称展示展示配置)6.9. 树节点名称展示展示配置

![](data:image/png;base64,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)

### [](#610-树节点searchtree-右侧加图标)6.10. 树节点(searchTree) 右侧加图标

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/SearchTreesousuoshuimage13.e22a095f.jpeg)

备注：在searchTree下的container里面增加一个toolbar即可，里面可以放任何图标库有的按钮

### [](#611-控制树节点是否可选)6.11. 控制树节点是否可选

在当前树节点的业务数据中维护selectable属性，如：

[{

 "name": "节点1",

 "code": "node2",

 "selectable": true // 节点可选

},

{

 "name": "节点1",

 "code": "node2",

 "selectable": false // 节点不可选

}]

在当前树节点的业务数据中维护disabled属性，如：

[{

 "name": "节点1",

 "code": "node2",

 "disabled": true // 节点不可选

},

{

 "name": "节点1",

 "code": "node2",

 "disabled": false // 节点可选

}]