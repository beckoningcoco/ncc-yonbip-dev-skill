---
title: "参照 Refer"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/01-refer"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 17
---

# 参照 Refer

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/01-refer | 所属：移动组件

# [](#参照-refer)参照 Refer

## [](#1-功能说明)1. 功能说明

数据快速录入。

## [](#2-效果展示)2. 效果展示

### [](#21-参照控件)2.1. 参照控件

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Refercanzhao-image1.e0108528.png)

### [](#22-参照类型弹窗)2.2. 参照类型弹窗

#### [](#221-树参照-tree)2.2.1.  树参照 tree

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Refercanzhao-image2.d3c04007.png). 
               
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Refercanzhao-image3.68c5efa2.png). 
               
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Refercanzhao-image4.63761030.png)

#### [](#222-表参照-table)2.2.2.  表参照 table

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Refercanzhao-image5.64c4c752.png). 
               
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Refercanzhao-image6.ecc00e4c.png) 
               
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Refercanzhao-image7.dc562168.png)

#### [](#223-树表参照)2.2.3.  树表参照

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Refercanzhao-image8.e0613229.png). 
               
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Refercanzhao-image9.811dc8a0.png). 
               
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Refercanzhao-image10.24527c9f.png)

#### [](#224-级联参照)2.2.4. 级联参照

新版地市区级联数据类型改成参照 使用方式同参照 

**区别 正常参照存的是 id和name 级联参照存的是id和path**

**配置需要注意：billitem_base表 refReturn 配置成path
cFieldName配置成**.path**

### [](#23-参照显示的类型)2.3. 参照显示的类型

由 /ref/getRefMeta 接口返回的数据的 refEntity 中 **cTpltype** 决定

||参照类型||cTplType|
||参照类型||cTplType|
||树||Tree, TreeRefer|
||表||Table|
||树表||TreeTable, TreeList|

## [](#3-基本属性)3. 基本属性

### [](#31-参照控件自身refermodel)3.1. 参照控件自身（referModel）

||属性名称||属性含义||值类型||默认值||属性说明|
||属性名称||属性含义||值类型||默认值||属性说明|
||visible||可见状态||bool||true||-|
||disabled||失效状态||bool||false||false 文本框可输入，参照按钮可点击，true 文本框不可输入，参照按钮不可点，完全禁用|
||readOnly||只读||bool||false||控制效果与 disabled 相反|
||bIsNull||允许为空||bool||true||true 不必输，false 必输|
||bSmartSearch||支持智能录入||bool||true||按输入框内容搜索|
||bCanHandleInput||输入框可否输入||bool||true||false 时点输入框直接打开参照|
||customOkEvent||自定义确定事件||fun||--||单独引用参照控件时，可以传入自定义事件，此事件会在点击参照弹窗的确定按钮时触发，如果有自定义事件，则不会走参照的默认关闭参照页面，选中参照数据等一系列操作。需要自己单独处理页面交互。|

### [](#32-拓展属性cstyleextendfield)3.2. 拓展属性（cStyle，extendField）

