---
title: "工艺路线详情查询"
apiId: "2c55ce83c72240dfbb6c4d69b8c23ebe"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Routing"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Routing]
platform_version: "BIP"
source_type: community-api-docs
---

# 工艺路线详情查询

> `ContentType` 请求方式	GET | 分类: Routing (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/mfg/routing/detail

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
| id | long | query | 是 | 工艺路线id    示例: 2304039509594368 |

## 3. 请求示例

Url: /yonbip/mfg/routing/detail?access_token=访问令牌&id=2304039509594368

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 接口返回状态 示例：200 |
| message | string | 否 | 接口返回信息 示例：操作成功 |
| data | object | 否 | 接口返回数据 |
| returncount | long | 否 | 退回次数 示例：0 |
| produceBatch | double | 否 | 批量 示例：1 |
| changeRate | double | 否 | 换算率 示例：1 |
| changeRateNum | number |
| 小数位数:8,最大长度:28 | 否 | 换算率分子 |
| changeRateDen | number |
| 小数位数:8,最大长度:28 | 否 | 换算率分母 |
| batch | long | 否 | 主批量 示例：1 |
| orgIdName | string | 否 | 组织名称 示例：L工厂1 |
| verifystate | long | 否 | 审批状态：0-开立，1-审批中，2-审核 示例：2 |
| code | string | 否 | 工艺路线编码 示例：123456 |
| manufacturingSpecification | string | 否 | 物料规格 示例：qi-颜色:蓝;qi-形状:角 |
| masterOrgKeyField | string | 否 | 主组织字段 示例：orgId |
| materialId_productId_code | string | 否 | 物料编码 示例：-001000004 |
| routeTemplateId_name | string | 否 | 模板 示例：yyyyy |
| sumProcessTs | double | 否 | 变动提前期 示例：0 |
| orgId | string | 否 | 组织id 示例：1866605942198528 |
| routingOperation | object | 是 | 工序 |
| rollup | long | 否 | 卷积成本:1-是,0-否 示例：0 |
| operationSequence | object | 是 | 工序序列 |
| expiryDate | string | 否 | 失效时间 示例：2099-12-31 23:59:59 |
| vouchdate | string | 否 | 单据日期 示例：2021-07-15 00:00:00 |
| routingType | long | 否 | 路线类别::1-基本路线,2-替代路线 示例：1 |
| materialId_productId_modelDescription | string | 否 | 规格说明 示例：物料 |
| routeTemplateId | long | 否 | 工艺路线模板ID 示例：2186338494992640 |
| sumPrepareTs | double | 否 | 固定提前期 示例：0 |
| id | long | 否 | 工艺路线id 示例：2345188556574976 |
| pubts | string | 否 | 时间戳 示例：2021-07-15 16:51:39 |
| materialId_productId_unit_precision | long | 否 | 主计量精度 示例：6 |
| timeUnit | long | 否 | 时间单位:0-天,1-小时,2-分,3-秒 示例：1 |
| auditDate | string | 否 | 审核日期 示例：2021-07-15 16:51:39 |
| creator | string | 否 | 创建人 示例：15810437080 |
| productId | long | 否 | 物料ID 示例：1870906703679744 |
| isWfControlled | boolean | 否 | 是否审批流控制:true-是,false-否 示例：true |
| produceUnit | long | 否 | 计量单位id 示例：21313 |
| produceUnitName | string | 否 | 计量单位 示例：克 |
| productUnit | long | 否 | 主计量单位id 示例：1870892969840896 |
| auditor | string | 否 | 审核人 示例：15810437080 |
| orgIdCode | string | 否 | 组织编码 示例：LGC1 |
| materialId | long | 否 | 制造物料ID 示例：1870906713231616 |
| engineeringDrawNumber | string | 否 | 工程图号 示例：企业 |
| version | string | 否 | 版本 示例：12 |
| createTime | string | 否 | 创建时间 示例：2021-07-15 16:49:10 |
| auditTime | string | 否 | 审核时间 示例：2021-07-15 16:51:39 |
| name | string | 否 | 工艺路线名称 示例：qwert |
| effectiveDate | string | 否 | 生效日期 示例：2021-03-30 16:39:10 |
| status | long | 否 | 单据状态:0-开立,1-已审核,3-审核中 示例：1 |
| productCode | string | 否 | 物料编码 |
| productName | string | 否 | 物料名称 |
| produceUnitPrecision | int | 否 | 计量单位精度 |
| memo | string | 否 | 备注 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"returncount": 0,
		"produceBatch": 1,
		"changeRate": 1,
		"changeRateNum": 0,
		"changeRateDen": 0,
		"batch": 1,
		"orgIdName": "L工厂1",
		"verifystate": 2,
		"code": "123456",
		"manufacturingSpecification": "qi-颜色:蓝;qi-形状:角",
		"masterOrgKeyField": "orgId",
		"materialId_productId_code": "-001000004",
		"routeTemplateId_name": "yyyyy",
		"sumProcessTs": 0,
		"orgId": "1866605942198528",
		"routingOperation": [
			{
				"operationId_routeDesc": "1111",
				"qualityWay": 0,
				"vendorId": 12313213156767,
				"vendorId_name": "规格",
				"isFromIndustryProcessLib": 0,
				"produceUnit": 12313213245467,
				"produceUnitName": "个",
				"changeRate": 1,
				"isSkipSequence": 1,
				"advanceTime": 0,
				"overlappingCount": 0,
				"timeUnit": 0,
				"overlappingTime": 0,
				"operationcontrolcodeId": 123213,
				"operationControlCodeIdName": "xxxx",
				"routingId": 2345188556574976,
				"operationId_code": "HJ",
				"workCenterId_name": "55",
				"isMonitorPoint": 0,
				"operationId_name": "焊接",
				"isOutsource": 0,
				"routingOperationComponent": [
					{
						"manufacturingSpecification": "qi-颜色:白;qi-形状:角",
						"materialId_productId_name": "企业物料",
						"numeratorQuantity": 1,
						"materialId_productId_unit": 1870892969840896,
						"materialId_productId_code": "-001000004",
						"routingOperationId": 2316741079208705,
						"materialId": 1870906714935552,
						"engineeringDrawNumber": "企业",
						"routingOperationId_operationId_name": "分拣",
						"materialId_productId_modelDescription": "物料",
						"materialId_productId_unit_name": "舍位 6",
						"routingOperationId_operationId_code": "031901",
						"id": 9,
						"pubts": "2021-06-29 20:34:27",
						"materialId_productId_unit_precision": 6,
						"denominatorQuantity": 1
					}
				],
				"routingOperationByproduct": {
					"materialId": 245532522,
					"produceNumeratorQuantity": 1,
					"id": "1231314",
					"routingOperationId_operationId_code": "0008",
					"bomUnit_precision": 0,
					"bomUnit_name": "个",
					"produceUnit_precision": 0,
					"denominatorQuantity": "1",
					"pubts": "2021-06-29 20:34:27",
					"bomUnit": 1232131,
					"routingOperationId_operationId_name": "0028",
					"routingOperationId": 131545552,
					"materialId_productId_code": "0009",
					"numeratorQuantity": 1,
					"materialId_productId_name": "键盘",
					"bomByproductId": 12321314,
					"produceUnit_name": "台",
					"manufacturingSpecification": "阿萨法",
					"produceUnit": 12321321321
				},
				"routingOperationDrawing": [
					{
						"routingOperationId_operationId_name": "焊接",
						"code": "1",
						"name": "1",
						"routingOperationId": 2345188556591360,
						"routingOperationId_operationId_code": "HJ",
						"id": 2345188556591361,
						"pubts": "2021-07-15 16:49:11",
						"fileId": "105b14f0-e549-11eb-b198-336401b5374f"
					}
				],
				"workCenterId_code": "55",
				"changeRateDen": 0,
				"changeRateNum": 0,
				"processTime": 20,
				"scheduleNo": "1",
				"prepareTime": 10,
				"workCenterId": 2169311033397504,
				"overlappingType": 1,
				"operationId": 2162514778706176,
				"processTransferMode": 0,
				"routingOperationActivityType": [
					{
						"workload": 1,
						"memo": "123",
						"routingOperationId": 2345188556591360,
						"isCalcCost": 0,
						"rollup": 0,
						"routingOperationId_operationId_name": "焊接",
						"expiryDate": "2099-12-31 23:59:59",
						"calcType": 1,
						"routingOperationId_operationId_code": "HJ",
						"id": 2345188556591362,
						"pubts": "2021-07-15 16:49:11",
						"simulate": 0,
						"effectiveDate": "2021-03-30 16:39:12",
						"denominatorQuantity": 1,
						"activityTypeId": 2345188556535356,
						"activityTypeId_name": "A类别",
						"activityTypeId_code": "ASD",
						"activityTypeIdActivityClass": 0,
						"activityTypeId_unit_name": "个",
						"quantity": 30,
						"quantityUnit": 2345188556535356,
						"quantityUnitName": "个",
						"quantityUnitPrecision": "2",
						"declareOpportunity": 0,
						"totalUsage": 30,
						"unit_name_precision": 0
					}
				],
				"id": 2345188556591360,
				"produceUnitPrecision": 0,
				"sn": 10,
				"pubts": "2021-07-15 16:49:11",
				"isReportPoint": 0,
				"operationSequenceId": 2486704649066774531,
				"operationSequenceType": 0,
				"operationSequenceNum": 0,
				"operationSequenceDesc": "Sequence Description"
			}
		],
		"rollup": 0,
		"operationSequence": [
			{
				"id": 2486704649066774531,
				"sequenceType": 0,
				"sequenceNum": 0,
				"srcOperationId": 2486704649066774538,
				"targetOperationId": 2486704649066774539,
				"description": "Sequence Description",
				"pubts": "2021-07-15 16:51:40",
				"routingId": 2345188556574976
			}
		],
		"expiryDate": "2099-12-31 23:59:59",
		"vouchdate": "2021-07-15 00:00:00",
		"routingType": 1,
		"materialId_productId_modelDescription": "物料",
		"routeTemplateId": 2186338494992640,
		"sumPrepareTs": 0,
		"id": 2345188556574976,
		"pubts": "2021-07-15 16:51:39",
		"materialId_productId_unit_precision": 6,
		"timeUnit": 1,
		"auditDate": "2021-07-15 16:51:39",
		"creator": "15810437080",
		"productId": 1870906703679744,
		"isWfControlled": true,
		"produceUnit": 21313,
		"produceUnitName": "克",
		"productUnit": 1870892969840896,
		"auditor": "15810437080",
		"orgIdCode": "LGC1",
		"materialId": 1870906713231616,
		"engineeringDrawNumber": "企业",
		"version": "12",
		"createTime": "2021-07-15 16:49:10",
		"auditTime": "2021-07-15 16:51:39",
		"name": "qwert",
		"effectiveDate": "2021-03-30 16:39:10",
		"status": 1,
		"productCode": "",
		"productName": "",
		"produceUnitPrecision": 0,
		"memo": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-17

更新

请求说明

新增

返回参数 (18)

更新

返回参数 (21)

2	2026-03-13

更新

请求说明

新增

返回参数 (4)

更新

返回参数 (21)

3	2025-09-05

更新

返回参数 (9)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

