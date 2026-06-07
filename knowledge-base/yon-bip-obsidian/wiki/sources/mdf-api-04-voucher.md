---
title: "卡片 Voucher"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/04-voucher"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 卡片 Voucher

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/04-voucher | 所属：API

# [](#卡片-voucher)卡片 Voucher

## [](#1-biz-action清单)1. Biz Action清单

||Action||描述||备注|
||btndocedit||时间轴编辑||启用时间轴功能配置|
||vchange||时间轴变更||启用时间轴功能配置|
||vbatchopen||时间轴批量启用||启用时间轴功能配置|
||btndoccancle||时间轴快照查看||启用时间轴功能配置|
||btndocsave||时间轴快照保存||启用时间轴功能配置|
||processWorkflow||审批流|||
||search||搜索||一般情况通过 viewmodel.biz.do 直接调用|
||code||编码规则|||
||org||主组织|||
||transtype||交易类型|||
||rule||页面规则|||
||abandon||返回||页面需要返回上一级配置|
||copy||复制|||
||push||推单|||
||edit||编辑|||
||save||保存|||
||insertrow||插入行|||
||deleterow||删行|||
||copyrow||复制行|||
||shiftuprow||上移|||
||shiftdownrow||下移|||
||addtablerow||增行||表格侧滑交互时使用|
||edittablerow||行编辑||表格侧滑交互时使用|
||addrow||增行||表格普通交互使用。如果使用，addrow的后置事件，推荐使用afterInsertRow，以便于粘贴等操作也能触发addrow的后置事件|
||uploadandinsert||上传并插入数据|||
||downloadtemplateforcard||下载模板|||
||workflow||审批流|||
||audit||审核|||
||submit||提交|||
||unsubmit||撤回|||
||unaudit||弃审|||
||close||停用|||
||open||启用|||
||movefirst||移动到第一个|||
||movelast||移动到最后一个|||
||moveprev||上一条|||
||movenext||下一条|||
||add||新增|||
||create||新增|||
||pull||拉单|||
||pullx||拉单|||
||check||校验|||
||refresh||刷新|||
||output||导出|||
||localoutput||本地导出|||
||print||打印|||
||saveandadd||保存并新增|||
||saveandcopy||保存并复制|||
||saveandaudit||保存并审核|||
||printpreview||打印预览|||
||localprint||本地打印|||
||savedraft||保存草稿|||
||ecsuite||协同附件|||
||batchmodify||批量更新|||
||batchcopyrow||批量行复制|||
||jointquery||全局联查|||
||printdesign||打印设计|||
||printnow||直接打印|||
||asyncprocess||异步process|||
||queryworkflowstatus||审批流轮询状态|||
||batchoutput||批量导出|||
||batchimport||批量导入|||
||tempexport||导出模板|||
||openpage||打开弹窗|||
||goback||返回|||
||attachment||单行附件管理|||
||ecsuitefile||协同附件|||
||voucherattachment||单据附件管理|||
||rowdetail||展示孙表|||
||staterule||公式联动|||
||billsetting||UI模板|||
||formularule||公式|||
||autocomplete||自动补全|||
||bizflowpush||业务流种下推|||
||querydetailtable||查询子表懒加载数据|||
||changebilldiff||单据历史变更|||
||unchangebilldiff||单据历史变更还原|||
||changehistory||变更历史（变更工作台）|||
||shortcutshelp||快捷键帮助|||
||moveup||上移---需要配置焦点行||只支持表格上方操作按钮|
||movedown||下移---需要配置焦点行||只支持表格上方操作按钮|
||moveto||移到---需要配置焦点行||只支持表格上方操作按钮, 需要在button中配置cStyle配置popoverKey为MoveToPopover![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Voucherkapian.2dc4be31.png)|
||totop||置顶---需要配置焦点行||只支持表格上方操作按钮|
||tobottom||置底---需要配置焦点行||只支持表格上方操作按钮|

## [](#2-常见问题)2. 常见问题

### [](#21-复制按钮成功后不显示复制成功提示)2.1. 复制按钮成功后不显示复制成功提示

拦截beforeCopy事件，在params中追加isNeedAlert=false