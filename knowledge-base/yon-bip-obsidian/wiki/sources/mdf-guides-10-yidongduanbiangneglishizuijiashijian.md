---
title: "移动端变更历史最佳实践"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/10-yidongduanbiangneglishizuijiashijian"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 6
---

# 移动端变更历史最佳实践

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/10-yidongduanbiangneglishizuijiashijian | 所属：指南

# [](#移动端变更历史最佳实践)移动端变更历史最佳实践

## [](#1-需求背景)1. 需求背景

业务数据有展示变更需求的场景，比如审批单，或者变更单之类的场景均可使用变更历史，具体的细节就是单版本变更与多版本变更的差别，下面针对两种方案进行展示及配置说明。

## [](#2-预览效果)2. 预览效果

### [](#21-多版本变更历史)2.1. 多版本变更历史

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yidongduanbiangneglishizuijiashijian_image1.58508a37.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yidongduanbiangneglishizuijiashijian_image2.dd2aaf39.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yidongduanbiangneglishizuijiashijian_image3.fde6b62e.png)

 多版本变更历史可以通过点击变更历史展开时间轴弹窗，从下部弹出，选择一个具体的版本可展示当前版本和上个版本的数据差异，弹窗消失后，原本的"变更历史"四个字也会展示成对应的版本号，再次点击当前版本，可以取消变更展示效果。选择其他版本，可以切换业务数据对比版本。

文档请见[移动端变更历史（时间轴形式多版本对比）](#/guides/10-yidongduanbiangenglishishijianzhouduobanbengduibi)

### [](#22-单版本变更历史)2.2. 单版本变更历史

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yidongduanbiangneglishizuijiashijian_image4.1a808684.png)

## [](#3-配置方式)3. 配置方式

### [](#31-多版本)3.1. 多版本

最佳使用方式需要UI模板配置➕扩展脚本编写，建议认真阅读后配置。

#### [](#311-ui模板)3.1.1. UI模板

如上图多版本变更历史效果图展示，变更历史建议配置在页面的footer的左toolbar中，下图为UI模板结构示意图

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yidongduanbiangneglishizuijiashijian_image5.5834c024.png)

UI模板json示例数据为：

