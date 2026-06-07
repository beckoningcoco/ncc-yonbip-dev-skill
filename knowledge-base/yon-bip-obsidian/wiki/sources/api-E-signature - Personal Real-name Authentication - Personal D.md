---
title: "电子签-个人实名认证-个人数字签名"
apiId: "1852255069516333058"
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

# 电子签-个人实名认证-个人数字签名

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/rest/signature/user

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
| oriData | string | 否 | 是 | 待签名原文，base64编码后的数据 示例：132 |
| bizNo | string | 否 | 是 | 业务单据Id，用于标示对哪个业务进行加签，与当前加签进行绑定(限长64) 示例：654321 |
| userId | string | 否 | 是 | 用户Id 示例：3a77a5eb-d353-4d54-abfc-732d56172c89 |

## 3. 请求示例

Url: /yonbip/digitalModel/rest/signature/user?access_token=访问令牌
Body: {
	"oriData": "132",
	"bizNo": "654321",
	"userId": "3a77a5eb-d353-4d54-abfc-732d56172c89"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | int | 否 | 返回编码 示例：0 |
| msg | string | 否 | 返回信息 示例：success |
| data | object | 否 | 返回数据 |
| signId | string | 否 | 签名事件ID 示例：698715386db245e78c9cc771ecf5a0c2 |
| signData | string | 否 | 加签后的数据 示例：Njk4NzE1Mzg2ZGIyNDVlNzhjOWNjNzcxZWNmNWEwYzIpgXU+qYPqZblQmFyJ5dmzLpSqF6uT9ZkKX4HUESeIpDFsUZ7JrQ1AcumcsLGBP+o4oVOpjVP+IBmT7OdkfHBf+yWeoEfnwq5Iokx+VJrZd2NY9diiu2WnfFh6G7HV2d/krzbKh/KH/7Fqidb0CrkA8i89gt9He0CmxogpJw+76XV9TCY892gxuZCqzLeud4JTq0bk5O/LlJjjqPTq/Uv |

## 5. 正确返回示例

{
	"code": 0,
	"msg": "success",
	"data": {
		"signId": "698715386db245e78c9cc771ecf5a0c2",
		"signData": "Njk4NzE1Mzg2ZGIyNDVlNzhjOWNjNzcxZWNmNWEwYzIpgXU+qYPqZblQmFyJ5dmzLpSqF6uT9ZkKX4HUESeIpDFsUZ7JrQ1AcumcsLGBP+o4oVOpjVP+IBmT7OdkfHBf+yWeoEfnwq5Iokx+VJrZd2NY9diiu2WnfFh6G7HV2d/krzbKh/KH/7Fqidb0CrkA8i89gt9He0CmxogpJw+76XV9TCY892gxuZCqzLeud4JTq0bk5O/LlJjjqPTq/Uv"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

-1	用户不存在	用户不存在

1000	统一错误码值，"租户下未设置运营商标识，或者当前运营商不支持加签操作，请联系相关人员处理"或者是"当前用户在第三方不存在，无法进行加签操作"	统一错误码值，"租户下未设置运营商标识，或者当前运营商不支持加签操作，请联系相关人员处理"或者是"当前用户在第三方不存在，无法进行加签操作"


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

