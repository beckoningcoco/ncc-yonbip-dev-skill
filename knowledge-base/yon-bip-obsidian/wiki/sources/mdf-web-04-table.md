---
title: "表格 Table"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-table"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 表格 Table

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-table | 所属：Web组件

# [](#表格-table)表格 Table

## [](#1-功能说明)1. 功能说明

数据表格

## [](#2-在单据中)2. 在单据中

||属性名称||属性含义||值类型||属性说明|
||bMain||是否主表||Boolean||true|

列属性

||属性名称||属性含义||值类型||属性说明|
||cItemName||名称||String||orgid_name； 和 cName一样 容器是取cName，控件取cItemName|
||cCaption||标题||String||所属组织|
||bFixed||是否左锁定||Boolean||默认false，设置true在页面上是左锁定|
||cShowCaption||显示标题||String||所属组织（可设置）|
||iMaxLength||最大长度||Integer||100|
||iFieldType||字段类型||Integer||1；（废弃类型）已被controlType代替|
||bEnum||是否枚举||Boolean||false|
||cEnumString||枚举信息||String||{"0":"未启用","1":"启用","2":"停用"}|
||bMustSelect||是否必选||Boolean||false；必收集信息|
||bHidden||是否隐藏||Boolean||false； 系统字段，用于业务的隐藏管理|
||bSplit||是否支持行拆分||Boolean||false|
||bExtend||是否扩展字段||Boolean||false；计算字段，用户自己扩展 UI层面|
||bCanModify||是否可修改||Boolean||true；是否可编辑|
||iMaxShowLen||最大显示长度||Integer||255|
||iColWidth||列宽||Integer||150|
||iAlign||对齐方式||Integer||1；字段取值范围含义 （废弃类型）1 left，2 center，3right|
||bNeedSum||是否支持合计||Boolean||false|
||cSumType||汇总类型||String||avg，count，group，max，sum，自定义|
||bShowIt||是否显示||Boolean||true；用户字段，是否显示某个字段（true为勾选项）|
||bFilter||是否过滤||Boolean||true|
||cDefaultValue||默认值||String||0；只有枚举类型才有|
||bIsNull||是否可以为空||Boolean||true|
||bPrintCaption||是否打印栏目标题||Boolean||true|
||bJointQuery||是否支持关联查询||Boolean||false|
||bPrintUpCase||是否打印金额大写||Boolean||false|
||bSelfDefine||是否自定义项目||Boolean||false；实体字段，用户自定义|
||cControlType||控件类型||String||Input|
||iOrder||排序||Integer||1|
||bMain||是否主表||Boolean||true|
||id||ID||Integer||71226251|
||bVmExclude||||Integer||"bVmExclude": 0：viewmodel和view中都有收集，1、viewmodel没有，view中有不收集， 2、viewmodel有，view没有不收集（举例：regionCode）|
||iBillTplGroupId||模板分组ID||Integer|||
||iBillId||单据ID||Integer|||
||iBillEntityId||单据实体ID||Integer|||
||iTplId||单据模板ID||Integer|||
||cSubId||子产品ID||String|||
||iSystem||是否系统定义||Integer||0：非系统，1：系统；系统预制，给二开预留|
||cName||字段别名||String||enable|
||cFieldName||字段类型||String||enable|
||authLevel||||Integer||3；（零售 权限级别）0：租户管理员 1：租户操作员 2：是客户管理员 3：客户操作员 4：商家管理员 5：商家操作员|
||cDataSourceName||数据源名称||String||bd.project.ProjectVO|
||enterDirection||切入方向||Integer||1回车向上，2回车向下，3回车向左，4回车向右，不配置的情况下，默认回车向右|
||cEnumType||枚举类型||String||bd_enable_type|
||enumArray||枚举数组||String||[{"nameType":"text","value":"未启用","key":"0"},{"nameType":"text","value":"启用","key":"1"},{"nameType":"text","value":"停用","key":"2"}]|

Table扩展属性cStyle

