---
title: "容器和组 GroupContainer&Group"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-groupcontainergroup"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 容器和组 GroupContainer&Group

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-groupcontainergroup | 所属：Web组件

# [](#容器和组-groupcontainergroup)容器和组 GroupContainer&Group

## [](#1-功能说明)1. 功能说明

Group表示一组，GroupContainer中包含一个或多个Group

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/GroupContainerGrouprongqihezuimage1.74d973d6.png)

## [](#3-group-扩展属性-cstyle)3. Group 扩展属性 (cStyle)

**注：group 的拓展属性必须嵌套在 groupContainer 中才能生效，单独使用
group 不生效**

||属性名称||属性含义||值类型||默认值||属性说明|
||collapse||是否可折叠||boolean||fasle|||
||collapsed||可折叠时折叠状态||boolean||true|||
||showTableCount||展示内嵌表格行数||boolean||false||默认不展示|
||aggregateFieldCItemName||展示内嵌表格合计||string||无||需要展示的子表合计列的cItemName, 多个合计字段以逗号分隔|
||collapseWhenTableNoData||子表无数据自动折叠所在分组||boolean||false|||
||hideTitle||隐藏标题||boolean||false|||
||max||是否显示最大化按钮||boolean||false|||
||groupTitle||标题名称||string||组件的cName值|||
||collapse||二级标题是否显示展开、折叠功能||boolean||true 显示 false 不显示|||
||collapsed||二级标题控制展开折叠状态||boolean||true折叠，false 展开|||
||collapsedObj||二级标题浏览态与编辑态折叠状态配置( collapsedObj优先级更高)||json||"cStyle": "{"visible":true,"collapsedObj":[{"mode":"add","collapsed":true},{"mode":"browse","collapsed":false}],"collapse":true}"|||

## [](#4-groupcontainer-扩展属性-cstyle)4. GroupContainer 扩展属性 (cStyle)

||属性名称||属性含义||值类型||默认值||属性说明|
||showContainerTitle||显示标题||boolean||fasle|||
||max||是否显示最大化按钮||boolean||false|||
||showMoreLine||底部折叠组件||boolean||默认false， 编辑态默认展开，浏览态默认收起，收起至3行的高度，只有一个组的情况，并且小于三行高度，折叠组件配了也会隐藏|||
||isShowMoreLine||配了折叠组件，就会始终显示||boolean||基于上边属性，小于三行高度，也显示折叠组件|||
||firstTitle||是否显示一级标题||boolean||{"firstTitle"：true}|||
||collapse||控制一级标题或者底部折叠组件的展开折叠||boolean||false 展开（默认），true 折叠|||
||底部折叠组件的展开折叠区分浏览态与编辑态，默认值编辑态展开，浏览态折叠||json||"cStyle": "{"collapse":[{"mode":"add","collapse":flase},{"mode":"browse","collapse":true}]}"|||||
||definedcollapseHeight||一级标题或者底部折叠组件自定义折叠高度||||{"definedcollapseHeight":"60px"}|||
||classname||自定义样式类名||string||"classname":"groupContainerWhite"可设置groupcontainer背景色为白色|||
||hideShowMoreLine||是否隐藏底部折叠组件||boolean||false 展示（默认）true隐藏|||
||cancelContainerMaxHeight||是否取消groupcontainer展开的最大高度||boolean||false不取消（默认）true取消|||
||containerMaxHeightScale||展开最大高度比例设置||number||示例0.3，展开页面高度（除去工作台头部高度）的比列|||

## [](#5-groupcontainer-标题区拓展)5. GroupContainer 标题区拓展

可在 GroupContainer 容器下放置 Toolbar, 显示在标题右侧，最多配置两个
ToolBar, 默认靠右侧展示，如需显示在左侧 ToolBar 容器的 cAlign 设为'topLeft'。

如需要自定义标题右侧区域内容，可通过该方式配置将 ToolBar
显示在左侧，然后 ToolBar 内配置拓展组件。

展示示例：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/GroupContainerGrouprongqihezuimage2.f04090d9.png)

## [](#6-group-标题区拓展)6. Group 标题区拓展

由于 group 内原本支持 ToolBar 显示，所以和 group 标题同级显示的 ToolBar
需要单独配置
cAlign（注意：group容器的iCols需要设置为1），需要设置group的"iCols"=1。

cAlign: topLeft (显示在标题同级左侧)

cAlign: top (显示在标题同级右侧)

cAlign: left (显示在标题下方左侧)

cAlign: right (显示在标题下方右侧)

自定义拓展标题区方式同 GroupContainer 一样，可通过拓展 ToolBar
类型组件实现

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/GroupContainerGrouprongqihezuimage3.9bfdc232.png)

## [](#7-控制示例)7. 控制示例

// 动态修改标题

viewModel.execute('updateViewMeta', {

 code: 'code', // 对应元数据中的cGroupCode

 groupTitle: '新标题'

})

 

// 控制折叠展开

viewModel.execute('updateViewMeta', {

 code: 'code', // 对应元数据中的cGroupCode

 collapsed: true // 是否折叠，true折叠 false展开

})

Group、Group container组件支持将主表关键字段配置到右侧，并且支持配置显显隐机制

viewModel.execute('updateViewMeta', {code: 'group6dd','showOnTitle':true}) true显示（默认）false隐藏

 

viewModel.execute('updateViewMeta', {code: 'groupcontainer8cf','showOnTitle':false})

要展示的字段配置 "cStyle": "{"showOnTitle":true}", 

或者cExtProps

## [](#8-监听事件)8. 监听事件

### [](#81-监听group的展开收起事件)8.1. 监听group的展开收起事件

// collapsed false为展开状态,true为收起状态,注意，此处参数PC端为collapsed，移动端是collapse

viewmodel.on('toggleGroup',({collapsed, meta}) => {

 // 处理代码

})

## [](#9-相关)9. 相关

《[卡片式分层结构](#/guides/06-kapianshifencengjiegou)》

## [](#10-faq)10. FAQ

**常见问题1 ?**

解答内容...