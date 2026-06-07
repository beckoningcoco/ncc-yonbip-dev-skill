---
title: "公式-运行时"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/13-gongshiyunxingshi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 4
---

# 公式-运行时

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/13-gongshiyunxingshi | 所属：指南

# [](#公式-运行时)公式-运行时

# [](#批量公式配置指南)批量公式配置指南

只需要在UI元数据上配置对应属性，像excel里的公式一样进行计算。

# [](#批量公式配置指南-1)批量公式配置指南

## [](#1-如何开启批量公式)1. 如何开启批量公式

批量公式是优化后的版本，建议开启批量公式，非批量公式使用会慢慢废弃。

目前批量公式专属化930sp、R5和公有云都已支持。批量公式设计详细见文档 [批量公式](#/guides/13-pilianggongshi)。

公有云新租户已默认开启批量公式，新租户可以通过window.jDiwork.diworkContext().businessPreferConfig.common?.batchFormula 查看是否开启了批量公式，工作台层面不可关闭批量公式。如果要关闭，领域打开特性开关disabledFormula2。

### [](#11-领域添加特性开关-formula2)1.1. 领域添加特性开关 `formula2`

特型开关添加地址：[https://mdf-consul.diwork.com](https://mdf-consul.diwork.com/ui/dc1/kv/prod/mdf-node/apps/upu/edit)，参考文档[MDF服务配置中心权限](#/node/02-config-item-desc)，可以按领域生效或按单据生效。需要领域前端负责人添加。

### [](#12-如果是专属化项目可以在项目级配置文件按照单据开启或者按所有单据都开启)1.2. 如果是专属化项目，可以在项目级配置文件按照单据开启，或者按所有单据都开启

参照[项目级配置工具（R5 & R6）](#/node/03-config-tool)

"globalVars": {

 "__MDF_FEATURE_CONFIG__": {

 "formula2": [

 "znbzbx_travelexpbill" // 对应billNo 或者 formula2: "~"开启所有单据

 ]

 }

 }

### [](#13-按租户-id-开启)1.3. 按租户 ID 开启

按租户id开启得由MDF开启。

### [](#14-浏览器控制台打开)1.4. 浏览器控制台打开

（调试或测试使用）

打开： **COMMON_FEATURES_LIST**.whitelist[10] = 'formula2'

关闭：window.**MDF_FEATURE_CONFIG**.disableFormula2 = '~'

## [](#2-配置公式)2. 配置公式

### [](#21-字段-ui-元数据-cextprops-上配置)2.1. 字段 UI 元数据 `cExtProps` 上配置

2.1. 字段UI元数据cExtProps上配置：

||属性名||默认值||例子||描述|
||iFromula||1||1||配置1 代表该字段是公式字段|
||formula||无||price*strToNum(sum)||公式表示式|
||iFormulaFuns||无||strToNum||公式中对应的函数|
||iFormulaTriggers||无||price,sum||公式中对应的变量|

### [](#22-低代码高级设计器配置)2.2. 低代码高级设计器配置

打开高级设计器界面，先选中字段，再点击【编辑公式】
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gongshi-yunxingshiimage1.162f13e0.png)

## [](#3-运行时协议)3. 运行时协议

运行时从字段模型中解析出公式
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gongshi-yunxingshiimage2.a515177e.png)
以下命令可快速查看单据中所有的公式

yya.getCache('formulaRules'); // 查看所有公式

__reBuildFormula(yya); // 查看精简结构后的公式

__triggerForTargets(yya); // 查看字段作为因子对应触发的公式集合

## [](#4-公式调试)4. 公式调试

// 控制台执行

cb.debugRule = true; // 打开log调试

cb.debugRuleValue = true; // 打开log调试，只调试值变化

cb.extendRule = false; // 关闭所有公式

 

// url上添加

&debugRule = true; // 打开log调试

&debugRuleValue = true; // 打开log调试，只调试值变化

&extendRule = false; // 关闭所有公式

## [](#5-公式触发时机)5. 公式触发时机

||公式触发时机||备注|
||公式触发时机||备注|
||字段值变化||公式B = A + 1，修改单据上A字段，触发公式计算，会给B字段进行赋值。|
||表格单元格值变化||公式A.a = A.b + 1，修改表体A上的b字段，触发公式计算，会给表体A上的a字段进行赋值。|
||进入新增态/推单||单据进入新增态/推单，运行时会进行公式计算。为了性能考虑，会排除因子为空的公式（有对应需求改用配页面初始化的交互规则进行实现）。|
||进入编辑态/浏览态||单据进入编辑态/浏览态，运行时不会进行公式计算。单据正常调用bill/detail接口展现数据，想要bill/details也返回公式计算结果，可以把公式字段配置成非持久化字段，字段配置bVmExclude=2。|
||列表页/生单界面||列表页打开，运行时不会进行公式计，单据正常调用bill/list接口展现数据，想要bill/list也返回公式计算结果，可以把公式字段配置成非持久化字段，字段配置bVmExclude=2。|
||切换主组织调用add接口后||和进入新增态一样会触发公式给页面赋默认值|
||表体参照多选||会给整个表格重新计算公式，不区分是新增了哪几行|
||增行||新增那一行会触发公式，如果表头字段配置了sum类的合计公式也会触发|
||删行||如果表头字段配置了sum类的合计公式会触发|
||更新行||判断当前行赋值前后是否有单元格发生值变化，如果有，触发对应的公式|
||批量增行||直接触发整个表体的公式|
||check回调||check回调更新行时，判断当前行单元格是否有值发生变化，如果有触发对应的公式|
||公式计算导致的值变化||公式计算值，发生的值变化，会触发该值作为因子的公式进行计算|
||扩展脚本赋值触发值变更事件||触发值变更就会触发该字段作为因子的公式进行计算，赋值不触发值变更事件就不会触发公式|
||参照携带值||公式的因子字段都会被加上needCheck属性，参照携带值也会触发值变更，进而触发公式|
||生单工作台切换||生单工单台相当于新增态，切换数据会触发公式|
||excel批量粘贴||表体批量粘贴会触发公式，表体整列进行计算|
||批改||表体批改字段，字段作为因子的公式字段整列都会进行公式计算|

## [](#6-公式计算方式)6. 公式计算方式

通过字段模型上的iFromulaFuns和iFormulaTriggers属性判断公式是否需要后端进行计算。

### [](#61-前端公式)6.1. 前端公式

非特征字段的简单的四则运算和常见的数学函数会进行前端计算，不调用公式接口。这样的好处是性能高不用请求后端接口。
计算逻辑在： /mdf-cube/src/staterule/parse.js中
公式比如：
price 等于另一个字段
price*log(new1) 数学函数四则运算
new1+new2 字段串拼接

### [](#62-后端公式---单独接口计算)6.2. 后端公式 - 单独接口计算

公式支持丰富的函数可供计算，会调用/bill/executeFormulaCalculate emu lCalculate

公式比如：

sum(childrenField,"childrenField.new1") 求和

count(childrenField) 表格数据长度

API请求参数：

||参数名||例子||备注|
||billnum||voucher_order||单据编码|
||data||{"zi00001List":[{"new1":"111"}]}||参与计算参数|
||externalData||{new1: "sum(A,"A.a")"}||key： 需要计算的公式字段value: 对应的公式|

请求示例：
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gongshi-yunxingshiimage3.53161914.png)

