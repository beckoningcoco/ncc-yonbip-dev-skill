---
title: "移动端性能优化影响范围"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/03-mobile-performance-optimize"
section: "介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 介绍]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 移动端性能优化影响范围

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/03-mobile-performance-optimize | 所属：介绍

# [](#移动端性能优化影响范围)移动端性能优化影响范围

上线节奏：核心1：10月27日（已上）、核心234：11月17日

# [](#1-indexeddb)1. IndexedDB

## [](#11-废弃内容)1.1. 废弃内容

移除文件@mdf/metaui-web/lib/redux/indexedDB、@mdf/metaui-mobile/lib/redux/indexedDB

## [](#12-代替方案)1.2. 代替方案

cb.indexDB

# [](#2-旧版扩展机制)2. 旧版扩展机制

## [](#21-废弃内容)2.1. 废弃内容

- 移除API： setEnvConfig、setCompConfig
- 暂时兼容API： setExtendComp （后续移除）
- 移除文件：@mdf/cube/lib/extend

## [](#22-代替方案)2.2. 代替方案

cb.extend.registerXXX

# [](#3-bshowlt和bhidden的逻辑调整)3. bShowlt和bHidden的逻辑调整

调整仅仅是对前端组件的显示与隐藏进行了字段调整，后端bHidden的逻辑保持不变

# [](#4-移除本地fontjs文件)4. 移除本地font.js文件

mdf-metaui-mobile包里移除了本地的font.js文件，改为按需加载，图标的引用方式统一修改为:

import { SvgIcon } from '@mdf/baseui-mobile'

<SvgIcon type='icon-xxx'>

# [](#5-移动端移除代码)5. 移动端移除代码

## [](#51-模型方法)5.1. 模型方法

**GridModel：**

||移除方法名称||移除方法名称||移除方法名称|
||getFilterData||binaryGenerateLineNoWithoutState||setTitleData|
||lineNoStep||lineNoField|||
||onPaginationChange||setShowExpand||lineNoGenerateType|
||setChooseTable||expandAllRow||lineNoColumnInit|
||setColFilterDataSourceMap ||autoGenerateLineNoWithoutState||getTitleData|
||setCompositeLayout||setActionTipledCount||getAllLineNo|
||setCompositeMeta||setShowRadio||getlineNo|
||setRowDraggable||getExpandRowIndex||findLineNo|
||setSortColFilter||lineNoWorkflow||getCPRowsDirtyData|
||t2DInfo_Bus_Get||expandRows||getUserSetting|
||t2DInfo_Bus_IsShow2D||unExpandRows||setIndeterminate|
||t2DInfo_Bus_IsSupport2D||getTableDataHeight||columnSetting|
||t2DInfo_Bus_Log||autoGenerateLineNo||recoverTitleData|
||t2DInfo_Bus_Set||expandRow||handleOrderRule|

## [](#52-公共action)5.2. 公共Action

||editvoucherlist移除 公共方法名称||freeview移除 公共方法名称||option移除 公共方法名称|
||全部移除，仅保留入口文件||全部移除，仅保留入口文件||全部移除，仅保留入口文件|

||common移除公共方法名称|||
||VChange||handleExportConditions|
||VChangeNav||exportSecretFileModal|
||VBatchOpen||outputCallbackHandler|
||VViewDocHistory||createDownloadForm|
||getPrintSubTableData||openBillModal|
||timeeffect||timedetailchange|
||openImage||columnsetting|

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