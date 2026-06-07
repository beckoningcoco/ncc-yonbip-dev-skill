---
title: "付款方式列表查询"
apiId: "f73c403f38884d548904184d626a4515"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payment Method Card"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Method Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 付款方式列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Payment Method Card (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/paymentway/list

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
| pageSize | long | 否 | 否 | 分页大小 示例：10 |
| pageIndex | long | 否 | 否 | 第几页 示例：1 |
| ownerCode | string | 否 | 否 | 会计主体 |
| name | string | 否 | 否 | 付款方式 |
| payTypeName | string | 否 | 否 | 付款方式类型 |

## 3. 请求示例

Url: /yonbip/digitalModel/paymentway/list?access_token=访问令牌
Body: {
	"pageSize": 10,
	"pageIndex": 1,
	"ownerCode": "",
	"name": "",
	"payTypeName": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| pageIndex | int | 否 | pageIndex |
| pageSize | int | 否 | pageSize |
| pageCount | int | 否 | pageCount |
| beginPageIndex | int | 否 | beginPageIndex |
| endPageIndex | int | 否 | endPageIndex |
| recordCount | int | 否 | recordCount |
| pubts | string | 否 | pubts |
| recordList | object | 是 | recordList |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0,
		"recordCount": 0,
		"pubts": "",
		"recordList": [
			{
				"id": "",
				"ownerCode": "",
				"ownerCode_name": "",
				"paymentWayCode": "",
				"name": "",
				"payTypeName": "",
				"dataSource": "",
				"pubts": ""
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

