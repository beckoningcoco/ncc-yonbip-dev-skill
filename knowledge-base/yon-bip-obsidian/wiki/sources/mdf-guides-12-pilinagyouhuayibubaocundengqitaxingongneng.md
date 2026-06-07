---
title: "批量优化、异步保存等其他新功能"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/12-pilinagyouhuayibubaocundengqitaxingongneng"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 14
---

# 批量优化、异步保存等其他新功能

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/12-pilinagyouhuayibubaocundengqitaxingongneng | 所属：指南

# [](#批量优化异步保存等其他新功能)批量优化、异步保存等其他新功能

## [](#1-启用批量checkbatchcheck接入说明)1. 启用批量check（BatchCheck）接入说明

注：目前支持表格批量粘贴batchcheck、参照多选batchcheck、批改batchcheck

// Consul系统中配置如下，配置领域特性即可开启，如开启upu采购

 "features": [

 "batchCheckSupport"

 ]

 

// 扩展脚本单独开启，前提是领域开关关闭

viewModel.getParams().batchCheckSupport = true

batchDo传输切片设置，可以按照领域配置Consul Env，不设置默认为500条数据

// batchDo传输切片，每10条数据为一个batchDo请求

 "env": {

 "batchCheckChunkNum": 10, // 数据切片

 }

支持租户级别和单据级别的开关

**如果设置了租户级
batchCheckSupportTenantId和单据级batchCheckSupportBillNo的话，那么只有这个租户下的单据才会发起批量check，反之其他的单据只会是正常的check逻辑，请熟知！**

Consul系统配置领域的Env，配置如下：

"env": {

 "batchCheckSupportTenantId": ["xxxxxx"], // 租户id

 "batchCheckSupportBillNo": ["voucher_order"], // 单据号

}

## [](#2-异步保存接入说明)2. 异步保存接入说明

异步保存是在大数据量保存子表的时候有几率超时保存失败，那么前端根据后端保存按钮的cParameter来判断是否开启大于多少行开启，并且领域特性开启asyncSave情况下执行，具体接入配置如下：

// 特性consul配置，asyncSave代表该领域开启异步保存

 "features": [

 "asyncSave"

 ]

保存按钮的元数据配置cParamster参数，前端解析并读取后，按照这两个条件去处理，下方代码asyncSaveSubTabNum表示当子表数据大于100条的时候就会开启异步保存

也可以使用defineStyle来设置

// 按钮设置：

cParameter:"{asyncSaveSubTabNum:100}"

 

 

// 框架内实现代码：

 

// 扩展脚本设置异步保存子表数量

if (viewmodel.getParams().asyncSaveSubTabNum) {

 asyncSaveSubTabNum = viewmodel.getParams().asyncSaveSubTabNum;

}

// 领域级别设置异步保存子表数量

if (viewmodel.getEnv('asyncSaveSubTabNum')) {

 asyncSaveSubTabNum = viewmodel.getEnv('asyncSaveSubTabNum');

}

// defineStyle级别设置异步保存子表数量

if (defineStyle?.asyncSaveSubTabNum) {

 asyncSaveSubTabNum = defineStyle.asyncSaveSubTabNum;

}

扩展脚本方式：

viewModel.getParams().asyncSaveSubTabNum = 100

异步保存等待时间默认是180秒，可以通过下面参数调整，扩展脚本自行设置以及平台node统一设置两种

// 扩展脚本设置

viewmodel.getParams().asyncSaveErrStopInterval

 

// 平台统一node处理

// 使用Consul

viewmodel.getEnv('asyncSaveErrStopInterval')

## [](#3-单据历史变更接入说明)3. 单据历史变更接入说明

卡片单据变更历史实现原理是请求detail接口传入当前数据modifyMainId作为id，以及当前元数据配置的billnumber表名，查询历史单据变更，需要配置2个按钮的action，显示历史的时候需要禁用其他Toolbar按钮，大致如下：

// 卡片新增两个action用于显示历史和还原历史

// changebilldiff 和 unchangebilldiff

...

changebilldiff: changeBillDiff, // 单据历史变更

unchangebilldiff: unchangeBillDiff, // 单据历史变更还原

...

其中显示变更的aciton changebilldiff 需要设置cParameter：billnumber
单据需要使用配置的billnumber来查询detail接口，以及 cParameter:
fieldMainKey 表示查询的id，默认为：modifyMainId

配置示例JSON如下：

{

 "billNo": "st_purchaseordermodify",

 "cCommand": "cmdDisplayChanges",

 "cAction": "changebilldiff",

 "cSvcUrl": "/report/detail",

 "cHttpMethod": "GET",

 "cParameter": "{\"billnumber\":\"st_purchaseorder\",\"modifySourceMainId\":\"modifyMainId\",\"modifySourceChildrenId\":\"modifySubId\",\"SourceMainId\":\"mainid\",\"SourceChildrenId\":\"id\"}",

 "authId": "st_purchaseordermodifylistlist",

 "authOperate": false,

 "fieldName": "btnDisplayChanges"

},

{

 "billNo": "st_purchaseordermodify",

 "cCommand": "cmdHideChanges",

 "cAction": "unchangebilldiff",

 "cHttpMethod": "GET",

 "authId": "st_purchaseordermodifylist",

 "authOperate": false,

 "fieldName": "btnHideChanges"

}

数据库配置示例：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/pilinagyouhuayibubaocundengqitaxingongneng_image1.8fc5d4c0.png)

具体效果可以参考MDF单据**采购订单变更**，进详情页看变更效果。

关键配置实现代码：

...

if (params.cParameter) {

 try {

 cParameter = JSON.parse(params.cParameter);

 fieldMainKey = cParameter.fieldMainKey || 'modifyMainId'; // 变更id的字段key

 billnumber = cParameter.billnumber; // 查询历史需要的billNo

 }

 catch (e) {

 console.info(e)

 }

}

...

const currentData = viewmodel.collectData(true);

const modifyMainId = currentData[fieldMainKey];

...

const postData = {

 billnum: billnumber,

 id: modifyMainId

}

