---
title: "卡片头部 CardHeader"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-cardheader"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 卡片头部 CardHeader

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-cardheader | 所属：Web组件

# [](#卡片头部-cardheader)卡片头部 CardHeader

## [](#1-功能说明)1. 功能说明

此组件主要展示卡片顶部的区域，内部可以嵌套Toolbar组件。

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/CardHeaderkapiantoubuimage1.b236295b.png)

## [](#3-吸顶事件)3. 吸顶事件

此组件有个吸顶功能，实现方式是通过定位position:
absolute来实现的，当页面滚动的时候会给此组件动态添加一个类名top-fixed，这个类名是为了实现影响的效果。因为此组件采用了定位，所以页面中有个空的div用来占位，占位的div类名是topbar-holder。

页面滚动代码：

topFixedHandler () {

 // 优先处理左树右卡结构

 let rightDom = cb.dom(this.cardHeader).parents('.form-base');

 if (rightDom.length === 0) rightDom = cb.dom(this.cardHeader).parents('.split_right');

 const activeTabs = cb.dom(this.cardHeader).parents('.wui-tabs-tabpane-active').find('.container-common-mode');

 let target = rightDom && rightDom[0];

 if (!target) target = activeTabs && activeTabs[0];

 target?.addEventListener('scroll', throttle(() => {

 this.setState({

 scrolled: target.scrollTop > 0

 });

 }, 1000));

}

当target.scrollTop > 0的时候，就会给组件加上top-fixed的类名。