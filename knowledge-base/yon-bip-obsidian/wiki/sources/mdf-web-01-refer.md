---
title: "参照 Refer ListRefer TreeRefer Tag CascaderRefer"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-refer"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 13
---

# 参照 Refer ListRefer TreeRefer Tag CascaderRefer

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/01-refer | 所属：Web组件

# [](#参照-refer-listrefer-treerefer-tag-cascaderrefer)参照 Refer ListRefer TreeRefer Tag CascaderRefer

## [](#1-前言)1. 前言

参照以控件类型分类分为listRefer treeRefer Refer Tag CascaderRefer
五种类型。

refer、listRefer 、tag参照组件底部提示信息

cStyle里配置bottom

## [](#2-cascaderrefer)2. CascaderRefer

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ReferListReferTreeReferTagCascaderRefercanzhao-image1.0f58760f.png)

配置可以类比treerefer,只是把cControlType配成CascaderRefer(地址档案refCode:bd_baseregionLinkageRef)

特殊点

原来参照存id的不变 
存name的字段需要改成存树数据路径的字段(树节点数据必须有path
'xxx|xxx|xx')

参照使用方改cRefRetId（这个）

bill_item_base表里 cFieldname.name改成
cFieldname.path(应该）（保证存的是path返回的是path）

## [](#3-listrefer)3. listRefer

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ReferListReferTreeReferTagCascaderRefercanzhao-image2.c3b6e2d3.png)

## [](#4-treerefer下拉一个树结构)4. TreeRefer（下拉一个树结构）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ReferListReferTreeReferTagCascaderRefercanzhao-image3.61484762.png)

## [](#5-refer)5. Refer

### [](#51-树参照)5.1. 树参照

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ReferListReferTreeReferTagCascaderRefercanzhao-image4.de321a12.png)

### [](#52-表参照)5.2. 表参照

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ReferListReferTreeReferTagCascaderRefercanzhao-image5.39012c53.png)

### [](#53-左树右表参照)5.3. 左树右表参照

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ReferListReferTreeReferTagCascaderRefercanzhao-image6.4fae0b2e.png)

### [](#54-树表参照)5.4. 树表参照

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ReferListReferTreeReferTagCascaderRefercanzhao-image7.c06d8e7e.png)

||refCode|| ucfbasedoc.bd_projectcardref|

### [](#55-穿梭参照)5.5. 穿梭参照

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ReferListReferTreeReferTagCascaderRefercanzhao-image8.741ecfea.png)

配置方法：将普通的Table参照或者treeTable参照的pub_ref表的cTpltype由Table改成TransferTable即可

### [](#56-树卡参照)5.6. 树卡参照

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ReferListReferTreeReferTagCascaderRefercanzhao-image9.ec4f7210.png)

配置方法：

1、将参照的pub_ref表的cTpltype配置成TreeCard

2、参照模版的view层的孩子下面有个cControlType为view的容器，用来渲染右侧卡片的内容。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ReferListReferTreeReferTagCascaderRefercanzhao-image10.b3a7dbbe.png)

### [](#57-已选表参照)5.7.  已选表参照

配置方法：将普通的Table参照的pub_ref表的cTpltype由HasSelectTable改成即可

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ReferListReferTreeReferTagCascaderRefercanzhao-image11.b8e4047a.png)

## [](#6-tag-多选参照ui展现和refer一样)6. Tag (多选参照，UI展现和Refer一样)

### [](#61-整体结构)6.1. 整体结构