const par = {

 cSvcUrl: params.cSvcUrl || 'bill/detail',

 cHttpMethod: params.cHttpMethod || 'GET',

 options: { domainKey: viewmodel.getDomainKey(), mask: true }

}

common.doProxy(par, jsonDiffCallback, postData);

## [](#4-同步保存配置自动生单)4. 同步保存配置自动生单

设置保存按钮的元数据配置参数 cmdParameter：

cmdParameter: "{"externalData":{"isAutoMakeBill":true}}"

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/pilinagyouhuayibubaocundengqitaxingongneng_image2.e0c6512f.jpeg)

## [](#5-审核弃审可配置asynckey设置)5. 审核、弃审可配置asyncKey设置

审核按钮举例，设置按钮元数据cParameter如下：

// 轮询Key

cParameter.asyncKeyField

// 轮询Url

cParameter.asyncUrlField

// 轮询成功后动作名字，用于拼接提示信息，如：生单、弃审、出库

cParameter.asyncMsgField

 

 

cParameter: "{"asyncKeyField":"makebill_asyncKey","asyncUrlField":"makebill_asyncUrl","asyncMsgField"":"生单"}"

## [](#6-onepage配置相关说明)6. Onepage配置相关说明

container.cControlType：grouponepagecontainer；

cGroupKey：控制billitem的分组,值相同的会被分到同一组中；

iColWidth
：每个billitem所占宽度比例（值为：1，2，3，4，例如：值为1，所占宽度为48px）；

{

 "containers": {

 ...

 "cControlType": "grouponepagecontainer",

 ...

 "controls": [

 {

 ...

 "cGroupKey": "*",

 "cItemName": "*",

 "iColWidth": 2,

 "cShowCaption": "*",

 "cFieldName": "*",

 "cCaption": "*",

 "cControlType": "*",

 "cName": "org_name",

 "id": 410236787,

 ...

 }

 ]

 }

}

## [](#7-新页签打开配置说明)7. 新页签打开配置说明

包括新增、下推都会打开新页签

在diwork门户中，默认节点都是内部跳转打开，如果想新页签打开（新页签是指diwork页签），需要如下配置，需要领域
租户id: [domainKey] 两个维度设置，统一node Consul系统设置：

"__MDF_FEATURE_CONFIG__": {

 "newOpenTabs": {

 "q501stly": ["upu", "ustock"]

 }

}

## [](#8-参照依赖批量粘贴)8. 参照依赖批量粘贴

需要在要批量粘贴的字段Columns设置cStyle如下：

rederDepend 开启参照依赖粘贴

condition 表达式，用于判断是否粘贴改行，传入对象为data

checkValidCondition 表达式(暂未实现)

{"referDepend":true, "condition":"data.isBatchManage != null && (data.isBatchManage == true || data.isBatchManage == 1 || data.isBatchManage == 'true')"}

## [](#9-批改相关配置事件)9. 批改相关配置、事件

批改组件为：BatchModify
，批改在列表会直接请求接口修改数据，在卡片是修改前端子表数据，不会直接保存到后台，在生单界面是修改前端数据，但是过滤条件包含列表和卡片

具体事件、配置如下：

事件类：

||事件||说明||备注|
||batchModifyReferProcess||参照列表展开前给扩展脚本处理|||
||batchModifySetFields|||||
||beforeBatchModifyVoucher|||||
||afterInsertRowsFromRefer|||||
||endBatchModifyVoucher|||||
||batchModifyReferSet|||||
||beforeBrowse|||||

配置类：

// 如何设置指定子表批改

按钮的params里的childrenField指定

批改想获得条件对象：

viewModel.getCache("batchModifyCondition")

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/pilinagyouhuayibubaocundengqitaxingongneng_image3.9045a749.jpeg)

{

 "filterRange": 0,

 "filterObjs": [

 {

 "fieldName": "lineno",

 "operator": "dengyu",

 "value1": "10",

 "value2": ""

 },

 {

 "fieldName": "demandOrg_name",

 "operator": "budengyu",

 "value1": "三只松鼠",

 "value2": ""

 }

 ]

}

## [](#10-专属化打印token修改配置)10. 专属化打印token修改配置

修改地址：https://<工作台域名>/mdf-node/tokenInfo?terminalType=1&url=https://<工作台域名>/u8cprint/app/getTokenInfo

修改红色url部分

// 第一种

viewModel.getParams()._PRINT_META_.printTokenDomain = 'http://<工作台域名>'

 

// 第二种getEnv也就是setEnv

cb.extend.Env.你的domainKey.__PRINT_META__.printTokenDomain='http://<工作台域名>'

## [](#11-列表或卡片支持友空间联系人直接沟通)11. 列表或卡片支持友空间联系人直接沟通

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/pilinagyouhuayibubaocundengqitaxingongneng_image4.642eb531.jpeg)

大致效果如图展示，通过表格行按钮联系人

列表行按钮配置action：ecsuite

// 按钮的cParameter需要配置：

 

cParameter.action // 聊天动作类型，默认chat,可选cooperation（协作）、task（任务）、discussion

cParameter.type // 默认person

cParameter.rowKey // rowKeyField字段，也就是要查询联系人的id，下方的图pk_recorder

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/pilinagyouhuayibubaocundengqitaxingongneng_image5.7664badb.jpeg)

## [](#12-进度球右下角的完成提示信息框调整自动关闭时间)12. 进度球右下角的完成提示信息框调整自动关闭时间

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/pilinagyouhuayibubaocundengqitaxingongneng_image6.7b3d099e.jpeg)

给操作的按钮设置cParameter参数

// 5秒后自动关闭

cParameter.duration = 5

## [](#13-如何使用进度球)13. 如何使用进度球

// 需要构建进度球需要的参数

// beforeAct、afterAct不需要可以不传

 

cb.utils.queryAsyncProcess(billNo,viewModel,asyncParams,beforeAct,afterAct)

 

或者

 

viewmodel.biz.action().common.queryAsyncProcess(billNo,viewModel,asyncParams,beforeAct,afterAct)

 

 

const { asyncKey, asyncKeyField, asyncUrlField, asyncMsgField, asyncInterval = 1, btnCallBack, fileSize, fileName, url, asyncName = '导入', refresh = true, operatorType = null, isLogEvent = false, asyncOverParams, isAsyncDownloadForm, domainKey, errStop = false, errStopInterval = 180 } = params;