API返回值示例：
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gongshi-yunxingshiimage4.ed394f09.png)

### [](#63-后端公式---业务数据直接返回计算结果)6.3. 后端公式 - 业务数据直接返回计算结果

detail接口或list接口直接返回公式计算结果，前端不再进行计算，非持久化字段(bVmExclude=2)会计算，持久化字段(bVmExclude=0)读库不会计算。

## [](#7-扩展-api)7. 扩展 API

### [](#71-公式触发)7.1. 公式触发

#### [](#711-直接触发)7.1.1. 直接触发

viewmodel.execute('formulaRules', targets, noClear,noDebounce);

||属性名||默认值||例子||描述|
||targets||[]||[{target: 'new1'}]||可传数组，不传默认所有公式，target支持传1、childrenField.field 子表某个字段2、childrenField 整个子表3、field 主表单个字段|
||noClear||false||false||是否不清除公式计算临时属性|
||noDebounce||false||false||是否不防抖，连续多次触发防抖属性|

// 例子 触发orderDetails子表的所有公式

viewModel.execute('formulaRules', [{target: 'orderDetails'}]);

#### [](#712-赋值触发)7.1.2. 赋值触发

扩展脚本赋值默认不触发公式，想要触发公式需要触发字段的值变更事件

// 例子

viewModel.get('new1').setValue('hello world'); // 不触发公式和交互规则

