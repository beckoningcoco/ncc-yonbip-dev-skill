---
title: "设计器增补事件"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/06-shejiqizengbushijian"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 设计器增补事件

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/06-shejiqizengbushijian | 所属：移动组件

# [](#设计器增补事件)设计器增补事件

目前移动端设计器，动作面板中，缺少部分命令，例如：删除、复制、编辑等。

如下是临时处理方式：即如何通过前端函数的方式兼容处理

## [](#1-列表页面)1. 列表页面

初始化的列表卡牌单据，进入列表页设计器如下：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shejiqizengbushijian-image1.6c386ec8.png)

在"数据集"容器下，添加工具栏，并对应增加要绑定动作的按钮，如：编辑、删除、复制

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/shejiqizengbushijian-image2.6b5e078e.png)

### [](#11-删除)1.1. 删除

直接给按钮绑定动作，"批量删除"即可。

### [](#12-编辑)1.2. 编辑

手动给协议增加命令，"cCommand": "cmdEdit"

### [](#13-复制)1.3. 复制

手动给协议增加命令，"cCommand":
"cmdCopy"【暂不支持，需要后端适配】

绑定前端函数，脚本代码如下：

function (event) {

 var viewModel = this;

 var index = event.params.index;

 var data = {

 "cCommand": "cmdCopy",

 "cAction": "copy",

 "cSvcUrl": "/bill/copy",

 "cHttpMethod": "POST",

 "domainKey": "developplatform",

 "params": {

 "index": index,

 "name": "en1_355ab1a93ced48a8920e5c9d6fe9ee80"

 }

 }

 viewModel.biz.do('copy', viewModel, data);

}

其中，name 为实体的 cCode。

## [](#2-卡片页面)2. 卡片页面

卡片页增加删除动作，增加按钮，

手动给协议增加命令，"cCommand":
"cmdDelete"【暂不支持，需要后端适配】

绑定前端函数，脚本代码如下：

function (event) {

 var viewModel = this;

 var data = {

 "cCommand": "cmdDelete",

 "cAction": "delete",

 "cSvcUrl": "/bill/delete",

 "cHttpMethod": "POST",

 "domainKey": "developplatform"

 }

 viewModel.biz.do('delete', viewModel, data);

}

由于运行时会弹出 2 个确认弹框，需要手动编辑按钮的协议，去掉 onClick 或者
cCommand 属性。

## [](#3-列表非标准按钮事件处理)3. 列表非标准按钮事件处理

按钮没有模型的情况下 使用自定义事件

viewModel.getGridModel().on("afterSetDataSource", function (args) {

 var rows = viewModel.getGridModel().getRows()//获取rows

 for(let index = 0; index<rows.length; index++){

 viewModel.getGridModel().setCellState(index, '按钮组件id', 'visible', true)

 viewModel.getGridModel().setCellState(index, '按钮组件id', 'onClick', () => {

 // 你的事件内容

 console.log('======点击了第' + index + '行')

 })

 }

})