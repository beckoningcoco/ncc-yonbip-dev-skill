---
title: "快捷键 Shortcut"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-shortcut"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 快捷键 Shortcut

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-shortcut | 所属：API

# [](#快捷键-shortcut)快捷键 Shortcut

## [](#1-解决场景)1. 解决场景

- 保存、取消操作通过快捷键操作实现
- 扩展配置任何快捷键
- 快捷键冒泡怎么处理（不同层级dom都绑定快捷键）
- 表头和表体输入框之间切换
- 触发特定场景点击
- 特定div快捷键

## [](#2-设计)2. 设计

- Command类：管理所有动作
- shortcut类：管理所有快捷键操作

## [](#3-改键和注册快捷键)3. 改键和注册快捷键

### [](#31-添加快捷键)3.1. 添加快捷键

||注册快捷键||备注||示例|
||preventDefault||阻止默认事件||true/false|
||stopPropagation||禁止冒泡||true/false|
||debounce||防抖||true/false|
||condition||条件， function类型||function(){return true}|
||showName||快捷键中文名||新增自定义弹窗|
||groupId||分组id，对应快捷键说明的id||0-4|

cb.shortcut.registerAction('ctrl + y', function a3 (e, params) {

 console.log('执行ctrl + y的事件，同时在cb.command中注册了a3事件', e, params);

}, viewmodel, {showName: '标题', groupId: 0})

 

添加完快捷键，会触发afterShortcutRegisterAction事件

viewmodel.on('afterShortcutRegisterAction', function(){})

### [](#32-获取所有的快捷键)3.2. 获取所有的快捷键

// viewmodel不传获取所有的

cb.shortcut.getAllShortCut(viewmodel)

### [](#33-解绑快捷键)3.3. 解绑快捷键

cb.shortcut.unRegisterAction('alt+n', viewmodel, 'name111')

 

// 解绑完快捷键，会触发afterShortcutUnRegisterAction事件

viewmodel.on('afterShortcutUnRegisterAction', function(){})

### [](#34-控制首次加载卡片是否聚焦第一个元素)3.4. 控制首次加载卡片是否聚焦第一个元素

viewmodel.on('afterLoadMeta', function() {

 cb.shortcut.setConfig(viewmodel, 'unfocusFirstElement', true);

})

 

或者控制开关

unfocusFirstElement 所有类型元素首次不聚焦

focusTipsFirstElement 聚焦浮层类别的组件