---
title: "TableStore"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g01-table-store-api"
section: "YNF-API"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, API]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# TableStore

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/api/g01-table-store-api | 所属：YNF-API

# [](#tablestore)TableStore

主要功能介绍：（tableStore基本功能）

- tableStore，是处理表格的数据模型，一般配合table组件一起使用。其核心实现包含 tableStore 类，RowStore类 Column等类
- 一般一个tableStore对应一组列表数据
- 可以扩展tableStore 和 RowStore做行数据的展示逻辑

## [](#tablestore-类api文档)TableStore 类API文档

### [](#构造函数constructor)构造函数(constructor)

`TableStore`构造函数初始化表格存储，包括行数据、列数据、状态管理，并注册可观察属性和计算属性。构造函数接收参数如下：

#### [](#参数)参数

||参数名||类型||描述||默认值|
||storeParams||any||storeMeta参数||无|
||rootStore||any||根存储实例||无|
||extendRowStore||any||扩展的rowStore类||无|
||primaryKey||string||数据主键 key||"id"|

### [](#类属性parameters)类属性(Parameters)

||属性名||类型||是否可观察||描述||默认值|
||data||Array `<RowStore>`||是||行数据集合||[]|
||dirtyData||Array `<object>`||否||用于存储数据变动，取消编辑时恢复数据用||undefined|
||columns||Map<string, BaseColumn>||是||列数据||observable.map()|
||currentHoverRowKey||string/number||是||当前滑过行的key||""|
||currentActiveRowKey||string/number||是||当前激活行的key||""|
||uiState||string||是||当前状态||PageStatusType.BROWSE|
||showSelect||boolean||是||是否显示选中内容||false|
||visible||boolean||是||是否显示||true|
||$readOnly||boolean||是||是否只读||false|
||isFoldMenu||boolean||是||是否展开收起行按钮||false|
||filters||Array||是||数据过滤器列表||[]|
||hooks||any||否||钩子函数集合，用于自定义行为||{}|
||caption||string||否||表格显示名称||""|
||primaryKey||string||否||数据主键 key||"id"|
||multiplePageSelectedData||Array `<RowStore>`||是||多页选择存储数据||[]|
||multiplePageSelected||boolean||否||是否开启跨页选择||true|
||alias||string||否||tableStore的key||无|

### [](#计算属性-computed)计算属性 (Computed)

||属性名||返回类型||描述||依赖项|
||isBrowse||boolean||是否处于浏览态||uiState|
||isEdit||boolean||是否处于编辑态（包括初始化、新增、编辑）||uiState|
||isAdd||boolean||是否处于新增态||uiState|
||getSelectRowKeys||Array||获取选中的行的keys集合||rowStore.selected|
||currentHoverRow||RowStore||当前hover行||currentHoverRowKey|
||currentActiveRow||RowStore||当前激活行||currentActiveRowKey|
||readOnly||boolean||是否只读||$readOnly,uiState|
||size||number||数据数量||data|
||selectSize||number||选中数量，如果开启跨页多选，则包含跨页多选的数量||rowStore.selected.length|
||getShowSelect||boolean||是否只显示选择数据||showSelect|
||getFoldMenu||boolean||是否展开收起行按钮||isFoldMenu|
||getVisible||boolean||是否隐藏||visible|
||isAllSelected||boolean||是否全选||getSelectRowKeys,data|
||indeterminate||boolean||是否部分选中||getSelectRowKeys,data|
||flatValue||Array||拍平的RowStore data||data|
||hasChangedRows||Array||是否有更改的行||_status|

### [](#动作函数-actions)动作函数 (Actions)

