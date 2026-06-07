---
title: "标准工序列表查询"
apiId: "08a58804e17c4122bf98f2b0f6eb2847"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Standard Operation"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Standard Operation]
platform_version: "BIP"
source_type: community-api-docs
---

# 标准工序列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Standard Operation (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/mfg/operation/list

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | int | 否 | 是 | 当前页，默认当前页为1 示例：1 默认值：1 |
| pageSize | int | 否 | 是 | 每页数目，默认每页10条数据 示例：10 默认值：10 |
| orgId | long | 否 | 否 | 组织id 示例：1866605942198528 |
| orgCode | string | 否 | 否 | 组织编码 示例：global00 |
| code | string | 否 | 否 | 标准序列编码 示例：GX-107 |
| name | string | 否 | 否 | 标准工序名称 示例：脱水工序 |
| stopstatus | boolean | 否 | 否 | 启用状态。true:停用；false:启用。 示例：false |
| operationGroup | string | 否 | 否 | 工序组 示例：装配 |
| pubts | string | 否 | 否 | 时间戳 示例：2024-05-06 23:10:00|2024-05-08 12:09:00 |

## 3. 请求示例

Url: /yonbip/mfg/operation/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"orgId": 1866605942198528,
	"orgCode": "global00",
	"code": "GX-107",
	"name": "脱水工序",
	"stopstatus": false,
	"operationGroup": "装配",
	"pubts": "2024-05-06 23:10:00|2024-05-08 12:09:00"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 接口调用返回码，成功时返回200 示例：200 |
| message | string | 否 | 接口调用返回信息 示例：操作成功 |
| data | object | 否 | 接口调用返回数据 |
| pageIndex | long | 否 | 当前页数 示例：1 |
| pageSize | long | 否 | 每页条数 示例：10 |
| recordCount | long | 否 | 总条数 示例：144 |
| recordList | object | 是 | 数据集合 |
| pageCount | long | 否 | 总页数 示例：15 |
| beginPageIndex | long | 否 | 开始页码 示例：1 |
| endPageIndex | long | 否 | 结束页码 示例：10 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 144,
		"recordList": [
			{
				"orgId": 2107085234802944,
				"orgId_name": "qing-002工厂",
				"id": 2265729731057408,
				"code": "GX-220",
				"name": "脱水工序",
				"isMonitorPoint": 0,
				"isReportPoint": 0,
				"prepareTime": "1",
				"processTime": "1",
				"timeUnit": 1,
				"stopstatus": false,
				"creatorId": 2107058342072576,
				"creator": "张汉卿",
				"createTime": "2021-05-20 13:39:28",
				"createDate": "2021-05-20 00:00:00",
				"modifierId": "2107058342072576",
				"modifier": "15810437080",
				"modifyDate": "2021-07-09 00:00:00",
				"modifyTime": "2021-07-09 16:13:16",
				"pubts": "2021-05-20 13:39:28"
			}
		],
		"pageCount": 15,
		"beginPageIndex": 1,
		"endPageIndex": 10
	}
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

