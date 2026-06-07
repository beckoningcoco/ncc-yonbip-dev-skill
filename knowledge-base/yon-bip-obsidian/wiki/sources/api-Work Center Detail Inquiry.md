---
title: "工作中心详情查询"
apiId: "30905f72815a49e09b91284d62858a28"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Work Center"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Work Center]
platform_version: "BIP"
source_type: community-api-docs
---

# 工作中心详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Work Center (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/mfg/workcenter/detail

请求方式	GET

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | long | query | 否 | 工作中心id，id和code不能同时为空，同时存在以id为准    示例: 2304039509594368 |
| code | string | query | 否 | 工作中心code，id和code不能同时为空，同时存在以id为准    示例: 001 |

## 3. 请求示例

Url: /yonbip/mfg/workcenter/detail?access_token=访问令牌&id=2304039509594368&code=001

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 接口返回状态 示例：200 |
| message | string | 否 | 接口返回信息 示例：操作成功 |
| data | object | 否 | 接口返回数据 |
| orgIdName | string | 否 | 组织名称 示例：qing-gc001 |
| masterOrgKeyField | string | 否 | 主组织字段 示例：orgId |
| calculatePower | boolean | 否 | 能力计算{false:否，true:是} 示例：true |
| code | string | 否 | 编码 示例：test-bhx03 |
| name | string | 否 | 名称 示例：test-bhx03 |
| modifier | string | 否 | 修改人 示例：15810437080 |
| creatorId | long | 否 | 创建人id 示例：1866554948653312 |
| modifierId | long | 否 | 修改人id 示例：1866554948653312 |
| memo | string | 否 | 备注 示例：1 |
| orgId | string | 否 | 组织id 示例：1870887948554496 |
| modifyTime | string | 否 | 修改时间 示例：2021-08-03 14:43:22 |
| deptIdName | string | 否 | 所属部门名称 示例：生产部 |
| deptIdCode | string | 否 | 所属部门编码 示例：MFG01 |
| id | long | 否 | 主表id 示例：2371860049892096 |
| pubts | string | 否 | 时间戳 示例：2021-08-03 14:43:22 |
| workCenterCategoryId | long | 否 | 工作中心分类id 示例：2223053718852096 |
| workCenterCategoryIdName | string | 否 | 工作中心分类名称 示例：1 |
| operationControlCodeId | string | 否 | 工序控制码id 示例：2510773002310144 |
| operationControlCodeIdName | string | 否 | 工序控制码名称 示例：bhx-01 |
| stopstatus | boolean | 否 | 启用状态{false:启用，true:停用} 示例：false |
| timeUnit | string | 否 | 时间单位:hour-时,minute-分,second-秒 示例：hour |
| coeffExcess | long | 否 | 超额系数% 示例：0 |
| createDate | string | 否 | 创建日期 示例：2021-08-03 00:00:00 |
| creator | string | 否 | 创建人 示例：15810437080 |
| modifyDate | string | 否 | 修改日期 示例：2021-08-03 00:00:00 |
| deptId | string | 否 | 部门id 示例：1870534089855232 |
| workTime | long | 否 | 工作时间 示例：8 |
| createTime | string | 否 | 创建时间 示例：2021-08-03 13:00:48 |
| isOutsource | boolean | 否 | 委外工作中心{false:否，true:是} 示例：true |
| vendorId | long | 否 | 委外商id 示例：2104442179195136 |
| vendorId_name | string | 否 | 委外商名称 示例：B公司 |
| workCalendar | string | 否 | 工作日历id 示例：kuguqrp9calendar000001 |
| workCalendarName | string | 否 | 工作日历名称 示例：默认工作日历方案 |
| parent | long | 否 | 上级工作中心id 示例：2619940793700864 |
| parent_name | string | 否 | 上级工作中心名称 示例：wzy001 |
| usedType | string | 否 | 用途{0:粗能力，1:细能力，2:工艺路线，3:工序计划} 示例：0,1,2,3 |
| powerUnitType | string | 否 | 能力单位类型{"S":时间，"E":产量} 示例：S |
| eqpCount | long | 否 | 数量 示例：1 |
| eqpUtilization | Decimal | 否 | 利用率% 示例：100.00 |
| eqpPower | Decimal | 否 | 标准能力 示例：800.00 |
| outputUnit | long | 否 | 产量单位id 示例：2104217413030145 |
| outputUnitName | string | 否 | 产量单位名称 示例：台 |
| standardOutput | Decimal | 否 | 标准产量 示例：5.00 |
| maxOutput | Decimal | 否 | 最大产量 示例：10.00 |
| defines | object | 否 | 固定自定义项 |
| attDefines | object | 否 | 自由自定义项 |
| workCenterDetailList | object | 是 | 工作中心明细 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"orgIdName": "qing-gc001",
		"masterOrgKeyField": "orgId",
		"calculatePower": true,
		"code": "test-bhx03",
		"name": "test-bhx03",
		"modifier": "15810437080",
		"creatorId": 1866554948653312,
		"modifierId": 1866554948653312,
		"memo": "1",
		"orgId": "1870887948554496",
		"modifyTime": "2021-08-03 14:43:22",
		"deptIdName": "生产部",
		"deptIdCode": "MFG01",
		"id": 2371860049892096,
		"pubts": "2021-08-03 14:43:22",
		"workCenterCategoryId": 2223053718852096,
		"workCenterCategoryIdName": "1",
		"operationControlCodeId": "2510773002310144",
		"operationControlCodeIdName": "bhx-01",
		"stopstatus": false,
		"timeUnit": "hour",
		"coeffExcess": 0,
		"createDate": "2021-08-03 00:00:00",
		"creator": "15810437080",
		"modifyDate": "2021-08-03 00:00:00",
		"deptId": "1870534089855232",
		"workTime": 8,
		"createTime": "2021-08-03 13:00:48",
		"isOutsource": true,
		"vendorId": 2104442179195136,
		"vendorId_name": "B公司",
		"workCalendar": "kuguqrp9calendar000001",
		"workCalendarName": "默认工作日历方案",
		"parent": 2619940793700864,
		"parent_name": "wzy001",
		"usedType": "0,1,2,3",
		"powerUnitType": "S",
		"eqpCount": 1,
		"eqpUtilization": 100,
		"eqpPower": 800,
		"outputUnit": 2104217413030145,
		"outputUnitName": "台",
		"standardOutput": 5,
		"maxOutput": 10,
		"defines": {
			"id": "",
			"define1": "",
			"define2": ""
		},
		"attDefines": {
			"id": "",
			"define1": "",
			"define2": ""
		},
		"workCenterDetailList": [
			{
				"rowno": "0",
				"lineNo": 10,
				"workTypeId": 2188358046191872,
				"workCenterId": 2371860049892096,
				"memo": "2211",
				"id": 2371860049892097,
				"workTypeIdCode": "1213",
				"workTypeIdName": "12343",
				"quantity": 12,
				"quantityUnit": 1964431847330048,
				"quantityUnitPrecision": 4,
				"quantityUnitName": "个",
				"workTypeIdActivityClass": "0",
				"workTypeIdUnitName": "个",
				"bodyDefines": {
					"id": "",
					"define1": "",
					"define2": ""
				},
				"attBodyDefines": {
					"id": "",
					"define1": "",
					"define2": ""
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

1	2025-09-04

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

