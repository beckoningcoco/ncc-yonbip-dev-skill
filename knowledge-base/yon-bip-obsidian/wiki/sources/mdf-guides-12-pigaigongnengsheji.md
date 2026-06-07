---
title: "批改功能设计"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/12-pigaigongnengsheji"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 7
---

# 批改功能设计

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/12-pigaigongnengsheji | 所属：指南

# [](#批改功能设计)批改功能设计

教会如何使用批改组件、配置组件、详细参数、事件等

## [](#1-功能说明)1. 功能说明

批改用于单据修改数据过多，且可以批量修改为某一种值，快速的批量修改数据。

优化部分，批改多列的时候，会判断是否开启batchCheckSupport，

批改组件在不同的单据状态下，展示也是不同的，举例来说详见下方

||场景||组件展示||组件行为|
||列表（VoucherList）||||列表是直接请求batchModify后端修改数据，并且还会右下角显示进度球提示保存进度|
||卡片（Voucher）||||修改前端表格数据，随着save保存|
||生单列表（PushVoucherList）||同上||修改表格前端数据，随着推拉单pullVoucher拿到修改后的数据|
||编辑表（EditVoucherList）浏览态||同上||浏览态的时候直接请求后端接口batchModify修改数据|
||编辑表（EditVoucherList）编辑态||同上||编辑态是修改前端表格内模型数据，随着save保存后端|

## [](#2-如何配置)2. 如何配置

简单来说就是普通的按钮，配置到表格的右上方操作按钮，动作是
batchmodify，列表和卡片有一些不同，配置如下：

// 工具栏Toolbar配置一个按钮，动作为 batchModify

{

 "cCommand": "cmdBatchModify",

 "cAction": "batchModify",

 "cSvcUrl": "/bill/batchModify",

 "cHttpMethod": "POST",

 "fieldName": "btnBatchModify",

 "fieldRuntimeState": false,

 "cItemName": "btnBatchModify",

 "cCaption": "批改",

 "cCaptionResid": "P_YS_FED_FW_0000021804",

 "cShowCaption": "批改",

 "cShowCaptionResid": "P_YS_FED_FW_0000021804",

 "bEnum": false,

 "cControlType": "button",

 "iStyle": 0,

 "bVmExclude": 0,

 "iOrder": 0,

 "uncopyable": false,

 "bEnableFormat": false,

 "key": "btnBatchModify",

 "domainKey": "productcenter",

 "needClear": false

}

注意：如果是编辑表、卡片的批改，那么还要多一个childrenField字段，值是表的名字

{

 "cCommand": "cmdCheckModify",

 "cAction": "batchmodify",

 "cTarget": "ListBody",

 "childrenField": "orderDetails", // 该字段就是指定批改哪张主子表的

 "fieldName": "btnCheckModify",

 "fieldRuntimeState": false,

 "cItemName": "btnCheckModify",

 "cCaption": "批改",

 "cCaptionResid": "P_YS_FED_FW_0000021804",

 "cShowCaption": "批改",

 "cShowCaptionResid": "P_YS_FED_FW_0000021804",

 "bEnum": false,

 "cControlType": "button",

 "iStyle": 0,

 "bVmExclude": 0,

 "iOrder": 0,

 "uncopyable": false,

 "bEnableFormat": false,

 "key": "btnCheckModify",

 "domainKey": "udinghuo",

 "needClear": false

}

## [](#3-事件支持)3. 事件支持

批改组件内事件支持如下表

||事件||说明||备注|
||batchModifyReferProcess||参照列表展开前给扩展脚本处理|||
||batchModifySetFields||表格Columns||可以遍历字段修改默认属性、添加|
||beforeBatchModifyVoucher||确定批改前||modifyRowIndex, gridModel，batchCheckSupport|
||afterInsertRowsFromRefer||批改内的参照确定后||index, columnName|
||endBatchModifyVoucher||确定批改结束||modifyRowIndex, gridModel，batchCheckSupport|
||batchModifyReferSet||type=4的参照||极特殊情况使用，一般无用|
||beforeBrowse||批改里面的事件||rowIndex, cellName, context|
||beforeBatchModifyFieldOk||确定批改校验后前事件，可以阻止修改||modifyFieldName, 字段名modifyFieldValue, 字段修改值modifyFieldItem完成字段数据|
||beforeBatchModifySave||批改保存前值事件，可以阻止提交||data里有提交的数据|

