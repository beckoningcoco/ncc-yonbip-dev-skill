---
title: "工作中心保存V2"
apiId: "1933831118531330052"
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

# 工作中心保存V2

> `ContentType	application/json` 请求方式	POST | 分类: Work Center (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/mfg/workcenter/save/V1

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
| id | long | 否 | 否 | 工作中心id：主键， 新增时无需填写，修改时必填 ！ 示例：2362414690406912 |
| orgId | string | 否 | 否 | 组织id，组织id和组织编码不能同时为空，id和编码同时存在，以id为准 示例：2107085234802944 |
| orgCode | string | 否 | 否 | 组织编码，组织id和code不能同时为空，同时存在以id为准 示例：qing-002 |
| code | string | 否 | 是 | 编码 示例：bhx-01 |
| name | string | 否 | 是 | 名称 示例：bhx-01 |
| workCenterCategoryId | long | 否 | 否 | 工作中心分类id，工作中心分类id与编码不能同时为空，同时存在已以id为准！ 示例：2246068722471680 |
| workCenterCategoryIdCode | string | 否 | 否 | 工作中心分类编码，工作中心分类id与编码不能同时为空，同时存在已以id为准！ 示例：DDD |
| isOutsource | boolean | 否 | 否 | 委外工作中心{false:否，true:是，默认为否} 示例：false |
| vendorId | string | 否 | 否 | 委外商id：委外商id与编码同时存在以id为准！ 示例：2104442179195136 |
| vendorCode | string | 否 | 否 | 委外商编码：委外商id与编码同时存在以id为准！ 示例：B公司 |
| deptId | string | 否 | 否 | 部门id：委外工作中心为false时必填，部门id与编码不能同时为空，同时存在以id为准！ 示例：2323554107986176 |
| deptIdCode | string | 否 | 否 | 部门编码：部门id与编码不能同时为空，同时存在以id为准！ 示例：111 |
| workCalendar | string | 否 | 否 | 工作日历id：工作日历id与名称不能同时为空，同时存在以id为准！ 示例：kuguqrp9calendar000001 |
| calculatePower | boolean | 否 | 否 | 能力计算{false:否，true:是，默认为否} 示例：false |
| operationControlCodeId | string | 否 | 否 | 工序控制码id：编码与id同时录入时，以id为准！ 示例：2533039361384032 |
| operationControlCode | string | 否 | 否 | 工序控制码编码 示例：CNJGBJYBBG |
| parent | long | 否 | 否 | 上级工作中心id：上级工作中心id与编码同时存在以id为准！ 示例：2619940793700864 |
| parentCode | string | 否 | 否 | 上级工作中心编码：上级工作中心id与编码同时存在以id为准！ 示例：wzy001 |
| usedType | string | 否 | 否 | 用途{0:粗能力，1:细能力，2:工艺路线，3:工序计划，多选以,分隔} 示例：0,1,2,3 |
| stopstatus | boolean | 否 | 否 | 启用状态{false:启用，true:停用，默认启用} 示例：false |
| memo | string | 否 | 否 | 备注 示例：test |
| eqpCount | long | 否 | 否 | 数量：能力单位类型为"S"时必输，能力单位类型为"E"时不输，必须大于0！ 示例：1 |
| eqpUtilization | string | 否 | 否 | 利用率%：能力单位类型为"S"时必输，能力单位类型为"E"时不输，0-100！ 示例：100.00 |
| workTime | string | 否 | 否 | 工作时间：能力单位类型为"S"时必输，能力单位类型为"E"时不输！ 示例：5 |
| timeUnit | string | 否 | 否 | 时间单位:hour-时,minute-分,second-秒{能力单位类型为"S"时必输，能力单位类型为"E"时不输！} 示例：hour |
| coeffExcess | string | 否 | 否 | 超额系数%：能力单位类型为"S"时必输，能力单位类型为"E"时不输，0-100！ 示例：0 |
| outputUnit | long | 否 | 否 | 产量单位id：能力单位类型为"E"时必输，能力单位类型为"S"时不输，产量单位id与名称同时存在以id为准！ 示例：2104217413030145 |
| outputUnitName | string | 否 | 否 | 产量单位名称：能力单位类型为"E"时必输，能力单位类型为"S"时不输，产量单位id与名称同时存在以id为准！ 示例：台 |
| standardOutput | string | 否 | 否 | 标准产量：能力单位类型为"E"时必输，能力单位类型为"S"时不输！ 示例：5 |
| defines | object | 否 | 否 | 固定自定义项。例：{ "id":"2357782025966080", "define1":"yyy" }更新自定义项id必填。 |
| maxOutput | string | 否 | 否 | 最大产量：能力单位类型为"E"时必输，能力单位类型为"S"时不输！ 示例：10 |
| attDefines | object | 否 | 否 | 自由自定义项，例：{ "id":"2357782025966080", "define1":"yyy" }，更新自定义项值时自由自定义项id为必填项 |
| _status | string | 否 | 是 | 数据状态，枚举值，Insert：插入，Update：更新 示例：Insert |
| workCenterDetailList | object | 是 | 否 | 工作中心详情 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |

## 3. 请求示例

Url: /yonbip/mfg/workcenter/save/V1?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "951ada30e0969e954f5d9058fff6a512",
		"id": 2362414690406912,
		"orgId": "2107085234802944",
		"orgCode": "qing-002",
		"code": "bhx-01",
		"name": "bhx-01",
		"workCenterCategoryId": 2246068722471680,
		"workCenterCategoryIdCode": "DDD",
		"isOutsource": false,
		"vendorId": "2104442179195136",
		"vendorCode": "B公司",
		"deptId": "2323554107986176",
		"deptIdCode": "111",
		"workCalendar": "kuguqrp9calendar000001",
		"calculatePower": false,
		"operationControlCodeId": "2533039361384032",
		"operationControlCode": "CNJGBJYBBG",
		"parent": 2619940793700864,
		"parentCode": "wzy001",
		"usedType": "0,1,2,3",
		"stopstatus": false,
		"memo": "test",
		"eqpCount": 1,
		"eqpUtilization": "100.00",
		"workTime": "5",
		"timeUnit": "hour",
		"coeffExcess": "0",
		"outputUnit": 2104217413030145,
		"outputUnitName": "台",
		"standardOutput": "5",
		"defines": {
			"id": "",
			"define1": ""
		},
		"maxOutput": "10",
		"attDefines": {
			"id": "",
			"define1": ""
		},
		"_status": "Insert",
		"workCenterDetailList": [
			{
				"id": "",
				"workTypeIdCode": "002",
				"workTypeId": 2246070849065216,
				"memo": "test详情",
				"_status": "Insert",
				"quantity": 0,
				"quantityUnit": 0,
				"quantityUnitName": "",
				"workTypeIdActivityClass": "",
				"bodyDefines": {
					"id": "",
					"define1": ""
				},
				"attBodyDefines": {
					"id": "",
					"define1": ""
				}
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 接口返回状态 示例：200 |
| message | string | 否 | 接口返回信息 示例：操作成功 |
| data | object | 否 | 接口返回数据 |
| sucessCount | long | 否 | 成功数 示例：1 |
| failCount | long | 否 | 失败数 示例：0 |
| count | long | 否 | 记录总数 示例：1 |
| messages | string | 是 | 数据返回信息汇总 |
| infos | object | 是 | 返回详细信息 |

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
				"message": "操作成功",
				"data": {
					"orgId": "2107085234802944",
					"orgIdName": "qing-002工厂",
					"code": "bhx-01",
					"name": "bhx-01",
					"workCenterCategoryId": 2246068722471680,
					"workCenterCategoryIdName": "21",
					"isOutsource": true,
					"vendorId": 2104442179195136,
					"vendorId_name": "B公司",
					"deptId": "2323554107986176",
					"deptIdCode": "111",
					"deptIdName": "111",
					"workCalendar": "kuguqrp9calendar000001",
					"workCalendarName": "默认工作日历方案",
					"operationControlCodeId": "2510773002310144",
					"operationControlCodeIdName": "bhx-01",
					"parent": 2619940793700864,
					"parent_name": "wzy001",
					"usedType": "0,1,2,3",
					"calculatePower": false,
					"stopstatus": false,
					"memo": "test",
					"powerUnitType": "S",
					"eqpCount": 1,
					"eqpUtilization": "100.00",
					"workTime": "8",
					"timeUnit": "hour",
					"coeffExcess": "0",
					"eqpPower": "800.00",
					"outputUnit": 2104217413030145,
					"outputUnitName": "台",
					"standardOutput": "5.00",
					"maxOutput": "10.00",
					"creatorId": 2107058342072576,
					"creator": "张汉卿",
					"createTime": "2022-12-27 12:00:00",
					"createDate": "2022-12-27 12:00:00",
					"modifier": "张汉卿",
					"modifierId": "2107058342072576",
					"modifyTime": "2022-12-27 12:00:00",
					"modifyDate": "2022-12-27 12:00:00",
					"id": 2356106083029504,
					"pubts": "2022-12-27 12:00:00",
					"tenant": 2104160772624640,
					"yTenantId": "kuguqrp9",
					"defines": {
						"id": "",
						"define1": "",
						"yTenantId": "",
						"pubts": ""
					},
					"attDefines": {
						"id": "",
						"define1": "",
						"yTenantId": "",
						"pubts": ""
					},
					"workCenterDetailList": [
						{
							"rowno": 0,
							"lineNo": 10,
							"workTypeIdCode": "002",
							"workTypeId": 2246070849065216,
							"quantity": 12,
							"quantityUnit": 1964431847330048,
							"quantityUnitName": "个",
							"workTypeIdActivityClass": "0",
							"workTypeIdName": "02",
							"memo": "test详情",
							"id": 2356106083029505,
							"workCenterId": 2356106083029504,
							"pubts": "2022-12-27 12:00:00",
							"yTenantId": "kuguqrp9",
							"bodyDefines": {
								"id": "",
								"define1": "",
								"yTenantId": "",
								"pubts": ""
							},
							"attBodyDefines": {
								"id": "",
								"define1": "",
								"pubts": "",
								"yTenantId": ""
							}
						}
					]
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

1	2025-09-05

更新

请求参数 workTypeIdCode

更新

请求参数 workTypeId

更新

请求参数 workTypeIdActivityClass

更新

返回参数 (4)

2	2025-07-22

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

