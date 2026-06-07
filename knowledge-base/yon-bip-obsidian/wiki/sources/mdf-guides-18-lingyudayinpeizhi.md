---
title: "领域打印配置"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/18-lingyudayinpeizhi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 领域打印配置

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/18-lingyudayinpeizhi | 所属：指南

# [](#领域打印配置)领域打印配置

## [](#1-功能概述)1. 功能概述

目前打印组件实现了打印预览、打印设计、直接打印功能。用户可以在excel中自定义打印按钮的布局。下面是以dropdown形式你实现的。那如何实现打印功能呢，需要用户增加环境变量、excel配置。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingyudayinpeizhi_image1.02ea8359.png)

## [](#2-环境变量配置)2. 环境变量配置

在src/common/config.env.js 下定义打印相关参数配置如下：

- **print_url**: 连接打印的后台地址，不同环境地址会不同。具体地址值在备注中有说明。
- **domainCode**：域code值，不同业务code值不同。具体值可以咨询云打印人员。
- HTTP_PRINT_SERVER:打印请求具体数据连接的后端的服务器地址

具体示例如下：

export default {

 HTTP_SERVICE_BASEURL:base_url,

 HTTP_PRINT_SERVER:print_url,

 HTTP_PRINT_DATA_SERVERURL:base_url+'/bill/print',

 //打印的回调的数据地址

 domainCode:'SCM',//打印需要的域code值

}

## [](#3-ui元数据配置)3. UI元数据配置

首先需要增加打印按钮，配置方式跟普通按钮一样，在Excel中配置[bill_command]表时需要增加paramter、action参数配置。下面为具体的paramter配置说明，其中打印模板printcode、类别编码classifyCode值可向云打印人员咨询。

**打印模板printcode**：打印模板是先找云打印人员开通一个数据库，每个领域都有一个，然后总共多少应用下多少个服务需要打印。当我们打开打印模板节点，就能看到模板类别了。

**类别编码classifyCode**：可以支持切换同类别下不同模板打印。预置模板的时候，可以打印的字段，是根据类别编码来查的，比如我给的EMM.emm_pcplan_card，他就会查emm_pcplan_card这个页面的所有字段，都可以配置出来，我这边查询也按照emm_pcplan_card来查询，确保他配置的字段我都能查询出来，这样打印才不会出现打印不出来字段情况

### [](#31-打印预览)3.1. 打印预览

- paramter对象字段说明

||属性名称||含义||备注|
||`printcode`||打印模板||eg: "voucher_system_default_20190515"|
||`classifyCode`||类别编码|||
||`serverUrl`||数据源请求的URL，打印时会通过`serverUrl`请求业务数据||可以通过扩展脚本实现，参考下面的扩展API|
||`params`||请求业务数据时，会根据此参数进行筛选，具体由业务来定||可以通过扩展脚本实现|

整体配置如下：

{"printcode":"emm_pcplan_card_print"，"classifyCode":"EMM.emm_pcplan_card"}

- action字段说明

      打印预览的action字段为printpreview

### [](#32-打印设计)3.2. 打印设计

- paramter对象字段说明

||属性名称||含义||备注|
||`printcode`||打印模板||eg: "voucher_system_default_20190515_20190515"|

整体配置如下：

{"printcode":"voucher_system_default_20190515"}

- action字段说明

      打印预览的action字段为printdesign

### [](#33-直接打印)3.3. 直接打印

- paramter对象字段说明

||**属性名称**||**含义**||**备注**|
||`printcode`||打印模板||eg: "voucher_system_default_20190515"|
||`serverUrl`||数据源请求的URL|||
||`params`||请求数据的参数||eg: `{"metaurl":"bd.currencytenant.CurrencyTenantVO"}`|

整体配置如下：

{"templateCode": "voucher_system_default_20190515","tenantId":
"lfvukx6f", "params": { "metaurl":
"bd.currencytenant.CurrencyTenantVO"
},"serverUrl":"http://<工作台域名>/meta/attribute" }

- action字段说明

      打印预览的action字段为printnow

## [](#4-扩展api)4. 扩展API

beforePrintpreview
打印预览之前的回调，用户可以动态的修改params参数，beforePrintdesign
打印设计之前的回调，用户可以动态的修改params参数，如下：

ViewModel.on('beforePrintpreview',(params)=>{

 let cmdParameter = JSON.parse( params.cmdParameter);

 //动态的修改cmdParameter内容

 cmdParameter.serverUrl = '请求数据的url';

 cmdParameter.params = '请求数据所需要的参数';

 //例如下面代码：

 //cmdParameter.serverUrl = window.__SERVER_URL__.SRV_URL + "/bill/getPrintData";

 //let billNo = viewmodel.getParams().billNo;

 //const ids = [viewmodel.get("id").getValue()];

 //cmdParameter.params = {

 // ids: ids, billno: billNo,

 //}

 //最后将修改后的内容赋值给params；

 data.params.cmdParameter = JSON.stringify(cmdParameter);

})

## [](#5-二维打印-按钮配置)5. 二维打印 按钮配置

action字段说明：
二维打印的action字段为 print2dtablepreview

扩展脚本配置二维表交叉点，行列标题信息

viewmodel.on('beforePrint2dtablepreview',(args)=>{

 args.config.primaryColItemData = ['productName', 'free4'],

 args.config.crossItemData.colKey = ['free1'];

 args.config.crossItemData.rowKey = ['qty'];

})

其他配置参考打印preview