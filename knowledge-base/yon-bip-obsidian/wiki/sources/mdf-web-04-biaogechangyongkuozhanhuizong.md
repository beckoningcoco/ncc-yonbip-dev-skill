---
title: "--表格常用扩展汇总"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-biaogechangyongkuozhanhuizong"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 4
---

# --表格常用扩展汇总

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-biaogechangyongkuozhanhuizong | 所属：Web组件

# [](#表格常用扩展汇总)表格常用扩展汇总

## [](#1-控制是否显示序号)1. 控制是否显示序号

viewmodel.getGridModel().setState('showRowNo', true);

// 或

viewmodel.get('table1').setState('showRowNo', false);

## [](#2-控制是否显示列设置)2. 控制是否显示列设置

viewmodel.getGridModel().setState('showColumnSetting', true);

// 或

viewmodel.get('table1').setState('showColumnSetting', false);

## [](#3-控制是否显示分页)3. 控制是否显示分页

viewmodel.getGridModel().setState('pagination', {total:xxx, pageSize: xxx, pageIndex:xxx});

// 或

viewmodel.get('table1').setState('pagination', false);

 

// 列表页不显示分页，请求全部数据

gridModel().setPageInfo({pageSize: -1})

// 显示分页

gridModel().setPageInfo({pageSize: 20})

gridModel().setPagination(true)

## [](#4-获取行列模型)4. 获取行/列模型

// 获取当前编辑行模型

let tableEidtRowModel = viewmodel.get('table1').getEditRowModel();

// 获取当前编辑单元格模型

let tableEidtCellModel = viewmodel.get('table1').getEditRowModel().get('column1');

## [](#5-控制是否显示多选列列表表格多选-单选)5. 控制是否显示多选列(列表表格多选|| 单选)

// 通过扩展脚本控制

viewmodel.get('table1').setShowCheckbox(true);

viewmodel.get('table1').setShowCheckbox(false);

// 如果想让列表为单选，在bill_base表的batchoperate配置为0

// 通过配置excel模板的时候设置 viewmodel.bBatchOperate设置为true

## [](#6-列合并)6. 列合并

一个列字段中相同的数据，可自动合并，我们称之为列合并。目前列合并有两种方式：1、顺序合并；2、按数据合并。表格模型中mergeMode来标识当前合并的方式，1为顺序合并，2为数据合并。默认为顺序合并。

- 如果一个表格想实现列合并的功能需先开启。即mergeCells字段为true。通过扩展脚本可以动态设置

viewModel.getGridModel().setState('mergeCells', true);

- 某个列是否开启列合并的功能通过设置bMergeCol
属性来控制，true开启，false为关闭。通过扩展脚本可以动态设置

viewModel.getGridModel().setColumnState("列字段名称", "bMergeCol", true);

- 顺序合并mergeMode为1。顺序合并可以理解为从第一列开始可合并的行合并，后面的列合并根据前一行设置的合并规则走。比如第一列
123行合并，那第二列 最多能123行的数据合并，第三列如果合并不了
后面的都不合并了。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/biaogechangyongkuozhanhuizongimg1.962b99bf.png)

- 数据合并mergeMode为2，比如id相同，那相邻行的所有相同数据都合并。

gridModel.setState('mergeCells', true);//开启合并模式

gridModel.setState('mergeMode', 2);//数据合并

gridModel.setState('mergeSourceName', 'id'); //根据哪个字段合并，默认根据主键id合并

gridModel.setState('mergePosition','first');//合并方式向上对齐， 默认是居中center合并

## [](#7-设置表格一页显示条数)7. 设置表格一页显示条数

let gridModel = viewmodel.getGridModel();

 gridModel.on('beforeLoad', function (data){

 gridModel.setPageInfo({pageSize:100,pageIndex:1})

});

## [](#8-表格表头设置)8. 表格表头设置

//隐藏列设置

