---
title: "交互规则常见问题排查指南"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/13-jiaohuguizechangjianwentipaichazhinan"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 7
---

# 交互规则常见问题排查指南

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/13-jiaohuguizechangjianwentipaichazhinan | 所属：指南

# [](#公式问题交互规则常见问题排查指南排查指南)公式问题交互规则常见问题排查指南排查指南

## [](#1-交互规则存在反转逻辑复杂的逻辑按照下面的配没问题)1. 交互规则存在反转逻辑，复杂的逻辑按照下面的配没问题

交互规则默认支持反转，不满足条件会执行反向动作（赋属性类的boolean操作会反向，赋值动作不会反转）。

执行逻辑是，所有的交互规则按照列表顺序从上往下执行，单个规则里里的每个动作，满足条件执行，不满足条件执行属性动作的反转。

为了避免规则互相覆盖。配置规则需要注意：

1、正常一个字段的值变化规则，只需要一个规则和一个动作就能满足大部分的需求。动作里的数据过滤那块可以写复杂点(优先执行and，后执行or)。规则默认有反转效果，反向动作不用写。
2、如果一个规则和一个动作满足不了需求，再考虑配置多个规则。比如A字段值变化分别控制了B和C，可以拆分成两个规则，用A控制B和用A控制C两条。这样即使有反转效果也互不影响。

1.1. 案例1：

||触发字段||控制字段|
||触发字段||控制字段|
||费用项目||出差补贴|
||机票费||可修改|
||车船费||可修改|
||市内交通费||不可修改|

错误示例：按触发字段拆解。由于规则从上往下执行不满足条件会执行反转，如果费用项目选择机票费，规则1能成功执行，规则2和3执行反转，规则3的反转会导致补贴天数变成可修改与预期不符。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jiaohuguizechangjianwentipaichazhinanimage1.c5d9670d.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jiaohuguizechangjianwentipaichazhinanimage2.faed08a5.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jiaohuguizechangjianwentipaichazhinanimage3.232c58b9.png)

正确示例：按照控制字段拆解。这样规则之间互不影响。
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jiaohuguizechangjianwentipaichazhinanimage4.3f7cfd14.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jiaohuguizechangjianwentipaichazhinanimage5.318aa3e0.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jiaohuguizechangjianwentipaichazhinanimage6.88932a79.png)

## [](#2-几个触发时机页面初始化页面状态变化值变化规则特征初始化侧滑初始化有什么区别)2. 几个触发时机（页面初始化，页面状态变化，值变化规则，特征初始化，侧滑初始化）有什么区别？

- 页面初始化：列表进卡片，卡片初次打开的时候触发。如果卡片从浏览态到编辑态不会触发，就得配置页面状态变化。表体增行也会触发。
- 页面状态变化
卡片从浏览态到编辑态互相切换时会触发。如果是树表页数据切换，或者卡片页上下页切换也会触发。表体增行也会触发。
- 值变化
手动修改字段值会触发，或者扩展赋值时触发值变更事件（setValue时第二个参数加true，或者setValue后触发afterValueChange事件）可以触发。
- 特征初始化
特征是由物料动态产生的，所以如果要动态控制特征里的字段，得选择特征初始化
- 侧滑初始化
如果侧滑内字段是通过配置的UI元数据生成，不是默认由表格列生成的情况，想要侧滑弹出时控制字段状态，需要配上侧滑初始化的规则。

## [](#3-隐藏字段不能通过交互规则配置变成显示)3. 隐藏字段不能通过交互规则配置变成显示

为了节省流量提高加载速度，隐藏字段前端不会加载。所以想实现同样的效果，可以将模版字段先配置成显示，再通过交互规则进行隐藏或隐藏，反向处理一下。

## [](#4-不可编辑字段不能通过交互规则配置变成可编辑)4. 不可编辑字段不能通过交互规则配置变成可编辑

模版上配置不可编辑的字段，默认不能动态变成可编辑。所以需要模版上设置可编辑，再通过交互规则设置成不可编辑。

## [](#5-表格上列必填优先级高于单元格必填)5. 表格上列必填优先级高于单元格必填

通过非表体字段可控制表格整列必填，通过表格上字段控制单元格必填。由于表格上列必填优先级高于单元格必填，所以如果想按照单元格控制必填，需要先将字段设置成非必填。

## [](#6-值发生变化规则有时候生效有时候不生效)6. 值发生变化规则有时候生效有时候不生效

值发生变化规则，需要将页面状态新增，编辑，浏览全部勾上，避免单据先进入浏览态，再进入编辑/新增态时存在问题。产生问题原因是页面状态是前置条件，浏览态如果不勾上，列表进入单据浏览时将不会绑定上值变更事件，所在再从浏览态到编辑态值变更也不会生效。
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/jiaohuguizechangjianwentipaichazhinanimage7.a43da02a.png)

## [](#7-修改值规则生效了但是页面初始化或新增行规则不生效)7. 修改值规则生效了，但是页面初始化或新增行规则不生效

