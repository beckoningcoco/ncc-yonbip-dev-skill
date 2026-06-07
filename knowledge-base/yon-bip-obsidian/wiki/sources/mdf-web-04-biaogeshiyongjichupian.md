---
title: "--表格使用基础篇"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-biaogeshiyongjichupian"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# --表格使用基础篇

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-biaogeshiyongjichupian | 所属：Web组件

# [](#表格使用基础篇)表格使用基础篇

## [](#1-效果展示)1. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/biaogeshiyongjichupianimg1.214836c2.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/biaogeshiyongjichupianimg2.b43b8dcb.png)

## [](#2-表格样式)2. 表格样式

### [](#21-表格高度)2.1. 表格高度

[卡片页子表高度自适应](file:////pages/viewpage.action%3fpageId=22512798)

列表页表格全屏、卡片页表格吸底显示是默认开启，如有问题可以参考上述文档，需要强调的是表格不要配在groupContainer容器和group容器里，可以用div容器。

### [](#22-表格设置行颜色列单元格颜色)2.2. 表格设置行颜色、列、单元格颜色

gridModel.setRowState(index, 'className', 'highlight-red');

gridModel.setColumnState(column, 'className', 'highlight-red');

gridModel.setColumnState(column, 'style', {backgroundColor:'red'});

gridModel().setCellState(0, column, 'style', {background: 'red'})

gridModel().setCellState(0, column, 'className', 'highlight-red')

### [](#23-表格设置不可编辑)2.3. 表格设置不可编辑

gridModel.setReadOnly(true) // 整个表格不可编辑

gridModel.setCellState(0, 'demandOrg_name', 'readOnly', true); // 某一个单元格不可编辑

gridModel.setColumnState('demandOrg_name', 'bCanModify', false); // 某一列单元格不可编辑

gridModel.setRowState(0,'disabled',true); // 某一行单元格不可编辑

### [](#24-表格行高自适应)2.4. 表格行高自适应

cControlType设置为textarea

column的cStyle里配{tag:true}，并在扩展脚本中设置gridmodel.setState('openContentHeight',
true)

### [](#25-表格联查列)2.5. 表格联查列

设置列的属性bJointQuery：true

默认只支持一个联查列，多列需要联查可以在扩展脚本监听cellJointQuery实现

gridModel.on('cellJointQuery', function(){})

## [](#3-sumswitch组件)3. SumSwitch组件

表头明细切换，如果选择表头，只会展示主表的信息，如果选择表头加明细，会把子表的部分信息也展示出来。
使用sumswitch组件时，需要在UI元数据中sumswitch对应的元数据上配置扩展字段cStyle
配置示例： "cStyle": {true: "id", false: "subid"}
其中true为表头选项中表格使用的唯一标识，需要对应list返回数据中存在的字段，false为表头+明细选项中表格使用的唯一标识，同样也需要对应list返回数据中存在的字段。

## [](#4-表格行内按钮)4. 表格行内按钮

### [](#41-action是通过childrenfield属性关联表格模型)4.1. action是通过childrenField属性关联表格模型

通过states控制行按钮；如果需要扩展脚本干预可以监听beforeSetActionsState，修改参数值，达到控制行按钮显隐的目的。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/biaogeshiyongjichupianimg3.f5c5138d.png)

设置了states又需要扩展干预行按钮的情况，可以监听beforeSetActionsState，修改传递的参数值

行内action是通过页面规则和扩展js控制显隐的。扩展脚本控制行按钮显隐，一般是在afterSetDataSource钩子方法中调用

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

调试方法：可以在table.jsx文件内的setActionState和setActionsState方法上打断点，查看调用堆栈，看最终起作用的哪个方法。

每个action都有before和after事件，监听befort+Act事件可以走领域自定义的的事件逻辑。

treetable设置行内按钮显隐

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

### [](#42-行按钮交互)4.2. 行按钮交互

1)、悬停平铺状态：鼠标移动到行上时显示，最右侧的[双右箭头]图标按钮(收起为常驻按钮)，点击会切换成常驻模式

2)、常驻收起状态：下拉按钮和双左箭头按钮，在行上固定
**[常驻显示]**，右对齐，点击双左箭头图标按钮，按钮展示形式变为悬停平铺模式

3)、当行操作按钮只有一个时，按钮为常驻平铺状态，默认按钮宽度是60，可以自定义按钮宽度，在toolbar的cStyle中设置fixedWidth:num

