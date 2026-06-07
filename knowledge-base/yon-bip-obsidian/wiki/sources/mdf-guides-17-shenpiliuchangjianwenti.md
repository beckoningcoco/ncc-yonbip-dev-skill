---
title: "审批流常见问题"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/17-shenpiliuchangjianwenti"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 5
---

# 审批流常见问题

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/17-shenpiliuchangjianwenti | 所属：指南

# [](#审批流常见问题)审批流常见问题

## [](#1-字段权限问题排查)1. 字段权限问题排查

先查看 network中 这个接口返回值 approve-component/api/v1/activity/authority

### [](#11-没有返回字段权限情况)1.1. 没有返回字段权限情况

**现象：页面上所有字段和按钮不能编辑和点击，只有取消按钮可以点**

**出现上面问题可以查看以下接口排查是否是下面图片展示，如果出现图片问题可以先联系审批流同事：蔡永生**

1）没返回字段权限

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shenpiliuchangjianwenti_image1.54fca976.png)

2）没返回字段权限

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shenpiliuchangjianwenti_image2.403d98ab.png)

### [](#12-有字段权限返回的结构)1.2. **有字段权限返回的结构**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shenpiliuchangjianwenti_image3.10995ec5.png)

### [](#13-有字段权限返回某些字段还不能编辑)1.3. **有字段权限返回，某些字段还不能编辑**

**怎么排查？**

根据上面返回的字段权限，找到自己的字段是不是返回的是设置的状态，如果是
找---韩婷 <[hantingr@yonyou.com](mailto:hantingr@yonyou.com).>  不是或者没找到找： 蔡永生 **

## [](#2-移动端底部按钮没有扩展出同意退回等按钮-或者-不展示审批面板)2. 移动端底部按钮没有扩展出同意、退回等按钮 或者 不展示审批面板 

怎么排查？

### [](#21--首先打开ui模版看下是不是配置了-审批按钮ccontroltype)2.1. 首先打开UI模版看下是不是配置了 审批按钮cControlType: 

approveflow 组件。配了以后是不是给这个人分配了权限

### [](#22--如果有要确认一下单据返回的数据是不是满足下面条件)2.2. 如果有要确认一下单据返回的数据是不是满足下面条件：

有字段isWfControlled为真或者pk_procdefins或者procinstId
为真 并且字段（注意大小写）verifystate || verifyState 大于0 

## [](#3-审批面板不加载)3. 审批面板不加载

### [](#31-首先排除meta接口里是否返回了ccontroltypeworkflow的组件)3.1. 首先排除meta接口里是否返回了cControlType：workflow的组件

### [](#32-排查detail返回的字段里)3.2. 排查detail返回的字段里

有字段isWfControlled为真或者pk_procdefins或者procinstId 为真
并且字段（注意大小写）verifystate || verifyState 大于0 

### [](#33-在检查一下控制台是否有报错比如流程实例不存在)3.3. 在检查一下控制台是否有报错，比如流程实例不存在 

## [](#4-web端和移动单据编码不相同)4. Web端和移动单据编码不相同

如果存在Web端和移动单据编码（billNo）不相同的情况，可能会导致在移动端打开了Web端的地址，此时需要在扩展脚本的init中指定移动端的单据编码，代码如下：

viewmode.getParamse().mobileCardKey = '移动端的billNo'

## [](#5-通过当前登录人是否还有待办来控制编辑按钮显隐)5. 通过当前登录人是否还有待办来控制编辑按钮显隐

说明： 移动端  并且配置了toolbar里的approveflow按钮

// @params hasTodoTask 是否有代办 true 有 false 没有

viewmodel.on('afterWorkflowTask', function({ hasTodoTask }) {

 if (hasTodoTask) {

 // 编辑按钮显示

 } else {

 // 编辑按钮隐藏

 }

});

## [](#6-审批流点击同意后一直调进度的接口进度球不消失怎么办)6. 审批流点击同意后一直调进度的接口，进度球不消失怎么办？

确定不需要这个进度就可以不调，功能是正常的就代表不用，调进度是解决（资产领域）是否异步提交完成的

两种关闭方式：

- 在审批流的bill_comnmd表的Parameter里配置disableAsyncProcess，格式为json字符串
- 开启前端特性开关disableAsyncProcessForApprove，可以按照领域关闭，也可以按照单据配置白名单

## [](#7-移动端审批按钮没出来)7. 移动端审批按钮没出来

第一步：

首先查看meta接口里是不是返回了cControlType = "approveflow"按钮

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shenpiliuchangjianwenti_image4.58c3b484.png)

第二步：

- 检查detail接口里是不是返回verifystate 或者verifyState字段并且字段的值大于0
- 在检查是否有字段isWfControlled为真或者pk_procdefins或者procinstId 为真这三个里面必须存在一个且值为真 。

## [](#8审批面板里面评论在移动或者pc端打开报错)8.审批面板里面评论在移动或者pc端打开报错

背景：评论消息的地址是前端拼接好传给审批组件的，比如在pc端 我们可能拿不到对的移动端的billNo ，或者在移动端拿不到对的pc的billNo

1、当领域移动和pc的billNo不一致的时候需要领域写扩展脚本告诉组件

viewmodel.getParams().cardKey = 'pc的billNo';

viewmodel.getParams().mobileCardKey = '移动的的billNo';

2、当领域对移动或者pc的地址有特殊要求，默认的地址不满足，需要领域监听事件修改地址

viewmodel.on('beforeWorkflow', ({ data, params }) => {

	data.mobileUrl = '移动地址';

	data.formUrl = 'pc地址'

})

## [](#9-businesskey传的不对)9 businessKey传的不对

说明：前端拼值逻辑

const busiObj = viewmodel.getParams()?.query?.busiObj;

const billNo = viewmodel.getParams()?.billNo;

const id = viewmodel.get('id').getValue();

const businessKey = (busiObj || billNo) + '_' + id

如果出现businessKey传的不对的情况先检查busiobj是不是传的是对的

后端使用mdd服务: 提交的时候busiObj和billNo必须一致，不然会报流程实例不存在错误

后端使用ypd服务：提交如果busiObj和billNo不一致 框架会做兼容处理，不会报流程实例不存在错误

## [](#10-pc业务助手里配置审批面板)10 pc业务助手里配置审批面板

1、只配置了审批面板，右侧展开空白
a: 首先检查detail接口里是否有字段isWfControlled为真或者pk_procdefins或者procinstId
为真 并且字段（注意大小写）verifystate || verifyState 大于0 
b: 检查UI元数据里是否有verifystate || verifyState 字段的模型，如果没有元数据中需要添加这个字段
可以通过 viewmodel.__data.verifystate || viewmodel.__data.verifyState 在控制台中检查，注意viewmodel是对应的单据模型
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shenpiliuchangjianwenti_image4.58c3b484.png)

## [](#11-tenantappsource传的不对)11 Tenantappsource传的不对

前端取值逻辑说明：
1、首先获取viewmodel.getEnv('**WORKFLOW_META**')?.appSource
2、没有就会获取viewmodel.getParams().subId
检查上面2步。如果还不对看下是不是有扩展脚本处理了传给审批流的appsource字段