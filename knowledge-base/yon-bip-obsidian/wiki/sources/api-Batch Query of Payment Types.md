---
title: "款项类型批量查询"
apiId: "2178951103919423493"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payment Type"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Type]
platform_version: "BIP"
source_type: community-api-docs
---

# 款项类型批量查询

> `ContentType	application/json` 请求方式	POST | 分类: Payment Type (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/bd/v1/paymentType/query

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| id | string | 否 | 否 | 主键ID，多个支持逗号分隔 |
| code | string | 否 | 否 | 款项类型编码，多个支持逗号分隔 |
| name | string | 否 | 否 | 款项类型当前语种名称，支持like |
| desc | string | 否 | 否 | 款项类型当前语种描述，支持like |
| pageIndex | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 当前分页需要，从1开始 |
| pageSize | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 分页大小，必须大于0，按照ID和Code批量查询的时候会自动转成批量查询数量 |

## 3. 请求示例

Url: /yonbip/AMP/bd/v1/paymentType/query?access_token=访问令牌
Body: {
	"id": "",
	"code": "",
	"name": "",
	"desc": "",
	"pageIndex": 0,
	"pageSize": 0
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| success | boolean | 否 | success 示例：true |
| message | string | 否 | message 示例：success |
| data | object | 否 | data |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 当前页码 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 分页大小 示例：100 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 记录总数量 示例：1 |
| recordList | object | 是 | 当前页记录列表 |
| pageCount | number |
| 小数位数:0,最大长度:10 | 否 | 分页数量 示例：1 |
| beginPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 开始页码 示例：1 |
| endPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 结束页码 示例：1 |

## 5. 正确返回示例

{
	"code": 200,
	"success": true,
	"message": "success",
	"data": {
		"pageIndex": 1,
		"pageSize": 100,
		"recordCount": 1,
		"recordList": [
			{
				"checkshouldpay": true,
				"code": "1",
				"name": {
					"ru_RU": "",
					"zh_TW": "",
					"lo_LA": "",
					"ko_KR": "",
					"en_US": "",
					"id_ID": "",
					"zh_CN": "Merry",
					"ja_JP": "",
					"de_DE": ""
				},
				"applicationscope": "8,6,2,3,5,7,6",
				"id": 1866908527264530437,
				"prepaystatus": true,
				"stopstatus": false,
				"desc": {
					"ru_RU": "",
					"zh_TW": "",
					"lo_LA": "",
					"ko_KR": "",
					"en_US": "",
					"id_ID": "",
					"zh_CN": "",
					"ja_JP": "",
					"de_DE": ""
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

