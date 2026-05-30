---
url: https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/SJMX-GridModel1?nodeId=52c689c2-9266-4c66-a459-634bfa4349b1&productline=CommunityDoc&type=enableDoc&localeHelp=zh_CN
title: "YonBIP社区文档中心"
language: "zh-CN"
captured_at: "2026-05-29T16:55:02.536Z"
---

# YonBIP社区文档中心

![logo](https://design.yonyoucloud.com/static/ucf/iuap-hc-client-fe/latest/client/assets/images/biplogo.fa4fb30c.svg)

社区文档中心

![avator](https://design.yonyoucloud.com/static/ucf/iuap-hc-client-fe/latest/client/assets/images/avatar.d348c3b4.svg) 未登录

## 表格模型 GridModel

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

本文主要讲解GridModel（表格）模型系统预制的方法及事件，通过该文档您将学习到在YonBuilder（可视化应用构建）中GridModel（表格）模型如何使用。

MDF官方文档-数据模型：\[表格模型 GridModel\](https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html" \\l "/api/02-grid-model)

## 关键词

GridModel模型、表格模型、GridModel方法、GridModel事件、gridModel

## 如何获取GridModel（表格）模型

获取GridModel（表格）模型的方法有三种，需要根据页面中表格数量来判断使用哪一种方式获取GridModel（表格）模型。

## 2.1、适用于页面中只有一个表格

viewModel.getGridModel();

## 2.2、适用于页面中存在多个表格获取指定表格

viewModel.get("childrenField");

childrenField：页面设计器-》实体清单-》子表集合属性

![4ed7eace-e148-44b1-9468-cc356e9b552c.png](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/ff53fead-6bc1-4b70-aef5-f79bd392f9c3.png)

## 2.3、适用于页面中存在多个表格获取指定表格

viewModel.get("cCode");

cCode：页面设计器-》选中指定表格-》UI元数据

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/63f40a7b-91c1-4b9e-96a7-39e169be1b0e.png)

## GridModel（表格）模型预制方法

## 3.1、validate()

**方法：** validate()

**使用说明：** GridModel的validate()方法，用于校验函数合法性、必输项。

**参数：** 无

**返回值：** true or false

**示例代码：**

viewModel.getGridModel().validate()

## 3.2、getDirtyData()

**方法：** getDirtyData()

**使用说明：** GridModel的getDirtyData()方法，用于新增或更新时获取表格有调整的行数据。

**参数：** 无

**示例代码：**

viewModel.getGridModel().validate()

## 3.3、getData()

**方法：** getData()

**使用说明：** GridModel的getData()方法，用于获取表格所有数据。

**参数：** 无

**示例代码：**

viewModel.getGridModel().getData()

## 3.4、getColumns(fields)

**方法：** getColumns(fields)

**使用说明：** GridModel的getColumns(字符数组)方法，用于批量获取表格列信息。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| fields | cItemName字段别名 | Array |  |

**示例代码：**

viewModel.getGridModel().getColumns(\["new1","new2"\]) //获取指定列的属性

## 3.5、getColumns(field)

**方法：** getColumns(field)

**使用说明：** GridModel的getColumns(字符串)方法，用于获取表格单列信息。

**参数：** 无

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| field | cItemName字段别名 | String |  |

**示例代码：**

viewModel.getGridModel().getColumns(\["new1","new2"\]) //获取指定列的属性

## 3.6、hasColumn(field)

**方法：** hasColumn(field)

**使用说明：** gridModel的hasColumn(field)方法，用于判断表格是否包含该列。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| field | cItemName字段别名 | String |  |

**返回值：** true or false

**示例代码：**

viewModel.getGridModel().hasColumn("new1")

## 3.7、setDirty(boolean)

**方法：** setDirty(boolean)

**使用说明：** GridModel的setDirty(boolean)方法，用于设置脏数据取值范围，默认为false，收集数据时只收集脏数据。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| boolean | 是否只返回脏数据 | Boolean | 默认false,只返回修改的数据，设置为true返回所有数据 |

**示例代码：**

viewModel.getGridModel().setDirty(true) //设置true情况下 viewModel.getGridModel().getDirtyData() //等同于viewModel.getGridModel().Data()

## 3.8、setReadOnly(value)

**方法：** setReadOnly(value)

**使用说明：** GridModel的setReadOnly(boolean)方法，用于设置表格属性为是否可编辑状态。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| value | 是否只读 | Boolean | 设置为true则不可编辑，false可编辑 |

**示例代码：**

viewModel.getGridModel().setReadOnly(true) //表格行不可编辑 viewModel.getGridModel().setReadOnly(false) //表格行可编辑

## 3.9、getCellValue(rowIndex,cellName)

**方法：** setReadOnly(value)

**使用说明：** GridModel的getCellValue(rowIndex,cellName)方法，用于获取表格指定单元格的值。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| rowIndex | 行号 | int | 从0开始计数 |
| cellName | cItemName字段别名 | String |  |

**示例代码：**

viewModel.getGridModel().getCellValue(0,"new1")

## 3.10、setCellValue(rowIndex, cellName, value, check, blur)

**方法：** setCellValue(rowIndex, cellName, value, check, blur)

**使用说明：** GridModel的setCellValue(rowIndex, cellName, value, check, blur)方法，用于设置单元格value值，不要在循环体中使用，循环的场景使用updateRows()。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| rowIndex | 行号 | int | 从0开始计数 |
| cellName | cItemName字段别名 | String |  |
| value | 单元格的值 | Object |  |
| check | 内部调用参数不需传 |  |  |
| blur | 内部调用参数不需传 |  |  |

**示例代码：**

viewModel.getGridModel().setCellValue(0, "new1", "234")

## 3.11、getRowState(rowIndex,name)

**方法：** getRowState(rowIndex,name)

**使用说明：** GridModel的getRowState(rowIndex,name)方法，用于获取行状态。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| rowIndex | 行号 | int | 从0开始计数 |
| name | 状态名 | String | 常用’disabled’，’readOnly’ |

**示例代码：**

viewModel.getGridModel().getRowState(0,'disabled')//获取行1的disabled状态(禁用)

## 3.12、setRowState(rowIndex, name, value)

**方法：** setRowState(rowIndex, name, value)

**使用说明：** GridModel的setRowState(rowIndex, name, value)方法，用于设置当前行的状态，例如禁用、只读、样式。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| rowIndex | 行号 | int | 从0开始计数 |
| name | 状态名 | String | 常用’disabled’，’readOnly’ |
| value | 状态值 | Object |  |

**示例代码：**

viewModel.getGridModel().setRowState(0,'disabled',true); //设置第一行为禁用状态

## 3.13、getColumnState(cellName, name)

**方法：** getColumnState(cellName, name)

**使用说明：** GridModel的getColumnState(cellName, name)方法，用于获取列状态。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| cellName | cItemName字段别名 | String |  |
| name | 状态名 | String | 查看下列示例获取属性清单 |

**示例代码：**

viewModel.getGridModel().getColumns("new1"); //获取指定列的所有属性

viewModel.getGridModel().getColumnState('new1','bCanModify') //获取指定列的指定属性的值

## 3.14、setColumnState(cellName, name, value)

**方法：** setColumnState(cellName, name, value)

**使用说明：** GridModel的setColumnState(cellName, name, value)方法，用于设置列状态。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| cellName | cItemName字段别名 | String |  |
| name | 状态名 | String | 查看下列示例获取属性清单 |
| value | 属性值 | Object |  |

**示例代码：**

viewModel.getGridModel().getColumns("new1"); //获取指定列的所有属性

viewModel.getGridModel().setColumnState('new1','bCanModify',false) //设置new1列设置为不允许编辑

## 3.15、setColumnValue(cellName, value, check)

**方法：** setColumnValue(cellName, value, check)

**使用说明：** GridModel的setColumnValue(cellName, value, check)方法，用于设置整列数据的值。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| cellName | cItemName字段别名 | String |  |
| value | 默认值 | Object | 某列的值 |
| check | 不需要传 |  |  |

**示例代码：**

viewModel.getGridModel().setColumnValue('new1', '234'); //设置new1列的值为234

## 3.16、setCellState(rowIndex, cellName, name, value)

**方法：** setCellState(rowIndex, cellName, name, value)

**使用说明：** GridModel的setCellState(rowIndex, cellName, name, value)方法，用于设置单元格状态。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| rowIndex | 行号 | int | 从0开始计数 |
| cellName | cItemName字段别名 | String |  |
| name | 字段属性 | String |  |
| value | 字段属性值 | Object |  |

**示例代码：**

//设置第1行new1的单元格只读viewModel.getGridModel().setCellState(0,'new1','readOnly',true)

## 3.17、getCellState(rowIndex, cellName, name)

**方法：** getCellState(rowIndex, cellName, name)

**使用说明：** GridModel的getCellState(rowIndex, cellName, name)方法，用于获取指定单元格状态。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| rowIndex | 行号 | int | 从0开始计数 |
| cellName | cItemName字段别名 | String |  |
| name | 字段属性 | String |  |

**示例代码：**

viewModel.getGridModel().setCellState(0,'new1','readOnly',true)

//获取第一行的new1单元个的只读属性的值

viewModel.getGridModel().getCellState(0,'new1','readOnly')

## 3.18、clear()

**方法：** clear()

**使用说明：** GridModel的clear()方法，用于清除全部数据。

**参数：** 无

**示例代码：**

viewModel.getGridModel().clear()

## 3.19、setDataSource(proxyConfig, queryParams, callback)

**方法：** setDataSource(proxyConfig, queryParams, callback)

**使用说明：** GridModel的setDataSource(proxyConfig, queryParams, callback)方法，用于设置表格数据源。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| proxyConfig |  |  | 如果GridModel中dataSourceMode为local则proxyConfig参数传递为真实数据。否则proxyConfig参数传递服务请求地址 |
| queryParams | 传递请求参数 | Object |  |
| callback | 传递回调函数 |  |  |

**示例代码：**

//设置dataSourceMode为local

viewModel.getGridModel().setState('dataSourceMode','local');

viewModel.getGridModel().setDataSource(GridData) //重置表格数据, 参数为\[{'new1':'11'},{'new1':'12'}\],数组对象格式

//dataSourceMode不为local

viewModel.getGridModel().setDataSource(‘bill/list.do’,{‘id’:1},function(result){})

## 3.20、load (proxyConfig, params, callback)

**方法：** load (proxyConfig, params, callback)

**使用说明：** GridModel的load (proxyConfig, params, callback)方法，用于发起请求加载表格数据。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| proxyConfig | 传递服务请求地址 | String |  |
| queryParams | 传递请求参数 | Object |  |
| callback | 传递回调函数 |  |  |

**示例代码：**

viewModel.getGridModel().load(‘bill/list.do’,{‘id’:1},function(result){})

## 3.21、setPageSize(pageSize)

**方法：** setPageSize(pageSize)

**使用说明：** GridModel的setPageSize(pageSize)方法，用于设置表格分页的页大小。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| pageSize | 每页大小 | int |  |

**示例代码：**

viewModel.getGridModel().setPageSize(10) //列表页面设置每页显示10条数据

## 3.22、setPageIndex(pageIndex)

**方法：** setPageIndex(pageIndex)

**使用说明：** GridModel的setPageIndex(pageIndex)方法，用于设置表格分页中的页码。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| pageSize | 每页大小 | int |  |

**示例代码：**

viewModel.getGridModel().setPageIndex(2) //列表页面设置显示第二页数据

## 3.23、getPageSize()

**方法：** getPageSize()

**使用说明：** GridModel的getPageSize()方法，用于获取当前表格分页的页大小。

**参数：** 无

**示例代码：**

viewModel.getGridModel().getPageSize() //列表页面获取每页显示条数

## 3.24、getPageIndex()

**方法：** getPageIndex()

**使用说明：** GridModel的getPageIndex()方法，用于获取表格分页中的当前页码。

**参数：** 无

**示例代码：**

viewModel.getGridModel().getPageIndex() //列表页面获取当前显示的是第几页

## 3.25、select(rowIndexes)

**方法：** select(rowIndexes)

**使用说明：** GridModel的select(rowIndexes)方法，用于设置表格选中行。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| rowIndexes | 行号集合 | int\[\] |  |

**示例代码：**

viewModel.getGridModel().select(\[0,1,2\]) //设置grid选中行号为0,1,2的数据，即1,2,3行数据

## 3.26、unselect(rowIndexes)

**方法：** unselect(rowIndexes)

**使用说明：** GridModel的unselect(rowIndexes)方法，用于设置取消表格选中的行。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| rowIndexes | 行号 | Int\[\] |  |

**示例代码：**

viewModel.getGridModel().unselect(\[0,1,2\]) //设置grid取消选中行号为0,1,2的数据，即1,2,3行数据

## 3.27、selectAll()

**方法：** selectAll()

**使用说明：** GridModel的selectAll()方法，用于选中所有行。

**参数：** 无

**示例代码：**

viewModel.getGridModel().selectAll() //选中当前页所有数据

## 3.28、unselectAll()

**方法：** unselectAll()

**使用说明：** GridModel的unselectAll()方法，用于取消选中所有行。

**参数：无**

**示例代码：**

viewModel.getGridModel().unselectAll() //取消当前页所有选中状态

## 3.29、getSelectedRows()

**方法：** getSelectedRows()

**使用说明：** GridModel的getSelectedRows()方法，用于获取表格中已选中行的数据。

**参数：** 无

**示例代码：**

viewModel.getGridModel().getSelectedRows() //获取当前页已选中行的数据

## 3.30、getSelectedRowIndexes()

**方法：** getSelectedRowIndexes()

**使用说明：** GridModel的getSelectedRowIndexes()方法，用于获取表格中已选中行的行号。

**参数：** 无

**示例代码：**

viewModel.getGridModel().getSelectedRowIndexes() //获取当前页已选中行的行号

## 3.31、getRows()

**方法：** getRows()

**使用说明：** GridModel的getRows()方法，用于获取表格中的所有行数据。

**参数：无**

**示例代码：**

viewModel.getGridModel().getRows() //获取当前页表格的所有数据

## 3.32、updateRow(rowIndex, rowData)

**方法：** updateRow(rowIndex, rowData)

**使用说明：** GridModel的updateRow(rowIndex, rowData)方法，用于更新行数据。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| rowIndex | 行号 | int |  |
| rowData | 要更新的数据 | Object |  |

**示例代码：**

//更新第二行new1单元格的值为23，new2的单元格的值为1viewModel.getGridModel().updateRow(1, {'new1':'23','new2':'1'})

## 3.33、insertRow(rowIndex, rowData)

**方法：** insertRow(rowIndex, rowData)

**使用说明：** GridModel的insertRow(rowIndex, rowData)方法，用于表格插行功能。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| rowIndex | 行号 | int | 从0开始计数 |
| rowData | 要插入的数据 | Object |  |

**示例代码：**

//在第一行下插入行，行数据为rowData

viewModel.getGridModel().insertRow(1, {'new1':'23','new2':'1'})

## 3.34、insertRows(rowIndex, rowDatas)

**方法：** insertRows(rowIndex, rowDatas)

**使用说明：** GridModel的insertRows(rowIndex, rowDatas)方法，用于表格批量插行功能。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| rowIndex | 行号 | int | 从0开始计数 |
| rowDatas | 要插入的数据 | Array |  |

**示例代码：**

//在第三行下插入rowDatas.length行，数据为rowDatas

viewModel.getGridModel().insertRows(3,\[{'new1':'23','new2':'1'},{'new1':'24','new2':'2'}\])

## 3.35、appendRow(rowData)

**方法：** appendRow(rowData)

**使用说明：** GridModel的appendRow(rowData)方法，用于表格增行功能。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| rowData | 增行数据 | Object |  |

**示例代码：**

//在当前页表格行最后增行viewModel.getGridModel().appendRow({'new1':'23','new2':'1'})

## 3.36、deleteRows(rowIndexes)

**方法：** deleteRows(rowIndexes)

**使用说明：** GridModel的deleteRows(rowIndexes)方法，用于表格删行功能。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| rowIndexes | 行号集合 | int\[\] |  |

**示例代码：**

//删除grid中第行号为1,2的行

viewModel.getGridModel().deleteRows(\[1,2\])

## 3.37、getRowsByIndexes(rowIndexes)

**方法：** getRowsByIndexes(rowIndexes)

**使用说明：** GridModel的getRowsByIndexes(rowIndexes)方法，用于根据行号获取表格中数据。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| rowIndexes | 行号集合 | int\[\] |  |

**示例代码：**

viewModel.getGridModel().getRowsByIndexes(\[1,2\]) //行号从0开始，所以1,2是获取第二行第三行数据

## 3.38、getRow(rowIndex)

**方法：** getRow(rowIndex)

**使用说明：** GridModel的getRow(rowIndex)方法，用于根据行号获取行数据。

**参数：**

| **参数** | **属性含义** | **值类型** | **说明** |
| --- | --- | --- | --- |
| rowIndex | 行号 | int |  |

**示例代码：**

viewModel.getGridModel().getRow(1) //获取第二行数据

## GridModel（表格）模型预制事件

## 4.1、beforeCellValueChange

****事件** ：** beforeCellValueChange

**使用说明：** GridModel的beforeCellValueChange事件，是表格单元格数据改变前监听事件, 返回true继续单元格数据改变，返回false终止单元格数据改变。

**示例代码：**

//示例中data格式为{ rowIndex:‘行号’, cellName: ‘列名’, value: ‘新值’, oldValue: ‘旧值’}

viewModel.getGridModel().on('beforeCellValueChange', **function** (data) {

**return** **true**;

});

## 4.2、afterCellValueChange

**事件：** afterCellValueChange

**使用说明：** GridModel的afterCellValueChange事件，是表格单元格数据改变后的监听事件。

**示例代码：**

//示例中data格式为{ rowIndex:‘行号’, cellName: ‘列名’, value: ‘新值’, oldValue: ‘旧值’}

viewModel.getGridModel().on('afterCellValueChange', **function** (data) {});

## 4.3、beforeSetDataSource

**事件：** beforeSetDataSource

**使用说明：** GridModel的beforeSetDataSource事件，是设置表格数据前的监听事件,返回true为允许设置grid数据，返回false为终止设置数据。

**示例代码：**

//设置表格数据前事件 data为grid数据格式viewModel.getGridModel().on("beforeSetDataSource", function (data) {

//返回true为允许设置grid数据，返回false为终止设置数据

return true;

});

