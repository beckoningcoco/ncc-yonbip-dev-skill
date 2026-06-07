---
title: "数据签名-验证"
apiId: "1856673929424797697"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "E-signature Configuration"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, E-signature Configuration]
platform_version: "BIP"
source_type: community-api-docs
---

# 数据签名-验证

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/uspace/rest/v1/sign/data/verify

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
| oriData | string | 否 | 是 | 待签名原文，base64编码后的数据 示例：JTdCJTIyYSUyMiUzQSUyMmxhbGFsYSUyMiU3RA== |
| signData | string | 否 | 是 | 签名后的数据 示例：SlRkQ0pUSXlZU1V5TWlVelFTVXlNbXhoYkdGc1lTVXlNaVUzUkElM0QlM0Q= |

## 3. 请求示例

Url: /yonbip/uspace/rest/v1/sign/data/verify?access_token=访问令牌
Body: {
	"oriData": "JTdCJTIyYSUyMiUzQSUyMmxhbGFsYSUyMiU3RA==",
	"signData": "SlRkQ0pUSXlZU1V5TWlVelFTVXlNbXhoYkdGc1lTVXlNaVUzUkElM0QlM0Q="
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| certInfo | object | 否 | 证书信息，非签名数据无该返回字段 |
| signDate | string | 否 | 签名时间，非签名数据无该返回字段 示例：2023-11-01 11:29:00 |
| verify | boolean | 否 | 验证是否通过 true 是 false 否 示例：true |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"certInfo": {
			"sn": "68B2 xxxx xxxx xxxx xxxx CxxF",
			"cn": "xxx公司",
			"beforeDate": "2021-11-01 11:29:00",
			"endDate": "2025-11-01 11:29:00"
		},
		"signDate": "2023-11-01 11:29:00",
		"verify": true
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	接口调用错误	接口调用错误


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

