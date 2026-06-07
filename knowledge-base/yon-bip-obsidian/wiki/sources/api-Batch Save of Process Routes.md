---
title: "工艺路线批量保存"
apiId: "2515014522256228361"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Routing"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Routing]
platform_version: "BIP"
source_type: community-api-docs
---

# 工艺路线批量保存

> `ContentType	application/json` 请求方式	POST | 分类: Routing (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/PFC/MD/ED/engineeringdata.ed_routing/routing/batchsave

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
| id | string | 否 | 否 | 主键， 新增时无需填写，修改时必填 |
| orgId | string | 否 | 否 | 组织id,组织id和组织编码不能同时为空，id和编码同时存在，以id为准 示例：1293256121766144 |
| orgCode | string | 否 | 否 | 组织编码 |
| code | string | 否 | 是 | 编码 示例：666 |
| name | string | 否 | 是 | 名称 示例：777 |
| productId | long | 否 | 否 | 物料id，物料ID和物料编码，不可同时为空。 示例：1417595602866432 |
| productCode | string | 否 | 否 | 物料编码，物料ID和物料编码，不可同时为空。 示例：HE410C202 |
| skuId | long | 否 | 否 | SKUId，制造物料，物料，SKU不能同时为空，优先级：skuId>skuCode>materialId>productId>materialCode>productCode 示例：0 |
| skuCode | string | 否 | 否 | SKU编码，制造物料，物料，SKU不能同时为空，优先级：skuId>skuCode>materialId>productId>materialCode>productCode |
| produceBatch | string | 否 | 否 | 批量,当批量为空时,批量=主批量/换算率,当主批量和批量都为空时,默认批量为1,当"主批量"与"批量"都录入时,根据批量=主批量/换算率进行校验 示例：1 |
| produceUnit | long | 否 | 否 | 计量单位id,produceUnitCode和produceUnit同时填写以produceUnit为准。produceUnitCode和produceUnit同时为空时，默认取物料.生产单位 |
| produceUnitCode | string | 否 | 否 | 计量单位编码,produceUnitCode和produceUnit同时填写以produceUnit为准进行查询计量单位。produceUnitCode和produceUnit同时为空时，默认取物料.生产单位 |
| batch | string | 否 | 否 | 主批量,当主批量为空时,主批量=批量*换算率;当主批量和批量都为空时,默认批量为1,再根据公式算出主批量(当为固定批量时,主批量的值只能是1或者固定批量值);当"主批量"与"批量"都录入时,根据批量*换算率=主批量进行校验 示例：1 |
| routingType | string | 否 | 否 | 路线类别::1-基本路线,2-替代路线,默认值1 示例：1 |
| substituteDescription | string | 否 | 否 | 替代标识，路线类别为替代路线时，必填。路线类别为基本路线时，不输入 |
| version | string | 否 | 是 | 版本,在参数配置里配置格式 示例：1.00 |
| effectiveDate | string | 否 | 否 | 生效时间，格式“2021-05-06 15:08:00”,默认当前时间 示例：2021-07-08 14:31:44 |
| expiryDate | string | 否 | 否 | 失效时间，格式“2021-05-06 15:08:00”,默认2099-12-31 23:59:59 示例：2099-12-31 23:59:59 |
| timeUnit | long | 否 | 否 | 时间单位:0-天,1-小时,2-分,3-秒,默认为1 示例：1 |
| memo | string | 否 | 否 | 备注 示例：123 |
| bomBatchForImport | string | 否 | 否 | BOM批量，传入工序投料和工序联副产出时该字段必填，取用于进行物料分配的BOM的批量，系统根据批量值查找对应BOM。注意，需要先传入对应的物料清单，否则无法传入工序投料和工序联副产出。 示例：1 |
| bomTypeForImport | string | 否 | 否 | BOM类型，1：主BOM,2:替代BOM。传入工序投料和工序联副产出时该字段必填，取用于进行物料分配的BOM的类型，系统根据类型值查找对应BOM。注意，需要先传入对应的物料清单，否则无法传入工序投料和工序联副产出。 示例：1 |
| bomUseTypeForImport | string | 否 | 否 | BOM用途编码，传入工序投料和工序联副产出时该字段必填，取用于进行物料分配的BOM的用途编码，系统根据用途查找对应BOM。注意，需要先传入对应的物料清单，否则无法传入工序投料和工序联副产出。 示例：0 |
| bomVersionForImport | string | 否 | 否 | BOM版本号，传入工序投料和工序联副产出时该字段必填，取用于进行物料分配的BOM版本号，系统根据版本号查找对应BOM。注意，需要先传入对应的物料清单，否则无法传入工序投料和工序联副产出。 示例：1.00 |
| _status | string | 否 | 否 | 状态：插入：Insert，更新：Update。为空时，按 Insert处理 示例：Insert |
| routingOperation | object | 是 | 否 | 工序 |
| operationSequence | object | 是 | 否 | 工序序列 |
| wbs | string | 否 | 否 | wbsId |
| wbsCode | string | 否 | 否 | wbs编码，wbs和wbsCode同时填写以wbs为准进行查询wbs档案。 示例：00000010 |
| rollup | string | 否 | 否 | 默认卷积，枚举值，0：否，1：是。为空时，默认值为0。 示例：0 |

## 3. 请求示例

Url: /yonbip/PFC/MD/ED/engineeringdata.ed_routing/routing/batchsave?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"id": "",
			"orgId": "1293256121766144",
			"orgCode": "",
			"code": "666",
			"name": "777",
			"productId": 1417595602866432,
			"productCode": "HE410C202",
			"skuId": 0,
			"skuCode": "",
			"produceBatch": "1",
			"produceUnit": 0,
			"produceUnitCode": "",
			"batch": "1",
			"routingType": "1",
			"substituteDescription": "",
			"version": "1.00",
			"effectiveDate": "2021-07-08 14:31:44",
			"expiryDate": "2099-12-31 23:59:59",
			"timeUnit": 1,
			"memo": "123",
			"bomBatchForImport": "1",
			"bomTypeForImport": "1",
			"bomUseTypeForImport": "0",
			"bomVersionForImport": "1.00",
			"_status": "Insert",
			"routingOperation": [
				{
					"id": "",
					"qualityWay": 0,
					"changeRate": "",
					"controlId": "",
					"controlCode": "",
					"vendorId": 2056081713877248,
					"vendorCode": "xxx",
					"produceUnit": 0,
					"sn": 10,
					"isOutsource": "0",
					"timeUnit": 1,
					"prepareTime": 1,
					"isSkipSequence": "1",
					"processTime": 1,
					"isReportPoint": 0,
					"processTransferMode": "0",
					"advanceTime": "0",
					"operationId": 2167916690559232,
					"operationCode": "3",
					"scheduleNo": "11",
					"workCenterId": 2187992543072512,
					"_status": "",
					"workCenterCode": "ddas",
					"routingOperationDrawing": [
						{
							"attachmentId": "a17eaed0-f1db-48e9-9bec-4734c25ed907",
							"fileId": "9f0e5542-c734-4263-b79a-73b1f9f06d01",
							"code": "1",
							"name": "1",
							"_status": ""
						}
					],
					"routingOperationActivityType": [
						{
							"_status": "Insert",
							"activityTypeId": 2179201070190848,
							"activityTypeCode": "12321321",
							"denominatorQuantity": "1",
							"isCalcCost": "1",
							"workload": 1,
							"simulate": "1",
							"calcType": "1",
							"declareOpportunity": "1",
							"quantity": "30",
							"quantityUnit": "",
							"quantityUnitCode": "",
							"memo": "",
							"rollup": "1",
							"effectiveDate": "2021-07-08 14:31:56",
							"expiryDate": "2099-12-31 23:59:59",
							"activityTypeIdActivityClass": "0"
						}
					],
					"produceUnitCode": "",
					"routingOperationComponent": [
						{
							"bomComponentId_lineNo": "10",
							"productCode": "MAT001"
						}
					],
					"routingOperationByproduct": [
						{
							"productCode": "Pro001"
						}
					],
					"operationSequenceId": 2486704649066774531,
					"sequenceNum": 0
				}
			],
			"operationSequence": [
				{
					"id": "2486704649066774531",
					"sequenceType": 0,
					"sequenceNum": 0,
					"srcOperationId": 2486704649066774538,
					"srcSn": 10,
					"targetOperationId": 2486704649066774539,
					"targetSn": 50,
					"description": "Sequence Description",
					"_status": "Insert"
				}
			],
			"wbs": "",
			"wbsCode": "00000010",
			"rollup": "0"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 接口返回状态 示例：200 |
| message | string | 否 | 接口返回信息 示例：操作成功 |
| data | object | 否 | 接口返回数据 |
| sucessCount | long | 否 | 成功数量 示例：1 |
| failCount | long | 否 | 失败数量 示例：0 |
| count | long | 否 | 总数量 示例：1 |
| messages | string | 是 | 错误信息 |
| infos | object | 是 | 成功信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"sucessCount": 1,
		"failCount": 0,
		"count": 1,
		"messages": [
			""
		],
		"infos": [
			{
				"code": 200,
				"data": {
					"code": "idi",
					"productId": 1870906703679744,
					"isWfControlled": true,
					"produceBatch": "1",
					"produceUnitName": "个",
					"produceUnit": 2313465644646,
					"batch": 1,
					"productCode": "-001000004",
					"sumProcessTs": 40,
					"materialId": 1870906713231616,
					"version": "12",
					"orgId": "1866605942198528",
					"routingOperation": [
						{
							"operationcontrolcodeId": 18666059421985767,
							"produceUnit": 123124534564346,
							"changeRate": "1",
							"overlappingCount": 1,
							"qualityWay": "1",
							"isSkipSequence": 1,
							"overlappingTime": 1,
							"advanceTime": 1,
							"isOutsource": 0,
							"routingOperationDrawing": [
								{
									"code": "1",
									"name": "1",
									"fileId": "105b14f0-e549-11eb-b198-336401b5374f",
									"id": 2352233809629442,
									"routingOperationId": 2352233809629441,
									"pubts": "2022-12-30 12:12:12",
									"tenant": 1861077976273152,
									"yTenantId": "tl27pqwt"
								}
							],
							"processTime": 20,
							"scheduleNo": "12",
							"prepareTime": 10,
							"workCenterId": 2169311033397504,
							"overlappingType": 1,
							"vendorId": "1231",
							"operationId": 2162514778706176,
							"processTransferMode": 0,
							"routingOperationActivityType": [
								{
									"expiryDate": "2022-12-23 12:12:12",
									"calcType": 1,
									"workload": 1,
									"memo": "123",
									"isCalcCost": 0,
									"simulate": 0,
									"effectiveDate": "2022-12-23 12:12:12",
									"rollup": 0,
									"denominatorQuantity": 2,
									"activityTypeId": 2165248103748096,
									"id": 2352233809629443,
									"routingOperationId": 2352233809629441,
									"quantity": "30",
									"quantityUnit": "2352233809629446",
									"totalUsage": "300",
									"declareOpportunity": "2",
									"pubts": "2022-12-23 12:12:12",
									"tenant": 1861077976273152,
									"yTenantId": "tl27pqwt",
									"quantityUnitName": "",
									"quantityUnitPrecision": 0,
									"routingOperationId_operationId_code": "",
									"routingOperationId_operationId_name": ""
								}
							],
							"sn": 10,
							"orgId": "1866605942198528",
							"operationId_code": "HJ",
							"operationId_name": "焊接",
							"operationId_routeDesc": "",
							"isMonitorPoint": 0,
							"changeRateNum": 0,
							"changeRateDen": 0,
							"isReportPoint": 0,
							"timeUnit": 1,
							"id": 2352233809629441,
							"routingId": 2352233809629440,
							"pubts": "2022-12-23 12:12:12",
							"tenant": 1861077976273152,
							"yTenantId": "tl27pqwt",
							"operationSequenceId": 2486704649066774531
						}
					],
					"rollup": 0,
					"expiryDate": "2022-12-23 12:00:00",
					"isFromIndustryProcessLib": 0,
					"routingType": 1,
					"name": "2342",
					"sumPrepareTs": 20,
					"effectiveDate": "2022-12-12 12:12:12",
					"timeUnit": 1,
					"skuId": "1870906703679745",
					"vouchdate": "2022-12-12 12:12:12",
					"id": 2352233809629440,
					"creator": "YonSuite默认用户",
					"creatorId": 1861077977714944,
					"createTime": "2022-12-23 12:12:12",
					"createDate": "2022-12-23 12:12:12",
					"status": 0,
					"pubts": "2022-12-23 12:12:12",
					"tenant": 1861077976273152,
					"yTenantId": "tl27pqwt",
					"batchRule": "",
					"changeRate": 0,
					"memo": "",
					"produceUnitPrecision": 0,
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
					]
				},
				"rowNum": 1,
				"message": "操作成功"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码


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

