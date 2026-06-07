---
title: "销售委托关系批量删除"
apiId: "25a8854e58514e328ad910b951eee9e7"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Delegation"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Delegation]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售委托关系批量删除

> `ContentType	application/json` 请求方式	POST | 分类: Sales Delegation (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/salesDelegate/batchDelete

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
| data | object | 是 | 否 | 请求数据 |
| id | string | 否 | 是 | 主键 示例：2352290713604352 |

## 3. 请求示例

Url: /yonbip/digitalModel/salesDelegate/batchDelete?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "2352290713604352"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 响应码 示例：200 |
| message | string | 否 | 响应内容 示例：操作成功 |
| data | object | 否 | 响应数据 |
| successCountAI | long | 否 | 成功总数 示例：1 |
| failCountAI | long | 否 | 失败总数 示例：0 |
| count | long | 否 | 总数 示例：1 |
| sucessCount | long | 否 | 成功总数 示例：1 |
| failCount | long | 否 | 失败总数 示例：0 |
| messages | string | 是 | 返回信息 |
| infos | string | 是 | 详情 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

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
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-000514

根据id未查询到任何数据,请输入正确的id


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-02

新增

返回参数 displayCode

新增

返回参数 level


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

