---
title: "移动列表 VoucherList Mobile"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/04-voucher-list-mobile"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 移动列表 VoucherList Mobile

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/04-voucher-list-mobile | 所属：API

# [](#移动列表-voucherlist-mobile)移动列表 VoucherList Mobile

注：移动端共用 Web 端的 voucherlist 里的方法，详细可见 [列表 VoucherList](#/api/04-voucher-list)

## [](#1-biz-action清单)1. Biz Action清单

||**方法名**||**解析**||**用法**|
||`workflow`||审批||配置可用|
||`workflowhistory`||审批历史||配置可用|
||`share`||分享||配置可用，也可配合扩展脚本-修改分享的模版|
||`printpreview`||打印预览||配置可用|
||`ems`||物流信息||需配合扩展脚本使用，并且meta元数据配置物流信息页面-routerpage|
||`lineopen`||启用||配置可用|
||`lineclose`||停用||配置可用|
||`phone`||打电话||配置可用|
||`singlepushfromsharebtn_single`||催审-友空间||配置可用|
||`singlepushfromsharebtn`||催审-弹框选择友空间，微信||配置可用|
||`singlepushfromshareurl`||分享出去的按钮执行下单||配置可用|
||`scanfordepository`||移动端扫码入库||配置可用|

## [](#2-biz-action详解)2. Biz Action详解

### [](#21-share-分享模板字符串)2.1. share-分享模板字符串

#### [](#211-基本信息)2.1.1. 基本信息

原理：

- 使用标签 `$var{` 和 `}$var_end` 包裹变量，其他固定内容字符串拼出就可以。
- JSON 数据格式规范参照友空间要求。

#### [](#212-获取时机)2.1.2. 获取时机

const SHAREPARAMSTEMPLATE = {

 //头部

 title: {

 content: '单号：$var{code}$var_end'

 },

 // 模板的子内容，单行文字。

 subContent: [{

 text: '供应商：$var{vendor_name}$var_end',

 }],

 //模板的操作区域，按钮加单行文字。

 operation: {

 columnText: [{

 text: '金额$var{oriSum}$var_end $var{currency_name}$var_end',

 }]

 },

 //模板的内容，复合内容。按料下只展示singlePicText；按单只展示textArray和hideArray

 content: {

 textArray: [

 { text: '产品名称：$var{product_cName}$var_end产品$var{product_cCode}$var_end' }

 ],

 hideArray: [

 { text: '产品名称：$var{product_cName}$var_end产品$var{product_cCode}$var_end' }

 ],

 singlePicText: {

 pic: '$var{product_defaultAlbumId}$var_end',

 title: '$var{product_cName}$var_end $var{product_cCode}$var_end',

 content: '交期：$var{recieveDate}$var_end数量：$var{qty}$var_end',

 url: ''

 }

 }

}

const TEMPLATE = JSON.stringify(SHAREPARAMSTEMPLATE)

#### [](#213-修改值)2.1.3. 修改值

- 在 Excel 中配置，在 `parameter` 中设置 `'{"templateStr":把上面的TEMPLATE的内容粘贴到这里}'`
- 在 `beforeShare` 的时候，在 `params` 中设置 `params.cParameter=JSON.stringify({templateStr:TEMPLATE})`

viewmodel.on('beforeShare',({params})=>{

 params.cParameter = JSON.stringify({templateStr:TEMPLATE});

})

### [](#22-ems-物流信息)2.2. ems-物流信息

#### [](#221-基本信息)2.2.1. 基本信息

- 采购订单行上的按钮 action 为 ems
- Excel 需要预置物流信息页面

[billtplgroup_base]

||**模板分组编码 cCode**||**模板分组名称 cName**||**模板类型 cType**||**排列方式 cStyle**|
||`RouterPage`||物流信息页面_路由||`RouterPage`|||
||`EMSCard`||物流信息||`EMSCard`|||

#### [](#222-修改值)2.2.2. 修改值

需要扩展脚本给EMSCard组件设置物流信息列表数据。

//物流信息接口事件：拼装参数

viewmodel.on('emsListChange', function (data) {

 let url = 'bill/querySendBillInfo';

 let sourceid = data.billId;

 let sourceautoid = data.childId;

 let params = { "sourceid": sourceid, "sourceautoid": sourceautoid };

 var proxy = viewmodel.setProxy({ ensure: { url: url, method: "POST" } });

 proxy.ensure(params, function (err, result) {

 if (err) {

 cb.utils.alert(err.message, 'error');

 } else {

 let LogisticsBillNos = [];

 if (result && result.length) {

 result.forEach((element, index) => {

 let cLogistics = {};

 cLogistics.nu = element.cLogisticsBillNo;

 cLogistics.recieveDate = element.recieveDate;

 LogisticsBillNos.push(cLogistics);

 });

 }

 viewmodel.execute('setEmsData', { LogisticsBillNos });

 }

 });

});

#### [](#223-物流列表数据)2.2.3. 物流列表数据

||**字段**||**字段解析**|
||`nu`||物流单号|
||`comName`||承运快递|
||`expPhone`||电话|
||`recieveDate`||预计送达时间|