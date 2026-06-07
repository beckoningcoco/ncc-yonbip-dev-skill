---
title: "物流信息 EMSCard"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/05-emscard"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 物流信息 EMSCard

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/05-emscard | 所属：移动组件

# [](#物流信息-emscard)物流信息 EMSCard

## [](#1-功能说明)1. 功能说明

物流信息列表-点击物流列表项-可以进入查询物流状态

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/emscard-wuliuxinxi1.e99afadc.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/emscard-wuliuxinxi2.a5f421de.png)

## [](#3-控制示例)3. 控制示例

excel配置

按钮：btnEMS

命令：cmdEMS

action：ems

#### [](#311-需要写扩展脚本查询物流列表---以采购为例)3.1.1. 需要写扩展脚本查询物流列表---以采购为例

// 物流信息接口事件：拼装参数

viewmodel.on('emsListChange', function (data) {

 // 页面没有新建物流按钮可以不写---推单的按钮

 // 判断新增物流按钮状态-begin

 let currentRow = data.currentRow;

 let urgeBtnVisble = codeMapData.get(currentRow.code) ? codeMapData.get(currentRow.code) : false;

 viewmodel.get("btnEMSPush")?.setVisible(urgeBtnVisble);

 // 判断新增物流按钮状态-end

 

 let url = 'bill/querySendBillInfo';

 let sourceid = data.billId;

 let sourceautoid = data.childId;

 let params = {"sourceid": sourceid,"sourceautoid": sourceautoid};

 var proxy = viewmodel.setProxy({ ensure: { url: url, method: "POST" } });

 proxy.ensure(params, function(err, result) {

 if (err) {

 cb.utils.alert(err.message, 'error');

 } else {

 let LogisticsBillNos = [];

 if (result && result.length) {

 result.forEach((element, index) => {

 let cLogistics = {};

 // 组装数据结构 com承运公司 comName承运单位中文 nu物流单号 recieveDate 预计到达时间

 // com和nu为必传字段，为查物流信息详情使用

 cLogistics.nu = element.cLogisticsBillNo;

 cLogistics.com = element.com;

 cLogistics.comName = element.comName;

 cLogistics.recieveDate = element.recieveDate;

 LogisticsBillNos.push(cLogistics);

 });

 }

 // 物流列表中设置值

 viewmodel.execute('setEmsData',{LogisticsBillNos});

 }

 });

});

#### [](#312-特殊情况---物流页面需要配置按钮)3.1.2. 特殊情况---物流页面需要配置按钮

如果物流详情页面需要配置的按钮, excel需要预置物流信息页面

||**[billtplgroup_base]**|||||||
||**模板分组编码 cCode**||**模板分组名称 cName**||**模板类型 cTpe**||**排列方式cStyle**|
||RouterPage||物流信息页面_路由||RouterPage|||
||EMSCard||物流信息||EMSCard|||

需要在routerpage下配置toolbar，toolbar中配置相关按钮。