viewModel.get('new1').setValue('hello world', true); // 触发公式和交互规则

viewModel.get('child').setCellValue(0, 'new1', 'hello world'); // 不触发公式和交互规则

viewModel.get('child').setCellValue(0, 'new1', 'hello world', true); // 触发公式和交互规则

 

// 组合方式

viewModel.get('new1').setValue('hello world'); // 只写这个不触发公式和交互规则

viewModel.get('new1').execute('afterValueChange', {}); // 用来触发公式和交互规则

#### [](#713-动态绑定)7.1.3. 动态绑定

//表头M字段配置公式 = 子表C的a字段合计，需要传下面协议

consr rules = [{

 exprType: 0, // 默认0

 target: 'M', // 配了公式的字段cItemName，如果是子表，为[childrenField].[cItemName]

 scrExprType: 0, // 默认0

 iFormulaTriggers: 'C,C.a', // 公式编辑器生成

 iFormulaFuns: 'sum' // 公式编辑器生成

 srcExpression: 'sum(C,"C.a")' // 公式编辑器生成

}]

//绑定事件

cb.staterule.runRule(viewmodel, rules, 'listener')

 

//执行事件

cb.staterule.runRule(viewmodel, rules, 'execute')

#### [](#714-编辑态或复制时触发公式)7.1.4. 编辑态或复制时触发公式

编辑态和复制默认不触发公式，想要触发可以在扩展脚本添加如下代码实现

// 复制时想触发添加如下

viewModel.on('afterLoadData', ()=>{

 viewModel.on('afterRule', ()=>{

 if (viewModel.getParams().action=='copy') {

 viewModel.execute('formulaRules');

 }

 })

})

viewModel.on('afterCopy', ()=>{

 viewModel.execute('formulaRules');

})

 

// 编辑时想触发添加如下

viewModel.on('afterLoadData', ()=>{

 viewModel.on('afterRule', ()=>{

 if (viewModel.getParams().mode=='edit') {

 viewModel.execute('formulaRules');

 }

 })

})

viewModel.on('afterEdit', ()=>{

 viewModel.execute('formulaRules');

})

#### [](#715-非-voucher-页面适配公式)7.1.5. 非 voucher 页面适配公式

目前只有voucher页默认支持前端解析公式然后进行计算，其他类型单据相加支持添加如下脚本。

总共2步：

1、脚本init时触发，写在扩展脚本最上面

cb.biz.common.voucher.do('formularule', viewModel)

2、必要时机手动触发

gridModel.on('afterSetDataSource', function(){ viewModel.execute('formulaRules', [{target: gridModel.getCache('name')}]); // 子表的childrenField

})

## [](#8-公式配置问题)8. 公式配置问题

1、公式使用过程中不知道如何配置公式可联系公式产品赵丽娜确认。
2、公式配置参考文档：[https://docs.diwork.com/l/31a3F3909ee1](https://docs.diwork.com/l/31a3F3909ee1)。

## [](#9-公式问题排查指南)9. 公式问题排查指南

1、如果公式使用者不确定公式配置是否正确，可让查看公式配置文档：[https://docs.diwork.com/l/31a3F3909ee1](https://docs.diwork.com/l/31a3F3909ee1)
2、排查文档 [公式问题排查指南](#/guides/13-gongshiwentipaichazhinan)