---
title: "数据模型viewmodel"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/02-viewmodel-spec"
section: "协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 协议]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 数据模型viewmodel

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/02-viewmodel-spec | 所属：协议

# [](#数据模型viewmodel)数据模型viewmodel

## [](#1-顶级节点说明)1. 顶级节点说明

||**属性**||**含义**||**说明**|
||viewmodel||数据模型，发送给node端转译成可执行的js，该js在client执行，
生成对应的ViewModel对象，前端对所有组件的操作都转化为对
ViewModel对象的操作，以符合MVVM思想||*JsonObject*|
||viewApplication||表单view模型，node转译后原数据不改变，标签改为viewmete，
供client使用||*JsonObject*|

## [](#2-模型数据-viewmodel)2. 模型数据 viewmodel

"viewmodel": {

 "iBillId": 1000066578,

 "cBillName": "消息列表",

 "cBillNo": "aa_messagelist",

 "cFilterId": "3450016",

 "cBillType": "ArchiveList",

 "cSubId": "AA",

 "bBatchOperate": true,

 "entities": [2],

 "actions": [2],

 "states": [2]

}

||属性||类型||含义||说明|
||iBillId||Integer||单据ID||1001282423|
||cBillName||String||名称||项目模板列表|
||cBillNo||String||单据编号||例如：projectlist|
||cFilterId||Integer||过滤器ID||例如：3450016|
||cBillType||String||类型||ArchiveList|
||cSubId||String||子产品ID||AA|
||bBatchOperate||Boolean||||默认为true，开发者可不关注|
||entities||JsonArray||实体列表||JsonArray|
||actions||JsonArray||动作列表||JsonArray|
||states||JsonArray||状态列表||JsonArray|

### [](#21-实体-entities)2.1. 实体 entities

{

 "cCode": "aa_messagelist",

 "cEntityName": "消息列表",

 "cType": "Bill",

 "cDataSourceName": "aa.message.Message",

 "cPrimaryKey": "id",

 "iBillEntityId": 93787,

 "bMain": true,

 "cControlType": "Table",

 "fields": [2],

 "key": "Entity.Toolbarst_storeoutlogistic_toolbar_data_edit",

 "parentKey": "st_storeoutlogistic_toolbar_data_edit"

}

#### [](#211-属性-fields)2.1.1. 属性 fields

{

 "cFieldName": "tenant",

 "cItemName": "tenant",

 "cCaption": "租户ID",

 "cShowCaption": "租户ID",

 "iBillEntityId": 93787,

 "iBillTplGroupId": 3413458,

 "iTplId": 72934,

 "iMaxLength": 255,

 "iFieldType": 1,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": true,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": true,

 "iMaxShowLen": 255,

 "iColWidth": 150,

 "bNeedSum": false,

 "bShowIt": false,

 "bFilter": false,

 "bIsNull": true,

 "bPrintCaption": false,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cTplGroupName": "Table",

 "bMain": true,

 "cDataSourceName": "aa.message.Message",

 "cControlType": "Input",

 "bVmExclude": 0,

 "iOrder": 0,

 "isshoprelated": false,

 "iSystem": 1,

 "authLevel": 3,

 "isExport": false

}

||属性||类型||含义||说明|
||cItemName||String||名称||orgid_name；  和 cName一样 容器是取cName，控件取cItemName|
||cCaption||String||标题||所属组织|
||cShowCaption||String||显示标题||所属组织（可设置）|
||iMaxLength||Integer||最大长度||100|
||iFieldType||Integer||字段类型||1；（废弃类型）已被controlType代替|
||bEnum||Boolean||是否枚举||false|
||cEnumString||String||枚举信息||{"0":"未启用","1":"启用","2":"停用"}|
||bMustSelect||Boolean||是否必选||false；必收集信息|
||bHidden||Boolean||是否隐藏||false； 系统字段，用于业务的隐藏管理|
||bSplit||Boolean||是否支持行拆分||false|
||bExtend||Boolean||是否扩展字段||false；计算字段，用户自己扩展 UI层面|
||bCanModify||Boolean||是否可修改||true；是否可编辑|
||iMaxShowLen||Integer||最大显示长度||255|
||iColWidth||Integer||列宽||150|
||iAlign||Integer||对齐方式||1；字段取值范围含义 （废弃类型）
 1 left，2 center，3right|
