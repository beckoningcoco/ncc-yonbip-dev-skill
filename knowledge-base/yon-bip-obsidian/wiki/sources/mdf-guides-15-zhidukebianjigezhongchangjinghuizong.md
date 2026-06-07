---
title: "只读可编辑各种场景汇总"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/15-zhidukebianjigezhongchangjinghuizong"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 只读可编辑各种场景汇总

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/15-zhidukebianjigezhongchangjinghuizong | 所属：指南

# [](#只读可编辑各种场景汇总)只读可编辑各种场景汇总

## [](#场景1可编辑列表voucherlistarchivelist)场景1：可编辑列表（VoucherList、ArchiveList）

### [](#相关属性)相关属性：

- 

readonly，GridModel内部属性，表明列表是否可编辑

- 

bCanModify， 控制列表的列，表明该列是否是可编辑列

由于VoucherList、ArchiveList在设计态没有提供是否可编辑的控制，运行时列表默认都是只读的。由GridModel初始化时默认内部属性readOnly控制，但GridModel提供了getReadOnly和setReadOnly方法可代码控制是否可编辑。

### [](#可编辑列表具体做法)可编辑列表具体做法

- 

Excel中设置billitem_base中的列表项的bCanModify设置为1，如果设置为0则表示该列是只读列

- 

在extend代码中通过GridModel的setReadOnly方法设置为false，即该列表为可编辑列表

cb.define([], function () {

 var ST_st_storeinlist_VM_Extend = {

 doAction: function (name, viewmodel) {

 if (this[name])

 this[name](viewmodel);

 },

 init: function (viewmodel) {

 let gridModel = viewmodel.getGridModel('stafflist_head');

 gridModel.setReadOnly(false);//设置为非只读，即可编辑

 }

 }

 try {

 module.exports = ST_st_storeinlist_VM_Extend;

 } catch (error) {

 

 }

 return ST_st_storeinlist_VM_Extend;

});

## [](#场景2容器卡片类只读)场景2：容器（卡片）类只读

说明：

- 

这里的容器实际上泛指容器

- 

实际上【场景1】GridModel也是一种具体的容器

下面是ContainerModel对readOnly的代码实现

model.prototype.setReadOnly = function (value) {

 var propertyNames = this._get_data('propertyNames');

 var property;

 propertyNames.forEach(function (propertyName) {

 property = this.get(propertyName);

 if (!(property instanceof cb.models.BaseModel)) return;

 property.setReadOnly(value);

 }, this);

 };

以上的关键代码在propertyNames.forEach()，可以看出设置了容器的readOnly，会影响到容器下propertyNames里的viewModel的只读。

#### [](#结论)结论：

- 

设置容器只读，会影响子元素的只读，

- 

并且这种只读会深度传递下去（孙级只读）

## [](#场景3组件控件级只读)场景3：组件（控件）级只读

说明：

控件级只读是由ViewModel来控制的，源码如下：

model.prototype.setReadOnly = function (value, ctrlName) {

 if (this.getState('bCanModify') === false)

 value = true;

 if (this.getState('bNotModify') === false)

 value = false;

 this.setState('readOnly', value, ctrlName);

};

关键代码是bCanModify、bNotModify、reaOnly这几键值