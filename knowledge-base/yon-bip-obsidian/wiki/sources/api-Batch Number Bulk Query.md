---
title: "批次号批量查询"
apiId: "1613076681600794629"
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

# 批次号批量查询

> `ContentType	application/json` 请求方式	POST | 分类: Batch No. Card (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/batchno/report/listbatch

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
| pageIndex | long | 否 | 是 | 页号 示例：1 |
| pageSize | long | 否 | 是 | 每页行数 示例：10 |
| product | long | 是 | 否 | 物料 示例：[1896304770339319] |
| productsku | long | 是 | 否 | 物料sku 示例：[1896304770339329] |
| open_pubts_begin | string | 否 | 否 | 开始时间（时间戳） 示例：2021-02-23 00:00:00.000 |
| open_pubts_end | string | 否 | 否 | 结束时间（时间戳） 示例：2021-02-23 23:59:59.999 |
| freeKey | string | 否 | 否 | 规格 示例：200ml |
| batchno | string | 是 | 否 | 批号 示例：["345werewr"] |

## 3. 请求示例

Url: /yonbip/scm/batchno/report/listbatch?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"product": [
		1896304770339319
	],
	"productsku": [
		1896304770339329
	],
	"open_pubts_begin": "2021-02-23 00:00:00.000",
	"open_pubts_end": "2021-02-23 23:59:59.999",
	"freeKey": "200ml",
	"batchno": [
		"345werewr"
	]
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
		"recordList": [
			{
				"product": 0,
				"product_cCode": "",
				"product_cName": "",
				"productsku": 0,
				"productsku_cCode": "",
				"productsku_skuName": "",
				"retailskus_productSku": 0,
				"retailskus_free1": "",
				"expireDateNo": 0,
				"expireDateUnit": 0,
				"batchno": "",
				"producedate": "",
				"invaliddate": "",
				"stopstatus": true,
				"define1": "",
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

999	服务端逻辑异常


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

