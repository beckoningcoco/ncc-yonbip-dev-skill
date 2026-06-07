---
title: "商品SKU档案批量保存V3"
apiId: "1825484168971157512"
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

# 商品SKU档案批量保存V3

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/product/sku/addbatch

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
| productCode | string | 否 | 是 | 物料编码 示例：0000000176 |
| name | string | 否 | 否 | SKU名称 示例：物料01M橙色 |
| code | string | 否 | 否 | SKU编码 示例：000101 |
| modelDescription | string | 否 | 否 | 规格说明 示例：规格101 |
| model | string | 否 | 否 | 型号 示例：型号101 |
| weight | BigDecimal | 否 | 否 | 重量 示例：5 |
| volume | BigDecimal | 否 | 否 | 体积 示例：5 |
| batchUnitCode | string | 否 | 否 | 包装单位编码 示例：kg |
| productSkuDetailNew | object | 否 | 是 | 详情数据 |
| shortName | string | 否 | 否 | 简称 示例：WL01 |
| barCode | string | 否 | 否 | 条形码 示例：1234 |
| mnemonicCode | string | 否 | 否 | 助记码 示例：WL01 |
| fNoTaxCostPrice | BigDecimal | 否 | 否 | 参考成本 示例：1 |
| fPrimeCosts | BigDecimal | 否 | 否 | 采购参考价 示例：2 |
| iMinOrderQuantity | BigDecimal | 否 | 否 | 批发-起订量 示例：3 |
| iDoubleSale | BigDecimal | 否 | 否 | 销售倍量 示例：4 |
| batchDeliveryDays | int | 否 | 否 | 批发-交货周期（天） 示例：5 |
| markPrice | BigDecimal | 否 | 否 | 建议零售价 示例：0 |
| salePrice | BigDecimal | 否 | 否 | 线上零售价 示例：0 |
| fMarketPrice | BigDecimal | 否 | 否 | 市场价 示例：0 |
| fSettleAccountsRate | BigDecimal | 否 | 否 | 结算费率 示例：0 |
| inventoryCount | BigDecimal | 否 | 否 | 线上库存量 示例：0 |
| safetyStock | BigDecimal | 否 | 否 | 安全库存 示例：0 |
| iOrder | int | 否 | 否 | 排序 示例：0 |
| status | boolean | 否 | 否 | 商城上架状态，true：上架，false：下架 示例：false |
| ustatus | boolean | 否 | 否 | 订货上架状态，true：上架，false：下架 示例：false |
| stopstatus | boolean | 否 | 是 | 启用状态，true：停用，false：启用 示例：false |
| batchPriceUnit | number |
| 小数位数:0,最大长度:19 | 否 | 否 | 批发计价单位id（id和编码二选一选填，都填以编码为准） 示例：1552330897450074121 |
| batchPriceUnitCode | string | 否 | 否 | 批发计价单位编码（id和编码二选一选填，都填以编码为准） 示例：kg |
| orgCodeForUpdate | string | 否 | 否 | 组织编码（默认该接口仅更新创建组织的SKU，传该字段可以更新使用组织的SKU。更新使用组织SKU时，不能传全局级字段，只能传productCode、skuFreeCharacter、orgCodeForUpdate和productSkuDetailNew下的字段） 示例：B5 |

## 3. 请求示例

Url: /yonbip/digitalModel/product/sku/addbatch?access_token=访问令牌
Body: [{
	"productCode": "0000000176",
	"name": "物料01M橙色",
	"code": "000101",
	"modelDescription": "规格101",
	"model": "型号101",
	"weight": 5,
	"volume": 5,
	"batchUnitCode": "kg",
	"productSkuDetailNew": {
		"shortName": "WL01",
		"barCode": "1234",
		"mnemonicCode": "WL01",
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
		"stopstatus": false,
		"batchPriceUnit": 1552330897450074121,
		"batchPriceUnitCode": "kg"
	},
	"orgCodeForUpdate": "B5"
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 处理结果编码，200：成功，其他：异常 示例：200 |
| message | string | 否 | 结果提示信息，包括成功和失败的提示信息 示例：处理成功 |
| data | object | 否 | 返回的数据 |
| count | number |
| 小数位数:0,最大长度:19 | 否 | 数量 示例：2 |
| successCount | number |
| 小数位数:0,最大长度:19 | 否 | 成功数量 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:19 | 否 | 失败数量 示例：1 |
| messages | object | 是 | 失败详细信息 示例：["物料编码[0000000176]的SKU，自由项特征组数据不能为空"] |
| infos | object | 是 | 成功详细信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "处理成功",
	"data": {
		"count": 2,
		"successCount": 1,
		"failCount": 1,
		"messages": [
			"物料编码[0000000176]的SKU，自由项特征组数据不能为空"
		],
		"infos": [
			{
				"id": 1918383967882444807,
				"code": "000101"
			}
		]
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

1	2025-07-17

更新

请求说明

更新

请求参数 orgCodeForUpdate

2	2025-06-11

新增

请求参数 orgCodeForUpdate

支持更新使用组织的SKU


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

