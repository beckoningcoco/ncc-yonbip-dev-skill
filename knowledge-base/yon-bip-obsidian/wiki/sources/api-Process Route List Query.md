---
title: "工艺路线列表查询"
apiId: "44bcb2cffca442aa842c3a4352e8ba08"
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

# 工艺路线列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Routing (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/mfg/routing/list

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	列表查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | int | 否 | 是 | 当前页，默认当前页为1 示例：1 默认值：1 |
| pageSize | int | 否 | 是 | 每页数目，默认每页10条数据 示例：10 默认值：10 |
| code | string | 否 | 否 | 编码 示例：0628 |
| name | string | 否 | 否 | 名称 示例：0628工艺路线 |
| orgId | string | 否 | 否 | 组织id 示例：1696518894981376 |
| orgCode | string | 否 | 否 | 组织编码 示例：00001 |
| status | string | 否 | 否 | 单据状态，0：开立，1：已审核 |
| productId | string | 否 | 否 | 物料ID 示例：1838117076450410504 |
| productCodes | string | 是 | 否 | 表头物料编码集合，不要与productId同时传，同时传时以productId为准 示例：["0001","0002"] 最大请求量：50 |
| materialId | string | 否 | 否 | 制造物料id 示例：1719732013814016 |
| auditTimeStart | DateTime | 否 | 否 | 审核时间开始 |
| auditTimeEnd | DateTime | 否 | 否 | 审核时间结束 |
| startTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 创建时间开始 示例：2024-01-18 16:23:00 |
| endTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 创建时间结束 示例：2024-01-18 16:23:00 |
| modifiedTimeStart | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 修改时间开始 示例：2024-01-18 16:23:00 |
| modifiedTimeEnd | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 修改时间结束 示例：2024-01-18 23:23:00 |
| versionScope | int | 否 | 否 | 版本范围：1-最新版本，2-全部版本，3-全部版本（含修订历史） 示例：1 |
| isSum | boolean | 否 | 否 | 默认false 查表头+表体，为true时只查表头 示例：false 默认值：false |
| pubts | string | 否 | 否 | 时间戳 示例：2024-05-06 23:10:00|2024-05-08 12:09:00 |
| simpleVOs | object | 是 | 否 | 扩展查询条件 |
| field | string | 否 | 否 | 属性名(条件) |
| op | string | 否 | 否 | 逻辑连接符(and：且；or：或) 注：logicOp有值时，conditions条件生效，logicOp同级的其他条件不生效；logicOp无值时，conditions条件不生效，logicOp同级设置的其他条件生效。 示例：or |
| value1 | string | 否 | 否 | 查询条件值1。示例：2021-01-01 00:00:00 (field值为pubts，op值为egt或gt或el或lt) |
| value2 | string | 否 | 否 | 查询条件值2 |
| logicOp | string | 否 | 否 | 逻辑连接符(and：且；or：或) 注：logicOp有值时，conditions条件生效，logicOp同级的其他条件不生效；logicOp无值时，conditions条件不生效，logicOp同级设置的其他条件生效。 示例：or 示例：and |
| conditions | object | 是 | 否 | 下级查询条件 |

## 3. 请求示例

Url: /yonbip/mfg/routing/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"code": "0628",
	"name": "0628工艺路线",
	"orgId": "1696518894981376",
	"orgCode": "00001",
	"status": "",
	"productId": "1838117076450410504",
	"productCodes": [
		"0001",
		"0002"
	],
	"materialId": "1719732013814016",
	"auditTimeStart": "",
	"auditTimeEnd": "",
	"startTime": "2024-01-18 16:23:00",
	"endTime": "2024-01-18 16:23:00",
	"modifiedTimeStart": "2024-01-18 16:23:00",
	"modifiedTimeEnd": "2024-01-18 23:23:00",
	"versionScope": 1,
	"isSum": false,
	"pubts": "2024-05-06 23:10:00|2024-05-08 12:09:00",
	"simpleVOs": [
		{
			"field": "",
			"op": "",
			"value1": "",
			"value2": "",
			"logicOp": "and",
			"conditions": [
				{
					"field": "",
					"op": "",
					"value1": "",
					"value2": ""
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 接口返回状态 示例：200 |
| message | string | 否 | 接口返回信息 示例：操作成功 |
| data | object | 否 | 接口返回数据 |
| pageIndex | long | 否 | 当前页数 示例：1 |
| pageSize | long | 否 | 每页数量 示例：10 |
| recordCount | long | 否 | 总条数 示例：83 |
| recordList | object | 是 | 数据合集 |
| pageCount | long | 否 | 总页数 示例：9 |
| beginPageIndex | long | 否 | 开始页数 示例：1 |
| endPageIndex | long | 否 | 结束页数 示例：9 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 83,
		"recordList": [
			{
				"produceBatch": 1,
				"batch": 1,
				"returncount": 0,
				"routingOperation_timeUnit": 1,
				"verifystate": 1,
				"code": "0628",
				"productUnitPrecision": 3,
				"routingOperation_id": 2320740682076929,
				"routingOperation_sn": 10,
				"sumProcessTs": 0,
				"orgId": "1866605942198528",
				"routingOperation_isOutsource": 1,
				"routingOperation_overlappingCount": 0,
				"routingOperation_operationId": 2320714492744448,
				"routingType": 1,
				"routingOperation_isReportPoint": 0,
				"routingOperation_pubts": "2021-06-28 10:19:30",
				"routingOperation_overlappingTime": 0,
				"sumPrepareTs": 0,
				"id": 2320740682076928,
				"pubts": "2021-07-09 09:17:55",
				"routingOperation_operationcontrolcodeId": "12313122",
				"routingOperation_changeRate": "1",
				"routingOperation_produceUnitName": "台",
				"routingOperation_produceUnit": 123414141,
				"routingOperation_isSkipSequence": 0,
				"routingOperation_qualityWay": 0,
				"routingOperation_operationControlCodeIdName": "wqewq",
				"routingOperation_operationCode": "0628",
				"orgName": "L工厂1",
				"routingOperation_overlappingType": 1,
				"unitName": "件",
				"isWfControlled": true,
				"materialCode": "0618002",
				"routingOperation_routingId": 2320740682076928,
				"materialId": 2306938715788800,
				"version": "A3",
				"routingOperation_workCenterIdName": "55",
				"routingOperation_processTransferMode": 0,
				"routingOperation_workCenterId": 2169311033397504,
				"materialName": "0618002",
				"unit": 1869676091724032,
				"name": "0628工艺路线",
				"routingOperation_operationName": "企业账号级工序",
				"routingOperation_isDispatchSegPoints": 1,
				"status": 3,
				"productId": 0,
				"productCode": "",
				"productName": "",
				"effectiveDate": "",
				"expiryDate": "",
				"rollup": 0,
				"routingOperationWorkCenterIdCode": "",
				"newestVer": 0,
				"memo": ""
			}
		],
		"pageCount": 9,
		"beginPageIndex": 1,
		"endPageIndex": 9
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	参数数据错误	输入合适的查询参数


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-08-28

新增

请求参数 productCodes

2	2025-07-16

新增

请求参数 (11)

3	2025-06-24

新增

请求参数 routingDefineCharacter


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

