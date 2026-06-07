---
title: "领域Redux Reducer扩展"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/03-lingyureduxreducerkuozhan"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 领域Redux Reducer扩展

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/03-lingyureduxreducerkuozhan | 所属：指南

# [](#领域redux-reducer扩展)领域Redux Reducer扩展

一些领域的扩展组件使用了redux进行页面状态管理，那么在门户集成的时候，需要保持一个store管理，所以这里讲解前端脚手架如何与MDF融合扩展

##### [](#1先把原有的redux进行一些修改srcwebcommonreduxcustomreducersjsx)1. 先把原有的redux进行一些修改src/web/common/redux/customReducers.jsx

import marapApSettle from './modules/marapApSettle'

import marapArSettle from './modules/marapArSettle'

import costCal from './modules/costCal'

import settleAccount from './modules/settleAccount'

import fixedAssetSettle from './modules/fixedAssetSettle'

import daySettle from './modules/daySettle'

import apExchangeGL from'./modules/exchange-gains-losses/ap-exchange-gl'

import arExchangeGL from'./modules/exchange-gains-losses/ar-exchange-gl'

import ficmpExchangeGL from'./modules/exchange-gains-losses/ficpm-exchange-gl'

import distributes from './modules/distributes/redux'

export default {

 marapApSettle,

 marapArSettle,

 costCal,

 settleAccount,

 fixedAssetSettle,

 daySettle,

 apExchangeGL,

 arExchangeGL,

 ficmpExchangeGL,

 distributes,

}

##### [](#2-脚手架内的进行注入srcwebclientextendjsx)2. 脚手架内的进行注入src/web/client/extend.jsx

const extendReducers=require('../common/redux/customReducers').default

cb.extend.registerReducers(process.env.__DOMAINKEY__,extendReducers)