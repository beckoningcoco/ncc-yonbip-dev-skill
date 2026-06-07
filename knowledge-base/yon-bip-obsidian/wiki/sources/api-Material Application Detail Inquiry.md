---
title: "物料申请单详情查询"
apiId: "1510167865047121924"
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

# 物料申请单详情查询

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/product/queryProductApply

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
| id | long | 否 | 否 | 物料申请单id，id和申请单编码必输入一个 示例：123456 |
| applyCode | string | 否 | 否 | 申请单编码，id和申请单编码必输入一个 示例：申请单编码 |

## 3. 请求示例

Url: /yonbip/digitalModel/product/queryProductApply?access_token=访问令牌
Body: {
	"id": 123456,
	"applyCode": "申请单编码"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| applyCode | string | 否 | 物料申请单编码 示例：123 |
| applyType | string | 否 | 申请类型，0新增，1变更 示例：0 |
| applyReason | string | 否 | 申请原因 示例：申请原因 |
| applyOrg | string | 否 | 申请组织 示例：666666 |
| applyDepartment | string | 否 | 申请部门 示例：1504752976446095363 |
| productData | object | 否 | 物料信息 |
| code | string | 否 | 编码 示例：1530996515090202632 |
| bizOperator | string | 否 | 业务员id 示例：40624485557105664 |
| effectType | string | 否 | 生效类型，0为立即处理，1为定时处理 示例：1 |
| effectStatus | string | 否 | 生效状态，0：未处理，1：处理中，2：成功，3：失败 示例：0 |
| id | long | 否 | 申请单id 示例：1530996515090202600 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"applyCode": "123",
		"applyType": "0",
		"applyReason": "申请原因",
		"applyOrg": "666666",
		"applyDepartment": "1504752976446095363",
		"productData": {
			"detail": {
				"purchaseUnit": 2571526867440640,
				"purchaseUnitCode": "KGM",
				"purchaseUnitName": "千克",
				"purchasePriceUnit": 2571526867440640,
				"purchasePriceUnitCode": "KGM",
				"purchasePriceUnitName": "千克",
				"stockUnit": 2571526867440640,
				"stockUnitCode": "KGM",
				"stockUnitName": "千克",
				"batchUnit": 2571526867440640,
				"batchUnitCode": "KGM",
				"batchUnitName": "千克",
				"onlineUnit": 2571526867440640,
				"onlineUnitCode": "KGM",
				"onlineUnitName": "千克",
				"offlineUnit": 2571526867440640,
				"offlineUnitCode": "KGM",
				"offlineUnitName": "千克",
				"requireUnit": 2571526867440640,
				"requireUnitCode": "KGM",
				"requireUnitName": "千克",
				"batchPriceUnit": 2571526867440640,
				"batchPriceUnitCode": "KGM",
				"batchPriceUnitName": "千克",
				"inspectionUnitCode": "KGM",
				"inspectionUnitName": "千克",
				"displayPrice": true,
				"batchManage": true,
				"expiryDateManage": false,
				"serialNoManage": false,
				"omsWarehouseCode": "000133",
				"omsWarehouseName": "rewrw",
				"canSale": true,
				"deliveryDays": 1,
				"enableCyclePurchase": false,
				"enableDeposit": false,
				"depositDealPayType": 0,
				"enableModifyDeposit": false,
				"depositPayType": 0,
				"metaDescription": {
					"simplifiedName": "搜索简介"
				},
				"baseSaleCount": 100,
				"allowStorePurchase": true,
				"priceChangeAllowed": false,
				"saleInOfflineStore": true,
				"offlineStoreOrder": true,
				"offlineStoreReturn": true,
				"weighingOrNot": false,
				"process": false,
				"material": false,
				"retailPriceDimension": 1,
				"deliverQuantityChange": 1,
				"checkByBatch": false,
				"storeOffAndOffState": false,
				"orderLoadAndUnloadStatus": false,
				"saleChannel": "1,2",
				"barCode": "条形码",
				"valueManageType": 0,
				"costValuation": 0,
				"planDefaultAttribute": 1,
				"planMethod": 0,
				"keySubPart": false,
				"fixedLeadTime": 10,
				"supplyType": 0,
				"produceDepartment": "2539023636943104",
				"produceDepartmentCode": "0002",
				"produceDepartmentName": "销售部门",
				"manufacturePlanner": "40624432569938944",
				"manufacturePlannerCode": "A000001",
				"manufacturePlannerName": "甘甘",
				"engineeringDrawingNo": "123",
				"productVendor": 2584060529692928,
				"productVendorCode": "1847000023",
				"productVendorName": "供应商测试",
				"productBuyer": "40624432569938944",
				"productBuyerCode": "A000001",
				"productBuyerName": "甘甘",
				"enableSubscribe": false,
				"recommend": false,
				"erpOuterCode": "商家商品外部编码",
				"saleStyle": "1",
				"shortName": "物料简称",
				"mnemonicCode": "助记码",
				"receiptName": {
					"simplifiedName": "开票名称"
				},
				"incomeTaxRates": "2538775356445954",
				"incomeTaxRatesCode": "VAT9",
				"incomeTaxRatesName": "9%",
				"outputTaxRate": "2538775356445954",
				"outTaxRateCode": "VAT9",
				"outTaxRateName": "9%",
				"produceUnit": 2571526867440640,
				"produceUnitCode": "KGM",
				"produceUnitName": "千克",
				"warehouseManager": "40624432569938944",
				"warehouseManagerCode": "A000001",
				"warehouseManagerName": "甘甘",
				"deliveryWarehouse": 1519760519882866700,
				"deliveryWarehouseCode": "000133",
				"deliveryWarehouseName": "rewrw",
				"returnWarehouse": 1519760519882866700,
				"returnWarehouseCode": "000133",
				"returnWarehouseName": "rewrw",
				"allowNegativeInventory": true,
				"scanCountUnit": 0,
				"warehousingByResult": false,
				"displayName": {
					"simplifiedName": "显示名称"
				},
				"titleMemo": {
					"simplifiedName": "卖点"
				},
				"barcodeManage": true,
				"receiptWarehouse": 1519760519882866700,
				"receiptWarehouseCode": "000133",
				"receiptWarehouseName": "rewrw",
				"batchRule": 0,
				"prepareFeed": false,
				"specialMaterials": false,
				"virtualPart": false,
				"demandConsolidation": 0,
				"demandConsolidationType": 0,
				"demandConsolidationUnit": 0,
				"demandConsolidationNumber": 1,
				"demandConsolidationDateType": 0,
				"reservation": false,
				"lossType": 0,
				"ECNControl": false,
				"inspectionType": 0,
				"logisticsRelated": false,
				"weighingMode": 0,
				"reviewGrossWeight": false,
				"specialCarTransport": false,
				"businessAttribute": "1,7",
				"testRule": 1,
				"enableStockExpireCheck": 0,
				"enableSparePartsManagement": 0,
				"fullSetInspection": 0,
				"directProduction": 0
			},
			"productOrges": [
				{
					"orgId": "2538984869630976",
					"orgCode": "0701",
					"isCreator": true,
					"isApplied": true
				}
			],
			"autoGenerateRangeData": false,
			"realProductAttribute": 1,
			"code": "code1",
			"name": {
				"simplifiedName": "simplifiedName1"
			},
			"modelDescription": {
				"simplifiedName": "规格说明1"
			},
			"model": {
				"simplifiedName": "型号1"
			},
			"keywords": {
				"simplifiedName": "关键字"
			},
			"productClass": 2541495026652160,
			"productClassCode": "000002",
			"manageClass": 2541494503052544,
			"manageClassCode": "000002",
			"manageClassName": "黄金",
			"productTemplate": 2541493655655424,
			"productTemplateName": "珠宝模板",
			"useSku": 0,
			"brand": 2570445127045635,
			"brandCode": "品牌2",
			"brandName": "品牌2",
			"placeOfOrigin": "产地",
			"manufacturer": "生产厂商",
			"productLine": 2570288159150336,
			"productLineCode": "wxt0004",
			"productLineName": "产品线4",
			"shareDescription": {
				"simplifiedName": "分享说明"
			},
			"unit": 2571526867440640,
			"unitCode": "KGM",
			"unitName": "千克",
			"taxClass": "1010105000000000000",
			"taxClassCode": "1010105000000000000",
			"taxClassName": "棉花",
			"orgId": "2538984869630976",
			"orgCode": "0701",
			"id": 1530976715290968000,
			"erpCode": "外部编码",
			"realProductAttributeType": 1,
			"weightUnit": 2571526867440640,
			"weightUnitCode": "KGM",
			"weightUnitName": "千克",
			"volumeUnit": 2571526900585472,
			"volumeUnitCode": "MTQ",
			"volumeUnitName": "立方米",
			"unitUseType": 2,
			"enableAssistUnit": false,
			"registrationManager": false,
			"authorizationManager": false,
			"planClass": 2570383093256707,
			"planClassCode": "wxt0009",
			"planClassName": "计划分类9",
			"transType": "2538775354987782",
			"transTypeName": "通用物料",
			"productFamily": 0,
			"salesAndOperations": 0,
			"optionalMaterial": 0,
			"derivedMaterial": 0
		},
		"code": "1530996515090202632",
		"bizOperator": "40624485557105664",
		"effectType": "1",
		"effectStatus": "0",
		"id": 1530996515090202600
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

