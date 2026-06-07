---
title: "列表页面配置"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/06-liebiaoyemianpeizhi-mobile"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 14
---

# 列表页面配置

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/06-liebiaoyemianpeizhi-mobile | 所属：移动组件

# [](#列表页面配置)列表页面配置

## [](#1-excel文档)1. Excel文档

[采购订单列表移动端
(4).xlsm](https://docs.yonyoucloud.com/l/90B5C47c071a)

移动端使用宏：CreateSQL.CreateSQLByTenantForMobile，只产生指定租户模板，默认0租户

[列表非0租户
(1).sql](https://docs.yonyoucloud.com/l/7858f8e7E79e)

根据0租户模板刷所有非0租户的移动端模板，需要先执行上面Excel生成的0租户SQL

*以上适用于同一个billno已有PC模板的情况，如果没有PC模板或billno移动和PC不一样，可以按原有PC的方式操作*

## [](#2-标准列表布局)2 标准列表布局

### [](#21-效果图)2.1 效果图

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liebiaoyemianpeizhiMobileimage1.31c28893.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liebiaoyemianpeizhiMobileimage2.94a0665a.png)

### [](#22-列表页添加返回导航栏)2.2 列表页添加返回导航栏

[billtplgroup_base]----中配置cType为Header

使用组件Header，不需要设置组件上级模板分组ID。

### [](#23-区分按单按料视图)2.3 区分按单、按料视图

此功能同PC端表头、表体+明细按钮功能一致。

注: 按单===表头 按料===表体+明细

[billtplgroup_base]----中配置cType为SumSwitch

使用SumSwitch即可展示按单、按料的区分，cStyle中配置{"keys":{"false":"purchaseOrders_id"}}，指明子表id(生单的时候需要,
列表按料视图-进入卡片页按料视图详情也需要此字段id)。

#### [](#1基本信息)1.基本信息

//dataSource

[{

 value: true,

 // text: '按单' /* "表头" */

 text: '按料' //web端与移动端相反，展示下一个可操作

 

}, {

 value: false,

 // text: '按料' /* "表头＋明细" */

 text: '按单' // /web端与移动端相反，展示下一个可操作

}]

//默认值

{

 value: true,

 // text: '按单' /* "表头" */

 text: '按料' // ue要求，逻辑同web，展示下一个可操作

}

#### [](#2获取时机)2.获取时机

viewmodel.on('afterinitFilterFields',function() {

 //按单按料值改变事件

 const sumSwitchModel = viewmodel.get('sumSwitch');

 sumSwitchModel.on('afterValueChange', function(data) {

 //sumSwitch的值改变

 });

});

#### [](#3-修改值)3. 修改值

sumSwitchModel.setValue({value: true,text: '按料'}, true);

##### [](#31-列表接口按单查询数据)3.1 列表接口按单查询数据

// 扩展脚本init方法里增加此段代码

viewmodel.setCache("isSum", true);

#### [](#4-childrenfield)4. ChildrenField

excel中配置的sumSwitch的cStyle中设置keys。

功能：

- 

切换视图，清空可选列表的选中状态。

- 

修改gridModel上rowKeyField，这种情况见可下单的编辑列表

sumSwitchModel.getState('sumSwitchKey');//获取当前sumSwitchKey

#### [](#5-注意事项)5 注意事项

- 配置sumSwitch，展示视图切换功能。

默认按单视图，展示按料文字。（ue要求按单按料与web端相反）

- 

配置按单按料下展示不同的[billtplgroup_base]，

cStyle:{vision:'byorder'}只在按单视图展示，

- 

cStyle:{vision:'materials'}只在按料视图下展示，

- 

不配置vision，一直展示

- 

不配置sumSwitch

RowList没有数据不展示

- 

cStyle带有vision不展示

- 

sumswitch不能切换视图：cStyle:{config:{disabledSwitch:true}}

- 

sumswitch隐藏不展示 sumSwitchModel.setVisible(false)

- 

RowList子表数据默认按id合并，

如果需要修改，gridModel.setCache('VISIONKEY','实际_业务')

- 

修改时机：gridModel.on('beforeSetDatasource',function(){...})来更改，

### [](#24-过滤区)2.4 过滤区

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liebiaoyemianpeizhiMobileimage3.c625a3d2.png)

