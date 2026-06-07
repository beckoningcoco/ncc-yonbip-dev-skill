---
title: "物料清单批量保存V2"
apiId: "1936035115344330761"
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

# 物料清单批量保存V2

> `ContentType	application/json` 请求方式	POST | 分类: BOM Maintenance (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/mfg/bom/batchsave/V1

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 业务数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 否 | 主键， 新增时无需填写，修改时必填 示例：1957365595279616 |
| orgId | string | 否 | 否 | 组织id，组织ID和组织编码不能同时为空 示例：1904546773012736 |
| orgCode | string | 否 | 否 | 组织编码，组织id，组织ID和组织编码不能同时为空 示例：Amy001 |
| bomType | long | 否 | 是 | BOM类型，1：主BOM,2:替代BOM 示例：1 |
| bomClassify | number |
| 小数位数:0,最大长度:10 | 否 | 否 | BOM类别，为2时，sourceLineNo，sourceCode，sourceSrcDocId必传 示例：2 |
| sourceSrcDocId | string | 否 | 否 | 来源单据ID，bomClassify为2时必传 示例：2060752392938848260 |
| sourceCode | string | 否 | 否 | 来源单据编码，bomClassify为2时必传 示例：QbOJ-000000000-20240808-000002 |
| sourceLineNo | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 来源单据行号，bomClassify为2时必传 示例：10 |
| productId | long | 否 | 否 | productId和productCode二选一必填 示例：1991530019098880 |
| productCode | string | 否 | 否 | 物料编码;物料id和物料编码同时存在，以物料id为准。 示例：0001000008 |
| subcontractVendorId | long | 否 | 否 | 委外商Id |
| subcontractVendorIdCode | string | 否 | 否 | 委外商Code。用途=委外时，可以指定委外商。委外商ID和委外商Code同时传入时，已委外商ID为准 |
| scrap | long | 否 | 是 | 废品率(%)，输入百分比值 示例：1 |
| substituteFlag | string | 否 | 否 | 替代标识，当BOM类型是替代BOM时，必须要输入，用于区分同一个母件不同用途的替代BOM 示例：fs |
| substituteDescription | string | 否 | 否 | 替代说明 示例：替代说明 |
| remark | string | 否 | 否 | 备注 示例：11 |
| engineeringDrawNumber | string | 否 | 否 | 工程图号 示例：sdwerw |
| useTypeId | long | 否 | 否 | 用途Id;用途Id和用途编码同时存在，以用途Id为准。用途Id和用途编码不可同时为空。 示例：1515194093452657000 |
| useType | string | 否 | 否 | 用途编码;用途Id和用途编码同时存在，以用途Id为准。用途Id和用途编码不可同时为空。 示例：0 |
| versionCode | string | 否 | 是 | 版本号，必须符合参数设置中当前组织设置的版本号格式 示例：V2.2 |
| effectiveDate | string | 否 | 是 | 生效时间 示例：2021-06-23 00:00:00 |
| expiryDate | string | 否 | 是 | 失效时间 示例：2099-12-31 23:59:59 |
| isWholeSend | long | 否 | 否 | 整单齐套发料，枚举值，0：否，1：是 示例：0 默认值：0 |
| batch | double | 否 | 否 | 主批量，主批量和批量同时输入以批量为准 示例：1.00 |
| rollup | long | 否 | 否 | 默认卷积，枚举值，0：否，1：是 示例：0 默认值：0 |
| produceUnit | long | 否 | 否 | 计量单位，为空时根据物料档案带入 示例：0 |
| produceUnitCode | string | 否 | 否 | 计量单位编码,produceUnitCode和produceUnit同时填写以produceUnit为准进行查询计量单位 |
| produceBatch | double | 否 | 否 | 批量,批量和主批量同时输入以批量为准,若都不录入批量会默认赋值为1.00 示例：1.00 |
| _status | string | 否 | 是 | 数据状态，枚举值，Insert：插入，Update：更新 示例：Insert |
| fromQuantity | double | 否 | 否 | 从数量，数量控制为1时，必填 示例：0.00 |
| toQuantity | double | 否 | 否 | 到数量，数量控制为1时，必填 |
| quantityControl | int | 否 | 否 | 数量控制，0否，1是 示例：0 默认值：0 |
| bomComponent | object | 是 | 是 | 子件信息 |
| bomByproduct | object | 是 | 否 | 产出品 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| wbs | string | 否 | 否 | wbsid。wbsid和wbs编码同时存在时，以wbsid为准。 |
| wbsCode | string | 否 | 否 | wbs编码。wbsid和wbs编码同时存在时，以wbsid为准。 |
| agentId | string | 否 | 否 | 客户Id;客户Id和客户编码同时存在，以客户Id为准。 |
| agentCode | string | 否 | 否 | 客户编码;客户Id和客户编码同时存在，以客户Id为准。 |
| transTypeId | string | 否 | 否 | 交易类型Id;交易类型Id和交易类型编码同时存在，以交易类型Id为准。 |
| transTypeCode | string | 否 | 否 | 交易类型编码;交易类型Id和交易类型编码同时存在，以交易类型Id为准。 |

## 3. 请求示例

Url: /yonbip/mfg/bom/batchsave/V1?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "951ada30e0969e954f5d9058fff6a512",
			"id": "1957365595279616",
			"orgId": "1904546773012736",
			"orgCode": "Amy001",
			"bomType": 1,
			"bomClassify": 2,
			"sourceSrcDocId": "2060752392938848260",
			"sourceCode": "QbOJ-000000000-20240808-000002",
			"sourceLineNo": 10,
			"productId": 1991530019098880,
			"productCode": "0001000008",
			"subcontractVendorId": 0,
			"subcontractVendorIdCode": "",
			"scrap": 1,
			"substituteFlag": "fs",
			"substituteDescription": "替代说明",
			"remark": "11",
			"engineeringDrawNumber": "sdwerw",
			"useTypeId": 1515194093452657000,
			"useType": "0",
			"versionCode": "V2.2",
			"effectiveDate": "2021-06-23 00:00:00",
			"expiryDate": "2099-12-31 23:59:59",
			"isWholeSend": 0,
			"batch": 1,
			"rollup": 0,
			"produceUnit": 0,
			"produceUnitCode": "",
			"produceBatch": 1,
			"_status": "Insert",
			"fromQuantity": 0,
			"toQuantity": 0,
			"quantityControl": 0,
			"bomComponent": [
				{
					"lineType": 0,
					"id": "1508530600120576",
					"partakeSimulation": 0,
					"productId": 1979779569520896,
					"productCode": "0001000008",
					"skuId": 1979779569520896,
					"skuCode": "1000013",
					"skuIdName": "eflong-子件",
					"scrap": 0,
					"numeratorQuantity": 1,
					"denominatorQuantity": 1,
					"supplyType": 0,
					"remark": "备注",
					"effectiveDate": "2021-06-23 00:00:00",
					"expiryDate": "2099-12-31 23:59:59",
					"engineeringDrawNumber": "",
					"isVirtual": 0,
					"usageType": 1,
					"lossType": 0,
					"mustLossQuantity": 0,
					"designator": "r1",
					"truncUp": 0,
					"entrustType": "0",
					"wholeFlag": 0,
					"wholePoint": 1,
					"alternateType": "1",
					"advanceDays": 5,
					"costScrap": 0,
					"calcCostFlag": 1,
					"stockUnit": 1381139365204224,
					"stockUnitCode": "",
					"stockNumeratorQuantity": 1,
					"sequence": 0,
					"materialGroupNo": "",
					"mainMaterial": 0,
					"keyMaterialGroup": 0,
					"excessTendType": 0,
					"excessSendScrap": 0,
					"excessSendFlag": 0,
					"excessSendConstant": 0,
					"replaceType": 0,
					"_status": "Insert",
					"bomAlternate": [
						{
							"id": 1473356932239616,
							"productId": 1979779569520896,
							"productCode": "0001000008",
							"skuId": 1979779569520546,
							"sequence": 1,
							"mainMaterial": 0,
							"effectiveDate": "2021-06-23 00:00:00",
							"expiryDate": "2099-12-31 23:59:59",
							"engineeringDrawNumber": "",
							"fixedQuantity": 2,
							"manufacturingSpecification": "",
							"stockUnit": 1381139365204224,
							"stockUnitCode": "",
							"_status": "Insert",
							"designator": "0",
							"keyMaterialGroup": 0,
							"mustLossQuantity": 0,
							"remark": "0",
							"scrap": 0,
							"stockNumeratorQuantity": 0
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
					"warehouseId": "",
					"warehouseCode": "",
					"entrustSupplyType": 0,
					"ownerType": 2
				}
			],
			"bomByproduct": [
				{
					"id": "rowId_100",
					"productionType": 0,
					"numeratorQuantity": 1,
					"denominatorQuantity": 1,
					"productId": 1991530019098880,
					"productCode": "0001000008",
					"skuId": 1991530061648128,
					"remark": "备注信息",
					"engineeringDrawNumber": "工程图号123545646",
					"manufacturingSpecification": "",
					"costOutputProportion": 50,
					"effectiveDate": "2021-06-23 09:40:40",
					"expiryDate": "2099-12-31 23:59:59",
					"produceUnit": 1381139365204224,
					"produceUnitCode": "",
					"produceNumeratorQuantity": 1,
					"_status": "Insert"
				}
			],
			"wbs": "",
			"wbsCode": "",
			"agentId": "",
			"agentCode": "",
			"transTypeId": "",
			"transTypeCode": ""
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 接口调用返回码，成功时返回200 示例：200 |
| message | string | 否 | 接口调用返回信息 |
| data | object | 否 | 接口调用返回数据 |
| sucessCount | long | 否 | 成功条数 示例：0 |
| failCount | long | 否 | 失败的条数 示例：0 |
| count | long | 否 | 总条数 示例：0 |
| message | string | 否 | 接口调用返回信息 示例：操作成功 |
| infos | object | 是 | 接口调用返回数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"sucessCount": 0,
		"failCount": 0,
		"count": 0,
		"message": "操作成功",
		"infos": [
			{
				"code": 200,
				"message": "操作成功",
				"data": {
					"vouchdate": "2021-09-17 20:40:53",
					"orgId": "2059907698741504",
					"orgCode": "amy001",
					"bomType": 1,
					"productId": 2435612675463680,
					"batch": 1,
					"scrap": 0,
					"useTypeId": 1515194093452657000,
					"useType": "0",
					"versionCode": "1.00",
					"effectiveDate": "2021-09-17 00:00:00",
					"expiryDate": "2099-12-31 23:59:59",
					"isWholeSend": 0,
					"isWholeReport": 0,
					"rollup": 0,
					"produceUnit": 1381139365204224,
					"produceBatch": 1,
					"id": 2436013321687552,
					"pubts": "2021-09-17 20:40:54",
					"fromQuantity": 0,
					"toQuantity": 0,
					"quantityControl": 0,
					"bomComponent": [
						{
							"numeratorQuantity": 1,
							"denominatorQuantity": 1,
							"usageType": 1,
							"designator": "r1",
							"lossType": 0,
							"mustLossQuantity": 0,
							"scrap": 0,
							"truncUp": 0,
							"alternateType": 0,
							"partakeSimulation": 1,
							"calcCostFlag": 1,
							"effectiveDate": "2021-09-17 00:00:00",
							"expiryDate": "2099-12-31 23:59:59",
							"costScrap": 0,
							"supplyType": 0,
							"isVirtual": 0,
							"productId": 2435612675463680,
							"productUnitPrecision": 2,
							"orgId": "2059907698741504",
							"wholeFlag": 0,
							"quantity": 1,
							"stockUnit": 1381139365204224,
							"stockNumeratorQuantity": 1,
							"id": 2436013321687553,
							"bomId": 2436013321687552,
							"pubts": "2021-09-17 20:40:53",
							"alternateDenominator": 1,
							"alternateRatio": 1,
							"componentType": 0,
							"excessSendFlag": 0,
							"keyMaterialGroup": 0,
							"mainMaterial": 1,
							"materialGroupNo": "",
							"sequence": 0,
							"replaceType": 0,
							"standard": 1,
							"vendorDropShipment": 0,
							"bomAlternate": [
								{
									"id": 2247381323665665,
									"bomComponentId": 2247381323665664,
									"orgId": "1293256121766144",
									"sequence": 1,
									"alternateRatio": 1,
									"alternateDenominator": 1,
									"productId": 1417595602866432,
									"stockUnit": 1381139365204224,
									"effectiveDate": "1620354619000",
									"expiryDate": "4102415999000",
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
									"mainMaterial": 0,
									"productCode": "",
									"productName": "",
									"ownerType": 2
								}
							],
							"advanceDays": 0,
							"alternateplanName": "",
							"bomUnitName": "",
							"changeRate": 0,
							"entrustSupplyType": 0,
							"entrustType": 0,
							"isRatioAlternate": 0,
							"lineNo": 0,
							"lineType": 0,
							"netDemandRatio": 0,
							"productCode": "",
							"productName": "",
							"purchaseProportion": 0,
							"stockOrgName": "",
							"stockOrgId": "",
							"bomComponentStepLoss": {
								"bomFromMainQuantity": 0,
								"bomToMainQuantity": 0,
								"mustLossQuantity": 0,
								"scrap": 0,
								"remark": ""
							},
							"ownerType": 2
						}
					],
					"bomByproduct": [
						{
							"productionType": 0,
							"numeratorQuantity": 1,
							"costOutputProportion": 100,
							"productId": 2435612675463680,
							"orgId": "2059907698741504",
							"orgCode": "amy001",
							"effectiveDate": "2021-09-17 20:43:04",
							"expiryDate": "2099-12-31 23:59:59",
							"denominatorQuantity": 1,
							"quantity": 1,
							"produceUnit": "1381139365204224",
							"produceNumeratorQuantity": 1,
							"id": 2436013321687554,
							"bomId": 2436013321687552,
							"pubts": "2021-09-17 20:40:53",
							"bomUnitName": "",
							"changeRate": 0,
							"productCode": "",
							"productName": ""
						}
					],
					"adminOrgName": "",
					"adminOrgId": "",
					"adminOrgCode": "",
					"bomUnitName": "",
					"changeRate": 0,
					"productCode": "",
					"productName": "",
					"useTypeName": ""
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

1	2026-03-23

更新

请求说明

新增

请求参数 entrustSupplyType

新增

请求参数 ownerType

更新

请求参数 (46)

新增

返回参数 ownerType

新增

返回参数 ownerType

更新

返回参数 (50)

2	2026-03-13

新增

请求参数 entrustSupplyType

新增

请求参数 ownerType

更新

请求参数 (46)

新增

返回参数 ownerType

新增

返回参数 ownerType

更新

返回参数 (50)

3	2025-11-26

更新

请求说明

新增

请求参数 (13)

更新

请求参数 productId

更新

请求参数 subcontractVendorIdCode

删除

请求参数 (10)

更新

返回参数 message

更新

返回参数 message

更新

返回参数 batch

4	2025-06-24

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

