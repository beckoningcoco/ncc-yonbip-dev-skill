---
title: "表格模型 GridModel"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/02-grid-model"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 表格模型 GridModel

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/02-grid-model | 所属：API

# [](#表格模型-gridmodel)表格模型 GridModel

## [](#1-模型说明)1. 模型说明

描述一个二维对象数组，展现形态不受限于标准的表格

## [](#2-模型配置)2. 模型配置

new cb.models.GridModel(options)

**参数** **属性含义** **值类型** **说明** 默认

||参数||属性含义||值类型||说明||默认|
||columns||||any||模型的值||{}|
||dataSource||||Boolean||true-是||[]|
||rows||||Boolean||||[]|
||readOnly||||String||||local|
||dataSourceMode||||Array||||true|
||columnMode||||string||||local|
||editMode||||Object||||{}|
||cellState|||||||||
||rowState|||||||||
||autoWrap|||||||||
||mergeCells|||||||||
||mergeMode|||||||||
||mergePosition|||||||||
||mergeSourceName|||||||||
||showAggregates|||||||||
||showSubtotal|||||||||
||multiSort|||||||||
||sortFields|||||||||
||showCheckBox|||||||||
||multiple|||||||||
||showRowNo|||||||||
||showColumnSetting|||||||||
||pagination|||||||||
||fullHeight|||||||||
||bLoadPagination|||||||||
||delayLoadPageInfo|||||||||
||showDelayPagination|||||||||
||pageInfo|||||||||
||independent|||||||||
||defaultSelectedRowIndexes|||||||||
||canRowNoChange|||||||||
||innerUsedAttrs|||||||||
||delayCellStates|||||||||
||delayCellValues|||||||||
||delayInsertRows|||||||||
||delayUpdateRows|||||||||
||cachePaginationRowData|||||||||
||selectedKeysSet|||||||||
||selectedRowsMap|||||||||
||hasHandledRow|||||||||
||parentRelation|||||||||
||delayCellStates|||||||||
||...||可在模型上添加任意参数，更详细配置可参考单据上模型的 __data|||||||

## [](#3-方法)3. 方法

### [](#31-validate)3.1. validate()

说明：校验函数 合法性、必输项

### [](#32-getdirtydata)3.2. getDirtyData()

说明：获取脏数据

### [](#33-getdirtyrowindexes)3.3. getDirtyRowIndexes()

说明：获取脏数据的行号集合

### [](#34-getdata)3.4. getData()

说明：获取所有数据(dataSource)，删除的数据也会获取到，会有状态值字段_status。

### [](#35-getalldata)3.5. *getAllData()*

说明：获取页面上显示(筛选排序后)的数据，没有状态值字段。不建议使用，即将废弃。

### [](#36-geteffedata)3.6. getEffeData()

说明：深拷贝，获取dataSource中的数据，不包含删除的数据（排序前，筛选前）；

### [](#37-getrealdata)3.7. getRealData()

说明：浅拷贝；获取dataSource中的数据，不包含删除的数据（排序前，筛选前）；

### [](#38-getrealviewrows)3.8. getRealViewRows()  

说明：浅拷贝；获取界面显示的数据(排序后，筛选后)

### [](#39-getrows)3.9. getRows()

说明：深拷贝；获取所有数据，不包含删除的数据（排序后，筛选前）；

注意：如果传参false则获取的是所有(筛选排序前dataSource不包括删除的数据)的数据，浅拷贝

### [](#310-getrealrows)3.10. getRealRows()

说明：浅拷贝，获取所有数据(rows)，不包含删除的数据（排序后，筛选前）

### [](#311-getrowindex)3.11. getRow(index)

说明：深拷贝；按行索引获取所有数据中的某一行数据（排序后，筛选前）

### [](#312-getcolumnsfields)3.12. getColumns(fields)

说明：批量获取栏目信息

入参：fields为所需获取栏目的fieldname集合

可选参数，如不传，则获取所有栏目的信息

### [](#313-getcolumnsfield)3.13. getColumns(field)

