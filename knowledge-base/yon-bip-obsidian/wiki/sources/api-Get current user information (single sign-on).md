---
title: "获取当前用户信息（免登）"
apiId: "3feee9d921544b329c159f95c84afb62"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Mobile Configuration"
domain: "SYS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Mobile Configuration]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取当前用户信息（免登）

> `ContentType` 请求方式	GET | 分类: Mobile Configuration (SYS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/uspace/user/getuserInfo

请求方式	GET

ContentType

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| code | string | query | 是 | 免登code |

## 3. 请求示例

Url: /yonbip/uspace/user/getuserInfo?access_token=访问令牌&code=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 错误信息 示例：success |
| data | object | 否 | 数据 |
| staff_no | string | 否 | 员工编码 |
| status | string | 否 | 员工状态 |
| out_status | string | 否 | 外部用户状态 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": {
		"staff_no": "",
		"status": "",
		"out_status": ""
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

返回参数 code

新增

返回参数 message

新增

返回参数 data


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

