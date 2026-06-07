---
title: "款项类型批量删除"
apiId: "2178963018158702596"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payment Type"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Type]
platform_version: "BIP"
source_type: community-api-docs
---

# 款项类型批量删除

> `ContentType	application/json` 请求方式	POST | 分类: Payment Type (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/bd/v1/paymentType/batchDelete

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
| ids | string | 否 | 否 | id列表 默认值：多个值，逗号分隔 |

## 3. 请求示例

Url: /yonbip/AMP/bd/v1/paymentType/batchDelete?access_token=访问令牌
Body: {
	"ids": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| success | boolean | 否 | success 示例：true |
| message | string | 否 | message |
| data | object | 否 | data |
| errorMap | string | 否 | 错误列表 |
| changed | number |
| 小数位数:0,最大长度:10 | 否 | 实际删除记录数量 示例：1 |
| total | number |
| 小数位数:0,最大长度:10 | 否 | 预记录数量 示例：1 |

## 5. 正确返回示例

{
	"code": 200,
	"success": true,
	"message": "",
	"data": {
		"errorMap": "",
		"changed": 1
	},
	"total": 1
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码


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

