---
title: "审批流相关参数说明"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/17-shenpiliuxiangguancanshushuoming"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 审批流相关参数说明

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/17-shenpiliuxiangguancanshushuoming | 所属：指南

# [](#审批流相关参数说明)审批流相关参数说明

## [](#1-流程实例id)1. 流程实例ID

// MDF框架默认拼接方式

const querybusiObj = viewmodel.getParams()?.query?.busiObj;

const busiObj = querybusiObj === 'null' ? '' : querybusiObj;

const businessKey = `${busiObj || billNo}_${viewmodel.get('id').getValue()}`; // businessKey就是流程ID

## [](#2-appsource前端获取方式)2. appSource前端获取方式

const { subId } = viewmodel.getParams() || {};

const appsource = viewmodel.getEnv('__WORKFLOW_META__')?.appSource || subId;