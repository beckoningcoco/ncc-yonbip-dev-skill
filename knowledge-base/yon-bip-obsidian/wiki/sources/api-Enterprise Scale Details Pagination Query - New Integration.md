---
title: "企业规模详情分页查询-新集成"
apiId: "2173675174705496068"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Size"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Size]
platform_version: "BIP"
source_type: community-api-docs
---

# 企业规模详情分页查询-新集成

> `ContentType	application/json` 请求方式	POST | 分类: Size (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/companyscale/batchQueryDetail

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	列表查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 页码 示例：1 默认值：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 页大小 示例：10 默认值：10 |
| startTs | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts开始时间 示例：2023-09-18 17:08:16 |
| endTs | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts结束时间 示例：2023-09-18 17:08:36 |
| ids | string | 是 | 否 | 主键id集合 示例：["1487826003516456962","1487826166735699974"] |
| code | string | 否 | 否 | 编码 示例：1 |
| name | string | 否 | 否 | 名称 示例：大型企业 |

## 3. 请求示例

Url: /yonbip/digitalModel/companyscale/batchQueryDetail?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"startTs": "2023-09-18 17:08:16",
	"endTs": "2023-09-18 17:08:36",
	"ids": [
		"1487826003516456962",
		"1487826166735699974"
	],
	"code": "1",
	"name": "大型企业"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| data | object | 否 | 返回数据 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 当前页数 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 每行页数 示例：10 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 总数 示例：1 |
| recordList | object | 是 | 处理数据 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 1,
		"recordList": [
			{
				"id": "1487826003516456962",
				"code": "1",
				"name": {
					"zh_CN": "大型企业",
					"en_US": "Large enterprise",
					"zh_TW": "大型企業"
				},
				"enable": 1,
				"log": "",
				"pubts": "2023-09-18 17:08:16"
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

1	2026-01-15

更新

请求说明

2	2025-07-29

更新

请求参数 pageIndex

更新

请求参数 pageSize

企业规模详情分页查询


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

