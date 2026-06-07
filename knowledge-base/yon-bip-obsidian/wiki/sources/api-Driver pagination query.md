---
title: "司机分页查询V3"
apiId: "2230737912635326467"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Driver"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Driver]
platform_version: "BIP"
source_type: community-api-docs
---

# 司机分页查询V3

> `ContentType	application/json` 请求方式	POST | 分类: Driver (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/basedoc/driver/batchQueryDetail

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
| 小数位数:0,最大长度:10 | 否 | 是 | 页码 示例：0 默认值：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 页面大小 示例：10 默认值：10 |
| startTs | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts开始时间 示例：2025-3-20 11:28:38 |
| endTs | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts结束时间 示例：2025-3-20 11:28:44 |
| ids | string | 是 | 否 | 主键ids集合 示例：["123","123321"] |
| name | string | 否 | 否 | 名称 示例：SUV |

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc/driver/batchQueryDetail?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 10,
	"startTs": "2025-3-20 11:28:38",
	"endTs": "2025-3-20 11:28:44",
	"ids": [
		"123",
		"123321"
	],
	"name": "SUV"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回值，成功返回200 示例：200 |
| success | boolean | 否 | 表示接口是否成功 示例：true |
| data | object | 否 | 消息体 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 页码，从1开始 示例：0 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 页面大小 示例：10 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 记录数 示例：5 |
| recordList | object | 是 | 业务数据 |

## 5. 正确返回示例

{
	"code": "200",
	"success": true,
	"data": {
		"pageIndex": 0,
		"pageSize": 10,
		"recordCount": 5,
		"recordList": [
			{
				"sourceUnique": "2245416916851621895",
				"id": "2245416916851621895",
				"pk_carrier": "2226832773753077761",
				"pk_carrier___code": "A123",
				"pk_carrier_code": "A123",
				"name": "123rf",
				"gender": 0,
				"ymsenc_phone": "12345678901",
				"address": "北京市海淀区",
				"cartype": "2245416916851621897",
				"cartype___vcode": "1",
				"loginname": "123rf",
				"pwd": "123456",
				"benable": "1",
				"remark": "",
				"pubts": "2025-04-14 11:22:13",
				"carrierList": [
					{
						"carrierid": "2226832773753077761",
						"carrierid___code": "A123",
						"is_default": 0,
						"id": "2245416916851621897",
						"pubts": "2025-04-14 11:22:13"
					}
				],
				"certificateList": [
					{
						"licensetype": "1",
						"cardno": "3601112345420",
						"expirydate": "2027-04-23",
						"remark": "",
						"status": "1",
						"attachmentId": "20a48df2-ed25-44dc-adb8-af6d5e147acd",
						"ymsenc_cardno": "3601112345420",
						"id": "2245416916851621896",
						"pubts": "2025-04-14 11:22:13"
					}
				]
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

1	2026-01-15

更新

请求说明

司机分页查询

2	2025-07-29

更新

请求参数 pageIndex

更新

请求参数 pageSize

司机分页查询

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

