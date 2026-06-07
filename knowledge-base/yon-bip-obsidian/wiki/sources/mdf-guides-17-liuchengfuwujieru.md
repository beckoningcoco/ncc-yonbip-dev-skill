---
title: "流程服务接入"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/17-liuchengfuwujieru"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 5
---

# 流程服务接入

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/17-liuchengfuwujieru | 所属：指南

# [](#流程服务接入)流程服务接入

## [](#1-流程准备工作)1. 流程准备工作

目前流程的配置需要依赖交易类型,也就是说一个表单要支持流程,必须在页面上指定一个字段用来存储交易类型.根据交易类型来判断流程模板.具体可以看下图的红框位置.

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liuchengfuwujieru_image1.37eaa335.png)

- 在excel中新增交易类型并指定交易类型所属的单据类型名称.
- 交易类型需要支持流程,将**支持流程**列设置为1.
- 在单据类型名称行中的**是否支持流程**设置为1.

将该excel发送给刘勋由他进行配置后,就可以在环境中进行流程配置.

## [](#2-流程模型设计)2. 流程模型设计

- 登录工作台;进入 **数字化建模**-**流程管理**-**模型管理**
- 右侧选择指定的领域,此处配置的是 **采购供应**>**订单**>**订单交易**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liuchengfuwujieru_image2.e1dd23f5.png)

- 选择订单交易,在右上角位置有新增按钮,点击新增,配置一个新的流程模型.配置完成后点击保存并发布.此时.流程模型就配置完成.

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liuchengfuwujieru_image3.b6a83da5.png)

## [](#3-流程与表单绑定)3. 流程与表单绑定

想要配置的流程模型能够与表单关联起来,还需要进行如下操作.

- 在数据库的规则表billruleregister表中添加一条流程提交方法.

INSERT INTO `billruleregister`( `billnum`, `action`, `ruleId`,

`iorder`, `overrule`, `tenant_id`, `key`, `isSystem`, `url`,

`isSync`, `isAsyn`, `config`)

VALUES ('common', 'submit', 'mddSubmitRule', 30.00, NULL, '0',

NULL, b'1', NULL, 0, 0, NULL);

## [](#4-流程展示)4. 流程展示

打开配置的表单,交易类型的参照选择在第一步指定的交易类型,然后再点击提交,就可以看到能够正常提交,且可以查看到审批流信息.

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liuchengfuwujieru_image4.529ea302.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liuchengfuwujieru_image5.65bc71ba.png)