||属性名称||属性含义||值类型||属性说明|
||className2D||二维表外层样式||String|||
||support2D||是否支持显示二维表||Boolean/String||可配置true或者‘true'|
||show2D||是否展示二维表||Boolean/String||可配置true或者‘true’|
||substract||减去高度差值||String||不同项直接用‘，’分割。目前支持linetabs|
||substractHeight||减去高度差值||Number||具体高度差。配置后不支持表格自适应高度|
||fixedHeight||设置表格固定高度||Number||设置后不支持表格自适应高度|
||heightPercent||设置高度百分比||Number||设置后不支持表格自适应高度|
||diffHeight||减去高度差值||Number||具体高度差|
||maxRowCount||表格显示的最大行数||Number||用于表格高度计算，列表页全屏不支持该属性|
||outerSubstractWidth||减去宽度差值||Number|||
||width||设置固定宽度||Number|||
||diffWidth||减去宽度差值||Number|||
||widthPercent||宽度百分比||小数|||
||substractWidth||减去宽度差值||Number||与widthPercent配合使用|
||subTableFullHeight||子表吸底显示||Boolean||卡片页子表吸底显示|
||tableNoDataHeight||空表自定义高度||Number|||
||tableNoDataRowCount||空表自定义行数||Number|||
||noDataText||空表自定义提示信息||String|||
||noSearchDataText||自定义搜索无数据提示信息||String|||
||selectOnChecked||行点击不联动CheckBox||Boolean|||
||lazyLoadLineTab||表格在lineTabs下的动态延迟渲染||Boolean||搭配 lazyLoadTableKey 属性使用|
||lazyLoadTableKey||配置容器的key||String||key与linetabs的点击激活的key一致，搭配 lazyLoadLineTab 属性使用|
||lazyload||动态控制表格按需渲染||Boolean||设计器需要配合改动查看pdf后端文档 实体数据懒加载实现思路及对接说明.pdf(721 kB)|
||showContextMenu||表格支持右键||Boolean|||
||disableTableEditRowDrawer||禁用表格侧滑||Boolean||默认不禁用|
||actionTipledCount||设置表格一直显示的行按钮个数||number||默认是1，当所有表格的行按钮个数都小于等于1的时候按钮一直显示|
||hideActionExpand||按钮只收起显示，没有展开悬浮开关||Boolean||默认关闭|
||gridFilterIntervalMax||表头跨页筛选区间类型条件限制最大值||number||无默认值，可以配置限制最大值|
||gridFilterIntervalMin||表头跨页筛选区间类型条件限制最小值||number||无默认值，可以配置限制最小值|
||minHeight||表格吸底显示时支持默认设置最小高度||number||无默认值，可以配置限制最小值|
||screenPercent||子表吸底时设置表格高度占比百分比||number||0.8   (示例：80)|
||checkBoxMerge||合并的行复选框不合并||Boolbean||默认false|

列扩展cStyle