||参数||说明|
||asyncKey||轮询asyncKey|
||url||轮询的URL|
||asyncName||轮询的动作文案|
||asyncKeyField||轮询Key变更|
||asyncUrlField||轮询Url变更|
||asyncMsgField||提示标题|
||asyncInterval||几秒一次轮询接口|
||btnCallBack||执行完毕回调|
||refresh||完成后是否刷新|
||errStop||是否启用自定义错误停止|
||errStopInterval||异步轮询等待时间|
||domainKey||必传domainKey|

场景代码：

const billnum = 'st_purchaseorderlist';

const queryParams = {

 asyncKey: 'asyncImport_3671795919',

 url: 'billtemp/getImportProcess',

 asyncName: '测试动作'

}

viewmodel.biz.action().common.queryAsyncProcess(billnum, viewmodel, queryParams);

 

或

 

cb.utils.queryAsyncProcess(billnum, viewmodel, queryParams);

## [](#14-生单工作台pushcodefield修改)14. 生单工作台pushCodeField修改

当生单工作台无法统计信息，提示"共处理0条数据，成功0条数据，失败0条数据。"，说明当前单据主表中没有code属性，此时需要添加code属性
或 通过pushCodeField配置唯一的Key

需要区别列表和卡片的下推，配置按钮的cParameter

**voucherlist（列表）:**

// 给生单的按钮设置参数 bill_code只是假设字段

 

cParameter.pushCodeField

 

cParameter: "{"pushCodeField":"bill_code"}"

**voucher（卡片）:**

// 给生单的按钮设置参数 bill_code只是假设字段

 

cmdParameter.pushCodeField

 

cmdParameter: "{"pushCodeField":"bill_code"}"

## [](#15-打印预览开启打印计数后的自动刷新配置)15. 打印预览开启打印计数后的自动刷新配置

给打印预览的按钮配置cmdParameter

// cmdParameter

 

// 开启打印计数

cmdParameter.printcountswitch = true

 

// 设置打印后X秒后刷新，默认1秒

 

cmdParameter.printrefreshinterval = 1000

## [](#16-批改组件想获得过滤条件)16. 批改组件想获得过滤条件

批改通过beforeBatchModifyVoucher来获得

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/pilinagyouhuayibubaocundengqitaxingongneng_image7.6f326c94.jpeg)

// 监听事件获得

 

viewModel.on('beforeBatchModifyVoucher',args => (console.log(args.filter)))

 

 

// 所有操作符

[

 { code: 'dengyu', name: '等于', valueCount: 1 },

 { code: 'budengyu', name: '不等于', valueCount: 1 },

 { code: 'xiaoyu', name: '小于', valueCount: 1 },

 { code: 'xiaoyudengyu', name: '小于等于', valueCount: 1 },

 { code: 'dayu', name: '大于', valueCount: 1 },

 { code: 'dayudengyu', name: '大于等于', valueCount: 1 },

 { code: 'qujian', name: '区间', valueCount: 2, middleText: '至' },

 { code: 'baohan', name: '包含', valueCount: 1 },

 { code: 'bubaohan', name: '不包含', valueCount: 1 },

 { code: 'baohanyu', name: '包含于', valueCount: 1 },

 { code: 'bubaohanyu', name: '不包含于', valueCount: 1 }

 ]

||fieldName||批改的字段|
||operator||操作符|
||value1||批改值1|
||value2||批改值2|

## [](#17-列表卡片联查事件中心)17. 列表、卡片联查事件中心

在工具栏按钮上设置action：revieweventlog 即可，卡片同理

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/pilinagyouhuayibubaocundengqitaxingongneng_image8.2488fd44.jpeg)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/pilinagyouhuayibubaocundengqitaxingongneng_image9.1323cbe1.jpeg)

查询历史数据需要参数billNo，默认是billNo、cardKey，根据自己的调整

按钮设置cParameter：

cParameter:'{"billNo":"billno"}'

## [](#18-列表的批改支持自定义传入的字段以及csvrurl替换)18. 列表的批改支持自定义传入的字段以及cSvrUrl替换

- 修改默认批改URL

批改组件在列表的时候，是直接拿到表格可修改、可显示的字段来过滤后展示出现的，对于特殊的需求想改表头、表体字段的，需要领域在扩展脚本里自行处理后修改而成，包括请求到后端的URL地址也支持修改，具体如下：

批改的后端URL替换，默认是：'/bill/batchModify'
通过批改按钮设置cParameter.url来修改默认URL

- 自定义表头表体字段

扩展脚本监听事件 batchModifySetFields 来进行设置。

// 可以在这里修改或者添加fields，可输出查看具体结构

viewModel.on('batchModifySetFields',(fields) => {

 console.log(fields);

});

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/pilinagyouhuayibubaocundengqitaxingongneng_image10.99de2482.jpeg)

## [](#19-卡片表体批量复制行)19. 卡片表体批量复制行

效果图预览：

