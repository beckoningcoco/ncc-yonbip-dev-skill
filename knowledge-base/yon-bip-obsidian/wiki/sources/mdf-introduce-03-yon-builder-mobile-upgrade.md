---
title: "YonBuilder移动端升级方案"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/03-yon-builder-mobile-upgrade"
section: "介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 介绍]
platform_version: "BIP V5"
source_type: mdf-docs
images: 7
---

# YonBuilder移动端升级方案

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/03-yon-builder-mobile-upgrade | 所属：介绍

# [](#yonbuilder移动端升级方案)YonBuilder移动端升级方案

## [](#1-背景)1. 背景

应用构建Web端单据设计器在生产环境已于上一年更新到5.0版本，而移动设计器在生产环境目前仍停留在4.0版本，目前移动的新功能如特征、应用权限、参照收藏、交互样式优化等都会在5.0版本更新，4.0高级设计器不再新增功能。为了移动与PC的设计器版本保持一致，以及保证客户对移动设计器新功能的使用，移动设计器将于近期在生产环境更新到5.0版本。

## [](#2-更新内容)2. 更新内容

- UI样式交互统一

新版本对整体UI样式和交互进行了调整，保证了原厂单据与客开单据样式统一，预览态UI样式更美观。

- 业务扩展合并

Web和移动逻辑统一，前端函数接口统一，只写一套代码，Web设计器有的功能，在移动设计器内也可以实现。

- 脚手架合并

方便统一管理前端资源，开发、维护及专属化更简单。

- 模型统一

原厂单据与YonBuilder单据可以灵活通讯，无缝切换；工作流、推拉单可以单页跳转，提高了跳转速度。

- 特征体系

新增了特征相关的功能。

- 权限控制

新增了应用权限、字段权限控制能力。

## [](#3-升级步骤升级前准备)3. 升级步骤升级前准备

#### [](#311-升级计划制定)3.1.1. 升级计划制定

- 项目方或领域制定好详细的升级计划
- 建议预留充足的测试时间，如果页面较多且扩展逻辑较多应预留不少于6周的时间，如果页面少且有较少的扩展应预留不少于3周的时间

#### [](#312-升级影响范围评估)3.1.2. 升级影响范围评估

- 正常来说移动MDF5.0版本升级仅影响通过YonBuilder搭建的移动端页面，对PC端页面与原厂方式开发的移动端页面影响较小

#### [](#313-升级需求场景验证)3.1.3. 升级需求场景验证

- 项目级或领域梳理需要升级的需求场景
- 充分验证升级后是否满足客户需求，如果不满足可提需求给平台评估

### [](#32-专属化安装盘升级)3.2. 专属化安装盘升级

专属化基于可830或V3版本盘打补丁升级（更早期的版本不支持），公有云忽略此步骤，补丁清单如下：

- MDF运行时补丁：sPaaS_iuap-mdf-node_iuap.V6.R1_2208.168_QP20221102-12
- 应用构建补丁：联系延鑫
- 高级设计器补丁：联系刘月凯

### [](#33-升级应用)3.3. 升级应用

- 提升级申请给 延鑫[yanxin@yonyou.com](mailto:yanxin@yonyou.com)
- 延鑫 在后台进行升级操作

### [](#34-规格升级)3.4. 规格升级

#### [](#341-地址更改)3.4.1. 地址更改

在运营后台 或 应用管理中将原有的页面地址改成新的，例如：

旧地址：
`https://xxx/iuap-yonbuilder-mobilenode/runtime-mobile/view/YYArchive/xxx?domainKey=xxx`
**改成**

新地址：
`https://xxx/mdf-node/meta/YYArchive/xxx?domainKey=xxx`

#### [](#342-应用类型更改)3.4.2. 应用类型更改

应用类型更改为 **MDF H5链接应用**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/YonBuilderyidongduanshengjifangan_image1.a2004bee.png)

