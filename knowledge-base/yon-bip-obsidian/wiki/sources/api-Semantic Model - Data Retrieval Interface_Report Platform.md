---
title: "语义模型-取数接口_报表平台"
apiId: "2320538961465835522"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Report Platform"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Report Platform]
platform_version: "BIP"
source_type: community-api-docs
---

# 语义模型-取数接口_报表平台

> `ContentType	application/json` 请求方式	POST | 分类: Report Platform (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/CPC/semantic/v1/query_report

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pager | object | 否 | 是 | 分页参数 |
| pageIndex | int | 否 | 是 | 当前页码 示例：1 |
| pageSize | int | 否 | 是 | 每页查询数据大小 示例：100 |
| entity | string | 否 | 是 | 语义模型编码 示例：zhaogb20220601 |
| fields | object | 是 | 是 | 获取的字段列表 |
| name | string | 否 | 是 | 字段名称 示例：m_month |
| aggr | string | 否 | 否 | 聚合函数，如count, count_distinct, sum, avg, max, min等，查询结果按照字段查询列表中未使用聚合函数的字段分组 |
| conditions | object | 是 | 否 | 查询条件，支持嵌套 |
| op | string | 否 | 否 | 嵌套时的条件组合关系：AND或者OR 示例：AND |
| items | object | 是 | 否 | 当条件为嵌套条件时（op为AND|OR），嵌套条件数据，格式与普通条件保持一致 |
| modelParams | object | 是 | 否 | 模型参数 |
| code | string | 否 | 否 | 参数编码 示例：year |
| value | string | 否 | 否 | 参数值 示例：2021 |

## 3. 请求示例

Url: /yonbip/CPC/semantic/v1/query_report?access_token=访问令牌
Body: {
	"pager": {
		"pageIndex": 1,
		"pageSize": 100
	},
	"entity": "zhaogb20220601",
	"fields": [
		{
			"name": "m_month",
			"aggr": ""
		}
	],
	"conditions": [
		{
			"op": "AND",
			"items": [
				{
					"op": "eq",
					"name": "code",
					"v1": "abc",
					"v2": "",
					"values": [
						""
					]
				}
			]
		}
	],
	"modelParams": [
		{
			"code": "year",
			"value": "2021"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 编码 示例：200 |
| message | string | 否 | 提示信息 示例：SUCCESS |
| data | object | 否 | 数据结构 |
| status | int | 否 | 执行状态码，0：失败，1：成功 示例：1 |
| msg | string | 否 | 返回信息 示例：SUCCESS |
| data | object | 否 | 返回结果 |
| detail | string | 否 | 详细错误信息 示例：null |
| errorStack | object | 否 | 错误堆栈 示例：[] |

## 5. 正确返回示例

{
	"code": "200",
	"message": "SUCCESS",
	"data": {
		"status": 1,
		"msg": "SUCCESS",
		"data": {
			"meta": [
				{
					"entity": "zhaogb20220601",
					"code": "m_month",
					"label": "m_month",
					"type": "STRING"
				}
			],
			"result": [],
			"pager": {
				"pageIndex": 1,
				"pageSize": 10,
				"pageCount": 70,
				"recordCount": 696
			}
		},
		"detail": "null",
		"errorStack": [
			0
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	服务器异常	检查智能分析服务是否异常

403	没有权限访问	检查用户是否具有对当前对象的访问权限


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

