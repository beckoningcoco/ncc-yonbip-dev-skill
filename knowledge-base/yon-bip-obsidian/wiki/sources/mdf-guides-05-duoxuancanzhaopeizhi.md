---
title: "多选参照配置"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/05-duoxuancanzhaopeizhi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 多选参照配置

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/05-duoxuancanzhaopeizhi | 所属：指南

# [](#多选参照配置)多选参照配置

## [](#1主表多选参照)1、主表多选参照

### [](#11excel参考)1.1、excel参考

[招聘职位卡片(1)](https://docs.yonyoucloud.com/l/f8541684E892 【友空间云文档】招聘职位卡片 (1).xlsm)

### [](#12主要配置)1.2、主要配置

billitem_base表配置 cName 为jobgradeIdName , cControlType为tag

billentity_base表关联一个子实体，与多选参照关联，cModelType配置为TagModel，数据源跟jobgradeIdName保持一致

## [](#2子表多选参照)2、子表多选参照

### [](#21excel参考红色选中)2.1、excel参考（红色选中）

[工作组树卡](https://docs.yonyoucloud.com/l/c4f9fe40fFDf 【友空间云文档】工作组树卡.xlsm)

### [](#22主要配置)2.2、主要配置

billitem_base表配置 cName 为workgroupMemberScopes ,
cControlType为tag，cRefRetID配置
{"workgroupMemberScopes":"member_name","workgroupMember":"id"}，id和name都需要配置

billentity_base表关联一个子实体，与多选参照关联，子实体的childrenField
为workgroupMemberScopes 跟参照的cName保持一致， 

## [](#3如果设计器开发)3、如果设计器开发

[20220707-低代码对参照多选设置支持](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=7511678)