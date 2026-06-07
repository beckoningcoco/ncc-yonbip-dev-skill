---
title: "新开页签"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/14-xinkaiyeqian"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 8
---

# 新开页签

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/14-xinkaiyeqian | 所属：指南

# [](#新开页签)新开页签

## [](#1-全局控制)1. 全局控制

### [](#11-开启特性开关)1.1. 开启特性开关

#### [](#111-公有云)1.1.1. 公有云

**领域新开页签打开**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/xinkaiyeqian_image1.e1620a33.png)

**领域新开页签关闭**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/xinkaiyeqian_image2.cabd169c.png)

#### [](#112-专属化)1.1.2. 专属化

在对应的domainKey下配置特性开关，导致文档：《[项目级配置工具（R5 &
R6）](file:////pages/viewpage.action%3fpageId=50957631)》

### [](#12-企业风格设置总开关)1.2. 企业风格设置总开关

以上特性受控于企业风格设置中的页签打开模式，即完成1.1步的特性适配后还需要再打开企业风格中的开关（两者同时满足才能生效）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/xinkaiyeqian_image3.52b023aa.png)

## [](#2-单据级控制)2. 单据级控制

### [](#21-ui模板配置新开页签)2.1. UI模板配置新开页签

在Yonbuilder设计器中，层级选择【页面模板】，右侧属性面板中有个新开页签的属性，此属性可以单个模板控制是否新开页签，不受总开关的限制

## [](#3-不能新开页签场景需要领域配置排除弹窗platform页面)3. 不能新开页签场景需要领域配置排除（弹窗、platform页面）

### [](#31-背景)3.1. 背景

目前平台推出所有单据新开页签交互，租户可配置是否开关，所以为了适配该交互，所有单据都应该具备新开且功能正常的条件，但是目前确实存在一些单据不能新开，所以为了适配这种情况，领域需要如下配置

### [](#32-配置)3.2. 配置

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/xinkaiyeqian_image4.89dee567.jpeg)

## [](#4-新开页签常见问题)4. 新开页签常见问题

### [](#41-列表双击或点编辑新开页签标题区没按照规范展示)4.1. 列表双击或点编辑新开页签标题区没按照规范展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/xinkaiyeqian_image5.509b237a.jpeg)

主要查看行数据中是否有code字断，默认取code字断，如果没有code，需要领域自定义一个字断
可以通过扩展脚本处理 `viewmodel.getParams().customCode = '代替code的字断cItemName' `

### [](#42-有些单据点击没有新开页签)4.2. 有些单据点击没有新开页签

首先查看下是否走了标准的action, 目前能够新开页签的action有 add, edit,push,以及列表的默认双击事件，其他都不支持新开，领域自定义的action，需要自己处理，比如下面这种，领域自己处理的跳转无法新开页签

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/xinkaiyeqian_image6.c57483f6.jpeg)

### [](#43-新开页签保存后页面空白)4.3.  新开页签保存后页面空白

#### [](#431-查看是否领域扩展处理了返回)4.3.1. 查看是否领域扩展处理了返回

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/xinkaiyeqian_image7.f56d071a.jpeg)

这种情况需要领域自己处理一下判断

cb.utils.getGeneralSetting('tabOpenMode', viewmodel) //新页签打开的。关闭参考代码

cb.communication({ action: 'isCloseAction', activeKey:

viewmodel.getDiworkCode(), data: true, noConfirm: true })

#### [](#432-领域开控制台看下是否有报错)4.3.2. 领域开控制台看下是否有报错

### [](#44-新增打开一条单据保存后列表刷新从列表双击这条数据页签没合并)4.4. 新增打开一条单据保存后，列表刷新，从列表双击这条数据，页签没合并

这种情况无法处理，因为新增打开的页签的code和列表进来时候的code不是同一个，工作台目前也无法更新已有页面的code，所以无法处理

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/xinkaiyeqian_image8.1af90b0e.jpeg)

### [](#45-触发了某个动作没有更新列表)4.5. 触发了某个动作没有更新列表

卡片页触发动作以后需要领域手动处理。框架只处理几个时机save，submit ，unsubmit，审批，删除，
领域在事件后调用 `cb.utils.updateVoucherlist(viewmodel)`

### [](#46-领域处理的返回问题)4.6. 领域处理的返回问题

返回空白

if (viewmodel.getParams().menuId) {

// 单页签打开的单据 工作台关闭方法

cb.communication?.({

action: 'isCloseAction',

activeKey: viewmodel.getDiworkCode(),

data: true,

noConfirm: true

})

} else {

viewmodel.communication({ type: "return" }); // 页面返回

}

### [](#47-领域调用的runcommandline不会主动新开页签需要领域修改下参数newopentabstrue)4.7. 领域调用的runCommandLine不会主动新开页签，需要领域修改下参数newOpenTabs：true

cb.loader.runCommandLine('bill', {

billtype: 'voucher',

newOpenTabs: true, //

--------添加这个参数，代码会适配新开页签开关

billno: billNo,

action: 'add', // 只有新增的时候要传

params: {

...obj,

rowData: '行数据或者是单据数据' // -------- 必须传

编辑和浏览需要用 用来打开新页签

// 如果没有行数据 可以手动加一下 { code: '', id: 'xxx' },

有code或者id才能新开

// newOpenTabsParams: { // 自定义参数 优先取这个参数

// code: ''

//}

}

}, viewmodel);

4.8 领域扩展联查点击事件修改页签title

viewmodel.on('beforeShowFlowNodeClick', (dt, carryData) => {

// carryData 应该是点击的块的数据，code字段应该在carryData里

carryData.customCode = 'code'; //

我会取carryData[carryData.customCode] 不切割后四位

})