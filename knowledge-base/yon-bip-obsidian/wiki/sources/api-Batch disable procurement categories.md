---
title: "采购品类批量停用"
apiId: "1840911639971889156"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Procurement Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Procurement Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购品类批量停用

> `ContentType	application/json` 请求方式	POST | 分类: Procurement Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/purchaseclass/batchstop

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| codeList | string | 是 | 是 | 采购品类编码 示例：["code01"] |

## 3. 请求示例

Url: /yonbip/digitalModel/purchaseclass/batchstop?access_token=访问令牌
Body: {
	"codeList": [
		"code01"
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 操作结果信息 示例：处理成功 |
| data | object | 是 | 操作数据 |
| id | long | 否 | 采购品类id 示例：1924448344543488 |
| stopStatus | boolean | 否 | 状态 示例：true |

## 5. 正确返回示例

{
	"code": "200",
	"message": "处理成功",
	"data": [
		{
			"id": 1924448344543488,
			"stopStatus": true
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


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

