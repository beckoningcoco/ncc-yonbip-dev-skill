---
title: "汇率详情分页查询V5"
apiId: "2199496861689053190"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Exchange Rate Details"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Exchange Rate Details]
platform_version: "BIP"
source_type: community-api-docs
---

# 汇率详情分页查询V5

> `ContentType	application/json` 请求方式	POST | 分类: Exchange Rate Details (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/basedoc/exchangerate/batchQueryDetail

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
| 小数位数:0,最大长度:10 | 否 | 是 | 页码 示例：1 默认值：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 页大小 示例：50 默认值：50 |
| startTs | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts开始时间 示例：2025-02-28 11:16:47 |
| endTs | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts结束时间 示例：2025-05-28 11:16:47 |
| ids | string | 是 | 否 | 主键id集合 示例：["2211575684096589833","2211575684096589834"] |

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc/exchangerate/batchQueryDetail?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 50,
	"startTs": "2025-02-28 11:16:47",
	"endTs": "2025-05-28 11:16:47",
	"ids": [
		"2211575684096589833",
		"2211575684096589834"
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 响应编码 示例：200 |
| data | object | 否 | 响应数据 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 页码 示例：0 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 页大小 示例：10 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 总数 示例：2 |
| recordList | object | 是 | 数据记录 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"pageIndex": 0,
		"pageSize": 10,
		"recordCount": 2,
		"recordList": [
			{
				"id": "2162598746106888200",
				"sourceCurrencyId": "1604976699624128545",
				"sourceCurrencyId___code": "JPY",
				"sourceCurrencyId___name": {
					"zh_TW": "日元",
					"en_US": "JPY",
					"zh_CN": "日元"
				},
				"targetCurrencyId": "1604976699624128540",
				"targetCurrencyId___code": "CNY",
				"targetCurrencyId___name": {
					"zh_TW": "人民币",
					"en_US": "CNY",
					"zh_CN": "人民币"
				},
				"quotationDate": "2024-12-23",
				"exchangerateSchemeId": "G001ZM0000DEFAULTRATESCHEME00001",
				"exchangeRateType": "0000LB7GORZKFK09HO0000",
				"exchangeRateType___code": "E001",
				"exchangeRate": 1.2,
				"indirectExchangeRate": 0.833333,
				"exchangeConversionMethod": 1,
				"enable": 1,
				"pubts": "2024-12-23 21:13:49"
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

1	2025-10-30

更新

返回参数 sourceCurrencyId

更新

返回参数 sourceCurrencyId___code

更新

返回参数 sourceCurrencyId___name

api文档中，所有的“源币种”都改为“原币种”

2	2025-09-13

新增

返回参数 exchangeConversionMethod

汇率详情分页查询

3	2025-06-30

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

