---
title: "Excel、DB、UI模板关系"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/05-excel-dbui-template"
section: "介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 介绍]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# Excel、DB、UI模板关系

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/05-excel-dbui-template | 所属：介绍

# [](#exceldbui模板关系)Excel、DB、UI模板关系

## [](#1-exceldbui模板之间的关系)1. Excel、DB、UI模板之间的关系

- excel每一个部分对应DB中的Table，发布时会将excel中的数据写入对应table
- excel每一列对应table的一个Colum
- 一个完整的模板是由这N个table共同来描述的
- bill_base表达单据bill，billentity_base表达单据对应的实体，billtemplate_base表达该bill的模板 

bill:billentity关系为1:N，
- bill:billtemplate的关系为1:N(例如某些特殊场景下的表单的浏览态和编辑态)
- cBillNo - 表单编码（请求模板元数据时的参数）
- cSubId - 子产品ID
- iDefTplId - 默认模板（当多模板时有用）
- iDefPrnTplId - 默认打印
- cBillType - 取值为Voucher、VoucherList等，影响前端运行时
- cFileterId - 过滤器ID
- bAllowMultiTpl - 是否允许多模板

- billtplgroup_base表达分组（容器）

iParentID表达父分组（容器），
- iBillId表达该分组隶属哪个表单ID，    
- iTplId表达该分组所在模板ID

- billitem_base表达分组（容器）内的子控件，

iBillId - 所属表单ID
- iBillEntityId - 对应的模板里定义的Entity
- iTplId - 所属模板
- iBillTplGroup - 该子控件所在分组（容器）的ID
- cSubId   - 子产品

- toolbar是一种特定类型容器，

parent - 该toolbar所在的分组容器编码
- toolbaritem使用iparent来表达父亲

- toolbaritem

billnumber - 表单编码
- toolbar- 该toolbaritem所在的toolbar编码

## [](#2-组织多卡片分析)2. 组织多卡片分析

需求：

- 该页面由3个Card自上而下组成
- 三个Card依次为基础组织（baseOrg）、行政组织（amdinOrg）、财富组织（financeOrg）

抽象：

- 此需求实质上是一个1个（billno）模板上自上而下有3个Card，本质上是一个单据详情（Voucher）模板上有3个容器。
- 这个三个容器对应的Entity彼此是由关系（1：1：1）的，因此可以使用通用CRUD来数据加载，因此模板类型为Voucher

## [](#3-excel对应的ui图层关系)3. Excel对应的UI图层关系

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ExcelDBUImubanguanxi_image1.000cb9be.png)