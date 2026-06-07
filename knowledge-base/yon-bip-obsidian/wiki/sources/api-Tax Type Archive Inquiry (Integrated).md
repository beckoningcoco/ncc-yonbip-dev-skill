---
title: "税种档案查询(集成)"
apiId: "2266457394680168455"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tax Type File"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax Type File]
platform_version: "BIP"
source_type: community-api-docs
---

# 税种档案查询(集成)

> `ContentType	application/json` 请求方式	POST | 分类: Tax Type File (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/tax/api/category/query-all

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	列表查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 页码 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 页大小 示例：10 |
| lastUpdateTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts开始时间 示例：2025-01-08 14:24:27 |
| thisSyncTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts结束时间 示例：2025-01-08 14:25:27 |
| idList | string | 是 | 否 | 主键id集合 示例：["1492209816567283720","1492219591909179395"] |
| codeList | string | 是 | 否 | 编码 示例：["0112011123"] |

## 3. 请求示例

Url: /yonbip/digitalModel/tax/api/category/query-all?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"lastUpdateTime": "2025-01-08 14:24:27",
	"thisSyncTime": "2025-01-08 14:25:27",
	"idList": [
		"1492209816567283720",
		"1492219591909179395"
	],
	"codeList": [
		"0112011123"
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| data | object | 否 | 返回数据 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 当前页数 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 每行页数 示例：10 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 总数 示例：1 |
| recordList | object | 是 | 处理数据 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 1,
		"recordList": [
			{
				"country": "234333",
				"countryCode": "CN",
				"taxBureauArchiveId": "21432354",
				"name": "增值税",
				"code": "VAT",
				"taxPeriodType": "1",
				"applicationScene": "1",
				"effectiveDate": "2025-01-01",
				"invalidationDate": "2025-01-01",
				"id": "234324354",
				"currency": "213421423",
				"currencyCode": "CNY",
				"defaultPrecision": "4",
				"taxRoundingRule": "4",
				"exchangeRateType": "2342345",
				"exchangeRateTypeCode": "VAT"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


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