## [](#4-属性配置)4. 属性配置

### [](#41-如何获得批改条件)4.1. 如何获得批改条件

viewModel.getCache("batchModifyCondition")

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/pigaigongnengsheji_image3.9045a749.jpeg)

返回对象

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

### [](#42-批改操作运算符)4.2. 批改操作运算符

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

### [](#43-批改条件塞入)4.3. 批改条件塞入

bCanFilter: true

### [](#44-自定义csvrurl替换)4.4. 自定义cSvrUrl替换

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

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/pigaigongnengsheji_image4.99de2482.jpeg)

### [](#45-确定修改前处理事件)4.5. 确定修改前处理事件

return false会阻止本次修改，选择几列字段就会执行几次

viewModel.on('beforeBatchModifyFieldOk',obj=>{console.log(obj);return false})

### [](#46-获得批改按照条件过滤后的行索引)4.6. 获得批改按照条件过滤后的行索引

返回值是数组，过滤后的可修改行索引

viewModel.getCache('batchModifyFilterIndexes');

### [](#47-设置批改关联字段)4.7. 设置批改关联字段

当想设置关联批改字段关系的时候，需要我们设置一下修改A关联修改B的逻辑，也就是下图所示，选择【来个数值1】自动添加关联关系字段【来个数值2】

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/pigaigongnengsheji_image5.f776a6c8.jpeg)

扩展脚本编写如下：

viewModel.setCache('BatchModifyLinkage', [{ field: 'bodyFreeItem!define3', linkField: 'bodyFreeItem!define4', linkFieldCaption: '来个数值2', UEType: 1 }]);

||配置||说明|||
||field||匹配当前选择触发字段|||
||linkField||被关联的字段|||
||linkFieldCaption||被关联的字段名|||
||UEType||被关联字段类型||1数值类、2文本类、3枚举类、4/5参照或级联参照|

### [](#48-隐藏操作radio)4.8. 隐藏操作radio

设置批改按钮的UI元数据cParameter字段内容为：hideRadio: true

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/pigaigongnengsheji_image6.45eda9c6.jpeg)

### [](#49-单独控制数值类运算符可显示字段)4.9. 单独控制数值类运算符可显示字段

设置批改按钮的UI元数据cParameter字段内容为：operatorOption: ['=',
'+', '-', '*', '/']

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/pigaigongnengsheji_image7.de6810ef.jpeg)

### [](#410-批改后参照以外的数据aftercellvaluechange不会执行如何替代)4.10. 批改后参照以外的数据afterCellValueChange不会执行如何替代

针对批量粘贴后没有触发afterCellValueChange两种解决方法，扩展脚本单独开启viewModel.getParams().batchPasteTriggerEvent
= true;

但是这样会每行触发违背了优化渲染一次的原则，会导致表格卡顿，除非数据量少，不建议这个。

第二种就是框架会执行一次批量值改变事件 表格的（endBatchModifyVoucher）

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/pigaigongnengsheji_image8.0e0705b6.jpeg)

gridModel.on('endBatchModifyVoucher', function(obj) {})

### [](#411-列表批改如何支持追加)4.11. 列表批改如何支持追加

批改追加列表默认不显示，需要监听事件，把要显示追加的文本(input)字段加入到数组即可。

卡片追加默认支持无需设置。

gridModel.on('batchModifyShowAppend', function(showAppendArr){showAppendArr.push('detail!mnemonicCode')})

### [](#412-卡片态参照如何使用beforegetrefdata来设置请求前的一些参数)4.12. 卡片态参照如何使用beforeGetRefData来设置请求前的一些参数

gridModel.on('beforeGetRefData', function(param) {

 console.log(param);

});

### [](#413-批改显示字段的排序字段如何修改)4.13. 批改显示字段的排序字段如何修改

批改组件的字段是根据表格的字段UI元数据iOrder进行排序的，想修改配置批改按钮元数据cParameter里设置orderField即可

const orderField = cb.utils.parseCParameter(this.params.cParameter).orderField || 'iOrder'; // 默认排序使用iOrder，可自定义修改排序字段规则

_.sortBy(gridColumns, function (o) { return o[orderField]; });

### [](#414-批改组件的字段修改项右侧提示tips信息)4.14. 批改组件的字段修改项右侧提示tips信息

