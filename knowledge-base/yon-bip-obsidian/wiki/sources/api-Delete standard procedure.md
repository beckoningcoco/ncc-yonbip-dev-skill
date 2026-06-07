---
title: "标准工序删除"
apiId: "99c889a469c3406fbe32392871dc4ef6"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Standard Operation"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Standard Operation]
platform_version: "BIP"
source_type: community-api-docs
---

# 标准工序删除

> `ContentType	application/json` 请求方式	POST | 分类: Standard Operation (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/mfg/operation/delete

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量删除

事务和幂等性

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 标准工序数据集 |
| id | long | 否 | 是 | 标准工序id 示例：2332656171831552 |

## 3. 请求示例

Url: /yonbip/mfg/operation/delete?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2332656171831552
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 接口返回信息 示例：操作成功 |
| data | object | 否 | 接口返回数据 |
| successCountAI | long | 否 | 操作成功计数 示例：1 |
| failCountAI | long | 否 | 操作失败计数 示例：0 |
| count | long | 否 | 总数量 示例：1 |
| sucessCount | long | 否 | 成功计数 示例：1 |
| failCount | long | 否 | 失败计数 示例：0 |
| messages | string | 是 | 操作失败提示信息 |
| infos | string | 是 | 操作成功单据信息 |

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