图中1---状态过滤区域

图中2---为时间轴过滤区域

图中3---为分组条件区域

图中4---为过滤条件，点击漏斗会出现过滤筛选面板

图中5---为搜索过滤区域

#### [](#241-状态过滤)2.4.1 状态过滤

##### [](#1基本信息-1)1.基本信息

添加的枚举字段的类型`itemType`要指定为tagButton.

另外如果新加的枚举过滤字段在领域元数据中不存在则需要通过前台或者后台逻辑去掉这个字段的condition

||[pb_meta_filter_item]|||||
||itemType||extendField||bAutoflt|
||tagButton||{"showType":"tab"}||1|

##### [](#2获取时机-1)2.获取时机

viewmodel.on('afterinitFilterFields',function() {

 //viewmodel是voucherlist的model

 const FilterViewModel = viewmodel.getCache('FilterViewModel');

 if (FilterViewModel.get('businessStatus')) {

 const filterModel = FilterViewModel.get('businessStatus');

 const fmodel = filterModel.getFromDisplayModel() || filterModel.getFromModel();

 //过滤方案值改变事件

 fmodel.getValue();//

 }

});

//viewmodel是voucherlist的model

##### [](#3支持badge)3.支持badge

badge的值，需要在扩展脚本中修改tabmodel的dataSource

viewmodel.on('afterinitFilterFields',function(){

 const dataSource = fmodel._get_data('dataSource');//fmodel的获取方式，见上面

 dataSource.forEach(da=>{

 da.badgeText = '3';//或者 da.badgeText: '今日(50)';或者或者 da.badgeText: '50+'

 })

 fmodel._set_data('dataSource',dataSource);

})

注意：不能使用setDataSource，因为会走processDataSource进行数据过滤，'全部'tab数据会丢失

##### [](#4获取值)4.获取值

fmodel.getValue();

##### [](#5性能问题)5.性能问题

列表页list多次请求。原因：扩展脚本重新设置分组数据，tab切换都会触发list请求。

解决方法：tab和分组都请求数据，组织tab的请求list

//fmodel的获取见上面

 

//过滤方案值改变事件

fmodel.on('beforeValueChange',function(data) {

 const {value:[currentValue]} = data;

 //全部和待审批状态下按单显示且隐藏切换按钮

 PurchaseorderlistModel.get('groupSection').setDataSource([{"value":"vouchdate","defaultOrder":"desc"},{"value":"recieveDate"},{"value":"vendor_name"}]);

 return false;

 

});

##### [](#6不展示全部)6.不展示'全部'

需要在过滤区的扩展脚本中增加代码

init: function (viewmodel) {

 //viewmodel是filterViewModel

 viewmodel.on('initFilterViewModel',function(data){

 const {filterModel=[]} = data;

 filterModel.forEach((item)=>{

 if(item.itemName=="reportRange"//业务逻辑，业务修改){

 item.needAll = false;

 }

 })

 })

},

#### [](#242-搜索过滤)2.4.2 搜索过滤

1.配置搜索框

添加字段类型'itemType'为SearchBox

iorder=1，在第一位；其他都在最后。

||[pb_meta_filter_item]|
||itemType|
||SearchBox|

2.过滤区搜索框展开

pb_meta_filter_item表的extendField中配置{"show": true}

#### [](#243-时间轴过滤)2.4.3 时间轴过滤

时间轴显示必须满足两个条件：

- 

在afterinitFilterFields指定是否显示时间轴

- 

bindKey必须是datePicker格式且在FilterViewModel中存在。

- 

