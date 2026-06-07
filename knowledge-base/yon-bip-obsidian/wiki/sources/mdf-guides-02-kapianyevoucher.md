---
title: "卡片页（voucher）"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/02-kapianyevoucher"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 卡片页（voucher）

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/02-kapianyevoucher | 所属：指南

# [](#卡片页voucher)卡片页（voucher）

**卡片页，对应billType为voucher、archive、yyarchive、editablevoucherlist的单据的扩展逻辑，均满足voucher的标准扩展方式。卡片页扩展脚本也是放在business文件夹中。**

## [](#1-命名规则)1. 命名规则

扩展文件的路径，卡片页扩展脚本放在子产品编码文件夹下。

默认规范：'子产品编码_'+'单据编码_'+'VM.Extend.js'。

**eg:** EMM_emm_inspectstd_VM.Extend.js

## [](#2-生命周期)2. 生命周期

cb.define([ 'common/common_VM.Extend.js' ], function(common) {

 var emm_emm_inspectstd_VM_Extend = {

 doAction: function(name, viewmodel) {

 if (this[name]) {

 this[name](viewmodel);

 }

 },

 init: function(viewmodel) {

 // 页面元素加载后

 viewmodel.on('afterLoadMeta', function(args) {

 });

 // 数据加载前

 viewmodel.on('beforeLoadData', function(args) {

 });

 // 数据加载后

 viewmodel.on('afterLoadData', function(args) {

 });

 // 页面状态切换时

 viewmodel.on('modeChange', function(args) {

 });

 // 卡片页存在page,page页面渲染前

 viewmodel.on('beforeSubPageRender', function(args) {

 });

 }

 };

 try {

 module.exports = emm_emm_inspectstd_VM_Extend;

 } catch (error) {

 console.log(error);

 }

 return emm_emm_inspectstd_VM_Extend;

});

## [](#3-支持的动作)3. 支持的动作

[支持的动作列表](#/guides/02-kapianyevoucher)其中以编辑为例，编辑的action为edit，如需对编辑动作进行扩展，可以使用小驼峰式命名，进行扩展。

如：

// 编辑动作执行前

viewmodel.on('beforeEdit', function(args) {

});

// 编辑动作执行后

viewmodel.on('afterEdit', function(args) {

});

## [](#4-典型场景)4. 典型场景

### [](#41-状态切换时控制按钮页签状态)4.1. 状态切换时，控制按钮、页签状态

// 如编辑和详情切换，通过列表跳转至卡片等

viewmodel.on('modeChange', function(data) {

 if (data == 'add' || data == 'edit') {

 // 隐藏编辑按钮

 viewmodel.get('btnEdit')?.setVisible(false);

 // xxx按钮不可用

 viewmodel.get('btnXxx')?.setDisable(true);

 // 隐藏子表页面aaa

 viewmodel.execute('updateViewMeta', {code: 'aaa', visible: false});

 } else if (data == 'browse') {

 

 }

})

### [](#42-获取当前是pc端还是移动端)4.2. 获取当前是PC端还是移动端

// 1为PC端，2为触屏端，3为移动端

// 方式1

if(viewmodel.__data.viewmeta.view.iTplMode == 3) { }

 

// 方式2

if (cb?.rest?.terminalType == 3) { }

### [](#43-根据数据控制页面元素)4.3. 根据数据控制页面元素

viewmodel.on('afterLoadData', function(data) {

 // 控制字段

 if (data.status == '1') {

 viewmodel.get('xxx').setReadOnly(true);

 viewmodel.get('xxx').setVisible(false);

 }

})

### [](#44-子表页签linetabs相关处理)4.4. 子表页签（LineTabs）相关处理

// 动态切换页签

// 方式1

viewmodel.execute('invalidFieldsChange', [code]);// code为对应页签的数组

// 方式2

viewmodel.execute('updateViewMeta', {activeKey: 'xxx'});// xxx为billtplgroup_base中的cCode

 

// 获取当前点击的页签

viewmodel.execute('getLineTabsInfo', function(info) {

 console.log(info);

});

 

// 页签点击前

viewmodel.on('beforeTabActiveKeyChange', function(args) {

 if (args.key == 'xxx') {

 return false;// return false为阻止点击

 }

});

 

// 页签点击后

viewmodel.on('afterTabActiveKeyChange', function(args) {

});

 

// 页签的隐藏显示

viewmodel.execute('updateViewMeta', {code: 'xxx', visible: false});