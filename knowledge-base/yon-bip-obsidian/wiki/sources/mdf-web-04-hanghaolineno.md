---
title: "--行号LineNo"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-hanghaolineno"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# --行号LineNo

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/04-hanghaolineno | 所属：Web组件

# [](#行号lineno)行号LineNo

## [](#1-行号概述)1. 行号概述

- 行号的数据类型lineno字段本质上也是一个普通的字段（浮点型），和正常实体建模和UI建模没有什么区别。因此和正常手动增加一个字段的过程没什么区别。
- 也要在元数据实体上自行增加行号字段、在对应的数据库Table里生成行号列，用于存储行号数据。
- UI元数据层billitem上增加行号，cControlType设置为lineno，其他属性和其他billitem一样按需正常配置。
- 运行时，框架会根据cControlType为lineno来启用行号的自动生成功能。

### [](#11-行号的数据类型)1.1. 行号的数据类型

- 行号是浮点型，也就是说可以是小数，而不仅仅只能是int型。
- 至于为什么是float而不是long或int型，这是因为从产品需求考虑，在业务极端情况下，行号可以会出现小数，一句话业务需求规划如此，这里不再赘述。

例如：

- 在行号12和行号13的数据行之间插入一个新记录时，行号就应该是12.5，
- 同理，在行号12.5和13之间插入数据时，行号会为12.75。

### [](#12-注意一个误区)1.2. 注意一个误区

这里的行号是业务数据的行号，有一定的业务含义，表示的是数据的原始业务数据行号，因此会某些业务场景下会出现小数的情况，而不是页面中table中的数据行的序号rowNo，这个rowNo是从1、2、3...依次生成的自然数的序号

## [](#2-接入)2. 接入

浓缩为一句话：只需要在billitem上需要指定cControlType为lineno，其他和正常开发一样。打开领域前端特性开关
autoGenerateLineNo。

具体接入方式如下：

### [](#21-开发接入)2.1. 开发接入

lineno字段本质上也是一个普通的字段，和正常实体建模和UI建模没有什么区别。因此和正常手动增加一个字段的过程没什么区别，**唯一区别在与UI元数据上行号对应的billitem的cControlType为lineno**。

由于行号数据是在客户端由系统自动生成的，所以需要在UI元数据（模型）层告知运行时框架，这个字段是行号字段，以有别于其他字段。因此需要在billitem的cControlType属性设置为lineno即可。

接入过程：

- 实体（Entity）增加行号字段，生成影响的脚本并执行生成相应的DB
Table字段，用于存储行号数据。
- 增加子表的billitem_base，cItemName的命名可以按照规范自由命名，但是 **cControlType务必是lineno**（行号类型） **参见《附录1：billitem配置》**
- 在extend脚本里指定行号生成算法，使用gridModel的lineNoGenerateType()方法

在业务上行号自动生成有两种算法：

**(1) 自动按照步长排序**

由于会对当前表格数据所有lineno进行排列，因此会造成数据的状态(_status)的改变，例如Unchange变更为Update

**(2)  二分法生成**

目前业务接入方在运行时需要告诉框架如何生成行号。未来接入工作、流审批流后可规划按照审批状态自动选择行号生成算法来生成。

### [](#22-ui元数据协议)2.2. UI元数据协议

表格添加一个字段，配置如下属性

||属性名||值||是否必填||可选|
||cControlType||lineno||是||无|
||lineNoGenerateType||1||否 默认1||1/2 自动/二分生成行号|
||lineNoStep||10||否 默认10||自动生成行号步长|
||lineNoWorkflow||false||否 默认false||true/false 是否支持审批流控制，审核中，已审核二分，未审核自动|
||autoGenerateLineNoWithoutState||true||否 默认true||true/false 自动增行是否忽略数据_status状态|
||binaryGenerateLineNoWithoutState||true||否 默认true||true/false 二分是否忽略数据_status状态|

### [](#23-配置接入)2.3. 配置接入

目前为不影响其他领域把新功能风险降低到最小，统一node通过feature配置来开通指定domainKey的该功能。可联系领域负责人来开通

【说明】下一阶段则不需要，自动开通行号功能。

## [](#3-api说明)3. API说明

- lineNoField()
- lineNoGenerateType()
- autoGenerateLineNo()

#### [](#311-含义如下)3.1.1. 含义如下：

