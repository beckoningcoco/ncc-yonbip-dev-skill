---
title: "模板开发"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/guides/g01-template-development"
section: "YNF-开发指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 开发指南]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 模板开发

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/guides/g01-template-development | 所属：YNF-开发指南

# [](#模板开发)模板开发

## [](#freemark介绍)Freemark介绍

Freemarker（FreeMarker Template Language，简称FTL）是一款基于Java的模板引擎，它允许开发者根据模板和数据生成输出文本，如HTML网页、电子邮件、配置文件、源代码等。以下是对Freemarker的详细介绍：

### [](#一基本概述)一、基本概述

- **定义**：Freemarker是一个Java类库，用于生成文本输出，如HTML网页，它通过模板和数据模型来实现。
- **开发者**：最初由Benjamin Geer和Mike Bayer编写，后来Jonathan Revusky等人对其进行了重写和扩展。
- **许可证**：基于Apache许可证2.0版本发布，是一款免费的开源软件。
- **最新版本**：截至当前时间（2024年07月10日），FreeMarker的最新版本可能有所更新，但最新稳定版本的信息可以在其[官方网站](http://freemarker.apache.org/)或相关资源中查找到。

### [](#二特点与优势)二、特点与优势

- **通用性高**：Freemarker可以生成多种类型的文本输出，不仅限于HTML，还包括电子邮件、配置文件等。
- **模板语言强大**：Freemarker模板语言（FTL）简单且功能强大，支持条件语句、迭代、自定义函数等，提供了丰富的内建函数和指令。
- **分离视图和业务逻辑**：通过模板文件（.ftl文件）与业务逻辑的分离，提高了开发效率和可维护性。
- **跨平台性**：作为Java模板引擎，Freemarker可以在任何支持Java的平台上运行。

### [](#三应用场景)三、应用场景

- **Web开发**：在MVC模式的Web开发框架中生成HTML页面，是Freemarker最常见的应用场景。
- **页面静态化**：对于访问量大或数据变化不频繁的页面，可以使用Freemarker生成静态页面以提高访问速度和并发量。
- **文本生成**：Freemarker还可以用于生成电子邮件模板、配置文件、源代码等文本内容。

### [](#四基本用法)四、基本用法

- **模板编写**：使用Freemarker Template Language（FTL）编写模板文件，这些文件通常以.ftl为扩展名。
- **数据模型**：准备一个数据模型，这个模型包含了模板需要填充的数据。数据模型可以是一个简单的对象、集合或更复杂的数据结构。
- **生成输出**：通过Freemarker引擎将模板文件与数据模型结合，生成最终的输出文本。

### [](#五重要概念)五、重要概念

- **插值**：在模板中使用${...}来输出数据模型中的值。
- **FTL标签**：类似于HTML标签，但用于Freemarker的指令，如<#if>、<#list>等。
- **注释**：使用<#-- ... -->来添加注释，这些注释不会出现在最终的输出中。

## [](#datamodal对象)DataModal对象

### [](#一概述)一、概述

FreeMarker的数据模型（Data Model）是模板引擎的核心部分，它定义了模板中可用的变量和这些变量的值。数据模型以树状结构的形式存在，允许开发者在模板中通过变量名来访问和渲染数据。
FreeMarker的数据模型本质上是一个树状结构的name-value对集合，类似于Java中的Map或哈希表。这个模型为模板提供了需要渲染的数据。数据模型中的每个节点都可以是一个简单的数据类型（如字符串、数字、布尔值）或一个复杂的数据结构（如列表、哈希表、Java对象等）。

### [](#二数据模型参数说明)二、数据模型参数说明

{

 "isSupportBpm": true,

 "appCode": "NCPxxxx",

 "cName": "单卡详情",

 "cCardKey": null,

 "enumTypes": [

 "sys_verifystate",

 "sys_intboolean"

 ],

 "entityList": [],

 "cBillType": "YYArchive",

 "tenant_id": "租户ID",

 "cBillNo": "xxxxxx1",

 "buttonPermissions": {

 "hasApprovalOpinions": true,

 "hasMasterOrg": false,

 "hasBizFlow": true,

 "hasDocStatus": true,

 "hasApprove": true

 },

 "filter": {},

 "ownDomain": "developplatform"

}

||**属性**||**类型**||**说明**|
||tenant_id||String||租户ID|
||busiObj||String||业务对象|
||cBillNo||String||单据编号|
||isSupportBpm||Boolean||是否支持审批流|
||enumTypes||Array||所有枚举的枚举类型|
||appCode||String||应用编码|
||filter||Object||查询区数据|
||ownDomain||String||所属微服务|
||cName||String||单据名称|
||entityList||Array||实体数据|
||cBillType||String||单据类型(单卡、列表等)|
||cCardKey||String||单据类型。跳转目标表单的单据编号(对于列表来说，此字段代表列表所对应的单据详情的cBillNo）|
||其值为要跳转目标表单的cBillNo|||||
||buttonPermissions||Array||按钮权限。实体勾选服务返回对应服务所需按钮权限|
||iSystem||number||0：非系统，1：系统；系统预制，给二开预留|

#### [](#filter-查询区参数说明)filter 查询区参数说明

"filter": {

 "tenant_id": "0000LVJDDN4J99XVRL0000",

 "filterItemList": [

 {

 "itemType": "ReferInput",

 "itemTitle": "部门参照",

 "referCode": "ucf-org-center.bd_adminorgtreeref",

 "multSelect": 0,

 "dr": 0,

 "itemName": "DeptReferInput1kg",

 "isCommon": 1,

 "refReturn": "id",

 "compareLogic": "eq",

 "mustInput": 0,

 "xLibCode": "ynf-fw-apcom-mobile-lib",

 "isSolution": true,

 "multiple": false,

 "BizType": "quote",

 "displayname": "name",

 "dataSource": "DeptReferInput1kg"

 },

 ],

 "filterDesc": "参照过滤"

}

||**属性**||**类型**||**说明**|
||tenant_id||String||租户ID|
||filterDesc||String||所属查询模型描述|
||filterItemList||Array||查询区内组件数据|

##### [](#filteritemlist-参数说明)filterItemList 参数说明

||**属性**||**类型**||**说明**|
||itemType||String||组件编码|
||itemTitle||String||组件显示名称|
||xLibCode||String||组件库编码|
||displayName||String||参照类型|
||isSolution||boolean||是否为默认方案字段|
||multiple||boolean||是否开启多选|
||BizType||String||运行时默认数据格式|
||dataSource||String||关联数据源|
||compareLogic||String||比较符|
||referCode||String||参照注册编码|
||refReturn||String||参照返回显示字段|
||cEnumType||String||枚举类型|

#### [](#entitylistsubentity-实体参数说明)entityList、subEntity 实体参数说明

"entityList": [

 {

 "cDataSourceName": "appCode.appCode.xxxxxx",

 "subEntity": [

 {

 "includeVirtualEntity": false,

 "cPrimaryKey": "id",

 "isprint": 1,

 "cDataSourceName": "appCode.appCode.xxxxxx_NocSubTable5li",

 "hasDocStatus": false,

 "childrenField": "xxxxxx_NocSubTable5liList",

 "hasApprove": false,

 "isDeleted": 0,

 "cName": "子表单",

 "iSystem": 1,

 "alias": "xxxxxx_NocSubTable5liList",

 "iOrder": 0,

 "cParentCode": "xxxxxx_84d7a24bf79943a1a9c7e8482490",

 "cModeType": "",

 "cCode": "xxxxxx_nocsubtable5li_e5d8d9b0498a4",

 "cMainClassId": "",

 "hasBizFlow": false,

 "bMain": false,

 "hasMasterOrg": false,

 "cForeignKey": "xxxxxx_id",

 "itemList": [

 {

 "bEnum": false,

 "bShowInRowAuth": false,

 "iFieldType": 1,

 "bRowAuthDim": false,

 "bVmExclude": 0,

 "cName": "NocReferInput10ug_name",

 "iSystem": 1,

 "refReturn": "name",

 "bCanModify": true,

 "bPrintUpCase": false,

 "isExport": 1,

 "BizType": "quote",

 "bExtend": false,

 "bMustSelect": true,

 "cControlType": "ReferInput",

 "bShowIt": true,

 "bJointQuery": false,

 "cFieldName": "NocReferInput10ug.name",

 "cCaption": "币种参照",

 "bPrintCaption": true,

 "auth_level": 3,

 "isshoprelated": 0,

 "isprint": 1,

 "enterDirection": 4,

 "cDataSourceName": "appCode.appCode.xxxxxx_NocSubTable5li",

 "iMaxShowLen": 36,

 "refEntityUri": "bd.currencytenant.CurrencyTenantVO",

 "isDeleted": 0,

 "bSplit": false,

 "bHidden": false,

 "iOrder": 1,

 "xLibCode": "ynf-fw-apcom-mobile-lib",

 "cRefRetId": "{\\\"NocReferInput10ug\\\":\\\"id\\\"}",

 "bNeedSum": false,

 "iMaxLength": 36,

 "iTabIndex": 0,

 "cShowCaption": "币种参照",

 "bFilter": true,

 "iAlign": 1,

 "sFieldName6": "[\"NocReferInput10ug\"]",

 "ownDomain": "ucfbasedoc",

 "bSelfDefine": false,

 "cRefType": "ucfbasedoc.bd_currencytenantref",

 "bIsNull": true,

 "cRefRetId6": {

 "id": "xxxxxx_NocSubTable5liList,NocReferInput10ug"

 }

 }

 ]

 }

 ],

 "cName": "验证子表页面_DzJg6",

 "alias": "xxxxxx",

 "itemList": [

 {

 "bEnum": false,

 "bShowInRowAuth": false,

 "iFieldType": 1,

 "bRowAuthDim": false,

 "bVmExclude": 0,

 "cName": "NocInput3cj",

 "iSystem": 1,

 "bCanModify": true,

 "cDefaultValue": null,

 "bPrintUpCase": false,

 "isExport": 1,

 "BizType": "text",

 "bExtend": false,

 "bMustSelect": true,

 "cControlType": "Input",

 "bShowIt": true,

 "bJointQuery": false,

 "cFieldName": "NocInput3cj",

 "cCaption": "单行输入",

 "bPrintCaption": true,

 "auth_level": 3,

 "isshoprelated": 0,

 "isprint": 1,

 "enterDirection": 4,

 "cDescription": "单行输入",

 "cDataSourceName": "appCode.appCode.xxxxxx",

 "iMaxShowLen": 200,

 "isDeleted": 0,

 "bSplit": false,

 "bHidden": false,

 "iOrder": 0,

 "xLibCode": "ynf-lib-base-mobile",

 "bNeedSum": false,

 "iMaxLength": 200,

 "iTabIndex": 0,

 "uiHide": false,

 "cShowCaption": "单行输入",

 "bFilter": true,

 "iAlign": 1,

 "bSelfDefine": false,

 "bIsNull": true

 }

 ]

 }

 ]

||**属性**||**类型**||**说明**|
||cDataSourceName||String||租户ID|
||subEntity||Array||子实体数据|
||alias||String||实体别名|
||cName||String||实体名称|
||itemList||Array||实体数据|

##### [](#itemlist-参数说明)itemList 参数说明

||**属性**||**类型**||**说明**|
||cControlType||String||组件编码|
||xLibCode||String||组件库编码|
||BizType||String||运行时默认数据格式|
||cName||String||关联数据源|
||cFieldName||String||参照关联数据源|
||cCaption||String||组件展示名称|
||alias||String||组件别名|
||bCanModify||boolean||是否禁用|
||bShowIt||boolean||是否显示|
||cDataSourceName||String||数据源名称|
||iMaxLength||number||最大输入长度|
||cDefaultValue||String||默认值|
||cValidate||String||正则字符串|
||cDescription||String||提示信息|
||iNumPoint||number||精度|
||characterEffects||Array||关联的特征组字段|
||characterType||String||1.存在该属性时，认为该字段是特征组请求的触发项2.其值为实际请求时对应的参照的id的cName|
||type||String||特征类型|
||cEnumType||String||枚举类型|
||refReturn||String||参照返回显示字段|
||cRefType||String||参照注册编码|
||childrenField||String||参照关联子数据源|
||isMasterOrg||boolean||是否是主组织|
||refEntityUri||String||参照实体uri|
||ownDomain||String||应用微服务|

## [](#ftl模版展示数据格式)ftl模版展示数据格式

{

 "children":[

 <#-- 页面模版 -->

 {

 "nid": "nid_${nid_uuid}",

 "caption": "${cName!""}",

 "controlType": "BillTemplate",

 "children": [页面展示配置]

 },

 <#-- 数据源 -->

 {

 "nid": "nid_${nid_uuid}",

 "controlType": "datasourceList",

 "caption": "数据源",

 "children": [数据源参数配置]

 },

 <#-- stores -->

 {

 "caption": "Stores",

 "children": [store配置],

 "controlType": "Stores",

 "nid": "nid_stores_${nid_uuid}"

 },

 <#-- reactions -->

 {

 "alias": "reactions",

 "caption": "Reactions",

 "children": [reaction配置],

 "controlType": "Reactions",

 "nid": "nid_reactions_${nid_uuid}"

 },

 <#-- actions -->

 {

 "alias": "actions",

 "caption": "Actions",

 "controlType": "Actions",

 "nid": "nid_actions_${nid_uuid}",

 "children": [action配置]

 }

 ],

 <#-- 默认动作 -->

 "userDefines": [特征实体配置],

 "enumTypes": [枚举类型配置],

 "nid": "nid_${nid_uuid}",

 "libCode": "ynf-lib-base",

 "controlType": "Bill",

 "compType": "xcontainer",

 "appCode": "${appCode!""}",

 "ynfVersion": 1,

 "caption": "${cName!""}",

 "tplMode": 0,

 "billNo": "${cBillNo!""}",

 "detailBillNo": "${cCardKey!""}",

 "billType": "${cBillType!"VoucherList"}",

 "busiObj": "${busiObj!""}",

 "ownDomain": "${ownDomain!""}"

}

### [](#一页面展示配置)一、页面展示配置

{

 "nid": "nid_1",

 "alias": "Layout2",

 "compType": "xcontainer",

 "caption": "布局容器",

 "disabled": false,

 "visible": true,

 "libCode": "ynf-lib-base",

 "controlType": "Layout",

 "cStyle": {

 "display": "flex",

 "flexDirection": "column",

 "height": "100%"

 },

 "children": [

 {

 "nid": "nid_3",

 "alias": "convenientquery",

 "compType": "xcontainer",

 "caption": "查询区",

 "disabled": false,

 "visible": true,

 "libCode": "ynf-fw-apcom-lib",

 "controlType": "ConvenientQuery",

 "showFilterScheme": true,

 "dataSource": [

 "mainEntity"

 ],

 "onBeforeSearch": "mobx://rootStore.filterStore.onBeforeSearch",

 "rootStore": "mobx://rootStore",

 "store": "mobx://rootStore.filterStore",

 "children": [

 ...展示组件

 ]

 },

 {

 "nid": "nid_44",

 "alias": "maintabletoolbar",

 "compType": "xcontainer",

 "caption": "按钮栏",

 "disabled": false,

 "visible": true,

 "libCode": "ynf-lib-base",

 "controlType": "ToolBar",

 "children": [

 ...展示按钮

 ],

 "cStyle": {

 "margin": "10px 0"

 }

 },

 {

 "nid": "nid_57",

 "alias": "Layout58",

 "compType": "xcontainer",

 "caption": "布局容器",

 "disabled": false,

 "visible": true,

 "libCode": "ynf-lib-base",

 "controlType": "Layout",

 "cStyle": {

 "display": "flex",

 "flexGrow": 1,

 "flexShrink": 1,

 "flexBasis": "auto",

 "minHeight": "240px",

 "height": 0

 },

 "children": [

 ...展示内容

 ]

 },

 {

 "nid": "nid_146",

 "alias": "Pagination147",

 "compType": "xcontainer",

 "caption": "分页器",

 "disabled": false,

 "visible": true,

 "libCode": "ynf-lib-base",

 "controlType": "Pagination",

 "onChange": "mobx://rootStore.pagingStore.onChange",

 "pageInfo": "mobx://rootStore.pagingStore.pageInfo",

 "topStyle": {

 "justifyContent": "end"

 }

 }

 ]

 }

### [](#二数据源参数配置)二、数据源参数配置

{

 "nid": "nid_215",

 "controlType": "datasourceList",

 "caption": "数据源",

 "children": [

 {

 "mainEntity": true,

 "alias": "mainEntity",

 "caption": "test模板创建-pass0229p8",

 "nid": "nid_216",

 "controlType": "datasource",

 "type": "entity",

 "children": [

 {

 "alias": "NocSubTable5gj_PT1941795800250056710List",

 "caption": "子表",

 "nid": "nid_217",

 "controlType": "datasource",

 "type": "entity",

 "fieldsArr": [

 {

 "bizType": "",

 "field": "NocDateTimePicker8wk",

 "virtualField": false,

 "nid": "nid_218",

 "alias": "NocDateTimePicker8wk",

 "caption": "子表日期时间"

 },

 ...实体数据

 ],

 "uri": "appcode.appcode.子表实体"

 }

 ],

 "fieldsArr": [

 {

 "bizType": "",

 "field": "NocInputNumber2uh",

 "virtualField": false,

 "nid": "nid_255",

 "alias": "NocInputNumber2uh",

 "caption": "数字框"

 },

 ...实体数据

 ],

 "uri": "appcode.appcode.billNo",

 }

 ]

 },

### [](#三store配置)三、[store配置](#/api/api#api-store)

{

 "caption": "Stores",

 "children": [

 {

 "nid": "nid_x",

 "controlType": "TableStore",

 "storeType": "TableStore",

 "libCode": "ynf-core-engine",

 "stateType": "approval",

 "caption": "tableStore",

 "type": "entity",

 "alias": "tableStore",

 "fieldsArr": [

 {

 "bizType": "text",

 "field": "NocInput3cj",

 "virtualField": false,

 "nid": "nid_248",

 "alias": "NocInput3cj",

 "caption": "单行输入"

 },

 ...实体数据

 ]

 }

 ],

 "controlType": "Stores",

 "nid": "nid_stores_xx"

 },

### [](#四reaction配置)四、[reaction配置](#/api/api#api-reaction)

{ // 表格reactions

 "alias": "reactions",

 "caption": "Reactions",

 "children": [

 {

 "caption": "listReaction",

 "alias": "listReaction",

 "controlType": "ListReaction",

 "libCode": "ynf-core-engine/reactions",

 "listAction": "mobx://rootStore.actions.list",

 "initPageSearch": true,

 "dataSourceAlias": "mainEntity",

 "filter": "filterStore",

 "list": "tableStore",

 "paging": "pagingStore",

 "nid": "nid_cardReaction_xxxx"

 }

 ],

 "controlType": "Reactions",

 "nid": "nid_reactions_xxx"

 },

### [](#五action配置)五、[action配置](#/api/api#api-action)

{

 "alias": "actions",

 "caption": "Actions",

 "controlType": "Actions",

 "nid": "nid_actions_xxx",

 "children": [

 {

 "alias": "openBill",

 "caption": "新增",

 "caption_resid": "UID:P_LIB-WEB-YNF-FE_18A20B5405A80001",

 "controlType": "openBill",

 "libCode": "ynf-core-engine/actions/navigate",

 "nid": "nid_openBill_299",

 "params": {

 "url": [

 "/bill/add"

 ],

 "entityUri": "appcode.appcode.billNo",

 "billNo": "",

 "mode": "add",

 "modalPadding": false

 }

 },

 ...其他按钮事件

 ]

 }

### [](#六特征实体配置)六、特征实体配置

组件配置特征的时候需要配置needUserDefines、userdefinegroupEntitys参数

<#macro getUserDefines>

 <#if needUserDefines>

 "userDefines": [

 <#assign userdefinegroupKeys = userdefinegroupEntitys?keys>

 <#list userdefinegroupKeys as key>

 {

 "entityUri": "${key}",

 "controls": []

 }<#if key_has_next>,</#if>

 </#list>

 ]

 <#else>

 "userDefines": []

 </#if>

</#macro>

### [](#七枚举类型配置)七、枚举类型配置

<#macro getEnumTypes>

 <#if enumTypes??>

 "enumTypes": [<#list enumTypes as enumType>

 "${enumType!""}"<#if enumType_has_next>,</#if>

 </#list>]

 <#else>

 "enumTypes": []

 </#if>

</#macro>