说明：获取单列栏目的信息

入参：field为所需获取栏目的fieldname

### [](#314-hascolumnfield)3.14. hasColumn(field)

说明：判断函数，判断是否包含该栏目

入参：field为所要判断栏目的fieldname

返回值：true or false

### [](#315-setdirtydirty)3.15. setDirty(dirty)

说明：设置脏数据取值范围 默认为false为收集数据时只收集脏数据。

入参：dirty  类型Boolean   

传入true则收集数据时不区别脏数据，为完整数据。    

### [](#316-setreadonlyvalue)3.16. setReadOnly(value)

说明：设置grid属性为是否可编辑状态

入参：value    true or false

### [](#317-setfocusedrowindexindex)3.17. setFocusedRowIndex(index)

说明：设置焦点行

入参：index 需要设置的焦点行行号

### [](#318-getcellvaluerowindexcellname)3.18. getCellValue(rowIndex,cellName)

说明：获取单元格value值

入参：rowIndex  行号

          cellName  列名（fieldname）

### [](#319-setcellvaluerowindex-cellname-value-check-blur)3.19. setCellValue(rowIndex, cellName, value, check, blur)

说明：设置单元格value值，批量设置请使用setCellValues

入参：rowIndex 行号

          cellName 列名（fieldname）

          value 值

          check  boolean型  内部调用参数
可不传(如果是孙表调用setCellValue方法，需要传递check，值为true)

          blur 为true时，单元格数据改变后变为不可编辑状态

gridModel.setCellValue(index, 'techPara', techPara);

### [](#320-setcellvaluesrowindex-cellname-value-check-blur)3.20. setCellValues([{rowIndex, cellName, value, check, blur},...])

说明：批量设置单元格value值

入参类型：数组

入参：rowIndex 行号

          cellName 列名（fieldname）

          value 值

          check  boolean型  内部调用参数
可不传(如果是孙表调用setCellValue方法，需要传递check，值为true)

          blur 为true时，单元格数据改变后变为不可编辑状态

makeUpRowIndex: function(viewmodel, indexs) {

 let gridModel = viewmodel.getGridModel();

 let cellvalues = [];

 Array.isArray(indexs) &&

 indexs.length > 0 &&

 indexs.forEach((index) => {

 let cellvalue = { rowIndex: index, cellName: 'rowindex', value: index + 1 };

 cellvalues.push(cellvalue);

 });

 if (cellvalues) {

 gridModel.setCellValues(cellvalues);

 }

}

### [](#321-getrowstaterowindexname)3.21. getRowState(rowIndex,name)

说明：获取行状态

入参：rowIndex  行号

          name 状态名

//获取行1的disabled状态

model. getRowState(1, 'disabled')

### [](#322-setrowstaterowindex-name-value)3.22. setRowState(rowIndex, name, value)

说明：设置当前行的状态，例如禁用、只读、样式，批量设置请使用setRowStates

入参： rowIndex  行号               

           name : 状态名

           value 状态值

//设置第一行为禁用状态

gridModel.setRowState(1, 'disabled', true);

//设置第一行外层的className为\"public_fixedDataTableRow_red\".

gridModel.setRowState(1, 'className', 'red');

### [](#323-setrowstatesrowindex-propertyname-value)3.23. setRowStates([{rowIndex, propertyName, value},...])

说明：批量设置行的状态，例如禁用、只读、样式

入参类型：数组

入参： rowIndex  行号               

           propertyName 状态名

           value 状态值

### [](#324-getcolumnstatecellname-name)3.24. getColumnState(cellName, name)

说明：获取列状态

入参：cellName  列名(fieldname)

          name  状态名  

model. getColumnState(2, 'bCanModify')

### [](#325-setcolumnstatecellname-name-value)3.25. setColumnState(cellName, name, value)

说明：设置列状态，批量设置请使用setColumnStates

入参：cellName 列名(fieldname)

          name 状态名

          value 状态值

//设置inventory列的readOnly状态为true

