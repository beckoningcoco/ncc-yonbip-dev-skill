---
title: "商品SKU档案保存V3"
apiId: "1971707593299066886"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material]
platform_version: "BIP"
source_type: community-api-docs
---

# 商品SKU档案保存V3

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/product/sku/addV2

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| productCode | string | 否 | 是 | 物料编码 示例：testskuapi |
| name | string | 否 | 否 | SKU名称 示例：testskuapi001 |
| code | string | 否 | 否 | SKU编码 示例：testskuapi001 |
| modelDescription | string | 否 | 否 | 规格说明 示例：modelDescription |
| model | string | 否 | 否 | 型号 示例：model |
| weight | BigDecimal | 否 | 否 | 重量 示例：5 |
| volume | BigDecimal | 否 | 否 | 体积 示例：5 |
| batchUnitCode | string | 否 | 否 | 包装单位编码 示例：kg |
| productSkuDetailNew | object | 否 | 是 | 详情数据 |
| orgCodeForUpdate | string | 否 | 否 | 组织编码（默认该接口仅更新创建组织的SKU，传该字段可以更新使用组织的SKU。更新使用组织SKU时，不能传全局级字段，只能传productCode、skuFreeCharacter、orgCodeForUpdate和productSkuDetailNew下的字段） 示例：testOrg |

## 3. 请求示例

Url: /yonbip/digitalModel/product/sku/addV2?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"productCode": "testskuapi",
		"name": "testskuapi001",
		"code": "testskuapi001",
		"modelDescription": "modelDescription",
		"model": "model",
		"weight": 5,
		"volume": 5,
		"batchUnitCode": "kg",
		"productSkuDetailNew": {
			"shortName": "testskuapi001",
			"barCode": "1234",
			"mnemonicCode": "1234",
			"fNoTaxCostPrice": 1,
			"fPrimeCosts": 2,
			"iMinOrderQuantity": 3,
			"iDoubleSale": 4,
			"batchDeliveryDays": 5,
			"markPrice": 0,
			"salePrice": 0,
			"fMarketPrice": 0,
			"fSettleAccountsRate": 0,
			"inventoryCount": 0,
			"safetyStock": 0,
			"iOrder": 0,
			"status": false,
			"ustatus": false,
			"stopstatus": false
		},
		"orgCodeForUpdate": "testOrg"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 处理结果编码，200：成功，其他：异常 示例：200 |
| message | string | 否 | 结果提示信息，包括成功和失败的提示信息 示例：处理成功 |
| data | object | 否 | 返回的数据 |
| id | long | 否 | 数据id 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "处理成功",
	"data": {
		"id": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

118000	入参不能为空	入参不能为空

118601	自由项特征组数据不能为空	自由项特征组数据不能为空

999	通用业务校验异常	通用业务校验异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-16

更新

请求说明

新增

请求参数 orgCodeForUpdate

增加orgCodeForUpdate字段，支持修改使用组织SKU数据

2	2025-07-18

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

