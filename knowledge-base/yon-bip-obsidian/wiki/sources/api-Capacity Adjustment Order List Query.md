---
title: "产能调节单列表查询"
apiId: "2137969479587987457"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Capacity Adjustment Order"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Capacity Adjustment Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 产能调节单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Capacity Adjustment Order (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/mfg/capacity/adjust/list

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
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 当前页，默认当前页为1 默认值：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 每页数目，默认每页10条数据 默认值：10 |
| orgId | string | 否 | 否 | 组织ID |
| orgCode | string | 否 | 否 | 组织编码,当组织ID存在时以组织ID为准 |
| adjustObject | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 调节对象：0工作中心，1：生产线 |
| workCenterId | number |
| 小数位数:0,最大长度:19 | 否 | 否 | 工作中心ID |
| workCenterCode | string | 否 | 否 | 工作中心编码，当工作中心ID存在时，以工作中心ID为准 |
| productionLineId | number |
| 小数位数:0,最大长度:19 | 否 | 否 | 生产线ID |
| productionLineCode | string | 否 | 否 | 生产线编码，当生产线ID存在时，以生产线ID为准 |
| adjustDateStart | date |
| 格式:yyyy-MM-dd | 否 | 否 | 调节日期开始时间 |
| adjustDateEnd | date |
| 格式:yyyy-MM-dd | 否 | 否 | 调节日期结束时间 |

## 3. 请求示例

Url: /yonbip/mfg/capacity/adjust/list?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"orgId": "",
	"orgCode": "",
	"adjustObject": 0,
	"workCenterId": 0,
	"workCenterCode": "",
	"productionLineId": 0,
	"productionLineCode": "",
	"adjustDateStart": "2026-06-07",
	"adjustDateEnd": "2026-06-07"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 接口调用返回码，成功时返回200 示例：200 |
| message | string | 否 | 接口调用返回信息 示例：操作成功 |
| data | object | 否 | 接口调用返回数据 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 当前页数 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 每页条数 示例：10 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 总条数 示例：2 |
| recordList | object | 是 | 数据集合 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 2,
		"recordList": [
			{
				"id": 2142208998834176019,
				"orgId": "2085065094632308746",
				"orgName": "自动化_普通组织",
				"adjustObject": 0,
				"workCenterId": 2107446624476725256,
				"workCenterName": "自动化_工作中心",
				"productionLineId": 2137941940265549826,
				"productionLineName": "维尔薇二",
				"capacityAdjustDetail_id": 2142208998834176020,
				"capacityAdjustDetail_adjustDate": "2024-11-26 00:00:00",
				"capacityAdjustDetailAdjustedTime": 1,
				"capacityAdjustDetailAdjustedQuantity": 1
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

