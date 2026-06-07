---
title: "树模型 TreeModel"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/02-tree-model"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 树模型 TreeModel

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/02-tree-model | 所属：API

# [](#树模型-treemodel)树模型 TreeModel

## [](#1-方法)1. 方法

### [](#11-setdatasourceproxyconfig-queryparams-callback)1.1. setDataSource(proxyConfig, queryParams, callback)

**说明：** 如果TreeModel中dataSourceMode为local则proxyConfig参数传递为真实数据。

否则proxyConfig参数传递服务请求地址，queryParams传递请求参数，callback传递回调函数。

//dataSourceMode为local

model.setDataSource(TreeData)

//dataSourceMode不为local

model.setDataSource('bill/list.do',{id:1},function(result){})

### [](#12-addnodenode-parentkey)1.2. addNode(node, parentKey)

**说明**：添加树节点方法

**入参**：node为要添加的节点

        parentKey为要添加的节点的父节点

**注意事项**：parentKey为可选参数，表示要添加的节点是根节点还是存在父节点

### [](#13-deletenodekey)1.3. deleteNode(key)

**说明**：删除节点

**入参**：key为要删除的节点的key值

### [](#14-updatenodenode)1.4. updateNode(node)

**说明**：更新节点

**入参**：node为要更新的节点

### [](#15-selectselectedkeys)1.5. select(selectedKeys)

**说明**：设置选中的树节点

**入参**：selectedKeys树节点的key值 可为数组

### [](#16-getselectednodes)1.6. getSelectedNodes()

**说明**：获取已选中的树节点

### [](#17-getselectedkeys)1.7. getSelectedKeys()

**说明**：获取已选中树节点的key值

### [](#18-checkcheckedkeys)1.8. check(checkedKeys)

**说明**：当树组件的checkable属性为true时，才会在树组件中显示选中框。该方法为设置勾选树节点

**入参**：checkedKeys需要勾选的树节点key值

### [](#19-getcheckednodes)1.9. getCheckedNodes()

**说明**：获取已勾选的树节点

### [](#110-getcheckedkeys)1.10. getCheckedKeys()

**说明**：获取已勾选的树节点的key值

### [](#111-expandrowindexrowkey)1.11. expandRow(index/rowKey)

**说明：**展开/收起树表某行数据，参数：数组下标/rowKey值

### [](#112-setcolumnscolumns-fieldnames)1.12. setColumns(columns, fieldNames)

**说明**：设置treetable栏目

**入参**：fieldNames  fieldname集合(可不传)

## [](#2-事件)2. 事件

### [](#21-beforesetdatasource)2.1. beforeSetDataSource

**说明**：DataSource改变前事件，返回true则继续进行DataSource的改变，返回false则终止DataSource的改变

const treeModel = viewmodel.get(propertyName);

// 或

const treeModel = viewmodel.getTreeModel();

 

treeModel.on('beforeSetDataSource', function (data) {

 return true;

});

### [](#22-aftersetdatasource)2.2. afterSetDataSource

**说明**：DataSource改变后事件

const treeModel = viewmodel.get(propertyName);

// 或

const treeModel = viewmodel.getTreeModel();

 

treeModel.on('afterSetDataSource', function (data) {});

### [](#23-beforeselect)2.3. beforeSelect

**说明**：select选择前事件，
返回true则继续进行select的改变，返回false则终止select的改变

const treeModel = viewmodel.get(propertyName);

// 或

const treeModel = viewmodel.getTreeModel();

 

//例：示例中的data为select选中数据

treeModel.on('beforeSelect', function (data) {

 return true;

});

### [](#24-afterselect)2.4. afterSelect

**说明**：select选择后事件

const treeModel = viewmodel.get(propertyName);

// 或

const treeModel = viewmodel.getTreeModel();

 

//例：示例中的data为select选中数据

treeModel.on('afterSelect', function(data) {});

### [](#25-beforecheck)2.5. beforeCheck

**说明**：点击选择框check选中前事件,返回true则继续进行check的改变，返回false则终止check的改变

const treeModel = viewmodel.get(propertyName);

// 或

const treeModel = viewmodel.getTreeModel();

 

//例：示例中的data为check选中数据

treeModel.on('beforeCheck', function (data) {

 return true;

});

### [](#26-beforeload)2.6. beforeLoad

**说明**：发起请求前事件

### [](#27-aftercheck)2.7. afterCheck

**说明**：点击选择框check选中后事件

const treeModel = viewmodel.get(propertyName);

// 或

const treeModel = viewmodel.getTreeModel();

 

//例：示例中的data为check选中数据

treeModel.on('afterCheck', function (data) {});

## [](#3-懒加载-请详读下面的注释)3. 懒加载 (请详读下面的注释)

treeMolde.setCache('lazyLoadTree', true)

treeMolde.setCache('lazyLoadTreeByPagination', true)

// 此处需要注意，前端只有这两个开关并且要同时开启，开启了之后后端返回的数据结构需要发生改变，树的根节点返回的结构应与list接口返回结构一致，非根节点需返回数据的列表。

// 前端只有这两行代码，确保treeModel没有问题则前端无其他任何需要适配的内容和代码，目前已有多领域适配，如开启开关后无法正常渲染，考虑后端适配问题，具体文档咨询MDD

// 如果没有适配后端返回数据结构的，哪怕接口正常返回了数据也不会正确渲染。具体领域后端需要适配内容联系MDD咨询相关文档

// 前端没有后端返回数据结构相关文档，如需要文档，联系MDD