bindKey：指定使用时间轴可以过滤的字段。目前只支持，在filter表中配置的类型是datePicker的字段。

- 

hasEcharts：表示展示时间轴

const PurchaseorderlistModel = viewmodel.getCache('parentViewModel');

//首次加载控制时间轴显隐

PurchaseorderlistModel.on('afterinitFilterFields',function() {

 const TimeLineModel = PurchaseorderlistModel.get('TimeLineModel');

});

 

//控制时间轴显隐

if ('显示时间轴') {

 TimeLineModel.setValue({'statusEcharts':{hasEcharts:true,bindKey:'recieveDate'}});

} else {

 TimeLineModel.setValue({'statusEcharts':false});

}

2.4.4 分组排序字段

在ListView组件中配置cStyle{groupList:[{value:'vouchdate',defaultOrder:'asc'}]}

##### [](#1-属性详解)1. 属性详解

groupList每一项支持的key

- 

value

指定字段会做list请求的groupBy和queryOrders字段（分别是分组和排序）

- 

defaultOrder，默认排序

带有defaultOrder字段的value会作为首次list请求的参数

- 

groupBy,可选参数，默认不设置。

不设置或者设置为true，即该字段作为分组和排序字段，

- 

false，表示该字段仅是排序字段，不作为分组字段

- 

showGroupField，可选参数，默认不设置。

不设置，分组右侧信息展示value指定字段

- 

设置，分组右侧信息展示为showGroupField指定字段值

- 

注意，实际分组依然按照value进行分组，showGroupField仅是展示作用，且展示分组数据第一条数据的showGroupField

##### [](#2-获取时机)2. 获取时机

viewmodel.on('afterinitFilterFields',function() {

 const PurchaseorderlistModel = viewmodel.getCache('parentViewModel');

 const groupSectionModel = PurchaseorderlistModel.get('groupSection');

 //下面可以更新分组数据

 groupSectionModel.setDataSource([{"value":"recieveDate","defaultOrder":"desc"},{"value":"vouchdate"},{"value":"code"},{"value":"vendor_name"}]);

});

##### [](#3-修改值-1)3. 修改值

如上图

##### [](#4-性能问题)4. 性能问题

groupSectionModel调用setDataSource会重新出发list请求，

解决方案

将其他触发list请求的方法阻止掉，按照业务需求只保留groupSectionModel触发的，因为这时候的condition最完整。

情况1：阻止列表tab切换的list请求

const filterModel = FilterViewModel.get('businessStatus');

const fmodel = filterModel.getFromDisplayModel() || filterModel.getFromModel();

//过滤方案值改变事件，fmodel是tab页签的model

fmodel.on('beforeValueChange',function(data) {

//全部和待审批状态下按单显示且隐藏切换按钮

 if (currentValue.value == '' || currentValue.value == null || currentValue.value == '1') {

 groupSectionModel.setDataSource([{"value":"vouchdate","defaultOrder":"desc"},{"value":"recieveDate"},{"value":"vendor_name"}]);

 this._set_data('value', [data.value[0].value], true);

 this.doPropertyChange('setValue', data.value);

 return false;//关键businessStatus不触发list，由groupSection触发

 }

})

##### [](#5-显隐)5. 显隐

- 设置方式必须是第二种，

- 

在cStyle中设置bHidden:true

#### [](#245-过滤区漏斗显隐)2.4.5 过滤区漏斗显隐

bHideFilterScheme=true 隐藏过滤区漏斗

viewmodel.getCache('FilterViewModel')?.setState('bHideFilterScheme', true);

#### [](#246-条件显示在列表页)2.4.6 条件显示在列表页

pb_meta_filter_item表的extendField中配置{"show":
true}，大部分控件不支持展开显示

### [](#25-列表视图)2.5 列表视图

其中{"vision":"byorder"}是按单的是标识，同理{"vision":"bymaterials"}是按料的标识。

#### [](#251-按单)2.5.1 按单