![](data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAswAAAFuCAYAAACV7U5iAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAAEnQAABJ0Ad5mH3gAACVBSURBVHhe7d3bryRXoR/g/BHJyZGQiIiSeYoU5eU85TxGivIHRAKEokhjBAgkDDoStoRCgoS2xmDEQ86DdYIspIBhDL6bqwGDL+AZj8FgMNhcjW3wAL5hY+WlUmvVbVV1dc3evXqv3bvn+6SfZnd3dVV1765Vv169Z+9/VgEAAGspzAAAsEBhBgCABQozAAAsUJgBAGCBwgwAAAsUZgAAWKAwAwDAAoUZAAAWKMwAALBAYQYAgAUKMwAALFCYAQBggcIMAAALFGYAAFigMAMAwAKFGQAAFijMAACwQGEGAIAFCjMAACxQmAEAYIHCDAAACxRmAABYoDADAMAChRkAABYozAAAsEBhBgCABQozAAAsUJgBAGCBwgwAAAsUZgAAWKAwAwDAAoUZAAAWKMwAALBAYQYAgAUKMwAALFCYAQBggcIMAAALFGYAAFigMAMAwAKFGQAAFijMAACwQGEGAIAFCjMAACxQmAEAYIHCDAAACxRmAABYoDADAMAChRkAABYozAAAsEBhBgCABQozAAAsUJgBAGCBwgwAAAsUZgAAWKAwAwDAAoUZAAAWKMwAALBAYQYAgAUKMwAALFCYAQBggcIMAAALFGYAAFigMAMAwAKFGQAAFijMAACwQGEGAIAFCjMAACxQmAEAYIHCDAAACxRmAABYoDADAMAChRkAuKq98MIL1RNPPCGF88orr7Tfgd2nMAMAV53Lly9XN954Y/Wud72reutb3yonlA984APVpz/96fa7srsUZgDgqvLAAw/0he2Tn/xkdeedd87OgMrx5o477qgODg7i9+Hs2bPVU0891X6Hdo/CDABcNZ588slY0K699trql7/8ZXstJ+nmm2/u38DsKoUZALhqXH/99dU73vGO9hK74uLFi7Ew33bbbe01u0VhBgCuChcuXIil7J577mmvYZfcdNNN8fvz0ksvtdfsDoUZALgqhNnLUMhefPHF9hp2yYMPPhi/P48//nh7ze5QmAGAq8LHP/7x6rrrrmsvsWteffXVWJjvvvvu9prdoTADAFeFj370ozHsrlCYb7311vbS7lCYAYCrgsK8+xRmAIAT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)

### [](#62-功能概述)6.2. 功能概述

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ReferListReferTreeReferTagCascaderRefercanzhao-image13.22b0c4ab.png)

### [](#63-属性列表)6.3. 属性列表

'warehouseId_name':

new cb.models.ReferModel({

 "cFieldName":"warehouseId.name",

 "fieldRuntimeState":false,

 "cItemName":"warehouseId_name", // 字段名称

 "cCaption":"收货仓库",

 "cCaptionResid":"P_YS_PF_BD-UI_0001127045",

 "cShowCaption":"收货仓库", // 显示名称

 "cShowCaptionResid":"P_YS_PF_BD-UI_0001127045",

 "iBillEntityId":11579688,

 "iBillTplGroupId":132707255,

 "iTplId":7441266,

 "iFieldType":1,

 "bEnum":false,

 "bMustSelect":false,

 "bHidden":false,

 "cRefType":"productcenter.aa_warehouse", // 参照编码

 "cRefRetId":"{\"warehouseId\":\"id\"}", // 携带字段

 "bCanModify":true,

 "iMaxShowLen":255,

 "iColWidth":1,

 "bNeedSum":false,

 "bShowIt":true,

 "bFilter":true,

 "bIsNull":true,

 "cTplGroupName":"项目详情",

 "bMain":true,

 "cDataSourceName":"bd.project.ProjectVO",

 "cControlType":"refer" // 控件类型

 ,"refReturn":"name", // 显示字段

 "cStyle":"{\"examples\":\"C00001\",\"explains_ori\":\"可空，填写参照仓库编码\",\"explains\":\"可空，填写参照仓库编码\"}",

 "bVmExclude":0,

 "iOrder":9,

 "isshoprelated":false,

 "iSystem":1,

 "authLevel":3,

 "isExport":true,

 "uncopyable":false,

 "isMasterOrg":false,

 "iAlign":1,

 "bEnableFormat":false,

 "domainKey":"basedoccenter"

}),

### [](#64-关键字段)6.4. 关键字段

