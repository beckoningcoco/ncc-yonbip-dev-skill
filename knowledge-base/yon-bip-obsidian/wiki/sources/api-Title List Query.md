---
title: "职务列表查询"
apiId: "3416bd7399024a98864f80d7d7dec529"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Title"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Title]
platform_version: "BIP"
source_type: community-api-docs
---

# 职务列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Title (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/duty/list

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
| pageIndex | int | 否 | 是 | 页码 默认值：1 |
| jobType | string | 否 | 否 | 职务类别ID或编码 |
| pageSize | int | 否 | 是 | 每页大小 默认值：10 |
| pubts | string | 否 | 否 | 时间戳 示例：2023-11-02 21:50:12 |
| name,code | string | 否 | 否 | 名称或编码 |

## 3. 请求示例

Url: /yonbip/digitalModel/duty/list?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"jobType": "",
	"pageSize": 0,
	"pubts": "2023-11-02 21:50:12",
	"name,code": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码，200成功 示例：200 |
| message | string | 否 | 返回状态 示例：操作成功 |
| data | object | 否 | 业务数据 |
| pageIndex | int | 否 | 页码 |
| pageSize | int | 否 | 每页大小 |
| recordCount | int | 否 | 列表行数 |
| recordList | object | 是 | 列表数据 |
| pageCount | long | 否 | 页码总数 |
| beginPageIndex | int | 否 | 开始页码 |
| endPageIndex | int | 否 | 结束页码 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"recordCount": 0,
		"recordList": [
			{
				"jobtype_id_name": "",
				"code": "",
				"enable": 0,
				"name": "",
				"id": "",
				"jobtype_id": "",
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