## 4.4、afterSetDataSource

**事件：** afterSetDataSource

**使用说明：** GridModel的afterSetDataSource事件，是设置表格数据后的监听事件。

**示例代码：**

//设置表格数据后事件 data为grid数据格式viewModel.getGridModel().on("afterSetDataSource", function (data) {

/\* to do someing... \*/

});

## 4.5、beforeSelect

**事件：** beforeSelect

**使用说明：** GridModel的beforeSelect事件，是选中表格行前的监听事件,返回true为允许选中，返回false为终止选中。

**示例代码：**

viewModel.getGridModel().on("beforeSelect", function (rowIndexs) {

//返回true为允许选中，返回false为终止选中

return true;

});

## 4.6、afterSelect

**事件：** afterSelect

**使用说明：** GridModel的afterSelect事件，是选中表格行后的监听事件。

**示例代码：**

//选中select后事件 rowIndexs为行号，单行(整形)or多行(数组)

viewModel.getGridModel().on("afterSelect", function (rowIndexs) {

/\* to do someing... \*/

});

## 4.7、beforeUnSelect

**事件：** beforeUnSelect

**使用说明：** GridModel的beforeUnSelect事件，是取消选中表格行前的监听事件,返回true为允许取消选中，返回false为终止取消选中。

**示例代码：**

