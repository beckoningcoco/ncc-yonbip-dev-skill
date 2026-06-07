---
title: "领域页面Action扩展"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/03-lingyuyemianactionkuozhan"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 领域页面Action扩展

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/03-lingyuyemianactionkuozhan | 所属：指南

# [](#领域页面action扩展)领域页面Action扩展

## [](#1-扩展位置)1. 扩展位置

扩展Action写在`src/client/common/biz/actions.js`文件中

## [](#2-扩展示例)2. 扩展示例

/**

* 新增editPlus，导出的action移动端和PC端可共用

* 如果导出的action名称和系统action相同时，则覆盖系统action

* 如果导出的action名称和系统action不相同时，则新增该action

*

* @param {*} billNo 单据编码

* @param {*} viewmodel 单据模型

* @param {*} params 参照

* @param {*} beforeAct 前置事件

* @param {*} afterAct 后置事件

*/

const editPlus = (billNo, viewmodel, params, beforeAct, afterAct) => { / 组装params参数

 beforeAct(params, () => {

 console.log('editPlus action的逻辑代码', billNo, viewmodel, params);

 afterAct({

 // 参数

 });

 })

}

const actions = {

 voucherlist: { editplus: editPlus }, // 注册到列表页

 voucher: { editplus: editPlus } // 注册到卡片页

}

export default actions

## [](#3-调用方式)3. 调用方式

// 示例

viewmodel.biz.do('editPlus', viewmodel)