||[billtplgroup_base]|||||||
||模板分组编码cCode||模板分组名称cName||模板类型cType||排列方式cStyle|
||page||列表||DivWrapper|||
||headtitle||采购跟单||Head|||
||ListView||列表内容区||ListView||{"groupList":[{"value":"recieveDate","defaultOrder":"desc"},{"value":"vouchdate"},{"value":"code"},{"value":"vendor","showGroupField":"vendor_name"}]}|
||orderView||按单视图||DivWrapper||{"vision":"byorder"}|
||orderView_head||按单视图-头部信息||CodeHead|||
||orderView_extend||按单视图-扩展区域||ExtendBody|||

**2.5.2 按料**

||[billtplgroup_base]|||||||
||模板分组编码cCode||模板分组名称cName||模板类型cType||排列方式cStyle|
||productView||按料视图||TplThreeCols||{"vision":"bymaterials"}|
||productView_products_left||按料视图-物料区域-左||Left|||
||productView_products_middle||按料视图-物料区域-中||Middle|||
||productView_products_right||按料视图-物料区域-右||Right|||
||st_purchaseorderlist_SumSwitch||采购订单汇总区域||SumSwitch||{"keys":{"false":"purchaseOrders_id"}}|

#### [](#253-物流信息)2.5.3 物流信息

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liebiaoyemianpeizhiMobileimage4.f4e98b1e.png)

采购订单行上的按钮action为ems,excel需要预置物流信息页面

||[billtplgroup_base]|||||||
||模板分组编码 cCode||模板分组名称 cName||模板类型 cTpe||排列方式 cStyle|
||RouterPage||物流信息页面_路由||RouterPage|||
||EMSCard||物流信息||EMSCard|||

#### [](#254-可编辑字段)2.5.4 可编辑字段

可通过在cExtProps中配置bListEdit=true控制字段是否在列表上编辑，目前仅支持Stepper和Checkbox

### [](#26-多选列表)2.6 多选列表

在列表ListView组件的cStyle中设置{"props":{"isEdit":"true"}}即可。

可以通过扩展脚本切换是否多选状态，代码如下：

viewmodel.getGridModel().setState('isEdit', true);

### [](#27-批量生单)2.7 批量生单

在列表ListView组件的cStyle中设置{"props":{"isEdit":"true"}}即可。

#### [](#271-手工自制单据)2.7.1 手工自制单据

拉单列表界面可以参数标准列表界面来预制，其中页面上的新增单据功能，可以通过预制列表excel中bill_base表的单据类型cCardKey为新增的目的单据billnum来实现，按钮类型为FixedButton。例如：采购订单拉请购单列表界面中新增采购订单按钮，如下图：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liebiaoyemianpeizhiMobileimage5.ca58421d.png)

通过设置bill_base中的cCardKey为采购订单卡片的billnum实现,影响翻页功能。

viewmodel.on('beforeAdd', (arg) => {

 arg.carKey = 'st_purchaseorder';

})

通过扩展脚本中监听beforeAdd实现

||[bill_base]|||||||
||主键*id*||单据编码cBillNo||单据名称cName||单据类型cCardKey|
||*4*||pu_applyorderlist_pullx||采购订单生单||st_purchaseorder|

2.8 汇总展示

在url中添加isSum=true参数，list返回的数据是按设置的汇总条件汇总之后的数据

## [](#3-移动专有action)3 移动专有Action

- 

移动端的审批 workflow

- 

移动端审批历史 workflowhistory

- 

分享 share

- 

打印预览PDF printpreview

- 

打印预览图片 printpreviewimg

### [](#31-分享模板字符串)3.1 分享模板字符串

#### [](#311-基本信息)3.1.1 基本信息

原理：

- 

使用标签$var{ 和}$var_end 包裹变量，其他固定内容字符串拼出就可以。

- 

JSON数据格式规范参照友空间要求：