model. setColumnState('inventory', 'bCanModify', true)

### [](#326-setcolumnstatescellname-name-value)3.26. setColumnStates([{cellName, name, value},...])

说明：批量设置列状态

入参类型：数组

入参：cellName 列名(fieldname)

          name 状态名

          value 状态值

model.setColumnStates([{cellName:'inventory', name:'bCanModify', value:true},{cellName:'inventory2', name:'bCanModify', value:true}])

### [](#327-setcolumnvaluecellname-value-check)3.27. setColumnValue(cellName, value, check)

说明：设置整列数据的值

入参：cellName 列名(fieldname)

          value  列值

          check  boolean型  内部调用参数 可不传

### [](#328-getcellstaterowindex-cellname-name)3.28. getCellState(rowIndex, cellName, name)

说明：获取单元格状态

入参：rowIndex  行号 

    cellName  列名 

          name   状态名

//获取第一行inventory列的readOnly状态的值

model. getCellState (1, 'inventory', 'readOnly')

### [](#329-setcellstaterowindex-cellname-propertyname-value)3.29. setCellState(rowIndex, cellName, propertyName, value)

说明：设置单元格状态，批量修改请使用setCellStates

入参：rowIndex  行号

          cellName  列名(fieldname)

          name  状态名

          value  状态值

//设置第1行inventory列的readOnly状态为true

model.setCellState(1, 'inventory', 'readOnly', true)

### [](#330-setcellstatesrowindex-cellname-propertyname-value)3.30. setCellStates([{rowIndex, cellName, propertyName, value},...])

说明：批量设置单元格状态

入参类型：数组

入参：rowIndex  行号

          cellName  列名(fieldname)

          propertyName  状态名

          value  状态值

for (let i = 0; i < rows.length; i++) {

 let data = rows[i];

 cellStates.push({

 rowIndex: i,

 cellName: "AbnormalDocStatus",

 propertyName: "visible",

 value: data.Status - 0 !== 0 && data.IsAbnormalDoc == true,

 });

}

 gridModel.setCellStates(cellStates);

### [](#331-setcolumnscolumns-fieldnames)3.31. setColumns(columns, fieldNames)

说明：设置grid栏目

入参：columns  栏目集合

          fieldNames  fieldname集合(可不传)

### [](#332-addcolumnsexternalcolumns-isshow)3.32. addColumns(externalColumns, isShow)

说明：添加表格栏目（动态列）

入参：externalColumns 新加的栏目，{'xxx': {cItemName: 'xxx',
bHidden: false, bShowIt: true, cShowCaption: 'xxx', cControlType:
'xxx'......}}

isShow：是否显示在表格上

### [](#333-clear)3.33. clear()

说明：清除全部数据

### [](#334-setdatasourceproxyconfig-queryparams-callback)3.34. setDataSource(proxyConfig, queryParams, callback)

说明：如果GridModel中dataSourceMode为local则proxyConfig参数传递为真实数据。

否则proxyConfig参数传递服务请求地址，queryParams传递请求参数，callback传递回调函数。

//dataSourceMode为local

model.setDataSource(GridData)

//dataSourceMode不为local

model.setDataSource('bill/list.do', {id: 1}, function(result){})

### [](#335-load-proxyconfig-params-callback)3.35. load (proxyConfig, params, callback)

说明：调用方法同setDataSource方法中dataSourceMode不为local的情况

### [](#336-setpagesizepagesize)3.36. setPageSize(pageSize)

说明：设置grid分页的页大小

入参： pageSize  页大小

### [](#337-setpageindexpageindex)3.37. setPageIndex(pageIndex)

说明：设置grid分页中的页码

入参：pageIndex  页码

### [](#338-getpagesize)3.38. getPageSize()

说明：获取当前grid分页的页大小

### [](#339-selectrowindexes)3.39. select(rowIndexes)

说明：设置grid选中行

入参： rowIndexes  行号集合

示例： model.select([1,2,3])  设置grid选中行号为1,2,3行

### [](#340-getpageindex)3.40. getPageIndex()

