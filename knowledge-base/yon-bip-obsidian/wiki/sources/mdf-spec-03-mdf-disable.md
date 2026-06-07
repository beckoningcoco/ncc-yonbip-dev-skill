---
title: "已废弃机制说明"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/03-mdf-disable"
section: "协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 协议]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 已废弃机制说明

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/03-mdf-disable | 所属：协议

# [](#已废弃机制说明)已废弃机制说明

## [](#1-itemrule机制)1. itemrule机制

### [](#11-废弃原因)1.1. 废弃原因

- 复杂度过高
- 数值类计算场景存在丢失精度的问题
- 代码已经不再维护

### [](#12-代替方案)1.2. 代替方案

- 新版公式
- 交互规则

## [](#2-check机制)2. check机制

### [](#21-废弃原因)2.1. 废弃原因

- 复杂度过高
- 批量场景有性能问题
- 和公式重叠存在循环依赖问题
- 字段间有相互依赖存在串行调用问题
- 代码难以维护

### [](#22-代替方案)2.2. 代替方案

- 扩展脚本调用接口，实现相关逻辑

## [](#3-移除组件清单)3. 移除组件清单

- Web端 Signature 组件
- Web端 ChartTree 组件
- Web端 TagGroup 组件
- Web端 PictureBook 组件
- Web端 CheckTreeTable 组件
- Web端 TagGroup 组件
- Web端 PictureBook 组件
- Web端 FlatRowContainer 组件
- Web端 OrderTableContainer 组件
- Web端 ListTiled 组件

## [](#4-第一二三代ui模板)4. 第一二三代UI模板

### [](#41-不推荐使用)4.1. 不推荐使用

- 基本都已升级到第四代

## [](#5-上下文appcontext)5. 上下文AppContext

### [](#51-代替方案)5.1. 代替方案

- 通过对应的api获取相关参数
[《MDF框架上下文改造注意事项》](#/introduce/03-mdf-context-upgrade-description)

## [](#6-indexeddb)6. IndexedDB

### [](#61-废弃内容)6.1. 废弃内容

移除文件@mdf/metaui-web/lib/redux/indexedDB、@mdf/metaui-mobile/lib/redux/indexedDB
   

### [](#62-代替方案)6.2. 代替方案

cb.indexDB

## [](#7-旧版扩展机制)7. 旧版扩展机制

### [](#71-废弃内容)7.1. 废弃内容

- 移除API： setEnvConfig、setCompConfig
- 暂时兼容API： setExtendComp （后续移除）
- 移除文件：@mdf/cube/lib/extend

### [](#72-代替方案)7.2. 代替方案

cb.extend.registerXXX

## [](#8-移动端移除代码)8. 移动端移除代码

### [](#81-模型方法)8.1. 模型方法

GridModel：

||移除方法名称||移除方法名称||移除方法名称|
||移除方法名称||移除方法名称||移除方法名称|
||setSortColFilter||lineNoWorkflow||getCPRowsDirtyData|
||t2DInfo_Bus_Log||autoGenerateLineNo||recoverTitleData|
||setColFilterDataSourceMap ||autoGenerateLineNoWithoutState||getTitleData|
||getFilterData||binaryGenerateLineNoWithoutState||setTitleData|
||t2DInfo_Bus_Set||expandRow||handleOrderRule|
||t2DInfo_Bus_Get||expandRows||getUserSetting|
||t2DInfo_Bus_IsShow2D||unExpandRows||setIndeterminate|
||setChooseTable||expandAllRow||lineNoColumnInit|
||setRowDraggable||getExpandRowIndex||findLineNo|
||onPaginationChange||setShowExpand||lineNoGenerateType|
||t2DInfo_Bus_IsSupport2D||getTableDataHeight||columnSetting|
||setCompositeLayout||setActionTipledCount||getAllLineNo|
||setCompositeMeta||setShowRadio||getlineNo|
||lineNoStep||lineNoField|||

### [](#82-公共action)8.2. 公共Action

||editvoucherlist移除 公共方法名称||freeview移除 公共方法名称||option移除 公共方法名称|
||editvoucherlist移除 公共方法名称||freeview移除 公共方法名称||option移除 公共方法名称|
||全部移除，仅保留入口文件||全部移除，仅保留入口文件||全部移除，仅保留入口文件|

||common移除公共方法名称||common移除公共方法名称|
||VChange||handleExportConditions|
||VChangeNav||exportSecretFileModal|
||VBatchOpen||outputCallbackHandler|
||VViewDocHistory||createDownloadForm|
||getPrintSubTableData||openBillModal|
||timeeffect||timedetailchange|
||openImage||columnsetting|

||voucherlist移除方法名称||voucher移除方法名称|
||voucherlist移除方法名称||voucher移除方法名称|
||vchange||savebo|
||vdochistory||ecsuite|
||btndoccancle||workflow|
||btndocedit||asyncprocess|
||output||attachment|
||batchoutput||ecsuitefile|
||batchimport||directsearch|
||batchimportlog||autocomplete|
||batchexportlog||lineopen|
||tempexport||lineclose|
||reportexport||edittree|
||print||openreport|
||preview||shortcutshelp|
||printpreview||hidesplitview|
||printnow||btndocdelete|
||billsetting||batchprint|
||showsplitview||localprint|
||btndocopen||printdesign|
||columnsetting||movedown|
||moveup||commandLine|
||multiplerefer||btndocsave|