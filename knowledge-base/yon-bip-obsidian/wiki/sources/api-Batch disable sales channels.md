---
title: "销售渠道批量停用"
apiId: "dc0d2a9df2d743a58077470e0e48a216"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Channel"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Channel]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售渠道批量停用

> `ContentType	application/json` 请求方式	POST | 分类: Sales Channel (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/customerType/batchStop

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
| data | object | 是 | 否 | 销售渠道数据，id与编码必输其一,id和编码同时存在时，以id为准 |
| id | long | 否 | 否 | 销售渠道id 示例：2444109888148224 |
| code | string | 否 | 否 | 销售渠道编码 示例：20210923_2 |

## 3. 请求示例

Url: /yonbip/digitalModel/customerType/batchStop?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2444109888148224,
			"code": "20210923_2"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用完成时的返回信息 示例：操作成功 |
| data | object | 是 | 调用完成时的返回数据 |
| code | string | 否 | 销售渠道编码 示例：20210923_2 |
| id | long | 否 | 销售渠道id 示例：2444109888148224 |
| stopstatus | boolean | 否 | 是否停用，true：是，false：否 示例：true |
| stoptime | string | 否 | 停用时间 示例：2021-09-23 14:45:36 |
| pubts | string | 否 | 时间戳 示例：2021-09-23 14:45:36 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"code": "20210923_2",
			"id": 2444109888148224,
			"stopstatus": true,
			"stoptime": "2021-09-23 14:45:36",
			"pubts": "2021-09-23 14:45:36"
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

