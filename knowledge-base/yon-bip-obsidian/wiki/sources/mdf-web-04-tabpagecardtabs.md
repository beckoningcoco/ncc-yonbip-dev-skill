---
title: "页面页签 TabPage CardTabs"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-tabpagecardtabs"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 页面页签 TabPage CardTabs

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-tabpagecardtabs | 所属：Web组件

# [](#页面页签-tabpage-cardtabs)页面页签 TabPage CardTabs

## [](#1-功能说明)1. 功能说明

TabPage和CardTabs是同一个组件，只是名称不一样，此组件主要展示多页签切换。

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/TabPageCardTabsyemianyeqianimage1.07e0feac.jpg)

## [](#3-吸顶事件)3. 吸顶事件

此组件有个吸顶功能，实现方式是监听页面的滚动事件来实现的，当页面滚动的距离大于当前组件的offsetTop和cardHeaderHeight的时候，此组件就吸顶，吸顶后会动态给cardTabs加上wui-tabs-bar-fixed类名，并且动态给组件设置top值。top值由workBenchHeight + cardHeaderHeight组成，因为工作台顶部的区域是可以折叠的，当折叠的时候，top值要动态改变。

页面滚动代码：

handleTabFixed () {

 const cardTabs = this.props.viewModel?.getCache(this.props.key);

 const activeTabs = cb.dom(cardTabs)?.parents('.wui-tabs-tabpane-active');

 const currentDom = activeTabs?.find('.container-common-mode') || [];

 const tabsBar = currentDom?.find('.wui-tabs-bar') || [];

 const cardHeader = activeTabs?.find('.list-top-toolbar') || [];

 if (currentDom?.length == 0) return;

 if (tabsBar?.length > 0 && tabsBar[0].clientHeight == 0) return;

 const tabBar = cb.dom(cardTabs)?.find('.wui-tabs-bar');

 currentDom[0].addEventListener('scroll', throttle(() => {

 const workBenchHeight = this.props.viewModel?.getCache('workBenchHeight');

 const cardHeaderHeight = cardHeader?.length > 0 ? cardHeader[0].clientHeight : 0;

 // 页面滚动的高度减去tab自身的高度,再减去cardHeaderHeight后再吸顶

 if (currentDom[0].scrollTop > (cardTabs?.offsetTop - cardHeaderHeight)) {

 this.setState({ topBarIsFixed: true });

 cardTabs.className = 'card-tabs-container wui-tabs-bar-fixed';

 tabBar[0].style.top = `${workBenchHeight + cardHeaderHeight}px`;

 } else {

 this.setState({ topBarIsFixed: false });

 cardTabs.className = 'card-tabs-container';

 tabBar[0].style.top = ''

 }

 }, 1000));

}

## [](#4-工作台折叠事件)4. 工作台折叠事件

cb.events.on('workBenchCollapse', function (args) {

 const { topBarIsFixed } = _this.state;

 const tabBar = cb.dom(cardTabs)?.find('.wui-tabs-bar');

 const activeTabs = cb.dom(cardTabs)?.parents('.wui-tabs-tabpane-active');

 const cardHeader = activeTabs?.find('.list-top-toolbar') || [];

 const cardHeaderHeight = cardHeader?.length > 0 ? cardHeader[0].clientHeight : 0;

 if (args.curStates == 'top') {

 _this.props.viewModel?.setCache('workBenchHeight', 36);

 // 页面已经发生滚动,点击了折叠或者展开按钮,top值重新计算

 if (topBarIsFixed) {

 tabBar[0].style.top = `${36 + cardHeaderHeight}px`;

 }

 } else {

 _this.props.viewModel?.setCache('workBenchHeight', 76);

 // 页面已经发生滚动,点击了折叠或者展开按钮,top值重新计算

 if (topBarIsFixed) {

 tabBar[0].style.top = `${76 + cardHeaderHeight}px`;

 }

 }

});

## [](#5-tab切换事件)5. tab切换事件

handleChange (key, disabled) {

 if (disabled) return;

 if (!this.props.viewModel.execute('beforeTabActiveKeyChange', { key })) return;

 this.setState({ activeKey: key }, () => {

 this.props.viewModel.execute('tabActiveKeyChange', { key });

 this.props.viewModel.execute('afterTabActiveKeyChange', { key });

 });

 if (!this.external[key]) return;

 if (this.external[key].viewModel) {

 if (this.paneStates[key] && this.paneStates[key].refresh)

 this.external[key].viewModel.execute('refresh');

 return;

 }

 const config = JSON.parse(this.external[key].config);

 const data = {

 billtype: config.billtype || 'voucherlist',

 billno: config.billnum

 };

 if (config.params)

 data.params = config.params;

 cb.loader.runCommandLine('bill', data, this.props.viewModel, (vm, viewmeta) => {

 this.externalReady(this.props.viewModel, vm, config);

 this.external[key].viewModel = vm;

 this.external[key].metaData = viewmeta;

 this.props.viewModel._set_data(key, vm);

 this.setState({ flag: true, nocache: new Date().getTime() });

 // this.calcTabBarHeight(vm);

 if (cb.__DIWORK_INTEGRATION_MODE__ === 'none' && this.paneStates[key]?.visible === false)

 cb.utils.loadingControl.end();

 });

}

## [](#6-tabbar右侧跳转事件)6. tabbar右侧跳转事件

1、cStyle里配置{"tabBarMore": true} 开启跳转按钮显示，自定义文字可配置{"tabBarMore": "自定义文字"}
2、跳转事件传递当前页签的key

// 注册跳转事件

viewmodel.get(cItemName).on('tabBarMoreLink', (key) => {})

## [](#7-更改tab页签标题)7. 更改tab页签标题

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

## [](#8-撑满屏幕显示)8. 撑满屏幕显示

cStyle里配置 cardTabFullHeight: true