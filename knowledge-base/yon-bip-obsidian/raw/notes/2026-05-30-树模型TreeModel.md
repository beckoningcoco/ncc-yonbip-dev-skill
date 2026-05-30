---
url: https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/SJMX-TreeModel1?nodeId=ce363ab0-060e-4fe3-97ac-fb287106f376&productline=CommunityDoc&type=enableDoc&localeHelp=zh_CN
title: "YonBIP社区文档中心"
language: "zh-CN"
captured_at: "2026-05-29T16:55:32.480Z"
---

# YonBIP社区文档中心

![logo](https://design.yonyoucloud.com/static/ucf/iuap-hc-client-fe/latest/client/assets/images/biplogo.fa4fb30c.svg)

社区文档中心

![avator](https://design.yonyoucloud.com/static/ucf/iuap-hc-client-fe/latest/client/assets/images/avatar.d348c3b4.svg) 未登录

## 树模型 TreeModel

最后更新时间：2025-11-14

![](https://design.yonyoucloud.com/static/ucf/iuap-hc-client-fe/latest/client/assets/images/share.2570fc0c.svg)

## 概述

## 适用场景

| **部署方案** | **开发类型** | **是否适用** |
| --- | --- | --- |
| 公有云 | 客户化定制开发 | *是* |
| 私有云 | 客户化定制开发 | *是* |
| 专属云 | 客户化定制开发 | *是* |
| 本地部署 | 客户化定制开发 | *是* |
| 公有云 | ISV生态开发 | *是* |
| 私有云 | ISV生态开发 | *是* |
| 专属云 | ISV生态开发 | *是* |
| 本地部署 | ISV生态开发 | *是* |

## 业务场景

本文主要讲解TreeModel（树）模型系统预制的方法及事件，通过该文档您将学习到在YonBuilder（可视化应用构建）中TreeModel（树）模型如何使用。

MDF官方文档-数据模型： [树模型 TreeModel](https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/02-tree-model "树模型 TreeModel")

## 关键词

TreeModel模型、树模型、TreeModel方法、TreeModel事件

## 如何获取TreeModel（树）模型

获取TreeModel（树）模型的方法有两种，可以使用任选一种方式获取TreeModel（树）模型。

## 2.1、方法一

viewModel.get('cCode');

## 2.2、方法二

viewModel.getTreeModel();

## TreeModel（树）模型预制方法

## 3.1、addNode(node, parentKey)

**方法：addNode(node, parentKey)**

**使用说明：** TreeModel的 **addNode(node, parentKey)** 方法，用于添加树节点方法。

**参数：**

**node为要添加的节点**

**parentKey为要添加的节点的父节点**

**示例代码：**

TreeModel.**addNode(node, parentKey)**;

## 3.2、deleteNode(key)

**方法：** deleteNode(key)

**使用说明：** TreeModel的deleteNode(key)方法，用于删除相关树节点。

**参数：**

**key为要删除的节点的key值**

**示例代码：**

TreeModel.deleteNode(key);

## 3.3、updateNode(node)

**方法：** updateNode(node)

**使用说明：** TreeModel的updateNode(node)方法，用于更新节点相关树节点信息。

**参数：**

**node为要更新的节点**

**示例代码：**

TreeModel.updateNode(node);

## 3.4、setDataSource(proxyConfig, queryParams, callback)

**方法：** setDataSource(proxyConfig, queryParams, callback)

**使用说明：** TreeModel的setDataSource()方法，用于设置模型的列表数据（dataSource）。

**参数：**

如果TreeModel中dataSourceMode为local则proxyConfig参数传递为真实数据。

否则proxyConfig参数传递服务请求地址，queryParams传递请求参数，callback传递回调函数。

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| proxyConfig | 请求配置/真实数据 | Object/Array |  |
| queryParams | 请求参数 | Object |  |
| callback | 请求回调 | function |  |

**示例代码：**

//例：dataSourceMode为local

TreeModel.setDataSource(listData)

//dataSourceMode不为local

TreeModel.setDataSource('bill/list.do',{id:1},function(result){})

## 3.5、select(selectedKeys)

**方法：** select(selectedKeys)

**使用说明：** TreeModel的select(selectedKeys)方法，用树模型数据项选择事件。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| selectedKeys | 选择的数据key | Array/string |  |

**示例代码：**

```
//入参：selectedKeys传递要选中的key值 [‘key1’,’key2’]
TreeModel.selete(selectedKeys);
```

## 3.6、getSelectedNodes()

**方法：** getSelectedNodes()

**使用说明：** TreeModel的getSelectedNodes()方法，用于获取选中的数据项。

**示例代码：**

TreeModel.getSelectedNodes();

## 3.7、getSelectedKeys()

**方法：** getSelectedKeys()

**使用说明：** TreeModel的getSelectedKeys()方法，用于获取选中的数据项的 key。

**示例代码：**

TreeModel.getSelectedKeys();

## 3.8、check(checkedKeys)

**方法：** check(checkedKeys)

**使用说明：** TreeModel的check(checkedKeys)方法，用于当树组件的checkable属性为true时，才会在树组件中显示选中框。该方法为设置勾选树节点。

**参数：**

checkedKeys需要勾选的树节点key值

**示例代码：**

TreeModel.check(checkedKeys);// checkedKeys为数组类型

## 3.9、getCheckedNodes()

**方法：** getCheckedNodes()

**使用说明：** TreeModel的getCheckedNodes()方法，用于获取选中的数据项。

**示例代码：**

TreeModel.getCheckedNodes();

## 3.10、getCheckedKeys()

**方法：** getCheckedKeys()

**使用说明：** TreeModel的getCheckedKeys()方法，用于获取选中的数据项的 key。

**示例代码：**

TreeModel.getCheckedKeys();

## 3.11、expandRow(index/rowKey)

**方法：** expandRow(index/rowKey)

**使用说明：** TreeModel的expandRow(index/rowKey)方法，用于展开/收起树表某行数据。

**参数：**

数组下标/rowKey值

**示例代码：**

TreeModel.expandRow(index/rowKey);

## TreeModel（树）模型预制事件

## 4.1、beforeLoad

****事件** ：** beforeLoad

**使用说明：** TreeModel的beforeLoad事件，是树模型发起请求前事件。

**示例代码：**

const TreeModelInfo= viewModel.getTreeModel();

TreeModelInfo.on('beforeLoad',function (data) {});

## 4.2、beforeSetDataSource

**事件：** beforeSetDataSource

**使用说明：DataSource改变前事件,返回true则继续进行DataSource的改变，返回false则终止DataSource的改变** 。

**示例代码：**

const TreeModelInfo= viewModel.getTreeModel();

TreeModelInfo.on('beforeSetDataSource',function (data) {

return true;

});

## 4.3、afterSetDataSource

**事件：** afterSetDataSource

使用说明： **DataSource改变后事件。**

**示例代码：**

const TreeModelInfo= viewModel.getTreeModel();

TreeModelInfo.on('afterSetDataSource',function (rows) {});

## 4.4、beforeSelect

****事件** ：** beforeSelect

**使用说明：** TreeModel的beforeSelect事件，select选择前事件,返回true则继续进行select的改变，返回false则终止select的改变。

**示例代码：**

//例：示例中的data为select选中数据

const TreeModelInfo= viewModel.getTreeModel();

TreeModelInfo.on('beforeSelect',function (data) {

return true;

});

## 4.5、afterSelect

**事件：** afterSelect

**使用说明：** TreeModel的afterSelect事件，是枚select选择后事件。

**示例代码：**

//例：示例中的data为select选中数据 const TreeModelInfo= viewModel.getTreeModel(); TreeModelInfo.on('afterSelect', function (data) {});

## 4.6、beforeCheck

****事件** ：** beforeCheck

**使用说明：** TreeModel的beforeCheck事件，check选择前事件,返回true则继续进行select的改变，返回false则终止select的改变。

**示例代码：**

//例：示例中的data为check选中数据

const TreeModelInfo= viewModel.getTreeModel();

TreeModelInfo.on('beforeCheck',function (data) {

return true;

});

## 4.7、afterCheck

**事件：** afterCheck

**使用说明：** TreeModel的afterCheck事件，是枚check选择后事件。

**示例代码：**

```
//例：示例中的data为check选中数据
const TreeModelInfo= viewModel.getTreeModel();
TreeModelInfo.on('afterCheck', function (data) {});
```

## 问题1：树模型如何设置多选/搜索框/复选框/展开节点

答：

1. 详细示例见下方代码：
```
const TreeModelInfo= viewModel.getTreeModel();
// 是否显示搜索框
TreeModelInfo.setState('showSearchInput', true/false);
// 是否显示搜索框
TreeModelInfo.setState('multiple', true/false);
// 节点前添加 Checkbox 复选框
TreeModelInfo.setState('checkable', true/false);
// 是否展开所有树节点
TreeModelInfo.setState('expandAll', true/false);
```

## 问题2：树模型如何设置显示全选按钮/支持拖拽

答：

1. 详细示例见下方代码：
```
const TreeModelInfo= viewModel.getTreeModel();
// 是否显示全选按钮
TreeModelInfo.setState('showSelectAll', true/false);
// 是否支持拖拽
TreeModelInfo.setState('draggable', true/false);
```

## 问题3：如何支持配置模块级标题

答：

1. 详细示例见下方代码：
```
const TreeModelInfo= viewModel.getTreeModel();
// 树名称
TreeModelInfo.setState('searchTreeTitle', ’树名称’);
// 树名称帮助提示
TreeModelInfo.setState('searchTreeTitleTips',string/html);
```

## 问题4：如何设置树节点禁用？

答：

1. 详细示例见下方代码:
```
// 在当前树节点的业务数据中维护disabled属性
const TreeModelInfo= viewModel.getTreeModel();
const arrData = [{
  "name": "节点1",
  "code": "node2",
  "disabled": true // 节点禁用
},
{
  "name": "节点1",
  "code": "node2",
  "disabled": false // 节点不禁用
}]

TreeModelInfo.setState('dataSourceMode','local');
TreeModelInfo.setDataSource(arrData);
```

## 问题5：如何设置默认展开某些节点？

答：

1.详细示例见下方代码：

```
// 1、有全部节点时
// **代表需要展开节点的key
treeModel.setState('expandedKeys', ['all', **]);
// 2、无全部节点时
// **代表需要展开节点的key
treeModel.setState('expandedKeys', [**，**,]);
```

页内目录

1\. 概述

1.1 适用场景

1.2 业务场景

1.3 关键词

2\. 如何获取TreeModel（树）模型

2.1 2.1、方法一

2.2 2.2、方法二

3\. TreeModel（树）模型预制方法

3.2 3.2、deleteNode(key)

3.3 3.3、updateNode(node)

3.5 3.5、select(selectedKeys)

3.6 3.6、getSelectedNodes

3.7 3.7、getSelectedKeys

3.8 3.8、check(checkedKeys)

3.9 3.9、getCheckedNodes

3.10 3.10、getCheckedKeys

3.11 3.11、expandRow(index/rowKey)

4\. TreeModel（树）模型预制事件

4.1 4.1、beforeLoad

4.2 4.2、beforeSetDataSource

4.3 4.3、afterSetDataSource

4.4 4.4、beforeSelect

4.5 4.5、afterSelect

4.6 4.6、beforeCheck

4.7 4.7、afterCheck

4.8 问题1：树模型如何设置多选/搜索框/复选框/展开节点

4.9 问题2：树模型如何设置显示全选按钮/支持拖拽

4.10 问题3：如何支持配置模块级标题

4.11 问题4：如何设置树节点禁用？

4.12 问题5：如何设置默认展开某些节点？

文档反馈

返回顶部