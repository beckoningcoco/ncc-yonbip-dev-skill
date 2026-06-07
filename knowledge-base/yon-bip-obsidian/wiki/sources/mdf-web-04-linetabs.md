---
title: "页签 LineTabs"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-linetabs"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 页签 LineTabs

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-linetabs | 所属：Web组件

# [](#页签-linetabs)页签 LineTabs

## [](#1-功能说明)1. 功能说明

页签组件，可以切换显示tab内容

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/LineTabsyeqianimage1.6a9bdb18.png)

## [](#3-基本属性)3. 基本属性

||属性名称||属性含义||值类型||属性说明|
||cGroupCode||容器的唯一code||string||每个lineTabs组件都要唯一的一个|

## [](#4-扩展属性style)4. 扩展属性Style

||属性名称||属性含义||值类型||属性说明|
||max||是否展示放大按钮||Boolean||false 不展示 true 展示|
||states||不同模式mode下tab显示隐藏状态||Object||![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/LineTabsyeqianimage3.1df0e9d2.jpg)|
||classname||组件最外层class||string||默认无|
||collapse||是否折叠||Boolean||false不折叠true折叠，默认false|
||showCount||折叠后可显示个数||Number||默认0个和上面的collapse配合使用|
||anchorCollapse||是否展示折叠按钮||Boolean||false 不显示展开折叠按钮 《锚点与多表流式布局配置》|
||tabsVisible||是否折叠起来||Boolean||true-展开；false-折叠，与anchorCollapse组合使用 《锚点与多表流式布局配置》|
||visible||设置容器是否隐藏||Boolean||默认false|
||forceRenders||在选项卡中强制渲染内容，而不是在单击选项卡后呈现延迟||Array||[cGroupCode, ....] 需要强制渲染的页签可以把cGroupCode设置到数组中|
||activeKey||默认激活的页签||string||值为对应页签的cGroupCode，默认无|
||disabledTabs||页签是否可以点击||Object||{[cGroupCode]: true|
||lineTabFullHeight||非表格内容是否撑满||Boolean||内容没有撑满时的白色背景色填充|

## [](#5-控制示例)5. 控制示例

### [](#51-如何动态切换linetabs页签)5.1. 如何动态切换lineTabs页签？

viewModel.execute('invalidFieldsChange',[cItemName])；

// 另一种方法

viewModel.execute('updateViewMeta',{activeKey: 'cGroupCode'})

### [](#52-linetabs页签切换前事件beforetabactivekeychange)5.2. lineTabs页签切换前事件beforeTabActiveKeyChange

viewmodel.on('beforeTabActiveKeyChange',function (arg) {

 const { key } = arg;

 return false; // 阻止后面切换事件

})

### [](#53-linetabs页签切换后事件aftertabactivekeychange)5.3. lineTabs页签切换后事件afterTabActiveKeyChange

viewmodel.on('afterTabActiveKeyChange',function (arg) {

 const { key } = arg;

})

### [](#54-如何实时获取linetabs的activekey的方法)5.4. 如何实时获取lineTabs的activeKey的方法

viewmodel.execute('getLineTabsInfo',function(info){console.log(info)})

### [](#55-linetabs添加页签点击后事件aftertabactivekeychange)5.5. lineTabs添加页签点击后事件，afterTabActiveKeyChange。

viewmodel.on('afterTabActiveKeyChange',function(info){

 const {key} = info;

})

### [](#56-如何设置页签的属性例如隐藏功能)5.6. 如何设置页签的属性，例如隐藏功能：

viewmodel.execute('updateViewMeta',{ code: cGroupCode, visible: false })

### [](#57-如何获取最大化按钮并添加事件)5.7. 如何获取最大化按钮并添加事件

viewmodel.on('afterMount',function () {

 const max= viewmodel.get('btnMax_qualitgradebody');

 if(max){

 max.on('click',function () {

 

 })

 }

})

### [](#58-设置某些页签禁用-不可点击-tabcgroupcode-为要禁用页签的cgroupcode)5.8. 设置某些页签禁用 不可点击 （tabcGroupCode 为要禁用页签的cGroupCode）

viewmodel.execute('updateViewMeta',{code:cGroupCode,disabledTabs:{tabcGroupCode: true}})

### [](#59-更改-tab-页签标题)5.9. 更改 tab 页签标题

1. 更改单个tab标题

const args = {cGroupCode: '值为tab容器的cGroupCode', caption: '自定义tab标题'}

viewModel.execute('updateTabsCaption', args)

 

2. 批量更改tab标题

const args = [

 {cGroupCode: '值为tab1容器的cGroupCode', caption: '自定义tab1标题'},

 {cGroupCode: '值为tab2容器的cGroupCode', caption: '自定义tab2标题'},

 {cGroupCode: '值为tab3容器的cGroupCode', caption: '自定义tab3标题'}

]

viewModel.execute('updateTabsCaption', args)

 

3. 如设置的 caption 是空（null, undefined, ‘’），则显示 tab 页签的原标题（即元数据的cName）。

### [](#510-扩展按钮)5.10. 扩展按钮

可在Lintable 容器下放置 Toolbar, 显示在标题右侧，最多配置两个 ToolBar,
默认靠右侧展示，如需显示在左侧 ToolBar 容器的 cAlign 设为 'topLeft'。

如需要自定义标题右侧区域内容，可通过该方式配置将 ToolBar
显示在左侧，然后 ToolBar 内配置拓展组件。

### [](#511-设置页签顺序)5.11. 设置页签顺序

viewmodel.execute(‘updateViewMeta’,{code:cGroupCode,tabItemSort:['cGroupCode2','cGroupCode1']}

### [](#512-如何隐藏linetab的最大化按钮)5.12. 如何隐藏lineTab的最大化按钮

lineTab 的cStyle中配置max:false