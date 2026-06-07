---
title: "StoreFieldType协议"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/spec/g02-spec-store-field-type"
section: "YNF-协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 协议]
platform_version: "BIP V5"
source_type: ynf-docs
images: 2
---

# StoreFieldType协议

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/spec/g02-spec-store-field-type | 所属：YNF-协议

# [](#storefieldtype协议)StoreFieldType协议

## [](#介绍)介绍

- YNF组件可以与Store对象的字段进行绑定：当Store字段的值发生变化时，YNF组件刷新，显示新值的内容；YNF组件也可以通过onChange事件给Store回写用户输入的数据。
- YNF组件可以绑定Store对象上的一个或多个字段的值

示意图(组件在初始化时候会根据UI协议创建对应的store：与store通过store.setValue store.getValue 与数据层store进行交互)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/image2024-6-18_16-28-23.4bc8a8e4.png)

## [](#协议定义)协议定义

### [](#协议描述)协议描述

||属性名||值||类型||默认值||描述、说明||支持值|
||storeFields||[ "alias1", "alias2" ]||Array||||store上字段的alias的数组|||
||storeFieldType||['type1','type2']||Array||[ "base" ]||store上字段的类型的数组||目前可选类型（后续会逐步增加）：base,number,refer,"characteristics"|
||storeField||fieldAlias||||||store上字段的alias|||

📢 当storeFields被配置时，优先使用storeFields，没有配置时，使用storeField（storeFieldType是对具体字段类型的进一步描述，默认为base类型）

### [](#storefieldtype类型介绍)storeFieldType类型介绍

||字段类型||formStore||tableStore||说明||分类|
||base||BaseField||BaseColumn||基础类型（any 存取一致不添加额外处理）||基础类型|
||number||NumberField||NumberColumn||数值类型（数值列处理，如precision精度等）|||
||refer||ReferField||ReferColumn||参照类型（参照逻辑处理，如参照带入等）|||
||定义属性storeFields: []||ArrayField||ArrayField||多字段类型（统一处理多个字段）||复杂类型（包含一个或多个基础类型）|
||characteristics||CharacterField||CharacterColumn||特征组类型|||

📢 store中具体类型的创建：如果storeFieldType不为空则优先根据storeFieldType进行处理；若storeFieldType为空则通过controlType进行推断（controlType是组件名，内置一些默认逻辑进行判断，通常仅针对平台预制组件）

### [](#协议示例)协议示例

- 一个组件绑定到new1和new2两个字段时

{ 

 "storeFields": ["new1","new2"], 

 "storeFieldType": ['base','number'] 

}

- 未配置storeFieldType，只绑定一个字段时

{ 

 "storeField": "new1", 

 // "storeFieldType": ["base"] 默认值 

}

- 未配置storeFieldType，只绑定多个字段时

{ 

 "storeFields": ["new1","new2"], 

 // "storeFieldType": ["base", "base"] 默认值 

}

### [](#自动类型推测)自动类型推测

storeFieldType是store中每一项的类型标识，配置storeFieldType则优先根据该值创建具体类型（如扩展当前参照组件，配置storeFieldType : ["refer"]，会自动创建该项为参照类型，进一步复用内部的参照带入，元数据带入等功能）

配置未配置storeFieldType时，ynf-core-engine会根据controlType自动推测storeFieldType的值，推测如下：

||storeItem||UI协议||结果|||
||storeFieldType存在||storeFieldType存在||storeItem中的storeFieldType||单值场景|
||storeFieldType不存在||storeFieldType存在||UI协议中的storeFieldType|||
||storeFieldType不存在||storeFieldType不存在||根据UI协议中的controlType进行推断|||
||storeFieldType存在||storeFieldType不存在||storeItem中的storeFieldType|||
||字段 storeFieldType存在||storeFields存在||storeFields中的每个值都同上述单值场景，storeFields > 1 则创建多值，否则创建单值||多值场景|
||字段 storeFieldType不存在||storeFields不存在，则取storeField|||||

## [](#store和组件配置)store和组件配置

storeFieldType可以配置在Store的字段上，也可以配置在组件上。

// stores中fieldsArr中每一个storeItem协议支持增加storeFieldType属性

[

 {

 "alias": "new1",

 "bizType": "text",

 "caption": "字段1",

 "field": "new1",

 "storeFieldType": ["string"]

 }

 {

 "alias": "new2",

 "bizType": "int",

 "caption": "字段2",

 "field": "new2",

 "storeFieldType": ["number"]

 }

]

## [](#前端开发使用参考)前端开发使用参考

单值场景：单值组件与数据通过storeField：string，对应的key值映射数据

多值场景 ：通过协议中配置storeFields: array，对应要操作的多个字段key

多值场景举例：新定义一个日期范围组件，该组件与数据层的交互value为 `[string, string]`,该场景中添加storeFields字段对应后端的存储字段，storeFieldType类型为 `['base', 'base']`因为默认为base类型所以可以省略！

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/image2024-6-18_11-29-14.64ca29c7.png)

⚠️ 以上针对前端操作多个后端值场景（如传递数组但是后端不接收数组类型，此时需要用两个字段对应到组件操作的值）。store下的base类型字段本质上为any，具体类型与组件onChange回调的值对应，如上述日期范围设置为['2024-07-10 00:00:00', '2024-07-29 23:59:59']，base类型下会将该值传递给后端。