||bNeedSum||Boolean||是否支持合计||false|
||cSumType||String||汇总类型||avg，count，group，max，sum，自定义|
||bShowIt||Boolean||是否显示||true；用户字段，是否显示某个字段（true为勾选项）|
||bFilter||Boolean||是否过滤||true|
||cDefaultValue||String||默认值||0；只有枚举类型才有|
||bIsNull||Boolean||是否可以为空||true|
||bPrintCaption||Boolean||是否打印栏目标题||true|
||bJointQuery||Boolean||是否支持关联查询||false|
||bPrintUpCase||Boolean||是否打印金额大写||false|
||bSelfDefine||Boolean||是否自定义项目||false；实体字段，用户自定义|
||cControlType||String||控件类型||Input|
||iOrder||Integer||排序||1|
||bMain||Boolean||是否主表||true|
||id||Integer||ID||71226251|
||bVmExclude||Boolean||||0、模型中有，显示，持久化 
 1、模型中没有，显示，持久化 
 2、模型中有，显示，不持久化 
|
||iBillTplGroupId||Integer||模板分组ID||69416434|
||iBillId||Integer||单据ID||1001282423|
||iBillEntityId||Integer||单据实体ID||2163145|
||iTplId||Integer||单据模板ID||1337972|
||cSubId||String||子产品ID||AA|
||iSystem||Integer||是否系统定义||0：非系统，1：系统；系统预制，给二开预留|
||cName||String||字段别名||enable|
||cFieldName||String||字段类型||enable|
||authLevel||Integer||||3；（零售 权限级别）0：租户管理员 1：租户操作员  2：是客户管理员 3：客户操作员 4：商家管理员 5：商家操作员|
||cDataSourceName||String||数据源名称||bd.project.ProjectVO|
||enterDirection||Integer||切入方向||0|
||cEnumType||String||枚举类型||bd_enable_type|
||enumArray||String||枚举数组||[{"nameType":"text","value":"未启用","key":"0"},{"nameType":"text","value":"启用","key":"1"},{"nameType":"text","value":"停用","key":"2"}]|

### [](#22-动作-actions)2.2. 动作 actions

{

 "cCommand": "cmdDelete",

 "cAction": "batchdelete",

 "cSvcUrl": "/bill/batchdelete.do",

 "cHttpMethod": "POST",

 "cTarget": "st_storeoutlogistic_toolbar_data_edit"

}

||**属性**||**类型**||**含义**||**说明**|
||cCommand||String||命令名称||cmdDelete|
||cAction||String||动作名称||batchdelete|
||cSvcUrl||String||请求地址||/bill/batchdelete.do|
||cHttpMethod||String||请求方式||POST|
||cTarget||String||||st_storeoutlogistic_toolbar_data_edit|

### [](#23-状态-states)2.3. 状态 states

状态存储在bill_status、bill_status_config、bill_status_profile三张表里

- bill_status：状态定义
- bill_status_config：状态和单据的关系
- bill_status_profile：个性状态定义

{

 "cCode": "add",

 "cCondition": "data.verifystate \u003d\u003d 100 \u0026\u0026 mode \u003d\u003d \u0027edit\u0027",

 "items": []

}

||**属性**||**类型**||**含义**||**说明**|
||cCode||String||状态编码||add|
||cCondition||String||动作名称||data.verifystate \u003d\u003d 100 
 \u0026\u0026 mode \u003d\u003d 
 \u0027edit\u0027|
||items||*JsonArray*||请求地址|||

#### [](#231-状态项-items)2.3.1. 状态项 items

{

 "bVisible": false,

 "bEnable": false,

 "cName": "btnAudit",

 "cGroup": "toolbaritem"

}

||**属性**||**类型**||**含义**||**说明**|
||bVisible||Boolean||是否显示||false|
||bEnable||Boolean||是否可用||false|
||cName||String||||btnAudit|
||cGroup||String||||toolbaritem|

## [](#3-模板数据-viewapplication)3. 模板数据 viewApplication

表单viewApplication属性见：[链接](#/spec/02-view-application-spec)