||属性名称||属性含义||值类型||默认值||属性说明|
||allowClear||允许删除||bool||true||true时值非空时输入框右侧显示清空按钮，false时无|
||inputValid||参照可手动录入并保存||bool||-||true可存 false 不可存|
||checkValid||参照可手动录入并保存||bool||-||false可存 true 不可存|
||bCanHandleInput||输入框是否可录入||bool||true||false时不能手动输入，点输入框自动弹参照|
||selectedHasBg||参照选中行开启背景色||bool||false||参照行选中状态是否有背景色效果|
||selectedBgColor||参照选中行背景色色值||string||#f6f6f6||属性值为色值，selectedHasBg配置为true时生效|
||subUiType||显示类型||string||-||树类型，表类型默认为弹窗展示，如果需要打开新页面的展示形式，配成normal即可，树表类型是以新页面形式打开|
||placeholder||占位符||string||开启了smartSearch占位符是 ‘搜索或点击箭头选择’。不开启smartSearch占位符是 ‘请选择’||可配置自定义输入框占位符内容|
||showSearchBox||是否显示搜索框||bool||true||false 不显示|
||树参照的特有属性|||||||||
||hideLevelCount||隐藏下级节点数量||bool||-||该属性仅适用于树参照，默认父节点右侧显示下级节点数量，配置false则不显示|
||bHideLinkPageBtn||是否隐藏关联下级按钮||bool||true||是否隐藏关联下级按钮，默认隐藏下级按钮，如需使用需配置该属性为 false (只有树参照生效)|
||bLinkage||是否联动下级选中状态||bool||false||该属性为bHideLinkPageBtn为 false 时，关联下级开关的默认值。|
||onlyLeafCanSelect||仅末级可选||bool||false||该属性为true时，则联动下级失效|
||isSelectOneBranch||树分支共同选择||bool||false||该属性为同层级只能选中单个树节点，但是会联动选中该节点的所有下级节点，同层级间节点选中状态互斥（参照为多选参照，可以理解为每个数的层级节点以及其所有下级是一个集合，同层级集合间选中状态互斥）|

注意：以上属性均可在拓展脚本中使用 model.setState(key, value) 设置。

输入框 focus 事件

model.on('focus', callback) , 如果在focus事件调用model.browse(),
该事件与smartSearch交互有冲突，需拓展脚本model.setState('bSmartSearch',
false)才会生效。

### [](#33-参照控件弹窗-referviewmodel)3.3. 参照控件弹窗 (referViewModel)

||属性名称||属性含义||值类型||默认值||属性说明|
||bShowAlbum||展示图片列||boolean||false||true 时显示图片|
||albumKeyField||图片数据字段||string||albumId|||
||columnShowNumber||默认显示列数||number||2||超过两列显示 展开收起 右侧更多箭头|
||rowDisplayMode||行展示方式||string||modal||modal： 弹窗形式，超过显示列数会在右侧显示更多按钮（新交互）inline: 行内形式，超过显示列数会在底部显示展开/收起（原交互）|
||splicingKeyField||需要拼接展示的字段||string||--||例如，需要将参照上的name,code,id字段拼接展示，配置值为 'name,code,id' 即可|
||splicingChar||拼接连接符||string|||||
||splicingTagChar||参照数据中 tag 类型字段展示时会拼接数据展示，该属性为拼接展示的拼接符||string||，||默认以 竖线 ‘，’拼接，可配置自定义拼接符|
||showExactSearch||显示 ‘精确搜’｜｜‘模糊搜’ 切换||boolean||false||适用于 table, treetable 类型。效果如图![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Refercanzhao-image11.2f46b467.jpeg)|

**注: 以上属性配置在 /ref/getRefMeta 中 pub_ref 表中的 extendField
上，控制的是 referViewModel 上 table 数据的展示**

## [](#4-参照拼接配置)4. 参照拼接配置

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Refercanzhao-image12.3fa69335.jpeg) 
             
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Refercanzhao-image13.2eba93f3.jpeg)

### [](#41-配置拓展属性)4.1.  配置拓展属性

extendField 中配置 splicingKeyField属性，定义好需要拼接的字段即可。

splicingChar: '|' // 默认以'|'拼接

splicingKeyField: ‘code,name,title’

### [](#42-配置字段类型)4.2.  配置字段类型

更改参照模板上的字段属性，将需要拼接的字段的 cControlType 改为 **join**,
即认为该字段为拼接字段。(二者配置一种即可)

## [](#5-可编辑树表参照)5. 可编辑树表参照

由于编辑用于回显使用者的行数据，所以该配置为使用者配置

和 table
的编辑信息同级添加一个cControlType:"hiddenReferContainer"的配置，

containers 配置分为两部分，containers[0]
对应参照行的配置信息，containers[1] 对应实际table的其他行可编辑信息。

### [](#51-配置示例)5.1. 配置示例

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Refercanzhao-image14.6ccc8629.jpeg)

