---
title: "业务阶段"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/04-bussi-step-code"
section: "协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 协议]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 业务阶段

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/04-bussi-step-code | 所属：协议

# [](#业务阶段)业务阶段

## [](#1-背景)1. 背景

消息中心进单据卡片会往url上传businessStepCode，单据会按照业务阶段进行控制，但是列表进卡片或者审批，由于拿不到businessStepCode，所以需要领域适配。

**业务阶段作用：** 详情卡片打开时，会根据业务阶段加载对应模版，根据业务阶段控制打印和编辑按钮。列表页批量打印也会受业务阶段的控制。

## [](#2-效果)2. 效果

一条数据可能对应多个业务阶段，所以可能会出现弹窗

- 列表进卡片，如果当前存在多个业务阶段会出现弹窗，如果只有一个阶段不会出弹窗直接进单据。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yewujieduan_image1.43fdc63b.png)

- 点击审批按钮更新单据业务阶段

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yewujieduan_image2.543e7d55.png)

- 批量打印，如果数据业务阶段不允许打印，出现弹窗提示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/yewujieduan_image3.bd6b633b.png)

## [](#3-领域适配)3. 领域适配

- 前端:  打开领域特性开关businessStepCode就行，详情见《[MDF服务配置项说明](#/node/02-config-item-desc)》
- 后端：需要适配，详细见文档《[【审批流】当前业务阶段功能说明](file:////pages/viewpage.action%3fpageId=42394315)》

## [](#4-运行时加载业务阶段模版原理)4. 运行时加载业务阶段模版原理

- url上传的businessStepCode参数前端不认，会根据数据id重新获取业务阶段code
- 通过数据id调用/bpm/deliverStepcode接口获取businessStepCode
- 打开单据和刷新单据前需要调用cb.utils.choseStepCode
- 业务阶段可控制单据是否可编辑 代码具体实现 common.js controlAuthByStepCode方法

## [](#5-常见问题)5. 常见问题

- **同一个stepCode取了多个业务活动规则导致运行时取错了**

框架会调用/rest/businessStep/getByBusiObjCodeAndStepCodes接口，传busiObjCode区分单据。需要mdd升级到6.9.6-release。

<parent>

  <groupId>com.yonyou.iuap</groupId>

  <artifactId>yonyou-mdd-starter-parent</artifactId>

  <version>6.9.6-RELEASE</version>

  <!--<relativePath/>-->

</parent>

- **当前审批人不会加载业务阶段模版，只会加载默认版**

设计如此。登录当前审核人账号可以看到业务阶段模版，非当前审批人登录加载的默认模版。