gridModel.setState(‘showColumnSetting’,false);

//隐藏表头排序

gridModel.setState('multiSort',false);

//隐藏表头锁定列

gridModel.setState('unLock',true);

//隐藏表头锁定定位

gridModel.setState('unLookUp',true);

//隐藏表头筛选

gridModel.setState('unColFilter',true);

## [](#9-表格参照设置单选)9. 表格参照设置单选

//表格设置单选

const columns = gridmodel.getColumns();

columns['main_unit_name'].multiple = false;

columns['cost_element_name'].multiple = false;

gridmodel.setColumns(columns);

## [](#10-表格根据索引选中相关行)10. 表格根据索引选中相关行

gridModel.select(rowIndex)//参数也可以是数组

## [](#11-取消表格自动增行)11. 取消表格自动增行

// 针对所有表格起作用

viewmodel.getParams().autoAddRowAndDeleteRow = false

// 关闭某个表格的自动增行

viewmodel.getParams().autoAddRowAndDeleteRow = true // 默认应该是true

gridmodel.setState('autoAddAndDeleteRow', false);

// 开启或关闭某个表格的自动增行

监听钩子beforeAutoAddRow beforeAutoDeleteRow 两个钩子同时用

gridmodel.on('beforeAutoAddRow', (args) => {args.autoAddRowAndDeleteRow = true/false} )

gridmodel.on('beforeAutoDeleteRow', (args) => {args.autoAddRowAndDeleteRow = true/false} )

## [](#12-表格设置行列单元格背景色)12. 表格设置行、列、单元格背景色

设置完行的classname为 public_fixedDataTableRow_highlight-red

// 设置行className

gridModel.setRowState(index, 'className', 'bg-red');

// public_fixedDataTableRow_bg-red是扩展样式表中的自定义样式类；如果样式已加载但是不起作用，可以和public_fixedDataTableCell_main等类名配合使用

例：

.meta-table .public_fixedDataTableRow_bg-red .public_fixedDataTableCell_main {

 background: red;

}

// 设置列className和style

gridModel.setColumnState(column, 'className', 'highlight-red');

gridModel.setColumnState(column, 'style', {backgroundColor:'red'});

// 设置单元格style

gridModel.setCellState(0, 'xxx', 'style', {background:'red'}) // 设置单元格背景色

## [](#13-表格内参照控制是否多选)13. 表格内参照控制是否多选

billItem字段中增加multiple设置为0为单选，默认是多选

## [](#14-表格行必输项控制bisnull)14. 表格行必输项控制：bIsNull

gridModel.setColumnState('productAuxUnitName','bIsNull',false)

## [](#15-表格设置不可编辑)15. 表格设置不可编辑

gridModel.setReadOnly(true) // 整个表格不可编辑

gridModel.setCellState(0, 'demandOrg_name', 'readOnly', true); // 某一个单元格不可编辑

gridModel.setColumnState('demandOrg_name', 'bCanModify', false); // 某一列单元格不可编辑

gridModel.setRowState(0,'disabled',true); // 某一行单元格不可编辑

## [](#16-表格获取修改的数据-注意bmustselect属性为1才会收集)16. 表格获取修改的数据 .注意：bmustselect属性为1才会收集

gridModel.getDirtyData()

## [](#17-表格自定义列功能)17. 表格自定义列功能

下面的DeleteLabel就是自定义的列

gridModel.setColumnState('log', 'formatter', (rowInfo, rowData, fullName = "bd.project.ProjectVO") => {

 if (rowData.dr == 2) { //dr为2时设置行不可编辑

 viewmodel.getGridModel().setRowState(rowInfo.rowIndex, "disabled", true);

 } else {

 viewmodel.getGridModel().setRowState(rowInfo.rowIndex, "disabled", false);

 }

 return { //预删除新交互

 formatterKey: 'DeleteLabel',

 props: {

 rowInfo,

 rowData,

 fullName

 }

 }

})

