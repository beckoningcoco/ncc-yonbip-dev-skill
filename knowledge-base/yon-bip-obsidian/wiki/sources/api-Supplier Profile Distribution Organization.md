---
title: "供应商档案分配组织"
apiId: "9b52c582e860407498b2c80628b5e1c9"
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

# 供应商档案分配组织

> `ContentType	application/json` 请求方式	POST | 分类: Supplier (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/vendor/addvendorsuitorg

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
| data | object | 是 | 是 | 参数体 |
| vendorId | long | 否 | 是 | 供应商档案ID 示例：2016415922573568 |
| orgIds | string | 是 | 是 | 需要分配的组织ID 示例：["666666","1649769528807680","1649769530151168"] |

## 3. 请求示例

Url: /yonbip/digitalModel/vendor/addvendorsuitorg?access_token=访问令牌
Body: {
	"data": [
		{
			"vendorId": 2016415922573568,
			"orgIds": [
				"666666",
				"1649769528807680",
				"1649769530151168"
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码 示例：200 |
| message | string | 否 | 失败时返回错误信息 示例：操作成功 |
| data | object | 否 | 返回数据体 |
| successCountAI | long | 否 | 成功条数 示例：1 |
| failCountAI | long | 否 | 失败条数 示例：0 |
| count | long | 否 | 总条数 示例：1 |
| sucessCount | long | 否 | 成功条数 示例：1 |
| failCount | long | 否 | 失败条数 示例：0 |
| messages | string | 是 | 失败时返回错误信息 |
| infos | string | 是 | 详细信息 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"successCountAI": 1,
		"failCountAI": 0,
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			""
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	联系管理员


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

