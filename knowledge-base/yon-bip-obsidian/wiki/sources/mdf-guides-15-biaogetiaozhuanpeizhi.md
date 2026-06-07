---
title: "表格跳转配置"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/15-biaogetiaozhuanpeizhi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 表格跳转配置

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/15-biaogetiaozhuanpeizhi | 所属：指南

# [](#表格跳转配置)表格跳转配置

[billitem_base]表：字段对应的**bJointQuery**配置为1。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/biaogetiaozhuanpeizhi_image1.e15fcf74.png)

扩展脚本写法参考：

let gridModel = viewmodel.getGridModel();

gridModel.on('jointQuery',function(args){

 if(args.cellName === 'cusname_name'){

 cb.loader.runCommandLine('bill', {

 billtype: 'voucher',

 params: {

 mode:'edit',

 domainKey: 'productcenter',

 readOnly: true,

 id: args.rowData.cusname_id,

 },

 billno: 'aa_merchant',

 }, viewmodel);

 }

});