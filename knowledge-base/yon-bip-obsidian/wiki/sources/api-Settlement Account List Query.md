---
title: "结算账户列表查询"
apiId: "f5e1c6f26cb749e7858bbe8c53a4eb34"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Settlement Account Details"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Settlement Account Details]
platform_version: "BIP"
source_type: community-api-docs
---

# 结算账户列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Settlement Account Details (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/settlementaccount/list

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
| pageSize | long | 否 | 是 | 分页大小 示例：10 |
| pageIndex | long | 否 | 是 | 第几页 示例：1 |
| name | string | 否 | 否 | 账户代码 示例：123 |
| accountTypeCode | string | 否 | 否 | 账户类型 示例：123 |
| pubts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 时间戳 |

## 3. 请求示例

Url: /yonbip/digitalModel/settlementaccount/list?access_token=访问令牌
Body: {
	"pageSize": 10,
	"pageIndex": 1,
	"name": "123",
	"accountTypeCode": "123",
	"pubts": "2026-06-07 11:49:16"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| pageIndex | int | 否 | 页码 |
| pageSize | int | 否 | 分页大小 |
| pageCount | int | 否 | 总页数 |
| beginPageIndex | int | 否 | 开始页码 |
| endPageIndex | int | 否 | 结束页码 |
| recordCount | int | 否 | 处理行数 |
| pubts | string | 否 | 时间戳，yyyy-MM-dd HH:mm:ss |
| recordList | object | 是 | 返回数据 |

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
				"name": "",
				"accountTypeCode": "",
				"salesTypeCode": "",
				"accountDesc": "",
				"payTypeCode": "",
				"labourRateCode": "",
				"labourDiscountCode": "",
				"controlAccount": "",
				"saleCode": "",
				"taxCode": "",
				"partsMaintainCode": "",
				"partsDiscountCode": "",
				"ownerCode_name": "",
				"ownerCode": "",
				"subjectId_name": "",
				"subjectId": "",
				"dataSource": "",
				"enable": "",
				"dr": "",
				"pubts": "",
				"log": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	操作失败


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

