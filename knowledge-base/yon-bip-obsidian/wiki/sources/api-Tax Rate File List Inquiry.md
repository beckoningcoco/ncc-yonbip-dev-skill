---
title: "税率档案列表查询"
apiId: "1588742384760913929"
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

# 税率档案列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Tax Rate Archive (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxpubdoc/openapi/taxRate/findListWithPage

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
| pageIndex | int | 否 | 否 | 页码（默认1） 示例：1 默认值：1 |
| pageSize | int | 否 | 否 | 每页条数（默认10） 示例：10 默认值：10 |
| name | string | 否 | 否 | 税率名称 示例：增值税 |
| code | string | 否 | 否 | 编码 示例：VAT10 |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxpubdoc/openapi/taxRate/findListWithPage?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"name": "增值税",
	"code": "VAT10"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 接口返回状态 示例：200 |
| message | string | 否 | 接口状态描述 示例：操作成功 |
| data | object | 否 | 数据对象 |
| pageIndex | long | 否 | 页码 示例：1 |
| pageSize | long | 否 | 页大小 示例：10 |
| recordCount | long | 否 | 总记录数 示例：11 |
| recordList | object | 是 | 记录数据列表 |
| pageCount | long | 否 | 页数 示例：2 |
| beginPageIndex | long | 否 | 开始页码 示例：1 |
| endPageIndex | long | 否 | 结束页码 示例：2 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 11,
		"recordList": [
			{
				"code": "NO VAT",
				"taxRateType": 2,
				"ytenantId": "0",
				"taxBureauArchiveId": "10000",
				"taxCategoryArchiveId": "10000",
				"dr": 0,
				"enable": 1,
				"name": "不征税",
				"isGlobal": "Y",
				"effectiveDate": "2019-04-01",
				"ntaxrate": 0.03,
				"scope": 1,
				"taxfree": true,
				"notaxation": false,
				"id": "10000",
				"pubts": "2022-10-27 20:03:56",
				"invalidationDate": "2022-10-26"
			}
		],
		"pageCount": 2,
		"beginPageIndex": 1,
		"endPageIndex": 2
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	未知错误	入参不正确或服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-08-15

删除

请求参数 enable

删除

请求参数 pubts

删除

请求参数 countryCode

删除

返回参数 taxCategoryArchiveId_name

删除

返回参数 createTime

2	2025-08-06

新增

请求参数 countryCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

