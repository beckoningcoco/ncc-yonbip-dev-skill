---
title: "物料清单查询"
apiId: "309c7a5c39354974a498af976e66ff49"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "BOM Maintenance"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, BOM Maintenance]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料清单查询

> `ContentType	application/json` 请求方式	POST | 分类: BOM Maintenance (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/mfg/bom/querybom

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| orgId | string | 否 | 否 | 组织Id 示例：2152649746092800 |
| orgCode | string | 否 | 否 | 组织编码,组织id和组织编码不能同时为空，id和编码同时存在，以id为准 示例：AA |
| materialId | long | 否 | 否 | 制造物料Id 示例：2652525709185280 |
| materialCode | string | 否 | 否 | 制造物料编码(请精确到SKU编码),制造物料id和制造物料编码不能同时为空，id和编码同时存在，以id为准 示例：AA |
| productId | long | 否 | 否 | 物料ID |
| productCode | string | 否 | 否 | 物料编码 |
| effectiveDate | string | 否 | 是 | 生效时间：格式2022-02-22 12:22:22 示例：2022-02-22 12:22:22 |
| appType | string | 否 | 否 | 应用{"01":自制，"02":委外，"03":组装拆卸},如果当前应用不存在相应数据,则按照工程数据匹配规则的优先级来查询数据;如果为空,默认按照工程数据匹配规则的应用优先级来查询,对应匹配规则不存在,默认为01(自制) 示例：01 |
| quantity | long | 否 | 否 | 母件投产量,仅用于子件计算,不影响查询结果,默认为1 示例：1 |

## 3. 请求示例

Url: /yonbip/mfg/bom/querybom?access_token=访问令牌
Body: [{
	"orgId": "2152649746092800",
	"orgCode": "AA",
	"materialId": 2652525709185280,
	"materialCode": "AA",
	"productId": 0,
	"productCode": "",
	"effectiveDate": "2022-02-22 12:22:22",
	"appType": "01",
	"quantity": 1
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 接口返回信息 示例：操作成功 |
| data | object | 是 | 接口返回数据 |
| orgId | string | 否 | 组织Id（传入参数） 示例：2036615013323008 |
| materialId | long | 否 | 制造物料Id（传入参数） 示例：2662093940297984 |
| effectiveDate | string | 否 | 生效时间（传入参数） 示例：2022-02-26 |
| appType | string | 否 | 应用（传入参数） 示例：01 |
| quantity | long | 否 | 母件投产量（传入参数） 示例：1 |
| isSuccess | long | 否 | 是否查询成功{0：失败，1：成功} 示例：1 |
| info | string | 否 | 查询返回信息 示例：操作成功 |
| result | object | 是 | 查询返回数据 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"orgId": "2036615013323008",
			"materialId": 2662093940297984,
			"effectiveDate": "2022-02-26",
			"appType": "01",
			"quantity": 1,
			"isSuccess": 1,
			"info": "操作成功",
			"result": [
				{
					"produceBatch": 1,
					"productUnitPrecision": 4,
					"isWholeSend": 0,
					"useTypeId": 1515194093452657000,
					"useType": "0",
					"useTypeName": "自制",
					"orgId": "2036615013323008",
					"expiryDate": 4102415999000,
					"bomUnit": 1964431847330048,
					"skuName": "接口测试1白色15年",
					"vouchdate": "2022-02-25",
					"scrap": 0,
					"truncationType": 0,
					"id": 2663559829607168,
					"bomChangeRate": 1,
					"skuId": 2662093822661379,
					"quantity": 1,
					"productId": 2662093822644992,
					"changeType": 0,
					"materialId_skuId": 2662093822661379,
					"materialId_productId_unit": 1964431847330048,
					"batch": 1,
					"materialId": 2662093940297984,
					"bomProduceUnit": 1964431847330048,
					"bomChangeRateNum": 0,
					"bomChangeRateDen": 0,
					"version": "-1",
					"bomType": 1,
					"subcontractVendorId": "1964431847330048",
					"versionCode": "1.00",
					"produceQuantity": 1,
					"produceUnitTruncationType": 0,
					"bomProduceUnitName": "个",
					"versionMemo": "-1",
					"effectiveDate": 1645770553000,
					"produceUnitPrecision": 4,
					"skuCode": "021407",
					"fromQuantity": 0,
					"toQuantity": 0,
					"quantityControl": 0,
					"bomComponent": [
						{
							"lineType": 0,
							"operationStartPoint": 0,
							"designator": "r1",
							"produceBatch": 1,
							"alternateType": 1,
							"productUnitPrecision": 4,
							"stockQuantity": 1,
							"productUnit": 1964431847330048,
							"componentChangeRate": 1,
							"bomBomUnit": 1964431847330048,
							"bomComponentUserdefItem_define1": "2",
							"truncUp": 0,
							"truncationType": 0,
							"id": 2663559829607169,
							"skuId": 2662094778438410,
							"denominatorQuantity": 1,
							"calcCostFlag": 1,
							"stockNumeratorQuantity": 1,
							"fixedQuantity": 0,
							"productId": 2662094778438400,
							"materialId_productId_unit": 1964431847330048,
							"materialId": 2662094880657664,
							"bomProduceUnit": 1964431847330048,
							"poStartPoint": 0,
							"bomScrap": 0,
							"advanceDays": 0,
							"bomUnitId": 1964431847330048,
							"isVirtual": 0,
							"costScrap": 0,
							"skuCode": "021411",
							"mustLossQuantity": 0,
							"stockUnitId": 1964431847330048,
							"operationCompletePoint": 0,
							"numeratorQuantity": 1,
							"stockUnitPrecision": 4,
							"orgId": "2036615013323008",
							"expiryDate": 4102415999000,
							"bomUnit": 1964431847330048,
							"skuName": "接口测试1白色15年",
							"stockUnitTruncationType": 0,
							"scrap": 0,
							"componentStockUnitId": 1964431847330048,
							"supplyType": 0,
							"stockOrgName": "Amy测试",
							"wholeFlag": 0,
							"changeRate": 1,
							"bomChangeRate": 1,
							"usageType": 1,
							"poCompletePoint": 0,
							"bomId": 2663559829607168,
							"ownerType": 2,
							"entrustSupplyType": 0,
							"quantity": 1,
							"changeType": 0,
							"materialId_skuId": 2662094778438410,
							"excessSendFlag": 0,
							"bomMaterialId": 2662093940297984,
							"lossType": 0,
							"componentStockUnitName": "个",
							"partakeSimulation": 1,
							"componentChangeRateNum": 0,
							"omponentChangeRateDen": 0,
							"productUnitName": "个",
							"stockOrgId": "2036615013323008",
							"excessTendType": 0,
							"effectiveDate": 1645770553000,
							"alternateDenominator": 1,
							"alternateRatio": 1,
							"componentType": 0,
							"excessSendConstant": 0,
							"excessSendScrap": 0,
							"keyMaterialGroup": 0,
							"mainMaterial": 1,
							"materialGroupNo": "",
							"sequence": 0,
							"replaceType": 0,
							"standard": 1,
							"bomAlternate": [
								{
									"mainMaterial": 1,
									"bomAlternateUserdefItem_define1": "3",
									"bomComponentQuantity": 1,
									"stockUnitPrecision": 4,
									"productUnitPrecision": 4,
									"productUnit": 1964431847330048,
									"orgId": "2036615013323008",
									"expiryDate": 4102415999000,
									"stockUnitTruncationType": 0,
									"skuName": "接口测试1白色15年",
									"bomAlternate_bomUnit": 1964431847330048,
									"alternateStockUnitId": 1964431847330048,
									"truncationType": 0,
									"id": 2663559829607170,
									"skuId": 2662094778438410,
									"bomId": 2663559829607168,
									"productId": 2662094778438400,
									"alternateRatio": 1,
									"alternateDenominator": 1,
									"alternateChangeType": 0,
									"bomComponentId": 2663559829607169,
									"materialId_skuId": 2662094778438410,
									"materialId_productId_unit": 1964431847330048,
									"materialId": 2662094880657664,
									"bomMaterialId": 2662093940297984,
									"sequence": 1,
									"materialId_productId_detail_stockUnit": 1964431847330048,
									"alternateChangeRate": 1,
									"productUnitName": "个",
									"materialId_productId_detail_produceUnit": 1964431847330048,
									"alternateStockUnitName": "个",
									"effectiveDate": 1645770553000,
									"skuCode": "021411",
									"stockUnitId": 1964431847330048,
									"denominatorQuantity": 1,
									"designator": "0",
									"keyMaterialGroup": 0,
									"materialGroupNo": "0",
									"mustLossQuantity": 0,
									"numeratorQuantity": 0,
									"remark": "0",
									"scrap": 0,
									"stockNumeratorQuantity": 0,
									"entrustSupplyType": 0,
									"ownerType": 2,
									"alternateChangeRateNum": 0,
									"alternateChangeRateDen": 0
								}
							],
							"vendorDropShipment": 0,
							"changeRateNum": 0,
							"changeRateDen": 0,
							"bomChangeRateNum": 0,
							"bomChangeRateDen": 0
						}
					],
					"bomByproduct": [
						{
							"bpdProduceUnit": 1964431847330048,
							"produceBatch": 1,
							"numeratorQuantity": 1,
							"bpdProduceUnitName": "个",
							"productionType": 0,
							"productUnitPrecision": 4,
							"orgId": "2036615013323008",
							"expiryDate": 4102415999000,
							"bomUnit": 1964431847330048,
							"skuName": "接口测试1白色15年",
							"bpdChangeRate": 1,
							"bomBomUnit": 1964431847330048,
							"produceNumeratorQuantity": 1,
							"truncationType": 0,
							"id": 2663559829623553,
							"bomChangeRate": 1,
							"skuId": 2662093822661379,
							"denominatorQuantity": 1,
							"bomId": 2663559829607168,
							"quantity": 1,
							"productId": 2662093822644992,
							"changeType": 0,
							"materialId_skuId": 2662093822661379,
							"materialId_productId_unit": 1964431847330048,
							"materialId": 2662093940297984,
							"bomProduceUnit": 1964431847330048,
							"bomMaterialId": 2662093940297984,
							"produceQuantity": 1,
							"produceUnitTruncationType": 0,
							"bomScrap": 0,
							"effectiveDate": 1645770735000,
							"costOutputProportion": 100,
							"skuCode": "021407",
							"produceUnitPrecision": 4,
							"bpdChangeRateNum": 0,
							"bpdChangeRateDen": 0,
							"bomChangeRateNum": 0,
							"bomChangeRateDen": 0
						}
					]
				}
			]
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-14

新增

返回参数 (18)

更新

返回参数 (12)

2	2026-03-13

新增

返回参数 (4)

更新

返回参数 (12)

3	2025-11-26

更新

请求说明

新增

返回参数 lineType

4	2025-08-07

更新

返回参数 stockQuantity

更新

返回参数 stockNumeratorQuantity

更新

返回参数 numeratorQuantity


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