{

 "UI#cName": {

 "en_US": "Bottom Button Region",

 "id_ID": "Daerah Tombol Bawah",

 "in_ID": "Daerah Tombol Bawah",

 "zh_CN": "底部按钮区",

 "zh_TW": "底部按鈕區"

 },

 "bMain": true,

 "cAlign": "top",

 "cCode": "st_purchaseorder",

 "cControlType": "ysfooter",

 "cDataSourceName": "pu.purchaseorder.PurchaseOrder",

 "cGroupCode": "YSFooter",

 "cName": "底部按钮区",

 "cName_resid": "P_YS_PF_PC-UI_0000167328",

 "cPrimaryKey": "id",

 "cSubId": "PU",

 "children": [

 {

 "bMain": true,

 "billnumber": "st_purchaseorder",

 "cAlign": "left", // 重点！！！

 "cControlType": "toolbar",

 "cDataSourceName": "toolbar",

 "cGroupCode": "FooterToolbar_left",

 "children": [

 {

 "UI#isShow": true,

 "auth_level": 5,

 "billnumber": "st_purchaseorder",

 "cCaption": "变更历史",

 "cControlType": "changebentchselector",

 "cItemName": "btnChangebentch",

 "cShowCaption": "变更历史",

 "designId": "toolbarItem_1541111798722461786",

 "iOrder": 15,

 "iStyle": 2,

 "id": "1541111798722461786",

 "nid": "nid_1670228497149_718",

 "pubts": "1698635328000",

 "subid": "PU",

 "sysid": "116039525",

 "system": 1,

 "toolbar": "FooterToolbar_left",

 "uiObject": "controls",

 "uiTable": "BillToolbarItem",

 "uiisview": true,

 "uititle": "变更历史",

 "uitype": "changebentchselector"

 }

 ],

 "designId": "toolbar_26463577215",

 "groupId": "26463577215",

 "iOrder": 0,

 "nid": "nid_1655175927155_729",

 "parent": "YSFooter",

 "pubts": "1683189414000",

 "subid": "PU",

 "system": 1,

 "templateType": "3",

 "terminalType": "3",

 "tplmode": 3,

 "uiObject": "containers",

 "uiTable": "BillToolbar",

 "uiisview": true,

 "uititle": "工具栏",

 "uitype": "toolbar",

 "UI#isShow": true,

 "UI#controlOrderArr": [

 15

 ],

 "UI#otherOrderArr": []

 },

 {

 "bMain": true,

 "billnumber": "st_purchaseorder",

 "cAlign": "right",

 "cControlType": "toolbar",

 "cDataSourceName": "toolbar",

 "cGroupCode": "FooterToolbar_right",

 "cStyle": "{\"hideWorkflowBtn\":true,\"sort\":\"desc\"}",

 "children": [

 ......

 ],

 "designId": "toolbar_26463577216",

 "groupId": "26463577216",

 "iOrder": 10,

 "nid": "nid_1655175927155_731",

 "parent": "YSFooter",

 "pubts": "1683189414000",

 "subid": "PU",

 "system": 1,

 "templateType": "3",

 "terminalType": "3",

 "tplmode": 3,

 "uiObject": "containers",

 "uiTable": "BillToolbar",

 "uiisview": true,

 "uititle": "工具栏",

 "uitype": "toolbar",

 "UI#isShow": true,

 "UI#controlOrderArr": [

 ],

 "UI#otherOrderArr": []

 }

 ],

 "designId": "group_1606562375868088343",

 "groupId": "1606562375868088343",

 "iBillEntityId": "723622929",

 "iBillId": "1004454424631",

 "iCols": 0,

 "iOrder": 170,

 "iParentId": "1606562375868088326",

 "iSystem": true,

 "iTplId": "1606562375868088325",

 "isDeleted": false,

 "nid": "nid_1670228497149_717",

 "pubts": "1670228499000",

 "sysid": "36123572",

 "uiDesignHidden": "true",

 "uiObject": "containers",

 "uiTable": "BillTplGroupBase",

 "uiisview": true,

 "uikey": "st_purchaseorder",

 "uititle": "底部按钮区",

 "uitype": "ysfooter",

 "UI#isShow": true,

 "UI#controlOrderArr": [],

 "UI#otherOrderArr": [

 0,

 10

 ]

}

上面的重点配置在于
footer中配置两个toolbar，一个cAlign是left一个是right，left的toolbar中配置controlType为changebentchselector的组件，即可完成配置。

如果配置到cAlign为right的toolbar中，会出现这个bug，是因为组件会卸载，导致逻辑不生效
[QDKJ-43222](https://gfjira.yyrd.com/browse/QDKJ-43222?src=confmacro) -
由于意外的错误不能检索数据。

应用构建设计器的配置方式比较简单，只需要满足如下结构即可完成配置：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yidongduanbiangneglishizuijiashijian_image6.d270a0a5.png)

MDD
UI模板的配置方式需要编辑几张表，请查看文档[toolbar配置方式](#/components-web/02-toolbar#42-toolbar%E6%A0%87%E9%A2%98%E5%8C%BA%E9%85%8D%E7%BD%AE)。

#### [](#312-扩展脚本)3.1.2. 扩展脚本

移动端变更历史仅作为浏览态下的展示，所以需要在编辑态或新增等可以编辑的单据状态时，对该组件进行隐藏处理，浏览态再显示出来，因此需要编写如下扩展脚本：

// 单据的扩展脚本中编写

viewModel.on('modeChange', mode => {

 if (mode === 'browse') { // 浏览态

 viewModel.get('变更历史组件的cItemName').setVisible(true)

 } else {

 viewModel.get('变更历史组件的cItemName').setVisible(false)

 }

})

### [](#32-单版本)3.2. 单版本

参考文档[移动端变更历史](#/guides/10-yidongduanbiangenglishi)