### [](#35-升级脚手架)3.5. 升级脚手架

本次升级将Web端和移动端脚手架合并为一个脚手架，操作步骤如下：

1.  在PC端的脚手架中注释掉移动端入口文件注册扩展脚本

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/YonBuilderyidongduanshengjifangan_image2.5d6e54f8.png)

2.将移动端脚手架的extend目录迁移PC端脚手架的src/client文件夹下

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/YonBuilderyidongduanshengjifangan_image3.638c01ed.png)

3. 移动端脚手架中的移动端入口文件引入新加的扩展文件

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/YonBuilderyidongduanshengjifangan_image4.9d914e37.png)

## [](#4-升级常见问题)4. 升级常见问题

### [](#41-常见api的更新)4.1. 常见API的更新

||api名称||老的使用方式||新的使用方式||备注|
||cb.route.pushPage||cb.route.pushPage('view/yyarchive/billno?tpiid=...&domainkey=...'，data)||cb.route.pushPage('view/yyarchive/billno?tpiid=...&domainkey=...', viewmodel, data)||新增一个参数 当前你页面的viewmodel|
||cb.route.push||cb.route.push('/cgroupcode')||viewmodel.biz.do('showpage', viewmodel, { params: { cGroupCode: 'mainListDetail'} })||打开子页面方式替换|
||cb.route.goBack||cb.route.goBack()||viewmodel.biz.do('closepage', viewmodel, { params: { cGroupCode: 'mainListDetail'} })||cGroupCode非必传 推荐传递|
||子表字段控制 cellState||gridmodel.setCellstate({ cellName: a, property: disabled value: false })||gridmodel.getEditRowModel().get(cItemName).setDisabed(false)gridmodel.getEditRowModel().get(cItemName).setVisible(false)gridmodel.getEditRowModel().get(cItemName).setValue('value')gridmodel.getEditRowModel().get(cItemName).setState('visible', false)... 都可||推荐使用editRowModel上的字段模型进行控制|
||Tab组件的显隐setHideTab/setShowTab||viewmodel.get(对应页签).setHideTab()/setShowTab()||viewmodel.execute('updateViewMeta', { code: cGroupCode, visible: true})||cGroupCode为对应页签的cGroupCode|
||子表字段的onBeforeValueChange||子表字段模型.on(onBeforeValueChange, (data) => {})||gridmodel.on('afterCellValueChange', (data) => {})||推荐使用gridmodel的afterCellValueChange替代|
||子表字段的onAfterValueChange||子表字段模型.on(onAfterValueChange, (data) => {})||gridmodel.on('afterCellValueChange', (data) => {})||推荐使用gridmodel的afterCellValueChange替代|
||子表字段的onChange||子表字段模型.on(onChange, (data) => {})||gridmodel.on('afterCellValueChange', (data) => {})||推荐使用gridmodel的afterCellValueChange替代|
||gridmodel.getSelectData||gridmodel.getSelectData()||gridmodel.getSelectedRows()|||

### [](#42-缺失事件的暂时处理方案)4.2. 缺失事件的暂时处理方案

目前移动端设计器，动作面板中，缺少部分命令，例如：删除、复制、编辑等。

如下是临时处理方式：即如何通过前端函数的方式兼容处理

- 列表页面

初始化的列表卡牌单据，进入列表页设计器如下：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/YonBuilderyidongduanshengjifangan_image5.2389b78f.png)

在"数据集"容器下，添加工具栏，并对应增加要绑定动作的按钮，如：编辑、删除、复制

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/YonBuilderyidongduanshengjifangan_image6.32cdf952.png)

#### [](#421-删除)4.2.1. 删除

直接给按钮绑定动作，"批量删除"即可。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/YonBuilderyidongduanshengjifangan_image7.3a79fe57.png)

#### [](#422-编辑)4.2.2. 编辑

手动给协议增加命令，"cCommand": "cmdEdit"：