---
title: "批量赋值使用方法"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/14-piliangfuzhishiyongfangfa"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 批量赋值使用方法

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/14-piliangfuzhishiyongfangfa | 所属：指南

当然，以下是对提供的Markdown文档内容进行调整后的版本：

# 批量赋值使用方法

## API名称

```js

cb.relevant.dealBatchAssignValue(model, data, relevant, domainKey)

## [](#参数说明)参数说明

||参数||类型||说明|
||model||对象||触发批量赋值规则的模型|
||data||字符串或数组||触发批量赋值的模型对应的数据，如果是子表触发，可以传null|
||relevant||对象||单条规则定义|
||domainKey||字符串||domainKey|

## [](#调用样例)调用样例

此处以子表调用为例：

const gridmodel = viewmodel.getGridModel();

const editRowModel = gridmodel.getEditRowModel();

const model = editRowModel.get('xxx'); // 此处取定义规则的字段属性

const relevantList = model._get_data('relevantList');

const domainKey = viewmodel.getParams().domainKey;

relevantList.forEach(relevant => {

 // 判断是赋值类规则再做触发

 if (relevant.relevantType == 'assign') {

 cb.relevant.dealBatchAssignValue(model, null, relevant, domainKey);

 }

});