## [](#18-表格自定义actions)18. 表格自定义actions

const rows = gridModel.getRows(false);

 const actions = gridModel.getCache('actions');

 const actionsStates = [];

 rows.forEach(data => {

 const actionState = {};

 actions.forEach(action => {

 if (action.cItemName == "btnStop") {

 if (data.enable == 0 || data.enable == 2) {

 actionState[action.cItemName] = { visible: false };

 }

 else {

 actionState[action.cItemName] = { visible: true };

 }

 } else if (action.cItemName == "btnUnstop") {

 if (data.enable == 1) {

 actionState[action.cItemName] = { visible: false };

 }

 else {

 actionState[action.cItemName] = { visible: true };

 }

 }

 else {

 actionState[action.cItemName] = { visible: true };

 }

 actionState[action.cItemName] = { visible: true, '下拉按钮1': {visible:true},'下拉按钮2': {visible:true} };

 });

 actionsStates.push(actionState);

 });

gridModel.setActionsState(actionsStates);

 

// 监听beforeSetActionsState钩子

gridModel.on('beforeSetActionsState', (actionState) => {

 const rows = gridModel.getRows(false);

 const actions = gridModel.getCache('actions');

 debugger;

 rows.forEach((data, i) => {

 actions.forEach((action) => {

 actionState[i][action.cItemName] = { visible: false };

 })

 })

})

 

// 树表

treeTable.on('afterSetDataSource', () => {

 const rows = treeTable.getNodesByKeys()

 const actions = treeTable.getCache('actions')

 const actionsStates = []

 rows.forEach((data, index) => {

 actions.forEach(action => {

 let show;

 ...

 actionsStates.push({ "key": data.id, "itemName": action.cItemName, "name": "visible", "value": show });

 })

 })

 treeTable.setActionsState(actionsStates)

})

## [](#19-表格动态设置列的类型)19. 表格动态设置列的类型

控件类型为：uncertain

cellConfig = { cControlType: 'Select' };

cellConfig.cEnumString = JSON.stringify(optionsString);

cellConfig.enumArray = JSON.stringify(optionsArray);

gridModel.setCellValue(index, 'cellConfig', cellConfig);

// 如果有多个不确定列，传递数组对象，每个对象需要有个属性cItemName：

cellConfig = { cItemName: XXX, cControlType: 'Select' };

cellConfig.cEnumString = JSON.stringify(optionsString);

cellConfig.enumArray = JSON.stringify(optionsArray);

arr = [cellConfig];

gridModel.setCellValue(index, 'cellConfig', arr);

## [](#20-表格控制显示隐藏)20. 表格控制显示隐藏

gridModel.setColumnState(cItemName, 'visible', false);

## [](#21-表格动态新增虚拟列标准做法是-把这列配进去-根据条件显示隐藏)21. 表格动态新增虚拟列标准做法是 把这列配进去 根据条件显示隐藏

gridModel.setColumnState(cItemName, 'bShowIt', false);

## [](#22-设置表格行按钮固定列宽度)22. 设置表格行按钮固定列宽度

表格和树表设置行按钮固定列宽，默认中文(繁体)是60；其他语种是120

可以在表格toolbar中设置fixedWidth(中文和繁体)值或fixedWidthOtnher(其他语种)值，自定义宽度，注意大小写

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/biaogechangyongkuozhanhuizongimg2.a1ab4e26.png)

## [](#23-取到界面上面-表头表头明细-的状态)23. 取到界面上面 表头/表头+明细 的状态

viewmodel.get('sumSwitch').getValue()

## [](#24-treetable-默认展开行)24. treeTable 默认展开行

afterMount之后 设置setState('expandAllRow',true)

## [](#25-数据校验时如何不校验表格数据)25. 数据校验时如何不校验表格数据

viewModel.getGridModel().setState('bIsNull',true)