除了值变化的规则，需要同时配置页面状态变化的规则，这样页面初始化或者表体增行时才会生效。页面初始化的规则是刚进卡片会触发，如果配置了页面状态变化规则可不配页面初始化的规则。

## [](#8-公式给参照赋值想要再次触发交互规则不生效)8. 公式给参照赋值，想要再次触发交互规则不生效

交互规则触发时机选值变化，触发字段需要配上参照的id字段。因为交互规则里条件是id字段，所以事件监听那也得是id字段。

## [](#9-扩展脚本赋值没触发交互规则)9. 扩展脚本赋值没触发交互规则

需要触发字段的值变更事件才会触发交互规则

// 例子

viewmodel.get('new1').setValue('hello world'); // 不触发公式和交互规则

viewmodel.get('new1').setValue('hello world', true); // 触发公式和交互规则

viewmodel.get('child').setCellValue(0, 'new1', 'hello world'); // 不触发公式和交互规则

viewmodel.get('child').setCellValue(0, 'new1', 'hello world', true); // 触发公式和交互规则

 

// 组合方式

viewmodel.get('new1').setValue('hello world'); // 只写这个不触发公式和交互规则

viewmodel.get('new1').execute('afterValueChange', {}); // 用来触发公式和交互规则

如果想要手动触发页面初始化的交互规则，执行

viewModel.biz.do('staterule', viewModel, {eventName: 'onInit'})

## [](#10-check赋值没触发值变更交互规则)10. check赋值没触发值变更交互规则

配一个值变化的规则，将触发check的字段也配到触发时机的字段中去。比如修改A字段触发check，check返回值给B赋值，然后想触发B字段值变化的页面规则，需要在【字段/组件】那把A和B都勾上。
参考工单 QDKJ-52592

## [](#11-脚本如何触发校验规则)11. 脚本如何触发校验规则

比如要触发保存的校验规则

//前序逻辑。。。

const beforeActData = { 

 params: { 

 cAction: 'save', // 如果要触发保存这里是save，如果是要触发提交，这里写submit 跟标准的动作action一样

 params: {

 index: 0

 } // 如果是单行点击，需要传index (列表页才需要传)

 },

 data: {

 data: gridModel.getRealRows() // 如果单据类型是editVoucherList voucherlist，需要传表格数据 (列表页才需要传)

 }

}

viewmodel.promiseExecute('beforeValidateRule', beforeActData, function () {

 //后续逻辑。。。。

})

## [](#12-校验规则和交互规则任何一个规则都不生效)12. 校验规则和交互规则任何一个规则都不生效

1、看下单据是不是嵌套单据，外面一层meta，里面一层meta，一般这种单据都是领域客开实现的，需要领域适配。适配参考上面文档，脚本如何触发校验规则和交互规则。

2、检查设计器配置的模版和运行时加载的模版是不是同一个，运行时查看模版可通过卡片页右上角蓝色小图标双击查看，如果没有蓝色小图标打开控制台查看/meta接口的tplid参数。

## [](#13-审批流规则覆盖交互规则导致交互规则不生效专门给专属化环境使用)13. 审批流规则覆盖交互规则，导致交互规则不生效(专门给专属化环境使用)

审批流控制的字段（显示隐藏和是否可编辑）优先级默认比交互规则高。支持配上项目级开关让交互规则优先级大于审批流规则，公有云环境默认审批流优先级高。

进入MDF流水线添加配置文件 /app.common.config.project.json，里面billNo为对应的单据编码。

{

 "globalVars": {

 "__MDF_FEATURE_CONFIG__": {

 "workflowSync": ['billNo'],

 "workflowFieldCanModify": ['billNo']

 }

 }

}

项目级配置对应文档：

- [项目级配置文件](#/node/03-config-file)
- [MDF服务配置中心权限](#/node/02-config-item-desc)

查看是否生效，浏览器打开控制台，执行下面命令，查看是否有值，如果有值，证明配置生效
window.**MDF_FEATURE_CONFIG**.workflowSync
window.**MDF_FEATURE_CONFIG**.workflowFieldCanModify

## [](#14-领域自己实现的提交功能校验规则不生效)14. 领域自己实现的提交功能，校验规则不生效

查看表单是的提交按钮是不是一个公共的action（action=submit），公共的action才支持配校验规则，如果是客开实现的规则，参考[脚本如何触发校验规则]适配一下。

## [](#15-交互规则给孙表赋值只有当前子表对应的孙表能生效其他孙表不生效)15. 交互规则给孙表赋值，只有当前子表对应的孙表能生效其他孙表不生效

交互规则不支持给所有孙表赋值，只支持给当前子表对应的孙表赋值。替代方式：孙表配上公式。比如字段b配公式：iif(a=="1","文本1",iif(a=="2","文本2",""))

## [](#16-交互规则空条件不生效)16. 交互规则空条件不生效

如果项目使用的oracle数据库，会把交互规则协议里的空值属性干掉导致问题出现。临时解决办法是配置规则时如果条件是空，将右条件选字段，其他地方不变。