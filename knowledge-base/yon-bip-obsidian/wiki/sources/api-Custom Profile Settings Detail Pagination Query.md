---
title: "自定义档案设置详情分页查询V3"
apiId: "2173556221282877443"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "User-defined File Definition"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, User-defined File Definition]
platform_version: "BIP"
source_type: community-api-docs
---

# 自定义档案设置详情分页查询V3

> `ContentType	application/json` 请求方式	POST | 分类: User-defined File Definition (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/customerdocdef/batchQueryDetail

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
| 小数位数:0,最大长度:1000 | 否 | 是 | 页大小 示例：10 默认值：10 |
| startTs | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts开始时间 示例：2024-10-20 21:04:04 |
| endTs | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts结束时间 示例：2024-10-20 21:04:05 |
| ids | string | 是 | 否 | 主键id集合 示例：["2211575684096589833","2211575684096589834"] 最大请求量：100 |
| code | string | 否 | 否 | 编码 示例：code0001 |
| name | string | 否 | 否 | 名称 示例：name0001 |
| codes | string | 是 | 否 | 编码集合 示例：["000001","000002"] 最大请求量：100 |

## 3. 请求示例

Url: /yonbip/digitalModel/customerdocdef/batchQueryDetail?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"startTs": "2024-10-20 21:04:04",
	"endTs": "2024-10-20 21:04:05",
	"ids": [
		"2211575684096589833",
		"2211575684096589834"
	],
	"code": "code0001",
	"name": "name0001",
	"codes": [
		"000001",
		"000002"
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 返回数据 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 当前页数 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 每行页数 示例：10 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 总数 示例：22 |
| recordList | object | 是 | 处理数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 22,
		"recordList": [
			{
				"id": "id0001",
				"code": "code0001",
				"name": {
					"zh_CN": "简体",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"classify": 0,
				"mcflag": 0,
				"description": {
					"zh_CN": "简体",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"ispreset": false,
				"pubts": "2024-06-05 10:25:44"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999-999-999999	调?失败时的错误信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-10-09

更新

请求说明

新增

请求参数 codes

更新

错误码 999-999-999999

2	2025-06-30

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