||方法名||描述||参数||返回类型|
||cancelEdit||取消编辑，恢复数据并设置状态为browse||无||void|
||addRow||添加行数据||row: any, isInit: boolean||RowStore|
||updateRow||更新行||rowKey: number, rowStore: any||string, rowStore: any|
||deleteRow||删除行，如果状态为插入则物理删除，否则标记为删除状态||item: RowStore||void|
||setUiState||设置UI state||state: string||void|
||createEmptyRowData||创建空行||无||RowStore|
||addEmptyRow||添加空行||无||RowStore|
||deleteRowByRowKey||删除某一行||key: string||void|
||setReadOnly||设置只读||b: boolean||void|
||getRow||根据行号获取rowStore||index:number||rowStore|
||getRowByKey||根据rowKey 获取行||rowKey: string||rowStore|
||setValue||更新 table 数据，会先清空||list: Array `<Object>`||void|
||getValue||获取 rows||{ withFilter = true }||Array `<RowStore>`|
||insertRow||插入行||index: number, item: object\RowStore||RowStore|
||setSelectRowKeys||设置rowStore选择状态s||rows: Array `<String>`||void|
||unSelectAll||取消选中所有||无||void|
||selectAll||选中所有||无||void|
||unSelected||取消选中该行||rowStore||void|
||unSelectedByRowKey||根据 rowKey 取消选中行数据||rowKey: string||void|
||selected||选中该行||rowStore||void|
||getSelectedRows||获取选中行数据||无||Array `<RowStore>`|

### [](#辅助函数-utilities)辅助函数 (Utilities)

||方法名||描述||参数||返回类型|
||dataToJson||格式化table数据为JSON格式||无||any|
||dataEntityToJson||后端传递，用带的数据格式||无||any|
||validate||校验表格数据||无||Array|
||clear||清空table数据||无||void|

📢说明

- `TableStore`类负责管理表格的数据、状态、验证规则以及与行和列的交互。
- 通过构造函数可以初始化表格的基础属性和行为。
- 可观察属性如 `data`、`currentHoverRowKey`、`currentActiveRowKey`等允许状态变化被追踪和响应。
- 计算属性如 `isBrowse`、`isEdit`、`isAdd`等提供了基于当前状态的额外信息。
- 动作函数如 `cancelEdit`、`addRow`、`updateRow`、`deleteRow`等用于修改表格的状态。
- 辅助函数如 `dataToJson`、`validate`等提供了数据处理和验证的能力。
- 表格支持行和列的动态添加、更新和删除，以及跨页多选和状态管理。

## [](#rowstore-类api文档)RowStore 类API文档

### [](#构造函数constructor-1)构造函数(constructor)

`RowStore`构造函数初始化行存储，包括行数据、状态管理，并注册可观察属性。构造函数接收参数如下：

||参数名||类型||描述||默认值|
||tableStore||T||表格存储实例||无|
||src||any||行数据||无|

### [](#类属性parameters-1)类属性(Parameters)

||属性名||类型||是否可观察||描述||默认值|
||selected||boolean||是||是否选中||false|
||$readOnly||boolean||否||行只读||undefined|
||rowKey||string||否||唯一键||uuid()|
||data||any||是||行数据存储||{}|
||order||number||是||序号||-1|
||errs||Map<string, string[]>||是||异常信息map||observable.map()|
||isValidate||boolean||是||是否校验||true|
||toolBarStore||ToolBarStore||否||行内工具栏||new ToolBarStore(this)|

### [](#计算属性-computed-1)计算属性 (Computed)

计算属性是基于可观察状态的派生值。

||属性名||返回类型||描述||依赖项|
||isInsertState||boolean||是否为插入状态||data._status|
||isDeleteState||boolean||是否为删除状态||data._status|
||readOnly||Function||获取只读属性 返回一个函数，参数是storeField||-|
||disabled||Function||获取禁用状态 返回一个函数，参数是storeField||-|
||required||Function||获取必填状态 返回一个函数，参数是storeField||-|
||visible||Function||获取显示状态 返回一个函数，参数是storeField||-|

### [](#动作函数-actions-1)动作函数 (Actions)

动作函数用于执行可以修改可观察状态的操作。

