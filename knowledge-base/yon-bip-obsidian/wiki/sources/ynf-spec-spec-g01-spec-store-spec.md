---
title: "Store 协议"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/spec/g01-spec-store-spec"
section: "YNF-协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 协议]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# Store 协议

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/spec/g01-spec-store-spec | 所属：YNF-协议

# [](#store-协议)Store 协议

## [](#1-ui-stores-object前端数据模型)1. UI Stores Object前端数据模型

||字段名称||字段类型||业务含义||说明（示例）|
||serialCode||String||YNF模型编号||唯一标识OID格式|
||parentSerialCode||String||父级YNF模型编号|||
||caption||String||Store显示名称||Stores|
||controlType||String||Store类型||Stores|
||orderNum||Number||排序|||
||level||Number||层级数|||
||nid||String||设计器内组件id||"nid_239"|
||children||Array[[Store Item Object](#_Store Item Object 数据对象)]||Store集合对象||[]|

## [](#2-ui-store-item-object前端数据模型项)2. Ui Store Item Object前端数据模型项

||字段名称||字段类型||业务含义||说明（示例）|
||serialCode||String||YNF模型编号||唯一标识OID格式|
||parentSerialCode||String||父级YNF模型编号|||
||alias||String||Store 别名||table|
||caption||String||Store 名称||table|
||uri||String||实体uri|||
||relateDs||String||关联数据源|||
||formStore||String||引用store|||
||controlType||String||Store 类型||TableStore|
||fieldsArr||Array||Store 字段描述对象||[]|
||libCode||String||Store 二方包名称||ynf-core-store|
||storeType||String||Store 类型||TableStore|
||nid||String||设计器内组件id||"nid_239"|
||properties||Object||Store 参数||{|
||"new1": {}|||||||
||}|||||||

## [](#3-ui-store-item-field-object前端数据模型字段)3. Ui Store Item Field Object前端数据模型字段

||字段名称||字段类型||业务含义||说明（示例）|
||serialCode||String||YNF模型编号||唯一标识OID格式|
||alias||String||Store 字段别名|||
||caption||String||显示标题|||
||bizType||String||业务类型|||
||enumType||String||引用枚举类型|||
||field||String||字段编号|||
||fieldCodeInMeta||String||对应元数据字段编号|||
||format||String||日期格式|||
||refEntityUri||Array||引用实体uri|||
||refReturnArr||String||参照返回|||
||virtualField||Boolean||是否虚拟字段|||
||nid||String||设计器内组件id||"nid_239"|