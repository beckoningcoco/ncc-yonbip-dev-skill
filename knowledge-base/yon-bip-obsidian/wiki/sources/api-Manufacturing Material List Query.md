---
title: "制造物料列表查询"
apiId: "b0615cc7d3b9410e941721e8c96cdc5b"
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

# 制造物料列表查询

> `ContentType	application/json` 请求方式	POST | 分类: BOM Maintenance (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/mfg/material/list

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
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| pageIndex | int | 否 | 否 | 当前页，默认当前页为1 示例1 示例：1 默认值：1 |
| pageSize | int | 否 | 否 | 每页数目，默认每页10条数据，示例10 示例：10 默认值：10 |
| productCode | string | 否 | 否 | 编码 示例：LC1 |
| productName | string | 否 | 否 | 名称 示例：L材料1 |
| modelDescription | string | 否 | 否 | 规格说明 示例：20*20 |
| productModel | string | 否 | 否 | 型号 示例：L1 |
| mnemonicCode | string | 否 | 否 | 助记码 示例：LCL1 |
| skuCode | string | 否 | 否 | SKU编码 示例：LC1 |
| skuName | string | 否 | 否 | SKU名称 示例：L材料1 |
| simple | object | 否 | 否 | 扩展查询条件 |
| id | long | 是 | 否 | 制造物料Id 示例：[1866605942198521] |
| productId.productApplyRange.orgId | long | 否 | 否 | 适用组织id 示例：1866605942198528 |
| productId | long | 是 | 否 | 物料Id 示例：[1869775818379520] |
| materialAssociation.productSKUId | long | 是 | 否 | 物料SKUId 示例：[1869775821852928] |

## 3. 请求示例

Url: /yonbip/mfg/material/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"productCode": "LC1",
	"productName": "L材料1",
	"modelDescription": "20*20",
	"productModel": "L1",
	"mnemonicCode": "LCL1",
	"skuCode": "LC1",
	"skuName": "L材料1",
	"simple": {
		"id": [
			1866605942198521
		],
		"productId.productApplyRange.orgId": 1866605942198528,
		"productId": [
			1869775818379520
		],
		"materialAssociation.productSKUId": [
			1869775821852928
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 接口返回信息 示例：操作成功 |
| data | object | 否 | 接口返回数据 |
| pageIndex | long | 否 | 当前页数 示例：1 |
| pageSize | long | 否 | 每页条数 示例：10 |
| recordCount | long | 否 | 总条数 示例：1 |
| recordList | object | 是 | 数据集合 |
| pageCount | long | 否 | 总页数 示例：1 |
| beginPageIndex | long | 否 | 分页查询起始数 示例：1 |
| endPageIndex | long | 否 | 分页查询结束数 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 1,
		"recordList": [
			{
				"detailIdPurchasePriceUnitName": "件",
				"detailSupplyType": 0,
				"productUnitPrecision": 3,
				"productUnit": 1869676091724032,
				"isReservation": false,
				"productName": "L材料1",
				"purchaseTruncationType": 4,
				"detailIdPpurchaseUnitId": 1869676091724032,
				"isExpiryDateManage": false,
				"truncationType": 4,
				"id": 1869775823737088,
				"isCreator": true,
				"productOrgIdName": "L工厂1",
				"skuId": 1869775821852928,
				"fixedQuantity": 20,
				"productId": 1869775818379520,
				"stockTruncationType": 4,
				"detailProduceUnitName": "件",
				"skuCode": "LC1",
				"detailIdPurchasePriceUnitId": 1869676091724032,
				"productId_manageClass": 1869769253720320,
				"detailProduceUnit": 1869676091724032,
				"skuName": "L材料1",
				"productApplyRangeId": 1869775819280640,
				"manageClassName": "33",
				"define_id": 1869775818395904,
				"isBatchManage": false,
				"produceTruncationType": 4,
				"supplyType": 0,
				"planDefaultAttribute": 3,
				"isApplied": true,
				"detailMnemonicCode": "LCL1",
				"purchasePrecision": 3,
				"detailStockUnit": 1869676091724032,
				"detailIdPpurchaseUnitName": "件",
				"detailPlanMethod": 0,
				"detailStockUnitName": "件",
				"productOrgId": "1866605942198528",
				"detailShortName": "L材料1",
				"detailBusinessAttribute": "1,7,3",
				"lossType": 0,
				"batchRule": 10,
				"detailStockUnitPrecision": 3,
				"productCode": "LC1",
				"productUnitName": "件",
				"detailProduceUnitPrecision": 3,
				"productRealProductAttribute": 1,
				"virtualPart": false,
				"productModelDescription": "",
				"model": ""
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

999	参数数据错误	输入合适的查询参数


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