||方法名||描述||参数||返回类型|
||setValidate||设置校验||无||void|
||setReadOnly||设置行只读||b: boolean||void|
||set_Status||设置状态||status: string||void|
||deleteState||清空状态，处理删除状态的行||无||void|
||validateAtOnce||立即校验||无||void|
||debounceValidate||防抖校验||无||void|
||setValue||设置值||storeAlias: string, value: any, options?: setValueOptions||void|
||getValue||获取值||无||object|
||getFieldValue||获取项值||storeAlias?: string||any|
||setSelected||设置选择状态||flag: boolean||void|
||dataToJson||获取rowStore JSON 数据||无||any|
||dataEntityToJson||获取rowStore 实体JSON数据||无||any|
||copyDataEntityToJson||添加unCopyable 不允许复制属性并获取JSON数据||无||any|
||getColumns||获取列||storeAlias: string||column|
||validate||校验当前行数据||key?: string||any|
||errorTips||获取某列的错误信息||key: string||string|

📢说明

- `RowStore`类负责管理行的数据、状态、验证规则以及与列的交互。
- 通过构造函数可以初始化行的基础属性和行为。
- 可观察属性如 `selected`、`$readOnly`、`rowKey`等允许状态变化被追踪和响应。
- 计算属性如 `isInsertState`、`isDeleteState`等提供了基于当前状态的额外信息。
- 动作函数如 `setValidate`、`setValue`、`setSelected`等用于修改行的状态。
- 辅助函数如 `validate`、`dataToJson`等提供了数据处理和验证的能力。
- 行存储支持动态添加、更新和删除操作，以及状态管理和校验逻辑。

## [](#tablestore-扩展开发)TableStore 扩展开发

### [](#extend-tablestore)extend TableStore

// 1. 领域扩展使用示例

import { TableStore } from 'ynf-core-engine'

// 手动创建一个tableStore实例

const tableStore = new TableStore()

// 基于tableStore创建自己的table数据对象

export default class ContarctTableStore extends TableStore {

 orderBy: object = {};

 urgentLevelEnum: EnumType[];

 importantLevelEnum: Array<object>;

 secretLevelEnum: Array<object>;

 contractStatus: Array<object>;

 constructor(rootStore: any) {

 // null ，rootStore, 扩展的 RowStore 类

 super(null, rootStore, extendRowStore);

 this.urgentLevelEnum = rootStore.pageStore?.enumData?.urgentLevel;

 this. importantLevelEnum = rootStore.pageStore?.enumData?.importantLevel;

 this.secretLevelEnum = rootStore.pageStore?.enumData?. secretLevel;

 this.contractStatus = rootStore.pageStore?.enumData?.contractStatus

 }

 get isShowTable() {

 return this.visible !== false;

 }

 get isShowList() {

 return this.visible === false;

 }

 showContractTable = () => {

 this.visible = true;

 };

 showContractList = () => {

 this.visible = false;

 };

 getContractStatusStyle = (rowStore: any) => {

 const { status } = rowStore.data || {};

 return contractStatusClassNameEnum[status] || "contractStatusDefaultStyle";

 };

 }

// 2. 扩展当前tableStore实例

function extendTableStore(rootStore: object) {

 extendObservable(rootStore.tableStore, {

 // observable 属性

 filterText: '',

 // action 方法

 setFilterText: action(function (text) {

 this.filterText = text;

 }),

 // computed 计算属性

 get filteredRows() {

 const filterText = this.filterText.toLowerCase();

 return this.rows.filter(row => row.name.toLowerCase().includes(filterText));

 },

 // action 方法

 clearFilter: action(function () {

 this.filterText = '';

 })

 });

} 

extendTableStore(rootStore)

### [](#extend-rowstore)extend RowStore

import { RowStore } from 'ynf-core-engine'

export class extendRowStore extends RowStore {

 a:boolean

 constructor() {

 super(...arguments);

 }

 get test(){

 return this.data.status ==='2'

 }

 get examineVis() {

 return this.data.status ==='2';

 }

 get submitVis() {

 return ['1','0'].includes(this.data.status);

 }

 get urgingVis() {

 return ['2','3','4'].includes(this.data.status);

 }

