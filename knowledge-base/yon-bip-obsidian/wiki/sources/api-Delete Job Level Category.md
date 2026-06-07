---
title: "职级类别删除"
apiId: "1815048961807876099"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Job Level Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Job Level Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 职级类别删除

> `ContentType	application/json` 请求方式	POST | 分类: Job Level Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/bd_rank_type/delete

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
| data | object | 是 | 是 | 业务数据 |
| id | string | 否 | 是 | 主键 |
| code | string | 否 | 否 | 编码 |

## 3. 请求示例

Url: /yonbip/digitalModel/bd_rank_type/delete?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "",
			"code": ""
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 状态码 示例：200 |
| message | string | 否 | 返回状态 示例：操作成功 |
| data | object | 否 | 业务数据 |
| count | long | 否 | 处理行数 |
| successCountAI | long | 否 | 成功行数 |
| failCountAI | long | 否 | 失败行数 |
| sucessCount | long | 否 | 成功行数 |
| failCount | long | 否 | 失败行数 |
| messages | string | 是 | 返回消息 |
| infos | string | 是 | 其他信息 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 0,
		"successCountAI": 0,
		"failCountAI": 0,
		"sucessCount": 0,
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

