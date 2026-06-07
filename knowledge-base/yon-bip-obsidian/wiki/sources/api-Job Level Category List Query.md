---
title: "职级类别列表查询"
apiId: "1814955451788820484"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Job Level Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Job Level Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 职级类别列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Job Level Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/bd_rank_type/list

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
| pageIndex | int | 否 | 否 | 页码 默认值：1 |
| name_code | string | 否 | 否 | 名称或编码，查询所有时设置为空 |
| pageSize | int | 否 | 否 | 每页大小 默认值：10 |

## 3. 请求示例

Url: /yonbip/digitalModel/bd_rank_type/list?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"name_code": "",
	"pageSize": 0
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 返回状态 |
| data | object | 否 | 业务数据 |
| pageIndex | int | 否 | 页码 |
| pageSize | int | 否 | 每页大小 |
| recordCount | int | 否 | 列表行数 |
| recordList | object | 是 | 列表数据 |
| pageCount | int | 否 | 分页总数 |
| beginPageIndex | long | 否 | 开始页码 |
| endPageIndex | long | 否 | 结束页码 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"recordCount": 0,
		"recordList": [
			{
				"code": "",
				"enable": 0,
				"name": {
					"en_US": "",
					"zh_TW": "",
					"zh_CN": ""
				},
				"memo": "",
				"id": "",
				"pubts": ""
			}
		],
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	查询失败


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