## [](#26-如何替换表格数据查询的接口)26. 如何替换表格数据查询的接口

在viewmodel的allActions配置cmdList命令，会替换默认的查询接口。

 
 ![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/biaogechangyongkuozhanhuizongimg3.a7116153.png)

## [](#27-表格的小计合计)27. 表格的小计合计

- 配置

设置**showAggregates**为true会显示合计小计（默认情况不需要设置该属性，在要显示小计和合计的列上设置bNeedSum属性即可显示小计和合计），设置为local时，只显示小计；列表页默认是合计和小计；卡片页默认只显示合计

column.needSum 是否需要计算合计值

Column.cSumType 合计的方式  cSumType 有以下几种类型

- 

 sum  加（默认）；

- 

max 最大值

- 

min 最小值

- 

avg  平均值

- 

count 数量

- 含义

小计是计算当前页列数据；合计是计算总的数据，合计的数据是后台生成的，sumRecordList的第一个值；

- 扩展

小计支持的扩展：

 事件：afterCalcSubTotal

### [](#271-合计支持的扩展)27.1. 合计支持的扩展

合计直接执行doPrototype('setSum',data)方法。

### [](#272-从大到小整理结构)27.2. 从大到小整理结构

表格即为Grid或者table。两者基本代表同一个意思

模型层：viewModel获取grid

## [](#28-表格联查超链的监听事件)28. 表格联查超链的监听事件

beforeCellJointQuery和cellJointQuery

//实现：

if (!this.props.model.execute('beforeCellJointQuery', {

 rowIndex: index,

 cellName: columnKey,

 row: rowData

})) return;

this.props.model.execute('cellJointQuery', {

 rowIndex: index,

 cellName: columnKey,

 row: rowData

});

## [](#29-表格赋值)29. 表格赋值

// 1、直接赋值

var data = [];

gridModel.setState('dataSourceMode', 'local'); // 确保是local模式

gridModel.setDataSource(data);

 

// 2、调用接口赋值

gridModel.set('dataSourceMode', null);

gridModel.setDataSource({

 method: 'POST',

 options: { mask: true, uniform: false },

 url: 'xxx/xxx/xxx/xx'

}, params, function (res) {

 ...

})

## [](#30-表格行号如何配置)30. 表格行号如何配置

