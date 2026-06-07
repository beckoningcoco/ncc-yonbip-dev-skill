---
title: "车型批量删除结果查询-新集成"
apiId: "2226950206724767748"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Vehicle Model"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Vehicle Model]
platform_version: "BIP"
source_type: community-api-docs
---

# 车型批量删除结果查询-新集成

> `ContentType	application/json` 请求方式	GET | 分类: Vehicle Model (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/basedoc/async/cartype/batchDelete/getAsyncResult/{jobId}

请求方式	GET

ContentType	application/json

应用场景	开放API/集成API

API类别	详情批量查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| jobId | string | path | 是 | 任务ID |

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc/async/cartype/batchDelete/getAsyncResult/{jobId}?access_token=访问令牌

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| data | object | 否 | 返回结构体 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 操作数据量 示例：1 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败数 示例：0 |
| messages | object | 是 | 失败数据信息 |
| infos | object | 是 | 消息体 |
| sourceUnique | string | 否 | 源系统唯一键 示例：2203949179401666565 |
| targetUnique | string | 否 | 目标系统唯一键 示例：2203949179401666565 |
| id | string | 否 | 数据主键 示例：2203949179401666565 |
| displayCode | string | 否 | 业务异常码 示例：000-525-000101 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"count": 1,
		"successCount": 1,
		"failCount": 0,
		"messages": [
			{
				"sourceUnique": "2203949179401666565",
				"message": "数据被使⽤不能删除！"
			}
		]
	},
	"infos": [
		{
			"sourceUnique": "2203949179401666565",
			"targetUnique": "2203949179401666565",
			"id": "2203949179401666565"
		}
	],
	"displayCode": "000-525-000101",
	"level": 0
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-01

新增

返回参数 displayCode

新增

返回参数 level


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

