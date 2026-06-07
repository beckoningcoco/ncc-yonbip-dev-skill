---
title: "根据规格导入SKU"
apiId: "bf7c16ced4d54f9d81e029dceca6ff79"
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

# 根据规格导入SKU

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/product/sku/productSKUImport

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 物料档案SKU页签行数据（SKU行数据放在物料行数据之后） |
| productId | long | 否 | 否 | 已存在的物料档案Id，与物料档案编码必输其一 示例：179118261013000 |
| product_code | string | 否 | 否 | 已存在的物料编码，与物料档案Id必输其一 示例：test1117001 |
| specdatas | object | 否 | 是 | 物料规格名称、规格值名称键值对（必须是已存在的物料规格） |
| code | string | 否 | 是 | SKU编码，物料行与SKU行的区别在于code有无值 示例：skutest1117001001 |
| name | string | 否 | 是 | SKU名称 示例：skutest1117001001 |
| modelDescription | string | 否 | 否 | sku规格说明 示例：test型号1 |
| model | string | 否 | 否 | sku型号 示例：sku型号 |
| batchUnit | long | 否 | 否 | 包装单位id,当物料启用辅计量的时候才能传值 示例：179118261013001 |
| batchUnit_Code | string | 否 | 否 | 包装单位编码，当物料启用辅计量的时候才能传值 示例：包装单位编码 |
| weight | double | 否 | 否 | 重量 示例：23.00000000 |
| volume | double | 否 | 否 | 体积 示例：23 |
| productSKUDetail | object | 否 | 否 | sku详情 |
| skuDefines | object | 否 | 否 | SKU属性，传参key为SKU属性名称，value为SKU属性值，不支持自定义档案和引用档案类型，时间类型和日期时间类型注意**格式，具体参考请求示例。 示例：{"key":"value"} |

## 3. 请求示例

Url: /yonbip/digitalModel/product/sku/productSKUImport?access_token=访问令牌
Body: {
	"data": [
		{
			"productId": 179118261013000,
			"product_code": "test1117001",
			"specdatas": {
				"物料规格1": "物料规格属性1",
				"物料规格2": "物料规格属性2"
			},
			"code": "skutest1117001001",
			"name": "skutest1117001001",
			"modelDescription": "test型号1",
			"model": "sku型号",
			"batchUnit": 179118261013001,
			"batchUnit_Code": "包装单位编码",
			"weight": 23,
			"volume": 23,
			"productSKUDetail": {
				"shortName": "test测试物料1015810205",
				"barCode": "test条形码1",
				"mnemonicCode": "SKU助记码",
				"fNoTaxCostPrice": 23,
				"fPrimeCosts": 23,
				"iMinOrderQuantity": 23,
				"iDoubleSale": 1,
				"batchDeliveryDays": 23,
				"markPrice": 23,
				"salePrice": 23,
				"fMarketPrice": 23,
				"fSettleAccountsRate": 1,
				"inventoryCount": 100,
				"safetyStock": 10,
				"iOrder": 1,
				"salePoints": 10,
				"status": false,
				"ustatus": false
			},
			"skuDefines": {
				"key": "value"
			}
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 操作完成返回码 示例：200 |
| message | string | 否 | 操作完成返回信息 示例：操作成功 |
| data | object | 否 | 操作完成返回数据 |
| count | long | 否 | 操作条数 示例：1 |
| sucessCount | long | 否 | 成功条数 示例：1 |
| failCount | long | 否 | 失败条数 示例：0 |
| messages | string | 是 | 提示信息 示例：["名称不能为空"] |
| infos | string | 是 | 提示信息内容 示例：["返回数据"] |
| failInfos | string | 是 | 错误提示信息内容 示例：["错误信息"] |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			"名称不能为空"
		],
		"infos": [
			"返回数据"
		],
		"failInfos": [
			"错误信息"
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员。


## 9. 接口变更日志

序号	修改时间	变更内容概要

暂时没有数据哦~


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

