---
title: "供应商分类批量停用"
apiId: "fa07949921764e0b90eea6956db55b2b"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supplier Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supplier Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应商分类批量停用

> `ContentType	application/json` 请求方式	POST | 分类: Supplier Category (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/vendorclassification/stop

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 传参数组 |
| id | long | 否 | 是 | 供应商分类id 示例：2301261300191488 |

## 3. 请求示例

Url: /yonbip/digitalModel/vendorclassification/stop?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2301261300191488
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 接口请求返回的状态码 示例：200-成功，其他-失败 |
| message | string | 否 | 接口请求的信息 示例：操作成功 |
| data | object | 否 | 接口参数的返回数据 |
| count | long | 否 | 请求的总数量 示例：1 |
| sucessCount | long | 否 | 请求成功的数量 示例：1 |
| failCount | long | 否 | 请求失败的数量 示例：0 |
| messages | string | 是 | 接口请求的信息 示例：["供应商分类已被引用，无法停用"] |
| infos | object | 是 | 接口请求返回的数据 |

## 5. 正确返回示例

{
	"code": NaN,
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			"供应商分类已被引用，无法停用"
		],
		"infos": [
			{
				"id": 1649435182748780,
				"isEnabled": "",
				"pubts": "2021-06-01 14:39:28",
				"stopstatus": "",
				"stoptime": "2021-06-01 14:39:28"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端异常	请联系管理员


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