[交互设计文档](https://bip-pre.diwork.com/iuap-yondesign/ucf-wh/website/index.html#/design?tab=design&menu=cb383fec-91b2-4f8f-9b77-1b4e65fab761)

## [](#5-表格标题)5. 表格标题

### [](#51-排序筛选定位锁定)5.1. 排序、筛选、定位、锁定

排序和筛选功能支持当前页排序筛选，也支持跨页排序筛选，需要配filtingQueryBy和filteringCrossPage特性。

前端排序有钩子：beforeSort、afterSort

前端筛选钩子：beforeFilter、afterFilter

隐藏4个小图标

//隐藏表头排序

gridModel.setState('multiSort',false);

//隐藏表头锁定列

gridModel.setState('unLock',true);

//隐藏表头锁定定位

gridModel.setState('unLookUp',true);

//隐藏表头筛选

gridModel.setState('unColFilter',true);

//隐藏某一列表头筛选(全部设置隐藏后，不能设置单个显示)

gridModel.setColumnState(column, 'unColFilter', true)

//隐藏表头排序

## [](#6-表格扩展属性cstyle)6. 表格扩展属性cStyle

||属性名称||属性含义||值类型||属性说明|
||fixedHeight||设置表格固定高度||Number||设置后不支持表格自适应高度|
||heightPercent||设置高度百分比||Number||设置后不支持表格自适应高度|
||diffHeight||减去高度差值||Number||具体高度差|
||maxRowCount||表格显示的最大行数||Number||用于表格高度计算，列表页全屏不支持该属性|
||widthPercent||宽度百分比||小数|||
||subTableFullHeight||子表吸底显示||Boolean||卡片页子表吸底显示|
||tableNoDataHeight||空表自定义高度||Number|||
||tableNoDataRowCount||空表自定义高度||Number|||
||noDataText||空表自定义提示信息||String|||
||noSearchDataText||自定义搜索无数据提示信息||String|||
||selectOnChecked||行点击不联动CheckBox||Boolean|||
||showActionsCount||行按钮收起到更多||Number||默认值是5，当表格行按钮大于6个时，前5个按钮平铺显示，其余按钮显示在更多下拉按钮里边|
||enableMultiTableHeader||支持表格标题折行||Boolean|||
||rowheight||自定义高||Number|||

## [](#7-表格列)7. 表格列

||属性名称||属性含义||值类型||属性说明|
||cItemName||名称||String||orgid_name； 和 cName一样 容器是取cName，控件取cItemName|
||cCaption||标题||String||所属组织|
||cShowCaption||显示标题||String||所属组织（可设置）|
||bMustSelect||是否必选||Boolean||false；必收集信息|
||bHidden||是否隐藏||Boolean||false； 系统字段，用于业务的隐藏管理|
||bCanModify||是否可修改||Boolean||true；是否可编辑|
||iColWidth||列宽||Integer||150|
||iAlign||对齐方式||Integer||1 left，2 center，3right|
||bNeedSum||是否支持合计||Boolean||false|
||bCheck||是否触发check||Boolean||false|
||cSumType||汇总类型||String||avg，count，group，max，sum，自定义|
||bShowIt||是否显示||Boolean||true；用户字段，是否显示某个字段（true为勾选项）|
||cDefaultValue||默认值||String||0；只有枚举类型才有|
||bIsNull||是否可以为空||Boolean||true|
||bJointQuery||是否支持关联查询||Boolean||false|
||cControlType||控件类型||String||Input|
||cName||字段别名||String||enable|
||cFieldName||字段类型||String||enable|
||cEnumType||枚举类型||String||bd_enable_type|
||enumArray||枚举数组||String||[{"nameType":"text","value":"未启用","key":"0"},{"nameType":"text","value":"启用","key":"1"},{"nameType":"text","value":"停用","key":"2"}]|

## [](#8-表格相关扩展)8. 表格相关扩展

[表格格式化列扩展实例](file:////pages/viewpage.action%3fpageId=22513060)

[表格格式化列扩展实例二](file:////pages/createpage.action%3fspaceKey=MDF&title=%25E8%25A1%25A8%25E6%25A0%25BC%25E6%25A0%25BC%25E5%25BC%258F%25E5%258C%2596%25E5%2588%2597%25E6%2589%25A9%25E5%25B1%2595%25E5%25AE%259E%25E4%25BE%258B%25E4%25BA%258C&linkCreation=true&fromPageId=28018933)

[嵌套表](file:////pages/viewpage.action%3fpageId=22512867)

[表格相同数据行合并展示](file:////pages/viewpage.action%3fpageId=22512881)

[枚举字段标签、标记形式展现](file:////pages/viewpage.action%3fpageId=22512249)

[表格不确定列](file:////pages/viewpage.action%3fpageId=22512930)

[复合单元格](file:////pages/viewpage.action%3fpageId=22512020)

## [](#9-表格编辑)9. 表格编辑

表格行数据有四种状态：unchanged、insert、update、deleted

1、setCellValue(rowIndex, cellName, value,
check)：修改单元格数据，默认传前三个参数，如果修改的是孙表需要传第四个参数true；钩子：beforeCellValueChange
afterCellValueChange

2、setCellValues([{rowIndex, cellName, value, check, blur},...])：批量修改单元格数据，参数参考setCellValue方法；
钩子：beforeCellValueChange afterCellValueChange

3、insertRow(rowIndex, rowData)：插入行数据；钩子：beforeInsertRow
afterInsertRow

4、insertRows(rowIndex,
rowDatas)：批量插入行数据；钩子：beforeInsertRows afterInsertRows

5、appendRow(rowData)：最后插入一条数据；钩子：beforeInsertRow
afterInsertRow

7、updateRow(rowIndex, rowData)：更新行数据；

8、updateRows([rowIndex,...], [rowData,...])：批量更新行数据；

6、deleteRows(rowIndexes)：删除数据；钩子：beforeDeleteRows
afterDeleteRows

7、deleteAllRows(true)：删除所有数据，参数传了true删除所有数据，包含过滤的，不传参数默认只删除过滤后的数据

## [](#10-获取表格数据)10. 获取表格数据

1、getDirtyData()：获取脏数据(dataSource)

收集脏数据：1)、unchanged状态的数据不收集；2)、insert状态的数据收集全部字段值；3)、update状态的数据只收集属性bMustSelect是true或内容改动过的字段；4)、delete状态的数据收集属性bMustSelect是true的字段；数据里的**_status**是各行的状态

2、setDirty()：设置脏数据取值范围
默认为false为收集数据时只收集脏数据。传入true则收集数据时不区别脏数据，收集完整数据，可以单独设置某个表格收集全部数据。

3、getData()：获取所有数据(dataSource)，setDirty(true)时，和getDirtyData()取值是相同的，可能和页面的数据不一致，删除的数据也会获取到；会有状态值字段_status。

4、getAllData()：获取所有的数据，没有状态值字段，不建议使用，即将废弃。

5、getRows()：获取所有数据，不包含删除的数据（排序后，筛选前），如果传参false则获取的是所有(筛选排序前dataSource不包括删除的数据)的数据

6、getRow(index): 获取所有数据中的某一行数据（排序后，筛选前）

7、getEffeData：深拷贝，获取dataSource中的数据，不包含删除的数据；

8、getRealData：浅拷贝；获取dataSource中的数据，不包含删除的数据；

9、getRealRows：浅拷贝，获取所有数据，不包含删除的数据（排序后，筛选前）；

10、getRealViewRows：浅拷贝，获取页面上所显示(筛选排序后)的数据

||属性名称||属性含义||值类型||属性说明|
||cItemName||名称||String||orgid_name； 和 cName一样 容器是取cName，控件取cItemName|
||cCaption||标题||String||所属组织|
||cShowCaption||显示标题||String||所属组织（可设置）|
||bMustSelect||是否必选||Boolean||false；必收集信息|
||bHidden||是否隐藏||Boolean||false； 系统字段，用于业务的隐藏管理|
||bCanModify||是否可修改||Boolean||true；是否可编辑|
||iColWidth||列宽||Integer||150|
||iAlign||对齐方式||Integer||1 left，2 center，3right|
||bNeedSum||是否支持合计||Boolean||false|
||bCheck||是否触发check||Boolean||false|
||cSumType||汇总类型||String||avg，count，group，max，sum，自定义|
||bShowIt||是否显示||Boolean||true；用户字段，是否显示某个字段（true为勾选项）|
||cDefaultValue||默认值||String||0；只有枚举类型才有|
||bIsNull||是否可以为空||Boolean||true|
||bJointQuery||是否支持关联查询||Boolean||false|
||cControlType||控件类型||String||Input|
||cName||字段别名||String||enable|
||cFieldName||字段类型||String||enable|
||cEnumType||枚举类型||String||bd_enable_type|
||enumArray||枚举数组||String||方法名|
||方法名||作用||实现方式||性能|
||getData()||获取所有数据(dataSource)，包含删除的数据||深拷贝||低|
||getRows()||获取所有数据(rows)，不包含删除的数据（排序后，筛选前）||深拷贝||低|
||getRealRows()||获取所有数据(rows)，不包含删除的数据（排序后，筛选前）||浅拷贝||高|
||getEffeData()||获取所有数据(dataSource)，不包含删除的数据（排序前，筛选前）||深拷贝||低|
||getRealData()||获取所有数据(dataSource)，不包含删除的数据（排序前，筛选前）||浅拷贝||高|
||getRealViewRows()||获取界面显示的数据(排序后，筛选后)||浅拷贝||高|
||getEffeViewData()||获取界面显示的数据(排序后，筛选后)||深拷贝||低|

## [](#11-表格行模型)11. 表格行模型

// 获取当前编辑行模型

let tableEidtRowModel = viewmodel.get('table1').getEditRowModel();

// 获取当前编辑单元格模型

let tableEidtCellModel = viewmodel.get('table1').getEditRowModel().get('column1');

// 如果是特征或者嵌套表格

let tableEidtRowModel = viewmodel.get('table1').getRowModel(index);

## [](#12-表格赋值)12. 表格赋值

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

// 注意，调用setDataSource会重置表格行状态，默认是unchanged状态，如果是直接赋值，可以在每行数据上带上状态_status，重置状态时会优先取行状态

## [](#13-表格行拖拽)13. 表格行拖拽

1、cExtProps: {rowDraggable: true}

2、gridmodel.setRowDraggable(true/false);

## [](#14-常见问题)14. 常见问题

[表格帮助文档](file:////pages/viewpage.action%3fpageId=22513455)