---
title: "格式化表格列 formatter"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/04-geshihuabiaogelieformatter"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 格式化表格列 formatter

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/04-geshihuabiaogelieformatter | 所属：指南

# [](#格式化表格列-formatter)格式化表格列 formatter

## [](#1-formatter列组件的实现)1. formatter列组件的实现

在脚手架工程中的**formatter文件夹下面**创建一个扩展组件，并导出，如下图：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/geshihuabiaogelieformatter_image1.42668665.png)

## [](#2-formatter列组件的使用)2. formatter列组件的使用

**code：列的名字cItemName**

**formatterKey：上面导出的组件名称**

扩展脚本：

gridModel.setColumnState("code", "formatter", (rowInfo, rowData) => {

 return {

 formatterKey: "ProductImg",

 props: {

 rowInfo,

 rowData,

 },

 };

 });

调用gridModel的**setColumnState**方法，该方法接受三个参数，参数1为要操作的列的**cItemName**，参数2固定为**formatter**，参数3为回调函数，该函数接受两个参数，rowInfo（行相关元数据属性）和rowData（行相关的业务数据），**该方法必须return一个对象**，对象中包含两部分，其中**formatterKey**为第一步自定义的组件名称，**props**承载rowInfo、rowData等数据，也可在props中灌入其他数据，这些数据最终会传入到自定义组件的props中便于后续的操作

## [](#3-formatter列组件示例)3. formatter列组件示例

### [](#31-样例代码)3.1. 样例代码

import React, { Component } from "react";

 

export default class ProductImg extends Component {

 constructor(props) {

 super(props);

 this.state = {

 

 }

 }

 

 componentDidMount(){

 

 }

 

 componentWillUnmount(){

 

 }

 

 // 组件内部点击事件

 handleClick = () => {

 

 }

 

 render() {

 const { rowData,rowInfo } = this.props;

 // rowData：行数据信息 rowInfo: 行相关的元数据信息,包含行索引rowIndex等信息

 // 这个formatter列组件实现的效果参考3.2效果展示。组件布局是左右布局，左侧显示商品的图片，右侧显示商品编码和商品名称

 return (

 <div className="clearfix product-list-item" title={rowData.name}>

 <div className="product-list-item-img"> 

 <img src={rowData["url"]} /> 

 </div>

 <p title={rowData.code || rowData.barCode}>

 {rowData.code || rowData.barCode}

 </p>

 <a title={rowData.name} onClick={this.handleClick}>

 {rowData.name}

 </a>

 </div>

 );

 }

}

### [](#32-效果展示)3.2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/geshihuabiaogelieformatter_image2.346bc886.png)