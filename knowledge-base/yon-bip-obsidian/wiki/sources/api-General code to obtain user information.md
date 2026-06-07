---
title: "通用code获取用户信息"
apiId: "1471472339899121665"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Enterprise Information"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Enterprise Information]
platform_version: "BIP"
source_type: community-api-docs
---

# 通用code获取用户信息

> `ContentType	application/json` 请求方式	GET | 分类: Enterprise Information (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/userCode/getByCode

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| code | string | query | 是 | 在通用code单点方案中，调用生成code接口后生成的临时code    示例: xPwueLq5NLfCReHx7nzg |

## 3. 请求示例

Url: /yonbip/digitalModel/userCode/getByCode?access_token=访问令牌&code=xPwueLq5NLfCReHx7nzg

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| message | string | 否 | 接口调用信息 |
| code | string | 否 | 接口调用情况，200代表成功 |
| data | object | 否 | 调用接口返回数据 |
| userId | string | 否 | 友户通的用户id |
| mobile | string | 否 | 用户手机，根据客户端密钥加密，可能为空 |
| email | string | 否 | 用户邮箱，根据客户端密钥加密，可能为空 |
| tenantId | string | 否 | 友户通租户id |
| ts | string | 否 | 时间戳 |

## 5. 正确返回示例

{
	"message": "",
	"code": "",
	"data": {
		"userId": "",
		"mobile": "",
		"email": "",
		"tenantId": "",
		"ts": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

0	查询失败，code不存在或已过期


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