![](data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAASABIAAD/4QBARXhpZgAATU0AKgAAAAgAAYdpAAQAAAABAAAAGgAAAAAAAqACAAQAAAABAAAAVKADAAQAAAABAAAAcQAAAAD/4hAISUNDX1BST0ZJTEUAAQEAAA/4YXBwbAIQAABtbnRyUkdCIFhZWiAH5wABAAMACgAaADlhY3NwQVBQTAAAAABBUFBMAAAAAAAAAAAAAAAAAAAAAAAA9tYAAQAAAADTLWFwcGwAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABJkZXNjAAABXAAAAGJkc2NtAAABwAAABJxjcHJ0AAAGXAAAACN3dHB0AAAGgAAAABRyWFlaAAAGlAAAABRnWFlaAAAGqAAAABRiWFlaAAAGvAAAABRyVFJDAAAG0AAACAxhYXJnAAAO3AAAACB2Y2d0AAAO/AAAADBuZGluAAAPLAAAAD5jaGFkAAAPbAAAACxtbW9kAAAPmAAAACh2Y2dwAAAPwAAAADhiVFJDAAAG0AAACAxnVFJDAAAG0AAACAxhYWJnAAAO3AAAACBhYWdnAAAO3AAAACBkZXNjAAAAAAAAAAhEaXNwbGF5AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAbWx1YwAAAAAAAAAmAAAADGhySFIAAAAUAAAB2GtvS1IAAAAMAAAB7G5iTk8AAAASAAAB+GlkAAAAAAASAAACCmh1SFUAAAAUAAACHGNzQ1oAAAAWAAACMGRhREsAAAAcAAACRm5sTkwAAAAWAAACYmZpRkkAAAAQAAACeGl0SVQAAAAYAAACiGVzRVMAAAAWAAACoHJvUk8AAAASAAACtmZyQ0EAAAAWAAACyGFyAAAAAAAUAAAC3nVrVUEAAAAcAAAC8mhlSUwAAAAWAAADDnpoVFcAAAAKAAADJHZpVk4AAAAOAAADLnNrU0sAAAAWAAADPHpoQ04AAAAKAAADJHJ1UlUAAAAkAAADUmVuR0IAAAAUAAADdmZyRlIAAAAWAAADim1zAAAAAAASAAADoGhpSU4AAAASAAADsnRoVEgAAAAMAAADxGNhRVMAAAAYAAAD0GVuQVUAAAAUAAADdmVzWEwAAAASAAACtmRlREUAAAAQAAAD6GVuVVMAAAASAAAD+HB0QlIAAAAYAAAECnBsUEwAAAASAAAEImVsR1IAAAAiAAAENHN2U0UAAAAQAAAEVnRyVFIAAAAUAAAEZnB0UFQAAAAWAAAEemphSlAAAAAMAAAEkABMAEMARAAgAHUAIABiAG8AagBpzuy37AAgAEwAQwBEAEYAYQByAGcAZQAtAEwAQwBEAEwAQwBEACAAVwBhAHIAbgBhAFMAegDtAG4AZQBzACAATABDAEQAQgBhAHIAZQB2AG4A/QAgAEwAQwBEAEwAQwBEAC0AZgBhAHIAdgBlAHMAawDmAHIAbQBLAGwAZQB1AHIAZQBuAC0ATABDAEQAVgDkAHIAaQAtAEwAQwBEAEwAQwBEACAAYQAgAGMAbwBsAG8AcgBpAEwAQwBEACAAYQAgAGMAbwBsAG8AcgBMAEMARAAgAGMAbwBsAG8AcgBBAEMATAAgAGMAbwB1AGwAZQB1AHIgDwBMAEMARAAgBkUGRAZIBkYGKQQaBD4EOwRMBD4EQAQ+BDIEOAQ5ACAATABDAEQgDwBMAEMARAAgBeYF0QXiBdUF4AXZX2mCcgBMAEMARABMAEMARAAgAE0A4AB1AEYAYQByAGUAYgBuAP0AIABMAEMARAQmBDIENQRCBD0EPgQ5ACAEFgQaAC0ENAQ4BEEEPwQ7BDUEOQBDAG8AbABvAHUAcgAgAEwAQwBEAEwAQwBEACAAYwBvAHUAbABlAHUAcgBXAGEAcgBuAGEAIABMAEMARAkwCQIJFwlACSgAIABMAEMARABMAEMARAAgDioONQBMAEMARAAgAGUAbgAgAGMAbwBsAG8AcgBGAGEAcgBiAC0ATABDAEQAQwBvAGwAbwByACAATABDAEQATABDAEQAIABDAG8AbABvAHIAaQBkAG8ASwBvAGwAbwByACAATABDAEQDiAOzA8cDwQPJA7wDtwAgA78DuAPMA70DtwAgAEwAQwBEAEYA5AByAGcALQBMAEMARABSAGUAbgBrAGwAaQAgAEwAQwBEAEwAQwBEACAAYQAgAEMAbwByAGUAczCrMOkw/ABMAEMARHRleHQAAAAAQ29weXJpZ2h0IEFwcGxlIEluYy4sIDIwMjMAAFhZWiAAAAAAAADwzwABAAAAARkRWFlaIAAAAAAAAIGGAAA8p////7lYWVogAAAAAAAATbIAALSJAAAK1FhZWiAAAAAAAAAnngAADtAAAMigY3VydgAAAAAAAAQAAAAABQAKAA8AFAAZAB4AIwAoAC0AMgA2ADsAQABFAEoATwBUAFkAXgBjAGgAbQByAHcAfACBAIYAiwCQAJUAmgCfAKMAqACtALIAtwC8AMEAxgDLANAA1QDbAOAA5QDrAPAA9gD7AQEBBwENARMBGQEfASUBKwEyATgBPgFFAUwBUgFZAWABZwFuAXUBfAGDAYsBkgGaAaEBqQGxAbkBwQHJAdEB2QHhAekB8gH6AgMCDAIUAh0CJgIvAjgCQQJLAlQCXQJnAnECegKEAo4CmAKiAqwCtgLBAssC1QLgAusC9QMAAwsDFgMhAy0DOANDA08DWgNmA3IDfgOKA5YDogOuA7oDxwPTA+AD7AP5BAYEEwQgBC0EOwRIBFUEYwRxBH4EjASaBKgEtgTEBNME4QTwBP4FDQUcBSsFOgVJBVgFZwV3BYYFlgWmBbUFxQXVBeUF9gYGBhYGJwY3BkgGWQZqBnsGjAadBq8GwAbRBuMG9QcHBxkHKwc9B08HYQd0B4YHmQesB78H0gflB/gICwgfCDIIRghaCG4IggiWCKoIvgjSCOcI+wkQCSUJOglPCWQJeQmPCaQJugnPCeUJ+woRCicKPQpUCmoKgQqYCq4KxQrcCvMLCwsiCzkLUQtpC4ALmAuwC8gL4Qv5DBIMKgxDDFwMdQyODKcMwAzZDPMNDQ0mDUANWg10DY4NqQ3DDd4N+A4TDi4OSQ5kDn8Omw62DtIO7g8JDyUPQQ9eD3oPlg+zD88P7BAJECYQQxBhEH4QmxC5ENcQ9RETETERTxFtEYwRqhHJEegSBxImEkUSZBKEEqMSwxLjEwMTIxNDE2MTgxOkE8UT5RQGFCcUSRRqFIsUrRTOFPAVEhU0FVYVeBWbFb0V4BYDFiYWSRZsFo8WshbWFvoXHRdBF2UXiReuF9IX9xgbGEAYZRiKGK8Y1Rj6GSAZRRlrGZEZtxndGgQaKhpRGncanhrFGuwbFBs7G2MbihuyG9ocAhwqHFIcexyjHMwc9R0eHUcdcB2ZHcMd7B4WHkAeah6UHr4e6R8THz4faR+UH78f6iAVIEEgbCCYIMQg8CEcIUghdSGhIc4h+yInIlUigiKvIt0jCiM4I2YjlCPCI/AkHyRNJHwkqyTaJQklOCVoJZclxyX3JicmVyaHJrcm6CcYJ0kneierJ9woDSg/KHEooijUKQYpOClrKZ0p0CoCKjUqaCqbKs8rAis2K2krnSvRLAUsOSxuLKIs1y0MLUEtdi2rLeEuFi5MLoIuty7uLyQvWi+RL8cv/jA1MGwwpDDbMRIxSjGCMbox8jIqMmMymzLUMw0zRjN/M7gz8TQrNGU0njTYNRM1TTWHNcI1/TY3NnI2rjbpNyQ3YDecN9c4FDhQOIw4yDkFOUI5fzm8Ofk6Njp0OrI67zstO2s7qjvoPCc8ZTykPOM9Ij1hPaE94D4gPmA+oD7gPyE/YT+iP+JAI0BkQKZA50EpQWpBrEHuQjBCckK1QvdDOkN9Q8BEA0RHRIpEzkUSRVVFmkXeRiJGZ0arRvBHNUd7R8BIBUhLSJFI10kdSWNJqUnwSjdKfUrESwxLU0uaS+JMKkxyTLpNAk1KTZNN3E4lTm5Ot08AT0lPk0/dUCdQcVC7UQZRUFGbUeZSMVJ8UsdTE1NfU6pT9lRCVI9U21UoVXVVwlYPVlxWqVb3V0RXklfgWC9YfVjLWRpZaVm4WgdaVlqmWvVbRVuVW+VcNVyGXNZdJ114XcleGl5sXr1fD19hX7NgBWBXYKpg/GFPYaJh9WJJYpxi8GNDY5dj62RAZJRk6WU9ZZJl52Y9ZpJm6Gc9Z5Nn6Wg/aJZo7GlDaZpp8WpIap9q92tPa6dr/2xXbK9tCG1gbbluEm5rbsRvHm94b9FwK3CGcOBxOnGVcfByS3KmcwFzXXO4dBR0cHTMdSh1hXXhdj52m3b4d1Z3s3gReG54zHkqeYl553pGeqV7BHtje8J8IXyBfOF9QX2hfgF+Yn7CfyN/hH/lgEeAqIEKgWuBzYIwgpKC9INXg7qEHYSAhOOFR4Wrhg6GcobXhzuHn4gEiGmIzokziZmJ/opkisqLMIuWi/yMY4zKjTGNmI3/jmaOzo82j56QBpBukNaRP5GokhGSepLjk02TtpQglIqU9JVflcmWNJaflwqXdZfgmEyYuJkkmZCZ/JpomtWbQpuvnByciZz3nWSd0p5Anq6fHZ+Ln/qgaaDYoUehtqImopajBqN2o+akVqTHpTilqaYapoum/adup+CoUqjEqTepqaocqo+rAqt1q+msXKzQrUStuK4trqGvFq+LsACwdbDqsWCx1rJLssKzOLOutCW0nLUTtYq2AbZ5tvC3aLfguFm40blKucK6O7q1uy67p7whvJu9Fb2Pvgq+hL7/v3q/9cBwwOzBZ8Hjwl/C28NYw9TEUcTOxUvFyMZGxsPHQce/yD3IvMk6ybnKOMq3yzbLtsw1zLXNNc21zjbOts83z7jQOdC60TzRvtI/0sHTRNPG1EnUy9VO1dHWVdbY11zX4Nhk2OjZbNnx2nba+9uA3AXcit0Q3ZbeHN6i3ynfr+A24L3hROHM4lPi2+Nj4+vkc+T85YTmDeaW5x/nqegy6LzpRunQ6lvq5etw6/vshu0R7ZzuKO6070DvzPBY8OXxcvH/8ozzGfOn9DT0wvVQ9d72bfb794r4Gfio+Tj5x/pX+uf7d/wH/Jj9Kf26/kv+3P9t//9wYXJhAAAAAAADAAAAAmZmAADypwAADVkAABPQAAAKW3ZjZ3QAAAAAAAAAAQABAAAAAAAAAAEAAAABAAAAAAAAAAEAAAABAAAAAAAAAAEAAG5kaW4AAAAAAAAANgAArgAAAFIAAABDwAAAsMAAACZAAAANwAAAT0AAAFRAAAIzMwACMzMAAjMzAAAAAAAAAABzZjMyAAAAAAABDqsAAAch///ybwAACW8AAPxH///7UP///ZwAAAPUAAC+6G1tb2QAAAAAAAAGEAAAoDAAAAAA0h+zAAAAAAAAAAAAAAAAAAAAAAB2Y2dwAAAAAAADAAAAAmZmAAMAAAACZmYAAwAAAAJmZgAAAAIzMzQAAAAAAjMzNAAAAAACMzM0AP/AABEIAHEAVAMBIgACEQEDEQH/xAAfAAABBQEBAQEBAQAAAAAAAAAAAQIDBAUGBwgJCgv/xAC1EAACAQMDAgQDBQUEBAAAAX0BAgMABBEFEiExQQYTUWEHInEUMoGRoQgjQrHBFVLR8CQzYnKCCQoWFxgZGiUmJygpKjQ1Njc4OTpDREVGR0hJSlNUVVZXWFlaY2RlZmdoaWpzdHV2d3h5eoOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3uLm6wsPExcbHyMnK0tPU1dbX2Nna4eLj5OXm5+jp6vHy8/T19vf4+fr/xAAfAQADAQEBAQEBAQEBAAAAAAAAAQIDBAUGBwgJCgv/xAC1EQACAQIEBAMEBwUEBAABAncAAQIDEQQFITEGEkFRB2FxEyIygQgUQpGhscEJIzNS8BVictEKFiQ04SXxFxgZGiYnKCkqNTY3ODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqCg4SFhoeIiYqSk5SVlpeYmZqio6Slpqeoqaqys7S1tre4ubrCw8TFxsfIycrS09TV1tfY2dri4+Tl5ufo6ery8/T19vf4+fr/2wBDAAICAgICAgMCAgMFAwMDBQYFBQUFBggGBgYGBggKCAgICAgICgoKCgoKCgoMDAwMDAwODg4ODg8PDw8PDw8PDw//2wBDAQICAgQEBAcEBAcQCwkLEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBD/3QAEAAb/2gAMAwEAAhEDEQA/AP3auNS1y3ltoXsbYm6kMa4uXwCEZ+f3PTCH8atef4g/58rX/wACn/8AjFJqn/H9o/8A19N/6TzVs0AY/n+IP+fK1/8AAp//AIxR5/iD/nytf/Ap/wD4xXlXxH+OGg/DnX4vDt5aTXVzLpt3qOVWRUAtpbdAhk8sx/OJmYsWAXYFIy611nhb4keHvFGu634bt7q3j1HR7l4hALhHmmgSKGQ3CxjDCPM4XOCM9+cVXI7XFdHU+f4g/wCfK1/8Cn/+MUef4g/58rX/AMCn/wDjFfLJ/ai1kaAde/4Qk/8AHr9p+y/2h/pX3N/leV9nz5v8O3ru4r074l/HTQfhx4k0fws2n3GtahqKvPNDaPCsltbKrbJD57xozSSLtVN6kqJHGQhBp0pbC5kesef4g/58rX/wKf8A+MUef4g/58rX/wACn/8AjFeR6L8eNI1zS/EOp2/h/VLceHbL7ZLHKbN5ZS+4RRRx21zPIXlKMEygUkEZzxR4U+Ouk+IhOL/QtU0hotUTSV+0WzKhnkkWNQXYKA25vmXkqBnml7Nj5keuef4g/wCfK1/8Cn/+MVVu9R1yyiWaWxtirSRx8XL5zK4QdYRxlhn2qLwT4lTxn4M0HxhHbm0XXLC1vhCW3mMXMSyhC2BnbuxnAz6Ve17/AI8Yv+vqz/8ASiOpasMXz/EH/Pla/wDgU/8A8Yo8/wAQf8+Vr/4FP/8AGK2KKQH/0P3j1T/j+0f/AK+m/wDSeatmuQ1LXdDe80pk1G2ZY7lmYiZCFHkSjJ54GSB9TWv/AMJF4f8A+gna/wDf5P8AGgD5P/aG8O614g8VSSWQ1XUray8M6kj2VrYvLbmS7vNPVIi6QsZjKEkcxhyV8kMQq53afhCfT9LvPG/ht/At7b6drEtxfyZ0mURLaJY2cdtCqrC0U7sxdRCjlkKNlRg19O/8JF4f/wCgna/9/k/xo/4SLw//ANBO1/7/ACf41r7TSxPLrc/IAfCzXvtP9nnwn4o8r+y/K+1f2RN/x+52+bs8v0+bbu9s96+qfj3omoeItA8F6R4Q0N4o9GhhvFj/ALFu7qcxyZiltlsvs32aJ2C9Z54tucDbkSD7W/4SLw//ANBO1/7/ACf40f8ACReH/wDoJ2v/AH+T/Gqddtpi9mfD/wANPDGraT4Q+J+nHQZBr2r6ZLHYWdz4fktI5zYxTmHzkYTafIzzTfKiyyFlxv8A7iYfhD4SXngvxjqGpQ2E0Gi6Rqz3dxdnRrVZJFgv7RoI7YabZpcvvRZWdFUwrhGwvWvvz/hIvD//AEE7X/v8n+NH/CReH/8AoJ2v/f5P8aXtmHIcf8G7C+0r4ReCNM1O3ktLy00PTYZoZVKSRSR20aujq2CrKQQQRkHg11+vf8eMX/X1Z/8ApRHS/wDCReH/APoJ2v8A3+T/ABrI1rXtDls41i1G2ci5tWwJkJws8ZJ69AASfasm7u5aOvorH/4SLw//ANBO1/7/ACf40f8ACReH/wDoJ2v/AH+T/GkB/9H97L3UY7Ixx+W800xISOMAs2OT1IAA7kkCq39qX/8A0B7n/vu3/wDjteceCvAXgXwR4plHgvw5pugfa7STzv7Ps4bTzfLkTZv8lF3bdxxnOMnHU17BVSVnYSZjf2pf/wDQHuf++7f/AOO0f2pf/wDQHuf++7f/AOO1s0VIzG/tS/8A+gPc/wDfdv8A/HaP7Uv/APoD3P8A33b/APx2tmigDG/tS/8A+gPc/wDfdv8A/HaP7Uv/APoD3P8A33b/APx2tmigDG/tS/8A+gPc/wDfdv8A/HaY2tPBh76wntYcgGRzEyrngZ8t2IHvjA71uVjeIwD4e1QEZBtZv/QDQBsA5GRS1892fwF+Bb26M3w58Nkkf9Aiz/8AjVWv+FBfAr/onHhv/wAE9n/8arf2K7kczP/S/cix/wCRqT/r0m/9GRVP448a6H8PvDV34p8Qu4tbXaqxxLvmnlc7Y4YUyN8kjEKq55J7DJqCx/5GpP8Ar0m/9GRV57+0Zb6NdfDK9tdUtoJ7i4byrKS4uLa0WC5dGw/n3UkaxjaGVihL7WIVTzV1NxI6PRvjP4A8Qanb6NpNxfTXd0wSNTpWoRrk92d7dVUDqWYgAck4qjZfHj4Z3/ie58JxaptvrUzq5ZCIy9vK0LqrdyGU4wMEDOa+NvgpqFjJ8SPCV9r1/ptpJaLNOzDUbtFa4lgltBFEl/hLje8jbTbPKAAD5mGXfrajo3iWL4lvcaY0qfbZriwttOWbWCTbrrMtqWL/ANoGIJ5SNcENF9nK5Xy8HcYGfZv/AAtrwDFY32q32qxWNjZXVvaCe4IjWaW6toLqIQgnc+6O4TjGc54wM1qXPxC8GWniVPCFzqkaas7pF5RDbVlkXfHE0gHlrK6/MsbMHYYIBBFfKmlaNFr/AMI/HMGjwQ65e2t5pcEElltvD5kOk6TFOIZIt+7BRlYoexz0rsNV0/WFi8Q/D1dLvn1jWfFdrqltdJazNaG0F1a3X2lrsL5KG3jiZNjOH3IqqpDISAe4XHxI8NwTanHCl7fppFxHaXElhY3F8ouXQu0QFqkjFo1A8w7dqFlUnccDotA8QWXiSya/sIbuCNXMZW9s7ixkyADkR3McbleeGC4JyAcg188+HPCOjR6/48l8c6p9it9Iu7WOGawu7jQ7e0tHgFwsINtPH8vmXDs5Zz5kh3EcKF774DWy/wDCt9M1Zr691GXUxJM095fXN8XXzGVCjXEkm1SgGAmAevJOaAPZKx/EX/Iv6n/16zf+gGtisfxF/wAi/qf/AF6zf+gGgDzf4Ya7rXiPwXp+ra/ZrY3silJIg7MweL5JPMDRx7HEisGQblGOHYV6BVSx/wCPWP6CrdbwpyUUnK514nFU51JThSUU22ld6Ltv0P/T/cTTjcHxUv2i2e3/ANEmxvKHP7yLpsZunvXatHG+0uobYcjIzg+o964bXZZYdftmicoTbzDKkg43R+lQ/bbz/nvJ/wB9muiNJy1M3O2h6Ayq42uAR6HnpRsTf5m0b8YzjnHpmvP/ALbef895P++zR9tvP+e8n/fZp/Vn3F7VHoCIkahI1CqOwGBTq89+23n/AD3k/wC+zR9tvP8AnvJ/32aPqz7h7VHevBBIHV41YSfeBAO7tz61IAFAVRgDgAV599tvP+e8n/fZo+23n/PeT/vs0fVn3D2qPQqx/EX/ACL+p/8AXrN/6Aa5X7bef895P++zWdq15dtpV6rTOQYZAQWOCNpoeHfcFVRv2L6h9lj/AOJbP0H8UP8A8cq5v1D/AKBs/wD31D/8crdsf+PWP6CrdZ+1ZfKf/9T9Q/hB8evDvx6sINa0qF7LUrC3ZNQtHBIhlkKYKP0dG2ttOcjHzAcZ6X4seINa8M+DJNT8PEi/e9021QhI5G23d7DbvtWV44y2yQ7d7qucZIFdRpXgjwx8O4NK8J+ELFNP02ytpVREHLNuiy7t1Z26sx5NY3xG8HN488KyeG1uI7bzLqxuC80C3MeLS6iuCrRMQrhhHtweOec9K7MPfk1PW4rxGX1cyrVMqpyhQcvcjJ3aXm/yWtlo3Jq78V8MeJPiLo3irwtoWr3OoXNhrGoXUM76hFp2SGtbq7AV7W8nkBDxgKNgQINuRhRWZ438RfEDSNbkhvdbvsW2qqIxpsmmxwRLdySizhm+0BZCDAV8zzMrv+YE4Vq7vSfgn/ZXirQPEkd5py/2LdS3BS20e3s5JBJaz2+3zYSGABmDEHIOPoRFq/wQvNTnuNT/AOEi8y+1DUY9RvY7y0W6sLh7dsWy/ZvMRkEUQWL5ZRvVQXy2CNbM+fubmk6l8R7LwLqevPJFr1/HcLcWkB8l5pLONYvPtybXbCZyyziIqWXJj3Z+YDJ8IeJNQ1nxDpOheHfEH9uaTB9o1a4utuZFsblWSzs52bJ83zXdgflfZAA/JO7sIPC3je20JdEsdc03Sf32fN03SDB5cBBLLFHLczxrIXOd7Ky4zmMnmsnRPhLH4KvBfeANYuNNa7nE+pxXeb6HUJGOZZ5A7q6XDj/lpG6r03IwAAYHzTr3j/4qjxT4yttGv5L62t7WdLG1tJo3uxcSm+jhJg83eojd1Y4BKxpEzhVHyeha98QfFEvwZvfEF1qYuI5NTitLTUtIia0LW9vdxxkt511I5NwUePcjHG7JHU12cXwT1O08V33jbTvEUdpql3Pcyoi2KvbQNcxLCZkSSVpDcBFADtIY8bgsShiDbm+Dmo2vgofD7QNfS20i3uUntDd2Yu54EVvN2bzLGGxNl1cruUHb2BpWYXR88/Dn4oX+o/EHw/bQ3+s3KNeSwS201350c5NvKPLYSzBRsYiXPJ+TABJr7t1X/kF3n/XGT/0E18yeGfgbq/grxFY6ldeOLS5lkv3u4oLjTVUyyspDiPNzu3bN3K8gZPTIr6b1X/kF3n/XGT/0E0LYL6nqFj/x6x/QVbqpY/8AHrH9BVuvOOo//9X9wdQiXVPEUEVnLG5S2mY/NkAb4x2zVz/hH7z+/H+Z/wAKbqlrcabfxatpNujOitG6Y2h0bBIyAcHKgg4NVv8AhKtZ/wCgQv8A3/P/AMbrWNVpWRDgnuW/+EfvP78f5n/Cj/hH7z+/H+Z/wqp/wlWs/wDQHX/v+f8A43R/wlWs/wDQHX/v+f8A43VfWJB7NFv/AIR+8/vx/mf8KP8AhH7z+/H+Z/wqp/wlWs/9Adf+/wCf/jdH/CVaz/0B1/7/AJ/+N0fWJB7NFv8A4R+8/vx/mf8ACj/hH7z+/H+Z/wAKqf8ACVaz/wBAdf8Av+f/AI3R/wAJVrP/AEB1/wC/5/8AjdH1iQezR8EfGCfWPiP8S49F8J6DcNe6RFrOkWOqXKwmzt9bs47bVbdyyyGW3y1qqh5ViEiOdrFTk+gaj46+MXhK0e78XN4b8SaHNdfYZZ9Kme1uraO5vUsbOcxGW7EpuC7O0eYhF5TrvdsCul+Iln4w8NeLJfiT4M8PSXkOswJp3iDTLWZPNvbQkqs8Jl8qNbm3DsULNtZSyN1Vl+f/AId/C3xNrvjuw0yPwrq3hrwrAzXE7ajd2ly12LS4lnsFkW3VfLkWS7uJHRTJGCkBEjEODHtZXuPkR+m1jf2P2WP/AEiPoP4xVv7fYf8APxH/AN9ioLbTLGOBENvHkD+4Kn+wWH/PvH/3wKjQep//1v31m+6fpWdWjN90/Ss6gAooooAKKKKACiiigBrdKfB/rBTG6U+D/WCgDWHSlpB0paAP/9k=)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/pilinagyouhuayibubaocundengqitaxingongneng_image12.2c54433a.jpeg)

领域配置下拉按钮组，里面自己配置复制10行、复制30行、自定义数量，通过按钮的params参数和action来触发后续逻辑，配置如下：

- 批量复制按钮的action=batchcopyrow
- 按钮的action需要设置cParameter参数，设置后表示按照几条去复制，不会弹出界面，属于静默模式
- 如需自定义数量界面，无需配置cParameter，触发batchcopyrow动作后弹出界面

// 1批量复制按钮的action=batchcopyrow

// 2设置按钮的cParameter参数

 

// 设置参数batchCopyRowNum=10表示选择一条数据后复制10条

cParameter.batchCopyRowNum = 10

## [](#20-自动编码如何按照领域禁止运行)20. 自动编码如何按照领域禁止运行

自动编码是前端框架自动发送的一个异步请求，如果想领域
（domainKey）级别关闭的话，

consul系统内配置即可，可以找自己领域的架构师去配置参数，设置如下：

找到__MDF_FEATURE_CONFIG__节点，banCreateCode的值是每个领域的domainKey，配置上就是禁止自动编码运行,__DEFINE_STYLE__同理

领域自行feature关闭：

"__MDF_FEATURE_CONFIG__": {

 "banCreateCode": ["upu"] // 领域的domainKey

}

"__DEFINE_STYLE__": {

 "banCreateCode": ["upu"] // 领域的domainKey

}

## [](#21-领域前端脚手架发起的异步启用缓存)21. 领域前端脚手架发起的异步启用缓存

找到自己src/web/client/extend.jsx文件，添加如下配置：

// 数组内填写要缓存到内存的URL匹配

cb.extend.registerCacheUrl(process.env.__DOMAINKEY__,[

 'user/checkAuthByCode'

]);

## [](#22-卡片单据如何开启幂等保存)22. 卡片单据如何开启幂等保存

只需要开启新特性即可：idempotencySave

## [](#23-卡片新增单据无需去空格)23. 卡片新增单据无需去空格

数组可以设置多个单据的billNo来不自动去除左右空格

{

 "env": {

 "validateNotTrim": ["voucher_order"]

 }

}

## [](#24-枚举select组件配置下方提示文字)24. 枚举select组件配置下方提示文字

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/pilinagyouhuayibubaocundengqitaxingongneng_image13.58ec0a21.jpeg)

