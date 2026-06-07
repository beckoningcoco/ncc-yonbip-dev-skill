---
title: "页面协议详细介绍"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/spec/g03-spec-relationship"
section: "YNF-协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 协议]
platform_version: "BIP V5"
source_type: ynf-docs
images: 6
---

# 页面协议详细介绍

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/spec/g03-spec-relationship | 所属：YNF-协议

# [](#常见页面协议介绍)常见页面协议介绍

## [](#页面协议概览)页面协议概览

![页面协议概览](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-spec-relationship.1342162d.png)

## [](#页面协议组成介绍)页面协议组成介绍

||协议对象||组成||描述|
||store数据对象||rootStore、pageStore、FormStore、TableStore、FilterStore、PagingStore、TreeStore、WorkFlowStore等持续补充中...||前端数据存储的模型，里面提供了数据和操作数据的api|
||action事件||bill单据相关 、businessflow业务流相关 、navigate路由相关、print打印相关 、workflow工作流相关等持续补充中...||页面事件，比如提交，新增这种可触发的事件的参数|
||reaction副作用||ListReaction 、CardReaction、TreeCardReaction、TreeListReaction等持续补充中...||页面副作用，不同的类型页面有不同的副作用，比如单卡页的副作用是init事件里请求add/detail接口，并且监听主组织字段变化切换UI模板等响应式的功能|
||dataSource数据源||实体、查询区实体（来源于应用构建--对象建模）||页面后端数据描述（与数据库存储的实体对应）|

![YNF运行时页面组成](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/g03-spec-relationship-1.7c39f0ae.png)

# [](#页面协议详细介绍)页面协议详细介绍

## [](#数据源store组件之间关系)数据源、store、组件之间关系

- 数据源是前端与后端进行交互的数据协议，描述了后端元数据和里面的字段；
- store是前端运行时存储数据的模型，表单和表格组件有专属的模型，form组件有formStore、table组件有tableStore，formStore和tableStore存储了每个字段和列的字段模型和列模型，这些模型里有字段的描述和事件，组件接入了这些模型的描述和事件，比如input组件模型里有value，且有onchange事件，input接入这些参数并使用；
- 组件从store中获取数据进行显示，并使用onChange回调修改store中数据；

![数据源、store、组件三者关系](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/image2023-11-23_20-50-53.befcabcb.png)

## [](#数据源alias与field)数据源alias与field

- alias：前端操作字段（前后端交互约定的key值：前端存储数据及后端返回数据均使用该key）
- field：后端去数据库查询的字段(如:[danxuanyinyong.name](http://danxuanyinyong.name/)是查找danxuanyinyong引用项对应的name）

![数据源alias与field](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/image2023-11-24_12-57-47.fab2b854.png)

## [](#store中alias与field)store中alias与field

- alias是前端操作字段，数据模型store中将alias作为key
- field是后端需要的字段，数据模型store中会在getValue时根据alias与field之间的对应关系组装数据

![store中alias与field](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/image2023-11-24_13-0-22.aae98b60.png)

## [](#组件中store-storefield)组件中store storeField

- store与storeField两个字段定位到组件接收的值value
- storeField与数据对象store中的fieldsArr字段属性下的alias一致

![组件中store storeField](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/image2023-11-24_13-0-37.2760b34c.png)