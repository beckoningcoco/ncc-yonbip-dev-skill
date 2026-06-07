---
title: "YNF组件协议"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/spec/g01-spec-component-spec"
section: "YNF-协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 协议]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# YNF组件协议

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/spec/g01-spec-component-spec | 所属：YNF-协议

# [](#ynf组件协议)YNF组件协议

## [](#1组件库协议)1.组件库协议

{

	"yprCode": "iuap-yonbuilder-designer.builder-res-fe",

 "code": "bip_component_web",

 "name": "bip_component_web",

 "version": "1.0.24",

 "libType": "components",

	"domainKey": "iuap-yonbuilder-designer",

	"keywords": [		"bip_component_web",		"library"	],

	"description": "bip_component_web 组件包",

	"terminalType": 0,

	"group": [ ],	

 "components": [ ]

}

组件库描述协议如下：

||字段名称||字段类型||业务含义||说明（示例）|
||yprCode||String||组件库编码，和组件库制品编码一致|||
||code||String||组件版本|||
||name||String||组件文件入口|||
||version||String||版本号|||
||libType||String|||||
||domainKey||String||领域编码|||
||keywords||Array||关键字|||
||description||String||组件库描述|||
||terminalType||Number||终端类型||0，1|
||group||Array||分组结构描述||详见本文6.1.3|
||components||Array||组件包结构描述||详见本文6.1.2|

## [](#2组件协议)2.组件协议

{

 name: "按钮",

 code: "Button",

 icon: "lowcode lcButton",

 type: "basicControls",

 uiExtClass: "xbutton",

 compType: "xbutton",

 libraryGroupId: "baseGroup",

 props: [

 // ...

 ],

 events: [

 // ...

 ],

 children: [

 // ... 

 ]

}

每个YNF前端组件中，在工程的src/components/${componentDir}目录下均会存在一个组件可配置协议文件 manifest.js，详细协议描述如下：

||字段名称||字段类型||业务含义||说明（示例）|
||code||String||组件编码（英文）|||
||name||String||组件名称（中文）|||
||type||String||组件分类，TypeProps||TypeProps.LayoutContainer
TypeProps.DataContainer
TypeProps.BasicControls
TypeProps.FormControls
TypeProps.FunctionalControls
TypeProps.BusinessControls
TypeProps.InterfaceControls|
||description||String||组件描述|||
||uiExtClass||String||组件类型，UIExtClass||UIExtClass.Container，容器
UIExtClass.Control，控件
UIExtClass.Button，按钮|
||compType||String||组件类型，UIExtClass|||
||libraryGroupId||String||分组ID|||
||props||Array||组件属性结构描述|||
||events||Array||组件事件结构描述|||

### [](#21-组件属性协议)2.1 组件属性协议

props: [

 {

 name: "按钮大小",

 code: "size",

 type: FieldTypes.string,

 defaultValue: "lg",

 metaType: EditTypes.Select,

 metaProps: JSON.stringify({

 options: [

 { value: "lg", text: "大号按钮" },

 { value: "md", text: "中号按钮" },

 { value: "sm", text: "小号按钮" }

 ]

 }),

 showDesign: true

 }

]

||字段名称||字段类型||业务含义||说明（示例）|
||code||String||组件属性编码（英文）|||
||name||String||组件属性名称（中文）|||
||type||String||字段值类型，FieldTypes||FieldTypes.String、FieldTypes.number、boolean、object、date、action、child、array|
||description||String||属性描述|||
||defaultValue||String||跟随type字段值类型|||
||showDesign||Boolean||设计态显示与否|||
||metaType||String||meta类型||EditTypes.Select|
||metaProps||Array||meta属性|||

### [](#22-组件事件协议)2.2 组件事件协议

events: [{

 uiDefineId: "Button",

 operationCode: "onClick",

 operationName: "点击",

 uitypes: ["Button"]

}]

||字段名称||字段类型||业务含义||说明（示例）|
||operationCode||String||组件事件编码（英文）|||
||operationName||String||组件事件名称（中文）|||
||description||String||事件描述||String、number、boolean、object、date、action、child、array|
||uitypes||Array|||||

## [](#3分组结构协议)3.分组结构协议

"group": [

 {

 "id": "baseContainer",

 "name": "基础容器",

 "description": "用于描述基础容器",

 "children": [

 "BipButton"

 ]

 }

]

||字段名称||字段类型||业务含义||说明（示例）|
||id||String||分组编码|||
||name||String||分组名称|||
||description||String||分组描述|||
||children||Array||组件文件入口|||