### [](#52-动态设置参照编辑行上stepper的数量和单位)5.2. 动态设置参照编辑行上stepper的数量和单位

referModel.on('afterInitVm', params => {

 const { vm } = params

 const gridModel = vm.get('table')

 gridModel.on('afterSetDataSource', () => {

 const rows = gridModel.getRows() // 参照table对应的行

 const cellStates = []

 rows.forEach((item, index) => {

 cellStates.push({ rowIndex: index, cellName: 'editControls', propertyName: 'editControls', value: [{ cItemName: 'applyNum1', control: { unitName1: '箱', disabled: true } }] })

 })

 gridModel.setCellStates(cellStates)

 })

})

### [](#53-树表参照新交互)5.3. 树表参照新交互

在参照对应元数据的cStyle或者refMeta接口里增加配置{ useNewReferTree:
true}

交互如下图 左树右表形式展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Refercanzhao-image15.57e7cad1.png)

## [](#6-树表参照配置查询区)6. 树表参照配置查询区

配置同pc端一样，refEntity中配置filterId.

在顶部展示只支持 **select** 类型，在顶部展示的查询项，extendField 中配置
topShow： true.

## [](#7-参照显示自定义标签)7. 参照显示自定义标签

给参照模型添加一个自定义的渲染函数即可 (所有参照均支持)

const setCustomTag = (args) => { // 这里的参数为每一个树节点的数据

 return (

 // 示例，具体内容自己写

 <div>{args?.id}</div>

 )

// 拓展脚本拿到每一行的行数据，进行自己的逻辑判断，

// 返回值可以返回自定义 dom 元素，这里返回的就是自定义标签的渲染，完全由拓展控制

}

referModel.setState('setCustomTag', setCustomTag) // 将自定义渲染方法添加到参照模型里即可。

## [](#8-表参照自定义模板配置)8. 表参照自定义模板配置

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Refercanzhao-image16.c542f844.jpeg) 
                 
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Refercanzhao-image17.4c5fe539.jpeg)

模板配置仅支持配置列表上的 1 区域，已选 2
区域保持与列表区显示一致。以下示例中仅配置了两行table数据，可自定义配置，注释中特殊标柱的都是必配的参数。

