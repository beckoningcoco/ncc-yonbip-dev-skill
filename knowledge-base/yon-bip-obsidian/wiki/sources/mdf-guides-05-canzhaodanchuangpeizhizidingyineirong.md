---
title: "参照弹窗配置自定义内容"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/05-canzhaodanchuangpeizhizidingyineirong"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 参照弹窗配置自定义内容

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/05-canzhaodanchuangpeizhizidingyineirong | 所属：指南

# [](#参照弹窗配置自定义内容)参照弹窗配置自定义内容

## [](#ui展示)UI展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/canzhaodanchuangpeizhizidingyineirongimage1.1bb40a60.png)

## [](#参照ui模板配置)参照UI模板配置

参照提供方UI模板配置一个cControlType为extralrefarea类型的容器，里面的控件自定义配置即可,controls里面的iSystem配置为0
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/canzhaodanchuangpeizhizidingyineirongimage2.b21f6ef2.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/canzhaodanchuangpeizhizidingyineirongimage3.0e8adc3e.png)

## [](#事件监听)事件监听

// 如果是单据扩展脚本

referModel.on('afterBrowse',function(arg){ // referModel的获取

 const vm = referModel.getCache('vm')

 const switchButton = vm.get('switchButton') // switchButton

 switchButton.on('afterValueChange',function(args){

 console.log(args);

 // 实现自己的逻辑即可

 })

});

 

// 如果是参照扩展脚本 viewModel就是参照扩展脚本入口的viewModel

const referModel = viewModel.getParams().referModel;

referModel.on('afterBrowse',function(){

 const switchButton = viewModel.get('switchButton') // switchButton

 switchButton.on('afterValueChange',function(args){

 console.log(args);

 // 实现自己的逻辑即可

 })

})