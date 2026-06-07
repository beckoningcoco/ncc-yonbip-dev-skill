---
title: "--复制行、插行、增行常见问题"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-fuzhihangchahangzenghangchangjianwenti"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# --复制行、插行、增行常见问题

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-fuzhihangchahangzenghangchangjianwenti | 所属：Web组件

# [](#复制行插行增行常见问题)复制行、插行、增行常见问题

## [](#1-设置行默认值)1. 设置行默认值

行默认值，如果是静态属性，建议通过 cDefaultValue
设置。对于动态改变的默认值，需要通过扩展脚本设置，具体方法如下：

### [](#11-增行插行)1.1. 增行、插行

viewmodel.on('afterInsertRow', function(args) {

 gridModel.setCellValue(args.index, "iPosition", 1);

}

### [](#12-复制行)1.2. 复制行

viewmodel.on('afterCopyrow', function(args) {

 gridModel.setActionState(args.index, 'btnDeleteRow', 'visible', true);

}

### [](#13-注意事项)1.3. 注意事项

由于框架设计之初，未区分复制行和插行的场景，有些领域使用时，复制行和插行的逻辑均在 afterInsertRow
事件中处理，导致逻辑互相影响。故框架新增了 afterCopyrow
方法，专门用于处理复制行操作，建议后续开发都使用新的 afterCopyrow
方法。同时，为了能够向下兼容老的业务逻辑，我们在 afterInsertRow
方法的参数中，增加了 isCopy 标识，若 isCopy={ true
}，则此次为复制行操作，请领域开发注意这一点。

## [](#2-行排序)2. 行排序

### [](#21-ui交互规范)2.1. UI交互规范

复制行和插行操作，新产生的行会显示在原行上面，这里不涉及排序，属于单独的UI交互规范。

### [](#22-前端排序)2.2. 前端排序

扩展脚本可设置 GridModel 的 "orderField" 属性，一般会设置为
rowno。用于设置端上数据展示顺序，前端会根据此属性重排数据。

由于后台存储走数据库的默认排序，不支持复制行按前端展示顺序存储，因此编辑态和浏览态的数据排列顺序不会保持一致。也就是说，当用户编辑单据，进行复制行/插行操作后，在保存单据时的数据排列顺序，不被作为后台存储数据时的位置参考。保存成功后，再次查询该单据，表格中的数据排列顺序以后台实际返回结果为准，与编辑态的顺序无关。

### [](#23-后端排序)2.3. 后端排序

后台在 excel 中配置了指定的排序字段（如
iOrder，具体字段名称以领域设置为准），SQL
会做排序处理。保存后，再次查询列表时，端上展示顺序以后台实际返回为准。  

## [](#3-复制行-id-问题)3. 复制行 id 问题

最近好几个领域都遇到了复制行会将行 id
复制的问题。故将问题原因和解决方案汇总在此，以供开发参考。

### [](#31-问题现象)3.1. 问题现象

单据复制后，前端传给后端的id还是复制之前的id。

### [](#32-问题原因)3.2. 问题原因

目前复制行无法通过后端配置类似 unCopyable
字段去处理，目前后端不支持此项配置。所以只能在扩展脚本里，复制行动作后，把
id 之类的不可复制字段去掉。

### [](#33-解决方案)3.3. 解决方案

在 beforeCopyrow
方法中，将不可复制的字段置空。具体实现逻辑可参考以下这段代码：

//'modifyMainId', 'modifySubId','id',自定义项，回写字段不可复制

viewmodel.on('beforeCopyrow', function(args) {

 let rowData = args.data.rowData;

 let cellValue = [

 'modifyMainId','modifySubId','id',

 'storageqty','totalRecieveQty','totalInQty',

 'totalInvoiceQty','totalInvoiceMoney','totalPayQty',

 'totalRejectQty','totalArrivedTaxMoney','bodyItem!id',

 'bodyItem!modifySubId','totalArrivedNatTaxMoney','totalInTaxMoney',

 'totalInNatTaxMoney','totalInvoiceNatTaxMoney','totalPayOriMoney',

 'totalRecieveSubqty','totalInSubqty','totalReturnInQty',

 'totalReturnInSubQty','approveqty','closeqty'

 ];

 for (let cellIndex in cellValue) {

 let cellName = cellValue[cellIndex];

 if (rowData[cellName]) {

 rowData[cellName] = null;

 }

 }

});

## [](#4-复制行后字段状态控制失效)4. 复制行后，字段状态控制失效

### [](#41-问题现象)4.1. 问题现象

复制行后，被复制行的 bIsNull、disabled 等状态失效。

### [](#42-问题原因)4.2. 问题原因

可能是 table 组件内部的状态 this.cellState 和模型 gridModel
上的 cellState 没有同步导致的。

### [](#43-解决方案)4.3. 解决方案

- 

检查扩展脚本，设置 cellState 的地方，rowIndex 参数是否正确。

- 

检查 mdf-metaui-web/basic/table.jsx 中的 _InitCellStatus 方法。

- 

检查复制行后，table 内部的 this.cellState
等状态和界面显示的表格行是否一一对应。

- 

检查保存校验时，模型上的 cellState 和组件内部的 this.cellState
是否一致。

## [](#5-复制插入行位置修改)5. 复制、插入行位置修改

在beforeCopyRow事件中修改rowIndexes的值可以干预插入行的位置