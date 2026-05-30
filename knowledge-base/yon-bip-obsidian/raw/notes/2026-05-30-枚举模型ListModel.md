---
url: https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/SJMX-ListModel1?nodeId=8dca38d1-ef7c-43fe-b86b-d02be1f1ed7e&productline=CommunityDoc&type=enableDoc&localeHelp=zh_CN
title: "YonBIP社区文档中心"
language: "zh-CN"
captured_at: "2026-05-29T16:55:48.469Z"
---

# YonBIP社区文档中心

![logo](https://design.yonyoucloud.com/static/ucf/iuap-hc-client-fe/latest/client/assets/images/biplogo.fa4fb30c.svg)

社区文档中心

![avator](https://design.yonyoucloud.com/static/ucf/iuap-hc-client-fe/latest/client/assets/images/avatar.d348c3b4.svg) 未登录

## 枚举模型 ListModel

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

本文主要讲解ListModel（枚举）模型系统预制的方法及事件，通过该文档您将学习到在YonBuilder（可视化应用构建）中ListModel（枚举）模型如何使用。

MDF官方文档-数据模型： [枚举模型 ListModel](https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/02-list-model "枚举模型 ListModel")

## 关键词

ListModel模型、枚举模型、ListModel方法、ListModel事件、枚举

## 如何获取ListModel（枚举）模型

获取ListModel（枚举）模型的方法有三种，需要根据页面中参照所在的位置来判断使用哪一种方式获取ListModel（枚举）模型。

## 2.1、适用于获取查询区中的枚举模型

```
viewModel.on('afterMount', function (data) {
    //1、获取查询区模型
    let filterViewModelInfo = viewModel.getCache('FilterViewModel');
    //2、查询区afterInit事件，必须放在页面模型的afterMount事件中才生效
filterViewModelInfo.on('afterInit', function(data){
    //3、获取枚举预模型，cItemName：参照字段的字段别名
        let listModelInfo = filterViewModelInfo.get('cItemName');
        //4、获取枚举真实没模型
        let listModelNewInfo = referModelInfo.getFromModel();
    })
});
```

## 2.2、适用于获取表格中的枚举模型

```
//1、获取表格模型
    let gridModelInfo = viewModel.getGridModel();
//2、获取表格行编辑模型
let editRowModelInfo = viewModel.getEditRowModel();
//3、获取枚举预模型，cItemName：参照字段的字段别名
    let listModelInfo = editRowModelInfo.get('cItemName');
```

## 2.3、适用于获取单卡页的枚举模型

//获取枚举模型，cItemName：参照字段的字段别名

let listModelInfo = viewModel.get('cItemName');

## ListModel（枚举）模型预制方法

## 3.1、setData(data)

**方法：setData(data)**

**使用说明：** ListModel的 **setData(data)** 方法，用于设置模型的值 value。

**示例代码：**

ListModel.**setData(data)**;// data为选中数据的key

## 3.2、getData()

**方法：** getData()

**使用说明：** ListModel的getData()方法，用于获取模型的值 value。

**示例代码：**

ListModel.getData\*\*()\*\*;

## 3.3、clear(useDefault)

**方法：** clear(useDefault)

**使用说明：** ListModel的clear(useDefault)方法，用于将组件绑定的模型上propertyNames的值， 更新到当前组件上。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| useDefault | true-设置value为模型上的cDefaultValue |  |  |

false-设置value 为underfined|Boolean||

**示例代码：**

ListModel.clear\*\*(\*\* useDefault\*\*)\*\*;

## 3.4、setDataSource(proxyConfig, queryParams, callback)

**方法：** setDataSource(proxyConfig, queryParams, callback)

**使用说明：** ListModel的setDataSource()方法，用于设置模型的列表数据（dataSource）。

**参数：**

如果ListModel中dataSourceMode为local则proxyConfig参数传递为真实数据。

否则proxyConfig参数传递服务请求地址，queryParams传递请求参数，callback传递回调函数。

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| proxyConfig | 请求配置/真实数据 | Object/Array |  |
| queryParams | 请求参数 | Object |  |
| callback | 请求回调 | function |  |

**示例代码：**

//例：dataSourceMode为local

ListModel.setDataSource(listData)

//dataSourceMode不为local

ListModel.setDataSource('bill/list.do',{id:1},function(result){})

## 3.5、getNodesByKeys(keys)

**方法：** getNodesByKeys(keys)

**使用说明：** ListModel的getNodesByKeys(keys)方法，用于获取当前节点数据。

**参数：**

keys 模型配置的valueField值的数据

**示例代码：**

ListModel.getNodesByKeys(keys)

## 3.6、select(selectedKeys)

**方法：** select(selectedKeys)

**使用说明：** ListModel的select(selectedKeys)方法，用于列表数据项选择事件。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| selectedKeys | 选择的数据 | Array |  |

**示例代码：**

//入参：selectedKeys传递要选中的key值 \[‘key1’,’key2’\] ListModel.selete(selectedKeys);

## 3.7、getSelectedNodes()

**方法：** getSelectedNodes()

**使用说明：** ListModel的getSelectedNodes()方法，用于获取选中的数据项。

**示例代码：**

ListModel.getSelectedNodes();

## 3.8、getSelectedKeys()

**方法：** getSelectedKeys()

**使用说明：** ListModel的getSelectedKeys()方法，用于获取选中的数据项的 key。

**示例代码：**

ListModel.getSelectedKeys();

## ListModel（枚举）模型预制事件

## 4.1、beforeValueChange

****事件** ：** beforeValueChange

**使用说明：** ListModel的beforeValueChange事件，是枚举确定返回数据改变前事件, 返回true则继续进行value的改变，返回false则终止value 的改变。

**示例代码：**

//例：示例中data格式为{ value: value, oldValue: oldValue }

viewModel.get('staffNew\_name').on('beforeValueChange',function (data) {

return true;

});

## 4.2、afterValueChange

**事件：** afterValueChange

**使用说明：** ListModel的afterValueChange事件，是枚举确定返回数据改变后事件，允许对改变后的数据进行操作。

**示例代码：**

//例：示例中data格式为{ value: value, oldValue: oldValue }

viewModel.get('staffNew\_name').on('afterValueChange',function (data) {});

## 4.3、beforeSetDataSource

**事件：** beforeSetDataSource

**使用说明：DataSource改变前事件,返回true则继续进行DataSource的改变，返回false则终止DataSource的改变** 。

**示例代码：**

viewModel.get('staffNew\_name').on('beforeSetDataSource',function (data) {

return true;

});

## 4.4、afterSetDataSource

**事件：** afterSetDataSource

使用说明： **DataSource改变后事件。**

**示例代码：**

viewModel.get('staffNew\_name').on('afterSetDataSource',function (rows) {});

## 4.5、beforeSelect

****事件** ：** beforeSelect

**使用说明：** ListModel的beforeSelect事件，select选择前事件,返回true则继续进行select的改变，返回false则终止select的改变。

**示例代码：**

//例：示例中的data为select选中数据

viewModel.get('staffNew\_name').on('beforeSelect',function (data) {

return true;

});

## 4.6、afterSelect

**事件：** afterSelect

**使用说明：** ListModel的afterSelect事件，是枚select选择后事件。

**示例代码：**

//例：示例中的data为select选中数据viewmodel.get(propertyName).on('afterSelect', function (data) {});

## 问题1：如何设置提示信息

答：

1. 详细示例见下方代码：

// 设置提示信息

viewModel.get(cItemName).setState('placeholder', '提示信息')

## 问题2：如何动态控制枚举项的显示隐藏

答：

1. 详细示例见下方代码：

listModel.setRowStates({"0": {visible:false}, "1": {visible:true}, "2": {visible:true}}); // "0" "1"指的是枚举的value值

## 问题3：如何控制是否多选？

答：

1. 详细示例见下方代码：

//默认false，多选为true

viewModel.get(cItemName).setState(multiple, true/false)

## 问题4：如何设置条件只读/禁用/隐藏？

答：

1. 详细示例见下方代码:

// 设置条件隐藏

viewmodel.get(cItemName).setVisible(false)

// 设置条件只读

viewmodel.get(cItemName).setReadOnly(true)

// 设置条件禁用

viewmodel.get(cItemName).setDisabled(true)

## 问题5：如何支持分组展示？

答：

1. cStyle配置groupSelect为true

2.通过listModel.setDataSource给枚举重新设值 ，枚举数据结构为（其中groupLabel、groupValue 是必须的）

3.详细示例见下方代码：

```
let arrData = [{
  value: "0",
  text: "开立",
  nameType: "text",
  groupLabel: "分组1",
  groupValue: "group1"
}, {
  value: "3",
  text: "审核中",
  nameType: "text",
  groupLabel: "分组2",
  groupValue: "group2"
}]
listModel.setState('dataSourceMode','local');
listModel.setDataSource(arrData);
```

页内目录

1\. 概述

1.1 适用场景

1.2 业务场景

1.3 关键词

2\. 如何获取ListModel（枚举）模型

2.1 2.1、适用于获取查询区中的枚举模型

2.2 2.2、适用于获取表格中的枚举模型

2.3 2.3、适用于获取单卡页的枚举模型

3\. ListModel（枚举）模型预制方法

3.1 3.1、setData(data)

3.2 3.2、getData

3.3 3.3、clear(useDefault)

3.5 3.5、getNodesByKeys(keys)

3.6 3.6、select(selectedKeys)

3.7 3.7、getSelectedNodes

3.8 3.8、getSelectedKeys

4\. ListModel（枚举）模型预制事件

4.1 4.1、beforeValueChange

4.2 4.2、afterValueChange

4.3 4.3、beforeSetDataSource

4.4 4.4、afterSetDataSource

4.5 4.5、beforeSelect

4.6 4.6、afterSelect

4.7 问题1：如何设置提示信息

4.8 问题2：如何动态控制枚举项的显示隐藏

4.9 问题3：如何控制是否多选？

4.10 问题4：如何设置条件只读/禁用/隐藏？

4.11 问题5：如何支持分组展示？

文档反馈

返回顶部