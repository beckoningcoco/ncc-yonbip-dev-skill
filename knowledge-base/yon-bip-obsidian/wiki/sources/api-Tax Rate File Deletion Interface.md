---
title: "税率档案删除接口"
apiId: "1588745752015273990"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tax Rate Archive"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax Rate Archive]
platform_version: "BIP"
source_type: community-api-docs
---

# 税率档案删除接口

> `ContentType	application/json` 请求方式	POST | 分类: Tax Rate Archive (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxpubdoc/openapi/taxRate/delete

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
| data | object | 是 | 是 | 待删除数据 |
| id | string | 否 | 是 | id 示例：10000 |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxpubdoc/openapi/taxRate/delete?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "10000"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 接口返回状态 示例：200 |
| message | string | 否 | 操作结果 示例：操作成功 |
| data | object | 否 | 删除返回结果 |
| successCount | long | 否 | 删除成功数 示例：0 |
| count | long | 否 | 数据量 示例：1 |
| failCount | long | 否 | 删除失败数 示例：5 |
| infos | object | 否 | 成功信息 |
| failInfos | object | 是 | 失败对象 |
| messages | object | 否 | 错误信息 示例：报错信息 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"successCount": 0,
		"count": 1,
		"failCount": 5,
		"infos": {
			"taxBureauArchiveId": "10000",
			"taxCategoryArchiveId": "10000",
			"id": "10000",
			"taxRateType": "1",
			"code": "VAT17",
			"name": {
				"zh_CN": "增值税",
				"en_US": "VAT",
				"zh_TW": "增值稅"
			},
			"ntaxrate": "0.03",
			"taxfree": true,
			"notaxation": false,
			"currency": "10000",
			"unit": "10000",
			"scope": 1,
			"effectiveDate": "2022-10-26",
			"invalidationDate": "2022-10-26",
			"ytenantId": "10000",
			"tenantid": "10000",
			"isGlobal": "N",
			"enable": 0,
			"dr": "0"
		},
		"failInfos": [
			{
				"code": "VAT11",
				"id": "10000",
				"name": "增值税11",
				"message": "预置的税率档案不能删除"
			}
		],
		"messages": "报错信息"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	未知错误	入参不正确或服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-08-15

更新

返回参数 (5)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

