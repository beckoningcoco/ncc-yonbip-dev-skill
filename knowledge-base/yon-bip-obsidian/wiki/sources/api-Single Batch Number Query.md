---
title: "批次号单个查询"
apiId: "62b9e302456b463489c91cfc0967968b"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Batch No. Card"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Batch No. Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 批次号单个查询

> `ContentType	application/json` 请求方式	POST | 分类: Batch No. Card (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/batchno/report/list

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
| pageIndex | long | 否 | 否 | 页号 示例：1 |
| pageSize | long | 否 | 否 | 每页行数 示例：10 |
| productsku | long | 是 | 否 | 物料 示例：[1896304770339329] |
| open_pubts_begin | string | 否 | 否 | 开始时间（时间戳） 示例：2021-02-23 00:00:00.000 |
| open_pubts_end | string | 否 | 否 | 结束时间（时间戳） 示例：2021-02-23 23:59:59.999 |
| freeKey | string | 否 | 否 | 规格 示例：200ml |
| batchno | string | 否 | 否 | 批号 示例：345werewr |

## 3. 请求示例

Url: /yonbip/scm/batchno/report/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"productsku": [
		1896304770339329
	],
	"open_pubts_begin": "2021-02-23 00:00:00.000",
	"open_pubts_end": "2021-02-23 23:59:59.999",
	"freeKey": "200ml",
	"batchno": "345werewr"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| pageIndex | int | 否 | 当前页 |
| pageSize | int | 否 | 分页大小 |
| pageCount | int | 否 | 页数 |
| beginPageIndex | int | 否 | 查询开始页码 |
| endPageIndex | int | 否 | 查询结束页 |
| recordCount | int | 否 | 总记录数 |
| pubts | string | 否 | 时间戳字符串 |
| recordList | object | 是 | 返回结果对象 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0,
		"recordCount": 0,
		"pubts": "",
		"recordList": [
			{
				"product": "",
				"product_cCode": "",
				"product_cName": "",
				"productsku": "",
				"productsku_cCode": "",
				"productsku_skuName": "",
				"retailskus_productSku": "",
				"retailskus_free1": "",
				"retailskus_free2": "",
				"retailskus_free3": "",
				"retailskus_free4": "",
				"retailskus_free5": "",
				"retailskus_free6": "",
				"expireDateNo": "",
				"expireDateUnit": "",
				"retailskus_free7": "",
				"retailskus_free8": "",
				"retailskus_free9": "",
				"retailskus_free10": "",
				"skuvalue": "",
				"batchno": "",
				"producedate": "",
				"invaliddate": "",
				"stopstatus": "",
				"define1": "",
				"define2": "",
				"define3": "",
				"define4": "",
				"define5": "",
				"define6": "",
				"define7": "",
				"define8": "",
				"define9": "",
				"define10": "",
				"define11": "",
				"define12": "",
				"define13": "",
				"define14": "",
				"define15": "",
				"define16": "",
				"define17": "",
				"define18": "",
				"define19": "",
				"define20": "",
				"define21": "",
				"define22": "",
				"define23": "",
				"define24": "",
				"define25": "",
				"define26": "",
				"define27": "",
				"define28": "",
				"define29": "",
				"define30": "",
				"id": 0,
				"pubts": "",
				"firstStoredDate": ""
			}
		]
	}
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