||属性||类型||默认值||含义||备注|
||cRefType||Refer||null||参照编码||参照类型|
||cRefRetId||JSON||null||参照返回信息||参照携带。比如"{"warehouseId":"id"}"，意思就是参照选完值以后，将参照选择数据里面的id值，赋值给warehouseId字段|
||refReturn||Refer||Text||null||参照回显值|
||multiple||Bool||false||允许多选||参照是否允许多选|
||displayname(查询区或者cn项目中参照才会配置)||text||null||参照显示字段||由于查询区的参照只有一个字段维护，显示用name字段，搜索用id，一般在查询区，referReturn配置为id，displayname配置为name|
||bCanHandleInput||Bool||true||参照支持手动录入匹配||cStyle配置bCanHandleInput为false时，参照只允许点击弹出，不允许输入|

### [](#65-事件列表-refermodel)6.5. 事件列表 referModel

||事件名||含义||备注|
||beforeBrowse||参照弹出之前||一般在这个时机给参照加过滤条件|
||afterBrowse||参照弹出之后|||
||beforeValueChange||参照值改变之前|||
||afterValueChange||参照值改变之后|||
||afterInitVm||参照弹窗模型初始化之后|||

referViewModel

||事件名||含义||备注|
||afterInit||参照UI原数据请求完毕之后|||

实例
1、获取参照模型

// 卡片中参照（单据扩展脚本） **指的是参照的字段名称（cItemName）

viewmodel.get('**')

// 列表中参照（单据扩展脚本）

viewmodel.getGridModel("xx").getEditRowModel().get("**") // **指的是字段code xx指的是表格code

// 查询区参照

 //如果是查询区扩展脚本，viewmodel指的是filterViewModel(查询区的容器模型)

 viewmodel.on("afterInit", function () {

 let referModel = viewmodel.get('**').getFromModel(); // **指的是字段名称

 referModel.setValue([{id:**,name:**}])

 });

 // 如果是单据扩建脚本，viewmodel指的是单据的viewModel(单据的容器模型)

 viewmodel.on("afterInitCommonViewModel", function () {

 let filterViewModel = viewModel.getCache('FilterViewModel');

 let referModel = filterViewModel.get('**').getFromModel(); // **指的是字段名称

 referModel.setValue([{id:**,name:**}])

 });

 

 

 

// 如果是在参照的扩展脚本中,无论参照在哪 viewmodel就指的是referViewModel(vm)

let referModel = viewmodel.getParams().referModel;

referModel.setValue([{id:**,name:**}])

2、获取参照弹窗的模型（referViewModel也叫vm）

// 需要先获取参照模型，再监听afterInitVm事件即可 (单据的扩展脚本)

let referModel = viewmodel.get('**'); // 参照模型的获取，见1 **指的是字段名称

referModel.on('afterInitVm',function(arg){

 let referViewModel = arg.vm;

 let gridModel = referViewModel.get('table') // 获取参照弹窗的表格模型

 let treeModel = referViewModel.get('tree')

})

 

// 如果是在参照的扩展脚本中init函数内的viewModel即为 referViewModel

3、referViewModel部分初始化代码

// referViewModel模型初始化代码片段

var fields = {

 referInput: new cb.models.SimpleModel(),

 referButton: new cb.models.SimpleModel(),

 filter: new cb.models.SimpleModel(),

 reload: new cb.models.SimpleModel(),

 searchBox: new cb.models.SimpleModel(),

 tree: new cb.models.TreeModel({

 keyField: 'code',

 titleField: 'name',

 multiple: this.getParams().multiple

 }),

 table: new cb.models.GridModel({

 showAggregates: false,

 multiple: this.getParams().multiple,

 dataSourceMode: 'remote',

 override: cb.rest.interMode === 'touch' ? false : true,

 pageInfo: { pageSize: pageSize, pageIndex: 1 }

 }),

 submit: new cb.models.SimpleModel(),

 cancel: new cb.models.SimpleModel(),

 switch: new cb.models.SimpleModel()

};

this.setData(fields);