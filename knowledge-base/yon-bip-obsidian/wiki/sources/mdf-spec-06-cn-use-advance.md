---
title: "CN使用表达式"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/06-cn-use-advance"
section: "协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 协议]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# CN使用表达式

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/06-cn-use-advance | 所属：协议

# [](#cn使用表达式)CN使用表达式

## [](#1-使用方式)1. 使用方式

const renderParams = {

 params: {

 onlyRenderAdvance: true, // 必传且固定参数

 AdvanceItem: <AdvanceItem />, 编辑态组件

 allData: [], // 全量数据

},

 dom: document.body

}

cb.cn.filter.render(renderParams)

## [](#2-api中可传参数与含义对照)2. API中可传参数与含义对照

||属性名||类型||必传||含义|
||compareLogicMap||Object||||比较符列表|
||logicOp||String||||比较符默认对应字段，默认logicSymbol|
||childrenField||String||||子集对应字段，默认children|
||keyField||String||||数据唯一标识，默认itemName|
||valueField||String||||显示名称标识，默认cShowCaption|
||data||Object||||表达式树数据，新增时默无需传递|
||allData||Array||||全量数据|
||AdvanceItem||React Component||true||编辑态组件|
||.....||any||||所有通过API注入的内容均会通过props传递给|

## [](#3-获取数据)3. 获取数据

const data = renderParams.params.getData() // params为第一步的params对象

console.log(data)

## [](#4-结构示例)4. 结构示例

{

 "logicSymbol":"and",

 "id":"3027168355324160",

 "children":[

 {

 "itemName":"code",

 "compareLogic":"like",

 "value1":"",

 "value2":"",

 "id":"3027168355324162",

 "valueKey":"",

 "valueTitle":"",

 "value2Key":"",

 "parent":"3027168355324160",

 "cShowCaption":"编码",

 "itemId":2809261525144210,

 "value2Title":""

 },

 {

 "logicSymbol":"or",

 "iOrder":0,

 "id":"3027168355324161",

 "parent":"3027168355324160",

 "children":[

 {

 "id":"41bf45a4-798d-4c93-ab65-daf6c3d498c0",

 "parent":"3027168355324161",

 "itemName":"userDefine_7_002",

 "cShowCaption":"交易类型",

 "valueTitle":"",

 "compareLogic":"like",

 "value1":"",

 "value2":"",

 "value2Title":""

 }

 ]

 },

 {

 "id":"ecc0acd0-1c03-4401-8058-88a3ca9f3593",

 "parent":"3027168355324160",

 "itemName":"code",

 "cShowCaption":"编码",

 "valueTitle":"",

 "compareLogic":"like",

 "value1":"",

 "value2":"",

 "value2Title":""

 }

 ],

}

## [](#5-字段含义)5. 字段含义

均以上述结构为例，如修改了模块一中的配置，则以修改后的字段为准

||字段名||值||含义|
||logicSymbol||or/and|||
||id||||唯一标识符|
||children||||子集|
||itemName||||表达式条件唯一标识|
||compareLogic||||表达式条件比较符|
||value1||||表达式显示值（枚举类型时为编码）|
||value2||||表达式条件2显示值（枚举类型时为编码）|
||valueTitle||||表达式显示值（枚举类型时中文）|
||value2Title||||表达式条件2显示值（枚举类型时中文）|

## [](#6-实现原理)6. 实现原理

表达式组件共用原理为：按输入协议进行拖拽、新增、编辑、删除等操作后，会以固定的协议对初始传入数据进行修改，通过获取数据API将操作后数据进行返回。

常见场景实现方案：

- 编辑态组件需自行传入，双击/点击编辑按钮进入编辑态，则进入自定义组件，组件中按固定协议将操作后的关键字段存入协议对应字段中，进入编辑态时，可以通过props取到当前操作节点的数据对象以及最开始调用API时传入的所有参数，故所有自定义编辑态组件中需要的变量都可以通过API调用时通过params传递。
- 组件外其他方式新增节点：可以通过getData
进行当前操作后数据进行获取，然后对根节点下的children进行push，增加新的节点，协议参考上述对照即可。然后通过修改外层组件的state进行父组件更新，联动子组件重新渲染，同步新增的节点数据。
- 保存：通过getData进行数据获取，然后根据后端需要的协议对上述表达式进行转化后进行处理即可。