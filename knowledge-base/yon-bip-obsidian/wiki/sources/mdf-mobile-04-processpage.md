---
title: "步骤条 ProcessPage"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/04-processpage"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 步骤条 ProcessPage

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/04-processpage | 所属：移动组件

# [](#步骤条-processpage)步骤条 ProcessPage

## [](#1-功能说明)1. 功能说明

步骤条展示效果如下图，功能主要靠领域自定义维护，组件提供一个步骤展示区域和按钮操作区域

## [](#2-效果展示)2. 效果展示

说明：主要作用是两个区域，上面的步骤展示，和下面的按钮切换

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ProcessPagezuzoutiao_image1.111016e5.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ProcessPagezuzoutiao_image2.96fd6dcb.png)

## [](#3-基本配置demo)3. 基本配置Demo

该组件是容器组件，cControlType: 'processpage',

配置如下:

步骤上的 title 取自 containers 里面各个元素的 cName, containers
中有几个元素（现在是3个）就展示几个步骤。可以配置page或者任何group

**demo**

const containers = [{

 cControlType: 'group',

 cStyle: '{"title":"选择人员","id":"1","tips":"","done":false,"billnum":"821505c1List"}',

 cGroupCode: "893935fa9f6e4c0590163038edbe3b70",

 cName: '选择人员',

 containers: [{

 

 }]

 }, {

 cControlType: 'page',

 cStyle: '{"title":"选择人员","id":"1","tips":"","done":false,"billnum":"821505c1List"}',

 cGroupCode: "11e89ed32d3d47c89d8d34dbdd46366a",

 cName: '档案规则

 }, {

 cControlType: 'page',

 cStyle: '{"title":"选择人员","id":"1","tips":"","done":false,"billnum":"821505c1List"}',

 cGroupCode: "aa8da021a5b44a7c906bcda8ed902e8c",

 cName: '档案规则'

 }]

 container = {

 containers,

 cControlType: 'processpage',

 cGroupCode: 'processpageCGroupCode', // -------- 这个必须要

 }

## [](#4-事件)4. 事件

==================

点击按钮触发事件

// 1. 下一步

viewmodel.on('processPageNext', (args) => {

 const { activeKey } = args;

 return false // 返回false则停留再当前步骤,返回true或没有return则继续执行下一步

}) //

// 2. 上一步 

viewmodel.on('processPagePrevious', (args) => {

 const { activeKey } = args;

 return false // 返回false则停留再当前步骤,返回true或没有return则继续执行上一步

})

// 3. 完成 

viewmodel.on('processPageSuccess', (args) => {

 const { activeKey } = args;

 return false // 返回false则停留再当前步骤,返回true或没有return则继续执行完成

})

// 4. 取消 

viewmodel.on('processPageCancel', (args) => {

 const { activeKey } = args;

 return false // 返回false则停留在当前页,返回true或没有return则关闭当前页面

})

 

 

手动触发事件

code对应上面的 ’processpageCGroupCode‘ // -------- 这个必须要

// 1. 设置隐藏项

disabledTabs = ['code', 'code']

viewmodel.execute('updateViewMeta', {code, disabledTabs})

// 2. 设置当前activeKey

viewmodel.execute('updateViewMeta', {code, activeKey: '对应cGroupCode' })

// 3. 进度条走到下一条

viewmodel.execute('updateViewMeta', {code, next: true })

// 4. 进度条走到上一条

viewmodel.execute('updateViewMeta', {code, previous: true })