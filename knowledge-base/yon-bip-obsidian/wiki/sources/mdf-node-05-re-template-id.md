---
title: "获取模板ID"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/05-re-template-id"
section: "MDF服务"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, MDF服务]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 获取模板ID

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/node/05-re-template-id | 所属：MDF服务

# [](#获取模板id)获取模板ID

${domain.iuap-mdf-node}/billmeta/getTplId

## [](#1-接口说明)1. 接口说明

此接口用于获取模板 id 使用，前端开启了 getTplIdFirst、newBillMeta 特性时，且 mdd 版本为 310 版本以上时，会发起。

## [](#2-接口类型)2. 接口类型

**POST**

## [](#3-请求参数)3. 请求参数

{

 "billno": "st_othinrecord",

 "terminalType": "1",

 "extTranstype": "2364609089081606",

 "orgId": "2367785652474624",

 "serviceCode": "st_othinrecordlist",

 "tplmode": 2

}

## [](#4-参数说明)4. 参数说明

||**参数**||**是否可空**||**说明**|
||billno||否||表单billno|
||id||是||详情时传递ID，列表忽略|
||extTranstype||是||列表进入详情时如果数据上有交易类型ID请传递|
||orgId||是||列表进入详情时如果数据上有主组织ID请传递|
||businessStepCode||是||*新模板业务阶段*|
||terminalType||否||端类型,1为PC端，3为APP端|
||designPreview||是||*设计器预览*|
||tplmode||是||模版类型,PC：0为详情，2为编辑，APP:3|
||urlCondition||是||扩展参数|
||transtype||是||交易类型发布菜单时请传递|
||serviceCode||是||模板的分配关系通过serviceCode联查|
||refCode||是||自定义参照类型 领域扩展|
||extTypeId||是||自定义参照值 领域扩展|
||systemCode||是||有特别的领域会通过这个参数选模板|

## [](#5-请求头)5. 请求头

||**参数**||**是否可空**||**说明**|
||Domain-Key||否||领域前端编码|

## [](#6-返回结构)6. 返回结构

{

 "code": 200,

 "message": "操作成功",

 "data":

 {

 "tplId": 9148318,

 "hasMultiMode": false

 }

}

## [](#7-返回参数说明)7. 返回参数说明

||**参数**||**是否可空**||**说明**|
||tplId||否||模板id|
||hasMultiMode||否||是否多模板，一般用于编辑和详情多模板|