---
title: "客户行业树查询"
apiId: "35e9b534a51943148cf2ee73b7f118d0"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer's Industry"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer's Industry]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户行业树查询

> `ContentType	application/json` 请求方式	POST | 分类: Customer's Industry (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/customertrade/tree

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |

## 3. 请求示例

Url: /yonbip/digitalModel/customertrade/tree?access_token=访问令牌

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 是 | 调用成功时的返回数据 |
| stopstatus | long | 否 | 停用状态, 0:启用、1:停用 示例：0 |
| isEnd | boolean | 否 | 是否末级 示例：false |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss 示例：2020-08-29 10:48:24 |
| level | long | 否 | 层级 示例：1 |
| id | long | 否 | 行业主键 示例：1511105059508480 |
| order | long | 否 | 排序 示例：0 |
| creator | string | 否 | 创建者 示例：YS测试1 |
| name | string | 否 | 行业名称 示例：客户行业02 |
| code | string | 否 | 行业编码 示例：khhe02 |
| children | object | 是 | 下级行业 |
| createTime | string | 否 | 创建时间 示例：2019-12-04 11:35:33 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"stopstatus": 0,
			"isEnd": false,
			"pubts": "2020-08-29 10:48:24",
			"level": 1,
			"id": 1511105059508480,
			"order": 0,
			"creator": "YS测试1",
			"name": "客户行业02",
			"code": "khhe02",
			"children": [
				{
					"createTime": "2020-08-29 10:48:24",
					"pubts": "2020-08-29 10:48:24",
					"parent": 1511105059508480,
					"level": 2,
					"stopstatus": 0,
					"code": "khhe0201",
					"name": "客户行业子类1",
					"parent_name": "客户行业02",
					"isEnd": true,
					"order": 0,
					"id": 1891849089339904,
					"creator": "YS测试1"
				}
			],
			"createTime": "2019-12-04 11:35:33"
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

