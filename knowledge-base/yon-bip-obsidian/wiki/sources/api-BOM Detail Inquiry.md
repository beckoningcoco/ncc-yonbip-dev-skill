---
title: "物料清单详情查询"
apiId: "5c7de5a8cc594befb629888244479916"
apiPath: "请求方式	GET"
method: "ContentType"
category: "BOM Maintenance"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, BOM Maintenance]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料清单详情查询

> `ContentType` 请求方式	GET | 分类: BOM Maintenance (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/mfg/bom/detail

请求方式	GET

ContentType

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | long | query | 是 | 业务数据ID    示例: 2304039509594368 |

## 3. 请求示例

Url: /yonbip/mfg/bom/detail?access_token=访问令牌&id=2304039509594368

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 接口返回信息 示例：操作成功 |
| data | object | 否 | 接口返回数据 |
| id | long | 否 | 母件Id 示例：2176737405948160 |
| code | string | 否 | bom编码 示例：8001000048 |
| verifystate | long | 否 | 审批状态：0-开立，1-已提交，2-已审批，-1驳回 示例：0 |
| returncount | long | 否 | 回退次数 示例：0 |
| productUnitPrecision | long | 否 | 母件主计量精度 示例：0 |
| isWholeSend | long | 否 | 整单齐套发料；{"0":"否","1":"是"} 示例：0 |
| useTypeId | long | 否 | 用途Id 示例：1515194093452657000 |
| useType | string | 否 | 用途编码 示例：0 |
| useTypeName | string | 否 | 用途名称 示例：自制 |
| orgId | string | 否 | 组织id 示例：1866605942198528 |
| orgCode | string | 否 | 组织编码 示例：LGC1 |
| orgName | string | 否 | 组织 示例：L工厂1 |
| subcontractVendorId | string | 否 | 委外商Id 示例：1866605942198528 |
| subcontractVendorIdCode | string | 否 | 委外商Code 示例：LGC |
| subcontractVendorIdName | string | 否 | 委外商 示例：委外商 |
| bomUnit | long | 否 | 母件主计量单位id 示例：2018216172851456 |
| bomUnitName | string | 否 | 主计量单位 示例：盒 |
| effectiveDate | string | 否 | 母件生效时间 示例：2021-03-04 00:00:00 |
| expiryDate | string | 否 | 母件失效时间 示例：2099-12-31 23:59:59 |
| vouchdate | string | 否 | 单据日期 示例：2021-03-18 00:00:00 |
| scrap | long | 否 | 废品率(%) 示例：0 |
| pubts | string | 否 | 时间戳 示例：2021-03-18 16:51:48 |
| productId | long | 否 | 物料id 示例：2105995653599488 |
| materialCode | string | 否 | 母件编码 示例：8001000048 |
| materialId | long | 否 | 制造物料id 示例：2105995674915072 |
| materialName | string | 否 | 母件名称 示例：浮动换算率 |
| manufacturingSpecification | string | 否 | 物料规格 |
| modelDescription | string | 否 | 规格说明 |
| model | string | 否 | 型号 |
| engineeringDrawNumber | string | 否 | 工程图号 |
| bomType | long | 否 | BOM类别；{"1":"主BOM","2":"替代BOM"} 示例：1 |
| substituteFlag | string | 否 | 替代标识 |
| versionCode | string | 否 | 版本号 示例：A1 |
| creator | string | 否 | 创建人 示例：15810437080 |
| createTime | string | 否 | 创建时间 示例：2021-03-18 16:51:47 |
| status | long | 否 | 状态；{"0":"开立","1":"审核"} 示例：0 |
| rollup | short | 否 | 默认卷积 示例：1 |
| lineNo | long | 否 | 行号 示例：10 |
| produceUnitid | long | 否 | 生产单位id 示例：1 |
| produceUnitName | string | 否 | 计量单位 示例：千克 |
| produceUnitPrecision | long | 否 | 计量单位精度 示例：1 |
| assistTruncationType | string | 否 | 计量单位舍位方式 示例：1 |
| changeRate | Decimal | 否 | 换算率 |
| changeRateNum | number |
| 小数位数:8,最大长度:28 | 否 | 换算率分子 |
| changeRateDen | number |
| 小数位数:8,最大长度:28 | 否 | 换算率分母 |
| changeType | string | 否 | 换算方式 示例：1 |
| produceBatch | Decimal | 否 | 批量 |
| truncationType | string | 否 | 主单位舍位方式 示例：1 |
| remark | string | 否 | 备注 |
| fromQuantity | double | 否 | 从数量 示例：0 |
| toQuantity | double | 否 | 到数量 |
| quantityControl | int | 否 | 数量控制，0：否，1：是 示例：0 |
| bomComponent | object | 是 | 材料信息 |
| bomByproduct | object | 是 | 产出品信息 |
| adminOrgName | string | 否 | 管理组织 |
| adminOrgCode | string | 否 | 管理组织编码 |
| adminOrgId | string | 否 | 管理组织ID |
| isWholeReport | int | 否 | 齐套分析,0：否，1：是 |
| productCode | string | 否 | 母件编码 |
| isOptionalMaterial | int | 否 | 是否可选配，0：否，1：是 |
| productName | string | 否 | 母件名称 |
| batch | int | 否 | 主批量 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": 2176737405948160,
		"code": "8001000048",
		"verifystate": 0,
		"returncount": 0,
		"productUnitPrecision": 0,
		"isWholeSend": 0,
		"useTypeId": 1515194093452657000,
		"useType": "0",
		"useTypeName": "自制",
		"orgId": "1866605942198528",
		"orgCode": "LGC1",
		"orgName": "L工厂1",
		"subcontractVendorId": "1866605942198528",
		"subcontractVendorIdCode": "LGC",
		"subcontractVendorIdName": "委外商",
		"bomUnit": 2018216172851456,
		"bomUnitName": "盒",
		"effectiveDate": "2021-03-04 00:00:00",
		"expiryDate": "2099-12-31 23:59:59",
		"vouchdate": "2021-03-18 00:00:00",
		"scrap": 0,
		"pubts": "2021-03-18 16:51:48",
		"productId": 2105995653599488,
		"materialCode": "8001000048",
		"materialId": 2105995674915072,
		"materialName": "浮动换算率",
		"manufacturingSpecification": "",
		"modelDescription": "",
		"model": "",
		"engineeringDrawNumber": "",
		"bomType": 1,
		"substituteFlag": "",
		"versionCode": "A1",
		"creator": "15810437080",
		"createTime": "2021-03-18 16:51:47",
		"status": 0,
		"rollup": 1,
		"lineNo": 10,
		"produceUnitid": 1,
		"produceUnitName": "千克",
		"produceUnitPrecision": 1,
		"assistTruncationType": "1",
		"changeRate": 0,
		"changeRateNum": 0,
		"changeRateDen": 0,
		"changeType": "1",
		"produceBatch": 0,
		"truncationType": "1",
		"remark": "",
		"fromQuantity": 0,
		"toQuantity": 0,
		"quantityControl": 0,
		"bomComponent": [
			{
				"id": 2176737405948161,
				"calcCostFlag": 1,
				"partakeSimulation": 1,
				"lineNo": 10,
				"bomId": 2176737405948160,
				"numeratorQuantity": 1,
				"denominatorQuantity": 3,
				"quantity": 0.33,
				"alternateType": 1,
				"productUnitPrecision": 2,
				"orgId": "1866605942198528",
				"orgCode": "LGC1",
				"orgName": "L工厂1",
				"effectiveDate": "2021-03-04 00:00:00",
				"expiryDate": "2099-12-31 23:59:59",
				"bomUnit": 1933103803044096,
				"bomUnitName": "部",
				"supplyType": 0,
				"truncUp": 0,
				"wholeFlag": 0,
				"usageType": 1,
				"entrustType": 0,
				"productId": 2104485518496000,
				"materialCode": "8003000036",
				"materialId": 2104485534044416,
				"materialName": "原材料-批次有效期管理",
				"manufacturingSpecification": "",
				"modelDescription": "",
				"model": "",
				"engineeringDrawNumber": "",
				"isVirtual": 0,
				"lossType": 0,
				"designator": "r1",
				"scrap": 0,
				"mustLossQuantity": 0,
				"stockOrgId": 0,
				"stockOrgCode": "",
				"stockOrgName": "",
				"warehouseId": 0,
				"warehouseName": "",
				"wholePoint": "",
				"advanceDays": 0,
				"remark": "",
				"stockUnit": 1,
				"stockUnitName": "千克",
				"stockUnitPrecision": 1,
				"changeRate": 0,
				"changeType": "1",
				"assistTruncationType": "1",
				"truncationType": "1",
				"costScrap": 0,
				"alternateDenominator": 1,
				"alternateRatio": 1,
				"componentType": 0,
				"excessSendConstant": 0,
				"excessSendFlag": 0,
				"excessSendScrap": 0,
				"excessTendType": 0,
				"keyMaterialGroup": 0,
				"mainMaterial": 1,
				"materialGroupNo": "",
				"sequence": 0,
				"standard": 1,
				"replaceType": 0,
				"pubts": "2021-03-18 16:51:48",
				"bomAlternate": [
					{
						"id": 2176737405948162,
						"bomComponentId": 2176737405948161,
						"mainMaterial": 1,
						"standard": 1,
						"orgId": "1866605942198528",
						"orgName": "L工厂1",
						"orgCode": "LGC1",
						"productId": 2104485518496000,
						"materialCode": "8003000036",
						"materialId": 2104485534044416,
						"materialName": "原材料-批次有效期管理",
						"manufacturingSpecification": "",
						"modelDescription": "",
						"model": "",
						"engineeringDrawNumber": "",
						"sequence": 1,
						"alternateRatio": 1,
						"alternateDenominator": 1,
						"productUnitPrecision": 2,
						"bomUnitName": "部",
						"bomUnit": 1933103803044096,
						"effectiveDate": "2021-03-04 00:00:00",
						"expiryDate": "2099-12-31 23:59:59",
						"stockUnit": 1,
						"stockUnitName": "箱",
						"stockUnitPrecision": 1,
						"assistTruncationType": "1",
						"changeRate": 0,
						"changeType": "1",
						"truncationType": "1",
						"pubts": "2021-03-18 16:51:48",
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
						"netDemandRatio": 0,
						"productCode": "",
						"productName": "",
						"changeRateNum": 0,
						"changeRateDen": 0,
						"ownerType": 2
					}
				],
				"vendorDropShipment": 0,
				"alternateplanName": "",
				"entrustSupplyType": 0,
				"ownerType": 2,
				"isRatioAlternate": 0,
				"lineType": 0,
				"netDemandRatio": 0,
				"productCode": "",
				"productName": "",
				"purchaseProportion": 0,
				"stockNumeratorQuantity": 0,
				"changeRateNum": 0,
				"changeRateDen": 0
			}
		],
		"bomByproduct": [
			{
				"id": 2176737405948164,
				"bomId": 2176737405948160,
				"quantity": 0,
				"productionType": 0,
				"productUnitPrecision": 0,
				"productId": 2105995653599488,
				"materialId": 2105995674915072,
				"productionMaterialCode": "8001000048",
				"materialName": "浮动换算率",
				"manufacturingSpecification": "",
				"modelDescription": "",
				"model": "",
				"engineeringDrawNumber": "",
				"costOutputProportion": 50,
				"numeratorQuantity": 1,
				"denominatorQuantity": 3,
				"bomUnit": 2018216172851456,
				"bomUnitName": "盒",
				"orgId": "1866605942198528",
				"orgName": "L工厂1",
				"orgCode": "LGC1",
				"remark": "",
				"produceNumeratorQuantity": 1,
				"produceUnit": 1,
				"produceUnitName": "千克",
				"produceUnitPrecision": 1,
				"assistTruncationType": "1",
				"changeRate": 0,
				"changeType": "1",
				"truncationType": "1",
				"pubts": "2021-03-18 16:51:48",
				"productName": "",
				"productCode": "",
				"changeRateNum": 0,
				"changeRateDen": 0
			}
		],
		"adminOrgName": "",
		"adminOrgCode": "",
		"adminOrgId": "",
		"isWholeReport": 0,
		"productCode": "",
		"isOptionalMaterial": 0,
		"productName": "",
		"batch": 0
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-13

更新

请求说明

新增

返回参数 (10)

更新

返回参数 (71)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

