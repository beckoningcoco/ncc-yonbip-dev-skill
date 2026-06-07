---
title: "供应商分类自定义分页查询"
apiId: "1894626038555082752"
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

# 供应商分类自定义分页查询

> `ContentType	application/json` 请求方式	POST | 分类: Supplier Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/vendorclassification/queryByPage

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
| data | string | 否 | 否 | 查询字段name,code等，*为查询所有 示例：* |
| page | object | 否 | 是 | 分页设置 |
| pageSize | int | 否 | 否 | 每页数量 示例：10 |
| pageIndex | int | 否 | 否 | 页码 示例：1 |
| queryOrders | object | 是 | 否 | 排序设置 |
| field | string | 否 | 否 | 排序字段 示例：name |
| order | string | 否 | 否 | 升序还是倒序 示例：asc或者desc |
| condition | object | 否 | 否 | 查询条件 |
| simpleVOs | object | 是 | 否 | simpleVO查询条件 |

## 3. 请求示例

Url: /yonbip/digitalModel/vendorclassification/queryByPage?access_token=访问令牌
Body: {
	"data": "*",
	"page": {
		"pageSize": 10,
		"pageIndex": 1
	},
	"queryOrders": [
		{
			"field": "name",
			"order": "asc或者desc"
		}
	],
	"condition": {
		"simpleVOs": [
			{
				"field": "name",
				"op": "eq",
				"value1": "原材料供应商"
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| recordCount | int | 否 | 总条数 示例：25 |
| pageIndex | int | 否 | 当前页 示例：1 |
| pageSize | int | 否 | 每页条数 示例：10 |
| pageCount | string | 否 | 总页数 示例：3 |
| recordList | object | 是 | 数据集合 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"recordCount": 25,
		"pageIndex": 1,
		"pageSize": 10,
		"pageCount": "3",
		"recordList": [
			{
				"code": "FL-001",
				"name": "原材料供应商",
				"creator": "张三",
				"createDate": "2021-10-12 00:00:00",
				"order": "0",
				"isEnabled": "true",
				"isEnd": "true"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

310071	后端接口错误


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

