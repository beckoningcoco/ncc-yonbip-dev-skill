---
title: "新手引导"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/11-xinshouyingdao"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 新手引导

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/11-xinshouyingdao | 所属：指南

# [](#新手引导)新手引导

## [](#1-新手引导示例图)1. 新手引导示例图

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/xinshouyingdao_image1.1715da51.png)

## [](#2-新手引导配置说明)2. 新手引导配置说明

||序号||字段名||字段含义|
||1||id||唯一标识符|
||2||orderNumber||序号|
||3||guideName||title显示名称|
||4||descriptions||content显示内容|
||5||fieldId||页面圈选dom的fieldid|
||6||billNo||当前提示所属单据的billNo|
||7||cControlType||当前圈选dom对应的组件类型|
||8||actionType||点击下一步时候是否需要触发一次点击动作|
||9||placement||left/top/bottom/right 提示框弹出方向|

## [](#3-新手引导配置数据示例)3. 新手引导配置数据示例

[

 {

 id: 'sale_1',

 orderNumber: 1,

 guideName: '采购订单采购订单采购订单采购订单采购订单采购订单',

 descriptions: '搜索按钮,用来查询页面数据,采购订单是企业内部执行销售活动的起点，通过采购订单确认客户的要货需求，支持采购订单的录入、审核、查询、收款、下推发货等。,采购订单是企业内部执行销售活动的起点，通过采购订单确认客户的要货需求，支持采购订单的录入、审核、查询、收款、下推发货等。采购订单是企业内部执行销售活动的起点，通过采购订单确认客户的要货需求，支持采购订单的录入、审核、查询、收款、下推发货等。采购订单是企业内部执行销售活动的起点，通过采购订单确认客户的要货需求，支持采购订单的录入、审核、查询、收款、下推发货等。采购订单是企业内部执行销售活动的起点，通过采购订单确认客户的要货需求，支持采购订单的录入、审核、查询、收款、下推发货等。采购订单是企业内部执行销售活动的起点，通过采购订单确认客户的要货需求，支持采购订单的录入、审核、查询、收款、下推发货等。采购订单是企业内部执行销售活动的起点，通过采购订单确认客户的要货需求，支持采购订单的录入、审核、查询、收款、下推发货等。',

 fieldId: 'st_purchaseorderlist|search',

 billNo: 'st_purchaseorderlist'

 },

 {

 id: 'sale_2',

 orderNumber: 2,

 guideName: '采购订单',

 descriptions: '采购订单是企业内部执行销售活动的起点，通过采购订单确认客户的要货需求，支持采购订单的录入、审核、查询、收款、下推发货等。',

 fieldId: 'st_purchaseorderlist|code|0_alink',

 billNo: 'st_purchaseorderlist'

 

 },

 {

 id: 'sale_3',

 orderNumber: 3,

 guideName: '采购订单',

 descriptions: '新增按钮。点击“新增”可录入采购订单页面信息。',

 fieldId: 'st_purchaseorderlist|btnAddDrop_btn',

 cControlType: 'dropdownbutton',

 billNo: 'st_purchaseorderlist'

 

 },

 {

 id: 'sale_4',

 orderNumber: 4,

 guideName: '采购订单',

 descriptions: '参照请购单新增。参照请购单新增。参照请购单新增。参照请购单新增。参照请购单新增。参照请购单新增。参照请购单新增。参照请购单新增。参照请购单新增。参照请购单新增。参照请购单新增。参照请购单新增。',

 fieldId: 'st_purchaseorderlist|btnAddDrop|btnAddSource',

 cControlType: 'button',

 actionType: 'click',

 billNo: 'st_purchaseorderlist'

 

 },

 {

 id: 'sale_5',

 orderNumber: 5,

 guideName: '采购订单拉单界面',

 descriptions: '搜索按钮,用来查询页面数据',

 fieldId: 'pu_applyorderlist_pullx|search',

 actionType: 'click',

 billNo: 'pu_applyorderlist_pullx'

 

 },

 {

 id: 'sale_6',

 orderNumber: 6,

 guideName: '采购订单拉单界面',

 descriptions: '点击生单。点击生单。点击生单。点击生单。点击生单。点击生单。',

 fieldId: 'pu_applyorderlist_pullx|btnBatchPurchase',

 billNo: 'pu_applyorderlist_pullx'

 },

]

## [](#4-扩展脚本使用新手引导)4. 扩展脚本使用新手引导

### [](#41-plana)4.1. PlanA

viewModel.on('guideComplete', () => {

 viewModel.execute('guideInit', data); // data的结构参照上面的配置示例

})

### [](#42-planb)4.2. PlanB

viewModel.execute('updateViewMeta', {

 code: 'guideMetaContainer', // 这里是固定值

 visible: true, // 显示引导

 guideData: data, // data结构参考上面的配置示例

 curPopIndex: N, // 从第N步开始引导 (N为索引)

 confirmInfo: xxx, // 第N步的数据

 extendLayOutClassName: 'class1', // 下拉扩展类名

 mask: false // 不显示遮罩层（建议仅在只有一条提示的时候使用）

})

## [](#5-注意事项)5. 注意事项

- fieldId必须是页面上可以找到的dom，如果该dom在特定场景下可能不存在，则会进行重试，如果是接口调用返回的场景如可以在重试后拿到该dom则可继续向下进行引导，否则会停止引导。如发生这种情况的现象为一开始只有灰色遮罩层但是没有引导弹窗，过了大概十秒钟遮罩层会消失
- orderNumber如果错误可能会导致显示步骤错误
- guideName支持中文12个字，超出部分隐藏
- descriptions最多显示四行文字，超出滚动
- billNo如缺失可能导致引导错误
- cControlType虽然不是必须参数但是建议全都配上，避免有些特殊场景下需要进行特殊操作时候获取不到cControlType无法进行顺序引导，目前必须配置的场景是下拉按钮
- actionType的含义必须按照相关业务逻辑进行配置，需要触发点击的时候actionType才配为click否则不需要配置