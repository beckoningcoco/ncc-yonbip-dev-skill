---
title: "产能调节单详情查询"
apiId: "2139233497048416257"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Capacity Adjustment Order"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Capacity Adjustment Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 产能调节单详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Capacity Adjustment Order (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/mfg/capacity/adjust/detail

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
| id | number |
| 小数位数:0,最大长度:19 | query | 否 | 单据ID    示例: 2304039509594368 |

## 3. 请求示例

Url: /yonbip/mfg/capacity/adjust/detail?access_token=访问令牌&id=2304039509594368

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 接口返回状态 示例：200 |
| message | string | 否 | 接口返回信息 示例：操作成功 |
| data | object | 否 | 接口返回数据 |
| id | number |
| 小数位数:0,最大长度:19 | 否 | 主表id 示例：2371860049892096 |
| orgId | string | 否 | 组织id 示例：1870887948554496 |
| orgName | string | 否 | 组织名称 示例：qing-gc001 |
| adjustObject | number |
| 小数位数:0,最大长度:10 | 否 | 调节对象，0：工作中心，1：生产线 示例：0 |
| workCenterId | number |
| 小数位数:0,最大长度:19 | 否 | 工作中心ID 示例：2107446624476725256 |
| workCenterName | string | 否 | 工作中心名称 示例：生产部 |
| workCalendar | string | 否 | 工作日历id 示例：kuguqrp9calendar000001 |
| workCalendarName | string | 否 | 工作日历名称 示例：默认工作日历方案 |
| powerUnitType | string | 否 | 能力单位类型{"S":时间，"E":产量} 示例：S |
| quantity | number |
| 小数位数:0,最大长度:10 | 否 | 数量 示例：1 |
| workTime | number |
| 小数位数:0,最大长度:10 | 否 | 工作时间 示例：8 |
| timeUnit | string | 否 | 时间单位:hour-时,minute-分,second-秒 示例：hour |
| standardOutput | number |
| 小数位数:2,最大长度:10 | 否 | 标准产量 示例：5.00 |
| outputUnit | number |
| 小数位数:0,最大长度:19 | 否 | 产量单位id 示例：2104217413030145 |
| outputUnitName | string | 否 | 产量单位名称 示例：台 |
| remark | string | 否 | 备注 |
| capacityAdjustDetail | object | 是 | 产能调节单子表 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": 2371860049892096,
		"orgId": "1870887948554496",
		"orgName": "qing-gc001",
		"adjustObject": 0,
		"workCenterId": 2107446624476725256,
		"workCenterName": "生产部",
		"workCalendar": "kuguqrp9calendar000001",
		"workCalendarName": "默认工作日历方案",
		"powerUnitType": "S",
		"quantity": 1,
		"workTime": 8,
		"timeUnit": "hour",
		"standardOutput": 5,
		"outputUnit": 2104217413030145,
		"outputUnitName": "台",
		"remark": "",
		"capacityAdjustDetail": [
			{
				"id": 2371860049892097,
				"capacityAdjustId": 2188358046191872,
				"adjustDate": "2024-11-22 00:00:00",
				"adjustedQuantity": 0,
				"adjustedTime": 1
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

