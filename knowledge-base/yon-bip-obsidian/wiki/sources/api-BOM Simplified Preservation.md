---
title: "物料清单简版保存V2"
apiId: "1933842964051132420"
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

# 物料清单简版保存V2

> `ContentType	application/json` 请求方式	POST | 分类: BOM Maintenance (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/mfg/v1.0/bom/save/V1

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	单条保存/更新

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 单据数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| orgId | string | 否 | 否 | 组织id,组织id和组织编码不能同时为空，id和编码同时存在，以id为准 示例：1293256121766144 |
| orgCode | string | 否 | 否 | 组织编码,组织id和组织编码不能同时为空，id和编码同时存在，以id为准 示例：1000212 |
| bomType | long | 否 | 否 | BOM类型，为空默认主BOM，1：主BOM；2：替代BOM 示例：1 |
| bomClassify | number |
| 小数位数:0,最大长度:10 | 否 | 否 | BOM类别，为2时，sourceSrcDocId，sourceCode，sourceLineNo必传 示例：2 |
| sourceSrcDocId | string | 否 | 否 | 来源单据ID，bomClassify为2时必传 示例：2060752392938848260 |
| sourceCode | string | 否 | 否 | 来源单据编码，bomClassify为2时必传 示例：QbOJ-000000000-20240808-000002 |
| sourceLineNo | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 来源单据行号，bomClassify为2时必传 示例：10 |
| useTypeId | long | 否 | 否 | 用途Id;用途Id和用途编码同时存在，以用途Id为准。用途Id和用途编码都为空，默认赋值为自制。 示例：1515194093452657000 |
| useType | string | 否 | 否 | 用途编码;用途Id和用途编码同时存在，以用途Id为准。用途Id和用途编码都为空，默认赋值为自制。 示例：0 |
| versionCode | string | 否 | 是 | 版本号 示例：2.00 |
| materialId | long | 否 | 否 | 制造物料id，制造物料，物料，SKU不能同时为空，优先级：skuId>skuCode>materialId>productId>materialCode>productCode 示例：1932090405622016 |
| materialCode | string | 否 | 否 | 制造物料编码，制造物料，物料，SKU不能同时为空，优先级：skuId>skuCode>materialId>productId>materialCode>productCode 示例：AA000485 |
| productId | long | 否 | 否 | 物料id 示例：0 |
| productCode | string | 否 | 否 | 物料编码 示例：1932090305155328 |
| skuId | long | 否 | 否 | SKUId，制造物料，物料，SKU不能同时为空，优先级：skuId>skuCode>materialId>productId>materialCode>productCode 示例：0 |
| subcontractVendorId | long | 否 | 否 | 委外商Id |
| subcontractVendorIdCode | string | 否 | 否 | 委外商Code |
| skuCode | string | 否 | 否 | SKU编码，制造物料，物料，SKU不能同时为空，优先级：skuId>skuCode>materialId>productId>materialCode>productCode |
| scrap | string | 否 | 否 | 废品率(%) 示例：0.00 |
| effectiveDate | string | 否 | 是 | 生效时间，格式“2021-05-06 15:08:00” 示例：2021-03-31 17:06:19 |
| expiryDate | string | 否 | 是 | 失效时间，格式“2021-05-06 15:08:00” 示例：2099-12-31 23:59:59 |
| isWholeSend | long | 否 | 否 | 是否整单齐套发料，为空默认否，0：否；1：是 示例：0 |
| substituteFlag | string | 否 | 否 | 替代标识 |
| rollup | string | 否 | 否 | 默认卷积，0：否，1：是 示例：0 |
| produceBatch | double | 否 | 否 | 批量，若不录入系统会默认赋值为1.00 示例：1 |
| produceUnit | long | 否 | 否 | 计量单位，为空时根据物料档案带入 示例：0 |
| produceUnitCode | string | 否 | 否 | 计量单位编码,produceUnitCode和produceUnit同时填写以produceUnit为准进行查询计量单位 |
| produceUnitName | string | 否 | 否 | 计量单位名称 |
| fromQuantity | double | 否 | 否 | 从数量，数量控制字段为1时，必填 示例：0.00 |
| toQuantity | double | 否 | 否 | 到数量，数量控制字段为1时，必填 |
| quantityControl | int | 否 | 否 | 数量控制,0否，1是 示例：0 |
| bomComponent | object | 是 | 是 | 材料数据集合 |
| bomByproduct | object | 是 | 否 | 产出品数据集合 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| wbs | string | 否 | 否 | wbsId 示例：1932090405622016 |
| wbsCode | string | 否 | 否 | wbs编码。wbsid和wbs编码同时存在时，以wbsid为准。 |
| agentId | string | 否 | 否 | 客户Id;客户Id和客户编码同时存在，以客户Id为准。 |
| agentCode | string | 否 | 否 | 客户编码;客户Id和客户编码同时存在，以客户Id为准。 |
| transTypeId | string | 否 | 否 | 交易类型Id;交易类型Id和交易类型编码同时存在，以交易类型Id为准。 |
| transTypeCode | string | 否 | 否 | 交易类型编码;交易类型Id和交易类型编码同时存在，以交易类型Id为准。 |

## 3. 请求示例

Url: /yonbip/mfg/v1.0/bom/save/V1?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "951ada30e0969e954f5d9058fff6a512",
		"orgId": "1293256121766144",
		"orgCode": "1000212",
		"bomType": 1,
		"bomClassify": 2,
		"sourceSrcDocId": "2060752392938848260",
		"sourceCode": "QbOJ-000000000-20240808-000002",
		"sourceLineNo": 10,
		"useTypeId": 1515194093452657000,
		"useType": "0",
		"versionCode": "2.00",
		"materialId": 1932090405622016,
		"materialCode": "AA000485",
		"productId": 0,
		"productCode": "1932090305155328",
		"skuId": 0,
		"subcontractVendorId": 0,
		"subcontractVendorIdCode": "",
		"skuCode": "",
		"scrap": "0.00",
		"effectiveDate": "2021-03-31 17:06:19",
		"expiryDate": "2099-12-31 23:59:59",
		"isWholeSend": 0,
		"substituteFlag": "",
		"rollup": "0",
		"produceBatch": 1,
		"produceUnit": 0,
		"produceUnitCode": "",
		"produceUnitName": "",
		"fromQuantity": 0,
		"toQuantity": 0,
		"quantityControl": 0,
		"bomComponent": [
			{
				"lineType": 0,
				"materialId": 1571921244934400,
				"materialCode": "0037",
				"designator": "r1",
				"productId": 1500091012468992,
				"productCode": "",
				"skuId": 0,
				"skuCode": "",
				"numeratorQuantity": 1,
				"denominatorQuantity": 1,
				"effectiveDate": "2021-03-31 17:06:19",
				"expiryDate": "2099-12-31 23:59:59",
				"usageType": 1,
				"supplyType": 0,
				"lossType": 0,
				"scrap": 0,
				"isVirtual": 0,
				"stockOrgId": "",
				"warehouseId": "",
				"alternateType": "1",
				"partakeSimulation": 1,
				"calcCostFlag": "1",
				"wholeFlag": 0,
				"wholePoint": "",
				"costScrap": 0,
				"stockUnit": 0,
				"stockUnitName": "",
				"stockNumeratorQuantity": 0,
				"sequence": 0,
				"materialGroupNo": "",
				"mainMaterial": 0,
				"keyMaterialGroup": 0,
				"excessTendType": 0,
				"excessSendScrap": 0,
				"excessSendFlag": 0,
				"entrustType": 0,
				"excessSendConstant": 0,
				"replaceType": 0,
				"bomAlternate": [
					{
						"materialId": 1571921244934400,
						"alternateDenominator": 1,
						"alternateRatio": 1,
						"materialCode": "0037",
						"productId": 1500091012468992,
						"productCode": "",
						"skuId": 0,
						"mainMaterial": 1,
						"skuCode": "",
						"sequence": 1,
						"effectiveDate": "2021-03-31 17:06:19",
						"expiryDate": "2099-12-31 23:59:59",
						"stockUnit": 0,
						"stockUnitName": "",
						"designator": "0",
						"keyMaterialGroup": 0,
						"mustLossQuantity": 0,
						"remark": "0",
						"scrap": 0,
						"stockNumeratorQuantity": 0,
						"stockUnitCode": ""
					}
				],
				"vendorDropShipment": 0,
				"bomComponentStepLoss": {
					"bomFromMainQuantity": 0,
					"bomToMainQuantity": 0,
					"mustLossQuantity": 0,
					"scrap": 0,
					"remark": ""
				},
				"stockUnitCode": "",
				"stockOrgCode": "",
				"warehouseCode": "",
				"entrustSupplyType": 0,
				"ownerType": 2
			}
		],
		"bomByproduct": [
			{
				"productionType": "0",
				"materialId": 1932090405622016,
				"materialCode": "AA000485",
				"productId": 1932090305155328,
				"productCode": "",
				"skuId": 0,
				"skuCode": "",
				"numeratorQuantity": 1,
				"denominatorQuantity": 1,
				"costOutputProportion": 50,
				"produceUnit": 0,
				"produceUnitName": "",
				"produceNumeratorQuantity": 1,
				"produceUnitCode": ""
			}
		],
		"wbs": "1932090405622016",
		"wbsCode": "",
		"agentId": "",
		"agentCode": "",
		"transTypeId": "",
		"transTypeCode": ""
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 接口调用返回码，成功时返回200 示例：200 |
| message | string | 否 | 接口调用返回信息 示例：操作成功 |
| data | object | 否 | 接口调用返回数据 |
| sucessCount | long | 否 | 成功数 示例：1 |
| failCount | long | 否 | 失败数 示例：0 |
| count | long | 否 | 记录总数 示例：1 |
| messages | string | 否 | 数据返回信息汇总 |
| infos | object | 是 | 返回详细信息 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"sucessCount": 1,
		"failCount": 0,
		"count": 1,
		"messages": "",
		"infos": [
			{
				"code": 200,
				"message": "操作成功",
				"rowNum": 1,
				"data": {
					"id": 2247381323649280,
					"orgId": "1293256121766144",
					"bomType": 1,
					"useTypeId": 1515194093452657000,
					"useType": "0",
					"versionCode": "V2.2",
					"scrap": 0,
					"isWholeSend": 0,
					"effectiveDate": 1620354619000,
					"expiryDate": 4102415999000,
					"quantity": "1",
					"materialId": 1541032107561216,
					"productId": 1540960132419840,
					"vouchdate": 1620369269230,
					"produceUnit": 1986946079215872,
					"batch": 1,
					"bomUnitName": "",
					"produceBatch": 1,
					"creator": "19998888888",
					"creatorId": 1959752072810752,
					"createTime": 1620369270000,
					"createDate": 1620369270000,
					"status": 0,
					"pubts": 1620369270000,
					"tenant": 1292161350684928,
					"yTenantId": "czqne4bp",
					"produceUnitCode": "",
					"fromQuantity": 0,
					"toQuantity": 0,
					"changeRate": "",
					"quantityControl": 0,
					"bomByproduct": [
						{
							"id": 2247381323665666,
							"bomId": 2247381323649280,
							"productionType": 0,
							"costOutputProportion": 55.5,
							"numeratorQuantity": 1,
							"denominatorQuantity": 1,
							"orgId": "1293256121766144",
							"materialId": 1541032107561216,
							"productId": 1540960132419840,
							"produceUnit": 1986946079215872,
							"produceNumeratorQuantity": 1,
							"bomUnitName": "",
							"changeRate": 0,
							"productCode": "",
							"productName": "",
							"produceUnitCode": ""
						}
					],
					"bomComponent": [
						{
							"id": 2247381323665664,
							"bomId": 2247381323649280,
							"orgId": "1293256121766144",
							"alternateType": 1,
							"numeratorQuantity": 1,
							"denominatorQuantity": 1,
							"designator": "r1",
							"usageType": 1,
							"lossType": 0,
							"scrap": 0,
							"partakeSimulation": 1,
							"calcCostFlag": 1,
							"supplyType": 0,
							"isVirtual": 0,
							"effectiveDate": 1620354619000,
							"expiryDate": 4102415999000,
							"materialId": 1630306468991232,
							"productId": 1417595602866432,
							"skuId": 1417595618955520,
							"wholeFlag": 0,
							"costScrap": 0,
							"stockUnit": 1986946136461568,
							"stockNumeratorQuantity": 1,
							"alternateDenominator": 1,
							"alternateRatio": 1,
							"componentType": "0",
							"excessSendConstant": 0,
							"excessSendFlag": 0,
							"excessSendScrap": 0,
							"excessTendType": 0,
							"keyMaterialGroup": 0,
							"mainMaterial": 1,
							"materialGroupNo": "",
							"sequence": 0,
							"replaceType": 0,
							"standard": 1,
							"bomAlternate": [
								{
									"id": 2247381323665665,
									"bomComponentId": 2247381323665664,
									"orgId": "1293256121766144",
									"sequence": 1,
									"mainMaterial": 1,
									"alternateRatio": 1,
									"alternateDenominator": 1,
									"materialId": 1630306468991232,
									"productId": 1417595602866432,
									"skuId": 1417595618955520,
									"stockUnit": 1986946136461568,
									"effectiveDate": 1620354619000,
									"expiryDate": 4102415999000,
									"denominatorQuantity": 1,
									"designator": "0",
									"keyMaterialGroup": 0,
									"materialGroupNo": "0",
									"mustLossQuantity": 0,
									"numeratorQuantity": 0,
									"remark": "0",
									"scrap": 0,
									"stockNumeratorQuantity": 0,
									"bomUnitName": "",
									"changeRate": 0,
									"entrustSupplyType": 0,
									"productCode": "",
									"productName": "",
									"netDemandRatio": 0,
									"stockUnitCode": "",
									"ownerType": 2
								}
							],
							"vendorDropShipment": 0,
							"advanceDays": 0,
							"alternateplanName": "",
							"bomUnitName": "",
							"changeRate": 0,
							"entrustSupplyType": 0,
							"isRatioAlternate": 0,
							"lineNo": 0,
							"lineType": 0,
							"mustLossQuantity": 0,
							"netDemandRatio": 0,
							"productCode": "",
							"productName": "",
							"purchaseProportion": 0,
							"stockOrgName": "",
							"truncUp": 0,
							"bomComponentStepLoss": {
								"bomFromMainQuantity": 0,
								"bomToMainQuantity": 0,
								"mustLossQuantity": 0,
								"scrap": 0,
								"remark": ""
							},
							"stockUnitCode": "",
							"ownerType": 2
						}
					],
					"productCode": "",
					"productName": "",
					"wbs": ""
				}
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-13

新增

请求参数 entrustSupplyType

新增

请求参数 ownerType

更新

请求参数 (57)

新增

返回参数 ownerType

新增

返回参数 ownerType

更新

返回参数 (54)

2	2025-11-26

更新

请求说明

新增

请求参数 (8)

3	2025-01-03

更新

请求说明

新增

请求参数 (9)

更新

请求参数 (7)

删除

请求参数 denominatorQuantity

删除

请求参数 numeratorQuantity

新增

返回参数 (5)

更新

返回参数 (36)

字段补充


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

