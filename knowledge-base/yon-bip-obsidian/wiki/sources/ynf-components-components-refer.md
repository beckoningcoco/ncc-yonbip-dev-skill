---
title: "参照 ReferInput"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/refer"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 15
---

# 参照 ReferInput

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/refer | 所属：YNF-组件

# [](#参照-referinput)参照 ReferInput

### [](#何时使用)何时使用:

参照是单据中常用的比较重要的复杂数据选择控件, 用于数据引用, 如员工选择、部门选择等, 可以选择公共参照或领域自建参照。

### [](#基础用法)基础用法：

- 在设计器左侧组件区域中的内置组件中选择参照组件拖入画布中。

![alt text](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/refer1.92908ae7.png)

- 拖入画布后需要在设计器右侧属性面板中绑定数据源, 绑定的数据源必须是参照类型(单选引用或多选引用)的字段。

![alt text](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/refer2.80d7b1b7.png)

- 可以设置参照的选择模式为单选还是多选, 注意要与所绑定的数据源字段类型一致, 即单选绑定单选引用类型字段, 多选绑定多选引用类型字段。

![alt text](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/refer4.84553210.png)

- 在设计器右侧属性面板点击参照配置, 选择参照(可能会有多条可选参照, 实际上是同一个参照URI), 并选择参照的显示字段, 然后点击确定。

![alt text](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/refer3.16feb13e.png)![alt text](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/refer5.938cfc6c.png)

- 保存设计后, 就可以在预览查看该参照的运行效果。

![alt text](data:image/png;base64,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)

### [](#参照带入)参照带入：

参照是多字段的复杂数据, 除了参照本身, 还可以将参照的任意字段带入到当前表单的其他字段中。
例如上述币种参照中, 除了参照配置了本身的id字段(主键字段)和name字段(显示字段), 我想将"币种简称"字段显示或者保存下来, 就可以使用参照带入功能。

![alt text](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/refer7.4fa4adf2.png)

- 在单据中有另外一个字段"文本"。

