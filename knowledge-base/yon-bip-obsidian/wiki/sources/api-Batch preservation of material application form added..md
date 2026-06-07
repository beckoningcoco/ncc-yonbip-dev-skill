---
title: "物料申请单新增批量保存"
apiId: "2170460065269022723"
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

# 物料申请单新增批量保存

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/productapply/batchsaveforadd

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 否 | 请求数据体 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| applyCode | string | 否 | 是 | 物料申请单编码，编码不存在为新增，编码存在时为修改 示例：WLXZ000045 |
| effectType | string | 否 | 是 | 生效类型，0为立即处理，1为定时处理 示例：0 |
| applyReason | string | 否 | 否 | 申请原因 示例：申请原因 |
| applyOrg | string | 否 | 否 | 申请组织id(id和编码二选一选填，同时填入时以code为准) 示例：666666 |
| applyOrgCode | string | 否 | 否 | 申请组织编码(id和编码二选一选填，同时填入时以code为准） 示例：000002 |
| applyDepartment | string | 否 | 否 | 部门id(id和编码二选一选填，同时填入时以code为准) 示例：1504752976446095363 |
| applyDepartmentCode | string | 否 | 否 | 部门编码(id和编码二选一选填，同时填入时以code为准）) 示例：000001 |
| bizOperator | string | 否 | 否 | 申请人id(id和编码二选一选填，同时填入时以code为准) 示例：1748882585331695616 |
| bizOperatorCode | string | 否 | 否 | 申请人编码(id和编码二选一选填，同时填入时以code为准) 示例：024006 |
| effectTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 生效时间，当生效类型为定时处理时，生效时间不允许为空！ 示例：2022-08-31 01:01:01 |
| applyDesc | string | 否 | 否 | 备注 示例：备注 |
| productData | object | 否 | 是 | 物料信息 |

## 3. 请求示例

Url: /yonbip/digitalModel/productapply/batchsaveforadd?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"applyCode": "WLXZ000045",
			"effectType": "0",
			"applyReason": "申请原因",
			"applyOrg": "666666",
			"applyOrgCode": "000002",
			"applyDepartment": "1504752976446095363",
			"applyDepartmentCode": "000001",
			"bizOperator": "1748882585331695616",
			"bizOperatorCode": "024006",
			"effectTime": "2022-08-31 01:01:01",
			"applyDesc": "备注",
			"productData": {
				"orgCode": "global00",
				"orgId": "666666",
				"code": "0012000372",
				"name": {
					"simplifiedName": "简体",
					"englishName": "英文",
					"traditionalName": "繁体"
				},
				"modelDescription": {
					"simplifiedName": "简体",
					"englishName": "英文",
					"traditionalName": "繁体"
				},
				"model": {
					"simplifiedName": "简体",
					"englishName": "英文",
					"traditionalName": "繁体"
				},
				"erpCode": "12345",
				"transType": "",
				"transTypeCode": "",
				"materialStatusId": "",
				"materialStatusCode": "",
				"optionalMaterial": 0,
				"optionalType": 0,
				"derivedMaterial": 0,
				"optionalMaterialCode": "0012000490",
				"optionalMaterialId": 2005891633021714400,
				"detail": {
					"shortName": "物料01",
					"mnemonicCode": "WL01",
					"erpOuterCode": "12345",
					"barCode": "12345",
					"inspectionType": 0,
					"warehousingByResult": false,
					"testRule": 1,
					"businessAttribute": "1,7",
					"saleChannel": "1,2,3",
					"purchaseUnit": 1955228568170528800,
					"purchaseUnitCode": "KGM",
					"inspectionUnit": 1955228568170528800,
					"inspectionUnitCode": "KGM",
					"purchasePriceUnit": 1955228568170528800,
					"purchasePriceUnitCode": "KGM",
					"stockUnit": 1955228568170528800,
					"stockUnitCode": "KGM",
					"produceUnit": 1955228568170528800,
					"produceUnitCode": "KGM",
					"batchPriceUnit": 1955228568170528800,
					"batchPriceUnitCode": "KGM",
					"batchUnit": 1955228568170528800,
					"batchUnitCode": "KGM",
					"onlineUnit": 1955228568170528800,
					"onlineUnitCode": "KGM",
					"offlineUnit": 1955228568170528800,
					"offlineUnitCode": "KGM",
					"requireUnit": 1955228568170528800,
					"requireUnitCode": "KGM",
					"markPrice": 1.1,
					"salePrice": 1.1,
					"marketPrice": 1.1,
					"displayPrice": false,
					"priceAreaMessage": "价格提示",
					"receiptName": {
						"simplifiedName": "简体",
						"englishName": "英文",
						"traditionalName": "繁体"
					},
					"incomeTaxRates": "10003",
					"incomeTaxRatesCode": "VATR6",
					"outputTaxRate": "10003",
					"outTaxRateCode": "VATR6",
					"order": 0,
					"stopstatus": false,
					"storeOffAndOffState": false,
					"orderLoadAndUnloadStatus": false,
					"productVendor": 1841189919393316900,
					"productVendorCode": "0001000102",
					"productBuyer": "6280fa4ccfcf11edae1008c0ebd50df6",
					"productBuyerCode": "6280fa4ccfcf11edae1008c0ebd50df6",
					"primeCosts": 0,
					"maxPrimeCosts": 0,
					"requestOrderLimit": 0,
					"canSale": false,
					"minOrderQuantity": 1.1,
					"deliveryDays": 0,
					"batchManage": false,
					"expiryDateManage": false,
					"expiryDateCalculationMethod": 0,
					"expireDateNo": 0,
					"expireDateUnit": "1",
					"daysBeforeValidityReject": 0,
					"validityWarningDays": 0,
					"serialNoManage": false,
					"barcodeManage": false,
					"safetyStock": 1.1,
					"highestStock": 1.1,
					"lowestStock": 1.1,
					"ropStock": 1.1,
					"warehouseManager": "6280fa4ccfcf11edae1008c0ebd50df6",
					"warehouseManagerCode": "6280fa4ccfcf11edae1008c0ebd50df6",
					"receiptWarehouse": 1689721154595455000,
					"receiptWarehouseCode": "000036",
					"deliveryWarehouse": 1689721154595455000,
					"deliveryWarehouseCode": "000036",
					"returnWarehouse": 1689721154595455000,
					"returnWarehouseCode": "000036",
					"inStoreExcessLimit": 1.1,
					"outStoreExcessLimit": 1.1,
					"storageLossRate": 1.1,
					"planDefaultAttribute": 1,
					"allowNegativeInventory": false,
					"planMethod": 0,
					"keySubPart": false,
					"fixedLeadTime": 0,
					"supplyType": 0,
					"produceDepartment": "1546453681386815488",
					"produceDepartmentCode": "00012",
					"manufacturePlanner": "6280ab18cfcf11edae1008c0ebd50df6",
					"manufacturePlannerCode": "6280ab18cfcf11edae1008c0ebd50df6",
					"engineeringDrawingNo": "12345",
					"planProduceLimit": 0,
					"valueManageType": "0",
					"batchRule": 0,
					"fixedQuantity": 10,
					"costValuation": "",
					"noTaxCostPrice": 1.1,
					"checkByBatch": false,
					"saleStyle": "1",
					"salePoints": 0,
					"inventoryCount": 2.2,
					"baseSaleCount": 0,
					"metaDescription": {
						"simplifiedName": "简体",
						"englishName": "英文",
						"traditionalName": "繁体"
					},
					"settleAccountsRate": 6.6,
					"recommend": false,
					"displayName": {
						"simplifiedName": "简体",
						"englishName": "英文",
						"traditionalName": "繁体"
					},
					"titleMemo": {
						"simplifiedName": "简体",
						"englishName": "英文",
						"traditionalName": "繁体"
					},
					"allowStorePurchase": true,
					"saleInOfflineStore": true,
					"priceChangeAllowed": false,
					"offlineStoreOrder": true,
					"offlineStoreReturn": true,
					"retailPriceDimension": 1,
					"deliverQuantityChange": 1,
					"process": false,
					"processType": "",
					"material": false,
					"weighingOrNot": false,
					"inventoryPlanStrategy": "0",
					"costItems": "1978437901431078916",
					"costItemsCode": "ZDH_FYXM",
					"costItemsName": "自动化_费用项目",
					"singleInspection": 0,
					"manageByInventory": 0,
					"checkByProject": 0,
					"checkBySalesOrders": 0,
					"checkByClient": 0,
					"checkByOutsourcing": 0,
					"atpInspection": 0,
					"doublePick": 10,
					"materialStatusId": "",
					"materialStatusCode": "",
					"economicQuantity": 0,
					"mtoStrategy": 0,
					"manufacturingStrategy": "MTO",
					"strategyComparisonRule": 0,
					"projectTrackStrategy": 0
				},
				"manageClass": "1979147318348742658",
				"manageClassCode": "000160",
				"productClass": 1604214059445518300,
				"productClassCode": "000023",
				"purchaseClass": 1546426425542180900,
				"purchaseClassCode": "PTO001",
				"purchaseClassName": "PTO商品",
				"registrationManager": false,
				"authorizationManager": false,
				"sunshinePurchaseNo": "12345",
				"registrationNo": "12345",
				"autoGenerateRangeData": false,
				"productTemplate": 1707277039562129400,
				"productTemplateName": "二维",
				"productLine": 1978437085392011300,
				"productLineCode": "zdhcpx",
				"brand": 1748988559366291500,
				"brandCode": "00001",
				"placeOfOrigin": "产地",
				"manufacturer": "生产厂商",
				"description": {
					"description": "物料电脑端描述",
					"mobileDescription": "物料手机端描述"
				},
				"realProductAttribute": 1,
				"realProductAttributeType": 1,
				"virtualProductAttribute": 7,
				"giftCardId": "1978442600116912138",
				"couponId": "1978445340306046985",
				"unitUseType": 2,
				"unit": 1955228568170528800,
				"unitCode": "KGM",
				"enableAssistUnit": false,
				"weight": 1.1,
				"weightUnit": 1955228568170528800,
				"weightUnitCode": "KGM",
				"netWeight": 10,
				"netWeightUnit": 1955228568170528800,
				"netWeightUnitCode": "KGM",
				"volume": 1.1,
				"volumeUnit": 1978432859144192000,
				"volumeUnitCode": "MTQ",
				"taxClass": "3040602990000000000",
				"taxClassCode": "3040602990000000000",
				"planClassCode": "PLAN01",
				"planClass": 1954632478273568800,
				"shareDescription": {
					"simplifiedName": "简体",
					"englishName": "英文",
					"traditionalName": "繁体"
				},
				"keywords": {
					"simplifiedName": "简体",
					"englishName": "英文",
					"traditionalName": "繁体"
				},
				"productAssistClasses": [
					{
						"status": "Insert",
						"productClassId": 1546426425542180900,
						"productClassCode": "001"
					}
				],
				"productOrges": [
					{
						"orgCode": "XMGS",
						"orgId": "1552320168638545928"
					}
				],
				"productAssistUnitExchanges": [
					{
						"unitExchangeType": 0,
						"assistUnitCount": 1,
						"assistUnit": 1748882585331695616,
						"assistUnitCode": "TNE",
						"mainUnitCount": 1000,
						"status": "Insert",
						"order": 0
					}
				],
				"productBarCodes": [
					{
						"barCode": "12345"
					}
				]
			}
		}
	]
}

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
| messages | object | 是 | 失败详细信息 示例：["物料申请[SQD24012903]与已存在物料申请[SQD24012903]，名称+规格说明+型号重复"] |
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
			"物料申请[SQD24012903]与已存在物料申请[SQD24012903]，名称+规格说明+型号重复"
		],
		"infos": [
			{
				"id": 1918383967882444807,
				"applyCode": "SQD24012902"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	通用业务校验异常	通用业务校验异常

118000	入参不能为空	入参不能为空

118003	请求数量超过最大限制数量	请求数量超过最大限制数量


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