||属性名称||属性含义||值类型||属性说明|
||showCheckBox||scheckbox列支持全选||Boolean||子表表头支持全选；同时配置checkBoxNoDisabled，则表头的checkbox一直是可编辑的|
||type||input列支持大文本内容||String||textarea|
||maxRows||大文本最大行数||number||默认最大显示10行，超出内容显示...|
||textareaShowMore||大文本单元格显示展开/收起按钮||Boolean||默认不显示(需要和maxRows一块使用)   [《故事链接》](https://gfjira.yyrd.com/browse/QDKJ-54556)|
||tips||列提示||String|||
||parent||多表头||{}||通过扩展脚本实现《表格多表头脚本实现》，示例：{"parent": {"cFieldName": "start_field", "cShowCaption", "起始时间"}}|
||    parent.cFieldName||合并后的字段标识||String||可自定义，合并的列要求相同，表格内唯一|
||    parent.cShowCaption||合并后的字段标题||String|||

扩展属性cExtProps

||属性名称||属性含义||值类型||属性说明||其他备注|
||detailByPage||子表开启懒加载的标识符||Boolean||true -- 开启子表数据延迟加载||需要配置前端特性开关lazyLoadPage|
||showSubtotal||是否显示小计||Boolean||true - 显示；false - 不显示||默认true|

### [](#21-子表懒加载适配)2.1. **子表懒加载适配**

子表数据懒加载开启的前提是需要开启前端特性开关lazyLoadPage，并且配置需要懒加载的子表的detailByPage属性，具体配置参考后端适配文档[《MDD框架适配文档》](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=42392557)、[《YPD框架适配文档》](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=7511432)，`开启lazyLoadPage后，进入详情会发起两次detail接口`，第一次接口返回正常的数据以及50条子表数据，`第二次detail接口返回子表的key及对应的数据的总数量`（这里需要注意，如果返回结构不对，则不会发起后续的流程），`在两次detail均正确返回后，会根据懒加载子表的数据的总数量发起N个detailByPage请求`，在所有detailByPage请求均正常返回后进行一次页面的重新渲染。此时整个子表延迟加载的功能流程完毕。在特殊场景下，因以上懒加载场景也是通过对数据延迟加载的方式减少首屏打开时间，但最终数据均会返回端上，如详情页数据量巨量，可能会造成页面反应慢的情况发生，`此时如果当前详情页面对数据无批量操作需求（慎重！！！确保此页面发起的所有请求后端不使用子表数据）`，可以额外开启另一个前端特性lazyLoadByPage，对接口detailByPage请求再次进行按需延迟处理，开启后子表会出现分页，当对分页切换的时候才会调用detailByPage接口请求后续的数据。

**上文提到的配置项说明：**

- lazyLoadPage 子表懒加载特性开关，在MDF配置中心配置对应的domainKey
- detailByPage 表格组件属性，在表格组件的cExtProps中配置
- lazyLoadByPage 子表分页特性开关，在MDF配置中心配置对应的domainKey **`（慎重！！！确保此页面发起的所有请求后端不使用子表数据）`**

即：
如果需要子表懒加载，则配置lazyLoadPage和detailByPage这2个配置项；如果需要子表分页，则上面3个配置项都要配

**启用原则：**

- 优先从设计层面屏蔽子表数据量过大，如：通过延后加载或手动点击二次查询等方式避免
- 子表数据大小2万条，小于2万应从代码层面优化，不要启用
- 业务逻辑中有使用子表数据的单据不允许启用子表分页

## [](#3-控制示例)3. 控制示例

### [](#31-api)3.1. API

参考[GridModel表格模型](#/api/02-grid-model)

### [](#33-表格行号)3.3. 表格行号

[表格行号如何配置](#/components-web/04-hanghaolineno)

### [](#34-常用示例)3.4. 常用示例

#### [](#341-控制是否显示行号)3.4.1. 控制是否显示行号

viewmodel.getGridModel().setState('showRowNo', true);

// 或

viewmodel.get('table1').setState('showRowNo', false);

#### [](#342-控制是否显示列设置)3.4.2. 控制是否显示列设置

viewmodel.getGridModel().setState('showColumnSetting', true);

// 或

viewmodel.get('table1').setState('showColumnSetting', false);

#### [](#343-控制是否显示分页)3.4.3. 控制是否显示分页

viewmodel.getGridModel().setState('pagination', {total:xxx, pageSize: xxx, pageIndex:xxx});

// 或

viewmodel.get('table1').setState('pagination', false);

#### [](#344-显示全表编辑轮廓)3.4.4. 显示全表编辑轮廓

viewmodel.getGridModel().setState('tableDisplayShowAllOutline', true);

// 或

viewmodel.get('table1').setState('tableDisplayShowAllOutline', false);

#### [](#345-获取行列模型)3.4.5. 获取行/列模型

// 获取当前编辑行模型

let tableEidtRowModel = viewmodel.get('table1').getEditRowModel();

// 获取当前编辑单元格模型

let tableEidtCellModel = viewmodel.get('table1').getEditRowModel().get('column1');

#### [](#346-控制是否显示多选列)3.4.6. 控制是否显示多选列

viewmodel.getGridModel().setState('showCheckBox', true);

// 或

viewmodel.get('table1').setState('showCheckBox', false);

#### [](#347-列合并)3.4.7. 列合并

一个列字段中相同的数据，可自动合并，我们称之为列合并。目前列合并有两种方式：1、顺序合并；2、按数据合并。表格模型中mergeMode来标识当前合并的方式，1为顺序合并，2为数据合并。默认为顺序合并。

●如果一个表格想实现列合并的功能需先开启。即mergeCells字段为true。通过扩展脚本可以动态设置

viewModel.getGridModel().setState('mergeCells', true);

●某个列是否开启列合并的功能通过设置bMergeCol
属性来控制，true开启，false为关闭。通过扩展脚本可以动态设置

viewModel.getGridModel().setColumnState("列字段名称", "bMergeCol", true);

●顺序合并mergeMode为1。顺序合并可以理解为从第一列开始可合并的行合并，后面的列合并根据前一行设置的合并规则走。比如第一列
123行合并，那第二列 最多能123行的数据合并，第三列如果合并不了
后面的都不合并了。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Tablebiaogeimg1.962b99bf.png)

●数据合并mergeMode为2，比如id相同，那相邻行的所有相同数据都合并。

gridModel.setState('mergeCells', true);//开启合并模式

gridModel.setState('mergeMode', 2);//数据合并

gridModel.setState('mergeSourceName', 'id'); //根据哪个字段合并，默认根据主键id合并

gridModel.setState('mergePosition','first');//合并方式向上对齐， 默认是居中center合并

#### [](#348-设置表格固定高度)3.4.8. 设置表格固定高度

viewmodel.getGridModel().setState('fixedHeight', 300);

// 或

viewmodel.get('table1').setState('fixedHeight', 200);

#### [](#349-开启表格简版分页)3.4.9. 开启表格简版分页

viewmodel.getGridModel().setCache('useSimplePagination', true);

#### [](#3410-标题栏设置折线)3.4.10. 标题栏设置折线

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Tablebiaogeimg2.ada303a1.png)

gridmodel.setColumnState(列, 'diagonalName', '类目')

#### [](#3411-表格已选按钮显示规则)3.4.11. 表格"已选"按钮显示规则

表格左下角的已选默认应该是显示的，如果不显示按以下规则排查

##### [](#34111-公共规则)3.4.11.1. 公共规则

- 

嵌套表不显示已选

- 

工作台磁贴不显示已选

- 

没有表格模型不显示已选

- 

表格模型没有唯一标识符"rowKeyField"字段的不显示已选

- 

表格模型设置了showCheckBox为false（表头不支持多选）的，不显示已选

- 

表格设置了isRadio（单选）的，不显示已选

- 

页面模型viewmodel.getParams()里通过扩展等方式设置了disableGridSelectedRows为false的时候不显示已选

##### [](#34112-参照)3.4.11.2. 参照

- 

参照收藏不显示已选

- 

单选参照不显示已选

##### [](#34113-列表)3.4.11.3. 列表

- 有sumSwitch（表头/表头明细切换组件），且UI模板上cStyle字段里表头+明细模式（fasle对应的值）没有配置对应唯一标识符的情况不显示已选

##### [](#34114-卡片)3.4.11.4. 卡片

- 

单据类型是voucher的，表格非只读状态下不显示已选

- 

单据类型是voucher的没有开启特性voucherShowSelectedRows且表格UI模板中cStyle里未配置属性isShowSelectedRows的不显示已选

#### [](#3412-卡片页编辑态表格行拖拽后立即保存)3.4.12. 卡片页编辑态表格行拖拽后立即保存

开启特性：dragRowAutoSave

## [](#4-faq)4. FAQ

### [](#41-表格的小计和合计支持修改参与计算的数据)4.1. 表格的小计和合计支持修改参与计算的数据

// 小计，修改subtotalData对象，subtotalData是对象，不返回值

viewModel.getGridModel().on('beforeCalcSubTotalData', (dataList, subtotalData) => {

 // dataList为原数据

 // 过滤掉不需要计算的数据后的剩余数据赋值给subtotalData

})

// 合计，修改sumData对象，setData是一维数组对象，不返回值

viewModel.getGridModel().on('beforeSetSum', (sumData) => {})

### [](#42-获取行单元格模型)4.2. 获取行/单元格模型

/ 获取当前编辑行模型

let tableEidtRowModel = viewmodel.get('table1').getEditRowModel();

// 获取当前编辑单元格模型

let tableEidtCellModel = viewmodel.get('table1').getEditRowModel().get('column1');

### [](#43-关于列表设置排序规则)4.3. 关于列表设置排序规则

#### [](#431-启用排序规则)4.3.1. 启用排序规则

开启 openSortRule 特性开关

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Tablebiaogeimg3.ea1c5325.png)

#### [](#432-添加排序条件)4.3.2. 添加排序条件

- 字段的cStyle配置了bSort=true
- 字段的cOrder属性值不为空（为了不影响原有的排序逻辑建议用cStyle的bSort）（需要升级MDD版本）

排序项满足以上这2个条件之一才可以选择（注意开放的字段一定要加数据库索引）

**billitem表配置cOrder不生效原因：mdd后端原来没取该表里的cOrder属性，后端已兼容，取cOrder属性，并返回前端**

### [](#44-领域扩展表格筛选)4.4. 领域扩展表格筛选

框架提供了钩子，可以扩展实现筛选（表格自定义列(formatter)前端筛选扩展也可以）

表格监听`${key}ColFilter`(列的cItemName+'ColFilter')，该钩子有两个参数：

row：当前行；

keyMap：对象{value:'', text:''}，扩展实现中修改value和text的值返给框架，value是实现筛选时的匹配值，text和显示的值，value和text可以相同，注意不要改keyMap的对象引用。