---
title: "特征tag扩展方案（临时方案）"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/15-tezhengtagkuozhanfangan"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 特征tag扩展方案（临时方案）

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/15-tezhengtagkuozhanfangan | 所属：指南

# [](#特征tag扩展方案临时方案)特征tag扩展方案（临时方案）

**由于特征目前未支持参照多选tag组件，故暂时提供一个扩展方案来支持。**

## [](#11-相关配置)1.1 相关配置

分配两个特征字段到单据上，字段A为文本类型，用于存储id；字段B为参照类型，对应实际使用的参照。

## [](#12-扩展脚本)1.2 扩展脚本

// 此处以特征占位字段cItemName为defineGroup为例，领域实现过程中需要换成对应的userdefinegroup类型的字段的cName

const referModel = viewModel.get('defineGroup')?.get('B'); // 获取参照模型

const showModel = viewModel.get('defineGroup')?.get('A'); // 获取文本id字段模型

referModel?.setState?.('multiple', true); // 设置参照多选

referModel?.setState?.('returnText', true); // 设置参照回显text

// 监听afterLoadData事件，在数据返回时，做参照数据赋值

viewModel.on('afterLoadData', function(data) {

 const id = data.defineGroup.A; // 获取id字段，此时是以逗号拼接的，如123,456,789

 const name = data.defineGroup.B; // 获取名称字段，此时也是以逗号拼接，如张三,李四,王五

 const idList = id.split(',');

 const nameList = name.split(',');

 const valueList = [];

 idList.forEach((item,index)=>{

 valueList.push({

 id: item,

 name: nameList[index]

 })

 })

 referModel.setValue(valueList); // 拼接value数组并赋值给参照

})

// 监听参照值变更事件，将id值逗号分割并存储在模型上

referModel?.on('afterValueChange', function(args) {

 showModel.setValue(args.obj?.value?.join(','));

})

// 保存前处理数据

viewModel.on('beforeSave', function(args) {

 const data = args.data.data;

 const datas = JSON.parse(data);

 if (datas.defineGroup && Array.isArray(datas.defineGroup.B)) {

 datas.defineGroup.B = datas.defineGroup.B_name; // 将显示值放在参照的id上存储，实际id用字段A来承载，此时B_name为显示名称，name字段换成对应的displayname即可，与B以下划线拼接

 }

 const temp = JSON.stringify(datas);

 args.data.data = temp;

})