//取消选中select前事件 rowIndexs为行号，单行(整形)or多行(数组) viewModel.getGridModel().on("beforeUnselect", function (rowIndexs) {

//返回true为允许取消选中，返回false为终止取消选中

return true;

});

## 4.8、afterUnSelect

**事件：** afterUnSelect

**使用说明：** GridModel的afterUnSelect事件，是选中表格行后的监听事件。

**示例代码：**

//取消选中select后事件 rowIndexs为行号，单行(整形)or多行(数组) viewModel.getGridModel().on("afterUnselect", function (rowIndexs) {

/\* to do someing... \*/

});

## 4.9、beforeSelectAll

**事件：** beforeSelectAll

**使用说明：** GridModel的beforeSelectAll事件，是表格行全选前的监听事件,返回true为允许全选，返回false为终止全选。

**示例代码：**

viewModel.getGridModel().on("beforeSelectAll", function () {

//返回true为允许全选，返回false为终止全选

return true;

});

## 4.10、afterSelectAll

**事件：** afterSelectAll

**使用说明：** GridModel的afterSelectAll事件，是表格行全选后的监听事件。

**示例代码：**

//表格全选后事件 data为选中行的数据 viewModel.getGridModel().on("afterSelectAll", function (data) {

/\* to do someing... \*/

});

