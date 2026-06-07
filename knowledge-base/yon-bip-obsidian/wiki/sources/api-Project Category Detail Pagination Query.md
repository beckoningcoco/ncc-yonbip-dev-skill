---
title: "项目类别详情分页查询V5"
apiId: "2178715542155165698"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Project Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Project Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 项目类别详情分页查询V5

> `ContentType	application/json` 请求方式	POST | 分类: Project Category (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/basedoc/projectClass/batchQueryDetail

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
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts开始时间 示例：2025-03-08 17:28:56 |
| endTs | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts结束时间 示例：2025-03-08 17:28:56 |
| ids | string | 是 | 否 | 主键id集合 示例：["2211575684096589833","2211575684096589834"] |
| code | string | 否 | 否 | 编码 示例：c01 |
| name | string | 否 | 否 | 名称 示例：n01 |
| orgid | string | 否 | 否 | 组织id 示例：666666 |
| orgid___code | string | 否 | 否 | 组织编码 示例：global00 |

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc/projectClass/batchQueryDetail?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"startTs": "2025-03-08 17:28:56",
	"endTs": "2025-03-08 17:28:56",
	"ids": [
		"2211575684096589833",
		"2211575684096589834"
	],
	"code": "c01",
	"name": "n01",
	"orgid": "666666",
	"orgid___code": "global00"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回信息码 示例：200 |
| data | object | 是 | 请求体 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 分页页码 示例：20 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 分页条数 示例：1 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 查询记录数 示例：1 |
| recordList | object | 是 | 处理数据 |

## 5. 正确返回示例

{
	"code": "200",
	"data": [
		{
			"pageIndex": 20,
			"pageSize": 1,
			"recordCount": 1,
			"recordList": [
				{
					"id": "",
					"code": "",
					"name": {
						"zh_CN": "",
						"en_US": "",
						"zh_TW": ""
					},
					"creationtime": "2026-06-07 11:49:32",
					"description": {
						"zh_CN": "",
						"en_US": "",
						"zh_TW": ""
					},
					"enable": 0,
					"log": "",
					"modifiedtime": "2026-06-07 11:49:32",
					"objid": "",
					"orgid": 0,
					"orgid___code": "",
					"orgid___name": "",
					"parent": 0,
					"parent___code": "",
					"parent___name": "",
					"pubts": "2026-06-07 11:49:32"
				}
			]
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-29

更新

请求参数 (6)

项目类别详情分页查询

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

