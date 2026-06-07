---
title: "BIP服务集成"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/guides/g02-bip"
section: "YNF-开发指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 开发指南]
platform_version: "BIP V5"
source_type: ynf-docs
images: 2
---

# BIP服务集成

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/guides/g02-bip | 所属：YNF-开发指南

# [](#bip服务集成)BIP服务集成

## [](#打印服务)打印服务

## [](#导入导出服务)导入、导出服务

## [](#推拉单)推拉单

## [](#文件服务)文件服务

## [](#审批流程服务)审批、流程服务

描述：工作流设计，是一系列相互衔接、自动进行的业务活动或任务。

工作流设计可以帮你轻松完成线上审批流程的设置，实现表单业务的自动化流转。

通过工作流设计功能，能够帮助企业进一步规范公司业务流程，提高工作效率，同时通过流程调度和任务调度功能能够帮助企业实现对流程状况实时跟踪、监控和调整。

#### [](#应用场景示例)应用场景示例

总体来说，就是一张表单，需要由多人个人分步骤共同来完成。

- 审批，如请假，报销，需要给上级审核的
- 多人分步骤完成一个表单

如报修场景下，客服部接到报修电话，记录客户姓名、地址等具体问题提交给维修部主管；维修部主管收到数据后，指派某个工人去维修；工人上门维修后，记录维修结果，将结果返回给主管；主管确认后，将数据提交回客服部；客服部收到数据后，对客户进行回访；从而完成一整个的报修工作流程

#### [](#流程服务接入)流程服务接入

首先在需要配置工作流的单据应用下选择“流程&自动化”，点击“新建”，创建一个工作流

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/bip-workflow-create.203192b9.png)
输入流程名称，点击确定后会进入「流程设计」页面，开始设计流程，完成后点击“完成并发布”即完成工作流配置
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/bip-workflow-create2.16dc9dbf.png)

#### [](#开发示例场景)开发示例场景

根据单据状态控制审批按钮组的显隐

enum BillStatusType {

 OPEN = '0',

 AUDIT = '1',

 AUDITED = '2',

 STOP = '3',

 DisapproveDraft = '4'

}

get btnWorkFlowVisible() {

 // 审批流

 const isAudit = this.verifyState === BillStatusType.AUDIT && this.isBrowse

 const isAudited = this.verifyState === BillStatusType.AUDITED && this.isBrowse

 const isStop = this.verifyState === BillStatusType.STOP && this.isBrowse // 产品说终止态又要审批

 return (!!this.procinstId) && (isAudited || isAudit || isStop)

}

get btnSubmitVisible() {

 // 提交

 const isBrowse = !this.verifyState && this.isBrowse

 const isVerifyState = (this.verifyState === BillStatusType.OPEN || this.verifyState === BillStatusType.DisapproveDraft) && this.isBrowse

 return isBrowse || isVerifyState

}

get btnUnSubmitVisible() {

 // 撤回

 const isBrowse = !this.verifyState && this.isBrowse

 const isAudit = this.verifyState === BillStatusType.AUDIT && this.isBrowse

 return isBrowse || isAudit

}

## [](#智友)智友

## [](#业务助手)业务助手

## [](#财务过账)财务过账