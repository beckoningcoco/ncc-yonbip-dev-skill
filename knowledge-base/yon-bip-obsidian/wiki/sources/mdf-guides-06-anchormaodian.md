---
title: "Anchor 锚点"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/06-anchormaodian"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 6
---

# Anchor 锚点

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/06-anchormaodian | 所属：指南

# [](#anchor-锚点)Anchor 锚点

## [](#1-功能说明)1. 功能说明

容器导航快速定位

## [](#2-效果展示)2. 效果展示

### [](#21-纵向锚点)2.1 纵向锚点

（默认交互）
注意：进入页面由于布局动态改动，所以会有抖动，如果不需要抖动可以添加配置
bill_base表cExtProps配置{className: 'container-anchor'};
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/anchormaodianimage1.f18ca893.png)
纵向锚点两种模式（悬停和挤占）的切换形式，默认展示挤占模式。

配置
项目级开关 流水线配置 anchorFixedOpen=false
单据级开关 锚点容器cStyle配置 anchorFixedOpen=false
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/anchormaodianimage2.6bd0276e.png)

#### [](#211-纵向锚点配置说明)2.1.1 纵向锚点配置说明

在对应单据的excel中的billtplgroup_base表中增加以下配置：

- 一个cControlType为CollapseContainer的容器，cStyle配置为{"classname":"masonryLayout"}
- 若干个LineTabs，其parent配置为CollapseContainer对应的容器，cStyle配置为{"anchorCollapse":true,"tabsVisible":false}

### [](#22-横向锚点)2.2 横向锚点

横向锚点 hasAnchorHorizontal
在CollapseContainer的Style中配置属性hasAnchorHorizontal，值为true则开启横向锚点。
cStyle = "{"hasAnchorHorizontal":true}"。
cStyle中配置偏移量 anchorOffsetHeight: 100

#### [](#221-横向锚点配置说明)2.2.1 横向锚点配置说明

配置场景：
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/anchormaodianimage3.19bac0e4.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/anchormaodianimage4.47dd9831.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/anchormaodianimage5.3022befb.png)

场景A包含一级标题和二级标题：
锚点项展示的默认是CollapseContainer的下一层的标题，如果要在有一级标题的场景，想让锚点项展示二级标题，则需要在cStyle里配置字段：subTitle，值为true;
"cStyle": "{"hasAnchorHorizontal":true,"subTitle":true}"
场景C会把一级标题和二级标题同时展现在锚点项中

## [](#3-控制示例)3. 控制示例

// 设置锚点项隐藏

viewmodel.execute('updateViewMeta', {code: cGroupCode, visible: false})

// 锚点跳转事件

viewmodel.execute('updateViewMeta', {anchorCode: cGroupCode, goAnchor: true})

## [](#4-接入钉耙纵向锚点)4. 接入钉耙纵向锚点

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/anchormaodianimage6.c11df463.jpg)

## [](#5-常见问题)5. 常见问题

1.配置了hasAnchorHorizontal但是锚点没有出来？
原因：最外层没有配置CollapseContainer。
2.配置了但是点击锚点不生效？
原因1：页面没有滚动区；
原因2：特殊页面，需要领域传递滚动区给前端；
特殊页面结构滚动区拿的值不对，默认拿到的是整个页面的滚动区，特殊页面需要把滚动区域传递给框架。
需要在afterloadData这个事件里把滚动区传递给框架。
特殊页面滚动区请配置特殊类名 anchorScroll-container，避免滚动区类名出现多个。

例如：

viewmodel.on("afterLoadData", function () {

 setTimeout(()=>{

 viewmodel.execute('updateViewMeta', { scrollNode: document.querySelector('.anchorScroll-container'),code: 'sfa_clue_body_groupcontainer'})

 },1000)

})