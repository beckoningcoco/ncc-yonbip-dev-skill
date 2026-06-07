---
title: "删除结果查询"
apiId: "2489677350537527297"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Customer"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer]
platform_version: "BIP"
source_type: community-api-docs
---

# 删除结果查询

> `ContentType` 请求方式	GET | 分类: Customer (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/PFC/batchDelete/getAsyncResult/{jobId}

请求方式	GET

ContentType

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| jobId | string | path | 是 | 任务ID |

## 3. 请求示例

Url: /yonbip/PFC/batchDelete/getAsyncResult/{jobId}?access_token=访问令牌

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 请求结果状态码，200：成功，其它：失败 示例：200 |
| data | object | 否 | 请求结果数据 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总条数 示例：0 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功条数 示例：0 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败条数 示例：0 |
| messages | object | 是 | 失败数据信息 |
| infos | object | 是 | 操作结果信息 |
| displayCode | string | 否 | 业务异常码 示例：000-525-000066 |
| level | number |
| 小数位数:0,最大长度:2 | 否 | 异常级别 示例：0：错误，1：警告 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"count": 0,
		"successCount": 0,
		"failCount": 0,
		"messages": [
			{
				"sourceUnique": "2179483104347947010",
				"message": "数据被使⽤不能删除！"
			}
		],
		"infos": [
			{
				"sourceUnique": "2179483104347947011",
				"targetUnique": "2179483104347947020",
				"id": "2179483104347947020"
			}
		]
	},
	"displayCode": "000-525-000066",
	"level": NaN
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