![alt text](data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAasAAABACAYAAACk5ViYAAAIDUlEQVR4Ae2dO0/cTBRA85doaPk5aejzCyjpEC1IaZBChZJqC0QBqXZpIq2E9JkijyIrFEESytxPd/zY8ez4uZZ3bJ9iBbvYXu/4zD33zoyXN6sXER60AQzAAAzAQMgMvAn55Dg3Og8MwAAMwIAygKyoLKmsYQAGYCB4BpAVkAYPKZk1mTUMwACyQlbICgZgAAaCZwBZAWnwkJJVk1XDAAwgK2SFrGAABmAgeAaQFZAGDylZNVk1DMAAskJWyAoGYAAGgmcAWQFp8JCSVZNVwwAMICtkhaxgAAZgIHgGkBWQBg8pWTVZNQzAALJCVsgKBmAABoJnAFkBafCQklWTVcMADCArZIWsYAAGYCB4BpAVkAYPKVk1WTUMwACyQlbICgZgAAaCZwBZAWnwkJJVk1XDAAwgK2SFrGAABmAgeAaQFZAGDylZNVk1DMAAstqRrKLvv+V++UM+30dyt/iPB20AAzAweAY0nmlc0/jWdYKBrHYgq2X0JIvlN/n684/8+vtPnl+FB20AAzAweAY0nmlc0/imca5LYSGrnmWlGYdeSCSFoElSYGCsDGh80zjXZYWFrHqWlZbImnmMFVI+FwEYBmBAGdA4p/Guq+oKWfUsKx3TpaqiMxPQYWDsDGic03iHrHqWTFcNrospxg4pn49ADAMwoAxovOsqdlJZ9Sw9ZEUnJpDDwFQYQFY9C6arzECPg6wIVFMJVHxOWEdWyIqhRJY5wwAMBM8AskJWwUNKVk1WDQMwgKwayOrm+ED2jr90Nsm37ZAgw4B0YII4DEyFAWTVQFar6JO83T+Qtx/a3k39JO8PD+Torpvv5moqq/nVR7mcF3fux+uZnFw9lFda0ULOz25lXjBsou9xcjaTWVT8PlPpXHxOGICB7hhAVk1k9SLy8OGd7B1+koeG+8VV1G5l9WxE81HOr1fyPL+VkzMVS/XDbJ/IqUxo2d/02FXSexUxYquxHR2+uw5PW9KWQ2UAWbnSuTuVvf2D1g+tmozQWh3jnbyP6lddTSsrA2lJZZTJxlc1Fcgtq9T07xcLeTT7rmR2UV7FPb+u5DF6kMuzRJ6+9+S18iqX9qF9JsQAsnJlZT83w36ncmO/Zv+eDAvWHdZbS6yZlIrmtlrJKoM7Fkp1ZWUP+alcPEN8OVElmauRomfb7P0bbufux3MCNQxMigFkZctn4/cvcrRfIhZThZXIzD6eiu3wVI50zur4tJOFGtvJanM4pLSy0sDgkZLZ52Im557hxPOrWzn3yc0JMvEx0qps87yGOmzBeXMtYaA7BpCVLRTP72UrAMv+lq+G0rmq9KfIzXGJBD3nkT9ePFTYRFbxwod4fupyXreqSuazkuE9PYbOX6U/a0mmssJan0s2pOjIjA7fXYenLWnLoTKArKrEYIb6PGIpet1zPDP8Z5a8r2VlVha2XqjRXFYxoHXmkoo683oIMJWVHtOWoA4p2osxdF6qcu4qldm1PedVdA68PtRAw3nD7rYMICuPXNwqZrOCiqVTawl7bqjQklW6snCL+7aaVFYxKI48ChZN2PNYmXyMVJyVgxcLmVnL4bXSMtvrtqYac97PUzEZ2dXcdlvY2Z+ACQPDZQBZ1ZDV6kXnrtb3Vxl51amKNqqvvKxWLw2k5znPbmRlL6CwQY5Fk8nKEo1bWaXDd41llQgw3d83J0Zwsa8Jv8PDdBlAVh4JuJWVeW7Ekyxpry0q9wZgV1Y6nJcXofe9C86xG1k51ZKzUKKOrDYqsZqV1bqqSjtgsSAJUmkb8RMWpskAsioQwaY0YtHE92B55rDs4yT3am0OE/pkJdL2mzG6kVW7yioW1K1cth0GNEOQnqXtptoqOqdpdlKCM9cdBvh/VrW+588M++2vq6TsfilvhZUf2su2LbxJOFn6nlRude/ZUpluI6v51UxmuqjBqaTc51ll5cxvpa97F1hUVVbJ8F96DLcj1lplaA1LuvvznOAOA+NjgMrKrojs361hv80KKV6Nl0psr+xeLPuYyRxVEyFtVnjxe28jKxWSEYURUFEVUzwkVzlnlYnEt8Ai/taK8q9jivcr32Z8nZEAyzWFgWIGkFVOJiKr7OuWat7sq/tnYqsYHty1rNwhNo+s8pWSZ5guWa6eVkW6fbpAIltgUSSriooq31ETYWVf4VQMcX4/tqM9YGCMDCArV1YDet58GLCbTrxZWSXV0lkirkRK6byW+Yb25LVUbHU7UyzPouqvm89T91zYjvaGgd0xgKwGJCd3SHBXsqLD7q7D0va0/VQZQFbIalJfhjnVjs7nRnJDZwBZIStklc2xEdCGHtA4//EyjKwGLKvP95H8+vsP2SAbGICBUTOgcU7jnTsV0vb5m7Y7st96OXqTtrhf/pCvP/+MGlIy5fFmylxbrm1dBjTOabxrEh/LtkVWPVdp0fffslh+o7oiqyZhgYHRMqBVlcY5jXdlAmryN2TVs6z04iyjJ3MhNfNgSJBMtW6mynawEjoDGs80rqmoNM41kVHVtshqB7LSi6IZh5bIOqark5A8aAMYgIGhM6DxTONalxVVKjFktSNZpReAn+3m/mg32g0GpsUAskJWnZbqBJBpBRCuN9e7LwaQFbJCVjAAAzAQPAPICkiDh7SvzI33oUqAgXAZQFbIClnBAAzAQPAMICsgDR5Sst1ws12uDdemLwaQFbJCVjAAAzAQPAPICkiDh7SvzI33oUqAgXAZQFbIClnBAAzAQPAMICsgDR5Sst1ws12uDdemLwb+Bz1aOTB19QSsAAAAAElFTkSuQmCC)

- 在参照配置中, 新增一行, 选择将参照"币种简称"字段带入到"文本", 然后点击确定。

![alt text](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/refer9.fddf73ec.png)

- 保存单据后在预览页面中可以看到, 当参照选择数据后, 对应该数据的"币种简称"字段会自动带入到"文本"字段中。

![alt text](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/refer10.7b409ee5.png)

### [](#参照过滤)参照过滤：

有时候参照数据可能会很大, 此时我们可以使用参照过滤功能。

- 在参照配置中, 点击数据过滤页签, 选择要过滤的字段, 然后填写过滤规则, 然后点击确定。

![alt text](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/refer11.bfbd12eb.png)

- 保存单据后在预览页面中打开参照可以看到, 此时的数据只有符合规则的数据。

![alt text](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/refer12.c1b96206.png)

### [](#多行带入)多行带入：

将`multipleLines`属性设置为true, 即可启用多行带入功能, **注意该功能只有在表格中生效**。

![alt text](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/refer13.a959b6b8.png)

表格中的**单选参照**开启`multipleLines`时, 可以选择多条数据。

![alt text](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/refer14.7edc5264.png)

点击确定后, 会将选择的n条参照数据作为n条表格数据插入到表格中, 表格每行只有一条参照数据。

![alt text](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/refer15.d5737db2.png)

### [](#cn非标准单据使用ynf参照)CN(非标准单据)使用YNF参照:

参照依赖 ynf-fw-apcom-lib包，只要是脚手架接入tns，对本地构建资源无任何增加，直接使用即可(移动端依赖ynf-fw-apcom-mobile-lib)

优势: 领域代码中不用再安装任何参照相关的包; 使用系统档案参照，只需要提供refCode及domainKey等极少参数即可。

- 试例代码

import React, { Component } from 'react'

import { ReferInput } from 'ynf-fw-apcom-lib';

 

class YnfCnDemo extends Component {

 constructor (props) {

 super(props);

 

 this.state = {

 refParams: null,

 value: null

 }

 }

 

 componentDidMount () {

 const multiple = true;

 const res = {

 refCode: "ucfbasedoc.bd_countryref",

 multiple,

 refReturn: ['name'],

 domainKey: "developplatform",

 // value: [{id:'1111', name:'张三'}] // 多选 单选{id:'1111', name:'张三'}

 onChange: (arg) => { // 参照选完后的数据

 // 多选直接设置arg 单选设置arg[0]

 },

 beforeOpen: function (arg) { // 参照打开前事件

 console.log('参照打开前', arg);

 }

 // 设计器面板支持的事件 在这里都支持

 }

 this.setState({ refParams: res });

 }

 

 render () {

 const { refParams, value } = this.state;

 return <div>

 {refParams ? <ReferInput value = {value} {...refParams} /> : null}

 

 </div>

 }

}

 

export default YnfCnDemo

- 参照参数及钩子解析

||**参数**||**值**||**默认值**||**是否必填**||**说明**|
||refCode||如："ucfbasedoc.bd_countryref"||无||是||参照编码|
||domainKey||如：“developplatform”||无||是||用来做参照服务转发，前端会根据domainKey转发到对应的参照服务上|
||multiple||如：true||false||否||是否多选|
||onOk||回调函数||无||是||参照选值完成以后回调|
||beforeOpen||回调函数||无||否||参照打开前事件，支持异步|

### [](#参照协议说明)参照协议说明:

**单选参照:**

- 参照协议

点击展开代码块

{

 "store": "mobx://rootStore.formStore", // 主实体对应的store。 // TODO 石婷艳可能需要数据源的alias传给后端，不确定

 "storeField": "adminOrgVO", // 参照元数据字段编码

 "selectType": "single", // 单选/多选参照的标记

 "refCode": "ucf-org-center.bd_adminorgtreeref", // 参照编码

 "pageStore": "mobx://rootStore.pageStore", // 目前是写死的，没有在协议里面定义pageStore

 "refEntityUri": "bd.adminOrg.AdminOrgVO", // 参照对应的实体uri

 "ownDomain": "ucf-org-center", // 和石婷艳确认没有用

 "refReturn": [ // 参照显示。后续标准为数组

 "name"

 ],

 "refReturnArr": "{ \"name\": \"formStore,adminOrgVO_name\" , \"id\": \"formStore,adminOrgVO\" }", // 参照带入右侧信息，默认为主实体store，storeFiled为参照元数据字段拼上下划线和带入字段编码。id的话直接对应参照元数据字段

}

- store协议

点击展开代码块{

 "alias": "adminOrgVO",

 "bizType": "quote",

 "caption": "单选部门(系统)id",

 "field": "adminOrgVO",

 "virtualField": false

},

{

 "alias": "adminOrgVO_name", // 对应的name字段上有参照配置信息。 前端只需要alias和field，冗余信息是不用的

 "bizType": "quote",

 "cRefType": "ucf-org-center.bd_adminorgtreeref", // 参照编码

 "caption": "单选部门(系统)", //

 "field": "adminOrgVO.name", // 数据库查询字段

 "ownDomain": "ucf-org-center", // 和石婷艳确认没有用

 "refEntityUri": "bd.adminOrg.AdminOrgVO", // 冗余字段

 "virtualField": false

}

- 数据源协议

点击展开代码块{

 "alias": "adminOrgVO", // 对应的name字段上有参照配置信息，和鑫导入时需要（TODO不要同步，直接获取？？）

 "bizType": "quote",

 "caption": "单选部门(系统)",

 "field": "adminOrgVO",

 "virtualField": false,

 "refEntityUri": "bd.adminOrg.AdminOrgVO",

 "required": false,

 "fieldCodeInMeta": "referinput60",

 "refReturnArr": "{ \"name\": \"formStore,adminOrgVO_name\" , \"id\": \"formStore,adminOrgVO\" }",

 "refReturn": [

 "name"

 ]

},

{

 "alias": "adminOrgVO_name",

 "bizType": "quote",

 "caption": "单选部门(系统)",

 "field": "adminOrgVO.name",

 "refEntityUri": "bd.adminOrg.AdminOrgVO", // TODO应该在id字段上，不应该在当前字段。主要影响反向

 "virtualField": false

}

**多选参照:**

- 参照协议

点击展开代码块

{

 "store": "mobx://rootStore.formStore", // 主实体对应的store

 "storeField": "org",

 "selectType": "multiple", // 单选/多选参照的标记

 "dataSourceAlias": "lyktest230621001_orgList", // 参照虚拟数据源的alias

 "tableStoreKey": "lyktest230621001_orgListStore", // 参照虚拟store的alias，暂时没用

 "pageStore": "mobx://rootStore.pageStore", // 目前是写死的，没有在协议里面定义pageStore

 "refCode": "developplatform.RefTable_153c7e9e85",

 "refEntityUri": "u9c.base.Org",

 "refReturn": [

 "name"

 ],

 "refReturnArr": "{\"id\":\"lyktest230621001_orgListStore,org\",\"name\":\"lyktest230621001_orgListStore,org_name\"}", // 参照带入右侧信息，默认为多选参照虚拟实体store，storeFiled为参照元数据字段拼上下划线和带入字段编码。id的话直接对应参照元数据字段

}

- store协议

多选参照在主实体store中只需要记录元数据编码对应的alias信息

点击展开代码块

{

 "alias": "org",

 "bizType": "quoteList",

 "caption": "多选组织(系统)id",

 "field": "org",

 "virtualField": true // TODO 和数据源中保持一致，store中实际不起作用。需要和盼刚确认是否为true

}

- 数据源协议

点击展开代码块{

 "alias": "org",

 "bizType": "quoteList",

 "caption": "多选组织(系统)",

 "field": "org",

 "virtualField": true, 

 "required": false,

 "fieldCodeInMeta": "referinput50",

 "refReturnArr": "{\"id\":\"lyktest230621001_orgListStore,org\",\"name\":\"lyktest230621001_orgListStore,org_name\"}",

 "refReturn": "name",

 "refEntityUri": "u9c.base.Org"

}

- store多选参照协议

点击展开代码块{

 "alias": "lyktest230621001_orgListStore", // 主实体alias + 下划线 + 元数据字段 + ListStore

 "caption": "lyktest230621001_orgStore",

 "controlType": "TableStore",

 "storeType": "TableStore",

 "libCode": "ynf-core-store",

 "type": "entity",

 "fieldsArr": [

 {

 "alias": "fkid_id",

 "bizType": "quote",

 "caption": "外键",

 "field": "fkid.id",

 "refEntityUri": "AT16A74ED605C80007.AT16A74ED605C80007.lyktest230621001", // 对应主实体的uri

 "virtualField": false

 },

 {

 "alias": "fkid",

 "bizType": "quote",

 "caption": "外键",

 "field": "fkid",

 "virtualField": false

 },

 {

 "alias": "createTime",

 "bizType": "dateTime",

 "caption": "创建时间",

 "field": "createTime",

 "virtualField": false

 },

 {

 "alias": "modifyTime",

 "bizType": "dateTime",

 "caption": "修改时间",

 "field": "modifyTime",

 "virtualField": false

 },

 {

 "alias": "creator_userName",

 "bizType": "quote",

 "caption": "创建人",

 "field": "creator.userName",

 "virtualField": false

 },

 {

 "alias": "modifier_userName",

 "bizType": "quote",

 "caption": "修改人",

 "field": "modifier.userName",

 "virtualField": false

 },

 {

 "alias": "id",

 "caption": "id",

 "field": "id",

 "virtualField": false

 },

 {

 "alias": "pubts",

 "bizType": "dateTime",

 "caption": "pubts",

 "field": "pubts",

 "virtualField": false

 },

 {

 "alias": "org",

 "bizType": "quote",

 "caption": "多选组织(系统)id",

 "field": "org",

 "virtualField": false

 },

 {

 "alias": "org_name", // 参照带入时需要添加对应的字段，规则为 元数据字段 + 带入字段

 "field": "org.name",

 "caption": "多选组织(系统)__name临时",

 "bizType": "quote",

 "ideDesignType": "ysmdd",

 "virtualField": true // TODO 和盼刚确认是否应该为true

 }

 ]

}

- 数据源多选参照协议

点击展开代码块{

 "alias": "lyktest230621001_orgList", // 主实体alias + 下划线 + 元数据字段 + List

 "caption": "lyktest230621001_org",

 "controlType": "datasource",

 "dataPattern": "TAG", // 类型为TAG

 "type": "entity",

 "uri": "AT16A74ED605C80007.AT16A74ED605C80007.lyktest230621001_org",

 "fieldsArr": [

 {

 "alias": "org_id",

 "bizType": "quote",

 "caption": "多选组织(系统)",

 "field": "org.id",

 "refEntityUri": "u9c.base.Org",

 "virtualField": false,

 },

 {

 "alias": "org",

 "bizType": "quote",

 "caption": "多选组织(系统)",

 "field": "org",

 "virtualField": false

 },

 {

 "alias": "fkid_id",

 "bizType": "quote",

 "caption": "外键",

 "field": "fkid.id",

 "refEntityUri": "AT16A74ED605C80007.AT16A74ED605C80007.lyktest230621001", // 对应主实体的uri

 "virtualField": false

 },

 {

 "alias": "fkid",

 "bizType": "quote",

 "caption": "外键",

 "field": "fkid",

 "virtualField": false

 },

 {

 "alias": "sourceGrandId",

 "bizType": "text",

 "caption": "来源孙表id",

 "field": "sourceGrandId",

 "virtualField": false

 },

 {

 "alias": "firstId",

 "bizType": "text",

 "caption": "来源单据主表id",

 "field": "firstId",

 "virtualField": false

 },

 {

 "alias": "firstChildId",

 "bizType": "text",

 "caption": "来源单据子表id",

 "field": "firstChildId",

 "virtualField": false

 },

 {

 "alias": "firstBusiObj",

 "bizType": "text",

 "caption": "来源业务对象",

 "field": "firstBusiObj",

 "virtualField": false

 },

 {

 "alias": "firstCode",

 "bizType": "text",

 "caption": "来源单据号",

 "field": "firstCode",

 "virtualField": false

 },

 {

 "alias": "bizflowId",

 "bizType": "text",

 "caption": "业务流id",

 "field": "bizflowId",

 "virtualField": false

 },

 {

 "alias": "bizflowName",

 "bizType": "text",

 "caption": "流程名称",

 "field": "bizflowName",

 "virtualField": false

 },

 {

 "alias": "sourceId",

 "bizType": "text",

 "caption": "上游单据主表id",

 "field": "sourceId",

 "virtualField": false

 },

 {

 "alias": "sourceChildId",

 "bizType": "text",

 "caption": "上游单据子表id",

 "field": "sourceChildId",

 "virtualField": false

 },

 {

 "alias": "bizFlowInstanceId",

 "bizType": "text",

 "caption": "业务流实例id",

 "field": "bizFlowInstanceId",

 "virtualField": false

 },

 {

 "alias": "sourceBusiObj",

 "bizType": "text",

 "caption": "上游业务对象",

 "field": "sourceBusiObj",

 "virtualField": false

 },

 {

 "alias": "sourceCode",

 "bizType": "text",

 "caption": "上游单据号",

 "field": "sourceCode",

 "virtualField": false

 },

 {

 "alias": "bizFlowMakeBillCode",

 "bizType": "text",

 "caption": "单据转换规则编码",

 "field": "bizFlowMakeBillCode",

 "virtualField": false

 },

 {

 "alias": "createTime",

 "bizType": "dateTime",

 "caption": "创建时间",

 "field": "createTime",

 "virtualField": false

 },

 {

 "alias": "modifyTime",

 "bizType": "dateTime",

 "caption": "修改时间",

 "field": "modifyTime",

 "virtualField": false

 },

 {

 "alias": "creator_userName",

 "bizType": "quote",

 "caption": "创建人",

 "field": "creator.userName",

 "virtualField": false

 },

 {

 "alias": "modifier_userName",

 "bizType": "quote",

 "caption": "修改人",

 "field": "modifier.userName",

 "virtualField": false

 },

 {

 "alias": "id",

 "caption": "id",

 "field": "id",

 "virtualField": false

 },

 {

 "alias": "pubts",

 "bizType": "dateTime",

 "caption": "pubts",

 "field": "pubts",

 "orderBy": "desc",

 "virtualField": false

 },

 {

 "alias": "org_name",

 "field": "org.name",

 "caption": "多选组织(系统)__name临时",

 "bizType": "quote",

 "virtualField": false

 }

 ]

}

### [](#api文档)API文档：

公共属性和方法见[组件公共属性和方法](#/components/common)

||**编码**||**名称**||**类型**||**描述**||**默认值**|
||selectType||选择模式||"single" | "multiple"||single为单选参照, multiple为多选参照, 正向时跟随绑定实体, 不可更改||"single"|
||defaultValue||参照默认值||object | array||单选参照默认值是一个包含所有参照字段的对象, 多选参照默认值是一个包含所有参照字段的对象数组|||
||subuiType||展现方式||"modal" | "drop"||modal按弹窗显示, drop按下拉显示||"modal"|
||treetableFilter||树表参照过滤||"TreeTable" | "Tree" | "Table"||TreeTable同时过滤, Tree只过滤树, Table只过滤表||"TreeTable"|
||cardBillno||参照新增编辑单号||string|||||
||modalTitle||弹窗标题||string|||||
||modalWidth||弹窗宽度||number|||||
||modalHeight||弹窗高度||number|||||
||modalDraggable||弹窗可拖拽||boolean||||true|
||modalResizable||弹窗可调整尺寸||boolean||||true|
||modalMaximize||弹窗可最大化||boolean||||true|
||hideSelectedInfo||隐藏已选||boolean||||false|
||addonBefore||前缀||string|||||
||addonAfter||后缀||string|||||
||showCEntityKeyFld||无显示值时显示主键值||boolean||||false|
||isAutoShowName||无显示值时自动查询回显||boolean||||true|
||isMasterOrg||是否主组织||boolean||||false|
||bSmartSearch||是否智能搜索||boolean||||false|
||referValid||输入是否校验||boolean||||true|
||bCanHandleInput||允许参照输入||boolean||||true|
||multipleLines||多行带入||boolean||只有在表格中生效||true|

**动作介绍：**

||**编码**||**名称**||**描述**|
||onBeforeChange||值改变前|||
||onAfterChange||值改变后|||
||beforeOpen||打开参照弹窗前|||
||onOpen||打开参照弹窗|||
||onGetReferData||参照数据加载前||参照列表数据请求接口发送前, 回调参数为请求接口中的参数, 可在此修改请求参数|
||onChangeSelect||修改参照选项时|||
||onOk||参照确定|||
||onClear||参照清空|||
||onClose||关闭参照弹窗|||
||onChangePageIndex||表参照切换页码时|||
||onSearchTableRef||表参照查询时|||