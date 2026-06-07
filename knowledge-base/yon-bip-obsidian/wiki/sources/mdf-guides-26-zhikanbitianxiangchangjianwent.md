---
title: "只看必填项 常见问题"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/26-zhikanbitianxiangchangjianwent"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 只看必填项 常见问题

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/26-zhikanbitianxiangchangjianwent | 所属：指南

# [](#只看必填项-常见问题)只看必填项 常见问题

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/zhikanbitianxiangchangjianwent_image1.175055cd.png)

在checkbox组件cSyle中配置， showMastInput: true

## [](#领域动态设置了字段的显示隐藏)领域动态设置了字段的显示隐藏

this.hideBisNullItems = false; // 首先记录一个值

viewmodel.on('hideBisNullItems', function(value) { // 监听这个事件记录值的变化

 this.hideBisNullItems = value;

});

viewmodel.get('监听字段').on('afterValueChange', function() {

 // ... 其他字段显示隐藏

 if (this.this.hideBisNullItems) {

 viewmodel.execute('hideBisNullItems', this.hideBisNullItems) 

 } 

});

## [](#子页面不受父页面只看必填项控制)子页面不受父页面只看必填项控制

在父页面的扩展脚本获取到子页面的viewmodel

viewModel.on('hideBisNullItems', (data) => {

	const childModel = viewModel.getCache('childViewModel')

	if (childModel) {

		childModel.execute('hideBisNullItems', data)

	}

})