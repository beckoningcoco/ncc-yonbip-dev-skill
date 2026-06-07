---
title: "币种停用"
apiId: "0528797d47744c69af903a02422e9add"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Currency"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Currency]
platform_version: "BIP"
source_type: community-api-docs
---

# 币种停用

> `ContentType	application/json` 请求方式	POST | 分类: Currency (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/currency/disable

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
| data | object | 否 | 是 | 业务数据 |
| id | string | 否 | 是 | 币种ID 示例：234345453553345 |

## 3. 请求示例

Url: /yonbip/digitalModel/currency/disable?access_token=访问令牌
Body: {
	"data": {
		"id": "234345453553345"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | int | 否 | 状态码 示例：200 |
| message | string | 否 | 返回消息 示例：操作成功 |
| data | object | 否 | 业务数据 |
| enable | int | 否 | 启用状态 1-启用 2停用 |
| id | string | 否 | 币种ID |
| pubts | string | 否 | 时间戳， yyyy-MM-dd HH:mm:ss |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"enable": 0,
		"id": "",
		"pubts": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	操作失败


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

