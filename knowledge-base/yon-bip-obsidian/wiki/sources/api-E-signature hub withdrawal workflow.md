---
title: "电子签hub撤回签署流程"
apiId: "2275314201383665664"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "E-signature Configuration"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, E-signature Configuration]
platform_version: "BIP"
source_type: community-api-docs
---

# 电子签hub撤回签署流程

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/id/signFlow/v1/revokeSignFlow

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
| signFlowId | string | 否 | 是 | 签署流程ID 示例：e9759030446e4bfd9b1de1c0be7f5a7c |
| revokeOperatorAccountId | string | 否 | 是 | 撤回操作人电子签用户accountId 示例：9edc79d48c184c96ae959dcd686a1eb5 |
| reason | string | 否 | 是 | 撤回原因 示例：测试撤回 |

## 3. 请求示例

Url: /yonbip/id/signFlow/v1/revokeSignFlow?access_token=访问令牌
Body: {
	"signFlowId": "e9759030446e4bfd9b1de1c0be7f5a7c",
	"revokeOperatorAccountId": "9edc79d48c184c96ae959dcd686a1eb5",
	"reason": "测试撤回"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 响应码 示例：200 |
| message | string | 否 | 响应信息 示例：success |
| data | object | 否 | 响应数据 |
| signFlowId | string | 否 | 签署流程id 示例：e9759030446e4bfd9b1de1c0be7f5a7c |
| singers | object | 是 | 签署人信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": {
		"signFlowId": "e9759030446e4bfd9b1de1c0be7f5a7c",
		"singers": [
			{
				"signerId": "WJHSNDSIDS",
				"accountId": "37fe7c2f8a674c13b0a85cc4c68f400f",
				"accountName": "张三",
				"companyId": "22fd9bb100f943c8aab8aba8190f326b"
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

1	2025-08-15

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

