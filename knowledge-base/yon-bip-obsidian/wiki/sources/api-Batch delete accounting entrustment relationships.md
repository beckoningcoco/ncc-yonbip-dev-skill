---
title: "核算委托关系批量删除"
apiId: "c2fffedec8af4efdaf49e2d35796f47f"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Accounting Delegation"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accounting Delegation]
platform_version: "BIP"
source_type: community-api-docs
---

# 核算委托关系批量删除

> `ContentType	application/json` 请求方式	POST | 分类: Accounting Delegation (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/accountDelegate/batchDelete

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
| data | object | 是 | 否 | 数据集合 |
| id | string | 否 | 是 | 主键 示例：1295051792765184 |

## 3. 请求示例

Url: /yonbip/digitalModel/accountDelegate/batchDelete?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "1295051792765184"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 后端服务返回的数据部分 |
| successCountAI | long | 否 | 成功总数 示例：1 |
| failCountAI | long | 否 | 失败总数 示例：0 |
| count | long | 否 | 总数 示例：1 |
| sucessCount | long | 否 | 成功总数 示例：1 |
| failCount | long | 否 | 失败总数 示例：0 |
| messages | string | 是 | 返回信息 |
| infos | string | 是 | 详情 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | string | 否 | 异常级别，0：错误，1：警告 示例：0 |

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
	"level": "0"
}

## 6. 业务异常码

000-545-000514

根据id未查询到任何数据,请输入正确的id


## 7. 错误返回码

999	根据id未查询到任何数据,请输入正确的委托关系id


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

