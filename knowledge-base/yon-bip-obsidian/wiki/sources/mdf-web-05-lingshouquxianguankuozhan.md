---
title: "--零售查询区相关扩展"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-lingshouquxianguankuozhan"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# --零售查询区相关扩展

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-lingshouquxianguankuozhan | 所属：Web组件

# [](#零售查询区相关扩展)零售查询区相关扩展

# [](#需求背景)需求背景

为了支持零售ToB风格的组件，查询区进行了一些扩展功能支持，以下是对应功能以及Demo

查询区支持配置扩展组件，渲染在搜索按钮之后的位置，但是**配置扩展组件后默认会隐藏查询区面板展开收起按钮。**

# [](#扩展组件配置)扩展组件配置

需要在查询区的cStyle中配置**extFilterComp**，具体参考[查询区基础配置](#/components-web/05-convenientquery)

## [](#查询方案弹窗右移)查询方案弹窗右移

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/lingshouquxianguankuozhanimage1.59cbd958.png)

上图的漏斗图标为查询方案，实现此功能需要配置扩展组件，可以是按钮，可以是图标，需要业务自定义。

如果想打开查询方案弹窗，核心逻辑为：

const schemeList = this.vm.getCache('schemeList')

const schemeId = this.vm.getCache('schemeId')

let schemeObj = schemeList.find(item => item.id === schemeId)

schemeObj = cb.utils.extend(schemeObj, {serviceCode: this.vm.getServiceCode()})

this.props.FilterViewModel.execute('openSchemeModal', schemeObj) // 这里主要是用FilterViewModel，扩展组件传入了FilterViewModel，很方便，也可以自行通过ViewModel获取

MDF查询区有展开收起面板的按钮，零售如果需要定制，需要自定义组件，组件内执行下面代码：

FilterViewModel.execute('buttonClick', null, 'more') // 展开面板

FilterViewModel.execute('buttonClick', null, '') // 收起面板