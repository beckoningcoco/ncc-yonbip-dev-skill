---
title: "审批流常见扩展"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/17-shenpiliuchangjiankuozhan"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 审批流常见扩展

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/17-shenpiliuchangjiankuozhan | 所属：指南

# [](#审批流常见扩展)审批流常见扩展

## [](#1-列表页控制是否有必填数据未填写)1. 列表页控制是否有必填数据未填写

// data 审批面板点确定返回的数据

// currentRow: 行数据

viewmodel.on('beforeWorkflowAction', ({ data, resolve, currentRow }) => {

 // 假设有个必输字段是 field1

 if (data?.actionName === 'agree') {

 // 点击同意按钮

 if (!currentRow[field1]) {

 cb.utils.alert('存在必输字段')

 return false; // 这个也必须这么写

 }

 }

})