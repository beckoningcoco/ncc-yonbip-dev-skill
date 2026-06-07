---
title: "深信服认证接口"
apiId: "2153583017144614913"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Mobile Configuration"
domain: "SYS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Mobile Configuration]
platform_version: "BIP"
source_type: community-api-docs
---

# 深信服认证接口

> `ContentType	application/json` 请求方式	POST | 分类: Mobile Configuration (SYS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/uspace/user/verifySxfToken

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
| sxfAuthToken | string | 否 | 是 | 深信服认证token |

## 3. 请求示例

Url: /yonbip/uspace/user/verifySxfToken?access_token=访问令牌
Body: {
	"sxfAuthToken": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 错误信息 示例：success |
| data | object | 否 | 数据 |
| yhtUserId | string | 否 | 用户ID |
| username | string | 否 | 用户名称 |
| tenantId | string | 否 | 租户ID |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": {
		"yhtUserId": "",
		"username": "",
		"tenantId": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-29

更新

请求说明

新增

返回参数 (6)

删除

返回参数 yhtUserId

删除

返回参数 username

删除

返回参数 tenantId


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

