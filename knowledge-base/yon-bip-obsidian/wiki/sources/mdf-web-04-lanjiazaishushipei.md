---
title: "懒加载树适配"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-lanjiazaishushipei"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 懒加载树适配

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-lanjiazaishushipei | 所属：Web组件

# [](#懒加载树适配)懒加载树适配

## [](#1-普通树适配懒加载)1. 普通树适配懒加载

在扩展脚本中对树模型处理如下代码，**如开启懒加载，请详细阅读下面的注释**

treeModel.setCache('lazyLoadTree', true)

treeModel.setCache('lazyLoadTreeByPagination', true)

// 此处需要注意，前端只有这两个开关并且要同时开启，开启了之后后端返回的数据结构需要发生改变，树的根节点返回的结构应与list接口返回结构一致，非根节点需返回数据的列表。

// 前端只有这两行代码，确保treeModel没有问题则前端无其他任何需要适配的内容和代码，目前已有多领域适配，如开启开关后无法正常渲染，考虑后端适配问题，具体文档咨询MDD延鑫

// 如果没有适配后端返回数据的，哪怕接口正常返回了数据也不会正确渲染。具体领域后端需要适配内容联系MDD延鑫咨询相关文档

// 前端没有后端返回数据结构相关文档，如需要文档，联系MDD延鑫

## [](#2-参照树适配懒加载)2. 参照树适配懒加载

在pub_ref表中的extendField中配置如下字段（参照提供方配置）

{"lazyLoadTree": true,"lazyLoadTreeByPagination": true}

在脚本中配置懒加载（参照使用方配置）

const referModel = viewmodel.get('xx')

referModel.on('afterInitVm', function(args){

	const vm = args.vm;

	vm.get('tree').setCache('lazyLoadTree', true)

	vm.get('tree').setCache('lazyLoadTreeByPagination', true)

})

## [](#3-普通导航区适配懒加载)3. 普通导航区适配懒加载

### [](#31-table类型的参照)3.1. Table类型的参照

数据超过一定条数默认开启懒加载(当前默认为200条)

### [](#32-tree类型的参照)3.2. Tree类型的参照

在pub_ref表中的extendField中配置如下字段

{"lazyLoadTree", true,"lazyLoadTreeByPagination", true}

在脚本中配置

// 获取查询区中对应参照模型

const referModel = viewmodel.get('xx').getFromModel();

referModel.on('afterInitVm', function(args){

const vm = args.vm;

 vm.get('tree').setCache('lazyLoadTree', true)

 vm.get('tree').setCache('lazyLoadTreeByPagination', true)

})

 

//如果在单据脚本中想要操作查询模型中的参照 脚本书写较为复杂，示例代码如下：

// viewmodel为当前列表的页面模型

viewmodel.on('afterInitCommonViewModel', function () {

 const filterViewModel = viewModel.getCache('FilterViewModel');

 filterViewModel.on('afterInit', function(){

 const referModel = viewmodel.get('xx').getFromModel();

 referModel.on('afterInitVm', function(args){

		const vm = args.vm;

		vm.get('tree').setCache('lazyLoadTree', true)

		vm.get('tree').setCache('lazyLoadTreeByPagination', true)

 })

 })

})

## [](#4-数据层适配)4. 数据层适配

- 返回数据中的level需保证准确（如开启首层懒加载则只需要保证首层的level准确，其余level大于1且不为空即可）
- 返回数据中需存在isEnd字段区分是否为末级节点

## [](#5-搜索后展示全部数据不走懒加载)5. 搜索后展示全部数据（不走懒加载）

treeModel.on('beforeLoad', function(arg){

	// 根据arg里面的搜索条件，决定是否展示全部数据

	if（arg.** === ***）{

		treeModel._set_data('searchShowAllChild', true);

	} else {

		treeModel._set_data('searchShowAllChild', false);

	}

})

// 如果搜索后需要展示全部数据，不走懒加载，则需要将子节点的children值设置为[]