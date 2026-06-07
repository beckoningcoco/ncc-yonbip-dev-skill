---
title: "列表 VoucherList"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/04-voucher-list"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 列表 VoucherList

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/04-voucher-list | 所属：API

# [](#列表-voucherlist)列表 VoucherList

## [](#biz-action清单)Biz Action清单

||**Action**||**描述**||**备注**|
||btndocedit||时间轴编辑|||
||vchange||时间轴变更|||
||vbatchopen||时间轴批量启用|||
||btndoccancle||时间轴快照查看|||
||btndocsave||时间轴快照保存|||
||abandon||取消|||
||copy||复制|||
||push||推单|||
||edit||编辑|||
||save||保存|||
||workflow||审批流|||
||batchaudit||批审|||
||batchunaudit||批量弃审|||
||batchsubmit||批量提交|||
||batchunsubmit||批量撤回|||
||close||停用|||
||open||启用|||
||add||新增|||
||pull||拉单|||
||check||校验|||
||refresh||刷新|||
||output||导出|||
||localoutputvoucher||导出|||
||print||打印|||
||printpreview||打印预览|||
||localprint||打印|||
||ecsuite||协同附件|||
||batchmodify||批量更新|||
||jointquery||全局联查|||
||printdesign||打印设计|||
||printnow||直接打印|||
||asyncprocess||异步process|||
||queryworkflowstatus||审批流轮询状态|||
||batchopenx||批量启用|||
||batchoutput||批量导出|||
||batchimport||批量导入|||
||tempexport||导出模板|||
||openpage||打开弹框|||
||openreport||打开报表|||
||goback||返回|||
||attachment||单行附件管理|||
||ecsuitefile||协同附件|||
||staterule||公式联动|||
||billsetting||UI模板|||
||autocomplete||自动补全|||
||shortcutshelp||快捷键帮助|||
||pullgroup||拉单分组|||

## [](#biz-action详解)Biz Action详解

### [](#doservice)doservice

### [](#copy)copy

### [](#open)open

### [](#close)close

### [](#save)save

### [](#add)add

### [](#push)push

### [](#edit)edit

### [](#dblclick)dblclick

### [](#abandon)abandon

### [](#delete)delete

### [](#batchdelete)batchdelete

### [](#batchaudit)batchaudit

### [](#batchunaudit)batchunaudit

### [](#batchsubmit)batchsubmit

### [](#batchdo)batchdo

### [](#search)search

### [](#refresh)refresh

### [](#output)output

### [](#batchoutput)batchoutput

### [](#batchimport)batchimport

### [](#tempexport)tempexport

### [](#statictempexport)statictempexport

### [](#reportexport)reportexport

### [](#messagesubscribe)messagesubscribe

### [](#print)print

### [](#batchprint)batchprint

### [](#check)check

### [](#columnsetting)columnsetting

### [](#edittree)edittree

### [](#querytree)querytree

### [](#moveup)moveup

### [](#movedown)movedown

### [](#commandline)commandLine

### [](#switchgroupschema)switchgroupschema

### [](#savebo)savebo

### [](#preview)preview

### [](#localprint)localprint

### [](#batchpush)batchpush

### [](#sumswitch)sumswitch

### [](#pull)pull

### [](#pullx)pullx

### [](#jointquery)jointquery

### [](#batchmodify)batchmodify

### [](#printpreview)printpreview

### [](#printdesign)printdesign

### [](#printnow)printnow

### [](#asyncprocessbillno-viewmodel-params-beforeact-afteract)asyncprocess(billNo, viewModel, params, beforeAct, afterAct)

**说明**：查询异步请求的进度情况

**入参**：billNo：单据编码

          viewModel：模型

          params：

              asyncKey：异步Key（必填）

               asyncInterval：异步频率，整型，2秒，如：2（可选，默认1）

               btnCallBack：动作回调（可选）

               fileSize：文件大小（可选）

               fileName：文件名（可选）

          beforeAct：

          afterAct：

viewModel.biz.do(\'asyncprocess\', viewModel, { asyncKey, asyncInterval})