---
title: "CN使用MDF报表"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/08-cn-use-mdf-report"
section: "协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 协议]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# CN使用MDF报表

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/08-cn-use-mdf-report | 所属：协议

# [](#cn使用mdf报表)CN使用MDF报表

## [](#1-目标与效果)1. 目标与效果

- 配置的汇总条件可以在移动门户上展示汇总组件

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/cn-mdf-baobiao1.4e373b9e.png)

- 配置的分组条件可以在移动门户上展示图表组件

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/cn-mdf-baobiao2.15d83062.png)

- 能获取到指标数据，能点击指标数据穿透打开指标列表

## [](#2-如何使用)2. 如何使用

### [](#21-预加载mdf资源)2.1. 预加载MDF资源

#### [](#211-资源加载)2.1.1. 资源加载

方式1：通过script标签引入

<script src="https://<工作台域名>/mdf-node/mdf/resource?mdfrefer=true"></script>

方式2：通过require引入

require("https://<工作台域名>/mdf-node/mdf/resource?mdfrefer=true")

**注意：**

- 资源加载完成后会调用window.cbReady()，所以对于以下API的调用请在window.cbReady()后使用。
- 以上示例是日常环境，其它环境域名可通过在控制台打印 **cb.utils.getNodeServerUrl()** 获取
- 如果存在跨域问题请在cbReady中执行 **cb.rest.setServiceUrl(cb.utils.getNodeServerUrl())**

#### [](#212-常见问题)2.1.2. 常见问题

// 解决时机问题

if (cb.cn) {

 cb.cn.query.getPageTotal(...)

} else {

 window.cbReady = () => {

 cb.cn.query.getPageTotal(...)

 }

}

// 解决跨域问题

if (cb.rest || cb.utils) {

 cb.rest.setServiceUrl(cb.utils.getNodeServerUrl())

} else {

 window.cbReady = () => {

 cb.rest.setServiceUrl(cb.utils.getNodeServerUrl())

 }

}

### [](#22-图表卡片)2.2. 图表卡片

#### [](#221-渲染图表组件)2.2.1. 渲染图表组件

**示例**

// 渲染图表组件

cb.cn.charts.render({

 dom: document.getElementById('documentId'), // 要挂载到的dom对象节点, 必传

 config: {

 billnum: 'rm_saleanalysis',

 domainKey: 'retail',

 theme: 'light',

 groupSchemaName: '',

 displayStyle: '',

 chartConfig: {},

 pageLayout: {},

 condition: {

 commonVOs: [

 {

 itemName: 'schemeName',

 value1: '默认方案'

 },

 {

 itemName: 'isDefault',

 value1: true

 },

 {

 value1: '2021-06-27 00:00:00',

 value2: '2021-07-26 23:59:59',

 itemName: 'vouchdate'

 },

 {

 value1: '0',

 itemName: 'deliverystatistics'

 }

 ],

 filtersId: '3198344',

 }

 }

});

**属性说明**

||属性||含义||必输||类型||默认值|
||dom||DOM对象||是||||无|
||config||参数||是||{}||无|
||--billnum||单据编码||是||''||无|
||--domainKey||领域Key||是||''||无|
||--groupSchemaName||分组条件Name||是||''||无|
||--theme||图表主题颜色(light明亮,dark暗黑)||否||''||light|
||--condition||查询条件||否||{}||无|
||----commonVOs||方案查询对象||否||[]||无|
||------itemName||字段名称||否||''||无|
||------value1||值1||否||''||无|
||------value2||值2||否||''||无|
||----filtersId||过滤器ID||否||''||无|
||model||编程模型||否||||new ContainerModel `<br>`可传对应的编程模型|

**获取分组条件列表**

**示例**

// 获取分组条件列表

cb.cn.charts.getGroupSchemaList({

 billnum: "rm_saleanalysis",

 domainKey: "retail"

});

**注意：** 该方法会返回被promise包裹的汇总条件，可使用promise.then或await接收返回值

**属性说明**

||**属性**||**含义**||**必输**||类型||默认值|
||billnum||单据编码||是||''||无|
||domainKey||领域Key||是||''||无|

### [](#23-汇总卡片)2.3. 汇总卡片

#### [](#231-渲染汇总组件)2.3.1. 渲染汇总组件

