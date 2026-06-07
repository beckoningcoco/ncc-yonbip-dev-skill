---
title: "批量公式"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/13-pilianggongshi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 批量公式

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/13-pilianggongshi | 所属：指南

# [](#批量公式)批量公式

## [](#1-背景)1. 背景

- 公式接口请求太多有性能问题，需要合成一个
- 支持显示值变化也能触发公式

## [](#2-设计方案)2. 设计方案

### [](#21-整体架构)2.1 整体架构

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/pilianggongshiimage1.94052e92.jpg)

### [](#22-计算赋值链路)2.2 计算赋值链路

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/pilianggongshiimage2.3dbe022a.jpg)

### [](#23-计算流程图)2.3 计算流程图

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/pilianggongshiimage3.7a76fadf.jpg)

### [](#24-target和trigger)2.4 target和trigger

#### [](#241-标准语法)2.4.1 标准语法：

自定义项特征和自由项特征
[子表childrenField] + '.' + [孙表childrenField] + '.' + [特征depend] + '.' + [特征characterKey]
普通字段
[子表childrenField] + '.' + [孙表childrenField] + '.' + [字段cItemName]

#### [](#242-穿透场景)2.4.2 穿透场景

公式因子为穿透属性需要进行转换
[字段cItemName] + '.xx' + '.xx' + ... ====> [字段cItemName]
例子：转换前：canzhao.name 转换后：canzhao
公式因子为平行表会进行转换
[字段cFileName] + '.xx' + '.xx' + ... ====> [字段cItemName]
转换前：productDetail.productVendor.name 转换后：detail!productVendor

## [](#3-触发时机)3. 触发时机

||触发时.||是否触发公式||触发公式范围||是否触发常量公式||MDF对应触发时机|
||新增进卡片||是||所有常量公式+所有变量公式||是||afterLoadData|
||修改表头字段||是||因子是该字段的变量公式||否||afterInnerValueChange|
||修改表体单元格||是||因子是该单元格的变量公式||否||afterInnerCellValueChange|
||扩展脚本赋值||是||因子是该字段的变量公式||否||afterInnerValueChange等|
||表体增行||是||行内计算，因子是表体的变量公式，表体常量公式||否||afterInsertRow,afterInsertRows|
||表体删行||是||因子是表体的表头变量公式||否||afterDeleteRows|
||表体更新行||是||行内计算，因子是更新单元格的变量公式||否||afterInnerUpdateRow|
||表体查询数据||是||因子是表体的所有常量公式和变量公式||是||afterSetDataSource|
||check||是||因子是变化字段的公式||是||afterCheck|
||cellCheck||是||行内计算，因子是变化字段的变量公式||是||afterCellCheck|
||复制进卡片||否||-||否|||
||复制行||否||-||否|||
||表体参照多选||是||行内计算，因子是如果当前行，单元格变化作为因子，如果新增行，表体所有变量公式和常量公式||是||afterInnerUpdateRow,afterInsertRows|
||参照携带||是||因子当前参照和携带值的所有变量公式||否||afterInnerValueChange,afterInnerUpdateRow|
||批量粘贴||是||行内计算，因子是当前粘贴列所有公式||否||afterCellValueChange|
||批改||是||行内计算，因子是当前批改列所有公式||否||afterInnerCellValueChange|
||切换主组织||是||所有常量公式+所有变量公式||是||afterWorkbench|
||生单工作台切换||是||所有常量公式+所有变量公式||是||afterMasterOrgChange|
||列表页||否||-||-||后端list接口返回公式计算结果|
||生单页||否||-||-||后端list接口返回公式计算结果|

## [](#4-api)4. API

公式划分：
1、变量公式字段（触发维度：因子）
2、常量公式字段（区分维度：表头、表体1~表体n）

### [](#41-dispatchdiscreteformula)4.1 dispatchDiscreteFormula

按照字段进行触发
viewmodel.execute('dispatchDiscreteFormula', trigger);
参数：

||参数名||是否必传||描述|
||trigger||是||触发源|

||trigger里参数||是否必传||描述|
||triggers||是||触发的因子 例子：A、M.a|
||targets||否||触发的公式字段 例子：B、M.b，如果不传以triggers会动态计算出targets|
||init||否||是否初始化 []/初始化表头+所有表体 ['chidlirenField']/初始化某个表体|
||indexs||否||当前操作行，如果为空整列或者表头计算|

### [](#42-示例)4.2 示例：

viewmodel.execute('dispatchDiscreteFormula',[{triggers: ['A.a'], targets:['A.b'], init: [], indexs: [0]}]);

### [](#43-formularules)4.3 formulaRules

触发所有公式
viewmodel.execute('formulaRules',[{targets: []}]);
参数：

||参数名||是否必传||描述|
||targets||否||触发源 不传触发所有|

示例：
viewmodel.execute('formulaRules');

### [](#44-state状态协议)4.4 state状态协议

查看方式 *formula* + [billNo] 或者yya.getCache('formulaRules')

// 变量公式集合

this.formulaFiels = {

 [target]: {

 key: [target], // 公式字段target

 formula, // 配置的公式

 iFormulaTriggers, // 公式的因子

 iFormulaFuns, // 公式的函数

 cShowCaption,// 公式字段中文描述

 formulaDisplay, // 配置的公式中文描述

 model, // 字段模型

 childrenField, // 是否是子表字段

 triggers, // 触发因子对象，可以追溯到根

 }

 ...

}

//常量公式集合

this.formulaConstField = {

 cShowCaption: '无因子字段',

 allTriggerTargets, // 所有常量公式

 main: {

 allTriggerTargets: mainFields, // 表头常量公式

 },

 children: { // 表体常量公式

 childrenFields: {

 allTriggerTargets

 }

 ...

 }

}

//公式因子集合

this.formulaTrigger = {

 [trigger] : {

 key: [trigger], // 触发因子

 allTriggerTargets, // 因子对应触发的所有公式字段

 model, // 因子模型

 childrenField, // 是否是子表字段

 }

 ...

}

### [](#45-公式关系协议)4.5 公式关系协议

待续...

1、公式控制显示隐藏、是否可编辑等状态，比如visible='iif(status=='1',true,false)' disable='ajax('/ddddddd',function(res){res.status==status})'
2、动态注册公式
3、公式执行日志

### [](#46-扩展能力开发)4.6 扩展能力开发