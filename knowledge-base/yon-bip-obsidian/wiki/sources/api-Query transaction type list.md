---
title: "查询交易类型列表"
apiId: "e904b84db98247fa9cf0d9aac5caadf7"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Transaction Type"
domain: "BMM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Transaction Type]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询交易类型列表

> `ContentType	application/json` 请求方式	POST | 分类: Transaction Type (BMM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/transtype/list

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
| page | object | 否 | 是 | 分页设置 |
| pageIndex | int | 否 | 是 | 页号 示例：1 |
| pageSize | int | 否 | 是 | 每页行数 示例：10 |
| path | string | 否 | 是 | 单据类型ID，可根据单据类型树查询接口的结果中的id值获取 示例：1842495244587264 |
| externalData | object | 否 | 否 | 扩展参数 |
| pubts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 时间戳(查询大于该时间的数据时间戳(查询大于该时间的数据)) |
| enable | string | 否 | 否 | 停用启用状态（1：启用，2：停用） |

## 3. 请求示例

Url: /yonbip/digitalModel/transtype/list?access_token=访问令牌
Body: {
	"page": {
		"pageIndex": 1,
		"pageSize": 10
	},
	"path": "1842495244587264",
	"externalData": {
		"pubts": "2026-06-07 11:40:45",
		"enable": ""
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 返回消息 示例：操作成功 |
| data | object | 否 | 分页信息 |
| pageIndex | long | 否 | 起始数据 示例：1 |
| pageSize | long | 否 | 页面大小 示例：3 |
| recordCount | long | 否 | 数据总数 示例：6 |
| recordList | object | 是 | 分页数据 |
| pageCount | long | 否 | 页面总数 示例：2 |
| beginPageIndex | long | 否 | 起始页面 示例：1 |
| endPageIndex | long | 否 | 结束页面 示例：2 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 3,
		"recordCount": 6,
		"recordList": [
			{
				"code": "A01001",
				"billtype_id": "101",
				"memo": {
					"zh_TW": "現銷",
					"en_US": "Cash Sale",
					"zh_CN": "现销"
				},
				"preset": 1,
				"default": "1",
				"enable": 1,
				"name": {
					"zh_TW": "現銷",
					"en_US": "Cash Sale",
					"zh_CN": "现销"
				},
				"id": "10000001",
				"pubts": "2020-10-16 02:21:14"
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

