---
url: https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/SJMX-ReferModel1?nodeId=21cec819-f7b4-418a-99de-9aa3e9621072&productline=CommunityDoc&type=enableDoc&localeHelp=zh_CN
title: "YonBIP社区文档中心"
language: "zh-CN"
captured_at: "2026-05-29T16:56:20.472Z"
---

# YonBIP社区文档中心

![logo](https://design.yonyoucloud.com/static/ucf/iuap-hc-client-fe/latest/client/assets/images/biplogo.fa4fb30c.svg)

社区文档中心

![avator](https://design.yonyoucloud.com/static/ucf/iuap-hc-client-fe/latest/client/assets/images/avatar.d348c3b4.svg) 未登录

## 参照模型 ReferModel

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

本文主要讲解ReferModel（参照）模型系统预制的方法及事件，通过该文档您将学习到在YonBuilder（可视化应用构建）中ReferModel（参照）模型如何使用。

MDF官方文档-数据模型： [参照模型 ReferModel](https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/02-refer-model "参照模型 ReferModel")

## 关键词

RederModel模型、参照模型、ReferModel方法、ReferModel事件、参照

## 如何获取ReferModel（参照）模型

获取ReferModel（参照）模型的方法有三种，需要根据页面中参照所在的位置来判断使用哪一种方式获取ReferModel（参照）模型。

## 2.1、适用于获取查询区中的参照模型

```
viewModel.on('afterMount', function (data) {
    //1、获取查询区模型
    let filterViewModelInfo = viewModel.getCache('FilterViewModel');
    //2、查询区afterInit事件，必须放在页面模型的afterMount事件中才生效
filterViewModelInfo.on('afterInit', function(data){
    //3、获取参照预模型，cItemName：参照字段的字段别名
        let referModelInfo = filterViewModelInfo.get('cItemName');
        //4、获取参照真实没模型
        let referModelNewInfo = referModelInfo.getFromModel();
    })
});
```

## 2.2、适用于获取表格中的参照模型

```
//1、获取表格模型
    let gridModelInfo = viewModel.getGridModel();
//2、获取表格行编辑模型
let editRowModelInfo = viewModel.getEditRowModel();
//3、获取参照预模型，cItemName：参照字段的字段别名
    let referModelInfo = editRowModelInfo.get('cItemName');
```

## 2.3、适用于获取单卡页的参照模型

//获取参照预模型，cItemName：参照字段的字段别名

let referModelInfo = viewModel.get('cItemName');

## ReferModel（参照）模型预制方法

## 3.1、clear()

**方法：clear** ()

**使用说明：Refer** Model的 **clear** ()方法，用于清除数据。

**参数：** 无

**示例代码：**

referModel.clear();

## 3.2、setFilter(filter)

**方法：** setFilter(filter)

**使用说明：Refer** Model的setFilter(filter)方法，用于设置参照过滤条件filter。

**示例代码：**

```
var myFilter = {"isExtend": true,simpleVOs:[]};
myFilter.simpleVOs.push({
field: 'name', //过滤字段
op: 'eq',       //比较符
value1: 'XXX'  //属性值
});
referModel.setFilter(myFilter);
```

## 3.3、getFilter()

**方法：** getFilter()

**使用说明：Refer** Model的getFilter()方法，用于获取参照过滤条件。

**参数：** 无

**示例代码：**

referModel.getFilter();

## 3.4、setReturnFields(fields)

**方法：** setReturnFields(fields)

**使用说明：Refer** Model的setReturnFields(fields)方法，用于设置参照返回的携带字段，即选中参照数据点确认后，赋值给参照id的字段。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| fields | 参照选中字段赋值给参照ID的对象 | Object |  |

**示例代码：**

//例如员工参照默认returnFields:{staffNew:'id'},即将员工id带入员工参照id字段

//如下修改后就将员工name带入了参照id字段viewModel.get('staffNew\_name').setReturnFields({staffNew:'name'})

## 3.5、setValue(value)

**方法：** setValue(value)

**使用说明：Refer** Model的setValue(value)方法，用于设置参照选中信息。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| value | \[{staff:\*\*\*,staffNew\_name:\*\*\*\*}\] | Array |  |

**示例代码：**

//入参：value：为想要设置的值value为\[{'staffNew:\*\*,'staffNew\_name:\*\*}\]等

viewModel.get('staffNew\_name').setValue(value);

## 3.6、getValue()

**方法：** getValue()

**使用说明：Refer** Model的getValue()方法，用于获取参照选中信息。

**参数：无**

**示例代码：**

viewModel.get('staffNew\_name').getValue();

## 3.7、getSelectedNodes()

**方法：** getSelectedNodes()

**使用说明：Refer** Model的getSelectedNodes()方法，用于获取参照选中的整行数据。

**参数：无**

**示例代码：**

//在员工参照选择数据并确定后，可以获取选中的整条数据信息viewModel.get('staffNew\_name').getSelectedNodes()

## 3.8、setRefCode(code,cRefRetId,domainKey)

**方法：** setRefCode(code,cRefRetId,domainKey)

**使用说明：Refer** Model的setRefCode(code,cRefRetId,domainKey)方法，用于设置新参照以及参照带入字段。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** | |---|---|---|---|---| |code|参照编码|String||| |cRefRetId|参照带入字段对象集合|Object||| |domainKey|参照所属领域的引擎编码||||

**示例代码：**

viewModel.get('staffNew\_name').setRefCode(code,cRefRetId,domainKey);

## ReferModel（参照）模型预制事件

## 4.1、beforeValueChange

****事件** ：** beforeValueChange

**使用说明：Refer** Model的beforeValueChange事件，是参照确定返回数据改变前事件, 返回true则继续进行value的改变，返回false则终止value 的改变。

**示例代码：**

//例：示例中data格式为{ value: value, oldValue: oldValue }

viewModel.get('staffNew\_name').on('beforeValueChange',function (data) {

return true;

});

## 4.2、afterValueChange

**事件：** afterValueChange

**使用说明：Refer** Model的afterValueChange事件，是参照确定返回数据改变后事件，允许对改变后的数据进行操作。

**示例代码：**

//例：示例中data格式为{ value: value, oldValue: oldValue }

viewModel.get('staffNew\_name').on('afterValueChange',function (data) {});

## 4.3、beforeBrowse

**事件：** beforeBrowse

**使用说明：Refer** Model的beforeBrowse事件，是表点击按钮弹出参照前事件，返回true则继续进行弹出参照操作，返回false 则终止弹出。

**示例代码：**

viewModel.get('staffNew\_name').on('beforeBrowse',function (data) {

return true;

});

## 4.4、afterBrowse

**事件：** afterBrowse

使用说明：ReferModel的afterBrowse事件，是点击按钮弹出参照后事件。

**示例代码：**

viewModel.get('staffNew\_name').on('afterBrowse',function (rows) {});

## 4.5、afterInitVm

**事件：** afterInitVm

使用说明：ReferModel的afterInitVm事件，是参照弹窗初始化后事件。

**示例代码：**

```
//例：示例中rows为已删除的行数据viewModel.get('staffNew_name').on('afterInitVm',function (args) {
    //获取参照弹窗的模型
let referViewModel = args.vm;
//获取参照弹窗内的表格模型
referViewModel.get('table');
//获取参照弹窗内的树模型
referViewModel.get('tree');
});
```

## 4.6、afterReferOkClick

**事件：** afterReferOkClick

使用说明：ReferModel的afterReferOkClick事件，是参照弹窗选择完数据点击确定后事件。

**示例代码：**

viewModel.get('staffNew\_name').on('afterReferOkClick',function (rows) {});

## 问题1：表格里面的参照如何实现过滤

答：

1. 通过 viewModel.getGridModel() 或viewModel.get(“childrenField”) 获取表格模型；
2. 通过表格模型再获取表格编辑行模型即getEditRowModel()方法；
3. 然后再通过get(“字段别名”)获取表格中参照类型字段的指定列；
4. 监听这个列的’beforeBrowse’事件；在事件中即可设置复杂的过滤条件；
5. 详细示例见下方代码：
```
var girdModel = viewModel.getGridModel();  girdModel.getEditRowModel().get('ref1022_id').on('beforeBrowse', function (data) {
var condition = {
"isExtend": true,
simpleVOs: []
};
condition.simpleVOs.push({
field: 'new1',
op: 'eq',
value1: 11
});
this.setFilter(condition);
});
```

## 问题2：如何通过按钮弹出已有参照

答：

1. 通过 viewModel.get("参照CItemName") 获取参照模型；
2. 在按钮点击事件里面通过参照的browse()方法打开参照；
3. 详细示例见下方代码：
```
// 获取参照实例
const referModel = viewModel.get("参照CItemName")
referModel.setVisible(false);

// 按钮事件中弹出参照
viewmodel.get('按钮').on('click', function(data){
  referModel.browse(true); // 参照弹出
})

// 参照值改变后事件
referModel.on('afterValueChange',function(data){
  console.log(data.value); // 参照选择后的值
})
```

## 问题3：如何根据数据ID给参照赋默认值？

答：

1. 通过 viewModel.get("参照CItemName") 获取参照模型；
2. 通过cb.utils.triggerReferBrowse()方法赋值；
3. 详细示例见下方代码：

// item为参照referModel

cb.utils.triggerReferBrowse(item, \[{ field:'id', op:'eq', value1:defaultValue }\]);

## 问题4：参照如何动态切换单选多选状态？

答：

1. 详细示例见下方代码:

// true 为多选 false 为单选

viewModel.get('sumSwitch').setMultiple(false/true);

## 问题5：如何隐藏参照弹窗的新增按钮和参照内表格的按钮？

答：

1. 详细示例见下方代码：
```
//1、获取参照模型的真实模型
  let referModel = viewModel.get('cpname_name');
  referModel.on('afterInitVm', function (args) {
    //2、获取参照弹窗的模型
    let referViewModel = args.vm;
referViewModel.on('afterInit', () => {
  //3、隐藏新增按钮
      referViewModel.get('btnAdd').setVisible(false);
      //4、获取参照弹窗内的表格模型
      let gridModel = referViewModel.get('table');
      //5、afterSetDataSource界面加载完成后，对数据进行修改
      gridModel.on('afterSetDataSource', () => {
        //获取列表所有数据
        const rows = gridModel.getRows();
        const actionsStates = [];
        rows.forEach((data) => {
          const actionState = {};
          //设置按钮可用不可用
          actionsStates.push({
            cItemName:'btnEdit',
            visible: false
          });
        });
        setTimeout(function () {
          gridModel.setActionsState(actionsStates);
        });
      });
    });
  });
```

页内目录

1\. 概述

1.1 适用场景

1.2 业务场景

1.3 关键词

2\. 如何获取ReferModel（参照）模型

2.1 2.1、适用于获取查询区中的参照模型

2.2 2.2、适用于获取表格中的参照模型

2.3 2.3、适用于获取单卡页的参照模型

3\. ReferModel（参照）模型预制方法

3.1 3.1、clear

3.2 3.2、setFilter(filter)

3.3 3.3、getFilter

3.4 3.4、setReturnFields(fields)

3.5 3.5、setValue(value)

3.6 3.6、getValue

3.7 3.7、getSelectedNodes

3.8 3.8、setRefCode(code,cRefRetId,domainKey)

4\. ReferModel（参照）模型预制事件

4.1 4.1、beforeValueChange

4.2 4.2、afterValueChange

4.3 4.3、beforeBrowse

4.4 4.4、afterBrowse

4.5 4.5、afterInitVm

4.6 4.6、afterReferOkClick

4.7 问题1：表格里面的参照如何实现过滤

4.8 问题2：如何通过按钮弹出已有参照

4.9 问题3：如何根据数据ID给参照赋默认值？

4.10 问题4：参照如何动态切换单选多选状态？

4.11 问题5：如何隐藏参照弹窗的新增按钮和参照内表格的按钮？

文档反馈

返回顶部