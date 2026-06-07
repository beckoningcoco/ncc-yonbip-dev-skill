---
title: "按需加载三方包"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-three-package"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 按需加载三方包

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-three-package | 所属：API

# [](#按需加载三方包)按需加载三方包

## [](#1-按需加载excel工具)1. 按需加载Excel工具

// cb.utils.getExcelModule按需加载Excel工具包

const XLSX = await cb.utils.getExcelModule()

## [](#2-按需加载g6工具)2. 按需加载G6工具

// g6Load按需加载G6工具包

cb.events.execute('g6Load', () => {

// 业务代码

})

## [](#3-按需加载echarts工具)3. 按需加载Echarts工具

// echarts按需加载

require.ensure([], require => {

 this.echarts = require('echarts')

}, null, 'echartsCommon')

## [](#4-按需加载bmap地图)4. 按需加载Bmap地图

// 按需加载bmap

require.ensure(['react-bmapgl'], require => { //还能做只在编辑态加载地图

 BmapComp = require('react-bmapgl');

 // this.loadJSAPI();

}, null, 'bmap')

## [](#5-按需加载公式组件)5. 按需加载公式组件

// 按需加载yyuap-formula组件

require.ensure(['yyuap-formula'], require => {

 this.YYFormula = require('yyuap-formula');

 this.forceUpdate()

}, null, 'yyuapFormula')

## [](#6-按需加载文件服务资源)6. 按需加载文件服务资源

// 按需加载协同的文件服务的API

// 示例1：协同文件服务API

const api = await cb.utils.getYYCooperationBridge();

api.xxx(xxx)

// 示例2：协同文件服务组件

const YYCooperationBridge = await cb.utils.getYYFileserviceLib();

const Component = YYCooperationBridge[key];

this.node = node;

ReactDOM.render(<Component ref={(ins) => { this.ins = ins }} {...params} key={update} />, node);

return new Promise((resolve) => {

 resolve(this.ins);

});

## [](#7-按需加载手机号校验工具)7. 按需加载手机号校验工具

// 按需加载libphonenumber-js

const PhoneNumber = await cb.utils.getPhoneNumberModule()