export default {

 "billid":1002398416,

 "cBillName":"库存组织参照",

 "cBillNameResid":"P_YS_PF_BD-UI_0000157807",

 "bPrintLimited":true,

 "cBillType":"ArchiveList",

 "cBillNo":"aa_orgstockref",

 "bAllowMultiTpl":true,

 "cSubId":"AA",

 "cCardKey":"aa_orgstockref",

 "view":{

 "iTplId":2197404,

 "cTemplateName":"组织档案",

 "cTemplateNameResid":"P_YS_PF_GZTTMP_0000075233",

 "iTplMode":0,

 "iWidth":10000,

 "cTemplateTitle":"组织",

 "cTitle_resid":"P_YS_PF_GZTSYS_0000012499",

 "containers":[

 {

 "groupId":111203539,

 "cName":"commonToolbar",

 "iOrder":0,

 "cDataSourceName":"Toolbar",

 "cControlType":"Toolbar",

 "cGroupCode":"commonToolbar",

 "cAlign":"top",

 "iCols":0,

 "cStyle":"{\"type\":\"common\"}",

 "controls":[

 {

 "cItemName":"btnBillsetting",

 "cCaption":"UI模板",

 "cCaptionResid":"P_YS_PF_PROCENTER_0001131739",

 "cShowCaption":"UI模板",

 "cShowCaptionResid":"P_YS_PF_PROCENTER_0001131739",

 "bEnum":false,

 "cControlType":"button",

 "iOrder":4,

 "iStyle":0,

 "enterDirection":0,

 "bEnableFormat":false,

 "key":"Control.ToolbarItem.111203539"

 },

 {

 "icon":"kuaijiejianbangzhu",

 "cItemName":"btnShortCutsHelp",

 "cCaption":"快捷键帮助",

 "cCaptionResid":"P_YS_FW-PUB_MDD-BACK_0001345842",

 "cShowCaption":"快捷键帮助",

 "cShowCaptionResid":"P_YS_FW-PUB_MDD-BACK_0001345842",

 "bEnum":false,

 "cControlType":"button",

 "iOrder":5,

 "iStyle":0,

 "enterDirection":0,

 "bEnableFormat":false,

 "key":"Control.ToolbarItem.11641959140380"

 },

 {

 "icon":"tongzhi",

 "cItemName":"btnReviewEventLog",

 "cCaption":"事件中心联查",

 "cCaptionResid":"P_YS_FW-PUB_MDD-BACK_0001523514",

 "cShowCaption":"事件中心联查",

 "cShowCaptionResid":"P_YS_FW-PUB_MDD-BACK_0001523514",

 "bEnum":false,

 "cControlType":"button",

 "iOrder":10,

 "iStyle":0,

 "enterDirection":0,

 "bEnableFormat":false,

 "key":"Control.ToolbarItem.11641961143855"

 }

 ],

 "key":"ContainerToolbarcommonToolbar",

 "parentKey":"commonToolbar"

 },

 {

 "groupId":19485230,

 "cName":"flex自由布局",

 "cNameResid":"P_YS_PF_PC-UI_0000160600",

 "iOrder":10,

 "bMain":true,

 "cCode":"aa_orgstockref",

 "cDataSourceName":"aa.baseorg.InventoryOrgMV",

 "cControlType":"flex",

 "cGroupCode":"aa_orgtree_tree",

 "cAlign":"center",

 "iCols":0,

 "cStyle":"{\"renderReferTemplate\":\"true\"}", // 此配置必须配，否则还是默认的参照模板渲染

 "containers": [

 {

 "groupId":19485230,

 "cName":"头像内容区",

 "cNameResid":"P_YS_PF_PC-UI_0000160600",

 "iOrder":10,

 "bMain":true,

 "cCode":"aa_orgstockref",

 "cDataSourceName":"aa.baseorg.InventoryOrgMV",

 "cControlType":"view",

 "cGroupCode":"aa_orgtree_tree",

 "cAlign":"center",

 "iCols":0,

 "controls":[

 {

 "cItemName":"code", // 对应头像图片字段

 "cCaption":"头像",

 "cCaptionResid":"P_YS_HR_HRCOREF_0000058481",

 "cShowCaption":"头像",

 "cShowCaptionResid":"P_YS_HR_HRCOREF_0000058481",

 "iMaxLength":255,

 "iFieldType":1,

 "bEnum":false,

 "bMustSelect":true,

 "bHidden":false,

 "bSplit":false,

 "bExtend":false,

 "bCanModify":true,

 "iMaxShowLen":255,

 "iColWidth":255,

 "iAlign":1,

 "bNeedSum":false,

 "bShowIt":true,

 "bFilter":true,

 "bIsNull":false,

 "bPrintCaption":true,

 "bJointQuery":false,

 "bPrintUpCase":false,

 "bSelfDefine":false,

 "cControlType":"HeadPortraitCombination", // 头像组件的组件类型

 "iOrder":1,

 "cOrder":"asc",

 "bMain":true,

 "cStyle":"{\"subUiType\":\"avatarName\",\"genderField\":\"parent_code\"}", // subUiType: avatarName 固定配置（必须配）, genderField: xxx(该值代表性别字段, 对应参照数据里的性别字段, 如不配置则不显示人员性别)

 "id":205954770,

 "bVmExclude":0,

 "iBillTplGroupId":19485230,

 "iBillId":1002398416,

 "iBillEntityId":3857554,

 "iTplId":2197404,

 "cSubId":"AA",

 "iSystem":1,

 "cName":"code",

 "cFieldName":"org.code",

 "authLevel":3,

 "cDataSourceName":"aa.org.InventoryOrg",

 "enterDirection":4,

 "bEnableFormat":false

 },

 ],

 },

 {

 "groupId":19485230,

 "cName":"组织档案左树",

 "cNameResid":"P_YS_PF_PC-UI_0000160600",

 "iOrder":10,

 "bMain":true,

 "cCode":"aa_orgstockref",

 "cDataSourceName":"aa.baseorg.InventoryOrgMV",

 "cControlType":"Table", // 必配

 "cGroupCode":"aa_orgtree_tree",

 "cAlign":"center",

 "iCols":0,

 "controls":[

 {

 "cItemName":"code",

 "cCaption":"组织编码",

 "cCaptionResid":"P_YS_HR_HRCOREF_0000058481",

 "cShowCaption":"组织编码",

 "cShowCaptionResid":"P_YS_HR_HRCOREF_0000058481",

 "iMaxLength":255,

 "iFieldType":1,

 "bEnum":false,

 "bMustSelect":true,

 "bHidden":false,

 "bSplit":false,

 "bExtend":false,

 "bCanModify":false, // 必配

 "iMaxShowLen":255,

 "iColWidth":255,

 "iAlign":1,

 "bNeedSum":false,

 "bShowIt":true,

 "bFilter":true,

 "bIsNull":false,

 "bPrintCaption":true,

 "bJointQuery":false,

 "bPrintUpCase":false,

 "bSelfDefine":false,

 "cControlType":"Input", // 组件类型最好配置为 input

 "iOrder":1,

 "cOrder":"asc",

 "bMain":true,

 "id":205954770,

 "bVmExclude":0,

 "iBillTplGroupId":19485230,

 "iBillId":1002398416,

 "iBillEntityId":3857554,

 "iTplId":2197404,

 "cSubId":"AA",

 "iSystem":1,

 "cName":"code",

 "cFieldName":"org.code",

 "authLevel":3,

 "cDataSourceName":"aa.org.InventoryOrg",

 "enterDirection":4,

 "bEnableFormat":false

 },

 {

 "cItemName":"name",

 "cCaption":"组织名称",

 "cCaptionResid":"P_YS_FED_UCFORG_0000031965",

 "cShowCaption":"组织名称",

 "cShowCaptionResid":"P_YS_FED_UCFORG_0000031965",

 "iMaxLength":255,

 "iFieldType":1,

 "bEnum":false,

 "bMustSelect":true,

 "bHidden":false,

 "bSplit":false,

 "bExtend":false,

 "bCanModify":false, // 必配

 "iMaxShowLen":255,

 "iColWidth":255,

 "iAlign":1,

 "bNeedSum":false,

 "bShowIt":true,

 "bFilter":true,

 "bIsNull":false,

 "bPrintCaption":true,

 "bJointQuery":false,

 "bPrintUpCase":false,

 "bSelfDefine":false,

 "cControlType":"Input", // 组件类型最好配置为 input

 "iOrder":2,

 "bMain":true,

 "id":205954771,

 "bVmExclude":0,

 "iBillTplGroupId":19485230,

 "iBillId":1002398416,

 "iBillEntityId":3857554,

 "iTplId":2197404,

 "cSubId":"AA",

 "iSystem":1,

 "cName":"name",

 "cFieldName":"org.name",

 "authLevel":3,

 "cDataSourceName":"aa.org.InventoryOrg",

 "enterDirection":4,

 "bEnableFormat":false

 },

 ],

 "iBillEntityId":3857554

 }

 ]

 },

 ],

 "sysFlag":1,

 "cExtProps":"{\"isMultiCodeRule\":true}"

 },

 "extscripturls":[

 

 ],

 "isCoded":false,

 "bFuncAuthControl":false,

 "pubts":"2022-09-27 13:46:10",

 "cExtProps":"{\"isMultiCodeRule\":true}"

}

## [](#9-查询区枚举项平铺展示)9. 查询区枚举项平铺展示

在查询条件extendField：{ topShow: true, showType: "flat" }