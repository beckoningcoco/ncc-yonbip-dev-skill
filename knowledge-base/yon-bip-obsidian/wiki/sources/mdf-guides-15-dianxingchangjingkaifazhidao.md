---
title: "典型场景开发指导"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/15-dianxingchangjingkaifazhidao"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 4
---

# 典型场景开发指导

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/15-dianxingchangjingkaifazhidao | 所属：指南

# [](#典型场景开发指导)典型场景开发指导

## [](#开发指导汇总)开发指导汇总

### [](#一多卡片显示和隐藏)一、多卡片显示和隐藏

**1、元数据的XML配置**

配置元数据为多个实体，实体之间的关系为一对一，此处不做配置的详细说明

此方式需要配置roleAMulti="0..n"

**2、UI元数据的Excel配置**

配置红框中的前3条数据为groupcontainer、group、div，代表基础组织卡片区域，后3条数据代表行政组织卡片区域，里面的属性不作详细明说
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/dianxingchangjingkaifazhidao_image1.3ca49439.png)

[Excel示例附件]([https://docs.yonyoucloud.com/l/2dB14a127b8B](https://docs.yonyoucloud.com/l/2dB14a127b8B) 【友空间云文档】excel示例.xlsx)

**3、指定子表编辑的数据**

由于处理 一主一子 关系时认为 一主一子 是 一主多子
的特殊情况，所以需要主动告诉模型当前是 一主一子
的情况，框架在进行操作时会特殊处理

主动告知方法：

viewmodel.getGridModel().setState('defaultSelectedRowIndexes', true);

//或

viewmodel.get('bd_org_admin').setState('defaultSelectedRowIndexes', true);

viewmodel.get('<子表ViewModel的Key>').setState('defaultSelectedRowIndexes', true);

**4、控制行政区域卡片隐藏**

下面代码中的bd_org_admin_head_page为行政区域最外的GroupContainer容器的cCode

cb.define(['common/common_VM.Extend.js'], function (common) {

 var bd_bd_org_VM_Extend = {

 doAction: function (name, viewmodel) {

 if (this[name])

 this[name](viewmodel);

 },

 init: function (viewmodel) {

 viewmodel.get('adminOrgVO').setState('defaultSelectedRowIndexes', true);

 viewmodel.get('financeOrgVO').setState('defaultSelectedRowIndexes', true);

 viewmodel.get('corporateOrgVO').setState('defaultSelectedRowIndexes', true);

 viewmodel.get('factoryOrgVO').setState('defaultSelectedRowIndexes', true);

 viewmodel.get('inventoryOrgVO').setState('defaultSelectedRowIndexes', true);

 viewmodel.get('salesOrgVO').setState('defaultSelectedRowIndexes', true);

 viewmodel.get('purchaseOrgVO').setState('defaultSelectedRowIndexes', true);

 

 viewmodel.on("afterLoadData",function(){

 if (viewmodel.getParams().mode=="add") {

 viewmodel.get('adminOrgVO').appendRow();

 viewmodel.get('financeOrgVO').appendRow();

 viewmodel.get('corporateOrgVO').appendRow();

 viewmodel.get('factoryOrgVO').appendRow();

 viewmodel.get('inventoryOrgVO').appendRow();

 viewmodel.get('salesOrgVO').appendRow();

 viewmodel.get('purchaseOrgVO').appendRow();

 }

 });

 

 viewmodel.execute('updateViewMeta', {

 code: 'bd_org_admin_head_page',

 visible: false

 });

 }

 }

 try {

 module.exports = bd_bd_org_VM_Extend;

 } catch (error) {

 

 }

 return bd_bd_org_VM_Extend;

});

**5、updateViewMeta方法说明**

用于更新容器的ViewMeta，除visible之外，还支持refresh和disabled

- 

visible：是否显示，true-显示 | flase-隐藏

- 

refresh：是否刷新，true-刷新 | flase-不刷新

- 

disabled：是否可用，true-可用 | flase-不可用

viewmodel.execute('updateViewMeta', {

 code: 'bd_org_admin_head_page',

 visible: false,

 refresh: true

});

### [](#二自由单据使用-freeview)二、自由单据使用 FreeView

**1、元数据的XML配置**

配置元数据为两个实体，实体之间的关系没有关系，此处不做配置的详细说明

**2、UI元数据的Excel配置**

注意事项：

- 

如果实体需要用非SimpleModel的模型渲染，则需要在Excel中指定cModelType类型，如：下例会某个实体为Table，需要指定cModelType为GridModel

- 

如果需要页面展示为左右两个表格，则需要指定其中一个表格的cAlign属性为left，框架会把标记为left的容器放在左边显示

- 

需要指定bill_type表的cBillType为FreeView

- 

需要注意配置表格中列表的列宽，如配置iColWidth为150，即表格列宽为150px

- 

为左右表格的父容器设置iCols属性为2

- 

在单据信息里配置默认过滤器，属性cFilterId

[Excel示例附件.xlsx]([https://docs.yonyoucloud.com/l/308C9ABD1174](https://docs.yonyoucloud.com/l/308C9ABD1174) 【友空间云文档】示例1.xlsx)

**3、扩展脚本编写**

使用setDataSource请求数据并灌入表格中，代码如下：

cb.define(['common/common_VM.Extend.js'], function (common) {

 var bd_bd_rcc_VM_Extend = {

 doAction: function (name, viewmodel) {

 if (this[name])

 this[name](viewmodel);

 },

 init: function (viewmodel) {

 viewmodel.get('bd_rcc_base').setDataSource(

 { url: '/bill/list', method: 'POST' },

 { billnum: 'bd_rcc', condition: {} });

 viewmodel.get('bd_rcc_admin').setDataSource(

 { url: '/bill/list', method: 'POST' },

 { billnum: 'bd_rcc', condition: {} });

 }

 }

 try {

 module.exports = bd_bd_rcc_VM_Extend;

 } catch (error) {

 

 }

 return bd_bd_rcc_VM_Extend;

});

### [](#三表格滚动条分页联动)三、表格滚动条、分页联动

**1、滚动条联动**

当一个表格滚动时，另一个表格同步滚动。实现这个功能需要两个方法，一个时表格滚动的监听事件，另一个是设置表格滚动位置。

滚动条事件监听

gridModel.on('verticalScroll',(position)=>{

 //设置滚动条的位置

 otherGridModel.setScrollTop(position);

})

**2、分页联动**

同步分页的pageSize、pageIndex。实现这个功能需要有分页pageInfoChange的监听事件、模型层设置分页的pageSize、pageIndex事件。 
 

//分页监听事件

gridModel.on('pageInfoChange',(pageInfoChange)=>{

 

})

//设置分页pageIndex

gridModel.setPageIndex(nextPageIndex)

 

//设置分页的pageSize

gridModel.setPageSize(nextPageSize);

整体代码：

cb.define(['common/common_VM.Extend.js'], function (common) {

 /**

 * 同步滚动效果

 * @param {*} gridModel 改变的表格

 * @param {*} otherGridModel 待同步的表格

 */

 function _scrollChange(gridModel,otherGridModel){

 gridModel.on('verticalScroll',(position)=>{

 otherGridModel.setScrollTop(position);

 })

 };

 /**

 * 同步分页效果

 * @param {Object} gridModel 改变的表格

 * @param {Object} otherGridModel 待同步的表格

 */

 function _pageChange(gridModel,otherGridModel){

 gridModel.on('pageInfoChange',(pageInfoChange)=>{

 

 const nextPageIndex = pageInfoChange.pageIndex;

 const nextPageSize = pageInfoChange.pageSize;

 const currentPageIndex = otherGridModel.getPageIndex();

 const currentPageSize = otherGridModel.getPageSize();

 //注意：这里需要判断是否相等，否则会无线运行下去

 if(nextPageIndex !== currentPageIndex){

 otherGridModel.setPageIndex(nextPageIndex);

 }

 if(nextPageSize !== currentPageSize){

 otherGridModel.setPageSize(nextPageSize);

 }

 })

 }

 var bd_bd_rcc_VM_Extend = {

 doAction: function (name, viewmodel) {

 if (this[name])

 this[name](viewmodel);

 },

 init: function (viewmodel) {

 const url = '/bill/list';

 const vmName = 'bd_rcc';

 

 let leftGrid = viewmodel.get('bd_rcc_base');

 let rightGrid = viewmodel.get('bd_rcc_admin');

 //请求数据

 leftGrid.setDataSource(

 {url:url,method:'POST'},

 {billnum:vmName});

 rightGrid.setDataSource(

 {url:url,method:'POST'},

 {billnum:vmName});

 // 滚动条联动

 _scrollChange(leftGrid,rightGrid);

 _scrollChange(rightGrid,leftGrid);

 // 分页联动

 _pageChange(leftGrid,rightGrid);

 _pageChange(rightGrid,leftGrid);

 

 }

 }

 try {

 module.exports = bd_bd_rcc_VM_Extend;

 } catch (error) {

 

 }

 return bd_bd_rcc_VM_Extend;

});

### [](#四扩展css样式)四、扩展CSS样式

**1、创建样式扩展文件并编写样式类**

- 

创建样式src/client/styles/extend.less

- 

在src/client/index.jsx中引用上面的样式文件

- 

编写样式类

.padding-60{

 padding: 60px !important;

}

 

.padding-left-30{

 padding-left: 30px !important;

}

 

.padding-right-30{

 padding-right: 30px !important;

}

**2、在Excel中对应的容器配置cStyle属性**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/dianxingchangjingkaifazhidao_image2.3320480e.png)

**3、打开运行时界面查看运行效果**

### [](#五过滤器及方案配置)五、过滤器及方案配置

**1、单据信息表配置**

单据信息表中为单据配置默认过滤器，属性为cFilterId，值为pb_meta_filters表的主键

**2、配置过滤方案4张表**

配置pb_meta_filters、pb_meta_filter_item、pb_filter_solution、pb_filter_solution_common数据

pb_meta_filters：过滤器，配置过滤器，可以配置多个过滤器，单据中配置默认过滤器，目前框架也支持在运行时配置单据过滤器

pb_meta_filter_item：过滤项，过滤项字段必需是billitem_base中的字段且字段bFilter必需开启

pb_filter_solution：过滤方案，过滤的最大单位

pb_filter_solution_common：过滤方案公共

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/dianxingchangjingkaifazhidao_image3.8e506e6d.png)

### [](#六表格列表树使用)六、表格|列表树使用

**1、元数据的XML配置**
无

**2、UI元数据的Excel配置**

配置表格类型(cContorlType)为TreeTable

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/dianxingchangjingkaifazhidao_image4.af7c6757.png)

[Excel配置示例.xlsx]([https://docs.yonyoucloud.com/l/40390544C50E](https://docs.yonyoucloud.com/l/40390544C50E) 【友空间云文档】UI元数据的Excel配置示例.xlsx)

**3、框架更改**

更改文件：src/yxyweb/client/common/referViewModel.js

解决问题：

- 

树表参照的配置

- 

参照不支持树表模型

- 

搜索到的结果不显示

- 

搜索内容为空时，搜索全部数据

- 

显示全部按钮不生效

- 

搜索结果分页

**4、添加逻辑控制**

包含下级

### [](#九设置列表无分页)九、设置列表无分页

默认列表为分页列表，如果想设置让列表不分页，可通过扩展脚本，设置GridModel的pagination属性为false

viewmodel.getGridModel().setState('pagination', true);

### [](#十子表参照多选显示一行)十、子表参照多选（显示一行）

[Excel配置示例.xlsx]([https://docs.yonyoucloud.com/l/3410ef687C7d](https://docs.yonyoucloud.com/l/3410ef687C7d) 【友空间云文档】子表参照多选（显示一行）配置示例.xlsx)

- 

配置bill_entity_base参照对应的实体为TagModel，附件Excel第12行

- 

配置一个隐藏的容器，附件Excel第31行

- 

配置字段属性，附件Excel第49、56、57行

备注： 如果是主表多选参照，参考[Refer参照常用扩展梳理](#/guides/05-canzhaochangyongkuozhanshuli) 第九条