说明：获取grid分页中的当前页码

### [](#341-unselectrowindexes)3.41. unselect(rowIndexes)

说明：设置grid取消选中的行

入参： rowIndexes  行号集合

### [](#342-selectall)3.42. selectAll()

说明：选中所有行

### [](#343-unselectall)3.43. unselectAll()

说明：取消选中所有行

### [](#344-getselectedrows)3.44. getSelectedRows()

说明：获取grid中已选中行的数据

### [](#345-getselectedrowindexes)3.45. getSelectedRowIndexes()

说明：获取grid中已选中行的行号

### [](#346-updaterowrowindex-rowdata)3.46. updateRow(rowIndex, rowData)

说明：更新行数据

入参：rowIndex  行号

          rowData   行数据

孙表模型使用updateRow方法需要传递4个参数

updateRow(rowIndex, rowData, null, true)

### [](#347-updaterowsrowindex-rowdata)3.47. updateRows([rowIndex,...], [rowData,...])

说明：批量更新行数据

入参：rowIndex  行号

          rowData   行数据

let indexes = [];

 let actionStates = [];

 suc.data.forEach((row) => {

 indexes.push(rentAndIndex.get(row.id));

 })

 gridModel.updateRows(indexes, suc.data);

 

// 举例.updateRows([1,3,5], [{第一行的数据}, {第三行的数据}, {第五行的数据}])

### [](#348-insertrowrowindex-rowdata)3.48. insertRow(rowIndex, rowData)

说明：grid插行功能

入参：rowIndex  行号

          rowData   行数据

//在第三行下插入行，行数据为rowData

model.insertRow(3,rowData)

### [](#349-insertrowsrowindex-rowdatas)3.49. insertRows(rowIndex, rowDatas)

说明：grid批量插行功能

入参：rowIndex 行号

          rowDatas 行数据

//在第三行下插入rowDatas.length行，数据为rowDatas

model.insertRow(3,rowDatas)

### [](#350-appendrowrowdata)3.50. appendRow(rowData)

说明：grid增行功能

入参： rowData  行数据

### [](#351-deleterowsrowindexes)3.51. deleteRows(rowIndexes)

说明：grid 删行功能

入参：rowIndexes  行号集合

//删除grid中第行号为1,2的行

model.deleteRows([1,2])

### [](#352-deleteallrows)3.52. deleteAllRows()

说明：grid 删所有行功能

入参：isAll  true-删除所有数据，默认false-删除显示数据

//删除显示数据\ 

model.deleteAllRows() 

//删除所有数据(包含)\ 

model.deleteAllRows(true)

### [](#353-getrowsbyindexesrowindexes)3.53. getRowsByIndexes(rowIndexes)

说明：根据行号获取grid中数据

入参：rowIndexes  行号集合

### [](#354-getrowrowindex)3.54. getRow(rowIndex)

说明：根据行号获取行数据

入参：rowIndex  单个行号

### [](#355-expandrowindex)3.55. expandRow(index)

说明：展开某行嵌套表

### [](#356-expandallrow)3.56. expandAllRow()

说明：展开所有嵌套表

### [](#357-setshowexpandtruefalse)3.57. setShowExpand(true/false)

说明：表格是否显示行展开符号

### [](#358-setscrollcell)3.58. setScrollCell

说明：表格滚动到单元格，返回{lineno, columnModel, value}

const results = gridmodel.setScrollCell(rowIndex, attr);

### [](#359-rowclick)3.59. rowClick

说明：表格行点击事件

gridmodel.rowClick(rowIndex); // 传入行索引，无返回值

## [](#4-事件)4. 事件

### [](#41-beforecellvaluechange)4.1. beforeCellValueChange

说明：grid单元格数据改变前事件, 
返回true继续单元格数据改变，返回false终止单元格数据改变。

//示例中data格式为{ rowIndex:‘行号’, cellName: ‘列名’, value: ‘新值’, oldValue: ‘旧值’}

viewmodel.get(propertyName).on('beforeCellValueChange', function (data) {

 return true;

});

