---
title: "项目启用"
apiId: "bef102b97f9243e8899281033a42a4bf"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Project"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Project]
platform_version: "BIP"
source_type: community-api-docs
---

# 项目启用

> `ContentType	application/json` 请求方式	POST | 分类: Project (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/project/enable

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
| data | object | 是 | 否 | 业务数据 |
| id | string | 否 | 是 | 主键 示例：2287198401597696 |

## 3. 请求示例

Url: /yonbip/digitalModel/project/enable?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "2287198401597696"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回状态码 200:成功 示例：200 |
| message | string | 否 | 消息 示例：操作成功 |
| data | object | 否 | 数据 |
| count | long | 否 | 总数 示例：1 |
| sucessCount | long | 否 | 成功的总数 示例：1 |
| failCount | long | 否 | 失败的总数 示例：0 |
| messages | string | 是 | 消息 |
| infos | object | 是 | 实体信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"id": "2282608144453888",
				"enable": 1,
				"yhtTenantId": "tf2ac81y",
				"yhtTenant": "tf2ac81y",
				"tenant": "tf2ac81y",
				"pubts": "2021-06-24 14:23:28"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	操作失败	请检查请求路径和参数是否正确，确认请求数据是否存在，如若无误联系管理员确认服务是否异常？


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