[行号LineNo](file:////pages/viewpage.action%3fpageId=20769914)

## [](#31-表格在linetabs下的点击懒加载)31. 表格在lineTabs下的点击懒加载

打开开关：

// 给表格的cStyle配置如下：

 

// 开启lineTab懒加载

lazyLoadLineTab:true

 

// 配置容器的key，这个key与linetabs的点击激活的key一致

lazyLoadTableKey:''

## [](#32-表格重新计算高度)32. 表格重新计算高度

viewmodel.execute('listHeaderHeightUpdate')

## [](#33-表头折行显示)33. 表头折行显示

// 支持单表头，最多折两行

viewModel.getGridModel().setState('enableMultiTableHeader', true)

## [](#34-表格小计和合计计算扩展)34. 表格小计和合计计算扩展

// 小计，修改subtotalData对象，subtotalData是对象，不返回值

viewModel.getGridModel().on('beforeCalcSubTotalData', (dataList, subtotalData) => {

 // dataList为原数据

 // 过滤掉不需要计算的数据后的剩余数据赋值给subtotalData

})

// 合计，修改sumData对象，setData是一维数组对象，不返回值

viewModel.getGridModel().on('beforeSetSum', (sumData) => {})

## [](#35-表格支持右键)35. 表格支持右键

table的cStyle中配置：showContextMenu：true

## [](#36-表格以卡片形式展现但保存和校验时均不生效怎么处理)36. 表格以卡片形式展现，但保存和校验时均不生效怎么处理？

gridModel.setState('defaultSelectedRowIndexes',true);

## [](#37-表格行按钮设置显示隐藏)37. 表格行按钮设置显示隐藏

gridModel.on('afterSetDataSource', () => {

 const rows = gridModel.getRows()

 const actions = gridModel.getCache('actions')

 const actionsStates = []

 var shouldCheckFlag = false

 rows.forEach((data,index) => {

 const actionState = {}

 actions.forEach(action => {

 if (action.cItemName === 'btnCancel') {

 actionState[action.cItemName] = { visible: getEnable(data.isEnabled) }

 } else {

 actionState[action.cItemName] = { visible: true }

 }

 })

 actionsStates.push(actionState)

 })

 gridModel.setActionsState(actionsStates)

})

## [](#38-表格左下角默认的已选如何关闭)38. 表格左下角默认的已选如何关闭

// 禁用已选,扩展脚本init之后

viewModel.getParams().disableGridSelectedRows=true或false

 

// 默认修改已选、不选

viewModel.getGridModel().setState('showSelRows',false)

## [](#39-单据列表底部分页左侧已选没有显示出来)39. 单据列表底部分页左侧已选没有显示出来

gridModel.setState('rowKeyField','id');

## [](#40-子表高度自适应)40. 子表高度自适应

// 卡片页子表默认吸底显示，不想要吸底效果需要开特性

disableSubTableFullHeight

例：{ disableSubTableFullHeight: { whitelist: ['st_purchaseorder'] } }

 

开了disableSubTableFullHeight特性以后，如果table的cStyle里配了subTableFullHeight，则还是吸底效果

 

// 卡片页(第一个子表)表体横向滚动条吸底显示

在table容器的cStyle中配置属性：

{subTableFullHeight: true}

## [](#41-scheckbox列支持全选)41. scheckbox列支持全选

在列的cStyle属性中配置：{showCheckBox: true}

## [](#42-设置表格空表高度)42. 设置表格空表高度

在表格的cStyle属性中配置：{tableNoDataHeight: number} 或者
{tableNoDataRowCount: number}

## [](#43-设置表格空表提示信息)43. 设置表格空表提示信息

在表格的cStyle属性中配置：{noDataText: ''} 或者 {noSearchDataText:''}

## [](#44-行点击不联动checkbox勾选参数)44. 行点击不联动CheckBox勾选参数

在表格的cStyle中配置selectOnChecked: false

## [](#45-表格批量粘贴非参照类型不触发aftercellvaluechange)45. 表格批量粘贴非参照类型不触发afterCellValueChange

// 单据里面开启

viewModel.getParams().batchPasteTriggerEvent = true

## [](#46-编辑态表格支持拖拽排序)46. 编辑态表格支持拖拽排序

1、table对应的cExtProps设置：{"rowDraggable": true} //
页面显示拖拽图标

2、gridModel模型配置orderfield属性：gridmodel.setState('orderField',
xxx);xxx为排序字段；如果没有，就加一个 // 保存以后按照拖拽的顺序显示

## [](#47-嵌套表)47. 嵌套表

1、配置主子孙结构，其中孙表配在子表的containers里边，反应到前端应该是和子表的toolbar同级

2、table对应的cExtProps设置：{"multiRowModel": true, "suitetable":
"嵌套表的childrenfield",
"suitetableHideHeader":"是否隐藏嵌套表表头"}

3、每个嵌套表都是独立的模型，获取嵌套表模型：gridmodel.getRowModel(index).get('嵌套表的childrenfield');

## [](#48-表格开启批量excel粘贴)48. 表格开启批量excel粘贴

表格的UI元数据配置：cStyle:{bPaste: true}

## [](#49-表格自定义侧滑弹窗的标题)49. 表格自定义侧滑弹窗的标题

gridModel.setCache('editRowModalTitle', '我是自定义标题文本') //
只替换侧滑弹窗显示的表格名称，后面还会拼上当前行

## [](#50-表格设置单元格提示)50. 表格设置单元格提示

// 第 index 行只有一列需要展示提示

gridModel.setCellValue(index, 'tipsConfig', { cItemName: 'ref_name', value: JSON.stringify({tips: "我是第一行，ref_name列的提示"})

// 第 index 行多列需要展示提示

gridModel.setCellValue(index, 'tipsConfig', [

 { cItemName: 'ref_name', value: JSON.stringify({tips: 45678878}) },

 { cItemName: 'type', value: JSON.stringify({tips: '我是类型'}) },

])

tips的值支持字符串，支持字符串的 html 片段

例：tips: '

111

222

333

'

// 相当于每一行数据中需要有一个 tipsConfig
字段，值可为对象或数组，每一列的提示内容与 tips
配置保持一致，应为格式化后的 JSON 字符串。

## [](#51-表头明细模式下批量操作时下推明细数据默认是下推主表数据)51. 表头+明细模式下，批量操作时下推明细数据，默认是下推主表数据

1、SumSwitch组件的cStyle中配置keys属性：{"keys":{"false":"子表key", "true":"主表key" }}

2、action的cExtPRops配置needSumSwitchKey:true

## [](#52-列表页配置焦点列)52. 列表页配置焦点列

1、开特性showFocusedCol

2、gridmodel.setCache('showFocusedCol', true)

## [](#53-列表页表头明细模式下批量删除有时不能传递所有的数据)53. 列表页，表头+明细模式下，批量删除有时不能传递所有的数据

1、SumSwitch组件的cStyle中配置keys属性：keys: { false: "子表key",
true: "主表key" }

2、action的cExtPRops配置needSumSwitchKey:true

## [](#54-列表页只显示小计不显示合计)54. 列表页只显示小计，不显示合计

showAggregates设置成'local'

// init方法中，设置表格模型上showAggregates='local'

gridModel.setState('showAggregates', 'local')

## [](#55-获取toolbar的扩展组件)55. 获取toolbar的扩展组件

1、cb.extend.getComponent(domainKey, 'toolbar', ctrlType)

2、cb.extendComp

## [](#56-自定义表格分页组件每页多少条)56. 自定义表格分页组件每页多少条

表格组件的cExtProps属性里配 pageSizeOptions，值的格式：['10', '20',
'50', '100', '5000', '10000'] 注意转成字符串

## [](#57-二维表支持配置多个行按钮)57. 二维表支持配置多个行按钮

二维表默认只显示配置的btnDeleteRow(删除)按钮，要显示其余按钮，需要在按钮的cExtProps属性上配置{table2D:true}

## [](#58-批量粘贴如何指定某字段关闭)58. 批量粘贴如何指定某字段关闭

// 禁止qty批量粘贴

gridModel.on("beforePasteForbidden", function(data, column){console.log(data.cellName);if(data.cellName === 'qty') return false})

## [](#59-web端详情浏览态子表默认选中修改去掉默认选中第一行的特性)59. Web端详情浏览态子表默认选中修改：去掉默认选中第一行的特性

表格的cStyle里配noAutoSelect:true 或者model.setState('noAutoSelect', true);

## [](#60-表格inputnumber类型的列支持计算器)60. 表格inputnumber类型的列支持计算器

1、在列的cStyle里配showCalculator:true

2、可以设置表格模型.setColumnState('xxx', 'showCalculator', true)

## [](#61-表格模型里的defaultvalkey)61. 表格模型里的**defaultValKey**

如果有值，则是参照选择的时候带出默认值；如果没有值，则是增行的时候带出默认值

## [](#62-新增态表格自动新增一行)62. 新增态表格自动新增一行

1、表格模型中的属性bIsNull是false时，新增态表格会自动新增一行

2、表格模型中的属性bIsNull如果是true，新增态表格默认不增行；在表格cStyle里配置addAppendRow:true，则新增态表格会自动新增一行

## [](#63-支持扩展脚本修改pagesizeoptions对象)63. 支持扩展脚本修改pageSizeOptions对象

领域监听setTablePageSizeOptions事件，设置参数。

 

gridmodel.on('setTablePageSizeOptions', args => { args.pageSizeOptions = ['10', '20', '30', '50', '80', '100', '200', '500', '1000'] //设置pageSizeOptions 对象 })

## [](#64-设置列是否是明细列属性detailcol)64. 设置列是否是明细列属性detailCol

列Style里设置detailCol(true/false)（或者在设计器的扩展属性里设置自定义属性，注意是Boolean类型）

## [](#65-表格设置每行不同行高)65. 表格设置每行不同行高

1、表格cStyle设置 customRowHeight:true

2、常用API

setRowHeight：参数：{index， height} 设置某行的行高

setRowsHeight：参数：[{index， height},{index， height}...] 设置多行的行高

initRowsHeight：参数：[height, height...] 按数组顺序从第一行开始设置行高

## [](#66-卡片页表格显示已选)66. 卡片页表格显示已选

1、浏览态；

2、开特性voucherShowSelectedRows(特性可以按domainkey开或者按照billno开，具体看本文档的特性章节)；

3、表格模型属性rowKeyField有值。

## [](#67-表格设置显示最大行数)67. 表格设置显示最大行数

model.setMaxRows(index)：设置大文本字段最大行数 支持1-10，设置null，意思是清空这个属性

## [](#68-表格多表头脚本实现)68. 表格多表头脚本实现

表格如何设置多表头，设置列的parent属性。示例代码：

// 注意，设置同一个父的两列必须是相邻的两列

const fieldNames=gridModel._get_data('fieldNames');

const columns=gridModel._get_data('columns');

for(let key in columns){

 let col=columns[key];

 if(col.cItemName=='start_day' || col.cItemName=='start_day_time'){

 col.parent={

 cFieldName:'start_field',

 cCaption:'起始时间',

 cShowCaption:'起始时间'

 }

 }

}

gridModel.setColumns(columns,fieldNames);

注意：设置多表头的列需要有cFieldName属性值(值可以和cItemName值相同)

## [](#69-表表页主表字段重复计算小计值)69. 表表页主表字段重复计算小计值

给明细字段加标记detailCol:true

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/biaogechangyongkuozhanhuizongimg4.437a2021.png)

## [](#70-表格aftercellvaluechange钩子)70. 表格afterCellValueChange钩子

公式调用setCellValue方法，触发的afterCellValueChange钩子时会传递fromRule标记；

## [](#71-表格明细模式下小计值比合计值大)71. 表格明细模式下，小计值比合计值大

字段cFieldName值如果带 '.'(比如'bodyItem.oriTaxIncludedAmount')，会被认为是明细表字段，计算小计时不会去重；

 

解决方案：

1、修改cFieldName值；

2、在列的cStyle里配置 { detailCol: false }，指明不是明细表字段

## [](#72-表格前端当前页扩展排序)72. 表格前端(当前页)扩展排序

监听beforeSort，参数有{ column, rows, sortKey }，排序以后调用gridmodel.setRows(rows)(setRows方法只改rows的数据，不改dataSource里的数据)；

注意：排序方法中不要改变rows的数据引用

## [](#73-子表中参照赋值-怎么区分是在粘贴还是选择多选参照赋值)73. 子表中参照赋值 怎么区分是在粘贴还是选择多选参照赋值

粘贴时， 该参照的缓存里有一个**bPasting**字段， 为true为粘贴操作，
粘贴完成会清空这个值

// 示例

gridmodel.getEditRowModel().get('cellName').getCache('bPasting')

 

其中cellName为该参照字段的cItemName

## [](#74-扩展设置表格列隐藏)74. 扩展设置表格列隐藏

gridmodel.setColumnState(cItemName, 'bHidden', true); // 列表设置里不会显示该列