---
title: "车型分页查询V3"
apiId: "2226871394074886151"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Vehicle Model"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Vehicle Model]
platform_version: "BIP"
source_type: community-api-docs
---

# 车型分页查询V3

> `ContentType	application/json` 请求方式	POST | 分类: Vehicle Model (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/basedoc/cartype/batchQueryDetail

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
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts开始时间 示例：2025-3-20 11:28:38 |
| endTs | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts结束时间 示例：2025-3-20 11:28:44 |
| ids | string | 是 | 否 | 主键ids集合 示例：["123","123321"] |
| vcode | string | 否 | 否 | 编码 示例：MPV |
| vname | string | 否 | 否 | 名称 示例：SUV |

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc/cartype/batchQueryDetail?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"startTs": "2025-3-20 11:28:38",
	"endTs": "2025-3-20 11:28:44",
	"ids": [
		"123",
		"123321"
	],
	"vcode": "MPV",
	"vname": "SUV"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回结果编码 示例：200 |
| success | boolean | 否 | 请求是否成功 示例：true |
| data | object | 否 | 响应体 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 页面编号 示例：0 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 页面大小 示例：10 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 记录数 示例：5 |
| recordList | object | 是 | 返回内容 |

## 5. 正确返回示例

{
	"code": "200",
	"success": true,
	"data": {
		"pageIndex": 0,
		"pageSize": 10,
		"recordCount": 5,
		"recordList": [
			{
				"id": "2139406412342099971",
				"vcode": "523",
				"vname": "5325",
				"vdesc": "MPV C612",
				"vtype": "4",
				"vuse": "1",
				"nload": 33,
				"nlength": 5,
				"nwidth": 2,
				"nheight": 1.5,
				"nvolume": 5,
				"volumetric": 200,
				"maxvolumetric": 20,
				"vunit": "1554602256549019654",
				"vunit___code": "TNE",
				"vunit___name": "吨",
				"vprecision": 4,
				"benable": "1",
				"sourceUnique": "2139406412342099971",
				"pubts": "2024-11-22 15:14:46"
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

车型分页查询

2	2025-07-29

更新

请求参数 pageIndex

更新

请求参数 pageSize

车型分页查询

3	2025-06-30

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

