---
title: "连续扫码 ScanPage"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/05-scanpage"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 4
---

# 连续扫码 ScanPage

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/05-scanpage | 所属：移动组件

# [](#连续扫码-scanpage)连续扫码 ScanPage

## [](#1-效果展示)1. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lianxusaomazujianshipei-image1.9e06e762.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lianxusaomazujianshipei-image2.e5e1c382.png)

## [](#2-模板配置)2. 模板配置

- 

预制扫码页面子表模板 通过page的方式挂到前一个页面上去

- 

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lianxusaomazujianshipei-image3.dc3f8eef.png)

- 

扫码按钮自定义事件

- 

代码 以产品入库为例

- 

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lianxusaomazujianshipei-image4.1f677c09.png)

- 

按钮模型

// btnModel 按钮模型

btnModel.on('click', () => {

 viewModel.biz.do('multiplescan', viewModel, { params: { cGroupCode: 'orderView', childrenField: 扫码子表对应的childrenField } })

})

## [](#3-扫码相关api)3. 扫码相关api

/**

- 

callback 扫码之后的回调

- 

open 布尔值 true 打开扫码框 false 关闭扫码框

- 

params 扫码框位置相关参数 可不传

- 

**cb.utils.mdfCustomScanQRCode(callback, open, params)**