### [](#42-aftercellvaluechange)4.2. afterCellValueChange

说明：grid单元格数据改变后事件

//示例中data格式为{ rowIndex:‘行号’, cellName: ‘列名’, value: ‘新值’, oldValue: ‘旧值’}

viewmodel.get(propertyName).on('afterCellValueChange', function (data) {});

### [](#43-beforerowstatechange)4.3. beforeRowStateChange

说明：行状态改变前事件,返回true继续行状态改变，返回false终止改变

//示例中data格式为{ rowIndex: ‘行号’, propertyName: ‘状态名’, value: ‘状态新值’, oldValue: ‘旧值’}

viewmodel.get(propertyName).on('beforeRowStateChange', function (data) {

 return true;

});

### [](#44-afterrowstatechange)4.4. afterRowStateChange

说明：行状态改变后事件

//示例中data格式为{ rowIndex: ‘行号’, propertyName: ‘状态名’, value: ‘状态新值’, oldValue: ‘旧值’}

viewmodel.get(propertyName).on('afterRowStateChange', function (data) {});

### [](#45-beforecolumnstatechange)4.5. beforeColumnStateChange

说明：列状态改变前事件, 返回true继续列状态改变，返回false终止状态改变

//示例中data格式为{ cellName: ‘列名’, propertyName: ‘状态名’, value: ‘状态名’, oldValue: ‘旧值’}

viewmodel.get(propertyName).on('beforeColumnStateChange', function (data) {

 return true;

});

### [](#46-aftercolumnstatechange)4.6. afterColumnStateChange

说明：列状态改变后事件

//示例中data格式为{ cellName: '列名', propertyName: '状态名', value:'状态名', oldValue: '旧值'}

viewmodel.get(propertyName).on('afterColumnStateChange', function(data) {});

### [](#47-beforecolumnvaluechange)4.7. beforeColumnValueChange

说明：列值改变前事件,返回true允许列值改变，返回false终止列值改变

//示例中data格式为{ cellName: '列名', value: '列值'}

viewmodel.get(propertyName).on('beforeColumnValueChange', function(data) {

 return true;

});

### [](#48-aftercolumnvaluechange)4.8. afterColumnValueChange

说明：列值改变后事件

//示例中data格式为{ cellName: '列名', value: '列值'}

viewmodel.get(propertyName).on('afterColumnValueChange', function(data) {});

### [](#49-beforecellstatechange)4.9. beforeCellStateChange

说明：单元格状态改变前事件,返回true则允许状态改变，返回false终止改变

//示例中data格式为{ rowIndex: '行号', cellName: '列名', propertyName:'状态名', value: '新值', oldValue: '旧值' }

viewmodel.get(propertyName).on('beforeCellStateChange', function(data) {

 return true;

});

### [](#410-aftercellstatechange)4.10. afterCellStateChange

说明：单元格状态改变后事件

//例：示例中data格式为{ rowIndex: '行号', cellName: '列名',propertyName: '状态名', value: '新值', oldValue: '旧值' }

viewmodel.get(propertyName).on('afterCellStateChange', function (data){});

### [](#411-beforesetcolumns)4.11. beforeSetColumns

说明：设置grid栏目前事件,返回true为允许设置栏目，返回false终止设置

//例：示例中columns格式为栏目数据格式

viewmodel.get(propertyName).on('beforeSetColumns', function (columns){

 return true;

});

### [](#412-aftersetcolumns)4.12. afterSetColumns

说明：设置grid栏目后事件

//例：示例中columns格式为栏目数据格式

viewmodel.get(propertyName).on('afterSetColumns', function (columns){});

### [](#413-beforesetdatasource)4.13. beforeSetDataSource

说明：设置grid数据前事件,返回true为允许设置grid数据，返回false为终止设置数据

//例：示例中data为grid数据格式

viewmodel.get(propertyName).on('beforeSetDataSource', function (data) {

 return true;

});

### [](#414-aftersetdatasource)4.14. afterSetDataSource

