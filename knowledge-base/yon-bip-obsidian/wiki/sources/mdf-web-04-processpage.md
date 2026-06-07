---
title: "步骤条 ProcessPage"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-processpage"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 步骤条 ProcessPage

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-processpage | 所属：Web组件

# [](#步骤条-processpage)步骤条 ProcessPage

## [](#1-功能说明)1. 功能说明

步骤条展示效果如下图，功能主要靠领域自定义维护，组件提供一个步骤展示区域和按钮操作区域

## [](#2-效果展示)2. 效果展示

说明：主要作用是两个区域，上面的步骤展示，和下面的按钮切换

### [](#21-steptype-default)2.1. stepType: 'default'

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ProcessPagebuzhoutiaoWebimage1.b3522e8d.jpg)

### [](#22-steptype-arrow)2.2. stepType: 'arrow'

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ProcessPagebuzhoutiaoWebimage2.3c6ee772.jpg)

## [](#3-扩展属性-cstyle)3. 扩展属性 cStyle

||属性名称||属性含义||值类型||属性说明|
||hideFooter||是否展示下面按钮||boolean||默认false 不隐藏按钮|
||stepType||进度条样式||string||默认'default' 还可以配置default,arrow,dot,number|
||clickPageBack||点击已完成是否进度到点击位置||boolean||默认true|
||more||是否展示更多||boolean||默认false|
||size||arrow的大小||string||默认small|

## [](#4-基本配置demo)4. 基本配置Demo

该组件是容器组件，cControlType: 'processpage',配置如下，步骤上的title取自containers里面各个元素的cName, containers中有几个元素（现在是3个）就展示几个步骤。可以配置page或者任何group

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

 cName: '档案规则'

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

"globalVars": {

 "__MDF_FEATURE_CONFIG__": {

 "useNewAppCode": false

 }

 }

## [](#5-按钮控制)5. 按钮控制

获取【上一步】viewmodel.get('processPagePrevious')

获取【下一步】viewmodel.get('processPageNext')

获取【取消】viewmodel.get('processPageCancel')

获取【完成】viewmodel.get('processPageSuccess')

eg:

设置上一步按钮

viewmodel.get('processPagePrevious').setValue('上一步新名称')

## [](#6-事件)6. 事件

==================

点击按钮触发事件

1. 下一步 viewmodel.on('processPageNext', { viewModel, activeKey })

2. 上一步 viewmodel.on('processPagePrevious', { viewModel, activeKey })

3. 完成 viewmodel.on('processPageSuccess', { viewModel, activeKey })

4. 取消 viewmodel.on('processPageCancel', { viewModel, activeKey })

5. 点击title触发 viewmodel.on('processPageHandleClick', {viewModel, activeKey, item })

==================

手动触发事件

code对应上面的 ’processpageCGroupCode‘ // -------- 这个必须要

1. 设置隐藏项

disabledTabs = {'对应cGroupCode': false} // false隐藏 true显示

viewmodel.execute('updateViewMeta', {code, disabledTabs})

2. 设置当前activeKey

viewmodel.execute('updateViewMeta', {code, activeKey: '对应cGroupCode' })

3. 进度条走到下一条

viewmodel.execute('updateViewMeta', {code, next: true })

4. 进度条走到上一条

viewmodel.execute('updateViewMeta', {code, previous: true })

## [](#7-数据)7. 数据

page数据都挂到最外层viewmodel的cache的processPages里，key是cGroupCode

{

 [cGroupCode]: {

 vm,

 viewmeta

 }

}

## [](#8-常用场景)8. 常用场景

点击标题切换到对应页签

viewmodel.on('processPageHandleClick',({viewModel, activeKey, item, operationObj}) => {

 operationObj.disable = true; // true 可以切换到对应页签 false 切换不到

})