**示例**

// 渲染汇总组件

cb.cn.summary.render({

 dom: document.getElementById('documentId'), // 要挂载到的dom对象节点,必传

 config: {

 billnum: 'rm_saleanalysis',

 domainKey: 'retail',

 condition: {

 commonVOs: [

 {

 itemName: 'schemeName',

 value1: '默认方案'

 },

 {

 itemName: 'isDefault',

 value1: true

 },

 {

 value1: '2021-06-27 00:00:00',

 value2: '2021-07-26 23:59:59',

 itemName: 'vouchdate'

 },

 {

 value1: '0',

 itemName: 'deliverystatistics'

 }

 ],

 filtersId: '3198344',

 },

 }

});

**属性说明**

||**属性**||**含义**||**必输**||**类型**||**默认值**|
||dom||DOM对象||是||||无|
||config||参数||是||{}||无|
||--billnum||单据编码||是||''||无|
||--domainKey||领域Key||是||''||无|
||--summaries||分组项列表||是||[]||无|
||----caption||分组项标题||是||''||无|
||----fieldname||分组项字段||是||''||无|
||--condition||查询条件||否||{}||无|
||----commonVOs||方案查询对象||否||[]||无|
||------itemName||字段名称||否||''||无|
||------value1||值1||否||''||无|
||------value2||值2||否||''||无|
||----filtersId||过滤器ID||否||''||无|
||model||编程模型||否||||new ContainerModel
可传对应的编程模型|

#### [](#232-获取汇总项)2.3.2. 获取汇总项

**示例**

// 获取汇总项

cb.cn.summary.getSummaryList({ 

 billnum: "rm_saleanalysis", 

 domainKey: "retail"

});

**注意：** 该方法会返回被promise包裹的汇总条件，可使用promise.then或await接收返回值

**属性说明**

||**属性**||**含义**||**必输**||**类型**||**默认值**|
||billnum||单据编码||是||''||无|
||domainKey||领域Key||是||''||无|

### [](#24-指标卡片)2.4. 指标卡片

#### [](#241-获取指标数)2.4.1. 获取指标数

**示例**

// 获取指标数

cb.cn.query.getPageTotal({

 "billnum": "st_storenoticelist",

 "domainKey": "upu",

 "condition": {

 "commonVOs": [

 {

 "itemName": "schemeName",

 "value1": "默认方案"

 },

 {

 "itemName": "isDefault",

 "value1": false

 },

 {

 "value1": "2",

 "itemName": "bizstatus"

 }

 ],

 "filtersId": "1973008"

 }

});

**注意：** 该方法会返回被promise包裹的汇总条件，可使用promise.then或await接收返回值

**参数说明**

||**属性**||**含义**||**必输**||**类型**||**默认值**|
||billnum||单据编码||是||''||无|
||domainKey||领域Key||是||''||无|
||serviceCode|||||||||
||condition||查询条件||是||{}||无|
||--commonVOs||方案查询对象||是||[]||无|
||----itemName||字段名称||是||''||无|
||----value1||值1||是||''||无|
||----value2||值2||否||''||无|
||--filtersId||过滤器ID||否||''||无|

**返回值说明**

||**属性**||**含义**||**类型**|
||recordCount||指标数||123|
||其它属性暂时没用|||||

#### [](#242-指标项跳转页面)2.4.2. 指标项跳转页面

**示例**

// 获取汇总项

window.openBill(url,

{

 condition: {

 "commonVOs": [

 {

 "itemName": "schemeName",

 "value1": "默认方案"

 },

 {

 "itemName": "isDefault",

 "value1": false

 },

 {

 "value1": "2",

 "itemName": "bizstatus"

 }

 ],

 "filtersId": "1973008"

 }

});

**参数说明**

||**属性**||**含义**||**必输**||**类型**||**默认值**|
||url||轻应用对应的URL||是||''||无|
||condition||查询条件||是||{}||无|

condition属性说明：

||**属性**||**含义**||**必输**||**类型**||**默认值**|
||condition||查询条件||是||{}||无|
||--commonVOs||方案查询对象||是||[]||无|
||----itemName||字段名称||是||''||无|
||----value1||值1||是||''||无|
||----value2||值2||否||''||无|
||--filtersId||过滤器ID||否||''||无|