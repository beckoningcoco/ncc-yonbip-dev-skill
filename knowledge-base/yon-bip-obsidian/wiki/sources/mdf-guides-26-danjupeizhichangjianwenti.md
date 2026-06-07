---
title: "单据配置常见问题"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/26-danjupeizhichangjianwenti"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 单据配置常见问题

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/26-danjupeizhichangjianwenti | 所属：指南

## [](#单据配置常见问题)单据配置常见问题

## [](#提交)提交

Q：同一节点有不同审批要求时，如何控制提交按钮显隐？
A：使用isWfControlled和verifystate控制相应状态
具体方案：平台提供了【按钮状态控制规则】，领域可以根据业务数据中的isWfControlled和verifystate控制相应状态的按钮显示隐藏（isWfControlled为0，代表没有审批流，为1，代表有审批流）
对应以下两种场景：
1、不同租户对于审批的要求不同，当部分租户没有配置审批流时，通过以上两个属性可以动态控制按钮显隐；
2、不同交易类型的单据对于审批要求不同，当部分交易类型没有配置审批流时，通过以上两个属性可以动态控制按钮显隐；

## [](#多页签)多页签

[新开页签](file:////pages/viewpage.action%3fpageId=22520971)
《新开页签》

## [](#刷新)刷新

执行action: 'directsearch', 领域不需要其他处理，只用配置按钮设置action

#### [](#列表页)列表页

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/danjupeizhichangjianwenti_image1.56fdd913.jpeg)

#### [](#卡片页)卡片页

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/danjupeizhichangjianwenti_image2.736a4537.jpeg)

#### [](#执行脚本)执行脚本

[https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=169883285](https://uap-wiki.yyrd.com/pages/viewpage.action?pageId=169883285)

## [](#字断级tips帮助)字断级Tips帮助

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/danjupeizhichangjianwenti_image3.762fd3dd.jpeg)

[tips组件](#/components-web/01-fieldhelp)

## [](#移动端按钮顺序规范)移动端按钮顺序规范

[Toolbar按钮顺序](#/components-mobile/02-toolbardesc)