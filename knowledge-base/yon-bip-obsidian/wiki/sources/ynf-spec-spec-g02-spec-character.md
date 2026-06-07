---
title: "特征协议"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/spec/g02-spec-character"
section: "YNF-协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 协议]
platform_version: "BIP V5"
source_type: ynf-docs
images: 4
---

# 特征协议

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/spec/g02-spec-character | 所属：YNF-协议

# [](#特征协议)特征协议

## [](#什么是特征特征用来做什么)什么是特征？特征用来做什么？

1、特征是用来扩展业务对象属性的，特征提供了在租户实施态对业务对象扩展属性进行统一描述和弹性扩展能力

2、特征有2个应用场景：一是用来扩展档案、单据的自定义项。二是用来弹性扩展业务对象的属性。弹性扩展业务对象属性意思是：通过将多个特征打包放到特征组中，可实现业务对象基于不同业务上下文有不同扩展属性要求，比如不同物料可以定义不同的物料属性、物料自由项、物料选配特征等。

## [](#自定义项特征)自定义项特征

### [](#功能概述)功能概述

- 对单据字段进行动态的扩展（租户级）
- controlType: Userdefinegroup；libCode: ynf-lib-base

### [](#场景介绍)场景介绍

- 运行时自定义项特征：特征配置后运行时通过meta组装具体特征项
- 设计器自定义项特征：若配置自定义项特征，设计器在打开时候会自动生成相关协议，在此基础上可进一步修改相关属性
- 运行时与设计器自定义项特征关系：设计器配置协议 > 运行时协议 ==> 运行时预览页面通过existCharacterCodes属性的字段去重

### [](#协议简介)协议简介

// 该组件未占位项，管理分配到该实体的自定义项字段

{

 "alias": "userdefinegroup44",

 "bizType": "userdefine",

 "caption": "自定义项",

 "compType": "xcontrol",

 "computedAttrId": "userdefinegroup44_3762",

 "controlType": "Userdefinegroup",

 "entityUri": "AT1B83CC880B58000B.AT1B83CC880B58000B.yizhuduozi",

 "existCharacterCodes": [ // 设计器设计的自定义项

 "ynf_20",

 "zyte1",

 "zyte2",

 "zytezheng01",

 "zytezheng02"

 ],

 "iColWidth": 1,

 "iOrder": 110,

 "libCode": "ynf-lib-base",

 "maxLength": "200",

 "nid": "nid_43",

 "orderNum": 11,

 "parentSerialCode": "2025120227477946506",

 "required": false,

 "serialCode": "2025120227477946517",

 "store": "mobx://rootStore.formStore",

 "storeField": "new10", // 所有自定义项字段值会组织到new10下，最终new10的值将会是一个对象传递给后端

}

### [](#页面显示与数据组织)页面显示与数据组织

- 新建页面"controlType": "Userdefinegroup"组件是占位，标绿的字段是分配到该实体的特征项

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/1719803052091.8f5ad0d8.jpg)

- 自定义项特征与后端的交互值

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/1719802973237.2f902522.jpg)

## [](#物料特征组)物料特征组

### [](#功能概述-1)功能概述

- 对物料字段进行动态的扩展（租户级）
- controlType: Charactteristics；libCode: ynf-lib-base

### [](#场景介绍-1)场景介绍

- 运行时物料特征组：特征配置后运行时通过getCharacteristicsProduct组装具体特征组
- 设计器物料特征组：若配置自定义项特征，设计器在打开时候会自动生成相关协议，在此基础上可进一步修改相关属性
- 运行时与设计器自定义项特征关系：设计器配置协议 > 运行时协议 ==> 运行时预览页面通过特征组组件children去重

### [](#协议简介-1)协议简介

{

 "alias": "characteristics48",

 "bizType": "freect",

 "caption": "物料(租户)自由项特征组",

 "compType": "xcontrol",

 "computedAttrId": "characteristics48_0d3d",

 "controlType": "Characteristics",

 "iColWidth": 1,

 "iOrder": 180,

 "libCode": "ynf-lib-base",

 "maxLength": "200",

 "nid": "nid_47",

 "orderNum": 18,

 "parentSerialCode": "2025120227477946506",

 "relativeRefer": "product",

 "relativeReferId": "mobx://rootStore.formStore.getValue('product')", // 关联的具体物料id

 "required": false,

 "rootStore": "mobx://rootStore",

 "serialCode": "2025120227477946519",

 "store": "mobx://rootStore.formStore",

 "storeField": "productFreeCT", // 与后端交互的字段

 "type": "FreeCT"

}

### [](#页面显示与数组组织)页面显示与数组组织

- 运行时特征组以弹窗的形式显示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/1719803706360.163b5609.jpg)

- 物料特征组与后端的交互值

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/1719803912150.b9d0ea9a.jpg)