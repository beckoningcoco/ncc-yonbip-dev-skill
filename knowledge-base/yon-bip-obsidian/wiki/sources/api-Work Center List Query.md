---
title: "工作中心列表查询"
apiId: "4aee0beb12de42a7a2de8efa77563abd"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Work Center"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Work Center]
platform_version: "BIP"
source_type: community-api-docs
---

# 工作中心列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Work Center (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/mfg/workcenter/list

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
| pageIndex | int | 否 | 是 | 当前页，默认当前页为1 示例1 示例：1 默认值：1 |
| pageSize | int | 否 | 是 | 每页数目，默认每页10条数据，示例10 示例：10 默认值：10 |
| code | string | 否 | 否 | 编码 示例：BYC102 |
| orgId | string | 否 | 否 | 组织id 示例：2107083723543296 |
| orgCode | string | 否 | 否 | 组织编码 示例：00001 |
| workCenterCategoryId | long | 否 | 否 | 工作中心分类id 示例：2325008130462464 |
| workCenterCategoryIdCode | string | 否 | 否 | 工作中心分类编码 |
| deptId | string | 否 | 否 | 部门id 示例：2107097233445120 |
| deptIdCode | string | 否 | 否 | 部门编码 示例：111 |
| stopstatus | boolean | 否 | 否 | 启用状态{false:启用，true:停用} 示例：false |
| calculatePower | boolean | 否 | 否 | 能力计算{false:否，true:是} 示例：false |
| usedType | short | 否 | 否 | 用途{0:粗能力，1:细能力，2:工艺路线，3:工序计划} 示例：0 |
| isOutsource | boolean | 否 | 否 | 委外工作中心{false:否，true:是} 示例：false |
| powerUnitType | string | 否 | 否 | 能力单位类型{"S":时间，"E":产量} 示例：S |
| startTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 创建时间开始 示例：2024-01-19 14:05:38 |
| endTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 创建时间结束 示例：2024-01-19 14:06:06 |
| modifiedTimeStart | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 修改时间开始 示例：2024-01-19 14:07:01 |
| modifiedTimeEnd | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 修改时间结束 示例：2024-01-19 14:07:35 |
| pubts | string | 否 | 否 | 时间戳 示例：2024-05-06 23:10:00|2024-05-08 12:09:00 |

## 3. 请求示例

Url: /yonbip/mfg/workcenter/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"code": "BYC102",
	"orgId": "2107083723543296",
	"orgCode": "00001",
	"workCenterCategoryId": 2325008130462464,
	"workCenterCategoryIdCode": "",
	"deptId": "2107097233445120",
	"deptIdCode": "111",
	"stopstatus": false,
	"calculatePower": false,
	"usedType": 0,
	"isOutsource": false,
	"powerUnitType": "S",
	"startTime": "2024-01-19 14:05:38",
	"endTime": "2024-01-19 14:06:06",
	"modifiedTimeStart": "2024-01-19 14:07:01",
	"modifiedTimeEnd": "2024-01-19 14:07:35",
	"pubts": "2024-05-06 23:10:00|2024-05-08 12:09:00"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 接口返回状态 示例：200 |
| message | string | 否 | 接口返回信息 示例：操作成功 |
| data | object | 否 | 接口返回数据 |
| pageIndex | long | 否 | 当前页数 示例：1 |
| pageSize | long | 否 | 每页数量 示例：10 |
| recordCount | long | 否 | 总条数 示例：1 |
| recordList | object | 是 | 数据合集 |
| pageCount | long | 否 | 总记录数 示例：1 |
| beginPageIndex | long | 否 | 起始页 示例：1 |
| endPageIndex | long | 否 | 结束页 示例：1 |

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
				"code": "test-bhx03",
				"modifier": "15810437080",
				"creatorId": 1866554948653312,
				"modifierId": 1866554948653312,
				"memo": "1",
				"coeffExcess": 0,
				"orgId": "1870887948554496",
				"orgId_name": "qing-gc001",
				"modifyTime": "2021-08-03 16:37:48",
				"deptIdName": "生产部",
				"id": 2371860049892096,
				"pubts": "2021-08-03 16:37:48",
				"workCenterCategoryId": 2223053718852096,
				"stopstatus": false,
				"timeUnit": "hour",
				"createDate": "2021-08-03 00:00:00",
				"creator": "15810437080",
				"modifyDate": "2021-08-03 00:00:00",
				"deptId": "1870534089855232",
				"main_id": 2371860049892096,
				"calculatePower": true,
				"detail_id": 2371860049892097,
				"detail_lineNo": 10,
				"detail_workTypeIdName": "12343",
				"detail_remark": "2211",
				"detail_workTypeId": 2188358046191872,
				"detail_workTypeIdCode": "1213",
				"workCenterCategoryIdName": "1",
				"operationControlCodeId": "2510773002310144",
				"operationControlCodeIdName": "bhx-01",
				"workTime": 8,
				"deptIdCode": "MFG01",
				"createTime": "2021-08-03 13:00:48",
				"name": "test-bhx03",
				"isOutsource": true,
				"vendorId": 2104442179195136,
				"vendorId_name": "B公司",
				"workCalendarName": "默认工作日历方案",
				"parent": 2619940793700864,
				"parent_name": "wzy001",
				"usedType": "0,1,2,3",
				"powerUnitType": "S",
				"eqpCount": 1,
				"eqpUtilization": "100.00",
				"eqpPower": 800,
				"outputUnit": 2104217413030145,
				"outputUnitName": "台",
				"standardOutput": 5,
				"maxOutput": 10,
				"detail_quantity": 1,
				"detail_quantityUnit": 1964431847330048,
				"detail_quantityUnitName": "个",
				"detail_workTypeIdActivityClass": 4,
				"detail_workTypeIdUnitName": "平方米",
				"main": {
					"id": "2651036308869632",
					"define1": "工作中心固定自定义"
				},
				"mainAtt": {
					"id": "2651036308869632",
					"define1": "工作中心自由自定义"
				},
				"detail": {
					"id": "2371860049892097",
					"define1": "工作中心明细固定自定义"
				},
				"detailAtt": {
					"id": "2371860049892097",
					"define1": "工作中心明细自由自定义"
				}
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

1	2025-11-12

更新

请求说明

新增

请求参数 workCenterCategoryIdCode

2	2025-09-04

更新

返回参数 (4)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