## 4.11、beforeUnSelectAll

**事件：** beforeUnSelectAll

**使用说明：** GridModel的beforeUnSelectAll事件，是表格行全取消选中前的监听事件,返回true为允许全消，返回false为终止全消。

**示例代码：**

//表格全选取消前的事件

viewModel.getGridModel().on("beforeUnselectAll", function (event) {

//返回true为允许取消全消，返回false为终止取消全消

return true;

});

## 4.12、afterUnSelectAll

**事件：** afterUnSelectAll

**使用说明：** GridModel的afterUnSelectAll事件，是表格行全取消选中后的监听事件。

**示例代码：**

//表格全选取消后的事件

viewModel.getGridModel().on("afterUnselectAll", function () {

/\* to do someing... \*/

});

## 4.13、beforeInsertRow

**事件：** beforeInsertRow

**使用说明：** GridModel的beforeInsertRow事件，是表格插行前的监听事件，返回true为允许增/插行，返回false为终止操作。

**示例代码：**

//例：示例中data格式为{ index: ‘增/插行行号’, row: ‘行数据’}

viewModel.getGridModel().on('beforeInsertRow',function (data) {

return false;

});

## 4.14、afterInsertRow

**事件：** afterInsertRow

**使用说明：** GridModel的afterInsertRow事件，是表格插行后的监听事件。

