---
title: "商品SKU档案查询V3"
apiId: "1495118282446864385"
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

# 商品SKU档案查询V3

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/product/sku/getSkuInfoByPage

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	列表查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| fields | string | 是 | 是 | 查询参数字段，参数详见示例，参数描述见返回值 |
| idList | long | 是 | 否 | SKUid集合 示例：[20220620001] |
| codeList | string | 是 | 否 | SKU编码集合 示例：["20220620001"] |
| productIdList | long | 是 | 否 | 物料id集合 示例：[20220620001] |
| productCodeList | string | 是 | 否 | 物料编码集合 示例：["20220620001"] |
| orgIdList | long | 是 | 否 | 组织id集合 示例：[20220620001] |
| skuTagQry | object | 否 | 否 | SKU标签 |
| id | long | 否 | 否 | 标签ID 示例：1689721154595455000 |
| name | string | 否 | 否 | 标签名称 示例：标签01 |
| idList | long | 是 | 否 | 标签ID集合 示例：[1689721154595455000,1604214059445518300] |
| nameList | string | 是 | 否 | 标签名称集合 示例：["标签01","标签02"] |
| defaultSKU | boolean | 否 | 否 | 是否默认sku，false是，true否 示例：true |
| needTags | boolean | 否 | 否 | 返回值是否包含SKU标签信息，true为包含SKU标签信息，false为不包含SKU标签信息，默认为false 示例：false 默认值：false |
| pageIndex | long | 否 | 否 | 页码 示例：1 |
| pageSize | long | 否 | 否 | 每页数量 示例：1 |
| pubts | DateTime | 否 | 否 | 最后更新时间，返回大于等于此时间戳的数据 示例：2023-12-01 12:00:00 |
| lastUpdate | DateTime | 否 | 否 | 最后更新时间，返回小于等于此时间戳的数据 示例：2023-12-01 23:59:59 |

## 3. 请求示例

Url: /yonbip/digitalModel/product/sku/getSkuInfoByPage?access_token=访问令牌
Body: {
	"fields": [
		""
	],
	"idList": [
		20220620001
	],
	"codeList": [
		"20220620001"
	],
	"productIdList": [
		20220620001
	],
	"productCodeList": [
		"20220620001"
	],
	"orgIdList": [
		20220620001
	],
	"skuTagQry": {
		"id": 1689721154595455000,
		"name": "标签01",
		"idList": [
			1689721154595455000,
			1604214059445518300
		],
		"nameList": [
			"标签01",
			"标签02"
		]
	},
	"defaultSKU": true,
	"needTags": false,
	"pageIndex": 1,
	"pageSize": 1,
	"pubts": "2023-12-01 12:00:00",
	"lastUpdate": "2023-12-01 23:59:59"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用完成时的返回信息 示例：操作成功 |
| data | object | 否 | 调用完成时的返回数据 |
| pageIndex | long | 否 | 页码 示例：1 |
| pageSize | long | 否 | 每页数据量 示例：5 |
| recordCount | long | 否 | 总数量 示例：1 |
| recordList | object | 是 | 数据列表 |
| pageCount | long | 否 | 总页数 示例：1 |
| beginPageIndex | long | 否 | 起始页码 示例：1 |
| endPageIndex | long | 否 | 结束页码 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 5,
		"recordCount": 1,
		"recordList": [
			{
				"productCode": "20220620001",
				"productName": "20220620001",
				"code": "YRM2000001",
				"name": "YRM2332-1-YRM2000001",
				"modelDescription": "SKU规格说明",
				"defaultSKU": true,
				"model": "SKU型号",
				"specIds": "1478853266980208647",
				"specs": "20220616:20220616004;",
				"salePrice": "139.00000000",
				"erpCode": "1001A2100000000YMCU2",
				"specNames": "20220616:20220616004;",
				"id": 1481825710760263700,
				"productId": 1481825410114125800,
				"ustatus": false,
				"orgId": "666666",
				"stopStatus": false,
				"productDetailId": 1481825410114125800,
				"productApplyRangeId": 1481825410114125800,
				"shortName": "SKU简称",
				"status": false,
				"batchPrice": 0,
				"fLowestMarkPrice": 0,
				"fMarketPrice": 139,
				"fSettleAccountsRate": 22,
				"barCode": "条形码",
				"mnemonicCode": "SKU助记码",
				"iOrder": 2,
				"saled": false,
				"iMinOrderQuantity": 3,
				"batchDeliveryDays": 3,
				"safetyStock": 3,
				"volume": 10,
				"batchUnit": 1955228568170528800,
				"fNoTaxCostPrice": 10,
				"fPrimeCosts": 10,
				"inventoryCount": 10,
				"noTaxCostPrice": 10,
				"weight": 10,
				"stockUnit": "1955228568170528800",
				"erpOuterCode": "12345",
				"salePoints": 5,
				"iDoubleSale": 3,
				"productUrl": "物料首图URL",
				"tagList": [
					{
						"id": 1769661877649932294,
						"name": "hzw标签测试",
						"tagClass": 1650342600916860932,
						"tagClassName": "促销标签分组1",
						"tagClassCode": "00012",
						"tagAbbr": "hzw备注",
						"backGroundColor": "#FF404C",
						"fontColor": "#fff",
						"scope": "3",
						"style": 1,
						"tagPosition": 1,
						"front": 2,
						"manage": 2,
						"fastSale": 1
					}
				],
				"pubts": "2024-04-16 00:00:00"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
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