 get returnVis() {

 return this.data.status ==='2';

 }

 get signVis() {

 return this.data.status ==='4';

 }

 get setSignVis() {

 return this.data.status ==='3';

 }

 get changeContraVis() {

 return this.data.status ==="8";

 }

 }

 如果tableStore 有继承或者扩展的话。tableStore的构造函数第三个参数传递给父类。

 or tableStore.extendRowStore = extendRowStore，

 在添加行数据的时候，tableStore 会构建 用户扩展的类实例

 在 设计器 协议上 绑定表达式 ：mobx://rowStore.changeContraVis 可以获取自己扩展的 响应逻辑

## [](#tablestore-典型示例)TableStore 典型示例

### [](#扩展tablestore函数)扩展tableStore函数

0. 行内数据：rowStore.data

1. 默认rowStore支持 isEdit isAdd isBrowse三个计算属性，设计器配置：“visible": "mobx://rowStore.isEdit"

2. 行内按钮涉及复杂控制时, 参考扩展开发指导extend RowStore自定义计算属性Boolean

### [](#tablestore中数据操作)tableStore中数据操作

- 普通字段

//tableStore操作数据统一使用数据对象store所控制字段alias属性，即组件中接收的storeField属性【alias属性通常以field在数据源、store及组件中一般保持一致】

 

// tableStore设置值方法

store.setValue([]);

 

store.getRow(0).setValue(storeField, value);

 

// tableStore获取值

store.getRow(0).getValue(alias) // 获取该行属性值

store.getRow(0).getFieldValue(alias) // formStore、tableStore、filterStore提供的统一获取数据方法

store.getRow(0).getValue() // 获取该行值

 

store.getValue() // 获取store所有数据

- 单选参照

// tableStore单选参照操作数据统一使用数据对象store所控制字段alias属性，即组件中接收的storeField属性

// 设置单选参照字段值

tableStore?.getRow(0).setValue('parent', { id:'1234567890987654'})

tableStore?.setValue([{parent: "1623643074168094746", parent_name: "RMB"}])

// 获取单选参照字段值

formStore?.getRow(0).getValue('parent') // parent为参照对应的storeField

tableStore?.getRow(0).getFieldValue(storeField) // formStore、tableStore、filterStore提供的统一获取数据方法

- 多选参照

// tableStore多选参照操作数据统一使用数据对象store所控制字段alias属性，即组件中接收的storeField属性

 

// 方式一：设置多选参照字段值:设置行内多选参照

tableStore?.getRow(0).setValue('duoxuanyinyong', [{

 code: "T0",

 codename: "皮卡丘",

 name: "皮卡丘",

 sort: 67,

 id: "1525653687361339397",

 pubts: "2023-08-09 15:13:42",

 innercode: "WHGH",

 shortname: "皮卡",

 orgid: "1525653687361339397",

 realname: "皮卡丘"

}])

 

// 方式二：设置多选参照字段值:设置列表多选参照

tableStore?.setValue([{ysy0627_duoxuanyinyongList: [

 {

 "duoxuanyinyong": "1526218947994583046",

 "fkid_id": "1863289888367443971",

 "creator": "640c98c9-12c2-4782-901e-e3b1834a50ef",

 "modifyTime": "2023-11-21 16:03:24",

 "createTime": "2023-11-16 14:18:12",

 "modifier": "99ea7655-00a2-4bda-b23c-19ade37ea574",

 "creator_userName": "王振",

 "duoxuanyinyong_name": "北凉",

 "id": "1863289888367443975",

 "pubts": "2023-11-21 16:03:24",

 "modifier_userName": "测试管理员",

 "fkid": "1863289888367443971"

 }

]}])

 

// 方式一：获取多选参照字段值

tableStore?.getRow(0).getValue(storeField) // parent为参照对应的storeField

tableStore?.getRow(0).getFieldValue(storeField) // formStore、tableStore、filterStore提供的统一获取数据方法

 

// 方式二：获取tableStore所有数据

tableStore.getValue()