**示例代码：**

//例：示例中data格式为{ index: ‘增/插行行号’, row: ‘行数据’}

viewModel.getGridModel().on('afterInsertRow',function (data) {});

## 4.15、beforeDeleteRows

**事件：** beforeDeleteRows

**使用说明：** GridModel的beforeDeleteRows事件，是表格删行前的监听事件，返回true为允许删行，返回false为终止操作。

**示例代码：**

//例：示例中rows为要删除的行数据viewModel.getGridModel().on('beforeDeleteRows',function (rows) {

return false;

});

## 4.16、afterDeleteRows

**事件：** afterDeleteRows

**使用说明：** GridModel的afterDeleteRows事件，是表格删行后的监听事件。

**示例代码：**

//例：示例中rows为已删除的行数据viewModel.getGridModel().on('afterDeleteRows',function (rows) {});

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

## 问题2：列表页面表格行按钮如何控制显示隐藏

答：

1. 通过 viewModel.getGridModel() 或viewModel.get(“childrenField”) 获取表格模型；
2. 通过’afterSetDataSource’事件监听表格模型的数据加载后事件；
3. gridModel.getCache(‘actions’)从缓存区获取按钮信息；
4. 定义一个空数组用于存储按钮信息，循环缓存区获取的按钮信息，根据业务需求设置按钮的显示属性：visible: true或false并添加至定义好的数组中；
5. 通过setActionsState(按钮数组)；刷新按钮显示状态；
6. 详细示例见下方代码：
```
let gridModel = viewModel.getGridModel(); //获取表格模型
//afterSetDataSource界面加载完成后，对数据进行修改gridModel.on('afterSetDataSource', () => {
//获取列表所有数据
const rows = gridModel.getRows();
//从缓存区获取按钮
const actions = gridModel.getCache('actions');
if (!actions) return;
const actionsStates = [];
rows.forEach((data) => {
const actionState = {};
actions.forEach((action) => {
//设置按钮可用不可用
actionState[action.cItemName] = { visible: true };
if (action.cItemName == 'btnDelete') {
if (data.new1 == 'A') {
actionState[action.cItemName] = { visible: false };
}
}
});
actionsStates.push(actionState);
});
gridModel.setActionsState(actionsStates);
});
```

