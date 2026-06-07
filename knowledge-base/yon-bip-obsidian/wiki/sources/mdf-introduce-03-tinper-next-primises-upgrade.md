---
title: "TinperNext专属化升级方案"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/03-tinper-next-primises-upgrade"
section: "介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 介绍]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# TinperNext专属化升级方案

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/03-tinper-next-primises-upgrade | 所属：介绍

# [](#tinpernext专属化升级方案)TinperNext专属化升级方案

## [](#1-背景)1. 背景

MDF框架底层组件升级Tinper-next后，工作台以及工作台内打开的单据依赖的钉耙js、React等三方依赖均由工作台统一引入，MDF框架不再单独引入，故在专属化项目升级过程中，MDF和工作台需要同时升级。

## [](#2-无mdf样式覆盖项目飞鹤等)2. 无MDF样式覆盖项目（飞鹤等）

基于1130的金盘（或更早）的项目，改成基于预发YMS出盘时，首次打补丁需要将MDF补丁和工作台补丁同时打上。

||||应用编码||应用名称|
||MDF||iuap-mdf-node||MDF服务|
||工作台||iuap-apcom-workbench.app-fe||工作台前端-主应用|
||||iuap-apcom-workbench.vendor-fe||工作台前端-公共静态资源|
||||iuap-apcom-workbench.manager-fe||工作台前端-工作台管理|
||||iuap-apcom-workbench.yonbiplogin-fe||工作台-bip登录|
||||iuap-apcom-workbench.portal-fe||工作台前端-工作台门户|
||||iuap-apcom-workbench||工作台|

领域基于钉耙升级前的组件，对自己领域节点有样式覆盖、基于钉耙组件dom操作等，首次也需要同MDF同时打补丁

## [](#3-有mdf级样式覆盖项目明日等)3. 有MDF级样式覆盖项目（明日等）

- 同"无MDF样式覆盖项目"
- 处理MDF样式覆盖问题

将覆盖样式里面的.u-**改成.wui-**，改完部署到专属化项目测试环境验证即可。

**举例：**

明日样式覆盖代码

@main-color: #bfd5f5; //

@font-color: #2169d3;

.group-container .group-title {

 background: @main-color !important;

 color: @font-color;

 padding-top: 5px;

 padding-bottom: 5px;

}

// #container {

// background-color: #efefef;

// }

.col-all {

 background: #efefef;

}

.group-container .group-title {

 margin-bottom: 0;

}

.public_fixedDataTable_header,

.public_fixedDataTable_header .public_fixedDataTableCell_main {

 background: #ebf6fa;

}

.line-tabs-menu-container + .ys-tabs {

 border-top: 1px solid #dbe0e5;

}

.line-tabs-menu-container .u-tabs-nav .u-tabs-tab.u-tabs-tab-active,

.u-tabs-editable-card .u-tabs-nav .u-tabs-tab:hover {

 color: #727272 !important;

 font-weight: 900 !important;

}

.u-tabs-editable-card .u-tabs-nav .u-tabs-tab.u-tabs-tab-active:after,

.u-tabs-editable-card .u-tabs-nav .u-tabs-tab:focus:after,

.u-tabs-editable-card .u-tabs-nav .u-tabs-tab:hover:after {

 border-bottom: 2px solid #5590b8;

}

.line-tabs-menu-container .u-tabs-nav .u-tabs-tab.u-tabs-tab-active:before {

 border: none;

}

.acticonCell .table-list-btn {

 background: #2c6bb2 !important;

}

.acticonCell .table-list-btn:hover {

 background: #2c6bb2 !important;

}

.u-button.u-button-primary {

 background: #2c6bb2 !important;

}

.primaryHoverBlue .u-button.u-button-primary{

 background-color: #fff !important;

 border: 1px solid #2c6bb2 !important;

 color: #2c6bb2 !important;

}

.primaryHoverBlue .u-button.u-button-primary:hover{

 background-color: #2c6bb2 !important;

 border: null !important;

 color: #fff !important;

}

.primaryHoverBlue .u-button.bg-blue{

 background-color: #2c6bb2 !important;

 border: null !important;

 color: #fff !important;

}

.ys-tabs.u-tabs .viewCell.viewSetting .yon-row .col-float {

 padding-left: 0;

}

.control-text .text-wrapper {

 background: #f8f8f8;

 border-radius: 2px;

 padding-left: 5px;

}

.container-browse-mode

 .viewSetting

 .basic-input-textarea

 .input-control

 .control-text {

 min-height: 40px;

}

.container-browse-mode

 .viewSetting

 .basic-input-textarea

 .input-control

 .control-text

 .text-wrapper {

 min-height: 40px;

}

修改以后

@main-color: #bfd5f5; //

@font-color: #2169d3;

.group-container .group-title {

 background: @main-color !important;

 color: @font-color;

 padding-top: 5px;

 padding-bottom: 5px;

}

// #container {

// background-color: #efefef;

// }

.col-all {

 background: #efefef;

}

.group-container .group-title {

 margin-bottom: 0;

}

.public_fixedDataTable_header,

.public_fixedDataTable_header .public_fixedDataTableCell_main {

 background: #ebf6fa;

}

.line-tabs-menu-container + .ys-tabs {

 border-top: 1px solid #dbe0e5;

}

.line-tabs-menu-container .wui-tabs-nav .wui-tabs-tab.wui-tabs-tab-active,

.wui-tabs-editable-card .wui-tabs-nav .wui-tabs-tab:hover {

 color: #727272 !important;

 font-weight: 900 !important;

}

.wui-tabs-editable-card .wui-tabs-nav .wui-tabs-tab.wui-tabs-tab-active:after,

.wui-tabs-editable-card .wui-tabs-nav .wui-tabs-tab:focus:after,

.wui-tabs-editable-card .wui-tabs-nav .wui-tabs-tab:hover:after {

 border-bottom: 2px solid #5590b8;

}

.line-tabs-menu-container .wui-tabs-nav .wui-tabs-tab.wui-tabs-tab-active:before {

 border: none;

}

.acticonCell .table-list-btn {

 background: #2c6bb2 !important;

}

.acticonCell .table-list-btn:hover {

 background: #2c6bb2 !important;

}

.wui-button.wui-button-primary {

 background: #2c6bb2 !important;

}

.primaryHoverBlue .wui-button.wui-button-primary{

 background-color: #fff !important;

 border: 1px solid #2c6bb2 !important;

 color: #2c6bb2 !important;

}

.primaryHoverBlue .wui-button.wui-button-primary:hover{

 background-color: #2c6bb2 !important;

 border: null !important;

 color: #fff !important;

}

.primaryHoverBlue .wui-button.bg-blue{

 background-color: #2c6bb2 !important;

 border: null !important;

 color: #fff !important;

}

.ys-tabs.wui-tabs .viewCell.viewSetting .yon-row .col-float {

 padding-left: 0;

}

.control-text .text-wrapper {

 background: #f8f8f8;

 border-radius: 2px;

 padding-left: 5px;

}

.container-browse-mode

 .viewSetting

 .basic-input-textarea

 .input-control

 .control-text {

 min-height: 40px;

}

.container-browse-mode

 .viewSetting

 .basic-input-textarea

 .input-control

 .control-text

 .text-wrapper {

 min-height: 40px;

}