viewModel.on('batchModifySetFields', function(data) {

 data[6].cDesc = '物料提示文字信息'

})

### [](#415-批改支持-自定义设置修改范围条件的显隐)4.15. 批改支持 自定义设置【修改范围】条件的显隐 

批改组件的 修改范围
在批改按钮ui元数据cParameter里设置initRangeType，(mdd类型单据在command表的paramter字段)，类型为json字符串

根据本文第1条【功能说明】里介绍 批改的场景分为列表（voucherlist），
卡片(voucher)， 生单界面(pull) ，各场景默认按钮值及页面显示如下：

{

 voucherlist: [

 { code: 0, text: 仅选中记录 },

 { code: 1, text: 所有查询记录 }

 ],

 voucher: [

 { code: 1, text: 全部 },

 { code: 0, text: 按条件 },

 { code: 2, text: 仅选中记录 }

 ],

 pull: [

 { code: 0, text: 仅选中记录 },

 { code: 1, text: 所有查询记录 },

 { code: 2, text: 按条件 }

 ]

}

示例：

如果是卡片页（voucher） initRangeType配置为"1,2"，则会展示
全部和仅选中记录， 如果配置为"0",则只展示 按条件

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/pigaigongnengsheji_image9.77d4d0d7.png)

注：默认选中规则：

进入批改弹框时，如果列表里有选中的数据，默认选中 仅选中，否则选中全部。
如果领域有设置，以设置的为主

取领域默认选中的配置的2种情况
     * 1. 如果用户仅配置了一种选项，
     * 2.
用户配置了多种选项，但是和默认的不匹配（客户默认配置了1,2，但是默认是要选中0）

《[批改组件等其他新功能页面](#/guides/12-pilinagyouhuayibubaocundengqitaxingongneng)》

### [](#416-参照字段参照列表弹框在打开前可多对显示数据自行处理)4.16. 参照字段，参照列表弹框在打开前可多对显示数据自行处理

监听batchModifyReferProcess， 在这个钩子函数里，入参是当前模型vm，
可以使用vm获取到修改的字段的模型， 然后在这里给改字段绑定需要的事件，

例如：获取到当前批改字段的模型，
然后监听参照的beforeBrowse事件，进行传参。以获取返回的展示数据。

这个监听函数里可以获取到所有可批改字段的模型，从而操作批改字段

### [](#417-支持异步拦截)4.17. 支持异步拦截

想在批改点击确定前，做一些异步的操作，例如调接口，
2次弹框提示等，可以监听beforeBatchModifyFieldOk

viewModel.on("beforeBatchModifyFieldOk", (data) => {

 const promise = new cb.promise();

 cb.utils.confirm(

 "提示信息",

 () => {

 // 根据实际情况 promise.resolve()或者 promise.reject() 

 // promise.resolve()为允许批改 promise.reject()为阻止批改

 },

 () => {

 promise.reject();

 }

 );

 

 return promise;

});

 

// 此外， 如果不涉及到异步情况，只是想阻止批改 可以不使用promise

 

viewModel.on("beforeBatchModifyFieldOk", (data) => {

 // 根据实际情况 return false

// false 为阻止批改

});

### [](#418-不想批改某个字段怎么操作)4.18. 不想批改某个字段怎么操作

不想批改某个字段，支持2种方式

- 预置这个字段的bCanModify为false
- 可以通过前端扩展脚本处理监听batchModifySetFields

viewModel.on('batchModifySetFields',(fields) => {

 // 将对应字段的bCanModify设置为false

});

### [](#419-批改弹框里没有找到想批改的字段)4.19. 批改弹框里没有找到想批改的字段

- 检查这个字段的bCanModify是否为true， ture才能批改
- 检查这个字段是否为虚拟字段， 虚拟字段不支持批改（bVmExclude ! == 2）

非虚拟字段也可以通过扩展脚本设置批改

viewModel.on('batchModifySetFields',(fields) => {

 // 将对应字段的bCanModify设置为true

});

### [](#420-列表页批改完成后弹框没有关闭)4.20. 列表页批改完成后弹框没有关闭？

弹框的关闭取决于是否批改成功，
批改成功的标志是接口返回res.code为200,并且res.data.failCount是0

{

 code: 200，

 data: {

 failCount: 0，

 ....

 }

}