||方法名||参数||含义||备注|
||lineNoField||有参数，字符串，表示设置行号字段无参数，表示获取行号字段||设置或获取当前gridModel的行号字段||如果显示不设置行号字段，则gridModel在初始化时会自动通过cControlType找到行号字段|
||lineNoGenerateType||有参数，整型，目前支持1、2，表示设置行号字段无参数，表示获取当前自动生成行号的生成方式||有参数，整型，目前支持1、2，1 表示生成行号算法为自动步长递增，例如10、20、30...2 表示生成行号算法为二分法无参数，表示获取当前自动生成行号的生成方式||使用行号功能的必写方式|
||autoGenerateLineNo||无参数||对当前gridModel数据自动生成行号||通常在lineNoGenerateType为1时调用|
||lineNoStep||有参数 数值||设置步长||默认10|
||autoGenerateLineNoWithoutState||true/false||自动增行是否忽略_status||默认为true|
||binaryGenerateLineNoWithoutState||true/false||二分增行是否忽略_status||默认为true|

#### [](#312-代码示例)3.1.2. 代码示例：

let gridModel = viewmodel.getGridModel();

 

gridModel.lineNoField('xxx'); // 设置行号字段为xxx字段（非必写）

gridModel.lineNoField(); // 获取当前行号字段

 

gridModel.lineNoGenerateType(1); // 参数1表示设置lineno生成方式为按照步长自动排列

gridModel.lineNoGenerateType(2); // 参数2表示设置lineno生成方式为二分插入生成

gridModel.lineNoGenerateType(); // 获取lineno生成方式为二分插入生成

 

gridModel.autoGenerateLineNo(); // 自动重新生成行号

***【再次强调】***

- 如果显示不设置行号字段，则gridModel在初始化时会自动通过cControlType找到行号字段，也可以通过lineNoField()
来直接告诉gridModel行号字段。**（非必须）**
- lineNoGenerateType() 的使用 **（必须）**

使用行号功能的必须在前端extend代码里指定行号生成方式1（自动）还是2（二分）

## [](#4-示例代码)4. 示例代码

具体代码为：

cb.define(process.env.__DOMAINKEY__, ['common/common_VM.Extend.js', 'common/PU_common_VM.Extend.js'], function (common, pu_common) {

 var PU_pu_applyorderlist_VM_Extend = {

 doAction: function (name, viewmodel) {

 if (this[name])

 this[name](viewmodel);

 },

 

 

 init: function (viewmodel) {

 let gridModel = viewmodel.getGridModel();

 gridModel.lineNoField('mylineno'); // 显示的设置gridModel的行号字段为mylineno

 // 设置行号生成方式

 gridModel.lineNoGenerateType(1); // 1表示设置lineno生成方式为按照步长自动排列

 // 也可以根据当前单据的上下文（根据审批状态等）设置lineNoGenerateType为2

 gridModel.lineNoGenerateType(2); // 2表示设置lineno生成方式为二分插入生成

 }

 }

 try {

 module.exports = PU_pu_applyorderlist_VM_Extend;

 } catch (error) {}

 return PU_pu_applyorderlist_VM_Extend;

});

## [](#5-附录1billitem配置示例)5. 附录1：billitem配置示例

[注意]：CControlType一定要配置成"cControlType": "lineno"

{

 "cFieldName": "lineNo",

 "cItemName": "lineNo",

 "cCaption": "行号",

 "cShowCaption": "行号",

 "iBillEntityId": 1233760,

 "iBillTplGroupId": 5432497,

 "iTplId": 1097279,

 "iMaxLength": 255,

 "iFieldType": 0,

 "bEnum": false,

 "bMustSelect": true,

 "bHidden": false,

 "bSplit": false,

 "bExtend": false,

 "bCanModify": false,

 "iMaxShowLen": 255,

 "iColWidth": 80,

 "bNeedSum": false,

 "bShowIt": true,

 "bFixed": true,

 "bFilter": false,

 "cDefaultValue": "0",

 "bIsNull": true,

 "bPrintCaption": true,

 "bJointQuery": false,

 "bPrintUpCase": false,

 "bSelfDefine": false,

 "cOrder": "asc",

 "cTplGroupName": "详情数据区",

 "bMain": false,

 "cDataSourceName": "po.replenishdemand.ReplenishDemandDetailVO",

 "cParentDataSource": "po.replenishdemand.ReplenishDemandVO",

 "cControlType": "lineno",

 "bVmExclude": 0,

 "multiple": false,

 "iOrder": 10400,

 "isshoprelated": false,

 "iSystem": 1,

 "authLevel": 5,

 "isExport": false,

 "uncopyable": false,

 "isMasterOrg": false,

 "iAlign": 1,

 "bEnableFormat": false,

 "domainKey": "productionorder"

}