**文档地址：**[《分享模板说明》](https://wiki-ec.diwork.com/pages/viewpage.action?pageId=9045171)

#### [](#31-2-获取时机)3.1 2 获取时机

const SHAREPARAMSTEMPLATE = {

 //头部

 title: {

 content: '单号：$var{code}$var_end'

 },

 // 模板的子内容，单行文字。

 subContent: [{

 text: '供应商：$var{vendor_name}$var_end',

 }],

 //模板的操作区域，按钮加单行文字。

 operation: {

 columnText: [{

 text: '金额$var{oriSum}$var_end $var{currency_name}$var_end',

 }]

 },

 //模板的内容，复合内容。按料下只展示singlePicText；按单只展示textArray和hideArray

 content: {

 textArray: [

 { text: '产品名称：$var{product_cName}$var_end产品$var{product_cCode}$var_end' }

 ],

 hideArray: [

 { text: '产品名称：$var{product_cName}$var_end产品$var{product_cCode}$var_end' }

 ],

 singlePicText: {

 pic: '$var{product_defaultAlbumId}$var_end',

 title: '$var{product_cName}$var_end $var{product_cCode}$var_end',

 content: '交期：$var{recieveDate}$var_end数量：$var{qty}$var_end',

 url: ''

 }

 }

}

const TEMPLATE = JSON.stringify(SHAREPARAMSTEMPLATE)

**3.1.3 修改值**

- 

excel中配置，在parameter中设置'{"templateStr":把上面的TEMPLATE的内容粘贴到这里}'

- 

beforeShare的时候，在params中设置params.cParameter=JSON.stringify({templateStr:TEMPLATE})

viewmodel.on('beforeShare',({params})=>{ params.cParameter = JSON.stringify({templateStr:TEMPLATE}); })

## [](#4-其它)4. 其它

当列表项中需要根据其它字段展示样式。

则通过dom的[data-value]属性，通过写扩展样式控制样式

### [](#41-其它字段为枚举字段)4.1 其它字段为枚举字段

如果其它字段为枚举字段,
则通过dom的[data-value]属性，通过写扩展样式控制样式

### [](#42-其它字段不是枚举字段)4.2 其它字段不是枚举字段

cStyle中配置{"selectField":"itemName"},当前control对应dom的[data-value]属性则按selectField配置的值展示。

### [](#43-如何去掉列表字段后面的复制按钮)4.3 如何去掉列表字段后面的复制按钮

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liebiaoyemianpeizhiMobileimage6.90b12a6c.png)

cStyle中配置{"hasCopyBtn"false},当前control后的复制按钮可去掉。

### [](#44-列表页配置下拉刷新)4.4 列表页配置下拉刷新

在listview层级 cStyle里配置{"bHasPull": true} 即可

### [](#45-列表页数据为空时候文案配置)4.5 列表页数据为空时候文案配置

在listview层级 cStyle里配置{"noDataSlogan": '自定义无数据显示文案'}
即可

### [](#46-列表顶部查询区-tagbutton-显示数量配置)4.6 列表顶部查询区 tagbutton 显示数量配置

目前是通过扩展实现

// 代码推荐写在查询区扩展文件中 此时viewModel对应查询区模型

viewModel.on('afterInit', () => {

 const listModel = viewModel.get(cItemName).getFromModel() // 获取tagbutton对应模型

 const dataSource = listModel.get('dataSource')

 dataSource?.forEach(item => {

 item.badgeText = '目标数量'

 })

 listModel.setDataSource(dataSource)

})

## [](#5列表顶部查询条件扩展)5.列表顶部查询条件扩展

### [](#51-顶部查询条件默认渲染两行-可指定渲染在某一行-默认渲染在第二行下面那一行)5.1 顶部查询条件默认渲染两行 可指定渲染在某一行 默认渲染在第二行（下面那一行）

下图为例：

在listview cStyle里预制 cStyle: { lineNumberMap: { searchBoxLineNumber:
'1', } }

