---
title: "生产入库委托关系批量删除"
apiId: "f293e57722b74939bb27afc1c1aae1f8"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Production Receipt Delegation"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Production Receipt Delegation]
platform_version: "BIP"
source_type: community-api-docs
---

# 生产入库委托关系批量删除

> `ContentType	application/json` 请求方式	POST | 分类: Production Receipt Delegation (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/productstorageDelegate/delete

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
| id | string | 否 | 是 | 主键 示例：2342204613071104 |

## 3. 请求示例

Url: /yonbip/digitalModel/productstorageDelegate/delete?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "2342204613071104"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 数据 |
| successCountAI | long | 否 | 成功删除数量 示例：1 |
| failCountAI | long | 否 | 失败数量 示例：0 |
| count | long | 否 | 总操作数据数量 示例：1 |
| sucessCount | long | 否 | 成功数 示例：1 |
| failCount | long | 否 | 失败数 示例：0 |
| messages | string | 是 | 具体信息 |
| infos | string | 是 | 具体信息 |
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

