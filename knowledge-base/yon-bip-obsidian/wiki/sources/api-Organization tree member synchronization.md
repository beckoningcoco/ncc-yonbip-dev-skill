---
title: "组织树成员同步"
apiId: "2274447829147582470"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Business Unit"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Unit]
platform_version: "BIP"
source_type: community-api-docs
---

# 组织树成员同步

> `ContentType	application/json` 请求方式	POST | 分类: Business Unit (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/openapi/treedatasync/treemembersync

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
| pubts | string | 否 | 是 | 时间戳，查大于等于时间戳得数据 示例：2000-01-01 |
| treeVids | string | 是 | 否 | 树版本id列表，查询指定树版本得成员数据 示例：["2263915658729226247","2264055958130917386","2264109825610743814"] |
| ids | string | 是 | 否 | 查询指定组织部门成员得数据 示例：["2210651424329564165","2210685818411417601"] |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 分页起始，从1开始 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 分页大小 示例：100 |

## 3. 请求示例

Url: /yonbip/digitalModel/openapi/treedatasync/treemembersync?access_token=访问令牌
Body: {
	"pubts": "2000-01-01",
	"treeVids": [
		"2263915658729226247",
		"2264055958130917386",
		"2264109825610743814"
	],
	"ids": [
		"2210651424329564165",
		"2210685818411417601"
	],
	"pageIndex": 1,
	"pageSize": 100
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 返回码 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 分页信息 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 分页信息 示例：100 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 返回条数 示例：6 |
| recordList | object | 是 | 返回记录 |
| pageCount | number |
| 小数位数:0,最大长度:10 | 否 | pageCount 示例：1 |
| beginPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | beginPageIndex 示例：1 |
| endPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | endPageIndex 示例：1 |
| traceId | string | 否 | traceId 示例：fc78d6ff57bff7a9 |
| uploadable | string | 否 | uploadable 示例：0 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 100,
		"recordCount": 6,
		"recordList": [
			{
				"oid": "2263915658729226248",
				"id": "2210651424329564165",
				"treeVid": "2263915658729226247",
				"parentId": "",
				"parentorgId": "",
				"innercode": "45NR",
				"enable": 1,
				"startTime": "1970-01-05 00:00:00",
				"endTime": "1970-01-05 23:59:59",
				"creator": "123",
				"creationtime": "2025-05-09 09:34:31",
				"modifier": "123",
				"modifiedtime": "2025-05-09 10:29:06",
				"tenantId": "0000M7LC4GG1FDTLOH0000",
				"path": "2210651424329564165|",
				"level": 1,
				"isEnd": 0,
				"displayorder": 999999,
				"pidChanged": true
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	},
	"traceId": "fc78d6ff57bff7a9",
	"uploadable": "0",
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-000525

参数不能为空:


## 7. 错误返回码

999	参数为空	参数不正确或系统错误


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