查询区 searchbox extendFiled预制 show: true 指定搜索框展开显示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liebiaoyemianpeizhiMobileimage7.369e0f84.png)

### [](#52-放开部分查询区条件到列表上方)5.2 放开部分查询区条件到列表上方

以下图 单据状态为例

在查询条件extendField：{ topShow: true }

目前支持一下几种组件类型

![](data:image/png;base64,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)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liebiaoyemianpeizhiMobileimage9.47aa7f35.png)

动态隐藏topShow为true时候的查询条件

viewModel.execute('updateTopFilterModelState', {code: cItemName, visible: false})

### [](#53-增加扫码框外露交互)5.3 增加扫码框外露交互

#### [](#531默认交互-扫码框在input框里面)5.3.1默认交互 扫码框在input框里面

![](data:image/png;base64,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)

实现方式 searchbox的extendField 或者cStyle里加入{ supportMtlScan: true }
即可显示扫码框

#### [](#532-扫码框在input框外部)5.3.2 扫码框在input框外部

实现方式 searchbox的extendField 或者cStyle里加入{ supportMtlScan: true，
outerMtlScan: true } 即可显示扫码框

### [](#54-列表导航栏item背景色)5.4 列表导航栏item背景色

#### [](#541-默认有背景色-无需配置)5.4.1 默认有背景色 无需配置

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liebiaoyemianpeizhiMobileimage11.d299a89e.png)

#### [](#542-可配置-无背景色交互)5.4.2 可配置 无背景色交互

在listview cStyle里预制 cStyle: { noNavItemBgColor: true } 即可

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liebiaoyemianpeizhiMobileimage12.b0670a68.png)

### [](#55-查询方案放到导航栏下拉展示)5.5 查询方案放到导航栏下拉展示

在listview cStyle里预制 cStyle: { schemelistConfig: { topShow: true } }
即可

### [](#56-列表顶部查询条件顺序配置及动态隐藏)5.6 列表顶部查询条件顺序配置及动态隐藏

**目前列表顶部默认放置的组件有以下几行 页面没有配置的渲染空行 不显示**

||组件||上下顺序（从上往下 数值递增）||key||备注|
||schemelist||schemeListOrder: 1||schemelist||查询方案|
||tab|| tabOrder: 2||columnfilter||展示查询条件里的一些tabbutton optionwidget等|
||timeline||timeLineOrder: 3||columnfilter2||时间轴组件|
||nav1||nav1Order: 4||navfilter1||导航组件（搜索框 按单 分组等）|
||nav2||nav2Order: 5||navfilter2||导航组件（搜索框 按单 分组等）|

如下图

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liebiaoyemianpeizhiMobileimage13.d41aaeb6.png)

可通过在listview组件对应的cStyle里预制verticalOrderMap来指定以上元素的上下顺序

例如 将上图tab调整到最下面 可以预制verticalOrderMap: { tabOrder: 6 }
调整顺序即可

**动态隐藏**

// 动态隐藏整行

 

// 一次隐藏一行

viewmodel.execute('updateConvientQueryViewMeta', { code: 'navfilter2', visible: false })

// 一次隐藏多行

viewmodel.execute('updateConvientQueryViewMeta', [{ code: 'navfilter2', visible: false }, { code: 'navfilter1', visible: false }])

 

 

// 动态隐藏某个查询条件

 

// 一次隐藏一个

viewmodel.execute('updateTopFilterModelState', { code: itemName, visible: false })

// 一次隐藏多个

viewmodel.execute('updateTopFilterModelState', [{ code: itemName, visible: false }, { code: itemName, visible: false }])

### [](#57-列表或者参照查询区枚举查询条件实现平铺交互)5.7 列表或者参照查询区枚举查询条件实现平铺交互

以下图 单据状态为例

在查询条件extendField：{ topShow: true, showType: "flat" }

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/liebiaoyemianpeizhiMobileimage14.bbda6cb6.png)