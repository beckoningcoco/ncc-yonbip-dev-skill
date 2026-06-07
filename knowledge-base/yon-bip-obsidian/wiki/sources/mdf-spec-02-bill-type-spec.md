---
title: "单据类型枚举"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/02-bill-type-spec"
section: "协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 协议]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 单据类型枚举

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/02-bill-type-spec | 所属：协议

# [](#单据类型枚举)单据类型枚举

||模型类型对应的前端viewmodel||cBillType 模板类型||类型说明||布局模式|
||VoucherList||VoucherList||*单据列表*|||
||VoucherList||ArchiveList||*档案列表*|||
||VoucherList||TreeList||*树表*|||
||VoucherList||Report||*报表*|||
||VoucherList||ListVoucher|||||
||VoucherList||EditVoucherList||*单据列表行内编辑*|||
||TreeArchive||TreeArchive||*左树右卡*|||
||TreeVoucher（TreeArchive？）||TreeVoucher|||||
||Voucher||Archive||*卡片*|||
||Voucher||Voucher||*单据*|||
||Voucher||EditableVoucherList||*可编辑列表*|||
||Option||Option||选项卡|||
||Compare||Compare||*对照 树卡表*|||
||BillMaker||BillMaker|||||
||FreeView||FreeView||自由布局||自由布局模式|

cb.biz.common.option = option;

cb.biz.common.freeview = freeview;

cb.biz.common.editvoucherlist = editvoucherlist

cb.biz.common.billmaker = billmaker;

cb.biz.common.voucher = voucher

cb.biz.common.voucherlist = voucherlist