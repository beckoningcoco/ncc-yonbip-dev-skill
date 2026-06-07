---
title: "异步进度查询"
apiId: "2459448717890551815"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer]
platform_version: "BIP"
source_type: community-api-docs
---

# 异步进度查询

> `ContentType	application/json` 请求方式	POST | 分类: Customer (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/PFC/bill/getProgress

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| asyncKey | string | query | 是 | 异步标识    示例: delete_6FEF2DBA-7625-332C-C0C2-54008184AF5C |

## 3. 请求示例

Url: /yonbip/PFC/bill/getProgress?access_token=访问令牌&asyncKey=delete_6FEF2DBA-7625-332C-C0C2-54008184AF5C

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 请求结果状态码，200：成功，其它：失败 示例：200 |
| message | string | 否 | 请求结果信息 示例：操作成功 |
| data | object | 否 | 请求结果数据 |
| code | long | 否 | 请求结果状态码 示例：200 |
| flag | long | 否 | 请求结果标识 示例：1 |
| failCount | long | 否 | 失败条数 示例：0 |
| percentage | string | 否 | 删除进度，范围1-100 示例：57 |
| count | long | 否 | 总条数 示例：0 |
| successCount | long | 否 | 成功条数 示例：0 |
| totalCount | long | 否 | 总条数 示例：6 |
| infos | string | 是 | 操作结果信息 |
| message | string | 是 | 操作结果信息 |
| data | object | 否 | 请求结果数据 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"code": 200,
		"flag": 1,
		"failCount": 0,
		"percentage": "57",
		"count": 0,
		"successCount": 0,
		"totalCount": 6,
		"infos": [
			""
		],
		"message": [
			""
		],
		"data": {
			"messages": [
				""
			],
			"infos": [
				""
			]
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员。


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