字段的enumArray里的枚举对象添加一个bottomTip，这里就是要显示的信息，设置后，选择枚举下拉，下方会对应的动态切换相关的文本提示

[

 {

 "nameType": "text",

 "icon": null,

 "cDataRule": null,

 "bottomTip": "这里是提示的文本1的信息",

 "value": "不需要",

 "resid": "P_YS_PF_PC-UI_0000159812",

 "key": "1"

 },

 {

 "nameType": "text",

 "icon": null,

 "cDataRule": null,

 "bottomTip": "这里是提示的文本2的信息",

 "value": "新建和修改时需要",

 "resid": "P_YS_PF_PC-UI_0000160338",

 "key": "2"

 },

 {

 "nameType": "text",

 "bottomTip": "这里是提示的文本3的信息",

 "icon": null,

 "cDataRule": null,

 "value": "新建时需要，修改时不需要",

 "resid": "P_YS_PF_PC-UI_0000160339",

 "key": "3"

 }

]

## [](#25-servicecode改造相关解答)25. serviceCode改造相关解答

目前getRealServiceCode(),getDiworkCode()只存在日常测试中，后面验证无问题会预发、生产。

// 废弃,此serviceCode并不是query.serviceCode

viewmodel.getParams().serviceCode

 

// 正确做法：

