---
title: "业务单元删除"
apiId: "05586ca718bd46aab0f17defacbd7b8f"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Business Unit"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Unit]
platform_version: "BIP"
source_type: community-api-docs
---

# 业务单元删除

> `ContentType	application/json` 请求方式	POST | 分类: Business Unit (PF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/delete

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	单条删除

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 否 | 数据集合 |
| id | string | 否 | 是 | 业务单元主键 示例：1432022457798912 |

## 3. 请求示例

Url: /yonbip/digitalModel/delete?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "1432022457798912"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 后端服务返回的数据部分 |
| successCountAI | long | 否 | 预计执行成功数量 示例：2 |
| failCountAI | long | 否 | 预计执行失败数量 示例：0 |
| count | long | 否 | 总数量 示例：2 |
| sucessCount | long | 否 | 成功数量 示例：2 |
| failCount | long | 否 | 失败数量 示例：0 |
| messages | string | 是 | 每条数据提示信息 |
| infos | string | 是 | 信息 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"successCountAI": 2,
		"failCountAI": 0,
		"count": 2,
		"sucessCount": 2,
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

000-545-000520

id不能为空

000-545-000512

查询数据为空

000-545-000514

根据id未查询到任何数据,请输入正确的id


## 7. 错误返回码

200	该组织是启用状态，请先停用才能删除


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

