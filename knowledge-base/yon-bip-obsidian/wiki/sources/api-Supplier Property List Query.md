---
title: "供应商属性列表查询"
apiId: "0d63ffe5d42046159b8036332bff03b2"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supplier"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supplier]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应商属性列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Supplier (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/vendorpro/list

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
| pageIndex | int | 否 | 是 | 页号 默认值：1 |
| pageSize | int | 否 | 是 | 每页行数 默认值：10 |
| showItem | string | 否 | 否 | 供应商属性名称 |
| type | string | 否 | 否 | 供应商属性类型 |

## 3. 请求示例

Url: /yonbip/digitalModel/vendorpro/list?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"showItem": "",
	"type": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| pageIndex | int | 否 | 当前页数 |
| pageSize | int | 否 | 每页行数 |
| pageCount | int | 否 | 总页数 |
| beginPageIndex | int | 否 | 开始页码（第一页） |
| endPageIndex | int | 否 | 结束页码（有多少页） |
| recordCount | int | 否 | 总数 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| recordList | object | 是 | 供应商属性数据 |

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
				"showItem": "",
				"item": "",
				"sourcetype": "",
				"userdefAlias": "",
				"type": "",
				"id": "",
				"maxInputLen": "",
				"isEnabled": "",
				"decimalDigits": "",
				"isWebShow": "",
				"orderNum": "",
				"iorder": "",
				"isSerInput": "",
				"pubts": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	联系管理员


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-24

更新

请求说明

更新

请求参数 (4)

更新

返回参数 (25)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

