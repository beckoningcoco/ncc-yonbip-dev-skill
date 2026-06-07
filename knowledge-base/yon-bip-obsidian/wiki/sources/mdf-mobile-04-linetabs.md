---
title: "子表页签 LineTabs"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/04-linetabs"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 子表页签 LineTabs

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/04-linetabs | 所属：移动组件

# [](#子表页签-linetabs)子表页签 LineTabs

## [](#1-功能说明)1. 功能说明

用于多页签展示，可以配置对应页签下显示的容器内容区

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/LineTabszibiaoyeqian_image1.1fc4e86f.png)

## [](#3-扩展属性-cstyle)3. 扩展属性 cStyle

||名称||含义||说明||默认值|
||名称||含义||说明||默认值|
||tabBarTextColor||tabbar字体颜色||tabbar字体颜色||无|
||tabBarBackgroundColor||tabbar背景色||tabbar背景色||无|
||inline||一行显示||页签标题和toolbar显示在一行||false|
||fixedToTop||页签固定到顶部||页面滚动时，页签会固定在单据顶部||false|
||autoHeight||自适应高度||切换页签，高度是否时自适应，而不是根据子标签内容区最高的高度显示||false|

## [](#4-控制示例)4. 控制示例

### [](#41-显示隐藏某个子页签)4.1. 显示隐藏某个子页签

// 显示 code的值为meta元数据中返回的cGroupCode的值

viewmodel.execute('updateViewMeta', {code: 'pu_sendorderscanlist', visible: true});

 

// 隐藏

viewmodel.execute('updateViewMeta', {code: 'pu_sendorderscanlist', visible: false});

### [](#42-改变linetabs的meta数据不常用)4.2. 改变linetabs的meta数据（不常用）

meta元数据返回的containers不是需要显示的数据，需要根据扩展脚本处理一下展示，则需使用改方法

viewmodel.execute('updateLineTabsMeta', {containers: [{},{}]});

### [](#43-处理linetabs默认选中的页签)4.3. 处理linetabs默认选中的页签

/**

 * cGroupCode的值为meta元数据中返回的cGroupCode的值

 * cName的值为meta元数据中返回的cName的值

 */

viewModel.execute('updateLineTabsPage', {

 tab: {

 title: cName,

 key: cGroupCode

 }

});

### [](#44-监听linetabs点击切换方法)4.4. 监听linetabs点击切换方法

viewModel.on('beforeTabActiveKeyChange', ({ key }) =>{

 // 当前选中的页签的key

 // 逻辑

});

viewModel.on('afterTabActiveKeyChange', ({ key }) =>{

 // 当前选中的页签的key

 // 逻辑

});

### [](#45-扩展动态控制linetabs后面数量)4.5. 扩展动态控制linetabs后面数量

viewModel.execute('getDataLength', { len: 3, childField: 对应的childrenField })