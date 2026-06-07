---
title: "客户自定义属性信息查询"
apiId: "508163129a1a4f62be1f59ae90653390"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户自定义属性信息查询

> `ContentType	application/json` 请求方式	POST | 分类: Customer (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/merchant/api/getCustomerDefine

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
| data | object | 否 | 否 | 查询数据体 |
| code | string | 否 | 是 | 客户编码 示例：est2-0000000022 |

## 3. 请求示例

Url: /yonbip/digitalModel/merchant/api/getCustomerDefine?access_token=访问令牌
Body: {
	"data": {
		"code": "est2-0000000022"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 是 | 调用成功时的返回数据 |
| merchantId | long | 否 | 客户Id 示例：2175617260999168 |
| id | long | 否 | 客户自定义Id 示例：2176370706977025 |
| pubts | string | 否 | 时间戳 示例：2021-03-18 10:38:47 |
| customerDefine1 | string | 否 | 自定义项1 示例：11 |
| tenant | long | 否 | 租户Id 示例：1951482557763840 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"merchantId": 2175617260999168,
			"id": 2176370706977025,
			"pubts": "2021-03-18 10:38:47",
			"customerDefine1": "11",
			"tenant": 1951482557763840
		}
	]
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