说明：设置grid数据后事件

//例：示例中data为grid数据格式

viewmodel.get(propertyName).on('afterSetDataSource', function (data){});

### [](#415-beforeselect)4.15. beforeSelect

说明：选中select前事件,返回true为允许选中，返回false为终止选中

//例：示例中rowIndexes为行号，单行(整形)or多行(数组)

viewmodel.get(propertyName).on('beforeSelect', function (rowIndexes) {

 return false;

});

### [](#416-afterselect)4.16. afterSelect

说明：选中select后事件

//例：示例中rowIndexes为行号，单行(整形)or多行(数组)

viewmodel.get(propertyName).on('afterSelect', function (rowIndexes){});

### [](#417-beforeunselect)4.17. beforeUnselect

说明：取消选中select前事件,返回true为允许取消选中，返回false为终止取消选中

//例：示例中rowIndexes为行号，单行(整形)or多行(数组)

viewmodel.get(propertyName).on('beforeUnselect', function (rowIndexes)

{

 return false;

});

### [](#418-afterunselect)4.18. afterUnselect

说明：选中select后事件

//例：示例中rowIndexes为行号，单行(整形)or多行(数组)

viewmodel.get(propertyName).on('afterUnselect', function (rowIndexes){});

### [](#419-beforeselectall)4.19. beforeSelectAll

说明：全选前事件,返回true为允许全选，返回false为终止全选

viewmodel.get(propertyName).on('beforeSelectAll', function () {

 return false;

});

### [](#420-afterselectall)4.20. afterSelectAll

说明：全选后事件

//例：示例中rows为选中行数据

viewmodel.get(propertyName).on('afterSelectAll', function (rows) {});

### [](#421-beforeunselectall)4.21. beforeUnselectAll

说明：全消前事件,返回true为允许全消，返回false为终止全消

viewmodel.get(propertyName).on('beforeUnselectAll', function () {

 return false;

});

### [](#422-afterunselectall)4.22. afterUnselectAll

说明：全消后事件

viewmodel.get(propertyName).on('afterUnselectAll', function () {})

### [](#423-beforeinsertrow)4.23. beforeInsertRow

说明：增行/插行前事件,返回true为允许增/插行，返回false为终止操作

//例：示例中data格式为{ index: '增/插行行号', row: '行数据'}

viewmodel.get(propertyName).on('beforeInsertRow', function (data) {

 return false;

});

### [](#424-afterinsertrow)4.24. afterInsertRow

说明：增行/插行后事件

//例：示例中data格式为{ index: '增/插行行号', row: '行数据'}

viewmodel.get(propertyName).on('afterInsertRow', function (data) {});

### [](#425-beforedeleterows)4.25. beforeDeleteRows

说明：删行前事件,返回true为允许删行，返回false为终止操作

//例：示例中rows为要删除的行数据

viewmodel.get(propertyName).on('beforeDeleteRow', function (rows) {

 return false;

});

### [](#426-afterdeleterows)4.26. afterDeleteRows

说明：删行后事件

//例：示例中rows为已删除的行数据

viewmodel.get(propertyName).on('afterDeleteRow', function (rows) {});

### [](#427-beforesort)4.27. beforeSort

说明：页面排序排序前事件，可以自定义排序算法

### [](#428-aftersort)4.28. afterSort

说明：页面排序排序后事件

### [](#429-beforefilter)4.29. beforeFilter

说明：页面筛选筛选前事件，可自定义筛选算法

### [](#430-afterfilter)4.30. afterFilter

说明：页面筛选筛选后事件

### [](#431-aftersetfocusedrowindex)4.31. afterSetFocusedRowIndex

说明：行获取焦点后事件

gridModel.on('afterSetFocusedRowIndex', index => {

 let rows = gridModel.getRows()[index];

})

### [](#432-beforerowclick)4.32. beforeRowClick

说明：行点击前事件

// rowData为点击行的数据

gridModel.on('beforeRowClick', rowData => {

 console.log('行数据:', rowData)

})