viewmodel.getServiceCode() // 默认取dom id，没有的话取权限code

 

// 获得权限编码

viewmodel.getRealServiceCode()

// or

viewmodel.getParams().query.serviceCode

 

// 获得页面隔离diworkCode

viewmodel.getDiworkCode()

// or

viewmodel.getParams().diworkCode

## [](#26-check整单数据只携带当前行)26. check整单数据只携带当前行

// consul 配置领域特性

{

 carryCheckEmptyData: true

}

## [](#27-从excel批量粘贴表格数据设置查询不到数据就清空)27. 从excel批量粘贴表格数据设置查询不到数据就清空

给表格具体的列字段设置clearValid为true，这样当getRefData查询不到数据，就会清空，保存的时候就会校验空数据了

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/pilinagyouhuayibubaocundengqitaxingongneng_image14.89f423f9.png)

viewModel.getGridModel().getEditRowModel().get('castunitid__name').setState('clearValid',true)

## [](#28-openservice如何打开单据传递查询区条件)28. openService如何打开单据传递查询区条件

if (isequal) {

 queryJoincondition.commonVOs.push({

 itemName: 'isequal0',

 value1: isequal

 });

 }

 

 var data = {

 data: {

 condition: queryJoincondition

 }

 };

 window.jDiwork.openService('st_inventoryreconciliationdetail', null, data);