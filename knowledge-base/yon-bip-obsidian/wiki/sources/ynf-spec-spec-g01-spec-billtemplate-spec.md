---
title: "模版协议"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/spec/g01-spec-billtemplate-spec"
section: "YNF-协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 协议]
platform_version: "BIP V5"
source_type: ynf-docs
images: 4
---

# 模版协议

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/spec/g01-spec-billtemplate-spec | 所属：YNF-协议

# [](#模版协议)模版协议

## [](#1-ynf模板基本信息)1. YNF模板基本信息

Template Object 是描述模板基本信息的实体模型，作为YNF协议领域模型的聚合根定义了模板的多个关键信息：

- ynfVersion——模板使用的YNF协议版本 ，当前版本1.0；
- ownDomain——模板所属的微服务编号，例如yonbip-ec-contract ；
- busiObj——模板对应的业务对象，例如clmContract ；

其余模块则以聚合(Aggregation)的方式跟Template Object进行关联，包括不限于：

- 模板内容（ComponentTree Object）
- 模板数据源（DatasourceList Object）
- 模板渲染结构（UI Store Object, UI Actions Object, UI Reactions Object）
- 模板权限配置（Permission Object）

### [](#11-template-object-模板基本信息)1.1 Template Object 模板基本信息

||字段名称||字段类型||业务含义||说明（示例）|
||serialCode||String||YNF模型编号||唯一标识OID格式|
||ynfVersion||String||模版协议版本||1 - V1版本；历史模版中缺少改字段|
||ytenant_id||String||租户ID||0000LEF3WFZ11060HV0000，其中0代表系统租户|
||billPubts||Long||模版更新时间戳，作为UI模版的版本号||16922572080551692257208063，历史模版缺少该字段|
||ownDomain||String||所属引擎||"yonbip-ec-contract"|
||microServiceCode||String||所属微服务编号||"yonbip-ec-contract"|
||busiObj||String||业务对象||clmContract|
||billNo||String||单据编码||clmContractList|
||billType||String||单据类型||VoucherList|
||billNo||String||单据编码||clmContractList|
||detailBillNo||String||列表页对应的详情页单据编码||paymentMobileArchive|
||mobileBillNo||String||对应的移动端单据编码|||
||caption||String||单据名称||合同信息|
||controlType||String||UI类型||Bill|
||defaultTplId||String||默认模版ID|||
||funcFrontUrl||String||（专属化）租户扩展脚本URL||存储方式：文件服务|
||funcFrontCdn||String||（公有云）租户扩展脚本URL||存储方式：云存储|
||computedAttrUrl||String||（专属化）交互规则脚本URL||存储方式：文件服务|
||computedAttrCdn||String||（公有云）交互规则脚本URL||存储方式：云存储|
||ifFuncAuthControl||Boolean||是否启用功能权限控制||true|
||permissions||Permission Object||权限信息对象||{}|
||tplId||String||模版ID||1671674440747843592|
||tplMode||Number||模版布局模式，用途？||0，3|
||controlType||String||组件名称|||
||libCode||String||公共库编码||"ynf-lib-layout"|
||nid||String||设计器内组件id||"nid_239"|
||enumData||Map(String, Enum Data Object)||枚举数据值,||运行模型专用|
||enumTypes||Array[String]||枚举数据类型|||
||userDefines||[[User Defines Entity Object](#_User Defines Entity Object 数据对象)]||用户自定义项对象||[]|
||BillTemplate||Array[Component Tree Object]||模板内容-组件树|||
||dataSourcelist||DataSource List Object||模板数据源|||
||FunctionLib||Array[Component Tree Object]||模板内容-函数库|||
||Stores||Array[UI Stores Object]||模板渲染结构-数据模型集|||
||Actions||Array[UI Actions Object]||模板渲染结构-动作集|||
||Reactions||Array[UI Reactions Object]||模板渲染结构-副作用集|||

### [](#12-enum-data-object-枚举数据)1.2 Enum Data Object 枚举数据

目前为一次性返回单据内所有枚举类型，多种枚举数据合并请求的配置方式。

||字段名称||字段类型||业务含义||说明（示例）|
||key||String||枚举值编码key||“2”|
||nameType||String||枚举值类型||“number”|
||value||String||枚举值内容||"一般"|

数据示例
“enumData”: { $enumType: $enumDataObject}

### [](#13-enum-type-object-枚举数据类型)1.3 Enum Type Object 枚举数据类型

||字段名称||字段类型||业务含义||说明（示例）|
||enumTypes||Array||枚举类型集合对象|||

数据示例
[ "urgentLevel" // enumTypes ]

### [](#14-user-defines-entity-object-自定义项实体)1.4 User Defines Entity Object 自定义项实体

||字段名称||字段类型||业务含义||说明（示例）|
||entityUri||String||实体URI||"CLM.clmContract.clm_contract"|

数据示例
{"entityUri": "CLM.clmContract.clm_contract"}

## [](#2-ynf模板内容)2. YNF模板内容

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/template-spec-03.51ba5de4.png)

- ComponentTree Object 用于区分模板的页面模式，一个页面模式对应一棵组件树，当模板存在多个页面模式时，需定义多棵组件树，组件树常用来与交易类型组合使用，当交易类型切换时，模板内会渲染不同的组件树来展示不同的页面形态。
- Component Object 定义了页面内部的所有组件信息，包括不限于：布局组件、视图组件、导航组件、容器组件、数据录入组件、参照组件、支撑服务组件、审批流组件、业务流组件及自定义组件（详见自定义组件章节）。

并且Component Object支持自身的嵌套层级结构，以parentSerialCode（或parentAlias）标识父子间的引用关系。其中不同组件类型存在的不同属性定义（例如onChange、bAutoflt）并未在协议标准模型中描述，YNF2.0版本将独立为ComponentDefaultProp模型单独描述。

### [](#21-componenttee-object)2.1 ComponentTee Object

||字段名称||字段类型||业务含义||说明（示例）|
||serialCode||String||YNF模型编号||唯一标识OID格式|
||parentSerialCode||String||父级YNF模型编号|||
||caption||String||组件显示名称||合同信息|
||captionResid||String||组件显示名称多语词条|||
||controlType||String||控件类型名称||BillTemplate|
||orderNum||Number||排序|||
||level||Number||层级数|||
||nid||String||设计器内组件id||"nid_239"|
||children||[[Component Object](#_Component Object 数据对象)]||组件树层级描述||[]|

### [](#22-component-object)2.2 Component Object

以下协议信息紧描述组件公共属性业务含义，针对不同类型的组件，还有较多特殊用途的协议字段。

||字段名称||字段类型||业务含义||说明（示例）|
||serialCode||String||YNF模型编号||唯一标识OID格式|
||parentSerialCode||String||父级YNF模型编号|||
||alias||String||字段别名||"ybfilterinput6zi"|
||parentAlias||String||父级组件alias唯一值||"convenientquery"|
||caption||String||显示名称||"关键字搜索"|
||captionResid||String||组件显示名称多语词条|||
||compType||String||组件类型||"xcontrol"|
||biztype||String||组件关联实体对象||singleOption|
||field||String||组件关联数据源实体字段||reDirection|
||storeField||String||组件关联store实体字段||orgId|
||enumType||String||组件关联枚举数据id||urgentLevel|
||compareLogic||String||||"like",|
||controlType||String||控件类型名称||"FilterInput"|
||iOrder||Number||||0|
||iColWidth||Number||组件宽度||1|
||level||String||||7|
||libCode||String||公共库编码||"ynf-lib-dataentry",|
||orderNum||Number||||1|
||readOnly||String||是否只读(支持mobx协议)||false|
||disabled||String||是否禁用(支持mobx协议)|||
||visible||String||是否显示(支持mobx协议)|||
||required||String||是否必填(支持mobx协议)|||
||refCode||String||参照编号||"ucfbasedoc.bd_currencytenantref",|
||refEntityUri||String||参照实体uri||"bd.currencytenant.CurrencyTenantVO",|
||refReturn||Array[String]||参照返回值||["name"],|
||refReturnArr||String||参照返回值映射||"{\"name\":\"clm_contract,orgId_name\",\"id\":\"clm_contract,orgId\"}",|
||refReturnArrSort||String||参照返回值映射数组格式||["filterStore,FilterReferInputPc6tc", "filterStore,FilterReferInputPc6tc_name" ],|
||requestDomain||String||参照微服务|||
||selectKey||Boolean||参照是否选择主键|||
||selectType||String||参照单选or多选||Single或multiple|
||enumType||String||枚举类型|||
||enumValueSplit||Boolean||是否分割枚举|||
||multiple||Boolean||是否多选|||
||authid||String||授权编号|||
||defaultValue||Object||默认值||单值或Map结构|
||"defaultValue":{|||||||
||"status":"Insert", "code":"00000054", "id":"1720706423224008708", "name":"否"}|||||||
||nid||String||设计器内组件唯一id||"nid_1681789485791_7"|
||p_nid||String||设计器内父级组件id||"nid_1681789397355_6"|
||cStyle||CStyle Object||组件样式|||
||children||Array[Component Oject]||内含子组件|||

### [](#23-属性值支持动态表达式)2.3 属性值支持动态表达式

||字段名称||字段类型||业务含义||说明（示例）|
||dataSource||String||数据源编码||137|
||expr-dataSource||String||动态绑定数据源信息||mobx://rootStore.summary.total|
||expr-cStyle||String||组件动态配置cStyle样式规则||mobx://clm_contract.summary.unsubmit.backgroundColor|

### [](#24-属性值绑定mobx可观察对象)2.4 属性值绑定MobX可观察对象

后续调整：
store=“inject[‘rootStore.formStore’, ‘rootStore.tableStore’]”
enumData=”inject[‘rootStore.pageStore.enumData.econtractState’]”

||字段名称||字段类型||业务含义||说明（示例）|
||onClick||String||组件绑定onClick属性，属性值通过表达式从rootStore获取||mobx://rootStore.clm_contract.summary.selectTotal|
||store||String||组件绑定Store 属性，属性值通过表达式从rootStore获取||mobx://rootStore.formStore|
||enumData||String||属性绑定enumData属性，属性值通过表达式从rootStore获取||mobx://rootStore.pageStore.enumdata.econtractState|

## [](#3-ynf模板数据源)3. YNF模板数据源

[数据源协议](#/spec/g01-spec-datasource-spec)

## [](#4-ynf模板渲染结构)4. YNF模板渲染结构

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/template-spec-05.16de617c.png)

YNF协议的UI模板渲染结构参考了Mobx框架的设计， Mobx基于观察者模式设计了一套UI组件与数据模型间状态同步运转模式

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/template-spec-06.70fea798.png)

mobx的逻辑架构图

其中:

- UI Store Object描述了Mobx架构中的状态state部分，包含可进行状态观测的数据模型，常引用DataSource模型中的定义进行重新组合，例如表格TableStore
- UI Action Object 描述了Mobx架构中的动作action部分，包含可修改数据模型状态的前端动作定义，可直接引用业务对象层的action定义并设定当前模板使用场景的parameter，例如批量删除动作cmdBatchDelete
- UI Reaction Object描述了Mobx架构中的副作用Reaction部分，包括模板重要状态值变化后的后续业务逻辑，例如卡片渲染器cardReaction，当模板类型为card的时候就会触发cardReaction，进行卡片模式的渲染

### [](#41-store-协议)4.1 Store 协议

[Store 协议](#/spec/g01-spec-store-spec)

### [](#42-action-协议)4.2 Action 协议

[Action 协议](#/spec/g01-spec-action-spec)

### [](#43-reaction-协议)4.3 Reaction 协议

[Reaction 协议](#/spec/g01-spec-reaction-spec)

## [](#5-ynf模板权限配置)5. YNF模板权限配置

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/template-spec-07.d45537d5.png)
Permissions Object是模板描述权限配置及访问会话中当前用户权限配置情况的主实体，其定义了两个属性auth（Auth Object），fieldAuth（Fieldauth Object）分别用于描述模板内配置的功能权限和字段权限。

- Auth Object描述了模板内关联权限注册的权限ID及其名称，常用来描述模板内ToolbarItem按钮对应的注册authId（即工作台原子服务内配置的按钮编号），authName（即工作台原子服务内配置的按钮名称）
- Fieldauth Object描述了模板内参与字段权限控制的实体元数据信息，例如CLM.clmContract.clm_contract
- Fieldauth Item Object描述了模板内参与字段权限控制的实体元数据的属性信息，例如sourceSys，signDate，modifier.userName，currencyId.name

### [](#51-permissions-object-权限数据)5.1 Permissions Object 权限数据

||字段名称||字段类型||业务含义||说明（示例）|
||auth||[[Auth Object](#_Auth Object功能权限数据对象)]||功能权限集合对象||[]|
||fieldAuth||[[Field Auth Object ](#_Field Auth Obejct字段权限数据对象)]||字段权限集合对象||[]|

数据示例
"permissions": {
"auth": []
"fieldAuth": []
}

### [](#52-auth-object功能权限)5.2 Auth Object功能权限

功能权限

||字段名称||字段类型||业务含义||说明（示例）|
||authId||String||权限ID||clmContractList_cmdTempexport|
||authName||String||权限名称||附件下载|

### [](#53-fieldauth-obejct字段权限)5.3 Fieldauth Obejct字段权限

字段权限

||字段名称||字段类型||业务含义||说明（示例）|
||entityUri||String||字段权限实体||CLM.clmContract.clm_contract|
||fields||[[Field Auth Item Object](#_Field Auth Item Object)]||字段权限集合对象||[]|

### [](#54-fieldauth-item-object-字段权限)5.4 Fieldauth Item Object 字段权限

||字段名称||字段类型||业务含义||说明（示例）|
||fieldName||String||字段权限名称||sourceSys|
||signDate|||||||
||modifier.userName|||||||
||currencyId.name|||||||