## 问题3：如何设置子表某一列不能修改？

答：

1. 通过 viewModel.getGridModel() 或viewModel.get(“childrenField”) 获取表格模型；
2. 通过表格模型再获取表格编辑行模型即getEditRowModel()方法；
3. 然后再通过get(“字段别名”)获取表格中参照类型字段的指定列；
4. 通过setState方法的bCanModify属性设置是否允许修改，true允许修改，fasle不允许修改；
5. 详细示例见下方代码：

viewModel.getGridModel().getEditRowModel().get('new3').setState('bCanModify',false)

## 问题4：如何用脚本控制主子切换？

答：

1. 列表页面实现主子切换后，进入列表页时设置默认显示主表页签还是主表+明细页签，可以通过viewModel.get(‘sumSwitch’)获取主子切换组件，然后通过setValue(false)或setValue(true)设置显示方式。值为true时显示主表页签，值为false时显示主表+明细页面；
2. 详细示例见下方代码:

viewModel.get('sumSwitch').setValue(false/true);

## 问题5：如何修改单元格字体颜色或背景颜色？

答：

1. 通过 viewModel.getGridModel() 或viewModel.get(“childrenField”) 获取表格模型；
2. 通过setCellState(rowIndex, cellName, name, value)方法设置单元格颜色；rowIndex：行号；cellName：字段别名；name：字段属性；value：字段属性值；
3. 详细示例见下方代码：
```
viewModel.getGridModel().setCellState(1,'new2','style',{color:'red'});
//修改单元格字体颜色viewModel.getGridModel().setCellState(0,'new2','style',{background:'red'});  //修改单元格背景颜色
```

