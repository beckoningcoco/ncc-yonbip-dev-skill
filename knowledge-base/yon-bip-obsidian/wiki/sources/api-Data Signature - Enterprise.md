---
title: "数据签名-企业"
apiId: "1856668629435154438"
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

# 数据签名-企业

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/uspace/rest/v1/sign/company/data/do

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
| accountId | string | 否 | 否 | 所使用用户的用户ID 示例：1804444444444444770 |
| companyId | string | 否 | 是 | 所使用企业证书的企业ID 示例：18044333333333444770 |
| oriData | string | 否 | 是 | 待签名原文，base64编码后的数据 示例：JTdCJTIyYSUyMiUzQSUyMmxhbGFsYSUyMiU3RA== |

## 3. 请求示例

Url: /yonbip/uspace/rest/v1/sign/company/data/do?access_token=访问令牌
Body: {
	"accountId": "1804444444444444770",
	"companyId": "18044333333333444770",
	"oriData": "JTdCJTIyYSUyMiUzQSUyMmxhbGFsYSUyMiU3RA=="
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| signId | string | 否 | 签名事件ID 示例：18042222222222244770 |
| signData | string | 否 | 签名结果,base64编码结果 示例：SlRkQ0pUSXlZU1V5TWlVelFTVXlNbXhoYkdGc1lTVXlNaVUzUkElM0QlM0Q= |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"signId": "18042222222222244770",
		"signData": "SlRkQ0pUSXlZU1V5TWlVelFTVXlNbXhoYkdGc1lTVXlNaVUzUkElM0QlM0Q="
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