页内目录

1\. 概述

1.1 适用场景

1.2 业务场景

1.3 关键词

2\. 如何获取GridModel（表格）模型

2.1 2.1、适用于页面中只有一个表格

2.2 2.2、适用于页面中存在多个表格获取指定表格

2.3 2.3、适用于页面中存在多个表格获取指定表格

3\. GridModel（表格）模型预制方法

3.1 3.1、validate

3.2 3.2、getDirtyData

3.3 3.3、getData

3.4 3.4、getColumns(fields)

3.5 3.5、getColumns(field)

3.6 3.6、hasColumn(field)

3.7 3.7、setDirty(boolean)

3.8 3.8、setReadOnly(value)

3.9 3.9、getCellValue(rowIndex,cellName)

3.11 3.11、getRowState(rowIndex,name)

3.18 3.18、clear

3.21 3.21、setPageSize(pageSize)

3.22 3.22、setPageIndex(pageIndex)

3.23 3.23、getPageSize

3.24 3.24、getPageIndex

3.25 3.25、select(rowIndexes)

3.26 3.26、unselect(rowIndexes)

3.27 3.27、selectAll

3.28 3.28、unselectAll

3.29 3.29、getSelectedRows

3.30 3.30、getSelectedRowIndexes

3.31 3.31、getRows

3.35 3.35、appendRow(rowData)

3.36 3.36、deleteRows(rowIndexes)

3.37 3.37、getRowsByIndexes(rowIndexes)

3.38 3.38、getRow(rowIndex)

4\. GridModel（表格）模型预制事件

4.1 4.1、beforeCellValueChange

4.2 4.2、afterCellValueChange

4.3 4.3、beforeSetDataSource

4.4 4.4、afterSetDataSource

4.5 4.5、beforeSelect

4.6 4.6、afterSelect

4.7 4.7、beforeUnSelect

4.8 4.8、afterUnSelect

4.9 4.9、beforeSelectAll

4.10 4.10、afterSelectAll

4.11 4.11、beforeUnSelectAll

4.12 4.12、afterUnSelectAll

4.13 4.13、beforeInsertRow

4.14 4.14、afterInsertRow

4.15 4.15、beforeDeleteRows

4.16 4.16、afterDeleteRows

4.17 问题1：表格里面的参照如何实现过滤

4.18 问题2：列表页面表格行按钮如何控制显示隐藏

4.19 问题3：如何设置子表某一列不能修改？

4.20 问题4：如何用脚本控制主子切换？

4.21 问题5：如何修改单元格字体颜色或背景颜色？

文档反馈

返回顶部